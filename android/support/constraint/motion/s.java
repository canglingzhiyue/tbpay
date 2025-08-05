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
import tb.bxj;
import tb.mto;
import tb.riy;

/* loaded from: classes2.dex */
public abstract class s {
    private static float k = 6.2831855f;

    /* renamed from: a  reason: collision with root package name */
    protected bxj f1097a;
    long f;
    private int h;
    private String i;
    protected int b = 0;
    protected int[] c = new int[10];
    protected float[][] d = (float[][]) Array.newInstance(float.class, 10, 3);
    private float[] j = new float[3];
    protected boolean e = false;
    float g = Float.NaN;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a extends s {
        a() {
        }

        @Override // android.support.constraint.motion.s
        public boolean a(View view, float f, long j, android.support.constraint.motion.e eVar) {
            view.setAlpha(a(f, j, view, eVar));
            return this.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b extends s {
        String h;
        SparseArray<ConstraintAttribute> i;
        SparseArray<float[]> j = new SparseArray<>();
        float[] k;
        float[] l;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.h = str.split(",")[1];
            this.i = sparseArray;
        }

        @Override // android.support.constraint.motion.s
        public void a(int i) {
            int size = this.i.size();
            int b = this.i.valueAt(0).b();
            double[] dArr = new double[size];
            int i2 = b + 2;
            this.k = new float[i2];
            this.l = new float[b];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.i.keyAt(i3);
                float[] valueAt = this.j.valueAt(i3);
                dArr[i3] = keyAt * 0.01d;
                this.i.valueAt(i3).a(this.k);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.k;
                    if (i4 < fArr.length) {
                        dArr2[i3][i4] = fArr[i4];
                        i4++;
                    }
                }
                dArr2[i3][b] = valueAt[0];
                dArr2[i3][b + 1] = valueAt[1];
            }
            this.f1097a = bxj.a(i, dArr, dArr2);
        }

        @Override // android.support.constraint.motion.s
        public void a(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public void a(int i, ConstraintAttribute constraintAttribute, float f, int i2, float f2) {
            this.i.append(i, constraintAttribute);
            this.j.append(i, new float[]{f, f2});
            this.b = Math.max(this.b, i2);
        }

        @Override // android.support.constraint.motion.s
        public boolean a(View view, float f, long j, android.support.constraint.motion.e eVar) {
            this.f1097a.a(f, this.k);
            float[] fArr = this.k;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.f;
            if (Float.isNaN(this.g)) {
                this.g = eVar.a(view, this.h, 0);
                if (Float.isNaN(this.g)) {
                    this.g = 0.0f;
                }
            }
            this.g = (float) ((this.g + ((j2 * 1.0E-9d) * f2)) % 1.0d);
            this.f = j;
            float a2 = a(this.g);
            this.e = false;
            for (int i = 0; i < this.l.length; i++) {
                this.e |= ((double) this.k[i]) != mto.a.GEO_NOT_SUPPORT;
                this.l[i] = (this.k[i] * a2) + f3;
            }
            this.i.valueAt(0).a(view, this.l);
            if (f2 != 0.0f) {
                this.e = true;
            }
            return this.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class c extends s {
        c() {
        }

        @Override // android.support.constraint.motion.s
        public boolean a(View view, float f, long j, android.support.constraint.motion.e eVar) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(a(f, j, view, eVar));
            }
            return this.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class d extends s {
        d() {
        }

        @Override // android.support.constraint.motion.s
        public boolean a(View view, float f, long j, android.support.constraint.motion.e eVar) {
            return this.e;
        }

        public boolean a(View view, android.support.constraint.motion.e eVar, float f, long j, double d, double d2) {
            view.setRotation(a(f, j, view, eVar) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class e extends s {
        boolean h = false;

        e() {
        }

        @Override // android.support.constraint.motion.s
        public boolean a(View view, float f, long j, android.support.constraint.motion.e eVar) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f, j, view, eVar));
            } else if (this.h) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.h = true;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, Float.valueOf(a(f, j, view, eVar)));
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        Log.e("SplineSet", "unable to setProgress", e);
                    }
                }
            }
            return this.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class f extends s {
        f() {
        }

        @Override // android.support.constraint.motion.s
        public boolean a(View view, float f, long j, android.support.constraint.motion.e eVar) {
            view.setRotation(a(f, j, view, eVar));
            return this.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class g extends s {
        g() {
        }

        @Override // android.support.constraint.motion.s
        public boolean a(View view, float f, long j, android.support.constraint.motion.e eVar) {
            view.setRotationX(a(f, j, view, eVar));
            return this.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class h extends s {
        h() {
        }

        @Override // android.support.constraint.motion.s
        public boolean a(View view, float f, long j, android.support.constraint.motion.e eVar) {
            view.setRotationY(a(f, j, view, eVar));
            return this.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class i extends s {
        i() {
        }

        @Override // android.support.constraint.motion.s
        public boolean a(View view, float f, long j, android.support.constraint.motion.e eVar) {
            view.setScaleX(a(f, j, view, eVar));
            return this.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class j extends s {
        j() {
        }

        @Override // android.support.constraint.motion.s
        public boolean a(View view, float f, long j, android.support.constraint.motion.e eVar) {
            view.setScaleY(a(f, j, view, eVar));
            return this.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class k {
        static void a(int[] iArr, float[][] fArr, int i, int i2) {
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

        private static int b(int[] iArr, float[][] fArr, int i, int i2) {
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

        private static void c(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class l extends s {
        l() {
        }

        @Override // android.support.constraint.motion.s
        public boolean a(View view, float f, long j, android.support.constraint.motion.e eVar) {
            view.setTranslationX(a(f, j, view, eVar));
            return this.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class m extends s {
        m() {
        }

        @Override // android.support.constraint.motion.s
        public boolean a(View view, float f, long j, android.support.constraint.motion.e eVar) {
            view.setTranslationY(a(f, j, view, eVar));
            return this.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class n extends s {
        n() {
        }

        @Override // android.support.constraint.motion.s
        public boolean a(View view, float f, long j, android.support.constraint.motion.e eVar) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(a(f, j, view, eVar));
            }
            return this.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static s a(String str, long j2) {
        char c2;
        s aVar;
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
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c2 = 7;
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
                    c2 = 5;
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
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                aVar = new a();
                break;
            case 1:
                aVar = new c();
                break;
            case 2:
                aVar = new f();
                break;
            case 3:
                aVar = new g();
                break;
            case 4:
                aVar = new h();
                break;
            case 5:
                aVar = new d();
                break;
            case 6:
                aVar = new i();
                break;
            case 7:
                aVar = new j();
                break;
            case '\b':
                aVar = new l();
                break;
            case '\t':
                aVar = new m();
                break;
            case '\n':
                aVar = new n();
                break;
            case 11:
                aVar = new e();
                break;
            default:
                return null;
        }
        aVar.a(j2);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s a(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new b(str, sparseArray);
    }

    protected float a(float f2) {
        float abs;
        switch (this.b) {
            case 1:
                return Math.signum(f2 * k);
            case 2:
                abs = Math.abs(f2);
                break;
            case 3:
                return (((f2 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f2 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f2 * k);
            case 6:
                float abs2 = 1.0f - Math.abs(((f2 * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f2 * k);
        }
        return 1.0f - abs;
    }

    public float a(float f2, long j2, View view, android.support.constraint.motion.e eVar) {
        this.f1097a.a(f2, this.j);
        float[] fArr = this.j;
        float f3 = fArr[1];
        boolean z = false;
        int i2 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        if (i2 == 0) {
            this.e = false;
            return fArr[2];
        }
        if (Float.isNaN(this.g)) {
            this.g = eVar.a(view, this.i, 0);
            if (Float.isNaN(this.g)) {
                this.g = 0.0f;
            }
        }
        this.g = (float) ((this.g + (((j2 - this.f) * 1.0E-9d) * f3)) % 1.0d);
        eVar.a(view, this.i, 0, this.g);
        this.f = j2;
        float f4 = this.j[0];
        float a2 = (a(this.g) * f4) + this.j[2];
        if (f4 != 0.0f || i2 != 0) {
            z = true;
        }
        this.e = z;
        return a2;
    }

    public void a(int i2) {
        int i3 = this.h;
        if (i3 == 0) {
            Log.e("SplineSet", "Error no points added to " + this.i);
            return;
        }
        k.a(this.c, this.d, 0, i3 - 1);
        int i4 = 1;
        int i5 = 0;
        while (true) {
            int[] iArr = this.c;
            if (i4 >= iArr.length) {
                break;
            }
            if (iArr[i4] != iArr[i4 - 1]) {
                i5++;
            }
            i4++;
        }
        if (i5 == 0) {
            i5 = 1;
        }
        double[] dArr = new double[i5];
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, i5, 3);
        int i6 = 0;
        for (int i7 = 0; i7 < this.h; i7++) {
            if (i7 > 0) {
                int[] iArr2 = this.c;
                if (iArr2[i7] == iArr2[i7 - 1]) {
                }
            }
            dArr[i6] = this.c[i7] * 0.01d;
            double[] dArr3 = dArr2[i6];
            float[][] fArr = this.d;
            dArr3[0] = fArr[i7][0];
            dArr2[i6][1] = fArr[i7][1];
            dArr2[i6][2] = fArr[i7][2];
            i6++;
        }
        this.f1097a = bxj.a(i2, dArr, dArr2);
    }

    public void a(int i2, float f2, float f3, int i3, float f4) {
        int[] iArr = this.c;
        int i4 = this.h;
        iArr[i4] = i2;
        float[][] fArr = this.d;
        fArr[i4][0] = f2;
        fArr[i4][1] = f3;
        fArr[i4][2] = f4;
        this.b = Math.max(this.b, i3);
        this.h++;
    }

    protected void a(long j2) {
        this.f = j2;
    }

    public void a(String str) {
        this.i = str;
    }

    public abstract boolean a(View view, float f2, long j2, android.support.constraint.motion.e eVar);

    public String toString() {
        String str = this.i;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i2 = 0; i2 < this.h; i2++) {
            str = str + riy.ARRAY_START_STR + this.c[i2] + " , " + decimalFormat.format(this.d[i2]) + "] ";
        }
        return str;
    }
}
