package com.alibaba.poplayer.trigger;

import android.app.Activity;
import android.app.Application;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.utils.Monitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.bzl;
import tb.caf;
import tb.cag;
import tb.kge;
import tb.xip;

@Monitor.TargetClass
/* loaded from: classes.dex */
public class InternalTriggerController implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Monitor.TargetField
    private static final caf b;

    /* renamed from: a */
    private volatile WeakReference<Activity> f3204a;
    private int d = 0;

    public static /* synthetic */ void lambda$SPMTOjHO3XuDKoEVUp4Id3AdQys(Activity activity) {
        g(activity);
    }

    public static /* synthetic */ void lambda$UUZwfvg79W_wzSjl1dsEO215jm0(InternalTriggerController internalTriggerController, Activity activity) {
        internalTriggerController.f(activity);
    }

    public static /* synthetic */ void lambda$YqYpWkPHEFvOpcyHGJih0noFs_o(InternalTriggerController internalTriggerController, Activity activity) {
        internalTriggerController.h(activity);
    }

    /* renamed from: lambda$e8JXlPKY6-PHJFyHq2yob14LEC0 */
    public static /* synthetic */ void m240lambda$e8JXlPKY6PHJFyHq2yob14LEC0(Activity activity) {
        e(activity);
    }

    /* renamed from: lambda$i8zIHLS-DvUsOg28OtdDUqPzOO0 */
    public static /* synthetic */ void m241lambda$i8zIHLSDvUsOg28OtdDUqPzOO0(Activity activity) {
        i(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    static {
        kge.a(557954994);
        kge.a(-1894394539);
        b = caf.a();
    }

    public InternalTriggerController(Application application) {
        application.registerActivityLifecycleCallbacks(this);
        h hVar = new h(this);
        f.a().a(hVar);
        IntentFilter intentFilter = new IntentFilter("com.alibaba.poplayer.PopLayer.action.POP");
        intentFilter.addAction(PopLayer.ACTION_FRAGMENT_SWITCH);
        intentFilter.addAction(PopLayer.ACTION_PRE_DEAL_CUSTOM_TRIGGER);
        LocalBroadcastManager.getInstance(application).registerReceiver(new TriggerBroadcastReceiver(hVar), intentFilter);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        } else {
            com.alibaba.poplayer.utils.f.a(new Runnable() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$InternalTriggerController$i8zIHLS-DvUsOg28OtdDUqPzOO0
                @Override // java.lang.Runnable
                public final void run() {
                    InternalTriggerController.m241lambda$i8zIHLSDvUsOg28OtdDUqPzOO0(activity);
                }
            });
        }
    }

    public static /* synthetic */ void i(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d112abc2", new Object[]{activity});
            return;
        }
        try {
            com.alibaba.poplayer.utils.c.a("EventManager.onActivityStarted.activity{%s}", activity.getClass().getName());
            cag.i().b(activity, "start");
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("EventManager.onActivityStarted.error", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else {
            com.alibaba.poplayer.utils.f.a(new Runnable() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$InternalTriggerController$YqYpWkPHEFvOpcyHGJih0noFs_o
                {
                    InternalTriggerController.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    InternalTriggerController.lambda$YqYpWkPHEFvOpcyHGJih0noFs_o(InternalTriggerController.this, activity);
                }
            });
        }
    }

    public /* synthetic */ void h(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97c19b01", new Object[]{this, activity});
            return;
        }
        try {
            com.alibaba.poplayer.utils.a a2 = com.alibaba.poplayer.utils.a.a();
            a2.a(4);
            a(activity, null, null, true);
            cag.i().b(activity, "resume");
            a2.e();
            Object[] objArr = new Object[1];
            objArr[0] = activity != null ? activity.getClass().getName() : "";
            com.alibaba.poplayer.utils.c.a("EventManager.onActivityResumed.activity{%s}", objArr);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("onActivityResumed error", th);
        }
    }

    public void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            a(e(), str, str2, z);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("EventManager.onFragmentResumed.fail.", th);
        }
    }

    private void a(Activity activity, String str, String str2, boolean z) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a62e6c6", new Object[]{this, activity, str, str2, new Boolean(z)});
            return;
        }
        try {
            boolean z2 = !TextUtils.isEmpty(str);
            if (!z || !TextUtils.isEmpty(str2)) {
                str3 = str2;
            } else {
                String generateActivityInfo = PopLayer.getReference().getTriggerAdapter() != null ? PopLayer.getReference().getTriggerAdapter().generateActivityInfo(activity) : str2;
                if (TextUtils.isEmpty(generateActivityInfo)) {
                    generateActivityInfo = d(activity);
                }
                str3 = generateActivityInfo;
            }
            String str4 = z2 ? "[isFragmentResume:true]" : "";
            com.alibaba.poplayer.utils.c.c("triggerEvent", "", str4 + "ActivityResumedTrigger.");
            if (activity == null) {
                com.alibaba.poplayer.utils.c.b("triggerEvent", "", str4 + "ActivityResumedTrigger.activity is null");
            } else if (z2 && !c(activity)) {
                com.alibaba.poplayer.utils.c.c("triggerEvent", "", str4 + "ActivityResumedTrigger.sAllowedPopupFromFragmentNotice=false");
            } else if (!PopLayer.getReference().isValidActivity(activity)) {
                com.alibaba.poplayer.utils.c.c("triggerEvent", "", str4 + "ActivityResumedTrigger.is not validActivity.");
            } else {
                boolean b2 = b(activity);
                String e = b.e();
                String c = b.c();
                String d = b.d();
                String a2 = a(activity);
                String a3 = a(activity, str);
                boolean b3 = b(c, a2);
                boolean d2 = d(d, str);
                String b4 = b(activity, str);
                if (b3) {
                    if (!z2) {
                        if (b2) {
                            return;
                        }
                        cag.i().g();
                        com.alibaba.poplayer.utils.c.c("triggerEvent", "", str4 + "ActivityResumedTrigger.isSameActivity.");
                        return;
                    } else if (d2) {
                        cag.i().g();
                        com.alibaba.poplayer.utils.c.c("triggerEvent", "", str4 + "ActivityResumedTrigger.isSameActivity and isSameFragment.");
                        return;
                    }
                }
                cag.i().a(e, c, b.h());
                boolean e2 = e(b.g(), b4);
                boolean c2 = c(b.e(), a3);
                this.f3204a = new WeakReference<>(activity);
                String str5 = str3;
                try {
                    b.a(a2, str, a3, b4, str3, activity.isFinishing());
                    com.alibaba.poplayer.layermanager.f.a().a(activity, c2, e2, b3);
                    if (b2 && !z2) {
                        com.alibaba.poplayer.utils.c.c("triggerEvent", "", str4 + "ActivityResumedTrigger.isManualPopup.");
                        return;
                    }
                    b.b();
                    PopLayer.getReference().onSwitchedNewPage(e, a3);
                    cag.i().j();
                    cag.i().h();
                    xip.a().a(b4, str5);
                    com.alibaba.poplayer.utils.c.c("triggerEvent", "", str4 + "ActivityResumedTrigger.posttoService.uri:" + b4 + " param:" + str5);
                    com.alibaba.poplayer.utils.a.a().c(b4);
                    this.d++;
                    if (this.d % bzl.a().b().getFetchOnPageSwitchTimes() != 0) {
                        return;
                    }
                    PopLayer.getReference().getConfigMgr().startFetchConfig(true);
                } catch (Throwable th) {
                    th = th;
                    com.alibaba.poplayer.utils.c.a("EventManager.onActivityOrInnerViewResumed.fail.", th);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        } else {
            com.alibaba.poplayer.utils.f.a(new Runnable() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$InternalTriggerController$SPMTOjHO3XuDKoEVUp4Id3AdQys
                @Override // java.lang.Runnable
                public final void run() {
                    InternalTriggerController.lambda$SPMTOjHO3XuDKoEVUp4Id3AdQys(activity);
                }
            });
        }
    }

    public static /* synthetic */ void g(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e708a40", new Object[]{activity});
            return;
        }
        try {
            Object[] objArr = new Object[1];
            objArr[0] = activity != null ? activity.getClass().getName() : "";
            com.alibaba.poplayer.utils.c.a("EventManager.onActivityPaused.activity{%s}", objArr);
            cag.i().f();
            if (activity == null) {
                return;
            }
            cag.i().b(activity, "pause");
            String a2 = a(activity);
            String a3 = a(activity, b.d());
            boolean isFinishing = activity.isFinishing();
            b.a(isFinishing);
            if (!isFinishing) {
                return;
            }
            cag.i().a(a3, a2, true);
            com.alibaba.poplayer.layermanager.f.a().a(a2);
            PopLayer.getReference().onPageClean(activity);
            b.b(a2);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("EventManager.onActivityPaused.clean.error.", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        } else {
            com.alibaba.poplayer.utils.f.a(new Runnable() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$InternalTriggerController$UUZwfvg79W_wzSjl1dsEO215jm0
                {
                    InternalTriggerController.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    InternalTriggerController.lambda$UUZwfvg79W_wzSjl1dsEO215jm0(InternalTriggerController.this, activity);
                }
            });
        }
    }

    public /* synthetic */ void f(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("251f797f", new Object[]{this, activity});
            return;
        }
        try {
            Object[] objArr = new Object[1];
            objArr[0] = activity != null ? activity.getClass().getName() : "";
            com.alibaba.poplayer.utils.c.a("EventManager.onActivityStopped.activity{%s}", objArr);
            if (activity == null) {
                return;
            }
            cag.i().b(activity, "stop");
            String c = b.c();
            String a2 = a(activity);
            String a3 = a(a2, b.a(a2));
            boolean b2 = b(a2, c);
            boolean isFinishing = activity.isFinishing();
            if (!b2) {
                cag.i().a(a3, a2, isFinishing);
            }
            if (!isFinishing) {
                return;
            }
            com.alibaba.poplayer.layermanager.f.a().a(a2);
            PopLayer.getReference().onPageClean(activity);
            b.b(a2);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("EventManager.onActivityPaused.clean.error.", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else {
            com.alibaba.poplayer.utils.f.a(new Runnable() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$InternalTriggerController$e8JXlPKY6-PHJFyHq2yob14LEC0
                @Override // java.lang.Runnable
                public final void run() {
                    InternalTriggerController.m240lambda$e8JXlPKY6PHJFyHq2yob14LEC0(activity);
                }
            });
        }
    }

    public static /* synthetic */ void e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebce68be", new Object[]{activity});
            return;
        }
        try {
            Object[] objArr = new Object[1];
            objArr[0] = activity != null ? activity.getClass().getName() : "";
            com.alibaba.poplayer.utils.c.a("EventManager.onActivityDestroyed.activity{%s}", objArr);
            if (activity == null) {
                return;
            }
            String a2 = a(activity);
            cag.i().a(activity, a(activity, b.a(a2)));
            com.alibaba.poplayer.layermanager.f.a().a(a2);
            PopLayer.getReference().onPageClean(activity);
            b.b(a2);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("EventManager.onActivityDestroyed.clean.error.", th);
        }
    }

    private boolean b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdb367f", new Object[]{this, activity})).booleanValue();
        }
        return PopLayer.getReference().isMunualPopPageContains(activity.getClass().getName()) || activity.getClass().isAnnotationPresent(PopLayer.PopupOnlyManually.class);
    }

    private boolean c(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("792c4740", new Object[]{this, activity})).booleanValue() : activity.getClass().isAnnotationPresent(PopLayer.PopupAllowedFromFragment.class);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : b.c();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : b.e();
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : b.f();
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : b.g();
    }

    public Activity e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("28c80bbc", new Object[]{this}) : (Activity) com.alibaba.poplayer.utils.g.a(this.f3204a);
    }

    public static String a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cf9cba26", new Object[]{activity}) : a(activity, (String) null);
    }

    public static String a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7b3081c", new Object[]{activity, str});
        }
        if (activity == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(activity.getClass().getName());
        sb.append("@");
        sb.append(Integer.toHexString(activity.hashCode()));
        if (!TextUtils.isEmpty(str)) {
            sb.append("_frg_");
            sb.append(str);
        }
        return sb.toString();
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (!TextUtils.isEmpty(str2)) {
            sb.append("_frg_");
            sb.append(str2);
        }
        return sb.toString();
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str) && str.contains("_frg_");
    }

    private boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return str.equals(str2);
        }
        return false;
    }

    private boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{this, str, str2})).booleanValue() : !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && str.equals(str2);
    }

    private boolean d(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7f180e83", new Object[]{this, str, str2})).booleanValue() : !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && str.equals(str2);
    }

    private boolean e(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bb83984", new Object[]{this, str, str2})).booleanValue() : !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && str.equals(str2);
    }

    private String d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1861f643", new Object[]{this, activity});
        }
        if (activity != null && activity.getIntent() != null) {
            return activity.getIntent().getDataString();
        }
        return null;
    }

    private String b(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bf177bb", new Object[]{this, activity, str});
        }
        boolean z = !TextUtils.isEmpty(str);
        String str2 = null;
        if (PopLayer.getReference().getTriggerAdapter() != null) {
            str2 = PopLayer.getReference().getTriggerAdapter().generateUri(activity, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (z) {
            return activity.getClass().getName() + "." + str;
        }
        return activity.getClass().getName();
    }
}
