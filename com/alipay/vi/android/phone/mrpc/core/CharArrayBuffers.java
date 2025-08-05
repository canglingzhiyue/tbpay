package com.alipay.vi.android.phone.mrpc.core;

import com.android.alibaba.ip.runtime.IpChange;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.CharArrayBuffer;

/* loaded from: classes3.dex */
public class CharArrayBuffers {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final char uppercaseAddon = ' ';

    private static char a(char c) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Character) ipChange.ipc$dispatch("a8217d02", new Object[]{new Character(c)})).charValue() : (c < 'A' || c > 'Z') ? c : (char) (c + ' ');
    }

    public static boolean containsIgnoreCaseTrimmed(CharArrayBuffer charArrayBuffer, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e041579", new Object[]{charArrayBuffer, new Integer(i), str})).booleanValue();
        }
        int length = charArrayBuffer.length();
        char[] buffer = charArrayBuffer.buffer();
        while (i < length && HTTP.isWhitespace(buffer[i])) {
            i++;
        }
        int length2 = str.length();
        boolean z = length >= i + length2;
        for (int i2 = 0; z && i2 < length2; i2++) {
            char c = buffer[i + i2];
            char charAt = str.charAt(i2);
            if (c != charAt) {
                z = a(c) == a(charAt);
            }
        }
        return z;
    }

    public static int setLowercaseIndexOf(CharArrayBuffer charArrayBuffer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1667cf6d", new Object[]{charArrayBuffer, new Integer(i)})).intValue();
        }
        int length = charArrayBuffer.length();
        char[] buffer = charArrayBuffer.buffer();
        for (int i2 = 0; i2 < length; i2++) {
            char c = buffer[i2];
            if (c == i) {
                return i2;
            }
            if (c >= 'A' && c <= 'Z') {
                buffer[i2] = (char) (c + ' ');
            }
        }
        return -1;
    }
}
