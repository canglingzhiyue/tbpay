package com.taobao.android.interactive_common.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import tb.grn;
import tb.grt;

/* loaded from: classes5.dex */
public class SlideFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DRAG_MODE = 0;
    public static final int EXIT_ANIMATE_LENGTH = 50;
    public static final int IDLE = 2;
    public static final int MAX_FINISH_Y = grt.a(100.0f);
    public static final int MIN_MOVE_DISTANCE = 20;
    public static final int RESTORE_ANIMATE_LENGTH = 300;
    public static final int SLIDER_MODE = 1;
    private static final String TAG = "SlideFrameLayout";
    private int exitAnimationLength;
    private int finishMoveY;
    private float iDownX;
    private float iDownY;
    private boolean mDraggable;
    private boolean mIsScaleEnabled;
    private boolean mIsUpSlideEnabled;
    private grn mSlideHandler;
    private int mSlideMode;
    private float mTouchSlop;
    private int restoreAnimationLength;

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

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        return true;
    }

    public void updateAnimPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93db79", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ boolean access$000(SlideFrameLayout slideFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("343d80f2", new Object[]{slideFrameLayout})).booleanValue() : slideFrameLayout.mIsUpSlideEnabled;
    }

    public static /* synthetic */ boolean access$100(SlideFrameLayout slideFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d0ab7d51", new Object[]{slideFrameLayout})).booleanValue() : slideFrameLayout.mIsScaleEnabled;
    }

    public static /* synthetic */ void access$200(SlideFrameLayout slideFrameLayout, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36162394", new Object[]{slideFrameLayout, new Float(f)});
        } else {
            slideFrameLayout.doScale(f);
        }
    }

    public static /* synthetic */ grn access$300(SlideFrameLayout slideFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (grn) ipChange.ipc$dispatch("557d9998", new Object[]{slideFrameLayout}) : slideFrameLayout.mSlideHandler;
    }

    public static /* synthetic */ int access$400(SlideFrameLayout slideFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a5f5725d", new Object[]{slideFrameLayout})).intValue() : slideFrameLayout.exitAnimationLength;
    }

    public SlideFrameLayout(Context context) {
        super(context);
        this.restoreAnimationLength = 300;
        this.exitAnimationLength = 50;
        this.finishMoveY = (grt.a() << 1) / 3;
        this.mDraggable = false;
        this.mSlideMode = 2;
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setScaleEnabled(true);
        setUpSlideEnabled(true);
    }

    public SlideFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.restoreAnimationLength = 300;
        this.exitAnimationLength = 50;
        this.finishMoveY = (grt.a() << 1) / 3;
        this.mDraggable = false;
        this.mSlideMode = 2;
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setScaleEnabled(true);
        setUpSlideEnabled(true);
    }

    public SlideFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.restoreAnimationLength = 300;
        this.exitAnimationLength = 50;
        this.finishMoveY = (grt.a() << 1) / 3;
        this.mDraggable = false;
        this.mSlideMode = 2;
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setScaleEnabled(true);
        setUpSlideEnabled(true);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mSlideMode = 2;
            this.iDownX = (int) motionEvent.getRawX();
            this.iDownY = (int) motionEvent.getRawY();
            if (WXEnvironment.isApkDebugable()) {
                String str = "ACTION_DOWN : x=" + motionEvent.getRawX() + ", y=" + motionEvent.getRawY();
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (action == 1) {
            float rawY = motionEvent.getRawY() - this.iDownY;
            float rawX = motionEvent.getRawX() - this.iDownX;
            if (WXEnvironment.isApkDebugable()) {
                if (motionEvent.getAction() == 1) {
                    String str2 = "ACTION_UP---->>>mSlideMode=" + this.mSlideMode + ", x=" + rawX + ", y=" + rawY + ", TouchSlop = " + this.mTouchSlop;
                } else if (motionEvent.getAction() == 3) {
                    String str3 = "ACTION_CANCEL---->>>mSlideMode=" + this.mSlideMode + ", x=" + rawX + ", y=" + rawY + ", TouchSlop = " + this.mTouchSlop;
                }
            }
            if (rawY > MAX_FINISH_Y && draggable()) {
                finish(rawX, rawY);
            } else if (Math.abs(rawY) < this.mTouchSlop) {
                if (WXEnvironment.isApkDebugable()) {
                    String str4 = "ACTION_UP----click>>>mSlideMode=" + this.mSlideMode + ", x=" + rawX + ", y=" + rawY + ", TouchSlop = " + this.mTouchSlop;
                }
                grn grnVar = this.mSlideHandler;
            } else if (draggable()) {
                restore(rawX, rawY);
                return true;
            }
            return false;
        } else if (action == 2) {
            if (this.mSlideMode == 1) {
                return super.onTouchEvent(motionEvent);
            }
            float rawX2 = motionEvent.getRawX() - this.iDownX;
            float rawY2 = motionEvent.getRawY() - this.iDownY;
            if (!this.mIsScaleEnabled && Math.abs(rawY2) < Math.abs(rawX2)) {
                this.iDownX = (int) motionEvent.getRawX();
                this.iDownY = (int) motionEvent.getRawY();
                return super.onTouchEvent(motionEvent);
            } else if (rawY2 > 0.0f || this.mIsUpSlideEnabled) {
                if (Math.abs(rawX2) - Math.abs(rawY2) >= 20.0f && this.mSlideMode == 2) {
                    if (WXEnvironment.isApkDebugable()) {
                        String str5 = "ACTION_MOVE---->>>SLIDER_MODE : x=" + rawX2 + ", y=" + rawY2;
                    }
                    this.mSlideMode = 1;
                    ViewParent parent = getParent();
                    if (parent instanceof StretchViewPager) {
                        ((StretchViewPager) parent).setScroll(true);
                    }
                } else {
                    if (WXEnvironment.isApkDebugable()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("ACTION_MOVE---->>>DRAG_MODE : x=");
                        sb.append(rawX2);
                        sb.append(", y=");
                        sb.append(rawY2);
                        sb.append(", 是否可拖动=");
                        if (this.mTouchSlop > Math.abs(rawY2)) {
                            z = false;
                        }
                        sb.append(z);
                        sb.toString();
                    }
                    if (this.mTouchSlop <= Math.abs(rawY2) && draggable()) {
                        this.mSlideMode = 0;
                        doPagerDown(rawX2, rawY2);
                    }
                    ViewParent parent2 = getParent();
                    if (parent2 instanceof StretchViewPager) {
                        ((StretchViewPager) parent2).setScroll(false);
                    }
                }
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void restore(final float f, final float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f0da6d5", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, 0.0f);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.interactive_common.view.SlideFrameLayout.1
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
                    com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.interactive_common.view.SlideFrameLayout.AnonymousClass1.$ipChange
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
                    com.taobao.android.interactive_common.view.SlideFrameLayout r2 = com.taobao.android.interactive_common.view.SlideFrameLayout.this
                    boolean r2 = com.taobao.android.interactive_common.view.SlideFrameLayout.access$000(r2)
                    if (r2 != 0) goto L3f
                    int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                    if (r2 >= 0) goto L3f
                    r5 = 0
                L3f:
                    com.taobao.android.interactive_common.view.SlideFrameLayout r2 = com.taobao.android.interactive_common.view.SlideFrameLayout.this
                    boolean r2 = com.taobao.android.interactive_common.view.SlideFrameLayout.access$100(r2)
                    if (r2 != 0) goto L48
                    r0 = 0
                L48:
                    com.taobao.android.interactive_common.view.SlideFrameLayout r1 = com.taobao.android.interactive_common.view.SlideFrameLayout.this
                    r1.setTranslationX(r0)
                    com.taobao.android.interactive_common.view.SlideFrameLayout r0 = com.taobao.android.interactive_common.view.SlideFrameLayout.this
                    r0.setTranslationY(r5)
                    com.taobao.android.interactive_common.view.SlideFrameLayout r0 = com.taobao.android.interactive_common.view.SlideFrameLayout.this
                    com.taobao.android.interactive_common.view.SlideFrameLayout.access$200(r0, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.interactive_common.view.SlideFrameLayout.AnonymousClass1.onAnimationUpdate(android.animation.ValueAnimator):void");
            }
        });
        ofFloat.setDuration(getRestoreAnimateLength());
        ofFloat.start();
    }

    public void finish(final float f, final float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b8091a", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, 400.0f);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.interactive_common.view.SlideFrameLayout.2
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
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.interactive_common.view.SlideFrameLayout.3
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
                } else if (SlideFrameLayout.access$300(SlideFrameLayout.this) == null) {
                } else {
                    SlideFrameLayout.access$300(SlideFrameLayout.this);
                    SlideFrameLayout.access$400(SlideFrameLayout.this);
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
            if (f2 < 0.7d) {
                f2 = 0.7f;
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

    public void setSlideHandler(grn grnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcaccd8f", new Object[]{this, grnVar});
        } else {
            this.mSlideHandler = grnVar;
        }
    }

    public boolean draggable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4e6bf398", new Object[]{this})).booleanValue() : this.mDraggable;
    }

    public void setDraggable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a166c2", new Object[]{this, new Boolean(z)});
        } else {
            this.mDraggable = z;
        }
    }
}
