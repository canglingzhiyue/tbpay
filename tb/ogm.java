package tb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ogm extends ImageSpan {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALIGN_BOTTOM = 2;
    public static final int ALIGN_CENTER = 0;
    public static final int ALIGN_TOP = 1;

    /* renamed from: a  reason: collision with root package name */
    private int f32037a;
    private int b;
    private int c;
    private int d;
    private float e;
    private float[] f;
    private int g;
    private Path h;
    private String i;
    private int j;
    private int k;
    private RectF l;

    static {
        kge.a(-1485884889);
    }

    public ogm(Drawable drawable, int i, int i2) {
        super(drawable, i);
        this.f32037a = 0;
        this.d = 0;
        this.i = "cover";
        this.l = null;
        this.f32037a = i2;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        this.e = f;
        if (f <= 0.0f) {
            return;
        }
        Path path = this.h;
        if (path == null) {
            this.h = new Path();
        } else {
            path.reset();
        }
        this.h.addRoundRect(new RectF(0.0f, 0.0f, getDrawable().getBounds().width(), getDrawable().getBounds().height()), f, f, Path.Direction.CW);
    }

    public void a(float[] fArr) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c197633", new Object[]{this, fArr});
            return;
        }
        this.f = fArr;
        if (fArr == null) {
            return;
        }
        int length = fArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (fArr[i] > 0.0f) {
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            return;
        }
        Path path = this.h;
        if (path == null) {
            this.h = new Path();
        } else {
            path.reset();
        }
        this.h.addRoundRect(new RectF(0.0f, 0.0f, getDrawable().getBounds().width(), getDrawable().getBounds().height()), fArr, Path.Direction.CW);
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            this.f32037a = i;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46263898", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2), fontMetricsInt})).intValue();
        }
        Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i4 = (bounds.bottom - bounds.top) / 2;
            int i5 = i3 / 4;
            int i6 = i4 - i5;
            int i7 = -(i4 + i5);
            fontMetricsInt.ascent = i7;
            fontMetricsInt.top = i7;
            fontMetricsInt.bottom = i6;
            fontMetricsInt.descent = i6;
        }
        return bounds.right + this.b + this.c;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint.FontMetrics fontMetrics;
        float f2;
        float f3;
        float f4;
        Paint.FontMetrics fontMetrics2;
        int i6;
        float f5;
        float f6;
        float f7;
        float f8;
        IpChange ipChange = $ipChange;
        int i7 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5acc076", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Integer(i5), paint});
            return;
        }
        Drawable drawable = getDrawable();
        int height = drawable.getBounds().height();
        canvas.save();
        canvas.translate(this.b, 0.0f);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i8 = this.j;
        if (i8 <= 0) {
            i8 = drawable.getBounds().width();
        }
        int i9 = this.k;
        if (i9 <= 0) {
            i9 = drawable.getBounds().height();
        }
        if ("contain".equals(this.i)) {
            if (intrinsicWidth * i9 > i8 * intrinsicHeight) {
                f6 = i8 / intrinsicWidth;
                f8 = (i9 - (intrinsicHeight * f6)) * 0.5f;
                f7 = 0.0f;
            } else {
                f6 = i9 / intrinsicHeight;
                f7 = (i8 - (intrinsicWidth * f6)) * 0.5f;
                f8 = 0.0f;
            }
            drawable.setBounds(0, 0, (int) (intrinsicWidth * f6), (int) (intrinsicHeight * f6));
            canvas.translate(f7, f8);
            this.l = null;
            fontMetrics = null;
        } else if ("cover".equals(this.i)) {
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            if (intrinsicWidth * i9 > i8 * intrinsicHeight) {
                f2 = i9 / intrinsicHeight;
                f4 = ((intrinsicWidth * f2) - i8) * 0.5f;
                f3 = 0.0f;
            } else {
                f2 = i8 / intrinsicWidth;
                f3 = ((intrinsicHeight * f2) - i9) * 0.5f;
                f4 = 0.0f;
            }
            drawable.setBounds(0, 0, (int) (intrinsicWidth * f2), (int) (intrinsicHeight * f2));
            this.l = new RectF(f4, f3, i8 + f4, i9 + f3);
            canvas.translate(-f4, -f3);
            fontMetrics = null;
        } else {
            drawable.setBounds(0, 0, i8, i9);
            fontMetrics = null;
            this.l = null;
        }
        int i10 = i5 - i3;
        if (paint != null) {
            fontMetrics2 = paint.getFontMetrics();
            if (fontMetrics2 != null) {
                i10 = (int) (fontMetrics2.bottom - fontMetrics2.top);
            }
        } else {
            fontMetrics2 = fontMetrics;
        }
        boolean z = fontMetrics2 != null;
        int i11 = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (z) {
                        f5 = (i4 + fontMetrics2.descent) - height;
                        i6 = 2;
                    } else {
                        i7 = i10 - height;
                    }
                }
                i6 = 2;
                f5 = 0.0f;
            } else {
                if (z) {
                    f5 = i4 + fontMetrics2.ascent;
                    i6 = 2;
                }
                i6 = 2;
                f5 = 0.0f;
            }
        } else if (z) {
            float f9 = i4;
            f5 = ((((fontMetrics2.descent + f9) + f9) + fontMetrics2.ascent) / 2.0f) - (height / 2.0f);
            i6 = 2;
        } else {
            i6 = 2;
            i7 = (i10 - height) / 2;
            f5 = 0.0f;
        }
        if (!z) {
            f5 = (i7 + i3) - (this.f32037a / i6);
        }
        canvas.translate(f, f5);
        Path path = this.h;
        if (path != null && !path.isEmpty()) {
            canvas.clipPath(this.h);
        }
        RectF rectF = this.l;
        if (rectF != null) {
            canvas.clipRect(rectF);
        }
        drawable.draw(canvas);
        canvas.restore();
    }
}
