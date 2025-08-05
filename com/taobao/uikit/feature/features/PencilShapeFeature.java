package com.taobao.uikit.feature.features;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.callback.CanvasCallback;
import com.taobao.uikit.feature.callback.LayoutCallback;
import tb.kge;

/* loaded from: classes9.dex */
public class PencilShapeFeature extends AbsFeature<View> implements CanvasCallback, LayoutCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float sDefaultRadius = 6.0f;
    private static final float sTopRatio = 0.2f;
    public Paint mPaint;
    private Path mPath;
    private Path mPath1;
    private RectF mRectF;
    private float mTopRatio = 0.2f;
    private float mRadiusX = sDefaultRadius;
    private float mRadiusY = sDefaultRadius;

    static {
        kge.a(-106834757);
        kge.a(-396248018);
        kge.a(-980398080);
    }

    public static /* synthetic */ Object ipc$super(PencilShapeFeature pencilShapeFeature, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterDispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84822824", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterOnDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d9525f", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeDispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b3e1e1", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeOnDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd545ddc", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void beforeOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed76dbe5", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PencilShapeFeature)) != null) {
            this.mRadiusX = obtainStyledAttributes.getDimension(R.styleable.PencilShapeFeature_uik_radiusX, sDefaultRadius);
            this.mRadiusY = obtainStyledAttributes.getDimension(R.styleable.PencilShapeFeature_uik_radiusY, sDefaultRadius);
            this.mTopRatio = obtainStyledAttributes.getFloat(R.styleable.PencilShapeFeature_uik_topRatio, 0.2f);
            obtainStyledAttributes.recycle();
        }
        this.mPaint = new Paint();
        this.mPaint.setAntiAlias(true);
        this.mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.mPath = new Path();
        this.mPath1 = new Path();
        this.mRectF = new RectF();
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6014803b", new Object[]{this, canvas});
        } else {
            canvas.saveLayerAlpha(this.mRectF, 255, 31);
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f42b97e", new Object[]{this, canvas});
            return;
        }
        canvas.drawPath(this.mPath, this.mPaint);
        canvas.drawPath(this.mPath1, this.mPaint);
        canvas.restore();
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void afterOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4dfb28", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.mRectF.set(0.0f, 0.0f, this.mHost.getWidth(), this.mHost.getHeight());
        int width = this.mHost.getWidth();
        int height = this.mHost.getHeight();
        float f = width;
        this.mPath.moveTo(this.mTopRatio * f, 0.0f);
        this.mPath.lineTo(0.0f, height / 2);
        float f2 = height;
        this.mPath.lineTo(this.mTopRatio * f, f2);
        this.mPath.lineTo(f, f2);
        this.mPath.lineTo(f, 0.0f);
        this.mPath.lineTo(f * this.mTopRatio, 0.0f);
        this.mPath.setFillType(Path.FillType.INVERSE_WINDING);
        this.mPath1.addRoundRect(this.mRectF, this.mRadiusX, this.mRadiusY, Path.Direction.CCW);
        this.mPath1.setFillType(Path.FillType.INVERSE_WINDING);
    }

    public void setRadiusX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81dcaf55", new Object[]{this, new Float(f)});
            return;
        }
        this.mRadiusX = f;
        invalidateHost();
    }

    public void setTopRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9a4ce1", new Object[]{this, new Float(f)});
            return;
        }
        this.mTopRatio = f;
        invalidateHost();
    }

    public void setRadiusY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("839187f4", new Object[]{this, new Float(f)});
            return;
        }
        this.mRadiusY = f;
        invalidateHost();
    }

    private void invalidateHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2908a", new Object[]{this});
        } else if (this.mHost == 0) {
        } else {
            this.mHost.invalidate();
        }
    }
}
