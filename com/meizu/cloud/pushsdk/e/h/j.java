package com.meizu.cloud.pushsdk.e.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    final byte[] f7943a;
    int b;
    int c;
    boolean d;
    final boolean e;
    j f;
    j g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j() {
        this.f7943a = new byte[2048];
        this.e = true;
        this.d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(j jVar) {
        this(jVar.f7943a, jVar.b, jVar.c);
    }

    j(byte[] bArr, int i, int i2) {
        this.f7943a = bArr;
        this.b = i;
        this.c = i2;
        this.e = false;
        this.d = true;
    }

    public j a(int i) {
        if (i <= 0 || i > this.c - this.b) {
            throw new IllegalArgumentException();
        }
        j jVar = new j(this);
        jVar.c = jVar.b + i;
        this.b += i;
        this.g.a(jVar);
        return jVar;
    }

    public j a(j jVar) {
        jVar.g = this;
        jVar.f = this.f;
        this.f.g = jVar;
        this.f = jVar;
        return jVar;
    }

    public void a() {
        j jVar = this.g;
        if (jVar != this) {
            if (!jVar.e) {
                return;
            }
            int i = this.c - this.b;
            if (i > (2048 - jVar.c) + (jVar.d ? 0 : jVar.b)) {
                return;
            }
            a(jVar, i);
            b();
            k.a(this);
            return;
        }
        throw new IllegalStateException();
    }

    public void a(j jVar, int i) {
        if (jVar.e) {
            int i2 = jVar.c;
            int i3 = i2 + i;
            if (i3 > 2048) {
                if (jVar.d) {
                    throw new IllegalArgumentException();
                }
                int i4 = jVar.b;
                if (i3 - i4 > 2048) {
                    throw new IllegalArgumentException();
                }
                byte[] bArr = jVar.f7943a;
                System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                jVar.c -= jVar.b;
                jVar.b = 0;
            }
            System.arraycopy(this.f7943a, this.b, jVar.f7943a, jVar.c, i);
            jVar.c += i;
            this.b += i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public j b() {
        j jVar = this.f;
        j jVar2 = jVar != this ? jVar : null;
        j jVar3 = this.g;
        jVar3.f = jVar;
        this.f.g = jVar3;
        this.f = null;
        this.g = null;
        return jVar2;
    }
}
