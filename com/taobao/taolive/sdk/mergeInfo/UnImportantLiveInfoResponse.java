package com.taobao.taolive.sdk.mergeInfo;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class UnImportantLiveInfoResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private UnImportantLiveInfoResponseData data;

    static {
        kge.a(2082275058);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public Object mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4ca84d6b", new Object[]{this}) : this.data;
    }

    public void setData(UnImportantLiveInfoResponseData unImportantLiveInfoResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a82a6", new Object[]{this, unImportantLiveInfoResponseData});
        } else {
            this.data = unImportantLiveInfoResponseData;
        }
    }
}
