package com.uc.webview.internal.stats;

import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes9.dex */
public class g {
    public static int a(String str) {
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    public static long a(long j) {
        return ((j + TimeZone.getDefault().getRawOffset()) / 1000) % 86400;
    }

    public static long a(Map<String, String> map, String str) {
        String str2 = map.get(str);
        if (str2 != null) {
            try {
                return Long.valueOf(str2).longValue();
            } catch (Throwable unused) {
                return 0L;
            }
        }
        return 0L;
    }

    public static String a(Map<String, String> map, String str, String str2) {
        String str3 = map.get(str);
        return str3 == null ? str2 : str3;
    }

    public static int b(long j) {
        if (j < 100000) {
            if (j < 100) {
                return j < 10 ? 1 : 2;
            } else if (j < 1000) {
                return 3;
            } else {
                return j < 10000 ? 4 : 5;
            }
        } else if (j < 10000000) {
            return j < 1000000 ? 6 : 7;
        } else if (j < 100000000) {
            return 8;
        } else {
            return j < 1000000000 ? 9 : 10;
        }
    }
}
