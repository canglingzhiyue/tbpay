package com.taobao.taolive.room.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.taobao.windvane.util.m;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class RightDrawerLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LOCK_MODE_LOCKED_CLOSED = 1;
    public static final int LOCK_MODE_LOCKED_OPEN = 2;
    public static final int LOCK_MODE_UNDEFINED = 3;
    public static final int LOCK_MODE_UNLOCKED = 0;
    private static final int MIN_DRAWER_MARGIN = 64;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final float TOUCH_SLOP_SENSITIVITY = 1.0f;
    private boolean hasScrollableView;
    private boolean isHorizontallyGesture;
    private boolean isOpened;
    private View mContentView;
    private int mDrawerState;
    private List<a> mListeners;
    private int mLockModeRight;
    private int mMinDrawerMargin;
    private final b mRightCallback;
    private final ViewDragHelper mRightDragger;
    private float mRightMenuOnScrreen;
    private View mRightMenuView;
    private float startX;
    private float touchStartX;
    private float touchStartY;

    /* loaded from: classes8.dex */
    public interface a {
        void a(View view);

        void b(View view);
    }

    static {
        kge.a(-752382420);
    }

    public static /* synthetic */ Object ipc$super(RightDrawerLayout rightDrawerLayout, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean access$100(RightDrawerLayout rightDrawerLayout, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4068f2fb", new Object[]{rightDrawerLayout, view})).booleanValue() : rightDrawerLayout.isDrawerView(view);
    }

    public static /* synthetic */ float access$200(RightDrawerLayout rightDrawerLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f5f4deec", new Object[]{rightDrawerLayout})).floatValue() : rightDrawerLayout.mRightMenuOnScrreen;
    }

    public static /* synthetic */ float access$202(RightDrawerLayout rightDrawerLayout, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb140df2", new Object[]{rightDrawerLayout, new Float(f)})).floatValue();
        }
        rightDrawerLayout.mRightMenuOnScrreen = f;
        return f;
    }

    public static /* synthetic */ View access$300(RightDrawerLayout rightDrawerLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f19e5aff", new Object[]{rightDrawerLayout}) : rightDrawerLayout.mRightMenuView;
    }

    public static /* synthetic */ void access$400(RightDrawerLayout rightDrawerLayout, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4f96eed", new Object[]{rightDrawerLayout, new Integer(i), view});
        } else {
            rightDrawerLayout.updateDrawerState(i, view);
        }
    }

    public RightDrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.hasScrollableView = false;
        this.isHorizontallyGesture = false;
        this.touchStartX = 0.0f;
        this.touchStartY = 0.0f;
        this.startX = 0.0f;
        this.mLockModeRight = 3;
        float f = getResources().getDisplayMetrics().density;
        this.mMinDrawerMargin = (int) ((f * 64.0f) + 0.5f);
        this.mRightCallback = new b();
        this.mRightDragger = ViewDragHelper.create(this, 1.0f, this.mRightCallback);
        this.mRightDragger.setEdgeTrackingEnabled(2);
        this.mRightDragger.setMinVelocity(400.0f * f);
        this.mRightCallback.a(this.mRightDragger);
        setDrawerRightEdgeSize(context, 1.0f);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        View childAt = getChildAt(1);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        childAt.measure(getChildMeasureSpec(i, this.mMinDrawerMargin + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width), getChildMeasureSpec(i2, marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        View childAt2 = getChildAt(0);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
        childAt2.measure(View.MeasureSpec.makeMeasureSpec((size - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - marginLayoutParams2.topMargin) - marginLayoutParams2.bottomMargin, 1073741824));
        this.mRightMenuView = childAt;
        this.mContentView = childAt2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        int i5 = 4;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        View view = this.mRightMenuView;
        View view2 = this.mContentView;
        int i6 = i3 - i;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
        view2.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.leftMargin + view2.getMeasuredWidth(), marginLayoutParams.topMargin + view2.getMeasuredHeight());
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        float f = measuredWidth;
        int i7 = i6 - ((int) (this.mRightMenuOnScrreen * f));
        view.layout(i7, marginLayoutParams2.topMargin, measuredWidth + i7, marginLayoutParams2.topMargin + view.getMeasuredHeight());
        float f2 = (i6 - i7) / f;
        if (f2 == this.mRightMenuOnScrreen) {
            z2 = false;
        }
        if (z2) {
            this.mRightMenuOnScrreen = f2;
        }
        if (this.mRightMenuOnScrreen > 0.0f) {
            i5 = 0;
        }
        if (view.getVisibility() == i5) {
            return;
        }
        view.setVisibility(i5);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View view;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.startX = motionEvent.getX();
            float y = motionEvent.getY();
            if (isDrawerVisible()) {
                int i = (int) y;
                checkForScrollableView(getRightMenuChildAt((int) this.startX, i), (int) this.startX, i);
                float f = this.startX;
                if (f >= 0.0f && (view = this.mContentView) != null && this.mRightMenuView != null && f < view.getMeasuredWidth() - this.mRightMenuView.getMeasuredWidth()) {
                    closeDrawer();
                    return true;
                }
            }
        } else if (actionMasked != 1) {
            if (actionMasked == 2 && this.hasScrollableView) {
                float x = motionEvent.getX();
                float f2 = x - this.startX;
                if (Math.abs(f2) > 5.0f) {
                    if (f2 > 0.0f) {
                        z = onInterceptSwipeRight();
                    } else {
                        z = onInterceptSwipeLeft();
                    }
                    this.startX = x;
                    return !z && this.mRightDragger.shouldInterceptTouchEvent(motionEvent);
                }
            }
        } else {
            this.hasScrollableView = false;
            this.startX = 0.0f;
        }
        z = true;
        if (!z) {
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.touchStartX = motionEvent.getX();
            this.touchStartY = motionEvent.getY();
            this.mRightDragger.processTouchEvent(motionEvent);
        } else if (actionMasked == 1) {
            this.mRightDragger.processTouchEvent(motionEvent);
            if (this.isOpened) {
                closeDrawer();
            }
            this.isHorizontallyGesture = false;
            this.touchStartX = 0.0f;
            this.touchStartY = 0.0f;
        } else if (actionMasked == 2) {
            if (!this.isOpened && !this.isHorizontallyGesture) {
                float abs = Math.abs(motionEvent.getX() - this.touchStartX);
                float abs2 = Math.abs(motionEvent.getY() - this.touchStartY);
                if (abs > 0.0f && abs >= abs2 * Math.sqrt(3.0d)) {
                    z = true;
                }
                this.isHorizontallyGesture = z;
                if (this.isHorizontallyGesture) {
                    this.mRightDragger.processTouchEvent(motionEvent);
                }
            } else {
                this.mRightDragger.processTouchEvent(motionEvent);
            }
        } else if (actionMasked == 3 && this.isOpened) {
            closeDrawer();
        }
        return true;
    }

    public void addDrawerListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1f3173", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            if (this.mListeners == null) {
                this.mListeners = new ArrayList();
            }
            this.mListeners.add(aVar);
        }
    }

    public void removeDrawerListener(a aVar) {
        List<a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e556316", new Object[]{this, aVar});
        } else if (aVar == null || (list = this.mListeners) == null) {
        } else {
            list.remove(aVar);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
        } else if (!this.mRightDragger.continueSettling(true)) {
        } else {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setDrawerLockMode(int i) {
        ViewDragHelper viewDragHelper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a5717b", new Object[]{this, new Integer(i)});
            return;
        }
        this.mLockModeRight = i;
        if (i != 0 && (viewDragHelper = this.mRightDragger) != null) {
            viewDragHelper.cancel();
        }
        if (i == 1) {
            closeDrawer();
        } else if (i != 2) {
        } else {
            openDrawer();
        }
    }

    public int getDrawerLockMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fd9d06f", new Object[]{this})).intValue();
        }
        int i = this.mLockModeRight;
        if (i == 3) {
            return 0;
        }
        return i;
    }

    public void closeDrawer() {
        ViewDragHelper viewDragHelper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("374b4110", new Object[]{this});
            return;
        }
        View view = this.mRightMenuView;
        if (view == null || (viewDragHelper = this.mRightDragger) == null) {
            return;
        }
        this.mRightMenuOnScrreen = 0.0f;
        boolean smoothSlideViewTo = viewDragHelper.smoothSlideViewTo(view, getWidth(), view.getTop()) | false;
        b bVar = this.mRightCallback;
        if (bVar != null) {
            bVar.a();
        }
        if (!smoothSlideViewTo) {
            return;
        }
        invalidate();
    }

    public void openDrawer() {
        ViewDragHelper viewDragHelper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe0cae2", new Object[]{this});
            return;
        }
        View view = this.mRightMenuView;
        if (view == null || (viewDragHelper = this.mRightDragger) == null) {
            return;
        }
        this.mRightMenuOnScrreen = 1.0f;
        viewDragHelper.smoothSlideViewTo(view, getWidth() - view.getWidth(), view.getTop());
        invalidate();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("6dca2b10", new Object[]{this}) : new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("84bf71af", new Object[]{this, attributeSet}) : new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("ce603fbe", new Object[]{this, layoutParams}) : new ViewGroup.MarginLayoutParams(layoutParams);
    }

    /* loaded from: classes8.dex */
    public class b extends ViewDragHelper.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ViewDragHelper b;
        private final Runnable c;

        static {
            kge.a(863930486);
        }

        private b() {
            this.c = new Runnable() { // from class: com.taobao.taolive.room.widget.RightDrawerLayout.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    }
                }
            };
        }

        public void a(ViewDragHelper viewDragHelper) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5495d6", new Object[]{this, viewDragHelper});
            } else {
                this.b = viewDragHelper;
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                RightDrawerLayout.this.removeCallbacks(this.c);
            }
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("567455cc", new Object[]{this, view, new Integer(i)})).booleanValue() : RightDrawerLayout.access$100(RightDrawerLayout.this, view) && RightDrawerLayout.this.getDrawerLockMode() == 0;
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            int i5 = 4;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5bc6f844", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            float width = (RightDrawerLayout.this.getWidth() - i) / view.getWidth();
            RightDrawerLayout.access$202(RightDrawerLayout.this, width);
            if (width != 0.0f) {
                i5 = 0;
            }
            view.setVisibility(i5);
            RightDrawerLayout.this.invalidate();
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32d03eca", new Object[]{this, view, new Float(f), new Float(f2)});
                return;
            }
            int width = view.getWidth();
            int width2 = RightDrawerLayout.this.getWidth();
            if (f < 0.0f || (f == 0.0f && RightDrawerLayout.access$200(RightDrawerLayout.this) > 0.5f)) {
                width2 -= width;
            }
            this.b.settleCapturedViewAt(width2, view.getTop());
            RightDrawerLayout.this.invalidate();
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ceb6938", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (RightDrawerLayout.access$300(RightDrawerLayout.this) == null || RightDrawerLayout.this.getDrawerLockMode() != 0) {
            } else {
                this.b.captureChildView(RightDrawerLayout.access$300(RightDrawerLayout.this), i2);
            }
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c2378c14", new Object[]{this, view})).intValue();
            }
            if (!RightDrawerLayout.access$100(RightDrawerLayout.this, view)) {
                return 0;
            }
            return view.getWidth();
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dcd272d1", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
            }
            int width = RightDrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3e50ec1", new Object[]{this, new Integer(i)});
            } else {
                RightDrawerLayout.access$400(RightDrawerLayout.this, i, this.b.getCapturedView());
            }
        }
    }

    private void checkForScrollableView(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a1053e", new Object[]{this, view, new Integer(i), new Integer(i2)});
        } else if (view != null && view.getVisibility() == 0 && i >= view.getLeft() && i <= view.getRight() && i2 >= view.getTop() && i2 <= view.getBottom()) {
            if (viewCanScrollAndSetTag(view)) {
                this.hasScrollableView = true;
            }
            if (!(view instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                checkForScrollableView(viewGroup.getChildAt(i3), i - view.getLeft(), i2 - view.getTop());
            }
        }
    }

    private View getRightMenuChildAt(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1f8c3173", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        View view = this.mRightMenuView;
        if (view instanceof ViewGroup) {
            return ((ViewGroup) this.mRightMenuView).getChildAt(findChildIndexByPosition((ViewGroup) view, i, i2));
        }
        return null;
    }

    private int findChildIndexByPosition(ViewGroup viewGroup, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c53da08", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)})).intValue();
        }
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (i >= childAt.getLeft() && i <= childAt.getRight() && i2 >= childAt.getTop() && i2 <= childAt.getBottom()) {
                return i3;
            }
        }
        return -1;
    }

    private boolean viewCanScrollAndSetTag(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11527938", new Object[]{this, view})).booleanValue();
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        setViewTag(viewGroup);
        return viewGroup.canScrollHorizontally(-1) || viewGroup.canScrollHorizontally(1);
    }

    private void setViewTag(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69218939", new Object[]{this, viewGroup});
            return;
        }
        if (viewGroup.canScrollHorizontally(1)) {
            viewGroup.setTag("canScrollHorizontallyRight");
        }
        if (!viewGroup.canScrollHorizontally(-1)) {
            return;
        }
        viewGroup.setTag("canScrollHorizontallyLeft");
    }

    private boolean onInterceptSwipeLeft() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2a4ae589", new Object[]{this})).booleanValue() : this.mRightMenuView.findViewWithTag("canScrollHorizontallyRight") == null;
    }

    private boolean onInterceptSwipeRight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c7a4b10", new Object[]{this})).booleanValue() : this.mRightMenuView.findViewWithTag("canScrollHorizontallyLeft") == null;
    }

    private boolean isDrawerView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e4997cef", new Object[]{this, view})).booleanValue() : view == this.mRightMenuView;
    }

    private void setDrawerRightEdgeSize(Context context, float f) {
        if (!(context instanceof Activity)) {
            return;
        }
        try {
            Field declaredField = this.mRightDragger.getClass().getDeclaredField("mEdgeSize");
            declaredField.setAccessible(true);
            int i = declaredField.getInt(this.mRightDragger);
            Point point = new Point();
            ((Activity) context).getWindowManager().getDefaultDisplay().getSize(point);
            declaredField.setInt(this.mRightDragger, Math.max(i, (int) (point.x * f)));
        } catch (Throwable th) {
            m.b("RightDrawerLayout", "setDrawerRightEdgeSize", th, new Object[0]);
        }
    }

    private boolean isDrawerVisible() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("84a73642", new Object[]{this})).booleanValue() : this.mRightMenuOnScrreen > 0.0f;
    }

    private void updateDrawerState(int i, View view) {
        IpChange ipChange = $ipChange;
        int i2 = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d33b608d", new Object[]{this, new Integer(i), view});
            return;
        }
        int viewDragState = this.mRightDragger.getViewDragState();
        if (viewDragState == 1) {
            this.isOpened = false;
            i2 = 1;
        } else if (viewDragState != 2) {
            i2 = 0;
        }
        if (view != null && i == 0) {
            float f = this.mRightMenuOnScrreen;
            if (f == 0.0f) {
                dispatchOnDrawerClosed(view);
            } else if (f == 1.0f) {
                dispatchOnDrawerOpened(view);
            }
        }
        if (i2 == this.mDrawerState) {
            return;
        }
        this.mDrawerState = i2;
        List<a> list = this.mListeners;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            this.mListeners.get(size);
        }
    }

    private void dispatchOnDrawerClosed(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("782773d5", new Object[]{this, view});
        } else if (this.isOpened) {
            this.isOpened = false;
            List<a> list = this.mListeners;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mListeners.get(size).b(view);
            }
        }
    }

    private void dispatchOnDrawerOpened(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c10038", new Object[]{this, view});
        } else if (!this.isOpened) {
            this.isOpened = true;
            List<a> list = this.mListeners;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mListeners.get(size).a(view);
            }
        }
    }
}
