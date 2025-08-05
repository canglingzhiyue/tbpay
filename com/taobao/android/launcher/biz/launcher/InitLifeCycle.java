package com.taobao.android.launcher.biz.launcher;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.compat.ApplicationCompat;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import com.taobao.taobaocompat.lifecycle.AppForgroundObserver;
import com.taobao.taobaocompat.lifecycle.IUtActivityNotTrack;
import com.ut.mini.UTAnalytics;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.njn;

/* loaded from: classes.dex */
public class InitLifeCycle extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.android.launcher.biz.launcher.InitLifeCycle$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13020a = new int[LoginAction.values().length];

        static {
            try {
                f13020a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13020a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a implements com.taobao.orange.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<c> f13023a;

        public a(c cVar) {
            this.f13023a = new WeakReference<>(cVar);
        }

        @Override // com.taobao.orange.d
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            try {
                c cVar = this.f13023a.get();
                if (cVar == null) {
                    return;
                }
                String config = OrangeConfig.getInstance().getConfig(c.ORANGE_NAMESPACE, c.ORANGE_NOT_TRACK_BLACKLIST, c.ORANGE_NOT_TRACK_BLACKLIST_DEFAULT_VALUE);
                List<String> list = null;
                if (config != null) {
                    list = Arrays.asList(config.split(","));
                }
                cVar.a(list);
            } catch (Throwable th) {
                Log.e("BOCUpdateListener", "onConfigUpdate error: " + th.toString());
            }
        }
    }

    @Override // com.taobao.android.launcher.biz.task.j
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public InitLifeCycle(String str) {
        super(str);
        shouldRunImmediately(true);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        PanguApplication panguApplication = (PanguApplication) application;
        panguApplication.registerCrossActivityLifecycleCallback(new b(application));
        panguApplication.registerActivityLifecycleCallbacks(new c());
    }

    /* loaded from: classes.dex */
    public static class b implements PanguApplication.CrossActivityLifecycleCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public AppForgroundObserver f13024a = new AppForgroundObserver();
        public LoginCrossAppLifeCycle b = new LoginCrossAppLifeCycle(null);
        public final boolean c;

        public b(Context context) {
            this.c = !ABGlobal.isFeatureOpened(context, "removeInjectOff");
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onCreated(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f00e362", new Object[]{this, activity});
                return;
            }
            if (!this.c) {
                TBMainHost.a().b(activity);
            }
            this.b.a(activity);
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b167bb", new Object[]{this, activity});
                return;
            }
            this.b.b(activity);
            this.f13024a.onStarted(activity);
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82d37207", new Object[]{this, activity});
            } else {
                this.f13024a.onStopped(activity);
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc107b13", new Object[]{this, activity});
            } else {
                this.b.c(activity);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends ApplicationCompat.AbstractActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ORANGE_NAMESPACE = "page_view_track";
        public static final String ORANGE_NOT_TRACK_BLACKLIST = "not_track_blacklist";
        public static final String ORANGE_NOT_TRACK_BLACKLIST_DEFAULT_VALUE = null;

        /* renamed from: a  reason: collision with root package name */
        public com.taobao.android.nav.o f13025a = new com.taobao.android.nav.o();
        private final List<String> b = new CopyOnWriteArrayList();

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == 1095289988) {
                super.onActivityDestroyed((Activity) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public c() {
            a();
        }

        @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else {
                this.f13025a.a(activity, bundle);
            }
        }

        @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                return;
            }
            if ((!(activity instanceof IUtActivityNotTrack) || a(activity)) && !activity.getLocalClassName().equals("com.taobao.ju.android.ui.main.TabMainActivity")) {
                try {
                    UTAnalytics.getInstance().getDefaultTracker().pageAppear(activity);
                } catch (Throwable unused) {
                    Log.e("UnifiedCompatLifecycle", "onActivityResumed(): easytrace don't work!");
                }
            }
            try {
                njn.c(activity);
            } catch (Throwable unused2) {
                Log.e("UnifiedCompatLifecycle", "onActivityResumed(): PopCenter resume error");
            }
        }

        @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
                return;
            }
            if ((!(activity instanceof IUtActivityNotTrack) || a(activity)) && !activity.getLocalClassName().equals("com.taobao.ju.android.ui.main.TabMainActivity")) {
                try {
                    UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(activity);
                } catch (Throwable unused) {
                    Log.e("UnifiedCompatLifecycle", "onActivityPaused(): easytrace don't work!");
                }
            }
            try {
                njn.b(activity);
            } catch (Throwable unused2) {
                Log.e("UnifiedCompatLifecycle", "onActivityPaused(): PopCenter pause error");
            }
        }

        @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else {
                super.onActivityDestroyed(activity);
            }
        }

        public void a(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
                return;
            }
            this.b.clear();
            if (list == null) {
                return;
            }
            this.b.addAll(list);
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            try {
                b();
                String config = OrangeConfig.getInstance().getConfig(ORANGE_NAMESPACE, ORANGE_NOT_TRACK_BLACKLIST, ORANGE_NOT_TRACK_BLACKLIST_DEFAULT_VALUE);
                List<String> list = null;
                if (config != null) {
                    list = Arrays.asList(config.split(","));
                }
                a(list);
            } catch (Throwable th) {
                Log.e("UnifiedCompatLifecycle", "initBlackListInUtNotTrack error: " + th.toString());
            }
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                OrangeConfig.getInstance().registerListener(new String[]{ORANGE_NAMESPACE}, new a(this), true);
            }
        }

        private boolean a(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{this, activity})).booleanValue();
            }
            try {
                if (!this.b.isEmpty() && activity != null) {
                    return this.b.contains(activity.getClass().getCanonicalName());
                }
                return false;
            } catch (Throwable th) {
                Log.e("UnifiedCompatLifecycle", "isBlackListInUtNotTrack error: " + th.toString());
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class LoginCrossAppLifeCycle {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static boolean b = false;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<Activity> f13021a;
        private BroadcastReceiver c;
        private boolean d;

        /* loaded from: classes.dex */
        public class LoginBroadcastReceiver extends BroadcastReceiver {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public LoginBroadcastReceiver() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent == null) {
                } else {
                    int i = AnonymousClass1.f13020a[LoginAction.valueOf(intent.getAction()).ordinal()];
                    if ((i != 1 && i != 2) || !LoginCrossAppLifeCycle.a(LoginCrossAppLifeCycle.this) || LoginCrossAppLifeCycle.this.f13021a == null) {
                        return;
                    }
                    Activity activity = LoginCrossAppLifeCycle.this.f13021a.get();
                    if (!LoginCrossAppLifeCycle.d(activity)) {
                        return;
                    }
                    LoginCrossAppLifeCycle.a(LoginCrossAppLifeCycle.this, false);
                    activity.moveTaskToBack(true);
                }
            }
        }

        private LoginCrossAppLifeCycle() {
            this.d = false;
        }

        public /* synthetic */ LoginCrossAppLifeCycle(AnonymousClass1 anonymousClass1) {
            this();
        }

        public static /* synthetic */ boolean a(LoginCrossAppLifeCycle loginCrossAppLifeCycle) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f1c2b5c", new Object[]{loginCrossAppLifeCycle})).booleanValue() : loginCrossAppLifeCycle.d;
        }

        public static /* synthetic */ boolean a(LoginCrossAppLifeCycle loginCrossAppLifeCycle, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9469f280", new Object[]{loginCrossAppLifeCycle, new Boolean(z)})).booleanValue();
            }
            loginCrossAppLifeCycle.d = z;
            return z;
        }

        public static /* synthetic */ boolean d(Activity activity) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b27d5801", new Object[]{activity})).booleanValue() : e(activity);
        }

        public void a(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
                return;
            }
            if (this.c == null) {
                this.c = new LoginBroadcastReceiver();
            }
            LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), this.c);
        }

        public void b(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
            } else if (!b) {
            } else {
                b = false;
                Nav.from(activity).withFlags(67108864).toUri("http://m.taobao.com/index.htm");
            }
        }

        public void c(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("792c473c", new Object[]{this, activity});
            } else if (this.c == null) {
            } else {
                LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), this.c);
            }
        }

        private static boolean e(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ebce68c2", new Object[]{activity})).booleanValue();
            }
            if (activity == null) {
                return false;
            }
            return activity.getLocalClassName().contains("UserLoginActivity") || activity.getLocalClassName().contains("UserAccountActivity");
        }
    }
}
