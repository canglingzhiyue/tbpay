package com.taobao.taopai.material.bean;

import java.util.List;
import java.util.Objects;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class CategoryListResponseData implements IMTOPDataObject {
    private List<MaterialCategoryBean> model;

    static {
        kge.a(-1475374524);
        kge.a(-350052935);
    }

    public List<MaterialCategoryBean> getModel() {
        return this.model;
    }

    public void setModel(List<MaterialCategoryBean> list) {
        this.model = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Objects.equals(getModel(), ((CategoryListResponseData) obj).getModel());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getModel());
    }
}
