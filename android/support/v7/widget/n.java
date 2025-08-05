package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.widget.w;

/* loaded from: classes2.dex */
class n implements p {

    /* renamed from: a  reason: collision with root package name */
    private final RectF f1496a = new RectF();

    private w a(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new w(context.getResources(), colorStateList, f, f2, f3);
    }

    private w j(o oVar) {
        return (w) oVar.c();
    }

    @Override // android.support.v7.widget.p
    public float a(o oVar) {
        return j(oVar).c();
    }

    @Override // android.support.v7.widget.p
    public void a() {
        w.f1510a = new w.a() { // from class: android.support.v7.widget.n.1
            @Override // android.support.v7.widget.w.a
            public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
                float f2 = 2.0f * f;
                float width = (rectF.width() - f2) - 1.0f;
                float height = (rectF.height() - f2) - 1.0f;
                if (f >= 1.0f) {
                    float f3 = f + 0.5f;
                    float f4 = -f3;
                    n.this.f1496a.set(f4, f4, f3, f3);
                    int save = canvas.save();
                    canvas.translate(rectF.left + f3, rectF.top + f3);
                    canvas.drawArc(n.this.f1496a, 180.0f, 90.0f, true, paint);
                    canvas.translate(width, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(n.this.f1496a, 180.0f, 90.0f, true, paint);
                    canvas.translate(height, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(n.this.f1496a, 180.0f, 90.0f, true, paint);
                    canvas.translate(width, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(n.this.f1496a, 180.0f, 90.0f, true, paint);
                    canvas.restoreToCount(save);
                    canvas.drawRect((rectF.left + f3) - 1.0f, rectF.top, (rectF.right - f3) + 1.0f, rectF.top + f3, paint);
                    canvas.drawRect((rectF.left + f3) - 1.0f, rectF.bottom - f3, (rectF.right - f3) + 1.0f, rectF.bottom, paint);
                }
                canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
            }
        };
    }

    @Override // android.support.v7.widget.p
    public void a(o oVar, float f) {
        j(oVar).a(f);
        f(oVar);
    }

    @Override // android.support.v7.widget.p
    public void a(o oVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        w a2 = a(context, colorStateList, f, f2, f3);
        a2.a(oVar.b());
        oVar.a(a2);
        f(oVar);
    }

    @Override // android.support.v7.widget.p
    public void a(o oVar, ColorStateList colorStateList) {
        j(oVar).a(colorStateList);
    }

    @Override // android.support.v7.widget.p
    public float b(o oVar) {
        return j(oVar).d();
    }

    @Override // android.support.v7.widget.p
    public void b(o oVar, float f) {
        j(oVar).c(f);
        f(oVar);
    }

    @Override // android.support.v7.widget.p
    public float c(o oVar) {
        return j(oVar).e();
    }

    @Override // android.support.v7.widget.p
    public void c(o oVar, float f) {
        j(oVar).b(f);
    }

    @Override // android.support.v7.widget.p
    public float d(o oVar) {
        return j(oVar).a();
    }

    @Override // android.support.v7.widget.p
    public float e(o oVar) {
        return j(oVar).b();
    }

    @Override // android.support.v7.widget.p
    public void f(o oVar) {
        Rect rect = new Rect();
        j(oVar).a(rect);
        oVar.a((int) Math.ceil(b(oVar)), (int) Math.ceil(c(oVar)));
        oVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.support.v7.widget.p
    public void g(o oVar) {
    }

    @Override // android.support.v7.widget.p
    public void h(o oVar) {
        j(oVar).a(oVar.b());
        f(oVar);
    }

    @Override // android.support.v7.widget.p
    public ColorStateList i(o oVar) {
        return j(oVar).f();
    }
}
