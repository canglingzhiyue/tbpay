package com.taobao.android.fluid.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.container.IContainerService;
import tb.kge;
import tb.spz;

/* loaded from: classes5.dex */
public class BaseRoundCornerLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float[] mCornerRadii;
    private float mCornerRadius;
    private final Path mPath;

    static {
        kge.a(1924720926);
    }

    public static /* synthetic */ Object ipc$super(BaseRoundCornerLayout baseRoundCornerLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public BaseRoundCornerLayout(Context context) {
        super(context);
        this.mPath = new Path();
    }

    public BaseRoundCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPath = new Path();
    }

    public void setCornerRadii(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9100fcf0", new Object[]{this, fArr});
            return;
        }
        this.mCornerRadii = fArr;
        invalidate();
    }

    public void setCornerRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c784f0", new Object[]{this, new Float(f)});
            return;
        }
        this.mCornerRadius = f;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        float[] fArr = this.mCornerRadii;
        if (fArr != null && fArr.length > 0) {
            try {
                this.mPath.reset();
                this.mPath.addRoundRect(new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight()), this.mCornerRadii, Path.Direction.CW);
                canvas.clipPath(this.mPath);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else if (this.mCornerRadius > 0.0f) {
            try {
                this.mPath.reset();
                this.mPath.addRoundRect(new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight()), this.mCornerRadius, this.mCornerRadius, Path.Direction.CW);
                canvas.clipPath(this.mPath);
            } catch (Throwable unused) {
            }
        }
        try {
            super.dispatchDraw(canvas);
        } catch (Throwable th2) {
            spz.c("BaseRoundCornerLayout", "BaseRoundCornerLayout.dispatchDraw -- " + th2.getMessage());
            FluidException.throwException(null, IContainerService.ERROR_CARD_LARGE_BITMAP);
        }
    }
}
