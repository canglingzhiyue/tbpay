package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.ColorUtils;

/* loaded from: classes2.dex */
class c extends Drawable {
    float d;
    private int e;
    private int f;
    private int g;
    private int h;
    private ColorStateList i;
    private int j;
    private float l;
    final Rect b = new Rect();
    final RectF c = new RectF();
    private boolean k = true;

    /* renamed from: a  reason: collision with root package name */
    final Paint f1208a = new Paint(1);

    public c() {
        this.f1208a.setStyle(Paint.Style.STROKE);
    }

    private Shader a() {
        Rect rect = this.b;
        copyBounds(rect);
        float height = this.d / rect.height();
        return new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{ColorUtils.compositeColors(this.e, this.j), ColorUtils.compositeColors(this.f, this.j), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.f, 0), this.j), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.h, 0), this.j), ColorUtils.compositeColors(this.h, this.j), ColorUtils.compositeColors(this.g, this.j)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f) {
        if (this.d != f) {
            this.d = f;
            this.f1208a.setStrokeWidth(f * 1.3333f);
            this.k = true;
            invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2, int i3, int i4) {
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.j = colorStateList.getColorForState(getState(), this.j);
        }
        this.i = colorStateList;
        this.k = true;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(float f) {
        if (f != this.l) {
            this.l = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.k) {
            this.f1208a.setShader(a());
            this.k = false;
        }
        float strokeWidth = this.f1208a.getStrokeWidth() / 2.0f;
        RectF rectF = this.c;
        copyBounds(this.b);
        rectF.set(this.b);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.l, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f1208a);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.d > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int round = Math.round(this.d);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.i;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.k = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.i;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.j)) != this.j) {
            this.k = true;
            this.j = colorForState;
        }
        if (this.k) {
            invalidateSelf();
        }
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f1208a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1208a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
