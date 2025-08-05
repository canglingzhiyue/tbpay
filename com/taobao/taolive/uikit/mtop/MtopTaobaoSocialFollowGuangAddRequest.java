package com.taobao.taolive.uikit.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopTaobaoSocialFollowGuangAddRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.social.follow.guang.add";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String targetUserIdStr = null;
    private String originBiz = null;
    private String keyName = null;
    private String originFlag = null;
    private String originPage = null;

    static {
        kge.a(1295093888);
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

    public String getTargetUserIdStr() {
        return this.targetUserIdStr;
    }

    public void setTargetUserIdStr(String str) {
        this.targetUserIdStr = str;
    }

    public String getOriginBiz() {
        return this.originBiz;
    }

    public void setOriginBiz(String str) {
        this.originBiz = str;
    }

    public String getKeyName() {
        return this.keyName;
    }

    public void setKeyName(String str) {
        this.keyName = str;
    }

    public String getOriginFlag() {
        return this.originFlag;
    }

    public void setOriginFlag(String str) {
        this.originFlag = str;
    }

    public String getOriginPage() {
        return this.originPage;
    }

    public void setOriginPage(String str) {
        this.originPage = str;
    }
}
