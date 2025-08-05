package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.ConstraintAnchor;
import android.support.constraint.solver.widgets.analyzer.WidgetRun;
import android.support.constraint.solver.widgets.analyzer.k;
import android.support.constraint.solver.widgets.analyzer.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.riy;

/* loaded from: classes2.dex */
public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    public static final int BOTH = 2;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static float R = 0.5f;
    public static final int UNKNOWN = -1;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    protected int P;
    protected int Q;
    float S;
    float T;
    boolean U;
    boolean V;
    public android.support.constraint.solver.widgets.analyzer.c W;
    public android.support.constraint.solver.widgets.analyzer.c X;
    boolean Y;
    int Z;
    int aI;
    int aJ;
    int aK;
    int aL;
    boolean aM;
    boolean aN;
    boolean aO;
    boolean aP;
    public int aQ;
    public int aR;
    int aa;
    boolean ab;
    boolean ac;
    public float[] ad;
    protected ConstraintWidget[] ae;
    protected ConstraintWidget[] af;
    ConstraintWidget ag;
    ConstraintWidget ah;
    private boolean ap;
    private Object aq;
    private int ar;
    private int as;
    private String at;
    private String au;
    public boolean n;
    public boolean o;
    public boolean d = false;
    public WidgetRun[] r = new WidgetRun[2];
    public k aB = null;
    public m aF = null;
    public boolean[] aG = {true, true};
    boolean aH = false;
    private boolean c = true;
    private boolean ak = false;
    private boolean al = true;
    private boolean am = false;
    private boolean an = false;

    /* renamed from: a  reason: collision with root package name */
    public int f1113a = -1;
    public int b = -1;
    public int e = 0;
    public int f = 0;
    public int[] g = new int[2];
    public int h = 0;
    public int i = 0;
    public float j = 1.0f;
    public int k = 0;
    public int l = 0;
    public float m = 1.0f;
    int p = -1;
    float q = 1.0f;
    private int[] ai = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    private float aj = 0.0f;
    private boolean ao = false;
    private boolean av = false;
    private int aw = 0;
    private int ax = 0;
    public ConstraintAnchor s = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
    public ConstraintAnchor t = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
    public ConstraintAnchor u = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
    public ConstraintAnchor v = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
    public ConstraintAnchor w = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
    ConstraintAnchor x = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
    ConstraintAnchor y = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
    public ConstraintAnchor z = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
    public ConstraintAnchor[] A = {this.s, this.u, this.t, this.v, this.w, this.z};
    protected ArrayList<ConstraintAnchor> B = new ArrayList<>();
    private boolean[] ay = new boolean[2];
    public DimensionBehaviour[] C = {DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
    public ConstraintWidget D = null;
    int E = 0;
    int F = 0;
    public float G = 0.0f;
    protected int H = -1;
    protected int I = 0;
    protected int J = 0;
    int K = 0;
    int L = 0;
    protected int M = 0;
    protected int N = 0;
    int O = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.constraint.solver.widgets.ConstraintWidget$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b = new int[DimensionBehaviour.values().length];

        static {
            try {
                b[DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1114a = new int[ConstraintAnchor.Type.values().length];
            try {
                f1114a[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1114a[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1114a[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1114a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1114a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1114a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1114a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1114a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1114a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public ConstraintWidget() {
        float f = R;
        this.S = f;
        this.T = f;
        this.ar = 0;
        this.as = 0;
        this.at = null;
        this.au = null;
        this.Y = false;
        this.Z = 0;
        this.aa = 0;
        this.ad = new float[]{-1.0f, -1.0f};
        this.ae = new ConstraintWidget[]{null, null};
        this.af = new ConstraintWidget[]{null, null};
        this.ag = null;
        this.ah = null;
        this.aQ = -1;
        this.aR = -1;
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:241:0x0431, code lost:
        if ((r3 instanceof android.support.constraint.solver.widgets.b) != false) goto L228;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x045e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x052e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:358:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.support.constraint.solver.e r35, boolean r36, boolean r37, boolean r38, boolean r39, android.support.constraint.solver.SolverVariable r40, android.support.constraint.solver.SolverVariable r41, android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour r42, boolean r43, android.support.constraint.solver.widgets.ConstraintAnchor r44, android.support.constraint.solver.widgets.ConstraintAnchor r45, int r46, int r47, int r48, int r49, float r50, boolean r51, boolean r52, boolean r53, boolean r54, boolean r55, int r56, int r57, int r58, int r59, float r60, boolean r61) {
        /*
            Method dump skipped, instructions count: 1391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.ConstraintWidget.a(android.support.constraint.solver.e, boolean, boolean, boolean, boolean, android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour, boolean, android.support.constraint.solver.widgets.ConstraintAnchor, android.support.constraint.solver.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private boolean a(int i) {
        int i2 = i << 1;
        if (this.A[i2].c != null) {
            ConstraintAnchor constraintAnchor = this.A[i2].c.c;
            ConstraintAnchor[] constraintAnchorArr = this.A;
            if (constraintAnchor == constraintAnchorArr[i2]) {
                return false;
            }
            int i3 = i2 + 1;
            return constraintAnchorArr[i3].c != null && this.A[i3].c.c == this.A[i3];
        }
        return false;
    }

    private void b() {
        this.B.add(this.s);
        this.B.add(this.t);
        this.B.add(this.u);
        this.B.add(this.v);
        this.B.add(this.x);
        this.B.add(this.y);
        this.B.add(this.z);
        this.B.add(this.w);
    }

    public boolean A() {
        return this.ao;
    }

    public int B() {
        return this.O;
    }

    public Object C() {
        return this.aq;
    }

    public int D() {
        return this.aw;
    }

    public int E() {
        return this.ax;
    }

    public void F() {
        ConstraintWidget l = l();
        if (l == null || !(l instanceof e) || !((e) l()).S()) {
            int size = this.B.size();
            for (int i = 0; i < size; i++) {
                this.B.get(i).i();
            }
        }
    }

    public DimensionBehaviour G() {
        return this.C[0];
    }

    public DimensionBehaviour H() {
        return this.C[1];
    }

    public boolean I() {
        if (this.s.c == null || this.s.c.c != this.s) {
            return this.u.c != null && this.u.c.c == this.u;
        }
        return true;
    }

    public boolean J() {
        if (this.t.c == null || this.t.c.c != this.t) {
            return this.v.c != null && this.v.c.c == this.v;
        }
        return true;
    }

    public boolean O() {
        return this.C[0] == DimensionBehaviour.MATCH_CONSTRAINT && this.C[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public void P() {
        if (this.aB == null) {
            this.aB = new k(this);
        }
        if (this.aF == null) {
            this.aF = new m(this);
        }
    }

    public int Q() {
        return this.P;
    }

    public int R() {
        return this.Q;
    }

    public int T() {
        ConstraintAnchor constraintAnchor = this.s;
        int i = 0;
        if (constraintAnchor != null) {
            i = 0 + constraintAnchor.d;
        }
        ConstraintAnchor constraintAnchor2 = this.u;
        return constraintAnchor2 != null ? i + constraintAnchor2.d : i;
    }

    public int W() {
        int i = 0;
        if (this.s != null) {
            i = 0 + this.t.d;
        }
        return this.u != null ? i + this.v.d : i;
    }

    public float X() {
        return this.S;
    }

    public float Y() {
        return this.T;
    }

    public float Z() {
        return this.G;
    }

    public ConstraintAnchor a(ConstraintAnchor.Type type) {
        switch (type) {
            case LEFT:
                return this.s;
            case TOP:
                return this.t;
            case RIGHT:
                return this.u;
            case BOTTOM:
                return this.v;
            case BASELINE:
                return this.w;
            case CENTER:
                return this.z;
            case CENTER_X:
                return this.x;
            case CENTER_Y:
                return this.y;
            case NONE:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public void a(float f) {
        this.S = f;
    }

    public void a(int i, int i2) {
        this.I = i;
        this.J = i2;
    }

    public void a(int i, int i2, int i3, float f) {
        this.e = i;
        this.h = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.i = i3;
        this.j = f;
        if (f <= 0.0f || f >= 1.0f || this.e != 0) {
            return;
        }
        this.e = 2;
    }

    public void a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.I = i;
        this.J = i2;
        if (this.as == 8) {
            this.E = 0;
            this.F = 0;
            return;
        }
        if (this.C[0] != DimensionBehaviour.FIXED || i7 >= (i5 = this.E)) {
            i5 = i7;
        }
        if (this.C[1] != DimensionBehaviour.FIXED || i8 >= (i6 = this.F)) {
            i6 = i8;
        }
        this.E = i5;
        this.F = i6;
        int i9 = this.F;
        int i10 = this.Q;
        if (i9 < i10) {
            this.F = i10;
        }
        int i11 = this.E;
        int i12 = this.P;
        if (i11 >= i12) {
            return;
        }
        this.E = i12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i, boolean z) {
        this.ay[i] = z;
    }

    public void a(android.support.constraint.solver.c cVar) {
        this.s.a(cVar);
        this.t.a(cVar);
        this.u.a(cVar);
        this.v.a(cVar);
        this.w.a(cVar);
        this.z.a(cVar);
        this.x.a(cVar);
        this.y.a(cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x0313, code lost:
        if (r0 == (-1)) goto L256;
     */
    /* JADX WARN: Removed duplicated region for block: B:205:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.support.constraint.solver.e r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.ConstraintWidget.a(android.support.constraint.solver.e, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f4, code lost:
        if (r6.j() != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0223, code lost:
        if (r6.j() != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0225, code lost:
        r4.i();
        r6.i();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.support.constraint.solver.widgets.ConstraintAnchor.Type r4, android.support.constraint.solver.widgets.ConstraintWidget r5, android.support.constraint.solver.widgets.ConstraintAnchor.Type r6, int r7) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.ConstraintWidget.a(android.support.constraint.solver.widgets.ConstraintAnchor$Type, android.support.constraint.solver.widgets.ConstraintWidget, android.support.constraint.solver.widgets.ConstraintAnchor$Type, int):void");
    }

    public void a(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        a(type).a(constraintWidget.a(type2), i, i2, true);
    }

    public void a(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.c() == this) {
            a(constraintAnchor.d(), constraintAnchor2.c(), constraintAnchor2.d(), i);
        }
    }

    public void a(DimensionBehaviour dimensionBehaviour) {
        this.C[0] = dimensionBehaviour;
    }

    public void a(ConstraintWidget constraintWidget) {
        this.D = constraintWidget;
    }

    public void a(ConstraintWidget constraintWidget, float f, int i) {
        a(ConstraintAnchor.Type.CENTER, constraintWidget, ConstraintAnchor.Type.CENTER, i, 0);
        this.aj = f;
    }

    public void a(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        this.f1113a = constraintWidget.f1113a;
        this.b = constraintWidget.b;
        this.e = constraintWidget.e;
        this.f = constraintWidget.f;
        int[] iArr = this.g;
        int[] iArr2 = constraintWidget.g;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.h = constraintWidget.h;
        this.i = constraintWidget.i;
        this.k = constraintWidget.k;
        this.l = constraintWidget.l;
        this.m = constraintWidget.m;
        this.n = constraintWidget.n;
        this.o = constraintWidget.o;
        this.p = constraintWidget.p;
        this.q = constraintWidget.q;
        int[] iArr3 = constraintWidget.ai;
        this.ai = Arrays.copyOf(iArr3, iArr3.length);
        this.aj = constraintWidget.aj;
        this.ao = constraintWidget.ao;
        this.ap = constraintWidget.ap;
        this.s.i();
        this.t.i();
        this.u.i();
        this.v.i();
        this.w.i();
        this.x.i();
        this.y.i();
        this.z.i();
        this.C = (DimensionBehaviour[]) Arrays.copyOf(this.C, 2);
        ConstraintWidget constraintWidget2 = null;
        this.D = this.D == null ? null : hashMap.get(constraintWidget.D);
        this.E = constraintWidget.E;
        this.F = constraintWidget.F;
        this.G = constraintWidget.G;
        this.H = constraintWidget.H;
        this.I = constraintWidget.I;
        this.J = constraintWidget.J;
        this.K = constraintWidget.K;
        this.L = constraintWidget.L;
        this.M = constraintWidget.M;
        this.N = constraintWidget.N;
        this.O = constraintWidget.O;
        this.P = constraintWidget.P;
        this.Q = constraintWidget.Q;
        this.S = constraintWidget.S;
        this.T = constraintWidget.T;
        this.aq = constraintWidget.aq;
        this.ar = constraintWidget.ar;
        this.as = constraintWidget.as;
        this.at = constraintWidget.at;
        this.au = constraintWidget.au;
        this.aI = constraintWidget.aI;
        this.aJ = constraintWidget.aJ;
        this.aK = constraintWidget.aK;
        this.aL = constraintWidget.aL;
        this.aM = constraintWidget.aM;
        this.aN = constraintWidget.aN;
        this.aO = constraintWidget.aO;
        this.aP = constraintWidget.aP;
        this.U = constraintWidget.U;
        this.V = constraintWidget.V;
        this.Z = constraintWidget.Z;
        this.aa = constraintWidget.aa;
        this.ab = constraintWidget.ab;
        this.ac = constraintWidget.ac;
        float[] fArr = this.ad;
        float[] fArr2 = constraintWidget.ad;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.ae;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.ae;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.af;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.af;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget3 = constraintWidget.ag;
        this.ag = constraintWidget3 == null ? null : hashMap.get(constraintWidget3);
        ConstraintWidget constraintWidget4 = constraintWidget.ah;
        if (constraintWidget4 != null) {
            constraintWidget2 = hashMap.get(constraintWidget4);
        }
        this.ah = constraintWidget2;
    }

    public void a(e eVar, android.support.constraint.solver.e eVar2, HashSet<ConstraintWidget> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            i.a(eVar, eVar2, this);
            hashSet.remove(this);
            a(eVar2, eVar.u(64));
        }
        if (i == 0) {
            HashSet<ConstraintAnchor> a2 = this.s.a();
            if (a2 != null) {
                Iterator<ConstraintAnchor> it = a2.iterator();
                while (it.hasNext()) {
                    it.next().f1111a.a(eVar, eVar2, hashSet, i, true);
                }
            }
            HashSet<ConstraintAnchor> a3 = this.u.a();
            if (a3 == null) {
                return;
            }
            Iterator<ConstraintAnchor> it2 = a3.iterator();
            while (it2.hasNext()) {
                it2.next().f1111a.a(eVar, eVar2, hashSet, i, true);
            }
            return;
        }
        HashSet<ConstraintAnchor> a4 = this.t.a();
        if (a4 != null) {
            Iterator<ConstraintAnchor> it3 = a4.iterator();
            while (it3.hasNext()) {
                it3.next().f1111a.a(eVar, eVar2, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> a5 = this.v.a();
        if (a5 != null) {
            Iterator<ConstraintAnchor> it4 = a5.iterator();
            while (it4.hasNext()) {
                it4.next().f1111a.a(eVar, eVar2, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> a6 = this.w.a();
        if (a6 == null) {
            return;
        }
        Iterator<ConstraintAnchor> it5 = a6.iterator();
        while (it5.hasNext()) {
            it5.next().f1111a.a(eVar, eVar2, hashSet, i, true);
        }
    }

    public void a(Object obj) {
        this.aq = obj;
    }

    public void a(String str) {
        this.at = str;
    }

    public void a(boolean z, boolean z2) {
        int i;
        int i2;
        boolean g = z & this.aB.g();
        boolean g2 = z2 & this.aF.g();
        int i3 = this.aB.j.g;
        int i4 = this.aF.j.g;
        int i5 = this.aB.k.g;
        int i6 = this.aF.k.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (g) {
            this.I = i3;
        }
        if (g2) {
            this.J = i4;
        }
        if (this.as == 8) {
            this.E = 0;
            this.F = 0;
            return;
        }
        if (g) {
            if (this.C[0] != DimensionBehaviour.FIXED || i8 >= (i2 = this.E)) {
                i2 = i8;
            }
            this.E = i2;
            int i10 = this.E;
            int i11 = this.P;
            if (i10 < i11) {
                this.E = i11;
            }
        }
        if (!g2) {
            return;
        }
        if (this.C[1] != DimensionBehaviour.FIXED || i9 >= (i = this.F)) {
            i = i9;
        }
        this.F = i;
        int i12 = this.F;
        int i13 = this.Q;
        if (i12 >= i13) {
            return;
        }
        this.F = i13;
    }

    public void a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.p == -1) {
            if (z3 && !z4) {
                this.p = 0;
            } else if (!z3 && z4) {
                this.p = 1;
                if (this.H == -1) {
                    this.q = 1.0f / this.q;
                }
            }
        }
        if (this.p == 0 && (!this.t.j() || !this.v.j())) {
            this.p = 1;
        } else if (this.p == 1 && (!this.s.j() || !this.u.j())) {
            this.p = 0;
        }
        if (this.p == -1 && (!this.t.j() || !this.v.j() || !this.s.j() || !this.u.j())) {
            if (this.t.j() && this.v.j()) {
                this.p = 0;
            } else if (this.s.j() && this.u.j()) {
                this.q = 1.0f / this.q;
                this.p = 1;
            }
        }
        if (this.p == -1) {
            if (this.h > 0 && this.k == 0) {
                this.p = 0;
            } else if (this.h != 0 || this.k <= 0) {
            } else {
                this.q = 1.0f / this.q;
                this.p = 1;
            }
        }
    }

    public boolean a() {
        return this.as != 8;
    }

    public int aa() {
        return this.H;
    }

    public int ab() {
        return this.Z;
    }

    public int ac() {
        return this.aa;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean ad() {
        return (this instanceof j) || (this instanceof g);
    }

    public void b(float f) {
        this.T = f;
    }

    public void b(int i, int i2) {
        this.s.a(i);
        this.u.a(i2);
        this.I = i;
        this.E = i2 - i;
        this.am = true;
    }

    public void b(int i, int i2, int i3, float f) {
        this.f = i;
        this.k = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.l = i3;
        this.m = f;
        if (f <= 0.0f || f >= 1.0f || this.f != 0) {
            return;
        }
        this.f = 2;
    }

    public void b(android.support.constraint.solver.e eVar) {
        eVar.a(this.s);
        eVar.a(this.t);
        eVar.a(this.u);
        eVar.a(this.v);
        if (this.O > 0) {
            eVar.a(this.w);
        }
    }

    public void b(android.support.constraint.solver.e eVar, boolean z) {
        m mVar;
        k kVar;
        int b = eVar.b(this.s);
        int b2 = eVar.b(this.t);
        int b3 = eVar.b(this.u);
        int b4 = eVar.b(this.v);
        if (z && (kVar = this.aB) != null && kVar.j.j && this.aB.k.j) {
            b = this.aB.j.g;
            b3 = this.aB.k.g;
        }
        if (z && (mVar = this.aF) != null && mVar.j.j && this.aF.k.j) {
            b2 = this.aF.j.g;
            b4 = this.aF.k.g;
        }
        int i = b4 - b2;
        if (b3 - b < 0 || i < 0 || b == Integer.MIN_VALUE || b == Integer.MAX_VALUE || b2 == Integer.MIN_VALUE || b2 == Integer.MAX_VALUE || b3 == Integer.MIN_VALUE || b3 == Integer.MAX_VALUE || b4 == Integer.MIN_VALUE || b4 == Integer.MAX_VALUE) {
            b4 = 0;
            b = 0;
            b2 = 0;
            b3 = 0;
        }
        a(b, b2, b3, b4);
    }

    public void b(DimensionBehaviour dimensionBehaviour) {
        this.C[1] = dimensionBehaviour;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please submit an issue!!! */
    public void b(String str) {
        float f;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.G = 0.0f;
            return;
        }
        int i2 = -1;
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i3 = 0;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            if (substring.equalsIgnoreCase("W")) {
                i2 = 0;
            } else if (substring.equalsIgnoreCase("H")) {
                i2 = 1;
            }
            i3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(i3);
            if (substring2.length() > 0) {
                f = Float.parseFloat(substring2);
            }
            f = 0.0f;
        } else {
            String substring3 = str.substring(i3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f = i2 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f = 0.0f;
        }
        i = (f > i ? 1 : (f == i ? 0 : -1));
        if (i <= 0) {
            return;
        }
        this.G = f;
        this.H = i2;
    }

    public void b(boolean z) {
        this.av = z;
    }

    public void c(float f) {
        this.ad[0] = f;
    }

    public void c(int i) {
        this.ai[0] = i;
    }

    public void c(int i, int i2) {
        this.I = i;
        this.E = i2 - i;
        int i3 = this.E;
        int i4 = this.P;
        if (i3 < i4) {
            this.E = i4;
        }
    }

    public void c(boolean z) {
        this.ao = z;
    }

    public void d(float f) {
        this.ad[1] = f;
    }

    public void d(int i) {
        this.ai[1] = i;
    }

    public void d(int i, int i2) {
        this.J = i;
        this.F = i2 - i;
        int i3 = this.F;
        int i4 = this.Q;
        if (i3 < i4) {
            this.F = i4;
        }
    }

    public void d(boolean z) {
        this.ap = z;
    }

    public boolean d() {
        if (!this.am) {
            return this.s.n() && this.u.n();
        }
        return true;
    }

    public void e(int i) {
        this.as = i;
    }

    public void e(int i, int i2) {
        this.t.a(i);
        this.v.a(i2);
        this.J = i;
        this.F = i2 - i;
        if (this.ao) {
            this.w.a(i + this.O);
        }
        this.an = true;
    }

    public void e(boolean z) {
        this.c = z;
    }

    public boolean e() {
        if (!this.an) {
            return this.t.n() && this.v.n();
        }
        return true;
    }

    public int f(int i) {
        if (i == 0) {
            return q();
        }
        if (i != 1) {
            return 0;
        }
        return s();
    }

    public void f(int i, int i2) {
        this.aw = i;
        this.ax = i2;
        e(false);
    }

    public float g(int i) {
        if (i == 0) {
            return this.S;
        }
        if (i != 1) {
            return -1.0f;
        }
        return this.T;
    }

    public void g() {
        this.s.i();
        this.t.i();
        this.u.i();
        this.v.i();
        this.w.i();
        this.x.i();
        this.y.i();
        this.z.i();
        this.D = null;
        this.aj = 0.0f;
        this.E = 0;
        this.F = 0;
        this.G = 0.0f;
        this.H = -1;
        this.I = 0;
        this.J = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        float f = R;
        this.S = f;
        this.T = f;
        this.C[0] = DimensionBehaviour.FIXED;
        this.C[1] = DimensionBehaviour.FIXED;
        this.aq = null;
        this.ar = 0;
        this.as = 0;
        this.au = null;
        this.U = false;
        this.V = false;
        this.Z = 0;
        this.aa = 0;
        this.ab = false;
        this.ac = false;
        float[] fArr = this.ad;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f1113a = -1;
        this.b = -1;
        int[] iArr = this.ai;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.e = 0;
        this.f = 0;
        this.j = 1.0f;
        this.m = 1.0f;
        this.i = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.h = 0;
        this.k = 0;
        this.aH = false;
        this.p = -1;
        this.q = 1.0f;
        this.Y = false;
        boolean[] zArr = this.aG;
        zArr[0] = true;
        zArr[1] = true;
        this.av = false;
        boolean[] zArr2 = this.ay;
        zArr2[0] = false;
        zArr2[1] = false;
        this.c = true;
    }

    public void h(int i) {
        this.I = i;
    }

    public void i(int i) {
        this.J = i;
    }

    public void j(int i) {
        this.E = i;
        int i2 = this.E;
        int i3 = this.P;
        if (i2 < i3) {
            this.E = i3;
        }
    }

    public void k() {
        this.am = false;
        this.an = false;
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            this.B.get(i).m();
        }
    }

    public void k(int i) {
        this.F = i;
        int i2 = this.F;
        int i3 = this.Q;
        if (i2 < i3) {
            this.F = i3;
        }
    }

    public ConstraintWidget l() {
        return this.D;
    }

    public void l(int i) {
        if (i < 0) {
            this.P = 0;
        } else {
            this.P = i;
        }
    }

    public int m() {
        return this.as;
    }

    public void m(int i) {
        if (i < 0) {
            this.Q = 0;
        } else {
            this.Q = i;
        }
    }

    public WidgetRun n(int i) {
        if (i == 0) {
            return this.aB;
        }
        if (i != 1) {
            return null;
        }
        return this.aF;
    }

    public String n() {
        return this.at;
    }

    public int o() {
        ConstraintWidget constraintWidget = this.D;
        return (constraintWidget == null || !(constraintWidget instanceof e)) ? this.I : ((e) constraintWidget).aj + this.I;
    }

    public void o(int i) {
        this.s.a(i);
        this.I = i;
    }

    public int p() {
        ConstraintWidget constraintWidget = this.D;
        return (constraintWidget == null || !(constraintWidget instanceof e)) ? this.J : ((e) constraintWidget).ak + this.J;
    }

    public void p(int i) {
        this.t.a(i);
        this.J = i;
    }

    public int q() {
        if (this.as == 8) {
            return 0;
        }
        return this.E;
    }

    public void q(int i) {
        this.O = i;
        this.ao = i > 0;
    }

    public void r(int i) {
        this.Z = i;
    }

    public boolean r() {
        int size = this.B.size();
        for (int i = 0; i < size; i++) {
            if (this.B.get(i).f()) {
                return true;
            }
        }
        return false;
    }

    public int s() {
        if (this.as == 8) {
            return 0;
        }
        return this.F;
    }

    public void s(int i) {
        this.aa = i;
    }

    public DimensionBehaviour t(int i) {
        if (i == 0) {
            return G();
        }
        if (i != 1) {
            return null;
        }
        return H();
    }

    public boolean t() {
        return this.av;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.au != null) {
            str = "type: " + this.au + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.at != null) {
            str2 = ResponseProtocolType.ID + this.at + " ";
        }
        sb.append(str2);
        sb.append(riy.BRACKET_START_STR);
        sb.append(this.I);
        sb.append(", ");
        sb.append(this.J);
        sb.append(") - (");
        sb.append(this.E);
        sb.append(" x ");
        sb.append(this.F);
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }

    public int u() {
        return this.ai[1];
    }

    public int v() {
        return this.ai[0];
    }

    public void w(int i) {
        if (!this.ao) {
            return;
        }
        int i2 = i - this.O;
        int i3 = this.F + i2;
        this.J = i2;
        this.t.a(i2);
        this.v.a(i3);
        this.w.a(i);
        this.an = true;
    }

    public boolean w() {
        return this.ap;
    }

    public boolean x() {
        return this.c && this.as != 8;
    }

    public boolean x(int i) {
        if (i == 0) {
            return (this.s.c != null ? 1 : 0) + (this.u.c != null ? 1 : 0) < 2;
        }
        return ((this.t.c != null ? 1 : 0) + (this.v.c != null ? 1 : 0)) + (this.w.c != null ? 1 : 0) < 2;
    }

    public int y() {
        return o() + this.E;
    }

    public ConstraintWidget y(int i) {
        ConstraintAnchor constraintAnchor;
        if (i == 0) {
            if (this.s.c == null) {
                return null;
            }
            ConstraintAnchor constraintAnchor2 = this.s.c.c;
            constraintAnchor = this.s;
            if (constraintAnchor2 != constraintAnchor) {
                return null;
            }
        } else if (i != 1 || this.t.c == null) {
            return null;
        } else {
            ConstraintAnchor constraintAnchor3 = this.t.c.c;
            constraintAnchor = this.t;
            if (constraintAnchor3 != constraintAnchor) {
                return null;
            }
        }
        return constraintAnchor.c.f1111a;
    }

    public int z() {
        return p() + this.F;
    }

    public ConstraintWidget z(int i) {
        ConstraintAnchor constraintAnchor;
        if (i == 0) {
            if (this.u.c == null) {
                return null;
            }
            ConstraintAnchor constraintAnchor2 = this.u.c.c;
            constraintAnchor = this.u;
            if (constraintAnchor2 != constraintAnchor) {
                return null;
            }
        } else if (i != 1 || this.v.c == null) {
            return null;
        } else {
            ConstraintAnchor constraintAnchor3 = this.v.c.c;
            constraintAnchor = this.v;
            if (constraintAnchor3 != constraintAnchor) {
                return null;
            }
        }
        return constraintAnchor.c.f1111a;
    }
}
