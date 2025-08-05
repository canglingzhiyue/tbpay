package com.taobao.ugc.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.u;
import java.util.HashMap;
import java.util.Map;
import tb.jmq;
import tb.kge;

/* loaded from: classes9.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_CLICK = "click";
    public static final String EVENT_CUSTOM = "custom";
    public static final String EVENT_EXPOSURE = "exposure";
    public static final Map<String, String> sCommonArgs;

    static {
        kge.a(-1507435184);
        sCommonArgs = new HashMap();
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
            return;
        }
        a(str, map, 2101, "_Button-");
        l.a(str, map);
        if (map != null) {
            HashMap hashMap = new HashMap(map);
            hashMap.putAll(sCommonArgs);
            u.d("Page_Rate_Button-" + str, hashMap.toString());
            return;
        }
        u.d("Page_Rate_Button-" + str, sCommonArgs.toString());
    }

    public static void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{str, map});
        } else {
            a(str, map, 2201, "_Show-");
        }
    }

    public static void c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ec9e51", new Object[]{str, map});
        } else {
            a(str, map, 19999, "_");
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            sCommonArgs.put(str, str2);
        }
    }

    private static void a(String str, Map<String, String> map, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49d661a", new Object[]{str, map, new Integer(i), str2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (!str.startsWith("Page_Rate")) {
                str = "Page_Rate" + str2 + str;
            }
            jmq.d().a("Page_Rate", i, str, null, null, a(hashMap));
        }
    }

    public static String[] a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ab7e78ac", new Object[]{map});
        }
        try {
            String a2 = q.a(map, "=", ",");
            if (!TextUtils.isEmpty(a2)) {
                return a2.split(",");
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
