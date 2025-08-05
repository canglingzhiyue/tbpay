package com.taobao.live.ubee.mtop.report;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class EventReportRequest implements IMTOPDataObject {
    public Long anchorId;
    public String liveEventsJson;
    public Long liveId;
    private String API_NAME = "mtop.taobao.iliad.event.report.batch";
    private String VERSION = "2.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;

    static {
        kge.a(-1102092409);
        kge.a(-350052935);
    }

    public void setApiName(String str) {
        this.API_NAME = str;
    }

    public void setVersion(String str) {
        this.VERSION = str;
    }

    public void setNeedeCode(boolean z) {
        this.NEED_ECODE = z;
    }
}
