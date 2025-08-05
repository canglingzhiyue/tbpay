package com.taobao.taolive.sdk.business.interact.comment;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.model.common.SendComments;
import tb.kge;

/* loaded from: classes8.dex */
public class SendCommentsResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private SendComments data;

    static {
        kge.a(-711787264);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public SendComments mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SendComments) ipChange.ipc$dispatch("24fa5a8d", new Object[]{this}) : this.data;
    }

    public void setData(SendComments sendComments) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6626771", new Object[]{this, sendComments});
        } else {
            this.data = sendComments;
        }
    }
}
