package com.taobao.calendar.synchro;

import java.io.Serializable;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes6.dex */
public class CalendarAddOrCancelResponse extends BaseOutDo implements Serializable {
    private CalendarResponseData data;

    /* loaded from: classes6.dex */
    public static class CalendarResponseData {
        public String result;

        static {
            kge.a(1991158735);
        }
    }

    static {
        kge.a(1745166110);
        kge.a(1028243835);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public CalendarResponseData mo2429getData() {
        return this.data;
    }

    public void setData(CalendarResponseData calendarResponseData) {
        this.data = calendarResponseData;
    }
}
