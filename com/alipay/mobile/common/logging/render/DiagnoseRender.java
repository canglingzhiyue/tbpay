package com.alipay.mobile.common.logging.render;

import android.os.Build;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.helper.DeviceHWRenderHelper;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.common.logging.util.NetUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class DiagnoseRender extends BaseRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public DiagnoseRender(LogContext logContext) {
        super(logContext);
    }

    public final String a(String str, String str2, Throwable th, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fddebbb4", new Object[]{this, str, str2, th, map});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("D-EM");
        LoggingUtil.appendParam(sb, LoggingUtil.getNowTime());
        LoggingUtil.appendParam(sb, this.b.getProductId());
        LoggingUtil.appendParam(sb, this.b.getProductVersion());
        LoggingUtil.appendParam(sb, "2");
        LoggingUtil.appendParam(sb, this.b.getClientId());
        LoggingUtil.appendParam(sb, this.b.getUserId());
        LoggingUtil.appendParam(sb, NetUtil.getNetworkTypeOptimized(this.b.getApplicationContext()));
        LoggingUtil.appendParam(sb, Build.MODEL);
        LoggingUtil.appendParam(sb, Build.VERSION.RELEASE);
        LoggingUtil.appendParam(sb, this.b.getReleaseCode());
        LoggingUtil.appendParam(sb, this.b.getChannelId());
        LoggingUtil.appendParam(sb, this.b.getReleaseType());
        LoggingUtil.appendParam(sb, this.b.getStorageParam(LogContext.STORAGE_APPID));
        LoggingUtil.appendParam(sb, str);
        LoggingUtil.appendParam(sb, str2);
        if (th != null) {
            if (map == null) {
                map = new HashMap();
            }
            map.put("stackFrame", LoggingUtil.throwableToString(th));
        }
        LoggingUtil.appendExtParam(sb, map);
        LoggingUtil.appendParam(sb, this.b.getLanguage());
        LoggingUtil.appendParam(sb, this.b.getHotpatchVersion());
        LoggingUtil.appendParam(sb, String.valueOf(DeviceHWRenderHelper.b()));
        LoggingUtil.appendParam(sb, String.valueOf(DeviceHWRenderHelper.d()));
        LoggingUtil.appendParam(sb, String.valueOf(DeviceHWRenderHelper.b(this.b.getApplicationContext())));
        LoggingUtil.appendParam(sb, null);
        LoggingUtil.appendParam(sb, this.b.getApkUniqueId());
        LoggingUtil.appendParam(sb, LoggerFactory.getProcessInfo().getProcessAlias());
        LoggingUtil.appendParam(sb, this.b.getDeviceId());
        LoggingUtil.appendExtParam(sb, this.b.getBizExternParams());
        LoggingUtil.appendParam(sb, a());
        sb.append("$$");
        return sb.toString();
    }
}
