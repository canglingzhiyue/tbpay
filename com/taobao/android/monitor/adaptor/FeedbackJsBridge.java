package com.taobao.android.monitor.adaptor;

import android.content.SharedPreferences;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.rfx;

/* loaded from: classes6.dex */
public class FeedbackJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_FEEDBACK = "reportFeedbackFullTrace";
    private static final String ACTION_SNAPSHOT_ID = "getSnapshotID";
    public static final String CLASS_FEEDBACK = "H5FeedbackBridge";

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        TLog.loge("applicationmonitor_adaptor", "FeedbackJsBridge execute", "action = " + str);
        if (ACTION_FEEDBACK.equals(str)) {
            try {
                if (a.a(wVCallBackContext.getWebview().getContext(), JSONObject.parseObject(str2))) {
                    wVCallBackContext.success();
                } else {
                    TLog.loge("applicationmonitor_adaptor", "FeedbackJsBridge", "reportFullstrace result false! ");
                    wVCallBackContext.error("please check params");
                }
            } catch (JSONException e) {
                TLog.loge("applicationmonitor_adaptor", "FeedbackJsBridge", "reportFullstrace e! " + e.getMessage());
                wVCallBackContext.error(e.getMessage());
            }
            return true;
        } else if (!ACTION_SNAPSHOT_ID.equals(str)) {
            return false;
        } else {
            try {
                SharedPreferences sharedPreferences = wVCallBackContext.getWebview().getContext().getSharedPreferences(rfx.INNER_USER_CONFIG, 0);
                String str3 = "";
                if (sharedPreferences != null) {
                    str3 = sharedPreferences.getString("snapshotid", str3);
                }
                if (!TextUtils.isEmpty(str3)) {
                    r rVar = new r();
                    rVar.a("snapshotID", str3);
                    wVCallBackContext.success(rVar);
                } else {
                    TLog.loge("applicationmonitor_adaptor", "FeedbackJsBridge", "getSnapshotID result null! ");
                    wVCallBackContext.error("Can't get the snapshotID");
                }
            } catch (JSONException e2) {
                TLog.loge("applicationmonitor_adaptor", "FeedbackJsBridge", "reportFullstrace e! " + e2.getMessage());
                wVCallBackContext.error(e2.getMessage());
            }
            return true;
        }
    }
}
