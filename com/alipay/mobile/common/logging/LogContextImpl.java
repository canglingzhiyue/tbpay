package com.alipay.mobile.common.logging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.android.phone.wallet.spmtracker.ISpmMonitor;
import com.alipay.mobile.common.logging.api.LogAppenderistener;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LogCustomerControl;
import com.alipay.mobile.common.logging.api.LogDAUTracker;
import com.alipay.mobile.common.logging.api.LogEvent;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.ProcessInfo;
import com.alipay.mobile.common.logging.api.UncaughtExceptionCallback;
import com.alipay.mobile.common.logging.api.abtest.AbtestInfoGetter;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.common.logging.api.behavor.BehavorLogListener;
import com.alipay.mobile.common.logging.api.encrypt.LogEncryptClient;
import com.alipay.mobile.common.logging.api.interceptor.ToolsUploadInterceptor;
import com.alipay.mobile.common.logging.api.interceptor.TraceLoggerInterceptor;
import com.alipay.mobile.common.logging.api.monitor.ExceptionID;
import com.alipay.mobile.common.logging.api.monitor.Performance;
import com.alipay.mobile.common.logging.api.monitor.PerformanceID;
import com.alipay.mobile.common.logging.api.network.NetworkInfoGetter;
import com.alipay.mobile.common.logging.api.rpc.RpcClient;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.common.logging.appender.AppenderManager;
import com.alipay.mobile.common.logging.event.ClientEvent;
import com.alipay.mobile.common.logging.event.ClientEventHelper;
import com.alipay.mobile.common.logging.event.ClientEventManager;
import com.alipay.mobile.common.logging.helper.DevicePerformanceScoreHelper;
import com.alipay.mobile.common.logging.helper.YearClass;
import com.alipay.mobile.common.logging.http.HttpClient;
import com.alipay.mobile.common.logging.impl.TraceLogEvent;
import com.alipay.mobile.common.logging.strategy.LogStrategyInfo;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.alipay.mobile.common.logging.util.LoggingAsyncTaskExecutor;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.common.logging.util.LowEndDeviceUtil;
import com.alipay.mobile.common.logging.util.ToolThreadUtils;
import com.alipay.mobile.common.logging.util.network.NetWorkProvider;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.tianyan.mobilesdk.TianyanLoggingStatus;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.performance.config.PerfConst;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class LogContextImpl implements LogContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LogDAUTracker A;
    private TraceLoggerInterceptor C;
    private ToolsUploadInterceptor D;

    /* renamed from: a  reason: collision with root package name */
    public AppenderManager f5404a;
    private Context e;
    private String f;
    private final Queue<LogEvent> o;
    private ContextInfo p;
    private volatile AppendWorker q;
    private MdapLogUploadManager r;
    private AbtestInfoGetter s;
    private ClientEventManager t;
    private final boolean u;
    private BehavorLogListener v;
    private ISpmMonitor w;
    private LogAppenderistener c = null;
    private LogCustomerControl d = null;
    private String g = null;
    private String h = null;
    private String i = null;
    private String j = null;
    private ThreadLocal<Integer> k = new ThreadLocal<>();
    private Map<String, String> l = new ConcurrentHashMap();
    private Map<String, String> m = new ConcurrentHashMap();
    private InheritableThreadLocal<Map<String, String>> n = new InheritableThreadLocal<>();
    public boolean b = true;
    private LogEncryptClient x = null;
    private RpcClient y = null;
    private String z = null;
    private NetworkInfoGetter B = null;

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public class AppendWorker extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AppendWorker() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int priority = Looper.getMainLooper().getThread().getPriority() - 2;
            if (priority < 5) {
                priority = 5;
            }
            setPriority(priority);
            while (LogContextImpl.this.b) {
                try {
                    LogContextImpl.this.a(LogContextImpl.a(LogContextImpl.this));
                } catch (Throwable th) {
                    try {
                        new StringBuilder("AppendWorker take: ").append(th);
                        try {
                            LogContextImpl.this.a((AppendWorker) null);
                            for (LogEvent logEvent : LogContextImpl.a(LogContextImpl.this)) {
                                LogContextImpl.this.syncAppendLogEvent(logEvent);
                                LogContextImpl.a(LogContextImpl.this).remove(logEvent);
                            }
                            LogContextImpl.this.a((Queue<LogEvent>) null);
                            return;
                        } catch (Throwable th2) {
                            new StringBuilder("AppendWorker finally: ").append(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        try {
                            LogContextImpl.this.a((AppendWorker) null);
                            for (LogEvent logEvent2 : LogContextImpl.a(LogContextImpl.this)) {
                                LogContextImpl.this.syncAppendLogEvent(logEvent2);
                                LogContextImpl.a(LogContextImpl.this).remove(logEvent2);
                            }
                            LogContextImpl.this.a((Queue<LogEvent>) null);
                        } catch (Throwable th4) {
                            new StringBuilder("AppendWorker finally: ").append(th4);
                        }
                        throw th3;
                    }
                }
            }
            try {
                LogContextImpl.this.a((AppendWorker) null);
                for (LogEvent logEvent3 : LogContextImpl.a(LogContextImpl.this)) {
                    LogContextImpl.this.syncAppendLogEvent(logEvent3);
                    LogContextImpl.a(LogContextImpl.this).remove(logEvent3);
                }
                LogContextImpl.this.a((Queue<LogEvent>) null);
            } catch (Throwable th5) {
                new StringBuilder("AppendWorker finally: ").append(th5);
            }
        }
    }

    public static /* synthetic */ Queue a(LogContextImpl logContextImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Queue) ipChange.ipc$dispatch("621308f0", new Object[]{logContextImpl}) : logContextImpl.o;
    }

    public static /* synthetic */ void a(LogContextImpl logContextImpl, String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e39d63f0", new Object[]{logContextImpl, str, str2, bundle});
        } else {
            logContextImpl.b(str, str2, bundle);
        }
    }

    public final void a(Queue<LogEvent> queue) {
        LogEvent logEvent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("840e3e08", new Object[]{this, queue});
        } else if (queue == null) {
        } else {
            if (this.u) {
                logEvent = queue.poll();
                if (logEvent == null) {
                    SystemClock.sleep(100L);
                    this.b = true;
                    return;
                }
            } else {
                logEvent = (LogEvent) ((BlockingQueue) queue).take();
            }
            syncAppendLogEvent(logEvent);
            this.b = true;
        }
    }

    public LogContextImpl(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(LogEvent.class.getName());
        sb.append(Behavor.class.getName());
        sb.append(Behavor.Builder.class.getName());
        sb.append(PerformanceID.class.getName());
        sb.append(Performance.class.getName());
        sb.append(Performance.Builder.class.getName());
        sb.append(ExceptionID.class.getName());
        sb.append(LogCategory.class.getName());
        sb.append(LogEvent.Level.class.getName());
        sb.append(HttpClient.class.getName());
        sb.append(TraceLogEvent.class.getName());
        sb.append(EventCategory.class.getName());
        sb.append(UncaughtExceptionCallback.class.getName());
        this.e = context;
        this.p = new ContextInfo(context);
        String str = this.p.n;
        if (!TextUtils.isEmpty(str)) {
            putBizExternParams(LoggingSPCache.STORAGE_HOTPATCHDESC, str);
        }
        String str2 = this.p.o;
        if (!TextUtils.isEmpty(str2)) {
            putBizExternParams(LoggingSPCache.STORAGE_HOTPATCHBUNDLEVERSION, str2);
        }
        LogStrategyManager.createInstance(context, this.p);
        NetWorkProvider.createInstance(context);
        ClientEventHelper.a();
        this.f5404a = new AppenderManager(this);
        this.r = MdapLogUploadManager.a(context);
        this.t = ClientEventManager.a();
        this.u = false;
        if (this.u) {
            this.o = new ConcurrentLinkedQueue();
        } else {
            this.o = new ArrayBlockingQueue(2048);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getStorageParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8dd55fe7", new Object[]{this, str});
        }
        String localParam = getLocalParam(str);
        return localParam == null ? getContextParam(str) : localParam;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void putContextParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b6c1e8", new Object[]{this, str, str2});
        } else if (str == null || str2 == null) {
        } else {
            this.l.put(str, str2);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getContextParam(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4723551b", new Object[]{this, str}) : this.l.get(str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void removeContextParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6babd3", new Object[]{this, str});
        } else if (str == null) {
        } else {
            this.l.remove(str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public Context getApplicationContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c5c75d34", new Object[]{this}) : this.e;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void putLocalParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81d8596c", new Object[]{this, str, str2});
        } else if (str == null || str2 == null) {
        } else {
            Map<String, String> map = this.n.get();
            if (a(a()) || map == null) {
                a(map).put(str, str2);
            } else {
                map.put(str, str2);
            }
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void removeLocalParam(String str) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e56597", new Object[]{this, str});
        } else if (str == null || (map = this.n.get()) == null) {
        } else {
            if (a(a())) {
                a(map).remove(str);
            } else {
                map.remove(str);
            }
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void backupCurrentFile(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb6f190", new Object[]{this, str, new Boolean(z)});
        } else {
            this.f5404a.a(str, z);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void flush(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d38bc6a9", new Object[]{this, new Boolean(z)});
        } else {
            flush(null, z);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void flush(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b06adf", new Object[]{this, str, new Boolean(z)});
        } else {
            flush(str, z, null);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void flush(String str, boolean z, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a307795", new Object[]{this, str, new Boolean(z), bundle});
            return;
        }
        LogEvent logEvent = new LogEvent(PerfConst.RUN_TYPE_FLUSH, null, LogEvent.Level.ERROR, str);
        logEvent.setBundle(bundle);
        if (z) {
            syncAppendLogEvent(logEvent);
        } else {
            appendLogEvent(logEvent);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void uploadAfterSync(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d5cfa7", new Object[]{this, str});
        } else {
            appendLogEvent(new LogEvent("uploadByType", null, LogEvent.Level.ERROR, str));
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void uploadAfterSync(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d8afdb1", new Object[]{this, str, str2});
            return;
        }
        LogEvent logEvent = new LogEvent("uploadByType", null, LogEvent.Level.ERROR, str);
        logEvent.setUploadUrl(str2);
        appendLogEvent(logEvent);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void uploadAfterSync(String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1a7f83", new Object[]{this, str, str2, bundle});
            return;
        }
        LogEvent logEvent = new LogEvent("uploadByType", null, LogEvent.Level.ERROR, str);
        logEvent.setUploadUrl(str2);
        logEvent.setBundle(bundle);
        appendLogEvent(logEvent);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void upload(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a7261d2", new Object[]{this, str});
        } else {
            upload(str, null);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void upload(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59857b1c", new Object[]{this, str, str2});
        } else {
            upload(str, str2, null);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void upload(String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e317c38", new Object[]{this, str, str2, bundle});
            return;
        }
        if (LoggerFactory.getProcessInfo().isMainProcess() || LoggerFactory.getProcessInfo().isExtProcess() || LoggerFactory.getProcessInfo().isLiteProcess()) {
            Intent intent = new Intent();
            if (LogStrategyManager.getInstance().isRealTimeLogCategory(str)) {
                intent.setClassName(this.e, LogContext.MAIN_SERVICE_CLASS_NAME);
            } else if (LogStrategyManager.getInstance().isDisableToolsProcess()) {
                intent.setClassName(this.e, LogContext.PUSH_LOG_SERVICE_CLASS_NAME);
            } else {
                MdapLogUploadManager.a();
                if (!MdapLogUploadManager.a(str) && c()) {
                    intent.setClassName(this.e, LogContext.PUSH_LOG_SERVICE_CLASS_NAME);
                } else {
                    intent.setClassName(this.e, LogContext.TOOLS_SERVICE_CLASS_NAME);
                    if (!z && !"crash".equals(str) && !b()) {
                        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                        traceLogger.info("LogContext", str + " do not upload by tools, hold on...");
                    } else {
                        a(intent, str, str2, bundle);
                    }
                }
            }
            z = false;
            if (!z) {
            }
            a(intent, str, str2, bundle);
        } else if (LoggerFactory.getProcessInfo().isPushProcess()) {
            if (LogStrategyManager.getInstance().isRealTimeLogCategory(str)) {
                Intent intent2 = new Intent();
                intent2.setClassName(this.e, LogContext.MAIN_SERVICE_CLASS_NAME);
                a(intent2, str, str2, bundle);
            } else if (LogStrategyManager.getInstance().isDisableToolsProcess()) {
                adjustUploadCoreByCategoryDirectly(str, str2, bundle);
            } else {
                MdapLogUploadManager.a();
                if (!MdapLogUploadManager.a(str) && c()) {
                    adjustUploadCoreByCategoryDirectly(str, str2, bundle);
                } else if (!"crash".equals(str) && !b()) {
                    TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
                    traceLogger2.info("LogContext", str + " do not upload by tools, hold on...");
                } else {
                    Intent intent3 = new Intent();
                    intent3.setClassName(this.e, LogContext.TOOLS_SERVICE_CLASS_NAME);
                    a(intent3, str, str2, bundle);
                }
            }
        } else if (LoggerFactory.getProcessInfo().isToolsProcess()) {
            adjustUploadCoreByCategoryDirectly(str, str2, bundle);
        } else {
            TraceLogger traceLogger3 = LoggerFactory.getTraceLogger();
            traceLogger3.error("LogContext", "upload, error: unknown process " + LoggerFactory.getProcessInfo().getProcessAlias());
            adjustUploadCoreByCategoryDirectly(str, str2, bundle);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ClientEventHelper.a().d < LogStrategyManager.MINIMUM_REQUEST_TIME_SPAN) {
            return;
        }
        ClientEventHelper.a().d = currentTimeMillis;
        LogStrategyManager.getInstance().queryStrategy(LogStrategyManager.ACTION_TYPE_MDAPUPLOAD, false);
    }

    private void a(Intent intent, String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ca0d7b", new Object[]{this, intent, str, str2, bundle});
            return;
        }
        try {
            intent.setPackage(this.e.getPackageName());
        } catch (Throwable unused) {
        }
        intent.setAction(this.e.getPackageName() + LogContext.ACTION_UPLOAD_MDAPLOG);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("logCategory", str);
        intent.putExtra("uploadUrl", str2);
        intent.putExtra("isMonitorBackground", TianyanLoggingStatus.isMonitorBackground());
        intent.putExtra("isStrictBackground", TianyanLoggingStatus.isStrictBackground());
        intent.putExtra("isRelaxedBackground", TianyanLoggingStatus.isRelaxedBackground());
        intent.putExtra("invokerProcessAlias", LoggerFactory.getProcessInfo().getProcessAlias());
        try {
            if (this.e.startService(intent) != null) {
                z = true;
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("LogContext", "uploadCoreByStartService", th);
        }
        boolean isDisableToolsProcess = LogStrategyManager.getInstance().isDisableToolsProcess();
        LoggerFactory.getTraceLogger().info("LogContext", "uploadCoreByStartService: start upload service, logCategory: " + str + ", success: " + z + ", process: " + LoggerFactory.getProcessInfo().getProcessAlias() + ", disableTools: " + isDisableToolsProcess);
        if (z) {
            return;
        }
        a(str, str2, bundle);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void adjustUploadCoreByCategoryDirectly(String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc65e13f", new Object[]{this, str, str2, bundle});
        } else if ("main".equalsIgnoreCase(Thread.currentThread().getName())) {
            a(str, str2, bundle);
        } else {
            b(str, str2, bundle);
        }
    }

    private void a(final String str, final String str2, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b028dd8", new Object[]{this, str, str2, bundle});
        } else {
            LoggingAsyncTaskExecutor.executeHttpUpload(new Runnable() { // from class: com.alipay.mobile.common.logging.LogContextImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ToolThreadUtils.getInstance(LoggerFactory.getLogContext().getApplicationContext()).start(true);
                    LogContextImpl.a(LogContextImpl.this, str, str2, bundle);
                    ToolThreadUtils.getInstance(LoggerFactory.getLogContext().getApplicationContext()).end();
                }
            });
        }
    }

    private void b(String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91065937", new Object[]{this, str, str2, bundle});
            return;
        }
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        traceLogger.info("LogContext", LoggerFactory.getProcessInfo().getProcessAlias() + " syncUploadCoreByCategoryDirectly: " + str);
        if ((!LoggerFactory.getProcessInfo().isMainProcess() && str == null) || (bundle != null && bundle.getBoolean(LogContext.SYNC_ALL_LOG))) {
            try {
                LoggerFactory.getTraceLogger().info("LogContext", "sync all log to upload dir...");
                this.r.b();
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().error("LogContext", "syncUploadCoreByCategoryDirectly, syncLog: ".concat(String.valueOf(th)));
            }
        }
        try {
            this.r.a(str, str2, bundle);
        } catch (Throwable th2) {
            LoggerFactory.getTraceLogger().error("LogContext", "syncUploadCoreByCategoryDirectly, uploadLog: ".concat(String.valueOf(th2)), th2);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void updateLogStrategyCfg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158a9d47", new Object[]{this, str});
        } else {
            LogStrategyManager.getInstance().updateLogStrategy(str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public boolean isPositiveDiagnose() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c00c4c2c", new Object[]{this})).booleanValue() : LogStrategyManager.getInstance().isPositiveDiagnose();
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public boolean isZipAndSevenZip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("99ae733f", new Object[]{this})).booleanValue() : LogStrategyManager.getInstance().isZipAndSevenZip();
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public boolean isDisableToolsProcess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a402bd1d", new Object[]{this})).booleanValue() : LogStrategyManager.getInstance().isDisableToolsProcess();
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public boolean isEnableTrafficLimit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bbf086b6", new Object[]{this})).booleanValue() : LogStrategyManager.getInstance().isEnableTrafficLimit();
    }

    private Map<String, String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map});
        }
        Map<String, String> synchronizedMap = Collections.synchronizedMap(new HashMap());
        if (map != null) {
            synchronized (map) {
                synchronizedMap.putAll(map);
            }
        }
        this.n.set(synchronizedMap);
        return synchronizedMap;
    }

    private Integer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("5e2c18f", new Object[]{this});
        }
        Integer num = this.k.get();
        this.k.set(1);
        return num;
    }

    private static boolean a(Integer num) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6cdec513", new Object[]{num})).booleanValue() : num == null || num.intValue() == 2;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void syncAppendLogEvent(LogEvent logEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82e41c46", new Object[]{this, logEvent});
        } else {
            this.f5404a.a(logEvent);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void appendLogEvent(LogEvent logEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ae8ba1", new Object[]{this, logEvent});
        } else if (logEvent == null || logEvent.isIllegal()) {
        } else {
            if (this.q == null) {
                synchronized (this) {
                    if (this.q == null) {
                        AppendWorker appendWorker = new AppendWorker();
                        appendWorker.setDaemon(true);
                        appendWorker.setName("LogAppendWorker");
                        appendWorker.start();
                        a(appendWorker);
                    }
                }
            }
            try {
                if (this.o.add(logEvent)) {
                    return;
                }
                throw new RuntimeException("add log event to queue fail, current size: " + this.o.size());
            } catch (Throwable unused) {
            }
        }
    }

    public final synchronized void a(AppendWorker appendWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7e71e44", new Object[]{this, appendWorker});
        } else {
            this.q = appendWorker;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getChannelId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ac47931", new Object[]{this}) : this.p.b;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getReleaseType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6eda812e", new Object[]{this}) : this.p.c;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getReleaseCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5542a05b", new Object[]{this}) : this.p.d;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getProductId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d388ffc5", new Object[]{this}) : this.p.e;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getProductVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34f467a", new Object[]{this}) : this.p.f;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this}) : this.p.a();
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getClientId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b6a8bd", new Object[]{this});
        }
        ContextInfo contextInfo = this.p;
        if (LoggerFactory.getProcessInfo().isExtProcess() && contextInfo.h == null) {
            contextInfo.h = contextInfo.b(LoggingSPCache.STORAGE_CLIENTID, "");
        }
        return contextInfo.h;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this}) : this.p.b();
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getCurrentPageId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f4f31ec", new Object[]{this}) : this.p.j;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getLanguage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c65c8aeb", new Object[]{this}) : this.p.k;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getSessionId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f8ede3e", new Object[]{this}) : this.p.c();
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getSourceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("24d35a6d", new Object[]{this}) : this.p.l;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getHotpatchVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1b237b52", new Object[]{this}) : this.p.m;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getHotpatchDesc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8d52c877", new Object[]{this}) : this.p.n;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getHotpatchBundleVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4bbfa034", new Object[]{this}) : this.p.o;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getBundleVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("af130cb9", new Object[]{this}) : this.p.r;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getBirdNestVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3d8848e8", new Object[]{this}) : this.p.s;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getPackageId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8455468e", new Object[]{this}) : this.p.p;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getApkUniqueId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4da53867", new Object[]{this}) : this.p.q;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getUserSessionId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("771475e9", new Object[]{this}) : this.p.t;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setChannelId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800868cd", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.b = str;
        LoggingSPCache.getInstance().putStringApply("channelId", str);
        contextInfo.a((Bundle) null, "channelId", str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setReleaseType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("842cd370", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.c = str;
        LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_RELEASETYPE, str);
        contextInfo.a((Bundle) null, LoggingSPCache.STORAGE_RELEASETYPE, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setReleaseCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac899e3", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.d = str;
        LoggingSPCache loggingSPCache = LoggingSPCache.getInstance();
        loggingSPCache.putStringApply(LoggingSPCache.STORAGE_RELEASECODE + contextInfo.f, str);
        contextInfo.a((Bundle) null, LoggingSPCache.STORAGE_RELEASECODE, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setProductId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fd4b4b9", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.e = str;
        LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_PRODUCTID, str);
        contextInfo.a((Bundle) null, LoggingSPCache.STORAGE_PRODUCTID, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setProductVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7765aa3c", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.f = str;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.g = str;
        LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_USERID, str);
        contextInfo.a((Bundle) null, LoggingSPCache.STORAGE_USERID, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setClientId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19fbc959", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.h = str;
        LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_CLIENTID, str);
        contextInfo.a((Bundle) null, LoggingSPCache.STORAGE_CLIENTID, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setDeviceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462fc2e4", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.i = str;
        LoggingSPCache.getInstance().putStringApply("utdid", str);
        contextInfo.a((Bundle) null, "utdid", str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setLanguage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90122ceb", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.k = str;
        LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_LANGUAGE, str);
        contextInfo.a((Bundle) null, LoggingSPCache.STORAGE_LANGUAGE, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void refreshSessionId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb5b8b3d", new Object[]{this});
        } else {
            this.p.d();
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setSourceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("754da9", new Object[]{this, str});
        } else {
            this.p.l = str;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setHotpatchVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("373c3cc", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.m = str;
        LoggingSPCache loggingSPCache = LoggingSPCache.getInstance();
        loggingSPCache.putStringApply(LoggingSPCache.STORAGE_HOTPATCHVERSION + contextInfo.f, str);
        contextInfo.a((Bundle) null, LoggingSPCache.STORAGE_HOTPATCHVERSION, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setHotpatchDesc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ada4badf", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.n = str;
        LoggingSPCache loggingSPCache = LoggingSPCache.getInstance();
        loggingSPCache.putStringApply(LoggingSPCache.STORAGE_HOTPATCHDESC + contextInfo.f, str);
        LoggerFactory.getLogContext().putBizExternParams(LoggingSPCache.STORAGE_HOTPATCHDESC, str);
        contextInfo.a((Bundle) null, LoggingSPCache.STORAGE_HOTPATCHDESC, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setHotpatchBundleVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("828f942a", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.o = str;
        LoggingSPCache loggingSPCache = LoggingSPCache.getInstance();
        loggingSPCache.putStringApply(LoggingSPCache.STORAGE_HOTPATCHBUNDLEVERSION + contextInfo.f, str);
        LoggerFactory.getLogContext().putBizExternParams(LoggingSPCache.STORAGE_HOTPATCHBUNDLEVERSION, str);
        contextInfo.a((Bundle) null, LoggingSPCache.STORAGE_HOTPATCHBUNDLEVERSION, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setBundleVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67ee6c45", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.r = str;
        LoggingSPCache loggingSPCache = LoggingSPCache.getInstance();
        loggingSPCache.putStringApply(LoggingSPCache.STORAGE_BUNDLEVERSION + contextInfo.f, str);
        contextInfo.a((Bundle) null, LoggingSPCache.STORAGE_BUNDLEVERSION, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setBirdNestVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da8a8f6", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.s = str;
        LoggingSPCache loggingSPCache = LoggingSPCache.getInstance();
        loggingSPCache.putStringApply(LoggingSPCache.STORAGE_BIRDNESTVERSION + contextInfo.f, str);
        contextInfo.a((Bundle) null, LoggingSPCache.STORAGE_BIRDNESTVERSION, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setPackageId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88914710", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.p = str;
        LoggingSPCache loggingSPCache = LoggingSPCache.getInstance();
        loggingSPCache.putStringApply(LoggingSPCache.STORAGE_PACKAGEID + contextInfo.f, str);
        contextInfo.f();
        contextInfo.a((Bundle) null, LoggingSPCache.STORAGE_PACKAGEID, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setApkUniqueId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb90357", new Object[]{this, str});
        } else {
            this.p.q = str;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    @Deprecated
    public void setLogHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9d1db5b", new Object[]{this, str});
            return;
        }
        this.f = str;
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.u = str;
        LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_LOGHOST, str);
        contextInfo.a((Bundle) null, LoggingSPCache.STORAGE_LOGHOST, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setLogHostNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738339d3", new Object[]{this, str});
            return;
        }
        this.f = str;
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.u = str;
        LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_LOGHOST, str);
        contextInfo.a(LoggingSPCache.STORAGE_LOGHOST, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void resetLogHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac7b5cc4", new Object[]{this});
        } else {
            this.f = null;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setChannelIdNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b563545", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.b = str;
        LoggingSPCache.getInstance().putStringApply("channelId", str);
        contextInfo.a("channelId", str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setReleaseTypeNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79034ce8", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.c = str;
        LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_RELEASETYPE, str);
        contextInfo.a(LoggingSPCache.STORAGE_RELEASETYPE, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setReleaseCodeNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d36f05b", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.d = str;
        LoggingSPCache loggingSPCache = LoggingSPCache.getInstance();
        loggingSPCache.putStringApply(LoggingSPCache.STORAGE_RELEASECODE + contextInfo.f, str);
        contextInfo.a(LoggingSPCache.STORAGE_RELEASECODE, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setProductIdNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eabdd531", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.e = str;
        LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_PRODUCTID, str);
        contextInfo.a(LoggingSPCache.STORAGE_PRODUCTID, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setProductVersionNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e97b4", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.f = str;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setUserIdNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e61a51", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.g = str;
        LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_USERID, str);
        contextInfo.a(LoggingSPCache.STORAGE_USERID, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setClientIdNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d15649d1", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.h = str;
        LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_CLIENTID, str);
        contextInfo.a(LoggingSPCache.STORAGE_CLIENTID, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setDeviceIdNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba9885c", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.i = str;
        LoggingSPCache.getInstance().putStringApply("utdid", str);
        contextInfo.a("utdid", str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setLanguageNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d760fb63", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.k = str;
        LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_LANGUAGE, str);
        contextInfo.a(LoggingSPCache.STORAGE_LANGUAGE, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setHotpatchVersionNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2f22144", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.m = str;
        LoggingSPCache loggingSPCache = LoggingSPCache.getInstance();
        loggingSPCache.putStringApply(LoggingSPCache.STORAGE_HOTPATCHVERSION + contextInfo.f, str);
        contextInfo.a(LoggingSPCache.STORAGE_HOTPATCHVERSION, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setHotpatchDescNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45505557", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.n = str;
        LoggingSPCache loggingSPCache = LoggingSPCache.getInstance();
        loggingSPCache.putStringApply(LoggingSPCache.STORAGE_HOTPATCHDESC + contextInfo.f, str);
        LoggerFactory.getLogContext().putBizExternParams(LoggingSPCache.STORAGE_HOTPATCHDESC, str);
        contextInfo.a(LoggingSPCache.STORAGE_HOTPATCHDESC, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setHotpatchBundleVersionNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25eb3a2", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.o = str;
        LoggingSPCache loggingSPCache = LoggingSPCache.getInstance();
        loggingSPCache.putStringApply(LoggingSPCache.STORAGE_HOTPATCHBUNDLEVERSION + contextInfo.f, str);
        LoggerFactory.getLogContext().putBizExternParams(LoggingSPCache.STORAGE_HOTPATCHBUNDLEVERSION, str);
        contextInfo.a(LoggingSPCache.STORAGE_HOTPATCHBUNDLEVERSION, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setBundleVersionNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d40bd", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.r = str;
        LoggingSPCache loggingSPCache = LoggingSPCache.getInstance();
        loggingSPCache.putStringApply(LoggingSPCache.STORAGE_BUNDLEVERSION + contextInfo.f, str);
        contextInfo.a(LoggingSPCache.STORAGE_BUNDLEVERSION, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setBirdNestVersionNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ac3c6e", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.s = str;
        LoggingSPCache loggingSPCache = LoggingSPCache.getInstance();
        loggingSPCache.putStringApply(LoggingSPCache.STORAGE_BIRDNESTVERSION + contextInfo.f, str);
        contextInfo.a(LoggingSPCache.STORAGE_BIRDNESTVERSION, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setPackageIdNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("420a2088", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.p = str;
        LoggingSPCache loggingSPCache = LoggingSPCache.getInstance();
        loggingSPCache.putStringApply(LoggingSPCache.STORAGE_PACKAGEID + contextInfo.f, str);
        contextInfo.f();
        contextInfo.a(LoggingSPCache.STORAGE_PACKAGEID, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void resetExtrasToSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb7bc7c", new Object[]{this});
        } else {
            this.p.e();
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void commitExtrasToUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aff6e945", new Object[]{this});
            return;
        }
        ContextInfo contextInfo = this.p;
        contextInfo.a(contextInfo.f5401a, (String) null, (String) null);
        contextInfo.e();
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setUserSessionId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a01a2915", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        contextInfo.t = str;
        LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_USERSESSIONID, str);
        contextInfo.a((Bundle) null, LoggingSPCache.STORAGE_USERSESSIONID, str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    @Deprecated
    public void takedownExceptionHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f28a4b", new Object[]{this});
        } else {
            LoggerFactory.getTraceLogger().error("LogContext", new Exception("illegal to invoke 'takedownExceptionHandler' function"));
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setupExceptionHandler(UncaughtExceptionCallback uncaughtExceptionCallback, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0df5781", new Object[]{this, uncaughtExceptionCallback, new Integer(i)});
        } else {
            CrashBridge.c();
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void notifyClientEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0a498b3", new Object[]{this, str, obj});
            return;
        }
        ClientEvent clientEvent = this.t.f5431a.get(str);
        ClientEventManager clientEventManager = this.t;
        clientEventManager.a(str);
        if (clientEvent != null) {
            clientEvent.a(obj);
        }
        clientEventManager.a(str);
    }

    private static void a(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5279f0c3", new Object[]{sb});
            return;
        }
        sb.append("[native crash on main thread but NONE returned, java stack traces are used instead]\n");
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (stackTrace == null) {
                return;
            }
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append('\t');
                sb.append(stackTraceElement);
                sb.append('\n');
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public boolean traceNativeCrash(String str, String str2, boolean z) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6f86132", new Object[]{this, str, str2, new Boolean(z)})).booleanValue();
        }
        String processAlias = LoggerFactory.getProcessInfo().getProcessAlias();
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        traceLogger.error("LogContext", "traceNativeCrash, filePath:" + str + ", isBoot:" + z + ", process: " + processAlias);
        if (LoggerFactory.getProcessInfo().isMainProcess() || LoggerFactory.getProcessInfo().isExtProcess() || LoggerFactory.getProcessInfo().isLiteProcess() || LoggerFactory.getProcessInfo().isSandboxProcess()) {
            String a2 = a(str, str2, z);
            if (LoggerFactory.getProcessInfo().isMainProcess() && z && TextUtils.isEmpty(a2)) {
                File file = null;
                try {
                    file = new File(this.e.getApplicationInfo().dataDir + File.separator + "app_crash");
                } catch (Exception unused) {
                }
                if (file == null || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
                    return false;
                }
            }
            Intent intent = new Intent();
            if (LogStrategyManager.getInstance().isDisableToolsProcess()) {
                intent.setClassName(this.e, LogContext.PUSH_RECEIVER_CLASS_NAME);
            } else {
                intent.setClassName(this.e, LogContext.TOOLS_RECEIVER_CLASS_NAME);
            }
            return a(intent, str, a2, z);
        } else if (LoggerFactory.getProcessInfo().isPushProcess()) {
            if (LogStrategyManager.getInstance().isDisableToolsProcess()) {
                a(z);
                return false;
            }
            Intent intent2 = new Intent();
            intent2.setClassName(this.e, LogContext.TOOLS_RECEIVER_CLASS_NAME);
            return a(intent2, str, str2, z);
        } else if (LoggerFactory.getProcessInfo().isToolsProcess()) {
            a(z);
            return false;
        } else {
            LoggerFactory.getTraceLogger().error("LogContext", "traceNativeCrash, error: unknown process ".concat(String.valueOf(processAlias)));
            a(z);
            return false;
        }
    }

    private static String a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91186ac8", new Object[]{str, str2, new Boolean(z)});
        }
        if (z) {
            return str2;
        }
        StringBuilder sb = null;
        try {
            if (TextUtils.isEmpty(str)) {
                sb = new StringBuilder();
                sb.append("file path is empty");
            } else {
                File file = new File(str);
                if (!file.exists() || !file.isFile()) {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" is not exist");
                }
            }
            if (sb == null) {
                return str2;
            }
            sb.append(", logType: ");
            sb.append(str2);
            sb.append('\n');
            a(sb);
            return sb.toString();
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("LogContext", th);
            return str2;
        }
    }

    private boolean a(Intent intent, String str, String str2, boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2787073f", new Object[]{this, intent, str, str2, new Boolean(z)})).booleanValue();
        }
        try {
            intent.setPackage(this.e.getPackageName());
        } catch (Throwable unused) {
        }
        intent.setAction(this.e.getPackageName() + LogContext.ACTION_MONITOR_COMMAND);
        intent.putExtra("action", this.e.getPackageName() + LogContext.ACTION_TRACE_NATIVECRASH);
        intent.putExtra("filePath", str);
        intent.putExtra("callStack", str2);
        intent.putExtra("isBoot", z);
        try {
            this.e.sendBroadcast(intent);
            z2 = true;
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("LogContext", "handleNativeCrashBySendBroadcast", th);
            z2 = false;
        }
        boolean isDisableToolsProcess = LogStrategyManager.getInstance().isDisableToolsProcess();
        LoggerFactory.getTraceLogger().info("LogContext", "handleNativeCrashBySendBroadcast: send native crash broadcast, filePath: " + str + ", isBoot: " + z + ", success: " + z2 + ", process: " + LoggerFactory.getProcessInfo().getProcessAlias() + ", disableTools: " + isDisableToolsProcess);
        if (z2) {
            return true;
        }
        a(z);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050 A[Catch: Throwable -> 0x013d, TryCatch #1 {Throwable -> 0x013d, blocks: (B:24:0x0050, B:27:0x0059, B:36:0x0098, B:38:0x00a2, B:74:0x011c, B:40:0x00a7, B:42:0x00b4, B:47:0x00c0, B:48:0x00c3, B:49:0x00c6, B:51:0x00cf, B:53:0x00d8, B:55:0x00e0, B:57:0x00e9, B:60:0x00f3, B:62:0x00fc, B:66:0x0107, B:67:0x010a, B:19:0x0042, B:28:0x006e, B:30:0x007c, B:32:0x0086), top: B:79:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[Catch: Throwable -> 0x0090, TryCatch #1 {Throwable -> 0x013d, blocks: (B:24:0x0050, B:27:0x0059, B:36:0x0098, B:38:0x00a2, B:74:0x011c, B:40:0x00a7, B:42:0x00b4, B:47:0x00c0, B:48:0x00c3, B:49:0x00c6, B:51:0x00cf, B:53:0x00d8, B:55:0x00e0, B:57:0x00e9, B:60:0x00f3, B:62:0x00fc, B:66:0x0107, B:67:0x010a, B:19:0x0042, B:28:0x006e, B:30:0x007c, B:32:0x0086), top: B:79:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2 A[Catch: Throwable -> 0x013d, TryCatch #1 {Throwable -> 0x013d, blocks: (B:24:0x0050, B:27:0x0059, B:36:0x0098, B:38:0x00a2, B:74:0x011c, B:40:0x00a7, B:42:0x00b4, B:47:0x00c0, B:48:0x00c3, B:49:0x00c6, B:51:0x00cf, B:53:0x00d8, B:55:0x00e0, B:57:0x00e9, B:60:0x00f3, B:62:0x00fc, B:66:0x0107, B:67:0x010a, B:19:0x0042, B:28:0x006e, B:30:0x007c, B:32:0x0086), top: B:79:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7 A[Catch: Throwable -> 0x013d, TryCatch #1 {Throwable -> 0x013d, blocks: (B:24:0x0050, B:27:0x0059, B:36:0x0098, B:38:0x00a2, B:74:0x011c, B:40:0x00a7, B:42:0x00b4, B:47:0x00c0, B:48:0x00c3, B:49:0x00c6, B:51:0x00cf, B:53:0x00d8, B:55:0x00e0, B:57:0x00e9, B:60:0x00f3, B:62:0x00fc, B:66:0x0107, B:67:0x010a, B:19:0x0042, B:28:0x006e, B:30:0x007c, B:32:0x0086), top: B:79:0x0042 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(boolean r15) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.LogContextImpl.a(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0142  */
    @Override // com.alipay.mobile.common.logging.api.LogContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getLogHost() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.LogContextImpl.getLogHost():java.lang.String");
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getMetDsLogHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f9403e2", new Object[]{this});
        }
        String str = null;
        if (this.j == null) {
            this.j = LoggingUtil.getZhizhiSetting(this.e, "content://com.alipay.setting/MetdsStatisticsServerUrl", null);
            if (this.j == null) {
                this.j = "";
            }
        }
        if (LoggingUtil.isDebuggable(this.e) && TextUtils.isEmpty(null)) {
            str = this.j;
        }
        if (TextUtils.isEmpty(str)) {
            str = !c() ? LogContext.LOG_HOST_HTTPS_RELEASE_METDS_EX : LogContext.LOG_HOST_HTTPS_RELEASE_METDS;
        }
        this.i = str;
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        traceLogger.info("LogContext", "getMetDsLogHost: " + this.i);
        return this.i;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getClientStatus(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("901bb2e6", new Object[]{this, new Boolean(z)}) : getClientStatus(false, z, null);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getClientStatus(boolean z, boolean z2, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91cf34bc", new Object[]{this, new Boolean(z), new Boolean(z2), str});
        }
        long currentTimeMillis = System.currentTimeMillis();
        LoggerFactory.getTraceLogger().info("LogContext", "getClientStatus: , now: " + currentTimeMillis + ", gotoBackgroundTimestamp: " + ClientEventHelper.a().c + ", clientLaunchTimestamp: " + ClientEventHelper.a().b + ", processSetupTimestamp: " + ClientEventHelper.a().f5430a);
        if (z2) {
            String g = CrashBridge.g();
            if (!TextUtils.isEmpty(g)) {
                return g;
            }
            if (z) {
                long backgroundTime = LogStrategyManager.getInstance().getBackgroundTime();
                long h = CrashBridge.h();
                return (h <= 0 || backgroundTime <= 0 || h >= currentTimeMillis || h <= backgroundTime + TimeUnit.MINUTES.toMillis(1L)) ? "unknown" : "background";
            }
        }
        if (ClientEventHelper.a().c > 0 && currentTimeMillis - ClientEventHelper.a().c > TimeUnit.MINUTES.toMillis(1L)) {
            return "background";
        }
        if (ClientEventHelper.a().b > 0 || ClientEventHelper.a().f5430a <= 0) {
            return "foreground";
        }
        if (currentTimeMillis - ClientEventHelper.a().f5430a > TimeUnit.MINUTES.toMillis(1L)) {
            return "background";
        }
        try {
            Map<String, String> startupReason = LoggerFactory.getProcessInfo().getStartupReason();
            String str3 = null;
            if (startupReason != null) {
                str3 = startupReason.get(ProcessInfo.SR_ACTION_NAME);
                str2 = startupReason.get(ProcessInfo.SR_COMPONENT_NAME);
            } else {
                str2 = null;
            }
            boolean i = CrashBridge.i();
            if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2)) {
                z3 = CrashBridge.j();
            }
            return (i || z3) ? "background" : "foreground";
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("LogContext", th);
            return "foreground";
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void adjustRequestSpanByReceived() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13baa5e9", new Object[]{this});
        } else {
            LogStrategyManager.getInstance().adjustRequestSpanByNetNotMatch();
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void adjustRequestSpanByNetNotMatch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f984c4d5", new Object[]{this});
        } else {
            LogStrategyManager.getInstance().adjustRequestSpanByNetNotMatch();
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void adjustRequestSpanByZipFail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6ca92c5", new Object[]{this});
        } else {
            LogStrategyManager.getInstance().adjustRequestSpanByZipFail();
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void adjustRequestSpanByUploadFail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("316c9187", new Object[]{this});
        } else {
            LogStrategyManager.getInstance().adjustRequestSpanByUploadFail();
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void revertRequestSpanToNormal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a333b55e", new Object[]{this});
        } else {
            LogStrategyManager.getInstance().revertRequestSpanToNormal();
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public int getDevicePerformanceScore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ebf4728", new Object[]{this})).intValue();
        }
        try {
            return YearClass.a(this.e);
        } catch (Throwable unused) {
            return Integer.MAX_VALUE;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public boolean isLowEndDevice() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2df92972", new Object[]{this})).booleanValue() : LowEndDeviceUtil.isLowEndDevice(this.e);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void syncLogConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58cb339c", new Object[]{this, str});
        } else {
            LogStrategyManager.getInstance().syncLogConfig(str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void putBizExternParams(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3606f05", new Object[]{this, str, str2});
        } else if (str == null || str2 == null) {
        } else {
            this.m.put(str, str2);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public Map<String, String> getBizExternParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("77aa5f7f", new Object[]{this}) : this.m;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setLogAppenderistener(LogAppenderistener logAppenderistener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d82cf5b", new Object[]{this, logAppenderistener});
        } else {
            this.c = logAppenderistener;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public LogAppenderistener getLogAppenderistener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LogAppenderistener) ipChange.ipc$dispatch("ac52403b", new Object[]{this}) : this.c;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public Map<String, LogStrategyInfo> getLogStrategyInfos() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("1afbfde0", new Object[]{this}) : LogStrategyManager.getInstance().getLogStrategyInfos();
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setBehavorLogListener(BehavorLogListener behavorLogListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d15c44dd", new Object[]{this, behavorLogListener});
        } else {
            this.v = behavorLogListener;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public BehavorLogListener getBehavorLogListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BehavorLogListener) ipChange.ipc$dispatch("e55c12c9", new Object[]{this}) : this.v;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setAbtestInfoGetter(AbtestInfoGetter abtestInfoGetter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fdd570f", new Object[]{this, abtestInfoGetter});
        } else {
            this.s = abtestInfoGetter;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public AbtestInfoGetter getAbtestInfoGetter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AbtestInfoGetter) ipChange.ipc$dispatch("ffff3fe7", new Object[]{this}) : this.s;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setLogUploadRpcClient(RpcClient rpcClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155f5cf0", new Object[]{this, rpcClient});
        } else {
            this.y = rpcClient;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public RpcClient getLogUploadRpcClient() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcClient) ipChange.ipc$dispatch("d8da3a2a", new Object[]{this}) : this.y;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setLogEncryptClient(LogEncryptClient logEncryptClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83733f43", new Object[]{this, logEncryptClient});
        } else {
            this.x = logEncryptClient;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public LogEncryptClient getLogEncryptClient() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LogEncryptClient) ipChange.ipc$dispatch("7cc8a1f1", new Object[]{this}) : this.x;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setSpmMonitor(ISpmMonitor iSpmMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3afd5678", new Object[]{this, iSpmMonitor});
        } else {
            this.w = iSpmMonitor;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public ISpmMonitor getSpmMonitor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ISpmMonitor) ipChange.ipc$dispatch("7ddb5ed4", new Object[]{this}) : this.w;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setLogCustomerControl(LogCustomerControl logCustomerControl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7075ef0f", new Object[]{this, logCustomerControl});
        } else {
            this.d = logCustomerControl;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public LogCustomerControl getLogCustomerControl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LogCustomerControl) ipChange.ipc$dispatch("192197fb", new Object[]{this}) : this.d;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setMaxLogSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c4cfd9", new Object[]{this, new Integer(i)});
        } else {
            MdapLogUploadManager.a(i);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public LogContext.DevicePerformanceScore getDevicePerformanceScoreNew() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogContext.DevicePerformanceScore) ipChange.ipc$dispatch("68ac510e", new Object[]{this});
        }
        try {
            DevicePerformanceScoreHelper a2 = DevicePerformanceScoreHelper.a(this.e);
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.info("DevicePerformanceScoreHelper", "performance score: " + a2.f5438a);
            return a2.f5438a;
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("LogContext", th);
            return LogContext.DevicePerformanceScore.LOW;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setLogDAUTracker(LogDAUTracker logDAUTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66f2d27", new Object[]{this, logDAUTracker});
        } else {
            this.A = logDAUTracker;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public LogDAUTracker getLogDAUTracker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LogDAUTracker) ipChange.ipc$dispatch("3247f6bf", new Object[]{this}) : this.A;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setNetworkInfoGetter(NetworkInfoGetter networkInfoGetter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb609688", new Object[]{this, networkInfoGetter});
        } else {
            this.B = networkInfoGetter;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public NetworkInfoGetter getNetworkInfoGetter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetworkInfoGetter) ipChange.ipc$dispatch("c06ef83a", new Object[]{this}) : this.B;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setTraceLoggerInterceptor(TraceLoggerInterceptor traceLoggerInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb90f6bb", new Object[]{this, traceLoggerInterceptor});
        } else {
            this.C = traceLoggerInterceptor;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public TraceLoggerInterceptor getTraceLoggerInterceptor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TraceLoggerInterceptor) ipChange.ipc$dispatch("d5a9d831", new Object[]{this}) : this.C;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setToolsUploadInterceptor(ToolsUploadInterceptor toolsUploadInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c03289", new Object[]{this, toolsUploadInterceptor});
        } else {
            this.D = toolsUploadInterceptor;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public ToolsUploadInterceptor getToolsUploadInterceptor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToolsUploadInterceptor) ipChange.ipc$dispatch("5eb255d1", new Object[]{this}) : this.D;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        ToolsUploadInterceptor toolsUploadInterceptor = this.D;
        return toolsUploadInterceptor == null || toolsUploadInterceptor.isUplaod() != 2;
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        try {
            if (this.z == null) {
                this.z = this.e.getPackageName();
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("LogContext", "isAlipayPackageName", th);
        }
        String str = this.z;
        if (str == null) {
            return true;
        }
        return str.contains("com.eg.android.AlipayGphone");
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getLocalParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("efc1ff57", new Object[]{this, str});
        }
        this.k.set(2);
        Map<String, String> map = this.n.get();
        if (map != null && str != null) {
            return map.get(str);
        }
        return null;
    }
}
