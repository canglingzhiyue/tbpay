package com.taobao.relationship.mtop;

import tb.kge;

/* loaded from: classes7.dex */
public class BasicOperationResponse extends BasicResponse {
    private OperationResult data;

    static {
        kge.a(304297053);
    }

    @Override // com.taobao.relationship.mtop.BasicResponse, mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public OperationResult mo2429getData() {
        return this.data;
    }

    public void setData(OperationResult operationResult) {
        this.data = operationResult;
    }
}
