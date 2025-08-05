package com.taobao.search.category;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class LifecycleAdapterCategoryHolder implements LifecycleObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private LifecycleOwner f19022a;

    static {
        kge.a(-940408052);
        kge.a(49927463);
        kge.a(2139684418);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public abstract void onActivityDestroyInternal();

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public abstract void onActivityPauseInternal();

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public abstract void onActivityResumeInternal();

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public abstract void onActivityStartInternal();

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public abstract void onActivityStopInternal();

    public LifecycleAdapterCategoryHolder(Context context) {
        if (context instanceof LifecycleOwner) {
            this.f19022a = (LifecycleOwner) context;
            this.f19022a.getLifecycle().addObserver(this);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        LifecycleOwner lifecycleOwner = this.f19022a;
        if (lifecycleOwner == null) {
            return;
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }
}
