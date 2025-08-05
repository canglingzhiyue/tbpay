package com.taobao.alimama.net.pojo.response;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class AlimamaZzAdGetResponse extends BaseOutDo implements IMTOPDataObject {
    private AlimamaZzAdGetResponseData data;

    static {
        kge.a(908352575);
        kge.a(-350052935);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public AlimamaZzAdGetResponseData mo2429getData() {
        return this.data;
    }

    public void setData(AlimamaZzAdGetResponseData alimamaZzAdGetResponseData) {
        this.data = alimamaZzAdGetResponseData;
    }
}
