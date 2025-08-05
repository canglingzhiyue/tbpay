package com.taobao.taolive.message_sdk.mtop.heart;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;

/* loaded from: classes8.dex */
public class HeartbeatReportResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HeartbeatReportResponseData data;

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public HeartbeatReportResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HeartbeatReportResponseData) ipChange.ipc$dispatch("f12a0d4c", new Object[]{this}) : this.data;
    }

    public void setData(HeartbeatReportResponseData heartbeatReportResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b1cf522", new Object[]{this, heartbeatReportResponseData});
        } else {
            this.data = heartbeatReportResponseData;
        }
    }
}
