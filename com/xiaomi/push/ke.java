package com.xiaomi.push;

import com.xiaomi.push.ju;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class ke extends ju {
    private static int b = 10000;
    private static int c = 10000;
    private static int d = 10000;
    private static int e = 10485760;
    private static int f = 104857600;

    /* loaded from: classes9.dex */
    public static class a extends ju.a {
        public a() {
            super(false, true);
        }

        public a(boolean z, boolean z2, int i) {
            super(z, z2, i);
        }

        @Override // com.xiaomi.push.ju.a, com.xiaomi.push.ka
        public jy a(ki kiVar) {
            ke keVar = new ke(kiVar, this.f838a, this.b);
            if (this.f24583a != 0) {
                keVar.b(this.f24583a);
            }
            return keVar;
        }
    }

    public ke(ki kiVar, boolean z, boolean z2) {
        super(kiVar, z, z2);
    }

    @Override // com.xiaomi.push.ju, com.xiaomi.push.jy
    /* renamed from: a */
    public jw mo2206a() {
        byte a2 = mo2206a();
        int a3 = mo2206a();
        if (a3 <= c) {
            return new jw(a2, a3);
        }
        throw new jz(3, "Thrift list size " + a3 + " out of range!");
    }

    @Override // com.xiaomi.push.ju, com.xiaomi.push.jy
    /* renamed from: a  reason: collision with other method in class */
    public jx mo2206a() {
        byte a2 = mo2206a();
        byte a3 = mo2206a();
        int a4 = mo2206a();
        if (a4 <= b) {
            return new jx(a2, a3, a4);
        }
        throw new jz(3, "Thrift map size " + a4 + " out of range!");
    }

    @Override // com.xiaomi.push.ju, com.xiaomi.push.jy
    /* renamed from: a */
    public kc mo2206a() {
        byte a2 = mo2206a();
        int a3 = mo2206a();
        if (a3 <= d) {
            return new kc(a2, a3);
        }
        throw new jz(3, "Thrift set size " + a3 + " out of range!");
    }

    @Override // com.xiaomi.push.ju, com.xiaomi.push.jy
    /* renamed from: a  reason: collision with other method in class */
    public String mo2206a() {
        int a2 = mo2206a();
        if (a2 > e) {
            throw new jz(3, "Thrift string size " + a2 + " out of range!");
        } else if (this.f24587a.b() < a2) {
            return mo2190a(a2);
        } else {
            try {
                String str = new String(this.f24587a.a(), this.f24587a.mo2210a(), a2, "UTF-8");
                this.f24587a.a(a2);
                return str;
            } catch (UnsupportedEncodingException unused) {
                throw new js("JVM DOES NOT SUPPORT UTF-8");
            }
        }
    }

    @Override // com.xiaomi.push.ju, com.xiaomi.push.jy
    /* renamed from: a */
    public ByteBuffer mo2206a() {
        int a2 = mo2206a();
        if (a2 > f) {
            throw new jz(3, "Thrift binary size " + a2 + " out of range!");
        }
        c(a2);
        if (this.f24587a.b() >= a2) {
            ByteBuffer wrap = ByteBuffer.wrap(this.f24587a.a(), this.f24587a.mo2210a(), a2);
            this.f24587a.a(a2);
            return wrap;
        }
        byte[] bArr = new byte[a2];
        this.f24587a.b(bArr, 0, a2);
        return ByteBuffer.wrap(bArr);
    }
}
