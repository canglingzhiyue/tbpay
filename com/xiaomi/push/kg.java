package com.xiaomi.push;

/* loaded from: classes9.dex */
public class kg extends ki {

    /* renamed from: a  reason: collision with root package name */
    private int f24593a;

    /* renamed from: a  reason: collision with other field name */
    private jq f845a;

    public kg(int i) {
        this.f845a = new jq(i);
    }

    @Override // com.xiaomi.push.ki
    /* renamed from: a */
    public int mo2209a(byte[] bArr, int i, int i2) {
        byte[] m2183a = this.f845a.m2183a();
        if (i2 > this.f845a.a() - this.f24593a) {
            i2 = this.f845a.a() - this.f24593a;
        }
        if (i2 > 0) {
            System.arraycopy(m2183a, this.f24593a, bArr, i, i2);
            this.f24593a += i2;
        }
        return i2;
    }

    @Override // com.xiaomi.push.ki
    /* renamed from: a  reason: collision with other method in class */
    public void mo2209a(byte[] bArr, int i, int i2) {
        this.f845a.write(bArr, i, i2);
    }

    public int a_() {
        return this.f845a.size();
    }
}
