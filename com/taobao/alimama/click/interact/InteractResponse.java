package com.taobao.alimama.click.interact;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class InteractResponse extends BaseOutDo implements IMTOPDataObject {
    private InteractResponseData data;

    static {
        kge.a(444962509);
        kge.a(-350052935);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public InteractResponseData mo2429getData() {
        return this.data;
    }

    public void setData(InteractResponseData interactResponseData) {
        this.data = interactResponseData;
    }
}
