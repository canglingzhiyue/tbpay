package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.Config;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.SessionCenter;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.entity.SessionType;
import anet.channel.quic.Http3ConnectionDetector;
import anet.channel.statist.LocalDnsLookupStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.strategy.utils.AmdcThreadPoolExecutor;
import anet.channel.strategy.utils.Utils;
import anet.channel.util.ALog;
import anet.channel.util.Inet64Util;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.net.g;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class LocalDnsStrategyTable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.LocalDnsStrategyTable";
    public final ConcurrentHashMap<String, List<IPConnStrategy>> localStrategyMap = new ConcurrentHashMap<>();
    public final HashMap<String, Object> lockObjMap = new HashMap<>();

    static {
        kge.a(1148935072);
    }

    public static /* synthetic */ void access$000(LocalDnsStrategyTable localDnsStrategyTable, LocalDnsLookupStatistic localDnsLookupStatistic, String str, String str2, int i, int i2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fdb0457", new Object[]{localDnsStrategyTable, localDnsLookupStatistic, str, str2, new Integer(i), new Integer(i2), str3});
        } else {
            localDnsStrategyTable.buildConnProtocol(localDnsLookupStatistic, str, str2, i, i2, str3);
        }
    }

    public List queryByHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f68c7a6f", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !Utils.checkHostValidAndNotIp(str)) {
            return Collections.EMPTY_LIST;
        }
        if (ALog.isPrintLog(1)) {
            ALog.d(TAG, "try resolve ip with local dns", null, "host", str);
        }
        List list = Collections.EMPTY_LIST;
        if (!this.localStrategyMap.containsKey(str)) {
            startLocalDnsLookup(str, null, StrategyTemplate.LocalDnsSessionType.SHORT_LINK.ordinal(), 0, false);
        }
        List<IPConnStrategy> list2 = this.localStrategyMap.get(str);
        if (list2 != null && list2 != Collections.EMPTY_LIST) {
            list = new ArrayList(list2);
        }
        ALog.e(TAG, "get local strategy", null, "strategyList", list2, "host", str);
        return list;
    }

    public void queryLocalDnsByHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c73a41b6", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || !Utils.checkHostValidAndNotIp(str) || DispatchConstants.getAmdcServerDomain().equalsIgnoreCase(str)) {
        } else {
            if (this.localStrategyMap.containsKey(str)) {
                ALog.e(TAG, "[queryLocalDnsByHost] localStrategyMap contains host", null, "strategyList", this.localStrategyMap.get(str));
                return;
            }
            startLocalDnsLookup(str, null, StrategyTemplate.LocalDnsSessionType.SHORT_LINK.ordinal(), 0, false);
            ALog.e(TAG, "[queryLocalDnsByHost] localStrategyMap not contains host, startLocalDnsLookup", null, "host", str);
        }
    }

    private void startLocalDnsLookup(String str, String str2, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d06d405f", new Object[]{this, str, str2, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        synchronized (this.lockObjMap) {
            if (!this.lockObjMap.containsKey(str)) {
                Object obj = new Object();
                this.lockObjMap.put(str, obj);
                startLocalDnsLookup(str, obj, str2, i, i2, z);
            }
        }
    }

    public void setProtocolForHost(String str, ConnProtocol connProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92c35496", new Object[]{this, str, connProtocol});
            return;
        }
        List<IPConnStrategy> list = this.localStrategyMap.get(str);
        if (list != null && !list.isEmpty()) {
            for (IPConnStrategy iPConnStrategy : list) {
                if (iPConnStrategy.getProtocol().equals(connProtocol)) {
                    ALog.e(TAG, "setProtocolForHost localStrategyMap already exist", null, "strategyList", list);
                    return;
                }
            }
            list.add(IPConnStrategy.create(list.get(0).getIp(), !isSSL(connProtocol) ? 80 : 443, connProtocol, 0, 0, 1, g.FOREGROUND_INTERVAL, null, null, null));
            ALog.i(TAG, "[setProtocolForHost]", null, "strategyList", list);
            return;
        }
        ALog.e(TAG, "[setProtocolForHost] localStrategyList is null,  startLocalDnsLookup  host= " + str, null, new Object[0]);
        startLocalDnsLookup(str, null, StrategyTemplate.LocalDnsSessionType.SHORT_LINK.ordinal(), 0, true);
    }

    public ConnProtocol setHTTP3ProtocolForHost(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnProtocol) ipChange.ipc$dispatch("6aa2210c", new Object[]{this, str, str2, new Integer(i)});
        }
        List<IPConnStrategy> list = this.localStrategyMap.get(str);
        if (list == null || list.isEmpty()) {
            ALog.e(TAG, "[setHTTP3ProtocolForHost] localStrategyList is null,  setHTTP3ProtocolForHost  host= " + str, null, new Object[0]);
            startLocalDnsLookup(str, str2, StrategyTemplate.LocalDnsSessionType.USE_HTT3.ordinal(), i, true);
        }
        return ConnProtocol.valueOf(ConnType.HTTP3, "", "");
    }

    public void notifyConnEvent(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        List<IPConnStrategy> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46e0d0", new Object[]{this, str, iConnStrategy, connEvent});
        } else if (connEvent.isSuccess || TextUtils.isEmpty(str) || connEvent.isAccs || (list = this.localStrategyMap.get(str)) == null || list == Collections.EMPTY_LIST) {
        } else {
            Iterator<IPConnStrategy> it = list.iterator();
            while (it.hasNext()) {
                if (it.next() == iConnStrategy) {
                    it.remove();
                }
            }
            if (!list.isEmpty()) {
                return;
            }
            this.localStrategyMap.remove(str);
        }
    }

    public void localDnsLookupByHost(String str, String str2, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ba58c82", new Object[]{this, str, str2, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        boolean z2 = !Utils.checkHostValidAndNotIp(str);
        if (TextUtils.isEmpty(str) || z2) {
            ALog.e(TAG, "[Ipv6_H3] localDnsLookupByHost executeNowStartLocalDns isEmpty or checkHostValidAndNotIp", null, "host", str, "checkHostValidAndNotIp", Boolean.valueOf(z2));
        } else if (this.localStrategyMap.containsKey(str)) {
        } else {
            executeNowStartLocalDns(str, str2, i, i2, z);
        }
    }

    private void executeNowStartLocalDns(String str, String str2, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8743a7a", new Object[]{this, str, str2, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        synchronized (this.lockObjMap) {
            if (!this.lockObjMap.containsKey(str)) {
                Object obj = new Object();
                this.lockObjMap.put(str, obj);
                ALog.e(TAG, "[Ipv6_H3] executeNowStartLocalDns start ", null, "host", str);
                startLocalDnsLookup(str, obj, str2, i, i2, z);
            }
        }
    }

    private void startLocalDnsLookup(final String str, final Object obj, final String str2, final int i, final int i2, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7658dec3", new Object[]{this, str, obj, str2, new Integer(i), new Integer(i2), new Boolean(z)});
        } else {
            AmdcThreadPoolExecutor.submitLocalDnsTask(new Runnable() { // from class: anet.channel.strategy.LocalDnsStrategyTable.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    int i3;
                    int i4;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    LocalDnsLookupStatistic localDnsLookupStatistic = new LocalDnsLookupStatistic(str);
                    String str3 = null;
                    try {
                        try {
                            if (Inet64Util.getStackType() == 3) {
                                InetAddress[] allByName = InetAddress.getAllByName(str);
                                int length = allByName.length;
                                int i5 = 0;
                                boolean z2 = false;
                                boolean z3 = false;
                                while (i5 < length) {
                                    String hostAddress = allByName[i5].getHostAddress();
                                    if (hostAddress != null) {
                                        ALog.e(LocalDnsStrategyTable.TAG, "[Ipv6_H3] executeNowStartLocalDns IP_DUAL_STACK  ip = " + hostAddress, str3, "host", str, "isPreSession", Boolean.valueOf(z));
                                        i3 = i5;
                                        i4 = length;
                                        LocalDnsStrategyTable.access$000(LocalDnsStrategyTable.this, localDnsLookupStatistic, str, hostAddress, i, i2, str2);
                                        if (!z2 && Utils.isIPV6Address(hostAddress)) {
                                            z2 = true;
                                        } else if (!z3 && Utils.isIPV4Address(hostAddress)) {
                                            z3 = true;
                                        }
                                        if (z3 && z2) {
                                            break;
                                        }
                                    } else {
                                        i3 = i5;
                                        i4 = length;
                                    }
                                    i5 = i3 + 1;
                                    length = i4;
                                    str3 = null;
                                }
                            } else {
                                String hostAddress2 = InetAddress.getByName(str).getHostAddress();
                                ALog.e(LocalDnsStrategyTable.TAG, "[Ipv6_H3] executeNowStartLocalDns ip = " + hostAddress2, null, "host", str, "isPreSession", Boolean.valueOf(z));
                                LocalDnsStrategyTable.access$000(LocalDnsStrategyTable.this, localDnsLookupStatistic, str, hostAddress2, i, i2, str2);
                            }
                            if (AwcnConfig.isPreSessionOptEnable() && AwcnConfig.isPreSessionWhiteList(str) && z) {
                                SessionCenter.getInstance(new Config.Builder().setAppkey(GlobalAppRuntimeInfo.getAppkey()).setEnv(ENV.ONLINE).build()).handlePreSession("https", str, "local");
                            }
                            AppMonitor.getInstance().commitStat(localDnsLookupStatistic);
                            StrategyCallBackHelper.notifyStrategyCallBack(str);
                            ALog.e(LocalDnsStrategyTable.TAG, "startLocalDnsLookup ps =" + localDnsLookupStatistic.toString(), null, "host", str);
                            if (ALog.isPrintLog(1)) {
                                ALog.d(LocalDnsStrategyTable.TAG, "startLocalDnsLookup startLocalDnsLookup", null, "host", str, "list", LocalDnsStrategyTable.this.localStrategyMap.get(str));
                            }
                            synchronized (LocalDnsStrategyTable.this.lockObjMap) {
                                LocalDnsStrategyTable.this.lockObjMap.remove(str);
                            }
                            synchronized (obj) {
                                obj.notifyAll();
                            }
                        } catch (Exception e) {
                            ALog.e(LocalDnsStrategyTable.TAG, "startLocalDnsLookup resolve ip by local dns failed, e=" + e.toString(), null, "host", str);
                            if (ALog.isPrintLog(1)) {
                                ALog.d(LocalDnsStrategyTable.TAG, "startLocalDnsLookup startLocalDnsLookup", null, "host", str, "list", LocalDnsStrategyTable.this.localStrategyMap.get(str));
                            }
                            synchronized (LocalDnsStrategyTable.this.lockObjMap) {
                                LocalDnsStrategyTable.this.lockObjMap.remove(str);
                                synchronized (obj) {
                                    obj.notifyAll();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        if (ALog.isPrintLog(1)) {
                            ALog.d(LocalDnsStrategyTable.TAG, "startLocalDnsLookup startLocalDnsLookup", null, "host", str, "list", LocalDnsStrategyTable.this.localStrategyMap.get(str));
                        }
                        synchronized (LocalDnsStrategyTable.this.lockObjMap) {
                            LocalDnsStrategyTable.this.lockObjMap.remove(str);
                            synchronized (obj) {
                                obj.notifyAll();
                                throw th;
                            }
                        }
                    }
                }
            });
        }
    }

    private void buildConnProtocol(LocalDnsLookupStatistic localDnsLookupStatistic, String str, String str2, int i, int i2, String str3) {
        boolean isInternalAddr;
        ConnProtocol connProtocol;
        ConnProtocol connProtocol2;
        List<IPConnStrategy> list;
        String str4;
        char c;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0959f86", new Object[]{this, localDnsLookupStatistic, str, str2, new Integer(i), new Integer(i2), str3});
        } else if (str == null || str2 == null) {
        } else {
            LocalDnsLookupStatistic localDnsLookupStatistic2 = localDnsLookupStatistic == null ? new LocalDnsLookupStatistic(str) : localDnsLookupStatistic;
            if (AwcnConfig.isPreHostMccNotUseEnable()) {
                ALog.e(TAG, "startLocalDnsLookup" + str2 + " , not use mcc=", null, "host", str);
                isInternalAddr = true;
            } else {
                isInternalAddr = NetworkStatusHelper.isInternalAddr();
                localDnsLookupStatistic2.useMcc = NetworkStatusHelper.getRealMcc();
                ALog.e(TAG, "startLocalDnsLookup" + str2 + " ,use mcc=" + NetworkStatusHelper.getRealMcc(), null, "host", str);
            }
            if (i != StrategyTemplate.LocalDnsSessionType.USE_HTT3.ordinal() || AwcnConfig.isHttp3VipBlackList(str2) || !isInternalAddr || (AwcnConfig.isXquicRemoteEnable() && (!AwcnConfig.isXquicRemoteEnable() || !Http3ConnectionDetector.isQuicReady()))) {
                connProtocol = null;
            } else {
                localDnsLookupStatistic2.isUseHTTP3 = 1;
                connProtocol = ConnProtocol.valueOf(ConnType.HTTP3, "", "");
                ALog.e(TAG, "startLocalDnsLookup http3 ip=" + str2, null, "host", str);
            }
            if (str3 != null) {
                localDnsLookupStatistic2.isUseHTTP2 = 1;
                connProtocol2 = ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, str3);
                ALog.e(TAG, "startLocalDnsLookup http2 ip=" + str2, null, "host", str);
            } else {
                connProtocol2 = null;
            }
            if (connProtocol == null) {
                connProtocol = connProtocol2;
            }
            List<IPConnStrategy> list2 = this.localStrategyMap.get(str);
            if (list2 == null || list2.isEmpty()) {
                list2 = new LinkedList<>();
            }
            List<IPConnStrategy> list3 = list2;
            if (connProtocol == null) {
                connProtocol = StrategyTemplate.getInstance().getConnProtocol(str);
            }
            ConnProtocol connProtocol3 = connProtocol;
            if (connProtocol3 != null) {
                int i4 = 80;
                int i5 = isSSL(connProtocol3) ? 443 : 80;
                if (ConnType.HTTP3.equalsIgnoreCase(connProtocol3.protocol)) {
                    if (i2 != 0 ? i2 != 1 : isSSL(connProtocol3)) {
                        i4 = 443;
                    }
                    i3 = i4;
                } else {
                    i3 = i5;
                }
                list = list3;
                str4 = TAG;
                c = 1;
                list.add(IPConnStrategy.create(str2, i3, connProtocol3, 0, 0, 1, g.FOREGROUND_INTERVAL, null, null, null));
            } else {
                list = list3;
                str4 = TAG;
                c = 1;
            }
            list.add(IPConnStrategy.create(str2, 80, ConnProtocol.HTTP, 0, 0, 0, 0, null, null, null));
            list.add(IPConnStrategy.create(str2, 443, ConnProtocol.HTTPS, 0, 0, 0, 0, null, null, null));
            Collections.sort(list, new Comparator<IPConnStrategy>() { // from class: anet.channel.strategy.LocalDnsStrategyTable.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.Comparator
                public int compare(IPConnStrategy iPConnStrategy, IPConnStrategy iPConnStrategy2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("242794b7", new Object[]{this, iPConnStrategy, iPConnStrategy2})).intValue();
                    }
                    if (Utils.isIPV4Address(iPConnStrategy2.ip) && Utils.isIPV6Address(iPConnStrategy.ip)) {
                        return -1;
                    }
                    if (!Inet64Util.isHttp3(iPConnStrategy2) && Inet64Util.isHttp3(iPConnStrategy)) {
                        return -1;
                    }
                    return (!Inet64Util.isHttp(iPConnStrategy2) || Inet64Util.isHttp(iPConnStrategy)) ? 0 : -1;
                }
            });
            this.localStrategyMap.put(str, list);
            Object[] objArr = new Object[4];
            objArr[0] = "host";
            objArr[c] = str;
            objArr[2] = "list";
            objArr[3] = list;
            ALog.e(str4, "addToHTTP3LocalStrategyMap executeNowStartLocalDns", null, objArr);
        }
    }

    public List queryIpv4ByHost(String str, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d655a7fb", new Object[]{this, str, new Boolean(z), new Integer(i)});
        }
        List queryByHost = queryByHost(str);
        ListIterator listIterator = queryByHost.listIterator();
        while (listIterator.hasNext()) {
            IPConnStrategy iPConnStrategy = (IPConnStrategy) listIterator.next();
            if (Utils.isIPV6Address(iPConnStrategy.getIp())) {
                listIterator.remove();
            } else {
                ConnType valueOf = ConnType.valueOf(iPConnStrategy.getProtocol());
                if (valueOf == null) {
                    listIterator.remove();
                } else if (valueOf.isSSL() != z || (i != SessionType.ALL && valueOf.getType() != i)) {
                    listIterator.remove();
                }
            }
        }
        return queryByHost;
    }

    private boolean isSSL(ConnProtocol connProtocol) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("428b953b", new Object[]{this, connProtocol})).booleanValue() : connProtocol.protocol.equalsIgnoreCase("https") || connProtocol.protocol.equalsIgnoreCase(ConnType.H2S) || !TextUtils.isEmpty(connProtocol.publicKey);
    }

    public List<IConnStrategy> queryWithoutWait(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("49dff441", new Object[]{this, str});
        }
        List<IConnStrategy> list = Collections.EMPTY_LIST;
        List<IPConnStrategy> list2 = this.localStrategyMap.get(str);
        if (list2 != null && list2.size() != 0) {
            list = new ArrayList<>(list2);
        }
        ALog.i(TAG, "queryWithoutWait local strategy", null, "strategyList", list2);
        return list;
    }
}
