package com.xiaomi.push;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.GZIPInputStream;

/* loaded from: classes9.dex */
public class gj {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f24500a = {80, 85, 83, 72};

    /* renamed from: a  reason: collision with other field name */
    private byte f420a;

    /* renamed from: a  reason: collision with other field name */
    private int f421a;

    /* renamed from: a  reason: collision with other field name */
    private short f422a;
    private byte[] b;

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f24501a = new c();

        /* renamed from: a  reason: collision with other field name */
        public static final d f423a = new d();

        public static byte[] a(byte[] bArr) {
            return a(bArr, f423a);
        }

        public static byte[] a(byte[] bArr, b bVar) {
            if (gj.m1976a(bArr)) {
                gj a2 = gj.a(bArr);
                return (a2.f420a == 0 || a2.f420a != bVar.a()) ? a2.b : bVar.a(a2.b, a2.f421a);
            }
            return bArr;
        }
    }

    /* loaded from: classes9.dex */
    public interface b {
        byte a();

        byte[] a(byte[] bArr, int i);
    }

    /* loaded from: classes9.dex */
    public static final class c {
    }

    /* loaded from: classes9.dex */
    public static final class d implements b {
        @Override // com.xiaomi.push.gj.b
        public byte a() {
            return (byte) 2;
        }

        @Override // com.xiaomi.push.gj.b
        public byte[] a(byte[] bArr, int i) {
            GZIPInputStream gZIPInputStream;
            GZIPInputStream gZIPInputStream2 = null;
            try {
                gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr), i);
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] bArr2 = new byte[i];
                gZIPInputStream.read(bArr2);
                try {
                    gZIPInputStream.close();
                } catch (IOException unused2) {
                }
                return bArr2;
            } catch (IOException unused3) {
                gZIPInputStream2 = gZIPInputStream;
                if (gZIPInputStream2 != null) {
                    try {
                        gZIPInputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                return bArr;
            } catch (Throwable th2) {
                th = th2;
                gZIPInputStream2 = gZIPInputStream;
                if (gZIPInputStream2 != null) {
                    try {
                        gZIPInputStream2.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        }
    }

    protected gj(byte b2, int i, byte[] bArr) {
        this((short) 1, b2, i, bArr);
    }

    protected gj(short s, byte b2, int i, byte[] bArr) {
        this.f422a = (short) 1;
        this.f422a = s;
        this.f420a = b2;
        this.f421a = i;
        this.b = bArr;
    }

    public static gj a(byte b2, int i, byte[] bArr) {
        return new gj(b2, i, bArr);
    }

    public static gj a(short s, byte b2, int i, byte[] bArr) {
        return new gj(s, b2, i, bArr);
    }

    public static gj a(byte[] bArr) {
        if (m1976a(bArr)) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            order.getInt();
            short s = order.getShort();
            byte b2 = order.get();
            int i = order.getInt();
            byte[] bArr2 = new byte[order.getInt()];
            order.get(bArr2);
            return a(s, b2, i, bArr2);
        }
        return a((byte) 0, bArr.length, bArr);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m1976a(byte[] bArr) {
        byte[] bArr2 = f24500a;
        return a(bArr2, bArr, bArr2.length);
    }

    public static boolean a(byte[] bArr, byte[] bArr2, int i) {
        if (bArr.length < i || bArr2.length < i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
