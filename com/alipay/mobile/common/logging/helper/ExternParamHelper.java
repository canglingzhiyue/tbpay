package com.alipay.mobile.common.logging.helper;

import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class ExternParamHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f5439a = "ExternParamHelper";
    private static long b;
    private static Map<String, String> c = new HashMap(4);
    private static Map<String, String> d = new HashMap();

    public static Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]);
        }
        try {
            if (c != null && c.size() > 0) {
                return c;
            }
            c.put("NumCoresOfCPU", String.valueOf(DeviceHWRenderHelper.a()));
            c.put("CPUMaxFreq", String.valueOf(DeviceHWRenderHelper.c()));
            c.put("TotalMem", String.valueOf(DeviceHWRenderHelper.a(LoggerFactory.getLogContext().getApplicationContext())));
            return c;
        } catch (Throwable th) {
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            String str = f5439a;
            traceLogger.error(str, "getDeviceInfos ex= " + th.toString());
            return Collections.emptyMap();
        }
    }
}
