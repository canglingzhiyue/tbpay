package com.taobao.jacoco.data;

import mtopsdk.mtop.domain.BaseOutDo;

/* loaded from: classes7.dex */
public class MtopTaobaoCoverageMetaInfoSaveResponse extends BaseOutDo {
    private MtopTaobaoCoverageMetaInfoSaveResponseData data;

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopTaobaoCoverageMetaInfoSaveResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopTaobaoCoverageMetaInfoSaveResponseData mtopTaobaoCoverageMetaInfoSaveResponseData) {
        this.data = mtopTaobaoCoverageMetaInfoSaveResponseData;
    }
}
