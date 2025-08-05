package com.taobao.tao.recommend3.remote;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class RecommendEdgeResultOutDo_ extends BaseOutDo {
    private RecommendEdgeResult data;

    static {
        kge.a(-1617704277);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public RecommendEdgeResult mo2429getData() {
        return this.data;
    }

    public void setData(RecommendEdgeResult recommendEdgeResult) {
        this.data = recommendEdgeResult;
    }
}
