package com.taobao.android.detail.ttdetail.widget.draglayout;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.draglayout.c;
import tb.kge;
import tb.mto;

/* loaded from: classes5.dex */
public class DragDismissLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_ANIMATED = 2;
    public static final int STATE_ANIMATING = 1;
    public static final int STATE_DISMISSED = 7;
    public static final int STATE_DISMISSING = 6;
    public static final int STATE_DRAGGING = 3;
    public static final int STATE_NONE = 0;
    public static final int STATE_RESTORED = 5;
    public static final int STATE_RESTORING = 4;
    private boolean isDragIntercept;
    private b mDragCallback;
    private c mDragHelper;
    private volatile boolean mForceLayoutInitRect;
    private Handler mHandler;
    private Rect mInitRect;
    private Rect mInitScreenRect;
    private volatile boolean mIsLayoutRequested;
    private int mMinFlingVelocity;
    private int[] mOutLocation;
    private volatile boolean mPendingEnterAnimation;
    private a mPullListener;
    private int mState;
    private View mTargetView;

    /* loaded from: classes5.dex */
    public interface a {
        void a(double d);

        void a(DragDismissLayout dragDismissLayout, View view);

        void a(DragDismissLayout dragDismissLayout, View view, double d);

        void a(DragDismissLayout dragDismissLayout, View view, boolean z, double d);

        void b(double d);

        void b(DragDismissLayout dragDismissLayout, View view, double d);

        void c(double d);

        void c(DragDismissLayout dragDismissLayout, View view, double d);

        void d(double d);

        void d(DragDismissLayout dragDismissLayout, View view, double d);
    }

    static {
        kge.a(-1423959577);
    }

    public static /* synthetic */ Object ipc$super(DragDismissLayout dragDismissLayout, String str, Object... objArr) {
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

    public static /* synthetic */ a access$1000(DragDismissLayout dragDismissLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("a5f54153", new Object[]{dragDismissLayout}) : dragDismissLayout.mPullListener;
    }

    public static /* synthetic */ boolean access$1100(DragDismissLayout dragDismissLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9114153", new Object[]{dragDismissLayout})).booleanValue() : dragDismissLayout.mIsLayoutRequested;
    }

    public static /* synthetic */ Handler access$1300(DragDismissLayout dragDismissLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("18e08d55", new Object[]{dragDismissLayout}) : dragDismissLayout.mHandler;
    }

    public static /* synthetic */ int access$1400(DragDismissLayout dragDismissLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("be8be805", new Object[]{dragDismissLayout})).intValue() : dragDismissLayout.mMinFlingVelocity;
    }

    public static /* synthetic */ Rect access$1500(DragDismissLayout dragDismissLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("e9b4cb5c", new Object[]{dragDismissLayout}) : dragDismissLayout.mInitRect;
    }

    public static /* synthetic */ void access$1600(Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("886b0f0c", new Object[]{rect, rect2});
        } else {
            copyFromSource(rect, rect2);
        }
    }

    public static /* synthetic */ int access$600(DragDismissLayout dragDismissLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a7be5658", new Object[]{dragDismissLayout})).intValue() : dragDismissLayout.mState;
    }

    public static /* synthetic */ int access$602(DragDismissLayout dragDismissLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("820f8c6f", new Object[]{dragDismissLayout, new Integer(i)})).intValue();
        }
        dragDismissLayout.mState = i;
        return i;
    }

    public static /* synthetic */ Rect access$700(DragDismissLayout dragDismissLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("5f55696f", new Object[]{dragDismissLayout}) : dragDismissLayout.mInitScreenRect;
    }

    public static /* synthetic */ c access$800(DragDismissLayout dragDismissLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("b3216714", new Object[]{dragDismissLayout}) : dragDismissLayout.mDragHelper;
    }

    public static /* synthetic */ View access$900(DragDismissLayout dragDismissLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("cf19b6a", new Object[]{dragDismissLayout}) : dragDismissLayout.mTargetView;
    }

    public DragDismissLayout(Context context) {
        super(context);
        this.mState = 0;
        this.mInitRect = new Rect();
        this.mInitScreenRect = new Rect();
        this.mDragCallback = new b(this);
        this.mDragHelper = c.a(this, this.mDragCallback);
        this.mOutLocation = new int[2];
        this.mHandler = new Handler(Looper.getMainLooper());
        init(context);
    }

    public DragDismissLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mState = 0;
        this.mInitRect = new Rect();
        this.mInitScreenRect = new Rect();
        this.mDragCallback = new b(this);
        this.mDragHelper = c.a(this, this.mDragCallback);
        this.mOutLocation = new int[2];
        this.mHandler = new Handler(Looper.getMainLooper());
        init(context);
    }

    public DragDismissLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mState = 0;
        this.mInitRect = new Rect();
        this.mInitScreenRect = new Rect();
        this.mDragCallback = new b(this);
        this.mDragHelper = c.a(this, this.mDragCallback);
        this.mOutLocation = new int[2];
        this.mHandler = new Handler(Looper.getMainLooper());
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            this.mMinFlingVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        super.computeScroll();
        if (!this.mDragHelper.a(true)) {
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
        int i = this.mState;
        if (i == 1 || i == 4 || i == 6) {
            this.isDragIntercept = false;
            return false;
        }
        this.isDragIntercept = this.mDragHelper.a(motionEvent);
        return super.onInterceptTouchEvent(motionEvent) | this.isDragIntercept;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.isDragIntercept) {
            this.mDragHelper.b(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPullListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("717f3aad", new Object[]{this, aVar});
        } else {
            this.mPullListener = aVar;
        }
    }

    public void setTargetView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb50b813", new Object[]{this, view});
        } else {
            this.mTargetView = view;
        }
    }

    public void startEnterAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1763215", new Object[]{this});
        } else if (this.mTargetView == null || this.mInitScreenRect.isEmpty() || this.mState != 0) {
        } else {
            if (this.mInitRect.isEmpty()) {
                this.mPendingEnterAnimation = true;
            } else {
                internalRunEnterAnimation();
            }
        }
    }

    private void internalRunEnterAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f96141", new Object[]{this});
            return;
        }
        this.mPendingEnterAnimation = false;
        this.mState = 1;
        this.mTargetView.measure(View.MeasureSpec.makeMeasureSpec(this.mInitRect.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.mInitRect.height(), 1073741824));
        this.mTargetView.layout(this.mInitRect.left, this.mInitRect.top, this.mInitRect.right, this.mInitRect.bottom);
        this.mDragHelper.b();
        this.mDragHelper.a(this.mTargetView, b.a(this.mDragCallback).centerX(), b.a(this.mDragCallback).centerY());
        invalidate();
        a aVar = this.mPullListener;
        if (aVar == null) {
            return;
        }
        aVar.a(this, this.mTargetView);
    }

    public boolean startExitAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5f3814f", new Object[]{this})).booleanValue();
        }
        this.mState = 6;
        this.mDragHelper.b();
        boolean a2 = this.mDragHelper.a(this.mTargetView, b.b(this.mDragCallback).centerX(), b.b(this.mDragCallback).centerY());
        invalidate();
        return a2;
    }

    private void updateStartAndFinalPositionInfo(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3399145c", new Object[]{this, view});
            return;
        }
        getLocationOnScreen(this.mOutLocation);
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        b.a(this.mDragCallback).top = top;
        b.a(this.mDragCallback).left = left;
        b.a(this.mDragCallback).right = right;
        b.a(this.mDragCallback).bottom = bottom;
        int i = this.mInitScreenRect.left - this.mOutLocation[0];
        int i2 = this.mInitScreenRect.top - this.mOutLocation[1];
        int i3 = this.mInitScreenRect.right - this.mOutLocation[0];
        int i4 = this.mInitScreenRect.bottom - this.mOutLocation[1];
        Rect rect = this.mInitRect;
        rect.left = i;
        rect.top = i2;
        rect.right = i3;
        rect.bottom = i4;
        copyFromSource(b.b(this.mDragCallback), this.mInitRect);
        b bVar = this.mDragCallback;
        b.a(bVar, b.c(bVar));
        b.b(this.mDragCallback, (double) mto.a.GEO_NOT_SUPPORT);
    }

    public void setTargetViewInitScreenLocation(Rect rect) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9b15329", new Object[]{this, rect});
            return;
        }
        this.mInitRect.setEmpty();
        this.mInitScreenRect.setEmpty();
        if (rect == null || rect.isEmpty()) {
            return;
        }
        copyFromSource(this.mInitScreenRect, rect);
        if (ViewCompat.isLaidOut(this) && (view = this.mTargetView) != null && view.getParent() == this) {
            updateStartAndFinalPositionInfo(this.mTargetView);
            return;
        }
        this.mForceLayoutInitRect = true;
        requestLayout();
    }

    private static void copyFromSource(Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61733361", new Object[]{rect, rect2});
        } else {
            copyFromSource(rect, rect2, 0, 0);
        }
    }

    private static void copyFromSource(Rect rect, Rect rect2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1823f81", new Object[]{rect, rect2, new Integer(i), new Integer(i2)});
            return;
        }
        rect.left = rect2.left - i;
        rect.top = rect2.top - i2;
        rect.right = rect2.right - i;
        rect.bottom = rect2.bottom - i2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if ((z || this.mForceLayoutInitRect) && (view = this.mTargetView) != null && view.getParent() == this && !this.mInitScreenRect.isEmpty() && this.mState == 0) {
            this.mForceLayoutInitRect = false;
            updateStartAndFinalPositionInfo(this.mTargetView);
        }
        if (!this.mPendingEnterAnimation) {
            return;
        }
        internalRunEnterAnimation();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
            return;
        }
        int i = this.mState;
        if (i == 1 || i == 3 || i == 4 || i == 6) {
            this.mIsLayoutRequested = true;
            return;
        }
        super.requestLayout();
        this.mIsLayoutRequested = false;
    }

    /* loaded from: classes5.dex */
    public class b extends c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private DragDismissLayout b;
        private double c;
        private double d;
        private Rect e;
        private Rect f;

        static {
            kge.a(383617563);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -2103508886:
                    super.a((View) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue());
                    return null;
                case -1888794150:
                    super.b((View) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                case -1474194533:
                    super.a(((Number) objArr[0]).intValue());
                    return null;
                case -1445565395:
                    return new Integer(super.b(((Number) objArr[0]).intValue()));
                case 1545840874:
                    super.a((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue());
                    return null;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.c.a
        public int a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9501e35d", new Object[]{this, view})).intValue();
            }
            return 1;
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.c.a
        public int a(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c25113d", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue() : i;
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.c.a
        public int b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9103723c", new Object[]{this, view})).intValue();
            }
            return 1;
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.c.a
        public int b(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dfe645c", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue() : i;
        }

        public static /* synthetic */ double a(b bVar, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d5acad1a", new Object[]{bVar, new Double(d)})).doubleValue();
            }
            bVar.c = d;
            return d;
        }

        public static /* synthetic */ Rect a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("638d851b", new Object[]{bVar}) : bVar.e;
        }

        public static /* synthetic */ double b(b bVar, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b3a012f9", new Object[]{bVar, new Double(d)})).doubleValue();
            }
            bVar.d = d;
            return d;
        }

        public static /* synthetic */ Rect b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("bc98d09c", new Object[]{bVar}) : bVar.f;
        }

        public static /* synthetic */ double c(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("809121c2", new Object[]{bVar})).doubleValue() : bVar.a();
        }

        public static /* synthetic */ DragDismissLayout d(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DragDismissLayout) ipChange.ipc$dispatch("7ff264c9", new Object[]{bVar}) : bVar.b;
        }

        public static /* synthetic */ double e(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ee2e644", new Object[]{bVar})).doubleValue() : bVar.d;
        }

        private b(DragDismissLayout dragDismissLayout) {
            this.e = new Rect();
            this.f = new Rect();
            this.b = dragDismissLayout;
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.c.a
        public boolean a(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b3afcdd", new Object[]{this, view, new Integer(i)})).booleanValue();
            }
            if (DragDismissLayout.access$600(this.b) != 0 || DragDismissLayout.access$700(this.b).isEmpty()) {
                return DragDismissLayout.access$800(DragDismissLayout.this).c() == -1 && DragDismissLayout.access$900(this.b) == view;
            }
            this.b.startEnterAnimation();
            return false;
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.c.a
        public void b(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f6b49da", new Object[]{this, view, new Integer(i)});
                return;
            }
            super.b(view, i);
            this.e.left = view.getLeft();
            this.e.top = view.getTop();
            this.e.right = view.getRight();
            this.e.bottom = view.getBottom();
            this.f.left = this.e.left + this.b.getWidth();
            this.f.top = this.e.top + this.b.getHeight();
            Rect rect = this.f;
            rect.right = rect.left + ((int) (this.e.width() * 0.1666d));
            Rect rect2 = this.f;
            rect2.bottom = rect2.top + ((int) (this.e.height() * 0.1666d));
            this.c = a();
            this.d = mto.a.GEO_NOT_SUPPORT;
            DragDismissLayout.access$602(this.b, 3);
            if (DragDismissLayout.access$1000(this.b) == null) {
                return;
            }
            DragDismissLayout.access$1000(this.b);
            DragDismissLayout.access$900(this.b);
        }

        private double a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c56", new Object[]{this})).doubleValue() : Math.sqrt(Math.pow(this.f.centerX() - this.e.centerX(), 2.0d) + Math.pow(this.f.centerY() - this.e.centerY(), 2.0d));
        }

        private double c(View view) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8d050116", new Object[]{this, view})).doubleValue() : Math.sqrt(Math.pow(((view.getLeft() + view.getRight()) >> 1) - this.e.centerX(), 2.0d) + Math.pow(((view.getTop() + view.getBottom()) >> 1) - this.e.centerY(), 2.0d));
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.c.a
        public void a(View view, boolean z, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            boolean z2 = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("829f006a", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            super.a(view, z, i, i2, i3, i4);
            this.d = c(view) / this.c;
            if (Math.abs(this.f.width() - this.e.width()) > 1 || Math.abs(this.f.height() - this.e.height()) > 1) {
                z2 = true;
            }
            if (z2) {
                double width = (this.f.width() - this.e.width()) * this.d;
                double height = (this.f.height() - this.e.height()) * this.d;
                int width2 = (int) (this.e.width() + width);
                int height2 = (int) (this.e.height() + height);
                int left = (view.getLeft() + view.getRight()) >> 1;
                int top = (view.getTop() + view.getBottom()) >> 1;
                int i5 = width2 / 2;
                int i6 = height2 / 2;
                view.measure(View.MeasureSpec.makeMeasureSpec(width2, 1073741824), View.MeasureSpec.makeMeasureSpec(height2, 1073741824));
                view.layout(left - i5, top - i6, left + i5, top + i6);
                ViewCompat.postInvalidateOnAnimation(this.b);
            }
            int access$600 = DragDismissLayout.access$600(this.b);
            if (access$600 == 1) {
                if (DragDismissLayout.access$1000(this.b) == null) {
                    return;
                }
                DragDismissLayout.access$1000(this.b).a(this.d);
            } else if (access$600 == 6) {
                if (DragDismissLayout.access$1000(this.b) == null) {
                    return;
                }
                DragDismissLayout.access$1000(this.b).d(this.d);
            } else if (access$600 == 3) {
                if (DragDismissLayout.access$1000(this.b) == null) {
                    return;
                }
                DragDismissLayout.access$1000(this.b).b(this.d);
            } else if (access$600 != 4 || DragDismissLayout.access$1000(this.b) == null) {
            } else {
                DragDismissLayout.access$1000(this.b).c(this.d);
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.c.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            super.a(i);
            if (i != 0) {
                return;
            }
            int access$600 = DragDismissLayout.access$600(this.b);
            if (access$600 == 1) {
                DragDismissLayout.access$602(this.b, 2);
                if (DragDismissLayout.access$1000(this.b) != null) {
                    a access$1000 = DragDismissLayout.access$1000(this.b);
                    DragDismissLayout dragDismissLayout = this.b;
                    access$1000.a(dragDismissLayout, DragDismissLayout.access$900(dragDismissLayout), this.d);
                }
                if (!DragDismissLayout.access$1100(this.b)) {
                    return;
                }
                this.b.requestLayout();
            } else if (access$600 != 4) {
                if (access$600 != 6) {
                    return;
                }
                if (DragDismissLayout.access$1000(this.b) != null) {
                    a access$10002 = DragDismissLayout.access$1000(this.b);
                    DragDismissLayout dragDismissLayout2 = this.b;
                    access$10002.c(dragDismissLayout2, DragDismissLayout.access$900(dragDismissLayout2), this.d);
                }
                DragDismissLayout.access$1300(this.b).post(new Runnable() { // from class: com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        DragDismissLayout.access$602(b.d(b.this), 7);
                        if (DragDismissLayout.access$1000(b.d(b.this)) != null) {
                            DragDismissLayout.access$1000(b.d(b.this)).d(b.d(b.this), DragDismissLayout.access$900(b.d(b.this)), b.e(b.this));
                        }
                        if (!DragDismissLayout.access$1100(b.d(b.this))) {
                            return;
                        }
                        b.d(b.this).requestLayout();
                    }
                });
            } else {
                DragDismissLayout.access$602(this.b, 5);
                if (DragDismissLayout.access$1000(this.b) != null) {
                    a access$10003 = DragDismissLayout.access$1000(this.b);
                    DragDismissLayout dragDismissLayout3 = this.b;
                    access$10003.b(dragDismissLayout3, DragDismissLayout.access$900(dragDismissLayout3), this.d);
                }
                if (!DragDismissLayout.access$1100(this.b)) {
                    return;
                }
                this.b.requestLayout();
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.c.a
        public void a(View view, float f, float f2) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c23a8ea", new Object[]{this, view, new Float(f), new Float(f2)});
                return;
            }
            super.a(view, f, f2);
            int left = view.getLeft();
            int top = view.getTop();
            int right = view.getRight();
            int bottom = view.getBottom();
            if (f > DragDismissLayout.access$1400(this.b) || f2 > DragDismissLayout.access$1400(this.b) || this.d > 0.3499999940395355d) {
                z = true;
            }
            if (DragDismissLayout.access$1000(this.b) != null) {
                a access$1000 = DragDismissLayout.access$1000(this.b);
                DragDismissLayout dragDismissLayout = this.b;
                access$1000.a(dragDismissLayout, DragDismissLayout.access$900(dragDismissLayout), !z, this.d);
            }
            if ((!DragDismissLayout.access$1500(this.b).isEmpty()) & z) {
                DragDismissLayout.access$1600(this.f, DragDismissLayout.access$1500(this.b));
                Rect rect = this.e;
                rect.left = left;
                rect.top = top;
                rect.right = right;
                rect.bottom = bottom;
                DragDismissLayout.access$602(this.b, 6);
                this.c = a();
                DragDismissLayout.access$800(this.b).a(this.f.centerX(), this.f.centerY());
            } else {
                double centerX = (((left + right) >> 1) - (this.e.centerX() / this.d)) * this.c;
                double centerY = (((top + bottom) >> 1) - (this.e.centerY() / this.d)) * this.c;
                double width = this.f.width() / 2.0f;
                double height = this.f.height() / 2.0f;
                Rect rect2 = this.f;
                rect2.left = (int) (centerX - width);
                rect2.top = (int) (centerY - height);
                rect2.right = (int) (centerX + width);
                rect2.bottom = (int) (centerY + height);
                DragDismissLayout.access$602(this.b, 4);
                DragDismissLayout.access$800(this.b).a(this.e.centerX(), this.e.centerY());
            }
            this.b.invalidate();
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.c.a
        public int b(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue() : super.b(i);
        }
    }
}
