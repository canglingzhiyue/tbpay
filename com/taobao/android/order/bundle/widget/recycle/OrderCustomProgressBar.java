package com.taobao.android.order.bundle.widget.recycle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class OrderCustomProgressBar extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final float DEFAULT_START_ANGLE;
    private final float MAX_SWEEP_ANGLE;
    private Paint paint;
    private RectF rectF;
    private float startAngle;
    private float sweepAngle;

    static {
        kge.a(-1868940683);
    }

    public OrderCustomProgressBar(Context context) {
        this(context, null);
        init();
    }

    public OrderCustomProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        init();
    }

    public OrderCustomProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MAX_SWEEP_ANGLE = 345.0f;
        this.DEFAULT_START_ANGLE = -90.0f;
        this.startAngle = -90.0f;
        this.sweepAngle = 0.0f;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.paint = new Paint();
        this.paint.setColor(-6710887);
        this.paint.setAntiAlias(true);
        this.paint.setFlags(1);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(3.0f);
        this.rectF = new RectF();
    }

    public void setProgressColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5260e3e8", new Object[]{this, new Integer(i)});
        } else {
            this.paint.setColor(i);
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.startAngle = -90.0f;
        this.sweepAngle = 0.0f;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        this.rectF.set(2.0f, 2.0f, getWidth() - 2.0f, getHeight() - 2.0f);
        canvas.drawArc(this.rectF, this.startAngle, this.sweepAngle, false, this.paint);
    }

    public void onPullDownDistance(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902c735e", new Object[]{this, new Float(f)});
        } else if (f < 0.0f) {
            this.sweepAngle = 0.0f;
            invalidate();
        } else {
            this.sweepAngle = f * 345.0f;
            this.sweepAngle = -Math.min(this.sweepAngle, 345.0f);
            invalidate();
        }
    }
}
