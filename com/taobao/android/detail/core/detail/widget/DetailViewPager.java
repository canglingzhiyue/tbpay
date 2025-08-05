package com.taobao.android.detail.core.detail.widget;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class DetailViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EDGE_TYPE_BOTH = 2;
    public static final int EDGE_TYPE_END = 1;
    public static final int EDGE_TYPE_NOT_EDGE = 3;
    public static final int EDGE_TYPE_START = 0;
    private static final String TAG = "DetailViewPager";
    private boolean disableHorizontalScroll;
    private a mEdgePageListener;

    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(int i, MotionEvent motionEvent);

        boolean b(int i, MotionEvent motionEvent);
    }

    static {
        kge.a(931906299);
    }

    public static /* synthetic */ Object ipc$super(DetailViewPager detailViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode != -407533570) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public DetailViewPager(Context context) {
        super(context);
        this.disableHorizontalScroll = false;
        emu.a("com.taobao.android.detail.core.detail.widget.DetailViewPager");
    }

    public DetailViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.disableHorizontalScroll = false;
        emu.a("com.taobao.android.detail.core.detail.widget.DetailViewPager");
    }

    public void setDisableHorizontalScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c08c536", new Object[]{this, new Boolean(z)});
        } else {
            this.disableHorizontalScroll = z;
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            if (!this.disableHorizontalScroll) {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            i.a(TAG, "onInterceptTouchEvent", e);
            return false;
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mEdgePageListener == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.mEdgePageListener.a();
        }
        if (!isReachingEdge()) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.mEdgePageListener.b(getEdgeType(), motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        this.mEdgePageListener.a(getEdgeType(), motionEvent);
        return true;
    }

    private boolean isReachingEdge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("923b53c1", new Object[]{this})).booleanValue();
        }
        PagerAdapter adapter = getAdapter();
        if (adapter != null && adapter.getCount() != 0) {
            int currentItem = getCurrentItem();
            int count = adapter.getCount();
            if ((currentItem == 0 || currentItem == count - 1) && getScrollX() == currentItem * getWidth()) {
                return true;
            }
        }
        return false;
    }

    private int getEdgeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37633e07", new Object[]{this})).intValue();
        }
        PagerAdapter adapter = getAdapter();
        if (adapter == null) {
            return 3;
        }
        if (adapter.getCount() == 1) {
            return 2;
        }
        int currentItem = getCurrentItem();
        if (currentItem == 0) {
            return 0;
        }
        return currentItem == adapter.getCount() - 1 ? 1 : 3;
    }

    public void setEdgePageListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60105980", new Object[]{this, aVar});
        } else {
            this.mEdgePageListener = aVar;
        }
    }
}
