package tb;

import java.util.Arrays;
import tb.mto;

/* loaded from: classes2.dex */
class bsv extends bxj {
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;

    /* renamed from: a  reason: collision with root package name */
    a[] f26113a;
    private final double[] b;

    /* loaded from: classes2.dex */
    private static class a {
        private static double[] s = new double[91];

        /* renamed from: a  reason: collision with root package name */
        double[] f26114a;
        double b;
        double c;
        double d;
        double e;
        double f;
        double g;
        double h;
        double i;
        double j;
        double k;
        double l;
        double m;
        double n;
        double o;
        double p;
        boolean q;
        boolean r;

        a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            boolean z = false;
            this.r = false;
            this.q = i == 1 ? true : z;
            this.c = d;
            this.d = d2;
            this.i = 1.0d / (this.d - this.c);
            if (3 == i) {
                this.r = true;
            }
            double d7 = d5 - d3;
            double d8 = d6 - d4;
            if (!this.r && Math.abs(d7) >= 0.001d && Math.abs(d8) >= 0.001d) {
                this.f26114a = new double[101];
                this.j = d7 * (this.q ? -1 : 1);
                this.k = d8 * (this.q ? 1 : -1);
                this.l = this.q ? d5 : d3;
                this.m = this.q ? d4 : d6;
                a(d3, d4, d5, d6);
                this.n = this.b * this.i;
                return;
            }
            this.r = true;
            this.e = d3;
            this.f = d5;
            this.g = d4;
            this.h = d6;
            this.b = Math.hypot(d8, d7);
            this.n = this.b * this.i;
            double d9 = this.d;
            double d10 = this.c;
            this.l = d7 / (d9 - d10);
            this.m = d8 / (d9 - d10);
        }

        private void a(double d, double d2, double d3, double d4) {
            double[] dArr;
            double[] dArr2;
            double d5;
            double d6 = d3 - d;
            double d7 = d2 - d4;
            int i = 0;
            double d8 = mto.a.GEO_NOT_SUPPORT;
            double d9 = mto.a.GEO_NOT_SUPPORT;
            double d10 = mto.a.GEO_NOT_SUPPORT;
            while (true) {
                if (i >= s.length) {
                    break;
                }
                double d11 = d8;
                double radians = Math.toRadians((i * 90.0d) / (dArr.length - 1));
                double sin = Math.sin(radians) * d6;
                double cos = Math.cos(radians) * d7;
                if (i > 0) {
                    d5 = d11 + Math.hypot(sin - d9, cos - d10);
                    s[i] = d5;
                } else {
                    d5 = d11;
                }
                i++;
                d10 = cos;
                d8 = d5;
                d9 = sin;
            }
            double d12 = d8;
            this.b = d12;
            int i2 = 0;
            while (true) {
                double[] dArr3 = s;
                if (i2 >= dArr3.length) {
                    break;
                }
                dArr3[i2] = dArr3[i2] / d12;
                i2++;
            }
            int i3 = 0;
            while (true) {
                if (i3 < this.f26114a.length) {
                    double length = i3 / (dArr2.length - 1);
                    int binarySearch = Arrays.binarySearch(s, length);
                    if (binarySearch >= 0) {
                        this.f26114a[i3] = binarySearch / (s.length - 1);
                    } else if (binarySearch == -1) {
                        this.f26114a[i3] = 0.0d;
                    } else {
                        int i4 = -binarySearch;
                        int i5 = i4 - 2;
                        double[] dArr4 = s;
                        this.f26114a[i3] = (i5 + ((length - dArr4[i5]) / (dArr4[i4 - 1] - dArr4[i5]))) / (dArr4.length - 1);
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }

        double a() {
            return this.l + (this.j * this.o);
        }

        void a(double d) {
            double f = f((this.q ? this.d - d : d - this.c) * this.i) * 1.5707963267948966d;
            this.o = Math.sin(f);
            this.p = Math.cos(f);
        }

        double b() {
            return this.m + (this.k * this.p);
        }

        public double b(double d) {
            double d2 = (d - this.c) * this.i;
            double d3 = this.e;
            return d3 + (d2 * (this.f - d3));
        }

        double c() {
            double d = this.j * this.p;
            double hypot = this.n / Math.hypot(d, (-this.k) * this.o);
            return this.q ? (-d) * hypot : d * hypot;
        }

        public double c(double d) {
            double d2 = (d - this.c) * this.i;
            double d3 = this.g;
            return d3 + (d2 * (this.h - d3));
        }

        double d() {
            double d = this.j * this.p;
            double d2 = (-this.k) * this.o;
            double hypot = this.n / Math.hypot(d, d2);
            return this.q ? (-d2) * hypot : d2 * hypot;
        }

        public double d(double d) {
            return this.l;
        }

        public double e(double d) {
            return this.m;
        }

        double f(double d) {
            if (d <= mto.a.GEO_NOT_SUPPORT) {
                return mto.a.GEO_NOT_SUPPORT;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f26114a;
            double length = d * (dArr.length - 1);
            int i = (int) length;
            return dArr[i] + ((length - i) * (dArr[i + 1] - dArr[i]));
        }
    }

    public bsv(int[] iArr, double[] dArr, double[][] dArr2) {
        this.b = dArr;
        this.f26113a = new a[dArr.length - 1];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (i < this.f26113a.length) {
            int i4 = iArr[i];
            int i5 = 2;
            if (i4 == 0) {
                i5 = 3;
            } else if (i4 == 1) {
                i2 = 1;
                i5 = 1;
            } else if (i4 == 2) {
                i2 = 2;
            } else if (i4 != 3) {
                i5 = i3;
            } else {
                i5 = i2 != 1 ? 1 : i5;
                i2 = i5;
            }
            int i6 = i + 1;
            this.f26113a[i] = new a(i5, dArr[i], dArr[i6], dArr2[i][0], dArr2[i][1], dArr2[i6][0], dArr2[i6][1]);
            i = i6;
            i3 = i5;
        }
    }

    @Override // tb.bxj
    public double a(double d, int i) {
        int i2 = 0;
        if (d < this.f26113a[0].c) {
            d = this.f26113a[0].c;
        } else {
            a[] aVarArr = this.f26113a;
            if (d > aVarArr[aVarArr.length - 1].d) {
                a[] aVarArr2 = this.f26113a;
                d = aVarArr2[aVarArr2.length - 1].d;
            }
        }
        while (true) {
            a[] aVarArr3 = this.f26113a;
            if (i2 < aVarArr3.length) {
                if (d <= aVarArr3[i2].d) {
                    if (this.f26113a[i2].r) {
                        return i == 0 ? this.f26113a[i2].b(d) : this.f26113a[i2].c(d);
                    }
                    this.f26113a[i2].a(d);
                    return i == 0 ? this.f26113a[i2].a() : this.f26113a[i2].b();
                }
                i2++;
            } else {
                return Double.NaN;
            }
        }
    }

    @Override // tb.bxj
    public void a(double d, double[] dArr) {
        if (d < this.f26113a[0].c) {
            d = this.f26113a[0].c;
        }
        a[] aVarArr = this.f26113a;
        if (d > aVarArr[aVarArr.length - 1].d) {
            a[] aVarArr2 = this.f26113a;
            d = aVarArr2[aVarArr2.length - 1].d;
        }
        int i = 0;
        while (true) {
            a[] aVarArr3 = this.f26113a;
            if (i < aVarArr3.length) {
                if (d <= aVarArr3[i].d) {
                    if (this.f26113a[i].r) {
                        dArr[0] = this.f26113a[i].b(d);
                        dArr[1] = this.f26113a[i].c(d);
                        return;
                    }
                    this.f26113a[i].a(d);
                    dArr[0] = this.f26113a[i].a();
                    dArr[1] = this.f26113a[i].b();
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // tb.bxj
    public void a(double d, float[] fArr) {
        if (d < this.f26113a[0].c) {
            d = this.f26113a[0].c;
        } else {
            a[] aVarArr = this.f26113a;
            if (d > aVarArr[aVarArr.length - 1].d) {
                a[] aVarArr2 = this.f26113a;
                d = aVarArr2[aVarArr2.length - 1].d;
            }
        }
        int i = 0;
        while (true) {
            a[] aVarArr3 = this.f26113a;
            if (i < aVarArr3.length) {
                if (d <= aVarArr3[i].d) {
                    if (this.f26113a[i].r) {
                        fArr[0] = (float) this.f26113a[i].b(d);
                        fArr[1] = (float) this.f26113a[i].c(d);
                        return;
                    }
                    this.f26113a[i].a(d);
                    fArr[0] = (float) this.f26113a[i].a();
                    fArr[1] = (float) this.f26113a[i].b();
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // tb.bxj
    public double[] a() {
        return this.b;
    }

    @Override // tb.bxj
    public double b(double d, int i) {
        int i2 = 0;
        if (d < this.f26113a[0].c) {
            d = this.f26113a[0].c;
        }
        a[] aVarArr = this.f26113a;
        if (d > aVarArr[aVarArr.length - 1].d) {
            a[] aVarArr2 = this.f26113a;
            d = aVarArr2[aVarArr2.length - 1].d;
        }
        while (true) {
            a[] aVarArr3 = this.f26113a;
            if (i2 < aVarArr3.length) {
                if (d <= aVarArr3[i2].d) {
                    if (this.f26113a[i2].r) {
                        return i == 0 ? this.f26113a[i2].d(d) : this.f26113a[i2].e(d);
                    }
                    this.f26113a[i2].a(d);
                    return i == 0 ? this.f26113a[i2].c() : this.f26113a[i2].d();
                }
                i2++;
            } else {
                return Double.NaN;
            }
        }
    }

    @Override // tb.bxj
    public void b(double d, double[] dArr) {
        if (d < this.f26113a[0].c) {
            d = this.f26113a[0].c;
        } else {
            a[] aVarArr = this.f26113a;
            if (d > aVarArr[aVarArr.length - 1].d) {
                a[] aVarArr2 = this.f26113a;
                d = aVarArr2[aVarArr2.length - 1].d;
            }
        }
        int i = 0;
        while (true) {
            a[] aVarArr3 = this.f26113a;
            if (i < aVarArr3.length) {
                if (d <= aVarArr3[i].d) {
                    if (this.f26113a[i].r) {
                        dArr[0] = this.f26113a[i].d(d);
                        dArr[1] = this.f26113a[i].e(d);
                        return;
                    }
                    this.f26113a[i].a(d);
                    dArr[0] = this.f26113a[i].c();
                    dArr[1] = this.f26113a[i].d();
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }
}
