package android.support.constraint.solver.widgets;

import android.support.constraint.solver.SolverVariable;
import android.support.constraint.solver.widgets.ConstraintWidget;
import android.support.constraint.solver.widgets.analyzer.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class e extends o {
    static int aV;
    public android.support.constraint.solver.f aT;
    int aj;
    int ak;
    int al;
    int am;
    android.support.constraint.solver.widgets.analyzer.b c = new android.support.constraint.solver.widgets.analyzer.b(this);
    public android.support.constraint.solver.widgets.analyzer.e ar = new android.support.constraint.solver.widgets.analyzer.e(this);
    protected b.InterfaceC0007b aS = null;
    private boolean aA = false;
    protected android.support.constraint.solver.e ai = new android.support.constraint.solver.e();
    public int an = 0;
    public int ao = 0;
    d[] ap = new d[4];
    d[] aq = new d[4];
    public boolean as = false;
    public boolean at = false;
    public boolean au = false;
    public int av = 0;
    public int aw = 0;
    private int aC = 257;
    public boolean ax = false;
    private boolean aD = false;
    private boolean aE = false;
    int ay = 0;
    private WeakReference<ConstraintAnchor> aW = null;
    private WeakReference<ConstraintAnchor> aX = null;
    private WeakReference<ConstraintAnchor> aY = null;
    private WeakReference<ConstraintAnchor> aZ = null;
    public b.a aU = new b.a();

    private void V() {
        this.an = 0;
        this.ao = 0;
    }

    private void a(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.ai.a(this.ai.a(constraintAnchor), solverVariable, 0, 5);
    }

    public static boolean a(ConstraintWidget constraintWidget, b.InterfaceC0007b interfaceC0007b, b.a aVar, int i) {
        int i2;
        int i3;
        if (interfaceC0007b == null) {
            return false;
        }
        aVar.d = constraintWidget.G();
        aVar.e = constraintWidget.H();
        aVar.f = constraintWidget.q();
        aVar.g = constraintWidget.s();
        aVar.l = false;
        aVar.m = i;
        boolean z = aVar.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z2 = aVar.e == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z3 = z && constraintWidget.G > 0.0f;
        boolean z4 = z2 && constraintWidget.G > 0.0f;
        if (z && constraintWidget.x(0) && constraintWidget.e == 0 && !z3) {
            aVar.d = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z2 && constraintWidget.f == 0) {
                aVar.d = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z = false;
        }
        if (z2 && constraintWidget.x(1) && constraintWidget.f == 0 && !z4) {
            aVar.e = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z && constraintWidget.e == 0) {
                aVar.e = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z2 = false;
        }
        if (constraintWidget.d()) {
            aVar.d = ConstraintWidget.DimensionBehaviour.FIXED;
            z = false;
        }
        if (constraintWidget.e()) {
            aVar.e = ConstraintWidget.DimensionBehaviour.FIXED;
            z2 = false;
        }
        if (z3) {
            if (constraintWidget.g[0] == 4) {
                aVar.d = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z2) {
                if (aVar.e == ConstraintWidget.DimensionBehaviour.FIXED) {
                    i3 = aVar.g;
                } else {
                    aVar.d = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    interfaceC0007b.a(constraintWidget, aVar);
                    i3 = aVar.i;
                }
                aVar.d = ConstraintWidget.DimensionBehaviour.FIXED;
                aVar.f = (int) ((constraintWidget.H == 0 || constraintWidget.H == -1) ? constraintWidget.Z() * i3 : constraintWidget.Z() / i3);
            }
        }
        if (z4) {
            if (constraintWidget.g[1] == 4) {
                aVar.e = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z) {
                if (aVar.d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    i2 = aVar.f;
                } else {
                    aVar.e = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    interfaceC0007b.a(constraintWidget, aVar);
                    i2 = aVar.h;
                }
                aVar.e = ConstraintWidget.DimensionBehaviour.FIXED;
                aVar.g = (int) ((constraintWidget.H == 0 || constraintWidget.H == -1) ? i2 / constraintWidget.Z() : i2 * constraintWidget.Z());
            }
        }
        interfaceC0007b.a(constraintWidget, aVar);
        constraintWidget.j(aVar.h);
        constraintWidget.k(aVar.i);
        constraintWidget.c(aVar.k);
        constraintWidget.q(aVar.j);
        aVar.m = b.a.f1119a;
        return aVar.l;
    }

    private void b(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.ai.a(solverVariable, this.ai.a(constraintAnchor), 0, 5);
    }

    private void d(ConstraintWidget constraintWidget) {
        int i = this.an + 1;
        d[] dVarArr = this.aq;
        if (i >= dVarArr.length) {
            this.aq = (d[]) Arrays.copyOf(dVarArr, dVarArr.length << 1);
        }
        this.aq[this.an] = new d(constraintWidget, 0, M());
        this.an++;
    }

    private void e(ConstraintWidget constraintWidget) {
        int i = this.ao + 1;
        d[] dVarArr = this.ap;
        if (i >= dVarArr.length) {
            this.ap = (d[]) Arrays.copyOf(dVarArr, dVarArr.length << 1);
        }
        this.ap[this.ao] = new d(constraintWidget, 1, M());
        this.ao++;
    }

    public boolean K() {
        return this.aD;
    }

    public boolean L() {
        return this.aE;
    }

    public boolean M() {
        return this.aA;
    }

    /* JADX WARN: Type inference failed for: r8v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // android.support.constraint.solver.widgets.o
    public void N() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        ?? r8;
        this.I = 0;
        this.J = 0;
        this.aD = false;
        this.aE = false;
        int size = this.az.size();
        int max = Math.max(0, q());
        int max2 = Math.max(0, s());
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.C[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.C[0];
        android.support.constraint.solver.f fVar = this.aT;
        if (fVar != null) {
            fVar.C++;
        }
        if (i.a(this.aC, 1)) {
            android.support.constraint.solver.widgets.analyzer.g.a(this, i());
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget = this.az.get(i3);
                if (constraintWidget.x() && !(constraintWidget instanceof g) && !(constraintWidget instanceof b) && !(constraintWidget instanceof j) && !constraintWidget.t()) {
                    if (!(constraintWidget.t(0) == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.e != 1 && constraintWidget.t(1) == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f != 1)) {
                        a(constraintWidget, this.aS, new b.a(), b.a.f1119a);
                    }
                }
            }
        }
        if (size <= 2 || (!(dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || !i.a(this.aC, 1024) || !android.support.constraint.solver.widgets.analyzer.h.a(this, i()))) {
            i = max2;
            i2 = max;
            z = false;
        } else {
            if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                if (max >= q() || max <= 0) {
                    max = q();
                } else {
                    j(max);
                    this.aD = true;
                }
            }
            if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                if (max2 >= s() || max2 <= 0) {
                    max2 = s();
                } else {
                    k(max2);
                    this.aE = true;
                }
            }
            i = max2;
            i2 = max;
            z = true;
        }
        boolean z4 = u(64) || u(128);
        android.support.constraint.solver.e eVar = this.ai;
        eVar.c = false;
        eVar.y = false;
        if (this.aC != 0 && z4) {
            eVar.y = true;
        }
        ArrayList<ConstraintWidget> arrayList = this.az;
        boolean z5 = G() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || H() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        V();
        for (int i4 = 0; i4 < size; i4++) {
            ConstraintWidget constraintWidget2 = this.az.get(i4);
            if (constraintWidget2 instanceof o) {
                ((o) constraintWidget2).N();
            }
        }
        boolean u = u(64);
        boolean z6 = z;
        int i5 = 0;
        boolean z7 = true;
        while (z7) {
            int i6 = i5 + 1;
            try {
                this.ai.b();
                V();
                b(this.ai);
                for (int i7 = 0; i7 < size; i7++) {
                    this.az.get(i7).b(this.ai);
                }
                z7 = d(this.ai);
                if (this.aW != null && this.aW.get() != null) {
                    a(this.aW.get(), this.ai.a(this.t));
                    this.aW = null;
                }
                if (this.aY != null && this.aY.get() != null) {
                    b(this.aY.get(), this.ai.a(this.v));
                    this.aY = null;
                }
                if (this.aX != null && this.aX.get() != null) {
                    a(this.aX.get(), this.ai.a(this.s));
                    this.aX = null;
                }
                if (this.aZ != null && this.aZ.get() != null) {
                    b(this.aZ.get(), this.ai.a(this.u));
                    this.aZ = null;
                }
                if (z7) {
                    this.ai.f();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("EXCEPTION : " + e);
            }
            if (z7) {
                a(this.ai, i.f1132a);
            } else {
                b(this.ai, u);
                for (int i8 = 0; i8 < size; i8++) {
                    this.az.get(i8).b(this.ai, u);
                }
            }
            if (!z5 || i6 >= 8 || !i.f1132a[2]) {
                z2 = z6;
                z3 = false;
            } else {
                int i9 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    ConstraintWidget constraintWidget3 = this.az.get(i11);
                    i9 = Math.max(i9, constraintWidget3.I + constraintWidget3.q());
                    i10 = Math.max(i10, constraintWidget3.J + constraintWidget3.s());
                }
                int max3 = Math.max(this.P, i9);
                int max4 = Math.max(this.Q, i10);
                if (dimensionBehaviour2 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || q() >= max3) {
                    z3 = false;
                } else {
                    j(max3);
                    this.C[0] = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    z3 = true;
                    z6 = true;
                }
                if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || s() >= max4) {
                    z2 = z6;
                } else {
                    k(max4);
                    this.C[1] = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    z3 = true;
                    z2 = true;
                }
            }
            int max5 = Math.max(this.P, q());
            if (max5 > q()) {
                j(max5);
                this.C[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                z3 = true;
                z2 = true;
            }
            int max6 = Math.max(this.Q, s());
            if (max6 > s()) {
                k(max6);
                r8 = 1;
                this.C[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                z3 = true;
                z2 = true;
            } else {
                r8 = 1;
            }
            if (!z2) {
                if (this.C[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && i2 > 0 && q() > i2) {
                    this.aD = r8;
                    this.C[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                    j(i2);
                    z3 = true;
                    z2 = true;
                }
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.C;
                byte b = r8 == true ? 1 : 0;
                byte b2 = r8 == true ? 1 : 0;
                if (dimensionBehaviourArr[b] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && i > 0 && s() > i) {
                    this.aE = r8;
                    this.C[r8] = ConstraintWidget.DimensionBehaviour.FIXED;
                    k(i);
                    z7 = true;
                    z6 = true;
                    i5 = i6;
                }
            }
            z7 = z3;
            z6 = z2;
            i5 = i6;
        }
        this.az = arrayList;
        if (z6) {
            this.C[0] = dimensionBehaviour2;
            this.C[1] = dimensionBehaviour;
        }
        a(this.ai.g());
    }

    public boolean S() {
        return false;
    }

    public long a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.aj = i8;
        this.ak = i9;
        return this.c.a(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    public void a(int i) {
        this.aC = i;
        android.support.constraint.solver.e.q = u(512);
    }

    public void a(android.support.constraint.solver.e eVar, boolean[] zArr) {
        zArr[2] = false;
        boolean u = u(64);
        b(eVar, u);
        int size = this.az.size();
        for (int i = 0; i < size; i++) {
            this.az.get(i).b(eVar, u);
        }
    }

    public void a(android.support.constraint.solver.f fVar) {
        this.aT = fVar;
        this.ai.a(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.aW;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.l() > this.aW.get().l()) {
            this.aW = new WeakReference<>(constraintAnchor);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            d(constraintWidget);
        } else if (i != 1) {
        } else {
            e(constraintWidget);
        }
    }

    public void a(b.InterfaceC0007b interfaceC0007b) {
        this.aS = interfaceC0007b;
        this.ar.a(interfaceC0007b);
    }

    public void a(boolean z) {
        this.aA = z;
    }

    @Override // android.support.constraint.solver.widgets.ConstraintWidget
    public void a(boolean z, boolean z2) {
        super.a(z, z2);
        int size = this.az.size();
        for (int i = 0; i < size; i++) {
            this.az.get(i).a(z, z2);
        }
    }

    public boolean a(boolean z, int i) {
        return this.ar.a(z, i);
    }

    public int b() {
        return this.aC;
    }

    public void b(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.aX;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.l() > this.aX.get().l()) {
            this.aX = new WeakReference<>(constraintAnchor);
        }
    }

    public void c() {
        this.ar.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.aY;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.l() > this.aY.get().l()) {
            this.aY = new WeakReference<>(constraintAnchor);
        }
    }

    public void d(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.aZ;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.l() > this.aZ.get().l()) {
            this.aZ = new WeakReference<>(constraintAnchor);
        }
    }

    public boolean d(android.support.constraint.solver.e eVar) {
        boolean u = u(64);
        a(eVar, u);
        int size = this.az.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.az.get(i);
            constraintWidget.a(0, false);
            constraintWidget.a(1, false);
            if (constraintWidget instanceof b) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget2 = this.az.get(i2);
                if (constraintWidget2 instanceof b) {
                    ((b) constraintWidget2).f();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            ConstraintWidget constraintWidget3 = this.az.get(i3);
            if (constraintWidget3.ad()) {
                constraintWidget3.a(eVar, u);
            }
        }
        if (android.support.constraint.solver.e.q) {
            HashSet<ConstraintWidget> hashSet = new HashSet<>();
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget constraintWidget4 = this.az.get(i4);
                if (!constraintWidget4.ad()) {
                    hashSet.add(constraintWidget4);
                }
            }
            a(this, eVar, hashSet, G() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            Iterator<ConstraintWidget> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                i.a(this, eVar, next);
                next.a(eVar, u);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                ConstraintWidget constraintWidget5 = this.az.get(i5);
                if (constraintWidget5 instanceof e) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget5.C[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget5.C[1];
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget5.a(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget5.b(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget5.a(eVar, u);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget5.a(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget5.b(dimensionBehaviour2);
                    }
                } else {
                    i.a(this, eVar, constraintWidget5);
                    if (!constraintWidget5.ad()) {
                        constraintWidget5.a(eVar, u);
                    }
                }
            }
        }
        if (this.an > 0) {
            c.a(this, eVar, null, 0);
        }
        if (this.ao > 0) {
            c.a(this, eVar, null, 1);
        }
        return true;
    }

    public void f() {
        this.ar.c();
    }

    public boolean f(boolean z) {
        return this.ar.a(z);
    }

    @Override // android.support.constraint.solver.widgets.o, android.support.constraint.solver.widgets.ConstraintWidget
    public void g() {
        this.ai.b();
        this.aj = 0;
        this.al = 0;
        this.ak = 0;
        this.am = 0;
        this.ax = false;
        super.g();
    }

    public boolean g(boolean z) {
        return this.ar.b(z);
    }

    public void h() {
        this.c.a(this);
    }

    public b.InterfaceC0007b i() {
        return this.aS;
    }

    public android.support.constraint.solver.e j() {
        return this.ai;
    }

    public boolean u(int i) {
        return (this.aC & i) == i;
    }
}
