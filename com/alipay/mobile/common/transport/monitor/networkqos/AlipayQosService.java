package com.alipay.mobile.common.transport.monitor.networkqos;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.monitor.DeviceTrafficStateInfo;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mto;

/* loaded from: classes3.dex */
public class AlipayQosService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte QOE_FROM_DIAG = 3;
    public static final byte QOE_FROM_INTERFERENCE = 6;
    public static final byte QOE_FROM_MMTP = 1;
    public static final byte QOE_FROM_NBET = 4;
    public static final byte QOE_FROM_READING = 5;
    public static final byte QOE_FROM_TCP = 2;
    public static final double QOE_NET_BAD = 5000.0d;
    public static final byte QOS_LEVEL_A = 1;
    public static final byte QOS_LEVEL_B = 2;
    public static final byte QOS_LEVEL_C = 3;
    public static final byte QOS_LEVEL_D = 4;

    /* renamed from: a  reason: collision with root package name */
    private static AlipayQosService f5603a;
    private QoeManager b;
    private DeviceTrafficManager c;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i;
    private int j;

    public static /* synthetic */ void access$000(AlipayQosService alipayQosService, double d, double d2, double d3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed1f662", new Object[]{alipayQosService, new Double(d), new Double(d2), new Double(d3), new Integer(i)});
        } else {
            alipayQosService.a(d, d2, d3, i);
        }
    }

    public static /* synthetic */ QoeManager access$100(AlipayQosService alipayQosService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (QoeManager) ipChange.ipc$dispatch("2c50e782", new Object[]{alipayQosService}) : alipayQosService.b;
    }

    public static AlipayQosService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlipayQosService) ipChange.ipc$dispatch("9a63fa6a", new Object[0]);
        }
        AlipayQosService alipayQosService = f5603a;
        if (alipayQosService != null) {
            return alipayQosService;
        }
        synchronized (AlipayQosService.class) {
            if (f5603a == null) {
                f5603a = new AlipayQosService();
            }
        }
        return f5603a;
    }

    private AlipayQosService() {
        this.b = null;
        this.c = null;
        try {
            a();
            this.b = QoeManager.getInstance();
            this.c = DeviceTrafficManager.getInstance();
        } catch (Throwable unused) {
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TransportConfigureManager transportConfigureManager = TransportConfigureManager.getInstance();
        this.d = transportConfigureManager.getDoubleValue(TransportConfigureItem.RTO_BOUND_A);
        this.e = transportConfigureManager.getDoubleValue(TransportConfigureItem.RTO_BOUND_B);
        this.f = transportConfigureManager.getDoubleValue(TransportConfigureItem.RTO_BOUND_C);
        this.g = transportConfigureManager.getDoubleValue(TransportConfigureItem.SPEED_BOUND_A);
        this.h = transportConfigureManager.getDoubleValue(TransportConfigureItem.SPEED_BOUND_B);
        this.i = transportConfigureManager.getDoubleValue(TransportConfigureItem.SPEED_BOUND_C);
        this.j = -1;
    }

    public int getQosLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("272bc1df", new Object[]{this})).intValue();
        }
        try {
            if (!StringUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.NET_QOS_SWITCH), "T")) {
                LogCatUtil.debug("AlipayQosService", "qosSwitch is off,always return A level");
                return 1;
            } else if (!NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext())) {
                return 4;
            } else {
                final double rto = getRto();
                final double speed = getSpeed();
                final double bandwidth = getBandwidth();
                int a2 = a(rto, speed > bandwidth ? speed : bandwidth);
                if (this.j - a2 > 2) {
                    a2++;
                }
                final int i = a2;
                NetworkAsyncTaskExecutor.executeLowPri(new Runnable() { // from class: com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            AlipayQosService.access$000(AlipayQosService.this, rto, speed, bandwidth, i);
                        }
                    }
                });
                if (a2 != 4 || NetworkUtils.getNetworkType(TransportEnvUtil.getContext()) != 4) {
                    return a2;
                }
                LogCatUtil.warn("AlipayQosService", "Though result is D,but it's 4G now,return C instead");
                return 3;
            }
        } catch (Throwable th) {
            LogCatUtil.error("AlipayQosService", th);
            return 3;
        }
    }

    private void a(double d, double d2, double d3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94452aad", new Object[]{this, new Double(d), new Double(d2), new Double(d3), new Integer(i)});
            return;
        }
        if (i == 4) {
            LogCatUtil.warn("AlipayQosService", "========here level is D==========");
        }
        if (this.j == i) {
            return;
        }
        this.j = i;
        MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
        monitorLoggerModel.setSubType("NETQOS");
        monitorLoggerModel.setParam1(MonitorLoggerUtils.getLogBizType("NETQOS"));
        monitorLoggerModel.setParam2("INFO");
        monitorLoggerModel.setParam3(String.valueOf(i));
        monitorLoggerModel.getExtPramas().put("RTO", String.format("%.4f", Double.valueOf(d)));
        monitorLoggerModel.getExtPramas().put(RPCDataItems.SPEED, String.format("%.4f", Double.valueOf(d2)));
        monitorLoggerModel.getExtPramas().put("BANDWIDTH", String.format("%.4f", Double.valueOf(d3)));
        monitorLoggerModel.getExtPramas().put("LEVEL", String.valueOf(i));
        monitorLoggerModel.getExtPramas().put(RPCDataItems.NETTYPE, String.valueOf(NetworkUtils.getNetType(TransportEnvUtil.getContext())));
        LogCatUtil.debug("AlipayQosService", monitorLoggerModel.toString());
        MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
    }

    private int a(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0efa1b", new Object[]{this, new Double(d), new Double(d2)})).intValue();
        }
        int rtoLevel = getRtoLevel(d);
        if (rtoLevel == 1) {
            return 1;
        }
        return a(d2) < rtoLevel ? rtoLevel - 1 : rtoLevel;
    }

    public int getRtoLevel(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fb5521d", new Object[]{this, new Double(d)})).intValue();
        }
        double d2 = this.d;
        if (d <= d2) {
            return 1;
        }
        if (d2 < d && d <= this.e) {
            return 2;
        }
        return (d <= this.e || d > this.f) ? 4 : 3;
    }

    private int a(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a82180c9", new Object[]{this, new Double(d)})).intValue();
        }
        double d2 = this.g;
        if (d >= d2) {
            return 1;
        }
        if (this.h <= d && d < d2) {
            return 2;
        }
        return (this.i > d || d >= this.h) ? 4 : 3;
    }

    public void estimate(final double d, final byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("428c262d", new Object[]{this, new Double(d), new Byte(b)});
            return;
        }
        try {
            if (!NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext()) || d < mto.a.GEO_NOT_SUPPORT) {
                return;
            }
            if (d > 5000.0d) {
                d = 5000.0d;
            }
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AlipayQosService.access$100(AlipayQosService.this).estimate(QosInterfereHelper.getInstance().interferInputRtt(d), b);
                    QosInterfereHelper.getInstance().interferOutputRtt(d, AlipayQosService.this.getRto());
                }
            });
        } catch (Throwable th) {
            LogCatUtil.error("AlipayQosService", "estimate exception", th);
        }
    }

    public double getRto() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98777c2c", new Object[]{this})).doubleValue();
        }
        try {
            return this.b.getRto();
        } catch (Throwable unused) {
            return mto.a.GEO_NOT_SUPPORT;
        }
    }

    public double getSpeed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9d747a86", new Object[]{this})).doubleValue() : this.c.getSpeed();
    }

    public void setSpeed(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f3f86b2", new Object[]{this, new Double(d)});
        } else {
            this.c.setSpeed(d);
        }
    }

    public double getBandwidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("59a840f0", new Object[]{this})).doubleValue() : this.c.getBandwidth();
    }

    public DeviceTrafficStateInfo startTrafficMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTrafficStateInfo) ipChange.ipc$dispatch("a3d6cc76", new Object[]{this});
        }
        try {
            return this.c.startTrafficMonitor();
        } catch (Throwable unused) {
            return null;
        }
    }

    public DeviceTrafficStateInfo.DeviceTrafficStateInfoDelta stopTrafficMonitor(DeviceTrafficStateInfo deviceTrafficStateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTrafficStateInfo.DeviceTrafficStateInfoDelta) ipChange.ipc$dispatch("c312902e", new Object[]{this, deviceTrafficStateInfo});
        }
        try {
            return this.c.stopTrafficMonitor(deviceTrafficStateInfo);
        } catch (Throwable th) {
            LogCatUtil.error("AlipayQosService", th);
            return null;
        }
    }

    public void estimateByStartTime(long j, byte b) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92c12eaf", new Object[]{this, new Long(j), new Byte(b)});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis <= j || (i = (int) (currentTimeMillis - j)) <= 60) {
                return;
            }
            AlipayQosService alipayQosService = getInstance();
            double d = i;
            if (d > 5000.0d) {
                d = 5000.0d;
            }
            alipayQosService.estimate(d, b);
        } catch (Throwable unused) {
        }
    }

    public void resetRtoWhenNetchange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("401dfd7c", new Object[]{this});
            return;
        }
        try {
            this.b.resetRtoWhenNetchange();
        } catch (Throwable unused) {
        }
    }
}
