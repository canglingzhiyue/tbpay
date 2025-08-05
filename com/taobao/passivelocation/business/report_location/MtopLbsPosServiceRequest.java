package com.taobao.passivelocation.business.report_location;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopLbsPosServiceRequest implements IMTOPDataObject {
    private String locVersion;
    private String API_NAME = "mtop.taobao.lbs.posService";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private String loc = null;

    static {
        kge.a(1278731857);
        kge.a(-350052935);
    }

    public String getLocVersion() {
        return this.locVersion;
    }

    public void setLocVersion(String str) {
        this.locVersion = str;
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

    public String getLoc() {
        return this.loc;
    }

    public void setLoc(String str) {
        this.loc = str;
    }
}
