package com.taobao.android.litecreator.widgets;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class LCViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mScrollable;

    static {
        kge.a(-101782525);
    }

    public static /* synthetic */ Object ipc$super(LCViewPager lCViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode != -407533570) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public LCViewPager(Context context) {
        super(context);
        this.mScrollable = true;
    }

    public LCViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mScrollable = true;
    }

    public void setCanScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98fe6b92", new Object[]{this, new Boolean(z)});
        } else {
            this.mScrollable = z;
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mScrollable) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.mScrollable) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
