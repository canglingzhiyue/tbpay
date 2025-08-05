package com.alipay.mobile.common.amnet.biz.inner;

import android.text.TextUtils;
import com.alipay.mars.comm.Alarm;
import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.amnet.api.AmnetListenerAdpter;
import com.alipay.mobile.common.amnet.biz.AmnetOperationManager;
import com.alipay.mobile.common.amnet.biz.AmnetTunnelManager;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.monitor.DeviceTrafficStateInfo;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.monitor.networkqos.DeviceTrafficManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetBeanFactory;
import com.alipay.mobile.common.transportext.amnet.Initialization;
import com.alipay.mobile.common.transportext.amnet.Linkage;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes3.dex */
public class AmnetMonitorLoggerListener extends AmnetListenerAdpter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5366a = "";
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    private long f = -1;
    private long g = -1;
    private long h = -1;
    private String i = "";
    private DeviceTrafficStateInfo j = null;

    /* loaded from: classes3.dex */
    public class LogModel {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ACTIVE_TIME = "active";
        public static final String ACTIVE_TO_INITOK = "active_init";
        public static final String ALIVE_TIMING = "dur";
        public static final String ATTEMP_COUNT = "c_c";
        public static final String ATTEMP_DURATION = "c_t";
        public static final String CHANNEL_SELECT = "CHANNEL_SELECT";
        public static final String CID = "CID";
        public static final String CLIENTIP = "CIP";
        public static final String CONN_LIST = "connlist";
        public static final String CONN_REASON = "reason";
        public static final String CONN_START_TS = "ts";
        public static final String CONN_TIMING = "tcp_c";
        public static final String DNS_TIMING = "dns_c";
        public static final String ERR_CODE = "errcode";
        public static final String ERR_INFO = "errinfo";
        public static final String EVENT_KEY_ERROR = "mmtp_error";
        public static final String EVENT_KEY_ON_CONNECTED = "mmtp_conn";
        public static final String EVENT_KEY_ON_DISCONNECED = "mmtp_close";
        public static final String EVENT_KEY_ON_INTELL_HB = "mmtp_intellhb";
        public static final String EVENT_KEY_ON_MNET_START = "mmtp_start";
        public static final String EVENT_KEY_ON_RETRENCH = "mmtp_retrench";
        public static final String EXTEND_MSG = "ext_msg";
        public static final String FIRST_FRAME = "f_ack";
        public static final String HANDSHAKE_TIMING = "tls_hs";
        public static final String INITOK_TIME = "initok";
        public static final String INIT_TIME = "init";
        public static final String INTELL_HB_COUNT = "ihb_count";
        public static final String INTELL_HB_DATA = "ihb_data";
        public static final String IP_LOCAL = "IL";
        public static final String IP_REMOTE = "IR";
        public static final String IP_SERVER = "IS";
        public static final String IS_FG = "fg";
        public static final String IS_SFC = "sfc";
        public static final String LAST_ALARM_MISS = "last_alarm_miss";
        public static final String MTAG = "MTAG";
        public static final String NETWORK = "network";
        public static final String NETWORK_EXTRA = "network_extra";
        public static final String PORT_LOCAL = "PL";
        public static final String PORT_REMOTE = "PR";
        public static final String PORT_SERVER = "PS";
        public static final String PROXY = "prx";
        public static final String QOE_MAX = "qoe_max";
        public static final String QOE_MIN = "qoe_min";
        public static final String RETRENCH_COUNT = "r_c";
        public static final String ROAM = "ROAM";
        public static final String STD_SSL = "stdssl";
        public static final String USE_TICKET = "tkt";
        public static final String YES_SSL = "yesssl";
        public static final String ZERO_RTT = "tls_0rtt";
        public DeviceTrafficStateInfo.DeviceTrafficStateInfoDelta mDeviceTrafficStateInfoDelta;
        public String ipLocal = "";
        public String portLocal = "";
        public String ipRemote = "";
        public String portRemote = "";
        public String ipServer = "";
        public String portServer = "";
        public String event = "";
        public String dnsTime = "";
        public String connTIme = "";
        public String attempDuration = "";
        public String attempCount = "";
        public String network = "";
        public String network_extra = "";
        public String proxy = "";
        public String isFg = "";
        public String connlist = "";
        public String channelSelect = "";
        public String yesSSL = "";
        public String sslHsTime = "";
        public String connAliveTime = "";
        public String initTime = "";
        public String firstFrameTime = "";
        public String zeroRtt = "";
        public String useTicket = "";
        public String stdSSL = "";
        public String intell_hb_data = "";
        public String intell_hb_count = "";
        public String connStartTime = "";
        public String errCode = "";
        public String errInfo = "";
        public String cntRetrench = "";
        public String sfc = "";
        public String reason = "";
        public String qoeMin = "";
        public String qoeMax = "";
        public String activeTime = "";
        public String initOkTime = "";
        public String activeToInitOk = "";
        public String mtag = "";
        public String cid = "";
        public String clientIp = "";
        public String extMsg = "";
        public String libVersion = MonitorLoggerUtils.LIB_VERSION_OLD;
        public String netTunnel = "";
        public String lastAlarmMiss = "";

        public LogModel() {
        }

        /* JADX WARN: Removed duplicated region for block: B:74:0x03ec  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0404  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0406  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0450  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0465  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void monitorLog() {
            /*
                Method dump skipped, instructions count: 1149
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.amnet.biz.inner.AmnetMonitorLoggerListener.LogModel.monitorLog():void");
        }
    }

    public static /* synthetic */ Object ipc$super(AmnetMonitorLoggerListener amnetMonitorLoggerListener, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void touch(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f93e466e", new Object[]{this, str, str2, str3, str4});
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void change(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a8d39ac", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.f5366a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        } else if (1 == i) {
            a();
        } else {
            b();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.j != null) {
        } else {
            synchronized (DeviceTrafficManager.class) {
                if (this.j != null) {
                    return;
                }
                this.j = DeviceTrafficManager.getInstance().startTrafficMonitor();
                if (!MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
                    return;
                }
                LogCatUtil.info("AmnetMonitorLoggerListener", "[startTrafficMonitor] finished.");
            }
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void panic(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f5029cf", new Object[]{this, new Integer(i), str});
            return;
        }
        LogCatUtil.info("AmnetMonitorLoggerListener", "Panic errorCode = " + i + "Info: " + str);
        if (67 != i && 69 != i) {
            return;
        }
        reportError(i, str);
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void report(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b818819", new Object[]{this, str, new Double(d)});
            return;
        }
        LogCatUtil.verbose("AmnetMonitorLoggerListener", "Report =" + str + " " + d);
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void notifyInitOk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("febd35bc", new Object[]{this});
            return;
        }
        this.g = System.currentTimeMillis();
        LogCatUtil.info("AmnetMonitorLoggerListener", "get notifyInitOK");
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void notifyInitResponse(Initialization.RspInit rspInit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b845a7ee", new Object[]{this, rspInit});
        } else {
            this.i = rspInit.clientIp;
        }
    }

    public void notifyReportOnConnect(Linkage.Touching touching) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd27281b", new Object[]{this, touching});
            return;
        }
        LogCatUtil.debug("AmnetMonitorLoggerListener", "notifyReportOnConnect");
        oldTouch(touching.ipLocal, touching.ipRemote, touching.portLocal, touching.portRemote);
        LogModel logModel = getLogModel();
        logModel.event = LogModel.EVENT_KEY_ON_CONNECTED;
        logModel.ipLocal = touching.ipLocal;
        logModel.portLocal = touching.portLocal;
        logModel.ipRemote = touching.ipRemote;
        logModel.portRemote = touching.portRemote;
        logModel.ipServer = touching.ipServer;
        logModel.portServer = touching.portServer;
        logModel.connlist = touching.group;
        logModel.attempCount = String.valueOf(touching.cntAttempt);
        logModel.attempDuration = String.valueOf(touching.msAttempt);
        if (touching.isUseBifrost) {
            if (touching.isUseHttp2) {
                logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_BIFROST_HTTP2;
                logModel.netTunnel = MonitorLoggerUtils.NETTUNNEL_ULib_h2;
            } else {
                logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_BIFROST;
            }
        } else {
            logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_OLD;
        }
        logModel.dnsTime = String.valueOf(touching.msDns);
        logModel.connTIme = String.valueOf(touching.msTcp);
        if (touching.network != null) {
            logModel.network = touching.network;
        } else {
            logModel.network = "";
        }
        if (touching.netname != null) {
            logModel.network_extra = touching.netname;
        } else {
            logModel.network_extra = "";
        }
        if (touching.reason > 0) {
            logModel.reason = String.valueOf(touching.reason);
        }
        logModel.cid = String.valueOf(touching.cid);
        logModel.channelSelect = String.valueOf(touching.channelSelect);
        logModel.monitorLog();
    }

    public void notifyReportOnDisconnect(Linkage.Touching touching, Linkage.Separating separating) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560a27ae", new Object[]{this, touching, separating});
            return;
        }
        if (touching.yesLnk) {
            LogModel logModel = getLogModel();
            logModel.event = LogModel.EVENT_KEY_ON_DISCONNECED;
            logModel.ipLocal = touching.ipLocal;
            logModel.portLocal = touching.portLocal;
            logModel.ipRemote = touching.ipRemote;
            logModel.portRemote = touching.portRemote;
            logModel.ipServer = touching.ipServer;
            logModel.portServer = touching.portServer;
            String str = "1";
            logModel.proxy = touching.proxy ? str : "0";
            logModel.isFg = touching.foreground ? str : "0";
            logModel.dnsTime = String.valueOf(touching.msDns);
            logModel.connTIme = String.valueOf(touching.msTcp);
            logModel.attempCount = String.valueOf(touching.cntAttempt);
            logModel.attempDuration = String.valueOf(touching.msAttempt);
            logModel.clientIp = this.i;
            if (touching.isUseBifrost || separating.isUseBifrost) {
                if (touching.isUseHttp2 || separating.isUseHttp2) {
                    logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_BIFROST_HTTP2;
                    logModel.netTunnel = MonitorLoggerUtils.NETTUNNEL_ULib_h2;
                } else {
                    logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_BIFROST;
                }
            } else {
                logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_OLD;
            }
            if (touching.network != null) {
                logModel.network = touching.network;
            } else {
                logModel.network = "";
            }
            if (touching.netname != null) {
                logModel.network_extra = touching.netname;
            } else {
                logModel.network_extra = "";
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            long j = this.h;
            if (j != -1) {
                logModel.connStartTime = simpleDateFormat.format(new Date(j));
            } else {
                logModel.connStartTime = "";
            }
            long j2 = this.g;
            if (j2 != -1) {
                logModel.initTime = simpleDateFormat.format(new Date(j2));
            } else {
                logModel.initTime = "";
            }
            if (separating.yesSsl) {
                logModel.sslHsTime = String.valueOf(separating.msSsl);
                logModel.zeroRtt = separating.fast ? str : "0";
                logModel.useTicket = separating.ticket ? str : "0";
                logModel.stdSSL = separating.standard ? str : "0";
            } else {
                logModel.sslHsTime = "";
                logModel.zeroRtt = "";
                logModel.useTicket = "";
                logModel.stdSSL = "";
            }
            if (!separating.yesSsl) {
                str = "0";
            }
            logModel.yesSSL = str;
            logModel.firstFrameTime = String.valueOf(separating.msFirst);
            logModel.connAliveTime = String.valueOf(separating.msLife);
            logModel.cntRetrench = String.valueOf(separating.cntRetrench);
            if (separating.qoeMin > 0) {
                logModel.qoeMin = String.valueOf(separating.qoeMin);
            }
            if (separating.qoeMax > 0) {
                logModel.qoeMax = String.valueOf(separating.qoeMax);
            }
            if (touching.freqConn) {
                logModel.sfc = "T";
            }
            if (!TextUtils.isEmpty(separating.mtag)) {
                logModel.mtag = "";
            }
            logModel.cid = String.valueOf(touching.cid);
            if (separating.yesErr) {
                logModel.errCode = String.valueOf(separating.codeErr);
                logModel.errInfo = separating.infErr;
            } else {
                logModel.errCode = "";
            }
            logModel.extMsg = separating.extMsg;
            logModel.channelSelect = String.valueOf(touching.channelSelect);
            a(logModel);
            logModel.monitorLog();
            if (separating.cntHb > 0) {
                notifyReportOnIHB(touching, separating.infHb, separating.cntHb);
            }
        } else if (separating.yesErr) {
            reportError(separating.codeErr, separating.infErr);
        }
        this.g = -1L;
        this.h = -1L;
    }

    private void a(LogModel logModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("139e29fc", new Object[]{this, logModel});
            return;
        }
        try {
            long activateTime = ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).getActivateTime();
            if (activateTime == -1) {
                return;
            }
            logModel.activeTime = String.valueOf(activateTime);
            logModel.initOkTime = String.valueOf(this.g);
            logModel.activeToInitOk = String.valueOf(this.g - activateTime);
            ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).setActivateTime(-1L);
        } catch (Throwable th) {
            LogCatUtil.error("AmnetMonitorLoggerListener", th);
        }
    }

    public void notifyReportOnRetrench(Linkage.Touching touching) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bee9728", new Object[]{this, touching});
        } else if (touching == null) {
        } else {
            LogModel logModel = getLogModel();
            logModel.event = LogModel.EVENT_KEY_ON_RETRENCH;
            logModel.ipLocal = touching.ipLocal;
            logModel.portLocal = touching.portLocal;
            logModel.ipRemote = touching.ipRemote;
            logModel.portRemote = touching.portRemote;
            logModel.ipServer = touching.ipServer;
            logModel.portServer = touching.portServer;
            logModel.monitorLog();
        }
    }

    public void notifyReportOnIHB(Linkage.Touching touching, Linkage.Keeping[] keepingArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2cf93a", new Object[]{this, touching, keepingArr, new Integer(i)});
            return;
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.AMENT_INTLGNT_HB_PERF);
        if (TextUtils.isEmpty(stringValue) || !stringValue.startsWith("T")) {
            LogCatUtil.debug("AmnetMonitorLoggerListener", "Intelligent Hearbeat data report is off");
            return;
        }
        LogModel logModel = getLogModel();
        logModel.event = LogModel.EVENT_KEY_ON_INTELL_HB;
        logModel.ipLocal = touching.ipLocal;
        logModel.portLocal = touching.portLocal;
        logModel.ipRemote = touching.ipRemote;
        logModel.portRemote = touching.portRemote;
        logModel.ipServer = touching.ipServer;
        logModel.portServer = touching.portServer;
        if (touching.isUseBifrost) {
            if (AmnetTunnelManager.getInstance().isNowUseBifrostH2()) {
                logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_BIFROST_HTTP2;
                logModel.netTunnel = MonitorLoggerUtils.NETTUNNEL_ULib_h2;
            } else {
                logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_BIFROST;
            }
        } else {
            logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_OLD;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        long j = this.h;
        if (j != -1) {
            logModel.connStartTime = simpleDateFormat.format(new Date(j));
        } else {
            logModel.connStartTime = "";
        }
        if (touching.cid > 0) {
            logModel.cid = String.valueOf(touching.cid);
        }
        if (touching.network != null) {
            logModel.network = touching.network;
        } else {
            logModel.network = "";
        }
        if (touching.netname != null) {
            logModel.network_extra = touching.netname;
        } else {
            logModel.network_extra = "";
        }
        logModel.intell_hb_count = String.valueOf(i);
        if (keepingArr == null || i <= 0) {
            logModel.monitorLog();
            return;
        }
        StringBuilder sb = new StringBuilder("");
        for (int i2 = 0; i2 < i; i2++) {
            Linkage.Keeping keeping = keepingArr[i2];
            if (keeping != null) {
                sb.append(keeping.stamp);
                sb.append("_");
                sb.append(keeping.interval);
                sb.append("_");
                sb.append(keeping.rtt);
                sb.append("_");
                sb.append(keeping.sReal);
                if (i2 < i - 1) {
                    sb.append("-");
                }
            }
        }
        logModel.intell_hb_data = sb.toString();
        logModel.monitorLog();
    }

    public void reportError(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f899c272", new Object[]{this, new Integer(i), str});
        } else if (TextUtils.equals(this.e, LogModel.EVENT_KEY_ERROR) && this.f != -1 && System.currentTimeMillis() <= this.f) {
            LogCatUtil.info("AmnetMonitorLoggerListener", "Repeat the event =" + this.e);
        } else {
            this.e = LogModel.EVENT_KEY_ERROR;
            this.f = System.currentTimeMillis() + 2000;
            LogModel logModel = getLogModel();
            logModel.event = LogModel.EVENT_KEY_ERROR;
            logModel.errInfo = str;
            logModel.errCode = String.valueOf(i);
            if (AmnetTunnelManager.getInstance().isNowUseBifrost()) {
                if (AmnetTunnelManager.getInstance().isNowUseBifrostH2()) {
                    logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_BIFROST_HTTP2;
                    logModel.netTunnel = MonitorLoggerUtils.NETTUNNEL_ULib_h2;
                } else {
                    logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_BIFROST;
                }
                int lastAlarmMiss = Alarm.getLastAlarmMiss();
                if (lastAlarmMiss > 10000) {
                    logModel.lastAlarmMiss = String.valueOf(lastAlarmMiss);
                }
            } else {
                logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_OLD;
            }
            b(logModel);
            logModel.monitorLog();
        }
    }

    private void b(LogModel logModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb1a03bd", new Object[]{this, logModel});
        } else if (this.j == null || logModel == null) {
        } else {
            try {
                logModel.mDeviceTrafficStateInfoDelta = DeviceTrafficManager.getInstance().stopTrafficMonitor(this.j);
            } catch (Throwable th) {
                LogCatUtil.warn("AmnetMonitorLoggerListener", "[setDeviceTrafficStateInfoDelta] Exception: " + th.toString());
            }
            b();
        }
    }

    public void oldTouch(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ac307", new Object[]{this, str, str2, str3, str4});
            return;
        }
        this.f5366a = str;
        this.b = str3;
        this.c = str2;
        this.d = str4;
        this.g = -1L;
        this.h = System.currentTimeMillis();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.j == null) {
        } else {
            synchronized (DeviceTrafficManager.class) {
                this.j = null;
            }
            if (!MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
                return;
            }
            LogCatUtil.info("AmnetMonitorLoggerListener", "resetStartDeviceTrafficStateInfo finished.");
        }
    }

    public LogModel getLogModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LogModel) ipChange.ipc$dispatch("c84536e8", new Object[]{this}) : new LogModel();
    }
}
