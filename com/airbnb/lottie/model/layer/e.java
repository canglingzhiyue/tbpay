package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.l;
import java.util.Collections;
import java.util.List;
import tb.ago;
import tb.aiz;

/* loaded from: classes2.dex */
public class e extends a {
    private final ago g;
    private final b h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(LottieDrawable lottieDrawable, Layer layer, b bVar) {
        super(lottieDrawable, layer);
        this.h = bVar;
        this.g = new ago(lottieDrawable, this, new l("__container", layer.n(), false));
        this.g.a(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.a, tb.agp
    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        this.g.a(rectF, this.f1775a, z);
    }

    @Override // com.airbnb.lottie.model.layer.a
    void b(Canvas canvas, Matrix matrix, int i) {
        this.g.a(canvas, matrix, i);
    }

    @Override // com.airbnb.lottie.model.layer.a
    protected void b(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        this.g.a(dVar, i, list, dVar2);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public com.airbnb.lottie.model.content.a e() {
        com.airbnb.lottie.model.content.a e = super.e();
        return e != null ? e : this.h.e();
    }

    @Override // com.airbnb.lottie.model.layer.a
    public aiz f() {
        aiz f = super.f();
        return f != null ? f : this.h.f();
    }
}
