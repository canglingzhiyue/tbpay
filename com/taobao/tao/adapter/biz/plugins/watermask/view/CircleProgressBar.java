package com.taobao.tao.adapter.biz.plugins.watermask.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.riy;

/* loaded from: classes8.dex */
public class CircleProgressBar extends AppCompatTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int currentProgress;
    private RectF mRectF;
    private Paint mRingPaintBg;
    private int progressStrokeWidth;
    private Paint ringPaintProgress;

    static {
        kge.a(996453379);
    }

    public static /* synthetic */ Object ipc$super(CircleProgressBar circleProgressBar, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.currentProgress = 0;
        this.progressStrokeWidth = 6;
        setLayerType(1, null);
        initVariable();
    }

    private void initVariable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf25a33", new Object[]{this});
            return;
        }
        this.ringPaintProgress = new Paint();
        this.ringPaintProgress.setAntiAlias(true);
        this.ringPaintProgress.setDither(true);
        this.ringPaintProgress.setColor(-1);
        this.ringPaintProgress.setStyle(Paint.Style.STROKE);
        this.ringPaintProgress.setStrokeCap(Paint.Cap.ROUND);
        this.ringPaintProgress.setStrokeWidth(this.progressStrokeWidth);
        this.mRingPaintBg = new Paint();
        this.mRingPaintBg.setAntiAlias(true);
        this.mRingPaintBg.setColor(-16777216);
        if (Build.VERSION.SDK_INT >= 26) {
            this.mRingPaintBg.setColor(Color.argb(0.07f, 0.0f, 0.0f, 0.0f));
        }
        this.mRingPaintBg.setStyle(Paint.Style.STROKE);
        this.mRingPaintBg.setStrokeWidth(this.progressStrokeWidth);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        if (this.mRectF == null) {
            int i = this.progressStrokeWidth;
            this.mRectF = new RectF(i, i, getWidth() - 6, getHeight() - 6);
        }
        if (this.currentProgress >= 0) {
            canvas.drawArc(this.mRectF, -90.0f, 360.0f, false, this.mRingPaintBg);
            canvas.drawArc(this.mRectF, -90.0f, (this.currentProgress / 100.0f) * 360.0f, false, this.ringPaintProgress);
        }
        super.onDraw(canvas);
    }

    public void setProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf0340d", new Object[]{this, new Integer(i)});
            return;
        }
        this.currentProgress = i;
        setText(i + riy.MOD);
    }
}
