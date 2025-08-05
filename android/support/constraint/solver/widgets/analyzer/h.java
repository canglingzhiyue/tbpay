package android.support.constraint.solver.widgets.analyzer;

import android.support.constraint.solver.widgets.ConstraintAnchor;
import android.support.constraint.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class h {
    public static n a(ConstraintWidget constraintWidget, int i, ArrayList<n> arrayList, n nVar) {
        ConstraintAnchor constraintAnchor;
        int J;
        int i2 = i == 0 ? constraintWidget.aQ : constraintWidget.aR;
        int i3 = 0;
        if (i2 != -1 && (nVar == null || i2 != nVar.c)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                n nVar2 = arrayList.get(i4);
                if (nVar2.b() == i2) {
                    if (nVar != null) {
                        nVar.a(i, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                } else {
                    i4++;
                }
            }
        } else if (i2 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if ((constraintWidget instanceof android.support.constraint.solver.widgets.f) && (J = ((android.support.constraint.solver.widgets.f) constraintWidget).J(i)) != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    n nVar3 = arrayList.get(i5);
                    if (nVar3.b() == J) {
                        nVar = nVar3;
                        break;
                    }
                    i5++;
                }
            }
            if (nVar == null) {
                nVar = new n(i);
            }
            arrayList.add(nVar);
        }
        if (nVar.a(constraintWidget)) {
            if (constraintWidget instanceof android.support.constraint.solver.widgets.g) {
                android.support.constraint.solver.widgets.g gVar = (android.support.constraint.solver.widgets.g) constraintWidget;
                ConstraintAnchor c = gVar.c();
                if (gVar.b() == 0) {
                    i3 = 1;
                }
                c.a(i3, arrayList, nVar);
            }
            if (i == 0) {
                constraintWidget.aQ = nVar.b();
                constraintWidget.s.a(i, arrayList, nVar);
                constraintAnchor = constraintWidget.u;
            } else {
                constraintWidget.aR = nVar.b();
                constraintWidget.t.a(i, arrayList, nVar);
                constraintWidget.w.a(i, arrayList, nVar);
                constraintAnchor = constraintWidget.v;
            }
            constraintAnchor.a(i, arrayList, nVar);
            constraintWidget.z.a(i, arrayList, nVar);
        }
        return nVar;
    }

    private static n a(ArrayList<n> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            n nVar = arrayList.get(i2);
            if (i == nVar.c) {
                return nVar;
            }
        }
        return null;
    }

    public static boolean a(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        return (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT));
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0388 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.support.constraint.solver.widgets.e r16, android.support.constraint.solver.widgets.analyzer.b.InterfaceC0007b r17) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.analyzer.h.a(android.support.constraint.solver.widgets.e, android.support.constraint.solver.widgets.analyzer.b$b):boolean");
    }
}
