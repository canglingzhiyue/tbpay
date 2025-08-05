package com.taobao.tbpoplayer.info;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String d = "config_cdn_url";

    /* renamed from: a  reason: collision with root package name */
    private final String f22218a = "config_version";
    private final String b = "uri_map";
    private final String c = "index_id_set";

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f22219a;
        public String b;
        public Set<String> c;

        static {
            kge.a(1171121772);
        }
    }

    static {
        kge.a(187391394);
    }

    private SharedPreferences d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("9a13e8ff", new Object[]{this});
        }
        if (PopLayer.getReference() != null && PopLayer.getReference().getApp() != null) {
            return PopLayer.getReference().getApp().getSharedPreferences("sp_poplayer_configs_v2", 0);
        }
        return null;
    }

    public a a(String str, CdnConfigModel cdnConfigModel) {
        SharedPreferences.Editor e;
        IpChange ipChange = $ipChange;
        boolean z = false;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a33aa756", new Object[]{this, str, cdnConfigModel});
        }
        a aVar = null;
        if (cdnConfigModel != null && cdnConfigModel.isValid() && !TextUtils.isEmpty(str)) {
            String b = b("config_cdn_url");
            if (TextUtils.isEmpty(b) || !b.equals(str)) {
                z = true;
            }
            com.alibaba.poplayer.utils.c.c("sdkLifeCycle", "", "PopNewLocalConfigManager.updateLocalConfigs.lastCdnUrl=" + b + ".newcdnUrl=" + str + ".urlChanged=" + z);
            String str2 = cdnConfigModel.ver;
            if (!z) {
                String a2 = a();
                z2 = a(str2, a2);
                com.alibaba.poplayer.utils.c.c("sdkLifeCycle", "", "PopNewLocalConfigManager.updateLocalConfigs.newConfigVersion=" + str2 + ".localConfigVersion=" + a2 + ".needUpdateConfigs=" + z2);
            }
            if (!z2 || (e = e()) == null) {
                return null;
            }
            aVar = new a();
            e.putString("config_cdn_url", str);
            e.putString("config_version", str2);
            e.putString("uri_map", cdnConfigModel.uriMap);
            aVar.f22219a = str2;
            aVar.b = cdnConfigModel.uriMap;
            Set<String> keySet = cdnConfigModel.configs.keySet();
            e.putStringSet("index_id_set", keySet);
            aVar.c = keySet;
            for (String str3 : keySet) {
                e.putString(str3, cdnConfigModel.configs.get(str3));
            }
            e.apply();
            a(keySet);
            com.alibaba.poplayer.utils.c.c("sdkLifeCycle", "", "PopNewLocalConfigManager.updateLocalConfigs.done.cdnUrl=" + str + "...newConfigVersion=" + str2 + "...uriMap=" + cdnConfigModel.uriMap);
        }
        return aVar;
    }

    private boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        if (str.equals(str2)) {
            return false;
        }
        try {
            return Long.parseLong(str) > Long.parseLong(str2);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("ConfigInfoNew.needUpdateConfigs.error", th);
            return false;
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : b("config_version");
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : b(str);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : b("uri_map");
    }

    public Set<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("3b6c35d9", new Object[]{this});
        }
        try {
            SharedPreferences d = d();
            if (d != null) {
                return d.getStringSet("index_id_set", null);
            }
            return null;
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopConfigLocalManager.getPopConfigIndexIds.error.", th);
            return null;
        }
    }

    private String b(String str) {
        SharedPreferences d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        try {
            return (!TextUtils.isEmpty(str) && (d = d()) != null) ? d.getString(str, "") : "";
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopConfigLocalManager.getValueByKey.error.", th);
            return "";
        }
    }

    private SharedPreferences.Editor e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("5b6ff405", new Object[]{this});
        }
        try {
            SharedPreferences d = d();
            if (d != null) {
                return d.edit();
            }
            return null;
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopConfigLocalManager.startEdit.error.", th);
            return null;
        }
    }

    private void a(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b95557", new Object[]{this, set});
            return;
        }
        try {
            SharedPreferences d = d();
            if (d == null) {
                return;
            }
            Map<String, ?> all = d.getAll();
            SharedPreferences.Editor edit = d.edit();
            for (String str : all.keySet()) {
                if (!TextUtils.isEmpty(str) && !"index_id_set".equals(str) && !"config_version".equals(str) && !"uri_map".equals(str) && !set.contains(str)) {
                    edit.remove(str);
                }
            }
            edit.apply();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopConfigLocalManager.clearOldConfigs.error.", th);
        }
    }
}
