package com.alipay.mobile.common.logging.event;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.util.FileUtil;
import com.alipay.mobile.common.logging.util.LoggingAsyncTaskExecutor;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class DumpLogToSDEvent implements ClientEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.logging.event.ClientEvent
    public final void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        final String str = (String) obj;
        if (StringUtils.isEmpty(str)) {
            return;
        }
        LoggingAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.logging.event.DumpLogToSDEvent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String string = LoggingSPCache.getInstance().getString(LoggingSPCache.LOGGING_CACHE_KEY_LOG_DUMP_TAG, null);
                if (string != null && string.equals(str)) {
                    return;
                }
                LoggingSPCache.getInstance().putStringCommit(LoggingSPCache.LOGGING_CACHE_KEY_LOG_DUMP_TAG, str);
                try {
                    DumpLogToSDEvent.a(LogCategory.CATEGORY_APPLOG);
                } catch (Throwable th) {
                    LoggerFactory.getTraceLogger().error("DumpLogToSDEvent", th);
                }
                try {
                    DumpLogToSDEvent.a(LogCategory.CATEGORY_TRAFFICLOG);
                } catch (Throwable th2) {
                    LoggerFactory.getTraceLogger().error("DumpLogToSDEvent", th2);
                }
            }
        });
    }

    public static /* synthetic */ void a(String str) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!FileUtil.isCanUseSdCard()) {
            LoggerFactory.getTraceLogger().info("DumpLogToSDEvent", "dumpLogToSD fail:".concat(String.valueOf(str)));
        } else {
            File file = new File(LoggerFactory.getLogContext().getApplicationContext().getFilesDir(), str);
            File file2 = new File(new File(LoggingUtil.getCommonExternalStorageDir(), LoggerFactory.getLogContext().getApplicationContext().getPackageName()), str + "_dump");
            if (!file2.exists()) {
                try {
                    file2.mkdirs();
                } catch (Throwable unused) {
                }
            }
            if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
                return;
            }
            for (File file3 : listFiles) {
                if (file3 != null) {
                    try {
                        FileUtil.copyFile(file3, new File(file2, file3.getName()));
                    } catch (Throwable th) {
                        LoggerFactory.getTraceLogger().error("DumpLogToSDEvent", th);
                    }
                }
            }
        }
    }
}
