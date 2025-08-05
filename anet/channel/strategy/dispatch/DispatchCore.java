package anet.channel.strategy.dispatch;

import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.flow.FlowStat;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.statist.AmdcStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.utils.AmdcThreadPoolExecutor;
import anet.channel.strategy.utils.Utils;
import anet.channel.util.ALog;
import anet.channel.util.Inet64Util;
import com.alipay.android.phone.mobilecommon.verifyidentity.BuildConfig;
import com.alipay.mobile.common.transport.utils.SwitchMonitorLogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class DispatchCore {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHECK_SIGN_FAIL = "-1003";
    public static final String EMPTY_SIGN_ERROR = "-1001";
    public static final int MAX_RETRY_TIMES = 3;
    public static final int NEW_MAX_RETRY_TIMES = 4;
    public static final int NO_RETRY = 2;
    public static final String READ_ANSWER_ERROR = "-1002";
    public static final String REQUEST_EXCEPTION = "-1000";
    public static final String RESOLVE_ANSWER_FAIL = "-1004";
    public static final int RETRY_NORMAL = 1;
    public static final int SUCCESS = 0;
    public static final String TAG = "awcn.DispatchCore";
    public static List<FirstAmdcTask> firstAmdcTaskList;
    public static HostnameVerifier hostnameVerifier;
    public static AtomicBoolean isFirstAmdcRequest;
    public static Random random;
    public static AtomicInteger seq;

    public static /* synthetic */ void access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            clearFirstAmdcTaskList();
        }
    }

    public static /* synthetic */ void access$100(FirstAmdcTask firstAmdcTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c614fc", new Object[]{firstAmdcTask});
        } else {
            addFirstAmdcTaskList(firstAmdcTask);
        }
    }

    public static /* synthetic */ boolean access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("26a27dfd", new Object[0])).booleanValue() : isExistAmdcTaskReturn();
    }

    static {
        kge.a(928097169);
        seq = new AtomicInteger(0);
        hostnameVerifier = new HostnameVerifier() { // from class: anet.channel.strategy.dispatch.DispatchCore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // javax.net.ssl.HostnameVerifier
            public boolean verify(String str, SSLSession sSLSession) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("563b2905", new Object[]{this, str, sSLSession})).booleanValue() : HttpsURLConnection.getDefaultHostnameVerifier().verify(DispatchConstants.getAmdcServerDomain(), sSLSession);
            }
        };
        random = new Random();
        isFirstAmdcRequest = new AtomicBoolean(false);
        firstAmdcTaskList = null;
    }

    public static void sendRequest(Map map, AmdcStatistic amdcStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("126a9179", new Object[]{map, amdcStatistic});
        } else if (map == null || amdcStatistic == null) {
        } else {
            boolean isVpnIpSwitchOpened = AwcnConfig.isVpnIpSwitchOpened();
            boolean isAmdcRetryStrategySwitchOpened = AwcnConfig.isAmdcRetryStrategySwitchOpened();
            String[] strArr = null;
            if (Inet64Util.isIPv6OnlyNetwork()) {
                strArr = DispatchConstants.getAmdcServerFixIpv6();
            }
            String[] strArr2 = strArr;
            boolean isVpnOptOpened = AwcnConfig.isVpnOptOpened();
            String str = TAG;
            if (isVpnOptOpened && NetworkStatusHelper.isVpn() && (isFirstAmdcRequest.compareAndSet(false, true) || amdcStatistic.isVpnProxy)) {
                ALog.e(str, "[ap]  isFirstAmdcRequest true", amdcStatistic.seqNo, "isVpnOptOpened", Boolean.valueOf(AwcnConfig.isVpnOptOpened()), "isVpnProxy", Boolean.valueOf(amdcStatistic.isVpnProxy), "isVpnIpSwitchOpened", Boolean.valueOf(isVpnIpSwitchOpened), "isAmdcRetryStrategySwitch", Boolean.valueOf(isAmdcRetryStrategySwitchOpened));
                HashMap hashMap = new HashMap(map);
                FirstAmdcTask firstAmdcTask = new FirstAmdcTask(amdcStatistic, hashMap, 0, strArr2, false, isVpnIpSwitchOpened, isAmdcRetryStrategySwitchOpened);
                FirstAmdcTask firstAmdcTask2 = new FirstAmdcTask(amdcStatistic, hashMap, 1, strArr2, false, isVpnIpSwitchOpened, isAmdcRetryStrategySwitchOpened);
                FirstAmdcTask firstAmdcTask3 = new FirstAmdcTask(amdcStatistic, hashMap, 2, strArr2, false, isVpnIpSwitchOpened, isAmdcRetryStrategySwitchOpened);
                AmdcThreadPoolExecutor.submitTask(firstAmdcTask);
                AmdcThreadPoolExecutor.scheduleTask(firstAmdcTask2, 250L);
                AmdcThreadPoolExecutor.scheduleTask(firstAmdcTask3, 500L);
                if (!isVpnIpSwitchOpened) {
                    return;
                }
                AmdcThreadPoolExecutor.scheduleTask(new FirstAmdcTask(amdcStatistic, hashMap, 3, strArr2, false, true, isAmdcRetryStrategySwitchOpened), 750L);
                return;
            }
            int i = isVpnIpSwitchOpened ? 4 : 3;
            int i2 = 0;
            while (i2 < i) {
                HashMap hashMap2 = new HashMap(map);
                long currentTimeMillis = System.currentTimeMillis();
                int i3 = i2;
                String str2 = str;
                int i4 = i;
                String tryStrategyBuildUrl = tryStrategyBuildUrl(hashMap2, null, i2, strArr2, false, isVpnIpSwitchOpened, isAmdcRetryStrategySwitchOpened, amdcStatistic);
                amdcStatistic.tryStrategyBuildUrlTime = System.currentTimeMillis() - currentTimeMillis;
                amdcStatistic.strategyTime = System.currentTimeMillis() - amdcStatistic.buildParamEndTime;
                int sendOneNetworkRequest = sendOneNetworkRequest(amdcStatistic, tryStrategyBuildUrl, hashMap2, i3);
                if (sendOneNetworkRequest == 0 || sendOneNetworkRequest == 2) {
                    ALog.e(str2, "ret status=" + sendOneNetworkRequest + " ,urlString=" + tryStrategyBuildUrl, amdcStatistic.seqNo, "retry", Integer.valueOf(i3), "isAmdcRetryStrategySwitch", Boolean.valueOf(isAmdcRetryStrategySwitchOpened), "isVpnIpSwitchOpened", Boolean.valueOf(isVpnIpSwitchOpened));
                    return;
                }
                i2 = i3 + 1;
                i = i4;
                str = str2;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class FirstAmdcTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public AmdcStatistic amdcStatistic;
        public IConnStrategy connStrategy = null;
        public String[] ipv6s;
        public boolean isAmdcRetryStrategySwitch;
        public boolean isIpv6Fail;
        public boolean isVpnIpSwitchOpened;
        public Map map;
        public int retry;
        public int status;

        static {
            kge.a(581647533);
            kge.a(-1390502639);
        }

        public FirstAmdcTask(AmdcStatistic amdcStatistic, Map map, int i, String[] strArr, boolean z, boolean z2, boolean z3) {
            this.retry = -1;
            this.map = null;
            this.amdcStatistic = null;
            this.isVpnIpSwitchOpened = false;
            this.ipv6s = null;
            this.isIpv6Fail = false;
            this.isAmdcRetryStrategySwitch = false;
            this.map = map;
            this.retry = i;
            this.amdcStatistic = amdcStatistic;
            this.isVpnIpSwitchOpened = z2;
            this.ipv6s = strArr;
            this.isIpv6Fail = z;
            this.isAmdcRetryStrategySwitch = z3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String str = this.amdcStatistic.seqNo + "_[" + this.retry + riy.ARRAY_END_STR;
            ALog.e(DispatchCore.TAG, "[ap] FirstAmdcTask run. ", str, new Object[0]);
            if (this.retry == 0) {
                DispatchCore.access$000();
            }
            DispatchCore.access$100(this);
            if (this.retry != 0 && DispatchCore.access$200()) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String tryStrategyBuildUrl = DispatchCore.tryStrategyBuildUrl(this.map, this.connStrategy, this.retry, this.ipv6s, this.isIpv6Fail, this.isVpnIpSwitchOpened, this.isAmdcRetryStrategySwitch, this.amdcStatistic);
            if (tryStrategyBuildUrl == null || tryStrategyBuildUrl.isEmpty()) {
                ALog.e(DispatchCore.TAG, "[ap] start fail, get urlString null!", str, new Object[0]);
                return;
            }
            this.amdcStatistic.tryStrategyBuildUrlTime = System.currentTimeMillis() - currentTimeMillis;
            this.amdcStatistic.strategyTime = System.currentTimeMillis() - this.amdcStatistic.buildParamEndTime;
            ALog.e(DispatchCore.TAG, "[ap] start send, urlString=" + tryStrategyBuildUrl, str, new Object[0]);
            this.status = DispatchCore.sendOneNetworkRequest(this.amdcStatistic, tryStrategyBuildUrl, this.map, this.retry);
            ALog.e(DispatchCore.TAG, "[ap] end, ret status=" + this.status + " ,urlString=" + tryStrategyBuildUrl, str, "isVpnIpSwitchOpened", Boolean.valueOf(this.isVpnIpSwitchOpened));
        }
    }

    private static synchronized void clearFirstAmdcTaskList() {
        synchronized (DispatchCore.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca411698", new Object[0]);
                return;
            }
            if (firstAmdcTaskList != null && !firstAmdcTaskList.isEmpty()) {
                firstAmdcTaskList.clear();
            }
        }
    }

    private static synchronized void addFirstAmdcTaskList(FirstAmdcTask firstAmdcTask) {
        synchronized (DispatchCore.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("940b4f70", new Object[]{firstAmdcTask});
                return;
            }
            if (firstAmdcTaskList == null) {
                firstAmdcTaskList = new ArrayList();
            }
            firstAmdcTaskList.add(firstAmdcTask);
        }
    }

    private static synchronized boolean isExistAmdcTaskReturn() {
        synchronized (DispatchCore.class) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f5aaae78", new Object[0])).booleanValue();
            }
            for (FirstAmdcTask firstAmdcTask : firstAmdcTaskList) {
                if (firstAmdcTask.status != 0 && firstAmdcTask.status != 2) {
                    firstAmdcTask.connStrategy = null;
                }
                ALog.e(TAG, "[ap] isExistAmdcTaskReturn=true, this task status=" + firstAmdcTask.status + " , end task.", "task[" + firstAmdcTask.retry + riy.ARRAY_END_STR, new Object[0]);
                if (firstAmdcTask.connStrategy != null) {
                    ConnEvent connEvent = new ConnEvent();
                    if (firstAmdcTask.status == 0) {
                        z = true;
                    }
                    connEvent.isSuccess = z;
                    StrategyCenter.getInstance().notifyConnEvent(DispatchConstants.getAmdcServerDomain(), firstAmdcTask.connStrategy, connEvent);
                }
                return true;
            }
            return false;
        }
    }

    public static String tryStrategyBuildUrl(Map map, IConnStrategy iConnStrategy, int i, String[] strArr, boolean z, boolean z2, boolean z3, AmdcStatistic amdcStatistic) {
        IConnStrategy iConnStrategy2;
        String[] amdcServerOverSeaIp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d995dcd", new Object[]{map, iConnStrategy, new Integer(i), strArr, new Boolean(z), new Boolean(z2), new Boolean(z3), amdcStatistic});
        }
        String schemeByHost = StrategyCenter.getInstance().getSchemeByHost(DispatchConstants.getAmdcServerDomain(), "http");
        if (i == 0) {
            List<IConnStrategy> prepareConnStrategy = DispatchHelper.prepareConnStrategy(schemeByHost, DispatchConstants.getAmdcServerDomain());
            iConnStrategy2 = (prepareConnStrategy == null || prepareConnStrategy.isEmpty()) ? iConnStrategy : prepareConnStrategy.remove(0);
            if (iConnStrategy2 != null) {
                amdcStatistic.isNotConnStrategy = false;
                amdcStatistic.strategyType = 0;
                String buildRequestUrl = buildRequestUrl(schemeByHost, iConnStrategy2.getIp(), iConnStrategy2.getPort(), map, i);
                ALog.e(TAG, "[amdc] buildRequestUrl use connStrategy!, urlString=" + buildRequestUrl, amdcStatistic.seqNo, "retry", Integer.valueOf(i), "isVpnIpSwitchOpened", Boolean.valueOf(z2), "isAmdcRetryStrategySwitch", Boolean.valueOf(z3));
                return buildRequestUrl;
            }
            amdcStatistic.isNotConnStrategy = true;
            if (!z3) {
                amdcStatistic.strategyType = 5;
                String buildRequestUrl2 = buildRequestUrl(schemeByHost, null, 0, map, i);
                ALog.e(TAG, "[amdc] buildRequestUrl, amdc null, use host!, urlString=" + buildRequestUrl2, amdcStatistic.seqNo, "retry", Integer.valueOf(i), "isIpv6Fail", Boolean.valueOf(z), "isAmdcRetryStrategySwitch", Boolean.valueOf(z3));
                return buildRequestUrl2;
            }
        } else {
            iConnStrategy2 = iConnStrategy;
        }
        if ((z3 && (i == 0 || !amdcStatistic.isUseLocalStrategy)) || (!z3 && i == 1)) {
            List<IConnStrategy> localDnsConnStrategyListByHost = StrategyCenter.getInstance().getLocalDnsConnStrategyListByHost(DispatchConstants.getAmdcServerDomain());
            if (localDnsConnStrategyListByHost != null && !localDnsConnStrategyListByHost.isEmpty()) {
                iConnStrategy2 = localDnsConnStrategyListByHost.remove(0);
            }
            amdcStatistic.isUseLocalStrategy = true;
            if (iConnStrategy2 == null) {
                amdcStatistic.strategyType = 5;
                String buildRequestUrl3 = buildRequestUrl(schemeByHost, null, 0, map, i);
                ALog.e(TAG, "[amdc] buildRequestUrl, local null, use host!, urlString=" + buildRequestUrl3, amdcStatistic.seqNo, "retry", Integer.valueOf(i), Boolean.valueOf(z2), "isAmdcRetryStrategySwitch", "isIpv6Fail", Boolean.valueOf(z), "isAmdcRetryStrategySwitch", Boolean.valueOf(z3));
                return buildRequestUrl3;
            }
            amdcStatistic.strategyType = 1;
            String buildRequestUrl4 = buildRequestUrl(schemeByHost, iConnStrategy2.getIp(), iConnStrategy2.getPort(), map, i);
            ALog.e(TAG, "[amdc] buildRequestUrl use localDnsStrategy!, urlString=" + buildRequestUrl4, amdcStatistic.seqNo, "retry", Integer.valueOf(i), "isVpnIpSwitchOpened", Boolean.valueOf(z2), "isAmdcRetryStrategySwitch", Boolean.valueOf(z3));
            return buildRequestUrl4;
        } else if ((z3 && !amdcStatistic.isUsePreSetVip) || (!z3 && i == 2)) {
            amdcStatistic.isUsePreSetVip = true;
            if (strArr != null && strArr.length > 0 && !z) {
                amdcStatistic.strategyType = 2;
                String buildRequestUrl5 = buildRequestUrl(schemeByHost, strArr[random.nextInt(strArr.length)], 0, map, i);
                ALog.e(TAG, "[amdc] buildRequestUrl use preset v6 ip!, urlString=" + buildRequestUrl5, amdcStatistic.seqNo, "retry", Integer.valueOf(i), "isVpnIpSwitchOpened", Boolean.valueOf(z2), "isAmdcRetryStrategySwitch", Boolean.valueOf(z3));
                return buildRequestUrl5;
            }
            String[] amdcServerFixIp = DispatchConstants.getAmdcServerFixIp();
            if (amdcServerFixIp != null && amdcServerFixIp.length > 0) {
                amdcStatistic.strategyType = 3;
                String buildRequestUrl6 = buildRequestUrl(schemeByHost, amdcServerFixIp[random.nextInt(amdcServerFixIp.length)], 0, map, i);
                ALog.e(TAG, "[amdc] buildRequestUrl use preset v4 ip!, urlString=" + buildRequestUrl6, amdcStatistic.seqNo, "retry", Integer.valueOf(i), "isIpv6Fail", Boolean.valueOf(z), "isVpnIpSwitchOpened", Boolean.valueOf(z2), "isAmdcRetryStrategySwitch", Boolean.valueOf(z3));
                return buildRequestUrl6;
            }
            amdcStatistic.strategyType = 5;
            String buildRequestUrl7 = buildRequestUrl(schemeByHost, null, 0, map, i);
            ALog.e(TAG, "[amdc] buildRequestUrl use host!, urlString=" + buildRequestUrl7, amdcStatistic.seqNo, "retry", Integer.valueOf(i), "isIpv6Fail", Boolean.valueOf(z), "isVpnIpSwitchOpened", Boolean.valueOf(z2), "isAmdcRetryStrategySwitch", Boolean.valueOf(z3));
            return buildRequestUrl7;
        } else if (i == 3 && (amdcServerOverSeaIp = DispatchConstants.getAmdcServerOverSeaIp()) != null && amdcServerOverSeaIp.length > 0) {
            amdcStatistic.strategyType = 4;
            String buildRequestUrl8 = buildRequestUrl(schemeByHost, amdcServerOverSeaIp[random.nextInt(amdcServerOverSeaIp.length)], 0, map, i);
            ALog.e(TAG, "[amdc] buildRequestUrl use preset v4 overSea ip!, urlString=" + buildRequestUrl8, amdcStatistic.seqNo, "retry", Integer.valueOf(i), "isVpnIpSwitchOpened", Boolean.valueOf(z2), "isAmdcRetryStrategySwitch", Boolean.valueOf(z3));
            return buildRequestUrl8;
        } else {
            amdcStatistic.strategyType = 5;
            String buildRequestUrl9 = buildRequestUrl(schemeByHost, null, 0, map, i);
            ALog.e(TAG, "[amdc] buildRequestUrl final use host!, urlString=" + buildRequestUrl9, amdcStatistic.seqNo, "retry", Integer.valueOf(i), "isIpv6Fail", Boolean.valueOf(z), "isVpnIpSwitchOpened", Boolean.valueOf(z2), "isAmdcRetryStrategySwitch", Boolean.valueOf(z3));
            return buildRequestUrl9;
        }
    }

    private static String buildRequestUrl(String str, String str2, int i, Map<String, String> map, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f170cce8", new Object[]{str, str2, new Integer(i), map, new Integer(i2)});
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append(DispatchHelper.buildRequestUrl(str, str2, i, DispatchConstants.getAmdcServerDomain(), DispatchConstants.serverPath, i2 == 2));
        TreeMap treeMap = new TreeMap();
        treeMap.put("appkey", map.remove("appkey"));
        treeMap.put("v", map.remove("v"));
        treeMap.put("appVersion", map.remove("appVersion"));
        treeMap.put(DispatchConstants.CONFIG_VERSION, map.remove(DispatchConstants.CONFIG_VERSION));
        sb.append(riy.CONDITION_IF);
        sb.append(Utils.encodeQueryParams(treeMap, "utf-8"));
        return sb.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static int sendOneNetworkRequest(anet.channel.statist.AmdcStatistic r34, java.lang.String r35, java.util.Map r36, int r37) {
        /*
            Method dump skipped, instructions count: 1961
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.dispatch.DispatchCore.sendOneNetworkRequest(anet.channel.statist.AmdcStatistic, java.lang.String, java.util.Map, int):int");
    }

    public static String parseObjectString(Map map, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5fa6797b", new Object[]{map, str}) : (map == null || map.isEmpty() || str == null || str.isEmpty() || (obj = map.get(str)) == null || !(obj instanceof String)) ? "" : (String) obj;
    }

    private static String getAccessPoint(DispatchEvent dispatchEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1830887c", new Object[]{dispatchEvent}) : dispatchEvent != null ? dispatchEvent.accessPoint : BuildConfig.RPC_TYPE_DEF;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x02c6 A[Catch: Throwable -> 0x02c2, TryCatch #17 {Throwable -> 0x02c2, blocks: (B:139:0x02bc, B:143:0x02c6, B:145:0x02d1, B:148:0x02e4, B:149:0x02ed, B:146:0x02dc), top: B:179:0x02bc }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d1 A[Catch: Throwable -> 0x02c2, TryCatch #17 {Throwable -> 0x02c2, blocks: (B:139:0x02bc, B:143:0x02c6, B:145:0x02d1, B:148:0x02e4, B:149:0x02ed, B:146:0x02dc), top: B:179:0x02bc }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02dc A[Catch: Throwable -> 0x02c2, TryCatch #17 {Throwable -> 0x02c2, blocks: (B:139:0x02bc, B:143:0x02c6, B:145:0x02d1, B:148:0x02e4, B:149:0x02ed, B:146:0x02dc), top: B:179:0x02bc }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e4 A[Catch: Throwable -> 0x02c2, TryCatch #17 {Throwable -> 0x02c2, blocks: (B:139:0x02bc, B:143:0x02c6, B:145:0x02d1, B:148:0x02e4, B:149:0x02ed, B:146:0x02dc), top: B:179:0x02bc }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ed A[Catch: Throwable -> 0x02c2, TRY_LEAVE, TryCatch #17 {Throwable -> 0x02c2, blocks: (B:139:0x02bc, B:143:0x02c6, B:145:0x02d1, B:148:0x02e4, B:149:0x02ed, B:146:0x02dc), top: B:179:0x02bc }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0320 A[Catch: Throwable -> 0x031c, TryCatch #1 {Throwable -> 0x031c, blocks: (B:159:0x0316, B:163:0x0320, B:165:0x032b, B:168:0x033e, B:169:0x0347, B:166:0x0336), top: B:173:0x0316 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x032b A[Catch: Throwable -> 0x031c, TryCatch #1 {Throwable -> 0x031c, blocks: (B:159:0x0316, B:163:0x0320, B:165:0x032b, B:168:0x033e, B:169:0x0347, B:166:0x0336), top: B:173:0x0316 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0336 A[Catch: Throwable -> 0x031c, TryCatch #1 {Throwable -> 0x031c, blocks: (B:159:0x0316, B:163:0x0320, B:165:0x032b, B:168:0x033e, B:169:0x0347, B:166:0x0336), top: B:173:0x0316 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033e A[Catch: Throwable -> 0x031c, TryCatch #1 {Throwable -> 0x031c, blocks: (B:159:0x0316, B:163:0x0320, B:165:0x032b, B:168:0x033e, B:169:0x0347, B:166:0x0336), top: B:173:0x0316 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0347 A[Catch: Throwable -> 0x031c, TRY_LEAVE, TryCatch #1 {Throwable -> 0x031c, blocks: (B:159:0x0316, B:163:0x0320, B:165:0x032b, B:168:0x033e, B:169:0x0347, B:166:0x0336), top: B:173:0x0316 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String readAnswer(java.io.InputStream r22, boolean r23, anet.channel.strategy.dispatch.DispatchZstdDictEvent r24, int r25, anet.channel.statist.PublicNetworkErrorStatistic r26, java.lang.String r27, anet.channel.statist.AmdcStatistic r28) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.dispatch.DispatchCore.readAnswer(java.io.InputStream, boolean, anet.channel.strategy.dispatch.DispatchZstdDictEvent, int, anet.channel.statist.PublicNetworkErrorStatistic, java.lang.String, anet.channel.statist.AmdcStatistic):java.lang.String");
    }

    public static void commitStatistic(AmdcStatistic amdcStatistic, String str, String str2, int i, int i2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd217f40", new Object[]{amdcStatistic, str, str2, new Integer(i), new Integer(i2), str3});
        } else if ((i2 == 1 && i != 2) || !GlobalAppRuntimeInfo.isTargetProcess() || amdcStatistic == null) {
        } else {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                amdcStatistic.totalTime = currentTimeMillis - amdcStatistic.startTime;
                amdcStatistic.requestTime = currentTimeMillis - amdcStatistic.oneStartTime;
                amdcStatistic.errorCode = str;
                amdcStatistic.errorMsg = str2;
                amdcStatistic.retryTimes = i;
                amdcStatistic.accessPoint = str3;
                amdcStatistic.ret = i2;
                AppMonitor.getInstance().commitStat(amdcStatistic);
            } catch (Exception unused) {
            }
        }
    }

    public static void commitFlow(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea915ed6", new Object[]{str, new Long(j), new Long(j2)});
            return;
        }
        try {
            FlowStat flowStat = new FlowStat();
            flowStat.refer = SwitchMonitorLogUtil.SRC_AMDC;
            flowStat.protocoltype = "http";
            flowStat.req_identifier = str;
            flowStat.upstream = j;
            flowStat.downstream = j2;
            NetworkAnalysis.getInstance().commitFlow(flowStat);
        } catch (Exception e) {
            ALog.e(TAG, "commit flow info failed!", null, e, new Object[0]);
        }
    }
}
