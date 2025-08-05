package com.alibaba.ariver.remoterpc;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import tb.kge;

/* loaded from: classes2.dex */
public final class EncodingUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String US_ASCII = "US-ASCII";

    static {
        kge.a(274184811);
    }

    public static String getString(byte[] bArr, int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("758b6781", new Object[]{bArr, new Integer(i), new Integer(i2), str});
        }
        if (bArr == null) {
            throw new IllegalArgumentException("Parameter may not be null");
        }
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("charset may not be null or empty");
        }
        try {
            return new String(bArr, i, i2, str);
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr, i, i2);
        }
    }

    public static String getString(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8271aa1", new Object[]{bArr, str});
        }
        if (bArr == null) {
            throw new IllegalArgumentException("Parameter may not be null");
        }
        return getString(bArr, 0, bArr.length, str);
    }

    public static byte[] getBytes(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("583eeb0d", new Object[]{str, str2});
        }
        if (str == null) {
            throw new IllegalArgumentException("data may not be null");
        }
        if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("charset may not be null or empty");
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    public static byte[] getAsciiBytes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("df6452dc", new Object[]{str});
        }
        if (str == null) {
            throw new IllegalArgumentException("Parameter may not be null");
        }
        try {
            return str.getBytes(US_ASCII);
        } catch (UnsupportedEncodingException unused) {
            throw new Error("HttpClient requires ASCII support");
        }
    }

    public static String getAsciiString(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b79f49e6", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        if (bArr == null) {
            throw new IllegalArgumentException("Parameter may not be null");
        }
        try {
            return new String(bArr, i, i2, US_ASCII);
        } catch (UnsupportedEncodingException unused) {
            throw new Error("HttpClient requires ASCII support");
        }
    }

    public static String getAsciiString(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd470fc6", new Object[]{bArr});
        }
        if (bArr == null) {
            throw new IllegalArgumentException("Parameter may not be null");
        }
        return getAsciiString(bArr, 0, bArr.length);
    }

    private EncodingUtils() {
    }
}
