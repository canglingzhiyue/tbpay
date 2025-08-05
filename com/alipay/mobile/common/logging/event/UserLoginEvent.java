package com.alipay.mobile.common.logging.event;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LogEvent;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.common.logging.render.BehavorRender;
import com.alipay.mobile.common.logging.render.PendingRender;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class UserLoginEvent implements ClientEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.logging.event.ClientEvent
    public final void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        LogContext logContext = LoggerFactory.getLogContext();
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        logContext.setUserId(str);
        LoggerFactory.getTraceLogger().info("UserLoginEvent", "contextInfo.setUserId: ".concat(String.valueOf(str)));
        LogStrategyManager.getInstance().queryStrategy("login", !str.equals(logContext.getUserId()));
        Behavor behavor = new Behavor();
        behavor.setSeedID("login");
        behavor.setParam1(str);
        logContext.appendLogEvent(new LogEvent(LogCategory.CATEGORY_ALIVEREPORT, null, LogEvent.Level.ERROR, null, PendingRender.a(new BehavorRender(logContext), "event", behavor)));
        ClientEventHelper.a().a(LogContext.ENVENT_USERLOGIN);
    }
}
