package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import tb.agn;
import tb.agz;
import tb.aia;
import tb.ail;

/* loaded from: classes2.dex */
public class g implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f1763a;
    private final ail<PointF, PointF> b;
    private final ail<PointF, PointF> c;
    private final aia d;
    private final boolean e;

    public g(String str, ail<PointF, PointF> ailVar, ail<PointF, PointF> ailVar2, aia aiaVar, boolean z) {
        this.f1763a = str;
        this.b = ailVar;
        this.c = ailVar2;
        this.d = aiaVar;
        this.e = z;
    }

    public String a() {
        return this.f1763a;
    }

    @Override // com.airbnb.lottie.model.content.c
    public agn a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new agz(lottieDrawable, aVar, this);
    }

    public aia b() {
        return this.d;
    }

    public ail<PointF, PointF> c() {
        return this.c;
    }

    public ail<PointF, PointF> d() {
        return this.b;
    }

    public boolean e() {
        return this.e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.c + '}';
    }
}
