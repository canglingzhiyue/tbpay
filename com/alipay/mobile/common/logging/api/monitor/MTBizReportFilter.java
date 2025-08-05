package com.alipay.mobile.common.logging.api.monitor;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class MTBizReportFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Entity f5422a;

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public interface Entity {
        Map<String, String> onBeforeReportForUeo(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2);
    }

    public static void setEntity(Entity entity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("807d6b3e", new Object[]{entity});
        } else if (f5422a != null) {
        } else {
            f5422a = entity;
        }
    }

    public static Entity getEntity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Entity) ipChange.ipc$dispatch("1562217a", new Object[0]) : f5422a;
    }
}
