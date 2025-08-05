package com.taobao.android.detail2.core.framework.secondpage;

import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b f11565a;

    static {
        kge.a(-507146620);
    }

    public abstract boolean a(MotionEvent motionEvent);

    public abstract boolean a(View view, boolean z, int i, int i2, int i3);

    public c(b bVar) {
        this.f11565a = bVar;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbe781e1", new Object[]{this, bVar});
        } else {
            this.f11565a = bVar;
        }
    }

    public ViewPager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("89a646d4", new Object[]{this});
        }
        b bVar = this.f11565a;
        if (bVar == null) {
            return null;
        }
        return bVar.getViewPager();
    }

    public boolean b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74207cc2", new Object[]{this, motionEvent})).booleanValue();
        }
        b bVar = this.f11565a;
        if (bVar == null) {
            return false;
        }
        return bVar.callSuperDispatchTouchEvent(motionEvent);
    }

    public boolean c(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89094503", new Object[]{this, motionEvent})).booleanValue();
        }
        b bVar = this.f11565a;
        if (bVar == null) {
            return false;
        }
        return bVar.callSuperOnInterceptTouchEvent(motionEvent);
    }

    public boolean b(View view, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f507b11c", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        b bVar = this.f11565a;
        if (bVar == null) {
            return false;
        }
        return bVar.callSuperCanScroll(view, z, i, i2, i3);
    }
}
