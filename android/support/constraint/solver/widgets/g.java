package android.support.constraint.solver.widgets;

import android.support.constraint.solver.SolverVariable;
import android.support.constraint.solver.widgets.ConstraintAnchor;
import android.support.constraint.solver.widgets.ConstraintWidget;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class g extends ConstraintWidget {
    public static final int HORIZONTAL = 0;
    public static final int RELATIVE_BEGIN = 1;
    public static final int RELATIVE_END = 2;
    public static final int RELATIVE_PERCENT = 0;
    public static final int RELATIVE_UNKNWON = -1;
    public static final int VERTICAL = 1;
    protected float ai = -1.0f;
    protected int aj = -1;
    protected int ak = -1;
    private ConstraintAnchor al = this.t;
    private int am = 0;
    private int ao = 0;
    private boolean c;

    public g() {
        this.B.clear();
        this.B.add(this.al);
        int length = this.A.length;
        for (int i = 0; i < length; i++) {
            this.A[i] = this.al;
        }
    }

    @Override // android.support.constraint.solver.widgets.ConstraintWidget
    public ConstraintAnchor a(ConstraintAnchor.Type type) {
        switch (type) {
            case LEFT:
            case RIGHT:
                if (this.am == 1) {
                    return this.al;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.am == 0) {
                    return this.al;
                }
                break;
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return null;
        }
        throw new AssertionError(type.name());
    }

    public void a(int i) {
        if (this.am == i) {
            return;
        }
        this.am = i;
        this.B.clear();
        this.al = this.am == 1 ? this.s : this.t;
        this.B.add(this.al);
        int length = this.A.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.A[i2] = this.al;
        }
    }

    @Override // android.support.constraint.solver.widgets.ConstraintWidget
    public void a(android.support.constraint.solver.e eVar, boolean z) {
        e eVar2 = (e) l();
        if (eVar2 == null) {
            return;
        }
        ConstraintAnchor a2 = eVar2.a(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor a3 = eVar2.a(ConstraintAnchor.Type.RIGHT);
        boolean z2 = this.D != null && this.D.C[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (this.am == 0) {
            a2 = eVar2.a(ConstraintAnchor.Type.TOP);
            a3 = eVar2.a(ConstraintAnchor.Type.BOTTOM);
            z2 = this.D != null && this.D.C[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        if (this.c && this.al.n()) {
            SolverVariable a4 = eVar.a(this.al);
            eVar.a(a4, this.al.l());
            if (this.aj != -1) {
                if (z2) {
                    eVar.a(eVar.a(a3), a4, 0, 5);
                }
            } else if (this.ak != -1 && z2) {
                SolverVariable a5 = eVar.a(a3);
                eVar.a(a4, eVar.a(a2), 0, 5);
                eVar.a(a5, a4, 0, 5);
            }
            this.c = false;
        } else if (this.aj != -1) {
            SolverVariable a6 = eVar.a(this.al);
            eVar.c(a6, eVar.a(a2), this.aj, 8);
            if (!z2) {
                return;
            }
            eVar.a(eVar.a(a3), a6, 0, 5);
        } else if (this.ak == -1) {
            if (this.ai == -1.0f) {
                return;
            }
            eVar.a(android.support.constraint.solver.e.a(eVar, eVar.a(this.al), eVar.a(a3), this.ai));
        } else {
            SolverVariable a7 = eVar.a(this.al);
            SolverVariable a8 = eVar.a(a3);
            eVar.c(a7, a8, -this.ak, 8);
            if (!z2) {
                return;
            }
            eVar.a(a7, eVar.a(a2), 0, 5);
            eVar.a(a8, a7, 0, 5);
        }
    }

    @Override // android.support.constraint.solver.widgets.ConstraintWidget
    public void a(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.a(constraintWidget, hashMap);
        g gVar = (g) constraintWidget;
        this.ai = gVar.ai;
        this.aj = gVar.aj;
        this.ak = gVar.ak;
        a(gVar.am);
    }

    @Override // android.support.constraint.solver.widgets.ConstraintWidget
    public boolean a() {
        return true;
    }

    public int b() {
        return this.am;
    }

    public void b(int i) {
        this.al.a(i);
        this.c = true;
    }

    @Override // android.support.constraint.solver.widgets.ConstraintWidget
    public void b(android.support.constraint.solver.e eVar, boolean z) {
        if (l() == null) {
            return;
        }
        int b = eVar.b(this.al);
        if (this.am == 1) {
            h(b);
            i(0);
            k(l().s());
            j(0);
            return;
        }
        h(0);
        i(b);
        j(l().q());
        k(0);
    }

    public ConstraintAnchor c() {
        return this.al;
    }

    @Override // android.support.constraint.solver.widgets.ConstraintWidget
    public boolean d() {
        return this.c;
    }

    public void e(float f) {
        if (f > -1.0f) {
            this.ai = f;
            this.aj = -1;
            this.ak = -1;
        }
    }

    @Override // android.support.constraint.solver.widgets.ConstraintWidget
    public boolean e() {
        return this.c;
    }

    public float f() {
        return this.ai;
    }

    public int h() {
        return this.aj;
    }

    public int i() {
        return this.ak;
    }

    public void u(int i) {
        if (i >= 0) {
            this.ai = -1.0f;
            this.aj = i;
            this.ak = -1;
        }
    }

    public void v(int i) {
        if (i >= 0) {
            this.ai = -1.0f;
            this.aj = -1;
            this.ak = i;
        }
    }
}
