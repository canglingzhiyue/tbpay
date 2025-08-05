package com.airbnb.lottie.model.content;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import tb.agn;
import tb.agr;
import tb.ahz;
import tb.aic;

/* loaded from: classes2.dex */
public class k implements c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f1767a;
    private final Path.FillType b;
    private final String c;
    private final ahz d;
    private final aic e;
    private final boolean f;

    public k(String str, boolean z, Path.FillType fillType, ahz ahzVar, aic aicVar, boolean z2) {
        this.c = str;
        this.f1767a = z;
        this.b = fillType;
        this.d = ahzVar;
        this.e = aicVar;
        this.f = z2;
    }

    public String a() {
        return this.c;
    }

    @Override // com.airbnb.lottie.model.content.c
    public agn a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new agr(lottieDrawable, aVar, this);
    }

    public ahz b() {
        return this.d;
    }

    public aic c() {
        return this.e;
    }

    public Path.FillType d() {
        return this.b;
    }

    public boolean e() {
        return this.f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f1767a + '}';
    }
}
