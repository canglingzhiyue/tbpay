package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.f;

/* loaded from: classes.dex */
public class ola {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f32147a;

    /* loaded from: classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static ola f32149a;

        static {
            kge.a(822735372);
            f32149a = new ola();
        }

        public static /* synthetic */ ola a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ola) ipChange.ipc$dispatch("f08bb7a", new Object[0]) : f32149a;
        }
    }

    static {
        kge.a(-76464695);
        f32147a = "TLOG.PullTask";
    }

    private ola() {
    }

    public static ola a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ola) ipChange.ipc$dispatch("f08bb7a", new Object[0]) : b.a();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Application k = f.a().k();
        if (k == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 14) {
            k.registerActivityLifecycleCallbacks(new a());
        } else {
            String.format("build version %s not suppert, registerActivityLifecycleCallbacks failed", Integer.valueOf(Build.VERSION.SDK_INT));
        }
    }

    /* loaded from: classes.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;
        private boolean c;

        static {
            kge.a(2063370247);
            kge.a(-1894394539);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
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

        private a() {
            this.b = 0;
            this.c = false;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
                return;
            }
            this.b++;
            this.c = true;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                return;
            }
            this.b--;
            if (this.b != 0) {
                return;
            }
            this.c = false;
        }
    }
}
