package com.alipay.android.msp.pay.service;

import com.alipay.android.app.pay.MspInitAssistServiceImpl;
import com.alipay.android.msp.framework.constraints.IChannelInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class MspInitAssistService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public IChannelInfo getChannelInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IChannelInfo) ipChange.ipc$dispatch("611e5f05", new Object[]{this});
        }
        return null;
    }

    public static MspInitAssistService getSdkInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspInitAssistService) ipChange.ipc$dispatch("d5f7b082", new Object[0]) : new MspInitAssistServiceImpl();
    }
}
