package com.alibaba.motu.tbrest;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes.dex */
public class BackgroundLauncher implements Serializable {
    private static volatile boolean init;

    /* loaded from: classes.dex */
    private static class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        private int f3146a;

        static {
            kge.a(-1882873336);
            kge.a(-1894394539);
        }

        private a() {
            this.f3146a = 0;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            this.f3146a++;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            this.f3146a--;
            if (this.f3146a == 0) {
                com.alibaba.motu.tbrest.rest.c.a();
            }
        }
    }

    static {
        kge.a(-1658769168);
        kge.a(1028243835);
        init = false;
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        if (!init) {
            init = true;
            application.registerActivityLifecycleCallbacks(new a());
        }
    }
}
