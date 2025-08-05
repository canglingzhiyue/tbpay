package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeStroke;
import java.util.List;
import tb.agn;
import tb.agt;
import tb.aia;
import tb.aib;
import tb.aic;
import tb.aie;

/* loaded from: classes2.dex */
public class f implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f1762a;
    private final GradientType b;
    private final aib c;
    private final aic d;
    private final aie e;
    private final aie f;
    private final aia g;
    private final ShapeStroke.LineCapType h;
    private final ShapeStroke.LineJoinType i;
    private final float j;
    private final List<aia> k;
    private final aia l;
    private final boolean m;

    public f(String str, GradientType gradientType, aib aibVar, aic aicVar, aie aieVar, aie aieVar2, aia aiaVar, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f, List<aia> list, aia aiaVar2, boolean z) {
        this.f1762a = str;
        this.b = gradientType;
        this.c = aibVar;
        this.d = aicVar;
        this.e = aieVar;
        this.f = aieVar2;
        this.g = aiaVar;
        this.h = lineCapType;
        this.i = lineJoinType;
        this.j = f;
        this.k = list;
        this.l = aiaVar2;
        this.m = z;
    }

    public String a() {
        return this.f1762a;
    }

    @Override // com.airbnb.lottie.model.content.c
    public agn a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new agt(lottieDrawable, aVar, this);
    }

    public GradientType b() {
        return this.b;
    }

    public aib c() {
        return this.c;
    }

    public aic d() {
        return this.d;
    }

    public aie e() {
        return this.e;
    }

    public aie f() {
        return this.f;
    }

    public aia g() {
        return this.g;
    }

    public ShapeStroke.LineCapType h() {
        return this.h;
    }

    public ShapeStroke.LineJoinType i() {
        return this.i;
    }

    public List<aia> j() {
        return this.k;
    }

    public aia k() {
        return this.l;
    }

    public float l() {
        return this.j;
    }

    public boolean m() {
        return this.m;
    }
}
