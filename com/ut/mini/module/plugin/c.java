package com.ut.mini.module.plugin;

import mtopsdk.common.util.StringUtils;
import com.alibaba.analytics.core.config.UTClientConfigMgr;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.apr;
import tb.kge;

@Deprecated
/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private UTPluginConfig d = null;
    private b e = new b();

    /* renamed from: a  reason: collision with root package name */
    private Map<String, a> f24132a = new ConcurrentHashMap();
    private Map<String, a> b = new ConcurrentHashMap();
    private Map<String, a> c = new ConcurrentHashMap();

    static {
        kge.a(-1742139275);
    }

    public static /* synthetic */ void a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43f1bcef", new Object[]{cVar, str});
        } else {
            cVar.b(str);
        }
    }

    public static /* synthetic */ void b(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ca574e", new Object[]{cVar, str});
        } else {
            cVar.c(str);
        }
    }

    public c() {
        UTClientConfigMgr.a().a(new UTClientConfigMgr.a() { // from class: com.ut.mini.module.plugin.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
            public String getKey() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16c52370", new Object[]{this}) : com.alibaba.ut.abtest.internal.util.b.TRACK_PAGE_COUNTER_TYPE_PLUGIN;
            }

            @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
            public void onChange(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5bfd17c0", new Object[]{this, str});
                } else {
                    c.a(c.this, str);
                }
            }
        });
        UTClientConfigMgr.a().a(new UTClientConfigMgr.a() { // from class: com.ut.mini.module.plugin.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
            public String getKey() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16c52370", new Object[]{this}) : "plugin2";
            }

            @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
            public void onChange(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5bfd17c0", new Object[]{this, str});
                } else {
                    c.b(c.this, str);
                }
            }
        });
    }

    public boolean isOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue();
        }
        Map<String, a> map = this.b;
        return map != null && map.size() > 0;
    }

    public boolean isAsyncOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e983f767", new Object[]{this})).booleanValue();
        }
        Map<String, a> map = this.c;
        return map != null && map.size() > 0;
    }

    public Iterator getOpenUTPluginMapIterator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Iterator) ipChange.ipc$dispatch("9e0d1b78", new Object[]{this}) : this.b.entrySet().iterator();
    }

    public Iterator getOpenAsyncUTPluginMapIterator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Iterator) ipChange.ipc$dispatch("563f7554", new Object[]{this}) : this.c.entrySet().iterator();
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        UTPluginConfig uTPluginConfig = this.d;
        if (uTPluginConfig == null) {
            return true;
        }
        List<String> open = uTPluginConfig.getOpen();
        if (open != null && open.contains(str)) {
            return true;
        }
        List<String> close = this.d.getClose();
        if (close != null && close.contains(str)) {
            return false;
        }
        String other = this.d.getOther();
        return StringUtils.isEmpty(other) || !other.equals("close");
    }

    private synchronized void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        apr.b("UTPluginConfigMgr", "parseUTPluginConfig", str);
        try {
            this.d = (UTPluginConfig) JSONObject.parseObject(str, UTPluginConfig.class);
        } catch (Exception unused) {
            this.d = null;
        }
        for (Map.Entry<String, a> entry : this.f24132a.entrySet()) {
            String key = entry.getKey();
            if (!a(key)) {
                this.b.remove(key);
                this.c.remove(key);
                apr.b("UTPluginConfigMgr", "remove", key);
            } else {
                a value = entry.getValue();
                boolean isSyncMessage = value.isSyncMessage();
                if (!this.b.containsKey(key) && isSyncMessage) {
                    this.b.put(key, value);
                    apr.b("UTPluginConfigMgr", "openUTPluginMap put", key);
                } else if (!this.c.containsKey(key) && !isSyncMessage) {
                    this.c.put(key, value);
                    apr.b("UTPluginConfigMgr", "openAsyncUTPluginMap put", key);
                }
            }
        }
    }

    private synchronized void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        apr.b("UTPluginConfigMgr", "parseUTPlugin2Config", str);
        try {
            this.e.f24131a = (Map) JSONObject.parseObject(str, Map.class);
        } catch (Exception unused) {
            this.e.f24131a = null;
        }
        for (Map.Entry<String, a> entry : this.f24132a.entrySet()) {
            String key = entry.getKey();
            if (this.e.a(key)) {
                entry.getValue().setUTPluginParam(false, this.e.b(key), this.e.c(key), this.e.d(key));
            }
        }
        Iterator<Map.Entry<String, a>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, a> next = it.next();
            String key2 = next.getKey();
            if (this.e.a(key2)) {
                a value = next.getValue();
                if (!value.isSyncMessage()) {
                    it.remove();
                    this.c.put(key2, value);
                    apr.b("UTPluginConfigMgr", "move openUTPluginMap to openAsyncUTPluginMap", key2);
                }
            }
        }
        Iterator<Map.Entry<String, a>> it2 = this.c.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, a> next2 = it2.next();
            String key3 = next2.getKey();
            if (this.e.a(key3)) {
                a value2 = next2.getValue();
                if (value2.isSyncMessage()) {
                    it2.remove();
                    this.b.put(key3, value2);
                    apr.b("UTPluginConfigMgr", "move openAsyncUTPluginMap to openUTPluginMap", key3);
                }
            }
        }
    }

    public boolean isWritableKey(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2de84881", new Object[]{this, aVar, str})).booleanValue();
        }
        if (aVar != null) {
            return aVar.isWritableKey(str);
        }
        return false;
    }

    public boolean isWritableUtparamCnt(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe20f1d1", new Object[]{this, aVar, str})).booleanValue();
        }
        if (aVar != null) {
            return aVar.isWritableUtparamCnt(str);
        }
        return false;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4f99a7", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            String pluginName = aVar.getPluginName();
            if (StringUtils.isEmpty(pluginName)) {
                pluginName = "OldUTPlugin_" + aVar.hashCode();
            }
            if (StringUtils.isEmpty(pluginName) || this.f24132a.containsKey(pluginName)) {
                return;
            }
            if (this.e.a(pluginName)) {
                aVar.setUTPluginParam(false, this.e.b(pluginName), this.e.c(pluginName), this.e.d(pluginName));
            }
            this.f24132a.put(pluginName, aVar);
            if (!a(pluginName)) {
                return;
            }
            apr.b("UTPluginConfigMgr", "isOpen", pluginName);
            if (aVar.isSyncMessage()) {
                this.b.put(pluginName, aVar);
                apr.b("UTPluginConfigMgr", "openUTPluginMap.put", pluginName);
                return;
            }
            this.c.put(pluginName, aVar);
            apr.b("UTPluginConfigMgr", "openAsyncUTPluginMap.put", pluginName);
        }
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("886f5dc6", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            String pluginName = aVar.getPluginName();
            if (StringUtils.isEmpty(pluginName)) {
                pluginName = "OldUTPlugin_" + aVar.hashCode();
            }
            if (StringUtils.isEmpty(pluginName)) {
                return;
            }
            this.f24132a.remove(pluginName);
            this.b.remove(pluginName);
            this.c.remove(pluginName);
        }
    }
}
