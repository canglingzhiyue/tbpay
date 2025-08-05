package com.alipay.mobile.common.transport.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class SharedPreUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final boolean putData(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5de49180", new Object[]{context, str, str2})).booleanValue();
        }
        try {
            SharedPreferences.Editor a2 = a(context);
            a2.putString(str, str2);
            a2.commit();
            return true;
        } catch (Throwable th) {
            LogCatUtil.error("SharedPreUtils", th);
            return false;
        }
    }

    public static final void putData(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d3e2cd2", new Object[]{context, str, new Long(j)});
            return;
        }
        try {
            SharedPreferences.Editor a2 = a(context);
            a2.putLong(str, j);
            a2.commit();
        } catch (Exception e) {
            LogCatUtil.error("SharedPreUtils", e);
        }
    }

    public static void putData(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d3e2911", new Object[]{context, str, new Integer(i)});
            return;
        }
        try {
            SharedPreferences.Editor a2 = a(context);
            a2.putInt(str, i);
            a2.commit();
        } catch (Exception e) {
            LogCatUtil.error("SharedPreUtils", e);
        }
    }

    public static void putData(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d3e68e2", new Object[]{context, str, new Boolean(z)});
            return;
        }
        try {
            SharedPreferences.Editor a2 = a(context);
            a2.putBoolean(str, z);
            a2.commit();
        } catch (Exception e) {
            LogCatUtil.error("SharedPreUtils", e);
        }
    }

    public static final String getStringData(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8c22a6", new Object[]{context, str});
        }
        try {
            return context.getSharedPreferences("com_transp_sf", 4).getString(str, "");
        } catch (Exception e) {
            LogCatUtil.error("SharedPreUtils", e);
            return "";
        }
    }

    public static final long getLonggData(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc54edc0", new Object[]{context, str})).longValue();
        }
        try {
            return context.getSharedPreferences("com_transp_sf", 4).getLong(str, -1L);
        } catch (Exception e) {
            LogCatUtil.error("SharedPreUtils", e);
            return -1L;
        }
    }

    public static int getIntData(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8b61e3b", new Object[]{context, str})).intValue();
        }
        try {
            return context.getSharedPreferences("com_transp_sf", 4).getInt(str, -1);
        } catch (Exception e) {
            LogCatUtil.error("SharedPreUtils", e);
            return -1;
        }
    }

    public static boolean getBooleanData(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf19be73", new Object[]{context, str})).booleanValue();
        }
        try {
            return context.getSharedPreferences("com_transp_sf", 4).getBoolean(str, false);
        } catch (Exception e) {
            LogCatUtil.error("SharedPreUtils", e);
            return false;
        }
    }

    public static final void removeData(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fefd789d", new Object[]{context, str});
            return;
        }
        try {
            SharedPreferences.Editor a2 = a(context);
            a2.remove(str);
            a2.commit();
        } catch (Exception e) {
            LogCatUtil.error("SharedPreUtils", "removeData", e);
        }
    }

    private static SharedPreferences.Editor a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences.Editor) ipChange.ipc$dispatch("332e1c91", new Object[]{context}) : context.getSharedPreferences("com_transp_sf", 4).edit();
    }
}
