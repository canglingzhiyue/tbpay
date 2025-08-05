package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v7.widget.w;

/* loaded from: classes2.dex */
class l extends n {
    @Override // android.support.v7.widget.n, android.support.v7.widget.p
    public void a() {
        w.f1510a = new w.a() { // from class: android.support.v7.widget.l.1
            @Override // android.support.v7.widget.w.a
            public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
                canvas.drawRoundRect(rectF, f, f, paint);
            }
        };
    }
}
