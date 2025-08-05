package com.taobao.android.detail.core.request.async;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class AsyncQueryDataOutDo_ extends BaseOutDo {
    private AsyncQueryData data;

    static {
        kge.a(-1971749964);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public AsyncQueryData mo2429getData() {
        return this.data;
    }

    public void setData(AsyncQueryData asyncQueryData) {
        this.data = asyncQueryData;
    }
}
