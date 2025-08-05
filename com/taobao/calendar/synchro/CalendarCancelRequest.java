package com.taobao.calendar.synchro;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class CalendarCancelRequest implements IMTOPDataObject {
    public String bizId;
    public String outIds;
    public String API_NAME = "mtop.taobao.cal.event.cancel";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;

    static {
        kge.a(1192861876);
        kge.a(-350052935);
    }
}
