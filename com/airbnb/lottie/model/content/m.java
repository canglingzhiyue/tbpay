package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import tb.agn;
import tb.ahc;
import tb.aig;

/* loaded from: classes2.dex */
public class m implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f1769a;
    private final int b;
    private final aig c;
    private final boolean d;

    public m(String str, int i, aig aigVar, boolean z) {
        this.f1769a = str;
        this.b = i;
        this.c = aigVar;
        this.d = z;
    }

    public String a() {
        return this.f1769a;
    }

    @Override // com.airbnb.lottie.model.content.c
    public agn a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new ahc(lottieDrawable, aVar, this);
    }

    public aig b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f1769a + ", index=" + this.b + '}';
    }
}
