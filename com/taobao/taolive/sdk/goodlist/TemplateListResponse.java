package com.taobao.taolive.sdk.goodlist;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class TemplateListResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TemplateListResponseData data;

    static {
        kge.a(308450628);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public TemplateListResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateListResponseData) ipChange.ipc$dispatch("9d920cf0", new Object[]{this}) : this.data;
    }

    public void setData(TemplateListResponseData templateListResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b47a4614", new Object[]{this, templateListResponseData});
        } else {
            this.data = templateListResponseData;
        }
    }
}
