package com.taobao.taopai.material.bean;

import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import java.io.Serializable;
import java.util.Objects;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MaterialDetail implements Serializable, IMTOPDataObject {
    private String creatorName;
    private String extend;
    private String frontIdsString;
    private String logoUrl;
    private int materialType;
    private long modifiedTime;
    private String name;
    private String resourceExtUrl;
    private String resourceUrl;
    private int tid;
    private int version;

    static {
        kge.a(-382613899);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public int getTid() {
        return this.tid;
    }

    public void setTid(int i) {
        this.tid = i;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public void setModifiedTime(long j) {
        this.modifiedTime = j;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    public void setLogoUrl(String str) {
        this.logoUrl = str;
    }

    public String getResourceUrl() {
        return this.resourceUrl;
    }

    public void setResourceUrl(String str) {
        this.resourceUrl = str;
    }

    public int getMaterialType() {
        return this.materialType;
    }

    public void setMaterialType(int i) {
        this.materialType = i;
    }

    public String getCreatorName() {
        return this.creatorName;
    }

    public void setCreatorName(String str) {
        this.creatorName = str;
    }

    public int getVersion() {
        return this.version;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public String getExtend() {
        return this.extend;
    }

    public void setExtend(String str) {
        this.extend = str;
    }

    public String getFrontIdsString() {
        return this.frontIdsString;
    }

    public void setFrontIdsString(String str) {
        this.frontIdsString = str;
    }

    public String getResourceExtUrl() {
        return this.resourceExtUrl;
    }

    public void setResourceExtUrl(String str) {
        this.resourceExtUrl = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MaterialDetail materialDetail = (MaterialDetail) obj;
            if (getTid() == materialDetail.getTid() && getVersion() == materialDetail.getVersion() && getModifiedTime() == materialDetail.getModifiedTime() && getMaterialType() == materialDetail.getMaterialType() && Objects.equals(getName(), materialDetail.getName()) && Objects.equals(getLogoUrl(), materialDetail.getLogoUrl()) && Objects.equals(getResourceUrl(), materialDetail.getResourceUrl()) && Objects.equals(getCreatorName(), materialDetail.getCreatorName()) && Objects.equals(this.frontIdsString, materialDetail.frontIdsString) && Objects.equals(getExtend(), materialDetail.getExtend()) && Objects.equals(getResourceExtUrl(), materialDetail.getResourceExtUrl())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(getTid()), Integer.valueOf(getVersion()), getName(), Long.valueOf(getModifiedTime()), getLogoUrl(), getResourceUrl(), Integer.valueOf(getMaterialType()), getCreatorName(), this.frontIdsString, getExtend(), getResourceExtUrl());
    }

    public void copyFrom(MaterialDetailBean materialDetailBean) {
        if (materialDetailBean == null) {
            return;
        }
        setTid((int) materialDetailBean.id);
        setLogoUrl(materialDetailBean.logoUrl);
        setMaterialType(materialDetailBean.materialType);
        setName(materialDetailBean.name);
        setResourceUrl(materialDetailBean.resourceUrl);
        setModifiedTime(materialDetailBean.lastModified);
        setVersion(materialDetailBean.version);
        setExtend(materialDetailBean.extend);
    }
}
