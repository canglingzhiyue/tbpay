package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.m;
import tb.agk;
import tb.ahg;
import tb.ahw;
import tb.ako;

/* loaded from: classes2.dex */
public class f extends a {
    private final RectF g;
    private final Paint h;
    private final float[] i;
    private final Path j;
    private final Layer k;
    private ahg<ColorFilter, ColorFilter> l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.g = new RectF();
        this.h = new agk();
        this.i = new float[8];
        this.j = new Path();
        this.k = layer;
        this.h.setAlpha(0);
        this.h.setStyle(Paint.Style.FILL);
        this.h.setColor(layer.p());
    }

    @Override // com.airbnb.lottie.model.layer.a, tb.agp
    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        this.g.set(0.0f, 0.0f, this.k.r(), this.k.q());
        this.f1775a.mapRect(this.g);
        rectF.set(this.g);
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.model.e
    public <T> void a(T t, ako<T> akoVar) {
        super.a((f) t, (ako<f>) akoVar);
        if (t == m.COLOR_FILTER) {
            if (akoVar == null) {
                this.l = null;
            } else {
                this.l = new ahw(akoVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void b(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.k.p());
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i / 255.0f) * (((alpha / 255.0f) * (this.d.a() == null ? 100 : this.d.a().g().intValue())) / 100.0f) * 255.0f);
        this.h.setAlpha(intValue);
        ahg<ColorFilter, ColorFilter> ahgVar = this.l;
        if (ahgVar != null) {
            this.h.setColorFilter(ahgVar.g());
        }
        if (intValue <= 0) {
            return;
        }
        float[] fArr = this.i;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = this.k.r();
        float[] fArr2 = this.i;
        fArr2[3] = 0.0f;
        fArr2[4] = this.k.r();
        this.i[5] = this.k.q();
        float[] fArr3 = this.i;
        fArr3[6] = 0.0f;
        fArr3[7] = this.k.q();
        matrix.mapPoints(this.i);
        this.j.reset();
        Path path = this.j;
        float[] fArr4 = this.i;
        path.moveTo(fArr4[0], fArr4[1]);
        Path path2 = this.j;
        float[] fArr5 = this.i;
        path2.lineTo(fArr5[2], fArr5[3]);
        Path path3 = this.j;
        float[] fArr6 = this.i;
        path3.lineTo(fArr6[4], fArr6[5]);
        Path path4 = this.j;
        float[] fArr7 = this.i;
        path4.lineTo(fArr7[6], fArr7[7]);
        Path path5 = this.j;
        float[] fArr8 = this.i;
        path5.lineTo(fArr8[0], fArr8[1]);
        this.j.close();
        canvas.drawPath(this.j, this.h);
    }
}
