package com.taobao.phenix.compat.effects;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import tb.nia;

/* loaded from: classes7.dex */
public class RoundedCornersBitmapProcessor implements nia {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f18896a;
    private final int b;
    private final int c;
    private final int d;
    private final CornerType e;

    /* renamed from: com.taobao.phenix.compat.effects.RoundedCornersBitmapProcessor$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18897a = new int[CornerType.values().length];

        static {
            try {
                f18897a[CornerType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18897a[CornerType.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18897a[CornerType.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18897a[CornerType.LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18897a[CornerType.RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
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

    public RoundedCornersBitmapProcessor(int i, int i2) {
        this(0, 0, i, i2, CornerType.ALL);
    }

    public RoundedCornersBitmapProcessor(int i, int i2, CornerType cornerType) {
        this(0, 0, i, i2, cornerType);
    }

    public RoundedCornersBitmapProcessor(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, CornerType.ALL);
    }

    public RoundedCornersBitmapProcessor(int i, int i2, int i3, int i4, CornerType cornerType) {
        this.f18896a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = cornerType;
    }

    @Override // tb.nia
    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return "W" + this.f18896a + "$H" + this.b + "$R" + this.c + "$M" + this.d + "$P" + this.e.ordinal();
    }

    @Override // tb.nia
    public Bitmap process(String str, nia.a aVar, Bitmap bitmap) {
        int i;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6877629f", new Object[]{this, str, aVar, bitmap});
        }
        float f = 1.0f;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = this.f18896a;
        if (i2 > 0 && (i = this.b) > 0 && (i2 != width || i != height)) {
            z = true;
        }
        if (z) {
            int i3 = this.b;
            int i4 = width * i3;
            int i5 = this.f18896a;
            if (i4 > height * i5) {
                float f2 = i3 / height;
                width = (int) ((width * f2) + 0.5d);
                height = i3;
                f = f2;
            } else {
                f = i5 / width;
                height = (int) ((height * f) + 0.5d);
                width = i5;
            }
        }
        Bitmap a2 = aVar.a(width, height, bitmap.getConfig() != null ? bitmap.getConfig() : PexodeOptions.CONFIG);
        Canvas canvas = new Canvas(a2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        if (z) {
            Matrix matrix = new Matrix();
            matrix.setScale(f, f);
            bitmapShader.setLocalMatrix(matrix);
        }
        paint.setShader(bitmapShader);
        a(canvas, paint, width, height);
        return a2;
    }

    private void a(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85fae92", new Object[]{this, canvas, paint, new Float(f), new Float(f2)});
            return;
        }
        int i3 = this.d;
        float f3 = f - i3;
        float f4 = f2 - i3;
        int i4 = AnonymousClass1.f18897a[this.e.ordinal()];
        RectF rectF2 = null;
        if (i4 == 1) {
            int i5 = this.d;
            rectF2 = new RectF(i5, i5, f3, f4);
            rectF = null;
        } else if (i4 == 2) {
            int i6 = this.d;
            rectF2 = new RectF(i6, i6, f3, i6 + (this.c << 1));
            rectF = new RectF(this.d, i + this.c, f3, f4);
        } else if (i4 == 3) {
            rectF2 = new RectF(this.d, f4 - (this.c << 1), f3, f4);
            int i7 = this.d;
            rectF = new RectF(i7, i7, f3, f4 - this.c);
        } else if (i4 == 4) {
            int i8 = this.d;
            rectF2 = new RectF(i8, i8, i8 + (this.c << 1), f4);
            rectF = new RectF(this.c + i2, this.d, f3, f4);
        } else if (i4 != 5) {
            rectF = null;
        } else {
            rectF2 = new RectF(f3 - (this.c << 1), this.d, f3, f4);
            int i9 = this.d;
            rectF = new RectF(i9, i9, f3 - this.c, f4);
        }
        int i10 = this.c;
        canvas.drawRoundRect(rectF2, i10, i10, paint);
        if (rectF == null) {
            return;
        }
        canvas.drawRect(rectF, paint);
    }
}
