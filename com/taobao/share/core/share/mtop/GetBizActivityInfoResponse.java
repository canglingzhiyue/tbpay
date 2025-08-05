package com.taobao.share.core.share.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class GetBizActivityInfoResponse extends BaseOutDo {
    public GetBizActivityInfoResponseData data;

    static {
        kge.a(1274924485);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public GetBizActivityInfoResponseData mo2429getData() {
        return this.data;
    }

    public void setData(GetBizActivityInfoResponseData getBizActivityInfoResponseData) {
        this.data = getBizActivityInfoResponseData;
    }
}
