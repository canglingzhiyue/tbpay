package com.android.tools.ir.runtime;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.alibaba.android.split.p;
import com.android.alibaba.ip.runtime.AndroidInstantRuntime;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.server.InstantPatcher;
import com.android.alibaba.ip.server.Restarter;
import com.android.alibaba.ip.utils.RefectUtils;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import tb.cjd;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Executor f6433a = Executors.newSingleThreadExecutor();
    private List<a> b;
    private Lock c;
    private Application d;
    private SharedPreferences e;
    private UncaughtCrashHeader f;

    /* loaded from: classes.dex */
    public interface a {
        void a(Thread thread, Throwable th, Map<String, Object> map);
    }

    /* loaded from: classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static d f6443a = new d();

        public static /* synthetic */ d a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("ddafde14", new Object[0]) : f6443a;
        }
    }

    public static /* synthetic */ Application a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("fc95c51d", new Object[]{dVar}) : dVar.d;
    }

    public static /* synthetic */ Pair a(d dVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("e4b9f9e2", new Object[]{dVar, str}) : dVar.a(str);
    }

    public static /* synthetic */ List a(d dVar, Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("27231a27", new Object[]{dVar, activity}) : dVar.a(activity);
    }

    public static /* synthetic */ SharedPreferences b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("b5da1be3", new Object[]{dVar}) : dVar.e;
    }

    public static /* synthetic */ void c(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b544b250", new Object[]{dVar});
        } else {
            dVar.d();
        }
    }

    public static /* synthetic */ Lock d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Lock) ipChange.ipc$dispatch("35337d8", new Object[]{dVar}) : dVar.c;
    }

    public static /* synthetic */ List e(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("204d6ab5", new Object[]{dVar}) : dVar.b;
    }

    public Application a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("f921f837", new Object[]{this}) : this.d;
    }

    private d() {
        this.f = TCrashSDK.instance().getCrashCaughtHeader();
        this.b = new ArrayList();
        this.c = new ReentrantLock();
    }

    public static d b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("51ef1673", new Object[0]) : b.a();
    }

    public void a(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        this.d = application;
        this.e = PreferenceManager.getDefaultSharedPreferences(this.d);
        a aVar = new a() { // from class: com.android.tools.ir.runtime.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.android.tools.ir.runtime.d.a
            public void a(Thread thread, Throwable th, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8fe17609", new Object[]{this, thread, th, map});
                    return;
                }
                ApplicationInfo applicationInfo = null;
                if (d.a(d.this) != null) {
                    applicationInfo = d.a(d.this).getApplicationInfo();
                }
                if (applicationInfo != null) {
                    map.put("apksize", Long.valueOf(new File(cjd.c).length()));
                    map.put("nativepath_exist", applicationInfo.nativeLibraryDir + "_" + new File(applicationInfo.nativeLibraryDir).exists());
                }
                map.put("patchVersion", d.b(d.this).getString("instantpatch_effective_version", ""));
            }
        };
        a aVar2 = new a() { // from class: com.android.tools.ir.runtime.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.android.tools.ir.runtime.d.a
            public void a(Thread thread, Throwable th, Map<String, Object> map) {
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8fe17609", new Object[]{this, thread, th, map});
                } else if (Build.VERSION.SDK_INT != 22 && Build.VERSION.SDK_INT != 21) {
                } else {
                    try {
                        str = d.a(d.this).getPackageManager().getPackageInfo(d.a(d.this).getPackageName(), 0).versionName;
                    } catch (PackageManager.NameNotFoundException e) {
                        e.printStackTrace();
                        str = "";
                    }
                    if (!(th instanceof NoClassDefFoundError)) {
                        return;
                    }
                    SharedPreferences b2 = d.b(d.this);
                    boolean z = b2.getBoolean("fixdex2oat_" + str, false);
                    map.put("fixed_oat", Boolean.valueOf(z));
                    Pair a2 = d.a(d.this, th.getMessage());
                    map.put("class_count", a2.first);
                    map.put("class_exist", a2.second);
                    if (((Integer) a2.first).intValue() >= 70000) {
                        return;
                    }
                    Log.e("CrashDataMonitor", "classes count:" + a2.first);
                    if (!z) {
                        SharedPreferences.Editor edit = d.b(d.this).edit();
                        edit.putBoolean("need_dex2oat_" + str, true).apply();
                        d.f6433a.execute(new Runnable() { // from class: com.android.tools.ir.runtime.d.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    d.a(d.this).startService(new Intent(d.a(d.this), Dex2oatService.class));
                                }
                            }
                        });
                        return;
                    }
                    Log.e("CrashDataMonitor", "new oat File is generate but also crash so need reinstall");
                    SharedPreferences.Editor edit2 = d.b(d.this).edit();
                    edit2.putBoolean("should_reinstall_" + str, true).apply();
                    cjd.e(d.a(d.this));
                }
            }
        };
        a aVar3 = new a() { // from class: com.android.tools.ir.runtime.d.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.android.tools.ir.runtime.d.a
            public void a(Thread thread, Throwable th, Map<String, Object> map) {
                String str;
                IpChange ipChange2 = $ipChange;
                int i = 0;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8fe17609", new Object[]{this, thread, th, map});
                } else if (th instanceof Resources.NotFoundException) {
                    try {
                        str = d.a(d.this).getPackageManager().getPackageInfo(d.a(d.this).getPackageName(), 0).versionName;
                    } catch (PackageManager.NameNotFoundException e) {
                        e.printStackTrace();
                        str = "";
                    }
                    d.b(d.this).edit().putBoolean("should_checkRes_" + str, true).apply();
                    if (com.taobao.application.common.c.b() != null) {
                        map.put("top_act_AssetsManager", com.taobao.application.common.c.b().getAssets() + " " + d.a(d.this, com.taobao.application.common.c.b()));
                        map.put("top_act_name", com.taobao.application.common.c.b().toString());
                    }
                    List<Activity> activities = Restarter.getActivities(application, false);
                    if (activities == null) {
                        return;
                    }
                    for (Activity activity : activities) {
                        map.put("actAssets_" + i, activity.getAssets() + " " + d.a(d.this, activity));
                        StringBuilder sb = new StringBuilder();
                        sb.append("act_name_");
                        sb.append(i);
                        map.put(sb.toString(), activity.toString());
                        i++;
                    }
                }
            }
        };
        a aVar4 = new a() { // from class: com.android.tools.ir.runtime.d.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.android.tools.ir.runtime.d.a
            public void a(Thread thread, Throwable th, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8fe17609", new Object[]{this, thread, th, map});
                } else if (th == null || th.getStackTrace().length <= 1) {
                } else {
                    if (!(th instanceof NoSuchMethodException) && !(th instanceof NoSuchFieldException) && !(th instanceof NoSuchMethodError) && !(th instanceof NoSuchFieldError)) {
                        return;
                    }
                    String className = th.getStackTrace()[0].getClassName();
                    String className2 = th.getStackTrace()[1].getClassName();
                    if (!className.endsWith("$ipReplace") && !className.equals(AndroidInstantRuntime.class.getName()) && !className2.endsWith("$ipReplace")) {
                        return;
                    }
                    d.c(d.this);
                }
            }
        };
        a(aVar);
        a(aVar2);
        a(aVar3);
        a(aVar4);
        a(new a() { // from class: com.android.tools.ir.runtime.d.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.android.tools.ir.runtime.d.a
            public void a(Thread thread, Throwable th, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8fe17609", new Object[]{this, thread, th, map});
                } else {
                    map.put("update_progress", System.getProperty("update_patch", "no inited"));
                }
            }
        });
        a(new a() { // from class: com.android.tools.ir.runtime.d.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.android.tools.ir.runtime.d.a
            public void a(Thread thread, Throwable th, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8fe17609", new Object[]{this, thread, th, map});
                } else {
                    map.put("installed_features", p.a() == null ? "" : p.a().a());
                }
            }
        });
        a(new a() { // from class: com.android.tools.ir.runtime.d.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.android.tools.ir.runtime.d.a
            public void a(Thread thread, Throwable th, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8fe17609", new Object[]{this, thread, th, map});
                    return;
                }
                try {
                    map.put("dynamic_deploy_features", com.android.tools.bundleInfo.c.a().a(cjd.f26302a));
                    map.put("featureUpdateVersion", com.android.tools.bundleInfo.c.a().b(cjd.f26302a));
                    Set<String> b2 = com.android.tools.bundleInfo.d.a().b();
                    map.put("featureUpdateVersion2", b2);
                    for (String str : b2) {
                        map.put("dynamic_deploy_features2_" + str, com.android.tools.bundleInfo.d.a().f(str));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        c();
    }

    private List<Object> a(Activity activity) {
        ArrayList arrayList = new ArrayList();
        AssetManager assets = activity.getAssets();
        try {
            Field declaredField = AssetManager.class.getDeclaredField("mApkAssets");
            declaredField.setAccessible(true);
            Object[] objArr = (Object[]) declaredField.get(assets);
            if (objArr != null) {
                for (Object obj : objArr) {
                    arrayList.add(obj);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3b467f1", new Object[]{this, aVar});
            return;
        }
        this.c.lock();
        ArrayList arrayList = new ArrayList(this.b);
        arrayList.add(aVar);
        this.b.clear();
        this.b.addAll(arrayList);
        this.c.unlock();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        TCrashSDK.instance().addJvmUncaughtCrashListener(new JvmUncaughtCrashListener() { // from class: com.android.tools.ir.runtime.d.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
            public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
                }
                HashMap hashMap = new HashMap();
                try {
                    d.d(d.this).lock();
                    ArrayList arrayList = new ArrayList(d.e(d.this));
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((a) arrayList.get(i)).a(thread, th, hashMap);
                    }
                    return hashMap;
                } finally {
                    d.d(d.this).unlock();
                }
            }
        });
        try {
            this.f.addHeaderInfo("apksize", String.valueOf(new File(cjd.c).length()));
            this.f.addHeaderInfo("apk_channel", this.d.getResources().getString(this.d.getResources().getIdentifier("ttid", "string", this.d.getPackageName())));
            this.f.addHeaderInfo("featureUpdateVersion", com.android.tools.bundleInfo.c.a().b(cjd.f26302a));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        String string = PreferenceManager.getDefaultSharedPreferences(this.d).getString("instantpatch_effective_version", "");
        if (PreferenceManager.getDefaultSharedPreferences(this.d).getString("instantpatch_invalid_version", "").equals(string)) {
            return;
        }
        Log.e("CrashDataMonitor", "clear patchinfo " + string + "because patch proplem");
        InstantPatcher.create(this.d).purge();
        com.taobao.update.datasource.local.a.getInstance(this.d).clearCache();
        PreferenceManager.getDefaultSharedPreferences(this.d).edit().putString("instantpatch_invalid_version", string).apply();
    }

    private Pair<Integer, Boolean> a(String str) {
        Object fieldGet;
        Field field;
        Object[] objArr;
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c2e055fc", new Object[]{this, str});
        }
        String[] strArr = null;
        Field field2 = RefectUtils.field(getClass().getClassLoader(), "pathList");
        if (field2 != null && (fieldGet = RefectUtils.fieldGet(getClass().getClassLoader(), field2)) != null && (field = RefectUtils.field(fieldGet, "dexElements")) != null && (objArr = (Object[]) RefectUtils.fieldGet(fieldGet, field)) != null && objArr.length > 0) {
            String[] strArr2 = null;
            for (Object obj : objArr) {
                DexFile dexFile = (DexFile) RefectUtils.fieldGet(obj, RefectUtils.field(obj, "dexFile"));
                if (dexFile.getName().toLowerCase().contains("taobao")) {
                    strArr2 = (String[]) RefectUtils.fieldGet(dexFile.entries(), RefectUtils.field(dexFile.entries(), "mNameList"));
                }
            }
            strArr = strArr2;
        }
        if (strArr != null && !TextUtils.isEmpty(str)) {
            for (String str2 : strArr) {
                if (str.equals(str2)) {
                    break;
                }
            }
        }
        z = false;
        if (strArr != null) {
            i = strArr.length;
        }
        return new Pair<>(Integer.valueOf(i), Boolean.valueOf(z));
    }
}
