package com.taobao.android.autosize.config;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f9098a;
    private static final String u = null;
    private Application c;
    private final String[] b = {"23043RP34C"};
    private boolean d = true;
    private boolean e = false;
    private final List<String> f = new ArrayList();
    private boolean g = false;
    private boolean h = false;
    private boolean p = false;
    private boolean q = false;
    private boolean r = false;
    @Deprecated
    private boolean i = false;
    @Deprecated
    private final List<String> j = Arrays.asList(this.b);
    private final List<String> k = new ArrayList();
    private final List<String> l = new ArrayList();
    private final List<String> m = new ArrayList();
    private final List<String> n = new ArrayList();
    private boolean s = false;
    private boolean z = true;
    private boolean B = true;
    private boolean C = true;
    private boolean t = true;
    private boolean v = true;
    private boolean w = true;
    private boolean x = true;
    private boolean y = true;
    private boolean A = false;
    public volatile boolean o = false;

    public String r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this}) : "is_easy_go_default_right_page";
    }

    public String s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("255e0466", new Object[]{this}) : "com.taobao.android.order.bundle.TBFoldedOrderListActivity";
    }

    public static /* synthetic */ Application a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("e2d20f46", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ void a(a aVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9dbfe2e", new Object[]{aVar, map});
        } else {
            aVar.b(map);
        }
    }

    public static /* synthetic */ void b(a aVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c9154d", new Object[]{aVar, map});
        } else {
            aVar.a(map);
        }
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ecba9f3d", new Object[0]);
        }
        if (f9098a == null) {
            synchronized (a.class) {
                if (f9098a == null) {
                    f9098a = new a();
                }
            }
        }
        return f9098a;
    }

    public synchronized void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        if (!this.o && application != null) {
            this.o = true;
            this.c = application;
            c();
            SharedPreferences sharedPreferences = this.c.getSharedPreferences("auto_size_device_config", 4);
            this.c.getSharedPreferences("easy_go_config", 0);
            Map<String, ?> all = sharedPreferences.getAll();
            if (all != null) {
                a(all);
                TLog.loge("TBAutoSize.ConfigManager", "SharedPreferences config: " + new JSONObject(all));
            }
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            OrangeConfig.getInstance().registerListener(new String[]{"auto_size_device_config", "easy_go_config"}, new d() { // from class: com.taobao.android.autosize.config.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    Map<String, String> configs;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    } else if (Boolean.parseBoolean(map.get("fromCache"))) {
                        TLog.loge("TBAutoSize.ConfigManager", "onConfigUpdate: update from cache");
                    } else if (TextUtils.equals(str, "easy_go_config")) {
                        if (a.a(a.this) == null) {
                            return;
                        }
                        String config = OrangeConfig.getInstance().getConfig(str, "dynamicEasyGoEnable", "false");
                        a.a(a.this).getSharedPreferences("easy_go_config", 0).edit().putString("dynamicEasyGoEnable", config).apply();
                        TLog.loge("TBAutoSize.ConfigManager", "onConfigUpdate: update for easy go, easy go enable is " + config);
                    } else if (!TextUtils.equals(str, "auto_size_device_config") || (configs = OrangeConfig.getInstance().getConfigs(str)) == null) {
                    } else {
                        a.b(a.this, configs);
                        a.a(a.this, configs);
                        TLog.loge("TBAutoSize.ConfigManager", "orange callback config: " + new JSONObject(configs));
                    }
                }
            }, true);
        } catch (Throwable th) {
            TLog.loge("TBAutoSize.ConfigManager", "registerOrangeListener: occur exception, maybe orange is not initialized!", th);
            th.printStackTrace();
        }
    }

    private void a(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        this.d = "true".equals(a(map, "enable", "true"));
        this.e = "true".equals(a(map, "enableModifySize", null));
        a(a(map, "modifySizeBrandWhiteList", null), this.f);
        this.i = "true".equals(a(map, "forceRecreateEnabled", null));
        a(a(map, "forceRecreateModelWhiteList", null), this.j);
        this.g = "true".equals(a(map, "configChangeListenDowngradeEnabled", null));
        this.h = "true".equals(a(map, "forceFullScreenOpenEnabled", null));
        this.p = "true".equals(a(map, "forceFullScreenOpenOnFoldEnabled", null));
        this.q = "true".equals(a(map, "forceFullScreenOpenOnTabletEnabled", null));
        this.r = "true".equals(a(map, "autoOrientationDowngradeEnable", null));
        this.s = "true".equals(a(map, "tabletByLaoutEnable", null));
        Application application = this.c;
        if (application != null) {
            if (!l.b(application) || !"huawei".equalsIgnoreCase(Build.MANUFACTURER)) {
                z = false;
            }
            this.z = z;
        } else {
            this.z = false;
            TLog.loge("TBAutoSize.ConfigManager", "updateConfig: enableNewConfigurationChangeCallback is false, mApplication is null");
        }
        if (this.z) {
            this.z = "true".equals(a(map, "listenConfigurationChangeOnActivity", "true"));
        }
        this.B = "true".equals(a(map, "enableUpdateWidthWithConfig", "true"));
        this.C = "true".equals(a(map, "enableReturnActivityWidthAsScreenWidth", "true"));
        this.t = "true".equals(a(map, "checkOnResumeEnable", "true"));
        this.v = "true".equals(a(map, "configChangeWithActivityEnable", "true"));
        this.w = "true".equals(a(map, "dxRefreshOnResumeEnable", "true"));
        this.x = "true".equals(a(map, "portraitJudgeV2Enable", "true"));
        this.y = "true".equals(a(map, "fixNotchInWidthEnable", "true"));
        this.A = "true".equals(a(map, "foldStatusBridgeEnable", null));
        a(a(map, "foldDeviceList", null), this.k);
        a(a(map, "tabletDeviceList", null), this.l);
        a(a(map, "flipDeviceList", null), this.m);
        a(a(map, "phoneDeviceList", null), this.n);
        h();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        TLog.loge("TBAutoSize.ConfigManager", "enable=" + this.d + " enableModifySize=" + this.e + " modifySizeBrandWhiteList=" + this.f + " forceRecreateEnabled=" + this.i + " forceRecreateModelWhiteList=" + this.j + " enableConfigChangeListenDowngrade=" + this.g + " enableForceFullScreenOpen=" + this.h + " enableForceFullScreenOpenOnFold=" + this.p + " enableForceFullScreenOpenOnTablet=" + this.q + " enableAutoOrientationDowngrade=" + this.r + " foldDeviceList=" + this.k + " tabletDeviceList=" + this.l + " flipDeviceList=" + this.m + " phoneDeviceList=" + this.n + " enableTabletByLayout=" + this.s + " enableCheckOnResume=" + this.t + " enableConfigChangeWithActivity=" + this.v + " enableDxRefreshOnResume=" + this.w + " enablePortJudgeV2=" + this.x + " enableFixNotchInWidth=" + this.y + " enableFoldStatusBridge=" + this.A + " enableNewConfigurationChangeCallback=" + this.z + " ");
    }

    private void b(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (map == null) {
            this.c.getSharedPreferences("auto_size_device_config", 0).edit().clear().apply();
        } else {
            SharedPreferences.Editor edit = this.c.getSharedPreferences("auto_size_device_config", 0).edit();
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                edit.putString(entry.getKey(), a(map, entry.getKey(), null));
            }
            edit.apply();
        }
    }

    private static String a(Map<String, ?> map, String str, String str2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("696f900f", new Object[]{map, str, str2});
        }
        if (TextUtils.isEmpty(str) || (obj = map.get(str)) == null) {
            return str2;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        String obj2 = obj.toString();
        return TextUtils.isEmpty(obj2) ? str2 : obj2;
    }

    private static void a(String str, List<String> list) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{str, list});
        } else if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(";")) {
                if (!TextUtils.isEmpty(str2)) {
                    list.add(str2);
                }
            }
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        TLog.loge("TBAutoSize.ConfigManager", "isEnable=" + this.d);
        return this.d;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        TLog.loge("TBAutoSize.ConfigManager", "isEnableModifySize=" + this.e);
        return this.e;
    }

    public List<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fd625b", new Object[]{this});
        }
        TLog.loge("TBAutoSize.ConfigManager", "modifySizeBrandWhiteList=" + this.f);
        return this.f;
    }

    @Deprecated
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        TLog.loge("TBAutoSize.ConfigManager", "isForceRecreateEnabled=" + this.i);
        return this.i;
    }

    @Deprecated
    public List<String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this});
        }
        TLog.loge("TBAutoSize.ConfigManager", "forceRecreateModelWhiteList=" + this.j);
        return this.j;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.h;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.p;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.q;
    }

    public List<String> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("962721e7", new Object[]{this, context});
        }
        if (!this.o) {
            a(f(context));
        }
        TLog.loge("TBAutoSize.ConfigManager", "foldDeviceList=" + this.k);
        return this.k;
    }

    public List<String> b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("30c7e468", new Object[]{this, context});
        }
        if (!this.o) {
            a(f(context));
        }
        TLog.loge("TBAutoSize.ConfigManager", "tabletDeviceList=" + this.l);
        return this.l;
    }

    public List<String> c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cb68a6e9", new Object[]{this, context});
        }
        if (!this.o) {
            a(f(context));
        }
        TLog.loge("TBAutoSize.ConfigManager", "flipDeviceList=" + this.m);
        return this.m;
    }

    public List<String> d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6609696a", new Object[]{this, context});
        }
        if (!this.o) {
            a(f(context));
        }
        TLog.loge("TBAutoSize.ConfigManager", "phoneDeviceList=" + this.n);
        return this.n;
    }

    public boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{this, context})).booleanValue();
        }
        if (!this.o) {
            a(f(context));
        }
        TLog.loge("TBAutoSize.ConfigManager", "isEnableAutoOrientationDowngrade=" + this.r);
        return this.r;
    }

    private static Application f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("ad72014a", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        if (context instanceof Application) {
            return (Application) context;
        }
        Context applicationContext = context.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            return null;
        }
        return (Application) applicationContext;
    }

    public boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2296a1e", new Object[]{this, context})).booleanValue();
        }
        if (!this.o) {
            a(f(context));
        }
        TLog.loge("TBAutoSize.ConfigManager", "isEnableTabletByLayout=" + this.s);
        return this.s;
    }

    public boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2d615bd", new Object[]{this, context})).booleanValue();
        }
        if (!this.o) {
            a(f(context));
        }
        TLog.loge("TBAutoSize.ConfigManager", "isEnableCheckOnResume=" + this.t);
        return this.t;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        TLog.loge("TBAutoSize.ConfigManager", "isEnableConfigChangeWithActivity=" + this.v);
        return this.v;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        TLog.loge("TBAutoSize.ConfigManager", "isEnableDxRefreshOnResume=" + this.w);
        return this.w;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.x;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.y;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : this.A;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ccd489", new Object[]{this});
        }
        if (this.c == null) {
            TLog.loge("TBAutoSize.ConfigManager", "getEasyGoTargetUrl, mApplication is null");
            return u;
        }
        long q = q();
        if (q < System.currentTimeMillis()) {
            TLog.loge("TBAutoSize.ConfigManager", "getEasyGoTargetUrl, is invalid. validDatetime " + q);
            return u;
        }
        String string = this.c.getSharedPreferences("easy_go_config", 0).getString("dynamicEasyGoTargetUrl", u);
        TLog.loge("TBAutoSize.ConfigManager", "getEasyGoTargetUrl=" + string);
        return string;
    }

    private boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : "xiaomi".equalsIgnoreCase(Build.MANUFACTURER);
    }

    public boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a382c15c", new Object[]{this, context})).booleanValue();
        }
        if (context == null) {
            TLog.loge("TBAutoSize.ConfigManager", "isDynamicEasyGoEnable false, context is null");
            return false;
        } else if (!l.d(context) && !l.b(context)) {
            TLog.loge("TBAutoSize.ConfigManager", "isDynamicEasyGoEnable false, not fold or not tablet");
            return false;
        } else {
            String string = context.getSharedPreferences("easy_go_config", 0).getString("dynamicEasyGoEnable", "false");
            TLog.loge("TBAutoSize.ConfigManager", "isEnableDynamicEasyGo=" + string);
            return Boolean.parseBoolean(string) && !t();
        }
    }

    public long q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64de46c", new Object[]{this})).longValue();
        }
        Application application = this.c;
        if (application == null) {
            TLog.loge("TBAutoSize.ConfigManager", "getEasyGoDefaultValidDatetimeMillis, mApplication is null");
            return 0L;
        }
        return application.getSharedPreferences("easy_go_config", 0).getLong("easyGoDefaultValidDatetimeMillis", -1L);
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : this.z;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue() : this.B;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue() : this.C;
    }
}
