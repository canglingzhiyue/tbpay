package com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.view.c;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import tb.kge;
import tb.oeb;

/* loaded from: classes8.dex */
public class TNodeTBSwipeRefreshLayout extends TBSwipeRefreshLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private c scrollHelper;

    static {
        kge.a(-1856377662);
    }

    public static /* synthetic */ Object ipc$super(TNodeTBSwipeRefreshLayout tNodeTBSwipeRefreshLayout, String str, Object... objArr) {
        if (str.hashCode() == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TNodeTBSwipeRefreshLayout(Context context) {
        super(context);
        this.scrollHelper = new c(this);
        int aD = oeb.aD();
        if (aD >= 0) {
            this.mTouchSlop = aD;
        }
    }

    public TNodeTBSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.scrollHelper = new c(this);
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.scrollHelper.a(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }
}
