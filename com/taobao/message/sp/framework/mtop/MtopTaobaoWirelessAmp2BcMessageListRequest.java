package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopTaobaoWirelessAmp2BcMessageListRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.wireless.amp2.bc.message.list";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private long cursor = 0;
    private String targetEncryptId = null;
    private boolean forward = false;
    private long count = 0;
    private long targetUserId = 0;
    private String targetUserNick = null;

    static {
        kge.a(-939470868);
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

    public long getCursor() {
        return this.cursor;
    }

    public void setCursor(long j) {
        this.cursor = j;
    }

    public String getTargetEncryptId() {
        return this.targetEncryptId;
    }

    public void setTargetEncryptId(String str) {
        this.targetEncryptId = str;
    }

    public boolean isForward() {
        return this.forward;
    }

    public void setForward(boolean z) {
        this.forward = z;
    }

    public long getCount() {
        return this.count;
    }

    public void setCount(long j) {
        this.count = j;
    }

    public long getTargetUserId() {
        return this.targetUserId;
    }

    public void setTargetUserId(long j) {
        this.targetUserId = j;
    }

    public String getTargetUserNick() {
        return this.targetUserNick;
    }

    public void setTargetUserNick(String str) {
        this.targetUserNick = str;
    }
}
