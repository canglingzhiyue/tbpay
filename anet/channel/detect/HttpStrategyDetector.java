package anet.channel.detect;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.ConnType;
import anet.channel.entity.Event;
import anet.channel.entity.EventCb;
import anet.channel.session.HttpSession;
import anet.channel.statist.HttpDetectStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyFilter;
import anet.channel.strategy.IStrategyListener;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.StrategyResultParser;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import com.uc.crashsdk.export.LogType;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes2.dex */
public class HttpStrategyDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SP_HTTP_DETECTOR_HOST = "http_detector_host";
    private static final String TAG = "awcn.HttpStrategyDetector";
    private static IStrategyFilter httpFilter;
    private static CopyOnWriteArraySet<String> httpHost;
    private static IStrategyFilter httpsFilter;
    private static AtomicInteger seq;
    private static SharedPreferences sharedPreferences;
    private static IStrategyListener strategyListener;

    public static /* synthetic */ CopyOnWriteArraySet access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArraySet) ipChange.ipc$dispatch("5205e0b2", new Object[0]) : httpHost;
    }

    public static /* synthetic */ SharedPreferences access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("aba7458c", new Object[0]) : sharedPreferences;
    }

    public static /* synthetic */ void access$200(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("415b7b83", new Object[]{str});
        } else {
            startHttpDetect(str);
        }
    }

    public static /* synthetic */ IStrategyFilter access$300() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IStrategyFilter) ipChange.ipc$dispatch("33dfd3d4", new Object[0]) : httpsFilter;
    }

    public static /* synthetic */ IStrategyFilter access$400() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IStrategyFilter) ipChange.ipc$dispatch("ce809655", new Object[0]) : httpFilter;
    }

    public static /* synthetic */ void access$500(String str, boolean z, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("987751ff", new Object[]{str, new Boolean(z), list});
        } else {
            startHttpDetect(str, z, list);
        }
    }

    static {
        kge.a(2070703886);
        seq = new AtomicInteger(1);
        strategyListener = new IStrategyListener() { // from class: anet.channel.detect.HttpStrategyDetector.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.strategy.IStrategyListener
            public void onStrategyUpdated(StrategyResultParser.HttpDnsResponse httpDnsResponse) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c33e6115", new Object[]{this, httpDnsResponse});
                } else if (httpDnsResponse == null) {
                } else {
                    updateDns(httpDnsResponse.dns);
                }
            }

            private void updateDns(StrategyResultParser.Dns[] dnsArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("42bf994c", new Object[]{this, dnsArr});
                } else if (dnsArr != null && dnsArr.length != 0) {
                    for (StrategyResultParser.Dns dns : dnsArr) {
                        String str = dns.host;
                        if (AwcnConfig.isAllowHttpDetect(str) || HttpStrategyDetector.access$000().contains(str)) {
                            if (!HttpStrategyDetector.access$000().contains(str)) {
                                HttpStrategyDetector.access$000().add(str);
                                SharedPreferences.Editor edit = HttpStrategyDetector.access$100().edit();
                                edit.putStringSet(HttpStrategyDetector.SP_HTTP_DETECTOR_HOST, HttpStrategyDetector.access$000());
                                edit.apply();
                            }
                            HttpStrategyDetector.access$200(str);
                        }
                    }
                }
            }
        };
        httpsFilter = new IStrategyFilter() { // from class: anet.channel.detect.HttpStrategyDetector.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.strategy.IStrategyFilter
            public boolean accept(IConnStrategy iConnStrategy) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5d8721cb", new Object[]{this, iConnStrategy})).booleanValue() : "https".equals(iConnStrategy.getProtocol().protocol) && iConnStrategy.getIpSource() == 0;
            }
        };
        httpFilter = new IStrategyFilter() { // from class: anet.channel.detect.HttpStrategyDetector.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.strategy.IStrategyFilter
            public boolean accept(IConnStrategy iConnStrategy) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5d8721cb", new Object[]{this, iConnStrategy})).booleanValue() : "http".equals(iConnStrategy.getProtocol().protocol) && iConnStrategy.getIpSource() == 0;
            }
        };
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext());
        sharedPreferences = defaultSharedPreferences;
        Set<String> stringSet = defaultSharedPreferences.getStringSet(SP_HTTP_DETECTOR_HOST, null);
        httpHost = new CopyOnWriteArraySet<>();
        if (stringSet != null && stringSet.size() > 0) {
            httpHost.addAll(stringSet);
        }
        ALog.e(TAG, "init host :" + httpHost.toString(), null, new Object[0]);
        StrategyCenter.getInstance().registerListener(strategyListener);
        startHttpDetect();
    }

    public static void startHttpDetect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d76b954", new Object[0]);
            return;
        }
        CopyOnWriteArraySet<String> copyOnWriteArraySet = httpHost;
        if (copyOnWriteArraySet == null || copyOnWriteArraySet.size() <= 0) {
            return;
        }
        Iterator<String> it = httpHost.iterator();
        while (it.hasNext()) {
            startHttpDetect(it.next());
        }
    }

    private static void startHttpDetect(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b47b61e", new Object[]{str});
        } else if (!AwcnConfig.isHttpDetectEnable()) {
            ALog.e(TAG, "isHttpDetectEnable is false!", null, new Object[0]);
        } else if (!NetworkStatusHelper.isConnected()) {
            ALog.e(TAG, "network is not connected!", null, new Object[0]);
        } else if (TextUtils.isEmpty(str)) {
            ALog.e(TAG, "host is null !", null, new Object[0]);
        } else if (AwcnConfig.isAmdcReduceFrequencyEnable() && (GlobalAppRuntimeInfo.isLightMainProcess() || GlobalAppRuntimeInfo.isChannelProcess())) {
            ALog.e(TAG, "not need startHttpDetect!!", null, new Object[0]);
        } else {
            ThreadPoolExecutorFactory.submitDetectTask(new Runnable() { // from class: anet.channel.detect.HttpStrategyDetector.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str, HttpStrategyDetector.access$300());
                    List<IConnStrategy> connStrategyListByHost2 = StrategyCenter.getInstance().getConnStrategyListByHost(str, HttpStrategyDetector.access$400());
                    if (connStrategyListByHost == null || connStrategyListByHost.size() <= 0) {
                        ALog.e(HttpStrategyDetector.TAG, "the https strategy list is empty!", null, new Object[0]);
                    } else {
                        HttpStrategyDetector.access$500(str, true, connStrategyListByHost);
                    }
                    if (connStrategyListByHost2 == null || connStrategyListByHost2.size() <= 0) {
                        ALog.e(HttpStrategyDetector.TAG, "the http strategy list is empty!", null, new Object[0]);
                    } else {
                        HttpStrategyDetector.access$500(str, false, connStrategyListByHost2);
                    }
                }
            });
        }
    }

    private static void startHttpDetect(final String str, final boolean z, final List<IConnStrategy> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6aa167", new Object[]{str, new Boolean(z), list});
            return;
        }
        ALog.e(TAG, "startHttpDetect", null, "isSSL ", Boolean.valueOf(z), "host", str);
        final IConnStrategy remove = list.remove(0);
        int status = remove.getStatus();
        String str2 = k.HTTPS_PREFIX;
        if (status != -1) {
            ALog.e(TAG, "this strategy has detected!", null, new Object[0]);
            if (remove.getStatus() != 1) {
                return;
            }
            SessionCenter sessionCenter = SessionCenter.getInstance();
            StringBuilder sb = new StringBuilder();
            if (!z) {
                str2 = k.HTTP_PREFIX;
            }
            sb.append(str2);
            sb.append(str);
            sessionCenter.get(sb.toString(), ConnType.TypeLevel.HTTP, 0L);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if (!z) {
            str2 = k.HTTP_PREFIX;
        }
        sb2.append(str2);
        sb2.append(str);
        String sb3 = sb2.toString();
        HttpSession httpSession = new HttpSession(GlobalAppRuntimeInfo.getContext(), new ConnInfo(sb3, "HttpDetect" + seq.getAndIncrement(), remove));
        httpSession.registerEventcb(LogType.UNEXP_OTHER, new EventCb() { // from class: anet.channel.detect.HttpStrategyDetector.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.entity.EventCb
            public void onEvent(Session session, int i, Event event) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("786c54ab", new Object[]{this, session, new Integer(i), event});
                    return;
                }
                ConnEvent connEvent = new ConnEvent();
                HttpDetectStat httpDetectStat = new HttpDetectStat(str, remove);
                httpDetectStat.ret = i == 512 ? 1 : 0;
                if (httpDetectStat.ret == 0 && event != null) {
                    httpDetectStat.code = event.errorCode;
                }
                ALog.e(HttpStrategyDetector.TAG, "detect is " + httpDetectStat.ret, session.mSeq, "host", str);
                AppMonitor.getInstance().commitStat(httpDetectStat);
                if (i != 512) {
                    if (i != 1024) {
                        return;
                    }
                    connEvent.isSuccess = false;
                    StrategyCenter.getInstance().notifyConnEvent(str, remove, connEvent);
                    HttpStrategyDetector.access$500(str, z, list);
                    return;
                }
                connEvent.isSuccess = true;
                StrategyCenter.getInstance().notifyConnEvent(str, remove, connEvent);
                try {
                    SessionCenter sessionCenter2 = SessionCenter.getInstance();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(z ? k.HTTPS_PREFIX : k.HTTP_PREFIX);
                    sb4.append(str);
                    sessionCenter2.get(sb4.toString(), ConnType.TypeLevel.HTTP, 0L);
                } catch (Exception unused) {
                }
            }
        });
        httpSession.mSessionStat.isCommitted = true;
        httpSession.connect();
    }
}
