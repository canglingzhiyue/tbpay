package com.alipay.bis.common.service.facade.gw.zim;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ZimInitGwRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String bizData;
    public String channel;
    public String merchant;
    public String metaInfo;
    public String produceNode;
    public String productName;
    public String zimId;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ZimInitGwRequest{zimId='" + this.zimId + "', channel='" + this.channel + "', merchant='" + this.merchant + "', productName='" + this.productName + "', produceNode='" + this.produceNode + "', bizData='" + this.bizData + "', metaInfo='" + this.metaInfo + "'}";
    }
}
