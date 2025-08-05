package android.support.constraint.motion;

import android.os.Build;
import android.support.constraint.ConstraintAttribute;
import android.support.constraint.c;
import android.support.constraint.motion.r;
import android.support.constraint.solver.widgets.ConstraintWidget;
import android.util.Log;
import android.view.View;
import com.taobao.orange.model.NameSpaceDO;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import tb.iee;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class m implements Comparable<m> {
    public static final boolean DEBUG = false;
    public static final String TAG = "MotionPaths";
    static String[] d = {"position", "x", "y", "width", "height", "pathRotate"};
    private float A;
    int b;
    private iee u;
    private float w;
    private float x;
    private float y;
    private float z;
    private float i = 1.0f;

    /* renamed from: a  reason: collision with root package name */
    int f1089a = 0;
    private boolean j = false;
    private float k = 0.0f;
    private float l = 0.0f;
    private float m = 0.0f;
    public float c = 0.0f;
    private float n = 1.0f;
    private float o = 1.0f;
    private float p = Float.NaN;
    private float q = Float.NaN;
    private float r = 0.0f;
    private float s = 0.0f;
    private float t = 0.0f;
    private int v = 0;
    private float B = Float.NaN;
    private float C = Float.NaN;
    LinkedHashMap<String, ConstraintAttribute> e = new LinkedHashMap<>();
    int f = 0;
    double[] g = new double[18];
    double[] h = new double[18];

    private boolean a(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(m mVar) {
        return Float.compare(this.w, mVar.w);
    }

    void a(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.A = f4;
    }

    public void a(c.a aVar) {
        this.f1089a = aVar.f1058a.c;
        this.b = aVar.f1058a.b;
        this.i = (aVar.f1058a.b == 0 || this.f1089a != 0) ? aVar.f1058a.d : 0.0f;
        this.j = aVar.e.l;
        this.k = aVar.e.m;
        this.l = aVar.e.b;
        this.m = aVar.e.c;
        this.c = aVar.e.d;
        this.n = aVar.e.e;
        this.o = aVar.e.f;
        this.p = aVar.e.g;
        this.q = aVar.e.h;
        this.r = aVar.e.i;
        this.s = aVar.e.j;
        this.t = aVar.e.k;
        this.u = iee.a(aVar.b.c);
        this.B = aVar.b.g;
        this.v = aVar.b.e;
        this.C = aVar.f1058a.e;
        for (String str : aVar.f.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.f.get(str);
            if (constraintAttribute.a() != ConstraintAttribute.AttributeType.STRING_TYPE) {
                this.e.put(str, constraintAttribute);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(m mVar, HashSet<String> hashSet) {
        if (a(this.i, mVar.i)) {
            hashSet.add("alpha");
        }
        if (a(this.k, mVar.k)) {
            hashSet.add(Constants.Name.ELEVATION);
        }
        int i = this.b;
        int i2 = mVar.b;
        if (i != i2 && this.f1089a == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (a(this.l, mVar.l)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.B) || !Float.isNaN(mVar.B)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.C) || !Float.isNaN(mVar.C)) {
            hashSet.add("progress");
        }
        if (a(this.m, mVar.m)) {
            hashSet.add("rotationX");
        }
        if (a(this.c, mVar.c)) {
            hashSet.add("rotationY");
        }
        if (a(this.p, mVar.p)) {
            hashSet.add("transformPivotX");
        }
        if (a(this.q, mVar.q)) {
            hashSet.add("transformPivotY");
        }
        if (a(this.n, mVar.n)) {
            hashSet.add("scaleX");
        }
        if (a(this.o, mVar.o)) {
            hashSet.add("scaleY");
        }
        if (a(this.r, mVar.r)) {
            hashSet.add("translationX");
        }
        if (a(this.s, mVar.s)) {
            hashSet.add("translationY");
        }
        if (a(this.t, mVar.t)) {
            hashSet.add("translationZ");
        }
    }

    public void a(ConstraintWidget constraintWidget, android.support.constraint.c cVar, int i) {
        a(constraintWidget.o(), constraintWidget.p(), constraintWidget.q(), constraintWidget.s());
        a(cVar.a(i));
    }

    public void a(View view) {
        this.b = view.getVisibility();
        this.i = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.j = false;
        if (Build.VERSION.SDK_INT >= 21) {
            this.k = view.getElevation();
        }
        this.l = view.getRotation();
        this.m = view.getRotationX();
        this.c = view.getRotationY();
        this.n = view.getScaleX();
        this.o = view.getScaleY();
        this.p = view.getPivotX();
        this.q = view.getPivotY();
        this.r = view.getTranslationX();
        this.s = view.getTranslationY();
        if (Build.VERSION.SDK_INT >= 21) {
            this.t = view.getTranslationZ();
        }
    }

    public void a(HashMap<String, r> hashMap, int i) {
        String str;
        for (String str2 : hashMap.keySet()) {
            r rVar = hashMap.get(str2);
            char c = 65535;
            switch (str2.hashCode()) {
                case -1249320806:
                    if (str2.equals("rotationX")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str2.equals("rotationY")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str2.equals("translationX")) {
                        c = 11;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str2.equals("translationY")) {
                        c = '\f';
                        break;
                    }
                    break;
                case -1225497655:
                    if (str2.equals("translationZ")) {
                        c = '\r';
                        break;
                    }
                    break;
                case -1001078227:
                    if (str2.equals("progress")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -908189618:
                    if (str2.equals("scaleX")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -908189617:
                    if (str2.equals("scaleY")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -760884510:
                    if (str2.equals("transformPivotX")) {
                        c = 5;
                        break;
                    }
                    break;
                case -760884509:
                    if (str2.equals("transformPivotY")) {
                        c = 6;
                        break;
                    }
                    break;
                case -40300674:
                    if (str2.equals("rotation")) {
                        c = 2;
                        break;
                    }
                    break;
                case -4379043:
                    if (str2.equals(Constants.Name.ELEVATION)) {
                        c = 1;
                        break;
                    }
                    break;
                case 37232917:
                    if (str2.equals("transitionPathRotate")) {
                        c = 7;
                        break;
                    }
                    break;
                case 92909918:
                    if (str2.equals("alpha")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            float f = 1.0f;
            float f2 = 0.0f;
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.i)) {
                        f = this.i;
                    }
                    rVar.a(i, f);
                    break;
                case 1:
                    if (!Float.isNaN(this.k)) {
                        f2 = this.k;
                    }
                    rVar.a(i, f2);
                    break;
                case 2:
                    if (!Float.isNaN(this.l)) {
                        f2 = this.l;
                    }
                    rVar.a(i, f2);
                    break;
                case 3:
                    if (!Float.isNaN(this.m)) {
                        f2 = this.m;
                    }
                    rVar.a(i, f2);
                    break;
                case 4:
                    if (!Float.isNaN(this.c)) {
                        f2 = this.c;
                    }
                    rVar.a(i, f2);
                    break;
                case 5:
                    if (!Float.isNaN(this.p)) {
                        f2 = this.p;
                    }
                    rVar.a(i, f2);
                    break;
                case 6:
                    if (!Float.isNaN(this.q)) {
                        f2 = this.q;
                    }
                    rVar.a(i, f2);
                    break;
                case 7:
                    if (!Float.isNaN(this.B)) {
                        f2 = this.B;
                    }
                    rVar.a(i, f2);
                    break;
                case '\b':
                    if (!Float.isNaN(this.C)) {
                        f2 = this.C;
                    }
                    rVar.a(i, f2);
                    break;
                case '\t':
                    if (!Float.isNaN(this.n)) {
                        f = this.n;
                    }
                    rVar.a(i, f);
                    break;
                case '\n':
                    if (!Float.isNaN(this.o)) {
                        f = this.o;
                    }
                    rVar.a(i, f);
                    break;
                case 11:
                    if (!Float.isNaN(this.r)) {
                        f2 = this.r;
                    }
                    rVar.a(i, f2);
                    break;
                case '\f':
                    if (!Float.isNaN(this.s)) {
                        f2 = this.s;
                    }
                    rVar.a(i, f2);
                    break;
                case '\r':
                    if (!Float.isNaN(this.t)) {
                        f2 = this.t;
                    }
                    rVar.a(i, f2);
                    break;
                default:
                    if (str2.startsWith(NameSpaceDO.TYPE_CUSTOM)) {
                        String str3 = str2.split(",")[1];
                        if (this.e.containsKey(str3)) {
                            ConstraintAttribute constraintAttribute = this.e.get(str3);
                            if (rVar instanceof r.b) {
                                ((r.b) rVar).a(i, constraintAttribute);
                                break;
                            } else {
                                str = str2 + " splineSet not a CustomSet frame = " + i + ", value" + constraintAttribute.c() + rVar;
                            }
                        } else {
                            str = "UNKNOWN customName " + str3;
                        }
                    } else {
                        str = "UNKNOWN spline " + str2;
                    }
                    Log.e("MotionPaths", str);
                    break;
            }
        }
    }

    public void b(View view) {
        a(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        a(view);
    }
}
