package com.taobao.android.detail.kit.view.widget.base.uikit.material;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class TBCircularProgressDrawable extends Drawable implements Animatable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANGLE_ANIMATOR_DURATION = 2000;
    private static final Interpolator ANGLE_INTERPOLATOR;
    private static final int MIN_SWEEP_ANGLE = 30;
    private static final int SWEEP_ANIMATOR_DURATION = 600;
    private static final Interpolator SWEEP_INTERPOLATOR;
    private float mBorderWidth;
    private float mCurrentGlobalAngle;
    private float mCurrentGlobalAngleOffset;
    private float mCurrentSweepAngle;
    private boolean mModeAppearing;
    private ObjectAnimator mObjectAnimatorAngle;
    private ObjectAnimator mObjectAnimatorSweep;
    private boolean mRunning;
    private final RectF fBounds = new RectF();
    private Property<TBCircularProgressDrawable, Float> mAngleProperty = new Property<TBCircularProgressDrawable, Float>(Float.class, "angle") { // from class: com.taobao.android.detail.kit.view.widget.base.uikit.material.TBCircularProgressDrawable.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Float, java.lang.Object] */
        @Override // android.util.Property
        public /* synthetic */ Float get(TBCircularProgressDrawable tBCircularProgressDrawable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, tBCircularProgressDrawable}) : a(tBCircularProgressDrawable);
        }

        @Override // android.util.Property
        public /* synthetic */ void set(TBCircularProgressDrawable tBCircularProgressDrawable, Float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f806021", new Object[]{this, tBCircularProgressDrawable, f});
            } else {
                a(tBCircularProgressDrawable, f);
            }
        }

        public Float a(TBCircularProgressDrawable tBCircularProgressDrawable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("52593226", new Object[]{this, tBCircularProgressDrawable}) : Float.valueOf(tBCircularProgressDrawable.getCurrentGlobalAngle());
        }

        public void a(TBCircularProgressDrawable tBCircularProgressDrawable, Float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75e0419c", new Object[]{this, tBCircularProgressDrawable, f});
            } else {
                tBCircularProgressDrawable.setCurrentGlobalAngle(f.floatValue());
            }
        }
    };
    private Property<TBCircularProgressDrawable, Float> mSweepProperty = new Property<TBCircularProgressDrawable, Float>(Float.class, "arc") { // from class: com.taobao.android.detail.kit.view.widget.base.uikit.material.TBCircularProgressDrawable.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Float, java.lang.Object] */
        @Override // android.util.Property
        public /* synthetic */ Float get(TBCircularProgressDrawable tBCircularProgressDrawable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, tBCircularProgressDrawable}) : a(tBCircularProgressDrawable);
        }

        @Override // android.util.Property
        public /* synthetic */ void set(TBCircularProgressDrawable tBCircularProgressDrawable, Float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f806021", new Object[]{this, tBCircularProgressDrawable, f});
            } else {
                a(tBCircularProgressDrawable, f);
            }
        }

        public Float a(TBCircularProgressDrawable tBCircularProgressDrawable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("52593226", new Object[]{this, tBCircularProgressDrawable}) : Float.valueOf(tBCircularProgressDrawable.getCurrentSweepAngle());
        }

        public void a(TBCircularProgressDrawable tBCircularProgressDrawable, Float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75e0419c", new Object[]{this, tBCircularProgressDrawable, f});
            } else {
                tBCircularProgressDrawable.setCurrentSweepAngle(f.floatValue());
            }
        }
    };
    private Paint mPaint = new Paint();

    public static /* synthetic */ Object ipc$super(TBCircularProgressDrawable tBCircularProgressDrawable, String str, Object... objArr) {
        if (str.hashCode() == -2054040210) {
            super.onBoundsChange((Rect) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -2;
    }

    public static /* synthetic */ void access$000(TBCircularProgressDrawable tBCircularProgressDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a24362c", new Object[]{tBCircularProgressDrawable});
        } else {
            tBCircularProgressDrawable.toggleAppearingMode();
        }
    }

    static {
        kge.a(1212156986);
        kge.a(-310707797);
        ANGLE_INTERPOLATOR = new LinearInterpolator();
        SWEEP_INTERPOLATOR = new DecelerateInterpolator();
    }

    public TBCircularProgressDrawable(int i, float f) {
        this.mBorderWidth = f;
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeWidth(f);
        this.mPaint.setColor(i);
        setupAnimations();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        float f2 = this.mCurrentGlobalAngle - this.mCurrentGlobalAngleOffset;
        float f3 = this.mCurrentSweepAngle;
        if (!this.mModeAppearing) {
            f2 += f3;
            f = (360.0f - f3) - 30.0f;
        } else {
            f = f3 + 30.0f;
        }
        canvas.drawArc(this.fBounds, f2, f, false, this.mPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        } else {
            this.mPaint.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        } else {
            this.mPaint.setColorFilter(colorFilter);
        }
    }

    private void toggleAppearingMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7b9903", new Object[]{this});
            return;
        }
        this.mModeAppearing = !this.mModeAppearing;
        if (!this.mModeAppearing) {
            return;
        }
        this.mCurrentGlobalAngleOffset = (this.mCurrentGlobalAngleOffset + 60.0f) % 360.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
            return;
        }
        super.onBoundsChange(rect);
        this.fBounds.left = rect.left + (this.mBorderWidth / 2.0f) + 0.5f;
        this.fBounds.right = (rect.right - (this.mBorderWidth / 2.0f)) - 0.5f;
        this.fBounds.top = rect.top + (this.mBorderWidth / 2.0f) + 0.5f;
        this.fBounds.bottom = (rect.bottom - (this.mBorderWidth / 2.0f)) - 0.5f;
    }

    private void setupAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b7f253", new Object[]{this});
            return;
        }
        this.mObjectAnimatorAngle = ObjectAnimator.ofFloat(this, this.mAngleProperty, 360.0f);
        this.mObjectAnimatorAngle.setInterpolator(ANGLE_INTERPOLATOR);
        this.mObjectAnimatorAngle.setDuration(2000L);
        this.mObjectAnimatorAngle.setRepeatMode(1);
        this.mObjectAnimatorAngle.setRepeatCount(-1);
        this.mObjectAnimatorSweep = ObjectAnimator.ofFloat(this, this.mSweepProperty, 300.0f);
        this.mObjectAnimatorSweep.setInterpolator(SWEEP_INTERPOLATOR);
        this.mObjectAnimatorSweep.setDuration(600L);
        this.mObjectAnimatorSweep.setRepeatMode(1);
        this.mObjectAnimatorSweep.setRepeatCount(-1);
        this.mObjectAnimatorSweep.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.detail.kit.view.widget.base.uikit.material.TBCircularProgressDrawable.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                } else {
                    TBCircularProgressDrawable.access$000(TBCircularProgressDrawable.this);
                }
            }
        });
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (isRunning()) {
        } else {
            this.mRunning = true;
            this.mObjectAnimatorAngle.start();
            this.mObjectAnimatorSweep.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (!isRunning()) {
        } else {
            this.mRunning = false;
            this.mObjectAnimatorAngle.cancel();
            this.mObjectAnimatorSweep.cancel();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b6a3f40", new Object[]{this})).booleanValue() : this.mRunning;
    }

    public void setCurrentGlobalAngle(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46bb400", new Object[]{this, new Float(f)});
            return;
        }
        this.mCurrentGlobalAngle = f;
        invalidateSelf();
    }

    public float getCurrentGlobalAngle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b4968fa4", new Object[]{this})).floatValue() : this.mCurrentGlobalAngle;
    }

    public void setCurrentSweepAngle(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b15277b", new Object[]{this, new Float(f)});
            return;
        }
        this.mCurrentSweepAngle = f;
        invalidateSelf();
    }

    public float getCurrentSweepAngle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6db42a61", new Object[]{this})).floatValue() : this.mCurrentSweepAngle;
    }

    public void setRingColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1643f52b", new Object[]{this, new Integer(i)});
            return;
        }
        this.mPaint.setColor(i);
        invalidateSelf();
    }

    public void setRingWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6acb7165", new Object[]{this, new Float(f)});
            return;
        }
        this.mPaint.setStrokeWidth(f);
        invalidateSelf();
    }
}
