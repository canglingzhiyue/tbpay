package com.taobao.share.core.share.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class GetSharePanelBizActivityInfoRequest implements IMTOPDataObject {
    public String bizCode;
    public String bizParams;
    public String targetUrl;
    public String title;
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    public String API_NAME = "mtop.taobao.sharepassword.getSharePanelBizActivityInfo";

    static {
        kge.a(2019340624);
        kge.a(-350052935);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getBizParams() {
        return this.bizParams;
    }

    public void setBizParams(String str) {
        this.bizParams = str;
    }

    public String getBizCode() {
        return this.bizCode;
    }

    public void setBizCode(String str) {
        this.bizCode = str;
    }

    public String getTargetUrl() {
        return this.targetUrl;
    }

    public void setTargetUrl(String str) {
        this.targetUrl = str;
    }
}
