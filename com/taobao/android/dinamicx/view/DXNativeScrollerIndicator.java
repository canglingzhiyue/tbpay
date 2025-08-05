package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class DXNativeScrollerIndicator extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isHorizontal;
    private float radii;
    private Paint rectPaint;
    private RectF scrollBarRectF;
    private int scrollBarThumbColor;
    private int scrollBarTrackColor;
    private RectF thumbRectF;

    static {
        kge.a(-2089431533);
    }

    public static /* synthetic */ Object ipc$super(DXNativeScrollerIndicator dXNativeScrollerIndicator, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public boolean isHorizontal() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4dcbe679", new Object[]{this})).booleanValue() : this.isHorizontal;
    }

    public void setHorizontal(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("582494c7", new Object[]{this, new Boolean(z)});
        } else {
            this.isHorizontal = z;
        }
    }

    public DXNativeScrollerIndicator(Context context) {
        super(context);
        this.scrollBarTrackColor = -2828066;
        this.scrollBarThumbColor = -37590;
        this.scrollBarRectF = new RectF();
        this.thumbRectF = new RectF();
        this.isHorizontal = true;
        this.rectPaint = new Paint();
        this.rectPaint.setAntiAlias(true);
        this.rectPaint.setStyle(Paint.Style.FILL);
    }

    public void setScrollBarTrackColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73d5920", new Object[]{this, new Integer(i)});
        } else {
            this.scrollBarTrackColor = i;
        }
    }

    public void setScrollBarThumbColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b627eb", new Object[]{this, new Integer(i)});
        } else {
            this.scrollBarThumbColor = i;
        }
    }

    public void refreshScrollIndicator(double d, double d2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2720b8e", new Object[]{this, new Double(d), new Double(d2), new Integer(i), new Integer(i2)});
            return;
        }
        double max = Math.max(Math.min(d, 1.0d), (double) mto.a.GEO_NOT_SUPPORT);
        int max2 = (int) (i * Math.max(Math.min(d2, 1.0d), (double) mto.a.GEO_NOT_SUPPORT));
        int i3 = (int) ((i - max2) * max);
        float f = i2;
        this.thumbRectF.set(i3, 0.0f, i3 + max2, f);
        this.scrollBarRectF.set(0.0f, 0.0f, i, f);
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
        this.rectPaint.setColor(this.scrollBarTrackColor);
        RectF rectF = this.scrollBarRectF;
        float f = this.radii;
        canvas.drawRoundRect(rectF, f, f, this.rectPaint);
        this.rectPaint.setColor(this.scrollBarThumbColor);
        RectF rectF2 = this.thumbRectF;
        float f2 = this.radii;
        canvas.drawRoundRect(rectF2, f2, f2, this.rectPaint);
    }

    public float getRadii() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c5320736", new Object[]{this})).floatValue() : this.radii;
    }

    public void setRadii(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f339746", new Object[]{this, new Float(f)});
        } else {
            this.radii = f;
        }
    }
}
