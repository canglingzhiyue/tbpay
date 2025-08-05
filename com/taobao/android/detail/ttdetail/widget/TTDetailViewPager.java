package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.y;
import tb.kge;

/* loaded from: classes5.dex */
public class TTDetailViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DetailViewPager";
    private boolean disableHorizontalScroll;

    static {
        kge.a(-771334091);
    }

    public static /* synthetic */ Object ipc$super(TTDetailViewPager tTDetailViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode != -407533570) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public TTDetailViewPager(Context context) {
        super(context);
        this.disableHorizontalScroll = false;
    }

    public TTDetailViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.disableHorizontalScroll = false;
    }

    public void setDisableHorizontalScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c08c536", new Object[]{this, new Boolean(z)});
        } else {
            this.disableHorizontalScroll = z;
        }
    }

    private boolean isOnlyOneChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c260f5ba", new Object[]{this})).booleanValue();
        }
        PagerAdapter adapter = getAdapter();
        return adapter == null || adapter.getCount() <= 1;
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            if (!this.disableHorizontalScroll && !isOnlyOneChildren()) {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            com.taobao.android.detail.ttdetail.utils.i.a(TAG, "onInterceptTouchEvent", e);
            return false;
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            com.taobao.android.detail.ttdetail.utils.i.a(TAG, "onTouchEvent", th);
            if (!y.a(y.a(this))) {
                throw new RuntimeException(th);
            }
            return true;
        }
    }
}
