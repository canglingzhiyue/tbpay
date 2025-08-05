package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.strategy.StrategyResultParser;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.strategy.utils.Utils;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class StrategyConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_CACHE_SIZE = 256;
    public static final String NO_RESULT = "No_Result";
    private static final long serialVersionUID = -7798500032935529499L;
    private SerialLruCache<String, String> schemeMap = null;
    private Map<String, String> unitMap = null;
    private Map<String, String> accessPointMap = null;
    private transient StrategyInfoHolder holder = null;
    private Map<String, String> bssidUniqueIdMap = null;

    static {
        kge.a(-675212974);
        kge.a(1028243835);
    }

    public StrategyConfig createSelf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrategyConfig) ipChange.ipc$dispatch("a5c4dd64", new Object[]{this});
        }
        StrategyConfig strategyConfig = new StrategyConfig();
        synchronized (this) {
            strategyConfig.schemeMap = new SerialLruCache<>(this.schemeMap, 256);
            strategyConfig.unitMap = new ConcurrentHashMap(this.unitMap);
            strategyConfig.accessPointMap = new ConcurrentHashMap(this.accessPointMap);
            strategyConfig.bssidUniqueIdMap = new ConcurrentHashMap(this.bssidUniqueIdMap);
            strategyConfig.holder = this.holder;
        }
        return strategyConfig;
    }

    public void setHolder(StrategyInfoHolder strategyInfoHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ce079a", new Object[]{this, strategyInfoHolder});
        } else {
            this.holder = strategyInfoHolder;
        }
    }

    public void checkInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdaa2bf", new Object[]{this});
            return;
        }
        if (this.schemeMap == null) {
            this.schemeMap = new SerialLruCache<>(256);
        }
        if (this.unitMap == null) {
            this.unitMap = new ConcurrentHashMap();
        }
        if (this.accessPointMap == null) {
            this.accessPointMap = new ConcurrentHashMap();
        }
        if (this.bssidUniqueIdMap != null) {
            return;
        }
        this.bssidUniqueIdMap = new ConcurrentHashMap();
    }

    public void update(StrategyResultParser.HttpDnsResponse httpDnsResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8906abf5", new Object[]{this, httpDnsResponse});
            return;
        }
        synchronized (this) {
            TreeMap<String, String> updateDns = updateDns(httpDnsResponse.dns, httpDnsResponse.accessPoint);
            if (updateDns != null) {
                for (Map.Entry<String, String> entry : updateDns.entrySet()) {
                    String value = entry.getValue();
                    if (this.schemeMap.containsKey(value)) {
                        this.schemeMap.put(entry.getKey(), this.schemeMap.get(value));
                    } else {
                        this.schemeMap.put(entry.getKey(), NO_RESULT);
                    }
                }
            }
        }
        if (!ALog.isPrintLog(1)) {
            return;
        }
        ALog.d("awcn.StrategyConfig", "[smoothSwitch] ", null, "SchemeMap", this.schemeMap.toString());
        ALog.d("awcn.StrategyConfig", "[smoothSwitch] ", null, "UnitMap", this.unitMap.toString());
        ALog.d("awcn.StrategyConfig", "[ap][smoothSwitch] ", null, "accessPointMap", this.accessPointMap.toString());
    }

    public String getSafeAislesByHost(String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("894d97ae", new Object[]{this, str, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str) || !Utils.checkHostValidAndNotIp(str)) {
            return null;
        }
        synchronized (this) {
            str2 = this.schemeMap.get(str);
            if (str2 == null) {
                this.schemeMap.put(str, NO_RESULT);
            }
        }
        if (str2 != null) {
            if (!NO_RESULT.equals(str2)) {
                return str2;
            }
            return null;
        } else if (z) {
            this.holder.getCellularStrategyTable().sendAmdcRequest(z, str, false);
            return str2;
        } else {
            this.holder.getCurrStrategyTable().sendAmdcRequest(z, str, false);
            return str2;
        }
    }

    public String getUnitByHost(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db8852d6", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this) {
            str2 = this.unitMap.get(str);
        }
        return str2;
    }

    public String getAccessPointByHost(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4acca4fa", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this) {
            str2 = this.accessPointMap.get(str);
        }
        return str2;
    }

    public void updateBssidUniqueIdMap(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9e84ed7", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            this.bssidUniqueIdMap.put(str, str2);
        }
    }

    public String getUniqueIdByBssid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21bb818b", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return this.bssidUniqueIdMap.get(str);
        }
        return null;
    }

    private TreeMap<String, String> updateDns(StrategyResultParser.Dns[] dnsArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TreeMap) ipChange.ipc$dispatch("977d0e89", new Object[]{this, dnsArr, str});
        }
        TreeMap<String, String> treeMap = null;
        if (dnsArr != null && dnsArr.length != 0) {
            for (StrategyResultParser.Dns dns : dnsArr) {
                if (dns.clear) {
                    this.schemeMap.remove(dns.host);
                } else if (dns.cname != null) {
                    if (treeMap == null) {
                        treeMap = new TreeMap<>();
                    }
                    treeMap.put(dns.host, dns.cname);
                } else {
                    if (!"http".equalsIgnoreCase(dns.safeAisles) && !"https".equalsIgnoreCase(dns.safeAisles)) {
                        this.schemeMap.put(dns.host, NO_RESULT);
                    } else {
                        this.schemeMap.put(dns.host, dns.safeAisles);
                    }
                    if (!TextUtils.isEmpty(dns.unit)) {
                        this.unitMap.put(dns.host, dns.unit);
                    } else {
                        this.unitMap.remove(dns.host);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        this.accessPointMap.put(dns.host, str);
                    } else {
                        this.accessPointMap.remove(dns.host);
                    }
                }
            }
        }
        return treeMap;
    }
}
