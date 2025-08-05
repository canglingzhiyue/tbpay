package android.support.constraint.solver.widgets;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class o extends ConstraintWidget {
    public ArrayList<ConstraintWidget> az = new ArrayList<>();

    public void N() {
        ArrayList<ConstraintWidget> arrayList = this.az;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.az.get(i);
            if (constraintWidget instanceof o) {
                ((o) constraintWidget).N();
            }
        }
    }

    public void U() {
        this.az.clear();
    }

    @Override // android.support.constraint.solver.widgets.ConstraintWidget
    public void a(android.support.constraint.solver.c cVar) {
        super.a(cVar);
        int size = this.az.size();
        for (int i = 0; i < size; i++) {
            this.az.get(i).a(cVar);
        }
    }

    public ArrayList<ConstraintWidget> ae() {
        return this.az;
    }

    public void b(ConstraintWidget constraintWidget) {
        this.az.add(constraintWidget);
        if (constraintWidget.l() != null) {
            ((o) constraintWidget.l()).c(constraintWidget);
        }
        constraintWidget.a((ConstraintWidget) this);
    }

    public void c(ConstraintWidget constraintWidget) {
        this.az.remove(constraintWidget);
        constraintWidget.g();
    }

    @Override // android.support.constraint.solver.widgets.ConstraintWidget
    public void g() {
        this.az.clear();
        super.g();
    }
}
