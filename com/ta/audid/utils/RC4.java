package com.ta.audid.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class RC4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String RC4_PK = "QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK";

    static {
        kge.a(-850759635);
    }

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int[] f8135a;
        public int b;
        public int c;

        static {
            kge.a(1371741075);
        }

        private a() {
            this.f8135a = new int[256];
        }
    }

    public static byte[] rc4(byte[] bArr) {
        a prepareKey;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3a9e98c", new Object[]{bArr});
        }
        if (bArr != null && (prepareKey = prepareKey(RC4_PK)) != null) {
            return rc4(bArr, prepareKey);
        }
        return null;
    }

    private static a prepareKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5d040052", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        a aVar = new a();
        for (int i = 0; i < 256; i++) {
            aVar.f8135a[i] = i;
        }
        aVar.b = 0;
        aVar.c = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            try {
                i3 = ((str.charAt(i2) + aVar.f8135a[i4]) + i3) % 256;
                int i5 = aVar.f8135a[i4];
                int[] iArr = aVar.f8135a;
                iArr[i4] = iArr[i3];
                aVar.f8135a[i3] = i5;
                i2 = (i2 + 1) % str.length();
            } catch (Exception unused) {
                return null;
            }
        }
        return aVar;
    }

    private static byte[] rc4(byte[] bArr, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2ec5cf67", new Object[]{bArr, aVar});
        }
        if (bArr == null || aVar == null) {
            return null;
        }
        int i = aVar.b;
        int i2 = aVar.c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) % 256;
            i2 = (aVar.f8135a[i] + i2) % 256;
            int i4 = aVar.f8135a[i];
            int[] iArr = aVar.f8135a;
            iArr[i] = iArr[i2];
            aVar.f8135a[i2] = i4;
            bArr[i3] = (byte) (aVar.f8135a[(aVar.f8135a[i] + aVar.f8135a[i2]) % 256] ^ bArr[i3]);
        }
        aVar.b = i;
        aVar.c = i2;
        return bArr;
    }
}
