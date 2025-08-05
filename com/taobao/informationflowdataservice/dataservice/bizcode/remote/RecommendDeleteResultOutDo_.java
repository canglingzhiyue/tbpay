package com.taobao.informationflowdataservice.dataservice.bizcode.remote;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class RecommendDeleteResultOutDo_ extends BaseOutDo {
    private RecommendDeleteResult data;

    static {
        kge.a(805225663);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public RecommendDeleteResult mo2429getData() {
        return this.data;
    }

    public void setData(RecommendDeleteResult recommendDeleteResult) {
        this.data = recommendDeleteResult;
    }
}
