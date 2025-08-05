package com.taobao.search.common.uikit;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import tb.kge;
import tb.nia;

/* loaded from: classes7.dex */
public class RoundedCornersBitmapProcessor implements nia {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f19025a;
    private final int b;
    private final int c;
    private final int d;
    private final CornerType e;
    private final ImageView.ScaleType f;

    /* renamed from: com.taobao.search.common.uikit.RoundedCornersBitmapProcessor$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19026a;
        public static final /* synthetic */ int[] b = new int[CornerType.values().length];

        static {
            try {
                b[CornerType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[CornerType.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[CornerType.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[CornerType.LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[CornerType.RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f19026a = new int[ImageView.ScaleType.values().length];
            try {
                f19026a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public enum CornerType {
        ALL,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    static {
        kge.a(-733123659);
        kge.a(1386160431);
    }

    public RoundedCornersBitmapProcessor(int i, int i2, int i3, int i4, CornerType cornerType, ImageView.ScaleType scaleType) {
        this.f19025a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = cornerType;
        this.f = scaleType == null ? ImageView.ScaleType.CENTER_CROP : scaleType;
    }

    @Override // tb.nia
    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return "W" + this.f19025a + "$H" + this.b + "$R" + this.c + "$M" + this.d + "$P" + this.e.ordinal() + "$T" + this.f.ordinal();
    }

    @Override // tb.nia
    public Bitmap process(String str, nia.a aVar, Bitmap bitmap) {
        float f;
        Bitmap a2;
        int i;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6877629f", new Object[]{this, str, aVar, bitmap});
        }
        float f2 = 1.0f;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = this.f19025a;
        if (i2 > 0 && (i = this.b) > 0 && (i2 != width || i != height)) {
            z = true;
        }
        float f3 = 0.0f;
        if (!z || AnonymousClass1.f19026a[this.f.ordinal()] != 1) {
            f = 0.0f;
        } else {
            int i3 = this.b;
            int i4 = width * i3;
            int i5 = this.f19025a;
            if (i4 > height * i5) {
                float f4 = i3 / height;
                float f5 = width * f4;
                width = (int) (f5 + 0.5d);
                f3 = (i5 - f5) * 0.5f;
                f = 0.0f;
                height = i3;
                f2 = f4;
            } else {
                float f6 = i5 / width;
                float f7 = height * f6;
                height = (int) (f7 + 0.5d);
                f = (i3 - f7) * 0.5f;
                f2 = f6;
                width = i5;
            }
        }
        if (z) {
            a2 = aVar.a(this.f19025a, this.b, bitmap.getConfig() != null ? bitmap.getConfig() : PexodeOptions.CONFIG);
        } else {
            a2 = aVar.a(width, height, bitmap.getConfig() != null ? bitmap.getConfig() : PexodeOptions.CONFIG);
        }
        Canvas canvas = new Canvas(a2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        if (z) {
            Matrix matrix = new Matrix();
            matrix.setScale(f2, f2);
            matrix.postTranslate(f3, f);
            bitmapShader.setLocalMatrix(matrix);
        }
        paint.setShader(bitmapShader);
        if (z) {
            a(canvas, paint, this.f19025a, this.b);
        } else {
            a(canvas, paint, width, height);
        }
        return a2;
    }

    private void a(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85fae92", new Object[]{this, canvas, paint, new Float(f), new Float(f2)});
            return;
        }
        int i = this.d;
        float f3 = f - i;
        float f4 = f2 - i;
        float f5 = i;
        float f6 = i;
        int i2 = AnonymousClass1.b[this.e.ordinal()];
        RectF rectF2 = null;
        if (i2 == 1) {
            rectF2 = new RectF(f5, f6, f3, f4);
            rectF = null;
        } else if (i2 == 2) {
            rectF2 = new RectF(f5, f6, f3, (this.c << 1) + f6);
            rectF = new RectF(f5, f6 + this.c, f3, f4);
        } else if (i2 == 3) {
            rectF2 = new RectF(f5, f4 - (this.c << 1), f3, f4);
            rectF = new RectF(f5, f6, f3, f4 - this.c);
        } else if (i2 == 4) {
            rectF2 = new RectF(f5, f6, (this.c << 1) + f5, f4);
            rectF = new RectF(f5 + this.c, f6, f3, f4);
        } else if (i2 != 5) {
            rectF = null;
        } else {
            rectF2 = new RectF(f3 - (this.c << 1), f6, f3, f4);
            rectF = new RectF(f5, f6, f3 - this.c, f4);
        }
        int i3 = this.c;
        canvas.drawRoundRect(rectF2, i3, i3, paint);
        if (rectF == null) {
            return;
        }
        canvas.drawRect(rectF, paint);
    }
}
