package com.alipay.mobile.security.bio.service.local.monitorlog;

import android.content.Context;
import com.alipay.mobile.security.bio.log.BehaviourIdEnum;
import com.alipay.mobile.security.bio.log.VerifyBehavior;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.local.LocalService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class MonitorLogService extends LocalService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static boolean b = false;

    public static /* synthetic */ Object ipc$super(MonitorLogService monitorLogService, String str, Object... objArr) {
        if (str.hashCode() == 548948747) {
            super.onCreate((BioServiceManager) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void install(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c1c4166", new Object[]{this, context});
        }
    }

    public void keyBizTrace(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0f6bd6f", new Object[]{this, str, str2, str3, map});
        }
    }

    public abstract void logBehavior(BehaviourIdEnum behaviourIdEnum, VerifyBehavior verifyBehavior);

    public void trigUpload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fb8744", new Object[]{this});
        }
    }

    @Override // com.alipay.mobile.security.bio.service.local.LocalService, com.alipay.mobile.security.bio.service.BioService
    public void onCreate(BioServiceManager bioServiceManager) {
        Context bioApplicationContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b84b0b", new Object[]{this, bioServiceManager});
            return;
        }
        super.onCreate(bioServiceManager);
        if (b || bioServiceManager == null || (bioApplicationContext = bioServiceManager.getBioApplicationContext()) == null) {
            return;
        }
        install(bioApplicationContext);
        b = true;
    }
}
