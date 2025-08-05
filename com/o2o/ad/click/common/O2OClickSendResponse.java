package com.o2o.ad.click.common;

import java.io.Serializable;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class O2OClickSendResponse extends BaseOutDo implements Serializable, IMTOPDataObject {
    private O2OClickSendResponseData data;

    static {
        kge.a(-693602169);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public O2OClickSendResponseData mo2429getData() {
        return this.data;
    }

    public void setData(O2OClickSendResponseData o2OClickSendResponseData) {
        this.data = o2OClickSendResponseData;
    }
}
