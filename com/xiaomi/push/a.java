package com.xiaomi.push;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f24342a = new a(new byte[0]);

    /* renamed from: a  reason: collision with other field name */
    private volatile int f85a = 0;

    /* renamed from: a  reason: collision with other field name */
    private final byte[] f86a;

    private a(byte[] bArr) {
        this.f86a = bArr;
    }

    public static a a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static a a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new a(bArr2);
    }

    public int a() {
        return this.f86a.length;
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m1694a() {
        byte[] bArr = this.f86a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        byte[] bArr = this.f86a;
        int length = bArr.length;
        byte[] bArr2 = ((a) obj).f86a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.f85a;
        if (i == 0) {
            byte[] bArr = this.f86a;
            int length = bArr.length;
            for (byte b : bArr) {
                length = (length * 31) + b;
            }
            i = length == 0 ? 1 : length;
            this.f85a = i;
        }
        return i;
    }
}
