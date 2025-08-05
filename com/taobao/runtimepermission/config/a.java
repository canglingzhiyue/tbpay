package com.taobao.runtimepermission.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.tfr;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f18985a = "RPConfigManager";
    private static volatile a b = null;
    private static String d = "privacy_permission_config";
    private static String e = "privacy_id_map";
    private SharedPreferences f;
    private RPConfig c = new RPConfig();
    private final ConcurrentHashMap<String, String> g = new ConcurrentHashMap<>();

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c4c68a", new Object[]{aVar});
        } else {
            aVar.e();
        }
    }

    public static /* synthetic */ void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4fd21d4", new Object[]{aVar, str});
        } else {
            aVar.d(str);
        }
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : d;
    }

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : e;
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b18c3d4a", new Object[0]);
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            tfr.b(f18985a, "updateRules: config is empty!");
        } else {
            try {
                RPConfig rPConfig = (RPConfig) JSON.toJavaObject(JSONObject.parseObject(str), RPConfig.class);
                if (rPConfig != null) {
                    this.c = rPConfig;
                }
            } catch (Throwable th) {
                tfr.b(f18985a, "updateRules: update config rules failed!");
                th.printStackTrace();
            }
            String str2 = f18985a;
            tfr.a(str2, "updateRules: update rules success, rules : [" + str + "] ");
        }
    }

    public RPConfig b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RPConfig) ipChange.ipc$dispatch("cac56bea", new Object[]{this}) : this.c;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.f = context.getSharedPreferences("privacy_runtime_permission_config", 0);
        this.g.putAll(e(this.f.getString(e, null)));
        OrangeConfig.getInstance().registerListener(new String[]{d}, new g() { // from class: com.taobao.runtimepermission.config.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.g
            public void onConfigUpdate(String str, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                    return;
                }
                String config = OrangeConfig.getInstance().getConfig(a.c(), a.d(), null);
                if (!TextUtils.isEmpty(config)) {
                    a.a(a.this, config);
                } else {
                    a.a(a.this);
                }
            }
        });
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : !TextUtils.isEmpty(str) && (str.equals("common") || str.startsWith("triver-"));
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        String str2 = this.g.get(str);
        return str2 == null ? str : str2;
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        SharedPreferences sharedPreferences = this.f;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putString(e, str).apply();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.f;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(e).apply();
    }

    private static Map<String, String> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ddd6ceb", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        try {
            for (Map.Entry<String, Object> entry : JSONObject.parseObject(str).entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(key) && (value instanceof String)) {
                    hashMap.put(key, (String) value);
                }
            }
        } catch (Exception e2) {
            String str2 = f18985a;
            tfr.b(str2, "parsePrivacyIdMap error: " + e2);
        }
        return hashMap;
    }
}
