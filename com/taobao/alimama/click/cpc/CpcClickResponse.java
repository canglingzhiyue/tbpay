package com.taobao.alimama.click.cpc;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class CpcClickResponse extends BaseOutDo implements IMTOPDataObject {
    private CpcClickResponseData data;

    static {
        kge.a(232466927);
        kge.a(-350052935);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public CpcClickResponseData mo2429getData() {
        return this.data;
    }

    public void setData(CpcClickResponseData cpcClickResponseData) {
        this.data = cpcClickResponseData;
    }
}
