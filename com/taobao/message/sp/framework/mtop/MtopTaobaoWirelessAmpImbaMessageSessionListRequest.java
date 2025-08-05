package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopTaobaoWirelessAmpImbaMessageSessionListRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.wireless.amp.imba.message.session.list";
    private String VERSION = "3.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private String lastMsgId = null;
    private String accessKey = null;
    private String conversationId = null;
    private long pageSize = 0;
    private String tag = null;
    private String accessToken = null;
    private long lastMsgTime = 0;
    private long direction = 0;

    static {
        kge.a(-1418245458);
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

    public String getLastMsgId() {
        return this.lastMsgId;
    }

    public void setLastMsgId(String str) {
        this.lastMsgId = str;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public long getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(long j) {
        this.pageSize = j;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public long getLastMsgTime() {
        return this.lastMsgTime;
    }

    public void setLastMsgTime(long j) {
        this.lastMsgTime = j;
    }

    public long getDirection() {
        return this.direction;
    }

    public void setDirection(long j) {
        this.direction = j;
    }
}
