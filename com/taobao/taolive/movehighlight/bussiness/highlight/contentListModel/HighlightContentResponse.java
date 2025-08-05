package com.taobao.taolive.movehighlight.bussiness.highlight.contentListModel;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class HighlightContentResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HighlightContentResponseData data;

    static {
        kge.a(-1132369978);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public HighlightContentResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HighlightContentResponseData) ipChange.ipc$dispatch("5e0647ee", new Object[]{this}) : this.data;
    }

    public void setData(HighlightContentResponseData highlightContentResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78b4fcd2", new Object[]{this, highlightContentResponseData});
        } else {
            this.data = highlightContentResponseData;
        }
    }
}
