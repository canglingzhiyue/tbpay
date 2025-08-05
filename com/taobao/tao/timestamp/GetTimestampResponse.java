package com.taobao.tao.timestamp;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class GetTimestampResponse extends BaseOutDo {
    private GetTimestampResponseData data;

    static {
        kge.a(2029424570);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public GetTimestampResponseData mo2429getData() {
        return this.data;
    }

    public void setData(GetTimestampResponseData getTimestampResponseData) {
        this.data = getTimestampResponseData;
    }
}
