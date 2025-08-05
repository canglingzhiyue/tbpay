package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.analyzer.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class f extends ConstraintWidget implements h {
    public ConstraintWidget[] ai = new ConstraintWidget[4];
    public int aj = 0;

    public int J(int i) {
        for (int i2 = 0; i2 < this.aj; i2++) {
            ConstraintWidget constraintWidget = this.ai[i2];
            if (i == 0 && constraintWidget.aQ != -1) {
                return constraintWidget.aQ;
            }
            if (i == 1 && constraintWidget.aR != -1) {
                return constraintWidget.aR;
            }
        }
        return -1;
    }

    @Override // android.support.constraint.solver.widgets.h
    public void K() {
        this.aj = 0;
        Arrays.fill(this.ai, (Object) null);
    }

    @Override // android.support.constraint.solver.widgets.ConstraintWidget
    public void a(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.a(constraintWidget, hashMap);
        f fVar = (f) constraintWidget;
        this.aj = 0;
        int i = fVar.aj;
        for (int i2 = 0; i2 < i; i2++) {
            b(hashMap.get(fVar.ai[i2]));
        }
    }

    @Override // android.support.constraint.solver.widgets.h
    public void a(e eVar) {
    }

    public void a(ArrayList<n> arrayList, int i, n nVar) {
        for (int i2 = 0; i2 < this.aj; i2++) {
            nVar.a(this.ai[i2]);
        }
        for (int i3 = 0; i3 < this.aj; i3++) {
            android.support.constraint.solver.widgets.analyzer.h.a(this.ai[i3], i, arrayList, nVar);
        }
    }

    @Override // android.support.constraint.solver.widgets.h
    public void b(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i = this.aj + 1;
        ConstraintWidget[] constraintWidgetArr = this.ai;
        if (i > constraintWidgetArr.length) {
            this.ai = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length << 1);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.ai;
        int i2 = this.aj;
        constraintWidgetArr2[i2] = constraintWidget;
        this.aj = i2 + 1;
    }
}
