package tb;

import tb.abp;

/* loaded from: classes2.dex */
public final class abr extends abp<abr> {
    private abs i;
    private float j;
    private boolean k;

    public <K> abr(K k, abq<K> abqVar) {
        super(k, abqVar);
        this.i = null;
        this.j = Float.MAX_VALUE;
        this.k = false;
    }

    private void d() {
        abs absVar = this.i;
        if (absVar != null) {
            double a2 = absVar.a();
            if (a2 > this.g) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            }
            if (a2 < this.h) {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
            return;
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    public abr a(abs absVar) {
        this.i = absVar;
        return this;
    }

    @Override // tb.abp
    public void a() {
        d();
        this.i.a(c());
        super.a();
    }

    @Override // tb.abp
    boolean a(float f, float f2) {
        return this.i.a(f, f2);
    }

    @Override // tb.abp
    boolean b(long j) {
        abs absVar;
        double d;
        double d2;
        long j2;
        if (this.k) {
            float f = this.j;
            if (f != Float.MAX_VALUE) {
                this.i.c(f);
                this.j = Float.MAX_VALUE;
            }
            this.b = this.i.a();
            this.f25212a = 0.0f;
            this.k = false;
            return true;
        }
        if (this.j != Float.MAX_VALUE) {
            this.i.a();
            j2 = j / 2;
            abp.a a2 = this.i.a(this.b, this.f25212a, j2);
            this.i.c(this.j);
            this.j = Float.MAX_VALUE;
            absVar = this.i;
            d = a2.f25213a;
            d2 = a2.b;
        } else {
            absVar = this.i;
            d = this.b;
            d2 = this.f25212a;
            j2 = j;
        }
        abp.a a3 = absVar.a(d, d2, j2);
        this.b = a3.f25213a;
        this.f25212a = a3.b;
        this.b = Math.max(this.b, this.h);
        this.b = Math.min(this.b, this.g);
        if (!a(this.b, this.f25212a)) {
            return false;
        }
        this.b = this.i.a();
        this.f25212a = 0.0f;
        return true;
    }
}
