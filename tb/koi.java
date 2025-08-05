package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.b;
import com.taobao.flowcustoms.afc.utils.c;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class koi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final koi c;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Activity> f30190a;
    private final Application.ActivityLifecycleCallbacks b = new a();

    static {
        kge.a(-55429675);
        c = new koi();
    }

    public static koi a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (koi) ipChange.ipc$dispatch("f06f639", new Object[0]) : c;
    }

    private koi() {
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else {
            b(application);
        }
    }

    private void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{this, application});
        } else if (application == null) {
        } else {
            application.registerActivityLifecycleCallbacks(this.b);
        }
    }

    public Activity b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("233c125f", new Object[]{this});
        }
        try {
            if (this.f30190a != null && this.f30190a.get() != null) {
                return this.f30190a.get();
            }
        } catch (Exception e) {
            c.b("linkx", "AppRuntimeManager === getCurrentActivity == error");
            b.a(b.AFC_LINK_CRASH_MESSAGE, "AppRuntimeManager", e.getMessage(), null);
        }
        return null;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        try {
            return (this.f30190a == null || this.f30190a.get() == null) ? "" : this.f30190a.get().getComponentName().getClassName();
        } catch (Exception unused) {
            c.b("linkx", "AppRuntimeManager === getCurrentActivityName == error");
            return "";
        }
    }

    /* loaded from: classes.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-690720943);
            kge.a(-1894394539);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

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

        private a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else {
                koi.this.f30190a = new WeakReference<>(activity);
            }
        }
    }
}
