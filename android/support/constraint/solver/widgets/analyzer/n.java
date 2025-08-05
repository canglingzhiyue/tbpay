package android.support.constraint.solver.widgets.analyzer;

import android.support.constraint.solver.widgets.ConstraintAnchor;
import android.support.constraint.solver.widgets.ConstraintWidget;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class n {
    static int b;
    int c;
    int e;

    /* renamed from: a  reason: collision with root package name */
    ArrayList<ConstraintWidget> f1128a = new ArrayList<>();
    boolean d = false;
    ArrayList<a> f = null;
    private int g = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<ConstraintWidget> f1129a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;

        public a(ConstraintWidget constraintWidget, android.support.constraint.solver.e eVar, int i) {
            this.f1129a = new WeakReference<>(constraintWidget);
            this.b = eVar.b(constraintWidget.s);
            this.c = eVar.b(constraintWidget.t);
            this.d = eVar.b(constraintWidget.u);
            this.e = eVar.b(constraintWidget.v);
            this.f = eVar.b(constraintWidget.w);
            this.g = i;
        }
    }

    public n(int i) {
        this.c = -1;
        this.e = 0;
        int i2 = b;
        b = i2 + 1;
        this.c = i2;
        this.e = i;
    }

    private int a(android.support.constraint.solver.e eVar, ArrayList<ConstraintWidget> arrayList, int i) {
        int b2;
        ConstraintAnchor constraintAnchor;
        android.support.constraint.solver.widgets.e eVar2 = (android.support.constraint.solver.widgets.e) arrayList.get(0).l();
        eVar.b();
        eVar2.a(eVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).a(eVar, false);
        }
        if (i == 0 && eVar2.an > 0) {
            android.support.constraint.solver.widgets.c.a(eVar2, eVar, arrayList, 0);
        }
        if (i == 1 && eVar2.ao > 0) {
            android.support.constraint.solver.widgets.c.a(eVar2, eVar, arrayList, 1);
        }
        try {
            eVar.f();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f.add(new a(arrayList.get(i3), eVar, i));
        }
        if (i == 0) {
            b2 = eVar.b(eVar2.s);
            constraintAnchor = eVar2.u;
        } else {
            b2 = eVar.b(eVar2.t);
            constraintAnchor = eVar2.v;
        }
        int b3 = eVar.b(constraintAnchor);
        eVar.b();
        return b3 - b2;
    }

    private String c() {
        int i = this.e;
        return i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown";
    }

    public int a() {
        return this.e;
    }

    public int a(android.support.constraint.solver.e eVar, int i) {
        if (this.f1128a.size() == 0) {
            return 0;
        }
        return a(eVar, this.f1128a, i);
    }

    public void a(int i) {
        this.e = i;
    }

    public void a(int i, n nVar) {
        Iterator<ConstraintWidget> it = this.f1128a.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            nVar.a(next);
            if (i == 0) {
                next.aQ = nVar.b();
            } else {
                next.aR = nVar.b();
            }
        }
        this.g = nVar.c;
    }

    public void a(ArrayList<n> arrayList) {
        int size = this.f1128a.size();
        if (this.g != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                n nVar = arrayList.get(i);
                if (this.g == nVar.c) {
                    a(this.e, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void a(boolean z) {
        this.d = z;
    }

    public boolean a(ConstraintWidget constraintWidget) {
        if (this.f1128a.contains(constraintWidget)) {
            return false;
        }
        this.f1128a.add(constraintWidget);
        return true;
    }

    public int b() {
        return this.c;
    }

    public String toString() {
        Iterator<ConstraintWidget> it;
        String str = c() + " [" + this.c + "] <";
        while (this.f1128a.iterator().hasNext()) {
            str = str + " " + it.next().n();
        }
        return str + " >";
    }
}
