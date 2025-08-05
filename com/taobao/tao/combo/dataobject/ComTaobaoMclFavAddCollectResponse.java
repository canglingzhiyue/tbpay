package com.taobao.tao.combo.dataobject;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class ComTaobaoMclFavAddCollectResponse extends BaseOutDo {
    private ComTaobaoMclFavAddCollectResponseData data;

    static {
        kge.a(560799609);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public ComTaobaoMclFavAddCollectResponseData mo2429getData() {
        return this.data;
    }

    public void setData(ComTaobaoMclFavAddCollectResponseData comTaobaoMclFavAddCollectResponseData) {
        this.data = comTaobaoMclFavAddCollectResponseData;
    }
}
