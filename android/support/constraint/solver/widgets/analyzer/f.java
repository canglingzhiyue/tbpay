package android.support.constraint.solver.widgets.analyzer;

import android.support.constraint.solver.widgets.analyzer.DependencyNode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class f extends DependencyNode {
    public int m;

    public f(WidgetRun widgetRun) {
        super(widgetRun);
        this.e = widgetRun instanceof k ? DependencyNode.Type.HORIZONTAL_DIMENSION : DependencyNode.Type.VERTICAL_DIMENSION;
    }

    @Override // android.support.constraint.solver.widgets.analyzer.DependencyNode
    public void a(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (d dVar : this.k) {
            dVar.a(dVar);
        }
    }
}
