package com.o2o.ad.click.cpa;

import java.io.Serializable;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class O2OCpaSendResponse extends BaseOutDo implements Serializable, IMTOPDataObject {
    private O2OCpaSendResponseData data;

    static {
        kge.a(-2147447346);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public O2OCpaSendResponseData mo2429getData() {
        return this.data;
    }

    public void setData(O2OCpaSendResponseData o2OCpaSendResponseData) {
        this.data = o2OCpaSendResponseData;
    }
}
