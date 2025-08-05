package com.taobao.taopai.material.request.materialcategory;

import com.taobao.taopai.material.bean.CategoryListResponseData;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class CategoryListResponse extends BaseOutDo {
    private CategoryListResponseData data;

    static {
        kge.a(809661605);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public CategoryListResponseData mo2429getData() {
        return this.data;
    }

    public void setData(CategoryListResponseData categoryListResponseData) {
        this.data = categoryListResponseData;
    }
}
