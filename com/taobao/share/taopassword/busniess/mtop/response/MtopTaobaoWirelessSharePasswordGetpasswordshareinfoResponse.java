package com.taobao.share.taopassword.busniess.mtop.response;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponse extends BaseOutDo {
    private MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData data;

    static {
        kge.a(-391286932);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData) {
        this.data = mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData;
    }
}
