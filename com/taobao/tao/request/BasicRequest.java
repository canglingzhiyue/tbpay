package com.taobao.tao.request;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class BasicRequest implements IMTOPDataObject {
    protected String API_NAME;
    protected boolean NEED_ECODE;
    protected boolean NEED_SESSION;
    protected boolean ORIGINALJSON = true;
    protected String VERSION;
    protected String sid;

    static {
        kge.a(-1688424543);
        kge.a(-350052935);
    }

    public String getSid() {
        return this.sid;
    }

    public void setSid(String str) {
        this.sid = str;
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

    public boolean isORIGINALJSON() {
        return this.ORIGINALJSON;
    }

    public void setORIGINALJSON(boolean z) {
        this.ORIGINALJSON = z;
    }
}
