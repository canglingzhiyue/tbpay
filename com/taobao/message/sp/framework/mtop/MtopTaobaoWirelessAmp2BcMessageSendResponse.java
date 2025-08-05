package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopTaobaoWirelessAmp2BcMessageSendResponse extends BaseOutDo {
    private MtopTaobaoWirelessAmp2BcMessageSendResponseData data;

    static {
        kge.a(332625774);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopTaobaoWirelessAmp2BcMessageSendResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopTaobaoWirelessAmp2BcMessageSendResponseData mtopTaobaoWirelessAmp2BcMessageSendResponseData) {
        this.data = mtopTaobaoWirelessAmp2BcMessageSendResponseData;
    }
}
