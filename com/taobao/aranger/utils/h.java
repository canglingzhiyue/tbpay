package com.taobao.aranger.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kak;
import tb.kge;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_NAME = "ARanger_SDK";
    public static final String SP_ORI_NAME = "ARanger_SDK_ori";

    static {
        kge.a(-1458395990);
    }

    public static boolean a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d51141ee", new Object[]{context, str, new Boolean(z)})).booleanValue();
        }
        if (context == null) {
            kak.b("SpUtils", "getBoolean context null", new Object[0]);
            return z;
        }
        try {
            return Boolean.parseBoolean(context.getSharedPreferences(SP_NAME, 0).getString(str, String.valueOf(z)));
        } catch (Exception e) {
            kak.a("SpUtils", "getBoolean fail:", e, "key", str);
            return z;
        }
    }

    public static String a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, str, str2});
        }
        if (context == null) {
            kak.b("SpUtils", "getString context null", new Object[0]);
            return str2;
        }
        try {
            return context.getSharedPreferences(SP_NAME, 0).getString(str, str2);
        } catch (Exception e) {
            kak.a("SpUtils", "getString fail:", e, "key", str);
            return str2;
        }
    }

    public static Map<String, ?> a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a75136df", new Object[]{context, str});
        }
        if (context == null) {
            kak.b("SpUtils", "getBoolean context null", new Object[0]);
            return null;
        }
        try {
            return context.getSharedPreferences(str, 4).getAll();
        } catch (Exception e) {
            kak.a("SpUtils", "geAll fail:", e, new Object[0]);
            return null;
        }
    }

    public static void a(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a974c1b", new Object[]{context, str, map});
        } else if (context == null) {
            kak.b("SpUtils", "saveTLogOffToSP context null", new Object[0]);
        } else if (map == null || map.isEmpty()) {
            kak.b("SpUtils", "map empty!", new Object[0]);
        } else {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(str, 4).edit();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    edit.putString(entry.getKey(), entry.getValue());
                }
                edit.apply();
                kak.a("SpUtils", "saveConfigToSP", "spName", str, "map", map.toString());
            } catch (Exception e) {
                kak.a("SpUtils", "saveConfigToSP fail:", e, new Object[0]);
            }
        }
    }
}
