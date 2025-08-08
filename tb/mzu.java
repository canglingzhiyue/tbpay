package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.ConfigCenter;
import com.taobao.orange.OConstant;
import com.taobao.orange.a;
import com.taobao.orange.e;
import com.taobao.orange.model.ConfigDO;
import com.taobao.orange.model.CustomConfigDO;
import com.taobao.orange.model.NameSpaceDO;
import com.taobao.orange.util.OLog;
import com.taobao.orange.util.b;
import com.taobao.orange.util.d;
import com.taobao.orange.util.f;
import com.taobao.orange.util.h;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class mzu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, ConfigDO> f31341a = new ConcurrentHashMap();
    private AtomicInteger b = new AtomicInteger(0);

    static {
        kge.a(-1424926267);
    }

    public static /* synthetic */ AtomicInteger a(mzu mzuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("242c45a", new Object[]{mzuVar}) : mzuVar.b;
    }

    public static /* synthetic */ Map b(mzu mzuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2896c66", new Object[]{mzuVar}) : mzuVar.f31341a;
    }

    public Map<String, ConfigDO> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.f31341a;
    }

    public Set<NameSpaceDO> a(Set<NameSpaceDO> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("6868d06", new Object[]{this, set});
        }
        HashSet hashSet = new HashSet();
        if (set == null || set.isEmpty()) {
            OLog.w("ConfigCache", "load config cache empty", new Object[0]);
            return null;
        }
        for (NameSpaceDO nameSpaceDO : set) {
            ConfigDO a2 = a(nameSpaceDO);
            if (a2 != null) {
                a2.persisted = true;
                this.f31341a.put(a2.name, a2);
                ConfigCenter.getInstance().removeFail(a2.name);
                ConfigCenter.getInstance().notifyListeners(a2.name, a2.getCurVersion(), true);
                if (a2.candidate == null && f.a(nameSpaceDO.version) > f.a(a2.version)) {
                    hashSet.add(nameSpaceDO);
                    OLog.d("ConfigCache", "load not match as version", "name", nameSpaceDO.name);
                }
                if (nameSpaceDO.candidates == null && a2.candidate != null && f.a(nameSpaceDO.version) > f.a(a2.getCurVersion())) {
                    hashSet.add(nameSpaceDO);
                    OLog.e("ConfigCache", "load not match as version", "name", nameSpaceDO.name, "local_version", a2.getCurVersion(), "namespace_version", nameSpaceDO.version);
                    d.a(OConstant.POINT_EXT_CFG_CHECK, OConstant.POINT_CONFIG_MISS_CHECK_COUNTS, nameSpaceDO.name, 1.0d);
                }
            } else if (NameSpaceDO.LEVEL_HIGH.equals(nameSpaceDO.loadLevel)) {
                hashSet.add(nameSpaceDO);
            }
        }
        return hashSet;
    }

    public Set<NameSpaceDO> b(Set<NameSpaceDO> set) {
        ConfigDO c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("43a65125", new Object[]{this, set});
        }
        HashSet hashSet = new HashSet();
        if (set == null || set.isEmpty()) {
            OLog.w("ConfigCache", "load config cache empty", new Object[0]);
            return null;
        }
        Set<String> b = h.b(a.g, OConstant.SP_KEY_USED_LIST, (Set<String>) new HashSet());
        b.add("orange");
        for (NameSpaceDO nameSpaceDO : set) {
            if (b.contains(nameSpaceDO.name) && (c = c(nameSpaceDO.name)) != null) {
                c.persisted = true;
                this.f31341a.put(c.name, c);
                ConfigCenter.getInstance().removeFail(c.name);
                ConfigCenter.getInstance().notifyListeners(c.name, c.getCurVersion(), true);
                if (c.candidate == null && f.a(nameSpaceDO.version) > f.a(c.version)) {
                    hashSet.add(nameSpaceDO);
                    OLog.d("ConfigCache", "load not match as version", "name", nameSpaceDO.name);
                }
                if (nameSpaceDO.candidates == null && c.candidate != null && f.a(nameSpaceDO.version) > f.a(c.getCurVersion())) {
                    hashSet.add(nameSpaceDO);
                    OLog.e("ConfigCache", "load not match as version", "name", nameSpaceDO.name, "local_version", c.getCurVersion(), "namespace_version", nameSpaceDO.version);
                    d.a(OConstant.POINT_EXT_CFG_CHECK, OConstant.POINT_CONFIG_MISS_CHECK_COUNTS, nameSpaceDO.name, 1.0d);
                }
            }
        }
        return hashSet;
    }

    private ConfigDO a(NameSpaceDO nameSpaceDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigDO) ipChange.ipc$dispatch("183fccbd", new Object[]{this, nameSpaceDO});
        }
        ConfigDO configDO = (ConfigDO) b.a(nameSpaceDO.name);
        if (configDO == null) {
            return null;
        }
        if (OLog.isPrintLog(1)) {
            if (configDO.candidate == null) {
                OLog.d("ConfigCache", "restoreConfig", configDO);
            } else {
                OLog.d("ConfigCache", "restoreAbConfig", configDO);
            }
        }
        return configDO;
    }

    private ConfigDO c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigDO) ipChange.ipc$dispatch("942685b0", new Object[]{this, str});
        }
        ConfigDO configDO = (ConfigDO) b.b(str);
        if (configDO == null) {
            return null;
        }
        if (OLog.isPrintLog(1)) {
            if (configDO.candidate == null) {
                OLog.d("ConfigCache", "restoreConfigLocked", configDO);
            } else {
                OLog.d("ConfigCache", "restoreAbConfigLocked", configDO);
            }
        }
        return configDO;
    }

    public void a(final ConfigDO configDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cbe4a76", new Object[]{this, configDO});
            return;
        }
        this.f31341a.put(configDO.name, configDO);
        ConfigCenter.getInstance().notifyListeners(configDO.name, configDO.getCurVersion(), false);
        if (ConfigCenter.getInstance().isAfterIdle.get()) {
            e.b(new Runnable() { // from class: tb.mzu.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ConfigDO configDO2 = configDO;
                    b.a(configDO2, configDO2.name);
                }
            });
        } else {
            configDO.persisted = false;
        }
    }

    public void b(ConfigDO configDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bf41b7", new Object[]{this, configDO});
            return;
        }
        a(configDO);
        b();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            b.c(str);
        }
    }

    public <T> T b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6e4e661f", new Object[]{this, str});
        }
        T t = null;
        ConfigDO configDO = this.f31341a.get(str);
        if (configDO != null) {
            if (NameSpaceDO.TYPE_STANDARD.equals(configDO.type)) {
                t = (T) configDO.content;
            } else if (NameSpaceDO.TYPE_CUSTOM.equals(configDO.type)) {
                t = (T) ((CustomConfigDO) configDO).stringContent;
            } else {
                OLog.e("ConfigCache", "getConfigs fail unsupport type", new Object[0]);
            }
            if (!configDO.monitored) {
                d.a(configDO.name, configDO.version, configDO.getChangeVersion(), false);
                if (a.H) {
                    d.a(OConstant.POINT_CHANNEL_CONFIG_USE, configDO.name);
                }
                configDO.monitored = true;
            }
        }
        return t;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b.incrementAndGet();
        e.b(new Runnable() { // from class: tb.mzu.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (mzu.a(mzu.this).getAndSet(0) <= 0) {
                } else {
                    HashSet hashSet = new HashSet(mzu.b(mzu.this).keySet());
                    h.a(a.g, OConstant.SP_KEY_USED_LIST, (Set<String>) hashSet);
                    OLog.e("ConfigCache", "save used list success, size", Integer.valueOf(hashSet.size()));
                }
            }
        });
    }
}
