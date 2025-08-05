package com.taobao.alimama.click.cpm;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class CpmClickResponse extends BaseOutDo implements IMTOPDataObject {
    private CpmClickResponseData data;

    static {
        kge.a(-1908940965);
        kge.a(-350052935);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public CpmClickResponseData mo2429getData() {
        return this.data;
    }

    public void setData(CpmClickResponseData cpmClickResponseData) {
        this.data = cpmClickResponseData;
    }
}
