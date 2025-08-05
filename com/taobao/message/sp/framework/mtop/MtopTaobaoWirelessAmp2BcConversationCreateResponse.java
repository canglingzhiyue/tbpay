package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopTaobaoWirelessAmp2BcConversationCreateResponse extends BaseOutDo {
    private MtopTaobaoWirelessAmp2BcConversationCreateResponseData data;

    static {
        kge.a(290060578);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopTaobaoWirelessAmp2BcConversationCreateResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopTaobaoWirelessAmp2BcConversationCreateResponseData mtopTaobaoWirelessAmp2BcConversationCreateResponseData) {
        this.data = mtopTaobaoWirelessAmp2BcConversationCreateResponseData;
    }
}
