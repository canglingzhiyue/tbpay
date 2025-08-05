package com.taobao.taopai.material.request.materiallist;

import com.taobao.taopai.material.bean.MaterialListBean;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class MaterialListResponse extends BaseOutDo {
    private MaterialListBean data;

    static {
        kge.a(627231534);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MaterialListBean mo2429getData() {
        return this.data;
    }

    public void setData(MaterialListBean materialListBean) {
        this.data = materialListBean;
    }
}
