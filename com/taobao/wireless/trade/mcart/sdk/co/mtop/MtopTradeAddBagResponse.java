package com.taobao.wireless.trade.mcart.sdk.co.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes9.dex */
public class MtopTradeAddBagResponse extends BaseOutDo {
    private String data;

    static {
        kge.a(726075392);
    }

    public void setData(String str) {
        this.data = str;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData  reason: collision with other method in class */
    public String mo2429getData() {
        return this.data;
    }
}
