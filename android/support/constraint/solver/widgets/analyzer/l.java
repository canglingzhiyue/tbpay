package android.support.constraint.solver.widgets.analyzer;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class l {
    public static final int BASELINE = 2;
    public static final int END = 1;
    public static final int START = 0;

    /* renamed from: a  reason: collision with root package name */
    public static int f1125a;
    WidgetRun d;
    WidgetRun e;
    int g;
    int h;
    public int b = 0;
    public boolean c = false;
    ArrayList<WidgetRun> f = new ArrayList<>();

    public l(WidgetRun widgetRun, int i) {
        this.d = null;
        this.e = null;
        this.g = 0;
        int i2 = f1125a;
        this.g = i2;
        f1125a = i2 + 1;
        this.d = widgetRun;
        this.e = widgetRun;
        this.h = i;
    }

    private long a(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun instanceof j) {
            return j;
        }
        int size = dependencyNode.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            d dVar = dependencyNode.k.get(i);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.d != widgetRun) {
                    j2 = Math.max(j2, a(dependencyNode2, dependencyNode2.f + j));
                }
            }
        }
        if (dependencyNode != widgetRun.j) {
            return j2;
        }
        long b = j + widgetRun.b();
        return Math.max(Math.max(j2, a(widgetRun.k, b)), b - widgetRun.k.f);
    }

    private long b(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun instanceof j) {
            return j;
        }
        int size = dependencyNode.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            d dVar = dependencyNode.k.get(i);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.d != widgetRun) {
                    j2 = Math.min(j2, b(dependencyNode2, dependencyNode2.f + j));
                }
            }
        }
        if (dependencyNode != widgetRun.k) {
            return j2;
        }
        long b = j - widgetRun.b();
        return Math.min(Math.min(j2, b(widgetRun.j, b)), b - widgetRun.j.f);
    }

    public long a(android.support.constraint.solver.widgets.e eVar, int i) {
        long b;
        long j;
        long j2;
        WidgetRun widgetRun = this.d;
        long j3 = 0;
        if (widgetRun instanceof c) {
            if (((c) widgetRun).h != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(widgetRun instanceof k)) {
                return 0L;
            }
        } else if (!(widgetRun instanceof m)) {
            return 0L;
        }
        DependencyNode dependencyNode = i == 0 ? eVar.aB.j : eVar.aF.j;
        DependencyNode dependencyNode2 = i == 0 ? eVar.aB.k : eVar.aF.k;
        boolean contains = this.d.j.l.contains(dependencyNode);
        boolean contains2 = this.d.k.l.contains(dependencyNode2);
        long b2 = this.d.b();
        if (!contains || !contains2) {
            if (contains) {
                j2 = a(this.d.j, this.d.j.f);
                j = this.d.j.f + b2;
            } else if (contains2) {
                j = (-this.d.k.f) + b2;
                j2 = -b(this.d.k, this.d.k.f);
            } else {
                b = this.d.j.f + this.d.b();
            }
            return Math.max(j2, j);
        }
        long a2 = a(this.d.j, 0L);
        long b3 = b(this.d.k, 0L);
        long j4 = a2 - b2;
        if (j4 >= (-this.d.k.f)) {
            j4 += this.d.k.f;
        }
        long j5 = ((-b3) - b2) - this.d.j.f;
        if (j5 >= this.d.j.f) {
            j5 -= this.d.j.f;
        }
        float g = this.d.d.g(i);
        if (g > 0.0f) {
            j3 = (((float) j5) / g) + (((float) j4) / (1.0f - g));
        }
        float f = (float) j3;
        b = this.d.j.f + (f * g) + 0.5f + b2 + (f * (1.0f - g)) + 0.5f;
        return b - this.d.k.f;
    }

    public void a(WidgetRun widgetRun) {
        this.f.add(widgetRun);
        this.e = widgetRun;
    }
}
