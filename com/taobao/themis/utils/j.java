package com.taobao.themis.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import tb.kge;

/* loaded from: classes9.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-178166450);
    }

    public static void a(Context context, String str, int i) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5110219", new Object[]{context, str, new Integer(i)});
        } else if (context == null || context.getApplicationContext() == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(TMSCalendarBridge.namespace, 0)) == null) {
        } else {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(str, i + "").apply();
        }
    }

    public static int b(Context context, String str, int i) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d49a9c0d", new Object[]{context, str, new Integer(i)})).intValue();
        }
        if (context == null || context.getApplicationContext() == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(TMSCalendarBridge.namespace, 0)) == null) {
            return i;
        }
        try {
            return Integer.parseInt(sharedPreferences.getString(str, i + ""));
        } catch (Exception unused) {
            return i;
        }
    }

    public static void a(Context context, String str, long j) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51105da", new Object[]{context, str, new Long(j)});
        } else if (context == null || context.getApplicationContext() == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(TMSCalendarBridge.namespace, 0)) == null) {
        } else {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(str, j + "").apply();
        }
    }

    public static long b(Context context, String str, long j) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d49a9fcf", new Object[]{context, str, new Long(j)})).longValue();
        }
        if (context == null || context.getApplicationContext() == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(TMSCalendarBridge.namespace, 0)) == null) {
            return j;
        }
        try {
            return Long.parseLong(sharedPreferences.getString(str, j + ""));
        } catch (Exception unused) {
            return j;
        }
    }

    public static void a(Context context, String str, String str2) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
        } else if (context == null || context.getApplicationContext() == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(TMSCalendarBridge.namespace, 0)) == null) {
        } else {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
        } else if (context == null || context.getApplicationContext() == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0)) == null) {
        } else {
            sharedPreferences.edit().putString(str2, str3).apply();
        }
    }

    public static String b(Context context, String str, String str2) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a3b17b6d", new Object[]{context, str, str2}) : (context == null || context.getApplicationContext() == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(TMSCalendarBridge.namespace, 0)) == null) ? str2 : sharedPreferences.getString(str, str2);
    }

    public static String b(Context context, String str, String str2, String str3) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("acbaa5a3", new Object[]{context, str, str2, str3}) : (context == null || context.getApplicationContext() == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0)) == null) ? str3 : sharedPreferences.getString(str2, str3);
    }

    public static void a(Context context, String str) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (context == null || context.getApplicationContext() == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(TMSCalendarBridge.namespace, 0)) == null) {
        } else {
            sharedPreferences.edit().remove(str).apply();
        }
    }

    public static void c(Context context, String str, String str2) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5ecf9b2", new Object[]{context, str, str2});
        } else if (context == null || context.getApplicationContext() == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0)) == null) {
        } else {
            sharedPreferences.edit().remove(str2).apply();
        }
    }
}
