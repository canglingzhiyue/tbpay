package android.support.constraint.solver;

import android.support.constraint.solver.SolverVariable;
import android.support.constraint.solver.widgets.ConstraintAnchor;
import android.support.constraint.solver.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class e {
    public static long A = 0;
    public static final boolean DEBUG = false;
    public static final boolean FULL_DEBUG = false;
    public static final boolean MEASURE = false;
    public static f g = null;
    private static int h = 1000;
    public static boolean q = false;
    public static boolean s = true;
    public static boolean t = true;
    public static boolean u = true;
    public static boolean v = true;
    public static boolean w = false;
    public static long z;
    android.support.constraint.solver.b[] b;
    public boolean c;
    int d;
    int e;
    final c f;
    private a j;
    private int l;
    private boolean[] m;
    private int n;
    private SolverVariable[] o;
    private int p;
    private a r;
    public boolean y;
    public boolean x = false;

    /* renamed from: a  reason: collision with root package name */
    int f1107a = 0;
    private HashMap<String, SolverVariable> i = null;
    private int k = 32;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface a {
        SolverVariable a(e eVar, boolean[] zArr);

        void a(a aVar);

        void d(SolverVariable solverVariable);

        boolean e();

        void f();

        SolverVariable g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends android.support.constraint.solver.b {
        public b(c cVar) {
            this.f = new h(this, cVar);
        }
    }

    public e() {
        int i = this.k;
        this.l = i;
        this.b = null;
        this.c = false;
        this.y = false;
        this.m = new boolean[i];
        this.d = 1;
        this.e = 0;
        this.n = i;
        this.o = new SolverVariable[h];
        this.p = 0;
        this.b = new android.support.constraint.solver.b[i];
        i();
        this.f = new c();
        this.j = new d(this.f);
        this.r = w ? new b(this.f) : new android.support.constraint.solver.b(this.f);
    }

    private final int a(a aVar, boolean z2) {
        f fVar = g;
        if (fVar != null) {
            fVar.h++;
        }
        for (int i = 0; i < this.d; i++) {
            this.m[i] = false;
        }
        boolean z3 = false;
        int i2 = 0;
        while (!z3) {
            f fVar2 = g;
            if (fVar2 != null) {
                fVar2.i++;
            }
            i2++;
            if (i2 >= this.d * 2) {
                return i2;
            }
            if (aVar.g() != null) {
                this.m[aVar.g().f1101a] = true;
            }
            SolverVariable a2 = aVar.a(this, this.m);
            if (a2 != null) {
                if (this.m[a2.f1101a]) {
                    return i2;
                }
                this.m[a2.f1101a] = true;
            }
            if (a2 != null) {
                int i3 = -1;
                float f = Float.MAX_VALUE;
                for (int i4 = 0; i4 < this.e; i4++) {
                    android.support.constraint.solver.b bVar = this.b[i4];
                    if (bVar.f1103a.f != SolverVariable.Type.UNRESTRICTED && !bVar.e && bVar.a(a2)) {
                        float b2 = bVar.f.b(a2);
                        if (b2 < 0.0f) {
                            float f2 = (-bVar.b) / b2;
                            if (f2 < f) {
                                i3 = i4;
                                f = f2;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    android.support.constraint.solver.b bVar2 = this.b[i3];
                    bVar2.f1103a.b = -1;
                    f fVar3 = g;
                    if (fVar3 != null) {
                        fVar3.j++;
                    }
                    bVar2.c(a2);
                    bVar2.f1103a.b = i3;
                    bVar2.f1103a.a(this, bVar2);
                }
            } else {
                z3 = true;
            }
        }
        return i2;
    }

    private SolverVariable a(SolverVariable.Type type, String str) {
        SolverVariable a2 = this.f.b.a();
        if (a2 == null) {
            a2 = new SolverVariable(type, str);
        } else {
            a2.b();
        }
        a2.a(type, str);
        int i = this.p;
        int i2 = h;
        if (i >= i2) {
            h = i2 << 1;
            this.o = (SolverVariable[]) Arrays.copyOf(this.o, h);
        }
        SolverVariable[] solverVariableArr = this.o;
        int i3 = this.p;
        this.p = i3 + 1;
        solverVariableArr[i3] = a2;
        return a2;
    }

    public static android.support.constraint.solver.b a(e eVar, SolverVariable solverVariable, SolverVariable solverVariable2, float f) {
        return eVar.c().a(solverVariable, solverVariable2, f);
    }

    public static f a() {
        return g;
    }

    private int b(a aVar) throws Exception {
        boolean z2;
        int i = 0;
        while (true) {
            if (i >= this.e) {
                z2 = false;
                break;
            } else if (this.b[i].f1103a.f != SolverVariable.Type.UNRESTRICTED && this.b[i].b < 0.0f) {
                z2 = true;
                break;
            } else {
                i++;
            }
        }
        if (z2) {
            boolean z3 = false;
            int i2 = 0;
            while (!z3) {
                f fVar = g;
                if (fVar != null) {
                    fVar.k++;
                }
                i2++;
                int i3 = -1;
                int i4 = -1;
                float f = Float.MAX_VALUE;
                int i5 = 0;
                for (int i6 = 0; i6 < this.e; i6++) {
                    android.support.constraint.solver.b bVar = this.b[i6];
                    if (bVar.f1103a.f != SolverVariable.Type.UNRESTRICTED && !bVar.e && bVar.b < 0.0f) {
                        int i7 = 9;
                        if (v) {
                            int c = bVar.f.c();
                            int i8 = i5;
                            float f2 = f;
                            int i9 = i4;
                            int i10 = i3;
                            int i11 = 0;
                            while (i11 < c) {
                                SolverVariable a2 = bVar.f.a(i11);
                                float b2 = bVar.f.b(a2);
                                if (b2 > 0.0f) {
                                    int i12 = i8;
                                    int i13 = 0;
                                    while (i13 < i7) {
                                        float f3 = a2.e[i13] / b2;
                                        if ((f3 < f2 && i13 == i12) || i13 > i12) {
                                            i10 = i6;
                                            i9 = a2.f1101a;
                                            f2 = f3;
                                            i12 = i13;
                                        }
                                        i13++;
                                        i7 = 9;
                                    }
                                    i8 = i12;
                                }
                                i11++;
                                i7 = 9;
                            }
                            i3 = i10;
                            i4 = i9;
                            f = f2;
                            i5 = i8;
                        } else {
                            for (int i14 = 1; i14 < this.d; i14++) {
                                SolverVariable solverVariable = this.f.c[i14];
                                float b3 = bVar.f.b(solverVariable);
                                if (b3 > 0.0f) {
                                    for (int i15 = 0; i15 < 9; i15++) {
                                        float f4 = solverVariable.e[i15] / b3;
                                        if ((f4 < f && i15 == i5) || i15 > i5) {
                                            i4 = i14;
                                            i3 = i6;
                                            i5 = i15;
                                            f = f4;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i3 != -1) {
                    android.support.constraint.solver.b bVar2 = this.b[i3];
                    bVar2.f1103a.b = -1;
                    f fVar2 = g;
                    if (fVar2 != null) {
                        fVar2.j++;
                    }
                    bVar2.c(this.f.c[i4]);
                    bVar2.f1103a.b = i3;
                    bVar2.f1103a.a(this, bVar2);
                } else {
                    z3 = true;
                }
                if (i2 > this.d / 2) {
                    z3 = true;
                }
            }
            return i2;
        }
        return 0;
    }

    private final void d(android.support.constraint.solver.b bVar) {
        int i;
        if (!t || !bVar.e) {
            this.b[this.e] = bVar;
            SolverVariable solverVariable = bVar.f1103a;
            int i2 = this.e;
            solverVariable.b = i2;
            this.e = i2 + 1;
            bVar.f1103a.a(this, bVar);
        } else {
            bVar.f1103a.a(this, bVar.b);
        }
        if (!t || !this.x) {
            return;
        }
        int i3 = 0;
        while (i3 < this.e) {
            if (this.b[i3] == null) {
                System.out.println("WTF");
            }
            android.support.constraint.solver.b[] bVarArr = this.b;
            if (bVarArr[i3] != null && bVarArr[i3].e) {
                android.support.constraint.solver.b bVar2 = this.b[i3];
                bVar2.f1103a.a(this, bVar2.b);
                (w ? this.f.d : this.f.f1104a).a(bVar2);
                this.b[i3] = null;
                int i4 = i3 + 1;
                int i5 = i4;
                while (true) {
                    i = this.e;
                    if (i4 >= i) {
                        break;
                    }
                    android.support.constraint.solver.b[] bVarArr2 = this.b;
                    int i6 = i4 - 1;
                    bVarArr2[i6] = bVarArr2[i4];
                    if (bVarArr2[i6].f1103a.b == i4) {
                        this.b[i6].f1103a.b = i6;
                    }
                    i5 = i4;
                    i4++;
                }
                if (i5 < i) {
                    this.b[i5] = null;
                }
                this.e--;
                i3--;
            }
            i3++;
        }
        this.x = false;
    }

    private void h() {
        this.k <<= 1;
        this.b = (android.support.constraint.solver.b[]) Arrays.copyOf(this.b, this.k);
        c cVar = this.f;
        cVar.c = (SolverVariable[]) Arrays.copyOf(cVar.c, this.k);
        int i = this.k;
        this.m = new boolean[i];
        this.l = i;
        this.n = i;
        f fVar = g;
        if (fVar != null) {
            fVar.d++;
            f fVar2 = g;
            fVar2.p = Math.max(fVar2.p, this.k);
            f fVar3 = g;
            fVar3.D = fVar3.p;
        }
    }

    private void i() {
        int i = 0;
        if (w) {
            while (i < this.e) {
                android.support.constraint.solver.b bVar = this.b[i];
                if (bVar != null) {
                    this.f.d.a(bVar);
                }
                this.b[i] = null;
                i++;
            }
            return;
        }
        while (i < this.e) {
            android.support.constraint.solver.b bVar2 = this.b[i];
            if (bVar2 != null) {
                this.f.f1104a.a(bVar2);
            }
            this.b[i] = null;
            i++;
        }
    }

    private void j() {
        for (int i = 0; i < this.e; i++) {
            android.support.constraint.solver.b bVar = this.b[i];
            bVar.f1103a.d = bVar.b;
        }
    }

    public SolverVariable a(int i, String str) {
        f fVar = g;
        if (fVar != null) {
            fVar.m++;
        }
        if (this.d + 1 >= this.l) {
            h();
        }
        SolverVariable a2 = a(SolverVariable.Type.ERROR, str);
        this.f1107a++;
        this.d++;
        a2.f1101a = this.f1107a;
        a2.c = i;
        this.f.c[this.f1107a] = a2;
        this.j.d(a2);
        return a2;
    }

    public SolverVariable a(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.d + 1 >= this.l) {
            h();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.b();
            if (solverVariable == null) {
                constraintAnchor.a(this.f);
                solverVariable = constraintAnchor.b();
            }
            if (solverVariable.f1101a == -1 || solverVariable.f1101a > this.f1107a || this.f.c[solverVariable.f1101a] == null) {
                if (solverVariable.f1101a != -1) {
                    solverVariable.b();
                }
                this.f1107a++;
                this.d++;
                solverVariable.f1101a = this.f1107a;
                solverVariable.f = SolverVariable.Type.UNRESTRICTED;
                this.f.c[this.f1107a] = solverVariable;
            }
        }
        return solverVariable;
    }

    public void a(SolverVariable solverVariable, int i) {
        if (s && solverVariable.b == -1) {
            float f = i;
            solverVariable.a(this, f);
            for (int i2 = 0; i2 < this.f1107a + 1; i2++) {
                SolverVariable solverVariable2 = this.f.c[i2];
                if (solverVariable2 != null && solverVariable2.s && solverVariable2.t == solverVariable.f1101a) {
                    solverVariable2.a(this, solverVariable2.u + f);
                }
            }
            return;
        }
        int i3 = solverVariable.b;
        if (solverVariable.b == -1) {
            android.support.constraint.solver.b c = c();
            c.a(solverVariable, i);
            a(c);
            return;
        }
        android.support.constraint.solver.b bVar = this.b[i3];
        if (!bVar.e) {
            if (bVar.f.c() != 0) {
                android.support.constraint.solver.b c2 = c();
                c2.b(solverVariable, i);
                a(c2);
                return;
            }
            bVar.e = true;
        }
        bVar.b = i;
    }

    public void a(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        android.support.constraint.solver.b c = c();
        c.a(solverVariable, solverVariable2, i, f, solverVariable3, solverVariable4, i2);
        if (i3 != 8) {
            c.a(this, i3);
        }
        a(c);
    }

    public void a(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        android.support.constraint.solver.b c = c();
        SolverVariable d = d();
        d.c = 0;
        c.a(solverVariable, solverVariable2, d, i);
        if (i2 != 8) {
            a(c, (int) (c.f.b(d) * (-1.0f)), i2);
        }
        a(c);
    }

    public void a(SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z2) {
        android.support.constraint.solver.b c = c();
        SolverVariable d = d();
        d.c = 0;
        c.a(solverVariable, solverVariable2, d, i);
        a(c);
    }

    public void a(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f, int i) {
        android.support.constraint.solver.b c = c();
        c.a(solverVariable, solverVariable2, solverVariable3, solverVariable4, f);
        if (i != 8) {
            c.a(this, i);
        }
        a(c);
    }

    public void a(android.support.constraint.solver.b bVar) {
        SolverVariable b2;
        if (bVar == null) {
            return;
        }
        f fVar = g;
        if (fVar != null) {
            fVar.f++;
            if (bVar.e) {
                g.g++;
            }
        }
        if (this.e + 1 >= this.n || this.d + 1 >= this.l) {
            h();
        }
        boolean z2 = false;
        if (!bVar.e) {
            bVar.c(this);
            if (bVar.e()) {
                return;
            }
            bVar.d();
            if (bVar.a(this)) {
                SolverVariable e = e();
                bVar.f1103a = e;
                int i = this.e;
                d(bVar);
                if (this.e == i + 1) {
                    this.r.a(bVar);
                    a(this.r, true);
                    if (e.b == -1) {
                        if (bVar.f1103a == e && (b2 = bVar.b(e)) != null) {
                            f fVar2 = g;
                            if (fVar2 != null) {
                                fVar2.j++;
                            }
                            bVar.c(b2);
                        }
                        if (!bVar.e) {
                            bVar.f1103a.a(this, bVar);
                        }
                        (w ? this.f.d : this.f.f1104a).a(bVar);
                        this.e--;
                    }
                    z2 = true;
                }
            }
            if (!bVar.a()) {
                return;
            }
        }
        if (z2) {
            return;
        }
        d(bVar);
    }

    void a(android.support.constraint.solver.b bVar, int i, int i2) {
        bVar.c(a(i2, (String) null), i);
    }

    void a(a aVar) throws Exception {
        f fVar = g;
        if (fVar != null) {
            fVar.t++;
            f fVar2 = g;
            fVar2.u = Math.max(fVar2.u, this.d);
            f fVar3 = g;
            fVar3.v = Math.max(fVar3.v, this.e);
        }
        b(aVar);
        a(aVar, false);
        j();
    }

    public void a(f fVar) {
        g = fVar;
    }

    public void a(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f, int i) {
        SolverVariable a2 = a(constraintWidget.a(ConstraintAnchor.Type.LEFT));
        SolverVariable a3 = a(constraintWidget.a(ConstraintAnchor.Type.TOP));
        SolverVariable a4 = a(constraintWidget.a(ConstraintAnchor.Type.RIGHT));
        SolverVariable a5 = a(constraintWidget.a(ConstraintAnchor.Type.BOTTOM));
        SolverVariable a6 = a(constraintWidget2.a(ConstraintAnchor.Type.LEFT));
        SolverVariable a7 = a(constraintWidget2.a(ConstraintAnchor.Type.TOP));
        SolverVariable a8 = a(constraintWidget2.a(ConstraintAnchor.Type.RIGHT));
        SolverVariable a9 = a(constraintWidget2.a(ConstraintAnchor.Type.BOTTOM));
        android.support.constraint.solver.b c = c();
        double d = f;
        double d2 = i;
        c.b(a3, a5, a7, a9, (float) (Math.sin(d) * d2));
        a(c);
        android.support.constraint.solver.b c2 = c();
        c2.b(a2, a4, a6, a8, (float) (Math.cos(d) * d2));
        a(c2);
    }

    public int b(Object obj) {
        SolverVariable b2 = ((ConstraintAnchor) obj).b();
        if (b2 != null) {
            return (int) (b2.d + 0.5f);
        }
        return 0;
    }

    public void b() {
        for (int i = 0; i < this.f.c.length; i++) {
            SolverVariable solverVariable = this.f.c[i];
            if (solverVariable != null) {
                solverVariable.b();
            }
        }
        this.f.b.a(this.o, this.p);
        this.p = 0;
        Arrays.fill(this.f.c, (Object) null);
        HashMap<String, SolverVariable> hashMap = this.i;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f1107a = 0;
        this.j.f();
        this.d = 1;
        for (int i2 = 0; i2 < this.e; i2++) {
            android.support.constraint.solver.b[] bVarArr = this.b;
            if (bVarArr[i2] != null) {
                bVarArr[i2].c = false;
            }
        }
        i();
        this.e = 0;
        this.r = w ? new b(this.f) : new android.support.constraint.solver.b(this.f);
    }

    public void b(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        android.support.constraint.solver.b c = c();
        SolverVariable d = d();
        d.c = 0;
        c.b(solverVariable, solverVariable2, d, i);
        if (i2 != 8) {
            a(c, (int) (c.f.b(d) * (-1.0f)), i2);
        }
        a(c);
    }

    public void b(SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z2) {
        android.support.constraint.solver.b c = c();
        SolverVariable d = d();
        d.c = 0;
        c.b(solverVariable, solverVariable2, d, i);
        a(c);
    }

    public android.support.constraint.solver.b c() {
        android.support.constraint.solver.b a2;
        if (w) {
            a2 = this.f.d.a();
            if (a2 == null) {
                a2 = new b(this.f);
                A++;
            }
            a2.c();
        } else {
            a2 = this.f.f1104a.a();
            if (a2 == null) {
                a2 = new android.support.constraint.solver.b(this.f);
                z++;
            }
            a2.c();
        }
        SolverVariable.a();
        return a2;
    }

    public android.support.constraint.solver.b c(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        if (s && i2 == 8 && solverVariable2.q && solverVariable.b == -1) {
            solverVariable.a(this, solverVariable2.d + i);
            return null;
        }
        android.support.constraint.solver.b c = c();
        c.a(solverVariable, solverVariable2, i);
        if (i2 != 8) {
            c.a(this, i2);
        }
        a(c);
        return c;
    }

    public SolverVariable d() {
        f fVar = g;
        if (fVar != null) {
            fVar.n++;
        }
        if (this.d + 1 >= this.l) {
            h();
        }
        SolverVariable a2 = a(SolverVariable.Type.SLACK, (String) null);
        this.f1107a++;
        this.d++;
        a2.f1101a = this.f1107a;
        this.f.c[this.f1107a] = a2;
        return a2;
    }

    public SolverVariable e() {
        f fVar = g;
        if (fVar != null) {
            fVar.o++;
        }
        if (this.d + 1 >= this.l) {
            h();
        }
        SolverVariable a2 = a(SolverVariable.Type.SLACK, (String) null);
        this.f1107a++;
        this.d++;
        a2.f1101a = this.f1107a;
        this.f.c[this.f1107a] = a2;
        return a2;
    }

    public void f() throws Exception {
        f fVar = g;
        if (fVar != null) {
            fVar.e++;
        }
        if (this.j.e()) {
            j();
            return;
        }
        if (this.c || this.y) {
            f fVar2 = g;
            if (fVar2 != null) {
                fVar2.r++;
            }
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i >= this.e) {
                    z2 = true;
                    break;
                } else if (!this.b[i].e) {
                    break;
                } else {
                    i++;
                }
            }
            if (z2) {
                f fVar3 = g;
                if (fVar3 != null) {
                    fVar3.q++;
                }
                j();
                return;
            }
        }
        a(this.j);
    }

    public c g() {
        return this.f;
    }
}
