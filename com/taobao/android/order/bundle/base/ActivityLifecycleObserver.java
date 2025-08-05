package com.taobao.android.order.bundle.base;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class ActivityLifecycleObserver implements LifecycleObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f14531a;

    /* loaded from: classes6.dex */
    public interface a {
        void at_();
    }

    static {
        kge.a(-49132628);
        kge.a(2139684418);
    }

    public ActivityLifecycleObserver(a aVar) {
        this.f14531a = aVar;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        a aVar = this.f14531a;
        if (aVar == null) {
            return;
        }
        aVar.at_();
    }
}
