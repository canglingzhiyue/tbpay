package com.taobao.tao.channel.mtop;

import com.taobao.share.globalmodel.e;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class GetNewBizConfigRequest implements IMTOPDataObject {
    public String bizCode;
    public String targetUrl;
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = true;
    public String API_NAME = e.GETBIZCONFIG;

    static {
        kge.a(-88707873);
        kge.a(-350052935);
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
