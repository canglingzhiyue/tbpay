package com.taobao.share.taopassword.busniess.mtop.response;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData implements IMTOPDataObject {
    private String content;
    private String createTime;
    private String longUrl;
    private String password;
    public String shareDataTrack;
    private String switchNewWx;
    private String url;
    private String validDate;

    static {
        kge.a(-328188618);
        kge.a(-350052935);
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setValidDate(String str) {
        this.validDate = str;
    }

    public String getValidDate() {
        return this.validDate;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getUrl() {
        return this.url;
    }

    public String getLongUrl() {
        return this.longUrl;
    }

    public void setLongUrl(String str) {
        this.longUrl = str;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setSwitchNewWx(String str) {
        this.switchNewWx = str;
    }

    public String getSwitchNewWx() {
        return this.switchNewWx;
    }
}
