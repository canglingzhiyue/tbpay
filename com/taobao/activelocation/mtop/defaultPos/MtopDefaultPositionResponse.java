package com.taobao.activelocation.mtop.defaultPos;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class MtopDefaultPositionResponse extends BaseOutDo {
    private MtopDefaultPositionData data;

    static {
        kge.a(69945709);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopDefaultPositionData mo2429getData() {
        return this.data;
    }

    public void setData(MtopDefaultPositionData mtopDefaultPositionData) {
        this.data = mtopDefaultPositionData;
    }
}
