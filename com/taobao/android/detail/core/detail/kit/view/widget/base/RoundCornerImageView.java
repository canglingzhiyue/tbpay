package com.taobao.android.detail.core.detail.kit.view.widget.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.artc.api.AConstants;
import com.taobao.taobao.R;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class RoundCornerImageView extends DetailImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final Bitmap.Config BITMAP_CONFIG;
    private static final int COLORDRAWABLE_DIMENSION = 2;
    private static final int DEFAULT_BORDER_COLOR;
    private static final int DEFAULT_BORDER_PADDING = 4;
    private static final int DEFAULT_BORDER_WIDTH = 0;
    private static final ImageView.ScaleType SCALE_TYPE;
    private Bitmap mBitmap;
    private int mBitmapHeight;
    private final Paint mBitmapPaint;
    private BitmapShader mBitmapShader;
    private int mBitmapWidth;
    private int mBorderColor;
    private int mBorderPadding;
    private final Paint mBorderPaint;
    private float mBorderRadius;
    private final RectF mBorderRect;
    private int mBorderWidth;
    private ColorFilter mColorFilter;
    private float mDrawableRadius;
    private final RectF mDrawableRect;
    private boolean mReady;
    private boolean mSetupPending;
    private final Matrix mShaderMatrix;

    public static /* synthetic */ Object ipc$super(RoundCornerImageView roundCornerImageView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1150258430:
                super.setImageDrawable((Drawable) objArr[0]);
                return null;
            case -974402955:
                super.setImageResource(((Number) objArr[0]).intValue());
                return null;
            case -303694881:
                super.setImageBitmap((Bitmap) objArr[0]);
                return null;
            case 120759747:
                super.setScaleType((ImageView.ScaleType) objArr[0]);
                return null;
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 792755437:
                super.setImageURI((Uri) objArr[0]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void setRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fcd05", new Object[]{this, new Float(f)});
        }
    }

    static {
        kge.a(2061549544);
        SCALE_TYPE = ImageView.ScaleType.CENTER_CROP;
        BITMAP_CONFIG = Bitmap.Config.ARGB_8888;
        DEFAULT_BORDER_COLOR = Color.rgb((int) AConstants.ArtcErrorServerErrorDropByMobility, (int) AConstants.ArtcErrorServerErrorDropByMobility, (int) AConstants.ArtcErrorServerErrorDropByMobility);
    }

    public RoundCornerImageView(Context context) {
        super(context);
        this.mDrawableRect = new RectF();
        this.mBorderRect = new RectF();
        this.mShaderMatrix = new Matrix();
        this.mBitmapPaint = new Paint();
        this.mBorderPaint = new Paint();
        this.mBorderColor = DEFAULT_BORDER_COLOR;
        this.mBorderWidth = 0;
        this.mBorderPadding = 4;
        init();
    }

    public RoundCornerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDrawableRect = new RectF();
        this.mBorderRect = new RectF();
        this.mShaderMatrix = new Matrix();
        this.mBitmapPaint = new Paint();
        this.mBorderPaint = new Paint();
        this.mBorderColor = DEFAULT_BORDER_COLOR;
        this.mBorderWidth = 0;
        this.mBorderPadding = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Detail_RoundCornerImageView, i, 0);
        this.mBorderWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Detail_RoundCornerImageView_border_width, 0);
        this.mBorderColor = obtainStyledAttributes.getColor(R.styleable.Detail_RoundCornerImageView_border_color, DEFAULT_BORDER_COLOR);
        this.mBorderPadding = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Detail_RoundCornerImageView_border_padding, 4);
        obtainStyledAttributes.recycle();
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.setScaleType(SCALE_TYPE);
        this.mReady = true;
        if (this.mSetupPending) {
            setup();
            this.mSetupPending = false;
        }
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.base.RoundCornerImageView");
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView.ScaleType) ipChange.ipc$dispatch("16d492db", new Object[]{this}) : SCALE_TYPE;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
        } else if (scaleType != SCALE_TYPE) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("351c8ae2", new Object[]{this, new Boolean(z)});
        } else if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
        } else if (this.mBitmapPaint == null || this.mBorderPaint == null) {
        } else {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.mDrawableRadius, this.mBitmapPaint);
            if (this.mBorderWidth == 0) {
                return;
            }
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.mBorderRadius, this.mBorderPaint);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        setup();
    }

    public int getBorderColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e5a9b95b", new Object[]{this})).intValue() : this.mBorderColor;
    }

    public void setBorderColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738a7ba7", new Object[]{this, new Integer(i)});
        } else if (i == this.mBorderColor) {
        } else {
            this.mBorderColor = i;
            this.mBorderPaint.setColor(this.mBorderColor);
            invalidate();
        }
    }

    public int getBorderWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6c84ce3e", new Object[]{this})).intValue() : this.mBorderWidth;
    }

    public void setBorderWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8120324", new Object[]{this, new Integer(i)});
        } else if (i == this.mBorderWidth) {
        } else {
            this.mBorderWidth = i;
            setup();
        }
    }

    public void setBorderPadding(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c9f039", new Object[]{this, new Integer(i)});
        } else if (i == this.mBorderPadding) {
        } else {
            this.mBorderPadding = i;
            setup();
        }
    }

    public int getBorderPadding() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d180f789", new Object[]{this})).intValue() : this.mBorderPadding;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede5fbdf", new Object[]{this, bitmap});
            return;
        }
        super.setImageBitmap(bitmap);
        this.mBitmap = bitmap;
        setup();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
            return;
        }
        super.setImageDrawable(drawable);
        this.mBitmap = getBitmapFromDrawable(drawable);
        setup();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ebca75", new Object[]{this, new Integer(i)});
            return;
        }
        super.setImageResource(i);
        this.mBitmap = getBitmapFromDrawable(getDrawable());
        setup();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f407ced", new Object[]{this, uri});
            return;
        }
        super.setImageURI(uri);
        this.mBitmap = getBitmapFromDrawable(getDrawable());
        setup();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        } else if (colorFilter == this.mColorFilter) {
        } else {
            this.mColorFilter = colorFilter;
            this.mBitmapPaint.setColorFilter(this.mColorFilter);
            invalidate();
        }
    }

    private Bitmap getBitmapFromDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("795b9136", new Object[]{this, drawable});
        }
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                return Bitmap.createBitmap(2, 2, BITMAP_CONFIG);
            }
            return Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), BITMAP_CONFIG);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    private void setup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[]{this});
        } else if (!this.mReady) {
            this.mSetupPending = true;
        } else {
            Bitmap bitmap = this.mBitmap;
            if (bitmap == null) {
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.mBitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.mBitmapPaint.setAntiAlias(true);
            this.mBitmapPaint.setShader(this.mBitmapShader);
            this.mBorderPaint.setStyle(Paint.Style.STROKE);
            this.mBorderPaint.setAntiAlias(true);
            this.mBorderPaint.setColor(this.mBorderColor);
            this.mBorderPaint.setStrokeWidth(this.mBorderWidth);
            this.mBitmapHeight = this.mBitmap.getHeight();
            this.mBitmapWidth = this.mBitmap.getWidth();
            this.mBorderRect.set(0.0f, 0.0f, getWidth(), getHeight());
            this.mBorderRadius = Math.min((this.mBorderRect.height() - this.mBorderWidth) / 2.0f, (this.mBorderRect.width() - this.mBorderWidth) / 2.0f);
            RectF rectF = this.mDrawableRect;
            int i = this.mBorderPadding;
            rectF.set(i, i, getWidth() - (this.mBorderPadding << 1), getHeight() - (this.mBorderPadding << 1));
            this.mDrawableRadius = Math.min(this.mDrawableRect.height() / 2.0f, this.mDrawableRect.width() / 2.0f);
            updateShaderMatrix();
            invalidate();
        }
    }

    private void updateShaderMatrix() {
        float width;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f49876", new Object[]{this});
            return;
        }
        this.mShaderMatrix.set(null);
        float f2 = 0.0f;
        if (this.mBitmapWidth * this.mDrawableRect.height() > this.mDrawableRect.width() * this.mBitmapHeight) {
            width = this.mDrawableRect.height() / this.mBitmapHeight;
            f = (this.mDrawableRect.width() - (this.mBitmapWidth * width)) * 0.5f;
        } else {
            width = this.mDrawableRect.width() / this.mBitmapWidth;
            f2 = (this.mDrawableRect.height() - (this.mBitmapHeight * width)) * 0.5f;
            f = 0.0f;
        }
        this.mShaderMatrix.setScale(width, width);
        Matrix matrix = this.mShaderMatrix;
        int i = this.mBorderWidth;
        int i2 = this.mBorderPadding;
        matrix.postTranslate(((int) (f + 0.5f)) + i + i2, ((int) (f2 + 0.5f)) + i + i2);
        this.mBitmapShader.setLocalMatrix(this.mShaderMatrix);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        if (i == 0 && this.mBitmapShader == null && (bitmap = this.mBitmap) != null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.mBitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.mBitmapShader = null;
    }

    @Override // com.taobao.android.detail.datasdk.protocol.image.DetailImageView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        if (this.mBitmap != null) {
            this.mBitmap = null;
        }
        this.mBitmapShader = null;
        super.onDetachedFromWindow();
    }
}
