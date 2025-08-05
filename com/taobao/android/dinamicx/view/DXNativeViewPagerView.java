package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gbi;
import tb.kge;

/* loaded from: classes5.dex */
public class DXNativeViewPagerView extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float DEFAULT_OFFSET = 0.1f;
    private boolean enableScroll_Android;
    private int mIndexChangeType;
    private gbi mLazyPagerAdapter;
    private boolean scrollable;

    static {
        kge.a(-1235315199);
    }

    public static /* synthetic */ Object ipc$super(DXNativeViewPagerView dXNativeViewPagerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1695733278:
                super.setCurrentItem(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue());
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -614473710:
                return new Boolean(super.canScrollHorizontally(((Number) objArr[0]).intValue()));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -284080898:
                super.setAdapter((PagerAdapter) objArr[0]);
                return null;
            case -188663035:
                super.onPageScrolled(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).intValue());
                return null;
            case 222392114:
                super.setCurrentItem(((Number) objArr[0]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public DXNativeViewPagerView(Context context) {
        super(context);
        this.scrollable = true;
        this.enableScroll_Android = true;
        this.mIndexChangeType = 0;
    }

    public DXNativeViewPagerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.scrollable = true;
        this.enableScroll_Android = true;
        this.mIndexChangeType = 0;
    }

    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
        } else {
            this.scrollable = z;
        }
    }

    public void setEnableScroll_Android(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7916dab", new Object[]{this, new Boolean(z)});
        } else {
            this.enableScroll_Android = z;
        }
    }

    @Override // android.support.v4.view.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1144fe", new Object[]{this, pagerAdapter});
            return;
        }
        super.setAdapter(pagerAdapter);
        this.mLazyPagerAdapter = pagerAdapter instanceof gbi ? (gbi) pagerAdapter : null;
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue() : this.scrollable && super.canScrollHorizontally(i);
    }

    @Override // android.support.v4.view.ViewPager
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        if (this.mLazyPagerAdapter != null) {
            if (getCurrentItem() == i) {
                int i3 = i + 1;
                if (this.mLazyPagerAdapter.a(i3) && f >= 0.1f) {
                    this.mLazyPagerAdapter.startUpdate((ViewGroup) this);
                    this.mLazyPagerAdapter.a(this, i3);
                    this.mLazyPagerAdapter.finishUpdate((ViewGroup) this);
                }
            } else if (getCurrentItem() > i && this.mLazyPagerAdapter.a(i) && 1.0f - f >= 0.1f) {
                this.mLazyPagerAdapter.startUpdate((ViewGroup) this);
                this.mLazyPagerAdapter.a(this, i);
                this.mLazyPagerAdapter.finishUpdate((ViewGroup) this);
            }
        }
        super.onPageScrolled(i, f, i2);
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue() : this.enableScroll_Android && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue() : this.enableScroll_Android && super.onTouchEvent(motionEvent);
    }

    public int getIndexChangeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5461a8c0", new Object[]{this})).intValue() : this.mIndexChangeType;
    }

    public void setCurrentItem(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aecea11", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mIndexChangeType = i2;
        super.setCurrentItem(i);
    }

    public void setCurrentItem(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b88561", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
            return;
        }
        this.mIndexChangeType = i2;
        super.setCurrentItem(i, z);
    }

    @Override // android.support.v4.view.ViewPager
    public void setCurrentItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d416f32", new Object[]{this, new Integer(i)});
            return;
        }
        this.mIndexChangeType = 0;
        super.setCurrentItem(i);
    }

    @Override // android.support.v4.view.ViewPager
    public void setCurrentItem(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aed29e2", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.mIndexChangeType = 0;
        super.setCurrentItem(i, z);
    }
}
