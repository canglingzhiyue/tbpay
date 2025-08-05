package com.taobao.android.launcher.bootstrap.tao.biz.touch;

import android.content.Context;
import android.support.v4.view.GestureDetectorCompat;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class c implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final GestureDetectorCompat f13079a;
    private final g b;

    public c(Context context, g gVar) {
        this.f13079a = new GestureDetectorCompat(context, gVar);
        this.f13079a.setIsLongpressEnabled(false);
        this.b = gVar;
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.biz.touch.a
    public boolean a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean onTouchEvent = this.f13079a.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1) {
            this.b.a(motionEvent);
        }
        return onTouchEvent;
    }
}
