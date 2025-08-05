package android.support.constraint.solver;

import android.support.constraint.solver.b;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class d extends b {
    a g;
    c h;
    private int i;
    private SolverVariable[] j;
    private SolverVariable[] k;
    private int l;

    /* loaded from: classes2.dex */
    class a implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        SolverVariable f1106a;
        d b;

        public a(d dVar) {
            this.b = dVar;
        }

        public void a(SolverVariable solverVariable) {
            this.f1106a = solverVariable;
        }

        public final boolean a() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f1106a.r[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public boolean a(SolverVariable solverVariable, float f) {
            boolean z = true;
            if (!this.f1106a.p) {
                for (int i = 0; i < 9; i++) {
                    float f2 = solverVariable.r[i];
                    if (f2 != 0.0f) {
                        float f3 = f2 * f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.f1106a.r[i] = f3;
                    } else {
                        this.f1106a.r[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.f1106a.r;
                fArr[i2] = fArr[i2] + (solverVariable.r[i2] * f);
                if (Math.abs(this.f1106a.r[i2]) < 1.0E-4f) {
                    this.f1106a.r[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                d.this.f(this.f1106a);
            }
            return false;
        }

        public void b() {
            Arrays.fill(this.f1106a.r, 0.0f);
        }

        public final boolean b(SolverVariable solverVariable) {
            for (int i = 8; i >= 0; i--) {
                float f = solverVariable.r[i];
                float f2 = this.f1106a.r[i];
                if (f2 != f) {
                    return f2 < f;
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f1106a.f1101a - ((SolverVariable) obj).f1101a;
        }

        public String toString() {
            String str = "[ ";
            if (this.f1106a != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f1106a.r[i] + " ";
                }
            }
            return str + "] " + this.f1106a;
        }
    }

    public d(c cVar) {
        super(cVar);
        this.i = 128;
        int i = this.i;
        this.j = new SolverVariable[i];
        this.k = new SolverVariable[i];
        this.l = 0;
        this.g = new a(this);
        this.h = cVar;
    }

    private final void e(SolverVariable solverVariable) {
        int i;
        int i2 = this.l + 1;
        SolverVariable[] solverVariableArr = this.j;
        if (i2 > solverVariableArr.length) {
            this.j = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length << 1);
            SolverVariable[] solverVariableArr2 = this.j;
            this.k = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length << 1);
        }
        SolverVariable[] solverVariableArr3 = this.j;
        int i3 = this.l;
        solverVariableArr3[i3] = solverVariable;
        this.l = i3 + 1;
        int i4 = this.l;
        if (i4 > 1 && solverVariableArr3[i4 - 1].f1101a > solverVariable.f1101a) {
            int i5 = 0;
            while (true) {
                i = this.l;
                if (i5 >= i) {
                    break;
                }
                this.k[i5] = this.j[i5];
                i5++;
            }
            Arrays.sort(this.k, 0, i, new Comparator<SolverVariable>() { // from class: android.support.constraint.solver.d.1
                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(SolverVariable solverVariable2, SolverVariable solverVariable3) {
                    return solverVariable2.f1101a - solverVariable3.f1101a;
                }
            });
            for (int i6 = 0; i6 < this.l; i6++) {
                this.j[i6] = this.k[i6];
            }
        }
        solverVariable.p = true;
        solverVariable.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(SolverVariable solverVariable) {
        int i = 0;
        while (i < this.l) {
            if (this.j[i] == solverVariable) {
                while (true) {
                    int i2 = this.l;
                    if (i >= i2 - 1) {
                        this.l = i2 - 1;
                        solverVariable.p = false;
                        return;
                    }
                    SolverVariable[] solverVariableArr = this.j;
                    int i3 = i + 1;
                    solverVariableArr[i] = solverVariableArr[i3];
                    i = i3;
                }
            } else {
                i++;
            }
        }
    }

    @Override // android.support.constraint.solver.b, android.support.constraint.solver.e.a
    public SolverVariable a(e eVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.l; i2++) {
            SolverVariable solverVariable = this.j[i2];
            if (!zArr[solverVariable.f1101a]) {
                this.g.a(solverVariable);
                if (i == -1) {
                    if (!this.g.a()) {
                    }
                    i = i2;
                } else {
                    if (!this.g.b(this.j[i])) {
                    }
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.j[i];
    }

    @Override // android.support.constraint.solver.b
    public void a(e eVar, b bVar, boolean z) {
        SolverVariable solverVariable = bVar.f1103a;
        if (solverVariable == null) {
            return;
        }
        b.a aVar = bVar.f;
        int c = aVar.c();
        for (int i = 0; i < c; i++) {
            SolverVariable a2 = aVar.a(i);
            float b = aVar.b(i);
            this.g.a(a2);
            if (this.g.a(solverVariable, b)) {
                e(a2);
            }
            this.b += bVar.b * b;
        }
        f(solverVariable);
    }

    @Override // android.support.constraint.solver.b, android.support.constraint.solver.e.a
    public void d(SolverVariable solverVariable) {
        this.g.a(solverVariable);
        this.g.b();
        solverVariable.r[solverVariable.c] = 1.0f;
        e(solverVariable);
    }

    @Override // android.support.constraint.solver.b, android.support.constraint.solver.e.a
    public boolean e() {
        return this.l == 0;
    }

    @Override // android.support.constraint.solver.b, android.support.constraint.solver.e.a
    public void f() {
        this.l = 0;
        this.b = 0.0f;
    }

    @Override // android.support.constraint.solver.b
    public String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.l; i++) {
            this.g.a(this.j[i]);
            str = str + this.g + " ";
        }
        return str;
    }
}
