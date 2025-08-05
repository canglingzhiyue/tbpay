package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopTaobaoWirelessAmp2BcMessageSendRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.wireless.amp2.bc.message.send";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private long receiverId = 0;
    private String receiverEncryptId = null;
    private String message = null;
    private String receiverNick = null;

    static {
        kge.a(-1514998334);
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

    public long getReceiverId() {
        return this.receiverId;
    }

    public void setReceiverId(long j) {
        this.receiverId = j;
    }

    public String getReceiverEncryptId() {
        return this.receiverEncryptId;
    }

    public void setReceiverEncryptId(String str) {
        this.receiverEncryptId = str;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String getReceiverNick() {
        return this.receiverNick;
    }

    public void setReceiverNick(String str) {
        this.receiverNick = str;
    }
}
