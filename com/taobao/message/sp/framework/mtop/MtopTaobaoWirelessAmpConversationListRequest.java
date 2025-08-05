package com.taobao.message.sp.framework.mtop;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopTaobaoWirelessAmpConversationListRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.wireless.amp.conversation.list";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private boolean unRead = false;
    private long fetchCount = 0;
    private String appName = null;
    private String startTime = null;
    private String msgChannelTypeList = null;
    private String source = null;

    static {
        kge.a(-1723652963);
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

    public boolean isUnRead() {
        return this.unRead;
    }

    public void setUnRead(boolean z) {
        this.unRead = z;
    }

    public long getFetchCount() {
        return this.fetchCount;
    }

    public void setFetchCount(long j) {
        this.fetchCount = j;
    }

    public String getAppName() {
        return this.appName;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public String getMsgChannelTypeList() {
        return this.msgChannelTypeList;
    }

    public void setMsgChannelTypeList(String str) {
        this.msgChannelTypeList = str;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String str) {
        this.source = str;
    }
}
