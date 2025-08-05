package com.taobao.browser.jsbridge.ui;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class ImageViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ImageTouchView mCurrentView;

    static {
        kge.a(222798843);
    }

    public static /* synthetic */ Object ipc$super(ImageViewPager imageViewPager, String str, Object... objArr) {
        if (str.hashCode() == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ImageViewPager(Context context) {
        super(context);
        this.mCurrentView = null;
    }

    public ImageViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCurrentView = null;
    }

    public void setCurrentView(ImageTouchView imageTouchView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f261ff1d", new Object[]{this, imageTouchView});
        } else {
            this.mCurrentView = imageTouchView;
        }
    }

    public ImageTouchView getCurrentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageTouchView) ipChange.ipc$dispatch("4a3dc43f", new Object[]{this}) : this.mCurrentView;
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        ImageTouchView imageTouchView = this.mCurrentView;
        if (imageTouchView == null) {
            return false;
        }
        try {
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        if (imageTouchView.pagerCanScroll()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.mCurrentView.viewCanMove()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }
}
