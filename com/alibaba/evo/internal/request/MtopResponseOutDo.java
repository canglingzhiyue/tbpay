package com.alibaba.evo.internal.request;

import com.alibaba.fastjson.annotation.JSONField;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.bwt;
import tb.kge;

/* loaded from: classes2.dex */
public class MtopResponseOutDo extends BaseOutDo {
    @JSONField(name = "data")
    public bwt data;

    static {
        kge.a(-2103619184);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public Object mo2429getData() {
        return this.data;
    }
}
