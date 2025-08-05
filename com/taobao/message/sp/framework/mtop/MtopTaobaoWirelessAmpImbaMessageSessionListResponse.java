package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopTaobaoWirelessAmpImbaMessageSessionListResponse extends BaseOutDo {
    private MtopTaobaoWirelessAmpImbaMessageSessionListResponseData data;

    static {
        kge.a(-963002366);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopTaobaoWirelessAmpImbaMessageSessionListResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopTaobaoWirelessAmpImbaMessageSessionListResponseData mtopTaobaoWirelessAmpImbaMessageSessionListResponseData) {
        this.data = mtopTaobaoWirelessAmpImbaMessageSessionListResponseData;
    }
}
