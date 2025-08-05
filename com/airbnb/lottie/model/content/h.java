package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import tb.agn;
import tb.aha;
import tb.aia;
import tb.aik;

/* loaded from: classes2.dex */
public class h implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f1764a;
    private final aia b;
    private final aia c;
    private final aik d;
    private final boolean e;

    public h(String str, aia aiaVar, aia aiaVar2, aik aikVar, boolean z) {
        this.f1764a = str;
        this.b = aiaVar;
        this.c = aiaVar2;
        this.d = aikVar;
        this.e = z;
    }

    public String a() {
        return this.f1764a;
    }

    @Override // com.airbnb.lottie.model.content.c
    public agn a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new aha(lottieDrawable, aVar, this);
    }

    public aia b() {
        return this.b;
    }

    public aia c() {
        return this.c;
    }

    public aik d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }
}
