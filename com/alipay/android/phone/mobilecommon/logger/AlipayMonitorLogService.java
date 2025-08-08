package com.alipay.android.phone.mobilecommon.logger;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.log.BehaviourIdEnum;
import com.alipay.mobile.security.bio.log.VerifyBehavior;
import com.alipay.mobile.security.bio.service.local.monitorlog.MonitorLogService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.zoloz.toyger.ToygerLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AlipayMonitorLogService extends MonitorLogService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static boolean c = false;

    public static /* synthetic */ Object ipc$super(AlipayMonitorLogService alipayMonitorLogService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 117147460) {
            super.trigUpload();
            return null;
        } else if (hashCode != 1813791078) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.install((Context) objArr[0]);
            return null;
        }
    }

    @Override // com.alipay.mobile.security.bio.service.local.monitorlog.MonitorLogService
    public void install(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c1c4166", new Object[]{this, context});
            return;
        }
        BioLog.i("AlipayMonitorLogService init:" + c + "|" + b);
        if (c) {
            return;
        }
        BioLog.i("LoggerFactory init");
        super.install(context);
        LoggerFactory.init(context);
        BioLog.setLogger(new AlipayLogger());
        ToygerLog.setLogger(new ToygerAlipayLogger());
        c = true;
    }

    @Override // com.alipay.mobile.security.bio.service.local.monitorlog.MonitorLogService
    public void logBehavior(BehaviourIdEnum behaviourIdEnum, VerifyBehavior verifyBehavior) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7beec8d", new Object[]{this, behaviourIdEnum, verifyBehavior});
        } else if (verifyBehavior == null) {
            BioLog.w("verifyBehavior is null");
        } else {
            Behavor behavor = new Behavor();
            behavor.setBehaviourPro(verifyBehavior.getBizType());
            behavor.setLoggerLevel(verifyBehavior.getLoggerLevel());
            behavor.setUserCaseID(verifyBehavior.getUserCaseID());
            if (!StringUtils.isEmpty(verifyBehavior.getAppID())) {
                behavor.setAppID(verifyBehavior.getAppID());
            }
            behavor.setSeedID(verifyBehavior.getSeedID());
            LoggerFactory.getTraceLogger().warn("BIOLOGYMonitorLog", String.format("%s, %s, %s", verifyBehavior.getSeedID(), verifyBehavior.getParam2(), verifyBehavior.getParam3()));
            behavor.setParam1(verifyBehavior.getParam1());
            behavor.setParam2(verifyBehavior.getParam2());
            behavor.setParam3(verifyBehavior.getParam3());
            if (verifyBehavior.getExtParams() != null) {
                behavor.getExtParams().putAll(verifyBehavior.getExtParams());
            }
            LoggerFactory.getBehavorLogger().event(behaviourIdEnum == null ? "" : behaviourIdEnum.getDes(), behavor);
        }
    }

    @Override // com.alipay.mobile.security.bio.service.local.monitorlog.MonitorLogService
    public void trigUpload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fb8744", new Object[]{this});
            return;
        }
        super.trigUpload();
        try {
            LogContext logContext = LoggerFactory.getLogContext();
            logContext.flush(MetaRecord.BIZ_TYPE, true);
            logContext.uploadAfterSync(MetaRecord.BIZ_TYPE);
        } catch (Exception unused) {
        }
    }
}
