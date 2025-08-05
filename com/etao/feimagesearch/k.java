package com.etao.feimagesearch;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-93083488);
    }

    public static void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{context, str, new Boolean(z)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            context.getSharedPreferences("IMAGE_SEARCH_APP", 0).edit().putBoolean("COMMON_".concat(str), z).apply();
        }
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            context.getSharedPreferences("IMAGE_SEARCH_APP", 0).edit().putString("COMMON_".concat(str), str2).apply();
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            context.getSharedPreferences("IMAGE_SEARCH_APP", 0).edit().remove("COMMON_".concat(str)).apply();
        }
    }

    public static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1da50fb7", new Object[]{context, str}) : TextUtils.isEmpty(str) ? "" : context.getSharedPreferences("IMAGE_SEARCH_APP", 0).getString("COMMON_".concat(str), "");
    }

    public static void a(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51105da", new Object[]{context, str, new Long(j)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            context.getSharedPreferences("IMAGE_SEARCH_APP", 0).edit().putLong("COMMON_".concat(str), j).apply();
        }
    }

    public static void a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5110219", new Object[]{context, str, new Integer(i)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            context.getSharedPreferences("IMAGE_SEARCH_APP", 0).edit().putInt("COMMON_".concat(str), i).apply();
        }
    }

    public static int b(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d49a9c0d", new Object[]{context, str, new Integer(i)})).intValue() : TextUtils.isEmpty(str) ? i : context.getSharedPreferences("IMAGE_SEARCH_APP", 0).getInt("COMMON_".concat(str), i);
    }

    public static boolean c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d54b79ec", new Object[]{context, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return context.getSharedPreferences("IMAGE_SEARCH_APP", 0).getBoolean("COMMON_".concat(str), false);
        }
        return false;
    }
}
