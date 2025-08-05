package tb;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.android.autosize.l;
import com.taobao.android.autosize.orientation.FoldPosture;
import com.taobao.application.common.IApmEventListener;
import com.taobao.application.common.c;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.huo;

/* loaded from: classes4.dex */
public class itq implements FoldPosture.a, IApmEventListener, huo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static itq e;

    /* renamed from: a  reason: collision with root package name */
    private final Application f29311a;
    private volatile int d;
    private boolean g;
    private final Object b = new Object();
    private volatile long c = -1;
    private final Map<String, Object> f = new HashMap();

    @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityDestroyed(Activity activity) {
        huo.CC.$default$onActivityDestroyed(this, activity);
    }

    @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityPaused(Activity activity) {
        huo.CC.$default$onActivityPaused(this, activity);
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

    public itq(Application application) {
        this.g = false;
        this.f29311a = application;
        this.d = l.q(application);
        this.g = l.b(h.a().h());
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
            return;
        }
        itq itqVar = new itq(application);
        c.a(itqVar);
        FoldPosture.a(application, itqVar);
        application.registerActivityLifecycleCallbacks(itqVar);
        e = itqVar;
        itqVar.e();
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (e != null) {
            DimensionSet create = DimensionSet.create();
            create.addDimension("ues_type");
            create.addDimension("cost");
            create.addDimension("isInMagicWindowMode");
            AppMonitor.register("auto_size", "auto_size_device_fold_use_stat", MeasureSet.create(), create);
            for (Map.Entry<String, Object> entry : e.f.entrySet()) {
                if (!"isInMagicWindowMode".equals(entry.getKey()) && !TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                    DimensionValueSet create2 = DimensionValueSet.create();
                    create2.setValue("ues_type", entry.getKey());
                    create2.setValue("cost", String.valueOf(entry.getValue()));
                    create2.setValue("isInMagicWindowMode", String.valueOf(e.f.get("isInMagicWindowMode")));
                    AppMonitor.Stat.commit("auto_size", "auto_size_device_fold_use_stat", create2, MeasureValueSet.create());
                }
            }
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.f29311a.getSharedPreferences("AutoSizeFoldStatusStat", 0);
        Map<String, ?> all = sharedPreferences.getAll();
        if (all != null) {
            this.f.putAll(all);
        }
        sharedPreferences.edit().clear().apply();
    }

    @Override // com.taobao.android.autosize.orientation.FoldPosture.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        d();
        c();
        f();
    }

    @Override // com.taobao.android.autosize.orientation.FoldPosture.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            b(str);
        }
    }

    @Override // com.taobao.application.common.IApmEventListener
    public void onEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
        } else if (2 == i) {
            c();
            f();
        } else if (1 != i) {
        } else {
            d();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        synchronized (this.b) {
            this.c = SystemClock.uptimeMillis();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        synchronized (this.b) {
            this.d = l.q(this.f29311a);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        synchronized (this.b) {
            if (this.c <= 0) {
                return;
            }
            SharedPreferences sharedPreferences = this.f29311a.getSharedPreferences("AutoSizeFoldStatusStat", 0);
            String a2 = FoldPosture.a(this.d);
            sharedPreferences.edit().putLong(a2, (SystemClock.uptimeMillis() - this.c) + sharedPreferences.getLong(a2, 0L)).apply();
            TLog.loge("TBAutoSize.FoldStatusStat", "increase use time, " + a2 + "=" + (SystemClock.uptimeMillis() - this.c) + "ms isInMagicWindowMode=" + sharedPreferences.getString("isInMagicWindowMode", "false"));
            this.c = -1L;
        }
    }

    @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        boolean b = l.b(activity);
        if (!this.g && b) {
            this.g = true;
        }
        UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("isInMagicWindowMode", String.valueOf(this.g));
        String a2 = FoldPosture.a(l.q(activity));
        UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("foldStatus", a2);
        TLog.loge("TBAutoSize.FoldStatusStat", "onActivityCreated foldStatus=" + a2 + " isInMagicWindowMode=" + this.g);
    }

    @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        SharedPreferences sharedPreferences = this.f29311a.getSharedPreferences("AutoSizeFoldStatusStat", 0);
        boolean b = l.b(activity);
        String string = sharedPreferences.getString("isInMagicWindowMode", "false");
        if ("false".equals(string) && b) {
            string = "true";
        }
        sharedPreferences.edit().putString("isInMagicWindowMode", string).apply();
        try {
            this.g = Boolean.parseBoolean(string);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        String a2 = FoldPosture.a(l.q(activity));
        UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("isInMagicWindowMode", string);
        UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("foldStatus", a2);
        TLog.loge("TBAutoSize.FoldStatusStat", "onActivityResumed foldStatus=" + a2 + " isInMagicWindowMode=" + string);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        DimensionSet create = DimensionSet.create();
        create.addDimension("foldStatus");
        create.addDimension("isInMagicWindowMode");
        AppMonitor.register("auto_size", "auto_size_status_changed", MeasureSet.create(), create);
        DimensionValueSet create2 = DimensionValueSet.create();
        create2.setValue("foldStatus", str);
        create2.setValue("isInMagicWindowMode", String.valueOf(this.g));
        AppMonitor.Stat.commit("auto_size", "auto_size_status_changed", create2, MeasureValueSet.create());
        UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("foldStatus", str);
        TLog.loge("TBAutoSize.FoldStatusStat", "commitStatus foldStatus=" + str + " isInMagicWindowMode=" + this.g);
    }
}
