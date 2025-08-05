package anetwork.channel.monitor;

import anet.channel.detect.NetworkDetector;
import anet.channel.status.HandoverSignalMonitor;
import anet.channel.util.ALog;
import anetwork.channel.monitor.NetworkMetricsMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class NetworkMetricsHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anetwork.NetworkMetricsHelper";

    static {
        kge.a(1948885030);
    }

    public static int getSignalSINR() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5c391b2", new Object[0])).intValue();
        }
        return Integer.MIN_VALUE;
    }

    public static int getSore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de0257ff", new Object[0])).intValue();
        }
        return -1;
    }

    public static double getSrttAvgCDN() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a27de65", new Object[0])).doubleValue() : NetworkMetricsMonitor.Calculator.getSrttInstance().avgCDNVal;
    }

    public static double getSrttMaxCDN() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("39f00b93", new Object[0])).doubleValue() : NetworkMetricsMonitor.Calculator.getSrttInstance().lastMaxCDNVal;
    }

    public static double getSrttMinCDN() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cd47c2e5", new Object[0])).doubleValue() : NetworkMetricsMonitor.Calculator.getSrttInstance().lastMinCDNVal;
    }

    public static double getSrttAvgIDC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("46f23f60", new Object[0])).doubleValue() : NetworkMetricsMonitor.Calculator.getSrttInstance().avgIDCVal;
    }

    public static double getSrttMaxIDC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("76ba6c8e", new Object[0])).doubleValue() : NetworkMetricsMonitor.Calculator.getSrttInstance().lastMaxIDCVal;
    }

    public static double getSrttMinIDC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a1223e0", new Object[0])).doubleValue() : NetworkMetricsMonitor.Calculator.getSrttInstance().lastMinIDCVal;
    }

    public static double getFrttAvgCDN() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("91e4a152", new Object[0])).doubleValue() : NetworkMetricsMonitor.Calculator.getFrttInstance().avgCDNVal;
    }

    public static double getFrttMaxCDN() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c1acce80", new Object[0])).doubleValue() : NetworkMetricsMonitor.Calculator.getFrttInstance().lastMaxCDNVal;
    }

    public static double getFrttMinCDN() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("550485d2", new Object[0])).doubleValue() : NetworkMetricsMonitor.Calculator.getFrttInstance().lastMinCDNVal;
    }

    public static double getFrttAvgIDC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ceaf024d", new Object[0])).doubleValue() : NetworkMetricsMonitor.Calculator.getFrttInstance().avgIDCVal;
    }

    public static double getFrttMaxIDC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fe772f7b", new Object[0])).doubleValue() : NetworkMetricsMonitor.Calculator.getFrttInstance().lastMaxIDCVal;
    }

    public static double getFrttMinIDC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("91cee6cd", new Object[0])).doubleValue() : NetworkMetricsMonitor.Calculator.getFrttInstance().lastMinIDCVal;
    }

    public static double getLossratioAvgCDN() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c5c134a2", new Object[0])).doubleValue() : NetworkMetricsMonitor.Calculator.getLossRateInstance().avgCDNVal;
    }

    public static double getLossratioMaxCDN() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f58961d0", new Object[0])).doubleValue() : NetworkMetricsMonitor.Calculator.getLossRateInstance().lastMaxCDNVal;
    }

    public static double getLossratioAvgIDC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("28b959d", new Object[0])).doubleValue() : NetworkMetricsMonitor.Calculator.getLossRateInstance().avgIDCVal;
    }

    public static double getLossratioMaxIDC() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3253c2cb", new Object[0])).doubleValue() : NetworkMetricsMonitor.Calculator.getLossRateInstance().lastMaxIDCVal;
    }

    public static long getRecentWinCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ada9ed7f", new Object[0])).longValue();
        }
        ALog.e(TAG, "[RUM] getRecentWinCount", null, "recentWinCount", Long.valueOf(NetworkMetricsMonitor.lastRecentWinCount));
        return NetworkMetricsMonitor.lastRecentWinCount;
    }

    public static long getRecentWinFail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfcf2284", new Object[0])).longValue();
        }
        ALog.e(TAG, "[RUM] getRecentWinFail", null, "recentWinFail", Long.valueOf(NetworkMetricsMonitor.lastRecentWinFail));
        return NetworkMetricsMonitor.lastRecentWinFail;
    }

    public static long getRecentWinBWE() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a45b7e0", new Object[0])).longValue();
        }
        long bandwidth = RRPSpeedCalculator.getInstance().getBandwidth();
        ALog.e(TAG, "[RUM] getRecentWinBWE", null, "recentWinBWE", Long.valueOf(bandwidth));
        return bandwidth;
    }

    public static long getMtuCDN() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb1d6a90", new Object[0])).longValue();
        }
        long availableMTU = NetworkDetector.getAvailableMTU();
        ALog.e(TAG, "[RUM] getMtuCDN", null, "mtu", Long.valueOf(availableMTU));
        return availableMTU;
    }

    public static long getMtuIDC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27e7cb8b", new Object[0])).longValue();
        }
        long availableMTU = NetworkDetector.getAvailableMTU();
        ALog.e(TAG, "[RUM] getMtuCDN", null, "mtu", Long.valueOf(availableMTU));
        return availableMTU;
    }

    public static int getSignalDBM() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6cb22d2b", new Object[0])).intValue() : HandoverSignalMonitor.signalDBM();
    }

    public static int getSignalRSSI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66ea1cef", new Object[0])).intValue() : HandoverSignalMonitor.signalDBM();
    }
}
