package com.taobao.share.core.contacts.mtop.request;

import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class ContactsInfoRequest implements IMTOPDataObject {
    public String API_NAME = "mtop.taobao.sharepassword.taoContacts";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public Map<String, Object> params = new HashMap();
    public int type = 1;

    static {
        kge.a(-1183962378);
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
}
