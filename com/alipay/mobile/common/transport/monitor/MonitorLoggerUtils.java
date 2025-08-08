package com.alipay.mobile.common.transport.monitor;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.alipay.mobile.common.amnet.biz.AmnetTunnelManager;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MonitorLoggerUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LIB_VERSION = "LIBV";
    public static String LIB_VERSION_BIFROST = "33";
    public static String LIB_VERSION_BIFROST_BDRD = "35";
    public static String LIB_VERSION_BIFROST_HTTP2 = "37";
    public static String LIB_VERSION_BIFROST_HTTP2_BDRD = "39";
    public static String LIB_VERSION_LOCAL_AMNET = "100";
    public static String LIB_VERSION_OLD = "32";
    public static String LIB_VERSION_OLD_BDRD = "34";
    public static final String LOG_LEVEL_DEBUG = "DEBUG";
    public static final String LOG_LEVEL_FATAL = "FATAL";
    public static final String LOG_LEVEL_INFO = "INFO";
    public static final String NETTUNNEL = "NETTUNNEL";
    public static final String NETTUNNEL_ULib_h2 = "ULib_h2";
    public static final String REPORT_BIZ_NAME = "network";

    public static String getLogBizType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8efc4650", new Object[]{str});
        }
        try {
            if (StringUtils.equals(str, NetworkServiceTracer.REPORT_SUB_NAME_RPC)) {
                return NetworkServiceTracer.REPORT_SUB_NAME_RPC;
            }
            if (!StringUtils.equals(str, "MMTP") && !StringUtils.equals(str, "TCP_STACK")) {
                if (!StringUtils.equals(str, "MASS") && !StringUtils.equals(str, NetworkServiceTracer.REPORT_SUB_NAME_DJG) && !StringUtils.equals(str, NetworkServiceTracer.REPORT_SUB_NAME_RSRC)) {
                    if (StringUtils.equals(str, "H5")) {
                        return MonitorItemConstants.PARTITION_NAME;
                    }
                    if (!StringUtils.equals(str, "HTTPDNS") && !StringUtils.equals(str, "SignalState") && !StringUtils.equals(str, "NetDiago") && !StringUtils.equals(str, AmnetTunnelManager.LOG_SUBTYPE) && !StringUtils.equals(str, "NETQOS") && !StringUtils.equals(str, "NetChange")) {
                        return StringUtils.equals(str, "LOG") ? "mdaplog" : "network";
                    }
                    return "MISC";
                }
                return "MASS";
            }
            return "MMTP";
        } catch (Throwable th) {
            LogCatUtil.error("MonitorLoggerUtils", "getLogBizType,ex:" + th.toString());
            return "network";
        }
    }

    public static void uploadPerfLog(MonitorLoggerModel monitorLoggerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ce5d73", new Object[]{monitorLoggerModel});
        } else {
            uploadPerfLog(monitorLoggerModel, null);
        }
    }

    public static void uploadPerfLog(MonitorLoggerModel monitorLoggerModel, TransportContext transportContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8124a74", new Object[]{monitorLoggerModel, transportContext});
            return;
        }
        try {
            if (TransportStrategy.isVip() && a()) {
                MonitorInfoUtil.setUploadSizeOfFootprint(b());
            }
            b(monitorLoggerModel);
            String logBizType = getLogBizType(monitorLoggerModel.getSubType());
            monitorLoggerModel.setParam1(logBizType);
            a(monitorLoggerModel, transportContext);
            monitorLoggerModel.setBizType(logBizType);
            MonitorInfoUtil.record(monitorLoggerModel);
        } catch (Throwable th) {
            LogCatUtil.error("MonitorLoggerUtils", "uploadPerfLog exception", th);
        }
    }

    private static void a(MonitorLoggerModel monitorLoggerModel, TransportContext transportContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c48557cd", new Object[]{monitorLoggerModel, transportContext});
        } else if (transportContext == null) {
            a(monitorLoggerModel);
        } else {
            if (transportContext != null && !StringUtils.isEmpty(transportContext.loggerLevel)) {
                try {
                    monitorLoggerModel.setLoggerLevel(Integer.parseInt(transportContext.loggerLevel));
                    LogCatUtil.info("MonitorLoggerUtils", "[setLogLevel] loggerLevel = " + transportContext.loggerLevel);
                    return;
                } catch (Throwable unused) {
                    LogCatUtil.warn("MonitorLoggerUtils", "[uploadPerfLog] parse logger level fail. loggerLevel = " + transportContext.loggerLevel);
                }
            }
            a(monitorLoggerModel);
        }
    }

    private static void a(MonitorLoggerModel monitorLoggerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84505d7a", new Object[]{monitorLoggerModel});
            return;
        }
        String param2 = monitorLoggerModel.getParam2();
        if (StringUtils.equals(param2, "DEBUG")) {
            monitorLoggerModel.setLoggerLevel(3);
        } else if (StringUtils.equals(param2, "INFO")) {
            monitorLoggerModel.setLoggerLevel(2);
        } else if (!StringUtils.equals(param2, "FATAL")) {
        } else {
            monitorLoggerModel.setLoggerLevel(1);
        }
    }

    public static void uploadDiagLog(MonitorLoggerModel monitorLoggerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d4ab1b1", new Object[]{monitorLoggerModel});
            return;
        }
        try {
            monitorLoggerModel.getExtPramas().put("SUBTYPE", "DIAG");
            String logBizType = getLogBizType(monitorLoggerModel.getSubType());
            monitorLoggerModel.setParam1(logBizType);
            monitorLoggerModel.setBizType(logBizType);
            MonitorInfoUtil.record(monitorLoggerModel);
            MonitorInfoUtil.flushMonitorLog();
            MonitorInfoUtil.doUploadMonitorLog();
        } catch (Throwable th) {
            LogCatUtil.error("MonitorLoggerUtils", "uploadDiagLog exception", th);
        }
    }

    public static void uploadAutoDiagLog(MonitorLoggerModel monitorLoggerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b923782", new Object[]{monitorLoggerModel});
            return;
        }
        try {
            b(monitorLoggerModel);
            monitorLoggerModel.getExtPramas().put("SUBTYPE", "DIAG");
            if (!TransportStrategy.isVip() || !a()) {
                return;
            }
            MonitorInfoUtil.setUploadSizeOfFootprint(b());
            MonitorInfoUtil.footprint("network", monitorLoggerModel.getSubType(), monitorLoggerModel.getParam1(), monitorLoggerModel.getParam2(), monitorLoggerModel.getParam3(), monitorLoggerModel.getExtPramas());
        } catch (Throwable th) {
            LogCatUtil.error("MonitorLoggerUtils", "uploadAutoDiagLog exception", th);
        }
    }

    private static void b(MonitorLoggerModel monitorLoggerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c9b37b", new Object[]{monitorLoggerModel});
            return;
        }
        c(monitorLoggerModel);
        d(monitorLoggerModel);
        String str = monitorLoggerModel.getExtPramas().get(RPCDataItems.LOCAL_AMNET);
        if (str == null || !str.equals("T")) {
            return;
        }
        monitorLoggerModel.getExtPramas().put(LIB_VERSION, LIB_VERSION_LOCAL_AMNET);
    }

    private static void c(MonitorLoggerModel monitorLoggerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4543097c", new Object[]{monitorLoggerModel});
            return;
        }
        try {
            String str = monitorLoggerModel.getExtPramas().get(LIB_VERSION);
            if (TransportStrategy.isEnableBifrost()) {
                if (!StringUtils.isEmpty(str)) {
                    return;
                }
                monitorLoggerModel.getExtPramas().put(LIB_VERSION, LIB_VERSION_OLD);
            } else if (StringUtils.isEmpty(str) || !StringUtils.equals(str, LIB_VERSION_OLD)) {
            } else {
                monitorLoggerModel.getExtPramas().remove(LIB_VERSION);
            }
        } catch (Throwable th) {
            LogCatUtil.error("MonitorLoggerUtils", "setAmnetLibVersion exception", th);
        }
    }

    private static void d(MonitorLoggerModel monitorLoggerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25bc5f7d", new Object[]{monitorLoggerModel});
            return;
        }
        try {
            String str = monitorLoggerModel.getExtPramas().get(LIB_VERSION);
            if (StringUtils.isEmpty(str) || !TransportStrategy.isDisableBifrostRpcDowngrade()) {
                return;
            }
            if (StringUtils.equals(LIB_VERSION_OLD, str)) {
                monitorLoggerModel.getExtPramas().remove(LIB_VERSION);
                monitorLoggerModel.getExtPramas().put(LIB_VERSION, LIB_VERSION_OLD_BDRD);
            } else if (StringUtils.equals(LIB_VERSION_BIFROST, str)) {
                monitorLoggerModel.getExtPramas().remove(LIB_VERSION);
                monitorLoggerModel.getExtPramas().put(LIB_VERSION, LIB_VERSION_BIFROST_BDRD);
            } else if (!StringUtils.equals(LIB_VERSION_BIFROST_HTTP2, str)) {
            } else {
                monitorLoggerModel.getExtPramas().remove(LIB_VERSION);
                monitorLoggerModel.getExtPramas().put(LIB_VERSION, LIB_VERSION_BIFROST_HTTP2_BDRD);
            }
        } catch (Throwable th) {
            LogCatUtil.error("MonitorLoggerUtils", "updateAmnetLibVersion exception", th);
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : StringUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.UPLOAD_ATONCE), "T");
    }

    private static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.LOG_UPLOAD_SIZE, 10);
    }
}
