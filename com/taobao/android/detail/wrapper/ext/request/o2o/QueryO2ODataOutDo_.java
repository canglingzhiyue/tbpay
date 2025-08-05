package com.taobao.android.detail.wrapper.ext.request.o2o;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class QueryO2ODataOutDo_ extends BaseOutDo {
    private QueryO2OData data;

    static {
        kge.a(1379394988);
    }

    public QueryO2ODataOutDo_() {
        emu.a("com.taobao.android.detail.wrapper.ext.request.o2o.QueryO2ODataOutDo_");
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
