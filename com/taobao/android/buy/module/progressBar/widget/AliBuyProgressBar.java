package com.taobao.android.buy.module.progressBar.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.bay;
import tb.kge;

/* loaded from: classes4.dex */
public class AliBuyProgressBar extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int endColor;
    private boolean isAdjust;
    private LinearGradient linearGradient;
    private ValueAnimator mAnimator;
    private Paint mBarPaint;
    private final int mBarWidth;
    private float mEndXOfBar;
    private final int mMarginTopOfBar;
    private final int mMarginTopOfText;
    private float mProgress;
    private b mProgressUpdateListener;
    private float mProgressWidth;
    private final float mRatio;
    private float mStartXOfBar;
    private String mText;
    private final int mWidth;
    private final int startColor;

    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(String str);
    }

    static {
        kge.a(-1513800157);
    }

    public static /* synthetic */ Object ipc$super(AliBuyProgressBar aliBuyProgressBar, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ float access$000(AliBuyProgressBar aliBuyProgressBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b34e0a13", new Object[]{aliBuyProgressBar})).floatValue() : aliBuyProgressBar.mProgress;
    }

    public static /* synthetic */ float access$002(AliBuyProgressBar aliBuyProgressBar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb55942b", new Object[]{aliBuyProgressBar, new Float(f)})).floatValue();
        }
        aliBuyProgressBar.mProgress = f;
        return f;
    }

    public static /* synthetic */ float access$100(AliBuyProgressBar aliBuyProgressBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e6fc34d4", new Object[]{aliBuyProgressBar})).floatValue() : aliBuyProgressBar.mProgressWidth;
    }

    public static /* synthetic */ float access$102(AliBuyProgressBar aliBuyProgressBar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d6cc18a", new Object[]{aliBuyProgressBar, new Float(f)})).floatValue();
        }
        aliBuyProgressBar.mProgressWidth = f;
        return f;
    }

    public static /* synthetic */ float access$200(AliBuyProgressBar aliBuyProgressBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1aaa5f95", new Object[]{aliBuyProgressBar})).floatValue() : aliBuyProgressBar.mStartXOfBar;
    }

    public static /* synthetic */ int access$300(AliBuyProgressBar aliBuyProgressBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4e588a59", new Object[]{aliBuyProgressBar})).intValue() : aliBuyProgressBar.mWidth;
    }

    public static /* synthetic */ LinearGradient access$402(AliBuyProgressBar aliBuyProgressBar, LinearGradient linearGradient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearGradient) ipChange.ipc$dispatch("24b26e77", new Object[]{aliBuyProgressBar, linearGradient});
        }
        aliBuyProgressBar.linearGradient = linearGradient;
        return linearGradient;
    }

    public static /* synthetic */ String access$500(AliBuyProgressBar aliBuyProgressBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6a33e1b8", new Object[]{aliBuyProgressBar}) : aliBuyProgressBar.mText;
    }

    public static /* synthetic */ String access$502(AliBuyProgressBar aliBuyProgressBar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44fe11ec", new Object[]{aliBuyProgressBar, str});
        }
        aliBuyProgressBar.mText = str;
        return str;
    }

    public static /* synthetic */ String access$600(AliBuyProgressBar aliBuyProgressBar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3729a66", new Object[]{aliBuyProgressBar, new Integer(i)}) : aliBuyProgressBar.getText(i);
    }

    public static /* synthetic */ b access$700(AliBuyProgressBar aliBuyProgressBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("1a0ea4da", new Object[]{aliBuyProgressBar}) : aliBuyProgressBar.mProgressUpdateListener;
    }

    public AliBuyProgressBar(Context context) {
        this(context, null);
    }

    public AliBuyProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mWidth = bay.a(240.0f);
        this.mRatio = 0.42f;
        this.mBarWidth = bay.a(3.0f);
        this.mMarginTopOfBar = bay.a(10.0f);
        this.mMarginTopOfText = bay.a(34.0f);
        this.mProgress = 0.0f;
        this.startColor = -45056;
        this.endColor = -28672;
        initPaint();
        initAnimator();
        this.mAnimator.start();
    }

    private void initPaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b778ab5", new Object[]{this});
            return;
        }
        int i = this.mWidth;
        this.mStartXOfBar = (i * 0.58000004f) / 2.0f;
        this.mEndXOfBar = (i * 1.42f) / 2.0f;
        this.mBarPaint = new Paint(1);
        this.mBarPaint.setStyle(Paint.Style.STROKE);
        this.mBarPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mBarPaint.setStrokeWidth(this.mBarWidth);
    }

    private void initAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327f851e", new Object[]{this});
            return;
        }
        this.mAnimator = ValueAnimator.ofFloat(0.3f, 0.99f);
        this.mAnimator.setDuration(7000L);
        this.mAnimator.setInterpolator(new LinearInterpolator());
        this.mAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.buy.module.progressBar.widget.AliBuyProgressBar.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else {
                    AliBuyProgressBar.access$002(AliBuyProgressBar.this, 0.99f);
                }
            }
        });
        this.mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.buy.module.progressBar.widget.AliBuyProgressBar.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                AliBuyProgressBar.access$002(AliBuyProgressBar.this, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                AliBuyProgressBar aliBuyProgressBar = AliBuyProgressBar.this;
                AliBuyProgressBar.access$102(aliBuyProgressBar, AliBuyProgressBar.access$200(aliBuyProgressBar) + (AliBuyProgressBar.access$000(AliBuyProgressBar.this) * AliBuyProgressBar.access$300(AliBuyProgressBar.this) * 0.42f));
                AliBuyProgressBar aliBuyProgressBar2 = AliBuyProgressBar.this;
                AliBuyProgressBar.access$402(aliBuyProgressBar2, new LinearGradient(AliBuyProgressBar.access$200(aliBuyProgressBar2), 0.0f, AliBuyProgressBar.access$100(AliBuyProgressBar.this), 0.0f, -45056, -28672, Shader.TileMode.CLAMP));
                int access$000 = (((int) (AliBuyProgressBar.access$000(AliBuyProgressBar.this) * 100.0f)) / 10) * 10;
                if (AliBuyProgressBar.access$000(AliBuyProgressBar.this) == 0.99f) {
                    access$000 = 99;
                }
                AliBuyProgressBar aliBuyProgressBar3 = AliBuyProgressBar.this;
                AliBuyProgressBar.access$502(aliBuyProgressBar3, AliBuyProgressBar.access$600(aliBuyProgressBar3, access$000));
                if (AliBuyProgressBar.access$700(AliBuyProgressBar.this) != null) {
                    AliBuyProgressBar.access$700(AliBuyProgressBar.this).a(AliBuyProgressBar.access$500(AliBuyProgressBar.this));
                }
                AliBuyProgressBar.this.invalidate();
            }
        });
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        this.mBarPaint.setColor(-2565928);
        this.mBarPaint.setShader(null);
        float f = this.mStartXOfBar;
        int i = this.mMarginTopOfBar;
        canvas.drawLine(f, i, this.mEndXOfBar, i, this.mBarPaint);
        this.mBarPaint.setShader(this.linearGradient);
        float f2 = this.mStartXOfBar;
        int i2 = this.mMarginTopOfBar;
        canvas.drawLine(f2, i2, this.mProgressWidth, i2, this.mBarPaint);
    }

    public void setmProgressUpdateListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53adc30a", new Object[]{this, bVar});
        } else {
            this.mProgressUpdateListener = bVar;
        }
    }

    public void finishLoading(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe54c07f", new Object[]{this, aVar});
            return;
        }
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.cancel();
        this.mProgress = 1.0f;
        this.mProgressWidth = this.mStartXOfBar + (this.mWidth * 0.42f);
        this.mText = getText(100);
        b bVar = this.mProgressUpdateListener;
        if (bVar != null) {
            bVar.a(this.mText);
        }
        invalidate();
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    private String getText(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f841a27", new Object[]{this, new Integer(i)});
        }
        if (this.isAdjust) {
            return com.alibaba.ability.localization.b.a(R.string.taobao_app_3180_1_29370) + i + "%) ...";
        }
        return com.alibaba.ability.localization.b.a(R.string.taobao_app_3180_1_29369) + i + "%) ...";
    }

    public void isAdjust(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed868574", new Object[]{this, new Boolean(z)});
        } else {
            this.isAdjust = z;
        }
    }
}
