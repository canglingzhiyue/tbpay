package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.i;
import com.airbnb.lottie.m;
import tb.agk;
import tb.ahg;
import tb.ahw;
import tb.akl;
import tb.ako;

/* loaded from: classes2.dex */
public class c extends a {
    private final Paint g;
    private final Rect h;
    private final Rect i;
    private final i j;
    private ahg<ColorFilter, ColorFilter> k;
    private ahg<Bitmap, Bitmap> l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.g = new agk(3);
        this.h = new Rect();
        this.i = new Rect();
        this.j = lottieDrawable.f(layer.g());
    }

    private Bitmap g() {
        Bitmap g;
        ahg<Bitmap, Bitmap> ahgVar = this.l;
        if (ahgVar == null || (g = ahgVar.g()) == null) {
            Bitmap e = this.b.e(this.c.g());
            if (e != null) {
                return e;
            }
            i iVar = this.j;
            if (iVar == null) {
                return null;
            }
            return iVar.e();
        }
        return g;
    }

    @Override // com.airbnb.lottie.model.layer.a, tb.agp
    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        if (this.j != null) {
            float a2 = akl.a();
            rectF.set(0.0f, 0.0f, this.j.a() * a2, this.j.b() * a2);
            this.f1775a.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.model.e
    public <T> void a(T t, ako<T> akoVar) {
        super.a((c) t, (ako<c>) akoVar);
        if (t == m.COLOR_FILTER) {
            if (akoVar == null) {
                this.k = null;
            } else {
                this.k = new ahw(akoVar);
            }
        } else if (t != m.IMAGE) {
        } else {
            if (akoVar == null) {
                this.l = null;
            } else {
                this.l = new ahw(akoVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void b(Canvas canvas, Matrix matrix, int i) {
        Rect rect;
        int width;
        int height;
        Bitmap g = g();
        if (g == null || g.isRecycled() || this.j == null) {
            return;
        }
        float a2 = akl.a();
        this.g.setAlpha(i);
        ahg<ColorFilter, ColorFilter> ahgVar = this.k;
        if (ahgVar != null) {
            this.g.setColorFilter(ahgVar.g());
        }
        canvas.save();
        canvas.concat(matrix);
        this.h.set(0, 0, g.getWidth(), g.getHeight());
        if (this.b.g()) {
            rect = this.i;
            width = (int) (this.j.a() * a2);
            height = this.j.b();
        } else {
            rect = this.i;
            width = (int) (g.getWidth() * a2);
            height = g.getHeight();
        }
        rect.set(0, 0, width, (int) (height * a2));
        canvas.drawBitmap(g, this.h, this.i, this.g);
        canvas.restore();
    }
}
