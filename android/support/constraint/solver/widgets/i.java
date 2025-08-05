package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.ConstraintWidget;

/* loaded from: classes2.dex */
public class i {
    public static final int OPTIMIZATION_BARRIER = 2;
    public static final int OPTIMIZATION_CACHE_MEASURES = 256;
    public static final int OPTIMIZATION_CHAIN = 4;
    public static final int OPTIMIZATION_DEPENDENCY_ORDERING = 512;
    public static final int OPTIMIZATION_DIMENSIONS = 8;
    public static final int OPTIMIZATION_DIRECT = 1;
    public static final int OPTIMIZATION_GRAPH = 64;
    public static final int OPTIMIZATION_GRAPH_WRAP = 128;
    public static final int OPTIMIZATION_GROUPING = 1024;
    public static final int OPTIMIZATION_GROUPS = 32;
    public static final int OPTIMIZATION_NONE = 0;
    public static final int OPTIMIZATION_RATIO = 16;
    public static final int OPTIMIZATION_STANDARD = 257;

    /* renamed from: a  reason: collision with root package name */
    static boolean[] f1132a = new boolean[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(e eVar, android.support.constraint.solver.e eVar2, ConstraintWidget constraintWidget) {
        constraintWidget.f1113a = -1;
        constraintWidget.b = -1;
        if (eVar.C[0] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && constraintWidget.C[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i = constraintWidget.s.d;
            int q = eVar.q() - constraintWidget.u.d;
            constraintWidget.s.f = eVar2.a(constraintWidget.s);
            constraintWidget.u.f = eVar2.a(constraintWidget.u);
            eVar2.a(constraintWidget.s.f, i);
            eVar2.a(constraintWidget.u.f, q);
            constraintWidget.f1113a = 2;
            constraintWidget.c(i, q);
        }
        if (eVar.C[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || constraintWidget.C[1] != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            return;
        }
        int i2 = constraintWidget.t.d;
        int s = eVar.s() - constraintWidget.v.d;
        constraintWidget.t.f = eVar2.a(constraintWidget.t);
        constraintWidget.v.f = eVar2.a(constraintWidget.v);
        eVar2.a(constraintWidget.t.f, i2);
        eVar2.a(constraintWidget.v.f, s);
        if (constraintWidget.O > 0 || constraintWidget.m() == 8) {
            constraintWidget.w.f = eVar2.a(constraintWidget.w);
            eVar2.a(constraintWidget.w.f, constraintWidget.O + i2);
        }
        constraintWidget.b = 2;
        constraintWidget.d(i2, s);
    }

    public static final boolean a(int i, int i2) {
        return (i & i2) == i2;
    }
}
