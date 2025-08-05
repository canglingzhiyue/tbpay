package android.support.constraint.solver.widgets.analyzer;

import android.support.constraint.solver.widgets.ConstraintAnchor;
import android.support.constraint.solver.widgets.ConstraintWidget;
import android.support.constraint.solver.widgets.analyzer.DependencyNode;
import android.support.constraint.solver.widgets.analyzer.WidgetRun;
import java.util.List;

/* loaded from: classes2.dex */
public class k extends WidgetRun {

    /* renamed from: a  reason: collision with root package name */
    private static int[] f1123a = new int[2];

    /* renamed from: android.support.constraint.solver.widgets.analyzer.k$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1124a = new int[WidgetRun.RunType.values().length];

        static {
            try {
                f1124a[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1124a[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1124a[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public k(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.j.e = DependencyNode.Type.LEFT;
        this.k.e = DependencyNode.Type.RIGHT;
        this.h = 0;
    }

    private void a(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else if (i5 != 1) {
                return;
            } else {
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6 && i7 <= i7) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i6 > i6 || i9 > i7) {
        } else {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x02b4, code lost:
        if (r14 != 1) goto L131;
     */
    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun, android.support.constraint.solver.widgets.analyzer.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.support.constraint.solver.widgets.analyzer.d r17) {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.analyzer.k.a(android.support.constraint.solver.widgets.analyzer.d):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    public boolean a() {
        return this.f != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.d.e == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    public void c() {
        this.e = null;
        this.j.a();
        this.k.a();
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
        this.g.j = false;
    }

    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    public void e() {
        if (this.j.j) {
            this.d.h(this.j.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    public void f() {
        ConstraintWidget l;
        List<d> list;
        d dVar;
        ConstraintWidget l2;
        if (this.d.d) {
            this.g.a(this.d.q());
        }
        if (!this.g.j) {
            this.f = this.d.G();
            if (this.f != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (this.f == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (((l2 = this.d.l()) != null && l2.G() == ConstraintWidget.DimensionBehaviour.FIXED) || l2.G() == ConstraintWidget.DimensionBehaviour.MATCH_PARENT)) {
                    int q = (l2.q() - this.d.s.e()) - this.d.u.e();
                    a(this.j, l2.aB.j, this.d.s.e());
                    a(this.k, l2.aB.k, -this.d.u.e());
                    this.g.a(q);
                    return;
                } else if (this.f == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.g.a(this.d.q());
                }
            }
        } else if (this.f == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (((l = this.d.l()) != null && l.G() == ConstraintWidget.DimensionBehaviour.FIXED) || l.G() == ConstraintWidget.DimensionBehaviour.MATCH_PARENT)) {
            a(this.j, l.aB.j, this.d.s.e());
            a(this.k, l.aB.k, -this.d.u.e());
            return;
        }
        if (this.g.j && this.d.d) {
            if (this.d.A[0].c != null && this.d.A[1].c != null) {
                if (this.d.I()) {
                    this.j.f = this.d.A[0].e();
                    this.k.f = -this.d.A[1].e();
                    return;
                }
                DependencyNode a2 = a(this.d.A[0]);
                if (a2 != null) {
                    a(this.j, a2, this.d.A[0].e());
                }
                DependencyNode a3 = a(this.d.A[1]);
                if (a3 != null) {
                    a(this.k, a3, -this.d.A[1].e());
                }
                this.j.b = true;
                this.k.b = true;
                return;
            } else if (this.d.A[0].c != null) {
                DependencyNode a4 = a(this.d.A[0]);
                if (a4 == null) {
                    return;
                }
                a(this.j, a4, this.d.A[0].e());
                a(this.k, this.j, this.g.g);
                return;
            } else if (this.d.A[1].c != null) {
                DependencyNode a5 = a(this.d.A[1]);
                if (a5 == null) {
                    return;
                }
                a(this.k, a5, -this.d.A[1].e());
                a(this.j, this.k, -this.g.g);
                return;
            } else if ((this.d instanceof android.support.constraint.solver.widgets.h) || this.d.l() == null || this.d.a(ConstraintAnchor.Type.CENTER).c != null) {
                return;
            } else {
                a(this.j, this.d.l().aB.j, this.d.o());
                a(this.k, this.j, this.g.g);
                return;
            }
        }
        if (this.f == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i = this.d.e;
            if (i == 2) {
                ConstraintWidget l3 = this.d.l();
                if (l3 != null) {
                    f fVar = l3.aF.g;
                    this.g.l.add(fVar);
                    fVar.k.add(this.g);
                    this.g.b = true;
                    this.g.k.add(this.j);
                    list = this.g.k;
                    dVar = this.k;
                    list.add(dVar);
                }
            } else if (i == 3) {
                if (this.d.f == 3) {
                    this.j.f1116a = this;
                    this.k.f1116a = this;
                    this.d.aF.j.f1116a = this;
                    this.d.aF.k.f1116a = this;
                    this.g.f1116a = this;
                    if (this.d.J()) {
                        this.g.l.add(this.d.aF.g);
                        this.d.aF.g.k.add(this.g);
                        this.d.aF.g.f1116a = this;
                        this.g.l.add(this.d.aF.j);
                        this.g.l.add(this.d.aF.k);
                        this.d.aF.j.k.add(this.g);
                        list = this.d.aF.k.k;
                    } else if (this.d.I()) {
                        this.d.aF.g.l.add(this.g);
                        list = this.g.k;
                        dVar = this.d.aF.g;
                        list.add(dVar);
                    } else {
                        list = this.d.aF.g.l;
                    }
                } else {
                    f fVar2 = this.d.aF.g;
                    this.g.l.add(fVar2);
                    fVar2.k.add(this.g);
                    this.d.aF.j.k.add(this.g);
                    this.d.aF.k.k.add(this.g);
                    this.g.b = true;
                    this.g.k.add(this.j);
                    this.g.k.add(this.k);
                    this.j.l.add(this.g);
                    list = this.k.l;
                }
                dVar = this.g;
                list.add(dVar);
            }
        }
        if (this.d.A[0].c != null && this.d.A[1].c != null) {
            if (this.d.I()) {
                this.j.f = this.d.A[0].e();
                this.k.f = -this.d.A[1].e();
                return;
            }
            DependencyNode a6 = a(this.d.A[0]);
            DependencyNode a7 = a(this.d.A[1]);
            a6.b(this);
            a7.b(this);
            this.l = WidgetRun.RunType.CENTER;
        } else if (this.d.A[0].c != null) {
            DependencyNode a8 = a(this.d.A[0]);
            if (a8 == null) {
                return;
            }
            a(this.j, a8, this.d.A[0].e());
            a(this.k, this.j, 1, this.g);
        } else if (this.d.A[1].c != null) {
            DependencyNode a9 = a(this.d.A[1]);
            if (a9 == null) {
                return;
            }
            a(this.k, a9, -this.d.A[1].e());
            a(this.j, this.k, -1, this.g);
        } else if ((this.d instanceof android.support.constraint.solver.widgets.h) || this.d.l() == null) {
        } else {
            a(this.j, this.d.l().aB.j, this.d.o());
            a(this.k, this.j, 1, this.g);
        }
    }

    public String toString() {
        return "HorizontalRun " + this.d.n();
    }
}
