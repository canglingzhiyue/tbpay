package com.taobao.android.cachecleaner.monitor.config;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.tao.log.TLog;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_AVFS_CACHE = "AVFS";
    public static final String BIZ_MSG = "MSG";
    public static final String BIZ_MSG_V2 = "MSG_V2";
    public static final String BIZ_Z_CACHE = "ZCACHE";

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f9285a;
    private Application b;
    private String c;
    private RuleConfig d = new RuleConfig();
    private ManualConfig g = new ManualConfig();
    private final Set<String> e = new HashSet();
    private final AtomicBoolean f = new AtomicBoolean(false);

    static {
        kge.a(335281979);
    }

    public static /* synthetic */ void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49ee5a50", new Object[]{aVar, str});
        } else {
            aVar.c(str);
        }
    }

    public static /* synthetic */ void a(a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98cf901a", new Object[]{aVar, str, str2});
        } else {
            aVar.a(str, str2);
        }
    }

    public static /* synthetic */ void b(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fa4151", new Object[]{aVar, str});
        } else {
            aVar.d(str);
        }
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("bc4c580c", new Object[0]);
        }
        if (f9285a == null) {
            synchronized (a.class) {
                if (f9285a == null) {
                    f9285a = new a();
                }
            }
        }
        return f9285a;
    }

    public void a(Application application, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9eeaf2e", new Object[]{this, application, map});
            return;
        }
        this.b = application;
        this.c = (String) map.get("appVersion");
        f();
        g();
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.e.contains(str);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.e.add(str);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.f.compareAndSet(false, true)) {
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("tb_cache_monitor_config");
            if (configs != null) {
                c(configs.get("monitor_config"));
                a("monitor_config", configs.get("monitor_config"));
                d(configs.get("manual_config"));
                a("manual_config", configs.get("manual_config"));
                return;
            }
            c(e("monitor_config"));
            c(e("manual_config"));
        } else {
            TLog.loge(CacheCleaner.MODULE, "CacheMonitorConfig", "initOrangeConfig: config has been initialized.");
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            OrangeConfig.getInstance().registerListener(new String[]{"tb_cache_monitor_config"}, new d() { // from class: com.taobao.android.cachecleaner.monitor.config.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                        return;
                    }
                    Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
                    if (configs == null) {
                        return;
                    }
                    a.a(a.this, configs.get("monitor_config"));
                    a.a(a.this, "monitor_config", configs.get("monitor_config"));
                    a.b(a.this, configs.get("manual_config"));
                    a.a(a.this, "manual_config", configs.get("manual_config"));
                }
            }, true);
        } catch (Throwable th) {
            Log.e("CacheMonitorConfig", "registerOrangeListener: occur exception, maybe orange is not initialized!");
            th.printStackTrace();
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            Log.e("CacheMonitorConfig", "updateRules: config is empty!");
        } else {
            try {
                RuleConfig ruleConfig = (RuleConfig) JSON.toJavaObject(JSONObject.parseObject(str), RuleConfig.class);
                if (ruleConfig != null) {
                    this.d = ruleConfig;
                }
            } catch (Throwable th) {
                Log.e("CacheMonitorConfig", "updateRules: update config rules failed!");
                th.printStackTrace();
            }
            String str2 = "updateRules: update rules success, rules : [" + str + "] ";
        }
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            Log.e("CacheMonitorConfig", "updateRules: config is empty!");
        } else {
            try {
                ManualConfig manualConfig = (ManualConfig) JSON.toJavaObject(JSONObject.parseObject(str), ManualConfig.class);
                if (manualConfig != null) {
                    this.g = manualConfig;
                }
            } catch (Throwable th) {
                Log.e("CacheMonitorConfig", "updateManualConfig: update config failed!");
                th.printStackTrace();
            }
            String str2 = "updateManualConfig: update config success, rules : [" + str + "] ";
        }
    }

    public RuleConfig b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RuleConfig) ipChange.ipc$dispatch("c2f3a6ec", new Object[]{this}) : this.d;
    }

    public ManualConfig h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ManualConfig) ipChange.ipc$dispatch("286ab728", new Object[]{this}) : this.g;
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        SharedPreferences.Editor edit = this.b.getSharedPreferences("tb_cache_monitor_config", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    private String e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("666b162a", new Object[]{this, str}) : this.b.getSharedPreferences("tb_cache_monitor_config", 4).getString(str, "");
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b.getPackageName();
    }

    public Application d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("7511a5ba", new Object[]{this}) : this.b;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.c;
    }
}
