package com.taobao.passivelocation.business.report_error;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopLbsReportLocationErrResponseData implements IMTOPDataObject {
    private String msgCode = null;
    private String msgInfo = null;
    private boolean success = false;

    static {
        kge.a(2065860123);
        kge.a(-350052935);
    }

    public String getMsgCode() {
        return this.msgCode;
    }

    public void setMsgCode(String str) {
        this.msgCode = str;
    }

    public String getMsgInfo() {
        return this.msgInfo;
    }

    public void setMsgInfo(String str) {
        this.msgInfo = str;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }
}
