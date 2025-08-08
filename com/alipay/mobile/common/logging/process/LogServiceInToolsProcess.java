package com.alipay.mobile.common.logging.process;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.alipay.mobile.common.logging.util.ToolThreadUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.tianyan.mobilesdk.TianyanLoggingStatus;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class LogServiceInToolsProcess extends IntentService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(LogServiceInToolsProcess logServiceInToolsProcess, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 1270686685) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onLowMemory();
            return null;
        }
    }

    public LogServiceInToolsProcess() {
        super("LogServiceInTools");
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        TianyanLoggingStatus.acceptTimeTicksMadly();
        super.onLowMemory();
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        TianyanLoggingStatus.acceptTimeTicksMadly();
        LoggerFactory.getLogContext().flush(LogCategory.CATEGORY_APPLOG, false);
        LoggerFactory.getLogContext().flush(null, false);
        super.onDestroy();
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        ToolThreadUtils.getInstance(LoggerFactory.getLogContext().getApplicationContext()).start(true);
        TianyanLoggingStatus.acceptTimeTicksMadly();
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        Bundle extras = intent.getExtras();
        if (StringUtils.isEmpty(action) || extras == null) {
            return;
        }
        if (action.equals(getPackageName() + LogContext.ACTION_UPLOAD_MDAPLOG)) {
            try {
                VariableStoreInToolsProcess.f5448a = extras.getBoolean("isMonitorBackground");
                VariableStoreInToolsProcess.b = extras.getBoolean("isStrictBackground");
                VariableStoreInToolsProcess.c = extras.getBoolean("isRelaxedBackground");
                VariableStoreInToolsProcess.d = extras.getString("invokerProcessAlias");
            } catch (Throwable th) {
                TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                traceLogger.error("LogServiceInTools", "ACTION_UPLOAD_MDAPLOG: " + th.toString());
            }
            LoggerFactory.getLogContext().upload(extras.getString("logCategory"), extras.getString("uploadUrl"), extras);
            VariableStoreInToolsProcess.f5448a = true;
            VariableStoreInToolsProcess.b = true;
            VariableStoreInToolsProcess.c = true;
            VariableStoreInToolsProcess.d = null;
        } else {
            if (action.equals(getPackageName() + LogContext.ACTION_UPDATE_LOG_STRATEGY)) {
                LoggerFactory.getLogContext().updateLogStrategyCfg(extras.getString("strategy"));
            } else {
                if (action.equals(getPackageName() + LogContext.ACTION_UPDATE_LOG_CONTEXT)) {
                    String string = extras.getString("type");
                    String string2 = extras.getString("value");
                    TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
                    traceLogger2.info("LogServiceInTools", action + ", type: " + string);
                    a(string, string2);
                } else {
                    if (action.equals(getPackageName() + LogContext.ACTION_UPDATE_LOG_CONTEXT_BATCH)) {
                        TraceLogger traceLogger3 = LoggerFactory.getTraceLogger();
                        traceLogger3.info("LogServiceInTools", action + ", size: " + extras.size());
                        for (String str : extras.keySet()) {
                            a(str, extras.getString(str));
                        }
                        LoggerFactory.getLogContext().resetExtrasToSet();
                    } else {
                        if (action.equals(getPackageName() + LogContext.ACTION_TRACE_NATIVECRASH)) {
                            LoggerFactory.getLogContext().traceNativeCrash(extras.getString("filePath"), extras.getString("callStack"), extras.getBoolean("isBoot"));
                        } else {
                            if (action.equals(getPackageName() + LogContext.ACTION_DYNAMIC_RELEASE)) {
                                boolean z = extras.getBoolean("isForce");
                                String string3 = Build.VERSION.SDK_INT >= 12 ? extras.getString(LoggingSPCache.STORAGE_HOTPATCHVERSION, "0") : null;
                                try {
                                    Class<?> loadClass = getClassLoader().loadClass("com.alipay.android.phone.mobilecommon.dynamicrelease.processor.DynamicReleaseProcessor");
                                    Method declaredMethod = loadClass.getDeclaredMethod("getInstance", Context.class);
                                    declaredMethod.setAccessible(true);
                                    Object invoke = declaredMethod.invoke(null, this);
                                    Method declaredMethod2 = loadClass.getDeclaredMethod("start", Boolean.TYPE, String.class);
                                    declaredMethod2.setAccessible(true);
                                    declaredMethod2.invoke(invoke, Boolean.valueOf(z), string3);
                                } catch (Throwable th2) {
                                    LoggerFactory.getTraceLogger().error("LogServiceInTools", th2);
                                }
                            } else {
                                LoggerFactory.getTraceLogger().error("LogServiceInTools", "no such action: ".concat(String.valueOf(action)));
                            }
                        }
                    }
                }
            }
        }
        ToolThreadUtils.getInstance(LoggerFactory.getLogContext().getApplicationContext()).end();
    }

    private static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if ("channelId".equals(str)) {
            LoggerFactory.getLogContext().setChannelIdNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_RELEASETYPE.equals(str)) {
            LoggerFactory.getLogContext().setReleaseTypeNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_RELEASECODE.equals(str)) {
            LoggerFactory.getLogContext().setReleaseCodeNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_PRODUCTID.equals(str)) {
            LoggerFactory.getLogContext().setProductIdNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_PRODUCTVERSION.equals(str)) {
            LoggerFactory.getLogContext().setProductVersionNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_USERID.equals(str)) {
            LoggerFactory.getLogContext().setUserIdNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_CLIENTID.equals(str)) {
            LoggerFactory.getLogContext().setClientIdNoCommit(str2);
        } else if ("utdid".equals(str)) {
            LoggerFactory.getLogContext().setDeviceIdNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_LANGUAGE.equals(str)) {
            LoggerFactory.getLogContext().setLanguageNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_HOTPATCHVERSION.equals(str)) {
            LoggerFactory.getLogContext().setHotpatchVersionNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_HOTPATCHDESC.equals(str)) {
            LoggerFactory.getLogContext().setHotpatchDescNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_HOTPATCHBUNDLEVERSION.equals(str)) {
            LoggerFactory.getLogContext().setHotpatchBundleVersionNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_BUNDLEVERSION.equals(str)) {
            LoggerFactory.getLogContext().setBundleVersionNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_BIRDNESTVERSION.equals(str)) {
            LoggerFactory.getLogContext().setBirdNestVersionNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_PACKAGEID.equals(str)) {
            LoggerFactory.getLogContext().setPackageIdNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_USERSESSIONID.equals(str)) {
            LoggerFactory.getLogContext().setUserIdNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_LOGHOST.equals(str)) {
            LoggerFactory.getLogContext().setLogHostNoCommit(str2);
        } else {
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.error("LogServiceInTools", "not mapping, type: " + str + ", value: " + str2);
        }
    }
}
