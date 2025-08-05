package com.taobao.android.dinamic.tempate.db;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static long[] f11766a;

    static {
        kge.a(132931076);
        f11766a = new long[256];
        for (int i = 0; i < 256; i++) {
            long j = i;
            for (int i2 = 0; i2 < 8; i2++) {
                j = (j >> 1) ^ ((((int) j) & 1) != 0 ? -7661587058870466123L : 0L);
            }
            f11766a[i] = j;
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else if (!z) {
            throw new AssertionError();
        }
    }

    public static long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{str})).longValue();
        }
        if (str != null && str.length() != 0) {
            return a(b(str));
        }
        return 0L;
    }

    public static long a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c196723", new Object[]{bArr})).longValue();
        }
        long j = -1;
        for (byte b : bArr) {
            j = (j >> 8) ^ f11766a[(((int) j) ^ b) & 255];
        }
        return j;
    }

    public static byte[] b(String str) {
        char[] charArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("7d24c9ca", new Object[]{str});
        }
        byte[] bArr = new byte[str.length() << 1];
        int i = 0;
        for (char c : str.toCharArray()) {
            int i2 = i + 1;
            bArr[i] = (byte) c;
            i = i2 + 1;
            bArr[i2] = (byte) (c >> '\b');
        }
        return bArr;
    }
}
