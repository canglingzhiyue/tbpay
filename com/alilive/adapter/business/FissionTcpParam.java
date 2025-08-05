package com.alilive.adapter.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.Map;
import tb.kge;

/* loaded from: classes3.dex */
public class FissionTcpParam implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String adUserId;
    public String contentId;
    public Map<String, String> context;
    public String ct;
    public Map<String, String> dataAttributes;
    public String itemId;
    public String pageName;
    public String platformType;
    public String scenceId;
    public String sourceType;
    public String tcpBid;

    static {
        kge.a(1785123861);
        kge.a(-540945145);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FissionTcpParam{itemId='" + this.itemId + "', contentId='" + this.contentId + "', adUserId='" + this.adUserId + "', tcpBid='" + this.tcpBid + "', ct='" + this.ct + "', context=" + this.context + ", dataAttributes=" + this.dataAttributes + ", pageName='" + this.pageName + "', sourceType='" + this.sourceType + "', scenceId='" + this.scenceId + "', platformType='" + this.platformType + "'}";
    }
}
