package com.taobao.taopai.material.request.musicetype;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MusicTypeListRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.alibaba.tspeditor.material.music.category.list";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private String bizScene = null;
    private long clientVer = 0;
    private String bizLine = null;
    private boolean onlyCategory = true;

    static {
        kge.a(1698952133);
        kge.a(-350052935);
    }

    public boolean isOnlyCategory() {
        return this.onlyCategory;
    }

    public void setOnlyCategory(boolean z) {
        this.onlyCategory = z;
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

    public String getBizLine() {
        return this.bizLine;
    }

    public void setBizLine(String str) {
        this.bizLine = str;
    }
}
