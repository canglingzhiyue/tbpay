package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import tb.agn;
import tb.agq;
import tb.aie;
import tb.ail;

/* loaded from: classes2.dex */
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f1759a;
    private final ail<PointF, PointF> b;
    private final aie c;
    private final boolean d;
    private final boolean e;

    public b(String str, ail<PointF, PointF> ailVar, aie aieVar, boolean z, boolean z2) {
        this.f1759a = str;
        this.b = ailVar;
        this.c = aieVar;
        this.d = z;
        this.e = z2;
    }

    public String a() {
        return this.f1759a;
    }

    @Override // com.airbnb.lottie.model.content.c
    public agn a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new agq(lottieDrawable, aVar, this);
    }

    public ail<PointF, PointF> b() {
        return this.b;
    }

    public aie c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }
}
