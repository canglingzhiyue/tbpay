package com.taobao.weex.ui.view.border;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.base.a;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class BorderCorner {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float SWEEP_ANGLE = 45.0f;
    public float mAngleBisector;
    private RectF mBorderBox;
    private float mOvalBottom;
    private float mOvalLeft;
    private float mOvalRight;
    private float mOvalTop;
    private float mRoundCornerEndX;
    private float mRoundCornerEndY;
    private float mRoundCornerStartX;
    private float mRoundCornerStartY;
    private float mCornerRadius = 0.0f;
    private float mPreBorderWidth = 0.0f;
    private float mPostBorderWidth = 0.0f;
    private boolean hasInnerCorner = false;
    private boolean hasOuterCorner = false;

    static {
        kge.a(132650138);
    }

    public abstract void prepareOval();

    public abstract void prepareRoundCorner();

    public final void set(float f, float f2, float f3, RectF rectF, float f4) {
        RectF rectF2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f20f6b78", new Object[]{this, new Float(f), new Float(f2), new Float(f3), rectF, new Float(f4)});
            return;
        }
        if (!(!a.a(this.mCornerRadius, f) || !a.a(this.mPreBorderWidth, f2) || !a.a(this.mPostBorderWidth, f3) || !a.a(this.mAngleBisector, f4) || ((rectF2 = this.mBorderBox) != null && rectF2.equals(rectF)))) {
            return;
        }
        this.mCornerRadius = f;
        this.mPreBorderWidth = f2;
        this.mPostBorderWidth = f3;
        this.mBorderBox = rectF;
        this.mAngleBisector = f4;
        float f5 = this.mCornerRadius;
        this.hasOuterCorner = f5 > 0.0f && !a.a(0.0f, f5);
        if (!this.hasOuterCorner || getPreBorderWidth() < 0.0f || getPostBorderWidth() < 0.0f || getOuterCornerRadius() <= getPreBorderWidth() || getOuterCornerRadius() <= getPostBorderWidth()) {
            z = false;
        }
        this.hasInnerCorner = z;
        if (this.hasOuterCorner) {
            prepareOval();
        }
        prepareRoundCorner();
    }

    public final void drawRoundedCorner(Canvas canvas, Paint paint, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f8e6b4b", new Object[]{this, canvas, paint, new Float(f)});
        } else if (hasOuterCorner()) {
            if (Build.VERSION.SDK_INT >= 21) {
                canvas.drawArc(this.mOvalLeft, this.mOvalTop, this.mOvalRight, this.mOvalBottom, f, 45.0f, false, paint);
            } else {
                canvas.drawArc(new RectF(this.mOvalLeft, this.mOvalTop, this.mOvalRight, this.mOvalBottom), f, 45.0f, false, paint);
            }
        } else {
            canvas.drawLine(getRoundCornerStartX(), getRoundCornerStartY(), getRoundCornerEndX(), getRoundCornerEndY(), paint);
        }
    }

    public final float getRoundCornerStartX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8eb655da", new Object[]{this})).floatValue() : this.mRoundCornerStartX;
    }

    public final void setRoundCornerStartX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a586b22", new Object[]{this, new Float(f)});
        } else {
            this.mRoundCornerStartX = f;
        }
    }

    public final float getRoundCornerStartY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ec46d5b", new Object[]{this})).floatValue() : this.mRoundCornerStartY;
    }

    public final void setRoundCornerStartY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c0d43c1", new Object[]{this, new Float(f)});
        } else {
            this.mRoundCornerStartY = f;
        }
    }

    public final float getRoundCornerEndX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce359c41", new Object[]{this})).floatValue() : this.mRoundCornerEndX;
    }

    public final void setRoundCornerEndX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d1849b", new Object[]{this, new Float(f)});
        } else {
            this.mRoundCornerEndX = f;
        }
    }

    public final float getRoundCornerEndY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce43b3c2", new Object[]{this})).floatValue() : this.mRoundCornerEndY;
    }

    public final void setRoundCornerEndY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74865d3a", new Object[]{this, new Float(f)});
        } else {
            this.mRoundCornerEndY = f;
        }
    }

    public final void setOvalLeft(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cfc82fe", new Object[]{this, new Float(f)});
        } else {
            this.mOvalLeft = f;
        }
    }

    public final void setOvalTop(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72cffbd8", new Object[]{this, new Float(f)});
        } else {
            this.mOvalTop = f;
        }
    }

    public final void setOvalRight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722f3271", new Object[]{this, new Float(f)});
        } else {
            this.mOvalRight = f;
        }
    }

    public final void setOvalBottom(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("875cc5a", new Object[]{this, new Float(f)});
        } else {
            this.mOvalBottom = f;
        }
    }

    public boolean hasInnerCorner() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("290dd95c", new Object[]{this})).booleanValue() : this.hasInnerCorner;
    }

    public boolean hasOuterCorner() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8550141", new Object[]{this})).booleanValue() : this.hasOuterCorner;
    }

    public final float getPreBorderWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4a166944", new Object[]{this})).floatValue() : this.mPreBorderWidth;
    }

    public final float getPostBorderWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4d18a47b", new Object[]{this})).floatValue() : this.mPostBorderWidth;
    }

    public final float getOuterCornerRadius() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f2946123", new Object[]{this})).floatValue() : this.mCornerRadius;
    }

    public final float getAngleBisectorDegree() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b24d258d", new Object[]{this})).floatValue() : this.mAngleBisector;
    }

    public final RectF getBorderBox() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("d9336417", new Object[]{this}) : this.mBorderBox;
    }
}
