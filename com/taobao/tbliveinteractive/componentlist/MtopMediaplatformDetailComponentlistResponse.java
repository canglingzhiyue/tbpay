package com.taobao.tbliveinteractive.componentlist;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopMediaplatformDetailComponentlistResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopMediaplatformDetailComponentlistResponseData data;

    static {
        kge.a(-764362710);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public MtopMediaplatformDetailComponentlistResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopMediaplatformDetailComponentlistResponseData) ipChange.ipc$dispatch("bcd766e4", new Object[]{this}) : this.data;
    }

    public void setData(MtopMediaplatformDetailComponentlistResponseData mtopMediaplatformDetailComponentlistResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a38bfa", new Object[]{this, mtopMediaplatformDetailComponentlistResponseData});
        } else {
            this.data = mtopMediaplatformDetailComponentlistResponseData;
        }
    }
}
