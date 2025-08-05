package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopTaobaoWirelessAmp2BcConversationCreateRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.wireless.amp2.bc.conversation.create";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String receiverMainEncryptId = null;
    private String receiverMainNick = null;

    static {
        kge.a(1531669902);
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

    public String getReceiverMainEncryptId() {
        return this.receiverMainEncryptId;
    }

    public void setReceiverMainEncryptId(String str) {
        this.receiverMainEncryptId = str;
    }

    public String getReceiverMainNick() {
        return this.receiverMainNick;
    }

    public void setReceiverMainNick(String str) {
        this.receiverMainNick = str;
    }
}
