package anet.channel.detect;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.MtuDetectStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import org.android.netutil.PingEntry;
import org.android.netutil.PingResponse;
import org.android.netutil.PingTask;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import tb.kge;

/* loaded from: classes.dex */
public class MTUDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MTOP_HOST = "guide-acs.m.taobao.com";
    private static final long MTU_EXPIRED_TIME = 432000000;
    private static final int MTU_MAX_TIME = 3;
    private static final String SP_MTU_DETECT = "sp_mtu_";
    private static final String TAG = "anet.MTUDetector";
    private static Map<String, Integer> availableMtu;
    private static HashMap<String, Long> mtuDetectHistory;

    public static /* synthetic */ void access$000(MTUDetector mTUDetector, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1f2bed", new Object[]{mTUDetector, str});
        } else {
            mTUDetector.mtuDetectTask(str);
        }
    }

    static {
        kge.a(-1177556761);
        mtuDetectHistory = new HashMap<>();
        availableMtu = new ConcurrentHashMap();
    }

    public void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
        } else {
            NetworkStatusHelper.addStatusChangeListener(new NetworkStatusHelper.INetworkStatusChangeListener() { // from class: anet.channel.detect.MTUDetector.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
                public void onNetworkStatusChanged(final NetworkStatusHelper.NetworkStatus networkStatus) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
                    } else {
                        ThreadPoolExecutorFactory.submitDetectTask(new Runnable() { // from class: anet.channel.detect.MTUDetector.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                try {
                                    if (networkStatus != NetworkStatusHelper.NetworkStatus.NO && networkStatus != NetworkStatusHelper.NetworkStatus.NONE) {
                                        String uniqueId = NetworkStatusHelper.getUniqueId(networkStatus);
                                        if ("error".equalsIgnoreCase(uniqueId)) {
                                            ALog.e(MTUDetector.TAG, "mtuDetectTask uniqueId = error", null, new Object[0]);
                                        } else {
                                            MTUDetector.access$000(MTUDetector.this, uniqueId);
                                        }
                                    }
                                } catch (Throwable th) {
                                    ALog.e(MTUDetector.TAG, "MTU detecet fail.", null, th, new Object[0]);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    private void mtuDetectTask(String str) {
        PingResponse pingResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e129af27", new Object[]{this, str});
        } else if (!AwcnConfig.isMTUDetectEnable()) {
            ALog.i(TAG, "mtu detect closed.", null, new Object[0]);
        } else {
            ALog.e(TAG, "mtuDetectTask start", null, new Object[0]);
            SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Long l = mtuDetectHistory.get(str);
            if (l != null && currentTimeMillis < l.longValue()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext());
            long j = defaultSharedPreferences.getLong(SP_MTU_DETECT + str, 0L);
            if (currentTimeMillis < j) {
                mtuDetectHistory.put(str, Long.valueOf(j));
                ALog.e(TAG, "mtuDetectTask in period of validity", null, new Object[0]);
                return;
            }
            List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost("guide-acs.m.taobao.com");
            String ip = (connStrategyListByHost == null || connStrategyListByHost.isEmpty()) ? null : connStrategyListByHost.get(0).getIp();
            if (TextUtils.isEmpty(ip)) {
                return;
            }
            ALog.e(TAG, "[mtuDetectTask]", null, c.IP, ip);
            String str2 = ip;
            Future<PingResponse> launch = new PingTask(str2, 1000, 3, 0, 0).launch();
            Future<PingResponse> launch2 = new PingTask(str2, 1000, 3, 972, 0).launch();
            Future<PingResponse> launch3 = new PingTask(str2, 1000, 3, 1172, 0).launch();
            Future<PingResponse> launch4 = new PingTask(str2, 1000, 3, 1272, 0).launch();
            Future<PingResponse> launch5 = new PingTask(str2, 1000, 3, 1372, 0).launch();
            Future<PingResponse> launch6 = new PingTask(str2, 1000, 3, 1432, 0).launch();
            try {
                pingResponse = launch.get();
            } catch (Exception unused) {
                pingResponse = null;
            }
            if (pingResponse == null) {
                return;
            }
            if (pingResponse.e() < 2) {
                ALog.e(TAG, "MTU detect preTask error", null, "errCode", Integer.valueOf(pingResponse.c()), "successCount", Integer.valueOf(pingResponse.e()));
                return;
            }
            int i = 1000;
            if (!reportMtuDetectStat(ip, 1000, launch2)) {
                i = 0;
            }
            int i2 = 1200;
            if (!reportMtuDetectStat(ip, 1200, launch3)) {
                i2 = i;
            }
            if (reportMtuDetectStat(ip, SecExceptionCode.SEC_ERROR_MALDETECT, launch4)) {
                i2 = SecExceptionCode.SEC_ERROR_MALDETECT;
            }
            if (reportMtuDetectStat(ip, 1400, launch5)) {
                i2 = 1400;
            }
            if (reportMtuDetectStat(ip, 1460, launch6)) {
                i2 = 1460;
            }
            ALog.e(TAG, "MTU detect.", null, "uniqueId", str, "maxAvailableMTU", Integer.valueOf(i2));
            long j2 = currentTimeMillis + MTU_EXPIRED_TIME;
            mtuDetectHistory.put(str, Long.valueOf(j2));
            availableMtu.put(str, Integer.valueOf(i2));
            defaultSharedPreferences.edit().putLong(SP_MTU_DETECT + str, j2).apply();
        }
    }

    private boolean reportMtuDetectStat(String str, int i, Future<PingResponse> future) {
        PingResponse pingResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e187cca9", new Object[]{this, str, new Integer(i), future})).booleanValue();
        }
        try {
            pingResponse = future.get();
        } catch (Exception unused) {
            pingResponse = null;
        }
        if (pingResponse == null) {
            return false;
        }
        int e = pingResponse.e();
        int i2 = 3 - e;
        StringBuilder sb = new StringBuilder();
        PingEntry[] d = pingResponse.d();
        int length = d.length;
        int i3 = 0;
        while (i3 < length) {
            PingResponse pingResponse2 = pingResponse;
            sb.append(d[i3].f25063a);
            if (i3 != length - 1) {
                sb.append(",");
            }
            i3++;
            pingResponse = pingResponse2;
        }
        ALog.e(TAG, "MTU detect result", null, "mtu", Integer.valueOf(i), "successCount", Integer.valueOf(e), "timeoutCount", Integer.valueOf(i2));
        MtuDetectStat mtuDetectStat = new MtuDetectStat();
        mtuDetectStat.mtu = i;
        mtuDetectStat.ip = str;
        mtuDetectStat.pingSuccessCount = e;
        mtuDetectStat.pingTimeoutCount = i2;
        mtuDetectStat.rtt = sb.toString();
        mtuDetectStat.errCode = pingResponse.c();
        AppMonitor.getInstance().commitStat(mtuDetectStat);
        return e > i2;
    }

    public int getAvailableMTU() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27ce1195", new Object[]{this})).intValue();
        }
        Integer num = availableMtu.get(NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus()));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
