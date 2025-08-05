package com.taobao.android.livehome.plugin.atype.flexalocal.business.simple;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes6.dex */
public class SimpleQuerySafeResponse extends BaseOutDo {
    private SimpleQuerySafeResponseData data;

    static {
        kge.a(635929129);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public SimpleQuerySafeResponseData mo2429getData() {
        return this.data;
    }

    public void setData(SimpleQuerySafeResponseData simpleQuerySafeResponseData) {
        this.data = simpleQuerySafeResponseData;
    }
}
