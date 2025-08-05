package com.taobao.tao.flexbox.layoutmanager.view.edgepan;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;

/* loaded from: classes8.dex */
public class EdgePanViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CHILD_CAN_SCROLL = 1;
    public static final int EDGE_PAN_LEFT = 1;
    public static final int EDGE_PAN_RIGHT = 16;
    public static final int SCROLL_STATE_ALLOW = 1;
    public static final int SCROLL_STATE_FORBIDDEN = -1;
    public static final int SCROLL_STATE_UNKNOWN = 0;
    private static final int SELF_CAN_NOT_SCROLL = -1;
    private static final int SELF_CAN_SCROLL = 0;
    private static final String TAG = "ViewPager";
    private int edgePan;
    private boolean enablePullIntercept;
    private boolean enableSwipe;
    private int motionEventAction;

    static {
        kge.a(1681730158);
    }

    public static /* synthetic */ Object ipc$super(EdgePanViewPager edgePanViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -407533570) {
            if (hashCode == 222452193) {
                return new Boolean(super.canScroll((View) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue()));
            }
            if (hashCode != 650865254) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
    }

    public boolean pullIntercept(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a1b4452", new Object[]{this, view})).booleanValue();
        }
        return false;
    }

    public EdgePanViewPager(Context context) {
        super(context);
        this.edgePan = 0;
        this.enableSwipe = true;
        this.enablePullIntercept = false;
        this.motionEventAction = -1;
    }

    public EdgePanViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.edgePan = 0;
        this.enableSwipe = true;
        this.enablePullIntercept = false;
        this.motionEventAction = -1;
    }

    public void setEdgePan(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21efb3e", new Object[]{this, new Integer(i)});
        } else {
            this.edgePan = i;
        }
    }

    public int getEdgePan() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dbbc90e4", new Object[]{this})).intValue() : this.edgePan;
    }

    public void setEnableSwipe(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b12a98", new Object[]{this, new Boolean(z)});
            return;
        }
        this.enableSwipe = z;
        ogg.c(TAG, "setEnableSwipe: " + z);
    }

    public boolean isEnableSwipe() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cc85f8", new Object[]{this})).booleanValue() : this.enableSwipe;
    }

    public void setEnablePullIntercept(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6166b5", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z && !oeb.a("forcePullIntercept", false)) {
            z2 = false;
        }
        this.enablePullIntercept = z2;
        ogg.c(TAG, "setEnablePullIntercept: " + this.enablePullIntercept);
    }

    @Override // android.support.v4.view.ViewPager
    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4259e1", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        Object tag = view.getTag(R.id.layout_manager_vp_canscroll_tag);
        if (tag != null) {
            return oec.a(tag, false);
        }
        int canEdgePanScroll = canEdgePanScroll(view, z, i, i2, i3);
        if (canEdgePanScroll == 1) {
            return true;
        }
        if (canEdgePanScroll != -1) {
            return super.canScroll(view, z, i, i2, i3);
        }
        return false;
    }

    private int checkNonSwipePageScrollStatus(View view, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92834fca", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount() - 1;
            while (childCount >= 0) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i2 + scrollX;
                if (i6 < childAt.getLeft() || i6 >= childAt.getRight() || (i5 = i3 + scrollY) < childAt.getTop() || i5 >= childAt.getBottom()) {
                    i4 = childCount;
                } else {
                    i4 = childCount;
                    if (super.canScroll(childAt, true, i, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                        return 1;
                    }
                }
                childCount = i4 - 1;
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            z2 = false;
        }
        return z2 ? 0 : -1;
    }

    private int canEdgePanScroll(View view, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37f091f0", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (view instanceof EdgePanViewPager) {
            EdgePanViewPager edgePanViewPager = (EdgePanViewPager) view;
            if (!edgePanViewPager.isEnableSwipe()) {
                return checkNonSwipePageScrollStatus(view, z, i, i2, i3) == 1 ? 0 : -1;
            }
            ViewPager viewPager = (ViewPager) view;
            int currentItem = viewPager.getCurrentItem();
            int count = viewPager.getAdapter().getCount();
            if (count > 1) {
                int edgePan = edgePanViewPager.getEdgePan();
                if ((edgePan & 1) == 0 && currentItem == 0 && i > 0) {
                    return 1;
                }
                if ((edgePan & 16) == 0 && currentItem == count - 1 && i < 0) {
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            super.onMeasure(i, i2);
        } catch (Exception e) {
            ogg.b("ViewPager onMeasure error: " + e.getMessage());
        }
    }

    public int getCurrentMotionEventAction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9b3ff1d1", new Object[]{this})).intValue() : this.motionEventAction;
    }

    public boolean isTouchOnView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0fa71c4", new Object[]{this})).booleanValue();
        }
        int i = this.motionEventAction;
        return i == 0 || i == 2;
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            int action = motionEvent.getAction();
            this.motionEventAction = action;
            if ((action == 0 || action == 2) && this.enablePullIntercept && pullIntercept(this)) {
                return false;
            }
            if (isEnableSwipe()) {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e) {
            ogg.b(e.getMessage());
            return false;
        }
    }
}
