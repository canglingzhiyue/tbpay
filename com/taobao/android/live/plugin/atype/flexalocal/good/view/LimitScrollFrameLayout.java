package com.taobao.android.live.plugin.atype.flexalocal.good.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class LimitScrollFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mEnableScrollLimit;

    static {
        kge.a(1000864915);
    }

    public static /* synthetic */ Object ipc$super(LimitScrollFrameLayout limitScrollFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -614473710) {
            if (hashCode != -407533570) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        return new Boolean(super.canScrollHorizontally(((Number) objArr[0]).intValue()));
    }

    public LimitScrollFrameLayout(Context context) {
        super(context);
        this.mEnableScrollLimit = false;
    }

    public LimitScrollFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mEnableScrollLimit = false;
    }

    public LimitScrollFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mEnableScrollLimit = false;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue() : isEnableScrollLimit() || super.canScrollHorizontally(i);
    }

    public void enableScrollLimit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b978faa2", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableScrollLimit = z;
        }
    }

    public boolean isEnableScrollLimit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c2e4876c", new Object[]{this})).booleanValue() : this.mEnableScrollLimit;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
