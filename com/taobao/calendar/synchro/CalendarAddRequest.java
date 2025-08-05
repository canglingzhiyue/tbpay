package com.taobao.calendar.synchro;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class CalendarAddRequest implements IMTOPDataObject {
    public String API_NAME = "mtop.taobao.cal.event.addOrUpdate";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = true;
    public boolean NEED_SESSION = true;
    public String submitData = "";

    static {
        kge.a(1428685071);
        kge.a(-350052935);
    }
}
