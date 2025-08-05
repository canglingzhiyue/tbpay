package com.taobao.android.live.plugin.proxy;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.split.core.splitinstall.h;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.android.split.core.splitinstall.m;
import com.alibaba.android.split.core.splitinstall.o;
import com.alibaba.android.split.k;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.DynamicFeatureInfo;
import com.android.tools.bundleInfo.b;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.themis.kernel.logger.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bhc;
import tb.bhe;
import tb.cak;
import tb.kge;
import tb.phg;
import tb.pmd;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATYPE = "liveroom_android_plugin_AType";
    public static final String BTYPE = "liveroom_android_plugin_BType";
    public static final String TAOLIVE_HOMEPAGE = "LivehomeAtype";
    public static final String TAO_LIVE_HOME_ACTIVITY = "com.taobao.taolivehome.TaoLiveHomepageActivity";
    public static final String TAO_LIVE_VIDEO_ACTIVITY = "com.taobao.taolive.room.TaoLiveVideoActivity";
    public static final String TBLIVE_GIFT = "tblive_gift_android";

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f14097a;
    private static final boolean b;
    private static final boolean c;
    private static final AtomicBoolean j;
    private static final Map<String, String> o;
    private final Map<String, cak> d;
    private final Map<String, DynamicFeatureInfo> e;
    private final Map<String, Boolean> f;
    private SharedPreferences g;
    private int h;
    private int i;
    private com.alibaba.android.split.core.splitinstall.g m;
    private final Map<Integer, String> n;
    private final Set<String> p;

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final e f14104a;

        static {
            kge.a(34274719);
            f14104a = new e();
        }

        public static /* synthetic */ e a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("2b0a8925", new Object[0]) : f14104a;
        }
    }

    public static /* synthetic */ int a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c68ff912", new Object[]{eVar})).intValue() : eVar.h;
    }

    public static /* synthetic */ int a(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6f9db7", new Object[]{eVar, new Integer(i)})).intValue();
        }
        eVar.h = i;
        return i;
    }

    public static /* synthetic */ void a(e eVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8629c389", new Object[]{eVar, context});
        } else {
            eVar.a(context);
        }
    }

    public static /* synthetic */ void a(e eVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d35aa086", new Object[]{eVar, map});
        } else {
            eVar.a(map);
        }
    }

    public static /* synthetic */ int b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6130bb93", new Object[]{eVar})).intValue() : eVar.i;
    }

    public static /* synthetic */ int b(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4e72b56", new Object[]{eVar, new Integer(i)})).intValue();
        }
        eVar.i = i;
        return i;
    }

    public static /* synthetic */ Map c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8357c296", new Object[]{eVar}) : eVar.n;
    }

    public static /* synthetic */ Map d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("940d8f57", new Object[]{eVar}) : eVar.d;
    }

    public static /* synthetic */ Application i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("43a11c3f", new Object[0]) : f();
    }

    static {
        kge.a(1919789105);
        f14097a = Log.isLoggable("FlexaLiveXToast", 2);
        b = Log.isLoggable("FlexaLiveXLocal", 2);
        c = d.a(".flexa_live_x_local");
        j = new AtomicBoolean(false);
        o = new HashMap();
    }

    private e() {
        Map<String, String> configs;
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.p = new CopyOnWriteArraySet();
        this.h = -2333;
        this.i = -23333;
        this.n = new HashMap<Integer, String>() { // from class: com.taobao.android.live.plugin.proxy.FlexaLiveX$1
            {
                e.this = this;
                put(0, "UNKNOWN");
                put(1, "PENDING");
                put(2, "DOWNLOADING");
                put(3, "DOWNLOADED");
                put(4, "INSTALLING");
                put(5, "INSTALLED");
                put(6, "FAILED");
                put(7, "CANCELING");
                put(8, "CANCELED");
                put(9, "SUSPEND");
                put(10, "VERIFYING");
                put(11, "LOADING");
                put(12, "UNINSTALL");
                put(13, a.EVENT_DOWNLOAD_FINISH);
            }
        };
        try {
            o.put(ATYPE, "com.taobao.android.live.plugin.atype.flexaremote.ATypeInitial");
            o.put(BTYPE, "com.taobao.android.live.plugin.btype.flexaremote.BTypeInitial");
            o.put(TBLIVE_GIFT, "com.taobao.android.live.plugin.btype.flexaremote.TBLiveGiftInitial");
            o.put(TAOLIVE_HOMEPAGE, "com.taobao.android.livehome.plugin.atype.flexaremote.LiveHomeInitial");
            this.g = f().getSharedPreferences("tblive_remote_plugin", 0);
            configs = OrangeConfig.getInstance().getConfigs("tblive_remote_plugin");
        } catch (Throwable th) {
            c("[FlexaLiveX<init>] error: " + th.getMessage());
            th.printStackTrace();
        }
        try {
            if (configs != null && !configs.isEmpty()) {
                a(configs);
                this.m = h.a(f());
                this.m.a(new o() { // from class: com.taobao.android.live.plugin.proxy.e.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.android.split.core.listener.b
                    public /* synthetic */ void onStateUpdate(m mVar) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("bd17bbbe", new Object[]{this, mVar});
                        } else {
                            a(mVar);
                        }
                    }

                    public void a(m mVar) {
                        String str;
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("398f1780", new Object[]{this, mVar});
                        } else if (mVar == null) {
                        } else {
                            if (mVar.a() == e.a(e.this)) {
                                str = e.ATYPE;
                            } else {
                                str = mVar.a() == e.b(e.this) ? e.BTYPE : null;
                            }
                            if (TextUtils.isEmpty(str)) {
                                return;
                            }
                            e.c("[onStateUpdate] module: " + str + ", " + ((String) e.c(e.this).get(Integer.valueOf(mVar.b()))) + " , state: " + mVar);
                        }
                    }
                });
                if (phg.d() == null || !phg.d().a()) {
                    return;
                }
                c("[FlexaLiveX<init>] isDianTaoApp");
                j();
                e();
                return;
            }
            if (phg.d() == null) {
                return;
            }
            return;
        } catch (Throwable th2) {
            c("[FlexaLiveX<init> for dt] error: " + th2.getMessage());
            th2.printStackTrace();
            return;
        }
        OrangeConfig.getInstance().registerListener(new String[]{"tblive_remote_plugin"}, new com.taobao.orange.d() { // from class: com.taobao.android.live.plugin.proxy.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                } else {
                    e.a(e.this, map);
                }
            }
        }, true);
        this.m = h.a(f());
        this.m.a(new o() { // from class: com.taobao.android.live.plugin.proxy.e.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.split.core.listener.b
            public /* synthetic */ void onStateUpdate(m mVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bd17bbbe", new Object[]{this, mVar});
                } else {
                    a(mVar);
                }
            }

            public void a(m mVar) {
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("398f1780", new Object[]{this, mVar});
                } else if (mVar == null) {
                } else {
                    if (mVar.a() == e.a(e.this)) {
                        str = e.ATYPE;
                    } else {
                        str = mVar.a() == e.b(e.this) ? e.BTYPE : null;
                    }
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    e.c("[onStateUpdate] module: " + str + ", " + ((String) e.c(e.this).get(Integer.valueOf(mVar.b()))) + " , state: " + mVar);
                }
            }
        });
    }

    private void j() {
        try {
            Class<?> cls = Class.forName("com.taobao.android.live.plugin.btype.flexaremote.BTypeInitial");
            c("[FlexaLiveX<init>] isDianTaoApp  bTypeInitial forName success");
            c("[FlexaLiveX<init>] isDianTaoApp  bTypeInitial newInstance success");
            ((cak) cls.newInstance()).init(f(), null);
            c("[FlexaLiveX<init>] isDianTaoApp  bTypeInitial init success");
        } catch (Exception e) {
            c("[FlexaLiveX<init>] isDianTaoApp e: " + e.getMessage());
        }
    }

    private void e() {
        try {
            Class<?> cls = Class.forName("com.taobao.android.live.plugin.btype.flexaremote.TBLiveGiftInitial");
            c("[FlexaLiveX<init>] isDianTaoApp  tbliveGiftInitial forName success");
            c("[FlexaLiveX<init>] isDianTaoApp  tbliveGiftInitial newInstance success");
            ((cak) cls.newInstance()).init(f(), null);
            c("[FlexaLiveX<init>] isDianTaoApp  tbliveGiftInitial init success");
        } catch (Exception e) {
            c("[FlexaLiveX<init>] isDianTaoApp e: " + e.getMessage());
        }
    }

    private void a(Map<String, String> map) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null && entry.getKey() != null && entry.getValue() != null && (sharedPreferences = this.g) != null) {
                    sharedPreferences.edit().putString(entry.getKey(), entry.getValue()).apply();
                }
            }
        }
    }

    public static e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("2b0a8925", new Object[0]) : a.a();
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        SharedPreferences sharedPreferences = this.g;
        if (sharedPreferences == null) {
            return true;
        }
        String string = sharedPreferences.getString(str, null);
        if (TextUtils.isEmpty(string)) {
            c("[getOrangeValue] not set orange value, default true, key = " + str);
            return true;
        }
        c("[getOrangeValue] key = " + str + ", value = " + string);
        return "true".equals(string);
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        boolean z = b && c;
        c("[useLocalPlugin] local force: " + z);
        if (z) {
            return true;
        }
        if (phg.d().a()) {
            c("[useLocalPlugin] isDianTaoApp, return");
            return true;
        } else if (TextUtils.isEmpty(str) || a().a(str)) {
            return false;
        } else {
            c("[useLocalPlugin] orange value = false");
            return true;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        boolean z = b && c;
        c("[btype] force close plugin: " + z);
        return z;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : f14097a;
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (!com.taobao.taolive.room.utils.d.a()) {
                Log.e("FlexaLiveX", str);
            }
            TLog.loge(MediaConstant.LBLIVE_SOURCE, "FlexaLiveX", String.valueOf(str));
        }
    }

    public static void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{new Boolean(z), str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("remotePlugin", String.valueOf(z));
        hashMap.put("pluginName", str);
        if (pmd.a().e() == null) {
            return;
        }
        pmd.a().e().b("Page_TaobaoLiveWatch", "TaoLiveRoomFlexa", hashMap);
    }

    public DynamicFeatureInfo d(String str) {
        com.alibaba.android.split.core.splitinstall.g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicFeatureInfo) ipChange.ipc$dispatch("e10cbf84", new Object[]{this, str});
        }
        DynamicFeatureInfo c2 = b.a().c(ATYPE);
        if (b.a().c(str) != null && (gVar = this.m) != null && gVar.a().contains(str)) {
            return c2;
        }
        return null;
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            DynamicFeatureInfo d = d(str);
            if (d == null) {
                c("[tryToDownloadRemoteInner] try to download, module: " + str);
            } else {
                this.e.put(str, d);
                c("[tryToDownloadRemoteInner] has feature, name: " + d.featureName);
            }
            b(str, str2);
            c("[tryToDownloadRemoteInner] start download, module: " + str);
        }
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        a().a(TAOLIVE_HOMEPAGE, false, context);
        a().a(ATYPE, false, context);
        a().a(BTYPE, false, context);
    }

    public void a(final String str, boolean z, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79678126", new Object[]{this, str, new Boolean(z), context});
            return;
        }
        c("[tryToDownloadRemoteModule] start");
        c("[tryToDownloadRemoteModule] download  moduleName: " + str);
        if (j.compareAndSet(false, true) && f() != null) {
            f().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.taobao.android.live.plugin.proxy.e.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a4658a75", new Object[]{this, activity});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5e01616c", new Object[]{this, activity});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                        return;
                    }
                    String name = activity.getClass().getName();
                    if (e.TAO_LIVE_VIDEO_ACTIVITY.equals(name)) {
                        c.a().f();
                        e.a(e.this, activity);
                        e.h();
                        e.c("[onActivityCreated] FlexaLiveX  activityName: " + name + ", moduleName: " + str);
                    } else if (!e.TAO_LIVE_HOME_ACTIVITY.equals(name)) {
                    } else {
                        c.a().f();
                        e.a(e.this, activity);
                        e.h();
                        e.c("[onActivityCreated] FlexaLiveX  activityName: " + name + ", moduleName: " + str);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4148cc84", new Object[]{this, activity});
                        return;
                    }
                    String name = activity.getClass().getName();
                    if (e.TAO_LIVE_VIDEO_ACTIVITY.equals(name)) {
                        c.a().f();
                        e.c("[onActivityDestroyed] FlexaLiveX  activityName: " + name + ", moduleName: " + str);
                    } else if (!e.TAO_LIVE_HOME_ACTIVITY.equals(name)) {
                    } else {
                        c.a().f();
                        e.c("[onActivityDestroyed] FlexaLiveX  activityName: " + name + ", moduleName: " + str);
                    }
                }
            });
        }
        ArrayList<String> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 1359473751) {
            if (hashCode == 1360397272 && str.equals(BTYPE)) {
                c2 = 1;
            }
        } else if (str.equals(ATYPE)) {
            c2 = 0;
        }
        if (c2 == 0) {
            arrayList.add(ATYPE);
            arrayList2.add("com.taobao.android.live.plugin.atype.flexaremote.ATypeInitial");
            arrayList.add(TAOLIVE_HOMEPAGE);
            arrayList2.add("com.taobao.android.livehome.plugin.atype.flexaremote.LiveHomeInitial");
        } else if (c2 == 1) {
            arrayList.add(BTYPE);
            arrayList2.add("com.taobao.android.live.plugin.btype.flexaremote.BTypeInitial");
            arrayList.add(TBLIVE_GIFT);
            arrayList2.add("com.taobao.android.live.plugin.btype.flexaremote.TBLiveGiftInitial");
        }
        if (arrayList2.size() == 0) {
            return;
        }
        for (String str2 : arrayList) {
            c(str2, o.get(str2));
        }
    }

    private void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
            return;
        }
        c("[tryToDownloadRemoteModuleInner] module: " + str);
        if (str2 == null) {
            return;
        }
        this.p.add(str);
        d(str, str2);
        a(str, str2);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        boolean z = Build.VERSION.SDK_INT > 29;
        c("[enableSyncLoadRemoteModule] SDK_INT: " + Build.VERSION.SDK_INT);
        if (!z) {
            c("[enableSyncLoadRemoteModule] greaterThanQ false, return");
            return false;
        } else if (Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tblive_remote_plugin", "enableSyncLoadRemoteModule", "false"))) {
            return true;
        } else {
            c("[enableSyncLoadRemoteModule] enable false, return");
            return false;
        }
    }

    private void d(String str, String str2) {
        if (!d()) {
            c("[tryToSyncLoadRemoteModule] enableSyncLoadRemoteModule false, return");
            return;
        }
        Activity b2 = com.taobao.application.common.c.b();
        if (b2 != null) {
            try {
                Boolean bool = this.f.get(str);
                if (bool != null && bool.booleanValue()) {
                    c("[tryToSyncLoadRemoteModule] module already loaded, module: " + str);
                    k.a().c(b2, str);
                    return;
                }
                c("[tryToSyncLoadRemoteModule] load, module: " + str + ", startTime: " + SystemClock.uptimeMillis());
                try {
                    k.a().a(com.taobao.appbundle.c.Companion.a().a(), false, str);
                    k.a().c(b2, str);
                    Class<?> cls = Class.forName(str2);
                    cls.getDeclaredMethod("init", Application.class, Bundle.class).invoke(cls.newInstance(), null, null);
                    this.f.put(str, true);
                    c("[tryToSyncLoadRemoteModule] load, " + str2 + "#init success ");
                } catch (Exception e) {
                    c("[tryToSyncLoadRemoteModule] load, " + str2 + "#init fail: " + e.getMessage());
                }
                c("[tryToSyncLoadRemoteModule] load, module: " + str + ", endTime: " + SystemClock.uptimeMillis());
                return;
            } catch (Exception e2) {
                c("[tryToSyncLoadRemoteModule] start load, module: " + str + ", error: " + e2.getMessage());
                return;
            }
        }
        c("[tryToSyncLoadRemoteModule] load, context null");
    }

    private void b(final String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        c("[tryToDownloadRemoteModule] load, moduleName: " + str + ", classInital: " + str2);
        com.alibaba.android.split.core.tasks.e<Integer> eVar = (ATYPE.equals(str) || BTYPE.equals(str)) ? new com.alibaba.android.split.core.tasks.e<Integer>() { // from class: com.taobao.android.live.plugin.proxy.e.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.split.core.tasks.e
            public /* synthetic */ void onSuccess(Integer num) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, num});
                } else {
                    a(num);
                }
            }

            public void a(Integer num) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6cdec50f", new Object[]{this, num});
                } else if (num == null) {
                } else {
                    if (e.ATYPE.equals(str)) {
                        e.a(e.this, num.intValue());
                    } else if (e.BTYPE.equals(str)) {
                        e.b(e.this, num.intValue());
                    }
                    try {
                        e.c("[downloadAType] " + str + " start success");
                    } catch (Throwable unused) {
                    }
                }
            }
        } : null;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        j a2 = j.a().a(bhe.a(f(), str2).a(new bhc.b<cak>() { // from class: com.taobao.android.live.plugin.proxy.e.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bhc.b
            public void a(cak cakVar, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("35478f09", new Object[]{this, cakVar, bundle});
                    return;
                }
                if (com.taobao.application.common.c.b() != null) {
                    k.a().c(com.taobao.application.common.c.b(), str);
                    e.c("[downloadRemoteModuleInner] InstantiationCallBack#onInstantiate  apm activity is not null, try res inject, activity: " + com.taobao.application.common.c.b().toString());
                } else {
                    e.c("[downloadRemoteModuleInner] InstantiationCallBack#onInstantiate  apm activity is null, res inject fail");
                }
                cak cakVar2 = (cak) e.d(e.this).get(str);
                if (cakVar2 == null) {
                    e.d(e.this).put(str, cakVar);
                    cakVar.init(e.i(), bundle);
                    e.c("[downloadRemoteModuleInner] InstantiationCallBack#onInstantiate  moduleName: " + str + ", featureInitial: " + cakVar.getClass().getName());
                    return;
                }
                e.c("[downloadRemoteModuleInner] InstantiationCallBack#onInstantiate feature class has init, moduleName: " + str + ", featureInitial: " + cakVar2.getClass().getName());
            }

            @Override // tb.bhc.b
            public void a(String str3, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str3, bundle});
                    return;
                }
                e.c("[downloadRemoteModuleInner] InstantiationCallBack#onFailure  moduleName: " + str + ", message: " + str3);
            }
        }).a()).a();
        com.alibaba.android.split.core.splitinstall.g gVar = this.m;
        if (gVar == null) {
            return;
        }
        gVar.a(a2).a(eVar).a(new com.alibaba.android.split.core.tasks.d() { // from class: com.taobao.android.live.plugin.proxy.e.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.split.core.tasks.d
            public void onFailure(Exception exc) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                    return;
                }
                e.c("[downloadRemoteModuleInner] " + str + " download fail");
            }
        });
    }

    private static Application f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("c7b16ebc", new Object[0]);
        }
        try {
            if (phg.d() != null && phg.d().a()) {
                return pmd.a().u().c();
            }
            return com.taobao.appbundle.c.Companion.a().a();
        } catch (Throwable th) {
            c("[getApplication] error: " + th.getMessage());
            return com.taobao.appbundle.c.Companion.a().a();
        }
    }

    public Set<String> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("7215bcdd", new Object[]{this}) : this.p;
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
            return;
        }
        try {
            if (com.taobao.application.common.c.b() != null) {
                c("[installLiveContextResource] start, ATYPE, BTYPE, TBLIVE_GIFT, TAOLIVE_HOMEPAGE, activity: " + com.taobao.application.common.c.b().toString());
                k.a().c(com.taobao.application.common.c.b(), ATYPE, BTYPE, TBLIVE_GIFT, TAOLIVE_HOMEPAGE);
                c("[installLiveContextResource] success");
                return;
            }
            c("[installLiveContextResource] fail, apm activity is null");
        } catch (Throwable th) {
            c("[installLiveContextResource] fail, error: " + th.getMessage());
        }
    }
}
