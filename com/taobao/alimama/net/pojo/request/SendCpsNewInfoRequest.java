package com.taobao.alimama.net.pojo.request;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class SendCpsNewInfoRequest implements IMTOPDataObject {
    public String eParam;
    public String eUrl;
    public String API_NAME = "mtop.alimama.cps.trace.aliTrackId.get";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = true;

    static {
        kge.a(1875517442);
        kge.a(-350052935);
    }
}
