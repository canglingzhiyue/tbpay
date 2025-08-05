package com.taobao.taobao.scancode.encode.longtoshort.data;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class ComTaobaoXcodeQrcodeCreateResponse extends BaseOutDo {
    private ComTaobaoXcodeQrcodeCreateResponseData data;

    static {
        kge.a(704581786);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public ComTaobaoXcodeQrcodeCreateResponseData mo2429getData() {
        return this.data;
    }

    public void setData(ComTaobaoXcodeQrcodeCreateResponseData comTaobaoXcodeQrcodeCreateResponseData) {
        this.data = comTaobaoXcodeQrcodeCreateResponseData;
    }
}
