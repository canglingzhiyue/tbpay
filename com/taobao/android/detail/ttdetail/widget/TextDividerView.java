package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.w;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes5.dex */
public class TextDividerView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Rect mLeftLineBound;
    private Paint mPaint;
    private Resources mResources;
    private Rect mRightLineBound;

    static {
        kge.a(-1937602599);
    }

    public static /* synthetic */ Object ipc$super(TextDividerView textDividerView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TextDividerView(Context context) {
        super(context);
        init(context);
    }

    public TextDividerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public TextDividerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mResources = context.getResources();
        this.mPaint = new Paint();
        this.mPaint.setColor(this.mResources.getColor(R.color.tt_detail_text_divider));
        this.mPaint.setStrokeWidth(1.0f);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.mLeftLineBound == null || this.mRightLineBound == null) {
            int dimensionPixelSize = this.mResources.getDimensionPixelSize(R.dimen.tt_detail_main_view_horizontal_margin);
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            this.mPaint.setTextSize(getTextSize());
            CharSequence text = getText();
            int measureText = ((int) this.mPaint.measureText(text, 0, text.length())) / 2;
            this.mLeftLineBound = new Rect();
            Rect rect = this.mLeftLineBound;
            rect.left = dimensionPixelSize;
            rect.right = (measuredWidth - measureText) - dimensionPixelSize;
            rect.bottom = measuredHeight;
            rect.top = measuredHeight;
            this.mRightLineBound = new Rect();
            Rect rect2 = this.mRightLineBound;
            rect2.left = measuredWidth + measureText + dimensionPixelSize;
            rect2.right = getMeasuredWidth() - dimensionPixelSize;
            Rect rect3 = this.mRightLineBound;
            rect3.bottom = measuredHeight;
            rect3.top = measuredHeight;
        }
        canvas.drawLine(this.mLeftLineBound.left, this.mLeftLineBound.top, this.mLeftLineBound.right, this.mLeftLineBound.bottom, this.mPaint);
        canvas.drawLine(this.mRightLineBound.left, this.mRightLineBound.top, this.mRightLineBound.right, this.mRightLineBound.bottom, this.mPaint);
    }

    public void setLineColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c76a7c5e", new Object[]{this, str});
            return;
        }
        Paint paint = this.mPaint;
        if (paint == null) {
            return;
        }
        paint.setColor(w.a(str));
    }
}
