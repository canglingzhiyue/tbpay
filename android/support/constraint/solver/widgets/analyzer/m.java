package android.support.constraint.solver.widgets.analyzer;

import android.support.constraint.solver.widgets.ConstraintWidget;
import android.support.constraint.solver.widgets.analyzer.DependencyNode;
import android.support.constraint.solver.widgets.analyzer.WidgetRun;

/* loaded from: classes2.dex */
public class m extends WidgetRun {

    /* renamed from: a  reason: collision with root package name */
    public DependencyNode f1126a;
    f b;

    /* renamed from: android.support.constraint.solver.widgets.analyzer.m$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1127a = new int[WidgetRun.RunType.values().length];

        static {
            try {
                f1127a[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1127a[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1127a[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public m(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f1126a = new DependencyNode(this);
        this.b = null;
        this.j.e = DependencyNode.Type.TOP;
        this.k.e = DependencyNode.Type.BOTTOM;
        this.f1126a.e = DependencyNode.Type.BASELINE;
        this.h = 1;
    }

    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun, android.support.constraint.solver.widgets.analyzer.d
    public void a(d dVar) {
        f fVar;
        float f;
        int i;
        int i2 = AnonymousClass1.f1127a[this.l.ordinal()];
        if (i2 != 1 && i2 != 2 && i2 == 3) {
            a(dVar, this.d.t, this.d.v, 1);
            return;
        }
        if (this.g.c && !this.g.j && this.f == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i3 = this.d.f;
            if (i3 == 2) {
                ConstraintWidget l = this.d.l();
                if (l != null && l.aF.g.j) {
                    f = l.aF.g.g * this.d.m;
                    i = (int) (f + 0.5f);
                }
            } else if (i3 == 3 && this.d.aB.g.j) {
                int aa = this.d.aa();
                if (aa != -1) {
                    if (aa == 0) {
                        f = this.d.aB.g.g * this.d.Z();
                        i = (int) (f + 0.5f);
                    } else if (aa != 1) {
                        i = 0;
                    }
                }
                f = this.d.aB.g.g / this.d.Z();
                i = (int) (f + 0.5f);
            }
            this.g.a(i);
        }
        if (!this.j.c || !this.k.c) {
            return;
        }
        if (this.j.j && this.k.j && this.g.j) {
            return;
        }
        if (!this.g.j && this.f == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.d.e == 0 && !this.d.J()) {
            int i4 = this.j.l.get(0).g + this.j.f;
            int i5 = this.k.l.get(0).g + this.k.f;
            this.j.a(i4);
            this.k.a(i5);
            this.g.a(i5 - i4);
            return;
        }
        if (!this.g.j && this.f == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.c == 1 && this.j.l.size() > 0 && this.k.l.size() > 0) {
            int i6 = (this.k.l.get(0).g + this.k.f) - (this.j.l.get(0).g + this.j.f);
            if (i6 < this.g.m) {
                fVar = this.g;
            } else {
                fVar = this.g;
                i6 = this.g.m;
            }
            fVar.a(i6);
        }
        if (!this.g.j || this.j.l.size() <= 0 || this.k.l.size() <= 0) {
            return;
        }
        DependencyNode dependencyNode = this.j.l.get(0);
        DependencyNode dependencyNode2 = this.k.l.get(0);
        int i7 = dependencyNode.g + this.j.f;
        int i8 = dependencyNode2.g + this.k.f;
        float Y = this.d.Y();
        if (dependencyNode == dependencyNode2) {
            i7 = dependencyNode.g;
            i8 = dependencyNode2.g;
            Y = 0.5f;
        }
        this.j.a((int) (i7 + 0.5f + (((i8 - i7) - this.g.g) * Y)));
        this.k.a(this.j.g + this.g.g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    public boolean a() {
        return this.f != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.d.f == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    public void c() {
        this.e = null;
        this.j.a();
        this.k.a();
        this.f1126a.a();
        this.g.a();
        this.i = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    public void d() {
        this.i = false;
        this.j.a();
        this.j.j = false;
        this.k.a();
        this.k.j = false;
        this.f1126a.a();
        this.f1126a.j = false;
        this.g.j = false;
    }

    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    public void e() {
        if (this.j.j) {
            this.d.i(this.j.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0346, code lost:
        if (r7.d.A() != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0348, code lost:
        r0 = r7.f1126a;
        r1 = r7.j;
        r2 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03ab, code lost:
        if (r7.d.aB.f == android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03e5, code lost:
        if (r7.d.A() != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x046a, code lost:
        if (r7.d.aB.f == android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x046c, code lost:
        r7.d.aB.g.k.add(r7.g);
        r7.g.l.add(r7.d.aB.g);
        r7.g.f1116a = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f() {
        /*
            Method dump skipped, instructions count: 1177
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.analyzer.m.f():void");
    }

    public String toString() {
        return "VerticalRun " + this.d.n();
    }
}
