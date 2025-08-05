package com.airbnb.lottie.model;

import android.graphics.PointF;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final PointF f1749a;
    private final PointF b;
    private final PointF c;

    public a() {
        this.f1749a = new PointF();
        this.b = new PointF();
        this.c = new PointF();
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f1749a = pointF;
        this.b = pointF2;
        this.c = pointF3;
    }

    public PointF a() {
        return this.f1749a;
    }

    public void a(float f, float f2) {
        this.f1749a.set(f, f2);
    }

    public PointF b() {
        return this.b;
    }

    public void b(float f, float f2) {
        this.b.set(f, f2);
    }

    public PointF c() {
        return this.c;
    }

    public void c(float f, float f2) {
        this.c.set(f, f2);
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.c.x), Float.valueOf(this.c.y), Float.valueOf(this.f1749a.x), Float.valueOf(this.f1749a.y), Float.valueOf(this.b.x), Float.valueOf(this.b.y));
    }
}
