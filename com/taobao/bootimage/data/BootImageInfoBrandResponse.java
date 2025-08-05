package com.taobao.bootimage.data;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes6.dex */
public class BootImageInfoBrandResponse extends BaseOutDo {
    private BootImageBrandData data;

    static {
        kge.a(-1762749251);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public BootImageBrandData mo2429getData() {
        return this.data;
    }

    public void setData(BootImageBrandData bootImageBrandData) {
        this.data = bootImageBrandData;
    }
}
