package com.taobao.highway.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.data_highway.jni.DataHighwayNative;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import java.util.Map;
import tb.kge;
import tb.ktk;
import tb.ktm;

/* loaded from: classes7.dex */
public class a implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f17230a;
    private volatile boolean b = false;
    private volatile boolean c = false;
    private volatile String d = "";
    private volatile boolean e = false;

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce7ccd70", new Object[]{aVar});
        } else {
            aVar.g();
        }
    }

    public static /* synthetic */ void a(a aVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab85450b", new Object[]{aVar, str, map});
        } else {
            aVar.a(str, map);
        }
    }

    static {
        kge.a(-871964234);
        kge.a(-498751155);
        f17230a = new a();
    }

    private a() {
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("569ff1f0", new Object[0]) : f17230a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            h();
            OrangeConfig.getInstance().registerListener(new String[]{"highway"}, this);
            this.b = true;
        } catch (Throwable th) {
            ktm.a("initError", th.getMessage());
            Log.e("HighwayConfigManager", "initHighwayConfig: init highway error");
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        try {
            this.c = "true".equals(OrangeConfig.getInstance().getConfig("highway", "enable", "false"));
            DataHighwayNative.a(this.c);
            this.d = OrangeConfig.getInstance().getConfig("highway", "newDomain", "");
            this.e = "true".equals(OrangeConfig.getInstance().getConfig("highway", "disableCompress", "false"));
            DataHighwayNative.a(Long.parseLong(OrangeConfig.getInstance().getConfig("highway", "mdDuration", "10000")));
            String config = OrangeConfig.getInstance().getConfig("highway", "highwayEventList_v2", "");
            if (!TextUtils.isEmpty(config)) {
                DataHighwayNative.b(config);
            }
            String config2 = OrangeConfig.getInstance().getConfig("highway", "eventMap", "");
            if (TextUtils.isEmpty(config2)) {
                return;
            }
            DataHighwayNative.c(config2);
        } catch (Throwable th) {
            ktm.a("updateConfigError", th.getMessage());
            Log.e("HighwayConfigManager", "updateHighwayConfig failed");
        }
    }

    @Override // com.taobao.orange.g
    public void onConfigUpdate(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
        } else if (!"highway".equals(str)) {
        } else {
            try {
                ktk.c().execute(new Runnable() { // from class: com.taobao.highway.config.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            a.a(a.this, "highway", OrangeConfig.getInstance().getConfigs("highway"));
                            a.a(a.this);
                        } catch (Throwable unused) {
                            Log.e("HighwayConfigManager", "onConfigUpdate: update highway config error");
                        }
                    }
                });
            } catch (Throwable unused) {
                Log.e("HighwayConfigManager", "task is full!");
            }
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.b;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.d;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.e;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        try {
            this.c = "true".equals(a("highway", "enable", "false"));
            DataHighwayNative.a(this.c);
            this.d = a("highway", "newDomain", "");
            this.e = "true".equals(a("highway", "disableCompress", "false"));
            DataHighwayNative.a(Long.parseLong(a("highway", "mdDuration", "10000")));
            String a2 = a("highway", "highwayEventList_v2", "");
            if (!TextUtils.isEmpty(a2)) {
                DataHighwayNative.b(a2);
            }
            String a3 = a("highway", "eventMap", "");
            if (TextUtils.isEmpty(a3)) {
                return;
            }
            DataHighwayNative.c(a3);
        } catch (Throwable th) {
            ktm.a("readSpError", th.getMessage());
            Log.e("HighwayConfigManager", "initConfigFromLocal failed");
        }
    }

    private String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        String a2 = C0662a.a(str, str2, str3);
        return TextUtils.isEmpty(a2) ? str3 : a2;
    }

    private void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        try {
            if (map == null) {
                Log.e("HighwayConfigManager", "updateConfig latestConfigs=null");
                return;
            }
            for (String str2 : b.f17232a) {
                if (map.containsKey(str2)) {
                    C0662a.b(str, str2, map.get(str2));
                } else {
                    C0662a.b(str, str2, "");
                }
            }
        } catch (Throwable th) {
            ktm.a("storeSpError", th.getMessage());
        }
    }

    /* renamed from: com.taobao.highway.config.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C0662a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2030041787);
        }

        public static String a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3}) : c(str, str2, str3);
        }

        public static void b(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
            } else {
                d(str, str2, str3);
            }
        }

        private static SharedPreferences a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("551a7086", new Object[]{str});
            }
            Context d = ktk.d();
            if (d == null) {
                return null;
            }
            return d.getSharedPreferences(str, 0);
        }

        private static String c(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c9ab53d8", new Object[]{str, str2, str3});
            }
            SharedPreferences a2 = a(str);
            return a2 != null ? a2.getString(str2, str3) : str3;
        }

        private static void d(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4bc3689", new Object[]{str, str2, str3});
                return;
            }
            SharedPreferences a2 = a(str);
            if (a2 == null) {
                return;
            }
            SharedPreferences.Editor edit = a2.edit();
            edit.putString(str2, str3);
            edit.apply();
        }
    }
}
