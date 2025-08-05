package com.taobao.share.core.contacts.mtop.response;

import java.io.Serializable;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class ComTaobaoGetContactsMessageResponse extends BaseOutDo implements Serializable {
    public ComTaobaoGetContactsMessageResponseData data;

    static {
        kge.a(-1746091784);
        kge.a(1028243835);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public ComTaobaoGetContactsMessageResponseData mo2429getData() {
        return this.data;
    }

    public void setData(ComTaobaoGetContactsMessageResponseData comTaobaoGetContactsMessageResponseData) {
        this.data = comTaobaoGetContactsMessageResponseData;
    }
}
