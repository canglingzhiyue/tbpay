package com.taobao.live.home.dinamic;

import com.taobao.live.home.c;
import com.taobao.live.home.dinamic.business.TemplateRequest;

/* loaded from: classes7.dex */
public class TemplateListRequest implements TemplateRequest {
    private String API_NAME = "mtop.mediaplatform.live.videolist.template.list";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    private String appVersion = c.a();

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    @Override // com.taobao.live.home.dinamic.business.TemplateRequest
    public String toString() {
        return this.API_NAME + this.VERSION + this.appVersion;
    }
}
