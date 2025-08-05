package com.taobao.taopai.material.request.musiclist;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MusicListRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.alibaba.tspeditor.material.music.list";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private String searchTerms = null;
    private String bizScene = null;
    private long clientVer = 0;
    private long pageSize = 0;
    private long page = 0;
    private long category = 0;
    private String bizLine = null;

    static {
        kge.a(-777717990);
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

    public String getSearchTerms() {
        return this.searchTerms;
    }

    public void setSearchTerms(String str) {
        this.searchTerms = str;
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

    public long getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(long j) {
        this.pageSize = j;
    }

    public long getPage() {
        return this.page;
    }

    public void setPage(long j) {
        this.page = j;
    }

    public long getCategory() {
        return this.category;
    }

    public void setCategory(long j) {
        this.category = j;
    }

    public String getBizLine() {
        return this.bizLine;
    }

    public void setBizLine(String str) {
        this.bizLine = str;
    }
}
