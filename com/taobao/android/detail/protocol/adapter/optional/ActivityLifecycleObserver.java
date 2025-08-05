package com.taobao.android.detail.protocol.adapter.optional;

import android.app.Activity;
import android.os.Bundle;
import java.io.Serializable;

/* loaded from: classes4.dex */
public interface ActivityLifecycleObserver extends Serializable {
    void onActivityCreated(Activity activity, Bundle bundle);

    void onActivityDestroyed(Activity activity);

    void onActivityPaused(Activity activity);

    void onActivityResumed(Activity activity);

    void onActivitySaveInstanceState(Activity activity, Bundle bundle);

    void onActivityStarted(Activity activity);

    void onActivityStopped(Activity activity);
}
