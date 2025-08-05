package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import java.util.Arrays;
import java.util.List;
import tb.agn;
import tb.ago;

/* loaded from: classes2.dex */
public class l implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f1768a;
    private final List<c> b;
    private final boolean c;

    public l(String str, List<c> list, boolean z) {
        this.f1768a = str;
        this.b = list;
        this.c = z;
    }

    public String a() {
        return this.f1768a;
    }

    @Override // com.airbnb.lottie.model.content.c
    public agn a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new ago(lottieDrawable, aVar, this);
    }

    public List<c> b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f1768a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
