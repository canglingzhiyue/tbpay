package anetwork.channel.monitor;

import anet.channel.AwcnConfig;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class NetworkMetricsMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.NetworkMetricsMonitor";
    public static long lastRecentWinCount;
    public static long lastRecentWinFail;
    private static long lastRecentWinTime;
    private static long recentWinCount;
    private static long recentWinFail;

    public static /* synthetic */ void access$000(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddeb9a3d", new Object[]{new Boolean(z)});
        } else {
            updateRecentCount(z);
        }
    }

    public static /* synthetic */ void access$100(boolean z, double d, Calculator calculator, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67fcbc8f", new Object[]{new Boolean(z), new Double(d), calculator, str, str2});
        } else {
            updateCalculator(z, d, calculator, str, str2);
        }
    }

    static {
        kge.a(716389346);
        lastRecentWinFail = -1L;
        lastRecentWinCount = -1L;
        recentWinFail = -1L;
        recentWinCount = -1L;
        lastRecentWinTime = System.currentTimeMillis();
    }

    public static void updateMetrics(final boolean z, final boolean z2, final long j, final long j2, final double d, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd8a3727", new Object[]{new Boolean(z), new Boolean(z2), new Long(j), new Long(j2), new Double(d), str});
        } else {
            ThreadPoolExecutorFactory.submitHRTask(new Runnable() { // from class: anetwork.channel.monitor.NetworkMetricsMonitor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        NetworkMetricsMonitor.access$000(z);
                        NetworkMetricsMonitor.access$100(z2, j / 1000.0d, Calculator.getSrttInstance(), str, "srtt");
                        NetworkMetricsMonitor.access$100(z2, j2, Calculator.getFrttInstance(), str, "frtt");
                        NetworkMetricsMonitor.access$100(z2, d, Calculator.getLossRateInstance(), str, "lossratio");
                    } catch (Throwable th) {
                        ALog.e(NetworkMetricsMonitor.TAG, "[RUM] updateMetrics error = " + th.toString(), str, new Object[0]);
                    }
                }
            });
        }
    }

    private static synchronized void updateCalculator(boolean z, double d, Calculator calculator, String str, String str2) {
        synchronized (NetworkMetricsMonitor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97dfc6d5", new Object[]{new Boolean(z), new Double(d), calculator, str, str2});
            } else if (calculator == null || d <= mto.a.GEO_NOT_SUPPORT) {
            } else {
                if (calculator.lastUpdateTime == -1) {
                    calculator.lastUpdateTime = System.currentTimeMillis();
                }
                if (z) {
                    calculator.cdnCount++;
                    calculator.minCDNVal = Math.min(calculator.minCDNVal, d);
                    calculator.maxCDNVal = Math.max(calculator.maxCDNVal, d);
                    calculator.sumCDNVal += d;
                } else {
                    calculator.idcCount++;
                    calculator.minIDCVal = Math.min(calculator.minIDCVal, d);
                    calculator.maxIDCVal = Math.max(calculator.maxIDCVal, d);
                    calculator.sumIDCVal += d;
                }
                if (System.currentTimeMillis() - calculator.lastUpdateTime >= AwcnConfig.getUpdateMetricsTime()) {
                    calculator.avgCDNVal = calculator.cdnCount == 0 ? -1.0d : calculator.sumCDNVal / calculator.cdnCount;
                    calculator.avgIDCVal = calculator.idcCount == 0 ? -1.0d : calculator.sumIDCVal / calculator.idcCount;
                    calculator.lastMaxCDNVal = calculator.maxCDNVal;
                    calculator.lastMinCDNVal = calculator.minCDNVal;
                    calculator.lastMaxIDCVal = calculator.maxIDCVal;
                    calculator.lastMinIDCVal = calculator.minIDCVal;
                    calculator.lastUpdateTime = System.currentTimeMillis();
                    calculator.sumCDNVal = mto.a.GEO_NOT_SUPPORT;
                    calculator.sumIDCVal = mto.a.GEO_NOT_SUPPORT;
                    calculator.cdnCount = 0L;
                    calculator.idcCount = 0L;
                    calculator.maxCDNVal = Double.MIN_VALUE;
                    calculator.minCDNVal = Double.MAX_VALUE;
                    calculator.maxIDCVal = Double.MIN_VALUE;
                    calculator.minIDCVal = Double.MAX_VALUE;
                    ALog.e(TAG, "[RUM] updateCalculator " + str2, str, "avgCDN", Double.valueOf(calculator.avgCDNVal), "avgIDC", Double.valueOf(calculator.avgIDCVal), "maxCDN", Double.valueOf(calculator.lastMaxCDNVal), "minCDN", Double.valueOf(calculator.lastMinCDNVal), "maxIDC", Double.valueOf(calculator.lastMaxIDCVal), "minIDCVal", Double.valueOf(calculator.lastMinIDCVal));
                }
            }
        }
    }

    private static synchronized void updateRecentCount(boolean z) {
        synchronized (NetworkMetricsMonitor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6eefb722", new Object[]{new Boolean(z)});
                return;
            }
            if (lastRecentWinTime == -1) {
                lastRecentWinTime = System.currentTimeMillis();
            }
            if (z) {
                recentWinFail++;
            } else {
                recentWinCount++;
            }
            if (System.currentTimeMillis() - lastRecentWinTime >= AwcnConfig.getRecentWinTime()) {
                lastRecentWinFail = recentWinFail;
                lastRecentWinCount = recentWinCount;
                lastRecentWinTime = System.currentTimeMillis();
                recentWinFail = 0L;
                recentWinCount = 0L;
                ALog.e(TAG, "[RUM] updateRecentCount", null, "lastRecentWinFail", Long.valueOf(lastRecentWinFail), "lastRecentWinCount", Long.valueOf(lastRecentWinCount));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Calculator {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static Calculator frttInstance;
        private static Calculator lossRateInstance;
        private static Calculator srttInstance;
        public double minCDNVal = Double.MAX_VALUE;
        public double maxCDNVal = Double.MIN_VALUE;
        public long cdnCount = 0;
        public double sumCDNVal = mto.a.GEO_NOT_SUPPORT;
        public double minIDCVal = Double.MAX_VALUE;
        public double maxIDCVal = Double.MIN_VALUE;
        public long idcCount = 0;
        public double sumIDCVal = mto.a.GEO_NOT_SUPPORT;
        public double avgCDNVal = -1.0d;
        public double avgIDCVal = -1.0d;
        public double lastMinCDNVal = -1.0d;
        public double lastMaxCDNVal = -1.0d;
        public double lastMinIDCVal = -1.0d;
        public double lastMaxIDCVal = -1.0d;
        public long lastUpdateTime = -1;

        static {
            kge.a(377244964);
            srttInstance = null;
            frttInstance = null;
            lossRateInstance = null;
        }

        private Calculator() {
        }

        public static Calculator getSrttInstance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Calculator) ipChange.ipc$dispatch("c97c4d9e", new Object[0]);
            }
            if (srttInstance == null) {
                srttInstance = new Calculator();
            }
            return srttInstance;
        }

        public static Calculator getFrttInstance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Calculator) ipChange.ipc$dispatch("71bfa70b", new Object[0]);
            }
            if (frttInstance == null) {
                frttInstance = new Calculator();
            }
            return frttInstance;
        }

        public static Calculator getLossRateInstance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Calculator) ipChange.ipc$dispatch("247f4d22", new Object[0]);
            }
            if (lossRateInstance == null) {
                lossRateInstance = new Calculator();
            }
            return lossRateInstance;
        }
    }
}
