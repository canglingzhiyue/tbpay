package com.taobao.taolive.movehighlight.bussiness.highlight.newModel;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class HighlightRowResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HighlightRowResponseData data;

    static {
        kge.a(-62662448);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public HighlightRowResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HighlightRowResponseData) ipChange.ipc$dispatch("edabf9a4", new Object[]{this}) : this.data;
    }

    public void setData(HighlightRowResponseData highlightRowResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbefc388", new Object[]{this, highlightRowResponseData});
        } else {
            this.data = highlightRowResponseData;
        }
    }
}
