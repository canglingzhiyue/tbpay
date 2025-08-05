package com.taobao.application.common.impl;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e implements Application.ActivityLifecycleCallbacks, h<Application.ActivityLifecycleCallbacks> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Application.ActivityLifecycleCallbacks> f16334a = new ArrayList<>();

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

    public static /* synthetic */ ArrayList a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("974d15a9", new Object[]{eVar}) : eVar.f16334a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(final Activity activity, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        } else {
            a(new Runnable() { // from class: com.taobao.application.common.impl.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Iterator it = e.a(e.this).iterator();
                    while (it.hasNext()) {
                        ((Application.ActivityLifecycleCallbacks) it.next()).onActivityCreated(activity, bundle);
                    }
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        } else {
            a(new Runnable() { // from class: com.taobao.application.common.impl.e.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Iterator it = e.a(e.this).iterator();
                    while (it.hasNext()) {
                        ((Application.ActivityLifecycleCallbacks) it.next()).onActivityStarted(activity);
                    }
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else {
            a(new Runnable() { // from class: com.taobao.application.common.impl.e.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Iterator it = e.a(e.this).iterator();
                    while (it.hasNext()) {
                        ((Application.ActivityLifecycleCallbacks) it.next()).onActivityResumed(activity);
                    }
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        } else {
            a(new Runnable() { // from class: com.taobao.application.common.impl.e.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Iterator it = e.a(e.this).iterator();
                    while (it.hasNext()) {
                        ((Application.ActivityLifecycleCallbacks) it.next()).onActivityPaused(activity);
                    }
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        } else {
            a(new Runnable() { // from class: com.taobao.application.common.impl.e.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Iterator it = e.a(e.this).iterator();
                    while (it.hasNext()) {
                        ((Application.ActivityLifecycleCallbacks) it.next()).onActivityStopped(activity);
                    }
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        } else {
            a(new Runnable() { // from class: com.taobao.application.common.impl.e.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Iterator it = e.a(e.this).iterator();
                    while (it.hasNext()) {
                        ((Application.ActivityLifecycleCallbacks) it.next()).onActivitySaveInstanceState(activity, bundle);
                    }
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else {
            a(new Runnable() { // from class: com.taobao.application.common.impl.e.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Iterator it = e.a(e.this).iterator();
                    while (it.hasNext()) {
                        ((Application.ActivityLifecycleCallbacks) it.next()).onActivityDestroyed(activity);
                    }
                }
            });
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
            a(new Runnable() { // from class: com.taobao.application.common.impl.e.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (e.a(e.this).contains(activityLifecycleCallbacks)) {
                    } else {
                        e.a(e.this).add(activityLifecycleCallbacks);
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
            a(new Runnable() { // from class: com.taobao.application.common.impl.e.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        e.a(e.this).remove(activityLifecycleCallbacks);
                    }
                }
            });
        }
    }

    private void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            b.d().a(runnable);
        }
    }
}
