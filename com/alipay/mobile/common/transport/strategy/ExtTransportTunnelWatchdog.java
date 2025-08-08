package com.alipay.mobile.common.transport.strategy;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.amnet.biz.AmnetTunnelManager;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.utils.ConnectionUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NwSharedSwitchUtil;
import com.alipay.mobile.common.transport.utils.SharedPreUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ExtTransportTunnelWatchdog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String DOWNGRADE_REASON_AMNETPOST = "AMNETPOST_FAILURE";
    public static String DOWNGRADE_REASON_BIND = "BIND_FAILURE";
    public static String DOWNGRADE_REASON_CRASH = "CRASH_FAILURE";
    public static String DOWNGRADE_REASON_RPC = "RPC_FAILURE";
    public static final String SP_KEY_PROC_CRASH_TICK = "proc_crash_tick";
    public static final String SP_SUB_KEY_MAX_CRASH_TIME_ALLOW = "maxCrashTimeAllow";
    public static final String SP_SUB_KEY_PROC_CRASH_COUNT = "procCrasheCount";

    /* renamed from: a  reason: collision with root package name */
    private static ExtTransportTunnelWatchdog f5613a;
    private int b;
    private long c;
    private int d;
    private long e;
    private volatile int i;
    private Object m = new Object();
    private boolean p = false;
    private volatile int f = 0;
    private volatile long g = 0;
    private volatile int h = 0;
    private volatile long k = 0;
    private volatile long j = 0;
    private boolean l = false;
    private String n = "";
    private AtomicBoolean o = new AtomicBoolean(true);

    public static /* synthetic */ void access$000(ExtTransportTunnelWatchdog extTransportTunnelWatchdog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8caab3c1", new Object[]{extTransportTunnelWatchdog});
        } else {
            extTransportTunnelWatchdog.b();
        }
    }

    public static /* synthetic */ AtomicBoolean access$100(ExtTransportTunnelWatchdog extTransportTunnelWatchdog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("4bb268c2", new Object[]{extTransportTunnelWatchdog}) : extTransportTunnelWatchdog.o;
    }

    public static final ExtTransportTunnelWatchdog getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtTransportTunnelWatchdog) ipChange.ipc$dispatch("6ae54c8e", new Object[0]);
        }
        ExtTransportTunnelWatchdog extTransportTunnelWatchdog = f5613a;
        if (extTransportTunnelWatchdog != null) {
            return extTransportTunnelWatchdog;
        }
        synchronized (ExtTransportTunnelWatchdog.class) {
            if (f5613a != null) {
                return f5613a;
            }
            f5613a = new ExtTransportTunnelWatchdog();
            return f5613a;
        }
    }

    private ExtTransportTunnelWatchdog() {
        TransportConfigureManager transportConfigureManager = TransportConfigureManager.getInstance();
        this.b = transportConfigureManager.getIntValue(TransportConfigureItem.AMNET_DOWNGRADE_RPC_TRIGGER_COUNT);
        this.c = transportConfigureManager.getLongValue(TransportConfigureItem.AMNET_DOWNGRADE_RPC_TRIGGER_TIME) * 1000;
        if (Runtime.getRuntime().availableProcessors() <= 2 && this.c < 25000) {
            this.c = 25000L;
        }
        this.d = transportConfigureManager.getIntValue(TransportConfigureItem.AMNET_DOWNGRADE_BIND_TRIGGER_COUNT);
        this.e = transportConfigureManager.getLongValue(TransportConfigureItem.AMNET_DOWNGRADE_BIND_TRIGGER_TIME) * 1000;
        LogCatUtil.debug("EXT_Watchdog", "MMTP Triggers: RPCFailures - " + this.b + " RPCFailureTime - " + this.c + " BindFailure - " + this.d + " BindFailureTime - " + this.e);
    }

    public synchronized void mrpcFailureTick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a56821d6", new Object[]{this});
            return;
        }
        if (isDowngraded() && this.p && !TransportStrategy.isEnabledTransportByLocalAmnet()) {
            this.l = false;
        }
        if (isDowngraded()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f == 0) {
            this.g = currentTimeMillis;
        }
        this.f++;
        LogCatUtil.debug("EXT_Watchdog", "MMTP failure ticked, current failures:" + this.f + " failure duration:" + (currentTimeMillis - this.g) + "ms");
        b();
    }

    public synchronized void mrpcFailureRest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dd9388d", new Object[]{this});
        } else if (this.f == 0) {
        } else {
            this.f = 0;
            this.g = 0L;
            LogCatUtil.debug("EXT_Watchdog", "MMTP failure reset to 0");
        }
    }

    public boolean pushProcCrashTick(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21e8c371", new Object[]{this, context})).booleanValue();
        }
        try {
            b(context);
            return true;
        } catch (Throwable th) {
            LogCatUtil.error("EXT_Watchdog", "pushProcCrashTick exception", th);
            SharedPreUtils.removeData(context, SP_KEY_PROC_CRASH_TICK);
            return false;
        }
    }

    public synchronized void bindFailureTick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26331d51", new Object[]{this});
        } else if (!NetworkTunnelStrategy.getInstance().isCanUseAmnet()) {
            LogCatUtil.verbose("EXT_Watchdog", "AMNET is disabled already, no need to tick");
        } else {
            if (isDowngraded() && this.p && !TransportStrategy.isEnabledTransportByLocalAmnet()) {
                this.l = false;
            }
            if (isDowngraded()) {
                LogCatUtil.verbose("EXT_Watchdog", "Already downgraded, no need to tick");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.h == 0) {
                this.j = currentTimeMillis;
            }
            long j = currentTimeMillis - this.k;
            if (j > 1000) {
                if (currentTimeMillis - this.j > this.e) {
                    this.h = 1;
                    this.k = currentTimeMillis;
                    this.j = currentTimeMillis;
                    LogCatUtil.verbose("EXT_Watchdog", "Bind failure does not exceed configure data, Reseting counters for bind...");
                    return;
                }
                this.h++;
                this.k = currentTimeMillis;
                LogCatUtil.debug("EXT_Watchdog", "IPC Bind failure ticked, current failures:" + this.h + " failure duration:" + (currentTimeMillis - this.j) + "ms， mLastBindFailureTime = " + this.k);
                b();
                return;
            }
            LogCatUtil.verbose("EXT_Watchdog", "Ignore - Bind failure happened too frequent. current ts = " + currentTimeMillis + ", mLastBindFailureTime = " + this.k + ", timeDiff = " + j);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.h == 0) {
        } else {
            this.h = 0;
            this.j = 0L;
            this.k = 0L;
            LogCatUtil.debug("EXT_Watchdog", "Bind failure reset to 0");
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.f > 0 && this.o.compareAndSet(true, false)) {
            NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.transport.strategy.ExtTransportTunnelWatchdog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ExtTransportTunnelWatchdog.access$000(ExtTransportTunnelWatchdog.this);
                    ExtTransportTunnelWatchdog.access$100(ExtTransportTunnelWatchdog.this).set(true);
                }
            }, this.c + 1000, TimeUnit.MILLISECONDS);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f > 0 && (this.f >= this.b || currentTimeMillis - this.g > this.c)) {
            LogCatUtil.debug("EXT_Watchdog", "Will start downgrade due to RPC failure condition");
            startTunnelDowngrade(DOWNGRADE_REASON_RPC);
        } else if (this.h < this.d) {
        } else {
            LogCatUtil.debug("EXT_Watchdog", "Will start downgrade due to Bind failure condition");
            LogCatUtil.debug("EXT_Watchdog", String.format("bc = %d, bmc = %d, ts = %d, tms = %d", Integer.valueOf(this.h), Integer.valueOf(this.d), Long.valueOf(currentTimeMillis - this.j), Long.valueOf(this.e)));
            startTunnelDowngrade(DOWNGRADE_REASON_BIND);
        }
    }

    public synchronized void startTunnelDowngrade(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8d9107c", new Object[]{this, str});
        } else {
            a(str, TransportEnvUtil.getContext());
        }
    }

    private void a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e7fbd6", new Object[]{this, str, context});
            return;
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.ALLOW_AMNET_DOWNGRADE);
        if (StringUtils.isEmpty(stringValue) || !stringValue.startsWith("T")) {
            LogCatUtil.debug("EXT_Watchdog", "Config does not allow downgrade");
            return;
        }
        boolean isEnabledTransportByLocalAmnet = TransportStrategy.isEnabledTransportByLocalAmnet();
        synchronized (this.m) {
            if (this.l && this.p && !isEnabledTransportByLocalAmnet) {
                this.l = false;
                LogCatUtil.info("EXT_Watchdog", "[startTunnelDowngrade] Local amnet is disabled, reset isDowngraded state.");
            }
            if (this.l) {
                LogCatUtil.debug("EXT_Watchdog", "Tunnel is already downgraded, not need to do it again");
                mrpcFailureRest();
                return;
            }
            this.l = true;
            if (!isEnabledTransportByLocalAmnet) {
                c(context);
            } else {
                this.p = true;
            }
            a("downgrade", str, context, Boolean.valueOf(isEnabledTransportByLocalAmnet));
            LogCatUtil.debug("EXT_Watchdog", "Tunnel Downgrade Done");
            mrpcFailureRest();
            a();
            if (!DOWNGRADE_REASON_CRASH.equals(str)) {
                return;
            }
            SharedPreUtils.removeData(context, SP_KEY_PROC_CRASH_TICK);
        }
    }

    public boolean isDowngraded() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e22e0b64", new Object[]{this})).booleanValue();
        }
        synchronized (this.m) {
            z = this.l;
        }
        return z;
    }

    public boolean isDowngradeInLocalAmnetMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4fe81924", new Object[]{this})).booleanValue() : this.p;
    }

    private void a(String str, String str2, Context context, Boolean bool) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b3d2201", new Object[]{this, str, str2, context, bool});
            return;
        }
        try {
            int connType = ConnectionUtil.getConnType(context);
            int networkType = ConnectionUtil.getNetworkType(context);
            MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
            monitorLoggerModel.setSubType("MMTP");
            monitorLoggerModel.setParam1("1.0");
            monitorLoggerModel.setParam2(connType + "_" + networkType);
            monitorLoggerModel.setParam3(str);
            boolean isPushProcessRuning = MiscUtils.isPushProcessRuning(context);
            if (StringUtils.equals(str, "downgrade")) {
                monitorLoggerModel.getExtPramas().put(AmnetTunnelManager.LOG_KEY_RPC_FAILED_NUM, String.valueOf(this.f));
                monitorLoggerModel.getExtPramas().put("bind_fc", String.valueOf(this.h));
                monitorLoggerModel.getExtPramas().put("crash_fc", String.valueOf(this.i));
                monitorLoggerModel.getExtPramas().put("reason", str2);
                monitorLoggerModel.getExtPramas().put("push_alive", isPushProcessRuning ? "1" : "0");
                if (bool != null && bool.booleanValue()) {
                    monitorLoggerModel.getExtPramas().put("local_amnet", "T");
                }
            }
            MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
            LogCatUtil.debug("EXT_Watchdog", "Dumping perfLog:" + monitorLoggerModel.toString());
            MonitorInfoUtil.recordUnavailable("BIZ_NETWORK", "LINK_DOWNGRADE", "0", monitorLoggerModel.getExtPramas());
            if (StringUtils.equals(str, "downgrade") && !isPushProcessRuning) {
                MonitorLoggerModel monitorLoggerModel2 = new MonitorLoggerModel();
                monitorLoggerModel2.setSubType("PROCESS");
                monitorLoggerModel2.setParam1(connType + "_" + networkType);
                monitorLoggerModel2.setParam2(str);
                monitorLoggerModel2.setParam3("dead_push_process");
                monitorLoggerModel2.getExtPramas().putAll(monitorLoggerModel.getExtPramas());
                MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel2);
            }
            if (!StringUtils.equals(str2, DOWNGRADE_REASON_BIND) && !StringUtils.equals(str2, DOWNGRADE_REASON_CRASH)) {
                z = false;
            }
            MonitorInfoUtil.kickOnNetworkBindService("network", z, str2);
        } catch (Throwable th) {
            LogCatUtil.error("EXT_Watchdog", th);
        }
    }

    public void resetDowngradeFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fbac7f9", new Object[]{this});
            return;
        }
        synchronized (this.m) {
            LogCatUtil.debug("EXT_Watchdog", "resetting isDowngraded...");
            this.l = false;
            this.p = false;
        }
        a(LoginConstants.LOGIN_UPGRADE, "swtich_update", TransportEnvUtil.getContext(), null);
    }

    private boolean a(Context context, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c64a123", new Object[]{this, context, new Long(j), new Integer(i)})).booleanValue();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SP_SUB_KEY_MAX_CRASH_TIME_ALLOW, j);
            jSONObject.put(SP_SUB_KEY_PROC_CRASH_COUNT, i);
            String jSONObject2 = jSONObject.toString();
            boolean putData = SharedPreUtils.putData(context, SP_KEY_PROC_CRASH_TICK, jSONObject2);
            LogCatUtil.info("EXT_Watchdog", "SP_KEY_PROC_CRASH_TICK save finish, result:" + putData + ".  json: " + jSONObject2);
            return putData;
        } catch (JSONException e) {
            LogCatUtil.error("EXT_Watchdog", "Put json data exception", e);
            return false;
        }
    }

    private String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        String stringData = SharedPreUtils.getStringData(context, SP_KEY_PROC_CRASH_TICK);
        if (!StringUtils.isEmpty(stringData)) {
            return stringData;
        }
        a(context, System.currentTimeMillis() + this.e, 0);
        LogCatUtil.info("EXT_Watchdog", "SP_KEY_PROC_CRASH_TICK no exist, regenerate the model ! ");
        return "";
    }

    private void b(Context context) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else if (!TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.PROC_CRASH_HANDLE_SWITCH, "T")) {
            LogCatUtil.info("EXT_Watchdog", "pushProcCrashTick switch is off");
        } else if (!NetworkTunnelStrategy.getInstance().isCanUseAmnet()) {
            LogCatUtil.verbose("EXT_Watchdog", "AMNET is disabled already, no need to tick");
        } else if (isDowngraded()) {
            LogCatUtil.verbose("EXT_Watchdog", "Already downgraded, no need to tick");
        } else {
            String a2 = a(context);
            if (StringUtils.isEmpty(a2)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(a2);
                try {
                    long j = jSONObject.getLong(SP_SUB_KEY_MAX_CRASH_TIME_ALLOW);
                    int i2 = jSONObject.getInt(SP_SUB_KEY_PROC_CRASH_COUNT);
                    if (System.currentTimeMillis() <= j) {
                        i = i2 + 1;
                        LogCatUtil.info("EXT_Watchdog", "increasing procCrashCount：" + i);
                    } else {
                        j = System.currentTimeMillis() + this.e;
                        i = 0;
                    }
                    a(context, j, i);
                    if (i >= this.d) {
                        this.i = i;
                        LogCatUtil.debug("EXT_Watchdog", String.format("Will start downgrade due to proc crash condition. procCrashCount = %d, maxCrashTimeAllow = %d, mMaxBindTickAllow = %d", Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(this.d)));
                        a(DOWNGRADE_REASON_CRASH, context);
                    }
                    this.i = 0;
                } catch (Throwable th) {
                    LogCatUtil.error("EXT_Watchdog", "Get data from json obj exception, procCrashTickJson: " + a2, th);
                    SharedPreUtils.removeData(context, SP_KEY_PROC_CRASH_TICK);
                }
            } catch (JSONException e) {
                LogCatUtil.error("EXT_Watchdog", "New JSONObject exception, procCrashTickJson: " + a2, e);
                SharedPreUtils.removeData(context, SP_KEY_PROC_CRASH_TICK);
            }
        }
    }

    private void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
            return;
        }
        LogCatUtil.debug("EXT_Watchdog", "Starting tunnel switch to downgrade to SPDY");
        TransportConfigureManager transportConfigureManager = TransportConfigureManager.getInstance();
        this.n = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.AMNET_SWITCH);
        LogCatUtil.verbose("EXT_Watchdog", "Original AMNET_SWTICH:" + this.n);
        transportConfigureManager.setValue(TransportConfigureItem.AMNET_SWITCH, "0,0,0");
        int latestVersion = transportConfigureManager.getLatestVersion() + 1;
        transportConfigureManager.setValue(TransportConfigureItem.VERSION, String.valueOf(latestVersion));
        HashMap hashMap = new HashMap();
        hashMap.put(TransportConfigureItem.AMNET_SWITCH.getConfigName(), "0,0,0");
        hashMap.put(TransportConfigureItem.VERSION.getConfigName(), String.valueOf(latestVersion));
        transportConfigureManager.updateConfig(context, hashMap, NwSharedSwitchUtil.KEY_NET_SWITCH_TWO);
        NwSharedSwitchUtil.notifySwitchUpdate();
    }
}
