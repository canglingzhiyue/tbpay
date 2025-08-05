package com.taobao.android.autosize.orientation;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import tb.huo;
import tb.rul;
import tb.ruw;

/* loaded from: classes4.dex */
public class ConfigChangeProvider implements huo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ruw<Activity, Configuration, Void> f9115a;
    private rul<Boolean, Void> b;
    private final Map<Activity, ConfigChangeObserver> c = new HashMap();
    private final Map<Activity, ComponentCallbacks> i = new HashMap();
    private final Map<Activity, ConfigChangeObserverSupportV4> d = new HashMap();
    private boolean e = true;
    private final ruw<Activity, Configuration, Void> f = new ruw<Activity, Configuration, Void>() { // from class: com.taobao.android.autosize.orientation.ConfigChangeProvider.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Void, java.lang.Object] */
        @Override // tb.ruw
        /* renamed from: invoke */
        public /* synthetic */ Void mo2423invoke(Activity activity, Configuration configuration) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("77c951db", new Object[]{this, activity, configuration}) : a(activity, configuration);
        }

        public Void a(Activity activity, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("238b5c47", new Object[]{this, activity, configuration});
            }
            String str = "activity=" + activity + " newConfig=" + configuration;
            if (!ConfigChangeProvider.a(ConfigChangeProvider.this) || ConfigChangeProvider.b(ConfigChangeProvider.this) == null) {
                return null;
            }
            ConfigChangeProvider.b(ConfigChangeProvider.this).mo2423invoke(activity, configuration);
            ConfigChangeProvider.a(ConfigChangeProvider.this, false);
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.taobao.android.autosize.orientation.ConfigChangeProvider.1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ConfigChangeProvider.a(ConfigChangeProvider.this, true);
                    }
                }
            });
            TLog.loge("TBAutoSize.ConfObserver", "activity=" + activity + " newConfig=" + configuration);
            return null;
        }
    };
    private boolean g = true;
    private final ruw<Activity, Boolean, Void> h = new ruw<Activity, Boolean, Void>() { // from class: com.taobao.android.autosize.orientation.ConfigChangeProvider.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Void, java.lang.Object] */
        @Override // tb.ruw
        /* renamed from: invoke */
        public /* synthetic */ Void mo2423invoke(Activity activity, Boolean bool) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("77c951db", new Object[]{this, activity, bool}) : a(activity, bool);
        }

        public Void a(Activity activity, Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("53d7154a", new Object[]{this, activity, bool});
            }
            String str = "activity=" + activity + " isInMultiWindowMode=" + bool;
            if (!ConfigChangeProvider.c(ConfigChangeProvider.this) || ConfigChangeProvider.d(ConfigChangeProvider.this) == null) {
                return null;
            }
            ConfigChangeProvider.d(ConfigChangeProvider.this).mo2421invoke(bool);
            ConfigChangeProvider.b(ConfigChangeProvider.this, false);
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.taobao.android.autosize.orientation.ConfigChangeProvider.2.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ConfigChangeProvider.b(ConfigChangeProvider.this, true);
                    }
                }
            });
            TLog.loge("TBAutoSize.ConfObserver", "activity=" + activity + " isInMultiWindowMode=" + bool);
            return null;
        }
    };

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final ConfigChangeProvider f9122a = new ConfigChangeProvider();

        public static /* synthetic */ ConfigChangeProvider a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ConfigChangeProvider) ipChange.ipc$dispatch("4314632f", new Object[0]) : f9122a;
        }
    }

    @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityPaused(Activity activity) {
        huo.CC.$default$onActivityPaused(this, activity);
    }

    @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityResumed(Activity activity) {
        huo.CC.$default$onActivityResumed(this, activity);
    }

    @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        huo.CC.$default$onActivitySaveInstanceState(this, activity, bundle);
    }

    @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityStarted(Activity activity) {
        huo.CC.$default$onActivityStarted(this, activity);
    }

    @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityStopped(Activity activity) {
        huo.CC.$default$onActivityStopped(this, activity);
    }

    public static /* synthetic */ boolean a(ConfigChangeProvider configChangeProvider) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("80c518ed", new Object[]{configChangeProvider})).booleanValue() : configChangeProvider.e;
    }

    public static /* synthetic */ boolean a(ConfigChangeProvider configChangeProvider, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97deb70f", new Object[]{configChangeProvider, new Boolean(z)})).booleanValue();
        }
        configChangeProvider.e = z;
        return z;
    }

    public static /* synthetic */ ruw b(ConfigChangeProvider configChangeProvider) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruw) ipChange.ipc$dispatch("5dc0a688", new Object[]{configChangeProvider}) : configChangeProvider.f9115a;
    }

    public static /* synthetic */ boolean b(ConfigChangeProvider configChangeProvider, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("344cb36e", new Object[]{configChangeProvider, new Boolean(z)})).booleanValue();
        }
        configChangeProvider.g = z;
        return z;
    }

    public static /* synthetic */ boolean c(ConfigChangeProvider configChangeProvider) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3848106f", new Object[]{configChangeProvider})).booleanValue() : configChangeProvider.g;
    }

    public static /* synthetic */ rul d(ConfigChangeProvider configChangeProvider) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("92a29771", new Object[]{configChangeProvider}) : configChangeProvider.b;
    }

    public static /* synthetic */ ruw e(ConfigChangeProvider configChangeProvider) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruw) ipChange.ipc$dispatch("ad1391e5", new Object[]{configChangeProvider}) : configChangeProvider.f;
    }

    public static ConfigChangeProvider a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConfigChangeProvider) ipChange.ipc$dispatch("4314632f", new Object[0]) : a.a();
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else {
            application.registerActivityLifecycleCallbacks(this);
        }
    }

    public void a(ruw<Activity, Configuration, Void> ruwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc53bc4", new Object[]{this, ruwVar});
        } else {
            this.f9115a = ruwVar;
        }
    }

    @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(final Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        if (com.taobao.android.autosize.config.a.a().v()) {
            ComponentCallbacks componentCallbacks = new ComponentCallbacks() { // from class: com.taobao.android.autosize.orientation.ConfigChangeProvider.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4bbd23dd", new Object[]{this});
                    }
                }

                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
                    } else {
                        ConfigChangeProvider.e(ConfigChangeProvider.this).mo2423invoke(activity, configuration);
                    }
                }
            };
            activity.registerComponentCallbacks(componentCallbacks);
            this.i.put(activity, componentCallbacks);
        }
        if (activity instanceof FragmentActivity) {
            ConfigChangeObserverSupportV4 configChangeObserverSupportV4 = new ConfigChangeObserverSupportV4();
            configChangeObserverSupportV4.addCallBack(this.f, this.h);
            ((FragmentActivity) activity).getSupportFragmentManager().beginTransaction().add(configChangeObserverSupportV4, "TBAutoSize.ConfigChangeObserver").commitAllowingStateLoss();
            this.d.put(activity, configChangeObserverSupportV4);
            return;
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ConfigChangeObserver configChangeObserver = new ConfigChangeObserver();
        configChangeObserver.a(this.f, this.h);
        fragmentManager.beginTransaction().add(configChangeObserver, "TBAutoSize.ConfigChangeObserver").commitAllowingStateLoss();
        this.c.put(activity, configChangeObserver);
    }

    @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        ComponentCallbacks remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        if (com.taobao.android.autosize.config.a.a().v() && (remove = this.i.remove(activity)) != null) {
            activity.unregisterComponentCallbacks(remove);
        }
        if (activity instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            ConfigChangeObserverSupportV4 remove2 = this.d.remove(activity);
            android.support.v4.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            if (remove2 == null || supportFragmentManager == null) {
                return;
            }
            supportFragmentManager.beginTransaction().remove(remove2).commitAllowingStateLoss();
            return;
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ConfigChangeObserver remove3 = this.c.remove(activity);
        if (remove3 == null || fragmentManager == null) {
            return;
        }
        fragmentManager.beginTransaction().remove(remove3).commitAllowingStateLoss();
    }

    /* loaded from: classes4.dex */
    public static class ConfigChangeObserver extends Fragment {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private ruw<Activity, Configuration, Void> f9121a;
        private ruw<Activity, Boolean, Void> b;

        public static /* synthetic */ Object ipc$super(ConfigChangeObserver configChangeObserver, String str, Object... objArr) {
            if (str.hashCode() == -349229044) {
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public void a(ruw<Activity, Configuration, Void> ruwVar, ruw<Activity, Boolean, Void> ruwVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc76ef20", new Object[]{this, ruwVar, ruwVar2});
                return;
            }
            this.f9121a = ruwVar;
            this.b = ruwVar2;
        }

        @Override // android.app.Fragment, android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
                return;
            }
            TLog.loge("TBAutoSize.ConfObserver", "ConfigChangeObserver onConfigurationChanged: " + configuration);
            super.onConfigurationChanged(configuration);
            ruw<Activity, Configuration, Void> ruwVar = this.f9121a;
            if (ruwVar == null) {
                return;
            }
            ruwVar.mo2423invoke(getActivity(), configuration);
        }

        @Override // android.app.Fragment
        public void onMultiWindowModeChanged(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97be6586", new Object[]{this, new Boolean(z)});
                return;
            }
            TLog.loge("TBAutoSize.ConfObserver", "ConfigChangeObserver onMultiWindowModeChanged: " + z);
            super.onMultiWindowModeChanged(z);
            ruw<Activity, Boolean, Void> ruwVar = this.b;
            if (ruwVar == null) {
                return;
            }
            ruwVar.mo2423invoke(getActivity(), Boolean.valueOf(z));
        }

        @Override // android.app.Fragment
        public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("725bd6aa", new Object[]{this, new Boolean(z), configuration});
            } else {
                super.onMultiWindowModeChanged(z, configuration);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class ConfigChangeObserverSupportV4 extends android.support.v4.app.Fragment {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ruw<Activity, Configuration, Void> configCallback;
        private ruw<Activity, Boolean, Void> multiWindowModeListener;

        public static /* synthetic */ Object ipc$super(ConfigChangeObserverSupportV4 configChangeObserverSupportV4, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1749129850) {
                super.onMultiWindowModeChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            } else if (hashCode != -349229044) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            }
        }

        public void addCallBack(ruw<Activity, Configuration, Void> ruwVar, ruw<Activity, Boolean, Void> ruwVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2b19a65", new Object[]{this, ruwVar, ruwVar2});
                return;
            }
            this.configCallback = ruwVar;
            this.multiWindowModeListener = ruwVar2;
        }

        @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
                return;
            }
            TLog.loge("TBAutoSize.ConfObserver", "ConfigChangeObserverSupportV4 onConfigurationChanged: " + configuration);
            super.onConfigurationChanged(configuration);
            ruw<Activity, Configuration, Void> ruwVar = this.configCallback;
            if (ruwVar == null) {
                return;
            }
            ruwVar.mo2423invoke(getActivity(), configuration);
        }

        @Override // android.support.v4.app.Fragment
        public void onMultiWindowModeChanged(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97be6586", new Object[]{this, new Boolean(z)});
                return;
            }
            TLog.loge("TBAutoSize.ConfObserver", "ConfigChangeObserverSupportV4 onMultiWindowModeChanged: " + z);
            super.onMultiWindowModeChanged(z);
            ruw<Activity, Boolean, Void> ruwVar = this.multiWindowModeListener;
            if (ruwVar == null) {
                return;
            }
            ruwVar.mo2423invoke(getActivity(), Boolean.valueOf(z));
        }
    }
}
