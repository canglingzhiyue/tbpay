package com.huawei.secure.android.common.util;

import android.util.Log;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7616a = "SafeString";

    public static String a(String str, int i) {
        if (str != null && str.length() >= i && i >= 0) {
            try {
                return str.substring(i);
            } catch (Exception e) {
                String str2 = f7616a;
                Log.e(str2, "substring exception: " + e.getMessage());
            }
        }
        return "";
    }

    public static String a(String str, int i, int i2) {
        if (str != null && i >= 0 && i2 <= str.length() && i2 >= i) {
            try {
                return str.substring(i, i2);
            } catch (Exception e) {
                String str2 = f7616a;
                Log.e(str2, "substring: " + e.getMessage());
            }
        }
        return "";
    }

    public static String a(String str, CharSequence charSequence, CharSequence charSequence2) {
        if (str != null && charSequence != null && charSequence2 != null) {
            try {
                return str.replace(charSequence, charSequence2);
            } catch (Exception e) {
                String str2 = f7616a;
                Log.e(str2, "replace: " + e.getMessage());
            }
        }
        return str;
    }
}
