package com.taobao.taopai.material.request.materialdetail;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MaterialDetailRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.acp.taopai.template.material.byId";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private long materialId = 0;

    static {
        kge.a(853599202);
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

    public long getMaterialId() {
        return this.materialId;
    }

    public void setMaterialId(long j) {
        this.materialId = j;
    }

    public void setMaterialId(String str) {
        this.materialId = Long.valueOf(str).longValue();
    }
}
