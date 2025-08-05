package com.taobao.taolive.dinamicext.view.tbliveFllowContent.mtop.dxConfig;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class TemplateListResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TemplateListResponseData data;

    static {
        kge.a(1890339060);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public TemplateListResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateListResponseData) ipChange.ipc$dispatch("67e3a1c0", new Object[]{this}) : this.data;
    }

    public void setData(TemplateListResponseData templateListResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc10764", new Object[]{this, templateListResponseData});
        } else {
            this.data = templateListResponseData;
        }
    }
}
