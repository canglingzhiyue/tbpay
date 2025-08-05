package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.f;
import com.taobao.android.autosize.h;
import com.taobao.android.autosize.k;
import com.taobao.android.autosize.l;
import com.taobao.android.autosize.orientation.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class hup implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WeakReference<Activity> b = null;
    private final List<Activity> e = new ArrayList();
    private volatile boolean f = false;
    public boolean d = true;

    /* renamed from: a  reason: collision with root package name */
    public huq f28795a = new huq();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        if (h.a().g() != null && h.a().g().contains(activity.getClass().getName())) {
            if (activity instanceof FragmentActivity) {
                ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(this.f28795a, true);
            }
            f.a((Context) activity, h.a().b(), true);
        } else {
            f.a(activity, h.a().d(), (int) (activity.getResources().getDisplayMetrics().widthPixels / h.a().d()));
        }
        if (this.d) {
            this.d = false;
            l.d((Context) activity);
            l.m(activity);
            l.b((Context) activity);
        }
        if (!l.b((Context) activity)) {
            return;
        }
        a a2 = a.a(activity);
        if (a2 != null) {
            a2.a();
        }
        f.a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        WeakReference<Activity> weakReference = this.b;
        if (weakReference == null || weakReference.get() != activity) {
            this.b = new WeakReference<>(activity);
        }
        if (h.a().g() != null && h.a().g().contains(activity.getClass().getName())) {
            f.a((Context) activity, h.a().b(), false);
        } else {
            f.a(activity, h.a().d(), (int) (activity.getResources().getDisplayMetrics().widthPixels / h.a().d()));
        }
        this.e.add(activity);
        if (!this.f && this.e.size() > 1) {
            this.f = true;
        }
        k.a(activity, true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        } else {
            this.e.remove(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else if (!l.b((Context) activity) || (a2 = a.a(activity)) == null) {
        } else {
            a2.b();
        }
    }

    public Activity a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("2162bf40", new Object[]{this});
        }
        WeakReference<Activity> weakReference = this.b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
