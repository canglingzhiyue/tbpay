package com.taobao.android.live.plugin.atype.flexalocal.usertask;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class UserTaskProgress extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Paint mPaint;
    private RectF mRectF;
    private float progress;
    private int progressBgColor;
    private int progressColor;
    private int progressWidth;

    static {
        kge.a(982707088);
    }

    public static /* synthetic */ Object ipc$super(UserTaskProgress userTaskProgress, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public UserTaskProgress(Context context) {
        this(context, null);
    }

    public UserTaskProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UserTaskProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.progress = 0.0f;
        this.progressColor = -7791;
        this.progressBgColor = 0;
        this.progressWidth = 5;
        this.mPaint = new Paint();
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mRectF = new RectF();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        float f = this.progressWidth / 2;
        this.mRectF.set(f, f, getWidth() - i, getHeight() - i);
        this.mPaint.setStrokeWidth(this.progressWidth);
        this.mPaint.setColor(this.progressBgColor);
        canvas.drawArc(this.mRectF, 0.0f, 360.0f, false, this.mPaint);
        this.mPaint.setColor(this.progressColor);
        canvas.drawArc(this.mRectF, -90.0f, this.progress, false, this.mPaint);
    }

    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
        } else {
            this.progress = f;
        }
    }

    public void setProgressColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5260e3e8", new Object[]{this, new Integer(i)});
        } else {
            this.progressColor = i;
        }
    }

    public void setProgressWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e86b65", new Object[]{this, new Integer(i)});
        } else {
            this.progressWidth = i;
        }
    }
}
