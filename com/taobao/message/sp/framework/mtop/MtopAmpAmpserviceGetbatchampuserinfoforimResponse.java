package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopAmpAmpserviceGetbatchampuserinfoforimResponse extends BaseOutDo {
    private MtopAmpAmpserviceGetbatchampuserinfoforimResponseData data;

    static {
        kge.a(949783939);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopAmpAmpserviceGetbatchampuserinfoforimResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopAmpAmpserviceGetbatchampuserinfoforimResponseData mtopAmpAmpserviceGetbatchampuserinfoforimResponseData) {
        this.data = mtopAmpAmpserviceGetbatchampuserinfoforimResponseData;
    }
}
