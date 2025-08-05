package com.taobao.calendar.sdk.common;

import com.taobao.tao.image.d;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import tb.kge;

/* loaded from: classes6.dex */
public final class Strings {
    private static final char[] DIGITS;
    private static final char[] UPPER_CASE_DIGITS;

    static {
        kge.a(838301969);
        DIGITS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        UPPER_CASE_DIGITS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', d.LEVEL_D, d.LEVEL_E, 'F', 'G', 'H', d.LEVEL_I, 'J', 'K', d.LEVEL_L, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', d.LEVEL_V, d.LEVEL_W, 'X', 'Y', 'Z'};
    }

    public static String bytesToHexString(byte[] bArr, boolean z) {
        char[] cArr = z ? UPPER_CASE_DIGITS : DIGITS;
        char[] cArr2 = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    public static final String construct(byte[] bArr, int i, int i2, Charset charset) {
        try {
            return new String(bArr, i, i2, charset.name());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static byte[] getBytes(String str, Charset charset) {
        try {
            return str.getBytes(charset.name());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static final boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }
}
