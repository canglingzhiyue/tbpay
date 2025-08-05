package com.taobao.uikit.feature.features;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.callback.CanvasCallback;
import com.taobao.uikit.feature.callback.LayoutCallback;
import tb.kge;

/* loaded from: classes9.dex */
public class RotateFeature extends AbsFeature<View> implements CanvasCallback, LayoutCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RotateFeature";
    private static final int sDefaultFrameColor = -16777216;
    private static final int sDefaultFrameWidth = 6;
    private static final float sDefaultRoundX = 20.0f;
    private static final float sDefaultRoundY = 20.0f;
    private static final float sRotateDegree = 45.0f;
    private Region dirtyRegion;
    private Paint mPaint;
    private Path mPath;
    private float mRoundX = 20.0f;
    private float mRoundY = 20.0f;
    private boolean mFrameEnable = false;

    static {
        kge.a(943836802);
        kge.a(-396248018);
        kge.a(-980398080);
    }

    public static /* synthetic */ Object ipc$super(RotateFeature rotateFeature, String str, Object... objArr) {
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
        float f = 6.0f;
        int i2 = -16777216;
        if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RotateFeature)) != null) {
            this.mRoundX = obtainStyledAttributes.getDimension(R.styleable.RotateFeature_uik_roundX, 20.0f);
            this.mRoundY = obtainStyledAttributes.getDimension(R.styleable.RotateFeature_uik_roundY, 20.0f);
            this.mFrameEnable = obtainStyledAttributes.getBoolean(R.styleable.RotateFeature_uik_frameEnable, false);
            i2 = obtainStyledAttributes.getColor(R.styleable.RotateFeature_uik_frameColor, -16777216);
            f = obtainStyledAttributes.getDimension(R.styleable.RotateFeature_uik_frameWidth, 6.0f);
            obtainStyledAttributes.recycle();
        }
        this.mPaint = new Paint();
        this.mPaint.setColor(i2);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeWidth(f);
        this.mPaint.setAntiAlias(true);
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void setHost(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa76c81", new Object[]{this, view});
            return;
        }
        super.setHost(view);
        if (Build.VERSION.SDK_INT < 11) {
            return;
        }
        getHost().setLayerType(1, null);
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void afterOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4dfb28", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.mPath = new Path();
        float measuredWidth = (this.mHost.getMeasuredWidth() < this.mHost.getMeasuredHeight() ? this.mHost.getMeasuredWidth() : this.mHost.getMeasuredHeight()) / 2.0f;
        float f = measuredWidth * measuredWidth;
        RectF rectF = new RectF();
        float sqrt = ((float) Math.sqrt(f + f)) / 2.0f;
        float f2 = measuredWidth - sqrt;
        float f3 = sqrt + measuredWidth;
        rectF.set(f2, f2, f3, f3);
        this.mPath.addRoundRect(rectF, this.mRoundX, this.mRoundY, Path.Direction.CCW);
        this.mPath.setFillType(Path.FillType.INVERSE_WINDING);
        Matrix matrix = new Matrix();
        matrix.postRotate(45.0f, measuredWidth, measuredWidth);
        this.mPath.transform(matrix);
        this.dirtyRegion = new Region();
        this.dirtyRegion.setPath(this.mPath, new Region(0, 0, this.mHost.getMeasuredWidth(), this.mHost.getMeasuredHeight()));
    }

    public boolean contain(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("134a14ff", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : this.dirtyRegion.contains(i, i2);
    }

    public void setRoundX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a8740d", new Object[]{this, new Float(f)});
        } else {
            this.mRoundX = f;
        }
    }

    public void setRoundY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545d4cac", new Object[]{this, new Float(f)});
        } else {
            this.mRoundY = f;
        }
    }

    public void setFrameEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66fc585f", new Object[]{this, new Boolean(z)});
        } else {
            this.mFrameEnable = z;
        }
    }

    public void setFrameWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f74ebe9e", new Object[]{this, new Float(f)});
        } else {
            this.mPaint.setStrokeWidth(f);
        }
    }

    public void setFrameColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c74264", new Object[]{this, new Integer(i)});
        } else {
            this.mPaint.setColor(i);
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6014803b", new Object[]{this, canvas});
            return;
        }
        try {
            canvas.clipPath(this.mPath, Region.Op.DIFFERENCE);
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f42b97e", new Object[]{this, canvas});
        } else if (!this.mFrameEnable) {
        } else {
            Path path = new Path(this.mPath);
            path.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path, this.mPaint);
        }
    }
}
