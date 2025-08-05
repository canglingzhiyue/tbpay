package com.taobao.taopai.material.request.materialdetail;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class MaterialDetailResponse extends BaseOutDo {
    private MaterialDetailData data;

    static {
        kge.a(744705358);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MaterialDetailData mo2429getData() {
        return this.data;
    }

    public void setData(MaterialDetailData materialDetailData) {
        this.data = materialDetailData;
    }
}
