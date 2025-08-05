package com.airbnb.lottie.model.content;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import tb.agn;
import tb.ags;
import tb.aia;
import tb.aib;
import tb.aic;
import tb.aie;

/* loaded from: classes2.dex */
public class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final GradientType f1761a;
    private final Path.FillType b;
    private final aib c;
    private final aic d;
    private final aie e;
    private final aie f;
    private final String g;
    private final aia h;
    private final aia i;
    private final boolean j;

    public e(String str, GradientType gradientType, Path.FillType fillType, aib aibVar, aic aicVar, aie aieVar, aie aieVar2, aia aiaVar, aia aiaVar2, boolean z) {
        this.f1761a = gradientType;
        this.b = fillType;
        this.c = aibVar;
        this.d = aicVar;
        this.e = aieVar;
        this.f = aieVar2;
        this.g = str;
        this.h = aiaVar;
        this.i = aiaVar2;
        this.j = z;
    }

    public String a() {
        return this.g;
    }

    @Override // com.airbnb.lottie.model.content.c
    public agn a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new ags(lottieDrawable, aVar, this);
    }

    public GradientType b() {
        return this.f1761a;
    }

    public Path.FillType c() {
        return this.b;
    }

    public aib d() {
        return this.c;
    }

    public aic e() {
        return this.d;
    }

    public aie f() {
        return this.e;
    }

    public aie g() {
        return this.f;
    }

    public boolean h() {
        return this.j;
    }
}
