package com.alipay.android.msp.core.model;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class Channel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String channelIndex;
    public String compatibleChannelIndex;
    public boolean enable;
    public String fullName;
    public String logo;
    public String recommendTip;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Channel{enable=" + this.enable + ", channelIndex='" + this.channelIndex + "', compatibleChannelIndex='" + this.compatibleChannelIndex + "', logo='" + this.logo + "', fullName='" + this.fullName + "', recommendTip='" + this.recommendTip + "'}";
    }
}
