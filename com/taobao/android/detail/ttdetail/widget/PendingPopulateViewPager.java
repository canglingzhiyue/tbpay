package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PullBase;
import tb.kge;

/* loaded from: classes5.dex */
public class PendingPopulateViewPager extends TTViewPager implements com.taobao.ptr.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MODE_SCROLL_PAGER = 0;
    public static final int MODE_SCROLL_VIEW = 1;
    public int mMode;
    private volatile boolean mPendingPopulate;
    private volatile int mPendingPosition;

    static {
        kge.a(1803384981);
        kge.a(-1419130634);
    }

    public static /* synthetic */ Object ipc$super(PendingPopulateViewPager pendingPopulateViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1695733278) {
            super.setCurrentItem(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue());
            return null;
        } else if (hashCode == 222392114) {
            super.setCurrentItem(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    @Override // com.taobao.ptr.h
    public int getPullDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f748d57e", new Object[]{this})).intValue();
        }
        return 1;
    }

    @Override // com.taobao.ptr.h
    public void onPullAdapterAdded(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04e19b", new Object[]{this, pullBase});
        }
    }

    @Override // com.taobao.ptr.h
    public void onPullAdapterRemoved(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea67bf7b", new Object[]{this, pullBase});
        }
    }

    public PendingPopulateViewPager(Context context) {
        super(context);
        this.mPendingPosition = -1;
        this.mMode = 0;
    }

    public PendingPopulateViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPendingPosition = -1;
        this.mMode = 0;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (!this.mPendingPopulate || this.mPendingPosition == -1) {
            return;
        }
        this.mPendingPopulate = false;
        super.setCurrentItem(this.mPendingPosition, false);
        this.mPendingPosition = -1;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager
    public void setCurrentItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d416f32", new Object[]{this, new Integer(i)});
        } else if (getWindowToken() == null) {
            this.mPendingPopulate = true;
            this.mPendingPosition = i;
        } else {
            super.setCurrentItem(i);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager
    public void setCurrentItem(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aed29e2", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (getWindowToken() == null) {
            this.mPendingPopulate = true;
            this.mPendingPosition = i;
        } else {
            super.setCurrentItem(i, z);
        }
    }

    public void setMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06b0557", new Object[]{this, new Integer(i)});
        } else if (this.mMode == i) {
        } else {
            this.mMode = 0;
            if (i != 0 && i != 1) {
                return;
            }
            this.mMode = i;
        }
    }

    @Override // com.taobao.ptr.h
    public boolean isReadyForPullStart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3cf0e198", new Object[]{this})).booleanValue() : getAdapter() != null && getCurrentItem() == 0 && !canScrollHorizontally(-1);
    }

    @Override // com.taobao.ptr.h
    public boolean isReadyForPullEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f76f3051", new Object[]{this})).booleanValue();
        }
        PagerAdapter adapter = getAdapter();
        return adapter != null && getCurrentItem() == adapter.getCount() - 1 && !canScrollHorizontally(1);
    }

    public int getMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56d77213", new Object[]{this})).intValue() : this.mMode;
    }
}
