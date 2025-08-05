package com.taobao.alimama.click.extend.cpm;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class ExtendCpmClickResponse extends BaseOutDo implements IMTOPDataObject {
    private ExtendCpmClickResponseData data;

    static {
        kge.a(1468322628);
        kge.a(-350052935);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public ExtendCpmClickResponseData mo2429getData() {
        return this.data;
    }

    public void setData(ExtendCpmClickResponseData extendCpmClickResponseData) {
        this.data = extendCpmClickResponseData;
    }
}
