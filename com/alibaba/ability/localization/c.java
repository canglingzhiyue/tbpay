package com.alibaba.ability.localization;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import com.alibaba.ability.localization.constants.Language;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.Locale;
import kotlin.e;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

/* loaded from: classes2.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f1974a;
    private static Application b;
    private static final kotlin.d c;
    private static final Object d;

    public final Locale a() {
        IpChange ipChange = $ipChange;
        return (Locale) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("a66b0a23", new Object[]{this}) : c.getValue());
    }

    static {
        kge.a(-530306396);
        INSTANCE = new c();
        d = new Object();
        c = e.a(LocalizationManager$systemLocale$2.INSTANCE);
    }

    private c() {
    }

    @JvmStatic
    public static final void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
            return;
        }
        synchronized (d) {
            if (f1974a) {
                return;
            }
            f1974a = true;
            b = application;
            Language a2 = b.a();
            if (!a2.compare$Localization_release(INSTANCE.a())) {
                INSTANCE.a(application, a2);
            }
            if (application != null) {
                application.registerActivityLifecycleCallbacks(new a());
                t tVar = t.INSTANCE;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, outState});
                return;
            }
            q.d(activity, "activity");
            q.d(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            q.d(activity, "activity");
            c.INSTANCE.a(activity, b.a());
        }
    }

    @JvmStatic
    public static final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            INSTANCE.b(context, b.a());
        }
    }

    public final void a(Context context, Language language) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99f97199", new Object[]{this, context, language});
            return;
        }
        q.d(language, "language");
        try {
            a(language);
            b(context, language);
        } catch (Exception e) {
            TLog.loge(b.LOG_MODULE, "LocalizationManager", "change language error: " + e.getMessage());
        }
    }

    public final void b(Context context, Language language) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41754b5a", new Object[]{this, context, language});
            return;
        }
        q.d(language, "language");
        if (context == null || !c(context, language)) {
            return;
        }
        Locale locale = new Locale(language.getLanguage(), language.getCountry());
        Resources resources = context.getResources();
        Configuration configuration = resources != null ? resources.getConfiguration() : null;
        if (configuration != null) {
            configuration.setLocale(locale);
        }
        if (resources != null) {
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        TLog.logd(b.LOG_MODULE, "LocalizationManager", "update locale, context: " + context.getClass().getName() + ", locale: " + locale.toLanguageTag());
    }

    private final boolean c(Context context, Language language) {
        Resources resources;
        Configuration configuration;
        Locale locale;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e8f1251f", new Object[]{this, context, language})).booleanValue() : (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null || (locale = configuration.locale) == null || language.compare$Localization_release(locale)) ? false : true;
    }

    private final void a(Language language) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52db5e91", new Object[]{this, language});
        } else if (language.compare$Localization_release(Locale.getDefault())) {
        } else {
            Locale locale = new Locale(language.getLanguage(), language.getCountry());
            Locale.setDefault(locale);
            if (Build.VERSION.SDK_INT >= 24) {
                LocaleList.setDefault(new LocaleList(locale));
            }
            TLog.logd(b.LOG_MODULE, "LocalizationManager", "update default locale: " + locale.toLanguageTag());
        }
    }

    public final Context b() {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[]{this});
        }
        Application application2 = b;
        if (application2 != null) {
            return application2;
        }
        try {
            application = Globals.getApplication();
        } catch (Throwable th) {
            TLog.logd(b.LOG_MODULE, "LocalizationManager", "getApplication error: " + th.getMessage());
            application = null;
        }
        return application;
    }
}
