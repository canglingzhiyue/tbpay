package com.alibaba.triver.triver_shop.newShop.view.extend;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cen;
import tb.kge;

/* loaded from: classes3.dex */
public final class EnhancedViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean canDispatchToChild;
    private boolean canScroll;
    private boolean enableViewPagerAllowDoNotDispatchToChild;

    static {
        kge.a(-160172004);
    }

    public static /* synthetic */ Object ipc$super(EnhancedViewPager enhancedViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -407533570) {
            if (hashCode != 2075560917) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
    }

    public final boolean getCanScroll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5952d112", new Object[]{this})).booleanValue() : this.canScroll;
    }

    public final void setCanScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98fe6b92", new Object[]{this, new Boolean(z)});
        } else {
            this.canScroll = z;
        }
    }

    public final boolean getCanDispatchToChild() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e44bf798", new Object[]{this})).booleanValue() : this.canDispatchToChild;
    }

    public final void setCanDispatchToChild(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb639334", new Object[]{this, new Boolean(z)});
        } else {
            this.canDispatchToChild = z;
        }
    }

    public EnhancedViewPager(Context context) {
        super(context);
        this.canScroll = true;
        this.canDispatchToChild = true;
        this.enableViewPagerAllowDoNotDispatchToChild = cen.Companion.g();
    }

    public EnhancedViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.canScroll = true;
        this.canDispatchToChild = true;
        this.enableViewPagerAllowDoNotDispatchToChild = cen.Companion.g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.enableViewPagerAllowDoNotDispatchToChild || this.canDispatchToChild) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return motionEvent != null && o.a(motionEvent);
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.canScroll) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }
}
