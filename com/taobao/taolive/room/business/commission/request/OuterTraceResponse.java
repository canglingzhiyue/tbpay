package com.taobao.taolive.room.business.commission.request;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class OuterTraceResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private OuterTraceInfo data;

    static {
        kge.a(-831809088);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public OuterTraceInfo mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OuterTraceInfo) ipChange.ipc$dispatch("86b2e71", new Object[]{this}) : this.data;
    }

    public void setData(OuterTraceInfo outerTraceInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7146a95", new Object[]{this, outerTraceInfo});
        } else {
            this.data = outerTraceInfo;
        }
    }
}
