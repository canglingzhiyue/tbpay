package com.taobao.homepage.messiah.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class StabilityDataUploadResultOutDo extends BaseOutDo {
    private StabilityDataUploadResult data;

    static {
        kge.a(1473732874);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public StabilityDataUploadResult mo2429getData() {
        return this.data;
    }

    public void setData(StabilityDataUploadResult stabilityDataUploadResult) {
        this.data = stabilityDataUploadResult;
    }
}
