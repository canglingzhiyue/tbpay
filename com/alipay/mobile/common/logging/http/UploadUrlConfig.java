package com.alipay.mobile.common.logging.http;

import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class UploadUrlConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static UploadUrlConfig e;

    /* renamed from: a  reason: collision with root package name */
    public boolean f5443a = false;
    public boolean b = false;
    private boolean f = false;
    public long c = 0;
    public long d = 0;

    public static synchronized UploadUrlConfig a() {
        synchronized (UploadUrlConfig.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UploadUrlConfig) ipChange.ipc$dispatch("b3aa6ad2", new Object[0]);
            }
            if (e == null) {
                e = new UploadUrlConfig();
            }
            return e;
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this.f5443a) {
            return this.f;
        }
        this.f5443a = true;
        try {
            if (Constants.VAL_YES.equals(LoggerFactory.getLogContext().getApplicationContext().getSharedPreferences(LogContext.LOG_HOST_CONFIG_SP, 4).getString(LogContext.LOG_HOST_CONFIG_SP_DISABLE_HTTPS, "no"))) {
                LoggerFactory.getTraceLogger().info("UploadUrlConfig", "disable https, use http upload");
                this.f = true;
            } else {
                this.f = false;
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("UploadUrlConfig", th);
        }
        return this.f;
    }
}
