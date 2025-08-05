package com.alibaba.ut.abtest.pipeline.encoder;

import com.alibaba.ut.abtest.internal.util.h;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-163967216);
    }

    public static byte[] a(byte[] bArr) {
        a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("27137f8e", new Object[]{bArr});
        }
        if (bArr != null && (a2 = a("QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK")) != null) {
            return a(bArr, a2);
        }
        return null;
    }

    private static a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f5e15507", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        a aVar = new a();
        for (int i = 0; i < 256; i++) {
            aVar.f4214a[i] = i;
        }
        aVar.b = 0;
        aVar.c = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            try {
                i3 = ((str.charAt(i2) + aVar.f4214a[i4]) + i3) % 256;
                int i5 = aVar.f4214a[i4];
                int[] iArr = aVar.f4214a;
                iArr[i4] = iArr[i3];
                aVar.f4214a[i3] = i5;
                i2 = (i2 + 1) % str.length();
            } catch (Exception e) {
                h.c("RC4", "prepareKey fail", e);
                return null;
            }
        }
        return aVar;
    }

    private static byte[] a(byte[] bArr, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1a8db94b", new Object[]{bArr, aVar});
        }
        if (bArr == null || aVar == null) {
            return null;
        }
        int i = aVar.b;
        int i2 = aVar.c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) % 256;
            i2 = (aVar.f4214a[i] + i2) % 256;
            int i4 = aVar.f4214a[i];
            int[] iArr = aVar.f4214a;
            iArr[i] = iArr[i2];
            aVar.f4214a[i2] = i4;
            bArr[i3] = (byte) (aVar.f4214a[(aVar.f4214a[i] + aVar.f4214a[i2]) % 256] ^ bArr[i3]);
        }
        aVar.b = i;
        aVar.c = i2;
        return bArr;
    }

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int[] f4214a;
        public int b;
        public int c;

        static {
            kge.a(609257296);
        }

        private a() {
            this.f4214a = new int[256];
        }
    }
}
