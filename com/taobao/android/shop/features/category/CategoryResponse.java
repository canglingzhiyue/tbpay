package com.taobao.android.shop.features.category;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes6.dex */
public class CategoryResponse extends BaseOutDo {
    private CategoryData data;

    static {
        kge.a(-902747996);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public CategoryData mo2429getData() {
        return this.data;
    }

    public void setData(CategoryData categoryData) {
        this.data = categoryData;
    }
}
