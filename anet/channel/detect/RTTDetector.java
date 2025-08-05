package anet.channel.detect;

import android.text.TextUtils;
import android.util.Pair;
import anet.channel.AwcnConfig;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class RTTDetector implements IRTTDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long EXPIRED_TIME = 60000;
    private static final String HOST_ACCS = "msgacs.m.taobao.com";
    private static final String HOST_MTOP = "guide-acs.m.taobao.com";
    private static final int MAX_LENGTH = 10;
    private static final String TAG = "awcn.RTTDetector";
    private static final int UNKNOWN_RTT = -1;
    private static final List<String> supportHost;
    private static final List<Integer> supportType;
    private volatile String currentNetwork;
    private volatile LimitedQueue<Pair<Long, Long>> mtopRecord = new LimitedQueue<>(10);
    private volatile LimitedQueue<Pair<Long, Long>> accsRecord = new LimitedQueue<>(10);

    public static /* synthetic */ String access$000(RTTDetector rTTDetector) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ff91a6e1", new Object[]{rTTDetector}) : rTTDetector.currentNetwork;
    }

    public static /* synthetic */ String access$002(RTTDetector rTTDetector, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e522a19", new Object[]{rTTDetector, str});
        }
        rTTDetector.currentNetwork = str;
        return str;
    }

    public static /* synthetic */ LimitedQueue access$102(RTTDetector rTTDetector, LimitedQueue limitedQueue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LimitedQueue) ipChange.ipc$dispatch("ecea033a", new Object[]{rTTDetector, limitedQueue});
        }
        rTTDetector.mtopRecord = limitedQueue;
        return limitedQueue;
    }

    public static /* synthetic */ LimitedQueue access$202(RTTDetector rTTDetector, LimitedQueue limitedQueue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LimitedQueue) ipChange.ipc$dispatch("2d14e9fb", new Object[]{rTTDetector, limitedQueue});
        }
        rTTDetector.accsRecord = limitedQueue;
        return limitedQueue;
    }

    static {
        kge.a(235075499);
        kge.a(600026940);
        supportType = new ArrayList();
        supportHost = new ArrayList();
    }

    public RTTDetector() {
        supportType.add(1);
        supportType.add(2);
        supportType.add(3);
        supportHost.add("guide-acs.m.taobao.com");
        supportHost.add(HOST_ACCS);
    }

    public void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
        } else {
            NetworkStatusHelper.addStatusChangeListener(new NetworkStatusHelper.INetworkStatusChangeListener() { // from class: anet.channel.detect.RTTDetector.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
                public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
                    } else if (!AwcnConfig.isRTTDetectEnable()) {
                    } else {
                        String uniqueId = NetworkStatusHelper.getUniqueId(networkStatus);
                        if (TextUtils.isEmpty(uniqueId) || !uniqueId.equalsIgnoreCase(RTTDetector.access$000(RTTDetector.this))) {
                            return;
                        }
                        RTTDetector.access$102(RTTDetector.this, new LimitedQueue(10));
                        RTTDetector.access$202(RTTDetector.this, new LimitedQueue(10));
                        RTTDetector.access$002(RTTDetector.this, uniqueId);
                    }
                }
            });
        }
    }

    @Override // anet.channel.detect.IRTTDetector
    public void recordRTT(String str, int i, long j) {
        LimitedQueue<Pair<Long, Long>> limitedQueue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("815e8fd3", new Object[]{this, str, new Integer(i), new Long(j)});
        } else if (!AwcnConfig.isRTTDetectEnable() || !supportType.contains(Integer.valueOf(i)) || !supportHost.contains(str) || j <= 0) {
        } else {
            try {
                if ("guide-acs.m.taobao.com".equalsIgnoreCase(str)) {
                    limitedQueue = this.mtopRecord;
                } else {
                    limitedQueue = HOST_ACCS.equalsIgnoreCase(str) ? this.accsRecord : null;
                }
                if (limitedQueue == null) {
                    return;
                }
                ALog.e(TAG, "[recordRTT]", null, "host", str, "rtt", Long.valueOf(j));
                limitedQueue.add(Pair.create(Long.valueOf(System.currentTimeMillis()), Long.valueOf(j)));
            } catch (Throwable unused) {
                ALog.e(TAG, "[recordRTT]error", null, new Object[0]);
            }
        }
    }

    @Override // anet.channel.detect.IRTTDetector
    public long getRTT(String str) {
        LimitedQueue<Pair<Long, Long>> limitedQueue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8eac4cc1", new Object[]{this, str})).longValue();
        }
        if (!AwcnConfig.isRTTDetectEnable()) {
            return -1L;
        }
        try {
            if ("guide-acs.m.taobao.com".equalsIgnoreCase(str)) {
                limitedQueue = this.mtopRecord;
            } else {
                limitedQueue = HOST_ACCS.equalsIgnoreCase(str) ? this.accsRecord : null;
            }
            if (limitedQueue == null) {
                return -1L;
            }
            Iterator<Pair<Long, Long>> it = limitedQueue.iterator();
            long j = 0;
            int i = 0;
            while (it.hasNext()) {
                Pair<Long, Long> next = it.next();
                if (System.currentTimeMillis() - ((Long) next.first).longValue() <= 60000) {
                    i++;
                    j += ((Long) next.second).longValue();
                }
            }
            long j2 = i <= 0 ? -1L : j / i;
            ALog.e(TAG, "[getRTT]", null, "host", str, "avgRTT", Long.valueOf(j2));
            return j2;
        } catch (Throwable unused) {
            ALog.e(TAG, "[getRTT]error", null, new Object[0]);
            return -1L;
        }
    }
}
