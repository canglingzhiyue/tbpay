package com.taobao.alimama.net.pojo.request;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class SendCpcInfoRequest implements IMTOPDataObject {
    private String accept;
    private String clickid;
    private String cna;
    private String e;
    private String ext;
    private String host;
    private String referer;
    private String utdid;
    private String utkey;
    private String utsid;
    public String API_NAME = "mtop.wdcmunion.sendCpcClickLog";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = true;

    static {
        kge.a(1969524720);
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

    public String getUtkey() {
        return this.utkey;
    }

    public void setUtkey(String str) {
        this.utkey = str;
    }

    public String getUtsid() {
        return this.utsid;
    }

    public void setUtsid(String str) {
        this.utsid = str;
    }

    public String getHost() {
        return this.host;
    }

    public void setHost(String str) {
        this.host = str;
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
