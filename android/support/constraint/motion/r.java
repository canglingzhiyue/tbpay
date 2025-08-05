package android.support.constraint.motion;

import android.os.Build;
import android.support.constraint.ConstraintAttribute;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.taobao.weex.common.Constants;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Arrays;
import tb.bxj;
import tb.riy;

/* loaded from: classes2.dex */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    protected bxj f1096a;
    protected int[] b = new int[10];
    protected float[] c = new float[10];
    private int d;
    private String e;

    /* loaded from: classes2.dex */
    static class a extends r {
        a() {
        }

        @Override // android.support.constraint.motion.r
        public void a(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    /* loaded from: classes2.dex */
    static class b extends r {
        String d;
        SparseArray<ConstraintAttribute> e;
        float[] f;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.d = str.split(",")[1];
            this.e = sparseArray;
        }

        @Override // android.support.constraint.motion.r
        public void a(int i) {
            int size = this.e.size();
            int b = this.e.valueAt(0).b();
            double[] dArr = new double[size];
            this.f = new float[b];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, size, b);
            for (int i2 = 0; i2 < size; i2++) {
                dArr[i2] = this.e.keyAt(i2) * 0.01d;
                this.e.valueAt(i2).a(this.f);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f;
                    if (i3 < fArr.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.f1096a = bxj.a(i, dArr, dArr2);
        }

        @Override // android.support.constraint.motion.r
        public void a(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void a(int i, ConstraintAttribute constraintAttribute) {
            this.e.append(i, constraintAttribute);
        }

        @Override // android.support.constraint.motion.r
        public void a(View view, float f) {
            this.f1096a.a(f, this.f);
            this.e.valueAt(0).a(view, this.f);
        }
    }

    /* loaded from: classes2.dex */
    static class c extends r {
        c() {
        }

        @Override // android.support.constraint.motion.r
        public void a(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(a(f));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class d extends r {
        d() {
        }

        @Override // android.support.constraint.motion.r
        public void a(View view, float f) {
        }

        public void a(View view, float f, double d, double d2) {
            view.setRotation(a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* loaded from: classes2.dex */
    static class e extends r {
        e() {
        }

        @Override // android.support.constraint.motion.r
        public void a(View view, float f) {
            view.setPivotX(a(f));
        }
    }

    /* loaded from: classes2.dex */
    static class f extends r {
        f() {
        }

        @Override // android.support.constraint.motion.r
        public void a(View view, float f) {
            view.setPivotY(a(f));
        }
    }

    /* loaded from: classes2.dex */
    static class g extends r {
        boolean d = false;

        g() {
        }

        @Override // android.support.constraint.motion.r
        public void a(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f));
            } else if (this.d) {
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.d = true;
                }
                if (method == null) {
                    return;
                }
                try {
                    method.invoke(view, Float.valueOf(a(f)));
                } catch (IllegalAccessException e) {
                    Log.e("SplineSet", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e("SplineSet", "unable to setProgress", e2);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class h extends r {
        h() {
        }

        @Override // android.support.constraint.motion.r
        public void a(View view, float f) {
            view.setRotation(a(f));
        }
    }

    /* loaded from: classes2.dex */
    static class i extends r {
        i() {
        }

        @Override // android.support.constraint.motion.r
        public void a(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    /* loaded from: classes2.dex */
    static class j extends r {
        j() {
        }

        @Override // android.support.constraint.motion.r
        public void a(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    /* loaded from: classes2.dex */
    static class k extends r {
        k() {
        }

        @Override // android.support.constraint.motion.r
        public void a(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    /* loaded from: classes2.dex */
    static class l extends r {
        l() {
        }

        @Override // android.support.constraint.motion.r
        public void a(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    /* loaded from: classes2.dex */
    private static class m {
        static void a(int[] iArr, float[] fArr, int i, int i2) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int b = b(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = b - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = b + 1;
                }
            }
        }

        private static int b(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            c(iArr, fArr, i4, i2);
            return i4;
        }

        private static void c(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    /* loaded from: classes2.dex */
    static class n extends r {
        n() {
        }

        @Override // android.support.constraint.motion.r
        public void a(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    /* loaded from: classes2.dex */
    static class o extends r {
        o() {
        }

        @Override // android.support.constraint.motion.r
        public void a(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    /* loaded from: classes2.dex */
    static class p extends r {
        p() {
        }

        @Override // android.support.constraint.motion.r
        public void a(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(a(f));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r a(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new b(str, sparseArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static r b(String str) {
        char c2;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -4379043:
                if (str.equals(Constants.Name.ELEVATION)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return new a();
            case 1:
                return new c();
            case 2:
                return new h();
            case 3:
                return new i();
            case 4:
                return new j();
            case 5:
                return new e();
            case 6:
                return new f();
            case 7:
                return new d();
            case '\b':
                return new k();
            case '\t':
                return new l();
            case '\n':
                return new a();
            case 11:
                return new a();
            case '\f':
                return new n();
            case '\r':
                return new o();
            case 14:
                return new p();
            case 15:
                return new g();
            default:
                return null;
        }
    }

    public float a(float f2) {
        return (float) this.f1096a.a(f2, 0);
    }

    public void a(int i2) {
        int i3 = this.d;
        if (i3 == 0) {
            return;
        }
        m.a(this.b, this.c, 0, i3 - 1);
        int i4 = 1;
        for (int i5 = 1; i5 < this.d; i5++) {
            int[] iArr = this.b;
            if (iArr[i5 - 1] != iArr[i5]) {
                i4++;
            }
        }
        double[] dArr = new double[i4];
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, i4, 1);
        int i6 = 0;
        for (int i7 = 0; i7 < this.d; i7++) {
            if (i7 > 0) {
                int[] iArr2 = this.b;
                if (iArr2[i7] == iArr2[i7 - 1]) {
                }
            }
            dArr[i6] = this.b[i7] * 0.01d;
            dArr2[i6][0] = this.c[i7];
            i6++;
        }
        this.f1096a = bxj.a(i2, dArr, dArr2);
    }

    public void a(int i2, float f2) {
        int[] iArr = this.b;
        if (iArr.length < this.d + 1) {
            this.b = Arrays.copyOf(iArr, iArr.length << 1);
            float[] fArr = this.c;
            this.c = Arrays.copyOf(fArr, fArr.length << 1);
        }
        int[] iArr2 = this.b;
        int i3 = this.d;
        iArr2[i3] = i2;
        this.c[i3] = f2;
        this.d = i3 + 1;
    }

    public abstract void a(View view, float f2);

    public void a(String str) {
        this.e = str;
    }

    public float b(float f2) {
        return (float) this.f1096a.b(f2, 0);
    }

    public String toString() {
        String str = this.e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i2 = 0; i2 < this.d; i2++) {
            str = str + riy.ARRAY_START_STR + this.b[i2] + " , " + decimalFormat.format(this.c[i2]) + "] ";
        }
        return str;
    }
}
