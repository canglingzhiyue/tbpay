package com.taobao.bootimage.data;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes6.dex */
public class BootImageInfoResponse extends BaseOutDo {
    private BootImageData data;

    static {
        kge.a(-969049268);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public BootImageData mo2429getData() {
        return this.data;
    }

    public void setData(BootImageData bootImageData) {
        this.data = bootImageData;
    }
}
