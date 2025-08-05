package com.taobao.tao.shop.rule.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopShopRuleVersionedRulesRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.shop.rule.versioned.rules";
    private String VERSION = "2.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private String version = null;
    private String bizType = null;

    static {
        kge.a(-1709425272);
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

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setBizType(String str) {
        this.bizType = str;
    }

    public String getBizType() {
        return this.bizType;
    }
}
