package com.taobao.android.middleware.compat;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.compat.ApplicationCompat;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.android.task.Coordinator;
import java.io.Serializable;
import java.util.HashMap;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopPrefetch;

/* loaded from: classes.dex */
public class MtopLifeCycleInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.MtopLifeCycleInitializer";

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        try {
            ((PanguApplication) application).registerCrossActivityLifecycleCallback(new b(application));
            ((PanguApplication) application).registerActivityLifecycleCallbacks(new a());
        } catch (Exception e) {
            TBSdkLog.e(TAG, "register Lifecycle Callbacks error.", e);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements PanguApplication.CrossActivityLifecycleCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;

        /* renamed from: a  reason: collision with root package name */
        public static volatile boolean f14311a = false;
        public final Application b;

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onCreated(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f00e362", new Object[]{this, activity});
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc107b13", new Object[]{this, activity});
            }
        }

        public b(Application application) {
            this.b = application;
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b167bb", new Object[]{this, activity});
                return;
            }
            try {
                if (!f14311a) {
                    Coordinator.postTask(new Coordinator.TaggedRunnable("initXState") { // from class: com.taobao.android.middleware.compat.MtopLifeCycleInitializer.b.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                mtopsdk.xstate.a.a(b.this.b.getApplicationContext());
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    f14311a = true;
                }
            } catch (Throwable th) {
                TBSdkLog.e(MtopLifeCycleInitializer.TAG, "NetworkDiagnosis init error.", th);
            }
            mtopsdk.xstate.a.a(false);
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82d37207", new Object[]{this, activity});
                return;
            }
            mtopsdk.xstate.a.a(true);
            MtopPrefetch.cleanPrefetchCache(Mtop.getMtopInstance(Mtop.Id.INNER));
        }
    }

    /* loaded from: classes.dex */
    public static class a extends ApplicationCompat.AbstractActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Uri data;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else if (activity == null) {
            } else {
                try {
                    mtopsdk.xstate.a.c("PageName", activity.getLocalClassName());
                    Intent intent = activity.getIntent();
                    if (intent == null || (data = intent.getData()) == null) {
                        return;
                    }
                    mtopsdk.xstate.a.c("PageUrl", MtopUtils.convertUrl(data.toString()));
                } catch (Throwable th) {
                    TBSdkLog.e("mtopsdk.XStateCompatLifecycle", "onActivityCreated(): register pageName and pageUrl to mtopsdk error. ", th);
                }
            }
        }

        @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityResumed(Activity activity) {
            Uri data;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else if (activity == null) {
            } else {
                try {
                    mtopsdk.xstate.a.c("PageName", activity.getLocalClassName());
                    Intent intent = activity.getIntent();
                    if (intent == null || (data = intent.getData()) == null) {
                        return;
                    }
                    mtopsdk.xstate.a.c("PageUrl", MtopUtils.convertUrl(data.toString()));
                } catch (Throwable th) {
                    TBSdkLog.e("mtopsdk.XStateCompatLifecycle", "onActivityResumed(): register pageName and pageUrl to mtopsdk error. ", th);
                }
            }
        }
    }
}
