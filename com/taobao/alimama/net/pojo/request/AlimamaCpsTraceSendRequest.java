package com.taobao.alimama.net.pojo.request;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class AlimamaCpsTraceSendRequest implements IMTOPDataObject {
    public String API_NAME = "mtop.alimama.cps.trace.adsdk.send";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;
    public String ext = null;
    public long itemid = 0;
    public long sellerid = 0;
    public String utdid = null;
    public String emap = null;
    public long ismall = 0;

    static {
        kge.a(600460607);
        kge.a(-350052935);
    }
}
