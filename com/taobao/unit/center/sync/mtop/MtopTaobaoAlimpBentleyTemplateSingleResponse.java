package com.taobao.unit.center.sync.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes9.dex */
public class MtopTaobaoAlimpBentleyTemplateSingleResponse extends BaseOutDo {
    private MtopTaobaoAlimpBentleyTemplateSingleResponseData data;

    static {
        kge.a(1085242372);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopTaobaoAlimpBentleyTemplateSingleResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopTaobaoAlimpBentleyTemplateSingleResponseData mtopTaobaoAlimpBentleyTemplateSingleResponseData) {
        this.data = mtopTaobaoAlimpBentleyTemplateSingleResponseData;
    }
}
