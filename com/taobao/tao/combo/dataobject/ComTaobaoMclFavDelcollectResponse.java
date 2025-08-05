package com.taobao.tao.combo.dataobject;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class ComTaobaoMclFavDelcollectResponse extends BaseOutDo {
    private ComTaobaoMclFavDelcollectResponseData data;

    static {
        kge.a(130603759);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public ComTaobaoMclFavDelcollectResponseData mo2429getData() {
        return this.data;
    }

    public void setData(ComTaobaoMclFavDelcollectResponseData comTaobaoMclFavDelcollectResponseData) {
        this.data = comTaobaoMclFavDelcollectResponseData;
    }
}
