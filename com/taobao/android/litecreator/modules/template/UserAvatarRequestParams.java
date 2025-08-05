package com.taobao.android.litecreator.modules.template;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes5.dex */
public class UserAvatarRequestParams implements IMTOPDataObject {
    private String VERSION = "1.0";
    private boolean NEED_SESSION = true;
    private String API_NAME = "mtop.media.guang.activity.userinfo";

    static {
        kge.a(1613595560);
        kge.a(-350052935);
    }

    public String getAPI() {
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

    public boolean isNEED_SESSION() {
        return this.NEED_SESSION;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }
}
