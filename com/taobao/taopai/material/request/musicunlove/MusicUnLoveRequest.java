package com.taobao.taopai.material.request.musicunlove;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MusicUnLoveRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.alibaba.tspeditor.material.music.cancelLike";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private long vendorType = 0;
    private String bizScene = null;
    private long clientVer = 0;
    private String id = null;
    private String bizLine = null;

    static {
        kge.a(-1058265632);
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

    public long getVendorType() {
        return this.vendorType;
    }

    public void setVendorType(long j) {
        this.vendorType = j;
    }

    public String getBizScene() {
        return this.bizScene;
    }

    public void setBizScene(String str) {
        this.bizScene = str;
    }

    public long getClientVer() {
        return this.clientVer;
    }

    public void setClientVer(long j) {
        this.clientVer = j;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String getBizLine() {
        return this.bizLine;
    }

    public void setBizLine(String str) {
        this.bizLine = str;
    }
}
