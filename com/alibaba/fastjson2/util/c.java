package com.alibaba.fastjson2.util;

import tb.kge;

/* loaded from: classes2.dex */
public final class c {
    public static final long MAGIC_HASH_CODE = -3750763034362895579L;
    public static final long MAGIC_PRIME = 1099511628211L;

    static {
        kge.a(-868170909);
    }

    public static long a(String str) {
        boolean z;
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt > 255 || (i2 == 0 && charAt == 0)) {
                z = false;
                break;
            }
            if (charAt == '-' || charAt == '_' || charAt == ' ') {
                i++;
            }
        }
        z = true;
        char c = 'Z';
        char c2 = 'A';
        if (z && length - i <= 8) {
            int i3 = length - 1;
            long j = 0;
            int i4 = 0;
            while (i3 >= 0) {
                char charAt2 = str.charAt(i3);
                if (charAt2 != '-' && charAt2 != '_' && charAt2 != ' ') {
                    if (charAt2 >= c2 && charAt2 <= c) {
                        charAt2 = (char) (charAt2 + ' ');
                    }
                    j = i4 == 0 ? (byte) charAt2 : (j << 8) + charAt2;
                    i4++;
                }
                i3--;
                c = 'Z';
                c2 = 'A';
            }
            if (j != 0) {
                return j;
            }
        }
        long j2 = MAGIC_HASH_CODE;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt3 = str.charAt(i5);
            if (charAt3 != '-' && charAt3 != '_' && charAt3 != ' ') {
                if (charAt3 >= 'A' && charAt3 <= 'Z') {
                    charAt3 = (char) (charAt3 + ' ');
                }
                j2 = (j2 ^ charAt3) * MAGIC_PRIME;
            }
        }
        return j2;
    }

    public static long b(String str) {
        boolean z;
        char charAt;
        int length = str.length();
        if (length <= 8) {
            for (int i = 0; i < length; i++) {
                char charAt2 = str.charAt(i);
                if (charAt2 > 255 || (i == 0 && charAt2 == 0)) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                int i2 = length - 1;
                long j = 0;
                while (i2 >= 0) {
                    j = i2 == str.length() - 1 ? (byte) charAt : (j << 8) + str.charAt(i2);
                    i2--;
                }
                if (j != 0) {
                    return j;
                }
            }
        }
        long j2 = MAGIC_HASH_CODE;
        for (int i3 = 0; i3 < length; i3++) {
            j2 = (j2 ^ str.charAt(i3)) * MAGIC_PRIME;
        }
        return j2;
    }
}
