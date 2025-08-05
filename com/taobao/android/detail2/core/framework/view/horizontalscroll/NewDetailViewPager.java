package com.taobao.android.detail2.core.framework.view.horizontalscroll;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.secondpage.b;
import com.taobao.android.detail2.core.framework.secondpage.c;
import tb.kge;

/* loaded from: classes5.dex */
public class NewDetailViewPager extends ViewPager implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mIsAvailable;
    private int mLastInterceptEventX;
    private c mViewPagerFeature;

    static {
        kge.a(-267748415);
        kge.a(2065596093);
    }

    public static /* synthetic */ Object ipc$super(NewDetailViewPager newDetailViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -407533570) {
            if (hashCode == 222452193) {
                return new Boolean(super.canScroll((View) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue()));
            }
            if (hashCode != 2075560917) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
    }

    @Override // com.taobao.android.detail2.core.framework.secondpage.b
    public ViewPager getViewPager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewPager) ipChange.ipc$dispatch("aa845e9b", new Object[]{this}) : this;
    }

    public NewDetailViewPager(Context context) {
        super(context);
        this.mIsAvailable = false;
    }

    public void setViewPagerFeature(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186c4fd9", new Object[]{this, cVar});
        } else {
            this.mViewPagerFeature = cVar;
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int x = (int) motionEvent.getX();
        if (getCurrentItem() == 0) {
            if (motionEvent.getAction() != 2 ? !(!this.mIsAvailable || !super.onInterceptTouchEvent(motionEvent)) : !(x - this.mLastInterceptEventX > 0 || !this.mIsAvailable || !super.onInterceptTouchEvent(motionEvent))) {
                z = true;
            }
        } else {
            c cVar = this.mViewPagerFeature;
            if (cVar != null) {
                return cVar.a(motionEvent);
            }
            z = super.onInterceptTouchEvent(motionEvent);
        }
        this.mLastInterceptEventX = x;
        return z;
    }

    public void setIsAvailable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("753f0e50", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsAvailable = z;
        }
    }

    @Override // android.support.v4.view.ViewPager
    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4259e1", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        c cVar = this.mViewPagerFeature;
        if (cVar != null) {
            return cVar.a(view, z, i, i2, i3);
        }
        return super.canScroll(view, z, i, i2, i3);
    }

    @Override // com.taobao.android.detail2.core.framework.secondpage.b
    public boolean callSuperCanScroll(View view, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("82c4c33e", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue() : super.canScroll(view, z, i, i2, i3);
    }

    @Override // com.taobao.android.detail2.core.framework.secondpage.b
    public boolean callSuperDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("217cd1b2", new Object[]{this, motionEvent})).booleanValue() : super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.taobao.android.detail2.core.framework.secondpage.b
    public boolean callSuperOnInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("43f19901", new Object[]{this, motionEvent})).booleanValue() : super.onInterceptTouchEvent(motionEvent);
    }
}
