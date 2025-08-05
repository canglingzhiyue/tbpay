package com.taobao.taolive.movehighlight.bussiness.highlight.comment;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class HighlightCommentResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HighlightCommentResponseData data;

    static {
        kge.a(-555370887);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public HighlightCommentResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HighlightCommentResponseData) ipChange.ipc$dispatch("7f9c2d35", new Object[]{this}) : this.data;
    }
}
