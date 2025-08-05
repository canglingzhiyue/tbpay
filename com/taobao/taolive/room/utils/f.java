package com.taobao.taolive.room.utils;

import android.animation.TypeEvaluator;
import android.graphics.PointF;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class f implements TypeEvaluator<PointF> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public PointF f21766a;
    private PointF b;

    static {
        kge.a(-576228110);
        kge.a(-738482422);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.graphics.PointF, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public /* synthetic */ PointF evaluate(float f, PointF pointF, PointF pointF2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6810f25a", new Object[]{this, new Float(f), pointF, pointF2}) : a(f, pointF, pointF2);
    }

    public f(PointF pointF) {
        this.b = pointF;
    }

    public PointF a(float f, PointF pointF, PointF pointF2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("dcb9c6f", new Object[]{this, new Float(f), pointF, pointF2});
        }
        float f2 = 1.0f - f;
        if (this.f21766a == null) {
            this.f21766a = new PointF();
        }
        float f3 = f2 * f2;
        float f4 = f2 * 2.0f * f;
        float f5 = f * f;
        this.f21766a.x = (pointF.x * f3) + (this.b.x * f4) + (pointF2.x * f5);
        this.f21766a.y = (f3 * pointF.y) + (f4 * this.b.y) + (f5 * pointF2.y);
        return this.f21766a;
    }
}
