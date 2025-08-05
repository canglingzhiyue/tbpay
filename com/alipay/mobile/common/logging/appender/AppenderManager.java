package com.alipay.mobile.common.logging.appender;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class AppenderManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Appender> f5427a = new HashMap();
    public LogContext b;
    public boolean c;

    public AppenderManager(LogContext logContext) {
        this.b = logContext;
        this.f5427a.put(LogCategory.CATEGORY_APPLOG, new ApplogFileAppender(logContext, TimeUnit.HOURS.toMillis(1L), TimeUnit.DAYS.toMillis(7L), 15728640L, 65536));
        this.f5427a.put(LogCategory.CATEGORY_TRAFFICLOG, new ExternalFileAppender(logContext, LogCategory.CATEGORY_TRAFFICLOG, TimeUnit.DAYS.toMillis(1L), TimeUnit.DAYS.toMillis(30L), 8388608L, 8192));
        this.f5427a.put(LogCategory.CATEGORY_LOGCAT, new ExternalFileAppender(logContext, LogCategory.CATEGORY_LOGCAT, TimeUnit.HOURS.toMillis(1L), TimeUnit.DAYS.toMillis(1L), 4194304L, 8192));
        this.f5427a.put(LogCategory.CATEGORY_USERBEHAVOR, new MdapFileAppender(logContext, LogCategory.CATEGORY_USERBEHAVOR));
        this.f5427a.put(LogCategory.CATEGORY_AUTOUSERBEHAVOR, new MdapFileAppender(logContext, LogCategory.CATEGORY_AUTOUSERBEHAVOR));
        this.f5427a.put("exception", new MdapFileAppender(logContext, "exception"));
        this.f5427a.put(LogCategory.CATEGORY_SDKMONITOR, new MdapFileAppender(logContext, LogCategory.CATEGORY_SDKMONITOR));
        this.f5427a.put(LogCategory.CATEGORY_PERFORMANCE, new MdapFileAppender(logContext, LogCategory.CATEGORY_PERFORMANCE));
        this.f5427a.put(LogCategory.CATEGORY_ROMESYNC, new MdapFileAppender(logContext, LogCategory.CATEGORY_ROMESYNC));
        this.f5427a.put(LogCategory.CATEGORY_NETWORK, new MdapFileAppender(logContext, LogCategory.CATEGORY_NETWORK));
        this.f5427a.put(LogCategory.CATEGORY_WEBAPP, new MdapFileAppender(logContext, LogCategory.CATEGORY_WEBAPP));
        this.f5427a.put(LogCategory.CATEGORY_FOOTPRINT, new MdapFileAppender(logContext, LogCategory.CATEGORY_FOOTPRINT));
        this.f5427a.put(LogCategory.CATEGORY_KEYBIZTRACE, new MdapFileAppender(logContext, LogCategory.CATEGORY_KEYBIZTRACE));
        this.f5427a.put("crash", new MdapFileAppender(logContext, "crash"));
        this.f5427a.put("apm", new MdapFileAppender(logContext, "apm"));
        this.f5427a.put(LogCategory.CATEGORY_DATAFLOW, new MdapFileAppender(logContext, LogCategory.CATEGORY_DATAFLOW));
        this.f5427a.put(LogCategory.CATEGORY_BATTERY, new MdapFileAppender(logContext, LogCategory.CATEGORY_BATTERY));
        this.f5427a.put(LogCategory.CATEGORY_ALIVEREPORT, new MdapFileAppender(logContext, LogCategory.CATEGORY_ALIVEREPORT));
    }

    public final void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else if (TextUtils.isEmpty(str)) {
            LoggerFactory.getTraceLogger().error("AppenderManager", "backupCurrent: no category");
        } else {
            Appender appender = this.f5427a.get(str);
            if (appender == null) {
                LoggerFactory.getTraceLogger().error("AppenderManager", "backupCurrent: no appender");
                return;
            }
            try {
                appender.a(z);
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().error("AppenderManager", "backupCurrent", th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x012e A[Catch: all -> 0x0204, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0019, B:12:0x0021, B:16:0x0035, B:18:0x003d, B:22:0x0056, B:24:0x0064, B:27:0x0069, B:29:0x0075, B:30:0x0083, B:32:0x0089, B:34:0x0091, B:42:0x00ae, B:37:0x0096, B:39:0x00a0, B:41:0x00a4, B:46:0x00b4, B:48:0x00c2, B:50:0x00c8, B:53:0x00d3, B:54:0x00dd, B:56:0x00e3, B:58:0x00ed, B:60:0x00fe, B:63:0x010a, B:65:0x011d, B:67:0x0121, B:69:0x0125, B:71:0x012e, B:72:0x0133, B:76:0x013e, B:78:0x014b, B:80:0x0155, B:84:0x0162, B:86:0x016b, B:89:0x0176, B:91:0x0182, B:94:0x0191, B:103:0x01b1, B:113:0x01dd, B:105:0x01be, B:96:0x019e), top: B:121:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(com.alipay.mobile.common.logging.api.LogEvent r9) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.appender.AppenderManager.a(com.alipay.mobile.common.logging.api.LogEvent):void");
    }
}
