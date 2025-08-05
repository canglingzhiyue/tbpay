package com.taobao.detail.rate.v2;

import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.ImageView;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public RectF f17027a = new RectF();
    public RectF b = new RectF();
    public RectF c = new RectF();
    public RectF d = new RectF();
    public PointF e = new PointF();
    public float f;
    public float g;
    public ImageView.ScaleType h;

    public c(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, PointF pointF, float f, float f2, ImageView.ScaleType scaleType) {
        this.f17027a.set(rectF);
        this.b.set(rectF2);
        this.c.set(rectF3);
        this.f = f;
        this.h = scaleType;
        this.g = f2;
        this.d.set(rectF4);
        this.e.set(pointF);
    }
}
