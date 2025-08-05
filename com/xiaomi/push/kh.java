package com.xiaomi.push;

/* loaded from: classes9.dex */
public final class kh extends ki {

    /* renamed from: a  reason: collision with root package name */
    private int f24594a;

    /* renamed from: a  reason: collision with other field name */
    private byte[] f846a;
    private int b;

    @Override // com.xiaomi.push.ki
    /* renamed from: a */
    public int mo2210a() {
        return this.f24594a;
    }

    @Override // com.xiaomi.push.ki
    /* renamed from: a */
    public int mo2209a(byte[] bArr, int i, int i2) {
        int b = b();
        if (i2 > b) {
            i2 = b;
        }
        if (i2 > 0) {
            System.arraycopy(this.f846a, this.f24594a, bArr, i, i2);
            a(i2);
        }
        return i2;
    }

    @Override // com.xiaomi.push.ki
    public void a(int i) {
        this.f24594a += i;
    }

    public void a(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }

    @Override // com.xiaomi.push.ki
    /* renamed from: a  reason: collision with other method in class */
    public void mo2209a(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // com.xiaomi.push.ki
    /* renamed from: a  reason: collision with other method in class */
    public byte[] mo2210a() {
        return this.f846a;
    }

    @Override // com.xiaomi.push.ki
    public int b() {
        return this.b - this.f24594a;
    }

    @Override // com.xiaomi.push.ki
    public void b(byte[] bArr, int i, int i2) {
        this.f846a = bArr;
        this.f24594a = i;
        this.b = i + i2;
    }
}
