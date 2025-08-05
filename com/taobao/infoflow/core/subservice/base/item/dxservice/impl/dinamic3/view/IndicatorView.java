package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class IndicatorView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final RectF mIndicatorRectF;
    private float mRadius;
    private final Paint mRectPaint;
    private final RectF mScrollBarRectF;
    private int mScrollBarThumbColor;

    static {
        kge.a(-1021546276);
    }

    public static /* synthetic */ Object ipc$super(IndicatorView indicatorView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public IndicatorView(Context context) {
        super(context);
        this.mScrollBarThumbColor = -37590;
        this.mScrollBarRectF = new RectF();
        this.mIndicatorRectF = new RectF();
        this.mRectPaint = new Paint();
        this.mRectPaint.setAntiAlias(true);
        this.mRectPaint.setStyle(Paint.Style.FILL);
    }

    public void setScrollBarThumbColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b627eb", new Object[]{this, new Integer(i)});
        } else {
            this.mScrollBarThumbColor = i;
        }
    }

    public void setRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fcd05", new Object[]{this, new Float(f)});
        } else {
            this.mRadius = f;
        }
    }

    public void refreshScrollIndicator(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40bc2e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        float f = i4;
        this.mScrollBarRectF.set(0.0f, 0.0f, i3, f);
        this.mIndicatorRectF.set(i, 0.0f, i2, f);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        float radius = getRadius();
        this.mRectPaint.setColor(Color.parseColor("#E6E6E6"));
        canvas.drawRoundRect(this.mScrollBarRectF, radius, radius, this.mRectPaint);
        this.mRectPaint.setColor(this.mScrollBarThumbColor);
        canvas.drawRoundRect(this.mIndicatorRectF, radius, radius, this.mRectPaint);
    }

    private float getRadius() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f9580fff", new Object[]{this})).floatValue() : this.mRadius;
    }
}
