package com.taobao.share.core.share.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class GetBizActivityInfoResponseData implements IMTOPDataObject {
    public String bizcode;
    public boolean isChangeParams;
    public boolean showActivity;
    public String targetUrl;
    public String title;

    static {
        kge.a(1497876239);
        kge.a(-350052935);
    }

    public boolean getShowActivity() {
        return this.showActivity;
    }

    public void setShowActivity(boolean z) {
        this.showActivity = z;
    }

    public String getBizcode() {
        return this.bizcode;
    }

    public void setBizcode(String str) {
        this.bizcode = str;
    }

    public String getTargetUrl() {
        return this.targetUrl;
    }

    public void setTargetUrl(String str) {
        this.targetUrl = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
