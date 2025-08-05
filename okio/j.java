package okio;

import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    final byte[] f25060a;
    int b;
    int c;
    boolean d;
    boolean e;
    j f;
    j g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j() {
        this.f25060a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f25060a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j a() {
        this.d = true;
        return new j(this.f25060a, this.b, this.c, true, false);
    }

    public final j a(int i) {
        j a2;
        if (i <= 0 || i > this.c - this.b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            a2 = a();
        } else {
            a2 = k.a();
            System.arraycopy(this.f25060a, this.b, a2.f25060a, 0, i);
        }
        a2.c = a2.b + i;
        this.b += i;
        this.g.a(a2);
        return a2;
    }

    public final j a(j jVar) {
        jVar.g = this;
        jVar.f = this.f;
        this.f.g = jVar;
        this.f = jVar;
        return jVar;
    }

    public final void a(j jVar, int i) {
        if (jVar.e) {
            int i2 = jVar.c;
            if (i2 + i > 8192) {
                if (jVar.d) {
                    throw new IllegalArgumentException();
                }
                int i3 = jVar.b;
                if ((i2 + i) - i3 > 8192) {
                    throw new IllegalArgumentException();
                }
                byte[] bArr = jVar.f25060a;
                System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                jVar.c -= jVar.b;
                jVar.b = 0;
            }
            System.arraycopy(this.f25060a, this.b, jVar.f25060a, jVar.c, i);
            jVar.c += i;
            this.b += i;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Nullable
    public final j b() {
        j jVar = this.f;
        if (jVar == this) {
            jVar = null;
        }
        j jVar2 = this.g;
        jVar2.f = this.f;
        this.f.g = jVar2;
        this.f = null;
        this.g = null;
        return jVar;
    }

    public final void c() {
        j jVar = this.g;
        if (jVar != this) {
            if (!jVar.e) {
                return;
            }
            int i = this.c - this.b;
            if (i > (8192 - jVar.c) + (jVar.d ? 0 : jVar.b)) {
                return;
            }
            a(this.g, i);
            b();
            k.a(this);
            return;
        }
        throw new IllegalStateException();
    }
}
