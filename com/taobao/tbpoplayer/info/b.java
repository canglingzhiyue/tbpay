package com.taobao.tbpoplayer.info;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f22217a = "orange_version";
    private final String b = "poplayer_config";

    static {
        kge.a(-144967650);
    }

    private SharedPreferences b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("811fa7d", new Object[]{this});
        }
        if (PopLayer.getReference() != null && PopLayer.getReference().getApp() != null) {
            return PopLayer.getReference().getApp().getSharedPreferences("sp_poplayer_configs", 0);
        }
        return null;
    }

    public boolean a(String str, String str2, String str3) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{this, str, str2, str3})).booleanValue();
        }
        String a2 = a("orange_version");
        com.alibaba.poplayer.utils.c.c("sdkLifeCycle", "", "PopConfigLocalManager.updateLocalConfigs.orangeVersion=" + str3 + ".localOrangeVersion=" + a2);
        try {
            if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(str3)) {
                boolean equals = str3.equals(a2);
                com.alibaba.poplayer.utils.c.c("sdkLifeCycle", "", "PopConfigLocalManager.updateLocalConfigs.orangeVersionSame=" + equals);
                if (equals) {
                    return false;
                }
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopConfigLocalManager.parseOrangeVersionUpdated.error.", th);
        }
        String config = OrangeConfig.getInstance().getConfig(str, str2, "");
        a(config, str3);
        for (String str4 : config.split(",")) {
            b(str4, OrangeConfig.getInstance().getConfig(str, str4, ""));
        }
        c();
        com.alibaba.poplayer.utils.c.c("sdkLifeCycle", "", "PopConfigLocalManager.updateLocalConfigs.done");
        return true;
    }

    public String a(String str) {
        SharedPreferences b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            return (!TextUtils.isEmpty(str) && (b = b()) != null) ? b.getString(str, "") : "";
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopConfigLocalManager.getValueByOrangeKey.error.", th);
            return "";
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        try {
            SharedPreferences b = b();
            return b == null ? "" : b.getString("orange_version", "");
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopConfigLocalManager.getLocalOrangeVersion.error.", th);
            return "";
        }
    }

    private void a(String str, String str2) {
        SharedPreferences b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            if (TextUtils.isEmpty(str) || (b = b()) == null) {
                return;
            }
            SharedPreferences.Editor edit = b.edit();
            edit.putString("poplayer_config", str);
            edit.putString("orange_version", str2);
            edit.apply();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopConfigLocalManager.putPopConfigIndexIds.error.", th);
        }
    }

    private void b(String str, String str2) {
        SharedPreferences b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (b = b()) == null) {
                return;
            }
            b.edit().putString(str, str2).apply();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopConfigLocalManager.putPopConfig.error.", th);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            SharedPreferences b = b();
            if (b == null) {
                return;
            }
            String string = b.getString("poplayer_config", "");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            List asList = Arrays.asList(string.split(","));
            Map<String, ?> all = b.getAll();
            SharedPreferences.Editor edit = b.edit();
            for (String str : all.keySet()) {
                if (!TextUtils.isEmpty(str) && !"poplayer_config".equals(str) && !"orange_version".equals(str) && !asList.contains(str)) {
                    edit.remove(str);
                }
            }
            edit.apply();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopConfigLocalManager.clearOldConfigs.error.", th);
        }
    }
}
