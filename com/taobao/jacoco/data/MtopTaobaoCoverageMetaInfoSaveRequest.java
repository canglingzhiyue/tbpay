package com.taobao.jacoco.data;

import mtopsdk.mtop.domain.IMTOPDataObject;

/* loaded from: classes7.dex */
public class MtopTaobaoCoverageMetaInfoSaveRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.coverage.meta.info.save";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private String param = null;
    private String mtlBuildId = null;
    private String ossObjectKey = null;

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

    public String getParam() {
        return this.param;
    }

    public void setParam(String str) {
        this.param = str;
    }

    public String getMtlBuildId() {
        return this.mtlBuildId;
    }

    public void setMtlBuildId(String str) {
        this.mtlBuildId = str;
    }

    public String getOssObjectKey() {
        return this.ossObjectKey;
    }

    public void setOssObjectKey(String str) {
        this.ossObjectKey = str;
    }
}
