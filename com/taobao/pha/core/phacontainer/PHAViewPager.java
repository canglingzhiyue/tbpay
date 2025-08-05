package com.taobao.pha.core.phacontainer;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.ngr;

/* loaded from: classes7.dex */
public class PHAViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private boolean mAcceptTouchEvent;

    public static /* synthetic */ Object ipc$super(PHAViewPager pHAViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode != -407533570) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    static {
        kge.a(326795445);
        TAG = PHAViewPager.class.getName();
    }

    public PHAViewPager(Context context) {
        super(context);
        this.mAcceptTouchEvent = true;
    }

    public void setAcceptTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e74ac08", new Object[]{this, new Boolean(z)});
        } else {
            this.mAcceptTouchEvent = z;
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.mAcceptTouchEvent) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            String str = TAG;
            ngr.b(str, "onInterceptTouchEvent " + e.toString());
            return false;
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.mAcceptTouchEvent) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            String str = TAG;
            ngr.b(str, "onTouchEvent " + e.toString());
            return false;
        }
    }
}
