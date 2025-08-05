package com.taobao.calendar.sdk.synchronize;

import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class MtopCalRemindSubmitAndUpdateRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.cal.remind.submitAndUpdate";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = true;
    private boolean NEED_SESSION = true;
    private List<ScheduleModel> submitData = null;
    private long lut = 0;

    static {
        kge.a(-1708044608);
        kge.a(-350052935);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public long getLut() {
        return this.lut;
    }

    public List<ScheduleModel> getSubmitData() {
        return this.submitData;
    }

    public String getVERSION() {
        return this.VERSION;
    }

    public boolean isNEED_ECODE() {
        return this.NEED_ECODE;
    }

    public boolean isNEED_SESSION() {
        return this.NEED_SESSION;
    }

    public void setAPI_NAME(String str) {
        this.API_NAME = str;
    }

    public void setLut(long j) {
        this.lut = j;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public void setSubmitData(List<ScheduleModel> list) {
        this.submitData = list;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }
}
