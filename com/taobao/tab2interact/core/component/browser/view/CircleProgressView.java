package com.taobao.tab2interact.core.component.browser.view;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.utils.e;
import com.taobao.tab2interact.core.utils.f;
import tb.kge;
import tb.ohd;

/* loaded from: classes8.dex */
public class CircleProgressView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CircleProgressView";
    private static final String UI_CIRCLE_PROGRESS_BACKGROUND_COLOR = "#B3000000";
    private static final String UI_CIRCLE_PROGRESS_BACKGROUND_STROKE_COLOR = "#444444";
    private static final String UI_CIRCLE_PROGRESS_COLOR = "#FFB600";
    private static final int UI_CIRCLE_PROGRESS_WIDTH = 4;
    private long mCurrentTime;
    private Paint mPaint;
    private float mProgress;
    private ValueAnimator mProgressAnimator;
    private int mProgressBackgroundColor;
    private int mProgressBackgroundStrokeColor;
    private int mProgressColor;
    private a mProgressListener;
    private int mProgressWidth;
    private RectF mRectF;
    private long mTotalTime;

    /* loaded from: classes8.dex */
    public interface a {
        void a(float f, long j, long j2, long j3);
    }

    static {
        kge.a(1194412236);
    }

    public static /* synthetic */ Object ipc$super(CircleProgressView circleProgressView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 1389530587) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
    }

    public static /* synthetic */ a access$100(CircleProgressView circleProgressView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f3de3be1", new Object[]{circleProgressView}) : circleProgressView.mProgressListener;
    }

    public static /* synthetic */ long access$200(CircleProgressView circleProgressView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3ebaf850", new Object[]{circleProgressView})).longValue() : circleProgressView.mCurrentTime;
    }

    public static /* synthetic */ long access$202(CircleProgressView circleProgressView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("caa72d1a", new Object[]{circleProgressView, new Long(j)})).longValue();
        }
        circleProgressView.mCurrentTime = j;
        return j;
    }

    public static /* synthetic */ long access$300(CircleProgressView circleProgressView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("45e3da91", new Object[]{circleProgressView})).longValue() : circleProgressView.mTotalTime;
    }

    public CircleProgressView(Context context) {
        super(context);
        this.mProgress = 0.0f;
        init();
    }

    public CircleProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mProgress = 0.0f;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mPaint = new Paint();
        this.mRectF = new RectF();
        this.mProgressWidth = ohd.a(getContext(), 4);
        this.mProgressColor = e.INSTANCE.a(UI_CIRCLE_PROGRESS_COLOR);
        this.mProgressBackgroundColor = e.INSTANCE.a(UI_CIRCLE_PROGRESS_BACKGROUND_COLOR);
        this.mProgressBackgroundStrokeColor = e.INSTANCE.a(UI_CIRCLE_PROGRESS_BACKGROUND_STROKE_COLOR);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.mProgressWidth / 2.0f;
        float f2 = 0.0f + f;
        this.mRectF.set(f2, f2, i - f, i2 - f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        this.mPaint.setAlpha(153);
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setColor(this.mProgressBackgroundColor);
        canvas.drawOval(this.mRectF, this.mPaint);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mPaint.setStrokeWidth(this.mProgressWidth);
        this.mPaint.setColor(this.mProgressBackgroundStrokeColor);
        canvas.drawOval(this.mRectF, this.mPaint);
        this.mPaint.setAlpha(255);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStrokeWidth(this.mProgressWidth);
        this.mPaint.setColor(this.mProgressColor);
        canvas.drawArc(this.mRectF, -90.0f, this.mProgress * 360.0f, false, this.mPaint);
    }

    public void init(long j, final long j2, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54c0d5d", new Object[]{this, new Long(j), new Long(j2), new Boolean(z)});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "【init】currentTime: " + j + ", totalTime: " + j2);
        long j3 = j > j2 ? j2 : j;
        float f = j2 != 0 ? ((float) j3) / ((float) j2) : 0.0f;
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "【init】currentTime: " + j3 + ", totalTime: " + j2 + ",progress" + f);
        this.mTotalTime = j2;
        this.mCurrentTime = j3;
        ValueAnimator valueAnimator = this.mProgressAnimator;
        if (valueAnimator instanceof TimeAnimator) {
            ((TimeAnimator) valueAnimator).setTimeListener(null);
            this.mProgressAnimator.cancel();
        }
        this.mProgressAnimator = new TimeAnimator();
        this.mProgressAnimator.setInterpolator(new LinearInterpolator());
        this.mProgressAnimator.setDuration(j2 - j3);
        ValueAnimator valueAnimator2 = this.mProgressAnimator;
        if (z) {
            i = -1;
        }
        valueAnimator2.setRepeatCount(i);
        final long j4 = j3;
        ((TimeAnimator) this.mProgressAnimator).setTimeListener(new b() { // from class: com.taobao.tab2interact.core.component.browser.view.CircleProgressView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.taobao.tab2interact.core.component.browser.view.CircleProgressView.b
            public void a(TimeAnimator timeAnimator, long j5, long j6) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("62cf0ff8", new Object[]{this, timeAnimator, new Long(j5), new Long(j6)});
                } else if (CircleProgressView.access$100(CircleProgressView.this) == null) {
                } else {
                    long j7 = j4 + j5;
                    long access$200 = j7 - CircleProgressView.access$200(CircleProgressView.this);
                    CircleProgressView.access$202(CircleProgressView.this, j7);
                    CircleProgressView.access$100(CircleProgressView.this).a(CircleProgressView.this.setProgress(b(timeAnimator, j7, j2)), CircleProgressView.access$200(CircleProgressView.this), CircleProgressView.access$300(CircleProgressView.this), access$200);
                }
            }
        });
        setProgress(f);
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (this.mProgressAnimator == null) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "【start】mProgressAnimator is null");
        } else if (Build.VERSION.SDK_INT >= 19 && this.mProgressAnimator.isPaused()) {
            this.mProgressAnimator.resume();
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "【start】resume");
        } else if (this.mProgressAnimator.isStarted()) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "【start】The animation is started");
        } else if (this.mProgress == 1.0f) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "【start】The animation is end");
            this.mProgressListener.a(1.0f, this.mCurrentTime, this.mTotalTime, 0L);
        } else {
            this.mProgressAnimator.start();
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "【start】start");
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else if (this.mProgressAnimator == null || Build.VERSION.SDK_INT < 19 || !this.mProgressAnimator.isRunning()) {
        } else {
            this.mProgressAnimator.pause();
            this.mProgressListener.a(this.mProgress, this.mCurrentTime, this.mTotalTime, 0L);
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "【pause】pause, mProgress:" + this.mProgress);
        }
    }

    public float setProgress(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bf028ba", new Object[]{this, new Float(f)})).floatValue();
        }
        this.mProgress = f.a(f, 0.0f, 1.0f);
        invalidate();
        return this.mProgress;
    }

    public void setProgressColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5260e3e8", new Object[]{this, new Integer(i)});
        } else {
            this.mProgressColor = i;
        }
    }

    public void setProgressListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818337d0", new Object[]{this, aVar});
        } else {
            this.mProgressListener = aVar;
        }
    }

    /* loaded from: classes8.dex */
    public static abstract class b implements TimeAnimator.TimeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-782314358);
            kge.a(-1191037434);
        }

        public abstract void a(TimeAnimator timeAnimator, long j, long j2);

        private b() {
        }

        @Override // android.animation.TimeAnimator.TimeListener
        public void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
            long j3;
            long j4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e65699cc", new Object[]{this, timeAnimator, new Long(j), new Long(j2)});
                return;
            }
            int repeatCount = timeAnimator.getRepeatCount();
            if (repeatCount >= 0) {
                long duration = (repeatCount + 1) * timeAnimator.getDuration();
                if (j >= duration) {
                    timeAnimator.cancel();
                    j4 = duration - (j - j2);
                    j3 = duration;
                    a(timeAnimator, j3, j4);
                }
            }
            j3 = j;
            j4 = j2;
            a(timeAnimator, j3, j4);
        }

        public static float b(TimeAnimator timeAnimator, long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2bd00729", new Object[]{timeAnimator, new Long(j), new Long(j2)})).floatValue();
            }
            if (timeAnimator == null) {
                return 0.0f;
            }
            float f = (float) j;
            if (j2 <= 0) {
                j2 = timeAnimator.getDuration();
            }
            float f2 = f / ((float) j2);
            float a2 = f.a(f2, 0.0f, timeAnimator.getRepeatCount() >= 0 ? Math.min(f2, timeAnimator.getRepeatCount() + 1) : Float.MAX_VALUE);
            return a2 - a(a2);
        }

        private static int a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue();
            }
            double d = f;
            double floor = Math.floor(d);
            if (d == floor && f > 0.0f) {
                floor -= 1.0d;
            }
            return (int) floor;
        }
    }
}
