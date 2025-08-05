package com.taobao.android.fluid.framework.adapter.mtop;

import java.io.Serializable;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes5.dex */
public class CommonResponseOutDo<T extends IMTOPDataObject> extends BaseOutDo implements Serializable {
    public T data;

    static {
        kge.a(1511782543);
        kge.a(1028243835);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData  reason: collision with other method in class */
    public T mo2429getData() {
        return this.data;
    }
}
