package android.support.constraint.solver.widgets.analyzer;

import android.support.constraint.solver.widgets.ConstraintWidget;
import android.support.constraint.solver.widgets.analyzer.DependencyNode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class j extends WidgetRun {
    public j(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    private void a(DependencyNode dependencyNode) {
        this.j.k.add(dependencyNode);
        dependencyNode.l.add(this.j);
    }

    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun, android.support.constraint.solver.widgets.analyzer.d
    public void a(d dVar) {
        android.support.constraint.solver.widgets.b bVar = (android.support.constraint.solver.widgets.b) this.d;
        int c = bVar.c();
        int i = -1;
        int i2 = 0;
        for (DependencyNode dependencyNode : this.j.l) {
            int i3 = dependencyNode.g;
            if (i == -1 || i3 < i) {
                i = i3;
            }
            if (i2 < i3) {
                i2 = i3;
            }
        }
        if (c == 0 || c == 2) {
            this.j.a(i + bVar.h());
        } else {
            this.j.a(i2 + bVar.h());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    public boolean a() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    public void c() {
        this.e = null;
        this.j.a();
    }

    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    void d() {
        this.j.j = false;
    }

    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    public void e() {
        if (this.d instanceof android.support.constraint.solver.widgets.b) {
            int c = ((android.support.constraint.solver.widgets.b) this.d).c();
            if (c == 0 || c == 1) {
                this.d.h(this.j.g);
            } else {
                this.d.i(this.j.g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    public void f() {
        DependencyNode dependencyNode;
        if (this.d instanceof android.support.constraint.solver.widgets.b) {
            this.j.b = true;
            android.support.constraint.solver.widgets.b bVar = (android.support.constraint.solver.widgets.b) this.d;
            int c = bVar.c();
            boolean b = bVar.b();
            int i = 0;
            if (c == 0) {
                this.j.e = DependencyNode.Type.LEFT;
                while (i < bVar.aj) {
                    ConstraintWidget constraintWidget = bVar.ai[i];
                    if (b || constraintWidget.m() != 8) {
                        DependencyNode dependencyNode2 = constraintWidget.aB.j;
                        dependencyNode2.k.add(this.j);
                        this.j.l.add(dependencyNode2);
                    }
                    i++;
                }
            } else if (c != 1) {
                if (c == 2) {
                    this.j.e = DependencyNode.Type.TOP;
                    while (i < bVar.aj) {
                        ConstraintWidget constraintWidget2 = bVar.ai[i];
                        if (b || constraintWidget2.m() != 8) {
                            DependencyNode dependencyNode3 = constraintWidget2.aF.j;
                            dependencyNode3.k.add(this.j);
                            this.j.l.add(dependencyNode3);
                        }
                        i++;
                    }
                    a(this.d.aF.j);
                    dependencyNode = this.d.aF.k;
                    a(dependencyNode);
                } else if (c != 3) {
                    return;
                } else {
                    this.j.e = DependencyNode.Type.BOTTOM;
                    while (i < bVar.aj) {
                        ConstraintWidget constraintWidget3 = bVar.ai[i];
                        if (b || constraintWidget3.m() != 8) {
                            DependencyNode dependencyNode4 = constraintWidget3.aF.k;
                            dependencyNode4.k.add(this.j);
                            this.j.l.add(dependencyNode4);
                        }
                        i++;
                    }
                    a(this.d.aF.j);
                    a(this.d.aF.k);
                    return;
                }
            } else {
                this.j.e = DependencyNode.Type.RIGHT;
                while (i < bVar.aj) {
                    ConstraintWidget constraintWidget4 = bVar.ai[i];
                    if (b || constraintWidget4.m() != 8) {
                        DependencyNode dependencyNode5 = constraintWidget4.aB.k;
                        dependencyNode5.k.add(this.j);
                        this.j.l.add(dependencyNode5);
                    }
                    i++;
                }
            }
            a(this.d.aB.j);
            dependencyNode = this.d.aB.k;
            a(dependencyNode);
        }
    }
}
