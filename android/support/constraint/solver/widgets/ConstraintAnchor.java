package android.support.constraint.solver.widgets;

import android.support.constraint.solver.SolverVariable;
import android.support.constraint.solver.widgets.analyzer.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ConstraintAnchor {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintWidget f1111a;
    public final Type b;
    public ConstraintAnchor c;
    SolverVariable f;
    private int h;
    private boolean i;
    private HashSet<ConstraintAnchor> g = null;
    public int d = 0;
    int e = -1;

    /* loaded from: classes2.dex */
    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f1111a = constraintWidget;
        this.b = type;
    }

    public HashSet<ConstraintAnchor> a() {
        return this.g;
    }

    public void a(int i) {
        this.h = i;
        this.i = true;
    }

    public void a(int i, ArrayList<n> arrayList, n nVar) {
        HashSet<ConstraintAnchor> hashSet = this.g;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                android.support.constraint.solver.widgets.analyzer.h.a(it.next().f1111a, i, arrayList, nVar);
            }
        }
    }

    public void a(android.support.constraint.solver.c cVar) {
        SolverVariable solverVariable = this.f;
        if (solverVariable == null) {
            this.f = new SolverVariable(SolverVariable.Type.UNRESTRICTED, null);
        } else {
            solverVariable.b();
        }
    }

    public boolean a(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        Type d = constraintAnchor.d();
        Type type = this.b;
        if (d == type) {
            return type != Type.BASELINE || (constraintAnchor.c().A() && c().A());
        }
        switch (this.b) {
            case CENTER:
                return (d == Type.BASELINE || d == Type.CENTER_X || d == Type.CENTER_Y) ? false : true;
            case LEFT:
            case RIGHT:
                boolean z = d == Type.LEFT || d == Type.RIGHT;
                return constraintAnchor.c() instanceof g ? z || d == Type.CENTER_X : z;
            case TOP:
            case BOTTOM:
                boolean z2 = d == Type.TOP || d == Type.BOTTOM;
                return constraintAnchor.c() instanceof g ? z2 || d == Type.CENTER_Y : z2;
            case BASELINE:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return false;
            default:
                throw new AssertionError(this.b.name());
        }
    }

    public boolean a(ConstraintAnchor constraintAnchor, int i) {
        return a(constraintAnchor, i, -1, false);
    }

    public boolean a(ConstraintAnchor constraintAnchor, int i, int i2, boolean z) {
        if (constraintAnchor == null) {
            i();
            return true;
        } else if (!z && !a(constraintAnchor)) {
            return false;
        } else {
            this.c = constraintAnchor;
            ConstraintAnchor constraintAnchor2 = this.c;
            if (constraintAnchor2.g == null) {
                constraintAnchor2.g = new HashSet<>();
            }
            HashSet<ConstraintAnchor> hashSet = this.c.g;
            if (hashSet != null) {
                hashSet.add(this);
            }
            if (i > 0) {
                this.d = i;
            } else {
                this.d = 0;
            }
            this.e = i2;
            return true;
        }
    }

    public SolverVariable b() {
        return this.f;
    }

    public void b(int i) {
        if (j()) {
            this.e = i;
        }
    }

    public ConstraintWidget c() {
        return this.f1111a;
    }

    public Type d() {
        return this.b;
    }

    public int e() {
        ConstraintAnchor constraintAnchor;
        if (this.f1111a.m() == 8) {
            return 0;
        }
        return (this.e < 0 || (constraintAnchor = this.c) == null || constraintAnchor.f1111a.m() != 8) ? this.d : this.e;
    }

    public boolean f() {
        HashSet<ConstraintAnchor> hashSet = this.g;
        return hashSet != null && hashSet.size() > 0;
    }

    public ConstraintAnchor g() {
        return this.c;
    }

    public boolean h() {
        HashSet<ConstraintAnchor> hashSet = this.g;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().k().j()) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.c;
        if (constraintAnchor != null && (hashSet = constraintAnchor.g) != null) {
            hashSet.remove(this);
            if (this.c.g.size() == 0) {
                this.c.g = null;
            }
        }
        this.g = null;
        this.c = null;
        this.d = 0;
        this.e = -1;
        this.i = false;
        this.h = 0;
    }

    public boolean j() {
        return this.c != null;
    }

    public final ConstraintAnchor k() {
        switch (this.b) {
            case CENTER:
            case BASELINE:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return null;
            case LEFT:
                return this.f1111a.u;
            case RIGHT:
                return this.f1111a.s;
            case TOP:
                return this.f1111a.v;
            case BOTTOM:
                return this.f1111a.t;
            default:
                throw new AssertionError(this.b.name());
        }
    }

    public int l() {
        if (!this.i) {
            return 0;
        }
        return this.h;
    }

    public void m() {
        this.i = false;
        this.h = 0;
    }

    public boolean n() {
        return this.i;
    }

    public String toString() {
        return this.f1111a.n() + ":" + this.b.toString();
    }
}
