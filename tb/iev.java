package tb;

import java.util.Arrays;
import tb.mto;

/* loaded from: classes2.dex */
public class iev {
    public static final int BOUNCE = 6;
    public static final int COS_WAVE = 5;
    public static final int REVERSE_SAW_WAVE = 4;
    public static final int SAW_WAVE = 3;
    public static final int SIN_WAVE = 0;
    public static final int SQUARE_WAVE = 1;
    public static final int TRIANGLE_WAVE = 2;

    /* renamed from: a  reason: collision with root package name */
    public static String f28983a = "Oscillator";
    double[] d;
    int e;
    float[] b = new float[0];
    double[] c = new double[0];
    double f = 6.283185307179586d;
    private boolean g = false;

    double a(double d) {
        if (d < mto.a.GEO_NOT_SUPPORT) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.c, d);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.b;
        int i2 = i - 1;
        double d2 = fArr[i] - fArr[i2];
        double[] dArr = this.c;
        double d3 = d2 / (dArr[i] - dArr[i2]);
        return this.d[i2] + ((fArr[i2] - (dArr[i2] * d3)) * (d - dArr[i2])) + ((d3 * ((d * d) - (dArr[i2] * dArr[i2]))) / 2.0d);
    }

    public void a() {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        int i;
        double d = 0.0d;
        int i2 = 0;
        while (true) {
            if (i2 >= this.b.length) {
                break;
            }
            d += fArr[i2];
            i2++;
        }
        double d2 = 0.0d;
        int i3 = 1;
        while (true) {
            if (i3 >= this.b.length) {
                break;
            }
            double[] dArr = this.c;
            d2 += (dArr[i3] - dArr[i3 - 1]) * ((fArr2[i] + fArr2[i3]) / 2.0f);
            i3++;
        }
        int i4 = 0;
        while (true) {
            float[] fArr4 = this.b;
            if (i4 >= fArr4.length) {
                break;
            }
            fArr4[i4] = (float) (fArr4[i4] * (d / d2));
            i4++;
        }
        this.d[0] = 0.0d;
        int i5 = 1;
        while (true) {
            if (i5 >= this.b.length) {
                this.g = true;
                return;
            }
            int i6 = i5 - 1;
            double[] dArr2 = this.c;
            double d3 = dArr2[i5] - dArr2[i6];
            double[] dArr3 = this.d;
            dArr3[i5] = dArr3[i6] + (d3 * ((fArr3[i6] + fArr3[i5]) / 2.0f));
            i5++;
        }
    }

    public void a(double d, float f) {
        int length = this.b.length + 1;
        int binarySearch = Arrays.binarySearch(this.c, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.c = Arrays.copyOf(this.c, length);
        this.b = Arrays.copyOf(this.b, length);
        this.d = new double[length];
        double[] dArr = this.c;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.c[binarySearch] = d;
        this.b[binarySearch] = f;
        this.g = false;
    }

    public void a(int i) {
        this.e = i;
    }

    public double b(double d) {
        double abs;
        switch (this.e) {
            case 1:
                return Math.signum(0.5d - (a(d) % 1.0d));
            case 2:
                abs = Math.abs((((a(d) * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((a(d) * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((a(d) * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f * a(d));
            case 6:
                double abs2 = 1.0d - Math.abs(((a(d) * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            default:
                return Math.sin(this.f * a(d));
        }
        return 1.0d - abs;
    }

    double c(double d) {
        if (d <= mto.a.GEO_NOT_SUPPORT) {
            d = 1.0E-5d;
        } else if (d >= 1.0d) {
            d = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.c, d);
        if (binarySearch <= 0 && binarySearch != 0) {
            int i = (-binarySearch) - 1;
            float[] fArr = this.b;
            int i2 = i - 1;
            double d2 = fArr[i] - fArr[i2];
            double[] dArr = this.c;
            double d3 = d2 / (dArr[i] - dArr[i2]);
            return (fArr[i2] - (d3 * dArr[i2])) + (d * d3);
        }
        return mto.a.GEO_NOT_SUPPORT;
    }

    public double d(double d) {
        double c;
        double signum;
        double c2;
        double c3;
        double sin;
        switch (this.e) {
            case 1:
                return mto.a.GEO_NOT_SUPPORT;
            case 2:
                c = c(d) * 4.0d;
                signum = Math.signum((((a(d) * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                return c * signum;
            case 3:
                c2 = c(d);
                return c2 * 2.0d;
            case 4:
                c2 = -c(d);
                return c2 * 2.0d;
            case 5:
                c3 = (-this.f) * c(d);
                sin = Math.sin(this.f * a(d));
                return c3 * sin;
            case 6:
                c = c(d) * 4.0d;
                signum = (((a(d) * 4.0d) + 2.0d) % 4.0d) - 2.0d;
                return c * signum;
            default:
                c3 = this.f * c(d);
                sin = Math.cos(this.f * a(d));
                return c3 * sin;
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.c) + " period=" + Arrays.toString(this.b);
    }
}
