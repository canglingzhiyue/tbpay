package com.taobao.android.detail.sdk.model.network.combo;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class QueryComboResult extends BaseOutDo {
    private QueryComboData data;

    static {
        kge.a(-1356999157);
    }

    public QueryComboResult() {
        tpc.a("com.taobao.android.detail.sdk.model.network.combo.QueryComboResult");
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public QueryComboData mo2429getData() {
        return this.data;
    }

    public void setData(QueryComboData queryComboData) {
        this.data = queryComboData;
    }
}
