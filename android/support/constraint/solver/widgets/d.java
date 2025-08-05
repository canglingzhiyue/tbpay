package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    protected ConstraintWidget f1130a;
    protected ConstraintWidget b;
    protected ConstraintWidget c;
    protected ConstraintWidget d;
    protected ConstraintWidget e;
    protected ConstraintWidget f;
    protected ConstraintWidget g;
    protected ArrayList<ConstraintWidget> h;
    protected int i;
    protected int j;
    protected float k = 0.0f;
    protected boolean l;
    protected boolean m;
    protected boolean n;
    private int o;
    private boolean p;
    private boolean q;
    int r;
    int s;
    int t;
    boolean u;
    protected boolean v;

    public d(ConstraintWidget constraintWidget, int i, boolean z) {
        this.p = false;
        this.f1130a = constraintWidget;
        this.o = i;
        this.p = z;
    }

    private static boolean a(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget.m() == 8 || constraintWidget.C[i] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            return false;
        }
        return constraintWidget.g[i] == 0 || constraintWidget.g[i] == 3;
    }

    private void b() {
        boolean z = true;
        int i = this.o << 1;
        ConstraintWidget constraintWidget = this.f1130a;
        this.u = true;
        ConstraintWidget constraintWidget2 = constraintWidget;
        ConstraintWidget constraintWidget3 = constraintWidget2;
        boolean z2 = false;
        while (!z2) {
            this.i++;
            ConstraintWidget constraintWidget4 = null;
            constraintWidget2.af[this.o] = null;
            constraintWidget2.ae[this.o] = null;
            if (constraintWidget2.m() != 8) {
                this.r++;
                if (constraintWidget2.t(this.o) != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.s += constraintWidget2.f(this.o);
                }
                this.s += constraintWidget2.A[i].e();
                int i2 = i + 1;
                this.s += constraintWidget2.A[i2].e();
                this.t += constraintWidget2.A[i].e();
                this.t += constraintWidget2.A[i2].e();
                if (this.b == null) {
                    this.b = constraintWidget2;
                }
                this.d = constraintWidget2;
                if (constraintWidget2.C[this.o] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    if (constraintWidget2.g[this.o] == 0 || constraintWidget2.g[this.o] == 3 || constraintWidget2.g[this.o] == 2) {
                        this.j++;
                        float f = constraintWidget2.ad[this.o];
                        if (f > 0.0f) {
                            this.k += constraintWidget2.ad[this.o];
                        }
                        if (a(constraintWidget2, this.o)) {
                            if (f < 0.0f) {
                                this.l = true;
                            } else {
                                this.m = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList<>();
                            }
                            this.h.add(constraintWidget2);
                        }
                        if (this.f == null) {
                            this.f = constraintWidget2;
                        }
                        ConstraintWidget constraintWidget5 = this.g;
                        if (constraintWidget5 != null) {
                            constraintWidget5.ae[this.o] = constraintWidget2;
                        }
                        this.g = constraintWidget2;
                    }
                    if (this.o != 0 ? !(constraintWidget2.f == 0 && constraintWidget2.k == 0 && constraintWidget2.l == 0) : !(constraintWidget2.e == 0 && constraintWidget2.h == 0 && constraintWidget2.i == 0)) {
                        this.u = false;
                    }
                    if (constraintWidget2.G != 0.0f) {
                        this.u = false;
                        this.v = true;
                    }
                }
            }
            if (constraintWidget3 != constraintWidget2) {
                constraintWidget3.af[this.o] = constraintWidget2;
            }
            ConstraintAnchor constraintAnchor = constraintWidget2.A[i + 1].c;
            if (constraintAnchor != null) {
                ConstraintWidget constraintWidget6 = constraintAnchor.f1111a;
                if (constraintWidget6.A[i].c != null && constraintWidget6.A[i].c.f1111a == constraintWidget2) {
                    constraintWidget4 = constraintWidget6;
                }
            }
            if (constraintWidget4 != null) {
                constraintWidget3 = constraintWidget2;
                constraintWidget2 = constraintWidget4;
            } else {
                constraintWidget3 = constraintWidget2;
                z2 = true;
            }
        }
        ConstraintWidget constraintWidget7 = this.b;
        if (constraintWidget7 != null) {
            this.s -= constraintWidget7.A[i].e();
        }
        ConstraintWidget constraintWidget8 = this.d;
        if (constraintWidget8 != null) {
            this.s -= constraintWidget8.A[i + 1].e();
        }
        this.c = constraintWidget2;
        this.e = (this.o != 0 || !this.p) ? this.f1130a : this.c;
        if (!this.m || !this.l) {
            z = false;
        }
        this.n = z;
    }

    public void a() {
        if (!this.q) {
            b();
        }
        this.q = true;
    }
}
