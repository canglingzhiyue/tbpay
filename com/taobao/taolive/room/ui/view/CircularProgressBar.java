package com.taobao.taolive.room.ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes8.dex */
public class CircularProgressBar extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_ANIMATION_DURATION = 1500;
    private static final float DEFAULT_MAX_VALUE = 100.0f;
    private static final float DEFAULT_START_ANGLE = 270.0f;
    private int backgroundColor;
    private Paint backgroundPaint;
    private float backgroundStrokeWidth;
    private int color;
    private Paint foregroundPaint;
    private boolean indeterminateMode;
    private a indeterminateModeChangeListener;
    private Handler indeterminateModeHandler;
    private Runnable indeterminateModeRunnable;
    private float progress;
    private ValueAnimator progressAnimator;
    private b progressChangeListener;
    private float progressMax;
    private RectF rectF;
    private boolean rightToLeft;
    private float startAngle;
    private float strokeWidth;

    /* loaded from: classes8.dex */
    public interface a {
    }

    /* loaded from: classes8.dex */
    public interface b {
    }

    static {
        kge.a(1273799032);
    }

    public static /* synthetic */ Object ipc$super(CircularProgressBar circularProgressBar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == -436676516) {
            super.onFinishInflate();
            return null;
        } else if (hashCode != 949399698) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDetachedFromWindow();
            return null;
        }
    }

    public static /* synthetic */ void access$000(CircularProgressBar circularProgressBar, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5e22046", new Object[]{circularProgressBar, new Float(f), new Boolean(z)});
        } else {
            circularProgressBar.setProgress(f, z);
        }
    }

    public static /* synthetic */ boolean access$100(CircularProgressBar circularProgressBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cd724d15", new Object[]{circularProgressBar})).booleanValue() : circularProgressBar.indeterminateMode;
    }

    public static /* synthetic */ float access$202(CircularProgressBar circularProgressBar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcb8f6c2", new Object[]{circularProgressBar, new Float(f)})).floatValue();
        }
        circularProgressBar.startAngle = f;
        return f;
    }

    public static /* synthetic */ boolean access$300(CircularProgressBar circularProgressBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d979e3d3", new Object[]{circularProgressBar})).booleanValue() : circularProgressBar.rightToLeft;
    }

    public static /* synthetic */ boolean access$302(CircularProgressBar circularProgressBar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("772ee26b", new Object[]{circularProgressBar, new Boolean(z)})).booleanValue();
        }
        circularProgressBar.rightToLeft = z;
        return z;
    }

    public static /* synthetic */ Runnable access$400(CircularProgressBar circularProgressBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("98651ba6", new Object[]{circularProgressBar}) : circularProgressBar.indeterminateModeRunnable;
    }

    public static /* synthetic */ Handler access$500(CircularProgressBar circularProgressBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b9ff0719", new Object[]{circularProgressBar}) : circularProgressBar.indeterminateModeHandler;
    }

    public static /* synthetic */ float access$600(CircularProgressBar circularProgressBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eb8545dc", new Object[]{circularProgressBar})).floatValue() : circularProgressBar.progressMax;
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.progress = 0.0f;
        this.progressMax = DEFAULT_MAX_VALUE;
        this.strokeWidth = getResources().getDimension(R.dimen.default_stroke_width);
        this.backgroundStrokeWidth = getResources().getDimension(R.dimen.default_background_stroke_width);
        this.color = -16777216;
        this.backgroundColor = -7829368;
        this.rightToLeft = true;
        this.indeterminateMode = false;
        this.startAngle = DEFAULT_START_ANGLE;
        this.indeterminateModeRunnable = new Runnable() { // from class: com.taobao.taolive.room.ui.view.CircularProgressBar.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!CircularProgressBar.access$100(CircularProgressBar.this)) {
                } else {
                    CircularProgressBar.access$500(CircularProgressBar.this).postDelayed(CircularProgressBar.access$400(CircularProgressBar.this), 1500L);
                    CircularProgressBar circularProgressBar = CircularProgressBar.this;
                    CircularProgressBar.access$302(circularProgressBar, !CircularProgressBar.access$300(circularProgressBar));
                    if (CircularProgressBar.access$300(CircularProgressBar.this)) {
                        CircularProgressBar.this.setProgressWithAnimation(0.0f);
                        return;
                    }
                    CircularProgressBar circularProgressBar2 = CircularProgressBar.this;
                    circularProgressBar2.setProgressWithAnimation(CircularProgressBar.access$600(circularProgressBar2));
                }
            }
        };
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        this.rectF = new RectF();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.CircularProgressBar, 0, 0);
        try {
            this.progress = obtainStyledAttributes.getFloat(R.styleable.CircularProgressBar_cpb_progress, this.progress);
            this.progressMax = obtainStyledAttributes.getFloat(R.styleable.CircularProgressBar_cpb_progress_max, this.progressMax);
            this.indeterminateMode = obtainStyledAttributes.getBoolean(R.styleable.CircularProgressBar_cpb_indeterminate_mode, this.indeterminateMode);
            this.strokeWidth = obtainStyledAttributes.getDimension(R.styleable.CircularProgressBar_cpb_progressbar_width, this.strokeWidth);
            this.backgroundStrokeWidth = obtainStyledAttributes.getDimension(R.styleable.CircularProgressBar_cpb_background_progressbar_width, this.backgroundStrokeWidth);
            this.color = obtainStyledAttributes.getInt(R.styleable.CircularProgressBar_cpb_progressbar_color, this.color);
            this.backgroundColor = obtainStyledAttributes.getInt(R.styleable.CircularProgressBar_cpb_background_progressbar_color, this.backgroundColor);
            obtainStyledAttributes.recycle();
            this.backgroundPaint = new Paint(1);
            this.backgroundPaint.setColor(this.backgroundColor);
            this.backgroundPaint.setStyle(Paint.Style.STROKE);
            this.backgroundPaint.setStrokeWidth(this.backgroundStrokeWidth);
            this.foregroundPaint = new Paint(1);
            this.foregroundPaint.setColor(this.color);
            this.foregroundPaint.setStyle(Paint.Style.STROKE);
            this.foregroundPaint.setStrokeWidth(this.strokeWidth);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f8d85c", new Object[]{this});
            return;
        }
        super.onFinishInflate();
        if (!this.indeterminateMode) {
            return;
        }
        enableIndeterminateMode(true);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Handler handler = this.indeterminateModeHandler;
        if (handler == null) {
            return;
        }
        handler.removeCallbacks(this.indeterminateModeRunnable);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        canvas.drawOval(this.rectF, this.backgroundPaint);
        canvas.drawArc(this.rectF, this.startAngle, ((this.rightToLeft ? 360 : AConstants.ArtcErrorAudioDeviceError) * ((this.progress * DEFAULT_MAX_VALUE) / this.progressMax)) / DEFAULT_MAX_VALUE, false, this.foregroundPaint);
    }

    private void reDraw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a32ff1e", new Object[]{this});
            return;
        }
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int min = Math.min(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
        setMeasuredDimension(min, min);
        float f = this.strokeWidth;
        float f2 = this.backgroundStrokeWidth;
        if (f <= f2) {
            f = f2;
        }
        float f3 = f / 2.0f;
        float f4 = 0.0f + f3;
        float f5 = min - f3;
        this.rectF.set(f4, f4, f5, f5);
    }

    public float getProgress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ba5fa9a", new Object[]{this})).floatValue() : this.progress;
    }

    public void setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
        } else {
            setProgress(f, false);
        }
    }

    private void setProgress(float f, boolean z) {
        ValueAnimator valueAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("215a34a", new Object[]{this, new Float(f), new Boolean(z)});
            return;
        }
        if (!z && (valueAnimator = this.progressAnimator) != null) {
            valueAnimator.cancel();
            if (this.indeterminateMode) {
                enableIndeterminateMode(false);
            }
        }
        float f2 = this.progressMax;
        if (f > f2) {
            f = f2;
        }
        this.progress = f;
        invalidate();
    }

    public float getProgressMax() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d59a22b8", new Object[]{this})).floatValue() : this.progressMax;
    }

    public void setProgressMax(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a73304", new Object[]{this, new Float(f)});
            return;
        }
        if (f < 0.0f) {
            f = DEFAULT_MAX_VALUE;
        }
        this.progressMax = f;
        reDraw();
    }

    public float getProgressBarWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6f8bdfad", new Object[]{this})).floatValue() : this.strokeWidth;
    }

    public void setProgressBarWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52033217", new Object[]{this, new Float(f)});
            return;
        }
        this.strokeWidth = f;
        this.foregroundPaint.setStrokeWidth(f);
        reDraw();
    }

    public float getBackgroundProgressBarWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fd86a7b", new Object[]{this})).floatValue() : this.backgroundStrokeWidth;
    }

    public void setBackgroundProgressBarWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b28009", new Object[]{this, new Float(f)});
            return;
        }
        this.backgroundStrokeWidth = f;
        this.backgroundPaint.setStrokeWidth(f);
        reDraw();
    }

    public int getColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("756dbba7", new Object[]{this})).intValue() : this.color;
    }

    public void setColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666e7bdb", new Object[]{this, new Integer(i)});
            return;
        }
        this.color = i;
        this.foregroundPaint.setColor(i);
        reDraw();
    }

    public int getBackgroundColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7cbe599", new Object[]{this})).intValue() : this.backgroundColor;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
            return;
        }
        this.backgroundColor = i;
        this.backgroundPaint.setColor(i);
        reDraw();
    }

    public void setProgressWithAnimation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f3848a", new Object[]{this, new Float(f)});
        } else {
            setProgressWithAnimation(f, 1500);
        }
    }

    public void setProgressWithAnimation(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad7d7fb9", new Object[]{this, new Float(f), new Integer(i)});
            return;
        }
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.progressAnimator = ValueAnimator.ofFloat(this.progress, f);
        this.progressAnimator.setDuration(i);
        this.progressAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.taolive.room.ui.view.CircularProgressBar.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    return;
                }
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                CircularProgressBar.access$000(CircularProgressBar.this, floatValue, true);
                if (!CircularProgressBar.access$100(CircularProgressBar.this)) {
                    return;
                }
                float f2 = (floatValue * 360.0f) / CircularProgressBar.DEFAULT_MAX_VALUE;
                CircularProgressBar circularProgressBar = CircularProgressBar.this;
                if (!CircularProgressBar.access$300(circularProgressBar)) {
                    f2 = -f2;
                }
                CircularProgressBar.access$202(circularProgressBar, f2 + CircularProgressBar.DEFAULT_START_ANGLE);
            }
        });
        this.progressAnimator.start();
    }

    public void enableIndeterminateMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6673e652", new Object[]{this, new Boolean(z)});
            return;
        }
        this.indeterminateMode = z;
        this.rightToLeft = true;
        this.startAngle = DEFAULT_START_ANGLE;
        Handler handler = this.indeterminateModeHandler;
        if (handler != null) {
            handler.removeCallbacks(this.indeterminateModeRunnable);
        }
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.indeterminateModeHandler = new Handler();
        if (this.indeterminateMode) {
            this.indeterminateModeHandler.post(this.indeterminateModeRunnable);
        } else {
            setProgress(0.0f, true);
        }
    }

    public void setOnProgressChangedListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76123ea", new Object[]{this, bVar});
        } else {
            this.progressChangeListener = bVar;
        }
    }

    public void setOnIndeterminateModeChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5782a4", new Object[]{this, aVar});
        } else {
            this.indeterminateModeChangeListener = aVar;
        }
    }
}
