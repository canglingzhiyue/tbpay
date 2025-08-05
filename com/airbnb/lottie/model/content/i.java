package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import tb.agn;
import tb.ahb;
import tb.ail;

/* loaded from: classes2.dex */
public class i implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f1765a;
    private final ail<Float, Float> b;

    public i(String str, ail<Float, Float> ailVar) {
        this.f1765a = str;
        this.b = ailVar;
    }

    public String a() {
        return this.f1765a;
    }

    @Override // com.airbnb.lottie.model.content.c
    public agn a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new ahb(lottieDrawable, aVar, this);
    }

    public ail<Float, Float> b() {
        return this.b;
    }
}
