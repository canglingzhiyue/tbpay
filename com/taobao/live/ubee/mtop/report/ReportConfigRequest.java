package com.taobao.live.ubee.mtop.report;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class ReportConfigRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.iliad.event.report.config";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;

    static {
        kge.a(2072535955);
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
