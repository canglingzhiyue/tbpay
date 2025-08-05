package com.taobao.calendar.sdk.synchronize;

import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class MtopGetScheduleByScanCodeResponseData implements Serializable, IMTOPDataObject {
    private List<ScheduleModel> resultData;

    static {
        kge.a(2111546335);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public List<ScheduleModel> getResultData() {
        return this.resultData;
    }

    public void setResultData(List<ScheduleModel> list) {
        this.resultData = list;
    }
}
