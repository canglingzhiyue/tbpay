package com.taobao.tao.combo.dataobject;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class ComboResponse extends BaseOutDo {
    private ComboData data;

    static {
        kge.a(530035338);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public ComboData mo2429getData() {
        return this.data;
    }

    public void setData(ComboData comboData) {
        this.data = comboData;
    }
}
