package com.taobao.share.core.contacts.mtop.response;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class ComTaobaoMclContactsSendshareResponse extends BaseOutDo {
    public ComTaobaoMclContactsSendshareResponseData data;

    static {
        kge.a(-1183632376);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public ComTaobaoMclContactsSendshareResponseData mo2429getData() {
        return this.data;
    }

    public void setData(ComTaobaoMclContactsSendshareResponseData comTaobaoMclContactsSendshareResponseData) {
        this.data = comTaobaoMclContactsSendshareResponseData;
    }
}
