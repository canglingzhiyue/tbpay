package com.alipay.mobile.verifyidentity.module.fingerprint.proxy;

import com.alipay.android.app.smartpays.api.SmartPayManager;
import com.alipay.mobile.verifyidentity.sentry.ASProxy;
import com.alipay.mobile.verifyidentity.sentry.SentryDelegate;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ApiSmartPayManagerProxy implements ASProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String caseId;
    private SmartPayManager smartPayManager;

    public ApiSmartPayManagerProxy(SmartPayManager smartPayManager, String str) {
        this.smartPayManager = smartPayManager;
        this.caseId = str;
    }

    public String getFastPayAuthData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24072b27", new Object[]{this, str});
        }
        new SentryDelegate();
        return this.smartPayManager.getFastPayAuthData(str);
    }

    public String getFastPayAuthDataWithNoLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8697611a", new Object[]{this, str});
        }
        new SentryDelegate();
        return this.smartPayManager.getFastPayAuthDataWithNoLog(str);
    }

    public String getRegAuthData(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a174409f", new Object[]{this, new Integer(i), new Integer(i2), str});
        }
        new SentryDelegate();
        return this.smartPayManager.getRegAuthData(i, i2, str);
    }
}
