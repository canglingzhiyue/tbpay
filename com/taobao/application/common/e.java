package com.taobao.application.common;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public interface e {
    d a();

    void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks);

    void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, boolean z);

    void a(IApmEventListener iApmEventListener);

    void a(IAppLaunchListener iAppLaunchListener);

    void a(IPageListener iPageListener);

    void a(IScrollListener iScrollListener);

    void a(f fVar);

    Activity b();

    void b(IApmEventListener iApmEventListener);

    void b(IAppLaunchListener iAppLaunchListener);

    void b(IPageListener iPageListener);

    void b(IScrollListener iScrollListener);

    void b(f fVar);

    Handler c();

    Looper m();
}
