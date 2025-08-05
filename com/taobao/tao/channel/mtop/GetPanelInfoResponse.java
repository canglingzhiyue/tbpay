package com.taobao.tao.channel.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class GetPanelInfoResponse extends BaseOutDo {
    public GetPanelInfoResponseData data;

    static {
        kge.a(743891192);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public GetPanelInfoResponseData mo2429getData() {
        return this.data;
    }

    public void setData(GetPanelInfoResponseData getPanelInfoResponseData) {
        this.data = getPanelInfoResponseData;
    }
}
