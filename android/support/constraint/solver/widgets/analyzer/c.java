package android.support.constraint.solver.widgets.analyzer;

import android.support.constraint.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class c extends WidgetRun {

    /* renamed from: a  reason: collision with root package name */
    ArrayList<WidgetRun> f1120a;
    private int b;

    public c(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        this.f1120a = new ArrayList<>();
        this.h = i;
        h();
    }

    private void h() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2 = this.d;
        do {
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget2.y(this.h);
        } while (constraintWidget2 != null);
        this.d = constraintWidget;
        this.f1120a.add(constraintWidget.n(this.h));
        ConstraintWidget z = constraintWidget.z(this.h);
        while (z != null) {
            this.f1120a.add(z.n(this.h));
            z = z.z(this.h);
        }
        Iterator<WidgetRun> it = this.f1120a.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            if (this.h == 0) {
                next.d.W = this;
            } else if (this.h == 1) {
                next.d.X = this;
            }
        }
        if ((this.h == 0 && ((android.support.constraint.solver.widgets.e) this.d.l()).M()) && this.f1120a.size() > 1) {
            ArrayList<WidgetRun> arrayList = this.f1120a;
            this.d = arrayList.get(arrayList.size() - 1).d;
        }
        this.b = this.h == 0 ? this.d.ab() : this.d.ac();
    }

    private ConstraintWidget i() {
        for (int i = 0; i < this.f1120a.size(); i++) {
            WidgetRun widgetRun = this.f1120a.get(i);
            if (widgetRun.d.m() != 8) {
                return widgetRun.d;
            }
        }
        return null;
    }

    private ConstraintWidget j() {
        for (int size = this.f1120a.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = this.f1120a.get(size);
            if (widgetRun.d.m() != 8) {
                return widgetRun.d;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x019c, code lost:
        if (r7 != r11) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c8, code lost:
        if (r7 != r11) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01ca, code lost:
        r16 = r16 + 1;
        r11 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01cd, code lost:
        r12.g.a(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x03f7, code lost:
        r2 = r2 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:
        if (r2.g.j != false) goto L68;
     */
    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun, android.support.constraint.solver.widgets.analyzer.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.support.constraint.solver.widgets.analyzer.d r23) {
        /*
            Method dump skipped, instructions count: 1049
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.analyzer.c.a(android.support.constraint.solver.widgets.analyzer.d):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    public boolean a() {
        int size = this.f1120a.size();
        for (int i = 0; i < size; i++) {
            if (!this.f1120a.get(i).a()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    public long b() {
        int size = this.f1120a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            WidgetRun widgetRun = this.f1120a.get(i);
            j = j + widgetRun.j.f + widgetRun.b() + widgetRun.k.f;
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    public void c() {
        this.e = null;
        Iterator<WidgetRun> it = this.f1120a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    void d() {
        this.j.j = false;
        this.k.j = false;
    }

    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    public void e() {
        for (int i = 0; i < this.f1120a.size(); i++) {
            this.f1120a.get(i).e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a5, code lost:
        a(r5.k, r1, -r0);
     */
    @Override // android.support.constraint.solver.widgets.analyzer.WidgetRun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f() {
        /*
            r5 = this;
            java.util.ArrayList<android.support.constraint.solver.widgets.analyzer.WidgetRun> r0 = r5.f1120a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.support.constraint.solver.widgets.analyzer.WidgetRun r1 = (android.support.constraint.solver.widgets.analyzer.WidgetRun) r1
            r1.f()
            goto L6
        L16:
            java.util.ArrayList<android.support.constraint.solver.widgets.analyzer.WidgetRun> r0 = r5.f1120a
            int r0 = r0.size()
            if (r0 > 0) goto L1f
            return
        L1f:
            java.util.ArrayList<android.support.constraint.solver.widgets.analyzer.WidgetRun> r1 = r5.f1120a
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            android.support.constraint.solver.widgets.analyzer.WidgetRun r1 = (android.support.constraint.solver.widgets.analyzer.WidgetRun) r1
            android.support.constraint.solver.widgets.ConstraintWidget r1 = r1.d
            java.util.ArrayList<android.support.constraint.solver.widgets.analyzer.WidgetRun> r3 = r5.f1120a
            r4 = 1
            int r0 = r0 - r4
            java.lang.Object r0 = r3.get(r0)
            android.support.constraint.solver.widgets.analyzer.WidgetRun r0 = (android.support.constraint.solver.widgets.analyzer.WidgetRun) r0
            android.support.constraint.solver.widgets.ConstraintWidget r0 = r0.d
            int r3 = r5.h
            if (r3 != 0) goto L70
            android.support.constraint.solver.widgets.ConstraintAnchor r1 = r1.s
            android.support.constraint.solver.widgets.ConstraintAnchor r0 = r0.u
            android.support.constraint.solver.widgets.analyzer.DependencyNode r3 = r5.a(r1, r2)
            int r1 = r1.e()
            android.support.constraint.solver.widgets.ConstraintWidget r4 = r5.i()
            if (r4 == 0) goto L52
            android.support.constraint.solver.widgets.ConstraintAnchor r1 = r4.s
            int r1 = r1.e()
        L52:
            if (r3 == 0) goto L59
            android.support.constraint.solver.widgets.analyzer.DependencyNode r4 = r5.j
            r5.a(r4, r3, r1)
        L59:
            android.support.constraint.solver.widgets.analyzer.DependencyNode r1 = r5.a(r0, r2)
            int r0 = r0.e()
            android.support.constraint.solver.widgets.ConstraintWidget r2 = r5.j()
            if (r2 == 0) goto L6d
            android.support.constraint.solver.widgets.ConstraintAnchor r0 = r2.u
            int r0 = r0.e()
        L6d:
            if (r1 == 0) goto Lab
            goto La5
        L70:
            android.support.constraint.solver.widgets.ConstraintAnchor r1 = r1.t
            android.support.constraint.solver.widgets.ConstraintAnchor r0 = r0.v
            android.support.constraint.solver.widgets.analyzer.DependencyNode r2 = r5.a(r1, r4)
            int r1 = r1.e()
            android.support.constraint.solver.widgets.ConstraintWidget r3 = r5.i()
            if (r3 == 0) goto L88
            android.support.constraint.solver.widgets.ConstraintAnchor r1 = r3.t
            int r1 = r1.e()
        L88:
            if (r2 == 0) goto L8f
            android.support.constraint.solver.widgets.analyzer.DependencyNode r3 = r5.j
            r5.a(r3, r2, r1)
        L8f:
            android.support.constraint.solver.widgets.analyzer.DependencyNode r1 = r5.a(r0, r4)
            int r0 = r0.e()
            android.support.constraint.solver.widgets.ConstraintWidget r2 = r5.j()
            if (r2 == 0) goto La3
            android.support.constraint.solver.widgets.ConstraintAnchor r0 = r2.v
            int r0 = r0.e()
        La3:
            if (r1 == 0) goto Lab
        La5:
            android.support.constraint.solver.widgets.analyzer.DependencyNode r2 = r5.k
            int r0 = -r0
            r5.a(r2, r1, r0)
        Lab:
            android.support.constraint.solver.widgets.analyzer.DependencyNode r0 = r5.j
            r0.f1116a = r5
            android.support.constraint.solver.widgets.analyzer.DependencyNode r0 = r5.k
            r0.f1116a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.analyzer.c.f():void");
    }

    public String toString() {
        Iterator<WidgetRun> it;
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.h == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        while (this.f1120a.iterator().hasNext()) {
            sb2 = ((sb2 + "<") + it.next()) + "> ";
        }
        return sb2;
    }
}
