package com.alipay.mobile.beehive.eventbus;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SubscriberConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isWeakRef = true;
    public boolean supportPending = false;
    public boolean supportSticky = false;
    public String uniqueId = "";

    public boolean isSupportSticky() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8846ab19", new Object[]{this})).booleanValue() : this.supportSticky || this.supportPending;
    }
}
