package com.taobao.umipublish.extension.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes9.dex */
public class CommonResponseOutDo<T extends IMTOPDataObject> extends BaseOutDo {
    public T data;

    static {
        kge.a(1772463796);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData  reason: collision with other method in class */
    public T mo2429getData() {
        return this.data;
    }
}
