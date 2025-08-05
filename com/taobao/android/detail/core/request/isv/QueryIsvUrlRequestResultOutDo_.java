package com.taobao.android.detail.core.request.isv;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class QueryIsvUrlRequestResultOutDo_ extends BaseOutDo {
    private QueryIsvUrlRequestResult data;

    static {
        kge.a(859413071);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public QueryIsvUrlRequestResult mo2429getData() {
        return this.data;
    }

    public void setData(QueryIsvUrlRequestResult queryIsvUrlRequestResult) {
        this.data = queryIsvUrlRequestResult;
    }
}
