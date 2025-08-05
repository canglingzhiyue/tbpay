package com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.xwraptagview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class ModifiableRoundRadiusImageView extends DetailImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BitmapShader mBitmapShader;
    private int mBorderRadius;
    private Drawable mDrawable;
    private Matrix mMatrix;
    private Paint mPaint;

    static {
        kge.a(-1558786878);
    }

    public static /* synthetic */ Object ipc$super(ModifiableRoundRadiusImageView modifiableRoundRadiusImageView, String str, Object... objArr) {
        if (str.hashCode() == -1150258430) {
            super.setImageDrawable((Drawable) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ModifiableRoundRadiusImageView(Context context) {
        this(context, null);
    }

    public ModifiableRoundRadiusImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ModifiableRoundRadiusImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBorderRadius = 10;
        this.mMatrix = new Matrix();
        this.mPaint = new Paint();
        this.mPaint.setAntiAlias(true);
        emu.a("com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.xwraptagview.ModifiableRoundRadiusImageView");
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
            return;
        }
        super.setImageDrawable(drawable);
        this.mDrawable = drawable;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap drawableToBitamp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        Drawable drawable = this.mDrawable;
        if (drawable == null || (drawableToBitamp = drawableToBitamp(drawable)) == null) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.mBitmapShader = new BitmapShader(drawableToBitamp, tileMode, tileMode);
        float f = 1.0f;
        if (drawableToBitamp.getWidth() != getWidth() || drawableToBitamp.getHeight() != getHeight()) {
            f = Math.max(getWidth() / drawableToBitamp.getWidth(), getHeight() / drawableToBitamp.getHeight());
        }
        this.mMatrix.setScale(f, f);
        this.mBitmapShader.setLocalMatrix(this.mMatrix);
        this.mPaint.setShader(this.mBitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        int i = this.mBorderRadius;
        canvas.drawRoundRect(rectF, i, i, this.mPaint);
    }

    private Bitmap drawableToBitamp(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("794c0cb9", new Object[]{this, drawable});
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        if (width == 0) {
            width = 1;
        }
        if (height == 0) {
            height = 1;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return createBitmap;
    }

    public int getBorderRadius() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("909bc8ce", new Object[]{this})).intValue() : this.mBorderRadius;
    }

    public void setBorderRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e73d1fc", new Object[]{this, new Integer(i)});
        } else {
            this.mBorderRadius = i;
        }
    }
}
