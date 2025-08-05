package com.taobao.share.visualcode;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopGetShortUrlByGen3Request implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.sharepassword.getShortUrlByGen3";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private String gen3code = null;

    static {
        kge.a(1043995955);
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

    public String getGen3code() {
        return this.gen3code;
    }

    public void setGen3code(String str) {
        this.gen3code = str;
    }
}
