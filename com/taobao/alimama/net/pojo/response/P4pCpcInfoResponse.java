package com.taobao.alimama.net.pojo.response;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class P4pCpcInfoResponse extends BaseOutDo implements IMTOPDataObject {
    private static final long serialVersionUID = -3871455772294398291L;
    private Object location;

    static {
        kge.a(-1409787094);
        kge.a(-350052935);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public Object mo2429getData() {
        return this.location;
    }

    public void setData(Object obj) {
        this.location = obj;
    }
}
