package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import tb.akh;
import tb.akk;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final List<com.airbnb.lottie.model.a> f1766a;
    private PointF b;
    private boolean c;

    public j() {
        this.f1766a = new ArrayList();
    }

    public j(PointF pointF, boolean z, List<com.airbnb.lottie.model.a> list) {
        this.b = pointF;
        this.c = z;
        this.f1766a = new ArrayList(list);
    }

    public PointF a() {
        return this.b;
    }

    public void a(float f, float f2) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f, f2);
    }

    public void a(j jVar, j jVar2, float f) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.c = jVar.b() || jVar2.b();
        if (jVar.c().size() != jVar2.c().size()) {
            akh.c("Curves must have the same number of control points. Shape 1: " + jVar.c().size() + "\tShape 2: " + jVar2.c().size());
        }
        int min = Math.min(jVar.c().size(), jVar2.c().size());
        if (this.f1766a.size() < min) {
            for (int size = this.f1766a.size(); size < min; size++) {
                this.f1766a.add(new com.airbnb.lottie.model.a());
            }
        } else if (this.f1766a.size() > min) {
            for (int size2 = this.f1766a.size() - 1; size2 >= min; size2--) {
                List<com.airbnb.lottie.model.a> list = this.f1766a;
                list.remove(list.size() - 1);
            }
        }
        PointF a2 = jVar.a();
        PointF a3 = jVar2.a();
        a(akk.a(a2.x, a3.x, f), akk.a(a2.y, a3.y, f));
        for (int size3 = this.f1766a.size() - 1; size3 >= 0; size3--) {
            com.airbnb.lottie.model.a aVar = jVar.c().get(size3);
            com.airbnb.lottie.model.a aVar2 = jVar2.c().get(size3);
            PointF a4 = aVar.a();
            PointF b = aVar.b();
            PointF c = aVar.c();
            PointF a5 = aVar2.a();
            PointF b2 = aVar2.b();
            PointF c2 = aVar2.c();
            this.f1766a.get(size3).a(akk.a(a4.x, a5.x, f), akk.a(a4.y, a5.y, f));
            this.f1766a.get(size3).b(akk.a(b.x, b2.x, f), akk.a(b.y, b2.y, f));
            this.f1766a.get(size3).c(akk.a(c.x, c2.x, f), akk.a(c.y, c2.y, f));
        }
    }

    public void a(boolean z) {
        this.c = z;
    }

    public boolean b() {
        return this.c;
    }

    public List<com.airbnb.lottie.model.a> c() {
        return this.f1766a;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f1766a.size() + "closed=" + this.c + '}';
    }
}
