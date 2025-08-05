package com.taobao.tao.recommend3.remote;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class RecommendDeleteResultOutDo_ extends BaseOutDo {
    private RecommendDeleteResult data;

    static {
        kge.a(1182000857);
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
