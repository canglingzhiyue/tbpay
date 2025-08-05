package com.taobao.weex.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class ImageDrawable extends PaintDrawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float[] f23531a;
    private int b;
    private int c;

    static {
        kge.a(-613820352);
    }

    public static /* synthetic */ Object ipc$super(ImageDrawable imageDrawable, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1862206224) {
            super.setCornerRadii((float[]) objArr[0]);
            return null;
        } else if (hashCode != -1124151886) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDraw((Shape) objArr[0], (Canvas) objArr[1], (Paint) objArr[2]);
            return null;
        }
    }

    public static Drawable createImageDrawable(Drawable drawable, ImageView.ScaleType scaleType, float[] fArr, int i, int i2, boolean z) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("857ce053", new Object[]{drawable, scaleType, fArr, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        if (!z && i > 0 && i2 > 0) {
            if ((drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null) {
                ImageDrawable imageDrawable = new ImageDrawable();
                imageDrawable.getPaint().setFilterBitmap(true);
                imageDrawable.c = bitmap.getWidth();
                imageDrawable.b = bitmap.getHeight();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                a(scaleType, i, i2, imageDrawable, bitmapShader);
                imageDrawable.getPaint().setShader(bitmapShader);
                return imageDrawable;
            } else if (drawable instanceof ImageDrawable) {
                ImageDrawable imageDrawable2 = (ImageDrawable) drawable;
                if (imageDrawable2.getPaint() != null && (imageDrawable2.getPaint().getShader() instanceof BitmapShader)) {
                    a(scaleType, i, i2, imageDrawable2, (BitmapShader) imageDrawable2.getPaint().getShader());
                    return imageDrawable2;
                }
            }
        }
        return drawable;
    }

    private static void a(ImageView.ScaleType scaleType, int i, int i2, ImageDrawable imageDrawable, BitmapShader bitmapShader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e49d0a", new Object[]{scaleType, new Integer(i), new Integer(i2), imageDrawable, bitmapShader});
            return;
        }
        Matrix a2 = a(scaleType, i, i2, imageDrawable.c, imageDrawable.b);
        if (scaleType == ImageView.ScaleType.FIT_CENTER) {
            RectF rectF = new RectF(0.0f, 0.0f, imageDrawable.c, imageDrawable.b);
            RectF rectF2 = new RectF();
            a2.mapRect(rectF2, rectF);
            i = (int) rectF2.width();
            i2 = (int) rectF2.height();
            a2 = a(scaleType, i, i2, imageDrawable.c, imageDrawable.b);
        }
        imageDrawable.setIntrinsicWidth(i);
        imageDrawable.setIntrinsicHeight(i2);
        bitmapShader.setLocalMatrix(a2);
    }

    private static Matrix a(ImageView.ScaleType scaleType, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("77d8fe0e", new Object[]{scaleType, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        if (i3 * i2 > i4 * i) {
            f = i2 / i4;
            f3 = (i - (i3 * f)) * 0.5f;
            f2 = 0.0f;
        } else {
            f = i / i3;
            f2 = (i2 - (i4 * f)) * 0.5f;
            f3 = 0.0f;
        }
        Matrix matrix = new Matrix();
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            matrix.setScale(i / i3, i2 / i4);
        } else if (scaleType == ImageView.ScaleType.FIT_CENTER) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i3, i4), new RectF(0.0f, 0.0f, i, i2), Matrix.ScaleToFit.CENTER);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            matrix.setScale(f, f);
            matrix.postTranslate(f3 + 0.5f, f2 + 0.5f);
        }
        return matrix;
    }

    private ImageDrawable() {
    }

    @Override // android.graphics.drawable.PaintDrawable
    public void setCornerRadii(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9100fcf0", new Object[]{this, fArr});
            return;
        }
        this.f23531a = fArr;
        super.setCornerRadii(fArr);
    }

    @Override // android.graphics.drawable.ShapeDrawable
    public void onDraw(Shape shape, Canvas canvas, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcfecdb2", new Object[]{this, shape, canvas, paint});
            return;
        }
        if (Build.VERSION.SDK_INT == 21) {
            paint.setAntiAlias(false);
        }
        super.onDraw(shape, canvas, paint);
    }

    public float[] getCornerRadii() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("ab02ba10", new Object[]{this}) : this.f23531a;
    }

    public int getBitmapHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a0e9f026", new Object[]{this})).intValue() : this.b;
    }

    public int getBitmapWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("771449b", new Object[]{this})).intValue() : this.c;
    }
}
