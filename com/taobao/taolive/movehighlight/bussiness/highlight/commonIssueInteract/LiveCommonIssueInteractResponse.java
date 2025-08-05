package com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveCommonIssueInteractResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LiveCommonIssueInteractResponseData data;

    static {
        kge.a(-2034214319);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public LiveCommonIssueInteractResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveCommonIssueInteractResponseData) ipChange.ipc$dispatch("42197c83", new Object[]{this}) : this.data;
    }

    public void setData(LiveCommonIssueInteractResponseData liveCommonIssueInteractResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b305af67", new Object[]{this, liveCommonIssueInteractResponseData});
        } else {
            this.data = liveCommonIssueInteractResponseData;
        }
    }
}
