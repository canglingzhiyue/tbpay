package android.support.constraint.solver.widgets.analyzer;

import android.support.constraint.solver.widgets.ConstraintWidget;
import android.support.constraint.solver.widgets.analyzer.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class e {
    private android.support.constraint.solver.widgets.e b;
    private android.support.constraint.solver.widgets.e e;
    private boolean c = true;
    private boolean d = true;
    private ArrayList<WidgetRun> f = new ArrayList<>();
    private ArrayList<l> g = new ArrayList<>();
    private b.InterfaceC0007b h = null;
    private b.a i = new b.a();

    /* renamed from: a  reason: collision with root package name */
    ArrayList<l> f1121a = new ArrayList<>();

    public e(android.support.constraint.solver.widgets.e eVar) {
        this.b = eVar;
        this.e = eVar;
    }

    private int a(android.support.constraint.solver.widgets.e eVar, int i) {
        int size = this.f1121a.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.f1121a.get(i2).a(eVar, i));
        }
        return (int) j;
    }

    private void a(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        b.a aVar = this.i;
        aVar.d = dimensionBehaviour;
        aVar.e = dimensionBehaviour2;
        aVar.f = i;
        aVar.g = i2;
        this.h.a(constraintWidget, aVar);
        constraintWidget.j(this.i.h);
        constraintWidget.k(this.i.i);
        constraintWidget.c(this.i.k);
        constraintWidget.q(this.i.j);
    }

    private void a(DependencyNode dependencyNode, int i, int i2, DependencyNode dependencyNode2, ArrayList<l> arrayList, l lVar) {
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun.e != null || widgetRun == this.b.aB || widgetRun == this.b.aF) {
            return;
        }
        if (lVar == null) {
            lVar = new l(widgetRun, i2);
            arrayList.add(lVar);
        }
        widgetRun.e = lVar;
        lVar.a(widgetRun);
        for (d dVar : widgetRun.j.k) {
            if (dVar instanceof DependencyNode) {
                a((DependencyNode) dVar, i, 0, dependencyNode2, arrayList, lVar);
            }
        }
        for (d dVar2 : widgetRun.k.k) {
            if (dVar2 instanceof DependencyNode) {
                a((DependencyNode) dVar2, i, 1, dependencyNode2, arrayList, lVar);
            }
        }
        if (i == 1 && (widgetRun instanceof m)) {
            for (d dVar3 : ((m) widgetRun).f1126a.k) {
                if (dVar3 instanceof DependencyNode) {
                    a((DependencyNode) dVar3, i, 2, dependencyNode2, arrayList, lVar);
                }
            }
        }
        for (DependencyNode dependencyNode3 : widgetRun.j.l) {
            if (dependencyNode3 == dependencyNode2) {
                lVar.c = true;
            }
            a(dependencyNode3, i, 0, dependencyNode2, arrayList, lVar);
        }
        for (DependencyNode dependencyNode4 : widgetRun.k.l) {
            if (dependencyNode4 == dependencyNode2) {
                lVar.c = true;
            }
            a(dependencyNode4, i, 1, dependencyNode2, arrayList, lVar);
        }
        if (i != 1 || !(widgetRun instanceof m)) {
            return;
        }
        for (DependencyNode dependencyNode5 : ((m) widgetRun).f1126a.l) {
            a(dependencyNode5, i, 2, dependencyNode2, arrayList, lVar);
        }
    }

    private void a(WidgetRun widgetRun, int i, ArrayList<l> arrayList) {
        for (d dVar : widgetRun.j.k) {
            if (dVar instanceof DependencyNode) {
                a((DependencyNode) dVar, i, 0, widgetRun.k, arrayList, null);
            } else if (dVar instanceof WidgetRun) {
                a(((WidgetRun) dVar).j, i, 0, widgetRun.k, arrayList, null);
            }
        }
        for (d dVar2 : widgetRun.k.k) {
            if (dVar2 instanceof DependencyNode) {
                a((DependencyNode) dVar2, i, 1, widgetRun.j, arrayList, null);
            } else if (dVar2 instanceof WidgetRun) {
                a(((WidgetRun) dVar2).k, i, 1, widgetRun.j, arrayList, null);
            }
        }
        if (i == 1) {
            for (d dVar3 : ((m) widgetRun).f1126a.k) {
                if (dVar3 instanceof DependencyNode) {
                    a((DependencyNode) dVar3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
        if (r1.f == 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(android.support.constraint.solver.widgets.e r13) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.analyzer.e.a(android.support.constraint.solver.widgets.e):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.analyzer.e.a():void");
    }

    public void a(b.InterfaceC0007b interfaceC0007b) {
        this.h = interfaceC0007b;
    }

    public void a(ArrayList<WidgetRun> arrayList) {
        WidgetRun iVar;
        arrayList.clear();
        this.e.aB.c();
        this.e.aF.c();
        arrayList.add(this.e.aB);
        arrayList.add(this.e.aF);
        Iterator<ConstraintWidget> it = this.e.az.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof android.support.constraint.solver.widgets.g) {
                iVar = new i(next);
            } else {
                if (next.I()) {
                    if (next.W == null) {
                        next.W = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.W);
                } else {
                    arrayList.add(next.aB);
                }
                if (next.J()) {
                    if (next.X == null) {
                        next.X = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.X);
                } else {
                    arrayList.add(next.aF);
                }
                if (next instanceof android.support.constraint.solver.widgets.f) {
                    iVar = new j(next);
                }
            }
            arrayList.add(iVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().c();
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.d != this.e) {
                next2.f();
            }
        }
    }

    public boolean a(boolean z) {
        boolean z2;
        boolean z3 = z & true;
        boolean z4 = false;
        if (this.c || this.d) {
            Iterator<ConstraintWidget> it = this.b.az.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.P();
                next.d = false;
                next.aB.d();
                next.aF.d();
            }
            this.b.P();
            android.support.constraint.solver.widgets.e eVar = this.b;
            eVar.d = false;
            eVar.aB.d();
            this.b.aF.d();
            this.d = false;
        }
        if (a(this.e)) {
            return false;
        }
        this.b.h(0);
        this.b.i(0);
        ConstraintWidget.DimensionBehaviour t = this.b.t(0);
        ConstraintWidget.DimensionBehaviour t2 = this.b.t(1);
        if (this.c) {
            d();
        }
        int o = this.b.o();
        int p = this.b.p();
        this.b.aB.j.a(o);
        this.b.aF.j.a(p);
        a();
        if (t == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || t2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            if (z3) {
                Iterator<WidgetRun> it2 = this.f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().a()) {
                            z3 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z3 && t == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.b.a(ConstraintWidget.DimensionBehaviour.FIXED);
                android.support.constraint.solver.widgets.e eVar2 = this.b;
                eVar2.j(a(eVar2, 0));
                this.b.aB.g.a(this.b.q());
            }
            if (z3 && t2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.b.b(ConstraintWidget.DimensionBehaviour.FIXED);
                android.support.constraint.solver.widgets.e eVar3 = this.b;
                eVar3.k(a(eVar3, 1));
                this.b.aF.g.a(this.b.s());
            }
        }
        if (this.b.C[0] == ConstraintWidget.DimensionBehaviour.FIXED || this.b.C[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int q = this.b.q() + o;
            this.b.aB.k.a(q);
            this.b.aB.g.a(q - o);
            a();
            if (this.b.C[1] == ConstraintWidget.DimensionBehaviour.FIXED || this.b.C[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int s = this.b.s() + p;
                this.b.aF.k.a(s);
                this.b.aF.g.a(s - p);
            }
            a();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<WidgetRun> it3 = this.f.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.d != this.b || next2.i) {
                next2.e();
            }
        }
        Iterator<WidgetRun> it4 = this.f.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z4 = true;
                break;
            }
            WidgetRun next3 = it4.next();
            if (z2 || next3.d != this.b) {
                if (!next3.j.j) {
                    break;
                }
                if (!next3.k.j) {
                    if (!(next3 instanceof i)) {
                        break;
                    }
                }
                if (!next3.g.j && !(next3 instanceof c) && !(next3 instanceof i)) {
                    break;
                }
            }
        }
        this.b.a(t);
        this.b.b(t2);
        return z4;
    }

    public boolean a(boolean z, int i) {
        boolean z2;
        f fVar;
        int s;
        boolean z3 = z & true;
        boolean z4 = false;
        ConstraintWidget.DimensionBehaviour t = this.b.t(0);
        ConstraintWidget.DimensionBehaviour t2 = this.b.t(1);
        int o = this.b.o();
        int p = this.b.p();
        if (z3 && (t == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || t2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
            Iterator<WidgetRun> it = this.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WidgetRun next = it.next();
                if (next.h == i && !next.a()) {
                    z3 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z3 && t == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    this.b.a(ConstraintWidget.DimensionBehaviour.FIXED);
                    android.support.constraint.solver.widgets.e eVar = this.b;
                    eVar.j(a(eVar, 0));
                    fVar = this.b.aB.g;
                    s = this.b.q();
                    fVar.a(s);
                }
            } else if (z3 && t2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.b.b(ConstraintWidget.DimensionBehaviour.FIXED);
                android.support.constraint.solver.widgets.e eVar2 = this.b;
                eVar2.k(a(eVar2, 1));
                fVar = this.b.aF.g;
                s = this.b.s();
                fVar.a(s);
            }
        }
        if (i == 0) {
            if (this.b.C[0] == ConstraintWidget.DimensionBehaviour.FIXED || this.b.C[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int q = this.b.q() + o;
                this.b.aB.k.a(q);
                this.b.aB.g.a(q - o);
                z2 = true;
            }
            z2 = false;
        } else {
            if (this.b.C[1] == ConstraintWidget.DimensionBehaviour.FIXED || this.b.C[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int s2 = this.b.s() + p;
                this.b.aF.k.a(s2);
                this.b.aF.g.a(s2 - p);
                z2 = true;
            }
            z2 = false;
        }
        a();
        Iterator<WidgetRun> it2 = this.f.iterator();
        while (it2.hasNext()) {
            WidgetRun next2 = it2.next();
            if (next2.h == i && (next2.d != this.b || next2.i)) {
                next2.e();
            }
        }
        Iterator<WidgetRun> it3 = this.f.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z4 = true;
                break;
            }
            WidgetRun next3 = it3.next();
            if (next3.h == i && (z2 || next3.d != this.b)) {
                if (!next3.j.j) {
                    break;
                } else if (!next3.k.j) {
                    break;
                } else if (!(next3 instanceof c) && !next3.g.j) {
                    break;
                }
            }
        }
        this.b.a(t);
        this.b.b(t2);
        return z4;
    }

    public void b() {
        this.c = true;
    }

    public boolean b(boolean z) {
        if (this.c) {
            Iterator<ConstraintWidget> it = this.b.az.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.P();
                next.d = false;
                next.aB.g.j = false;
                next.aB.i = false;
                next.aB.d();
                next.aF.g.j = false;
                next.aF.i = false;
                next.aF.d();
            }
            this.b.P();
            android.support.constraint.solver.widgets.e eVar = this.b;
            eVar.d = false;
            eVar.aB.g.j = false;
            this.b.aB.i = false;
            this.b.aB.d();
            this.b.aF.g.j = false;
            this.b.aF.i = false;
            this.b.aF.d();
            d();
        }
        if (a(this.e)) {
            return false;
        }
        this.b.h(0);
        this.b.i(0);
        this.b.aB.j.a(0);
        this.b.aF.j.a(0);
        return true;
    }

    public void c() {
        this.d = true;
    }

    public void d() {
        a(this.f);
        this.f1121a.clear();
        l.f1125a = 0;
        a(this.b.aB, 0, this.f1121a);
        a(this.b.aF, 1, this.f1121a);
        this.c = false;
    }
}
