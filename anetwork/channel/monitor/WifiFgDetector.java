package anetwork.channel.monitor;

import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.detect.DetectHistoryRecord;
import anet.channel.detect.WifiDetector;
import anet.channel.statist.WifiFgDetectStatic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.util.RequestConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes.dex */
public class WifiFgDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CDN_URL = "https://gw.alicdn.com/status.taobao";
    private static final String IDC_URL = "https://guide-acs.m.taobao.com/gw/mtop.common.gettimestamp/1.0";
    private static final int REQUEST_COUNT = 2;
    private static final String SP_HISTORY_RECORDS = "networksdk_wifi_fg_history_records";
    private static final String TAG = "awcn.WifiFgDetector";
    private static AppLifecycle.AppLifecycleListener appLifecycleListener;
    private static int continueTimeoutCount;
    private static long endTime;
    private static AtomicBoolean isInit;
    private static NetworkStatusHelper.INetworkStatusChangeListener networkStatusChangeListener;
    private static int periodTimeoutCount;
    private static CopyOnWriteArraySet<String> requestList;
    private static AtomicInteger seq;
    private static long startTime;

    /* loaded from: classes.dex */
    public interface IOneDetectFinishCb {
        void onRequestFinish(boolean z);
    }

    public static /* synthetic */ void access$000(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddeb9a3d", new Object[]{new Boolean(z)});
        } else {
            startDetect(z);
        }
    }

    public static /* synthetic */ void access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bc42b8", new Object[0]);
        } else {
            clearWifiFgStatus();
        }
    }

    public static /* synthetic */ void access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a27df9", new Object[0]);
        } else {
            updateWifiFgStatus();
        }
    }

    public static /* synthetic */ CopyOnWriteArraySet access$300() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArraySet) ipChange.ipc$dispatch("ff65c64f", new Object[0]) : requestList;
    }

    public static /* synthetic */ void access$400(NetworkStatusHelper.NetworkStatus networkStatus, String str, List list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb2ba6e", new Object[]{networkStatus, str, list, new Integer(i)});
        } else {
            startOneDetect(networkStatus, str, list, i);
        }
    }

    static {
        kge.a(1594139711);
        seq = new AtomicInteger(1);
        requestList = null;
        continueTimeoutCount = 0;
        periodTimeoutCount = 0;
        startTime = -1L;
        endTime = -1L;
        isInit = new AtomicBoolean(false);
        networkStatusChangeListener = new NetworkStatusHelper.INetworkStatusChangeListener() { // from class: anetwork.channel.monitor.WifiFgDetector.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
            public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
                } else {
                    WifiFgDetector.access$000(true);
                }
            }
        };
        appLifecycleListener = new AppLifecycle.AppLifecycleListener() { // from class: anetwork.channel.monitor.WifiFgDetector.2
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
                } else {
                    WifiFgDetector.access$000(true);
                }
            }
        };
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
            ALog.e(TAG, "registerListener wifiFgDetect", null, new Object[0]);
            NetworkStatusHelper.addStatusChangeListener(networkStatusChangeListener);
            AppLifecycle.registerLifecycleListener(appLifecycleListener);
        } catch (Exception e) {
            ALog.e(TAG, "[registerListener] wifiFgDetect error", null, e, new Object[0]);
        }
    }

    public static void updateWifiFgDetect(final int i, final String str, final boolean z, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e6b6533", new Object[]{new Integer(i), str, new Boolean(z), new Integer(i2)});
        } else {
            ThreadPoolExecutorFactory.submitBackupTask(new Runnable() { // from class: anetwork.channel.monitor.WifiFgDetector.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!AwcnConfig.isWifiUnavailableUseCellOptOpened()) {
                    } else {
                        if (!z) {
                            WifiFgDetector.access$100();
                            return;
                        }
                        if (AwcnConfig.isHostInWifiFgForceCellWhiteList(str)) {
                            if (i > 0 && z && i2 <= 0) {
                                WifiFgDetector.access$100();
                                return;
                            }
                            WifiFgDetector.access$200();
                        }
                        WifiFgDetector.access$000(false);
                    }
                }
            });
        }
    }

    private static void startDetect(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9fcf8a8", new Object[]{new Boolean(z)});
            return;
        }
        final NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        if (!status.isWifi() || GlobalAppRuntimeInfo.isAppBackground()) {
            clearWifiFgStatus();
            ALog.e(TAG, "[wifi fg detect opt][DetectOpt] not wifi or isAppBackground", null, "isWifi", Boolean.valueOf(status.isWifi()), "isAppBackground", Boolean.valueOf(GlobalAppRuntimeInfo.isAppBackground()));
            return;
        }
        String uniqueId = NetworkStatusHelper.getUniqueId(status);
        if ("error".equalsIgnoreCase(uniqueId)) {
            clearWifiFgStatus();
            ALog.e(TAG, "[wifi fg detect opt]startWifiFgDetect uniqueId = error", null, new Object[0]);
        } else if (!isNeedDetect(uniqueId, z)) {
        } else {
            ThreadPoolExecutorFactory.submitHRTask(new Runnable() { // from class: anetwork.channel.monitor.WifiFgDetector.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ALog.e(WifiFgDetector.TAG, "[wifi fg detect opt][DetectOpt] run startDetect!", null, "requestList", WifiFgDetector.access$300());
                    ArrayList arrayList = new ArrayList();
                    int size = WifiFgDetector.access$300().size();
                    Iterator it = WifiFgDetector.access$300().iterator();
                    while (it.hasNext()) {
                        WifiFgDetector.access$400(NetworkStatusHelper.NetworkStatus.this, (String) it.next(), arrayList, size);
                    }
                }
            });
        }
    }

    private static void startOneDetect(final NetworkStatusHelper.NetworkStatus networkStatus, String str, final List<DetectHistoryRecord.DetectRecord> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("553c13a1", new Object[]{networkStatus, str, list, new Integer(i)});
            return;
        }
        final String str2 = "WifiFgDetect" + seq.getAndIncrement();
        final WifiFgDetectStatic wifiFgDetectStatic = new WifiFgDetectStatic(str);
        final long currentTimeMillis = System.currentTimeMillis();
        WifiFgDetectTask.access$500(str, str2, new IOneDetectFinishCb() { // from class: anetwork.channel.monitor.WifiFgDetector.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anetwork.channel.monitor.WifiFgDetector.IOneDetectFinishCb
            public void onRequestFinish(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a9929caa", new Object[]{this, new Boolean(z)});
                } else if (GlobalAppRuntimeInfo.isAppBackground() && !z) {
                } else {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    String uniqueId = NetworkStatusHelper.getUniqueId(NetworkStatusHelper.NetworkStatus.this);
                    if (z) {
                        WifiDetector.detectWifiFgHistoryRecord.update(uniqueId, true);
                    } else {
                        list.add(WifiDetector.detectWifiFgHistoryRecord.createDetectRecord(false));
                        if (list.size() >= 2) {
                            WifiDetector.detectWifiFgHistoryRecord.update(uniqueId, false);
                        }
                    }
                    WifiFgDetectStatic wifiFgDetectStatic2 = wifiFgDetectStatic;
                    wifiFgDetectStatic2.uniqueId = uniqueId;
                    wifiFgDetectStatic2.detectTime = currentTimeMillis2 - currentTimeMillis;
                    wifiFgDetectStatic2.ret = z ? 1 : 0;
                    AppMonitor.getInstance().commitStat(wifiFgDetectStatic);
                    ALog.e(WifiFgDetector.TAG, "[wifi fg detect opt] [DetectOpt] onRequestFinish:", str2, "uniqueId", uniqueId, "enable", Boolean.valueOf(z), "detectRecordList", list);
                }
            }
        });
    }

    private static synchronized boolean isNeedDetect(String str, boolean z) {
        boolean z2;
        synchronized (WifiFgDetector.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3d539364", new Object[]{str, new Boolean(z)})).booleanValue();
            }
            if (requestList == null || requestList.isEmpty()) {
                CopyOnWriteArraySet<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
                requestList = copyOnWriteArraySet;
                copyOnWriteArraySet.add(IDC_URL);
                requestList.add(CDN_URL);
            }
            if (z) {
                ALog.e(TAG, "[wifi fg detect opt][DetectOpt] need wifi fg detect, isStatusChangeDetect is true ", null, new Object[0]);
                return true;
            }
            if (WifiDetector.detectWifiFgHistoryRecord == null) {
                WifiDetector.detectWifiFgHistoryRecord = new DetectHistoryRecord(SP_HISTORY_RECORDS);
            }
            boolean z3 = continueTimeoutCount >= AwcnConfig.getContinueTimeoutCount();
            long j = -1;
            if (endTime != -1 && startTime != -1) {
                j = endTime - startTime;
            }
            boolean z4 = ((j > (AwcnConfig.getPeriodTime() * 1000) ? 1 : (j == (AwcnConfig.getPeriodTime() * 1000) ? 0 : -1)) >= 0) && periodTimeoutCount >= AwcnConfig.getPeriodTimeoutCount();
            if (!z3 && !z4) {
                z2 = false;
                if (WifiDetector.detectWifiFgHistoryRecord != null || !WifiDetector.detectWifiFgHistoryRecord.isNeedsWifiFgDetect(str, z2)) {
                    ALog.e(TAG, "[wifi fg detect opt][DetectOpt] not need wifi fg detect, condition is false", null, "continueTimeoutCount", Integer.valueOf(continueTimeoutCount), "periodTimeoutCount", Integer.valueOf(periodTimeoutCount), "periodTime", Long.valueOf(j));
                    return false;
                }
                ALog.e(TAG, "[wifi fg detect opt][DetectOpt] need wifi fg detect, isNeedsWifiFgDetect is true ", null, new Object[0]);
                clearWifiFgStatus();
                return true;
            }
            ALog.e(TAG, "[wifi fg detect opt][DetectOpt] detect condition true", null, "continueTimeoutCount", Integer.valueOf(continueTimeoutCount), "periodTimeoutCount", Integer.valueOf(periodTimeoutCount), "periodTime", Long.valueOf(j));
            z2 = true;
            if (WifiDetector.detectWifiFgHistoryRecord != null) {
            }
            ALog.e(TAG, "[wifi fg detect opt][DetectOpt] not need wifi fg detect, condition is false", null, "continueTimeoutCount", Integer.valueOf(continueTimeoutCount), "periodTimeoutCount", Integer.valueOf(periodTimeoutCount), "periodTime", Long.valueOf(j));
            return false;
        }
    }

    private static synchronized void clearWifiFgStatus() {
        synchronized (WifiFgDetector.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d833c", new Object[0]);
                return;
            }
            startTime = -1L;
            endTime = -1L;
            continueTimeoutCount = 0;
            periodTimeoutCount = 0;
        }
    }

    private static synchronized void updateWifiFgStatus() {
        synchronized (WifiFgDetector.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29bb8db8", new Object[0]);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (startTime == -1) {
                startTime = currentTimeMillis;
            }
            endTime = currentTimeMillis;
            continueTimeoutCount++;
            periodTimeoutCount++;
        }
    }

    /* loaded from: classes.dex */
    public static class WifiFgDetectTask implements NetworkCallBack.FinishListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public IOneDetectFinishCb oneDetectFinishCb;
        public String seq;
        public String url;

        static {
            kge.a(-1858110461);
            kge.a(-501869850);
        }

        public static /* synthetic */ void access$500(String str, String str2, IOneDetectFinishCb iOneDetectFinishCb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6372a48", new Object[]{str, str2, iOneDetectFinishCb});
            } else {
                startWifiFgDetectOneTask(str, str2, iOneDetectFinishCb);
            }
        }

        public WifiFgDetectTask(String str, String str2, IOneDetectFinishCb iOneDetectFinishCb) {
            this.url = null;
            this.seq = null;
            this.oneDetectFinishCb = null;
            this.url = str;
            this.seq = str2;
            this.oneDetectFinishCb = iOneDetectFinishCb;
        }

        public Future start() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Future) ipChange.ipc$dispatch("bdd2dfff", new Object[]{this});
            }
            RequestImpl requestImpl = new RequestImpl(this.url);
            requestImpl.setReadTimeout(AwcnConfig.getDetectReadTimeOut());
            requestImpl.setSeqNo(this.seq);
            requestImpl.setExtProperty(RequestConstant.KEY_WIFI_DETECT_REQ, "true");
            return new DegradableNetwork(GlobalAppRuntimeInfo.getContext()).asyncSend(requestImpl, null, null, this);
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
                return;
            }
            int httpCode = finishEvent.getHttpCode();
            ALog.e(WifiFgDetector.TAG, "[wifi fg detect opt][DetectOpt] onFinished", this.seq, "code", Integer.valueOf(httpCode));
            IOneDetectFinishCb iOneDetectFinishCb = this.oneDetectFinishCb;
            if (httpCode == -202 || httpCode == -200 || httpCode == -401 || httpCode == -400 || httpCode == -406 || httpCode == -402) {
                z = false;
            }
            iOneDetectFinishCb.onRequestFinish(z);
        }

        private static void startWifiFgDetectOneTask(String str, String str2, IOneDetectFinishCb iOneDetectFinishCb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e59f0123", new Object[]{str, str2, iOneDetectFinishCb});
            } else {
                new WifiFgDetectTask(str, str2, iOneDetectFinishCb).start();
            }
        }
    }
}
