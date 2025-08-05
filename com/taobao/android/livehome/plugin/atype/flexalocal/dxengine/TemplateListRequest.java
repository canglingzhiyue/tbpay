package com.taobao.android.livehome.plugin.atype.flexalocal.dxengine;

import com.taobao.android.livehome.plugin.atype.flexalocal.TaoLiveHomePageX;
import com.taobao.live.home.dinamic.business.TemplateRequest;
import tb.kge;

/* loaded from: classes6.dex */
public class TemplateListRequest implements TemplateRequest {
    private String appVersion;
    private String API_NAME = "mtop.mediaplatform.live.videolist.template.list";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;

    static {
        kge.a(617052683);
        kge.a(52802246);
    }

    public TemplateListRequest(String str) {
        this.appVersion = TaoLiveHomePageX.getAppVersion(str);
    }

    @Override // com.taobao.live.home.dinamic.business.TemplateRequest
    public String toString() {
        return this.API_NAME + this.VERSION + this.appVersion;
    }
}
