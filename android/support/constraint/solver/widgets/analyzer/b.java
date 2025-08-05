package android.support.constraint.solver.widgets.analyzer;

import android.support.constraint.solver.widgets.ConstraintAnchor;
import android.support.constraint.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class b {
    public static final int AT_MOST = Integer.MIN_VALUE;
    public static final int EXACTLY = 1073741824;
    public static final int FIXED = -3;
    public static final int MATCH_PARENT = -1;
    public static final int UNSPECIFIED = 0;
    public static final int WRAP_CONTENT = -2;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<ConstraintWidget> f1118a = new ArrayList<>();
    private a b = new a();
    private android.support.constraint.solver.widgets.e c;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static int f1119a = 0;
        public static int b = 1;
        public static int c = 2;
        public ConstraintWidget.DimensionBehaviour d;
        public ConstraintWidget.DimensionBehaviour e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public boolean k;
        public boolean l;
        public int m;
    }

    /* renamed from: android.support.constraint.solver.widgets.analyzer.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0007b {
        void a();

        void a(ConstraintWidget constraintWidget, a aVar);
    }

    public b(android.support.constraint.solver.widgets.e eVar) {
        this.c = eVar;
    }

    private void a(android.support.constraint.solver.widgets.e eVar, String str, int i, int i2) {
        int Q = eVar.Q();
        int R = eVar.R();
        eVar.l(0);
        eVar.m(0);
        eVar.j(i);
        eVar.k(i2);
        eVar.l(Q);
        eVar.m(R);
        this.c.N();
    }

    private boolean a(InterfaceC0007b interfaceC0007b, ConstraintWidget constraintWidget, int i) {
        this.b.d = constraintWidget.G();
        this.b.e = constraintWidget.H();
        this.b.f = constraintWidget.q();
        this.b.g = constraintWidget.s();
        a aVar = this.b;
        aVar.l = false;
        aVar.m = i;
        boolean z = aVar.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z2 = this.b.e == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z3 = z && constraintWidget.G > 0.0f;
        boolean z4 = z2 && constraintWidget.G > 0.0f;
        if (z3 && constraintWidget.g[0] == 4) {
            this.b.d = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z4 && constraintWidget.g[1] == 4) {
            this.b.e = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        interfaceC0007b.a(constraintWidget, this.b);
        constraintWidget.j(this.b.h);
        constraintWidget.k(this.b.i);
        constraintWidget.c(this.b.k);
        constraintWidget.q(this.b.j);
        this.b.m = a.f1119a;
        return this.b.l;
    }

    private void b(android.support.constraint.solver.widgets.e eVar) {
        int size = eVar.az.size();
        boolean u = eVar.u(64);
        InterfaceC0007b i = eVar.i();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = eVar.az.get(i2);
            if (!(constraintWidget instanceof android.support.constraint.solver.widgets.g) && !(constraintWidget instanceof android.support.constraint.solver.widgets.b) && !constraintWidget.t() && (!u || constraintWidget.aB == null || constraintWidget.aF == null || !constraintWidget.aB.g.j || !constraintWidget.aF.g.j)) {
                ConstraintWidget.DimensionBehaviour t = constraintWidget.t(0);
                ConstraintWidget.DimensionBehaviour t2 = constraintWidget.t(1);
                boolean z = t == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.e != 1 && t2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f != 1;
                if (!z && eVar.u(1) && !(constraintWidget instanceof android.support.constraint.solver.widgets.j)) {
                    if (t == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.e == 0 && t2 != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && !constraintWidget.I()) {
                        z = true;
                    }
                    if (t2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f == 0 && t != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && !constraintWidget.I()) {
                        z = true;
                    }
                    if ((t == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || t2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.G > 0.0f) {
                        z = true;
                    }
                }
                if (!z) {
                    a(i, constraintWidget, a.f1119a);
                    if (eVar.aT != null) {
                        eVar.aT.b++;
                    }
                }
            }
        }
        i.a();
    }

    public long a(android.support.constraint.solver.widgets.e eVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        boolean z3;
        boolean z4;
        int i14;
        InterfaceC0007b interfaceC0007b;
        int i15;
        int i16;
        int i17;
        boolean z5;
        boolean z6;
        InterfaceC0007b i18 = eVar.i();
        int size = eVar.az.size();
        int q = eVar.q();
        int s = eVar.s();
        boolean a2 = android.support.constraint.solver.widgets.i.a(i, 128);
        boolean z7 = a2 || android.support.constraint.solver.widgets.i.a(i, 64);
        if (z7) {
            for (int i19 = 0; i19 < size; i19++) {
                ConstraintWidget constraintWidget = eVar.az.get(i19);
                boolean z8 = (constraintWidget.G() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && (constraintWidget.H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.Z() > 0.0f;
                if ((constraintWidget.I() && z8) || ((constraintWidget.J() && z8) || (constraintWidget instanceof android.support.constraint.solver.widgets.j) || constraintWidget.I() || constraintWidget.J())) {
                    z7 = false;
                    break;
                }
            }
        }
        if (z7 && android.support.constraint.solver.e.g != null) {
            android.support.constraint.solver.e.g.f1108a++;
        }
        boolean z9 = z7 & ((i4 == 1073741824 && i6 == 1073741824) || a2);
        if (z9) {
            int min = Math.min(eVar.v(), i5);
            int min2 = Math.min(eVar.u(), i7);
            if (i4 == 1073741824 && eVar.q() != min) {
                eVar.j(min);
                eVar.c();
            }
            if (i6 == 1073741824 && eVar.s() != min2) {
                eVar.k(min2);
                eVar.c();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                z = eVar.f(a2);
                i10 = 2;
            } else {
                boolean g = eVar.g(a2);
                if (i4 == 1073741824) {
                    g &= eVar.a(a2, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    z = eVar.a(a2, 1) & g;
                    i10++;
                } else {
                    z = g;
                }
            }
            if (z) {
                eVar.a(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            z = false;
            i10 = 0;
        }
        if (!z || i10 != 2) {
            int b = eVar.b();
            if (size > 0) {
                b(eVar);
            }
            a(eVar);
            int size2 = this.f1118a.size();
            if (size > 0) {
                a(eVar, "First pass", q, s);
            }
            if (size2 > 0) {
                boolean z10 = eVar.G() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z11 = eVar.H() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                int max = Math.max(eVar.q(), this.c.Q());
                int max2 = Math.max(eVar.s(), this.c.R());
                int i20 = 0;
                boolean z12 = false;
                while (i20 < size2) {
                    ConstraintWidget constraintWidget2 = this.f1118a.get(i20);
                    if (constraintWidget2 instanceof android.support.constraint.solver.widgets.j) {
                        int q2 = constraintWidget2.q();
                        i15 = b;
                        int s2 = constraintWidget2.s();
                        i16 = q;
                        boolean a3 = a(i18, constraintWidget2, a.b) | z12;
                        if (eVar.aT != null) {
                            z5 = a3;
                            i17 = s;
                            eVar.aT.c++;
                        } else {
                            z5 = a3;
                            i17 = s;
                        }
                        int q3 = constraintWidget2.q();
                        int s3 = constraintWidget2.s();
                        if (q3 != q2) {
                            constraintWidget2.j(q3);
                            if (z10 && constraintWidget2.y() > max) {
                                max = Math.max(max, constraintWidget2.y() + constraintWidget2.a(ConstraintAnchor.Type.RIGHT).e());
                            }
                            z6 = true;
                        } else {
                            z6 = z5;
                        }
                        if (s3 != s2) {
                            constraintWidget2.k(s3);
                            if (z11 && constraintWidget2.z() > max2) {
                                max2 = Math.max(max2, constraintWidget2.z() + constraintWidget2.a(ConstraintAnchor.Type.BOTTOM).e());
                            }
                            z6 = true;
                        }
                        z12 = ((android.support.constraint.solver.widgets.j) constraintWidget2).i() | z6;
                    } else {
                        i15 = b;
                        i16 = q;
                        i17 = s;
                    }
                    i20++;
                    b = i15;
                    q = i16;
                    s = i17;
                }
                int i21 = b;
                int i22 = q;
                int i23 = s;
                int i24 = 0;
                int i25 = 2;
                while (true) {
                    if (i24 >= i25) {
                        i12 = i22;
                        i13 = i23;
                        z2 = z12;
                        break;
                    }
                    z2 = z12;
                    int i26 = 0;
                    while (i26 < size2) {
                        ConstraintWidget constraintWidget3 = this.f1118a.get(i26);
                        if ((!(constraintWidget3 instanceof android.support.constraint.solver.widgets.h) || (constraintWidget3 instanceof android.support.constraint.solver.widgets.j)) && !(constraintWidget3 instanceof android.support.constraint.solver.widgets.g) && constraintWidget3.m() != 8 && ((!z9 || !constraintWidget3.aB.g.j || !constraintWidget3.aF.g.j) && !(constraintWidget3 instanceof android.support.constraint.solver.widgets.j))) {
                            int q4 = constraintWidget3.q();
                            int s4 = constraintWidget3.s();
                            int B = constraintWidget3.B();
                            int i27 = a.b;
                            z4 = z9;
                            if (i24 == 1) {
                                i27 = a.c;
                            }
                            z2 |= a(i18, constraintWidget3, i27);
                            if (eVar.aT != null) {
                                i14 = size2;
                                interfaceC0007b = i18;
                                eVar.aT.c++;
                            } else {
                                i14 = size2;
                                interfaceC0007b = i18;
                            }
                            int q5 = constraintWidget3.q();
                            int s5 = constraintWidget3.s();
                            if (q5 != q4) {
                                constraintWidget3.j(q5);
                                if (z10 && constraintWidget3.y() > max) {
                                    max = Math.max(max, constraintWidget3.y() + constraintWidget3.a(ConstraintAnchor.Type.RIGHT).e());
                                }
                                z2 = true;
                            }
                            if (s5 != s4) {
                                constraintWidget3.k(s5);
                                if (z11 && constraintWidget3.z() > max2) {
                                    max2 = Math.max(max2, constraintWidget3.z() + constraintWidget3.a(ConstraintAnchor.Type.BOTTOM).e());
                                }
                                z2 = true;
                            }
                            if (constraintWidget3.A() && B != constraintWidget3.B()) {
                                z2 = true;
                            }
                        } else {
                            z4 = z9;
                            i14 = size2;
                            interfaceC0007b = i18;
                        }
                        i26++;
                        size2 = i14;
                        i18 = interfaceC0007b;
                        z9 = z4;
                    }
                    boolean z13 = z9;
                    int i28 = size2;
                    InterfaceC0007b interfaceC0007b2 = i18;
                    if (!z2) {
                        i12 = i22;
                        i13 = i23;
                        break;
                    }
                    a(eVar, "intermediate pass", i22, i23);
                    i24++;
                    i18 = interfaceC0007b2;
                    z9 = z13;
                    i25 = 2;
                    z12 = false;
                    size2 = i28;
                }
                if (z2) {
                    a(eVar, "2nd pass", i12, i13);
                    if (eVar.q() < max) {
                        eVar.j(max);
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (eVar.s() < max2) {
                        eVar.k(max2);
                        z3 = true;
                    }
                    if (z3) {
                        a(eVar, "3rd pass", i12, i13);
                    }
                }
                i11 = i21;
            } else {
                i11 = b;
            }
            eVar.a(i11);
            return 0L;
        }
        return 0L;
    }

    public void a(android.support.constraint.solver.widgets.e eVar) {
        this.f1118a.clear();
        int size = eVar.az.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = eVar.az.get(i);
            if (constraintWidget.G() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                this.f1118a.add(constraintWidget);
            }
        }
        eVar.c();
    }
}
