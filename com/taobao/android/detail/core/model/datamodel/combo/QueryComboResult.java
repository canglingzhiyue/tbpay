package com.taobao.android.detail.core.model.datamodel.combo;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class QueryComboResult extends BaseOutDo {
    private QueryComboData data;

    static {
        kge.a(1902004255);
    }

    public QueryComboResult() {
        emu.a("com.taobao.android.detail.core.model.datamodel.combo.QueryComboResult");
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
