package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.push.em;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class gf {

    /* renamed from: a  reason: collision with other field name */
    int f402a;

    /* renamed from: a  reason: collision with other field name */
    private em.a f403a;

    /* renamed from: a  reason: collision with other field name */
    String f404a;

    /* renamed from: a  reason: collision with other field name */
    private short f405a;

    /* renamed from: b  reason: collision with other field name */
    private final long f406b;

    /* renamed from: b  reason: collision with other field name */
    private byte[] f407b;
    private static String b = hs.a(5) + "-";

    /* renamed from: a  reason: collision with root package name */
    private static long f24496a = 0;

    /* renamed from: a  reason: collision with other field name */
    private static final byte[] f401a = new byte[0];

    public gf() {
        this.f405a = (short) 2;
        this.f407b = f401a;
        this.f404a = null;
        this.f406b = System.currentTimeMillis();
        this.f403a = new em.a();
        this.f402a = 1;
    }

    gf(em.a aVar, short s, byte[] bArr) {
        this.f405a = (short) 2;
        this.f407b = f401a;
        this.f404a = null;
        this.f406b = System.currentTimeMillis();
        this.f403a = aVar;
        this.f405a = s;
        this.f407b = bArr;
        this.f402a = 2;
    }

    @Deprecated
    public static gf a(hh hhVar, String str) {
        int i;
        gf gfVar = new gf();
        try {
            i = Integer.parseInt(hhVar.k());
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("Blob parse chid err " + e.getMessage());
            i = 1;
        }
        gfVar.a(i);
        gfVar.a(hhVar.j());
        gfVar.c(hhVar.m());
        gfVar.b(hhVar.n());
        gfVar.a("XMLMSG", (String) null);
        try {
            gfVar.a(hhVar.m2007a().getBytes("utf8"), str);
            if (TextUtils.isEmpty(str)) {
                gfVar.a((short) 3);
            } else {
                gfVar.a((short) 2);
                gfVar.a("SECMSG", (String) null);
            }
        } catch (UnsupportedEncodingException e2) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("Blob setPayload err： " + e2.getMessage());
        }
        return gfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static gf a(ByteBuffer byteBuffer) {
        try {
            ByteBuffer slice = byteBuffer.slice();
            short s = slice.getShort(0);
            short s2 = slice.getShort(2);
            int i = slice.getInt(4);
            em.a aVar = new em.a();
            aVar.a(slice.array(), slice.arrayOffset() + 8, (int) s2);
            byte[] bArr = new byte[i];
            slice.position(s2 + 8);
            slice.get(bArr, 0, i);
            return new gf(aVar, s, bArr);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("read Blob err :" + e.getMessage());
            throw new IOException("Malformed Input");
        }
    }

    public static synchronized String d() {
        String sb;
        synchronized (gf.class) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b);
            long j = f24496a;
            f24496a = 1 + j;
            sb2.append(Long.toString(j));
            sb = sb2.toString();
        }
        return sb;
    }

    public int a() {
        return this.f403a.c();
    }

    /* renamed from: a  reason: collision with other method in class */
    public long m1961a() {
        return this.f406b;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m1962a() {
        return this.f403a.m1853c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public ByteBuffer mo1963a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocate(c());
        }
        byteBuffer.putShort(this.f405a);
        byteBuffer.putShort((short) this.f403a.mo1910a());
        byteBuffer.putInt(this.f407b.length);
        int position = byteBuffer.position();
        this.f403a.a(byteBuffer.array(), byteBuffer.arrayOffset() + position, this.f403a.mo1910a());
        byteBuffer.position(position + this.f403a.mo1910a());
        byteBuffer.put(this.f407b);
        return byteBuffer;
    }

    /* renamed from: a  reason: collision with other method in class */
    public short m1964a() {
        return this.f405a;
    }

    public void a(int i) {
        this.f403a.a(i);
    }

    public void a(long j) {
        this.f403a.a(j);
    }

    public void a(long j, String str, String str2) {
        if (j != 0) {
            this.f403a.a(j);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f403a.a(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f403a.b(str2);
        }
    }

    public void a(String str) {
        this.f403a.e(str);
    }

    public void a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f403a.c(str);
            this.f403a.mo1910a();
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f403a.d(str2);
            return;
        }
        throw new IllegalArgumentException("command should not be empty");
    }

    public void a(short s) {
        this.f405a = s;
    }

    public void a(byte[] bArr, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f403a.c(1);
            this.f407b = com.xiaomi.push.service.bo.a(com.xiaomi.push.service.bo.a(str, e()), bArr);
            return;
        }
        this.f403a.c(0);
        this.f407b = bArr;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1965a() {
        return this.f403a.j();
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m1966a() {
        return gg.a(this, this.f407b);
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m1967a(String str) {
        if (this.f403a.e() == 1) {
            return gg.a(this, com.xiaomi.push.service.bo.a(com.xiaomi.push.service.bo.a(str, e()), this.f407b));
        }
        if (this.f403a.e() == 0) {
            return gg.a(this, this.f407b);
        }
        com.xiaomi.channel.commonutils.logger.b.m1616a("unknow cipher = " + this.f403a.e());
        return gg.a(this, this.f407b);
    }

    public int b() {
        return this.f403a.f();
    }

    /* renamed from: b  reason: collision with other method in class */
    public long m1968b() {
        return this.f403a.mo1912b();
    }

    /* renamed from: b  reason: collision with other method in class */
    public String m1969b() {
        return this.f403a.m1855d();
    }

    public void b(long j) {
        this.f403a.b(j);
    }

    public void b(String str) {
        this.f404a = str;
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m1970b() {
        return this.f403a.l();
    }

    public int c() {
        return this.f403a.mo1912b() + 8 + this.f407b.length;
    }

    /* renamed from: c  reason: collision with other method in class */
    public long m1971c() {
        return this.f403a.mo1910a();
    }

    /* renamed from: c  reason: collision with other method in class */
    public String m1972c() {
        return this.f403a.m1859f();
    }

    public void c(long j) {
        this.f403a.c(j);
    }

    public void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf("@");
            try {
                long parseLong = Long.parseLong(str.substring(0, indexOf));
                int indexOf2 = str.indexOf("/", indexOf);
                String substring = str.substring(indexOf + 1, indexOf2);
                String substring2 = str.substring(indexOf2 + 1);
                this.f403a.a(parseLong);
                this.f403a.a(substring);
                this.f403a.b(substring2);
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("Blob parse user err " + e.getMessage());
            }
        }
    }

    public String e() {
        String m1857e = this.f403a.m1857e();
        if ("ID_NOT_AVAILABLE".equals(m1857e)) {
            return null;
        }
        if (this.f403a.g()) {
            return m1857e;
        }
        String d = d();
        this.f403a.e(d);
        return d;
    }

    public String f() {
        return this.f404a;
    }

    public String g() {
        if (this.f403a.mo1912b()) {
            return Long.toString(this.f403a.mo1910a()) + "@" + this.f403a.mo1910a() + "/" + this.f403a.mo1912b();
        }
        return null;
    }

    public String toString() {
        return "Blob [chid=" + a() + "; Id=" + com.xiaomi.push.service.bc.a(e()) + "; cmd=" + m1962a() + "; type=" + ((int) m1964a()) + "; from=" + g() + " ]";
    }
}
