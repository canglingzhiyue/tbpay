package com.taobao.message.unread;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopTaobaoWirelessAmpMessageUnreadcountResponse extends BaseOutDo {
    private MtopTaobaoWirelessAmpMessageUnreadcountResponseData data;

    static {
        kge.a(-277238395);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopTaobaoWirelessAmpMessageUnreadcountResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopTaobaoWirelessAmpMessageUnreadcountResponseData mtopTaobaoWirelessAmpMessageUnreadcountResponseData) {
        this.data = mtopTaobaoWirelessAmpMessageUnreadcountResponseData;
    }
}
