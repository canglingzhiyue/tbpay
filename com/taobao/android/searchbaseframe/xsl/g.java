package com.taobao.android.searchbaseframe.xsl;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import tb.kge;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(307845686);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitSuccess("xsearchlist_preload", "page_preload_state", f(str, str2));
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            AppMonitor.Alarm.commitFail("xsearchlist_preload", "page_preload_state", f(str, str2), "arg_err", str3);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitFail("xsearchlist_preload", "page_preload_state", f(str, str2), "not_exist", "not_exist");
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitSuccess("xsearchlist_preload", "request_preload_state", f(str, str2));
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitFail("xsearchlist_preload", "request_preload_state", f(str, str2), "timeout", "timeout");
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitFail("xsearchlist_preload", "request_preload_state", f(str, str2), a.ATOM_EXT_repeat, a.ATOM_EXT_repeat);
        }
    }

    private static String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75b9023f", new Object[]{str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url_path", (Object) str);
        jSONObject.put("pageName", (Object) str2);
        return jSONObject.toJSONString();
    }
}
