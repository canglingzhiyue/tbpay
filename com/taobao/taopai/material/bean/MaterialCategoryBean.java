package com.taobao.taopai.material.bean;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.taolive.room.utils.aw;
import java.io.Serializable;
import java.util.Objects;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MaterialCategoryBean implements IMTOPDataObject {
    private long categoryId;
    private String name;
    @JSONField(name = aw.PARAM_EXTEND)
    private String originExtend;
    private Extend parsedExtend;

    /* loaded from: classes8.dex */
    public static class Extend implements Serializable {
        public String logoUrl;
        public String selectedLogoUrl;

        static {
            kge.a(97801004);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(1301092594);
        kge.a(-350052935);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(long j) {
        this.categoryId = j;
    }

    public Extend getExtend() {
        if (this.parsedExtend == null) {
            this.parsedExtend = (Extend) JSON.parseObject(this.originExtend, Extend.class);
        }
        return this.parsedExtend;
    }

    public String getOriginExtend() {
        return this.originExtend;
    }

    public void setOriginExtend(String str) {
        this.originExtend = str;
    }

    public void setExtend(Extend extend) {
        this.parsedExtend = extend;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MaterialCategoryBean materialCategoryBean = (MaterialCategoryBean) obj;
            if (getCategoryId() == materialCategoryBean.getCategoryId() && Objects.equals(getName(), materialCategoryBean.getName())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getName(), Long.valueOf(getCategoryId()));
    }

    public String toString() {
        return "MaterialCategory{name='" + this.name + "', categoryId=" + this.categoryId + '}';
    }
}
