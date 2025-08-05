package com.taobao.alimama.net.pojo.response;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class AlimamaCpsTraceSendResponse extends BaseOutDo implements IMTOPDataObject {
    private Object data;

    static {
        kge.a(33384861);
        kge.a(-350052935);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public Object mo2429getData() {
        return this.data;
    }

    public void setData(Object obj) {
        this.data = obj;
    }
}
