package com.alipay.mobile.common.logging.api;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.alipay.android.phone.wallet.spmtracker.ISpmMonitor;
import com.alipay.android.phone.wallet.spmtracker.NullSpmMonitor;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.abtest.AbtestInfoGetter;
import com.alipay.mobile.common.logging.api.antevent.AntEvent;
import com.alipay.mobile.common.logging.api.antevent.EventLogger;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.common.logging.api.behavor.BehavorLogListener;
import com.alipay.mobile.common.logging.api.behavor.BehavorLogger;
import com.alipay.mobile.common.logging.api.encrypt.LogEncryptClient;
import com.alipay.mobile.common.logging.api.interceptor.ToolsUploadInterceptor;
import com.alipay.mobile.common.logging.api.interceptor.TraceLoggerInterceptor;
import com.alipay.mobile.common.logging.api.monitor.BatteryModel;
import com.alipay.mobile.common.logging.api.monitor.DataflowModel;
import com.alipay.mobile.common.logging.api.monitor.ExceptionID;
import com.alipay.mobile.common.logging.api.monitor.MonitorLogger;
import com.alipay.mobile.common.logging.api.monitor.Performance;
import com.alipay.mobile.common.logging.api.monitor.PerformanceID;
import com.alipay.mobile.common.logging.api.network.NetworkInfoGetter;
import com.alipay.mobile.common.logging.api.rpc.RpcClient;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.common.logging.strategy.LogStrategyInfo;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class LoggerFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "LoggerFactory";

    /* renamed from: a  reason: collision with root package name */
    private static ProcessInfo f5413a = new NullProcessInfo();
    private static DeviceProperty b = new NullDeviceProperty();
    private static LogContext c = new NullLogContext();
    private static TraceLogger d = null;
    private static BehavorLogger e = null;
    private static MonitorLogger f = null;
    private static EventLogger g = new NullEventLogger();
    private static AtomicBoolean h = new AtomicBoolean(false);

    public static ProcessInfo getProcessInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProcessInfo) ipChange.ipc$dispatch("c220154d", new Object[0]) : f5413a;
    }

    public static void attachProcessInfo(ProcessInfo processInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("650c484", new Object[]{processInfo});
        } else if (processInfo == null) {
        } else {
            f5413a = processInfo;
        }
    }

    public static DeviceProperty getDeviceProperty() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DeviceProperty) ipChange.ipc$dispatch("5dcb2a7b", new Object[0]) : b;
    }

    public static void bindImpls(DeviceProperty deviceProperty) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef0b1546", new Object[]{deviceProperty});
        } else if (deviceProperty == null) {
        } else {
            b = deviceProperty;
        }
    }

    public static LogContext getLogContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LogContext) ipChange.ipc$dispatch("b5e192fb", new Object[0]) : c;
    }

    public static void attachLogContext(LogContext logContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8de248ac", new Object[]{logContext});
        } else if (logContext == null) {
        } else {
            c = logContext;
        }
    }

    public static synchronized BehavorLogger getBehavorLogger() {
        synchronized (LoggerFactory.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BehavorLogger) ipChange.ipc$dispatch("7780345f", new Object[0]);
            }
            if (h != null && h.get()) {
                return e;
            }
            return new NullBehavorLogger();
        }
    }

    public static synchronized void setBehavorLogger(BehavorLogger behavorLogger) {
        synchronized (LoggerFactory.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a117c279", new Object[]{behavorLogger});
            } else {
                e = behavorLogger;
            }
        }
    }

    public static synchronized TraceLogger getTraceLogger() {
        synchronized (LoggerFactory.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TraceLogger) ipChange.ipc$dispatch("bfd223a7", new Object[0]);
            }
            if (h != null && h.get()) {
                return d;
            }
            return new NullTraceLogger();
        }
    }

    public static synchronized void setTraceLogger(TraceLogger traceLogger) {
        synchronized (LoggerFactory.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0d2dc11", new Object[]{traceLogger});
            } else {
                d = traceLogger;
            }
        }
    }

    public static synchronized MonitorLogger getMonitorLogger() {
        synchronized (LoggerFactory.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MonitorLogger) ipChange.ipc$dispatch("afd1e2c8", new Object[0]);
            }
            if (h != null && h.get()) {
                return f;
            }
            return new NullMonitorLogger();
        }
    }

    public static synchronized void setMonitorLogger(MonitorLogger monitorLogger) {
        synchronized (LoggerFactory.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14c9c47c", new Object[]{monitorLogger});
            } else {
                f = monitorLogger;
            }
        }
    }

    public static EventLogger getEventLogger() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EventLogger) ipChange.ipc$dispatch("6c0ec46b", new Object[0]) : g;
    }

    public static void setEventLogger(EventLogger eventLogger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da36bf31", new Object[]{eventLogger});
        } else {
            g = eventLogger;
        }
    }

    public static synchronized void bind(TraceLogger traceLogger, BehavorLogger behavorLogger, MonitorLogger monitorLogger, EventLogger eventLogger) {
        synchronized (LoggerFactory.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe003d51", new Object[]{traceLogger, behavorLogger, monitorLogger, eventLogger});
                return;
            }
            if (h != null && !h.get()) {
                h.set(true);
                if (traceLogger != null) {
                    d = traceLogger;
                }
                if (behavorLogger != null) {
                    e = behavorLogger;
                }
                if (monitorLogger != null) {
                    f = monitorLogger;
                }
                if (eventLogger != null) {
                    g = eventLogger;
                }
                if (d != null) {
                    d.warn(TAG, "LoggerFactory.bind invoked");
                }
            }
        }
    }

    public static void init(Context context) {
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.alipay.mobile.common.logging.LoggerFactoryBinder").getDeclaredMethod(a.ATOM_EXT_bind, Context.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, context);
        } catch (Throwable unused) {
        }
    }

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public static class NullBehavorLogger implements BehavorLogger {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private NullBehavorLogger() {
        }

        @Override // com.alipay.mobile.common.logging.api.behavor.BehavorLogger
        public void click(Behavor behavor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ff3c0a6", new Object[]{this, behavor});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.behavor.BehavorLogger
        public void openPage(Behavor behavor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b10a3d7", new Object[]{this, behavor});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.behavor.BehavorLogger
        public void longClick(Behavor behavor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf8d928a", new Object[]{this, behavor});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.behavor.BehavorLogger
        public void submit(Behavor behavor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff80e736", new Object[]{this, behavor});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.behavor.BehavorLogger
        public void slide(Behavor behavor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1aad038f", new Object[]{this, behavor});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.behavor.BehavorLogger
        public void autoOpenPage(Behavor behavor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("725d5e6", new Object[]{this, behavor});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.behavor.BehavorLogger
        public void autoClick(Behavor behavor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0df60f7", new Object[]{this, behavor});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.behavor.BehavorLogger
        public void autoEvent(Behavor behavor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41263389", new Object[]{this, behavor});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.behavor.BehavorLogger
        public void event(String str, Behavor behavor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba98b42", new Object[]{this, str, behavor});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.behavor.BehavorLogger
        public void customContent(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a96989e3", new Object[]{this, str, str2});
            } else {
                LoggerFactory.access$700();
            }
        }
    }

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public static class NullMonitorLogger implements MonitorLogger {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
        public void dangerousUpload(String str, String str2, String str3, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50e2535", new Object[]{this, str, str2, str3, map});
            }
        }

        private NullMonitorLogger() {
        }

        @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
        public void exception(ExceptionID exceptionID, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72c2c632", new Object[]{this, exceptionID, th});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
        public void exception(Throwable th, String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75513bfc", new Object[]{this, th, str, map});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
        public void performance(PerformanceID performanceID, Performance performance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b41f86ca", new Object[]{this, performanceID, performance});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
        public void footprint(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3202200d", new Object[]{this, str, str2, str3, str4, str5, map});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
        public void crash(Throwable th, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4fee6611", new Object[]{this, th, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
        public void crash(ExceptionID exceptionID, Throwable th, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74f56b24", new Object[]{this, exceptionID, th, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
        public void apm(String str, String str2, Throwable th, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c6dbca9", new Object[]{this, str, str2, th, map});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
        public void dataflow(DataflowModel dataflowModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("23cd3205", new Object[]{this, dataflowModel});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
        public void battery(BatteryModel batteryModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4517c289", new Object[]{this, batteryModel});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
        public void mtBizReport(String str, String str2, String str3, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2ecf780", new Object[]{this, str, str2, str3, map});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
        public void keyBizTrace(String str, String str2, String str3, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0f6bd6f", new Object[]{this, str, str2, str3, map});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
        public void setUploadSize(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79a5b26e", new Object[]{this, str, new Integer(i)});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
        public void performance(PerformanceID performanceID, Performance performance, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("398ea77b", new Object[]{this, performanceID, performance, map});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
        public void performance(String str, Performance performance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73d38308", new Object[]{this, str, performance});
            } else {
                LoggerFactory.access$700();
            }
        }
    }

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public static class NullTraceLogger implements TraceLogger {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private NullTraceLogger() {
        }

        @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
        public void info(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f161e0c9", new Object[]{this, str, str2});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
        public void verbose(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("921d919d", new Object[]{this, str, str2});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
        public void debug(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9757c96e", new Object[]{this, str, str2});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
        public void warn(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c21b56a1", new Object[]{this, str, str2});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
        public void warn(String str, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1c403be", new Object[]{this, str, th});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
        public void warn(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c808bbf4", new Object[]{this, str, str2, th});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
        public void error(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
        public void error(String str, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b012e6fc", new Object[]{this, str, th});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
        public void error(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c88bb2", new Object[]{this, str, str2, th});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
        public void print(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f20a03c8", new Object[]{this, str, str2});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
        public void print(String str, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91cbf137", new Object[]{this, str, th});
            } else {
                LoggerFactory.access$700();
            }
        }
    }

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public static class NullLogContext implements LogContext {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private ISpmMonitor f5414a;

        private NullLogContext() {
            this.f5414a = new NullSpmMonitor();
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getStorageParam(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8dd55fe7", new Object[]{this, str});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void putContextParam(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57b6c1e8", new Object[]{this, str, str2});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void removeContextParam(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea6babd3", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getContextParam(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4723551b", new Object[]{this, str});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void putLocalParam(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81d8596c", new Object[]{this, str, str2});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void removeLocalParam(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67e56597", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getLocalParam(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("efc1ff57", new Object[]{this, str});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void backupCurrentFile(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bbb6f190", new Object[]{this, str, new Boolean(z)});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void flush(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d38bc6a9", new Object[]{this, new Boolean(z)});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void flush(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0b06adf", new Object[]{this, str, new Boolean(z)});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void flush(String str, boolean z, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a307795", new Object[]{this, str, new Boolean(z), bundle});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void uploadAfterSync(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56d5cfa7", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void uploadAfterSync(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d8afdb1", new Object[]{this, str, str2});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void uploadAfterSync(String str, String str2, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a1a7f83", new Object[]{this, str, str2, bundle});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void upload(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a7261d2", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void upload(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59857b1c", new Object[]{this, str, str2});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void upload(String str, String str2, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e317c38", new Object[]{this, str, str2, bundle});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void syncAppendLogEvent(LogEvent logEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82e41c46", new Object[]{this, logEvent});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void appendLogEvent(LogEvent logEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65ae8ba1", new Object[]{this, logEvent});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void updateLogStrategyCfg(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("158a9d47", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        @Deprecated
        public void takedownExceptionHandler() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80f28a4b", new Object[]{this});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setupExceptionHandler(UncaughtExceptionCallback uncaughtExceptionCallback, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0df5781", new Object[]{this, uncaughtExceptionCallback, new Integer(i)});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public Context getApplicationContext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("c5c75d34", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void notifyClientEvent(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0a498b3", new Object[]{this, str, obj});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public boolean isPositiveDiagnose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c00c4c2c", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public boolean isZipAndSevenZip() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("99ae733f", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public boolean isDisableToolsProcess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a402bd1d", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public boolean isEnableTrafficLimit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bbf086b6", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getChannelId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5ac47931", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getReleaseType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6eda812e", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getReleaseCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5542a05b", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getProductId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d388ffc5", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getProductVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("34f467a", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getUserId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getClientId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("67b6a8bd", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getDeviceId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getCurrentPageId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f4f31ec", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getLanguage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c65c8aeb", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getSessionId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f8ede3e", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getSourceId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("24d35a6d", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getHotpatchVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1b237b52", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getHotpatchDesc() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8d52c877", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getHotpatchBundleVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4bbfa034", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getBundleVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("af130cb9", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getBirdNestVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3d8848e8", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getPackageId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8455468e", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getApkUniqueId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4da53867", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setChannelId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("800868cd", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setReleaseType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("842cd370", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setReleaseCode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ac899e3", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setProductId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fd4b4b9", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setProductVersion(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7765aa3c", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setUserId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setClientId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19fbc959", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setDeviceId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("462fc2e4", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setLanguage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90122ceb", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void refreshSessionId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb5b8b3d", new Object[]{this});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setSourceId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("754da9", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setHotpatchVersion(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("373c3cc", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setHotpatchDesc(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ada4badf", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setHotpatchBundleVersion(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("828f942a", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setBundleVersion(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67ee6c45", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setBirdNestVersion(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2da8a8f6", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setPackageId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88914710", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setApkUniqueId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7eb90357", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setChannelIdNoCommit(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b563545", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setReleaseTypeNoCommit(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79034ce8", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setReleaseCodeNoCommit(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d36f05b", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setProductIdNoCommit(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eabdd531", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setProductVersionNoCommit(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8e97b4", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setUserIdNoCommit(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70e61a51", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setClientIdNoCommit(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d15649d1", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setDeviceIdNoCommit(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ba9885c", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setLanguageNoCommit(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d760fb63", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setHotpatchVersionNoCommit(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2f22144", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setHotpatchDescNoCommit(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45505557", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setHotpatchBundleVersionNoCommit(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25eb3a2", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setBundleVersionNoCommit(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d40bd", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setBirdNestVersionNoCommit(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ac3c6e", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setPackageIdNoCommit(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("420a2088", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void resetExtrasToSet() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebb7bc7c", new Object[]{this});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void commitExtrasToUpdate() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aff6e945", new Object[]{this});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public boolean traceNativeCrash(String str, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a6f86132", new Object[]{this, str, str2, new Boolean(z)})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getLogHost() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ef0ee9e3", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getMetDsLogHost() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5f9403e2", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getClientStatus(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("901bb2e6", new Object[]{this, new Boolean(z)});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getClientStatus(boolean z, boolean z2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("91cf34bc", new Object[]{this, new Boolean(z), new Boolean(z2), str});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void adjustRequestSpanByReceived() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13baa5e9", new Object[]{this});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void adjustRequestSpanByNetNotMatch() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f984c4d5", new Object[]{this});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void adjustRequestSpanByZipFail() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6ca92c5", new Object[]{this});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void adjustRequestSpanByUploadFail() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("316c9187", new Object[]{this});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void revertRequestSpanToNormal() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a333b55e", new Object[]{this});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public int getDevicePerformanceScore() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9ebf4728", new Object[]{this})).intValue();
            }
            LoggerFactory.access$700();
            return Integer.MAX_VALUE;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public LogContext.DevicePerformanceScore getDevicePerformanceScoreNew() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LogContext.DevicePerformanceScore) ipChange.ipc$dispatch("68ac510e", new Object[]{this});
            }
            LoggerFactory.access$700();
            return LogContext.DevicePerformanceScore.LOW;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void syncLogConfig(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58cb339c", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setUserSessionId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a01a2915", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public String getUserSessionId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("771475e9", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public boolean isLowEndDevice() {
            try {
                return ((Boolean) Class.forName("com.alipay.mobile.common.logging.util.LowEndDeviceUtil").getDeclaredMethod("isLowEndDevice", Context.class).invoke(null, null)).booleanValue();
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void putBizExternParams(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3606f05", new Object[]{this, str, str2});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public Map<String, String> getBizExternParams() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("77aa5f7f", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setLogAppenderistener(LogAppenderistener logAppenderistener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d82cf5b", new Object[]{this, logAppenderistener});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public LogAppenderistener getLogAppenderistener() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LogAppenderistener) ipChange.ipc$dispatch("ac52403b", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setLogHost(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9d1db5b", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setLogHostNoCommit(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("738339d3", new Object[]{this, str});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void resetLogHost() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac7b5cc4", new Object[]{this});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public Map<String, LogStrategyInfo> getLogStrategyInfos() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("1afbfde0", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setBehavorLogListener(BehavorLogListener behavorLogListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d15c44dd", new Object[]{this, behavorLogListener});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public BehavorLogListener getBehavorLogListener() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BehavorLogListener) ipChange.ipc$dispatch("e55c12c9", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setAbtestInfoGetter(AbtestInfoGetter abtestInfoGetter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fdd570f", new Object[]{this, abtestInfoGetter});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public AbtestInfoGetter getAbtestInfoGetter() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AbtestInfoGetter) ipChange.ipc$dispatch("ffff3fe7", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setLogUploadRpcClient(RpcClient rpcClient) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("155f5cf0", new Object[]{this, rpcClient});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public RpcClient getLogUploadRpcClient() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RpcClient) ipChange.ipc$dispatch("d8da3a2a", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setLogEncryptClient(LogEncryptClient logEncryptClient) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83733f43", new Object[]{this, logEncryptClient});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public LogEncryptClient getLogEncryptClient() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LogEncryptClient) ipChange.ipc$dispatch("7cc8a1f1", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void adjustUploadCoreByCategoryDirectly(String str, String str2, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc65e13f", new Object[]{this, str, str2, bundle});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setSpmMonitor(ISpmMonitor iSpmMonitor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3afd5678", new Object[]{this, iSpmMonitor});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public ISpmMonitor getSpmMonitor() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ISpmMonitor) ipChange.ipc$dispatch("7ddb5ed4", new Object[]{this}) : this.f5414a;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setLogCustomerControl(LogCustomerControl logCustomerControl) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7075ef0f", new Object[]{this, logCustomerControl});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public LogCustomerControl getLogCustomerControl() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LogCustomerControl) ipChange.ipc$dispatch("192197fb", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setMaxLogSize(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73c4cfd9", new Object[]{this, new Integer(i)});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setLogDAUTracker(LogDAUTracker logDAUTracker) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b66f2d27", new Object[]{this, logDAUTracker});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public LogDAUTracker getLogDAUTracker() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LogDAUTracker) ipChange.ipc$dispatch("3247f6bf", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setNetworkInfoGetter(NetworkInfoGetter networkInfoGetter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb609688", new Object[]{this, networkInfoGetter});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public NetworkInfoGetter getNetworkInfoGetter() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NetworkInfoGetter) ipChange.ipc$dispatch("c06ef83a", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setTraceLoggerInterceptor(TraceLoggerInterceptor traceLoggerInterceptor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb90f6bb", new Object[]{this, traceLoggerInterceptor});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public TraceLoggerInterceptor getTraceLoggerInterceptor() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TraceLoggerInterceptor) ipChange.ipc$dispatch("d5a9d831", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public void setToolsUploadInterceptor(ToolsUploadInterceptor toolsUploadInterceptor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80c03289", new Object[]{this, toolsUploadInterceptor});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.LogContext
        public ToolsUploadInterceptor getToolsUploadInterceptor() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ToolsUploadInterceptor) ipChange.ipc$dispatch("5eb255d1", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }
    }

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public static class NullProcessInfo implements ProcessInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private NullProcessInfo() {
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public String getPackageName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b4fb6b1e", new Object[]{this});
            }
            LoggerFactory.access$700();
            return "";
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public String getProcessAlias() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6d25dbc2", new Object[]{this});
            }
            LoggerFactory.access$700();
            return "";
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public String getMainProcessName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1f644bee", new Object[]{this});
            }
            LoggerFactory.access$700();
            return "";
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public String getPushProcessName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f540314f", new Object[]{this});
            }
            LoggerFactory.access$700();
            return "";
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public String getToolsProcessName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1620f5e4", new Object[]{this});
            }
            LoggerFactory.access$700();
            return "";
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public String getExtProcessName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d9a828aa", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public String getRegionHelperProcessName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5f8d27f7", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public String getProcessName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("62fd1115", new Object[]{this});
            }
            LoggerFactory.access$700();
            return "";
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public String getMainProcessTag() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("285e3cff", new Object[]{this});
            }
            LoggerFactory.access$700();
            return "";
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public String getPushProcessTag() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("dcafa77e", new Object[]{this});
            }
            LoggerFactory.access$700();
            return "";
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public String getToolsProcessTag() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7097c49", new Object[]{this});
            }
            LoggerFactory.access$700();
            return "";
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public String getExtProcessTag() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e40dd8c3", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public String getProcessTag() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4b94b6f8", new Object[]{this});
            }
            LoggerFactory.access$700();
            return "";
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public Set<Integer> getProcessIdsByName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("9d39ce61", new Object[]{this, str});
            }
            LoggerFactory.access$700();
            return new HashSet();
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public int getProcessIdByName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("61577bda", new Object[]{this, str})).intValue();
            }
            LoggerFactory.access$700();
            return -1;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public String getProcessNameById(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("123a169a", new Object[]{this, new Integer(i)});
            }
            LoggerFactory.access$700();
            return "";
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public int getMainProcessId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("78724d75", new Object[]{this})).intValue();
            }
            LoggerFactory.access$700();
            return -1;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public boolean isMainProcessExist() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("32b32a76", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public int getPushProcessId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4134a9b4", new Object[]{this})).intValue();
            }
            LoggerFactory.access$700();
            return -1;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public boolean isPushProcessExist() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c49ff1d7", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public int getToolsProcessId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b8e9ab3f", new Object[]{this})).intValue();
            }
            LoggerFactory.access$700();
            return -1;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public boolean isToolsProcessExist() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3f956344", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public int getExtProcessId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8a181239", new Object[]{this})).intValue();
            }
            LoggerFactory.access$700();
            return 0;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public boolean isExtProcessExist() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d3ca9d0a", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public int getRegionHelperProcessId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b1f3240c", new Object[]{this})).intValue();
            }
            LoggerFactory.access$700();
            return 0;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public boolean isRegionHelperProcessExist() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("26f0247f", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public int getProcessId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fa1a83ae", new Object[]{this})).intValue();
            }
            LoggerFactory.access$700();
            return -1;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public int getUserId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3b14d7b6", new Object[]{this})).intValue();
            }
            LoggerFactory.access$700();
            return -1;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public int getThreadId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2a77e935", new Object[]{this})).intValue();
            }
            LoggerFactory.access$700();
            return -1;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public boolean isMainProcess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("97b74977", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public boolean isPushProcess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6d91a976", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public boolean isToolsProcess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("48cc47e9", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public boolean isExtProcess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7c7f8a63", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public boolean isLiteProcess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("472ca362", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public boolean isSandboxProcess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a35d1cfd", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public boolean isIsolatedProcess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3de19317", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public boolean isRegionHelperProcess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57c66dce", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public boolean isSSSProcess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fca4f31", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public Map<String, String> getStartupReason() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("b45ea527", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public Bundle getStartupBundle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("d19a6274", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public Uri getStartupData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("6829d3cf", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public long getProcessStartTime() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("95784991", new Object[]{this})).longValue();
            }
            LoggerFactory.access$700();
            return -1L;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public boolean isStartupByAnyActivity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6e1cb11c", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.ProcessInfo
        public boolean isStartupByLauncherIcon() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3243420e", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }
    }

    public static /* synthetic */ void access$700() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f21a63e", new Object[0]);
        } else {
            new IllegalMonitorStateException("need invoke bind before use");
        }
    }

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public static class NullDeviceProperty implements DeviceProperty {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private NullDeviceProperty() {
        }

        @Override // com.alipay.mobile.common.logging.api.DeviceProperty
        public boolean isXiaomiDevice() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3ee0a846", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.DeviceProperty
        public boolean isVivoDevice() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56ff4177", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.DeviceProperty
        public boolean isOppoDevice() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("815a0b6b", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.DeviceProperty
        public boolean isHuaweiDevice() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9296ce72", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.DeviceProperty
        public boolean isLeEcoDevice() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ab536acf", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.DeviceProperty
        public boolean isQikuDevice() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("166466cd", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.DeviceProperty
        public boolean isZteDevice() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bb949a2", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.DeviceProperty
        public boolean isOnePlusDevice() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2de67517", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.DeviceProperty
        public boolean isNubiaDevice() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8b66af8a", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.DeviceProperty
        public boolean isCoolpadDevice() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e51ad421", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.DeviceProperty
        public boolean isLenovoDevice() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7f7ad6be", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.DeviceProperty
        public boolean isMeizuDevice() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bdedcb43", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.DeviceProperty
        public boolean isSamsungDevice() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("de5adf71", new Object[]{this})).booleanValue();
            }
            LoggerFactory.access$700();
            return false;
        }

        @Override // com.alipay.mobile.common.logging.api.DeviceProperty
        public String getDeviceAlias() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cbaf4115", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.DeviceProperty
        public String getRomVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4cc8fcdb", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.DeviceProperty
        public String getManufacturer() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("77efb12", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.DeviceProperty
        public String getBrandName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("25d0b47d", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.DeviceProperty
        public String getDisplayID() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ccfec2b2", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }

        @Override // com.alipay.mobile.common.logging.api.DeviceProperty
        public String getFingerPrint() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2255d42b", new Object[]{this});
            }
            LoggerFactory.access$700();
            return null;
        }
    }

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public static class NullEventLogger implements EventLogger {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private NullEventLogger() {
        }

        @Override // com.alipay.mobile.common.logging.api.antevent.EventLogger
        public void antEvent(AntEvent antEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95d627cd", new Object[]{this, antEvent});
            } else {
                LoggerFactory.access$700();
            }
        }

        @Override // com.alipay.mobile.common.logging.api.antevent.EventLogger
        public void antEvent(String str, AntEvent antEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2e9a117", new Object[]{this, str, antEvent});
            } else {
                LoggerFactory.access$700();
            }
        }
    }
}
