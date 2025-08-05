package com.o2o.ad.click.cps;

import java.io.Serializable;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class O2OCpsSendResponse extends BaseOutDo implements Serializable, IMTOPDataObject {
    private O2OCpsSendResponseData data;

    static {
        kge.a(-1902635634);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public O2OCpsSendResponseData mo2429getData() {
        return this.data;
    }

    public void setData(O2OCpsSendResponseData o2OCpsSendResponseData) {
        this.data = o2OCpsSendResponseData;
    }
}
