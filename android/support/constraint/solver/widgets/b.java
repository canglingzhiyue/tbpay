package android.support.constraint.solver.widgets;

import android.support.constraint.solver.SolverVariable;
import android.support.constraint.solver.widgets.ConstraintAnchor;
import android.support.constraint.solver.widgets.ConstraintWidget;
import java.util.HashMap;
import tb.riy;

/* loaded from: classes2.dex */
public class b extends f {
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int TOP = 2;
    private int ak = 0;
    private boolean am = true;
    private int al = 0;
    boolean c = false;

    public void a(int i) {
        this.ak = i;
    }

    @Override // android.support.constraint.solver.widgets.ConstraintWidget
    public void a(android.support.constraint.solver.e eVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        this.A[0] = this.s;
        this.A[2] = this.t;
        this.A[1] = this.u;
        this.A[3] = this.v;
        for (int i3 = 0; i3 < this.A.length; i3++) {
            this.A[i3].f = eVar.a(this.A[i3]);
        }
        int i4 = this.ak;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor = this.A[this.ak];
        if (!this.c) {
            j();
        }
        if (this.c) {
            this.c = false;
            int i5 = this.ak;
            if (i5 == 0 || i5 == 1) {
                eVar.a(this.s.f, this.I);
                eVar.a(this.u.f, this.I);
                return;
            } else if (i5 != 2 && i5 != 3) {
                return;
            } else {
                eVar.a(this.t.f, this.J);
                eVar.a(this.v.f, this.J);
                return;
            }
        }
        for (int i6 = 0; i6 < this.aj; i6++) {
            ConstraintWidget constraintWidget = this.ai[i6];
            if ((this.am || constraintWidget.a()) && ((((i = this.ak) == 0 || i == 1) && constraintWidget.G() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.s.c != null && constraintWidget.u.c != null) || (((i2 = this.ak) == 2 || i2 == 3) && constraintWidget.H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.t.c != null && constraintWidget.v.c != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.s.h() || this.u.h();
        boolean z4 = this.t.h() || this.v.h();
        boolean z5 = !z2 && ((this.ak == 0 && z3) || ((this.ak == 2 && z4) || ((this.ak == 1 && z3) || (this.ak == 3 && z4))));
        int i7 = 5;
        if (!z5) {
            i7 = 4;
        }
        for (int i8 = 0; i8 < this.aj; i8++) {
            ConstraintWidget constraintWidget2 = this.ai[i8];
            if (this.am || constraintWidget2.a()) {
                SolverVariable a2 = eVar.a(constraintWidget2.A[this.ak]);
                constraintWidget2.A[this.ak].f = a2;
                int i9 = (constraintWidget2.A[this.ak].c == null || constraintWidget2.A[this.ak].c.f1111a != this) ? 0 : constraintWidget2.A[this.ak].d + 0;
                int i10 = this.ak;
                if (i10 == 0 || i10 == 2) {
                    eVar.b(constraintAnchor.f, a2, this.al - i9, z2);
                } else {
                    eVar.a(constraintAnchor.f, a2, this.al + i9, z2);
                }
                eVar.c(constraintAnchor.f, a2, this.al + i9, i7);
            }
        }
        int i11 = this.ak;
        if (i11 == 0) {
            eVar.c(this.u.f, this.s.f, 0, 8);
            eVar.c(this.s.f, this.D.u.f, 0, 4);
            eVar.c(this.s.f, this.D.s.f, 0, 0);
        } else if (i11 == 1) {
            eVar.c(this.s.f, this.u.f, 0, 8);
            eVar.c(this.s.f, this.D.s.f, 0, 4);
            eVar.c(this.s.f, this.D.u.f, 0, 0);
        } else if (i11 == 2) {
            eVar.c(this.v.f, this.t.f, 0, 8);
            eVar.c(this.t.f, this.D.v.f, 0, 4);
            eVar.c(this.t.f, this.D.t.f, 0, 0);
        } else if (i11 == 3) {
            eVar.c(this.t.f, this.v.f, 0, 8);
            eVar.c(this.t.f, this.D.t.f, 0, 4);
            eVar.c(this.t.f, this.D.v.f, 0, 0);
        }
    }

    @Override // android.support.constraint.solver.widgets.f, android.support.constraint.solver.widgets.ConstraintWidget
    public void a(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.a(constraintWidget, hashMap);
        b bVar = (b) constraintWidget;
        this.ak = bVar.ak;
        this.am = bVar.am;
        this.al = bVar.al;
    }

    public void a(boolean z) {
        this.am = z;
    }

    @Override // android.support.constraint.solver.widgets.ConstraintWidget
    public boolean a() {
        return true;
    }

    public void b(int i) {
        this.al = i;
    }

    public boolean b() {
        return this.am;
    }

    public int c() {
        return this.ak;
    }

    @Override // android.support.constraint.solver.widgets.ConstraintWidget
    public boolean d() {
        return this.c;
    }

    @Override // android.support.constraint.solver.widgets.ConstraintWidget
    public boolean e() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        for (int i = 0; i < this.aj; i++) {
            ConstraintWidget constraintWidget = this.ai[i];
            int i2 = this.ak;
            if (i2 == 0 || i2 == 1) {
                constraintWidget.a(0, true);
            } else if (i2 == 2 || i2 == 3) {
                constraintWidget.a(1, true);
            }
        }
    }

    public int h() {
        return this.al;
    }

    public int i() {
        int i = this.ak;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public boolean j() {
        ConstraintAnchor.Type type;
        ConstraintAnchor.Type type2;
        ConstraintAnchor.Type type3;
        int i;
        int i2;
        boolean z = true;
        for (int i3 = 0; i3 < this.aj; i3++) {
            ConstraintWidget constraintWidget = this.ai[i3];
            if ((this.am || constraintWidget.a()) && ((((i = this.ak) == 0 || i == 1) && !constraintWidget.d()) || (((i2 = this.ak) == 2 || i2 == 3) && !constraintWidget.e()))) {
                z = false;
            }
        }
        if (!z || this.aj <= 0) {
            return false;
        }
        int i4 = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.aj; i5++) {
            ConstraintWidget constraintWidget2 = this.ai[i5];
            if (this.am || constraintWidget2.a()) {
                if (!z2) {
                    int i6 = this.ak;
                    if (i6 == 0) {
                        type3 = ConstraintAnchor.Type.LEFT;
                    } else if (i6 == 1) {
                        type3 = ConstraintAnchor.Type.RIGHT;
                    } else if (i6 == 2) {
                        type3 = ConstraintAnchor.Type.TOP;
                    } else {
                        if (i6 == 3) {
                            type3 = ConstraintAnchor.Type.BOTTOM;
                        }
                        z2 = true;
                    }
                    i4 = constraintWidget2.a(type3).l();
                    z2 = true;
                }
                int i7 = this.ak;
                if (i7 == 0) {
                    type2 = ConstraintAnchor.Type.LEFT;
                } else {
                    if (i7 == 1) {
                        type = ConstraintAnchor.Type.RIGHT;
                    } else if (i7 == 2) {
                        type2 = ConstraintAnchor.Type.TOP;
                    } else if (i7 == 3) {
                        type = ConstraintAnchor.Type.BOTTOM;
                    }
                    i4 = Math.max(i4, constraintWidget2.a(type).l());
                }
                i4 = Math.min(i4, constraintWidget2.a(type2).l());
            }
        }
        int i8 = i4 + this.al;
        int i9 = this.ak;
        if (i9 == 0 || i9 == 1) {
            b(i8, i8);
        } else {
            e(i8, i8);
        }
        this.c = true;
        return true;
    }

    @Override // android.support.constraint.solver.widgets.ConstraintWidget
    public String toString() {
        String str = "[Barrier] " + n() + " {";
        for (int i = 0; i < this.aj; i++) {
            ConstraintWidget constraintWidget = this.ai[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + constraintWidget.n();
        }
        return str + riy.BLOCK_END_STR;
    }
}
