package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopTaobaoBentleyPluginAccountBatchResponse extends BaseOutDo {
    private MtopTaobaoBentleyPluginAccountBatchResponseData data;

    static {
        kge.a(998170115);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopTaobaoBentleyPluginAccountBatchResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopTaobaoBentleyPluginAccountBatchResponseData mtopTaobaoBentleyPluginAccountBatchResponseData) {
        this.data = mtopTaobaoBentleyPluginAccountBatchResponseData;
    }
}
