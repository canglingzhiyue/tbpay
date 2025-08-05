package com.loc;

import com.uc.webview.base.cyclone.BSError;

/* loaded from: classes4.dex */
public final class eg {

    /* renamed from: a  reason: collision with root package name */
    public long f7758a;
    public String b;
    public int d;
    public long e;
    public short g;
    public boolean h;
    public int c = BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA;
    public long f = 0;

    public eg(boolean z) {
        this.h = z;
    }

    public static long a(String str) {
        long j;
        if (str == null || str.length() == 0) {
            return 0L;
        }
        int i = 0;
        long j2 = 0;
        for (int length = str.length() - 1; length >= 0; length--) {
            long charAt = str.charAt(length);
            if (charAt < 48 || charAt > 57) {
                long j3 = 97;
                if (charAt < 97 || charAt > 102) {
                    j3 = 65;
                    if (charAt < 65 || charAt > 70) {
                        if (charAt != 58 && charAt != 124) {
                            return 0L;
                        }
                    }
                }
                j = (charAt - j3) + 10;
            } else {
                j = charAt - 48;
            }
            j2 += j << i;
            i += 4;
        }
        if (i == 48) {
            return j2;
        }
        return 0L;
    }

    public static String a(long j) {
        if (j < 0 || j > 281474976710655L) {
            return null;
        }
        return eo.a(eo.a(j), ":");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public eg clone() {
        eg egVar = new eg(this.h);
        egVar.f7758a = this.f7758a;
        egVar.b = this.b;
        egVar.c = this.c;
        egVar.d = this.d;
        egVar.e = this.e;
        egVar.f = this.f;
        egVar.g = this.g;
        egVar.h = this.h;
        return egVar;
    }

    public final String a() {
        return this.h + "#" + this.f7758a;
    }

    public final String toString() {
        return "AmapWifi{mac=" + this.f7758a + ", ssid='" + this.b + "', rssi=" + this.c + ", frequency=" + this.d + ", timestamp=" + this.e + ", lastUpdateUtcMills=" + this.f + ", freshness=" + ((int) this.g) + ", connected=" + this.h + '}';
    }
}
