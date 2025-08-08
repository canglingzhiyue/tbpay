package com.taobao.android.detail.core.utils;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.common.expection.WXExceptionConfig;
import com.taobao.weex.ui.component.WXImage;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.ego;
import tb.emu;
import tb.epn;
import tb.epu;
import tb.kge;

/* loaded from: classes4.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADD_CART = "AddCart";
    public static final String ADD_COLLECT_ITEM = "AddCollectItem";
    public static final String BIZ_NAME = "detail";
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
    public static final String ERR_MESSAGE_SHOW_COMMON_DIALOG_FAIL = "显示通用弹窗失败";
    public static final String ERR_VESEEL_LOAD = "80008";
    public static final String KEY_SHOW_COMMON_DIALOG_FAIL = "showCommonDialogFail";
    public static final String KEY_SHOW_COMMON_DIALOG_POINT = "Monitor_CommonDialog_Service";
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
    private static boolean f9940a;

    static {
        kge.a(985355386);
        f9940a = false;
        emu.a("com.taobao.android.detail.core.utils.MonitorUtils");
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            epn.a(str, str2);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a("Page_Detail", str);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
        } else {
            epn.a(str, str2, str3, str4);
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            a("Page_Detail", str, str2, str3);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{str, str2, str3, str4, str5});
        } else {
            epn.a(str, str2, str3, str4, str5);
        }
    }

    public static void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb13311", new Object[]{str, str2, str3, str4});
        } else {
            a("Page_Detail", str, str2, str3, str4);
        }
    }

    public static void a(ego egoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6cd4fab", new Object[]{egoVar});
        } else {
            a("Page_Detail", egoVar);
        }
    }

    public static void a(String str, ego egoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26b7c575", new Object[]{str, egoVar});
        } else if (egoVar != null) {
            StringBuilder sb = new StringBuilder(String.format("error=%s,type=%s", egoVar.d, egoVar.e));
            if (!StringUtils.isEmpty(egoVar.f)) {
                sb.append(",itemId=");
                sb.append(egoVar.f);
            }
            if (!StringUtils.isEmpty(egoVar.g)) {
                sb.append(",ttid=");
                sb.append(egoVar.g);
            }
            if (!StringUtils.isEmpty(egoVar.h)) {
                sb.append(",detail_v=");
                sb.append(egoVar.h);
            }
            if (egoVar.i != null && !egoVar.i.isEmpty()) {
                for (Map.Entry<String, String> entry : egoVar.i.entrySet()) {
                    sb.append(",");
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                }
            }
            if (!StringUtils.isEmpty(egoVar.f27293a)) {
                str = egoVar.f27293a;
            }
            epn.a(str, egoVar.b, egoVar.c, sb.toString());
        }
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
        } else {
            epn.a("Page_Detail", "Detail_Exception", b(str, str2, th), "-3344", th != null ? th.toString() : "");
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
        return a(hashMap)[0];
    }

    public static String[] a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ab7e78ac", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        String[] strArr = {""};
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        int i = 0;
        for (Map.Entry<String, String> entry : entrySet) {
            if (i == entrySet.size() - 1) {
                strArr[0] = strArr[0] + entry.getKey() + "=" + entry.getValue();
            } else {
                strArr[0] = strArr[0] + entry.getKey() + "=" + entry.getValue() + ",";
            }
            i++;
        }
        return strArr;
    }

    public static void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{map});
        } else {
            epn.a(map);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        HashMap hashMap = new HashMap();
        if (StringUtils.isEmpty(str)) {
            str = "null";
        }
        hashMap.put("mtopTag", str);
        hashMap.put("time", String.valueOf(System.currentTimeMillis()));
        epu.a("stage", WXExceptionConfig.KEY_BIZ, "mtopStartExecuting", null, hashMap);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        if (StringUtils.isEmpty(str)) {
            str = "null";
        }
        hashMap.put("mtopListener", str);
        if (StringUtils.isEmpty(str2)) {
            str2 = "null";
        }
        hashMap.put("delegateListener", str2);
        hashMap.put("time", String.valueOf(System.currentTimeMillis()));
        epu.a("stage", WXExceptionConfig.KEY_BIZ, "mtopExecuted", null, hashMap);
    }
}
