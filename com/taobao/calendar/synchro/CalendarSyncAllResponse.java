package com.taobao.calendar.synchro;

import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes6.dex */
public class CalendarSyncAllResponse extends BaseOutDo implements Serializable {
    private ResponseData data;

    /* loaded from: classes6.dex */
    public static class ResponseData {
        public List<ScheduleDTOModule> result;

        static {
            kge.a(-754893335);
        }
    }

    static {
        kge.a(-1657909850);
        kge.a(1028243835);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public ResponseData mo2429getData() {
        return this.data;
    }

    public void setData(ResponseData responseData) {
        this.data = responseData;
    }
}
