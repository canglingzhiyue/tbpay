package com.alipay.mobile.common.logging.render;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.logging.api.DeviceInfo;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.monitor.PerformanceID;
import com.alipay.mobile.common.logging.helper.DeviceHWRenderHelper;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.common.logging.util.NetUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class PerformanceRender extends BaseRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public PerformanceRender(LogContext logContext) {
        super(logContext);
    }

    public final String a(PerformanceID performanceID, String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("73198917", new Object[]{this, performanceID, str, str2, str3, str4, map}) : a(performanceID, str, str2, str3, str4, (String) null, map, (Map<String, String>) null, 2, (PendingRender) null);
    }

    public final String a(PerformanceID performanceID, String str, String str2, String str3, String str4, String str5, Map<String, String> map, Map<String, String> map2, int i, PendingRender pendingRender) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("30a1d2ee", new Object[]{this, performanceID, str, str2, str3, str4, str5, map, map2, new Integer(i), pendingRender}) : a(performanceID.getDes(), str, str2, str3, str4, str5, map, map2, i, pendingRender);
    }

    public final String a(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, Map<String, String> map2, int i, PendingRender pendingRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7065fb0", new Object[]{this, str, str2, str3, str4, str5, str6, map, map2, new Integer(i), pendingRender});
        }
        StringBuilder sb = new StringBuilder();
        String str7 = null;
        if (map2 != null) {
            str7 = map2.get("header");
        }
        if (!StringUtils.isEmpty(str7)) {
            sb.append(str7);
        } else {
            sb.append("D-MM");
        }
        if (pendingRender != null && pendingRender.b != null) {
            LoggingUtil.appendParam(sb, pendingRender.b);
        } else {
            LoggingUtil.appendParam(sb, LoggingUtil.getNowTime());
        }
        LoggingUtil.appendParam(sb, this.b.getProductId());
        LoggingUtil.appendParam(sb, this.b.getProductVersion());
        LoggingUtil.appendParam(sb, "2");
        LoggingUtil.appendParam(sb, "");
        LoggingUtil.appendParam(sb, "");
        LoggingUtil.appendParam(sb, "");
        LoggingUtil.appendParam(sb, "");
        LoggingUtil.appendParam(sb, "");
        LoggingUtil.appendParam(sb, LogStrategyManager.getInstance().getHitTestRate(str, i));
        LoggingUtil.appendParam(sb, str);
        LoggingUtil.appendParam(sb, str2);
        LoggingUtil.appendParam(sb, str3);
        LoggingUtil.appendParam(sb, str4);
        LoggingUtil.appendParam(sb, str5);
        LoggingUtil.appendExtParam(sb, map);
        LoggingUtil.appendParam(sb, "android");
        LoggingUtil.appendParam(sb, Build.VERSION.RELEASE);
        LoggingUtil.appendParam(sb, NetUtil.getNetworkTypeOptimized(this.b.getApplicationContext()));
        LoggingUtil.appendParam(sb, Build.MODEL);
        LoggingUtil.appendParam(sb, this.b.getReleaseCode());
        LoggingUtil.appendParam(sb, this.b.getChannelId());
        LoggingUtil.appendParam(sb, this.b.getDeviceId());
        LoggingUtil.appendParam(sb, this.b.getLanguage());
        LoggingUtil.appendParam(sb, String.valueOf(DeviceHWRenderHelper.b()));
        LoggingUtil.appendParam(sb, String.valueOf(DeviceHWRenderHelper.d()));
        LoggingUtil.appendParam(sb, String.valueOf(DeviceHWRenderHelper.b(this.b.getApplicationContext())));
        LoggingUtil.appendParam(sb, this.b.getHotpatchVersion());
        LoggingUtil.appendParam(sb, this.b.getApkUniqueId());
        LoggingUtil.appendExtParam(sb, this.b.getBizExternParams());
        LoggingUtil.appendParam(sb, str6);
        LoggingUtil.appendParam(sb, DeviceInfo.getInstance(this.b.getApplicationContext()).getResolution());
        if (pendingRender != null) {
            LoggingUtil.appendParam(sb, pendingRender.g);
        } else {
            LoggingUtil.appendParam(sb, this.b.getStorageParam(LogContext.STORAGE_APPID));
        }
        LoggingUtil.appendParam(sb, LoggerFactory.getProcessInfo().getProcessAlias());
        LoggingUtil.appendParam(sb, a());
        LoggingUtil.appendParam(sb, String.valueOf(i));
        sb.append("$$");
        return sb.toString();
    }
}
