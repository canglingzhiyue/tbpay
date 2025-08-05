package tb;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.impl.d;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.impl.common.a;
import com.taobao.monitor.impl.common.e;
import com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher;
import com.taobao.monitor.impl.trace.b;
import com.taobao.monitor.impl.trace.f;
import com.taobao.monitor.impl.trace.m;
import com.taobao.monitor.impl.util.h;
import com.taobao.monitor.procedure.IPage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes.dex */
public class mob implements Application.ActivityLifecycleCallbacks, Observer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static volatile boolean f = false;
    private static final List<String> g;
    private final Context h;
    private b i;

    /* renamed from: a  reason: collision with root package name */
    private int f31155a = 0;
    private int b = 0;
    private final Map<Activity, qpi> c = new HashMap();
    private final Map<Activity, IPage> d = new HashMap();
    private WeakReference<Activity> e = new WeakReference<>(null);
    private final Application.ActivityLifecycleCallbacks j = com.taobao.application.common.impl.b.d().e();
    private final Application.ActivityLifecycleCallbacks k = com.taobao.application.common.impl.b.d().f();
    private final moc l = new moc();
    private final jzr m = new jzr();

    static {
        ArrayList arrayList = new ArrayList();
        g = arrayList;
        arrayList.add("com.taobao.tao.welcome.Welcome");
        g.add("com.taobao.browser.BrowserActivity");
        g.add(lsk.BIZ_NAME);
    }

    public mob(Application application) {
        this.i = null;
        this.m.a(this.f31155a);
        this.h = application;
        m a2 = a.a(a.ACTIVITY_LIFECYCLE_DISPATCHER);
        if (a2 instanceof b) {
            this.i = (b) a2;
        }
        this.l.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        Map<String, Object> a2 = a(activity);
        String str = mnd.u;
        d.a().b("lastJumpPageSchemaUrl", str);
        mnd.u = com.taobao.monitor.impl.util.d.a(activity);
        jzr jzrVar = this.m;
        int i = this.f31155a + 1;
        this.f31155a = i;
        jzrVar.a(i);
        mnd.j++;
        String valueOf = String.valueOf(h.a());
        a2.put("groupRelatedId", valueOf);
        String string = bundle == null ? null : bundle.getString("apmActivityRecovery");
        mov a3 = new mov().a(true);
        if (com.taobao.monitor.impl.common.d.d || mna.b(com.taobao.monitor.impl.util.d.a((Object) activity))) {
            z = true;
        }
        IPage a4 = a3.c(z).a(activity).a(activity.getWindow()).a(valueOf).b(str).a();
        this.d.put(activity, a4);
        ProcedureGlobal.PROCEDURE_MANAGER.a(activity, a4);
        a4.d().a(com.taobao.monitor.impl.util.d.b(activity), com.taobao.monitor.impl.util.d.a(activity), a2);
        a4.g().a(mpa.RECOVERY_FROM_SAVED_INSTANCE, string);
        a2.put(mpa.RECOVERY_FROM_SAVED_INSTANCE, Boolean.valueOf(!TextUtils.isEmpty(string)));
        if (!f.a(this.i)) {
            this.i.a(activity, a2, h.a());
        }
        if (activity instanceof FragmentActivity) {
            ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(new moe(activity, a4, valueOf), true);
        }
        a(activity, "onActivityCreated");
        com.taobao.application.common.impl.b.d().a(activity);
        d.a().a("currFragmentName");
        this.j.onActivityCreated(activity, bundle);
        this.k.onActivityCreated(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        a(activity, "onActivityStarted");
        b(activity);
        this.b++;
        if (this.b == 1) {
            m a2 = f.a(a.APPLICATION_BACKGROUND_CHANGED_DISPATCHER);
            if (a2 instanceof ApplicationBackgroundChangedDispatcher) {
                ((ApplicationBackgroundChangedDispatcher) a2).a(0, h.a());
            }
            mpi.a("AppLifeCycle", "background2Foreground");
            this.l.b();
        }
        mnd.b = false;
        if (!f.a(this.i)) {
            this.i.a(activity, h.a());
        }
        if (!this.c.containsKey(activity)) {
            this.c.put(activity, new qpi(activity));
        }
        this.c.get(activity).a();
        com.taobao.application.common.impl.b.d().a(activity);
        this.j.onActivityStarted(activity);
        this.k.onActivityStarted(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        a(activity, "onActivityResumed");
        mnd.h = com.taobao.monitor.impl.util.d.a((Object) activity);
        String name = activity.getClass().getName();
        if (g.contains(name) && f && this.e.get() == null) {
            f = false;
            if (!a(name)) {
                this.e = new WeakReference<>(activity);
                activity.finish();
                return;
            }
        }
        mnd.u = com.taobao.monitor.impl.util.d.a(activity);
        IPage iPage = this.d.get(activity);
        if (iPage != null) {
            iPage.d().a();
            if (iPage instanceof mou) {
                d.a().b("lastJumpPageSchemaUrl", ((mou) iPage).s());
            }
        }
        if (!f.a(this.i)) {
            this.i.b(activity, h.a());
        }
        if (this.c.containsKey(activity)) {
            mnx.a().a(activity, this.c.get(activity), iPage);
        }
        new ptb().a(this.c.get(activity), iPage);
        com.taobao.application.common.impl.b.d().a(activity);
        d.a().b("currActivityName", com.taobao.monitor.impl.util.d.a((Object) activity));
        d.a().b("currActivitySimpleName", com.taobao.monitor.impl.util.d.b(activity));
        try {
            d.a().b("currActivitySchemaUrl", activity.getIntent().getDataString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.j.onActivityResumed(activity);
        this.k.onActivityResumed(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        a(activity, "onActivityPaused");
        mnd.h = "";
        if (!f.a(this.i)) {
            this.i.c(activity, h.a());
        }
        IPage iPage = this.d.get(activity);
        mnx.a().a(iPage);
        d.a().a("currActivityName");
        d.a().a("currActivitySimpleName");
        d.a().a("schemaUrl");
        this.j.onActivityPaused(activity);
        this.k.onActivityPaused(activity);
        if (com.taobao.monitor.impl.common.d.al) {
            if (!(iPage instanceof mou) || !(iPage.d() instanceof mod)) {
                return;
            }
            iPage.d().c();
        } else if (!(iPage instanceof mou) || !(iPage.d() instanceof mod)) {
        } else {
            ((mod) iPage.d()).b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IPage iPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        a(activity, "onActivityStopped");
        if (!f.a(this.i)) {
            this.i.d(activity, h.a());
        }
        if (this.c.containsKey(activity)) {
            this.c.get(activity).b();
        }
        this.b--;
        if (this.b == 0) {
            mnd.b = true;
            ProcedureGlobal.PROCEDURE_MANAGER.f();
            m a2 = f.a(a.APPLICATION_BACKGROUND_CHANGED_DISPATCHER);
            if (a2 instanceof ApplicationBackgroundChangedDispatcher) {
                ((ApplicationBackgroundChangedDispatcher) a2).a(1, h.a());
            }
            mpi.a("AppLifeCycle", "foreground2Background");
            mnd.v = "background";
            mnd.s = -1L;
            this.l.c();
            b(com.taobao.monitor.impl.util.d.a((Object) activity));
            new jzs().a(mpa.f31181a);
        }
        this.j.onActivityStopped(activity);
        this.k.onActivityStopped(activity);
        if (com.taobao.monitor.impl.common.d.al || (iPage = this.d.get(activity)) == null) {
            return;
        }
        iPage.d().c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            return;
        }
        this.j.onActivitySaveInstanceState(activity, bundle);
        this.k.onActivitySaveInstanceState(activity, bundle);
        a(activity, "onActivitySaveInstanceState");
        IPage iPage = this.d.get(activity);
        if (!(iPage instanceof mou)) {
            return;
        }
        bundle.putString("apmActivityRecovery", iPage.c());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        a(activity, "onActivityDestroyed");
        IPage iPage = this.d.get(activity);
        if (iPage != null) {
            iPage.d().d();
            this.d.remove(activity);
            ProcedureGlobal.PROCEDURE_MANAGER.a(iPage);
        }
        if (!f.a(this.i)) {
            this.i.e(activity, h.a());
        }
        if (this.b == 0) {
            b("");
            com.taobao.application.common.impl.b.d().a((Activity) null);
        }
        this.c.remove(activity);
        this.j.onActivityDestroyed(activity);
        this.k.onActivityDestroyed(activity);
        jzr jzrVar = this.m;
        int i = this.f31155a - 1;
        this.f31155a = i;
        jzrVar.a(i);
    }

    private Map<String, Object> a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4282aa6f", new Object[]{this, activity});
        }
        HashMap hashMap = new HashMap();
        try {
            Intent intent = activity.getIntent();
            if (intent != null) {
                hashMap.put("lastJumpPageSchemaUrl", mnd.u);
                hashMap.put("schemaUrl", intent.getDataString());
                hashMap.put("navStartTime", Long.valueOf(h.a(intent.getLongExtra("NAV_TO_URL_START_TIME", -1L))));
                hashMap.put("navStartActivityTime", Long.valueOf(h.a(intent.getLongExtra("NAV_START_ACTIVITY_TIME", -1L))));
                hashMap.put("navStartPageTime", Long.valueOf(h.a(intent.getLongExtra("NAV_START_ACTIVITY_TIME", -1L))));
                Bundle bundleExtra = intent.getBundleExtra("afc_bundle");
                if (bundleExtra != null) {
                    hashMap.put("blackPage", bundleExtra.getString("black_page"));
                    hashMap.put("outLink", bundleExtra.getString("out_link"));
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    hashMap.put("isAfcColdContext", Boolean.valueOf(extras.getBoolean("cold_startup_h5", false)));
                }
            }
            hashMap.put("fullPageName", com.taobao.monitor.impl.util.d.a((Object) activity));
            hashMap.put("jumpTime", Long.valueOf(mnd.r));
        } catch (Exception e) {
            mpi.c("ActivityLifeCycle", e);
        }
        return hashMap;
    }

    private void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
            return;
        }
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        window.getDecorView();
    }

    private void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            e.a().d().post(new Runnable() { // from class: tb.mob.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SharedPreferences.Editor edit = e.a().b().getSharedPreferences(com.taobao.monitor.impl.common.d.f18153a ? "apm_record" : "apm", 0).edit();
                    edit.putString("LAST_TOP_ACTIVITY", str);
                    edit.commit();
                }
            });
        }
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
        } else if (obj == null || !(obj instanceof IllegalArgumentException) || !((IllegalArgumentException) obj).getMessage().contains("ActivityRecord not found")) {
        } else {
            f = true;
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) this.h.getSystemService("activity")).getRunningTasks(10);
            if (runningTasks != null && runningTasks.size() > 0) {
                for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
                    if (runningTaskInfo.topActivity.getPackageName().equals(this.h.getPackageName()) && runningTaskInfo.topActivity.getClassName().equals(str)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    private void a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bb1504", new Object[]{this, activity, str});
            return;
        }
        IPage iPage = this.d.get(activity);
        if (iPage == null) {
            mpi.a("PageLifeCycle", "nonActivityPageSession", com.taobao.monitor.impl.util.d.a((Object) activity), str);
        } else {
            mpi.a("PageLifeCycle", iPage.c(), com.taobao.monitor.impl.util.d.a((Object) activity), str);
        }
    }
}
