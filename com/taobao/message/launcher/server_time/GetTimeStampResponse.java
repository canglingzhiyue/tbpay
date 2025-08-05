package com.taobao.message.launcher.server_time;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class GetTimeStampResponse extends BaseOutDo implements IMTOPDataObject {
    private GetTimeStampData data;

    static {
        kge.a(1882548603);
        kge.a(-350052935);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public GetTimeStampData mo2429getData() {
        return this.data;
    }

    public void setData(GetTimeStampData getTimeStampData) {
        this.data = getTimeStampData;
    }
}
