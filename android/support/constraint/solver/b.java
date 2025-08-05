package android.support.constraint.solver;

import android.support.constraint.solver.SolverVariable;
import android.support.constraint.solver.e;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class b implements e.a {

    /* renamed from: a  reason: collision with root package name */
    SolverVariable f1103a = null;
    float b = 0.0f;
    boolean c = false;
    ArrayList<SolverVariable> d = new ArrayList<>();
    boolean e = false;
    public a f;

    /* loaded from: classes2.dex */
    public interface a {
        float a(SolverVariable solverVariable, boolean z);

        float a(b bVar, boolean z);

        SolverVariable a(int i);

        void a();

        void a(float f);

        void a(SolverVariable solverVariable, float f);

        void a(SolverVariable solverVariable, float f, boolean z);

        boolean a(SolverVariable solverVariable);

        float b(int i);

        float b(SolverVariable solverVariable);

        void b();

        int c();
    }

    public b() {
    }

    public b(c cVar) {
        this.f = new android.support.constraint.solver.a(this, cVar);
    }

    private SolverVariable a(boolean[] zArr, SolverVariable solverVariable) {
        int c = this.f.c();
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        for (int i = 0; i < c; i++) {
            float b = this.f.b(i);
            if (b < 0.0f) {
                SolverVariable a2 = this.f.a(i);
                if ((zArr == null || !zArr[a2.f1101a]) && a2 != solverVariable && ((a2.f == SolverVariable.Type.SLACK || a2.f == SolverVariable.Type.ERROR) && b < f)) {
                    f = b;
                    solverVariable2 = a2;
                }
            }
        }
        return solverVariable2;
    }

    private boolean a(SolverVariable solverVariable, e eVar) {
        return solverVariable.i <= 1;
    }

    @Override // android.support.constraint.solver.e.a
    public SolverVariable a(e eVar, boolean[] zArr) {
        return a(zArr, (SolverVariable) null);
    }

    public b a(float f, float f2, float f3, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f.a(solverVariable, 1.0f);
            this.f.a(solverVariable2, -1.0f);
            this.f.a(solverVariable4, 1.0f);
            this.f.a(solverVariable3, -1.0f);
        } else if (f == 0.0f) {
            this.f.a(solverVariable, 1.0f);
            this.f.a(solverVariable2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f.a(solverVariable3, 1.0f);
            this.f.a(solverVariable4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f.a(solverVariable, 1.0f);
            this.f.a(solverVariable2, -1.0f);
            this.f.a(solverVariable4, f4);
            this.f.a(solverVariable3, -f4);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b a(SolverVariable solverVariable, int i) {
        this.f1103a = solverVariable;
        float f = i;
        solverVariable.d = f;
        this.b = f;
        this.e = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b a(SolverVariable solverVariable, SolverVariable solverVariable2, float f) {
        this.f.a(solverVariable, -1.0f);
        this.f.a(solverVariable2, f);
        return this;
    }

    public b a(SolverVariable solverVariable, SolverVariable solverVariable2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (!z) {
            this.f.a(solverVariable, -1.0f);
            this.f.a(solverVariable2, 1.0f);
        } else {
            this.f.a(solverVariable, 1.0f);
            this.f.a(solverVariable2, -1.0f);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b a(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2) {
        float f2;
        int i3;
        if (solverVariable2 == solverVariable3) {
            this.f.a(solverVariable, 1.0f);
            this.f.a(solverVariable4, 1.0f);
            this.f.a(solverVariable2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f.a(solverVariable, 1.0f);
            this.f.a(solverVariable2, -1.0f);
            this.f.a(solverVariable3, -1.0f);
            this.f.a(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                i3 = (-i) + i2;
                f2 = i3;
            }
            return this;
        } else if (f <= 0.0f) {
            this.f.a(solverVariable, -1.0f);
            this.f.a(solverVariable2, 1.0f);
            f2 = i;
        } else if (f < 1.0f) {
            float f3 = 1.0f - f;
            this.f.a(solverVariable, f3 * 1.0f);
            this.f.a(solverVariable2, f3 * (-1.0f));
            this.f.a(solverVariable3, (-1.0f) * f);
            this.f.a(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                f2 = ((-i) * f3) + (i2 * f);
            }
            return this;
        } else {
            this.f.a(solverVariable4, -1.0f);
            this.f.a(solverVariable3, 1.0f);
            i3 = -i2;
            f2 = i3;
        }
        this.b = f2;
        return this;
    }

    public b a(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (!z) {
            this.f.a(solverVariable, -1.0f);
            this.f.a(solverVariable2, 1.0f);
            this.f.a(solverVariable3, 1.0f);
        } else {
            this.f.a(solverVariable, 1.0f);
            this.f.a(solverVariable2, -1.0f);
            this.f.a(solverVariable3, -1.0f);
        }
        return this;
    }

    public b a(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f.a(solverVariable, -1.0f);
        this.f.a(solverVariable2, 1.0f);
        this.f.a(solverVariable3, f);
        this.f.a(solverVariable4, -f);
        return this;
    }

    public b a(e eVar, int i) {
        this.f.a(eVar.a(i, "ep"), 1.0f);
        this.f.a(eVar.a(i, "em"), -1.0f);
        return this;
    }

    @Override // android.support.constraint.solver.e.a
    public void a(e.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f1103a = null;
            this.f.a();
            for (int i = 0; i < bVar.f.c(); i++) {
                this.f.a(bVar.f.a(i), bVar.f.b(i), true);
            }
        }
    }

    public void a(e eVar, SolverVariable solverVariable, boolean z) {
        if (!solverVariable.q) {
            return;
        }
        this.b += solverVariable.d * this.f.b(solverVariable);
        this.f.a(solverVariable, z);
        if (z) {
            solverVariable.b(this);
        }
        if (!e.t || solverVariable == null || this.f.c() != 0) {
            return;
        }
        this.e = true;
        eVar.x = true;
    }

    public void a(e eVar, b bVar, boolean z) {
        this.b += bVar.b * this.f.a(bVar, z);
        if (z) {
            bVar.f1103a.b(this);
        }
        if (!e.t || this.f1103a == null || this.f.c() != 0) {
            return;
        }
        this.e = true;
        eVar.x = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        SolverVariable solverVariable = this.f1103a;
        if (solverVariable != null) {
            return solverVariable.f == SolverVariable.Type.UNRESTRICTED || this.b >= 0.0f;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(SolverVariable solverVariable) {
        return this.f.a(solverVariable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(e eVar) {
        boolean z;
        SolverVariable b = b(eVar);
        if (b == null) {
            z = true;
        } else {
            c(b);
            z = false;
        }
        if (this.f.c() == 0) {
            this.e = true;
        }
        return z;
    }

    public SolverVariable b(SolverVariable solverVariable) {
        return a((boolean[]) null, solverVariable);
    }

    SolverVariable b(e eVar) {
        int c = this.f.c();
        SolverVariable solverVariable = null;
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        boolean z = false;
        float f2 = 0.0f;
        boolean z2 = false;
        for (int i = 0; i < c; i++) {
            float b = this.f.b(i);
            SolverVariable a2 = this.f.a(i);
            if (a2.f == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null || f > b) {
                    z = a(a2, eVar);
                    f = b;
                    solverVariable = a2;
                } else if (!z && a(a2, eVar)) {
                    f = b;
                    solverVariable = a2;
                    z = true;
                }
            } else if (solverVariable == null && b < 0.0f) {
                if (solverVariable2 == null || f2 > b) {
                    z2 = a(a2, eVar);
                    f2 = b;
                    solverVariable2 = a2;
                } else if (!z2 && a(a2, eVar)) {
                    f2 = b;
                    solverVariable2 = a2;
                    z2 = true;
                }
            }
        }
        return solverVariable != null ? solverVariable : solverVariable2;
    }

    public b b(SolverVariable solverVariable, int i) {
        a aVar;
        float f;
        if (i < 0) {
            this.b = i * (-1);
            aVar = this.f;
            f = 1.0f;
        } else {
            this.b = i;
            aVar = this.f;
            f = -1.0f;
        }
        aVar.a(solverVariable, f);
        return this;
    }

    public b b(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (!z) {
            this.f.a(solverVariable, -1.0f);
            this.f.a(solverVariable2, 1.0f);
            this.f.a(solverVariable3, -1.0f);
        } else {
            this.f.a(solverVariable, 1.0f);
            this.f.a(solverVariable2, -1.0f);
            this.f.a(solverVariable3, 1.0f);
        }
        return this;
    }

    public b b(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f.a(solverVariable3, 0.5f);
        this.f.a(solverVariable4, 0.5f);
        this.f.a(solverVariable, -0.5f);
        this.f.a(solverVariable2, -0.5f);
        this.b = -f;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String b() {
        /*
            r9 = this;
            android.support.constraint.solver.SolverVariable r0 = r9.f1103a
            java.lang.String r1 = ""
            if (r0 != 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L21
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            android.support.constraint.solver.SolverVariable r1 = r9.f1103a
            r0.append(r1)
        L21:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L53
        L52:
            r1 = 0
        L53:
            android.support.constraint.solver.b$a r5 = r9.f
            int r5 = r5.c()
        L59:
            if (r2 >= r5) goto Lcf
            android.support.constraint.solver.b$a r6 = r9.f
            android.support.constraint.solver.SolverVariable r6 = r6.a(r2)
            if (r6 == 0) goto Lcc
            android.support.constraint.solver.b$a r7 = r9.f
            float r7 = r7.b(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 == 0) goto Lcc
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L82
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto La8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto La0
        L82:
            if (r8 <= 0) goto L96
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto La8
        L96:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        La0:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = -r7
        La8:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Lb4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto Lc1
        Lb4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        Lc1:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = 1
        Lcc:
            int r2 = r2 + 1
            goto L59
        Lcf:
            if (r1 != 0) goto Le2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Le2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.b.b():java.lang.String");
    }

    public void b(e eVar, SolverVariable solverVariable, boolean z) {
        if (!solverVariable.s) {
            return;
        }
        float b = this.f.b(solverVariable);
        this.b += solverVariable.u * b;
        this.f.a(solverVariable, z);
        if (z) {
            solverVariable.b(this);
        }
        this.f.a(eVar.f.c[solverVariable.t], b, z);
        if (!e.t || solverVariable == null || this.f.c() != 0) {
            return;
        }
        this.e = true;
        eVar.x = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b c(SolverVariable solverVariable, int i) {
        this.f.a(solverVariable, i);
        return this;
    }

    public void c() {
        this.f1103a = null;
        this.f.a();
        this.b = 0.0f;
        this.e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f1103a;
        if (solverVariable2 != null) {
            this.f.a(solverVariable2, -1.0f);
            this.f1103a.b = -1;
            this.f1103a = null;
        }
        float f = -this.f.a(solverVariable, true);
        this.f1103a = solverVariable;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        this.f.a(f);
    }

    public void c(e eVar) {
        if (eVar.b.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int c = this.f.c();
            for (int i = 0; i < c; i++) {
                SolverVariable a2 = this.f.a(i);
                if (a2.b != -1 || a2.q || a2.s) {
                    this.d.add(a2);
                }
            }
            int size = this.d.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    SolverVariable solverVariable = this.d.get(i2);
                    if (solverVariable.q) {
                        a(eVar, solverVariable, true);
                    } else if (solverVariable.s) {
                        b(eVar, solverVariable, true);
                    } else {
                        a(eVar, eVar.b[solverVariable.b], true);
                    }
                }
                this.d.clear();
            } else {
                z = true;
            }
        }
        if (!e.t || this.f1103a == null || this.f.c() != 0) {
            return;
        }
        this.e = true;
        eVar.x = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        float f = this.b;
        if (f < 0.0f) {
            this.b = -f;
            this.f.b();
        }
    }

    @Override // android.support.constraint.solver.e.a
    public void d(SolverVariable solverVariable) {
        float f = 1.0f;
        if (solverVariable.c != 1) {
            if (solverVariable.c == 2) {
                f = 1000.0f;
            } else if (solverVariable.c == 3) {
                f = 1000000.0f;
            } else if (solverVariable.c == 4) {
                f = 1.0E9f;
            } else if (solverVariable.c == 5) {
                f = 1.0E12f;
            }
        }
        this.f.a(solverVariable, f);
    }

    @Override // android.support.constraint.solver.e.a
    public boolean e() {
        return this.f1103a == null && this.b == 0.0f && this.f.c() == 0;
    }

    @Override // android.support.constraint.solver.e.a
    public void f() {
        this.f.a();
        this.f1103a = null;
        this.b = 0.0f;
    }

    @Override // android.support.constraint.solver.e.a
    public SolverVariable g() {
        return this.f1103a;
    }

    public String toString() {
        return b();
    }
}
