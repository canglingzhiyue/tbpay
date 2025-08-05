package com.taobao.calendar.sdk.synchronize;

import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class MtopCalRemindSubmitAndUpdateResponseData implements Serializable, IMTOPDataObject {
    private Long lut;
    private boolean needUpdate;
    private List<ScheduleModel> updateData;

    static {
        kge.a(-1953101318);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public Long getLut() {
        return this.lut;
    }

    public List<ScheduleModel> getUpdateData() {
        return this.updateData;
    }

    public boolean isNeedUpdate() {
        return this.needUpdate;
    }

    public void setLut(Long l) {
        this.lut = l;
    }

    public void setNeedUpdate(boolean z) {
        this.needUpdate = z;
    }

    public void setUpdateData(List<ScheduleModel> list) {
        this.updateData = list;
    }
}
