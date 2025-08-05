package com.taobao.tao.backflow.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class TaoPassWordRequest implements IMTOPDataObject {
    public String passwordContent;
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    public String API_NAME = "mtop.taobao.sharepassword.userTipOff";

    static {
        kge.a(-273900769);
        kge.a(-350052935);
    }

    public String getPasswordContent() {
        return this.passwordContent;
    }

    public void setPasswordContent(String str) {
        this.passwordContent = str;
    }
}
