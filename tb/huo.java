package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes4.dex */
public interface huo extends Application.ActivityLifecycleCallbacks {

    /* renamed from: tb.huo$-CC  reason: invalid class name */
    /* loaded from: classes9.dex */
    public final /* synthetic */ class CC {
        public static void $default$onActivityCreated(huo huoVar, Activity activity, Bundle bundle) {
        }

        public static void $default$onActivityDestroyed(huo huoVar, Activity activity) {
        }

        public static void $default$onActivityPaused(huo huoVar, Activity activity) {
        }

        public static void $default$onActivityResumed(huo huoVar, Activity activity) {
        }

        public static void $default$onActivitySaveInstanceState(huo huoVar, Activity activity, Bundle bundle) {
        }

        public static void $default$onActivityStarted(huo huoVar, Activity activity) {
        }

        public static void $default$onActivityStopped(huo huoVar, Activity activity) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityCreated(Activity activity, Bundle bundle);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityDestroyed(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityPaused(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityResumed(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivitySaveInstanceState(Activity activity, Bundle bundle);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityStarted(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityStopped(Activity activity);
}
