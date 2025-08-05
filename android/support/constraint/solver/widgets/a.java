package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class a extends j {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_NONE = 0;
    private ConstraintWidget[] aW;
    private int al = -1;
    private int am = -1;
    private int an = -1;
    private int ao = -1;
    private int ap = -1;
    private int aq = -1;
    private float ar = 0.5f;
    private float as = 0.5f;
    private float at = 0.5f;
    private float au = 0.5f;
    private float av = 0.5f;
    private float aw = 0.5f;
    private int ax = 0;
    private int ay = 0;
    private int az = 2;
    private int aA = 2;
    private int aC = 0;
    private int aD = -1;
    private int aE = 0;
    private ArrayList<C0006a> aS = new ArrayList<>();
    private ConstraintWidget[] aT = null;
    private ConstraintWidget[] aU = null;
    private int[] aV = null;
    private int aX = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.constraint.solver.widgets.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0006a {
        private int c;
        private ConstraintAnchor e;
        private ConstraintAnchor f;
        private ConstraintAnchor g;
        private ConstraintAnchor h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int r;
        private ConstraintWidget d = null;

        /* renamed from: a  reason: collision with root package name */
        int f1115a = 0;
        private int m = 0;
        private int n = 0;
        private int o = 0;
        private int p = 0;
        private int q = 0;

        public C0006a(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2) {
            this.c = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.l = 0;
            this.r = 0;
            this.c = i;
            this.e = constraintAnchor;
            this.f = constraintAnchor2;
            this.g = constraintAnchor3;
            this.h = constraintAnchor4;
            this.i = a.this.f();
            this.j = a.this.b();
            this.k = a.this.h();
            this.l = a.this.c();
            this.r = i2;
        }

        private void d() {
            this.m = 0;
            this.n = 0;
            this.d = null;
            this.f1115a = 0;
            int i = this.p;
            for (int i2 = 0; i2 < i && this.o + i2 < a.this.aX; i2++) {
                ConstraintWidget constraintWidget = a.this.aW[this.o + i2];
                if (this.c == 0) {
                    int q = constraintWidget.q();
                    int i3 = a.this.ax;
                    if (constraintWidget.m() == 8) {
                        i3 = 0;
                    }
                    this.m += q + i3;
                    int b = a.this.b(constraintWidget, this.r);
                    if (this.d == null || this.f1115a < b) {
                        this.d = constraintWidget;
                        this.f1115a = b;
                        this.n = b;
                    }
                } else {
                    int a2 = a.this.a(constraintWidget, this.r);
                    int b2 = a.this.b(constraintWidget, this.r);
                    int i4 = a.this.ay;
                    if (constraintWidget.m() == 8) {
                        i4 = 0;
                    }
                    this.n += b2 + i4;
                    if (this.d == null || this.f1115a < a2) {
                        this.d = constraintWidget;
                        this.f1115a = a2;
                        this.m = a2;
                    }
                }
            }
        }

        public void a() {
            this.f1115a = 0;
            this.d = null;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
            this.q = 0;
        }

        public void a(int i) {
            this.o = i;
        }

        public void a(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2, int i3, int i4, int i5, int i6) {
            this.c = i;
            this.e = constraintAnchor;
            this.f = constraintAnchor2;
            this.g = constraintAnchor3;
            this.h = constraintAnchor4;
            this.i = i2;
            this.j = i3;
            this.k = i4;
            this.l = i5;
            this.r = i6;
        }

        public void a(ConstraintWidget constraintWidget) {
            int i = 0;
            if (this.c == 0) {
                int a2 = a.this.a(constraintWidget, this.r);
                if (constraintWidget.G() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.q++;
                    a2 = 0;
                }
                int i2 = a.this.ax;
                if (constraintWidget.m() != 8) {
                    i = i2;
                }
                this.m += a2 + i;
                int b = a.this.b(constraintWidget, this.r);
                if (this.d == null || this.f1115a < b) {
                    this.d = constraintWidget;
                    this.f1115a = b;
                    this.n = b;
                }
            } else {
                int a3 = a.this.a(constraintWidget, this.r);
                int b2 = a.this.b(constraintWidget, this.r);
                if (constraintWidget.H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.q++;
                    b2 = 0;
                }
                int i3 = a.this.ay;
                if (constraintWidget.m() != 8) {
                    i = i3;
                }
                this.n += b2 + i;
                if (this.d == null || this.f1115a < a3) {
                    this.d = constraintWidget;
                    this.f1115a = a3;
                    this.m = a3;
                }
            }
            this.p++;
        }

        /* JADX WARN: Removed duplicated region for block: B:131:0x024a  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x0298  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x02a3  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x02ce  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(boolean r17, int r18, boolean r19) {
            /*
                Method dump skipped, instructions count: 819
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.a.C0006a.a(boolean, int, boolean):void");
        }

        public int b() {
            return this.c == 0 ? this.m - a.this.ax : this.m;
        }

        public void b(int i) {
            a aVar;
            ConstraintWidget.DimensionBehaviour G;
            int q;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour;
            int i2;
            int i3 = this.q;
            if (i3 == 0) {
                return;
            }
            int i4 = this.p;
            int i5 = i / i3;
            for (int i6 = 0; i6 < i4 && this.o + i6 < a.this.aX; i6++) {
                ConstraintWidget constraintWidget = a.this.aW[this.o + i6];
                if (this.c == 0) {
                    if (constraintWidget != null && constraintWidget.G() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.e == 0) {
                        aVar = a.this;
                        G = ConstraintWidget.DimensionBehaviour.FIXED;
                        dimensionBehaviour = constraintWidget.H();
                        i2 = constraintWidget.s();
                        q = i5;
                        aVar.a(constraintWidget, G, q, dimensionBehaviour, i2);
                    }
                } else {
                    if (constraintWidget != null && constraintWidget.H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f == 0) {
                        aVar = a.this;
                        G = constraintWidget.G();
                        q = constraintWidget.q();
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
                        i2 = i5;
                        aVar.a(constraintWidget, G, q, dimensionBehaviour, i2);
                    }
                }
            }
            d();
        }

        public int c() {
            return this.c == 1 ? this.n - a.this.ay : this.n;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int a(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.G() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            if (constraintWidget.e == 0) {
                return 0;
            }
            if (constraintWidget.e == 2) {
                int i2 = (int) (constraintWidget.j * i);
                if (i2 != constraintWidget.q()) {
                    constraintWidget.e(true);
                    a(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i2, constraintWidget.H(), constraintWidget.s());
                }
                return i2;
            } else if (constraintWidget.e == 1) {
                return constraintWidget.q();
            } else {
                if (constraintWidget.e == 3) {
                    return (int) ((constraintWidget.s() * constraintWidget.G) + 0.5f);
                }
            }
        }
        return constraintWidget.q();
    }

    private void a(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            return;
        }
        this.aS.clear();
        C0006a c0006a = new C0006a(i2, this.s, this.t, this.u, this.v, i3);
        this.aS.add(c0006a);
        if (i2 == 0) {
            C0006a c0006a2 = c0006a;
            i4 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i8 < i) {
                ConstraintWidget constraintWidget = constraintWidgetArr[i8];
                int a2 = a(constraintWidget, i3);
                if (constraintWidget.G() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i9 = i4;
                boolean z = (i7 == i3 || (this.ax + i7) + a2 > i3) && c0006a2.d != null;
                if (!z && i8 > 0 && (i6 = this.aD) > 0 && i8 % i6 == 0) {
                    z = true;
                }
                if (z) {
                    C0006a c0006a3 = new C0006a(i2, this.s, this.t, this.u, this.v, i3);
                    c0006a3.a(i8);
                    this.aS.add(c0006a3);
                    i7 = a2;
                    c0006a2 = c0006a3;
                } else {
                    i7 = i8 > 0 ? i7 + this.ax + a2 : a2;
                }
                c0006a2.a(constraintWidget);
                i8++;
                i4 = i9;
            }
        } else {
            C0006a c0006a4 = c0006a;
            i4 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i11 < i) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i11];
                int b = b(constraintWidget2, i3);
                if (constraintWidget2.H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i12 = i4;
                boolean z2 = (i10 == i3 || (this.ay + i10) + b > i3) && c0006a4.d != null;
                if (!z2 && i11 > 0 && (i5 = this.aD) > 0 && i11 % i5 == 0) {
                    z2 = true;
                }
                if (z2) {
                    C0006a c0006a5 = new C0006a(i2, this.s, this.t, this.u, this.v, i3);
                    c0006a5.a(i11);
                    this.aS.add(c0006a5);
                    i10 = b;
                    c0006a4 = c0006a5;
                } else {
                    i10 = i11 > 0 ? i10 + this.ay + b : b;
                }
                c0006a4.a(constraintWidget2);
                i11++;
                i4 = i12;
            }
        }
        int size = this.aS.size();
        ConstraintAnchor constraintAnchor = this.s;
        ConstraintAnchor constraintAnchor2 = this.t;
        ConstraintAnchor constraintAnchor3 = this.u;
        ConstraintAnchor constraintAnchor4 = this.v;
        int f = f();
        int b2 = b();
        int h = h();
        int c = c();
        boolean z3 = G() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || H() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i4 > 0 && z3) {
            for (int i13 = 0; i13 < size; i13++) {
                C0006a c0006a6 = this.aS.get(i13);
                c0006a6.b(i3 - (i2 == 0 ? c0006a6.b() : c0006a6.c()));
            }
        }
        ConstraintAnchor constraintAnchor5 = constraintAnchor3;
        int i14 = b2;
        int i15 = h;
        int i16 = c;
        ConstraintAnchor constraintAnchor6 = constraintAnchor;
        int i17 = f;
        int i18 = 0;
        ConstraintAnchor constraintAnchor7 = constraintAnchor4;
        ConstraintAnchor constraintAnchor8 = constraintAnchor2;
        int i19 = 0;
        for (int i20 = 0; i20 < size; i20++) {
            C0006a c0006a7 = this.aS.get(i20);
            if (i2 == 0) {
                if (i20 < size - 1) {
                    constraintAnchor7 = this.aS.get(i20 + 1).d.t;
                    i16 = 0;
                } else {
                    constraintAnchor7 = this.v;
                    i16 = c();
                }
                constraintAnchor8 = c0006a7.d.v;
                c0006a7.a(i2, constraintAnchor6, constraintAnchor8, constraintAnchor5, constraintAnchor7, i17, i14, i15, i16, i3);
                i18 = Math.max(i18, c0006a7.b());
                i19 += c0006a7.c();
                if (i20 > 0) {
                    i19 += this.ay;
                }
                i14 = 0;
            } else {
                if (i20 < size - 1) {
                    constraintAnchor5 = this.aS.get(i20 + 1).d.s;
                    i15 = 0;
                } else {
                    constraintAnchor5 = this.u;
                    i15 = h();
                }
                constraintAnchor6 = c0006a7.d.u;
                c0006a7.a(i2, constraintAnchor6, constraintAnchor8, constraintAnchor5, constraintAnchor7, i17, i14, i15, i16, i3);
                i18 += c0006a7.b();
                i19 = Math.max(i19, c0006a7.c());
                if (i20 > 0) {
                    i18 += this.ax;
                }
                i17 = 0;
            }
        }
        iArr[0] = i18;
        iArr[1] = i19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int b(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            if (constraintWidget.f == 0) {
                return 0;
            }
            if (constraintWidget.f == 2) {
                int i2 = (int) (constraintWidget.m * i);
                if (i2 != constraintWidget.s()) {
                    constraintWidget.e(true);
                    a(constraintWidget, constraintWidget.G(), constraintWidget.q(), ConstraintWidget.DimensionBehaviour.FIXED, i2);
                }
                return i2;
            } else if (constraintWidget.f == 1) {
                return constraintWidget.s();
            } else {
                if (constraintWidget.f == 3) {
                    return (int) ((constraintWidget.q() * constraintWidget.G) + 0.5f);
                }
            }
        }
        return constraintWidget.s();
    }

    private void b(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        C0006a c0006a;
        if (i == 0) {
            return;
        }
        if (this.aS.size() == 0) {
            c0006a = new C0006a(i2, this.s, this.t, this.u, this.v, i3);
            this.aS.add(c0006a);
        } else {
            C0006a c0006a2 = this.aS.get(0);
            c0006a2.a();
            c0006a = c0006a2;
            c0006a.a(i2, this.s, this.t, this.u, this.v, f(), b(), h(), c(), i3);
        }
        for (int i4 = 0; i4 < i; i4++) {
            c0006a.a(constraintWidgetArr[i4]);
        }
        iArr[0] = c0006a.b();
        iArr[1] = c0006a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x0118 -> B:41:0x0061). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x011a -> B:41:0x0061). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x0120 -> B:41:0x0061). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x0122 -> B:41:0x0061). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(android.support.constraint.solver.widgets.ConstraintWidget[] r17, int r18, int r19, int r20, int[] r21) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.a.c(android.support.constraint.solver.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    private void g(boolean z) {
        ConstraintWidget constraintWidget;
        if (this.aV == null || this.aU == null || this.aT == null) {
            return;
        }
        for (int i = 0; i < this.aX; i++) {
            this.aW[i].F();
        }
        int[] iArr = this.aV;
        int i2 = iArr[0];
        int i3 = iArr[1];
        ConstraintWidget constraintWidget2 = null;
        for (int i4 = 0; i4 < i2; i4++) {
            ConstraintWidget constraintWidget3 = this.aU[z ? (i2 - i4) - 1 : i4];
            if (constraintWidget3 != null && constraintWidget3.m() != 8) {
                if (i4 == 0) {
                    constraintWidget3.a(constraintWidget3.s, this.s, f());
                    constraintWidget3.r(this.al);
                    constraintWidget3.a(this.ar);
                }
                if (i4 == i2 - 1) {
                    constraintWidget3.a(constraintWidget3.u, this.u, h());
                }
                if (i4 > 0) {
                    constraintWidget3.a(constraintWidget3.s, constraintWidget2.u, this.ax);
                    constraintWidget2.a(constraintWidget2.u, constraintWidget3.s, 0);
                }
                constraintWidget2 = constraintWidget3;
            }
        }
        for (int i5 = 0; i5 < i3; i5++) {
            ConstraintWidget constraintWidget4 = this.aT[i5];
            if (constraintWidget4 != null && constraintWidget4.m() != 8) {
                if (i5 == 0) {
                    constraintWidget4.a(constraintWidget4.t, this.t, b());
                    constraintWidget4.s(this.am);
                    constraintWidget4.b(this.as);
                }
                if (i5 == i3 - 1) {
                    constraintWidget4.a(constraintWidget4.v, this.v, c());
                }
                if (i5 > 0) {
                    constraintWidget4.a(constraintWidget4.t, constraintWidget2.v, this.ay);
                    constraintWidget2.a(constraintWidget2.v, constraintWidget4.t, 0);
                }
                constraintWidget2 = constraintWidget4;
            }
        }
        for (int i6 = 0; i6 < i2; i6++) {
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = (i7 * i2) + i6;
                if (this.aE == 1) {
                    i8 = (i6 * i3) + i7;
                }
                ConstraintWidget[] constraintWidgetArr = this.aW;
                if (i8 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i8]) != null && constraintWidget.m() != 8) {
                    ConstraintWidget constraintWidget5 = this.aU[i6];
                    ConstraintWidget constraintWidget6 = this.aT[i7];
                    if (constraintWidget != constraintWidget5) {
                        constraintWidget.a(constraintWidget.s, constraintWidget5.s, 0);
                        constraintWidget.a(constraintWidget.u, constraintWidget5.u, 0);
                    }
                    if (constraintWidget != constraintWidget6) {
                        constraintWidget.a(constraintWidget.t, constraintWidget6.t, 0);
                        constraintWidget.a(constraintWidget.v, constraintWidget6.v, 0);
                    }
                }
            }
        }
    }

    public void A(int i) {
        this.aq = i;
    }

    public void B(int i) {
        this.al = i;
    }

    public void C(int i) {
        this.am = i;
    }

    public void D(int i) {
        this.az = i;
    }

    public void E(int i) {
        this.aA = i;
    }

    public void F(int i) {
        this.aC = i;
    }

    public void G(int i) {
        this.ax = i;
    }

    public void H(int i) {
        this.ay = i;
    }

    public void I(int i) {
        this.aD = i;
    }

    public void a(int i) {
        this.aE = i;
    }

    @Override // android.support.constraint.solver.widgets.ConstraintWidget
    public void a(android.support.constraint.solver.e eVar, boolean z) {
        super.a(eVar, z);
        boolean M = l() != null ? ((e) l()).M() : false;
        int i = this.aC;
        if (i != 0) {
            if (i == 1) {
                int size = this.aS.size();
                int i2 = 0;
                while (i2 < size) {
                    this.aS.get(i2).a(M, i2, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2) {
                g(M);
            }
        } else if (this.aS.size() > 0) {
            this.aS.get(0).a(M, 0, true);
        }
        f(false);
    }

    @Override // android.support.constraint.solver.widgets.f, android.support.constraint.solver.widgets.ConstraintWidget
    public void a(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.a(constraintWidget, hashMap);
        a aVar = (a) constraintWidget;
        this.al = aVar.al;
        this.am = aVar.am;
        this.an = aVar.an;
        this.ao = aVar.ao;
        this.ap = aVar.ap;
        this.aq = aVar.aq;
        this.ar = aVar.ar;
        this.as = aVar.as;
        this.at = aVar.at;
        this.au = aVar.au;
        this.av = aVar.av;
        this.aw = aVar.aw;
        this.ax = aVar.ax;
        this.ay = aVar.ay;
        this.az = aVar.az;
        this.aA = aVar.aA;
        this.aC = aVar.aC;
        this.aD = aVar.aD;
        this.aE = aVar.aE;
    }

    public void b(int i) {
        this.an = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r19.am == (-1)) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (r19.am == (-1)) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        r19.am = 0;
     */
    @Override // android.support.constraint.solver.widgets.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.a.b(int, int, int, int):void");
    }

    public void e(float f) {
        this.ar = f;
    }

    public void f(float f) {
        this.as = f;
    }

    public void g(float f) {
        this.at = f;
    }

    public void h(float f) {
        this.au = f;
    }

    public void i(float f) {
        this.av = f;
    }

    public void j(float f) {
        this.aw = f;
    }

    public void u(int i) {
        this.ao = i;
    }

    public void v(int i) {
        this.ap = i;
    }
}
