package com.taobao.android.detail.sdk.utils;

import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.component.WXImage;
import java.util.HashMap;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADD_CART = "AddCart";
    public static final String ADD_COLLECT_ITEM = "AddCollectItem";
    public static final String DEL_COLLECT_ITEM = "DelCollectItem";
    public static final String DIVA_LOAD_ERROR = "DIVALoadError";
    public static final String ERROR_MSG_TEMPLATE = "error=%s,type=%s";
    public static final String ERR_ADD_CART = "80002";
    public static final String ERR_ADD_COLLECT_ITEM = "80003";
    public static final String ERR_DEL_COLLECT_ITEM = "80004";
    public static final String ERR_DIVA_LOAD = "81001";
    public static final String ERR_LOAD_CHAOSHI = "80007";
    public static final String ERR_LOAD_DESC = "80005";
    public static final String ERR_LOAD_DETAIL = "80001";
    public static final String ERR_LOAD_WEAPP = "80006";
    public static final String ERR_VESEEL_LOAD = "80008";
    public static final String LOAD_CHAOSHI = "LoadChaoShi";
    public static final String LOAD_DESC = "LoadDesc";
    public static final String LOAD_DETAIL = "LoadDetail";
    public static final String LOAD_WEAPP = "LoadWeapp";
    public static final String TYPE_LOAD_CHAOSHI_CS_CART = "3";
    public static final String TYPE_LOAD_CHAOSHI_CS_HOT = "0";
    public static final String TYPE_LOAD_CHAOSHI_CS_LIMIT = "1";
    public static final String TYPE_LOAD_CHAOSHI_CS_RECOMEND = "2";
    public static final String TYPE_LOAD_DESC_DATA_ERROR = "0,3";
    public static final String TYPE_LOAD_DESC_H5 = "1";
    public static final String TYPE_LOAD_DESC_TEMPLATE_PARSE_ERROR = "0,2";
    public static final String TYPE_LOAD_DESC_TEMPLATE_REQUEST_FAILED = "0,1";
    public static final String TYPE_LOAD_DETAIL_EMPTY_DATA = "3";
    public static final String TYPE_LOAD_DETAIL_JSON_PARSE_ERROR = "0";
    public static final String TYPE_LOAD_DETAIL_REQUEST_FAILED_ERROR = "1";
    public static final String TYPE_TEMPLATE_DATA_NOT_FOUND_ERROR = "2";
    public static final String VESSEL_LOAD_ERROR = "LoadWeexVesselJSBundle";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f10342a;

    static {
        kge.a(-778060363);
        f10342a = false;
        tpc.a("com.taobao.android.detail.sdk.utils.MonitorUtils");
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
        } else {
            AppMonitor.Alarm.commitFail("Page_Detail", "Detail_Exception", b(str, str2, th), "-3344", th != null ? th.toString() : "");
        }
    }

    private static String b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8eaa3c08", new Object[]{str, str2, th});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(WXImage.ERRORDESC, str2);
        hashMap.put("errorStack", Log.getStackTraceString(th));
        hashMap.put("tag", str);
        if (hashMap.isEmpty()) {
            return null;
        }
        return e.a(hashMap)[0];
    }
}
