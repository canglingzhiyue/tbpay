package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopAmpAmpserviceGetbatchampuserinfoforimRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.amp.ampservice.getbatchampuserinfoforim";
    private String VERSION = "4.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private long role = 0;
    private String targetUserIdMapJson = null;
    private long channel = 0;
    private String targetUserNickMapJson = null;

    static {
        kge.a(1830045965);
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

    public long getRole() {
        return this.role;
    }

    public void setRole(long j) {
        this.role = j;
    }

    public String getTargetUserIdMapJson() {
        return this.targetUserIdMapJson;
    }

    public void setTargetUserIdMapJson(String str) {
        this.targetUserIdMapJson = str;
    }

    public long getChannel() {
        return this.channel;
    }

    public void setChannel(long j) {
        this.channel = j;
    }

    public String getTargetUserNickMapJson() {
        return this.targetUserNickMapJson;
    }

    public void setTargetUserNickMapJson(String str) {
        this.targetUserNickMapJson = str;
    }
}
