package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopTaobaoWirelessAmpConversationListResponse extends BaseOutDo {
    private MtopTaobaoWirelessAmpConversationListResponseData data;

    static {
        kge.a(-1840700429);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopTaobaoWirelessAmpConversationListResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopTaobaoWirelessAmpConversationListResponseData mtopTaobaoWirelessAmpConversationListResponseData) {
        this.data = mtopTaobaoWirelessAmpConversationListResponseData;
    }
}
