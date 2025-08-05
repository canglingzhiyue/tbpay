package com.taobao.taopai.material.request.materialcategory;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class CategoryListRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.acp.taopai.material.category.list";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private long materialType = 0;
    private long templateId = 0;
    private String bizLine = null;

    static {
        kge.a(-1083968085);
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

    public long getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(long j) {
        this.templateId = j;
    }

    public String getBizLine() {
        return this.bizLine;
    }

    public void setBizLine(String str) {
        this.bizLine = str;
    }
}
