package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.ConstraintWidget;
import android.support.constraint.solver.widgets.analyzer.b;

/* loaded from: classes2.dex */
public class j extends f {
    private int al = 0;
    private int am = 0;
    private int an = 0;
    private int ao = 0;
    private int ap = 0;
    private int aq = 0;
    private int ar = 0;
    private int as = 0;
    private boolean at = false;
    private int au = 0;
    private int av = 0;
    protected b.a c = new b.a();
    b.InterfaceC0007b ak = null;

    public void K(int i) {
        this.an = i;
        this.al = i;
        this.ao = i;
        this.am = i;
        this.ap = i;
        this.aq = i;
    }

    public int L() {
        return this.au;
    }

    public void L(int i) {
        this.ap = i;
        this.ar = i;
        this.as = i;
    }

    public int M() {
        return this.av;
    }

    public void M(int i) {
        this.aq = i;
    }

    public void N(int i) {
        this.an = i;
        this.ar = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean N() {
        b.InterfaceC0007b i = this.D != null ? ((e) this.D).i() : null;
        if (i == null) {
            return false;
        }
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= this.aj) {
                return true;
            }
            ConstraintWidget constraintWidget = this.ai[i2];
            if (constraintWidget != null && !(constraintWidget instanceof g)) {
                ConstraintWidget.DimensionBehaviour t = constraintWidget.t(0);
                ConstraintWidget.DimensionBehaviour t2 = constraintWidget.t(1);
                if (t != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.e == 1 || t2 != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.f == 1) {
                    z = false;
                }
                if (!z) {
                    if (t == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        t = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    if (t2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        t2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    b.a aVar = this.c;
                    aVar.d = t;
                    aVar.e = t2;
                    aVar.f = constraintWidget.q();
                    this.c.g = constraintWidget.s();
                    i.a(constraintWidget, this.c);
                    constraintWidget.j(this.c.h);
                    constraintWidget.k(this.c.i);
                    constraintWidget.q(this.c.j);
                }
            }
            i2++;
        }
    }

    public void O(int i) {
        this.al = i;
    }

    public void P(int i) {
        this.ao = i;
        this.as = i;
    }

    public void Q(int i) {
        this.am = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        while (this.ak == null && l() != null) {
            this.ak = ((e) l()).i();
        }
        b.a aVar = this.c;
        aVar.d = dimensionBehaviour;
        aVar.e = dimensionBehaviour2;
        aVar.f = i;
        aVar.g = i2;
        this.ak.a(constraintWidget, aVar);
        constraintWidget.j(this.c.h);
        constraintWidget.k(this.c.i);
        constraintWidget.c(this.c.k);
        constraintWidget.q(this.c.j);
    }

    @Override // android.support.constraint.solver.widgets.f, android.support.constraint.solver.widgets.h
    public void a(e eVar) {
        j();
    }

    public void a(boolean z) {
        if (this.ap > 0 || this.aq > 0) {
            if (z) {
                this.ar = this.aq;
                this.as = this.ap;
                return;
            }
            this.ar = this.ap;
            this.as = this.aq;
        }
    }

    public int b() {
        return this.al;
    }

    public void b(int i, int i2, int i3, int i4) {
    }

    public int c() {
        return this.am;
    }

    public int f() {
        return this.ar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(boolean z) {
        this.at = z;
    }

    public void g(int i, int i2) {
        this.au = i;
        this.av = i2;
    }

    public int h() {
        return this.as;
    }

    public boolean i() {
        return this.at;
    }

    public void j() {
        for (int i = 0; i < this.aj; i++) {
            ConstraintWidget constraintWidget = this.ai[i];
            if (constraintWidget != null) {
                constraintWidget.b(true);
            }
        }
    }
}
