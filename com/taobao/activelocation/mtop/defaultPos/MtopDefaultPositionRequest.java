package com.taobao.activelocation.mtop.defaultPos;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class MtopDefaultPositionRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.arctic.nearby.position.defaultPosition";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private String ssId = null;
    private String bssId = null;
    private String utdId = null;

    static {
        kge.a(-2077661213);
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

    public String getSsId() {
        return this.ssId;
    }

    public void setSsId(String str) {
        this.ssId = str;
    }

    public String getBssId() {
        return this.bssId;
    }

    public void setBssId(String str) {
        this.bssId = str;
    }

    public String getUtdId() {
        return this.utdId;
    }

    public void setUtdId(String str) {
        this.utdId = str;
    }
}
