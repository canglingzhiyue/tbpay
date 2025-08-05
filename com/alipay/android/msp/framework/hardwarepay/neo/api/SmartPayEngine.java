package com.alipay.android.msp.framework.hardwarepay.neo.api;

import com.alipay.android.msp.framework.hardwarepay.neo.SmartPayManager;
import com.alipay.android.msp.plugin.ISmartPayPlugin;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SmartPayEngine implements ISmartPayPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private SmartPayManager mManager = new SmartPayManager(MspContextUtil.getContext());

    public SmartPayEngine() {
        EventLogUtil.logPayEvent("104851", "content_type", "SmartPayEngine");
    }

    @Override // com.alipay.android.msp.plugin.ISmartPayPlugin
    public String getFastPayAuthData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24072b27", new Object[]{this, str});
        }
        LogUtil.record(2, "SmartPayEngine::getFastPayAuthData", "startPay");
        return this.mManager.getFastPayAuthData(str);
    }

    @Override // com.alipay.android.msp.plugin.ISmartPayPlugin
    public String getRegAuthData(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a174409f", new Object[]{this, new Integer(i), new Integer(i2), str});
        }
        LogUtil.record(2, "SmartPayEngine::getRegAuthData", "startPay");
        return this.mManager.getRegAuthData(i, i2, str);
    }
}
