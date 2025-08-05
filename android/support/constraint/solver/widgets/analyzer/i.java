package android.support.constraint.solver.widgets.analyzer;

import android.support.constraint.solver.widgets.ConstraintWidget;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class i extends WidgetRun {
    public i(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.aB.c();
        constraintWidget.aF.c();
        this.h = ((android.support.constraint.solver.widgets.g) constraintWidget).b();
    }

    private void a(DependencyNode dependencyNode) {
        this.j.k.add(dependencyNode);
        dependencyNode.l.add(this.j);
    }

    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun, android.support.constraint.solver.widgets.analyzer.d
    public void a(d dVar) {
        if (this.j.c && !this.j.j) {
            this.j.a((int) ((this.j.l.get(0).g * ((android.support.constraint.solver.widgets.g) this.d).f()) + 0.5f));
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
        this.j.a();
    }

    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    void d() {
        this.j.j = false;
        this.k.j = false;
    }

    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    public void e() {
        if (((android.support.constraint.solver.widgets.g) this.d).b() == 1) {
            this.d.h(this.j.g);
        } else {
            this.d.i(this.j.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    public void f() {
        DependencyNode dependencyNode;
        DependencyNode dependencyNode2;
        DependencyNode dependencyNode3;
        android.support.constraint.solver.widgets.g gVar = (android.support.constraint.solver.widgets.g) this.d;
        int h = gVar.h();
        int i = gVar.i();
        gVar.f();
        if (gVar.b() == 1) {
            if (h != -1) {
                this.j.l.add(this.d.D.aB.j);
                this.d.D.aB.j.k.add(this.j);
                dependencyNode3 = this.j;
            } else if (i != -1) {
                this.j.l.add(this.d.D.aB.k);
                this.d.D.aB.k.k.add(this.j);
                dependencyNode3 = this.j;
                h = -i;
            } else {
                this.j.b = true;
                this.j.l.add(this.d.D.aB.k);
                this.d.D.aB.k.k.add(this.j);
                a(this.d.aB.j);
                dependencyNode2 = this.d.aB.k;
            }
            dependencyNode3.f = h;
            a(this.d.aB.j);
            dependencyNode2 = this.d.aB.k;
        } else {
            if (h != -1) {
                this.j.l.add(this.d.D.aF.j);
                this.d.D.aF.j.k.add(this.j);
                dependencyNode = this.j;
            } else if (i != -1) {
                this.j.l.add(this.d.D.aF.k);
                this.d.D.aF.k.k.add(this.j);
                dependencyNode = this.j;
                h = -i;
            } else {
                this.j.b = true;
                this.j.l.add(this.d.D.aF.k);
                this.d.D.aF.k.k.add(this.j);
                a(this.d.aF.j);
                dependencyNode2 = this.d.aF.k;
            }
            dependencyNode.f = h;
            a(this.d.aF.j);
            dependencyNode2 = this.d.aF.k;
        }
        a(dependencyNode2);
    }
}
