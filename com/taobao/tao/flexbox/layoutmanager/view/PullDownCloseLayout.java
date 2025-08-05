package com.taobao.tao.flexbox.layoutmanager.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.ohd;

/* loaded from: classes8.dex */
public class PullDownCloseLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BACK_DURATION = 300;
    private static final int DISMISS_SPEED = 3000;
    private int dismissOffset;
    private int mDisplayHeight;
    private int mDownRawX;
    private int mDownRawY;
    private int mDownY;
    private boolean mForbidGesture;
    private int mInitTop;
    private boolean mIsBeingDragged;
    private a mOnSwipeFinishListener;
    private int mTemplateValue;
    private VelocityTracker mVelocityTracker;
    private int mViewHeight;

    /* loaded from: classes8.dex */
    public interface a {
        void onSwipeFinish();
    }

    static {
        kge.a(206770170);
    }

    public static /* synthetic */ Object ipc$super(PullDownCloseLayout pullDownCloseLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ int access$000(PullDownCloseLayout pullDownCloseLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c9451963", new Object[]{pullDownCloseLayout})).intValue() : pullDownCloseLayout.mTemplateValue;
    }

    public static /* synthetic */ int access$002(PullDownCloseLayout pullDownCloseLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4201a688", new Object[]{pullDownCloseLayout, new Integer(i)})).intValue();
        }
        pullDownCloseLayout.mTemplateValue = i;
        return i;
    }

    public static /* synthetic */ a access$100(PullDownCloseLayout pullDownCloseLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("54239ae9", new Object[]{pullDownCloseLayout}) : pullDownCloseLayout.mOnSwipeFinishListener;
    }

    public void setOnSwipeFinishListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc3d1e3", new Object[]{this, aVar});
        } else {
            this.mOnSwipeFinishListener = aVar;
        }
    }

    public void setForbidGesture(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224d913a", new Object[]{this, new Boolean(z)});
        } else {
            this.mForbidGesture = z;
        }
    }

    public PullDownCloseLayout(Context context) {
        this(context, null);
    }

    public PullDownCloseLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PullDownCloseLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mForbidGesture = true;
        this.dismissOffset = ohd.b(getContext(), 65);
        this.mDisplayHeight = getResources().getDisplayMetrics().heightPixels;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.mInitTop = getTop();
        this.mViewHeight = getHeight();
        this.dismissOffset = (this.mViewHeight - this.mInitTop) / 5;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mForbidGesture) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDownRawY = (int) motionEvent.getRawY();
            this.mDownRawX = (int) motionEvent.getRawX();
            this.mDownY = (int) motionEvent.getY();
            this.mIsBeingDragged = false;
        } else if (action == 2) {
            if (this.mIsBeingDragged) {
                return true;
            }
            int rawY = ((int) motionEvent.getRawY()) - this.mDownRawY;
            int rawX = ((int) motionEvent.getRawX()) - this.mDownRawX;
            if (rawY != 0 && Math.abs(rawY) > Math.abs(rawX)) {
                if (canScroll(this, false, -rawY, (int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    this.mIsBeingDragged = false;
                    return false;
                }
                this.mIsBeingDragged = true;
            }
        }
        return this.mIsBeingDragged;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r0 != 3) goto L14;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.view.PullDownCloseLayout.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r11
            r1[r4] = r12
            java.lang.String r12 = "a9b14c3a"
            java.lang.Object r12 = r0.ipc$dispatch(r12, r1)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L1c:
            boolean r0 = r11.mForbidGesture
            if (r0 != 0) goto Lcd
            android.view.VelocityTracker r0 = r11.mVelocityTracker
            r0.addMovement(r12)
            int r0 = r12.getAction()
            if (r0 == 0) goto Lca
            if (r0 == r4) goto L89
            if (r0 == r2) goto L34
            r12 = 3
            if (r0 == r12) goto L89
            goto Lcc
        L34:
            float r0 = r12.getRawY()
            int r1 = r11.mDownRawY
            float r1 = (float) r1
            float r0 = r0 - r1
            int r0 = (int) r0
            float r1 = r12.getRawX()
            int r2 = r11.mDownRawX
            float r2 = (float) r2
            float r1 = r1 - r2
            int r1 = (int) r1
            boolean r2 = r11.mIsBeingDragged
            if (r2 != 0) goto L6c
            if (r0 == 0) goto L6c
            int r2 = java.lang.Math.abs(r0)
            int r1 = java.lang.Math.abs(r1)
            if (r2 <= r1) goto L6c
            r7 = 0
            int r8 = -r0
            float r0 = r12.getRawX()
            int r9 = (int) r0
            float r0 = r12.getRawY()
            int r10 = (int) r0
            r5 = r11
            r6 = r11
            boolean r0 = r5.canScroll(r6, r7, r8, r9, r10)
            if (r0 != 0) goto L6c
            r11.mIsBeingDragged = r4
        L6c:
            boolean r0 = r11.mIsBeingDragged
            if (r0 == 0) goto Lcc
            int r0 = r11.getTop()
            float r12 = r12.getY()
            int r1 = r11.mDownY
            float r1 = (float) r1
            float r12 = r12 - r1
            int r12 = (int) r12
            int r1 = r0 + r12
            int r2 = r11.mInitTop
            if (r1 > r2) goto L85
            int r12 = r2 - r0
        L85:
            r11.offsetTopAndBottom(r12)
            goto Lcc
        L89:
            android.view.VelocityTracker r12 = r11.mVelocityTracker
            r0 = 1000(0x3e8, float:1.401E-42)
            android.content.Context r1 = r11.getContext()
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            int r1 = r1.getScaledMaximumFlingVelocity()
            float r1 = (float) r1
            r12.computeCurrentVelocity(r0, r1)
            android.view.VelocityTracker r12 = r11.mVelocityTracker
            float r12 = r12.getYVelocity()
            int r0 = r11.getTop()
            int r1 = r11.mInitTop
            int r0 = r0 - r1
            int r1 = r11.dismissOffset
            if (r0 > r1) goto Lc0
            r0 = 1161527296(0x453b8000, float:3000.0)
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 <= 0) goto Lb6
            goto Lc0
        Lb6:
            int r12 = r11.getTop()
            int r0 = r11.mInitTop
            r11.resetState(r12, r0, r3)
            goto Lcc
        Lc0:
            int r12 = r11.getTop()
            int r0 = r11.mDisplayHeight
            r11.resetState(r12, r0, r4)
            goto Lcc
        Lca:
            r11.mIsBeingDragged = r3
        Lcc:
            return r4
        Lcd:
            boolean r12 = super.onTouchEvent(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.view.PullDownCloseLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void resetState(int i, int i2, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f24fd1cb", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        this.mTemplateValue = i;
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.tao.flexbox.layoutmanager.view.PullDownCloseLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                PullDownCloseLayout pullDownCloseLayout = PullDownCloseLayout.this;
                pullDownCloseLayout.offsetTopAndBottom(intValue - PullDownCloseLayout.access$000(pullDownCloseLayout));
                PullDownCloseLayout.access$002(PullDownCloseLayout.this, intValue);
            }
        });
        ofInt.start();
        ofInt.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.tao.flexbox.layoutmanager.view.PullDownCloseLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == -2145066406) {
                    super.onAnimationEnd((Animator) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                super.onAnimationEnd(animator);
                if (PullDownCloseLayout.access$100(PullDownCloseLayout.this) == null || !z) {
                    return;
                }
                PullDownCloseLayout.access$100(PullDownCloseLayout.this).onSwipeFinish();
            }
        });
    }

    private boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4259e1", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount() - 1;
            while (childCount >= 0) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt == null || (i5 = i2 + scrollX) < childAt.getLeft() || i5 >= childAt.getRight() * childAt.getScaleX() || (i6 = i3 + scrollY) < childAt.getTop() || i6 >= childAt.getBottom()) {
                    i4 = childCount;
                } else {
                    i4 = childCount;
                    if (canScroll(childAt, true, i, (int) ((i5 - childAt.getLeft()) / childAt.getScaleX()), i6 - childAt.getTop())) {
                        return true;
                    }
                }
                childCount = i4 - 1;
            }
        }
        return z && view.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mVelocityTracker.recycle();
        this.mVelocityTracker = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.mVelocityTracker = VelocityTracker.obtain();
    }
}
