package tb;

import tb.mto;

/* loaded from: classes2.dex */
public abstract class bxj {
    public static final int CONSTANT = 2;
    public static final int LINEAR = 1;
    public static final int SPLINE = 0;

    /* loaded from: classes2.dex */
    static class a extends bxj {

        /* renamed from: a  reason: collision with root package name */
        double f26160a;
        double[] b;

        a(double d, double[] dArr) {
            this.f26160a = d;
            this.b = dArr;
        }

        @Override // tb.bxj
        public double a(double d, int i) {
            return this.b[i];
        }

        @Override // tb.bxj
        public void a(double d, double[] dArr) {
            double[] dArr2 = this.b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // tb.bxj
        public void a(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.b;
                if (i < dArr.length) {
                    fArr[i] = (float) dArr[i];
                    i++;
                } else {
                    return;
                }
            }
        }

        @Override // tb.bxj
        public double[] a() {
            return new double[]{this.f26160a};
        }

        @Override // tb.bxj
        public double b(double d, int i) {
            return mto.a.GEO_NOT_SUPPORT;
        }

        @Override // tb.bxj
        public void b(double d, double[] dArr) {
            for (int i = 0; i < this.b.length; i++) {
                dArr[i] = 0.0d;
            }
        }
    }

    public static bxj a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        return i != 0 ? i != 2 ? new iem(dArr, dArr2) : new a(dArr[0], dArr2[0]) : new ieo(dArr, dArr2);
    }

    public static bxj a(int[] iArr, double[] dArr, double[][] dArr2) {
        return new bsv(iArr, dArr, dArr2);
    }

    public abstract double a(double d, int i);

    public abstract void a(double d, double[] dArr);

    public abstract void a(double d, float[] fArr);

    public abstract double[] a();

    public abstract double b(double d, int i);

    public abstract void b(double d, double[] dArr);
}
