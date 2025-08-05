package com.taobao.android.detail.core.request.area;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class QuerySupportedAreaListResultOutDo_ extends BaseOutDo {
    private QuerySupportedAreaListResult data;

    static {
        kge.a(12756241);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public QuerySupportedAreaListResult mo2429getData() {
        return this.data;
    }

    public void setData(QuerySupportedAreaListResult querySupportedAreaListResult) {
        this.data = querySupportedAreaListResult;
    }
}
