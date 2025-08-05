package com.xiaomi.push;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class ju extends jy {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f24582a = new kd();

    /* renamed from: a  reason: collision with other field name */
    protected int f833a;

    /* renamed from: a  reason: collision with other field name */
    protected boolean f834a;

    /* renamed from: a  reason: collision with other field name */
    private byte[] f835a;
    protected boolean b;

    /* renamed from: b  reason: collision with other field name */
    private byte[] f836b;
    protected boolean c;

    /* renamed from: c  reason: collision with other field name */
    private byte[] f837c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    private byte[] h;

    /* loaded from: classes9.dex */
    public static class a implements ka {

        /* renamed from: a  reason: collision with root package name */
        protected int f24583a;

        /* renamed from: a  reason: collision with other field name */
        protected boolean f838a;
        protected boolean b;

        public a() {
            this(false, true);
        }

        public a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public a(boolean z, boolean z2, int i) {
            this.f838a = false;
            this.b = true;
            this.f838a = z;
            this.b = z2;
            this.f24583a = i;
        }

        @Override // com.xiaomi.push.ka
        public jy a(ki kiVar) {
            ju juVar = new ju(kiVar, this.f838a, this.b);
            int i = this.f24583a;
            if (i != 0) {
                juVar.b(i);
            }
            return juVar;
        }
    }

    public ju(ki kiVar, boolean z, boolean z2) {
        super(kiVar);
        this.f834a = false;
        this.b = true;
        this.c = false;
        this.f835a = new byte[1];
        this.f836b = new byte[2];
        this.f837c = new byte[4];
        this.d = new byte[8];
        this.e = new byte[1];
        this.f = new byte[2];
        this.g = new byte[4];
        this.h = new byte[8];
        this.f834a = z;
        this.b = z2;
    }

    private int a(byte[] bArr, int i, int i2) {
        c(i2);
        return this.f24587a.b(bArr, i, i2);
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a */
    public byte mo2206a() {
        if (this.f24587a.b() <= 0) {
            a(this.e, 0, 1);
            return this.e[0];
        }
        byte b = this.f24587a.a()[this.f24587a.mo2210a()];
        this.f24587a.a(1);
        return b;
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a  reason: collision with other method in class */
    public double mo2206a() {
        return Double.longBitsToDouble(mo2206a());
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a */
    public int mo2206a() {
        byte[] bArr = this.g;
        int i = 0;
        if (this.f24587a.b() >= 4) {
            bArr = this.f24587a.a();
            i = this.f24587a.mo2210a();
            this.f24587a.a(4);
        } else {
            a(this.g, 0, 4);
        }
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a  reason: collision with other method in class */
    public long mo2206a() {
        byte[] bArr = this.h;
        int i = 0;
        if (this.f24587a.b() >= 8) {
            bArr = this.f24587a.a();
            i = this.f24587a.mo2210a();
            this.f24587a.a(8);
        } else {
            a(this.h, 0, 8);
        }
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a */
    public jv mo2206a() {
        byte mo2206a = mo2206a();
        return new jv("", mo2206a, mo2206a == 0 ? (short) 0 : mo2206a());
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a  reason: collision with other method in class */
    public jw mo2206a() {
        return new jw(mo2206a(), mo2206a());
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a */
    public jx mo2206a() {
        return new jx(mo2206a(), mo2206a(), mo2206a());
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a  reason: collision with other method in class */
    public kc mo2206a() {
        return new kc(mo2206a(), mo2206a());
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a */
    public kd mo2206a() {
        return f24582a;
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a  reason: collision with other method in class */
    public String mo2206a() {
        int mo2206a = mo2206a();
        if (this.f24587a.b() >= mo2206a) {
            try {
                String str = new String(this.f24587a.a(), this.f24587a.mo2210a(), mo2206a, "UTF-8");
                this.f24587a.a(mo2206a);
                return str;
            } catch (UnsupportedEncodingException unused) {
                throw new js("JVM DOES NOT SUPPORT UTF-8");
            }
        }
        return mo2190a(mo2206a);
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a */
    public String mo2190a(int i) {
        try {
            c(i);
            byte[] bArr = new byte[i];
            this.f24587a.b(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new js("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a */
    public ByteBuffer mo2206a() {
        int mo2206a = mo2206a();
        c(mo2206a);
        if (this.f24587a.b() >= mo2206a) {
            ByteBuffer wrap = ByteBuffer.wrap(this.f24587a.a(), this.f24587a.mo2210a(), mo2206a);
            this.f24587a.a(mo2206a);
            return wrap;
        }
        byte[] bArr = new byte[mo2206a];
        this.f24587a.b(bArr, 0, mo2206a);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a  reason: collision with other method in class */
    public short mo2206a() {
        byte[] bArr = this.f;
        int i = 0;
        if (this.f24587a.b() >= 2) {
            bArr = this.f24587a.a();
            i = this.f24587a.mo2210a();
            this.f24587a.a(2);
        } else {
            a(this.f, 0, 2);
        }
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a */
    public void mo2206a() {
    }

    @Override // com.xiaomi.push.jy
    public void a(byte b) {
        this.f835a[0] = b;
        this.f24587a.a(this.f835a, 0, 1);
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a  reason: collision with other method in class */
    public void mo2190a(int i) {
        byte[] bArr = this.f837c;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.f24587a.a(this.f837c, 0, 4);
    }

    @Override // com.xiaomi.push.jy
    public void a(long j) {
        byte[] bArr = this.d;
        bArr[0] = (byte) ((j >> 56) & 255);
        bArr[1] = (byte) ((j >> 48) & 255);
        bArr[2] = (byte) ((j >> 40) & 255);
        bArr[3] = (byte) ((j >> 32) & 255);
        bArr[4] = (byte) ((j >> 24) & 255);
        bArr[5] = (byte) ((j >> 16) & 255);
        bArr[6] = (byte) ((j >> 8) & 255);
        bArr[7] = (byte) (j & 255);
        this.f24587a.a(this.d, 0, 8);
    }

    @Override // com.xiaomi.push.jy
    public void a(jv jvVar) {
        a(jvVar.f24584a);
        a(jvVar.f840a);
    }

    @Override // com.xiaomi.push.jy
    public void a(jw jwVar) {
        a(jwVar.f24585a);
        mo2190a(jwVar.f841a);
    }

    @Override // com.xiaomi.push.jy
    public void a(jx jxVar) {
        a(jxVar.f24586a);
        a(jxVar.b);
        mo2190a(jxVar.f842a);
    }

    @Override // com.xiaomi.push.jy
    public void a(kd kdVar) {
    }

    @Override // com.xiaomi.push.jy
    public void a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            mo2190a(bytes.length);
            this.f24587a.a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new js("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.jy
    public void a(ByteBuffer byteBuffer) {
        int limit = (byteBuffer.limit() - byteBuffer.position()) - byteBuffer.arrayOffset();
        mo2190a(limit);
        this.f24587a.a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), limit);
    }

    @Override // com.xiaomi.push.jy
    public void a(short s) {
        byte[] bArr = this.f836b;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        this.f24587a.a(this.f836b, 0, 2);
    }

    @Override // com.xiaomi.push.jy
    public void a(boolean z) {
        a(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo2206a() {
        return mo2206a() == 1;
    }

    @Override // com.xiaomi.push.jy
    public void b() {
    }

    public void b(int i) {
        this.f833a = i;
        this.c = true;
    }

    @Override // com.xiaomi.push.jy
    public void c() {
        a((byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(int i) {
        if (i < 0) {
            throw new js("Negative length: " + i);
        } else if (!this.c) {
        } else {
            this.f833a -= i;
            if (this.f833a >= 0) {
                return;
            }
            throw new js("Message length exceeded: " + i);
        }
    }

    @Override // com.xiaomi.push.jy
    public void d() {
    }

    @Override // com.xiaomi.push.jy
    public void e() {
    }

    @Override // com.xiaomi.push.jy
    public void f() {
    }

    @Override // com.xiaomi.push.jy
    public void g() {
    }

    @Override // com.xiaomi.push.jy
    public void h() {
    }

    @Override // com.xiaomi.push.jy
    public void i() {
    }

    @Override // com.xiaomi.push.jy
    public void j() {
    }
}
