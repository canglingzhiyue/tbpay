package com.taobao.unit.center.mtop.sync;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes9.dex */
public class MtopTaobaoAlimpBentleyTemplateSyncResponse extends BaseOutDo {
    private MtopTaobaoAlimpBentleyTemplateSyncResponseData data;

    static {
        kge.a(-1335690095);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopTaobaoAlimpBentleyTemplateSyncResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopTaobaoAlimpBentleyTemplateSyncResponseData mtopTaobaoAlimpBentleyTemplateSyncResponseData) {
        this.data = mtopTaobaoAlimpBentleyTemplateSyncResponseData;
    }
}
