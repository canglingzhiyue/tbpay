package com.taobao.taobao.weex2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.fastjson.JSON;
import com.alibaba.ha.bizerrorreporter.c;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.weex.e;
import com.taobao.android.weex_ability.j;
import com.taobao.android.weex_ability.k;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.d;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_plugin.WeexInitSwitch;
import com.taobao.android.weex_plugin.WeexPlugin;
import com.taobao.search.musie.j;
import com.taobao.tao.Globals;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taobao.weex2.modules.AliMUSLoginModule;
import io.unicorn.adapter.UnicornAdapterJNI;
import io.unicorn.embedding.engine.a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.jqm;
import tb.riy;

/* loaded from: classes8.dex */
public class AppWeexEngineAutoInit implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String WX_LANGUAGE = "language";
    public static final String WX_V2_CONFIG = "weex_v2_config";
    private static boolean sInit = false;
    private static boolean sUnicornInit = false;

    public static void init(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{application});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (AppWeexEngineAutoInit.class) {
            if (sInit) {
                Log.e(g.TAG, "AppWeexEngineAutoInit.init already called");
                return;
            }
            sInit = true;
            WeexInitSwitch.loadRemoteQking(application);
            Log.e(g.TAG, "AppWeexEngineAutoInit.init initWeexEngine...");
            initWeexEngine(application);
            Log.e(g.TAG, "AppWeexEngineAutoInit.init initUnicornEngine...");
            initUnicornEngine(application);
            Log.e(g.TAG, "AppWeexEngineAutoInit.init done");
            Log.e(g.TAG, "AppWeexEngineAutoInit calling MuiseInitManager...");
            j.a(application);
            Log.e(g.TAG, "AppWeexEngineAutoInit all done");
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            Log.e(g.TAG, "Init weex2 cost: " + currentTimeMillis2);
            AppMonitor.register("weex2init", "init", new String[]{"alltime"}, (String[]) null, false);
            MeasureValueSet create = MeasureValueSet.create();
            create.setValue("alltime", (double) currentTimeMillis2);
            AppMonitor.Stat.commit("weex2init", "init", (DimensionValueSet) null, create);
        }
    }

    private static synchronized void initUnicornEngine(Application application) {
        synchronized (AppWeexEngineAutoInit.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84addeae", new Object[]{application});
            } else if (sUnicornInit) {
                Log.e(g.TAG, "AppWeexEngineAutoInit.initUnicornEngine already called");
            } else {
                sUnicornInit = true;
                if (UnicornAdapterJNI.instance().libraryLoaded()) {
                    Log.e(g.TAG, "AppWeexEngineAutoInit.initUnicornEngine already loaded so");
                    return;
                }
                Log.e(g.TAG, "AppWeexEngineAutoInit.initUnicornEngine calling UnicornAdapterJNI...");
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                UnicornAdapterJNI.instance().init(Globals.getApplication(), new a.e() { // from class: com.taobao.taobao.weex2.AppWeexEngineAutoInit.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // io.unicorn.embedding.engine.a.e
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        Log.e(g.TAG, "AppWeexEngineAutoInit.initUnicornEngine UnicornAdapterJNI finished");
                        if (io.unicorn.plugin.image.a.a().b() == null) {
                            io.unicorn.plugin.image.a.a().a(new k());
                        }
                        countDownLatch.countDown();
                    }
                });
                try {
                    if (!countDownLatch.await(8000L, TimeUnit.MILLISECONDS)) {
                        Log.e(g.TAG, "AppWeexEngineAutoInit.initUnicornEngine timeout");
                    }
                } catch (InterruptedException unused) {
                    Log.e(g.TAG, "AppWeexEngineAutoInit.initUnicornEngine interrupt");
                }
            }
        }
    }

    private static void initWeexEngine(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e81ae45", new Object[]{application});
            return;
        }
        com.taobao.android.weex_ability.j a2 = com.taobao.android.weex_ability.j.a();
        j.a.C0615a a3 = j.a.a().a(new d() { // from class: com.taobao.taobao.weex2.AppWeexEngineAutoInit.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.d
            public boolean a(Context context, p pVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("135030bb", new Object[]{this, context, pVar, str})).booleanValue();
                }
                String string = JSON.parseObject(str).getString("url");
                if (TextUtils.isEmpty(string)) {
                    return false;
                }
                if (!Nav.from(context).toUri(string)) {
                    Nav.from(context).toUri(string.trim());
                }
                return true;
            }

            @Override // com.taobao.android.weex_framework.d
            public boolean b(Context context, p pVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("cb3c9e3c", new Object[]{this, context, pVar, str})).booleanValue();
                }
                g.a("pop " + str);
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                }
                return true;
            }
        }).a(jqm.a()).a(new a()).a(new b()).a(getCustomEnv());
        a2.a(application, a3.a(" AliApp(TB/" + getAppVersion(application) + riy.BRACKET_END_STR).a());
        try {
            Map<String, Object> map = m.d().get("system");
            Double processStartUpTimestamp = WeexPlugin.getProcessStartUpTimestamp();
            if (processStartUpTimestamp != null) {
                map.put("processStartUpTimestamp", processStartUpTimestamp);
            }
        } catch (Exception e) {
            g.a(e);
        }
        registerModules();
        registerApplicationListener();
    }

    private static Map<String, Object> getCustomEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f9ec1e02", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appName", RVEnvironmentService.PLATFORM_TB);
        hashMap.put("ttid", TaoHelper.getTTID());
        return hashMap;
    }

    private static String getAppVersion(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41418815", new Object[]{application});
        }
        try {
            return application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
        } catch (Exception e) {
            g.a(e);
            return c._VERSION;
        }
    }

    private static void registerModules() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a295eb", new Object[0]);
        } else {
            MUSEngine.registerModule("user", AliMUSLoginModule.class);
        }
    }

    private static void registerApplicationListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6d59288", new Object[0]);
            return;
        }
        Map<String, Object> map = m.d() != null ? m.d().get("system") : null;
        if (map != null) {
            map.put("language", com.alibaba.ability.localization.b.a().getLanguage());
        }
        com.alibaba.ability.localization.b.a(new b.a() { // from class: com.taobao.taobao.weex2.AppWeexEngineAutoInit.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.ability.localization.b.a
            public void a(Language language, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("246661b", new Object[]{this, language, str});
                    return;
                }
                Map<String, Object> map2 = m.d() != null ? m.d().get("system") : null;
                if (map2 == null) {
                    return;
                }
                map2.put("language", language.getLanguage());
                e.a().a("language");
            }
        });
    }
}
