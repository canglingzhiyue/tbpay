package com.alipay.tianyan.mobilesdk;

import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.monitor.BatteryID;
import com.alipay.mobile.common.logging.api.monitor.BatteryModel;
import com.alipay.mobile.common.logging.api.monitor.DataflowID;
import com.alipay.mobile.common.logging.api.monitor.DataflowModel;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.tianyan.mobilesdk.TianyanLoggingDelegator;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class TianyanLoggingDispatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static TianyanLoggingDelegator.CommonSimpleDelegate f6186a = null;
    private static TianyanLoggingDelegator.ConfigServiceDelegate b = null;
    private static TianyanLoggingDelegator.MonitorContextDelegate c = null;
    public static boolean sIsFrameworkBackground = true;
    public static boolean sIsMonitorBackground = true;
    public static boolean sIsRelaxedBackground = true;
    public static boolean sIsStrictBackground = true;

    public static boolean putCommonSimpleDelegate(TianyanLoggingDelegator.CommonSimpleDelegate commonSimpleDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eca7376", new Object[]{commonSimpleDelegate})).booleanValue();
        }
        if (commonSimpleDelegate == null) {
            return false;
        }
        String name = commonSimpleDelegate.getClass().getName();
        String processAlias = LoggerFactory.getProcessInfo().getProcessAlias();
        if (f6186a == null) {
            f6186a = commonSimpleDelegate;
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.info("TianyanLoggingDispatcher", processAlias + " process, putCommonSimpleDelegate: " + name);
            return true;
        }
        TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
        traceLogger2.warn("TianyanLoggingDispatcher", processAlias + " process, putCommonSimpleDelegate, exist: " + name);
        return false;
    }

    public static boolean removeCommonSimpleDelegate(TianyanLoggingDelegator.CommonSimpleDelegate commonSimpleDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a0ef9e1", new Object[]{commonSimpleDelegate})).booleanValue();
        }
        if (commonSimpleDelegate != null && f6186a != null) {
            String name = commonSimpleDelegate.getClass().getName();
            String processAlias = LoggerFactory.getProcessInfo().getProcessAlias();
            if (f6186a == commonSimpleDelegate) {
                f6186a = null;
                TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                traceLogger.info("TianyanLoggingDispatcher", processAlias + " process, removeCommonSimpleDelegate: " + name);
                return true;
            }
            TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
            traceLogger2.warn("TianyanLoggingDispatcher", processAlias + " process, removeCommonSimpleDelegate, not yours: " + name);
        }
        return false;
    }

    public static boolean putConfigServiceDelegate(TianyanLoggingDelegator.ConfigServiceDelegate configServiceDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("175cffa0", new Object[]{configServiceDelegate})).booleanValue();
        }
        if (configServiceDelegate == null) {
            return false;
        }
        String name = configServiceDelegate.getClass().getName();
        String processAlias = LoggerFactory.getProcessInfo().getProcessAlias();
        if (b == null) {
            b = configServiceDelegate;
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.info("TianyanLoggingDispatcher", processAlias + " process, putConfigServiceDelegate: " + name);
            return true;
        }
        TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
        traceLogger2.warn("TianyanLoggingDispatcher", processAlias + " process, putConfigServiceDelegate, exist: " + name);
        return false;
    }

    public static boolean removeConfigServiceDelegate(TianyanLoggingDelegator.ConfigServiceDelegate configServiceDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b399974b", new Object[]{configServiceDelegate})).booleanValue();
        }
        if (configServiceDelegate != null && b != null) {
            String name = configServiceDelegate.getClass().getName();
            String processAlias = LoggerFactory.getProcessInfo().getProcessAlias();
            if (b == configServiceDelegate) {
                b = null;
                TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                traceLogger.info("TianyanLoggingDispatcher", processAlias + " process, removeConfigServiceDelegate: " + name);
                return true;
            }
            TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
            traceLogger2.warn("TianyanLoggingDispatcher", processAlias + " process, removeConfigServiceDelegate, not yours: " + name);
        }
        return false;
    }

    public static boolean putMonitorContextDelegate(TianyanLoggingDelegator.MonitorContextDelegate monitorContextDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("daccfd46", new Object[]{monitorContextDelegate})).booleanValue();
        }
        if (monitorContextDelegate == null) {
            return false;
        }
        String name = monitorContextDelegate.getClass().getName();
        String processAlias = LoggerFactory.getProcessInfo().getProcessAlias();
        if (c == null) {
            c = monitorContextDelegate;
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.info("TianyanLoggingDispatcher", processAlias + " process, putMonitorContextDelegate: " + name);
            return true;
        }
        TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
        traceLogger2.warn("TianyanLoggingDispatcher", processAlias + " process, putMonitorContextDelegate, exist: " + name);
        return false;
    }

    public static boolean removeMonitorContextDelegate(TianyanLoggingDelegator.MonitorContextDelegate monitorContextDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a425631", new Object[]{monitorContextDelegate})).booleanValue();
        }
        if (monitorContextDelegate != null && c != null) {
            String name = monitorContextDelegate.getClass().getName();
            String processAlias = LoggerFactory.getProcessInfo().getProcessAlias();
            if (c == monitorContextDelegate) {
                c = null;
                TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                traceLogger.info("TianyanLoggingDispatcher", processAlias + " process, removeMonitorContextDelegate: " + name);
                return true;
            }
            TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
            traceLogger2.warn("TianyanLoggingDispatcher", processAlias + " process, removeMonitorContextDelegate, not yours: " + name);
        }
        return false;
    }

    public static void acceptTimeTicksMadly() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ba0263", new Object[0]);
            return;
        }
        TianyanLoggingDelegator.CommonSimpleDelegate commonSimpleDelegate = f6186a;
        if (commonSimpleDelegate == null) {
            return;
        }
        try {
            commonSimpleDelegate.acceptTimeTicksMadly();
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("TianyanLoggingDispatcher", "acceptTimeTicksMadly", th);
        }
    }

    public static String getBundleByClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5c27546", new Object[]{str});
        }
        TianyanLoggingDelegator.CommonSimpleDelegate commonSimpleDelegate = f6186a;
        if (commonSimpleDelegate == null) {
            return null;
        }
        try {
            return commonSimpleDelegate.getBundleByClass(str);
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("TianyanLoggingDispatcher", "getBundleNameByClassName", th);
            return null;
        }
    }

    public static String getConfigValueByKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("133742d6", new Object[]{str, str2});
        }
        TianyanLoggingDelegator.ConfigServiceDelegate configServiceDelegate = b;
        if (configServiceDelegate == null) {
            return str2;
        }
        try {
            return configServiceDelegate.getConfigValueByKey(str, str2);
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("TianyanLoggingDispatcher", "getConfigValueByKey", th);
            return str2;
        }
    }

    public static void notePowerConsume(BatteryModel batteryModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6e24cd", new Object[]{batteryModel});
            return;
        }
        TianyanLoggingDelegator.MonitorContextDelegate monitorContextDelegate = c;
        if (monitorContextDelegate == null) {
            return;
        }
        try {
            monitorContextDelegate.notePowerConsume(batteryModel);
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("TianyanLoggingDispatcher", "notePowerConsume", th);
        }
    }

    public static boolean isPowerConsumeAccept(BatteryID batteryID, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("480ff68d", new Object[]{batteryID, str})).booleanValue();
        }
        TianyanLoggingDelegator.MonitorContextDelegate monitorContextDelegate = c;
        if (monitorContextDelegate == null) {
            return true;
        }
        try {
            return monitorContextDelegate.isPowerConsumeAccept(batteryID, str);
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("TianyanLoggingDispatcher", "isPowerConsumeAccept", th);
            return true;
        }
    }

    public static void noteTraficConsume(DataflowModel dataflowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c762511a", new Object[]{dataflowModel});
            return;
        }
        TianyanLoggingDelegator.MonitorContextDelegate monitorContextDelegate = c;
        if (monitorContextDelegate == null) {
            return;
        }
        try {
            monitorContextDelegate.noteTraficConsume(dataflowModel);
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("TianyanLoggingDispatcher", "noteTraficConsume", th);
        }
    }

    public static boolean isTraficConsumeAccept(DataflowID dataflowID, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60c5afd0", new Object[]{dataflowID, str})).booleanValue();
        }
        TianyanLoggingDelegator.MonitorContextDelegate monitorContextDelegate = c;
        if (monitorContextDelegate == null) {
            return true;
        }
        try {
            return monitorContextDelegate.isTraficConsumeAccept(dataflowID, str);
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("TianyanLoggingDispatcher", "isTraficConsumeAccept", th);
            return true;
        }
    }
}
