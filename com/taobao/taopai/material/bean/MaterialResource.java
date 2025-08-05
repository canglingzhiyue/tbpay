package com.taobao.taopai.material.bean;

import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import java.util.Objects;
import tb.kge;

/* loaded from: classes8.dex */
public class MaterialResource extends MaterialDetail {
    private String dirPath;
    private String materialJsonPath;

    static {
        kge.a(289438002);
    }

    public String getDirPath() {
        return this.dirPath;
    }

    public void setDirPath(String str) {
        this.dirPath = str;
    }

    public String getMaterialJsonPath() {
        return this.materialJsonPath;
    }

    public void setMaterialJsonPath(String str) {
        this.materialJsonPath = str;
    }

    @Override // com.taobao.taopai.material.bean.MaterialDetail
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        MaterialResource materialResource = (MaterialResource) obj;
        return Objects.equals(getDirPath(), materialResource.getDirPath()) && Objects.equals(getMaterialJsonPath(), materialResource.getMaterialJsonPath());
    }

    @Override // com.taobao.taopai.material.bean.MaterialDetail
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), getDirPath(), getMaterialJsonPath());
    }

    public String toString() {
        return "MaterialResource{dirPath='" + this.dirPath + "', materialJsonPath='" + this.materialJsonPath + "'}";
    }

    public void copyFrom(com.taobao.taopai2.material.business.res.MaterialResource materialResource) {
        if (materialResource == null) {
            return;
        }
        super.copyFrom((MaterialDetailBean) materialResource);
        setDirPath(materialResource.dirPath);
        setMaterialJsonPath(materialResource.materialJsonPath);
    }
}
