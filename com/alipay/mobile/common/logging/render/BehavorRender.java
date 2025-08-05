package com.alipay.mobile.common.logging.render;

import android.os.Build;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.DeviceInfo;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.common.logging.helper.DeviceHWRenderHelper;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.common.logging.util.NetUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class BehavorRender extends BaseRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BehavorRender(LogContext logContext) {
        super(logContext);
    }

    public final String a(String str, Behavor behavor, PendingRender pendingRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b86e30ba", new Object[]{this, str, behavor, pendingRender});
        }
        StringBuilder sb = new StringBuilder();
        String str2 = null;
        if (behavor.getExtParams() != null) {
            str2 = behavor.getExtParams().get("header");
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "D-VM";
        }
        sb.append(str2);
        LoggingUtil.appendParam(sb, pendingRender.b != null ? pendingRender.b : LoggingUtil.getNowTime());
        LoggingUtil.appendParam(sb, this.b.getProductId());
        LoggingUtil.appendParam(sb, this.b.getProductVersion());
        LoggingUtil.appendParam(sb, "2");
        LoggingUtil.appendParam(sb, this.b.getClientId());
        LoggingUtil.appendParam(sb, this.b.getSessionId());
        LoggingUtil.appendParam(sb, this.b.getUserId());
        if (TextUtils.isEmpty(str)) {
            str = "event";
        }
        LoggingUtil.appendParam(sb, str);
        LoggingUtil.appendParam(sb, behavor.getAbTestInfo());
        LoggingUtil.appendParam(sb, !TextUtils.isEmpty(behavor.getRefer()) ? behavor.getRefer() : pendingRender.h);
        LoggingUtil.appendParam(sb, behavor.getAppID() != null ? behavor.getAppID() : pendingRender.g);
        LoggingUtil.appendParam(sb, behavor.getAppVersion());
        LoggingUtil.appendParam(sb, behavor.getxPath());
        LoggingUtil.appendParam(sb, behavor.getEntityContentId());
        LoggingUtil.appendParam(sb, behavor.getSeedID());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(behavor.getLoggerLevel());
        LoggingUtil.appendParam(sb, sb2.toString());
        LoggingUtil.appendParam(sb, behavor.getRenderBizType() != null ? behavor.getRenderBizType() : behavor.getBehaviourPro());
        LoggingUtil.appendParam(sb, behavor.getLogPro());
        LoggingUtil.appendParam(sb, behavor.getParam1());
        LoggingUtil.appendParam(sb, behavor.getParam2());
        LoggingUtil.appendParam(sb, behavor.getParam3());
        if (behavor.getLegacyParam() != null) {
            LoggingUtil.appendParam(sb, behavor.getLegacyParam());
        } else {
            LoggingUtil.appendExtParam(sb, behavor.getExtParams());
        }
        LoggingUtil.appendParam(sb, this.b.getSourceId());
        LoggingUtil.appendParam(sb, behavor.getPageStayTime());
        LoggingUtil.appendParam(sb, this.b.getDeviceId());
        LoggingUtil.appendParam(sb, behavor.getUserCaseID());
        LoggingUtil.appendParam(sb, behavor.getPageId());
        LoggingUtil.appendParam(sb, behavor.getRefViewID() != null ? behavor.getRefViewID() : pendingRender.c);
        LoggingUtil.appendParam(sb, behavor.getViewID() != null ? behavor.getViewID() : pendingRender.d);
        LoggingUtil.appendParam(sb, behavor.getTrackId() != null ? behavor.getTrackId() : pendingRender.e);
        LoggingUtil.appendParam(sb, behavor.getTrackToken() != null ? behavor.getTrackToken() : pendingRender.f);
        LoggingUtil.appendParam(sb, LogStrategyManager.getInstance().getHitTestRate(behavor.getBehaviourPro(), behavor.getLoggerLevel()));
        LoggingUtil.appendParam(sb, Build.MODEL);
        LoggingUtil.appendParam(sb, Build.VERSION.RELEASE);
        LoggingUtil.appendParam(sb, NetUtil.getNetworkTypeOptimized(this.b.getApplicationContext()));
        LoggingUtil.appendParam(sb, this.b.getReleaseCode());
        LoggingUtil.appendParam(sb, this.b.getChannelId());
        LoggingUtil.appendParam(sb, this.b.getLanguage());
        LoggingUtil.appendParam(sb, this.b.getHotpatchVersion());
        LoggingUtil.appendParam(sb, String.valueOf(DeviceHWRenderHelper.b()));
        LoggingUtil.appendParam(sb, String.valueOf(DeviceHWRenderHelper.d()));
        LoggingUtil.appendParam(sb, String.valueOf(DeviceHWRenderHelper.b(this.b.getApplicationContext())));
        LoggingUtil.appendExtParam(sb, this.b.getBizExternParams());
        LoggingUtil.appendParam(sb, behavor.getSpmStatus());
        LoggingUtil.appendParam(sb, DeviceInfo.getInstance(this.b.getApplicationContext()).getResolution());
        LoggingUtil.appendParam(sb, LoggerFactory.getProcessInfo().getProcessAlias());
        LoggingUtil.appendParam(sb, a());
        LoggingUtil.appendParam(sb, "");
        LoggingUtil.appendExtParam(sb, behavor.getExtParams5());
        sb.append("$$");
        return sb.toString();
    }
}
