package com.taobao.login4android.init;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.compat.ApplicationCompat;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.init.loginbar.LoginBarController;
import com.taobao.login4android.init.loginbar.LoginObserver;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.navigation.e;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class LoginLifeCycleInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "login.LoginInitializer2";
    private static LoginObserver loginObserver;

    static {
        kge.a(94844128);
        kge.a(1028243835);
    }

    public static /* synthetic */ LoginObserver access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoginObserver) ipChange.ipc$dispatch("b813fc12", new Object[0]) : loginObserver;
    }

    public static /* synthetic */ LoginObserver access$102(LoginObserver loginObserver2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginObserver) ipChange.ipc$dispatch("fd58b65c", new Object[]{loginObserver2});
        }
        loginObserver = loginObserver2;
        return loginObserver2;
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        try {
            ((PanguApplication) application).registerActivityLifecycleCallbacks(new a());
            String str = "LoginLifeCycleInitializer init() called with: application = [" + application + "], params = [" + hashMap + riy.ARRAY_END_STR;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* loaded from: classes.dex */
    public static class a extends ApplicationCompat.AbstractActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<Activity> f17856a;
        private boolean b;

        static {
            kge.a(-727921103);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 1049280322) {
                super.onActivityResumed((Activity) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        private a() {
            this.b = false;
        }

        @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            String str = "onActivityCreated() called with: activity = [" + activity.getComponentName().getClassName() + "], savedInstanceState = [" + bundle + riy.ARRAY_END_STR;
            a(activity);
            try {
                if (TBMainHost.fromActivity(activity) != null && StringUtils.equals(activity.getComponentName().getClassName(), TBMainHost.fromActivity(activity).getName())) {
                    LoginBarController.cacheMainActivity(activity);
                    if (LoginLifeCycleInitializer.access$100() == null) {
                        LoginLifeCycleInitializer.access$102(new LoginObserver());
                    }
                    e.a(LoginLifeCycleInitializer.access$100());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                return;
            }
            if (!this.b) {
                a(activity);
            }
            super.onActivityResumed(activity);
        }

        private void a(Activity activity) {
            Activity activity2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
                return;
            }
            WeakReference<Activity> weakReference = this.f17856a;
            if (weakReference != null && (activity2 = weakReference.get()) != null && ((activity2.getLocalClassName().equals("com.taobao.browser.BrowserActivity") || activity2.getLocalClassName().equals("com.taobao.android.auth.AuthEntranceActivity") || activity2.getLocalClassName().equals("com.taobao.android.auth.AuthActivity")) && activity.getLocalClassName().contains("UserLoginActivity") && ((!StringUtils.isEmpty(LoginStatus.browserRefUrl) && LoginStatus.browserRefUrl.contains("http://oauth.m.taobao.com/")) || (activity2.getTaskId() > 0 && activity2.getTaskId() != activity.getTaskId())))) {
                this.b = true;
            }
            if ("com.ali.user.mobile.webview.WebViewActivity".equals(activity.getLocalClassName()) || "com.ali.user.mobile.ui.AliUserVerificationActivity".equals(activity.getLocalClassName()) || "com.alibaba.security.biometrics.face.auth.FaceLivenessActivity2".equals(activity.getLocalClassName())) {
                return;
            }
            this.f17856a = new WeakReference<>(activity);
        }

        @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityDestroyed(Activity activity) {
            WeakReference<Activity> weakReference;
            Activity activity2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            if (activity != null && activity.getLocalClassName().contains("UserLoginActivity") && this.b) {
                activity.finish();
                if (this.b && (weakReference = this.f17856a) != null && (activity2 = weakReference.get()) != null && activity2.getLocalClassName().contains("UserLoginActivity")) {
                    this.b = false;
                    activity2.moveTaskToBack(true);
                }
            }
            try {
                if (TBMainHost.fromActivity(activity) == null || !StringUtils.equals(activity.getComponentName().getClassName(), TBMainHost.fromActivity(activity).getName()) || LoginLifeCycleInitializer.access$100() == null) {
                    return;
                }
                e.b(LoginLifeCycleInitializer.access$100());
                LoginLifeCycleInitializer.access$102(null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
