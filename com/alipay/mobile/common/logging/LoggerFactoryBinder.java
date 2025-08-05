package com.alipay.mobile.common.logging;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.appender.AppenderManager;
import com.alipay.mobile.common.logging.appender.ApplogFileAppender;
import com.alipay.mobile.common.logging.event.ClientEventHelper;
import com.alipay.mobile.common.logging.impl.BehavorloggerImpl;
import com.alipay.mobile.common.logging.impl.EventLoggerImpl;
import com.alipay.mobile.common.logging.impl.MonitorLoggerImpl;
import com.alipay.mobile.common.logging.impl.TraceLoggerImpl;
import com.alipay.mobile.common.logging.util.DeviceUtil;
import com.alipay.mobile.common.logging.util.HybridEncryption;
import com.alipay.mobile.common.logging.util.LoggingAsyncTaskExecutor;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.common.logging.util.ReflectUtil;
import com.alipay.mobile.common.logging.util.perf.Judge;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class LoggerFactoryBinder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5406a;

    public static native int nativeFree();

    public static native int nativeInit();

    public static synchronized void bind(final Context context) {
        synchronized (LoggerFactoryBinder.class) {
            if (f5406a) {
                return;
            }
            f5406a = true;
            if (context != null) {
                context = context.getApplicationContext();
            }
            ProcessInfoImpl processInfoImpl = new ProcessInfoImpl(context);
            LoggerFactory.attachProcessInfo(processInfoImpl);
            LoggerFactory.bindImpls(new DevicePropertyImpl(context));
            LoggingSPCache.createInstance(context);
            CrashBridge.a();
            HybridEncryption.createInstance(context);
            final LogContextImpl logContextImpl = new LogContextImpl(context);
            LoggerFactory.attachLogContext(logContextImpl);
            AppenderManager appenderManager = logContextImpl.f5404a;
            if (!appenderManager.c) {
                appenderManager.c = true;
                if (LoggingUtil.isOfflineForExternalFile()) {
                    appenderManager.f5427a.put(LogCategory.CATEGORY_APPLOG, new ApplogFileAppender(appenderManager.b, TimeUnit.HOURS.toMillis(1L), TimeUnit.DAYS.toMillis(7L), 1073741824L, 32768));
                }
            }
            try {
                Method declaredMethod = Class.forName("com.alipay.mobile.monitor.track.spm.SpmMonitorBinder").getDeclaredMethod(a.ATOM_EXT_bind, Context.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, context);
            } catch (Throwable unused) {
            }
            TraceLoggerImpl traceLoggerImpl = new TraceLoggerImpl(logContextImpl);
            LoggerFactory.bind(traceLoggerImpl, new BehavorloggerImpl(logContextImpl), new MonitorLoggerImpl(logContextImpl), new EventLoggerImpl(logContextImpl));
            traceLoggerImpl.info(LoggerFactory.TAG, LoggingUtil.concatArray(",", Build.BRAND, Build.MANUFACTURER, Build.DISPLAY, Build.MODEL, Build.VERSION.RELEASE, "uid", Integer.valueOf(processInfoImpl.getUserId()), MspDBHelper.BizEntry.COLUMN_NAME_PID, Integer.valueOf(processInfoImpl.getProcessId()), processInfoImpl.getProcessAlias(), logContextImpl.getReleaseType(), logContextImpl.getProductVersion(), logContextImpl.getUserId(), "patchVer", logContextImpl.getHotpatchVersion(), logContextImpl.getApkUniqueId(), "bundleVer", logContextImpl.getBundleVersion(), "birdNest", logContextImpl.getBirdNestVersion()));
            CrashBridge.b();
            String.valueOf(ClientEventHelper.a().f5430a);
            CrashBridge.d();
            String brandName = LoggerFactory.getDeviceProperty().getBrandName();
            if (!TextUtils.isEmpty(brandName)) {
                LoggerFactory.getLogContext().putBizExternParams("brand", brandName);
            }
            String romVersion = LoggerFactory.getDeviceProperty().getRomVersion();
            if (!TextUtils.isEmpty(romVersion)) {
                LoggerFactory.getLogContext().putBizExternParams("romVersion", romVersion);
            }
            Judge.getInstance(context);
            if (processInfoImpl.isPushProcess()) {
                Judge.getInstance(context).judgeForNoneUIProcess();
            }
            if (processInfoImpl.isMainProcess() || processInfoImpl.isLiteProcess()) {
                try {
                    if (context.getPackageManager().getPackageInfo(context.getPackageName(), 128).applicationInfo.metaData.getBoolean("perf_test")) {
                        ReflectUtil.invokeMethod("com.alipay.loginterceptor.LogInterceptManager", "init", new Class[]{Context.class}, null, new Object[]{context});
                    }
                } catch (Throwable unused2) {
                }
            }
            if (processInfoImpl.isMainProcess()) {
                LoggingAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.logging.LoggerFactoryBinder.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            LogContextImpl.this.refreshSessionId();
                        }
                    }
                });
            }
            new Thread(new Runnable() { // from class: com.alipay.mobile.common.logging.LoggerFactoryBinder.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    LoggerFactory.getLogContext().notifyClientEvent(LogContext.CLIENT_ENVENT_CLIENTLAUNCH, null);
                    if (!TextUtils.isEmpty(LoggerFactory.getLogContext().getDeviceId())) {
                        return;
                    }
                    LoggerFactory.getLogContext().setDeviceId(DeviceUtil.getUtdid(context));
                }
            }, "LoggerFactoryBinder-notifyLaunch").start();
            if (LoggingUtil.isDebuggable(context)) {
                try {
                    Class<?> cls = Class.forName("com.alipay.stamper.Stamper");
                    cls.getMethod("launch", Context.class).invoke(cls.getField("INSTANCE").get(null), context);
                } catch (Exception unused3) {
                }
            }
        }
    }
}
