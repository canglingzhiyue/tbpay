package android.support.constraint.solver;

import android.support.constraint.solver.b;
import java.util.Arrays;
import tb.riy;

/* loaded from: classes2.dex */
public class h implements b.a {
    private static float j = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    int[] f1110a;
    int[] b;
    int[] c;
    float[] d;
    int[] e;
    int[] f;
    int g;
    int h;
    protected final c i;
    private final int k = -1;
    private int l = 16;
    private int m = 16;
    private final b n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(b bVar, c cVar) {
        int i = this.l;
        this.f1110a = new int[i];
        this.b = new int[i];
        this.c = new int[i];
        this.d = new float[i];
        this.e = new int[i];
        this.f = new int[i];
        this.g = 0;
        this.h = -1;
        this.n = bVar;
        this.i = cVar;
        a();
    }

    private void a(int i, SolverVariable solverVariable, float f) {
        this.c[i] = solverVariable.f1101a;
        this.d[i] = f;
        this.e[i] = -1;
        this.f[i] = -1;
        solverVariable.a(this.n);
        solverVariable.i++;
        this.g++;
    }

    private void a(SolverVariable solverVariable, int i) {
        int[] iArr;
        int i2 = solverVariable.f1101a % this.m;
        int[] iArr2 = this.f1110a;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.b;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.b[i] = -1;
    }

    private void b(int i, SolverVariable solverVariable, float f) {
        int e = e();
        a(e, solverVariable, f);
        if (i != -1) {
            this.e[e] = i;
            int[] iArr = this.f;
            iArr[e] = iArr[i];
            iArr[i] = e;
        } else {
            this.e[e] = -1;
            if (this.g > 0) {
                this.f[e] = this.h;
                this.h = e;
            } else {
                this.f[e] = -1;
            }
        }
        int[] iArr2 = this.f;
        if (iArr2[e] != -1) {
            this.e[iArr2[e]] = e;
        }
        a(solverVariable, e);
    }

    private void d() {
        int i = this.l << 1;
        this.c = Arrays.copyOf(this.c, i);
        this.d = Arrays.copyOf(this.d, i);
        this.e = Arrays.copyOf(this.e, i);
        this.f = Arrays.copyOf(this.f, i);
        this.b = Arrays.copyOf(this.b, i);
        for (int i2 = this.l; i2 < i; i2++) {
            this.c[i2] = -1;
            this.b[i2] = -1;
        }
        this.l = i;
    }

    private void d(SolverVariable solverVariable) {
        int i = solverVariable.f1101a % this.m;
        int i2 = this.f1110a[i];
        if (i2 == -1) {
            return;
        }
        int i3 = solverVariable.f1101a;
        if (this.c[i2] == i3) {
            int[] iArr = this.f1110a;
            int[] iArr2 = this.b;
            iArr[i] = iArr2[i2];
            iArr2[i2] = -1;
            return;
        }
        while (true) {
            int[] iArr3 = this.b;
            if (iArr3[i2] == -1 || this.c[iArr3[i2]] == i3) {
                break;
            }
            i2 = iArr3[i2];
        }
        int[] iArr4 = this.b;
        int i4 = iArr4[i2];
        if (i4 == -1 || this.c[i4] != i3) {
            return;
        }
        iArr4[i2] = iArr4[i4];
        iArr4[i4] = -1;
    }

    private int e() {
        for (int i = 0; i < this.l; i++) {
            if (this.c[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.support.constraint.solver.b.a
    public float a(SolverVariable solverVariable, boolean z) {
        int c = c(solverVariable);
        if (c == -1) {
            return 0.0f;
        }
        d(solverVariable);
        float f = this.d[c];
        if (this.h == c) {
            this.h = this.f[c];
        }
        this.c[c] = -1;
        int[] iArr = this.e;
        if (iArr[c] != -1) {
            int[] iArr2 = this.f;
            iArr2[iArr[c]] = iArr2[c];
        }
        int[] iArr3 = this.f;
        if (iArr3[c] != -1) {
            int[] iArr4 = this.e;
            iArr4[iArr3[c]] = iArr4[c];
        }
        this.g--;
        solverVariable.i--;
        if (z) {
            solverVariable.b(this.n);
        }
        return f;
    }

    @Override // android.support.constraint.solver.b.a
    public float a(b bVar, boolean z) {
        float b = b(bVar.f1103a);
        a(bVar.f1103a, z);
        h hVar = (h) bVar.f;
        int c = hVar.c();
        int i = 0;
        int i2 = 0;
        while (i < c) {
            if (hVar.c[i2] != -1) {
                a(this.i.c[hVar.c[i2]], hVar.d[i2] * b, z);
                i++;
            }
            i2++;
        }
        return b;
    }

    @Override // android.support.constraint.solver.b.a
    public SolverVariable a(int i) {
        int i2 = this.g;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.h;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.i.c[this.c[i3]];
            }
            i3 = this.f[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // android.support.constraint.solver.b.a
    public void a() {
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable a2 = a(i2);
            if (a2 != null) {
                a2.b(this.n);
            }
        }
        for (int i3 = 0; i3 < this.l; i3++) {
            this.c[i3] = -1;
            this.b[i3] = -1;
        }
        for (int i4 = 0; i4 < this.m; i4++) {
            this.f1110a[i4] = -1;
        }
        this.g = 0;
        this.h = -1;
    }

    @Override // android.support.constraint.solver.b.a
    public void a(float f) {
        int i = this.g;
        int i2 = this.h;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.d;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // android.support.constraint.solver.b.a
    public void a(SolverVariable solverVariable, float f) {
        float f2 = j;
        if (f > (-f2) && f < f2) {
            a(solverVariable, true);
            return;
        }
        if (this.g == 0) {
            a(0, solverVariable, f);
            a(solverVariable, 0);
            this.h = 0;
            return;
        }
        int c = c(solverVariable);
        if (c != -1) {
            this.d[c] = f;
            return;
        }
        if (this.g + 1 >= this.l) {
            d();
        }
        int i = this.g;
        int i2 = this.h;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            if (this.c[i2] == solverVariable.f1101a) {
                this.d[i2] = f;
                return;
            }
            if (this.c[i2] < solverVariable.f1101a) {
                i3 = i2;
            }
            i2 = this.f[i2];
            if (i2 == -1) {
                break;
            }
        }
        b(i3, solverVariable, f);
    }

    @Override // android.support.constraint.solver.b.a
    public void a(SolverVariable solverVariable, float f, boolean z) {
        float f2 = j;
        if (f <= (-f2) || f >= f2) {
            int c = c(solverVariable);
            if (c == -1) {
                a(solverVariable, f);
                return;
            }
            float[] fArr = this.d;
            fArr[c] = fArr[c] + f;
            float f3 = fArr[c];
            float f4 = j;
            if (f3 <= (-f4) || fArr[c] >= f4) {
                return;
            }
            fArr[c] = 0.0f;
            a(solverVariable, z);
        }
    }

    @Override // android.support.constraint.solver.b.a
    public boolean a(SolverVariable solverVariable) {
        return c(solverVariable) != -1;
    }

    @Override // android.support.constraint.solver.b.a
    public float b(int i) {
        int i2 = this.g;
        int i3 = this.h;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.d[i3];
            }
            i3 = this.f[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // android.support.constraint.solver.b.a
    public float b(SolverVariable solverVariable) {
        int c = c(solverVariable);
        if (c != -1) {
            return this.d[c];
        }
        return 0.0f;
    }

    @Override // android.support.constraint.solver.b.a
    public void b() {
        int i = this.g;
        int i2 = this.h;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.d;
            fArr[i2] = -fArr[i2];
            i2 = this.f[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // android.support.constraint.solver.b.a
    public int c() {
        return this.g;
    }

    public int c(SolverVariable solverVariable) {
        if (this.g != 0 && solverVariable != null) {
            int i = solverVariable.f1101a;
            int i2 = this.f1110a[i % this.m];
            if (i2 == -1) {
                return -1;
            }
            if (this.c[i2] == i) {
                return i2;
            }
            while (true) {
                int[] iArr = this.b;
                if (iArr[i2] == -1 || this.c[iArr[i2]] == i) {
                    break;
                }
                i2 = iArr[i2];
            }
            int[] iArr2 = this.b;
            if (iArr2[i2] != -1 && this.c[iArr2[i2]] == i) {
                return iArr2[i2];
            }
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb;
        String str = hashCode() + " { ";
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable a2 = a(i2);
            if (a2 != null) {
                String str2 = str + a2 + " = " + b(i2) + " ";
                int c = c(a2);
                String str3 = str2 + "[p: ";
                if (this.e[c] != -1) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(this.i.c[this.c[this.e[c]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("none");
                }
                String str4 = sb.toString() + ", n: ";
                str = (this.f[c] != -1 ? str4 + this.i.c[this.c[this.f[c]]] : str4 + "none") + riy.ARRAY_END_STR;
            }
        }
        return str + " }";
    }
}
