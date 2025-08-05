package com.taobao.android.detail2.core.framework.secondpage;

import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes5.dex */
public interface b {
    boolean callSuperCanScroll(View view, boolean z, int i, int i2, int i3);

    boolean callSuperDispatchTouchEvent(MotionEvent motionEvent);

    boolean callSuperOnInterceptTouchEvent(MotionEvent motionEvent);

    ViewPager getViewPager();
}
