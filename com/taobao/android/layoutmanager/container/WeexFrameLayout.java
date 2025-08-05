package com.taobao.android.layoutmanager.container;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.obw;
import tb.ogg;

/* loaded from: classes5.dex */
public class WeexFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String WEEX_STATE_CONSUME;
    public static String WEEX_STATE_NOT_CONSUME;
    public static String WEEX_STATE_NOT_EXIST;
    private boolean hasUpOrCancel;
    private String mWeexConsumeState;
    private ViewParent viewParent;

    public static /* synthetic */ Object ipc$super(WeexFrameLayout weexFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-1573253495);
        WEEX_STATE_CONSUME = obw.WEEX_STATE_CONSUME;
        WEEX_STATE_NOT_CONSUME = obw.WEEX_STATE_NOT_CONSUME;
        WEEX_STATE_NOT_EXIST = obw.WEEX_STATE_NOT_EXIST;
    }

    public WeexFrameLayout(Context context) {
        super(context);
        this.mWeexConsumeState = WEEX_STATE_NOT_EXIST;
    }

    public WeexFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mWeexConsumeState = WEEX_STATE_NOT_EXIST;
    }

    public WeexFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mWeexConsumeState = WEEX_STATE_NOT_EXIST;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        this.viewParent = findViewParentIfNeeds(this);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hasUpOrCancel = false;
            ogg.d("WeexComponent", "onInterceptTouchEvent ACTION_DOWN");
            if (this.viewParent instanceof ViewPager) {
                ogg.d("WeexComponent", "onInterceptTouchEvent disallowIntercept");
                this.viewParent.requestDisallowInterceptTouchEvent(true);
            }
            if (this.viewParent instanceof ViewPager) {
                postDelayed(new Runnable() { // from class: com.taobao.android.layoutmanager.container.-$$Lambda$WeexFrameLayout$rt96wPwbVyrL4J8D5YsXirfcZNQ
                    {
                        WeexFrameLayout.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        WeexFrameLayout.this.lambda$onInterceptTouchEvent$1$WeexFrameLayout();
                    }
                }, 120L);
            }
        } else if (action == 1) {
            ogg.d("WeexComponent", "onInterceptTouchEvent event: " + motionEvent.getAction());
            setWeexConsume(WEEX_STATE_NOT_EXIST);
            this.hasUpOrCancel = true;
        } else if (action == 3) {
            ogg.d("WeexComponent", "onInterceptTouchEvent event: " + motionEvent.getAction());
            this.hasUpOrCancel = true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public /* synthetic */ void lambda$onInterceptTouchEvent$1$WeexFrameLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d3a555", new Object[]{this});
        } else if (!(this.viewParent instanceof ViewPager) || beenConsume()) {
        } else {
            ogg.d("WeexComponent", "onInterceptTouchEvent allowIntercept");
            this.viewParent.requestDisallowInterceptTouchEvent(false);
        }
    }

    private ViewParent findViewParentIfNeeds(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("307f684b", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        ViewParent parent = view.getParent();
        return (!(parent instanceof ViewPager) && (parent instanceof View)) ? findViewParentIfNeeds((View) parent) : parent;
    }

    public void setWeexConsume(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119aa4ca", new Object[]{this, str});
        } else if (this.hasUpOrCancel) {
        } else {
            this.mWeexConsumeState = str;
        }
    }

    public boolean beenConsume() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1aa5a2bb", new Object[]{this})).booleanValue() : WEEX_STATE_CONSUME.equals(this.mWeexConsumeState);
    }
}
