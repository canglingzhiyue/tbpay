package com.taobao.detail.rate.v2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kil;

/* loaded from: classes7.dex */
public class SlideFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EXIT_ANIMATE_LENGTH = 500;
    private static final int MAX_FINISH_Y = kil.a(100.0f);
    public static final int RESTORE_ANIMATE_LENGTH = 300;
    private static final String TAG = "SlideFrameLayout";
    private int exitAnimationLength;
    private int finishMoveY;
    private float iDownX;
    private float iDownY;
    private boolean isSlideBegin;
    private boolean mIsDegree;
    private boolean mIsScaleEnabled;
    private boolean mIsUpSlideEnabled;
    private a mSlideHandler;
    private float mTouchSlop;
    private int restoreAnimationLength;

    /* loaded from: classes7.dex */
    public interface a {
        boolean a(float f, float f2);
    }

    public static /* synthetic */ Object ipc$super(SlideFrameLayout slideFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode != -407533570) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public void doFinishTranslation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae8c126", new Object[]{this, new Float(f)});
        }
    }

    public boolean finishActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f622f44d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ boolean access$000(SlideFrameLayout slideFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7a0c5175", new Object[]{slideFrameLayout})).booleanValue() : slideFrameLayout.mIsUpSlideEnabled;
    }

    public static /* synthetic */ boolean access$100(SlideFrameLayout slideFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bd976f36", new Object[]{slideFrameLayout})).booleanValue() : slideFrameLayout.mIsScaleEnabled;
    }

    public static /* synthetic */ void access$200(SlideFrameLayout slideFrameLayout, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("232f792d", new Object[]{slideFrameLayout, new Float(f)});
        } else {
            slideFrameLayout.doScale(f);
        }
    }

    public SlideFrameLayout(Context context) {
        super(context);
        this.restoreAnimationLength = 300;
        this.exitAnimationLength = 500;
        this.finishMoveY = (kil.b() << 1) / 3;
        this.mIsScaleEnabled = false;
        this.mIsUpSlideEnabled = false;
        this.mIsDegree = false;
        this.isSlideBegin = false;
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public SlideFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.restoreAnimationLength = 300;
        this.exitAnimationLength = 500;
        this.finishMoveY = (kil.b() << 1) / 3;
        this.mIsScaleEnabled = false;
        this.mIsUpSlideEnabled = false;
        this.mIsDegree = false;
        this.isSlideBegin = false;
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public SlideFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.restoreAnimationLength = 300;
        this.exitAnimationLength = 500;
        this.finishMoveY = (kil.b() << 1) / 3;
        this.mIsScaleEnabled = false;
        this.mIsUpSlideEnabled = false;
        this.mIsDegree = false;
        this.isSlideBegin = false;
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (isDegree()) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                float rawY = motionEvent.getRawY() - this.iDownY;
                float rawX = motionEvent.getRawX() - this.iDownX;
                if (rawY > MAX_FINISH_Y) {
                    finish(rawX, rawY);
                } else if (Math.abs(rawY) >= this.mTouchSlop) {
                    restore(rawX, rawY);
                }
                return true;
            } else if (action == 2) {
                float rawX2 = motionEvent.getRawX() - this.iDownX;
                float rawY2 = motionEvent.getRawY() - this.iDownY;
                if (!this.mIsScaleEnabled && Math.abs(rawY2) < Math.abs(rawX2)) {
                    this.iDownX = (int) motionEvent.getRawX();
                    this.iDownY = (int) motionEvent.getRawY();
                    return super.onTouchEvent(motionEvent);
                } else if (rawY2 > 0.0f || this.mIsUpSlideEnabled) {
                    if (!this.isSlideBegin && shouldSlide(rawX2, rawY2)) {
                        this.isSlideBegin = true;
                    } else {
                        doPagerDown(rawX2, rawY2);
                    }
                    return true;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (isDegree()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.isSlideBegin = false;
            this.iDownX = (int) motionEvent.getRawX();
            this.iDownY = (int) motionEvent.getRawY();
        } else if (action == 2) {
            float rawX = motionEvent.getRawX() - this.iDownX;
            float rawY = motionEvent.getRawY() - this.iDownY;
            if (!this.isSlideBegin && shouldSlide(rawX, rawY)) {
                this.isSlideBegin = true;
                return true;
            }
        }
        return false;
    }

    public boolean shouldSlide(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("998e0009", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        a aVar = this.mSlideHandler;
        if (aVar == null) {
            return false;
        }
        return aVar.a(f, f2);
    }

    public void restore(final float f, final float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f0da6d5", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, 0.0f);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.detail.rate.v2.SlideFrameLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onAnimationUpdate(android.animation.ValueAnimator r5) {
                /*
                    r4 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.detail.rate.v2.SlideFrameLayout.AnonymousClass1.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r1 == 0) goto L15
                    r1 = 2
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r2 = 0
                    r1[r2] = r4
                    r2 = 1
                    r1[r2] = r5
                    java.lang.String r5 = "8ffc03bf"
                    r0.ipc$dispatch(r5, r1)
                    return
                L15:
                    java.lang.Object r5 = r5.getAnimatedValue()
                    java.lang.Float r5 = (java.lang.Float) r5
                    float r5 = r5.floatValue()
                    float r0 = r2
                    r1 = 0
                    int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r2 == 0) goto L31
                    float r2 = r3
                    int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                    if (r3 <= 0) goto L31
                    float r2 = r5 / r2
                    float r0 = r0 * r2
                    goto L32
                L31:
                    r0 = 0
                L32:
                    com.taobao.detail.rate.v2.SlideFrameLayout r2 = com.taobao.detail.rate.v2.SlideFrameLayout.this
                    boolean r2 = com.taobao.detail.rate.v2.SlideFrameLayout.access$000(r2)
                    if (r2 != 0) goto L3f
                    int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                    if (r2 >= 0) goto L3f
                    r5 = 0
                L3f:
                    com.taobao.detail.rate.v2.SlideFrameLayout r2 = com.taobao.detail.rate.v2.SlideFrameLayout.this
                    boolean r2 = com.taobao.detail.rate.v2.SlideFrameLayout.access$100(r2)
                    if (r2 != 0) goto L48
                    r0 = 0
                L48:
                    com.taobao.detail.rate.v2.SlideFrameLayout r1 = com.taobao.detail.rate.v2.SlideFrameLayout.this
                    r1.setTranslationX(r0)
                    com.taobao.detail.rate.v2.SlideFrameLayout r0 = com.taobao.detail.rate.v2.SlideFrameLayout.this
                    r0.setTranslationY(r5)
                    com.taobao.detail.rate.v2.SlideFrameLayout r0 = com.taobao.detail.rate.v2.SlideFrameLayout.this
                    com.taobao.detail.rate.v2.SlideFrameLayout.access$200(r0, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.detail.rate.v2.SlideFrameLayout.AnonymousClass1.onAnimationUpdate(android.animation.ValueAnimator):void");
            }
        });
        ofFloat.setDuration(getRestoreAnimateLength());
        ofFloat.start();
    }

    public void finish(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b8091a", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f2 + getFinishMoveY());
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.detail.rate.v2.SlideFrameLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else {
                    SlideFrameLayout.this.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.taobao.detail.rate.v2.SlideFrameLayout.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
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
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else if (SlideFrameLayout.this.finishActivity() || !(SlideFrameLayout.this.getContext() instanceof Activity)) {
                } else {
                    ((Activity) SlideFrameLayout.this.getContext()).finish();
                    ((Activity) SlideFrameLayout.this.getContext()).overridePendingTransition(0, 0);
                }
            }
        });
        ofFloat.setDuration(getExitAnimateLength());
        ofFloat.start();
    }

    public void doPagerDown(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca74f201", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        if (f2 < 0.0f) {
            f = 0.0f;
        }
        setTranslationY(f2);
        if (this.mIsScaleEnabled) {
            setTranslationX(f);
        }
        doScale(f2);
        doFinishTranslation(f2);
    }

    private void doScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("773c9ffa", new Object[]{this, new Float(f)});
        } else if (!this.mIsScaleEnabled) {
        } else {
            float f2 = 1.0f - (f / 1000.0f);
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            if (f2 < 0.5d) {
                f2 = 0.5f;
            }
            setPivotX((getRight() - getLeft()) / 2);
            setPivotY((getTop() + getBottom()) / 2);
            setScaleX(f2);
            setScaleY(f2);
        }
    }

    public int getFinishMoveY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d12e0999", new Object[]{this})).intValue() : this.finishMoveY;
    }

    public int getRestoreAnimateLength() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("28d832a9", new Object[]{this})).intValue() : this.restoreAnimationLength;
    }

    public int getExitAnimateLength() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c96a7eed", new Object[]{this})).intValue() : this.exitAnimationLength;
    }

    public void setFinishMoveY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8903329", new Object[]{this, new Integer(i)});
        } else {
            this.finishMoveY = i;
        }
    }

    public void setExitAnimationLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c69a2d2", new Object[]{this, new Integer(i)});
        } else {
            this.exitAnimationLength = i;
        }
    }

    public void setRestoreAnimationLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3dbc7fe", new Object[]{this, new Integer(i)});
        } else {
            this.restoreAnimationLength = i;
        }
    }

    public void setScaleEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d42966b4", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsScaleEnabled = z;
        }
    }

    public void setUpSlideEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3571bc0", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsUpSlideEnabled = z;
        }
    }

    public void setSlideHandler(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40aab7f", new Object[]{this, aVar});
        } else {
            this.mSlideHandler = aVar;
        }
    }

    public boolean isDegree() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7938aa21", new Object[]{this})).booleanValue() : this.mIsDegree;
    }

    public void setDegree(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72246a1f", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsDegree = z;
        }
    }
}
