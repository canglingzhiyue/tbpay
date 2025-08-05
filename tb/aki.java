package tb;

import android.view.Choreographer;
import com.airbnb.lottie.f;
import com.airbnb.lottie.g;

/* loaded from: classes2.dex */
public class aki extends ake implements Choreographer.FrameCallback {
    private g i;
    private float b = 1.0f;
    private boolean c = false;
    private long d = 0;
    private float e = 0.0f;
    private int f = 0;
    private float g = -2.14748365E9f;
    private float h = 2.14748365E9f;

    /* renamed from: a  reason: collision with root package name */
    protected boolean f25391a = false;

    private float q() {
        g gVar = this.i;
        if (gVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / gVar.h()) / Math.abs(this.b);
    }

    private boolean r() {
        return h() < 0.0f;
    }

    private void s() {
        if (this.i == null) {
            return;
        }
        float f = this.e;
        if (f >= this.g && f <= this.h) {
            return;
        }
        akh.c(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.g), Float.valueOf(this.h), Float.valueOf(this.e)));
    }

    public void a(float f) {
        if (this.e == f) {
            return;
        }
        this.e = akk.b(f, m(), n());
        this.d = 0L;
        c();
    }

    public void a(float f, float f2) {
        if (f > f2) {
            akh.c(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
            return;
        }
        g gVar = this.i;
        float f3 = gVar == null ? -3.4028235E38f : gVar.f();
        g gVar2 = this.i;
        float g = gVar2 == null ? Float.MAX_VALUE : gVar2.g();
        float b = akk.b(f, f3, g);
        float b2 = akk.b(f2, f3, g);
        if (b == this.g && b2 == this.h) {
            return;
        }
        this.g = b;
        this.h = b2;
        a((int) akk.b(this.e, b, b2));
    }

    public void a(int i) {
        a(i, (int) this.h);
    }

    public void a(g gVar) {
        float f;
        float g;
        boolean z = this.i == null;
        this.i = gVar;
        if (z) {
            f = (int) Math.max(this.g, gVar.f());
            g = Math.min(this.h, gVar.g());
        } else {
            f = (int) gVar.f();
            g = gVar.g();
        }
        a(f, (int) g);
        float f2 = this.e;
        this.e = 0.0f;
        a((int) f2);
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // tb.ake
    public void b() {
        super.b();
        b(r());
    }

    public void b(float f) {
        a(this.g, f);
    }

    public void c(float f) {
        this.b = f;
    }

    protected void c(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f25391a = false;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        b();
        p();
    }

    public float d() {
        g gVar = this.i;
        if (gVar == null) {
            return 0.0f;
        }
        return (this.e - gVar.f()) / (this.i.g() - this.i.f());
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        o();
        if (this.i == null || !isRunning()) {
            return;
        }
        f.a("LottieValueAnimator#doFrame");
        long j2 = this.d;
        long j3 = 0;
        if (j2 != 0) {
            j3 = j - j2;
        }
        float q = ((float) j3) / q();
        float f = this.e;
        if (r()) {
            q = -q;
        }
        this.e = f + q;
        boolean z = !akk.c(this.e, m(), n());
        this.e = akk.b(this.e, m(), n());
        this.d = j;
        c();
        if (z) {
            if (getRepeatCount() == -1 || this.f < getRepeatCount()) {
                a();
                this.f++;
                if (getRepeatMode() == 2) {
                    this.c = !this.c;
                    g();
                } else {
                    this.e = r() ? n() : m();
                }
                this.d = j;
            } else {
                this.e = this.b < 0.0f ? m() : n();
                p();
                b(r());
            }
        }
        s();
        f.b("LottieValueAnimator#doFrame");
    }

    public float e() {
        return this.e;
    }

    public void f() {
        this.i = null;
        this.g = -2.14748365E9f;
        this.h = 2.14748365E9f;
    }

    public void g() {
        c(-h());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float f;
        float m;
        if (this.i == null) {
            return 0.0f;
        }
        if (r()) {
            f = n();
            m = this.e;
        } else {
            f = this.e;
            m = m();
        }
        return (f - m) / (n() - m());
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(d());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        g gVar = this.i;
        if (gVar == null) {
            return 0L;
        }
        return gVar.e();
    }

    public float h() {
        return this.b;
    }

    public void i() {
        this.f25391a = true;
        a(r());
        a((int) (r() ? n() : m()));
        this.d = 0L;
        this.f = 0;
        o();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f25391a;
    }

    public void j() {
        p();
        b(r());
    }

    public void k() {
        p();
    }

    public void l() {
        this.f25391a = true;
        o();
        this.d = 0L;
        if (r() && e() == m()) {
            this.e = n();
        } else if (r() || e() != n()) {
        } else {
            this.e = m();
        }
    }

    public float m() {
        g gVar = this.i;
        if (gVar == null) {
            return 0.0f;
        }
        float f = this.g;
        return f == -2.14748365E9f ? gVar.f() : f;
    }

    public float n() {
        g gVar = this.i;
        if (gVar == null) {
            return 0.0f;
        }
        float f = this.h;
        return f == 2.14748365E9f ? gVar.g() : f;
    }

    protected void o() {
        if (isRunning()) {
            c(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void p() {
        c(true);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.c) {
            return;
        }
        this.c = false;
        g();
    }
}
