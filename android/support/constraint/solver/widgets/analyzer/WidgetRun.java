package android.support.constraint.solver.widgets.analyzer;

import android.support.constraint.solver.widgets.ConstraintAnchor;
import android.support.constraint.solver.widgets.ConstraintWidget;

/* loaded from: classes2.dex */
public abstract class WidgetRun implements d {
    public int c;
    ConstraintWidget d;
    l e;
    protected ConstraintWidget.DimensionBehaviour f;
    f g = new f(this);
    public int h = 0;
    boolean i = false;
    public DependencyNode j = new DependencyNode(this);
    public DependencyNode k = new DependencyNode(this);
    protected RunType l = RunType.NONE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.constraint.solver.widgets.analyzer.WidgetRun$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1117a = new int[ConstraintAnchor.Type.values().length];

        static {
            try {
                f1117a[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1117a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1117a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1117a[ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1117a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes2.dex */
    enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.d = constraintWidget;
    }

    private void b(int i, int i2) {
        f fVar;
        int a2;
        int i3 = this.c;
        if (i3 == 0) {
            fVar = this.g;
            a2 = a(i2, i);
        } else if (i3 != 1) {
            if (i3 == 2) {
                ConstraintWidget l = this.d.l();
                if (l == null) {
                    return;
                }
                WidgetRun widgetRun = i == 0 ? l.aB : l.aF;
                if (!widgetRun.g.j) {
                    return;
                }
                this.g.a(a((int) ((widgetRun.g.g * (i == 0 ? this.d.j : this.d.m)) + 0.5f), i));
                return;
            } else if (i3 != 3) {
                return;
            } else {
                if (this.d.aB.f == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.d.aB.c == 3 && this.d.aF.f == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.d.aF.c == 3) {
                    return;
                }
                WidgetRun widgetRun2 = i == 0 ? this.d.aF : this.d.aB;
                if (!widgetRun2.g.j) {
                    return;
                }
                float Z = this.d.Z();
                this.g.a(i == 1 ? (int) ((widgetRun2.g.g / Z) + 0.5f) : (int) ((Z * widgetRun2.g.g) + 0.5f));
                return;
            }
        } else {
            int a3 = a(this.g.m, i);
            fVar = this.g;
            a2 = Math.min(a3, i2);
        }
        fVar.a(a2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int a(int i, int i2) {
        if (i2 != 0) {
            int i3 = this.d.l;
            int min = i3 > 0 ? Math.min(i3, i) : Math.max(this.d.k, i);
            return min != i ? min : i;
        }
        int i4 = this.d.i;
        int max = Math.max(this.d.h, i);
        if (i4 > 0) {
            max = Math.min(i4, i);
        }
        return max != i ? max : i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final DependencyNode a(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.c == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor.c.f1111a;
        int i = AnonymousClass1.f1117a[constraintAnchor.c.b.ordinal()];
        if (i == 1) {
            return constraintWidget.aB.j;
        }
        if (i == 2) {
            return constraintWidget.aB.k;
        }
        if (i == 3) {
            return constraintWidget.aF.j;
        }
        if (i == 4) {
            return constraintWidget.aF.f1126a;
        }
        if (i == 5) {
            return constraintWidget.aF.k;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final DependencyNode a(ConstraintAnchor constraintAnchor, int i) {
        if (constraintAnchor.c == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor.c.f1111a;
        WidgetRun widgetRun = i == 0 ? constraintWidget.aB : constraintWidget.aF;
        int i2 = AnonymousClass1.f1117a[constraintAnchor.c.b.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.k;
        }
        return widgetRun.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i) {
        dependencyNode.l.add(dependencyNode2);
        dependencyNode.f = i;
        dependencyNode2.k.add(dependencyNode);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i, f fVar) {
        dependencyNode.l.add(dependencyNode2);
        dependencyNode.l.add(this.g);
        dependencyNode.h = i;
        dependencyNode.i = fVar;
        dependencyNode2.k.add(dependencyNode);
        fVar.k.add(dependencyNode);
    }

    @Override // android.support.constraint.solver.widgets.analyzer.d
    public void a(d dVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(d dVar, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        DependencyNode dependencyNode;
        DependencyNode a2 = a(constraintAnchor);
        DependencyNode a3 = a(constraintAnchor2);
        if (!a2.j || !a3.j) {
            return;
        }
        int e = a2.g + constraintAnchor.e();
        int e2 = a3.g - constraintAnchor2.e();
        int i2 = e2 - e;
        if (!this.g.j && this.f == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            b(i, i2);
        }
        if (!this.g.j) {
            return;
        }
        if (this.g.g == i2) {
            this.j.a(e);
            dependencyNode = this.k;
        } else {
            float X = i == 0 ? this.d.X() : this.d.Y();
            if (a2 == a3) {
                e = a2.g;
                e2 = a3.g;
                X = 0.5f;
            }
            this.j.a((int) (e + 0.5f + (((e2 - e) - this.g.g) * X)));
            dependencyNode = this.k;
            e2 = this.j.g + this.g.g;
        }
        dependencyNode.a(e2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean a();

    public long b() {
        if (this.g.j) {
            return this.g.g;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c();

    abstract void d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f();

    public boolean g() {
        return this.i;
    }
}
