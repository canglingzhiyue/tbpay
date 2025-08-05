package com.taobao.unit.center.mtop.sync;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes9.dex */
public class MtopTaobaoAlimpBentleyLayoutSyncResponse extends BaseOutDo {
    private MtopTaobaoAlimpBentleyLayoutSyncResponseData data;

    static {
        kge.a(1454056961);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopTaobaoAlimpBentleyLayoutSyncResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopTaobaoAlimpBentleyLayoutSyncResponseData mtopTaobaoAlimpBentleyLayoutSyncResponseData) {
        this.data = mtopTaobaoAlimpBentleyLayoutSyncResponseData;
    }
}
