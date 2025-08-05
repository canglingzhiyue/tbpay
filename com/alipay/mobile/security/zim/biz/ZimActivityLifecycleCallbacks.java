package com.alipay.mobile.security.zim.biz;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes3.dex */
public class ZimActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ZimActivityLifecycleCallbacks b;

    /* renamed from: a  reason: collision with root package name */
    public Context f5843a;

    private ZimActivityLifecycleCallbacks(Context context) {
        this.f5843a = context.getApplicationContext();
    }

    public static ZimActivityLifecycleCallbacks getInstance(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ZimActivityLifecycleCallbacks) ipChange.ipc$dispatch("2a30cdcd", new Object[]{application});
        }
        if (b == null) {
            synchronized (ZimActivityLifecycleCallbacks.class) {
                if (b == null) {
                    ZimActivityLifecycleCallbacks zimActivityLifecycleCallbacks = new ZimActivityLifecycleCallbacks(application);
                    BioLog.w(ZIMFacade.TAG, "application.registerActivityLifecycleCallbacks(ZimActivityLifecycleCallbacks)");
                    application.registerActivityLifecycleCallbacks(zimActivityLifecycleCallbacks);
                    b = zimActivityLifecycleCallbacks;
                }
            }
        }
        return b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        BioLog.d(ZIMFacade.TAG, activity.getClass().getSimpleName() + ".onActivityCreated(activity=" + activity + ", savedInstanceState=" + bundle + riy.BRACKET_END_STR);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        BioLog.d(ZIMFacade.TAG, activity.getClass().getSimpleName() + ".onActivityStarted(activity=" + activity + riy.BRACKET_END_STR);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        BioLog.d(ZIMFacade.TAG, activity.getClass().getSimpleName() + ".onActivityResumed(activity=" + activity + riy.BRACKET_END_STR);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        BioLog.d(ZIMFacade.TAG, activity.getClass().getSimpleName() + ".onActivityPaused(activity=" + activity + riy.BRACKET_END_STR);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        BioLog.d(ZIMFacade.TAG, activity.getClass().getSimpleName() + ".onActivityStopped(activity=" + activity + riy.BRACKET_END_STR);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            return;
        }
        BioLog.d(ZIMFacade.TAG, activity.getClass().getSimpleName() + ".onActivitySaveInstanceState(activity=" + activity + ", outState=" + bundle + riy.BRACKET_END_STR);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        BioLog.d(ZIMFacade.TAG, activity.getClass().getSimpleName() + ".onActivityDestroyed(activity=" + activity + riy.BRACKET_END_STR);
    }
}
