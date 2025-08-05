package com.alipay.mobile.common.logging.event;

import com.alipay.mobile.common.logging.api.LogEvent;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class ClientEventHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ClientEventHelper e;
    public long b;
    public long c;

    /* renamed from: a  reason: collision with root package name */
    public long f5430a = System.currentTimeMillis();
    public long d = System.currentTimeMillis();

    public static synchronized ClientEventHelper a() {
        synchronized (ClientEventHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ClientEventHelper) ipChange.ipc$dispatch("403f6d13", new Object[0]);
            }
            if (e == null) {
                e = new ClientEventHelper();
            }
            return e;
        }
    }

    public final synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        LoggerFactory.getTraceLogger().info("ClientEventHelper", "notifyUpload: ".concat(String.valueOf(str)));
        LogStrategyManager.getInstance().getIntervalEventMap().put(str, str);
        LoggerFactory.getLogContext().appendLogEvent(new LogEvent("uploadByEvent", null, LogEvent.Level.ERROR, str));
    }
}
