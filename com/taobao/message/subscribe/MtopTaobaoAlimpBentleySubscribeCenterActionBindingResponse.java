package com.taobao.message.subscribe;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponse extends BaseOutDo {
    private MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData data;

    static {
        kge.a(-1420555747);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData) {
        this.data = mtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData;
    }
}
