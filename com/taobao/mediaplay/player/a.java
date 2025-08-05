package com.taobao.mediaplay.player;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes7.dex */
public class a implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<InterfaceC0698a> f18049a;
    private InterfaceC0698a b;

    /* renamed from: com.taobao.mediaplay.player.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public interface InterfaceC0698a {
        void onActivityCreated(Activity activity, Bundle bundle);

        void onActivityDestroyed(Activity activity);

        void onActivityPaused(Activity activity);

        void onActivityResumed(Activity activity);

        void onActivitySaveInstanceState(Activity activity, Bundle bundle);

        void onActivityStarted(Activity activity);

        void onActivityStopped(Activity activity);
    }

    static {
        kge.a(1845617335);
        kge.a(-1894394539);
    }

    public a(InterfaceC0698a interfaceC0698a, Application application) {
        if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "enWeakLifeCb", "true"))) {
            this.f18049a = new WeakReference<>(interfaceC0698a);
        } else {
            this.b = interfaceC0698a;
        }
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this);
        }
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else if (application == null) {
        } else {
            application.unregisterActivityLifecycleCallbacks(this);
        }
    }

    private InterfaceC0698a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InterfaceC0698a) ipChange.ipc$dispatch("79c0f71f", new Object[]{this});
        }
        InterfaceC0698a interfaceC0698a = this.b;
        return interfaceC0698a != null ? interfaceC0698a : this.f18049a.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        InterfaceC0698a a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onActivityCreated(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        InterfaceC0698a a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onActivityStarted(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        InterfaceC0698a a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onActivityResumed(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        InterfaceC0698a a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onActivityPaused(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        InterfaceC0698a a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onActivityStopped(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            return;
        }
        InterfaceC0698a a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onActivitySaveInstanceState(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        InterfaceC0698a a2 = a();
        if (a2 == null) {
            return;
        }
        a2.onActivityDestroyed(activity);
    }
}
