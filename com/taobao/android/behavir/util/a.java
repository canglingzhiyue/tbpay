package com.taobao.android.behavir.util;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.decision.BHRDecisionEngine;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.util.a;
import com.taobao.android.behavir.util.i;
import com.taobao.android.behavix.behavixswitch.j;
import com.taobao.android.testutils.a;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.dro;
import tb.kge;

/* loaded from: classes.dex */
public class a extends FragmentManager.FragmentLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final a f9150a;
    private static volatile C0353a b;
    private static WeakReference<Fragment> c;
    private static WeakReference<Activity> d;
    private static final List<String> e;
    private static volatile Pair<String, List<Runnable>> f;
    private static final List<String> g;
    private static Boolean h;
    private static JSONArray i;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    public static /* synthetic */ Pair a(Pair pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1ef953c", new Object[]{pair});
        }
        f = pair;
        return pair;
    }

    public static /* synthetic */ String a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cf9cba26", new Object[]{activity}) : b(activity);
    }

    public static /* synthetic */ void a(C0353a c0353a, int i2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d10ab56", new Object[]{c0353a, new Integer(i2), jSONObject});
        } else {
            b(c0353a, i2, jSONObject);
        }
    }

    public static /* synthetic */ C0353a e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C0353a) ipChange.ipc$dispatch("712c5f0d", new Object[0]) : b;
    }

    public static /* synthetic */ a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("593cf32b", new Object[0]) : f9150a;
    }

    public static /* synthetic */ List g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d0410f19", new Object[0]) : g;
    }

    public static /* synthetic */ Pair h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("e4aa4579", new Object[0]) : f;
    }

    static {
        kge.a(-750787619);
        kge.a(-1894394539);
        f9150a = new a();
        b = new C0353a();
        c = new WeakReference<>(null);
        d = new WeakReference<>(null);
        e = new CopyOnWriteArrayList();
        f = null;
        g = j();
        h = null;
    }

    private a() {
        i();
    }

    private static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[0]);
            return;
        }
        LocalBroadcastManager.getInstance(com.taobao.android.behavix.d.b()).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.behavir.util.ActivityMonitor$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (!com.taobao.android.behavix.behavixswitch.a.a("enableBizCustomSceneChanged", true)) {
                } else {
                    String stringExtra = intent.getStringExtra("scene");
                    String stringExtra2 = intent.getStringExtra("sceneUrl");
                    a.f();
                    a.a(new a.C0353a(stringExtra, stringExtra2, a.e()), 0, (JSONObject) intent.getSerializableExtra(e.BIZ_ARGS));
                }
            }
        }, new IntentFilter("BizCustomSceneChanged"));
        LocalBroadcastManager.getInstance(com.taobao.android.behavix.d.b()).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.behavir.util.ActivityMonitor$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(ActivityMonitor$2 activityMonitor$2, String str, Object... objArr) {
                str.hashCode();
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String stringExtra = intent.getStringExtra(PopLayer.EXTRA_KEY_FRAGMENT_NAME);
                if (TextUtils.isEmpty(stringExtra)) {
                    return;
                }
                if (a.g().contains(stringExtra)) {
                    BHREvent buildInternalEvent = BHREvent.buildInternalEvent(a.e().b, stringExtra, "");
                    buildInternalEvent.userId = "userId";
                    BHRDecisionEngine.a().a(buildInternalEvent);
                }
                final List<Runnable> a2 = a(stringExtra);
                a.a((Pair) null);
                if (a2 == null || a2.isEmpty()) {
                    return;
                }
                com.taobao.android.behavix.utils.e.a().postAtFrontOfQueue(new Runnable() { // from class: com.taobao.android.behavir.util.ActivityMonitor$2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        for (Runnable runnable : a2) {
                            try {
                                runnable.run();
                            } catch (Exception e2) {
                                d.a("ActivityMonitor", e2);
                            }
                        }
                    }
                });
            }

            private List<Runnable> a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (List) ipChange2.ipc$dispatch("287b5bd5", new Object[]{this, str});
                }
                Pair h2 = a.h();
                if (h2 != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty((CharSequence) h2.first) && ((String) h2.first).endsWith(str)) {
                    return (List) h2.second;
                }
                return null;
            }
        }, new IntentFilter(PopLayer.ACTION_FRAGMENT_SWITCH));
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : b.f9152a;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : b.b;
    }

    public static a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("fe3a0d68", new Object[0]) : f9150a;
    }

    private static String b(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("92892385", new Object[]{activity}) : (activity == null || activity.getIntent() == null) ? "" : activity.getIntent().getDataString();
    }

    public static void a(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            i.c(new i.a() { // from class: com.taobao.android.behavir.util.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.behavix.utils.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    Pair h2 = a.h();
                    if (h2 == null || !TextUtils.equals(a.e().f9152a, (CharSequence) h2.first)) {
                        runnable.run();
                        return;
                    }
                    ((List) h2.second).add(runnable);
                    TLog.loge("ActivityMonitor", "wait for fragment");
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else if (activity == null) {
        } else {
            if (!k()) {
                if (d.get() == activity) {
                    return;
                }
                d = new WeakReference<>(activity);
                c = new WeakReference<>(null);
            }
            b(new C0353a(activity, b), activity.hashCode(), null);
        }
    }

    public static void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{str, str2, jSONObject});
        } else {
            b(new C0353a(str, str2, b), 0, jSONObject);
        }
    }

    private static void b(C0353a c0353a, int i2, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f27d8b5", new Object[]{c0353a, new Integer(i2), jSONObject});
            return;
        }
        String str2 = c0353a.f9152a;
        String str3 = c0353a.b;
        if (b(str2)) {
            return;
        }
        if (TextUtils.equals(b.f9152a, str2) && TextUtils.equals(b.b, str3)) {
            return;
        }
        if (com.taobao.android.behavix.utils.d.b()) {
            UtUtils.a("UCP", UtUtils.a(), "ActivityMonitor", str2, b.f9152a, "");
            LogUtils.b("ActivityMonitor", str2, str3);
            TLog.loge("ActivityMonitor", str2, str3);
        }
        f = null;
        if (i2 > 0) {
            str = i2 + str3;
        } else {
            str = str3;
        }
        JSONObject a2 = Utils.a(jSONObject);
        a2.put("br_fromPage", (Object) c0353a.c);
        a2.put("br_fromPageUrl", (Object) c0353a.d);
        if (a.C0599a.a()) {
            HashMap hashMap = new HashMap();
            hashMap.put("uploadSource", "UCP");
            com.taobao.android.testutils.a.d("UCPLog", str2, str3, a2.toJSONString(), hashMap);
        }
        BHREvent bHREvent = new BHREvent(str3, str2, str, "pv");
        bHREvent.bizArgKVMapObject = a2;
        bHREvent.setExcludeToHistoryEventList(true);
        bHREvent.fromScene = c0353a.c;
        bHREvent.userId = "userId";
        b = c0353a;
        BHRDecisionEngine.a().a(bHREvent);
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c316b2", new Object[]{this, fragmentManager, fragment});
        } else if (fragment == null) {
        } else {
            if (!k()) {
                if (c.get() == fragment) {
                    return;
                }
                c = new WeakReference<>(fragment);
            }
            String name = fragment.getClass().getName();
            b(new C0353a(fragment, b), fragment.hashCode(), null);
            if (!g.contains(fragment.getClass().getSimpleName())) {
                return;
            }
            f = new Pair<>(name, new ArrayList());
        }
    }

    private static List<String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87269236", new Object[0]);
        }
        String b2 = com.taobao.android.behavix.behavixswitch.a.b(j.b.K_FRAGMENT_WAIT, (String) null);
        if (b2 == null) {
            return Collections.singletonList("HomepageFragment");
        }
        String[] split = b2.split(",");
        if (split != null) {
            return Arrays.asList(split);
        }
        return Collections.emptyList();
    }

    /* renamed from: com.taobao.android.behavir.util.a$a */
    /* loaded from: classes.dex */
    public static class C0353a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final String f9152a;
        public final String b;
        public String c;
        public String d;
        private WeakReference<Activity> e;

        static {
            kge.a(530511787);
        }

        public C0353a() {
            this.c = "-";
            this.d = "-";
            this.f9152a = "-";
            this.b = "-";
        }

        public C0353a(String str, String str2, C0353a c0353a) {
            this.c = "-";
            this.d = "-";
            if (c0353a != null) {
                this.c = c0353a.f9152a;
                this.d = c0353a.b;
            }
            this.f9152a = str;
            this.b = str2;
        }

        public C0353a(Fragment fragment, C0353a c0353a) {
            this.c = "-";
            this.d = "-";
            if (c0353a != null) {
                if (fragment.getActivity() == c0353a.a()) {
                    this.c = c0353a.c;
                    this.d = c0353a.d;
                } else {
                    this.c = c0353a.f9152a;
                    this.d = c0353a.b;
                }
            }
            this.e = null;
            this.f9152a = fragment.getClass().getName();
            this.b = a.a(fragment.getActivity());
        }

        public Activity a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Activity) ipChange.ipc$dispatch("2162bf40", new Object[]{this});
            }
            WeakReference<Activity> weakReference = this.e;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        public C0353a(Activity activity, C0353a c0353a) {
            this(activity.getClass().getName(), a.a(activity), c0353a);
            this.e = new WeakReference<>(activity);
        }
    }

    private static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue();
        }
        if (dro.e()) {
            return false;
        }
        if (h == null) {
            h = Boolean.valueOf(com.taobao.android.behavix.behavixswitch.a.b(j.b.K_BACKGROUND_SWITCH, false));
        }
        return Boolean.TRUE.equals(h);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (e.contains(str)) {
        } else {
            e.add(str);
        }
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : e.contains(str) || l().contains(str);
    }

    private static JSONArray l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("dad68ceb", new Object[0]);
        }
        JSONArray jSONArray = i;
        if (jSONArray != null) {
            return jSONArray;
        }
        String a2 = com.taobao.android.behavix.behavixswitch.a.a("ucpPageSwitchBalckList", "[\"com.taobao.tao.TBMainActivity\"]");
        if (!TextUtils.isEmpty(a2)) {
            return JSON.parseArray(a2);
        }
        return new JSONArray();
    }
}
