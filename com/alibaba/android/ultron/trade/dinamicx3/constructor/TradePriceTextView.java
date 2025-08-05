package com.alibaba.android.ultron.trade.dinamicx3.constructor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeTextView;
import tb.gnv;
import tb.kge;

/* loaded from: classes2.dex */
public final class TradePriceTextView extends DXNativeTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Paint mDeleteLinePaint;
    private float mDeleteLineWidth;
    private float mHalfDeleteLineWidth;
    private boolean mHasDeleteLine;

    static {
        kge.a(-93079754);
    }

    public static /* synthetic */ Object ipc$super(TradePriceTextView tradePriceTextView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TradePriceTextView(Context context) {
        super(context);
        this.mHasDeleteLine = false;
    }

    public TradePriceTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHasDeleteLine = false;
    }

    public TradePriceTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHasDeleteLine = false;
    }

    public void setHasDeleteLine(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("effef456", new Object[]{this, new Boolean(z)});
        } else if (z == this.mHasDeleteLine) {
        } else {
            this.mHasDeleteLine = z;
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (!this.mHasDeleteLine) {
            return;
        }
        lazyInitDeleteLinePaint();
        float height = (getHeight() / 2.0f) - this.mHalfDeleteLineWidth;
        canvas.drawLine(0.0f, height, getWidth(), height, this.mDeleteLinePaint);
    }

    private void lazyInitDeleteLinePaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("943e0322", new Object[]{this});
        } else if (this.mDeleteLinePaint != null) {
        } else {
            this.mDeleteLinePaint = new Paint();
            this.mDeleteLinePaint.setAntiAlias(true);
            this.mDeleteLinePaint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.mDeleteLinePaint.setColor(getCurrentTextColor());
            this.mDeleteLineWidth = gnv.a(getContext(), 1.0f);
            float f = this.mDeleteLineWidth;
            this.mHalfDeleteLineWidth = f / 2.0f;
            this.mDeleteLinePaint.setStrokeWidth(f);
        }
    }
}
