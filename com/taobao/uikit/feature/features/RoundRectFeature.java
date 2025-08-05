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
public class RoundRectFeature extends AbsFeature<View> implements CanvasCallback, LayoutCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static float sDefaultRadius;
    private boolean mFastEnable;
    private Paint mPaint;
    private Path mPath;
    private float mRadiusX;
    private float mRadiusY;
    private RectF mRectF;
    private boolean mStrokeEnable;
    private Paint mStrokePaint;
    private Path mStrokePath;

    public static /* synthetic */ Object ipc$super(RoundRectFeature roundRectFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((View) objArr[0]);
            return null;
        }
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

    public RoundRectFeature() {
        float f = sDefaultRadius;
        this.mRadiusX = f;
        this.mRadiusY = f;
        this.mFastEnable = false;
        this.mStrokeEnable = false;
    }

    static {
        kge.a(-1393619139);
        kge.a(-396248018);
        kge.a(-980398080);
        sDefaultRadius = 6.0f;
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        int i2 = -1;
        int i3 = -7829368;
        float f = 1.0f;
        if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RoundRectFeature)) != null) {
            this.mRadiusX = obtainStyledAttributes.getDimension(R.styleable.RoundRectFeature_uik_radiusX, sDefaultRadius);
            this.mRadiusY = obtainStyledAttributes.getDimension(R.styleable.RoundRectFeature_uik_radiusY, sDefaultRadius);
            this.mFastEnable = obtainStyledAttributes.getBoolean(R.styleable.RoundRectFeature_uik_fastEnable, false);
            this.mStrokeEnable = obtainStyledAttributes.getBoolean(R.styleable.RoundRectFeature_uik_strokeEnable, false);
            i2 = obtainStyledAttributes.getColor(R.styleable.RoundFeature_uik_fastColor, -1);
            i3 = obtainStyledAttributes.getColor(R.styleable.RoundRectFeature_uik_strokeColor, -7829368);
            f = obtainStyledAttributes.getDimension(R.styleable.RoundRectFeature_uik_strokeWidth, 1.0f);
            obtainStyledAttributes.recycle();
        }
        this.mPaint = new Paint();
        this.mPaint.setAntiAlias(true);
        this.mPaint.setColor(i2);
        if (!this.mFastEnable) {
            this.mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        this.mStrokePaint = new Paint();
        this.mStrokePaint.setAntiAlias(true);
        this.mStrokePaint.setColor(i3);
        this.mStrokePaint.setStyle(Paint.Style.STROKE);
        this.mStrokePaint.setStrokeWidth(f);
        this.mPath = new Path();
        this.mStrokePath = new Path();
        this.mRectF = new RectF();
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6014803b", new Object[]{this, canvas});
        } else if (this.mFastEnable) {
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
        if (this.mStrokeEnable) {
            canvas.drawPath(this.mStrokePath, this.mStrokePaint);
        }
        if (this.mFastEnable) {
            return;
        }
        canvas.restore();
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void beforeOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed76dbe5", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.mPath.reset();
        this.mStrokePath.reset();
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void afterOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4dfb28", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.mRectF.set(0.0f, 0.0f, this.mHost.getMeasuredWidth(), this.mHost.getMeasuredHeight());
        this.mPath.addRoundRect(this.mRectF, this.mRadiusX, this.mRadiusY, Path.Direction.CCW);
        this.mPath.setFillType(Path.FillType.INVERSE_WINDING);
        this.mStrokePath.addRoundRect(this.mRectF, this.mRadiusX, this.mRadiusY, Path.Direction.CCW);
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

    public void setRadiusY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("839187f4", new Object[]{this, new Float(f)});
            return;
        }
        this.mRadiusY = f;
        invalidateHost();
    }

    public void setFastEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a733ccc", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mFastEnable = z;
        if (!this.mFastEnable) {
            this.mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        } else {
            this.mPaint.setXfermode(null);
        }
        invalidateHost();
    }

    public void setFastColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1db9c57", new Object[]{this, new Integer(i)});
            return;
        }
        this.mPaint.setColor(i);
        invalidateHost();
    }

    public void setStrokeEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5955c5f0", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mStrokeEnable = z;
        invalidateHost();
    }

    public void setStrokeColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db15eb3", new Object[]{this, new Integer(i)});
            return;
        }
        this.mStrokePaint.setColor(i);
        invalidateHost();
    }

    public void setStrokeWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6238daed", new Object[]{this, new Float(f)});
            return;
        }
        this.mStrokePaint.setStrokeWidth(f);
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

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void setHost(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa76c81", new Object[]{this, view});
            return;
        }
        super.setHost(view);
        view.requestLayout();
    }
}
