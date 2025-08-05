package com.taobao.android.interactive_common.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class StretchViewPager extends ViewPager implements ValueAnimator.AnimatorUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static boolean DEBUG = false;
    public static final int STRETCH_BOTH = 17;
    public static final int STRETCH_LEFT = 1;
    public static final int STRETCH_NONE = 0;
    public static final int STRETCH_RIGHT = 16;
    public static final String TAG = "StretchPager";
    private int activePointerId;
    private final ValueAnimator anim;
    private int directionModel;
    private int distanceX;
    private int firstScrollX;
    private boolean isAnimRunning;
    private int lastPosition;
    private int lastTotalDistance;
    private View leftView;
    private a listener;
    private boolean mCanScroll;
    private int refreshModel;
    private View rightView;
    private int stretchModel;
    private boolean stretchStatus;

    public static /* synthetic */ Object ipc$super(StretchViewPager stretchViewPager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public StretchViewPager(Context context) {
        this(context, null);
    }

    public StretchViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.refreshModel = 0;
        this.stretchModel = 17;
        this.directionModel = 0;
        this.lastPosition = 0;
        this.distanceX = 0;
        this.stretchStatus = false;
        this.isAnimRunning = false;
        this.anim = ValueAnimator.ofInt(0, 1);
        this.firstScrollX = 0;
        this.lastTotalDistance = 0;
        this.mCanScroll = true;
        this.anim.setInterpolator(new AccelerateDecelerateInterpolator());
        this.anim.setDuration(300L);
    }

    public void setRefreshView(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d38302e5", new Object[]{this, view, view2});
            return;
        }
        this.leftView = view;
        this.rightView = view2;
        if (view != null) {
            this.refreshModel |= 1;
        }
        if (view2 == null) {
            return;
        }
        this.refreshModel |= 16;
    }

    public int getRefreshModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec45bdfe", new Object[]{this})).intValue() : this.refreshModel;
    }

    public void setStretchModel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd72a76", new Object[]{this, new Integer(i)});
        } else {
            this.stretchModel = i;
        }
    }

    public int getStretchModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b08e7914", new Object[]{this})).intValue() : this.stretchModel;
    }

    public void setOnStretchListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09e7d83", new Object[]{this, aVar});
        } else {
            this.listener = aVar;
        }
    }

    public void setAnimInterpolator(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3365c44", new Object[]{this, interpolator});
        } else {
            this.anim.setInterpolator(interpolator);
        }
    }

    public void setAnimDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76e3375", new Object[]{this, new Integer(i)});
        } else {
            this.anim.setDuration(i);
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        View childAt = getChildAt(getChildCount() - 1);
        if (childAt != null && (childAt == this.leftView || childAt == this.rightView)) {
            ((ViewPager.LayoutParams) childAt.getLayoutParams()).isDecor = true;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        View childAt = getChildAt(getChildCount() - 1);
        if (childAt == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int expectScrollX = getExpectScrollX();
        View view = this.leftView;
        if (childAt == view) {
            view.layout(expectScrollX - measuredWidth, 0, expectScrollX, getMeasuredHeight());
            return;
        }
        View view2 = this.rightView;
        if (childAt != view2) {
            return;
        }
        int i5 = expectScrollX + measuredWidth;
        view2.layout(i5, 0, measuredWidth + i5, getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.isAnimRunning) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            Log("current start x=" + getScrollX());
            if (!this.isAnimRunning) {
                this.firstScrollX = getScrollX();
            }
            this.lastPosition = (int) motionEvent.getX();
            this.activePointerId = motionEvent.getPointerId(0);
        } else if (action == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.activePointerId);
            if (getAdapter() != null && -1 != findPointerIndex) {
                int x = (int) motionEvent.getX(findPointerIndex);
                this.distanceX = x - this.lastPosition;
                this.lastPosition = x;
                if (!this.stretchStatus) {
                    this.stretchStatus = getStretchEnable(this.distanceX);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mCanScroll && !this.isAnimRunning) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.mCanScroll || this.isAnimRunning) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.activePointerId);
                    if (getAdapter() != null && -1 != findPointerIndex) {
                        if (this.stretchStatus) {
                            scrollByMove(this.distanceX);
                        }
                    }
                    return true;
                } else if (action != 3) {
                    if (action == 5 && this.stretchStatus) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.lastPosition = (int) motionEvent.getX(actionIndex);
                        this.activePointerId = motionEvent.getPointerId(actionIndex);
                        return true;
                    }
                }
            } else if (!this.stretchStatus) {
                this.stretchStatus = getStretchEnable(this.distanceX);
            }
            if (this.stretchStatus && !this.isAnimRunning) {
                scrollEndMove();
                return true;
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void setScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e882cabe", new Object[]{this, new Boolean(z)});
        } else {
            this.mCanScroll = z;
        }
    }

    private boolean getStretchEnable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9523516e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        boolean z = (this.refreshModel & 1) > 0;
        boolean z2 = (this.refreshModel & 16) > 0;
        boolean z3 = (this.stretchModel & 1) > 0;
        boolean z4 = (this.stretchModel & 16) > 0;
        if ((z3 || z) && getCurrentItem() == 0 && i > 0) {
            this.directionModel = 1;
        } else if ((z4 || z2) && getAdapter().getCount() == getCurrentItem() + 1 && i < 0) {
            this.directionModel = 16;
        } else {
            this.directionModel = 0;
            return false;
        }
        return true;
    }

    private void scrollByMove(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6c87287", new Object[]{this, new Integer(i)});
        } else if ((this.directionModel & this.refreshModel) <= 0) {
        } else {
            addLeftRightEdge();
            scrollBy((int) ((-i) * (1.0d - (Math.abs((getScrollX() - this.firstScrollX) * 3.5d) / getWidth()))), 0);
            if (this.listener == null) {
                return;
            }
            getScrollDistance();
        }
    }

    private void addLeftRightEdge() {
        View view;
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c7c2698", new Object[]{this});
        } else if (this.directionModel == 1 && (view2 = this.leftView) != null && view2.getParent() == null) {
            addView(this.leftView);
        } else if (this.directionModel != 16 || (view = this.rightView) == null || view.getParent() != null) {
        } else {
            addView(this.rightView);
        }
    }

    private void scrollEndMove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a4cc0c6", new Object[]{this});
            return;
        }
        this.isAnimRunning = true;
        int scrollDistance = getScrollDistance();
        if (this.listener != null) {
            Math.abs(scrollDistance);
        }
        refreshDoneAnim();
    }

    private void refreshDoneAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec23235", new Object[]{this});
            return;
        }
        this.anim.addUpdateListener(this);
        this.anim.start();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            return;
        }
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int scrollDistance = (int) ((animatedFraction > 1.0f ? 1.0d : animatedFraction) * (getScrollDistance() + this.lastTotalDistance));
        int i = this.lastTotalDistance;
        int i2 = scrollDistance - i;
        this.lastTotalDistance = i + i2;
        scrollBy(i2, 0);
        if (1.0f > animatedFraction) {
            return;
        }
        this.anim.removeAllUpdateListeners();
        this.lastTotalDistance = 0;
        this.isAnimRunning = false;
        this.stretchStatus = false;
        removeView(this.leftView);
        removeView(this.rightView);
        Log("current end x=" + getScrollX());
    }

    private int getScrollDistance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b356df52", new Object[]{this})).intValue() : getExpectScrollX() - getScrollX();
    }

    private int getExpectScrollX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e6452b56", new Object[]{this})).intValue() : ((int) Math.round((this.firstScrollX * 1.0d) / getWidth())) * getWidth();
    }

    public static void Log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d3b2b5", new Object[]{str});
        } else if (!DEBUG) {
        } else {
            Log.e(TAG, str);
        }
    }
}
