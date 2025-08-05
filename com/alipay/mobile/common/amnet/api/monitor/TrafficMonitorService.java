package com.alipay.mobile.common.amnet.api.monitor;

import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;
import tb.riy;

/* loaded from: classes3.dex */
public class TrafficMonitorService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int SCENE_APP_BACKTOFG = 2;
    public static int SCENE_APP_START = 1;
    public static int SCENE_DEFAULT = -1;

    /* renamed from: a  reason: collision with root package name */
    private static long f5356a;
    private static long b;
    private static long h;
    private static long i;
    private static long j;
    private static long k;
    private static long l;
    private static long m;
    private static long n;
    private static TrafficMonitorService o;
    private long c = 5000;
    private byte f = 1;
    private byte g = 2;
    private int d = SCENE_DEFAULT;
    private byte e = this.f;

    public static /* synthetic */ void access$000(TrafficMonitorService trafficMonitorService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0733044", new Object[]{trafficMonitorService});
        } else {
            trafficMonitorService.a();
        }
    }

    public static TrafficMonitorService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TrafficMonitorService) ipChange.ipc$dispatch("b6fa6951", new Object[0]);
        }
        TrafficMonitorService trafficMonitorService = o;
        if (trafficMonitorService != null) {
            return trafficMonitorService;
        }
        synchronized (TrafficMonitorService.class) {
            if (o == null) {
                o = new TrafficMonitorService();
            }
        }
        return o;
    }

    private TrafficMonitorService() {
    }

    public synchronized void setScene(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9592e452", new Object[]{this, new Integer(i2)});
        } else if (!MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
        } else {
            if (this.e == this.g || this.d != SCENE_DEFAULT) {
                LogCatUtil.debug("TrafficMonitorService", "current scene[" + this.d + "],trafficMonitor task is busy,ignore new scene[" + i2 + riy.ARRAY_END_STR);
                return;
            }
            this.e = this.g;
            this.d = i2;
            long currentTimeMillis = System.currentTimeMillis();
            f5356a = currentTimeMillis;
            b = currentTimeMillis + this.c;
            NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.amnet.api.monitor.TrafficMonitorService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TrafficMonitorService.access$000(TrafficMonitorService.this);
                    }
                }
            }, 5L, TimeUnit.SECONDS);
            LogCatUtil.debug("TrafficMonitorService", "start traffic monitor,scene[" + i2 + "] startTime[" + f5356a + riy.ARRAY_END_STR);
        }
    }

    public synchronized void monitorUpTraffic(byte b2, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f17a88d", new Object[]{this, new Byte(b2), new Integer(i2), new Integer(i3)});
        } else if (!MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
        } else {
            if (System.currentTimeMillis() < b) {
                if (b2 != 0) {
                    if (b2 == 1) {
                        h += i3;
                    } else if (b2 == 2 || b2 == 3) {
                        k += i3;
                    }
                }
            }
        }
    }

    public synchronized void monitorDownTraffic(byte b2, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a89aafd4", new Object[]{this, new Byte(b2), new Integer(i2), new Integer(i3)});
        } else if (!MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
        } else {
            if (System.currentTimeMillis() < b) {
                if (b2 != 0) {
                    if (b2 == 1) {
                        i += i3;
                    } else if (b2 == 2 || b2 == 3) {
                        l += i3;
                    }
                }
            }
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        j = h + i;
        m = k + l;
        long j2 = j;
        long j3 = m;
        n = j2 + j3;
        a(this.d, j2, j3, n);
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c();
        this.e = this.f;
        this.d = SCENE_DEFAULT;
        f5356a = 0L;
        b = 0L;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        h = 0L;
        i = 0L;
        j = 0L;
        k = 0L;
        l = 0L;
        m = 0L;
    }

    private void a(int i2, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d24b0c9", new Object[]{this, new Integer(i2), new Long(j2), new Long(j3), new Long(j4)});
            return;
        }
        LogCatUtil.debug("TrafficMonitorService", "scene[" + i2 + "] rpcTotalTraffic[" + j2 + "] syncTotalTraffic[" + j3 + "] totalTraffic[" + j4 + riy.ARRAY_END_STR);
        if (j4 < 1) {
            LogCatUtil.debug("TrafficMonitorService", "totalTraffic is very little,need't report");
            return;
        }
        MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
        monitorLoggerModel.setSubType(Configuration.LOG_TYPE_TRAFFIC);
        monitorLoggerModel.getExtPramas().put("scene", String.valueOf(i2));
        monitorLoggerModel.getExtPramas().put("rpcTraffic", String.valueOf(j2));
        monitorLoggerModel.getExtPramas().put("syncTraffic", String.valueOf(j3));
        monitorLoggerModel.getExtPramas().put("totalTraffic", String.valueOf(j4));
        MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
    }
}
