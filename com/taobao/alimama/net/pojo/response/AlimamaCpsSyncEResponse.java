package com.taobao.alimama.net.pojo.response;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class AlimamaCpsSyncEResponse extends BaseOutDo implements IMTOPDataObject {
    private AlimamaCpsSyncEResponseData data;

    static {
        kge.a(1973021370);
        kge.a(-350052935);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public AlimamaCpsSyncEResponseData mo2429getData() {
        return this.data;
    }

    public void setData(AlimamaCpsSyncEResponseData alimamaCpsSyncEResponseData) {
        this.data = alimamaCpsSyncEResponseData;
    }
}
