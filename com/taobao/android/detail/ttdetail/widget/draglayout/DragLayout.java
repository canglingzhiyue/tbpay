package com.taobao.android.detail.ttdetail.widget.draglayout;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class DragLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isDragIntercept;
    private ViewDragHelper mDragHelper;
    private a mDragListener;
    private volatile boolean mIsLayoutRequested;
    private View mTargetView;
    private Rect mTargetViewCurrentPosition;

    static {
        kge.a(-703530249);
    }

    public static /* synthetic */ Object ipc$super(DragLayout dragLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -894236565:
                super.computeScroll();
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 1604649632:
                super.requestLayout();
                return null;
            case 2041279898:
                super.requestDisallowInterceptTouchEvent(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ View access$000(DragLayout dragLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c75a6a55", new Object[]{dragLayout}) : dragLayout.mTargetView;
    }

    public static /* synthetic */ Rect access$100(DragLayout dragLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("8b6d957b", new Object[]{dragLayout}) : dragLayout.mTargetViewCurrentPosition;
    }

    public static /* synthetic */ boolean access$200(DragLayout dragLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bcd2aa95", new Object[]{dragLayout})).booleanValue() : dragLayout.mIsLayoutRequested;
    }

    public static /* synthetic */ ViewDragHelper access$300(DragLayout dragLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewDragHelper) ipChange.ipc$dispatch("930414d4", new Object[]{dragLayout}) : dragLayout.mDragHelper;
    }

    public DragLayout(Context context) {
        super(context);
        this.mDragListener = new a(this);
        this.mDragHelper = ViewDragHelper.create(this, this.mDragListener);
        this.mTargetViewCurrentPosition = new Rect();
    }

    public DragLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDragListener = new a(this);
        this.mDragHelper = ViewDragHelper.create(this, this.mDragListener);
        this.mTargetViewCurrentPosition = new Rect();
    }

    public DragLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDragListener = new a(this);
        this.mDragHelper = ViewDragHelper.create(this, this.mDragListener);
        this.mTargetViewCurrentPosition = new Rect();
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        super.computeScroll();
        if (!this.mDragHelper.continueSettling(true)) {
            return;
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ab759a", new Object[]{this, new Boolean(z)});
        } else {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        this.isDragIntercept = this.mDragHelper.shouldInterceptTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent) | this.isDragIntercept;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.isDragIntercept) {
            this.mDragHelper.processTouchEvent(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setTargetView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb50b813", new Object[]{this, view});
        } else {
            this.mTargetView = view;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.mTargetView == null || this.mTargetViewCurrentPosition.isEmpty()) {
            return;
        }
        this.mTargetView.layout(this.mTargetViewCurrentPosition.left, this.mTargetViewCurrentPosition.top, this.mTargetViewCurrentPosition.right, this.mTargetViewCurrentPosition.bottom);
    }

    private boolean isOffsetting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a77759d6", new Object[]{this})).booleanValue();
        }
        ViewDragHelper viewDragHelper = this.mDragHelper;
        if (viewDragHelper == null) {
            return false;
        }
        return viewDragHelper.getViewDragState() == 1 || this.mDragHelper.getViewDragState() == 2;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
        } else if (isOffsetting()) {
            this.mIsLayoutRequested = true;
        } else {
            super.requestLayout();
            this.mIsLayoutRequested = false;
        }
    }

    /* loaded from: classes5.dex */
    public static class a extends ViewDragHelper.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private DragLayout f11023a;

        static {
            kge.a(88706938);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1276834111:
                    super.onViewDragStateChanged(((Number) objArr[0]).intValue());
                    return null;
                case -90054502:
                    super.onViewCaptured((View) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                case 852508362:
                    super.onViewReleased((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue());
                    return null;
                case 1539766340:
                    super.onViewPositionChanged((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                    return null;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dcd272d1", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue() : i;
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53c1297f", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue() : i;
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c2378c14", new Object[]{this, view})).intValue();
            }
            return 1;
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public int getViewVerticalDragRange(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("896fc226", new Object[]{this, view})).intValue();
            }
            return 1;
        }

        public a(DragLayout dragLayout) {
            this.f11023a = dragLayout;
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("567455cc", new Object[]{this, view, new Integer(i)})).booleanValue() : DragLayout.access$000(this.f11023a) == view;
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public void onViewCaptured(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faa1e09a", new Object[]{this, view, new Integer(i)});
            } else {
                super.onViewCaptured(view, i);
            }
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5bc6f844", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            super.onViewPositionChanged(view, i, i2, i3, i4);
            DragLayout.access$100(this.f11023a).left = view.getLeft();
            DragLayout.access$100(this.f11023a).top = view.getTop();
            DragLayout.access$100(this.f11023a).right = view.getRight();
            DragLayout.access$100(this.f11023a).bottom = view.getBottom();
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3e50ec1", new Object[]{this, new Integer(i)});
                return;
            }
            super.onViewDragStateChanged(i);
            if (i != 0 || !DragLayout.access$200(this.f11023a)) {
                return;
            }
            this.f11023a.requestLayout();
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            int paddingLeft;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32d03eca", new Object[]{this, view, new Float(f), new Float(f2)});
                return;
            }
            super.onViewReleased(view, f, f2);
            int top = view.getTop();
            if (((view.getLeft() + view.getRight()) >> 1) > this.f11023a.getWidth() / 2) {
                paddingLeft = (this.f11023a.getWidth() - this.f11023a.getPaddingRight()) - view.getWidth();
            } else {
                paddingLeft = this.f11023a.getPaddingLeft();
            }
            if (top < this.f11023a.getPaddingTop()) {
                top = this.f11023a.getPaddingTop();
            } else if (view.getBottom() > this.f11023a.getHeight() - this.f11023a.getPaddingBottom()) {
                top = (this.f11023a.getHeight() - this.f11023a.getPaddingBottom()) - view.getHeight();
            }
            DragLayout.access$300(this.f11023a).settleCapturedViewAt(paddingLeft, top);
            this.f11023a.invalidate();
        }
    }
}
