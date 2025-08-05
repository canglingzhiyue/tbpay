package com.taobao.tao.combo.dataobject;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class ComTaobaoMclFavCheckcollectResponse extends BaseOutDo {
    private ComTaobaoMclFavCheckcollectResponseData data;

    static {
        kge.a(-1471395694);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public ComTaobaoMclFavCheckcollectResponseData mo2429getData() {
        return this.data;
    }

    public void setData(ComTaobaoMclFavCheckcollectResponseData comTaobaoMclFavCheckcollectResponseData) {
        this.data = comTaobaoMclFavCheckcollectResponseData;
    }
}
