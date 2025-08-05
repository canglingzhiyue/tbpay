package com.taobao.android.order.core.ui.viewpager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class SimpleViewpager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isCanScroll;

    static {
        kge.a(-1865856324);
    }

    public static /* synthetic */ Object ipc$super(SimpleViewpager simpleViewpager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1695733278:
                super.setCurrentItem(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue());
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 222452193:
                return new Boolean(super.canScroll((View) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue()));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public SimpleViewpager(Context context) {
        super(context);
        this.isCanScroll = true;
    }

    public SimpleViewpager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isCanScroll = true;
    }

    @Override // android.support.v4.view.ViewPager
    public void setCurrentItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d416f32", new Object[]{this, new Integer(i)});
        } else {
            super.setCurrentItem(i, false);
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.isCanScroll) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.isCanScroll) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void setIsCanScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4f0badc", new Object[]{this, new Boolean(z)});
        } else {
            this.isCanScroll = z;
        }
    }

    @Override // android.support.v4.view.ViewPager
    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d4259e1", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue() : super.canScroll(view, z, i, i2, i3);
    }
}
