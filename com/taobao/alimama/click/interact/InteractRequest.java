package com.taobao.alimama.click.interact;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class InteractRequest implements IMTOPDataObject {
    public String accept;
    public String cna;
    public String e;
    public String ext;
    public String referer;
    public String useragent;
    public String utdid;
    public String API_NAME = "";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = true;

    static {
        kge.a(2090856067);
        kge.a(-350052935);
    }
}
