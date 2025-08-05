package android.support.v7.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class DrawerArrowDrawable extends Drawable {
    public static final int ARROW_DIRECTION_END = 3;
    public static final int ARROW_DIRECTION_LEFT = 0;
    public static final int ARROW_DIRECTION_RIGHT = 1;
    public static final int ARROW_DIRECTION_START = 2;
    private static final float b = (float) Math.toRadians(45.0d);
    private float c;
    private float d;
    private float e;
    private float f;
    private boolean g;
    private final int i;
    private float k;
    private float l;

    /* renamed from: a  reason: collision with root package name */
    private final Paint f1353a = new Paint();
    private final Path h = new Path();
    private boolean j = false;
    private int m = 2;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ArrowDirection {
    }

    public DrawerArrowDrawable(Context context) {
        this.f1353a.setStyle(Paint.Style.STROKE);
        this.f1353a.setStrokeJoin(Paint.Join.MITER);
        this.f1353a.setStrokeCap(Paint.Cap.BUTT);
        this.f1353a.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, R.styleable.DrawerArrowToggle, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        a(obtainStyledAttributes.getColor(R.styleable.DrawerArrowToggle_color, 0));
        a(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_thickness, 0.0f));
        a(obtainStyledAttributes.getBoolean(R.styleable.DrawerArrowToggle_spinBars, true));
        b(Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.i = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DrawerArrowToggle_drawableSize, 0);
        this.d = Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_barLength, 0.0f));
        this.c = Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.e = obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private static float a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    public void a(float f) {
        if (this.f1353a.getStrokeWidth() != f) {
            this.f1353a.setStrokeWidth(f);
            this.l = (float) ((f / 2.0f) * Math.cos(b));
            invalidateSelf();
        }
    }

    public void a(int i) {
        if (i != this.f1353a.getColor()) {
            this.f1353a.setColor(i);
            invalidateSelf();
        }
    }

    public void a(boolean z) {
        if (this.g != z) {
            this.g = z;
            invalidateSelf();
        }
    }

    public void b(float f) {
        if (f != this.f) {
            this.f = f;
            invalidateSelf();
        }
    }

    public void b(boolean z) {
        if (this.j != z) {
            this.j = z;
            invalidateSelf();
        }
    }

    public void c(float f) {
        if (this.k != f) {
            this.k = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        Rect bounds = getBounds();
        int i = this.m;
        boolean z = false;
        int i2 = 1;
        if (i != 0 && (i == 1 || (i == 3 ? DrawableCompat.getLayoutDirection(this) == 0 : DrawableCompat.getLayoutDirection(this) == 1))) {
            z = true;
        }
        float f2 = this.c;
        float a2 = a(this.d, (float) Math.sqrt(f2 * f2 * 2.0f), this.k);
        float a3 = a(this.d, this.e, this.k);
        float round = Math.round(a(0.0f, this.l, this.k));
        float a4 = a(0.0f, b, this.k);
        float a5 = a(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.k);
        double d = a2;
        double d2 = a4;
        boolean z2 = z;
        float round2 = (float) Math.round(Math.cos(d2) * d);
        float round3 = (float) Math.round(d * Math.sin(d2));
        this.h.rewind();
        float a6 = a(this.f + this.f1353a.getStrokeWidth(), -this.l, this.k);
        float f3 = (-a3) / 2.0f;
        this.h.moveTo(f3 + round, 0.0f);
        this.h.rLineTo(a3 - (round * 2.0f), 0.0f);
        this.h.moveTo(f3, a6);
        this.h.rLineTo(round2, round3);
        this.h.moveTo(f3, -a6);
        this.h.rLineTo(round2, -round3);
        this.h.close();
        canvas.save();
        float strokeWidth = this.f1353a.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (height - (2.0f * f))) / 4) << 1) + (strokeWidth * 1.5f) + this.f);
        if (this.g) {
            if (this.j ^ z2) {
                i2 = -1;
            }
            canvas.rotate(a5 * i2);
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.h, this.f1353a);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f1353a.getAlpha()) {
            this.f1353a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1353a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
