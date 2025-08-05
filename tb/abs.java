package tb;

import tb.abp;
import tb.mto;

/* loaded from: classes2.dex */
public final class abs {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;

    /* renamed from: a  reason: collision with root package name */
    double f25215a = Math.sqrt(1500.0d);
    double b = 0.5d;
    private boolean c = false;
    private double i = Double.MAX_VALUE;
    private final abp.a j = new abp.a();

    private void b() {
        if (this.c) {
            return;
        }
        if (this.i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d = this.b;
        if (d > 1.0d) {
            double d2 = this.f25215a;
            this.f = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
            double d3 = this.b;
            double d4 = this.f25215a;
            this.g = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
        } else if (d >= mto.a.GEO_NOT_SUPPORT && d < 1.0d) {
            this.h = this.f25215a * Math.sqrt(1.0d - (d * d));
        }
        this.c = true;
    }

    public float a() {
        return (float) this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abp.a a(double d, double d2, long j) {
        double cos;
        double d3;
        b();
        double d4 = j / 1000.0d;
        double d5 = d - this.i;
        double d6 = this.b;
        if (d6 > 1.0d) {
            double d7 = this.g;
            double d8 = this.f;
            double d9 = d5 - (((d7 * d5) - d2) / (d7 - d8));
            double d10 = ((d5 * d7) - d2) / (d7 - d8);
            d3 = (Math.pow(2.718281828459045d, d7 * d4) * d9) + (Math.pow(2.718281828459045d, this.f * d4) * d10);
            double d11 = this.g;
            double pow = d9 * d11 * Math.pow(2.718281828459045d, d11 * d4);
            double d12 = this.f;
            cos = pow + (d10 * d12 * Math.pow(2.718281828459045d, d12 * d4));
        } else if (d6 == 1.0d) {
            double d13 = this.f25215a;
            double d14 = d2 + (d13 * d5);
            double d15 = d5 + (d14 * d4);
            d3 = Math.pow(2.718281828459045d, (-d13) * d4) * d15;
            double pow2 = d15 * Math.pow(2.718281828459045d, (-this.f25215a) * d4);
            double d16 = this.f25215a;
            cos = (d14 * Math.pow(2.718281828459045d, (-d16) * d4)) + (pow2 * (-d16));
        } else {
            double d17 = 1.0d / this.h;
            double d18 = this.f25215a;
            double d19 = d17 * ((d6 * d18 * d5) + d2);
            double pow3 = Math.pow(2.718281828459045d, (-d6) * d18 * d4) * ((Math.cos(this.h * d4) * d5) + (Math.sin(this.h * d4) * d19));
            double d20 = this.f25215a;
            double d21 = this.b;
            double d22 = (-d20) * pow3 * d21;
            double pow4 = Math.pow(2.718281828459045d, (-d21) * d20 * d4);
            double d23 = this.h;
            double sin = (-d23) * d5 * Math.sin(d23 * d4);
            double d24 = this.h;
            cos = d22 + (pow4 * (sin + (d19 * d24 * Math.cos(d24 * d4))));
            d3 = pow3;
        }
        abp.a aVar = this.j;
        aVar.f25213a = (float) (d3 + this.i);
        aVar.b = (float) cos;
        return aVar;
    }

    public abs a(float f) {
        if (f > 0.0f) {
            this.f25215a = Math.sqrt(f);
            this.c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(double d) {
        this.d = Math.abs(d);
        this.e = this.d * 62.5d;
    }

    public boolean a(float f, float f2) {
        return ((double) Math.abs(f2)) < this.e && ((double) Math.abs(f - a())) < this.d;
    }

    public abs b(float f) {
        if (f >= 0.0f) {
            this.b = f;
            this.c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public abs c(float f) {
        this.i = f;
        return this;
    }
}
