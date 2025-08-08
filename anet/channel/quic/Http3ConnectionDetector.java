package anet.channel.quic;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.detect.DetectHistoryRecord;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.ConnType;
import anet.channel.entity.Event;
import anet.channel.entity.EventCb;
import anet.channel.entity.SessionType;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.Http3DetectStat;
import anet.channel.statist.ZstdErrorStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyFilter;
import anet.channel.strategy.IStrategyListener;
import anet.channel.strategy.ProxyStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.StrategyResultParser;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.HttpUrl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.spdy.IPluginFetchCallback;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import tb.kge;

/* loaded from: classes.dex */
public class Http3ConnectionDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_DETECT_HOST_COUNT = 2;
    private static final long DEFAULT_DETECT_VALID_TIME = 21600000;
    public static final int FAILED = 0;
    private static final String MTOP_HOST = "https://guide-acs.m.taobao.com";
    private static final String SP_HISTORY_RECORDS = "networksdk_http3_history_records";
    private static final String SP_HTTP3_DETECTOR_HOST = "http3_detector_host";
    private static final String SP_HTTP3_DETECTOR_HOSTS = "http3_detector_hosts";
    public static final int SUCCESS = 1;
    private static final String TAG = "awcn.Http3ConnDetector";
    public static final int UNKNOWN = -1;
    private static AppLifecycle.AppLifecycleListener appLifecycleListener;
    private static DetectHistoryRecord detectHistoryRecord;
    private static long detectValidTime;
    private static AtomicBoolean haveTnetException;
    private static String host;
    private static CopyOnWriteArraySet<String> hostList;
    private static IStrategyFilter http3Filter;
    private static AtomicBoolean isCertInit;
    private static AtomicBoolean isInit;
    private static boolean isWaitForegroundDetect;
    private static NetworkStatusHelper.INetworkStatusChangeListener networkStatusChangeListener;
    private static AtomicInteger seq;
    private static SharedPreferences sharedPreferences;
    private static IStrategyListener strategyListener;

    public static /* synthetic */ String access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("682607c7", new Object[0]) : host;
    }

    public static /* synthetic */ String access$202(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5c6713b", new Object[]{str});
        }
        host = str;
        return str;
    }

    public static /* synthetic */ SharedPreferences access$300() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("c4e79b8e", new Object[0]) : sharedPreferences;
    }

    public static /* synthetic */ CopyOnWriteArraySet access$400() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArraySet) ipChange.ipc$dispatch("3930682e", new Object[0]) : hostList;
    }

    public static /* synthetic */ boolean access$500() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c5552fc0", new Object[0])).booleanValue() : isWaitForegroundDetect;
    }

    public static /* synthetic */ boolean access$502(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8bb2bda", new Object[]{new Boolean(z)})).booleanValue();
        }
        isWaitForegroundDetect = z;
        return z;
    }

    public static /* synthetic */ void access$600(NetworkStatusHelper.NetworkStatus networkStatus, String str, String str2, List list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a7b266", new Object[]{networkStatus, str, str2, list, new Integer(i)});
        } else {
            startOneDetect(networkStatus, str, str2, list, i);
        }
    }

    public static /* synthetic */ DetectHistoryRecord access$700() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetectHistoryRecord) ipChange.ipc$dispatch("bef5f49a", new Object[0]) : detectHistoryRecord;
    }

    static {
        kge.a(-1872894467);
        hostList = new CopyOnWriteArraySet<>();
        isInit = new AtomicBoolean(false);
        isCertInit = new AtomicBoolean(false);
        haveTnetException = new AtomicBoolean(false);
        detectValidTime = 21600000L;
        isWaitForegroundDetect = false;
        http3Filter = new IStrategyFilter() { // from class: anet.channel.quic.Http3ConnectionDetector.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.strategy.IStrategyFilter
            public boolean accept(IConnStrategy iConnStrategy) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5d8721cb", new Object[]{this, iConnStrategy})).booleanValue();
                }
                String str = iConnStrategy.getProtocol().protocol;
                return ConnType.HTTP3.equals(str) || ConnType.HTTP3_PLAIN.equals(str);
            }
        };
        seq = new AtomicInteger(1);
        strategyListener = new IStrategyListener() { // from class: anet.channel.quic.Http3ConnectionDetector.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ void access$000(AnonymousClass2 anonymousClass2, StrategyResultParser.Dns[] dnsArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1c809b74", new Object[]{anonymousClass2, dnsArr});
                } else {
                    anonymousClass2.updateDnsByHosts(dnsArr);
                }
            }

            public static /* synthetic */ void access$100(AnonymousClass2 anonymousClass2, StrategyResultParser.Dns[] dnsArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("758be6f5", new Object[]{anonymousClass2, dnsArr});
                } else {
                    anonymousClass2.updateDns(dnsArr);
                }
            }

            @Override // anet.channel.strategy.IStrategyListener
            public void onStrategyUpdated(final StrategyResultParser.HttpDnsResponse httpDnsResponse) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c33e6115", new Object[]{this, httpDnsResponse});
                } else if (httpDnsResponse == null) {
                } else {
                    ThreadPoolExecutorFactory.submitDetectTask(new Runnable() { // from class: anet.channel.quic.Http3ConnectionDetector.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (AwcnConfig.isDetectH3OptOpened()) {
                                AnonymousClass2.access$000(AnonymousClass2.this, httpDnsResponse.dns);
                            } else {
                                AnonymousClass2.access$100(AnonymousClass2.this, httpDnsResponse.dns);
                            }
                        }
                    });
                }
            }

            private void updateDns(StrategyResultParser.Dns[] dnsArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("42bf994c", new Object[]{this, dnsArr});
                } else if (dnsArr != null && dnsArr.length != 0) {
                    for (StrategyResultParser.Dns dns : dnsArr) {
                        String str = dns.host;
                        if (!AwcnConfig.isHostInHttp3BlackList(str) && dns.servers != null) {
                            for (int i = 0; i < dns.servers.length; i++) {
                                StrategyResultParser.Channel[] channelArr = dns.servers[i].channels;
                                if (channelArr != null && channelArr.length != 0) {
                                    for (StrategyResultParser.Channel channel : channelArr) {
                                        StrategyResultParser.ChannelAttribute[] channelAttributeArr = channel.attributes;
                                        if (channelAttributeArr != null && channelAttributeArr.length != 0) {
                                            for (StrategyResultParser.ChannelAttribute channelAttribute : channelAttributeArr) {
                                                String str2 = channelAttribute.protocol;
                                                if (ConnType.HTTP3.equals(str2) || ConnType.HTTP3_PLAIN.equals(str2)) {
                                                    if (!str.equals(Http3ConnectionDetector.access$200())) {
                                                        Http3ConnectionDetector.access$202(str);
                                                        SharedPreferences.Editor edit = Http3ConnectionDetector.access$300().edit();
                                                        edit.putString(Http3ConnectionDetector.SP_HTTP3_DETECTOR_HOST, Http3ConnectionDetector.access$200());
                                                        edit.apply();
                                                    }
                                                    Http3ConnectionDetector.startDetect(NetworkStatusHelper.getStatus());
                                                    return;
                                                }
                                            }
                                            continue;
                                        }
                                    }
                                    continue;
                                }
                            }
                            continue;
                        }
                    }
                }
            }

            private void updateDnsByHosts(StrategyResultParser.Dns[] dnsArr) {
                boolean z;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("30152778", new Object[]{this, dnsArr});
                } else if (dnsArr != null && dnsArr.length != 0) {
                    ArrayList arrayList = null;
                    for (StrategyResultParser.Dns dns : dnsArr) {
                        String str = dns.host;
                        if (!AwcnConfig.isHostInHttp3BlackList(str) && dns.servers != null) {
                            ArrayList arrayList2 = arrayList;
                            for (int i = 0; i < dns.servers.length; i++) {
                                StrategyResultParser.Channel[] channelArr = dns.servers[i].channels;
                                if (channelArr != null && channelArr.length != 0) {
                                    ArrayList arrayList3 = arrayList2;
                                    for (StrategyResultParser.Channel channel : channelArr) {
                                        StrategyResultParser.ChannelAttribute[] channelAttributeArr = channel.attributes;
                                        if (channelAttributeArr != null && channelAttributeArr.length != 0) {
                                            ArrayList arrayList4 = arrayList3;
                                            for (StrategyResultParser.ChannelAttribute channelAttribute : channelAttributeArr) {
                                                String str2 = channelAttribute.protocol;
                                                if ((ConnType.HTTP3.equals(str2) || ConnType.HTTP3_PLAIN.equals(str2)) && !Http3ConnectionDetector.access$400().contains(str)) {
                                                    if (arrayList4 == null) {
                                                        arrayList4 = new ArrayList();
                                                    }
                                                    if (!arrayList4.contains(str)) {
                                                        arrayList4.add(str);
                                                    }
                                                }
                                            }
                                            arrayList3 = arrayList4;
                                        }
                                    }
                                    arrayList2 = arrayList3;
                                }
                            }
                            arrayList = arrayList2;
                        }
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        return;
                    }
                    ALog.e(Http3ConnectionDetector.TAG, "[h3 detect opt] updateDnsByHosts ", null, "tmp1HostList", arrayList, "hostList", Http3ConnectionDetector.access$400());
                    ArrayList arrayList5 = new ArrayList();
                    ListIterator listIterator = arrayList.listIterator();
                    while (true) {
                        if (!listIterator.hasNext()) {
                            z = false;
                            break;
                        }
                        String str3 = (String) listIterator.next();
                        if (AwcnConfig.isHostInDetectHostWhiteList(str3)) {
                            arrayList5.add(str3);
                            listIterator.remove();
                            if (arrayList5.size() >= 2) {
                                z = true;
                                break;
                            }
                        }
                    }
                    if (!z) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= arrayList.size()) {
                                break;
                            }
                            arrayList5.add(arrayList.get(i2));
                            if (arrayList5.size() >= 2) {
                                z = true;
                                break;
                            }
                            i2++;
                        }
                    }
                    if (!z) {
                        Iterator it = Http3ConnectionDetector.access$400().iterator();
                        while (it.hasNext()) {
                            arrayList5.add((String) it.next());
                            if (arrayList5.size() >= 2) {
                                break;
                            }
                        }
                    }
                    Http3ConnectionDetector.access$400().clear();
                    Http3ConnectionDetector.access$400().addAll(arrayList5);
                    ALog.e(Http3ConnectionDetector.TAG, "[h3 detect opt] dueToH3Detect ", null, "hostList", Http3ConnectionDetector.access$400());
                    SharedPreferences.Editor edit = Http3ConnectionDetector.access$300().edit();
                    edit.putStringSet(Http3ConnectionDetector.SP_HTTP3_DETECTOR_HOSTS, Http3ConnectionDetector.access$400());
                    edit.apply();
                    Http3ConnectionDetector.startDetect(NetworkStatusHelper.getStatus());
                }
            }
        };
        networkStatusChangeListener = new NetworkStatusHelper.INetworkStatusChangeListener() { // from class: anet.channel.quic.Http3ConnectionDetector.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
            public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
                }
            }
        };
        appLifecycleListener = new AppLifecycle.AppLifecycleListener() { // from class: anet.channel.quic.Http3ConnectionDetector.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
            public void background() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("550392b5", new Object[]{this});
                }
            }

            @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
            public void forground() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f5402817", new Object[]{this});
                } else if (!Http3ConnectionDetector.access$500()) {
                } else {
                    Http3ConnectionDetector.startDetect(NetworkStatusHelper.getStatus());
                }
            }
        };
    }

    public static void registerQuicListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81fea55c", new Object[0]);
        } else if (!AwcnConfig.isXquicRemoteEnable()) {
        } else {
            try {
                SpdyAgent.registerQuicListener(new IPluginFetchCallback() { // from class: anet.channel.quic.Http3ConnectionDetector.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // org.android.spdy.IPluginFetchCallback
                    public void onFetchFinished(boolean z, Map<String, Object> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("1d759e5", new Object[]{this, new Boolean(z), map});
                            return;
                        }
                        ALog.e(Http3ConnectionDetector.TAG, "[xquic remote] onFetchFinished，isQuicReady=" + z, null, new Object[0]);
                        if (!z) {
                            return;
                        }
                        Http3ConnectionDetector.startDetect(NetworkStatusHelper.getStatus());
                        SpdyAgent.unregisterQuicListener(this);
                    }
                });
            } catch (Exception e) {
                ALog.e(TAG, "[xquic remote] registerQuicListener fail, error=" + e.toString(), null, new Object[0]);
            }
        }
    }

    public static boolean isQuicReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddbcf06", new Object[0])).booleanValue();
        }
        try {
            return SpdyAgent.isQuicReady();
        } catch (Exception e) {
            ALog.e(TAG, "[xquic remote] isQuicReady fail, error=" + e.toString(), null, new Object[0]);
            return false;
        }
    }

    private static boolean startDetectHosts(final NetworkStatusHelper.NetworkStatus networkStatus, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a73ec56", new Object[]{networkStatus, str})).booleanValue();
        }
        ThreadPoolExecutorFactory.submitDetectTask(new Runnable() { // from class: anet.channel.quic.Http3ConnectionDetector.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (Http3ConnectionDetector.access$400() == null || Http3ConnectionDetector.access$400().isEmpty()) {
                    ALog.e(Http3ConnectionDetector.TAG, "[h3 detect opt] startDetectHosts", null, "hostList is null");
                } else {
                    ArrayList arrayList = new ArrayList();
                    int size = Http3ConnectionDetector.access$400().size();
                    Iterator it = Http3ConnectionDetector.access$400().iterator();
                    while (it.hasNext()) {
                        Http3ConnectionDetector.access$600(NetworkStatusHelper.NetworkStatus.this, str, (String) it.next(), arrayList, size);
                    }
                }
            }
        });
        return true;
    }

    public static boolean startDetect(final NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f6ebcad", new Object[]{networkStatus})).booleanValue();
        }
        ALog.e(TAG, "[h3 detect opt][DetectOpt] startDetect!! ", null, new Object[0]);
        if (AwcnConfig.isXquicRemoteEnable()) {
            ALog.e(TAG, "[h3 detect opt][xquic remote] startDetect，isQuicReady=" + isQuicReady(), null, new Object[0]);
            if (!isQuicReady()) {
                ALog.e(TAG, "[h3 detect opt][xquic remote] tnet xquic not ready.", null, new Object[0]);
                return false;
            }
        }
        if (haveTnetException.get()) {
            ALog.e(TAG, "[h3 detect opt]tnet exception.", null, new Object[0]);
            return false;
        } else if (!NetworkStatusHelper.isConnected()) {
            return false;
        } else {
            if (isCertInit.compareAndSet(false, true)) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION).InitializeSecurityStuff();
                    ALog.e(TAG, "[h3 detect opt]tnet init http3.", null, "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                } catch (Throwable th) {
                    ALog.e(TAG, "[h3 detect opt]tnet init http3 error.", null, th, new Object[0]);
                    haveTnetException.set(true);
                    return false;
                }
            }
            if (detectHistoryRecord == null) {
                detectHistoryRecord = new DetectHistoryRecord(SP_HISTORY_RECORDS);
            }
            final String uniqueId = NetworkStatusHelper.getUniqueId(networkStatus);
            if ("error".equalsIgnoreCase(uniqueId)) {
                ALog.e(TAG, "[h3 detect opt]startIpv6Detect uniqueId = error", null, new Object[0]);
                return false;
            } else if (!detectHistoryRecord.isNeedDetect(uniqueId)) {
                ALog.e(TAG, "[h3 detect opt][DetectOpt] not need detect!! ", null, "uniqueId", uniqueId);
                return false;
            } else {
                ALog.e(TAG, "[h3 detect opt][DetectOpt] need detect!! ", null, "uniqueId", uniqueId);
                if (AwcnConfig.isDetectH3OptOpened()) {
                    return startDetectHosts(networkStatus, uniqueId);
                }
                ThreadPoolExecutorFactory.submitDetectTask(new Runnable() { // from class: anet.channel.quic.Http3ConnectionDetector.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (StringUtils.isEmpty(Http3ConnectionDetector.access$200())) {
                            ALog.e(Http3ConnectionDetector.TAG, "startDetect", null, "host is null");
                        } else {
                            Http3ConnectionDetector.access$600(NetworkStatusHelper.NetworkStatus.this, uniqueId, Http3ConnectionDetector.access$200(), null, -1);
                        }
                    }
                });
                return true;
            }
        }
    }

    private static void startOneDetect(final NetworkStatusHelper.NetworkStatus networkStatus, String str, final String str2, final List<DetectHistoryRecord.DetectRecord> list, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e51957", new Object[]{networkStatus, str, str2, list, new Integer(i)});
            return;
        }
        List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str2, http3Filter);
        if (connStrategyListByHost.isEmpty()) {
            ALog.e(TAG, "[h3 detect opt] startOneDetect", null, "http3 strategy is null.");
            return;
        }
        final IConnStrategy iConnStrategy = connStrategyListByHost.get(0);
        final String str3 = "Http3Detect" + seq.getAndIncrement();
        ConnInfo connInfo = new ConnInfo(k.HTTPS_PREFIX + str2, str3, makeConnStrategy(iConnStrategy));
        ALog.e(TAG, "[h3 detect opt] [DetectOpt] enable http3", str3, "uniqueId", str);
        TnetSpdySession tnetSpdySession = new TnetSpdySession(GlobalAppRuntimeInfo.getContext(), connInfo);
        tnetSpdySession.registerEventcb(257, new EventCb() { // from class: anet.channel.quic.Http3ConnectionDetector.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v1 */
            /* JADX WARN: Type inference failed for: r14v11 */
            /* JADX WARN: Type inference failed for: r14v2, types: [int, boolean] */
            @Override // anet.channel.entity.EventCb
            public void onEvent(Session session, int i2, Event event) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("786c54ab", new Object[]{this, session, new Integer(i2), event});
                    return;
                }
                ?? r14 = i2 == 1 ? 1 : 0;
                if (AwcnConfig.isXquicRemoteEnable() && !Http3ConnectionDetector.isQuicReady()) {
                    String str4 = IConnStrategy.this.getIp() + "/" + IConnStrategy.this.getPort();
                    ZstdErrorStatistic zstdErrorStatistic = new ZstdErrorStatistic(str2, str4, "http3_detect_error");
                    zstdErrorStatistic.isSuccess = r14;
                    ALog.e(Http3ConnectionDetector.TAG, "[h3 detect opt] [xquic remote] xquic not ready, http3 already detect, host=" + str2 + " ,strategy=" + str4 + " ,isSuccess=" + ((boolean) r14), str3, new Object[0]);
                    AppMonitor.getInstance().commitStat(zstdErrorStatistic);
                }
                Http3ConnectionDetector.access$502(false);
                if (GlobalAppRuntimeInfo.isAppBackground() && r14 == 0) {
                    Http3ConnectionDetector.access$502(true);
                    return;
                }
                String uniqueId = NetworkStatusHelper.getUniqueId(networkStatus);
                if (AwcnConfig.isDetectH3OptOpened()) {
                    if (r14 != 0) {
                        Http3ConnectionDetector.access$700().update(uniqueId, true);
                    } else {
                        list.add(Http3ConnectionDetector.access$700().createDetectRecord(false));
                        if (list.size() >= i) {
                            Http3ConnectionDetector.access$700().update(uniqueId, false);
                        }
                    }
                    ALog.e(Http3ConnectionDetector.TAG, "[h3 detect opt] [DetectOpt] enable http3", str3, "uniqueId", uniqueId, "enable", Boolean.valueOf((boolean) r14), "detectRecordList", list);
                } else {
                    ALog.e(Http3ConnectionDetector.TAG, "[h3 detect opt] [DetectOpt] enable http3", str3, "uniqueId", uniqueId, "enable", Boolean.valueOf((boolean) r14));
                    Http3ConnectionDetector.access$700().update(uniqueId, r14);
                }
                session.close(false, "http3Detect close");
                Http3DetectStat http3DetectStat = new Http3DetectStat(str2, IConnStrategy.this);
                int i3 = r14 == true ? 1 : 0;
                int i4 = r14 == true ? 1 : 0;
                http3DetectStat.ret = i3;
                if (r14 == 0 && event != null) {
                    http3DetectStat.code = event.errorCode;
                }
                http3DetectStat.isBg = GlobalAppRuntimeInfo.isAppBackground() ? "bg" : "fg";
                AppMonitor.getInstance().commitStat(http3DetectStat);
                SessionCenter.getInstance().get(HttpUrl.parse(Http3ConnectionDetector.MTOP_HOST), SessionType.LONG_LINK, 0L);
            }
        });
        tnetSpdySession.mSessionStat.isCommitted = true;
        tnetSpdySession.connect();
    }

    public static void registerListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[0]);
            return;
        }
        try {
            if (!isInit.compareAndSet(false, true)) {
                return;
            }
            ALog.e(TAG, "registerListener", null, "http3Enable", Boolean.valueOf(AwcnConfig.isHttp3Enable()));
            registerQuicListener();
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext());
            if (AwcnConfig.isDetectH3OptOpened()) {
                Set<String> stringSet = sharedPreferences.getStringSet(SP_HTTP3_DETECTOR_HOSTS, null);
                hostList = new CopyOnWriteArraySet<>();
                if (stringSet != null && stringSet.size() > 0) {
                    hostList.addAll(stringSet);
                }
                ALog.e(TAG, "[h3 detect opt] registerListener hostList :" + hostList.toString(), null, new Object[0]);
            } else {
                host = sharedPreferences.getString(SP_HTTP3_DETECTOR_HOST, "");
            }
            startDetect(NetworkStatusHelper.getStatus());
            NetworkStatusHelper.addStatusChangeListener(networkStatusChangeListener);
            AppLifecycle.registerLifecycleListener(appLifecycleListener);
            StrategyCenter.getInstance().registerListener(strategyListener);
        } catch (Exception e) {
            ALog.e(TAG, "[registerListener]error", null, e, new Object[0]);
        }
    }

    public static void setDetectValidTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e5b8d9", new Object[]{new Long(j)});
        } else if (j < 0) {
        } else {
            detectValidTime = j;
        }
    }

    public static boolean isHttp3Enable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa6ed0f", new Object[0])).booleanValue() : detectHttp3Status() == 1;
    }

    public static int detectHttp3Status() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3896d54", new Object[0])).intValue();
        }
        DetectHistoryRecord detectHistoryRecord2 = detectHistoryRecord;
        if (detectHistoryRecord2 == null) {
            return -1;
        }
        return detectHistoryRecord2.detectStatus(NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus()));
    }

    public static void updateHttp3Status(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da0df7b9", new Object[]{new Boolean(z)});
            return;
        }
        DetectHistoryRecord detectHistoryRecord2 = detectHistoryRecord;
        if (detectHistoryRecord2 == null) {
            return;
        }
        detectHistoryRecord2.update(NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus()), z);
    }

    private static IConnStrategy makeConnStrategy(final IConnStrategy iConnStrategy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IConnStrategy) ipChange.ipc$dispatch("d3e1ecc8", new Object[]{iConnStrategy}) : new IConnStrategy() { // from class: anet.channel.quic.Http3ConnectionDetector.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.strategy.IConnStrategy
            public Map<String, Object> getCommonInfo() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("6eaa1deb", new Object[]{this});
                }
                return null;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public List<ProxyStrategy> getProxyStrategies() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (List) ipChange2.ipc$dispatch("69e2ba17", new Object[]{this});
                }
                return null;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public boolean isSupportMultiPath() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("43485f44", new Object[]{this})).booleanValue();
                }
                return false;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public String getIp() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("d02517fc", new Object[]{this}) : IConnStrategy.this.getIp();
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getIpType() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("d9c8f8f1", new Object[]{this})).intValue() : IConnStrategy.this.getIpType();
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getIpSource() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("e15dde12", new Object[]{this})).intValue() : IConnStrategy.this.getIpSource();
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getPort() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("a73231f1", new Object[]{this})).intValue() : IConnStrategy.this.getPort();
            }

            @Override // anet.channel.strategy.IConnStrategy
            public ConnProtocol getProtocol() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (ConnProtocol) ipChange2.ipc$dispatch("f3fe3d0f", new Object[]{this}) : ConnProtocol.valueOf(ConnType.HTTP3_1RTT, null, null);
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getConnectionTimeout() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("3af0dde7", new Object[]{this})).intValue() : IConnStrategy.this.getConnectionTimeout();
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getReadTimeout() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("4db89faf", new Object[]{this})).intValue() : IConnStrategy.this.getReadTimeout();
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getRetryTimes() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("58b4bfee", new Object[]{this})).intValue() : IConnStrategy.this.getRetryTimes();
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getHeartbeat() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("5d15d3c0", new Object[]{this})).intValue() : IConnStrategy.this.getHeartbeat();
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getStatus() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("fcf6c362", new Object[]{this})).intValue() : IConnStrategy.this.getStatus();
            }

            @Override // anet.channel.strategy.IConnStrategy
            public String getUnit() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("9e7fcd3f", new Object[]{this}) : IConnStrategy.this.getUnit();
            }

            @Override // anet.channel.strategy.IConnStrategy
            public String getAccessPoint() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("7a134b63", new Object[]{this}) : IConnStrategy.this.getAccessPoint();
            }
        };
    }
}
