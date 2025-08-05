package com.taobao.taobao.scancode.common.mtop.resp;

import com.taobao.taobao.scancode.common.mtop.data.PailitaoRecommendRespData;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class PailitaoRecommendResp extends BaseOutDo {
    private PailitaoRecommendRespData data;

    static {
        kge.a(-1660386694);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public PailitaoRecommendRespData mo2429getData() {
        return this.data;
    }

    public void setData(PailitaoRecommendRespData pailitaoRecommendRespData) {
        this.data = pailitaoRecommendRespData;
    }
}
