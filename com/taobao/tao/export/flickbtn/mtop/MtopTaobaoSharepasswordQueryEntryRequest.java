package com.taobao.tao.export.flickbtn.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopTaobaoSharepasswordQueryEntryRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.sharepassword.queryEntry";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String bizcode = null;
    private String extendMap = null;
    private String targetType = null;
    private String id = null;

    static {
        kge.a(1424691621);
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

    public String getBizcode() {
        return this.bizcode;
    }

    public void setBizcode(String str) {
        this.bizcode = str;
    }

    public String getExtendMap() {
        return this.extendMap;
    }

    public void setExtendMap(String str) {
        this.extendMap = str;
    }

    public String getTargetType() {
        return this.targetType;
    }

    public void setTargetType(String str) {
        this.targetType = str;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }
}
