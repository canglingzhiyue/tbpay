package android.support.constraint.solver.widgets.analyzer;

import java.util.ArrayList;
import java.util.List;
import tb.riy;

/* loaded from: classes2.dex */
public class DependencyNode implements d {
    WidgetRun d;
    int f;
    public int g;

    /* renamed from: a  reason: collision with root package name */
    public d f1116a = null;
    public boolean b = false;
    public boolean c = false;
    Type e = Type.UNKNOWN;
    int h = 1;
    f i = null;
    public boolean j = false;
    List<d> k = new ArrayList();
    List<DependencyNode> l = new ArrayList();

    /* loaded from: classes2.dex */
    enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.d = widgetRun;
    }

    public void a() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

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

    @Override // android.support.constraint.solver.widgets.analyzer.d
    public void a(d dVar) {
        for (DependencyNode dependencyNode : this.l) {
            if (!dependencyNode.j) {
                return;
            }
        }
        this.c = true;
        d dVar2 = this.f1116a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        DependencyNode dependencyNode2 = null;
        int i = 0;
        for (DependencyNode dependencyNode3 : this.l) {
            if (!(dependencyNode3 instanceof f)) {
                i++;
                dependencyNode2 = dependencyNode3;
            }
        }
        if (dependencyNode2 != null && i == 1 && dependencyNode2.j) {
            f fVar = this.i;
            if (fVar != null) {
                if (!fVar.j) {
                    return;
                }
                this.f = this.h * this.i.g;
            }
            a(dependencyNode2.g + this.f);
        }
        d dVar3 = this.f1116a;
        if (dVar3 == null) {
            return;
        }
        dVar3.a(this);
    }

    public void b(d dVar) {
        this.k.add(dVar);
        if (this.j) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.d.n());
        sb.append(":");
        sb.append(this.e);
        sb.append(riy.BRACKET_START_STR);
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
