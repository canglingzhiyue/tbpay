package com.taobao.search.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.kge;

/* loaded from: classes7.dex */
public class s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SEARCH_PREFERENCE_NAME = "tbsearch_preference";

    static {
        kge.a(87207309);
    }

    public static SharedPreferences a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("6ebdfd34", new Object[]{context});
        }
        if (context != null) {
            return context.getSharedPreferences("tbsearch_preference", 0);
        }
        return null;
    }

    public static SharedPreferences a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("3f11033c", new Object[0]) : a(Globals.getApplication());
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        SharedPreferences a2 = a();
        if (a2 == null) {
            return;
        }
        a2.edit().putString(str, str2).apply();
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        SharedPreferences a2 = a();
        return a2 == null ? str2 : a2.getString(str, str2);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        SharedPreferences a2 = a();
        return a2 == null ? z : a2.getBoolean(str, z);
    }

    public static void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{str, new Boolean(z)});
            return;
        }
        SharedPreferences a2 = a();
        if (a2 == null) {
            return;
        }
        a2.edit().putBoolean(str, z).apply();
    }

    public static void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{str, new Integer(i)});
            return;
        }
        SharedPreferences a2 = a();
        if (a2 == null) {
            return;
        }
        a2.edit().putInt(str, i).apply();
    }

    public static int b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d253be3", new Object[]{str, new Integer(i)})).intValue();
        }
        SharedPreferences a2 = a();
        return a2 == null ? i : a2.getInt(str, i);
    }
}
