package com.taobao.android.detail.provider;

import android.app.Activity;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.protocol.adapter.core.IActivityAdapter;
import com.taobao.android.detail.protocol.adapter.optional.ActivityLifecycleObserver;
import tb.kge;

/* loaded from: classes4.dex */
public class TBActivityProvider implements IActivityAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static TBActivityLifeCycleObserver tbActivityLifeCycleObserver;

    /* loaded from: classes4.dex */
    public static class TBActivityLifeCycleObserver implements ActivityLifecycleObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-307438880);
            kge.a(-267843602);
        }

        @Override // com.taobao.android.detail.protocol.adapter.optional.ActivityLifecycleObserver
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // com.taobao.android.detail.protocol.adapter.optional.ActivityLifecycleObserver
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        @Override // com.taobao.android.detail.protocol.adapter.optional.ActivityLifecycleObserver
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // com.taobao.android.detail.protocol.adapter.optional.ActivityLifecycleObserver
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // com.taobao.android.detail.protocol.adapter.optional.ActivityLifecycleObserver
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // com.taobao.android.detail.protocol.adapter.optional.ActivityLifecycleObserver
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // com.taobao.android.detail.protocol.adapter.optional.ActivityLifecycleObserver
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }
    }

    static {
        kge.a(-1149370655);
        kge.a(-1985295941);
        tbActivityLifeCycleObserver = null;
    }

    @Override // com.taobao.android.detail.protocol.adapter.core.IActivityAdapter
    public ActivityLifecycleObserver getLifecycleObserver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityLifecycleObserver) ipChange.ipc$dispatch("6c92e8f4", new Object[]{this});
        }
        if (tbActivityLifeCycleObserver == null) {
            tbActivityLifeCycleObserver = new TBActivityLifeCycleObserver();
        }
        return tbActivityLifeCycleObserver;
    }
}
