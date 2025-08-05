package com.taobao.android.dinamicx.view;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import tb.gbg;
import tb.kge;

/* loaded from: classes5.dex */
public class DXNativeProgressView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Paint backgroundPaint;
    private RectF backgroundRect;
    private int cornerRadius;
    private DinamicXEngine engine;
    private a listener;
    private float maxProgress;
    private float progress;
    private Paint progressPaint;
    private final RectF progressRect;
    private int sectionDuration;
    public ValueAnimator valueAnimator;

    /* loaded from: classes5.dex */
    public interface a {
    }

    static {
        kge.a(-717269868);
    }

    public static /* synthetic */ Object ipc$super(DXNativeProgressView dXNativeProgressView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 949399698) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDetachedFromWindow();
            return null;
        }
    }

    public DXNativeProgressView(DinamicXEngine dinamicXEngine, Context context) {
        super(context);
        this.progressRect = new RectF();
        this.progress = 0.0f;
        this.maxProgress = 100.0f;
        this.sectionDuration = 0;
        this.cornerRadius = 0;
        init();
        this.engine = dinamicXEngine;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.backgroundPaint = new Paint();
        this.backgroundPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.backgroundPaint.setColor(-16777216);
        this.backgroundRect = new RectF();
        this.progressPaint = new Paint();
        this.progressPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.progressPaint.setColor(-1);
    }

    public void setSectionDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8dd46e5", new Object[]{this, new Integer(i)});
        } else {
            this.sectionDuration = i;
        }
    }

    public float getProgress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ba5fa9a", new Object[]{this})).floatValue() : this.progress;
    }

    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
            return;
        }
        invalidate();
        this.progress = f;
        onProgressChange();
    }

    public void setProgressWithoutAnim(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0903b8f", new Object[]{this, new Float(f)});
            return;
        }
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.valueAnimator.cancel();
        }
        if (this.progress == f) {
            return;
        }
        invalidate();
        this.progress = f;
        onProgressChange();
    }

    private void onProgressChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ad07a83", new Object[]{this});
        } else if (this.listener == null) {
        } else {
            getProgress();
        }
    }

    public a getProgressChangeListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f804920e", new Object[]{this}) : this.listener;
    }

    public void setProgressChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d2e5f6", new Object[]{this, aVar});
        } else {
            this.listener = aVar;
        }
    }

    public void setProgressColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5260e3e8", new Object[]{this, new Integer(i)});
        } else {
            this.progressPaint.setColor(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
        } else {
            this.backgroundPaint.setColor(i);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.backgroundRect == null) {
            return;
        }
        this.maxProgress = Math.min(100.0f, this.maxProgress);
        int i = getLayoutParams().height;
        float f = getLayoutParams().width;
        int i2 = (int) ((this.progress / 100.0f) * f);
        RectF rectF = this.backgroundRect;
        float f2 = i;
        rectF.set(0.0f, 0.0f, f, f2);
        int i3 = this.cornerRadius;
        canvas.drawRoundRect(rectF, i3, i3, this.backgroundPaint);
        this.progressRect.set(0.0f, 0.0f, i2, f2);
        RectF rectF2 = this.progressRect;
        int i4 = this.cornerRadius;
        canvas.drawRoundRect(rectF2, i4, i4, this.progressPaint);
    }

    public void startProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a542c0d", new Object[]{this, new Integer(i)});
            return;
        }
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.valueAnimator.cancel();
        }
        this.valueAnimator = ObjectAnimator.ofFloat(this, "progress", i, 100.0f);
        this.valueAnimator.setDuration(this.sectionDuration);
        this.valueAnimator.setInterpolator(new LinearInterpolator());
        this.valueAnimator.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.valueAnimator.end();
        }
        super.onDetachedFromWindow();
    }

    public void setCornerRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c79033", new Object[]{this, new Integer(i)});
        } else {
            this.cornerRadius = gbg.a(this.engine, getContext(), i);
        }
    }
}
