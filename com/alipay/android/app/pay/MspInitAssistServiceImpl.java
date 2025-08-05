package com.alipay.android.app.pay;

import com.alipay.android.msp.framework.constraints.IChannelInfo;
import com.alipay.android.msp.pay.service.MspInitAssistService;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspInitAssistServiceImpl extends MspInitAssistService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IChannelInfo f4353a;

    @Override // com.alipay.android.msp.pay.service.MspInitAssistService
    public IChannelInfo getChannelInfo() {
        if (this.f4353a == null) {
            try {
                this.f4353a = (IChannelInfo) Class.forName("com.alipay.android.msp.pay.channel.AliChannelInfo").newInstance();
            } catch (Exception unused) {
                return null;
            }
        }
        return this.f4353a;
    }
}
