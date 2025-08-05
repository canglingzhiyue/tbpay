package anet.channel.detect;

import android.os.Build;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.Session;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.Event;
import anet.channel.entity.EventCb;
import anet.channel.session.HttpSession;
import anet.channel.statist.Ipv6DetectStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyFilter;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.strategy.utils.Utils;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.Inet64Util;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import com.uc.crashsdk.export.LogType;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class Ipv6Detector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String AMDC_HOST = "amdc.m.taobao.com";
    private static final int FAILED = 0;
    private static final String IPV6_DETECTOR_NAME = "networksdk_ipv6_history_records";
    private static final int SUCCESS = 1;
    private static final String TAG = "awcn.Ipv6Detector";
    private static final int UNKNOWN = -1;
    private static DetectHistoryRecord detectHistoryRecord;
    private static ConcurrentHashMap<String, Integer> ipStackNetworkMap;
    private static IStrategyFilter ipv6Filter;
    private static AtomicBoolean isInit;
    private static NetworkStatusHelper.INetworkStatusChangeListener networkStatusChangeListener;
    public static Random random;
    private static AtomicInteger seq;

    public static /* synthetic */ IStrategyFilter access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IStrategyFilter) ipChange.ipc$dispatch("63fd8c51", new Object[0]) : ipv6Filter;
    }

    public static /* synthetic */ void access$100(boolean z, Ipv6DetectStat ipv6DetectStat, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a34f7cb", new Object[]{new Boolean(z), ipv6DetectStat, str, new Long(j)});
        } else {
            finish(z, ipv6DetectStat, str, j);
        }
    }

    public static /* synthetic */ AtomicInteger access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("647af9a3", new Object[0]) : seq;
    }

    static {
        kge.a(-1471371814);
        ipStackNetworkMap = new ConcurrentHashMap<>();
        seq = new AtomicInteger(1);
        isInit = new AtomicBoolean(false);
        random = new Random();
        ipv6Filter = new IStrategyFilter() { // from class: anet.channel.detect.Ipv6Detector.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.strategy.IStrategyFilter
            public boolean accept(IConnStrategy iConnStrategy) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5d8721cb", new Object[]{this, iConnStrategy})).booleanValue() : Utils.isIPV6Address(iConnStrategy.getIp());
            }
        };
        networkStatusChangeListener = new NetworkStatusHelper.INetworkStatusChangeListener() { // from class: anet.channel.detect.Ipv6Detector.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
            public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
                } else {
                    Ipv6Detector.startIpv6Detect();
                }
            }
        };
    }

    public static void registerListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[0]);
        } else if (!isInit.compareAndSet(false, true)) {
        } else {
            detectHistoryRecord = new DetectHistoryRecord(IPV6_DETECTOR_NAME);
            startIpv6Detect();
            NetworkStatusHelper.addStatusChangeListener(networkStatusChangeListener);
        }
    }

    public static void startIpv6Detect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8db33f3", new Object[0]);
        } else if (!AwcnConfig.isIpv6DetectEnable()) {
            ALog.e(TAG, "ipv6 detect is disable.", null, new Object[0]);
        } else if (!NetworkStatusHelper.isConnected()) {
            ALog.e(TAG, "network is not connected.", null, new Object[0]);
        } else if (!AwcnConfig.isIpv6CellDetectEnable() && NetworkStatusHelper.getStatus() != NetworkStatusHelper.NetworkStatus.WIFI) {
            ALog.e(TAG, "current network is not wifi.", null, "isIpv6CellDetectEnable", Boolean.valueOf(AwcnConfig.isIpv6CellDetectEnable()));
        } else {
            ALog.e(TAG, "allow current network ipv6 detect.", null, new Object[0]);
            if (!AwcnConfig.isUpdateIpStackEnable() && Inet64Util.getStackType() != 3) {
                ALog.e(TAG, "ip stack is not dual-stack.", null, new Object[0]);
                return;
            }
            final String uniqueId = NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus());
            if ("error".equalsIgnoreCase(uniqueId)) {
                ALog.e(TAG, "startIpv6Detect uniqueId = error", null, new Object[0]);
                return;
            }
            if (detectHistoryRecord == null) {
                detectHistoryRecord = new DetectHistoryRecord(IPV6_DETECTOR_NAME);
            }
            if (!detectHistoryRecord.isNeedDetect(uniqueId)) {
                ALog.e(TAG, "detectHistoryRecord has ipv6-detect-record.", null, "uniqueId", uniqueId, "status", Integer.valueOf(detectIpv6Status()));
            } else {
                ThreadPoolExecutorFactory.submitDetectTask(new Runnable() { // from class: anet.channel.detect.Ipv6Detector.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        String str;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(Ipv6Detector.AMDC_HOST, Ipv6Detector.access$000());
                        StringBuilder sb = new StringBuilder(k.HTTP_PREFIX);
                        int i = 443;
                        if (connStrategyListByHost == null || connStrategyListByHost.size() <= 0) {
                            String[] amdcServerFixIpv6 = DispatchConstants.getAmdcServerFixIpv6();
                            str = amdcServerFixIpv6.length > 0 ? amdcServerFixIpv6[Ipv6Detector.random.nextInt(amdcServerFixIpv6.length)] : null;
                        } else {
                            String ip = connStrategyListByHost.get(0).getIp();
                            i = connStrategyListByHost.get(0).getPort();
                            str = ip;
                        }
                        if (TextUtils.isEmpty(str)) {
                            return;
                        }
                        sb.append(riy.ARRAY_START_STR);
                        sb.append(str);
                        sb.append(riy.ARRAY_END_STR);
                        final Ipv6DetectStat ipv6DetectStat = new Ipv6DetectStat(Ipv6Detector.AMDC_HOST);
                        ipv6DetectStat.ip = str;
                        ipv6DetectStat.detectUrl = sb.toString();
                        final long currentTimeMillis = System.currentTimeMillis();
                        ALog.e(Ipv6Detector.TAG, "start ipv6 detect.", null, "url", sb);
                        if (!AwcnConfig.isIpv6DetectOptEnable()) {
                            String sb2 = sb.toString();
                            HttpSession httpSession = new HttpSession(GlobalAppRuntimeInfo.getContext(), new ConnInfo(sb2, "Ipv6Detector-" + Ipv6Detector.access$200().getAndIncrement(), null));
                            httpSession.registerEventcb(LogType.UNEXP_OTHER, new EventCb() { // from class: anet.channel.detect.Ipv6Detector.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // anet.channel.entity.EventCb
                                public void onEvent(Session session, int i2, Event event) {
                                    IpChange ipChange3 = $ipChange;
                                    boolean z = true;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("786c54ab", new Object[]{this, session, new Integer(i2), event});
                                        return;
                                    }
                                    if (i2 != 512) {
                                        z = false;
                                    }
                                    Ipv6Detector.access$100(z, ipv6DetectStat, uniqueId, currentTimeMillis);
                                }
                            });
                            httpSession.connect();
                            return;
                        }
                        try {
                            if (Build.VERSION.SDK_INT >= 19) {
                                new Socket().connect(new InetSocketAddress(str, i), 2000);
                                Ipv6Detector.access$100(true, ipv6DetectStat, uniqueId, currentTimeMillis);
                                return;
                            }
                        } catch (Throwable th) {
                            ALog.e(Ipv6Detector.TAG, "start ipv6 detect isConnectionAvailable error=" + th.toString(), null, "uniqueId", uniqueId);
                        }
                        Ipv6Detector.access$100(false, ipv6DetectStat, uniqueId, currentTimeMillis);
                    }
                });
            }
        }
    }

    private static void finish(boolean z, Ipv6DetectStat ipv6DetectStat, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0c9529", new Object[]{new Boolean(z), ipv6DetectStat, str, new Long(j)});
            return;
        }
        if (AwcnConfig.isUpdateIpStackEnable() && z && Inet64Util.isIPv4OnlyNetwork()) {
            Inet64Util.updateIpStackNetwork(3);
            ALog.e(TAG, "[IpStackOpt] ipv4->6：ipv6 detect is success=" + z, null, "uniqueId", str);
        }
        ipv6DetectStat.cip = StrategyCenter.getInstance().getClientIp();
        ipv6DetectStat.ret = z ? 1 : 0;
        ipv6DetectStat.detectTime = System.currentTimeMillis() - j;
        ALog.e(TAG, "start ipv6 detect finish.", null, "uniqueId", str, "isSucc", Boolean.valueOf(z));
        detectHistoryRecord.update(str, z);
        AppMonitor.getInstance().commitStat(ipv6DetectStat);
    }

    public static int detectIpv6Status() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b29d7a36", new Object[0])).intValue();
        }
        if (!AwcnConfig.isIpv6DetectEnable()) {
            return 1;
        }
        String uniqueId = NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus());
        DetectHistoryRecord detectHistoryRecord2 = detectHistoryRecord;
        if (detectHistoryRecord2 == null) {
            return -1;
        }
        return detectHistoryRecord2.detectStatus(uniqueId);
    }
}
