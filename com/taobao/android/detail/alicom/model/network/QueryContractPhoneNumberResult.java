package com.taobao.android.detail.alicom.model.network;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class QueryContractPhoneNumberResult extends BaseOutDo {
    private QueryContractPhoneNumberData data;

    static {
        kge.a(-423729662);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public QueryContractPhoneNumberData mo2429getData() {
        return this.data;
    }

    public void setData(QueryContractPhoneNumberData queryContractPhoneNumberData) {
        this.data = queryContractPhoneNumberData;
    }
}
