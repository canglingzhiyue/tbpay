package com.alipay.mobile.common.logging.render;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.logging.api.DeviceInfo;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.antevent.AntEvent;
import com.alipay.mobile.common.logging.helper.ExternParamHelper;
import com.alipay.mobile.common.logging.strategy.GlobalLogConfigService;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.common.logging.util.NetUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class AntEventRender extends BaseRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public AntEventRender(LogContext logContext) {
        super(logContext);
    }

    public final String a(AntEvent antEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea8953c5", new Object[]{this, antEvent});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("D-AE");
        LoggingUtil.appendParam(sb, LoggingUtil.getNowTime());
        LoggingUtil.appendParam(sb, this.b.getProductId());
        LoggingUtil.appendParam(sb, this.b.getProductVersion());
        LoggingUtil.appendParam(sb, "2");
        LoggingUtil.appendParam(sb, this.b.getClientId());
        LoggingUtil.appendParam(sb, this.b.getSessionId());
        LoggingUtil.appendParam(sb, this.b.getUserId());
        LoggingUtil.appendParam(sb, LogStrategyManager.getInstance().getHitTestRate(antEvent.getBizType(), antEvent.getLoggerLevel()));
        LoggingUtil.appendParam(sb, antEvent.getEventID());
        LoggingUtil.appendParam(sb, antEvent.getRenderBizType() != null ? antEvent.getRenderBizType() : antEvent.getBizType());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(antEvent.getLoggerLevel());
        LoggingUtil.appendParam(sb, sb2.toString());
        LoggingUtil.appendParam(sb, antEvent.getPageId() != null ? antEvent.getPageId() : this.b.getCurrentPageId());
        LoggingUtil.appendParam(sb, antEvent.getAbtestId());
        LoggingUtil.appendParam(sb, null);
        LoggingUtil.appendParam(sb, this.b.getHotpatchVersion());
        LoggingUtil.appendParam(sb, "android");
        LoggingUtil.appendParam(sb, Build.VERSION.RELEASE);
        LoggingUtil.appendParam(sb, NetUtil.getNetworkTypeOptimized(this.b.getApplicationContext()));
        LoggingUtil.appendParam(sb, Build.MODEL);
        LoggingUtil.appendParam(sb, this.b.getReleaseCode());
        LoggingUtil.appendParam(sb, this.b.getChannelId());
        LoggingUtil.appendParam(sb, this.b.getDeviceId());
        LoggingUtil.appendParam(sb, this.b.getLanguage());
        LoggingUtil.appendParam(sb, Build.MANUFACTURER);
        LoggingUtil.appendParam(sb, DeviceInfo.getInstance(this.b.getApplicationContext()).getResolution());
        LoggingUtil.appendParam(sb, this.b.getStorageParam(LogContext.STORAGE_APPID));
        LoggingUtil.appendParam(sb, LoggerFactory.getProcessInfo().getProcessAlias());
        LoggingUtil.appendExtParam(sb, ExternParamHelper.a());
        LoggingUtil.appendParam(sb, null);
        LoggingUtil.appendParam(sb, null);
        LoggingUtil.appendParam(sb, a());
        GlobalLogConfigService.a();
        String b = GlobalLogConfigService.b();
        if (!StringUtils.isEmpty(b)) {
            this.b.putBizExternParams("groupTag", b);
        }
        LoggingUtil.appendExtParam(sb, this.b.getBizExternParams());
        LoggingUtil.appendParam(sb, antEvent.getParam1());
        LoggingUtil.appendParam(sb, antEvent.getParam2());
        LoggingUtil.appendParam(sb, antEvent.getParam3());
        LoggingUtil.appendExtParam(sb, antEvent.getExtParams());
        LoggingUtil.appendExtParam(sb, antEvent.getExtParams5());
        LoggingUtil.appendParam(sb, null);
        sb.append("$$");
        return sb.toString();
    }
}
