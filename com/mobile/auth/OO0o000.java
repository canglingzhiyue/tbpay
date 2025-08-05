package com.mobile.auth;

import android.content.Context;
import android.content.SharedPreferences;
import com.mobile.auth.gatewayauth.ExceptionProcessor;

/* loaded from: classes4.dex */
public final class OO0o000 {
    public static String O000000o(Context context, String str) {
        try {
            try {
                return context.getSharedPreferences("cuAuthCacheName", 0).getString(str, "");
            } catch (Exception e) {
                OOO0o0.O00000o(e.getMessage());
                return "";
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static void O000000o(Context context, String str, Long l) {
        try {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("cuAuthCacheName", 0).edit();
                edit.putLong(str, l.longValue());
                edit.commit();
            } catch (Exception e) {
                OOO0o0.O00000o(e.getMessage());
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static boolean O000000o(Context context, String str, String str2) {
        try {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("cuAuthCacheName", 0).edit();
                edit.putString(str, str2);
                return edit.commit();
            } catch (Exception e) {
                OOO0o0.O00000o(e.getMessage());
                return false;
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }

    public static Long O00000Oo(Context context, String str) {
        long j = 0;
        try {
            try {
                j = context.getSharedPreferences("cuAuthCacheName", 0).getLong(str, 0L);
            } catch (Exception e) {
                OOO0o0.O00000o(e.getMessage());
            }
            return Long.valueOf(j);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }
}
