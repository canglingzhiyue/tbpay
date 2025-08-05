package com.taobao.application.common.impl;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class j implements Application.ActivityLifecycleCallbacks, h<Application.ActivityLifecycleCallbacks> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Application.ActivityLifecycleCallbacks> f16348a = new ArrayList<>();

    @Override // com.taobao.application.common.impl.h
    public /* synthetic */ void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, activityLifecycleCallbacks});
        } else {
            b2(activityLifecycleCallbacks);
        }
    }

    @Override // com.taobao.application.common.impl.h
    public /* synthetic */ void b(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, activityLifecycleCallbacks});
        } else {
            a2(activityLifecycleCallbacks);
        }
    }

    public static /* synthetic */ ArrayList a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("8354e004", new Object[]{jVar}) : jVar.f16348a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = this.f16348a.iterator();
        while (it.hasNext()) {
            it.next().onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = this.f16348a.iterator();
        while (it.hasNext()) {
            it.next().onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = this.f16348a.iterator();
        while (it.hasNext()) {
            it.next().onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = this.f16348a.iterator();
        while (it.hasNext()) {
            it.next().onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = this.f16348a.iterator();
        while (it.hasNext()) {
            it.next().onActivityStopped(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            return;
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = this.f16348a.iterator();
        while (it.hasNext()) {
            it.next().onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = this.f16348a.iterator();
        while (it.hasNext()) {
            it.next().onActivityDestroyed(activity);
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void a2(final Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f6c822", new Object[]{this, activityLifecycleCallbacks});
        } else if (activityLifecycleCallbacks == null) {
            throw new IllegalArgumentException();
        } else {
            com.taobao.monitor.impl.common.e.a().j().post(new Runnable() { // from class: com.taobao.application.common.impl.j.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (j.a(j.this).contains(activityLifecycleCallbacks)) {
                    } else {
                        j.a(j.this).add(activityLifecycleCallbacks);
                    }
                }
            });
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void b2(final Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd8ad123", new Object[]{this, activityLifecycleCallbacks});
        } else if (activityLifecycleCallbacks == null) {
            throw new IllegalArgumentException();
        } else {
            com.taobao.monitor.impl.common.e.a().j().post(new Runnable() { // from class: com.taobao.application.common.impl.j.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        j.a(j.this).remove(activityLifecycleCallbacks);
                    }
                }
            });
        }
    }
}
