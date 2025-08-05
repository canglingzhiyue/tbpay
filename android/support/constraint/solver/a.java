package android.support.constraint.solver;

import android.support.constraint.solver.b;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class a implements b.a {
    private static float l = 0.001f;
    private final b b;
    protected final c c;
    private int[] f;
    private int[] g;
    private float[] h;
    private int i;
    private int j;
    private boolean k;

    /* renamed from: a  reason: collision with root package name */
    int f1102a = 0;
    private int d = 8;
    private SolverVariable e = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar, c cVar) {
        int i = this.d;
        this.f = new int[i];
        this.g = new int[i];
        this.h = new float[i];
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.b = bVar;
        this.c = cVar;
    }

    @Override // android.support.constraint.solver.b.a
    public final float a(SolverVariable solverVariable, boolean z) {
        if (this.e == solverVariable) {
            this.e = null;
        }
        int i = this.i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f1102a) {
            if (this.f[i] == solverVariable.f1101a) {
                if (i == this.i) {
                    this.i = this.g[i];
                } else {
                    int[] iArr = this.g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    solverVariable.b(this.b);
                }
                solverVariable.i--;
                this.f1102a--;
                this.f[i] = -1;
                if (this.k) {
                    this.j = i;
                }
                return this.h[i];
            }
            i2++;
            i3 = i;
            i = this.g[i];
        }
        return 0.0f;
    }

    @Override // android.support.constraint.solver.b.a
    public float a(b bVar, boolean z) {
        float b = b(bVar.f1103a);
        a(bVar.f1103a, z);
        b.a aVar = bVar.f;
        int c = aVar.c();
        for (int i = 0; i < c; i++) {
            SolverVariable a2 = aVar.a(i);
            a(a2, aVar.b(a2) * b, z);
        }
        return b;
    }

    @Override // android.support.constraint.solver.b.a
    public SolverVariable a(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.f1102a; i3++) {
            if (i3 == i) {
                return this.c.c[this.f[i2]];
            }
            i2 = this.g[i2];
        }
        return null;
    }

    @Override // android.support.constraint.solver.b.a
    public final void a() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f1102a; i2++) {
            SolverVariable solverVariable = this.c.c[this.f[i]];
            if (solverVariable != null) {
                solverVariable.b(this.b);
            }
            i = this.g[i];
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.f1102a = 0;
    }

    @Override // android.support.constraint.solver.b.a
    public void a(float f) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f1102a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] / f;
            i = this.g[i];
        }
    }

    @Override // android.support.constraint.solver.b.a
    public final void a(SolverVariable solverVariable, float f) {
        if (f == 0.0f) {
            a(solverVariable, true);
            return;
        }
        int i = this.i;
        if (i == -1) {
            this.i = 0;
            float[] fArr = this.h;
            int i2 = this.i;
            fArr[i2] = f;
            this.f[i2] = solverVariable.f1101a;
            this.g[this.i] = -1;
            solverVariable.i++;
            solverVariable.a(this.b);
            this.f1102a++;
            if (this.k) {
                return;
            }
            this.j++;
            int i3 = this.j;
            int[] iArr = this.f;
            if (i3 < iArr.length) {
                return;
            }
            this.k = true;
            this.j = iArr.length - 1;
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i != -1 && i5 < this.f1102a; i5++) {
            if (this.f[i] == solverVariable.f1101a) {
                this.h[i] = f;
                return;
            }
            if (this.f[i] < solverVariable.f1101a) {
                i4 = i;
            }
            i = this.g[i];
        }
        int i6 = this.j;
        int i7 = i6 + 1;
        if (this.k) {
            int[] iArr2 = this.f;
            if (iArr2[i6] != -1) {
                i6 = iArr2.length;
            }
        } else {
            i6 = i7;
        }
        int[] iArr3 = this.f;
        if (i6 >= iArr3.length && this.f1102a < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f;
                if (i8 >= iArr4.length) {
                    break;
                } else if (iArr4[i8] == -1) {
                    i6 = i8;
                    break;
                } else {
                    i8++;
                }
            }
        }
        int[] iArr5 = this.f;
        if (i6 >= iArr5.length) {
            i6 = iArr5.length;
            this.d <<= 1;
            this.k = false;
            this.j = i6 - 1;
            this.h = Arrays.copyOf(this.h, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[i6] = solverVariable.f1101a;
        this.h[i6] = f;
        if (i4 != -1) {
            int[] iArr6 = this.g;
            iArr6[i6] = iArr6[i4];
            iArr6[i4] = i6;
        } else {
            this.g[i6] = this.i;
            this.i = i6;
        }
        solverVariable.i++;
        solverVariable.a(this.b);
        this.f1102a++;
        if (!this.k) {
            this.j++;
        }
        if (this.f1102a >= this.f.length) {
            this.k = true;
        }
        int i9 = this.j;
        int[] iArr7 = this.f;
        if (i9 < iArr7.length) {
            return;
        }
        this.k = true;
        this.j = iArr7.length - 1;
    }

    @Override // android.support.constraint.solver.b.a
    public void a(SolverVariable solverVariable, float f, boolean z) {
        float f2 = l;
        if (f <= (-f2) || f >= f2) {
            int i = this.i;
            if (i == -1) {
                this.i = 0;
                float[] fArr = this.h;
                int i2 = this.i;
                fArr[i2] = f;
                this.f[i2] = solverVariable.f1101a;
                this.g[this.i] = -1;
                solverVariable.i++;
                solverVariable.a(this.b);
                this.f1102a++;
                if (this.k) {
                    return;
                }
                this.j++;
                int i3 = this.j;
                int[] iArr = this.f;
                if (i3 < iArr.length) {
                    return;
                }
                this.k = true;
                this.j = iArr.length - 1;
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i != -1 && i5 < this.f1102a; i5++) {
                if (this.f[i] == solverVariable.f1101a) {
                    float f3 = this.h[i] + f;
                    float f4 = l;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    this.h[i] = f3;
                    if (f3 != 0.0f) {
                        return;
                    }
                    if (i == this.i) {
                        this.i = this.g[i];
                    } else {
                        int[] iArr2 = this.g;
                        iArr2[i4] = iArr2[i];
                    }
                    if (z) {
                        solverVariable.b(this.b);
                    }
                    if (this.k) {
                        this.j = i;
                    }
                    solverVariable.i--;
                    this.f1102a--;
                    return;
                }
                if (this.f[i] < solverVariable.f1101a) {
                    i4 = i;
                }
                i = this.g[i];
            }
            int i6 = this.j;
            int i7 = i6 + 1;
            if (this.k) {
                int[] iArr3 = this.f;
                if (iArr3[i6] != -1) {
                    i6 = iArr3.length;
                }
            } else {
                i6 = i7;
            }
            int[] iArr4 = this.f;
            if (i6 >= iArr4.length && this.f1102a < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f;
                    if (i8 >= iArr5.length) {
                        break;
                    } else if (iArr5[i8] == -1) {
                        i6 = i8;
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            int[] iArr6 = this.f;
            if (i6 >= iArr6.length) {
                i6 = iArr6.length;
                this.d <<= 1;
                this.k = false;
                this.j = i6 - 1;
                this.h = Arrays.copyOf(this.h, this.d);
                this.f = Arrays.copyOf(this.f, this.d);
                this.g = Arrays.copyOf(this.g, this.d);
            }
            this.f[i6] = solverVariable.f1101a;
            this.h[i6] = f;
            if (i4 != -1) {
                int[] iArr7 = this.g;
                iArr7[i6] = iArr7[i4];
                iArr7[i4] = i6;
            } else {
                this.g[i6] = this.i;
                this.i = i6;
            }
            solverVariable.i++;
            solverVariable.a(this.b);
            this.f1102a++;
            if (!this.k) {
                this.j++;
            }
            int i9 = this.j;
            int[] iArr8 = this.f;
            if (i9 < iArr8.length) {
                return;
            }
            this.k = true;
            this.j = iArr8.length - 1;
        }
    }

    @Override // android.support.constraint.solver.b.a
    public boolean a(SolverVariable solverVariable) {
        int i = this.i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f1102a; i2++) {
            if (this.f[i] == solverVariable.f1101a) {
                return true;
            }
            i = this.g[i];
        }
        return false;
    }

    @Override // android.support.constraint.solver.b.a
    public float b(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.f1102a; i3++) {
            if (i3 == i) {
                return this.h[i2];
            }
            i2 = this.g[i2];
        }
        return 0.0f;
    }

    @Override // android.support.constraint.solver.b.a
    public final float b(SolverVariable solverVariable) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f1102a; i2++) {
            if (this.f[i] == solverVariable.f1101a) {
                return this.h[i];
            }
            i = this.g[i];
        }
        return 0.0f;
    }

    @Override // android.support.constraint.solver.b.a
    public void b() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f1102a; i2++) {
            float[] fArr = this.h;
            fArr[i] = -fArr[i];
            i = this.g[i];
        }
    }

    @Override // android.support.constraint.solver.b.a
    public int c() {
        return this.f1102a;
    }

    public String toString() {
        int i = this.i;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f1102a; i2++) {
            str = ((str + " -> ") + this.h[i] + " : ") + this.c.c[this.f[i]];
            i = this.g[i];
        }
        return str;
    }
}
