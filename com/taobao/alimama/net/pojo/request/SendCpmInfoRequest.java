package com.taobao.alimama.net.pojo.request;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class SendCpmInfoRequest implements IMTOPDataObject {
    private String accept;
    private String clickid;
    private String cna;
    private String e;
    private String ext;
    private String referer;
    private String useragent;
    private String utdid;
    public String API_NAME = "mtop.wdcmunion.sendCpmClickLog";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = true;

    static {
        kge.a(-1034615386);
        kge.a(-350052935);
    }

    public String getCna() {
        return this.cna;
    }

    public void setCna(String str) {
        this.cna = str;
    }

    public String getUtdid() {
        return this.utdid;
    }

    public void setUtdid(String str) {
        this.utdid = str;
    }

    public String getE() {
        return this.e;
    }

    public void setE(String str) {
        this.e = str;
    }

    public String getReferer() {
        return this.referer;
    }

    public void setReferer(String str) {
        this.referer = str;
    }

    public String getAccept() {
        return this.accept;
    }

    public void setAccept(String str) {
        this.accept = str;
    }

    public String getUseragent() {
        return this.useragent;
    }

    public void setUseragent(String str) {
        this.useragent = str;
    }

    public String getExt() {
        return this.ext;
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public String getClickid() {
        return this.clickid;
    }

    public void setClickid(String str) {
        this.clickid = str;
    }
}
