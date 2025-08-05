package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.ConnType;
import anet.channel.statist.AmdcResultStat;
import anet.channel.strategy.StrategyResultParser;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.strategy.utils.Utils;
import anet.channel.util.ALog;
import anet.channel.util.Inet64Util;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import tb.kge;
import tb.pqe;

/* loaded from: classes.dex */
public class StrategyEntity implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.StrategyEntity";
    private static final long serialVersionUID = 5740869364580937958L;
    private transient AmdcResultStat amdcResultStat;
    private boolean containsStaticIp;
    private transient Comparator<IPConnStrategy> defaultComparator;
    private Map<Integer, ConnHistoryItem> historyItemMap;
    private List<IPConnStrategy> ipStrategyList;
    public transient boolean isChanged;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface Predicate<T> {
        boolean apply(T t);
    }

    static {
        kge.a(-618696205);
        kge.a(1028243835);
    }

    public static /* synthetic */ Map access$000(StrategyEntity strategyEntity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("bdf881c8", new Object[]{strategyEntity}) : strategyEntity.historyItemMap;
    }

    public StrategyEntity() {
        this.ipStrategyList = new ArrayList();
        this.historyItemMap = new SerialLruCache(40);
        this.containsStaticIp = false;
        this.defaultComparator = null;
        this.amdcResultStat = new AmdcResultStat();
        this.isChanged = false;
    }

    public StrategyEntity(List<IPConnStrategy> list) {
        this.ipStrategyList = new ArrayList();
        this.historyItemMap = new SerialLruCache(40);
        this.containsStaticIp = false;
        this.defaultComparator = null;
        this.amdcResultStat = new AmdcResultStat();
        this.isChanged = false;
        this.ipStrategyList = list;
    }

    public StrategyEntity(List<IPConnStrategy> list, Map<Integer, ConnHistoryItem> map, boolean z) {
        this.ipStrategyList = new ArrayList();
        this.historyItemMap = new SerialLruCache(40);
        this.containsStaticIp = false;
        this.defaultComparator = null;
        this.amdcResultStat = new AmdcResultStat();
        this.isChanged = false;
        this.ipStrategyList = list;
        this.historyItemMap = map;
        this.containsStaticIp = z;
    }

    public synchronized boolean clearStrategy(StrategyList strategyList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bab63ac", new Object[]{this, strategyList})).booleanValue();
        }
        ALog.e(TAG, "[channel process] clearStrategy", null, new Object[0]);
        this.isChanged = false;
        synchronized (this.ipStrategyList) {
            Iterator<IPConnStrategy> it = this.ipStrategyList.iterator();
            int i = 0;
            while (it.hasNext()) {
                IPConnStrategy next = it.next();
                ConnHistoryItem connHistoryItem = this.historyItemMap.get(Integer.valueOf(next.getUniqueId()));
                if (connHistoryItem != null) {
                    if (connHistoryItem.isUsed() && (!connHistoryItem.isUsed() || connHistoryItem.isExpireStrategy())) {
                        it.remove();
                        this.historyItemMap.remove(Integer.valueOf(next.getUniqueId()));
                        this.isChanged = true;
                        if (strategyList != null) {
                            strategyList.clearIpStrategyList(next);
                        }
                        ALog.e(TAG, "[channel process] clearIpStrategyList 2，remove ipStrategy=" + next.toString(), null, new Object[0]);
                    }
                    i++;
                    if (i > 2) {
                        it.remove();
                        this.historyItemMap.remove(Integer.valueOf(next.getUniqueId()));
                        this.isChanged = true;
                        if (strategyList != null) {
                            strategyList.clearIpStrategyList(next);
                        }
                        ALog.e(TAG, "[channel process] clearIpStrategyList 1，remove ipStrategy=" + next.toString(), null, new Object[0]);
                    }
                }
            }
        }
        return this.isChanged;
    }

    public void checkInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdaa2bf", new Object[]{this});
            return;
        }
        if (this.ipStrategyList == null) {
            this.ipStrategyList = new ArrayList();
        }
        if (this.historyItemMap == null) {
            this.historyItemMap = new SerialLruCache(40);
        }
        Iterator<Map.Entry<Integer, ConnHistoryItem>> it = this.historyItemMap.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().isExpire()) {
                it.remove();
            }
        }
        for (IPConnStrategy iPConnStrategy : this.ipStrategyList) {
            if (!this.historyItemMap.containsKey(Integer.valueOf(iPConnStrategy.getUniqueId()))) {
                this.historyItemMap.put(Integer.valueOf(iPConnStrategy.getUniqueId()), new ConnHistoryItem());
            }
        }
        Collections.sort(this.ipStrategyList, getDefaultComparator());
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : new ArrayList(this.ipStrategyList).toString();
    }

    public List<IConnStrategy> getStrategyList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1da76e59", new Object[]{this}) : getStrategyList("", false, "", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0119, code lost:
        r11 = new java.util.LinkedList();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<anet.channel.strategy.IConnStrategy> getStrategyList(java.lang.String r21, boolean r22, java.lang.String r23, anet.channel.strategy.StrategyCollection.StrategyTypeStat r24) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.StrategyEntity.getStrategyList(java.lang.String, boolean, java.lang.String, anet.channel.strategy.StrategyCollection$StrategyTypeStat):java.util.List");
    }

    public void update(StrategyResultParser.Dns dns, String str, String str2) {
        int i;
        String str3;
        int i2;
        StrategyResultParser.Channel[] channelArr;
        String str4 = str;
        String str5 = str2;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b96490e2", new Object[]{this, dns, str4, str5});
            return;
        }
        for (IPConnStrategy iPConnStrategy : this.ipStrategyList) {
            iPConnStrategy.isToRemove = true;
        }
        ALog.e(TAG, "[strategy opt] update ipStrategyList, isToRemove!", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", dns.host, "ipStrategyList", this.ipStrategyList);
        this.amdcResultStat = new AmdcResultStat();
        int i4 = 0;
        while (i4 < dns.servers.length) {
            boolean z = dns.servers[i4].isStaticBgp;
            StrategyResultParser.Channel[] channelArr2 = dns.servers[i4].channels;
            StrategyResultParser.ProxyServer[] proxyServerArr = dns.servers[i4].proxies;
            if (channelArr2 != null && channelArr2.length != 0) {
                int length = channelArr2.length;
                while (i3 < length) {
                    StrategyResultParser.Channel channel = channelArr2[i3];
                    StrategyResultParser.ChannelAttribute[] channelAttributeArr = channel.attributes;
                    String[] strArr = channel.ips;
                    if (channelAttributeArr != null) {
                        i2 = length;
                        if (channelAttributeArr.length != 0 && strArr != null && strArr.length != 0) {
                            int length2 = channelAttributeArr.length;
                            channelArr = channelArr2;
                            int i5 = 0;
                            while (i5 < length2) {
                                int i6 = length2;
                                StrategyResultParser.ChannelAttribute channelAttribute = channelAttributeArr[i5];
                                StrategyResultParser.ChannelAttribute[] channelAttributeArr2 = channelAttributeArr;
                                channelAttribute.unit = dns.unit;
                                channelAttribute.accessPoint = str4;
                                channelAttribute.clientIp = str5;
                                int length3 = strArr.length;
                                int i7 = 0;
                                while (i7 < length3) {
                                    handleUpdate(strArr[i7], !z ? 1 : 0, channelAttribute, proxyServerArr);
                                    i7++;
                                    strArr = strArr;
                                }
                                i5++;
                                str4 = str;
                                str5 = str2;
                                length2 = i6;
                                channelAttributeArr = channelAttributeArr2;
                            }
                            i3++;
                            str4 = str;
                            str5 = str2;
                            length = i2;
                            channelArr2 = channelArr;
                        }
                    } else {
                        i2 = length;
                    }
                    channelArr = channelArr2;
                    i3++;
                    str4 = str;
                    str5 = str2;
                    length = i2;
                    channelArr2 = channelArr;
                }
                if (z) {
                    this.containsStaticIp = true;
                }
            }
            i4++;
            str4 = str;
            str5 = str2;
            i3 = 0;
        }
        ListIterator<IPConnStrategy> listIterator = this.ipStrategyList.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().isToRemove) {
                listIterator.remove();
            }
        }
        try {
            Collections.sort(this.ipStrategyList, getDefaultComparator());
            StrategyCallBackHelper.notifyStrategyCallBack(dns.host);
            ALog.e(TAG, "[strategy opt] update ipStrategyList! ", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", dns.host, "ipStrategyList", this.ipStrategyList);
            i = 0;
            str3 = null;
        } catch (Exception e) {
            this.amdcResultStat.code = -100;
            i = 0;
            str3 = null;
            ALog.e(TAG, "strategy sort error!", null, e, new Object[0]);
        }
        this.amdcResultStat.host = dns.host;
        AmdcResultStat amdcResultStat = this.amdcResultStat;
        amdcResultStat.trace = TAG;
        ALog.d(TAG, amdcResultStat.toString(), str3, new Object[i]);
        AppMonitor.getInstance().commitStat(this.amdcResultStat);
    }

    private void handleUpdate(final String str, int i, final StrategyResultParser.ChannelAttribute channelAttribute, StrategyResultParser.ProxyServer[] proxyServerArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("137b105c", new Object[]{this, str, new Integer(i), channelAttribute, proxyServerArr});
            return;
        }
        final ConnProtocol valueOf = ConnProtocol.valueOf(channelAttribute);
        final List<ProxyStrategy> convertProxyStrategy = convertProxyStrategy(proxyServerArr);
        int find = find(this.ipStrategyList, new Predicate<IPConnStrategy>() { // from class: anet.channel.strategy.StrategyEntity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.strategy.StrategyEntity.Predicate
            public boolean apply(IPConnStrategy iPConnStrategy) {
                List list;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("a49d31a5", new Object[]{this, iPConnStrategy})).booleanValue();
                }
                boolean z = iPConnStrategy.getPort() == channelAttribute.port && iPConnStrategy.getIp().equals(str) && iPConnStrategy.protocol.equals(valueOf);
                return (iPConnStrategy.proxyStrategies == null || iPConnStrategy.proxyStrategies.isEmpty() ? !(!z || ((list = convertProxyStrategy) != null && !list.isEmpty())) : !(!z || !iPConnStrategy.proxyStrategies.equals(convertProxyStrategy))) && iPConnStrategy.supportMultiPath == iPConnStrategy.supportMultiPath;
            }
        });
        if (find != -1) {
            IPConnStrategy iPConnStrategy = this.ipStrategyList.get(find);
            iPConnStrategy.cto = channelAttribute.cto;
            iPConnStrategy.rto = channelAttribute.rto;
            iPConnStrategy.heartbeat = channelAttribute.heartbeat;
            iPConnStrategy.ipType = i;
            iPConnStrategy.ipSource = 0;
            iPConnStrategy.isToRemove = false;
            iPConnStrategy.proxyStrategies = convertProxyStrategy;
            iPConnStrategy.supportMultiPath = channelAttribute.supportMultiPath;
            iPConnStrategy.unit = channelAttribute.unit;
            iPConnStrategy.accessPoint = channelAttribute.accessPoint;
            if (!this.historyItemMap.containsKey(Integer.valueOf(iPConnStrategy.getUniqueId()))) {
                this.historyItemMap.put(Integer.valueOf(iPConnStrategy.getUniqueId()), new ConnHistoryItem());
            }
            if (iPConnStrategy.commonInfo == null) {
                return;
            }
            iPConnStrategy.commonInfo.remove("isStrategyInvalid");
            return;
        }
        IPConnStrategy create = IPConnStrategy.create(str, channelAttribute);
        if (create != null) {
            create.ipType = i;
            create.ipSource = 0;
            create.proxyStrategies = convertProxyStrategy;
            create.supportMultiPath = channelAttribute.supportMultiPath;
            if (!this.historyItemMap.containsKey(Integer.valueOf(create.getUniqueId()))) {
                this.historyItemMap.put(Integer.valueOf(create.getUniqueId()), new ConnHistoryItem());
            }
            create.unit = channelAttribute.unit;
            create.accessPoint = channelAttribute.accessPoint;
            this.ipStrategyList.add(create);
        }
        if (Utils.isIPV6Address(str)) {
            this.amdcResultStat.isContainIpv6 = true;
        }
        if (!ConnType.HTTP3.equals(valueOf.protocol) && !ConnType.HTTP3_PLAIN.equals(valueOf.protocol)) {
            return;
        }
        this.amdcResultStat.isContainHttp3 = true;
    }

    private List<ProxyStrategy> convertProxyStrategy(StrategyResultParser.ProxyServer[] proxyServerArr) {
        StrategyResultParser.ProxyServer[] proxyServerArr2 = proxyServerArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("62cfa911", new Object[]{this, proxyServerArr2});
        }
        if (proxyServerArr2 == null || proxyServerArr2.length <= 0) {
            return Collections.EMPTY_LIST;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int length = proxyServerArr2.length;
            int i = 0;
            while (i < length) {
                StrategyResultParser.Channel[] channelArr = proxyServerArr2[i].proxyChannel;
                if (channelArr != null && channelArr.length > 0) {
                    for (StrategyResultParser.Channel channel : channelArr) {
                        String[] strArr = channel.ips;
                        StrategyResultParser.ChannelAttribute[] channelAttributeArr = channel.attributes;
                        if (channelAttributeArr != null && channelAttributeArr.length != 0 && strArr != null && strArr.length != 0) {
                            for (StrategyResultParser.ChannelAttribute channelAttribute : channelAttributeArr) {
                                if (channelAttribute != null && !TextUtils.isEmpty(channelAttribute.protocol)) {
                                    for (String str : strArr) {
                                        if (!TextUtils.isEmpty(str)) {
                                            arrayList.add(ProxyStrategy.create(str, channelAttribute.port, channelAttribute.protocol));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i++;
                proxyServerArr2 = proxyServerArr;
            }
            return arrayList;
        } catch (Exception unused) {
            ALog.e(TAG, "[convertProxyStrategy]error", null, new Object[0]);
            return Collections.EMPTY_LIST;
        }
    }

    public boolean shouldRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1634633", new Object[]{this})).booleanValue();
        }
        boolean z = true;
        boolean z2 = true;
        for (IPConnStrategy iPConnStrategy : this.ipStrategyList) {
            if (!this.historyItemMap.get(Integer.valueOf(iPConnStrategy.getUniqueId())).latestFail()) {
                if (iPConnStrategy.ipType == 0) {
                    z = false;
                }
                z2 = false;
            }
        }
        return (this.containsStaticIp && z) || z2;
    }

    public void notifyConnEvent(IConnStrategy iConnStrategy, ConnEvent connEvent) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37f61186", new Object[]{this, iConnStrategy, connEvent});
            return;
        }
        try {
            if (!(iConnStrategy instanceof IPConnStrategy) || this.ipStrategyList.indexOf(iConnStrategy) == -1) {
                return;
            }
            IPConnStrategy iPConnStrategy = (IPConnStrategy) iConnStrategy;
            if (AwcnConfig.isTunnelOptEnable()) {
                if (connEvent.isTunnel && connEvent.useProxyStrategy != null) {
                    ConnHistoryItem connHistoryItem = this.historyItemMap.get(Integer.valueOf(iPConnStrategy.getUniqueId()));
                    if (connHistoryItem.proxyHistoryItemMap == null) {
                        connHistoryItem.proxyHistoryItemMap = new SerialLruCache(5);
                    }
                    connEvent.useProxyStrategy.status = connEvent.isSuccess ? 1 : 0;
                    connEvent.useProxyStrategy.connHistoryItem.update(connEvent.isSuccess);
                    ConnHistoryItem connHistoryItem2 = connHistoryItem.proxyHistoryItemMap.get(Integer.valueOf(connEvent.useProxyStrategy.hashCode()));
                    synchronized (connHistoryItem.proxyHistoryItemMap) {
                        if (connHistoryItem2 == null) {
                            connHistoryItem.proxyHistoryItemMap.put(Integer.valueOf(connEvent.useProxyStrategy.hashCode()), connEvent.useProxyStrategy.connHistoryItem);
                        }
                    }
                    ALog.e(TAG, "[tunnel_opt]", null, "useProxyStrategy", connEvent.useProxyStrategy, "isSuccess", Boolean.valueOf(connEvent.isSuccess));
                } else if (AwcnConfig.isWifiUnavailableUseCellOptOpened() && connEvent.isForceCell) {
                    updateForceCellHistoryItem(iPConnStrategy, connEvent);
                } else {
                    iPConnStrategy.status = connEvent.isSuccess ? 1 : 0;
                    this.historyItemMap.get(Integer.valueOf(iPConnStrategy.getUniqueId())).update(connEvent.isSuccess);
                    ALog.e(TAG, "[tunnel_opt]", null, "ipConnStrategy", iPConnStrategy, "isSuccess", Boolean.valueOf(connEvent.isSuccess));
                }
            } else if (AwcnConfig.isWifiUnavailableUseCellOptOpened() && connEvent.isForceCell) {
                updateForceCellHistoryItem(iPConnStrategy, connEvent);
            } else {
                if (!connEvent.isSuccess) {
                    i = 0;
                }
                iPConnStrategy.status = i;
                this.historyItemMap.get(Integer.valueOf(iPConnStrategy.getUniqueId())).update(connEvent.isSuccess);
            }
            Collections.sort(this.ipStrategyList, this.defaultComparator);
        } catch (Exception unused) {
        }
    }

    private void updateForceCellHistoryItem(IPConnStrategy iPConnStrategy, ConnEvent connEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdadfa", new Object[]{this, iPConnStrategy, connEvent});
        } else if (iPConnStrategy == null || connEvent == null) {
            ALog.e(TAG, "[wifi fg detect opt] updateForceCellHistoryItem fail!", null, new Object[0]);
        } else {
            ConnHistoryItem connHistoryItem = this.historyItemMap.get(Integer.valueOf(iPConnStrategy.getUniqueId()));
            if (connHistoryItem.forceCellHistoryItemMap == null) {
                connHistoryItem.forceCellHistoryItemMap = new SerialLruCache(5);
            }
            if (connHistoryItem.forceCellHistoryItemMap.get(Integer.valueOf(iPConnStrategy.getUniqueId())) == null) {
                synchronized (connHistoryItem.forceCellHistoryItemMap) {
                    ConnHistoryItem connHistoryItem2 = new ConnHistoryItem();
                    connHistoryItem2.update(connEvent.isSuccess);
                    connHistoryItem.forceCellHistoryItemMap.put(Integer.valueOf(iPConnStrategy.getUniqueId()), connHistoryItem2);
                }
            } else {
                connHistoryItem.forceCellHistoryItemMap.get(Integer.valueOf(iPConnStrategy.getUniqueId())).update(connEvent.isSuccess);
            }
            ALog.e(TAG, "[wifi fg detect opt] ", null, "isForceCell", Boolean.valueOf(connEvent.isForceCell), "isSuccess", Boolean.valueOf(connEvent.isSuccess));
        }
    }

    private Comparator getDefaultComparator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Comparator) ipChange.ipc$dispatch("d07d9d47", new Object[]{this});
        }
        if (this.defaultComparator == null) {
            this.defaultComparator = new Comparator<IPConnStrategy>() { // from class: anet.channel.strategy.StrategyEntity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.Comparator
                public int compare(IPConnStrategy iPConnStrategy, IPConnStrategy iPConnStrategy2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("242794b7", new Object[]{this, iPConnStrategy, iPConnStrategy2})).intValue();
                    }
                    ConnHistoryItem connHistoryItem = (ConnHistoryItem) StrategyEntity.access$000(StrategyEntity.this).get(Integer.valueOf(iPConnStrategy.getUniqueId()));
                    ConnHistoryItem connHistoryItem2 = (ConnHistoryItem) StrategyEntity.access$000(StrategyEntity.this).get(Integer.valueOf(iPConnStrategy2.getUniqueId()));
                    if (connHistoryItem == null) {
                        connHistoryItem = new ConnHistoryItem();
                        StrategyEntity.access$000(StrategyEntity.this).put(Integer.valueOf(iPConnStrategy.getUniqueId()), connHistoryItem);
                    }
                    if (connHistoryItem2 == null) {
                        connHistoryItem2 = new ConnHistoryItem();
                        StrategyEntity.access$000(StrategyEntity.this).put(Integer.valueOf(iPConnStrategy2.getUniqueId()), connHistoryItem2);
                    }
                    int countFail = connHistoryItem.countFail();
                    int countFail2 = connHistoryItem2.countFail();
                    if (countFail2 > countFail) {
                        ALog.e(StrategyEntity.TAG, "[Ipv6_H3] [getDefaultComparator]", null, pqe.STAGE_T1, iPConnStrategy.toString() + "_" + countFail, pqe.STAGE_T2, iPConnStrategy2.toString() + "_" + countFail2);
                        return -1;
                    } else if (Inet64Util.getStackType() == 3 && Utils.isIPV4Address(iPConnStrategy2.getIp()) && Utils.isIPV6Address(iPConnStrategy.getIp())) {
                        return -1;
                    } else {
                        if (!Inet64Util.isHttp3(iPConnStrategy2) && Inet64Util.isHttp3(iPConnStrategy)) {
                            return -1;
                        }
                        if (iPConnStrategy2.ipType == 1 && iPConnStrategy.ipType == 0) {
                            return -1;
                        }
                        return (!Inet64Util.isHttp(iPConnStrategy2) || Inet64Util.isHttp(iPConnStrategy)) ? 0 : -1;
                    }
                }
            };
        }
        return this.defaultComparator;
    }

    private static <T> int find(Collection<T> collection, Predicate<T> predicate) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("567c802d", new Object[]{collection, predicate})).intValue();
        }
        if (collection == null) {
            return -1;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext() && !predicate.apply(it.next())) {
            i++;
        }
        if (i != collection.size()) {
            return i;
        }
        return -1;
    }

    public List<IPConnStrategy> getIpStrategyList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("acde29b2", new Object[]{this}) : this.ipStrategyList;
    }

    public Map<Integer, ConnHistoryItem> getHistoryItemMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e62478c7", new Object[]{this}) : this.historyItemMap;
    }

    public boolean isContainsStaticIp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7324f249", new Object[]{this})).booleanValue() : this.containsStaticIp;
    }
}
