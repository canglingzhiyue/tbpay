package com.taobao.alimama.net.pojo.request;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class AlimamaCpsActionRequest implements IMTOPDataObject {
    public String actionObjectId;
    public String actionObjectType;
    public String extraParams;
    public String initiativeActionType;
    public String API_NAME = "mtop.alimama.cps.initiativeaction.save";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;

    static {
        kge.a(1473799868);
        kge.a(-350052935);
    }
}
