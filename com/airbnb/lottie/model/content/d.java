package com.airbnb.lottie.model.content;

import tb.akf;
import tb.akh;
import tb.akk;
import tb.riy;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f1760a;
    private final int[] b;

    public d(float[] fArr, int[] iArr) {
        this.f1760a = fArr;
        this.b = iArr;
    }

    public void a(d dVar, d dVar2, float f) {
        if (dVar.b.length == dVar2.b.length) {
            for (int i = 0; i < dVar.b.length; i++) {
                this.f1760a[i] = akk.a(dVar.f1760a[i], dVar2.f1760a[i], f);
                this.b[i] = akf.a(f, dVar.b[i], dVar2.b[i]);
            }
            return;
        }
        akh.c("Cannot interpolate between gradients. Lengths vary (" + dVar.b.length + " vs " + dVar2.b.length + riy.BRACKET_END_STR);
    }

    public float[] a() {
        return this.f1760a;
    }

    public int[] b() {
        return this.b;
    }

    public int c() {
        return this.b.length;
    }
}
