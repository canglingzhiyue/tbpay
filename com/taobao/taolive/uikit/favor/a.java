package com.taobao.taolive.uikit.favor;

import android.animation.TypeEvaluator;
import android.graphics.PointF;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class a implements TypeEvaluator<PointF> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private PointF f22019a;
    private PointF b = new PointF();

    static {
        kge.a(1820547454);
        kge.a(-738482422);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.graphics.PointF, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public /* synthetic */ PointF evaluate(float f, PointF pointF, PointF pointF2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6810f25a", new Object[]{this, new Float(f), pointF, pointF2}) : a(f, pointF, pointF2);
    }

    public a(PointF pointF) {
        this.f22019a = pointF;
    }

    public PointF a(float f, PointF pointF, PointF pointF2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("dcb9c6f", new Object[]{this, new Float(f), pointF, pointF2});
        }
        float f2 = 1.0f - f;
        float f3 = f2 * f2;
        float f4 = f2 * 2.0f * f;
        float f5 = f * f;
        this.b.x = (pointF.x * f3) + (this.f22019a.x * f4) + (pointF2.x * f5);
        this.b.y = (f3 * pointF.y) + (f4 * this.f22019a.y) + (f5 * pointF2.y);
        return this.b;
    }
}
