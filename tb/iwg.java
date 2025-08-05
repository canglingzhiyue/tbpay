package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.ConfigCenter;
import com.taobao.orange.model.ConfigDO;
import com.taobao.orange.model.CustomConfigDO;
import com.taobao.orange.model.NameSpaceDO;
import com.taobao.orange.util.OLog;
import com.taobao.orange.util.d;
import com.taobao.orange.util.f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class iwg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, ConfigDO> f29373a = new ConcurrentHashMap();

    static {
        kge.a(-808408154);
    }

    public Map<String, ConfigDO> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.f29373a;
    }

    public boolean a(ConfigDO configDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cbe4a7a", new Object[]{this, configDO})).booleanValue();
        }
        if (!ConfigCenter.getInstance().checkCriticalConfigValid(configDO)) {
            return false;
        }
        this.f29373a.put(configDO.name, configDO);
        ConfigCenter.getInstance().notifyListeners(configDO.name, configDO.getCurVersion(), false, true);
        return true;
    }

    public <T> T a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("17307540", new Object[]{this, str});
        }
        ConfigDO configDO = this.f29373a.get(str);
        T t = null;
        if (configDO == null) {
            return null;
        }
        if (configDO.isExpired.get()) {
            OLog.e("CriticalConfigCache", "config " + str + "is expired", new Object[0]);
            return null;
        }
        if (NameSpaceDO.TYPE_STANDARD.equals(configDO.type)) {
            t = (T) configDO.content;
        } else if (NameSpaceDO.TYPE_CUSTOM.equals(configDO.type)) {
            t = (T) ((CustomConfigDO) configDO).stringContent;
        } else {
            OLog.e("CriticalConfigCache", "getConfigs fail, type " + configDO.type + " not support", new Object[0]);
        }
        if (!configDO.monitored) {
            d.a(configDO.name, configDO.version, configDO.getChangeVersion(), true);
            configDO.monitored = true;
        }
        return t;
    }

    public boolean b(ConfigDO configDO) {
        ConfigDO configDO2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bf41bb", new Object[]{this, configDO})).booleanValue();
        }
        if (configDO == null || (configDO2 = this.f29373a.get(configDO.name)) == null || configDO2.isExpired.get() || f.a(configDO2.getChangeVersion()) > f.a(configDO.getChangeVersion())) {
            return false;
        }
        configDO2.isExpired.set(true);
        this.f29373a.remove(configDO.name);
        OLog.e("CriticalConfigCache", "check config " + configDO2.name + " changeVersion old in CriticalConfigCache is expired", new Object[0]);
        return true;
    }
}
