package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopTaobaoWirelessAmp2BcMessageListResponse extends BaseOutDo {
    private MtopTaobaoWirelessAmp2BcMessageListResponseData data;

    static {
        kge.a(994108036);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopTaobaoWirelessAmp2BcMessageListResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopTaobaoWirelessAmp2BcMessageListResponseData mtopTaobaoWirelessAmp2BcMessageListResponseData) {
        this.data = mtopTaobaoWirelessAmp2BcMessageListResponseData;
    }
}
