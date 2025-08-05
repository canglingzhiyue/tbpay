package android.support.constraint.solver.widgets.analyzer;

import android.support.constraint.solver.widgets.ConstraintAnchor;
import android.support.constraint.solver.widgets.ConstraintWidget;
import android.support.constraint.solver.widgets.analyzer.b;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static b.a f1122a = new b.a();

    private static void a(ConstraintWidget constraintWidget, b.InterfaceC0007b interfaceC0007b) {
        if (!(constraintWidget instanceof android.support.constraint.solver.widgets.e) && constraintWidget.x() && a(constraintWidget)) {
            android.support.constraint.solver.widgets.e.a(constraintWidget, interfaceC0007b, new b.a(), b.a.f1119a);
        }
        ConstraintAnchor a2 = constraintWidget.a(ConstraintAnchor.Type.TOP);
        ConstraintAnchor a3 = constraintWidget.a(ConstraintAnchor.Type.BOTTOM);
        int l = a2.l();
        int l2 = a3.l();
        if (a2.a() != null && a2.n()) {
            Iterator<ConstraintAnchor> it = a2.a().iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f1111a;
                boolean a4 = a(constraintWidget2);
                if (constraintWidget2.x() && a4) {
                    android.support.constraint.solver.widgets.e.a(constraintWidget2, interfaceC0007b, new b.a(), b.a.f1119a);
                }
                if (constraintWidget2.H() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || a4) {
                    if (!constraintWidget2.x()) {
                        if (next == constraintWidget2.t && constraintWidget2.v.c == null) {
                            int e = constraintWidget2.t.e() + l;
                            constraintWidget2.e(e, constraintWidget2.s() + e);
                        } else if (next == constraintWidget2.v && constraintWidget2.v.c == null) {
                            int e2 = l - constraintWidget2.v.e();
                            constraintWidget2.e(e2 - constraintWidget2.s(), e2);
                        } else if (next == constraintWidget2.t && constraintWidget2.v.c != null && constraintWidget2.v.c.n()) {
                            a(interfaceC0007b, constraintWidget2);
                        }
                        a(constraintWidget2, interfaceC0007b);
                    }
                } else if (constraintWidget2.H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget2.l >= 0 && constraintWidget2.k >= 0 && (constraintWidget2.m() == 8 || (constraintWidget2.f == 0 && constraintWidget2.Z() == 0.0f))) {
                    if (!constraintWidget2.J() && !constraintWidget2.t()) {
                        if (((next == constraintWidget2.t && constraintWidget2.v.c != null && constraintWidget2.v.c.n()) || (next == constraintWidget2.v && constraintWidget2.t.c != null && constraintWidget2.t.c.n())) && !constraintWidget2.J()) {
                            a(constraintWidget, interfaceC0007b, constraintWidget2);
                        }
                    }
                }
            }
        }
        if (constraintWidget instanceof android.support.constraint.solver.widgets.g) {
            return;
        }
        if (a3.a() != null && a3.n()) {
            Iterator<ConstraintAnchor> it2 = a3.a().iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f1111a;
                boolean a5 = a(constraintWidget3);
                if (constraintWidget3.x() && a5) {
                    android.support.constraint.solver.widgets.e.a(constraintWidget3, interfaceC0007b, new b.a(), b.a.f1119a);
                }
                boolean z = (next2 == constraintWidget3.t && constraintWidget3.v.c != null && constraintWidget3.v.c.n()) || (next2 == constraintWidget3.v && constraintWidget3.t.c != null && constraintWidget3.t.c.n());
                if (constraintWidget3.H() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || a5) {
                    if (!constraintWidget3.x()) {
                        if (next2 == constraintWidget3.t && constraintWidget3.v.c == null) {
                            int e3 = constraintWidget3.t.e() + l2;
                            constraintWidget3.e(e3, constraintWidget3.s() + e3);
                        } else if (next2 == constraintWidget3.v && constraintWidget3.t.c == null) {
                            int e4 = l2 - constraintWidget3.v.e();
                            constraintWidget3.e(e4 - constraintWidget3.s(), e4);
                        } else if (z && !constraintWidget3.J()) {
                            a(interfaceC0007b, constraintWidget3);
                        }
                        a(constraintWidget3, interfaceC0007b);
                    }
                } else if (constraintWidget3.H() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget3.l >= 0 && constraintWidget3.k >= 0 && (constraintWidget3.m() == 8 || (constraintWidget3.f == 0 && constraintWidget3.Z() == 0.0f))) {
                    if (!constraintWidget3.J() && !constraintWidget3.t() && z && !constraintWidget3.J()) {
                        a(constraintWidget, interfaceC0007b, constraintWidget3);
                    }
                }
            }
        }
        ConstraintAnchor a6 = constraintWidget.a(ConstraintAnchor.Type.BASELINE);
        if (a6.a() == null || !a6.n()) {
            return;
        }
        int l3 = a6.l();
        Iterator<ConstraintAnchor> it3 = a6.a().iterator();
        while (it3.hasNext()) {
            ConstraintAnchor next3 = it3.next();
            ConstraintWidget constraintWidget4 = next3.f1111a;
            boolean a7 = a(constraintWidget4);
            if (constraintWidget4.x() && a7) {
                android.support.constraint.solver.widgets.e.a(constraintWidget4, interfaceC0007b, new b.a(), b.a.f1119a);
            }
            if (constraintWidget4.H() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || a7) {
                if (!constraintWidget4.x() && next3 == constraintWidget4.w) {
                    constraintWidget4.w(l3);
                    a(constraintWidget4, interfaceC0007b);
                }
            }
        }
    }

    private static void a(ConstraintWidget constraintWidget, b.InterfaceC0007b interfaceC0007b, ConstraintWidget constraintWidget2) {
        float Y = constraintWidget2.Y();
        int l = constraintWidget2.t.c.l() + constraintWidget2.t.e();
        int l2 = constraintWidget2.v.c.l() - constraintWidget2.v.e();
        if (l2 >= l) {
            int s = constraintWidget2.s();
            if (constraintWidget2.m() != 8) {
                if (constraintWidget2.f == 2) {
                    if (!(constraintWidget instanceof android.support.constraint.solver.widgets.e)) {
                        constraintWidget = constraintWidget.l();
                    }
                    s = (int) (Y * 0.5f * constraintWidget.s());
                } else if (constraintWidget2.f == 0) {
                    s = l2 - l;
                }
                s = Math.max(constraintWidget2.k, s);
                if (constraintWidget2.l > 0) {
                    s = Math.min(constraintWidget2.l, s);
                }
            }
            int i = l + ((int) ((Y * ((l2 - l) - s)) + 0.5f));
            constraintWidget2.e(i, s + i);
            a(constraintWidget2, interfaceC0007b);
        }
    }

    private static void a(ConstraintWidget constraintWidget, b.InterfaceC0007b interfaceC0007b, ConstraintWidget constraintWidget2, boolean z) {
        float X = constraintWidget2.X();
        int l = constraintWidget2.s.c.l() + constraintWidget2.s.e();
        int l2 = constraintWidget2.u.c.l() - constraintWidget2.u.e();
        if (l2 >= l) {
            int q = constraintWidget2.q();
            if (constraintWidget2.m() != 8) {
                if (constraintWidget2.e == 2) {
                    if (!(constraintWidget instanceof android.support.constraint.solver.widgets.e)) {
                        constraintWidget = constraintWidget.l();
                    }
                    q = (int) (constraintWidget2.X() * 0.5f * constraintWidget.q());
                } else if (constraintWidget2.e == 0) {
                    q = l2 - l;
                }
                q = Math.max(constraintWidget2.h, q);
                if (constraintWidget2.i > 0) {
                    q = Math.min(constraintWidget2.i, q);
                }
            }
            int i = l + ((int) ((X * ((l2 - l) - q)) + 0.5f));
            constraintWidget2.b(i, q + i);
            a(constraintWidget2, interfaceC0007b, z);
        }
    }

    private static void a(ConstraintWidget constraintWidget, b.InterfaceC0007b interfaceC0007b, boolean z) {
        if (!(constraintWidget instanceof android.support.constraint.solver.widgets.e) && constraintWidget.x() && a(constraintWidget)) {
            android.support.constraint.solver.widgets.e.a(constraintWidget, interfaceC0007b, new b.a(), b.a.f1119a);
        }
        ConstraintAnchor a2 = constraintWidget.a(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor a3 = constraintWidget.a(ConstraintAnchor.Type.RIGHT);
        int l = a2.l();
        int l2 = a3.l();
        if (a2.a() != null && a2.n()) {
            Iterator<ConstraintAnchor> it = a2.a().iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f1111a;
                boolean a4 = a(constraintWidget2);
                if (constraintWidget2.x() && a4) {
                    android.support.constraint.solver.widgets.e.a(constraintWidget2, interfaceC0007b, new b.a(), b.a.f1119a);
                }
                if (constraintWidget2.G() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || a4) {
                    if (!constraintWidget2.x()) {
                        if (next == constraintWidget2.s && constraintWidget2.u.c == null) {
                            int e = constraintWidget2.s.e() + l;
                            constraintWidget2.b(e, constraintWidget2.q() + e);
                        } else if (next == constraintWidget2.u && constraintWidget2.s.c == null) {
                            int e2 = l - constraintWidget2.u.e();
                            constraintWidget2.b(e2 - constraintWidget2.q(), e2);
                        } else if (next == constraintWidget2.s && constraintWidget2.u.c != null && constraintWidget2.u.c.n() && !constraintWidget2.I()) {
                            a(interfaceC0007b, constraintWidget2, z);
                        }
                        a(constraintWidget2, interfaceC0007b, z);
                    }
                } else if (constraintWidget2.G() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget2.i >= 0 && constraintWidget2.h >= 0 && (constraintWidget2.m() == 8 || (constraintWidget2.e == 0 && constraintWidget2.Z() == 0.0f))) {
                    if (!constraintWidget2.I() && !constraintWidget2.t()) {
                        if (((next == constraintWidget2.s && constraintWidget2.u.c != null && constraintWidget2.u.c.n()) || (next == constraintWidget2.u && constraintWidget2.s.c != null && constraintWidget2.s.c.n())) && !constraintWidget2.I()) {
                            a(constraintWidget, interfaceC0007b, constraintWidget2, z);
                        }
                    }
                }
            }
        }
        if (!(constraintWidget instanceof android.support.constraint.solver.widgets.g) && a3.a() != null && a3.n()) {
            Iterator<ConstraintAnchor> it2 = a3.a().iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f1111a;
                boolean a5 = a(constraintWidget3);
                if (constraintWidget3.x() && a5) {
                    android.support.constraint.solver.widgets.e.a(constraintWidget3, interfaceC0007b, new b.a(), b.a.f1119a);
                }
                boolean z2 = (next2 == constraintWidget3.s && constraintWidget3.u.c != null && constraintWidget3.u.c.n()) || (next2 == constraintWidget3.u && constraintWidget3.s.c != null && constraintWidget3.s.c.n());
                if (constraintWidget3.G() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || a5) {
                    if (!constraintWidget3.x()) {
                        if (next2 == constraintWidget3.s && constraintWidget3.u.c == null) {
                            int e3 = constraintWidget3.s.e() + l2;
                            constraintWidget3.b(e3, constraintWidget3.q() + e3);
                        } else if (next2 == constraintWidget3.u && constraintWidget3.s.c == null) {
                            int e4 = l2 - constraintWidget3.u.e();
                            constraintWidget3.b(e4 - constraintWidget3.q(), e4);
                        } else if (z2 && !constraintWidget3.I()) {
                            a(interfaceC0007b, constraintWidget3, z);
                        }
                        a(constraintWidget3, interfaceC0007b, z);
                    }
                } else if (constraintWidget3.G() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget3.i >= 0 && constraintWidget3.h >= 0 && (constraintWidget3.m() == 8 || (constraintWidget3.e == 0 && constraintWidget3.Z() == 0.0f))) {
                    if (!constraintWidget3.I() && !constraintWidget3.t() && z2 && !constraintWidget3.I()) {
                        a(constraintWidget, interfaceC0007b, constraintWidget3, z);
                    }
                }
            }
        }
    }

    private static void a(b.InterfaceC0007b interfaceC0007b, ConstraintWidget constraintWidget) {
        float Y = constraintWidget.Y();
        int l = constraintWidget.t.c.l();
        int l2 = constraintWidget.v.c.l();
        int e = constraintWidget.t.e() + l;
        int e2 = l2 - constraintWidget.v.e();
        if (l == l2) {
            Y = 0.5f;
        } else {
            l = e;
            l2 = e2;
        }
        int s = constraintWidget.s();
        int i = (l2 - l) - s;
        if (l > l2) {
            i = (l - l2) - s;
        }
        int i2 = (int) ((Y * i) + 0.5f);
        int i3 = l + i2;
        int i4 = i3 + s;
        if (l > l2) {
            i3 = l - i2;
            i4 = i3 - s;
        }
        constraintWidget.e(i3, i4);
        a(constraintWidget, interfaceC0007b);
    }

    private static void a(b.InterfaceC0007b interfaceC0007b, ConstraintWidget constraintWidget, boolean z) {
        float X = constraintWidget.X();
        int l = constraintWidget.s.c.l();
        int l2 = constraintWidget.u.c.l();
        int e = constraintWidget.s.e() + l;
        int e2 = l2 - constraintWidget.u.e();
        if (l == l2) {
            X = 0.5f;
        } else {
            l = e;
            l2 = e2;
        }
        int q = constraintWidget.q();
        int i = (l2 - l) - q;
        if (l > l2) {
            i = (l - l2) - q;
        }
        int i2 = ((int) ((X * i) + 0.5f)) + l;
        int i3 = i2 + q;
        if (l > l2) {
            i3 = i2 - q;
        }
        constraintWidget.b(i2, i3);
        a(constraintWidget, interfaceC0007b, z);
    }

    private static void a(android.support.constraint.solver.widgets.b bVar, b.InterfaceC0007b interfaceC0007b, int i, boolean z) {
        if (bVar.j()) {
            if (i == 0) {
                a(bVar, interfaceC0007b, z);
            } else {
                a(bVar, interfaceC0007b);
            }
        }
    }

    public static void a(android.support.constraint.solver.widgets.e eVar, b.InterfaceC0007b interfaceC0007b) {
        int f;
        int f2;
        ConstraintWidget.DimensionBehaviour G = eVar.G();
        ConstraintWidget.DimensionBehaviour H = eVar.H();
        eVar.k();
        ArrayList<ConstraintWidget> ae = eVar.ae();
        int size = ae.size();
        for (int i = 0; i < size; i++) {
            ae.get(i).k();
        }
        boolean M = eVar.M();
        if (G == ConstraintWidget.DimensionBehaviour.FIXED) {
            eVar.b(0, eVar.q());
        } else {
            eVar.o(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = ae.get(i2);
            if (constraintWidget instanceof android.support.constraint.solver.widgets.g) {
                android.support.constraint.solver.widgets.g gVar = (android.support.constraint.solver.widgets.g) constraintWidget;
                if (gVar.b() == 1) {
                    if (gVar.h() != -1) {
                        f2 = gVar.h();
                    } else if (gVar.i() == -1 || !eVar.d()) {
                        if (eVar.d()) {
                            f2 = (int) ((gVar.f() * eVar.q()) + 0.5f);
                        }
                        z = true;
                    } else {
                        f2 = eVar.q() - gVar.i();
                    }
                    gVar.b(f2);
                    z = true;
                }
            } else if ((constraintWidget instanceof android.support.constraint.solver.widgets.b) && ((android.support.constraint.solver.widgets.b) constraintWidget).i() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget2 = ae.get(i3);
                if (constraintWidget2 instanceof android.support.constraint.solver.widgets.g) {
                    android.support.constraint.solver.widgets.g gVar2 = (android.support.constraint.solver.widgets.g) constraintWidget2;
                    if (gVar2.b() == 1) {
                        a(gVar2, interfaceC0007b, M);
                    }
                }
            }
        }
        a(eVar, interfaceC0007b, M);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget constraintWidget3 = ae.get(i4);
                if (constraintWidget3 instanceof android.support.constraint.solver.widgets.b) {
                    android.support.constraint.solver.widgets.b bVar = (android.support.constraint.solver.widgets.b) constraintWidget3;
                    if (bVar.i() == 0) {
                        a(bVar, interfaceC0007b, 0, M);
                    }
                }
            }
        }
        if (H == ConstraintWidget.DimensionBehaviour.FIXED) {
            eVar.e(0, eVar.s());
        } else {
            eVar.p(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget4 = ae.get(i5);
            if (constraintWidget4 instanceof android.support.constraint.solver.widgets.g) {
                android.support.constraint.solver.widgets.g gVar3 = (android.support.constraint.solver.widgets.g) constraintWidget4;
                if (gVar3.b() == 0) {
                    if (gVar3.h() != -1) {
                        f = gVar3.h();
                    } else if (gVar3.i() == -1 || !eVar.e()) {
                        if (eVar.e()) {
                            f = (int) ((gVar3.f() * eVar.s()) + 0.5f);
                        }
                        z3 = true;
                    } else {
                        f = eVar.s() - gVar3.i();
                    }
                    gVar3.b(f);
                    z3 = true;
                }
            } else if ((constraintWidget4 instanceof android.support.constraint.solver.widgets.b) && ((android.support.constraint.solver.widgets.b) constraintWidget4).i() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                ConstraintWidget constraintWidget5 = ae.get(i6);
                if (constraintWidget5 instanceof android.support.constraint.solver.widgets.g) {
                    android.support.constraint.solver.widgets.g gVar4 = (android.support.constraint.solver.widgets.g) constraintWidget5;
                    if (gVar4.b() == 0) {
                        a(gVar4, interfaceC0007b);
                    }
                }
            }
        }
        a((ConstraintWidget) eVar, interfaceC0007b);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget6 = ae.get(i7);
                if (constraintWidget6 instanceof android.support.constraint.solver.widgets.b) {
                    android.support.constraint.solver.widgets.b bVar2 = (android.support.constraint.solver.widgets.b) constraintWidget6;
                    if (bVar2.i() == 1) {
                        a(bVar2, interfaceC0007b, 1, M);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            ConstraintWidget constraintWidget7 = ae.get(i8);
            if (constraintWidget7.x() && a(constraintWidget7)) {
                android.support.constraint.solver.widgets.e.a(constraintWidget7, interfaceC0007b, f1122a, b.a.f1119a);
                a(constraintWidget7, interfaceC0007b, M);
                a(constraintWidget7, interfaceC0007b);
            }
        }
    }

    private static boolean a(ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour G = constraintWidget.G();
        ConstraintWidget.DimensionBehaviour H = constraintWidget.H();
        android.support.constraint.solver.widgets.e eVar = constraintWidget.l() != null ? (android.support.constraint.solver.widgets.e) constraintWidget.l() : null;
        if (eVar != null) {
            eVar.G();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (eVar != null) {
            eVar.H();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        boolean z = G == ConstraintWidget.DimensionBehaviour.FIXED || G == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (G == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.e == 0 && constraintWidget.G == 0.0f && constraintWidget.x(0)) || constraintWidget.d();
        boolean z2 = H == ConstraintWidget.DimensionBehaviour.FIXED || H == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (H == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f == 0 && constraintWidget.G == 0.0f && constraintWidget.x(1)) || constraintWidget.e();
        if (constraintWidget.G <= 0.0f || (!z && !z2)) {
            return z && z2;
        }
        return true;
    }
}
