package tb;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.g;

/* loaded from: classes2.dex */
public class akm<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f25395a;
    public T b;
    public final Interpolator c;
    public final Interpolator d;
    public final Interpolator e;
    public final float f;
    public Float g;
    public PointF h;
    public PointF i;
    private final g j;
    private float k;
    private float l;
    private int m;
    private int n;
    private float o;
    private float p;

    public akm(g gVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.k = -3987645.8f;
        this.l = -3987645.8f;
        this.m = 784923401;
        this.n = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.h = null;
        this.i = null;
        this.j = gVar;
        this.f25395a = t;
        this.b = t2;
        this.c = interpolator;
        this.d = null;
        this.e = null;
        this.f = f;
        this.g = f2;
    }

    public akm(g gVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.k = -3987645.8f;
        this.l = -3987645.8f;
        this.m = 784923401;
        this.n = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.h = null;
        this.i = null;
        this.j = gVar;
        this.f25395a = t;
        this.b = t2;
        this.c = null;
        this.d = interpolator;
        this.e = interpolator2;
        this.f = f;
        this.g = f2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public akm(g gVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.k = -3987645.8f;
        this.l = -3987645.8f;
        this.m = 784923401;
        this.n = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.h = null;
        this.i = null;
        this.j = gVar;
        this.f25395a = t;
        this.b = t2;
        this.c = interpolator;
        this.d = interpolator2;
        this.e = interpolator3;
        this.f = f;
        this.g = f2;
    }

    public akm(T t) {
        this.k = -3987645.8f;
        this.l = -3987645.8f;
        this.m = 784923401;
        this.n = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.h = null;
        this.i = null;
        this.j = null;
        this.f25395a = t;
        this.b = t;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = Float.MIN_VALUE;
        this.g = Float.valueOf(Float.MAX_VALUE);
    }

    public boolean a(float f) {
        return f >= c() && f < d();
    }

    public float c() {
        g gVar = this.j;
        if (gVar == null) {
            return 0.0f;
        }
        if (this.o == Float.MIN_VALUE) {
            this.o = (this.f - gVar.f()) / this.j.m();
        }
        return this.o;
    }

    public float d() {
        if (this.j == null) {
            return 1.0f;
        }
        if (this.p == Float.MIN_VALUE) {
            if (this.g == null) {
                this.p = 1.0f;
            } else {
                this.p = c() + ((this.g.floatValue() - this.f) / this.j.m());
            }
        }
        return this.p;
    }

    public boolean e() {
        return this.c == null && this.d == null && this.e == null;
    }

    public float f() {
        if (this.k == -3987645.8f) {
            this.k = ((Float) this.f25395a).floatValue();
        }
        return this.k;
    }

    public float g() {
        if (this.l == -3987645.8f) {
            this.l = ((Float) this.b).floatValue();
        }
        return this.l;
    }

    public int h() {
        if (this.m == 784923401) {
            this.m = ((Integer) this.f25395a).intValue();
        }
        return this.m;
    }

    public int i() {
        if (this.n == 784923401) {
            this.n = ((Integer) this.b).intValue();
        }
        return this.n;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f25395a + ", endValue=" + this.b + ", startFrame=" + this.f + ", endFrame=" + this.g + ", interpolator=" + this.c + '}';
    }
}
