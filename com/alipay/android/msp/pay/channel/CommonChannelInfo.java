package com.alipay.android.msp.pay.channel;

import com.alipay.android.msp.framework.constraints.IChannelInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class CommonChannelInfo implements IChannelInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.msp.framework.constraints.IChannelInfo
    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : "com.alipay.mcpay";
    }

    @Override // com.alipay.android.msp.framework.constraints.IChannelInfo
    public String getAppKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("49079005", new Object[]{this}) : "2013122500002449";
    }

    @Override // com.alipay.android.msp.framework.constraints.IChannelInfo
    public void initChannelSdk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cbeaa6e", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.framework.constraints.IChannelInfo
    public boolean isEnableGuideWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c24f18a", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
