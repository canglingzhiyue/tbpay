package android.support.constraint.motion;

import android.os.Build;
import android.support.constraint.ConstraintAttribute;
import android.util.Log;
import android.view.View;
import com.taobao.orange.model.NameSpaceDO;
import com.taobao.weex.common.Constants;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import tb.bxj;
import tb.iev;
import tb.mto;
import tb.riy;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    protected ConstraintAttribute f1081a;
    private bxj d;
    private c e;
    private String f;
    private int g = 0;
    public int b = 0;
    ArrayList<o> c = new ArrayList<>();

    /* loaded from: classes2.dex */
    static class a extends g {
        a() {
        }

        @Override // android.support.constraint.motion.g
        public void a(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    /* loaded from: classes2.dex */
    static class b extends g {
        float[] d = new float[1];

        b() {
        }

        @Override // android.support.constraint.motion.g
        public void a(View view, float f) {
            this.d[0] = a(f);
            this.f1081a.a(view, this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class c {
        float[] b;
        double[] c;
        float[] d;
        float[] e;
        float[] f;
        int g;
        bxj h;
        double[] i;
        double[] j;
        float k;
        private final int m;

        /* renamed from: a  reason: collision with root package name */
        iev f1083a = new iev();
        public HashMap<String, ConstraintAttribute> l = new HashMap<>();

        c(int i, int i2, int i3) {
            this.g = i;
            this.m = i2;
            this.f1083a.a(i);
            this.b = new float[i3];
            this.c = new double[i3];
            this.d = new float[i3];
            this.e = new float[i3];
            this.f = new float[i3];
        }

        public double a(float f) {
            bxj bxjVar = this.h;
            if (bxjVar != null) {
                bxjVar.a(f, this.i);
            } else {
                double[] dArr = this.i;
                dArr[0] = this.e[0];
                dArr[1] = this.b[0];
            }
            return this.i[0] + (this.f1083a.b(f) * this.i[1]);
        }

        public void a(int i, int i2, float f, float f2, float f3) {
            this.c[i] = i2 / 100.0d;
            this.d[i] = f;
            this.e[i] = f2;
            this.b[i] = f3;
        }

        public double b(float f) {
            bxj bxjVar = this.h;
            if (bxjVar != null) {
                double d = f;
                bxjVar.b(d, this.j);
                this.h.a(d, this.i);
            } else {
                double[] dArr = this.j;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
            }
            double d2 = f;
            double b = this.f1083a.b(d2);
            double d3 = this.f1083a.d(d2);
            double[] dArr2 = this.j;
            return dArr2[0] + (b * dArr2[1]) + (d3 * this.i[1]);
        }

        public void c(float f) {
            this.k = f;
            double[][] dArr = (double[][]) Array.newInstance(double.class, this.c.length, 2);
            float[] fArr = this.b;
            this.i = new double[fArr.length + 1];
            this.j = new double[fArr.length + 1];
            if (this.c[0] > mto.a.GEO_NOT_SUPPORT) {
                this.f1083a.a(mto.a.GEO_NOT_SUPPORT, this.d[0]);
            }
            double[] dArr2 = this.c;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f1083a.a(1.0d, this.d[length]);
            }
            for (int i = 0; i < dArr.length; i++) {
                dArr[i][0] = this.e[i];
                int i2 = 0;
                while (true) {
                    float[] fArr2 = this.b;
                    if (i2 < fArr2.length) {
                        dArr[i2][1] = fArr2[i2];
                        i2++;
                    }
                }
                this.f1083a.a(this.c[i], this.d[i]);
            }
            this.f1083a.a();
            double[] dArr3 = this.c;
            this.h = dArr3.length > 1 ? bxj.a(0, dArr3, dArr) : null;
        }
    }

    /* loaded from: classes2.dex */
    static class d extends g {
        d() {
        }

        @Override // android.support.constraint.motion.g
        public void a(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(a(f));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class e extends g {
        e() {
        }

        @Override // android.support.constraint.motion.g
        public void a(View view, float f) {
        }

        public void a(View view, float f, double d, double d2) {
            view.setRotation(a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* loaded from: classes2.dex */
    static class f extends g {
        boolean d = false;

        f() {
        }

        @Override // android.support.constraint.motion.g
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
                    Log.e("KeyCycleOscillator", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e("KeyCycleOscillator", "unable to setProgress", e2);
                }
            }
        }
    }

    /* renamed from: android.support.constraint.motion.g$g  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0004g extends g {
        C0004g() {
        }

        @Override // android.support.constraint.motion.g
        public void a(View view, float f) {
            view.setRotation(a(f));
        }
    }

    /* loaded from: classes2.dex */
    static class h extends g {
        h() {
        }

        @Override // android.support.constraint.motion.g
        public void a(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    /* loaded from: classes2.dex */
    static class i extends g {
        i() {
        }

        @Override // android.support.constraint.motion.g
        public void a(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    /* loaded from: classes2.dex */
    static class j extends g {
        j() {
        }

        @Override // android.support.constraint.motion.g
        public void a(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    /* loaded from: classes2.dex */
    static class k extends g {
        k() {
        }

        @Override // android.support.constraint.motion.g
        public void a(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    /* loaded from: classes2.dex */
    static class l extends g {
        l() {
        }

        @Override // android.support.constraint.motion.g
        public void a(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    /* loaded from: classes2.dex */
    static class m extends g {
        m() {
        }

        @Override // android.support.constraint.motion.g
        public void a(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    /* loaded from: classes2.dex */
    static class n extends g {
        n() {
        }

        @Override // android.support.constraint.motion.g
        public void a(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(a(f));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class o {

        /* renamed from: a  reason: collision with root package name */
        int f1084a;
        float b;
        float c;
        float d;

        public o(int i, float f, float f2, float f3) {
            this.f1084a = i;
            this.b = f3;
            this.c = f2;
            this.d = f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g b(String str) {
        if (str.startsWith(NameSpaceDO.TYPE_CUSTOM)) {
            return new b();
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c2 = 4;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c2 = '\n';
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c2 = 11;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c2 = '\f';
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c2 = '\r';
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c2 = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c2 = 7;
                    break;
                }
                break;
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c2 = '\t';
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c2 = 2;
                    break;
                }
                break;
            case -4379043:
                if (str.equals(Constants.Name.ELEVATION)) {
                    c2 = 1;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c2 = 5;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c2 = 0;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c2 = '\b';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return new a();
            case 1:
                return new d();
            case 2:
                return new C0004g();
            case 3:
                return new h();
            case 4:
                return new i();
            case 5:
                return new e();
            case 6:
                return new j();
            case 7:
                return new k();
            case '\b':
                return new a();
            case '\t':
                return new a();
            case '\n':
                return new l();
            case 11:
                return new m();
            case '\f':
                return new n();
            case '\r':
                return new f();
            default:
                return null;
        }
    }

    public float a(float f2) {
        return (float) this.e.a(f2);
    }

    public void a(int i2, int i3, int i4, float f2, float f3, float f4) {
        this.c.add(new o(i2, f2, f3, f4));
        if (i4 != -1) {
            this.b = i4;
        }
        this.g = i3;
    }

    public void a(int i2, int i3, int i4, float f2, float f3, float f4, ConstraintAttribute constraintAttribute) {
        this.c.add(new o(i2, f2, f3, f4));
        if (i4 != -1) {
            this.b = i4;
        }
        this.g = i3;
        this.f1081a = constraintAttribute;
    }

    public abstract void a(View view, float f2);

    public void a(String str) {
        this.f = str;
    }

    public boolean a() {
        return this.b == 1;
    }

    public float b(float f2) {
        return (float) this.e.b(f2);
    }

    public void c(float f2) {
        int size = this.c.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.c, new Comparator<o>() { // from class: android.support.constraint.motion.g.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(o oVar, o oVar2) {
                return Integer.compare(oVar.f1084a, oVar2.f1084a);
            }
        });
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, size, 2);
        this.e = new c(this.g, this.b, size);
        Iterator<o> it = this.c.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            o next = it.next();
            dArr[i2] = next.d * 0.01d;
            dArr2[i2][0] = next.b;
            dArr2[i2][1] = next.c;
            this.e.a(i2, next.f1084a, next.d, next.c, next.b);
            i2++;
        }
        this.e.c(f2);
        this.d = bxj.a(0, dArr, dArr2);
    }

    public String toString() {
        String str = this.f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<o> it = this.c.iterator();
        while (it.hasNext()) {
            o next = it.next();
            str = str + riy.ARRAY_START_STR + next.f1084a + " , " + decimalFormat.format(next.b) + "] ";
        }
        return str;
    }
}
