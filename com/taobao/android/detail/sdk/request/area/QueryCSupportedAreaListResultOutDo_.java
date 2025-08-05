package com.taobao.android.detail.sdk.request.area;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class QueryCSupportedAreaListResultOutDo_ extends BaseOutDo {
    private QueryCSupportedAreaListResult data;

    static {
        kge.a(1502228319);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public QueryCSupportedAreaListResult mo2429getData() {
        return this.data;
    }

    public void setData(QueryCSupportedAreaListResult queryCSupportedAreaListResult) {
        this.data = queryCSupportedAreaListResult;
    }
}
