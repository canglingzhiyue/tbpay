package com.taobao.taopai.material.request.materialdetail;

import com.taobao.taopai.material.bean.MaterialDetail;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MaterialDetailData implements IMTOPDataObject {
    private MaterialDetail model;

    static {
        kge.a(919844663);
        kge.a(-350052935);
    }

    public MaterialDetail getModel() {
        return this.model;
    }

    public void setModel(MaterialDetail materialDetail) {
        this.model = materialDetail;
    }
}
