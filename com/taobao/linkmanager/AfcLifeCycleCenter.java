package com.taobao.linkmanager;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.flowcustoms.afc.utils.b;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.linkmanager.afc.utils.d;
import com.taobao.linkmanager.afc.utils.e;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.gvk;
import tb.kge;
import tb.koi;
import tb.max;

/* loaded from: classes.dex */
public class AfcLifeCycleCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LINK_COLD_START = "__link_cold_start__";
    public static boolean isLauncherStart;
    public static String jumpUrl;
    public static String landingUrl;
    private final Application.ActivityLifecycleCallbacks afcLifecycleCallbacks;
    private WeakReference<Activity> currentActivityRef;
    private boolean isNatureCold;
    private String mCurrentActivityCode;
    private String mCurrentActivityName;
    private String mCurrentActivityUrl;
    private String mPreActivityName;
    private String mPreActivityUrl;
    public List<Intent> nameList;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static AfcLifeCycleCenter f17664a;

        static {
            kge.a(-613015421);
            f17664a = new AfcLifeCycleCenter();
        }

        public static /* synthetic */ AfcLifeCycleCenter a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AfcLifeCycleCenter) ipChange.ipc$dispatch("b3033569", new Object[0]) : f17664a;
        }
    }

    public static /* synthetic */ void access$200(AfcLifeCycleCenter afcLifeCycleCenter, Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6f9f80a", new Object[]{afcLifeCycleCenter, activity, bundle});
        } else {
            afcLifeCycleCenter.activityCreateAction(activity, bundle);
        }
    }

    public static /* synthetic */ WeakReference access$302(AfcLifeCycleCenter afcLifeCycleCenter, WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("1743d2f7", new Object[]{afcLifeCycleCenter, weakReference});
        }
        afcLifeCycleCenter.currentActivityRef = weakReference;
        return weakReference;
    }

    public static /* synthetic */ String access$400(AfcLifeCycleCenter afcLifeCycleCenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("993f83ea", new Object[]{afcLifeCycleCenter}) : afcLifeCycleCenter.mCurrentActivityCode;
    }

    public static /* synthetic */ String access$402(AfcLifeCycleCenter afcLifeCycleCenter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9001c62", new Object[]{afcLifeCycleCenter, str});
        }
        afcLifeCycleCenter.mCurrentActivityCode = str;
        return str;
    }

    public static /* synthetic */ String access$502(AfcLifeCycleCenter afcLifeCycleCenter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60ec89e3", new Object[]{afcLifeCycleCenter, str});
        }
        afcLifeCycleCenter.mPreActivityName = str;
        return str;
    }

    public static /* synthetic */ String access$600(AfcLifeCycleCenter afcLifeCycleCenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50c27b6c", new Object[]{afcLifeCycleCenter}) : afcLifeCycleCenter.mCurrentActivityName;
    }

    public static /* synthetic */ String access$602(AfcLifeCycleCenter afcLifeCycleCenter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18d8f764", new Object[]{afcLifeCycleCenter, str});
        }
        afcLifeCycleCenter.mCurrentActivityName = str;
        return str;
    }

    public static /* synthetic */ String access$702(AfcLifeCycleCenter afcLifeCycleCenter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0c564e5", new Object[]{afcLifeCycleCenter, str});
        }
        afcLifeCycleCenter.mPreActivityUrl = str;
        return str;
    }

    public static /* synthetic */ String access$800(AfcLifeCycleCenter afcLifeCycleCenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84572ee", new Object[]{afcLifeCycleCenter}) : afcLifeCycleCenter.mCurrentActivityUrl;
    }

    public static /* synthetic */ String access$802(AfcLifeCycleCenter afcLifeCycleCenter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88b1d266", new Object[]{afcLifeCycleCenter, str});
        }
        afcLifeCycleCenter.mCurrentActivityUrl = str;
        return str;
    }

    static {
        kge.a(-1465657424);
        isLauncherStart = true;
    }

    public static AfcLifeCycleCenter instance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AfcLifeCycleCenter) ipChange.ipc$dispatch("d8868e9d", new Object[0]) : a.a();
    }

    private AfcLifeCycleCenter() {
        this.nameList = new ArrayList();
        this.isNatureCold = true;
        this.mCurrentActivityCode = "";
        this.mCurrentActivityName = "";
        this.mCurrentActivityUrl = "";
        this.mPreActivityName = "";
        this.mPreActivityUrl = "";
        this.afcLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.taobao.linkmanager.AfcLifeCycleCenter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                } else {
                    AfcLifeCycleCenter.access$200(AfcLifeCycleCenter.this, activity, bundle);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
                    return;
                }
                AfcLifeCycleCenter.access$302(AfcLifeCycleCenter.this, new WeakReference(activity));
                c.a("linkx", "AfcLifeCycleCenter: -->onActivityStarted -->" + activity.getClass().getSimpleName());
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                    return;
                }
                AfcLifeCycleCenter.access$302(AfcLifeCycleCenter.this, new WeakReference(activity));
                String b = AfcUtils.b(activity);
                if (!StringUtils.isEmpty(b) && !StringUtils.isEmpty(AfcLifeCycleCenter.access$400(AfcLifeCycleCenter.this)) && AfcLifeCycleCenter.access$400(AfcLifeCycleCenter.this).equals(b)) {
                    c.a("linkx", "AfcLifeCycleCenter: -->onActivityResumed === same page return === " + b);
                    return;
                }
                AfcLifeCycleCenter.access$402(AfcLifeCycleCenter.this, b);
                AfcLifeCycleCenter afcLifeCycleCenter = AfcLifeCycleCenter.this;
                AfcLifeCycleCenter.access$502(afcLifeCycleCenter, AfcLifeCycleCenter.access$600(afcLifeCycleCenter));
                AfcLifeCycleCenter afcLifeCycleCenter2 = AfcLifeCycleCenter.this;
                AfcLifeCycleCenter.access$702(afcLifeCycleCenter2, AfcLifeCycleCenter.access$800(afcLifeCycleCenter2));
                AfcLifeCycleCenter.access$602(AfcLifeCycleCenter.this, activity.getClass().getName());
                AfcLifeCycleCenter.access$802(AfcLifeCycleCenter.this, activity.getIntent() != null ? activity.getIntent().getDataString() : "");
                c.a("linkx", "AfcLifeCycleCenter: -->onActivityResumed -->" + b);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
                    return;
                }
                c.a("linkx", "AfcLifeCycleCenter: -->onActivityPaused -->" + activity.getClass().getSimpleName());
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                    return;
                }
                c.a("linkx", "AfcLifeCycleCenter: -->onActivityStopped -->" + activity.getClass().getSimpleName());
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                    return;
                }
                c.a("linkx", "AfcLifeCycleCenter: -->onActivityDestroyed -->" + activity.getClass().getSimpleName());
            }
        };
    }

    public void startMonitorSmartBanner(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c82118", new Object[]{this, application, hashMap});
            return;
        }
        AfcCustomSdk.a().b();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this.afcLifecycleCallbacks);
    }

    public Activity getCurrentActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this}) : this.currentActivityRef.get();
    }

    public String getCurrentActivityName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f54effc", new Object[]{this}) : this.mCurrentActivityName;
    }

    public String getCurrentActivityUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("52cb407c", new Object[]{this}) : this.mCurrentActivityUrl;
    }

    public String getPreActivityName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9710f312", new Object[]{this}) : this.mPreActivityName;
    }

    public String getPreActivityUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("849782a6", new Object[]{this}) : this.mPreActivityUrl;
    }

    public void callLinkActivityCreate(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e9df8", new Object[]{this, activity, bundle});
        } else if (activity == null || !d.a()) {
        } else {
            activityCreateAction(activity, bundle);
            koi.a().f30190a = new WeakReference<>(activity);
        }
    }

    private void activityCreateAction(final Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cf09e3a", new Object[]{this, activity, bundle});
            return;
        }
        c.a("linkx", "AfcLifeCycleCenter: -->onActivityCreated -->" + activity.getClass().getSimpleName());
        if (activity.getIntent() == null) {
            return;
        }
        if (d.a() && activity.getIntent().hasExtra("__link_cold_start__")) {
            return;
        }
        Intent intent = activity.getIntent();
        List<Intent> list = this.nameList;
        if (list == null || list.size() != 0) {
            z = false;
        } else {
            this.nameList.add(intent);
            boolean z2 = bundle != null;
            boolean isDeathRecoveryFromLaunch = isDeathRecoveryFromLaunch();
            if (!z2 && !isDeathRecoveryFromLaunch) {
                z = false;
            }
            c.b("linkx", "AfcLifeCycleCenter === onActivityCreated：启动的第一个intent:" + this.nameList.get(0) + ", savedInstanceState=" + z2 + ", deathRecoveryFromLaunch=" + isDeathRecoveryFromLaunch);
        }
        try {
            dealWithData(activity, intent, z);
        } catch (Exception e) {
            c.b("linkx", "AfcLifeCycleCenter === onActivityCreated：dealWithData异常了：" + e.getMessage());
            max.a("dealWithData", "exception=" + e + " ===intent:" + intent);
            StringBuilder sb = new StringBuilder();
            sb.append(e);
            sb.append("");
            String sb2 = sb.toString();
            max.a("afc_exception_dealWithData", sb2, intent + "", null);
        }
        com.taobao.flowcustoms.afc.utils.d.b.a(new Runnable() { // from class: com.taobao.linkmanager.AfcLifeCycleCenter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    b.a();
                } catch (Exception e2) {
                    c.a("linkx", "AfcLifeCycleCenter === onActivityCreated：sendLocalData异常了：" + e2.getMessage());
                    max.a("onActivityCreated", "当前页面：" + activity.getClass().getName() + "  上报缓存日志异常：" + e2);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(e2);
                    sb3.append("");
                    max.a("afc_exception_localData", sb3.toString(), activity.getClass().getName(), null);
                }
            }
        });
    }

    public void dealWithData(Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c089072", new Object[]{this, activity, intent});
        } else if (!d.e()) {
        } else {
            dealWithData(activity, intent, false);
        }
    }

    private void dealWithData(Activity activity, Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50a30a2", new Object[]{this, activity, intent, new Boolean(z)});
            return;
        }
        String simpleName = activity.getClass().getSimpleName();
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        String uri = data.toString();
        String a2 = AfcUtils.a(activity);
        c.a("linkx", "AfcLifeCycleCenter === dealWithData: activity名称为: " + simpleName + " url是: " + uri + " 包名：" + a2);
        if (this.isNatureCold && LauncherRuntime.a(this.nameList.get(0))) {
            this.isNatureCold = false;
            HashMap hashMap = new HashMap();
            hashMap.put("currentPackageName", "com.taobao.taobao");
            if (intent.hasExtra("afcTriggerType")) {
                hashMap.put("afcTriggerType", String.valueOf(intent.getIntExtra("afcTriggerType", 0)));
            }
            AfcUtils.a(AfcUtils.FlowType.LAUNCH, uri, hashMap);
            c.b("linkx", "AfcLifeCycleCenter === dealWithData: 自然冷启动埋点上报");
        } else if (!StringUtils.isEmpty(a2) && !StringUtils.equals("com.taobao.taobao", a2)) {
            isLauncherStart = false;
            afcLinkPoint(simpleName, data, uri, a2, intent);
        } else if (StringUtils.equals("true", intent.getStringExtra("afcDeskTopMessage"))) {
            isLauncherStart = false;
            afcMessagePoint(intent, uri);
        } else if (e.a(data)) {
            isLauncherStart = false;
            afcLinkPoint(simpleName, data, uri, a2, intent);
        } else if (this.isNatureCold && isLauncherStart && z) {
            this.isNatureCold = false;
            HashMap hashMap2 = new HashMap();
            hashMap2.put("currentPackageName", "com.taobao.taobao");
            hashMap2.put("generateType", gvk.EXTRA_KEY_DEATH_RECOVERY);
            hashMap2.put("activityName", simpleName);
            AfcUtils.a(AfcUtils.FlowType.LAUNCH, uri, hashMap2);
            c.b("linkx", "AfcLifeCycleCenter === dealWithData: 死亡恢复埋点上报");
        }
        c.a("linkx", "AfcLifeCycleCenter === dealWithData：isLauncherStart = " + isLauncherStart + ", isNatureCold=" + this.isNatureCold);
    }

    private void afcMessagePoint(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0dc595", new Object[]{this, intent, str});
            return;
        }
        c.b("linkx", "AfcLifeCycleCenter === onActivityCreated === 桌面触达打点走afc_message");
        String stringExtra = intent.getStringExtra("messageId");
        String stringExtra2 = intent.getStringExtra("source");
        HashMap hashMap = new HashMap();
        hashMap.put("messageId", stringExtra);
        hashMap.put("bc_fl_src", stringExtra2);
        AfcUtils.a(AfcUtils.FlowType.MESSAGE, str, hashMap);
    }

    private void afcLinkPoint(String str, Uri uri, String str2, String str3, Intent intent) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa5252f", new Object[]{this, str, uri, str2, str3, intent});
            return;
        }
        if (e.a(uri)) {
            c.b("linkx", "AfcLifeCycleCenter === onActivityCreated: 海关协议外链唤端,包名:" + str3);
        } else if (LauncherRuntime.a(intent)) {
            c.b("linkx", "AfcLifeCycleCenter === onActivityCreated: 温启桌面的场景,不做处理");
            return;
        } else {
            c.b("linkx", "AfcLifeCycleCenter === onActivityCreated: 非海关协议唤端,包名：" + str3 + " activity名称为: " + str + " activityUrl是: " + uri.toString());
            z = false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("packageName", str3);
        hashMap.put("activityName", str);
        hashMap.put("bc_fl_src", uri.getQueryParameter("bc_fl_src"));
        hashMap.put("url", str2);
        hashMap.put("is_link", z + "");
        AfcUtils.a(AfcUtils.FlowType.LINK, str2, hashMap);
        com.taobao.linkmanager.afc.utils.c.a(TbFcLinkInit.instance().mApplication);
    }

    private boolean isDeathRecoveryFromLaunch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4618107", new Object[]{this})).booleanValue();
        }
        try {
            int b = gvk.b(gvk.a());
            c.b("linkx", "AfcLifeCycleCenter === SimpleContext.restoreFromDeath: flag=" + b);
            return b == 2;
        } catch (Throwable th) {
            c.b("linkx", "AfcLifeCycleCenter === SimpleContext.restoreFromDeath: error=" + th.toString());
            return false;
        }
    }
}
