package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.ConnType;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.statist.StrategyStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.StrategyCollection;
import anet.channel.strategy.StrategyResultParser;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.strategy.utils.Utils;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.HttpConstant;
import anet.channel.util.Inet64Util;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import tb.kge;

/* loaded from: classes.dex */
public class StrategyTable implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long FRESH_TTL = 30000;
    private static final int MAX_HOST_COUNT_IN_ONCE_UPDATE = 40;
    private static final int MAX_HOST_SIZE = 256;
    private static final String TAG = "awcn.StrategyTable";
    public static Comparator<StrategyCollection> comparator = null;
    private static final long serialVersionUID = 6044722613437834958L;
    public volatile String clientIp;
    private volatile transient int configVersion;
    private HostLruCache hostStrategyMap;
    public String uniqueId;
    public volatile long lastModified = 0;
    public transient boolean isChanged = false;

    static {
        kge.a(-6509634);
        kge.a(1028243835);
        comparator = new Comparator<StrategyCollection>() { // from class: anet.channel.strategy.StrategyTable.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public int compare(StrategyCollection strategyCollection, StrategyCollection strategyCollection2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("ff11fca1", new Object[]{this, strategyCollection, strategyCollection2})).intValue();
                }
                if (strategyCollection.ttl == strategyCollection2.ttl) {
                    return strategyCollection.host.compareTo(strategyCollection2.host);
                }
                return strategyCollection.ttl - strategyCollection2.ttl > 0 ? 1 : -1;
            }
        };
    }

    public void parseStrategyData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2d40c97", new Object[]{this});
            return;
        }
        try {
            if (this.hostStrategyMap == null) {
                return;
            }
            for (Map.Entry entry : this.hostStrategyMap.entrySet()) {
                StrategyCollection strategyCollection = (StrategyCollection) entry.getValue();
                if (strategyCollection != null && strategyCollection.parseStrategyData()) {
                    this.isChanged = true;
                }
            }
        } catch (Exception e) {
            ALog.e(TAG, "parseStrategyData error !", null, e, new Object[0]);
        }
    }

    public void commitStrategyMonitor(StrategyStatistic strategyStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c67ea21", new Object[]{this, strategyStatistic});
        } else if (strategyStatistic != null) {
            strategyStatistic.hostStrategyMapSize = this.hostStrategyMap.size();
            for (Map.Entry entry : this.hostStrategyMap.entrySet()) {
                ((StrategyCollection) entry.getValue()).commitStrategyMonitor(strategyStatistic);
            }
            strategyStatistic.hour = Math.ceil(((System.currentTimeMillis() - GlobalAppRuntimeInfo.getInitTime()) / 1000) / 3600.0d);
            ALog.e(TAG, "[StrategyStatistic] commitStrategyMonitor =" + strategyStatistic.toString(), null, new Object[0]);
            AppMonitor.getInstance().commitStat(strategyStatistic);
        }
    }

    public void clearStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e693567", new Object[]{this});
            return;
        }
        try {
            synchronized (this.hostStrategyMap) {
                Iterator it = this.hostStrategyMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    StrategyCollection strategyCollection = (StrategyCollection) entry.getValue();
                    if (strategyCollection != null && !DispatchConstants.isAmdcServerChannelDomain(str)) {
                        if (strategyCollection.isExpiredStrategy()) {
                            if (!strategyCollection.isFixed) {
                                ALog.e(TAG, "[channel process] clearStrategy，hostStrategyMap remove host=" + str, null, new Object[0]);
                                it.remove();
                                this.isChanged = true;
                            }
                        } else if (strategyCollection.clearStrategy()) {
                            this.isChanged = true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            ALog.e(TAG, "[channel process] clearStrategy，error=" + e.toString(), null, new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public static class HostLruCache extends SerialLruCache<String, StrategyCollection> {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final long serialVersionUID = -4001655685948369525L;

        static {
            kge.a(1721653793);
        }

        public HostLruCache(int i) {
            super(i);
        }

        @Override // anet.channel.strategy.utils.SerialLruCache
        public boolean entryRemoved(Map.Entry<String, StrategyCollection> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d28ca266", new Object[]{this, entry})).booleanValue();
            }
            if (!entry.getValue().isFixed) {
                return true;
            }
            Iterator it = entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((StrategyCollection) ((Map.Entry) it.next()).getValue()).isFixed) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
            return false;
        }
    }

    public StrategyTable(String str) {
        this.uniqueId = str;
        checkInit();
    }

    private void initStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cadd7aa", new Object[]{this});
        } else if (HttpDispatcher.getInstance().isInitHostsChanged(this.uniqueId)) {
            for (String str : HttpDispatcher.getInstance().getInitHosts()) {
                ALog.e(TAG, "[strategy opt] initStrategy, new sc", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", str, "uniqueId", this.uniqueId);
                this.hostStrategyMap.put(str, new StrategyCollection(str));
            }
        }
    }

    public void checkInit() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdaa2bf", new Object[]{this});
            return;
        }
        if (this.hostStrategyMap == null) {
            if (GlobalAppRuntimeInfo.isChannelProcess()) {
                this.hostStrategyMap = new HostLruCache(128);
            } else {
                this.hostStrategyMap = new HostLruCache(256);
            }
            initStrategy();
        }
        for (StrategyCollection strategyCollection : this.hostStrategyMap.values()) {
            strategyCollection.checkInit();
        }
        ALog.i(TAG, "strategy map", null, "size", Integer.valueOf(this.hostStrategyMap.size()));
        if (!GlobalAppRuntimeInfo.isTargetProcess()) {
            i = -1;
        }
        this.configVersion = i;
    }

    public List<IConnStrategy> queryByHost(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f68c7a6f", new Object[]{this, str}) : queryByHost(str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<anet.channel.strategy.IConnStrategy> queryByHost(java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.StrategyTable.queryByHost(java.lang.String, boolean):java.util.List");
    }

    public boolean getAbStrategyStatusByHost(String str, String str2) {
        StrategyCollection strategyCollection;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6cf1c1a", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        synchronized (this.hostStrategyMap) {
            strategyCollection = (StrategyCollection) this.hostStrategyMap.get(str);
        }
        if (strategyCollection != null && strategyCollection.isExpired() && AmdcRuntimeInfo.getAmdcLimitLevel() == 0) {
            sendAmdcRequest(str);
        }
        if (strategyCollection == null) {
            return false;
        }
        return strategyCollection.getAbStrategyStatus(str2);
    }

    public String getCnameByHost(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("32f99d8", new Object[]{this, str}) : getCnameByHost(str, false);
    }

    public String getCnameByHost(String str, boolean z) {
        StrategyCollection strategyCollection;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("601c614", new Object[]{this, str, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.hostStrategyMap) {
            strategyCollection = (StrategyCollection) this.hostStrategyMap.get(str);
        }
        if (strategyCollection != null && strategyCollection.isExpired() && AmdcRuntimeInfo.getAmdcLimitLevel() == 0) {
            sendAmdcRequest(z, str);
        }
        if (strategyCollection == null) {
            return null;
        }
        return strategyCollection.cname;
    }

    public void update(StrategyResultParser.HttpDnsResponse httpDnsResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8906abf5", new Object[]{this, httpDnsResponse});
            return;
        }
        ALog.e(TAG, "update strategyTable with httpDns response", this.uniqueId, new Object[0]);
        try {
            if (!TextUtils.isEmpty(httpDnsResponse.clientIp) && !httpDnsResponse.clientIp.equalsIgnoreCase(this.clientIp)) {
                AnalysisFactory.getV3Instance().recordAppStatus("Client_IP", httpDnsResponse.clientIp);
            }
            this.clientIp = httpDnsResponse.clientIp;
            if (AwcnConfig.isUpdateIpStackEnable()) {
                if (Inet64Util.isIPv4OnlyNetwork() && Utils.isIPV6Address(this.clientIp)) {
                    Inet64Util.updateIpStackNetwork(3);
                    ALog.e(TAG, "[IpStackOpt] ipv4->6：clientIp=" + this.clientIp, null, new Object[0]);
                }
                if (Inet64Util.isIPv6OnlyNetwork() && Utils.isIPV4Address(this.clientIp)) {
                    Inet64Util.updateIpStackNetwork(3);
                    ALog.e(TAG, "[IpStackOpt] ipv6->4：clientIp=" + this.clientIp, null, new Object[0]);
                }
            }
            this.configVersion = httpDnsResponse.configVersion;
            updateDns(httpDnsResponse);
        } catch (Throwable th) {
            ALog.e(TAG, "fail to update strategyTable", this.uniqueId, th, new Object[0]);
        }
        this.isChanged = true;
        if (!ALog.isPrintLog(1)) {
            return;
        }
        StringBuilder sb = new StringBuilder("uniqueId : ");
        sb.append(this.uniqueId);
        sb.append("\n-------------------------domains:------------------------------------");
        ALog.d(TAG, sb.toString(), null, new Object[0]);
        synchronized (this.hostStrategyMap) {
            for (Map.Entry entry : this.hostStrategyMap.entrySet()) {
                sb.setLength(0);
                sb.append((String) entry.getKey());
                sb.append(" = ");
                sb.append(((StrategyCollection) entry.getValue()).toString());
                ALog.e(TAG, sb.toString(), null, new Object[0]);
            }
        }
    }

    private void updateDns(StrategyResultParser.HttpDnsResponse httpDnsResponse) {
        String str;
        StrategyCollection strategyCollection;
        IpChange ipChange = $ipChange;
        char c = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd56ecc", new Object[]{this, httpDnsResponse});
            return;
        }
        StrategyResultParser.Dns[] dnsArr = httpDnsResponse.dns;
        char c2 = 3;
        char c3 = 4;
        String str2 = null;
        if (dnsArr == null) {
            ALog.e(TAG, "[strategy opt] updateDns, dns list is null!", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "uniqueId", this.uniqueId);
            return;
        }
        synchronized (this.hostStrategyMap) {
            int i = 0;
            while (i < dnsArr.length) {
                StrategyResultParser.Dns dns = dnsArr[i];
                if (dns != null && dns.host != null) {
                    if (dns.clear) {
                        this.hostStrategyMap.remove(dns.host);
                        Object[] objArr = new Object[6];
                        objArr[0] = "evnMode";
                        objArr[1] = Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode());
                        objArr[c] = "host";
                        objArr[c2] = dns.host;
                        objArr[c3] = "uniqueId";
                        objArr[5] = this.uniqueId;
                        ALog.e(TAG, "[strategy opt] updateDns, dns.clear is true!", str2, objArr);
                        str = str2;
                    } else {
                        StrategyCollection strategyCollection2 = (StrategyCollection) this.hostStrategyMap.get(dns.host);
                        StrategyCollection.StrategyTypeStat strategyTypeStat = strategyCollection2 == null ? new StrategyCollection.StrategyTypeStat(StrategyCollection.StrategyType.DEFAULT_STRATEGY) : strategyCollection2.getExpireType(" queryByHost ", this.lastModified);
                        if (strategyCollection2 != null && strategyTypeStat.strategyValid != StrategyCollection.StrategyValid.INVALID) {
                            strategyCollection = strategyCollection2;
                            strategyCollection.updateStrategy(dns, httpDnsResponse.accessPoint, httpDnsResponse.clientIp, strategyTypeStat);
                            c3 = 4;
                            str = null;
                        }
                        long j = strategyCollection2 != null ? strategyCollection2.ttl : 0L;
                        boolean z = strategyCollection2 == null;
                        strategyCollection = new StrategyCollection(dns.host, j);
                        this.hostStrategyMap.put(dns.host, strategyCollection);
                        Object[] objArr2 = new Object[12];
                        objArr2[0] = "evnMode";
                        objArr2[1] = Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode());
                        objArr2[c] = "host";
                        objArr2[c2] = dns.host;
                        objArr2[4] = "strategyType";
                        objArr2[5] = strategyTypeStat.strategyType;
                        objArr2[6] = "strategyValid";
                        objArr2[7] = strategyTypeStat.strategyValid;
                        objArr2[8] = "isScNull";
                        objArr2[9] = Boolean.valueOf(z);
                        objArr2[10] = "uniqueId";
                        objArr2[11] = this.uniqueId;
                        ALog.e(TAG, "[strategy opt] updateDns, clear old strategy!", null, objArr2);
                        strategyCollection.updateStrategy(dns, httpDnsResponse.accessPoint, httpDnsResponse.clientIp, strategyTypeStat);
                        c3 = 4;
                        str = null;
                    }
                    i++;
                    str2 = str;
                    c2 = 3;
                    c = 2;
                }
                c3 = 4;
                str = null;
                ALog.e(TAG, "[strategy opt] updateDns, dns or host is null!", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "uniqueId", this.uniqueId);
                i++;
                str2 = str;
                c2 = 3;
                c = 2;
            }
        }
    }

    private void sendAmdcRequest(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55277f4d", new Object[]{this, str});
        } else {
            sendAmdcRequest(false, str);
        }
    }

    public void sendAmdcRequest(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5beaa7b", new Object[]{this, new Boolean(z), str});
            return;
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add(str);
        sendAmdcRequest(z, treeSet);
    }

    public void sendAmdcRequest(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fc91d27", new Object[]{this, str, new Boolean(z)});
        } else {
            sendAmdcRequest(false, str, z);
        }
    }

    public void sendAmdcRequest(boolean z, String str, boolean z2) {
        StrategyCollection strategyCollection;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f21757b9", new Object[]{this, new Boolean(z), str, new Boolean(z2)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            synchronized (this.hostStrategyMap) {
                strategyCollection = (StrategyCollection) this.hostStrategyMap.get(str);
                if (strategyCollection == null) {
                    ALog.e(TAG, "[strategy opt] sendAmdcRequest, sc null", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", str, "uniqueId", this.uniqueId);
                    strategyCollection = new StrategyCollection(str);
                    this.hostStrategyMap.put(str, strategyCollection);
                }
            }
            if (!z2 && strategyCollection.ttl != 0 && (!strategyCollection.isExpired() || AmdcRuntimeInfo.getAmdcLimitLevel() != 0)) {
                return;
            }
            sendAmdcRequest(z, str);
        }
    }

    public void sendAmdcRequest(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff23701c", new Object[]{this, set});
        } else {
            sendAmdcRequest(false, set, false, false);
        }
    }

    public void sendAmdcRequest(Set<String> set, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c41e339c", new Object[]{this, set, new Boolean(z), new Boolean(z2)});
        } else {
            sendAmdcRequest(false, set, z, z2);
        }
    }

    private void sendAmdcRequest(boolean z, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ac9c3ae", new Object[]{this, new Boolean(z), set});
        } else {
            sendAmdcRequest(z, set, false, false);
        }
    }

    private void sendAmdcRequest(boolean z, Set<String> set, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf7deaae", new Object[]{this, new Boolean(z), set, new Boolean(z2), new Boolean(z3)});
        } else if (set == null || set.isEmpty()) {
        } else {
            if ((!z2 && GlobalAppRuntimeInfo.isAppBackground() && AppLifecycle.lastEnterBackgroundTime > 0) || !NetworkStatusHelper.isConnected()) {
                ALog.e(TAG, "[ap] app in background or no network, not allow send request", this.uniqueId, new Object[0]);
                return;
            }
            int amdcLimitLevel = AmdcRuntimeInfo.getAmdcLimitLevel();
            if (amdcLimitLevel == 3) {
                ALog.e(TAG, "[ap] level == 3, not allow send request", this.uniqueId, new Object[0]);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this.hostStrategyMap) {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    StrategyCollection strategyCollection = (StrategyCollection) this.hostStrategyMap.get(it.next());
                    if (strategyCollection != null) {
                        if (!strategyCollection.isAllowUpdate(true)) {
                            it.remove();
                        } else {
                            strategyCollection.ttl = 30000 + currentTimeMillis;
                        }
                    }
                }
            }
            if (amdcLimitLevel == 0) {
                fillUpdateHosts(set);
            }
            HttpDispatcher.getInstance().sendAmdcRequest(z, set, this.configVersion, z2, z3);
        }
    }

    private void fillUpdateHosts(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f5105f9", new Object[]{this, set});
            return;
        }
        TreeSet treeSet = new TreeSet(comparator);
        synchronized (this.hostStrategyMap) {
            treeSet.addAll(this.hostStrategyMap.values());
        }
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            StrategyCollection strategyCollection = (StrategyCollection) it.next();
            if (!strategyCollection.isExpired() || set.size() >= 40) {
                return;
            }
            if (strategyCollection.isAllowUpdate(false)) {
                strategyCollection.ttl = 30000 + currentTimeMillis;
                set.add(strategyCollection.host);
            }
        }
    }

    private void checkInitHost() {
        TreeSet treeSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0f90c87", new Object[]{this});
            return;
        }
        try {
            if (!HttpDispatcher.getInstance().isInitHostsChanged(this.uniqueId)) {
                return;
            }
            synchronized (this.hostStrategyMap) {
                treeSet = null;
                for (String str : HttpDispatcher.getInstance().getInitHosts()) {
                    if (!this.hostStrategyMap.containsKey(str)) {
                        ALog.e(TAG, "[strategy opt] initStrategy, new sc", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", str, "uniqueId", this.uniqueId);
                        this.hostStrategyMap.put(str, new StrategyCollection(str));
                        if (treeSet == null) {
                            treeSet = new TreeSet();
                        }
                        treeSet.add(str);
                    }
                }
            }
            if (treeSet == null) {
                return;
            }
            sendAmdcRequest(treeSet);
        } catch (Exception e) {
            ALog.e(TAG, "checkInitHost failed", this.uniqueId, e, new Object[0]);
        }
    }

    public void notifyConnEvent(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        StrategyCollection strategyCollection;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46e0d0", new Object[]{this, str, iConnStrategy, connEvent});
            return;
        }
        if (ALog.isPrintLog(1)) {
            ALog.d(TAG, "[notifyConnEvent]", null, HttpConstant.HOST, str, "IConnStrategy", iConnStrategy, "ConnEvent", connEvent);
        }
        synchronized (this.hostStrategyMap) {
            strategyCollection = (StrategyCollection) this.hostStrategyMap.get(str);
        }
        if (strategyCollection == null) {
            return;
        }
        ConnType valueOf = ConnType.valueOf(iConnStrategy.getProtocol());
        if (GlobalAppRuntimeInfo.isAppBackground() && valueOf != null && valueOf.isHTTP3() && !connEvent.isSuccess) {
            return;
        }
        strategyCollection.notifyConnEvent(iConnStrategy, connEvent);
    }
}
