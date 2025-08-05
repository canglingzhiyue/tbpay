package com.taobao.android.detail.sdk.request.isv;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class QueryIsvUrlRequestResultOutDo_ extends BaseOutDo {
    private QueryIsvUrlRequestResult data;

    static {
        kge.a(-1529560438);
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
