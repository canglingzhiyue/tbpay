package com.taobao.tao.export.flickbtn.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopTaobaoSharepasswordQueryEntryResponse extends BaseOutDo {
    private MtopTaobaoSharepasswordQueryEntryResponseData data;

    static {
        kge.a(1268701163);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopTaobaoSharepasswordQueryEntryResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopTaobaoSharepasswordQueryEntryResponseData mtopTaobaoSharepasswordQueryEntryResponseData) {
        this.data = mtopTaobaoSharepasswordQueryEntryResponseData;
    }
}
