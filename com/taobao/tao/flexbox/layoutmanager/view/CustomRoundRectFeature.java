package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
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
import com.taobao.uikit.feature.callback.CanvasCallback;
import com.taobao.uikit.feature.callback.LayoutCallback;
import com.taobao.uikit.feature.features.AbsFeature;
import tb.kge;

/* loaded from: classes8.dex */
public class CustomRoundRectFeature extends AbsFeature<View> implements CanvasCallback, LayoutCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static float sDefaultRadius;
    private float mAnimationRadiusX = -1.0f;
    private float mAnimationRadiusY = -1.0f;
    private Paint mPaint;
    private Path mPath;
    private float[] mRadii;
    private float mRadiusX;
    private float mRadiusY;
    private RectF mRectF;
    private Paint mStrokePaint;
    private Path mStrokePath;
    private float mStrokeWidth;

    public static /* synthetic */ Object ipc$super(CustomRoundRectFeature customRoundRectFeature, String str, Object... objArr) {
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
    public void afterDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f42b97e", new Object[]{this, canvas});
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
    public void beforeDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6014803b", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void beforeOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed76dbe5", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    static {
        kge.a(654933878);
        kge.a(-396248018);
        kge.a(-980398080);
        sDefaultRadius = 6.0f;
    }

    public CustomRoundRectFeature() {
        float f = sDefaultRadius;
        this.mRadiusX = f;
        this.mRadiusY = f;
        this.mStrokeWidth = 0.0f;
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        this.mPaint = new Paint();
        this.mPaint.setAntiAlias(true);
        this.mPaint.setColor(-1);
        this.mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.mStrokePaint = new Paint();
        this.mStrokePaint.setAntiAlias(true);
        this.mStrokePaint.setColor(0);
        this.mStrokePaint.setStyle(Paint.Style.STROKE);
        this.mStrokePaint.setStrokeWidth(0.0f);
        this.mPath = new Path();
        this.mStrokePath = new Path();
        this.mRectF = new RectF();
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void afterOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4dfb28", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            updatePath(i3 - i, i4 - i2);
        }
    }

    private void updatePath(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f14135", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        float f = this.mAnimationRadiusX;
        if (f == -1.0f) {
            f = this.mRadiusX;
        }
        float f2 = this.mAnimationRadiusY;
        if (f2 == -1.0f) {
            f2 = this.mRadiusY;
        }
        this.mRectF.set(0.0f, 0.0f, i, i2);
        this.mPath.reset();
        this.mStrokePath.reset();
        RectF rectF = new RectF(this.mRectF);
        float f3 = this.mStrokeWidth;
        rectF.inset(f3 / 2.0f, f3 / 2.0f);
        float[] fArr = this.mRadii;
        if (fArr != null) {
            this.mStrokePath.addRoundRect(rectF, fArr, Path.Direction.CW);
        } else {
            Path path = this.mStrokePath;
            float f4 = this.mStrokeWidth;
            path.addRoundRect(rectF, f - (f4 / 2.0f), f2 - (f4 / 2.0f), Path.Direction.CW);
        }
        float f5 = this.mStrokeWidth;
        rectF.inset(f5 / 2.0f, f5 / 2.0f);
        float[] fArr2 = this.mRadii;
        if (fArr2 != null) {
            this.mPath.addRoundRect(rectF, fArr2, Path.Direction.CW);
            return;
        }
        Path path2 = this.mPath;
        float f6 = this.mStrokeWidth;
        path2.addRoundRect(rectF, f - f6, f2 - f6, Path.Direction.CW);
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeOnDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd545ddc", new Object[]{this, canvas});
            return;
        }
        Path path = this.mPath;
        if (path == null || path.isEmpty()) {
            return;
        }
        canvas.clipPath(this.mPath);
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

    public void setAnimationRadiusX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3794f035", new Object[]{this, new Float(f)});
            return;
        }
        this.mAnimationRadiusX = f;
        invalidateHost();
    }

    public void setAnimationRadiusY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3949c8d4", new Object[]{this, new Float(f)});
            return;
        }
        this.mAnimationRadiusY = f;
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
        this.mStrokeWidth = f;
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

    public void setRadii(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7494505", new Object[]{this, fArr});
            return;
        }
        this.mRadii = fArr;
        if (this.mHost != 0) {
            this.mHost.requestLayout();
        }
        invalidateHost();
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            updatePath(i, i2);
        }
    }
}
