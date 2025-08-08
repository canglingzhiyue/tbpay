package com.taobao.themis.inside.adapter;

import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.orange.OConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J \u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016J\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0005H\u0016J \u0010\u0019\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/taobao/themis/inside/adapter/TMSOrangeProxy;", "Lcom/taobao/themis/kernel/adapter/IConfigAdapter;", "()V", "mListeners", "", "", "Lcom/taobao/orange/OConfigListener;", "mSp", "Landroid/content/SharedPreferences;", "getConfigByGroupAndName", "groupName", OConstant.DIMEN_CONFIG_NAME, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getConfigByGroupAndNameFromLocal", "getConfigs", "", "getCustomConfig", "readConfigFromLocal", "orangeKey", "registerListener", "", "configListener", "Lcom/taobao/themis/kernel/adapter/IConfigAdapter$ConfigListener;", "registerListenerSaveLocal", "unregisterListener", "writeConfigToLocal", "orangeConfig", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSOrangeProxy implements IConfigAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TMSOrangeProxy INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, d> f22453a;
    private static final SharedPreferences b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032F\u0010\u0005\u001aB\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004* \u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00070\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "s", "", "kotlin.jvm.PlatformType", "map", "", "", "onConfigUpdate"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22454a;
        public final /* synthetic */ IConfigAdapter.a b;

        public a(String str, IConfigAdapter.a aVar) {
            this.f22454a = str;
            this.b = aVar;
        }

        @Override // com.taobao.orange.d
        public final void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (!q.a((Object) str, (Object) this.f22454a)) {
            } else {
                this.b.a(map);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "configs", "", "", "kotlin.jvm.PlatformType", "", "onConfigUpdate"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements IConfigAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22455a;

        public b(String str) {
            this.f22455a = str;
        }

        @Override // com.taobao.themis.kernel.adapter.IConfigAdapter.a
        public final void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                return;
            }
            String str = "tms_local_orange_version_code_" + this.f22455a;
            String str2 = map.get("configVersion");
            if (str2 == null || q.a((Object) str2, (Object) TMSOrangeProxy.access$getMSp$p(TMSOrangeProxy.INSTANCE).getString(str, ""))) {
                return;
            }
            TMSOrangeProxy.access$getMSp$p(TMSOrangeProxy.INSTANCE).edit().putString(str, str2).apply();
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(this.f22455a);
            q.b(configs, "OrangeConfig.getInstance().getConfigs(groupName)");
            for (Map.Entry<String, String> entry : configs.entrySet()) {
                TMSOrangeProxy tMSOrangeProxy = TMSOrangeProxy.INSTANCE;
                String str3 = this.f22455a;
                String key = entry.getKey();
                q.b(key, "entry.key");
                String value = entry.getValue();
                q.b(value, "entry.value");
                TMSOrangeProxy.access$writeConfigToLocal(tMSOrangeProxy, str3, key, value);
            }
        }
    }

    static {
        kge.a(-290369949);
        kge.a(1479634272);
        INSTANCE = new TMSOrangeProxy();
        f22453a = new ConcurrentHashMap();
        Object a2 = qpt.a(IEnvironmentService.class);
        q.b(a2, "TMSAdapterManager.getNot…ice::class.java\n        )");
        SharedPreferences sharedPreferences = ((IEnvironmentService) a2).getApplicationContext().getSharedPreferences("tms_local_orange", 0);
        q.b(sharedPreferences, "TMSAdapterManager.getNot…e\", Context.MODE_PRIVATE)");
        b = sharedPreferences;
    }

    private TMSOrangeProxy() {
    }

    public static final /* synthetic */ SharedPreferences access$getMSp$p(TMSOrangeProxy tMSOrangeProxy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("26c1366b", new Object[]{tMSOrangeProxy}) : b;
    }

    public static final /* synthetic */ void access$writeConfigToLocal(TMSOrangeProxy tMSOrangeProxy, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9152ec66", new Object[]{tMSOrangeProxy, str, str2, str3});
        } else {
            tMSOrangeProxy.a(str, str2, str3);
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public Map<String, String> getConfigs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6165ac1", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return OrangeConfig.getInstance().getConfigs(str);
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public String getCustomConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a44377c", new Object[]{this, str, str2});
        }
        if (str == null) {
            return null;
        }
        return OrangeConfig.getInstance().getCustomConfig(str, str2);
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public String getConfigByGroupAndName(String groupName, String configName, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eaea1109", new Object[]{this, groupName, configName, str});
        }
        q.d(groupName, "groupName");
        q.d(configName, "configName");
        String config = OrangeConfig.getInstance().getConfig(groupName, configName, "");
        a(groupName);
        if (StringUtils.isEmpty(config)) {
            return str;
        }
        q.b(config, "config");
        a(groupName, configName, config);
        return config;
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public String getConfigByGroupAndNameFromLocal(String groupName, String configName, String str) {
        String config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac4d0e8c", new Object[]{this, groupName, configName, str});
        }
        q.d(groupName, "groupName");
        q.d(configName, "configName");
        String config2 = OrangeConfig.getInstance().getConfig(groupName, configName, "");
        a(groupName);
        if (!StringUtils.isEmpty(config2)) {
            q.b(config2, "config");
            a(groupName, configName, config2);
            config = config2;
        } else {
            config = a(groupName, configName);
        }
        if (StringUtils.isEmpty(config)) {
            config = str;
        }
        q.b(config, "config");
        return config;
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public void registerListener(String groupName, IConfigAdapter.a configListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4df7c", new Object[]{this, groupName, configListener});
            return;
        }
        q.d(groupName, "groupName");
        q.d(configListener, "configListener");
        a aVar = new a(groupName, configListener);
        f22453a.put(groupName, aVar);
        OrangeConfig.getInstance().registerListener(new String[]{groupName}, aVar, true);
    }

    @Override // com.taobao.themis.kernel.adapter.IConfigAdapter
    public void unregisterListener(String groupName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dfcfa1", new Object[]{this, groupName});
            return;
        }
        q.d(groupName, "groupName");
        d remove = f22453a.remove(groupName);
        if (remove == null) {
            return;
        }
        OrangeConfig.getInstance().unregisterListener(new String[]{groupName}, remove);
    }

    private final void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (StringUtils.isEmpty(str3)) {
        } else {
            SharedPreferences.Editor edit = b.edit();
            edit.putString(str + '_' + str2, str3).apply();
        }
    }

    private final String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        SharedPreferences sharedPreferences = b;
        return sharedPreferences.getString(str + '_' + str2, "");
    }

    private final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (f22453a.containsKey(str)) {
        } else {
            registerListener(str, new b(str));
        }
    }
}
