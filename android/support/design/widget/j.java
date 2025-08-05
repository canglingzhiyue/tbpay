package android.support.design.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
class j extends android.support.v7.graphics.drawable.a {

    /* renamed from: a  reason: collision with root package name */
    static final double f1220a = Math.cos(Math.toRadians(45.0d));
    final Paint b;
    final Paint c;
    final RectF d;
    float e;
    Path f;
    float g;
    float h;
    float i;
    float j;
    private boolean k;
    private final int l;
    private final int m;
    private final int n;
    private boolean o;
    private float p;
    private boolean q;

    public j(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.k = true;
        this.o = true;
        this.q = false;
        this.l = ContextCompat.getColor(context, R.color.design_fab_shadow_start_color);
        this.m = ContextCompat.getColor(context, R.color.design_fab_shadow_mid_color);
        this.n = ContextCompat.getColor(context, R.color.design_fab_shadow_end_color);
        this.b = new Paint(5);
        this.b.setStyle(Paint.Style.FILL);
        this.e = Math.round(f);
        this.d = new RectF();
        this.c = new Paint(this.b);
        this.c.setAntiAlias(false);
        a(f2, f3);
    }

    public static float a(float f, float f2, boolean z) {
        return z ? (float) ((f * 1.5f) + ((1.0d - f1220a) * f2)) : f * 1.5f;
    }

    private void a(Canvas canvas) {
        int i;
        float f;
        int i2;
        int i3;
        int save = canvas.save();
        canvas.rotate(this.p, this.d.centerX(), this.d.centerY());
        float f2 = this.e;
        float f3 = (-f2) - this.i;
        float f4 = f2 * 2.0f;
        boolean z = this.d.width() - f4 > 0.0f;
        boolean z2 = this.d.height() - f4 > 0.0f;
        float f5 = this.j;
        float f6 = f2 / ((f5 - (0.5f * f5)) + f2);
        float f7 = f2 / ((f5 - (0.25f * f5)) + f2);
        float f8 = f2 / ((f5 - f5) + f2);
        int save2 = canvas.save();
        canvas.translate(this.d.left + f2, this.d.top + f2);
        canvas.scale(f6, f7);
        canvas.drawPath(this.f, this.b);
        if (z) {
            canvas.scale(1.0f / f6, 1.0f);
            i = save;
            f = f8;
            canvas.drawRect(0.0f, f3, this.d.width() - f4, -this.e, this.c);
            i2 = save2;
        } else {
            i = save;
            f = f8;
            i2 = save2;
        }
        canvas.restoreToCount(i2);
        int save3 = canvas.save();
        canvas.translate(this.d.right - f2, this.d.bottom - f2);
        canvas.scale(f6, f);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f, this.b);
        if (z) {
            canvas.scale(1.0f / f6, 1.0f);
            i3 = save3;
            canvas.drawRect(0.0f, f3, this.d.width() - f4, (-this.e) + this.i, this.c);
        } else {
            i3 = save3;
        }
        canvas.restoreToCount(i3);
        int save4 = canvas.save();
        canvas.translate(this.d.left + f2, this.d.bottom - f2);
        canvas.scale(f6, f);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f, this.b);
        if (z2) {
            canvas.scale(1.0f / f, 1.0f);
            canvas.drawRect(0.0f, f3, this.d.height() - f4, -this.e, this.c);
        }
        canvas.restoreToCount(save4);
        int save5 = canvas.save();
        canvas.translate(this.d.right - f2, this.d.top + f2);
        canvas.scale(f6, f7);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f, this.b);
        if (z2) {
            canvas.scale(1.0f / f7, 1.0f);
            canvas.drawRect(0.0f, f3, this.d.height() - f4, -this.e, this.c);
        }
        canvas.restoreToCount(save5);
        canvas.restoreToCount(i);
    }

    private void a(Rect rect) {
        float f = this.h * 1.5f;
        this.d.set(rect.left + this.h, rect.top + f, rect.right - this.h, rect.bottom - f);
        b().setBounds((int) this.d.left, (int) this.d.top, (int) this.d.right, (int) this.d.bottom);
        c();
    }

    public static float b(float f, float f2, boolean z) {
        return z ? (float) (f + ((1.0d - f1220a) * f2)) : f;
    }

    private static int c(float f) {
        int round = Math.round(f);
        return round % 2 == 1 ? round - 1 : round;
    }

    private void c() {
        float f = this.e;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.i;
        rectF2.inset(-f2, -f2);
        Path path = this.f;
        if (path == null) {
            this.f = new Path();
        } else {
            path.reset();
        }
        this.f.setFillType(Path.FillType.EVEN_ODD);
        this.f.moveTo(-this.e, 0.0f);
        this.f.rLineTo(-this.i, 0.0f);
        this.f.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f.arcTo(rectF, 270.0f, -90.0f, false);
        this.f.close();
        float f3 = -rectF2.top;
        if (f3 > 0.0f) {
            float f4 = this.e / f3;
            this.b.setShader(new RadialGradient(0.0f, 0.0f, f3, new int[]{0, this.l, this.m, this.n}, new float[]{0.0f, f4, ((1.0f - f4) / 2.0f) + f4, 1.0f}, Shader.TileMode.CLAMP));
        }
        this.c.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.l, this.m, this.n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.c.setAntiAlias(false);
    }

    public float a() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(float f) {
        if (this.p != f) {
            this.p = f;
            invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float c = c(f);
        float c2 = c(f2);
        if (c > c2) {
            if (!this.q) {
                this.q = true;
            }
            c = c2;
        }
        if (this.j == c && this.h == c2) {
            return;
        }
        this.j = c;
        this.h = c2;
        this.i = Math.round(c * 1.5f);
        this.g = c2;
        this.k = true;
        invalidateSelf();
    }

    public void a(boolean z) {
        this.o = z;
        invalidateSelf();
    }

    public void b(float f) {
        a(f, this.h);
    }

    @Override // android.support.v7.graphics.drawable.a, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.k) {
            a(getBounds());
            this.k = false;
        }
        a(canvas);
        super.draw(canvas);
    }

    @Override // android.support.v7.graphics.drawable.a, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.support.v7.graphics.drawable.a, android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(a(this.h, this.e, this.o));
        int ceil2 = (int) Math.ceil(b(this.h, this.e, this.o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    @Override // android.support.v7.graphics.drawable.a, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.k = true;
    }

    @Override // android.support.v7.graphics.drawable.a, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        super.setAlpha(i);
        this.b.setAlpha(i);
        this.c.setAlpha(i);
    }
}
