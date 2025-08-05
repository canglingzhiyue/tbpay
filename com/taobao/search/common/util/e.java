package com.taobao.search.common.util;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class e implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private GestureDetector f19032a;

    static {
        kge.a(-210599641);
        kge.a(-468432129);
    }

    public e(GestureDetector gestureDetector) {
        this.f19032a = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        GestureDetector gestureDetector = this.f19032a;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        return false;
    }
}
