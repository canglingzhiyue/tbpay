package com.taobao.android.detail.sdk.request.o2o;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class QueryO2ODataOutDo_ extends BaseOutDo {
    private QueryO2OData data;

    static {
        kge.a(1590385783);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public QueryO2OData mo2429getData() {
        return this.data;
    }

    public void setData(QueryO2OData queryO2OData) {
        this.data = queryO2OData;
    }
}
