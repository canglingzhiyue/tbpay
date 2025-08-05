package com.taobao.taopai.material.request.materiallist;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MaterialListRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.acp.taopai.template.material.list";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private long materialType = 0;
    private long pageSize = 0;
    private long templateId = 0;
    private long currentPage = 0;
    private String bizLine = null;
    private long version = 0;
    private long categoryId = 0;
    private String frontIdsStr = null;

    static {
        kge.a(-1089852926);
        kge.a(-350052935);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public void setAPI_NAME(String str) {
        this.API_NAME = str;
    }

    public String getVERSION() {
        return this.VERSION;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }

    public boolean isNEED_ECODE() {
        return this.NEED_ECODE;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public boolean isNEED_SESSION() {
        return this.NEED_SESSION;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public long getMaterialType() {
        return this.materialType;
    }

    public void setMaterialType(long j) {
        this.materialType = j;
    }

    public long getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(long j) {
        this.pageSize = j;
    }

    public long getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(long j) {
        this.templateId = j;
    }

    public long getCurrentPage() {
        return this.currentPage;
    }

    public void setCurrentPage(long j) {
        this.currentPage = j;
    }

    public String getBizLine() {
        return this.bizLine;
    }

    public void setBizLine(String str) {
        this.bizLine = str;
    }

    public long getVersion() {
        return this.version;
    }

    public void setVersion(long j) {
        this.version = j;
    }

    public long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(long j) {
        this.categoryId = j;
    }

    public String getFrontIdsStr() {
        return this.frontIdsStr;
    }

    public void setFrontIdsStr(String str) {
        this.frontIdsStr = str;
    }
}
