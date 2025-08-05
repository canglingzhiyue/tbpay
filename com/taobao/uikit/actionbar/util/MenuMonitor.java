package com.taobao.uikit.actionbar.util;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class MenuMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ARG_ERROR_CODE = "errorCode";
    private static final String ARG_ERROR_MSG = "errorMsg";
    private static final String MODULE_NAME = "TBPublicMenu";
    private static final String MONITOR_POINT_NAME = "mPopupMenuIsNull";
    private static final String TAG = "MenuMonitor";

    static {
        kge.a(-1668508000);
    }

    private static void trackUnknownException(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea3253e", new Object[]{th});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", (Object) "unknown_exception");
            jSONObject.put("errorMsg", (Object) th.toString());
            AppMonitor.Counter.commit(MODULE_NAME, MONITOR_POINT_NAME, jSONObject.toJSONString(), 1.0d);
        } catch (Throwable th2) {
            MenuLog.log(TAG, "count_exception_again", th2.toString());
        }
    }

    private static void count(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e2c182a", new Object[]{str, str2});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMsg", (Object) str2);
            jSONObject.put("errorCode", (Object) str);
            AppMonitor.Counter.commit(MODULE_NAME, MONITOR_POINT_NAME, jSONObject.toJSONString(), 1.0d);
        } catch (Throwable th) {
            MenuLog.log(TAG, "count_exception", th.toString());
            trackUnknownException(th);
        }
    }

    public static void countFailed(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23dc3047", new Object[]{str, str2});
            return;
        }
        count(str, str2);
        MenuLog.block(MODULE_NAME, str, str2);
    }

    public static void countSucceed(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77df4884", new Object[]{str});
            return;
        }
        count(str, "_null");
        MenuLog.log(MODULE_NAME, str);
    }
}
