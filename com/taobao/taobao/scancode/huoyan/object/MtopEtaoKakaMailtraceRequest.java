package com.taobao.taobao.scancode.huoyan.object;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopEtaoKakaMailtraceRequest implements IMTOPDataObject {
    public String bizType;
    public String API_NAME = "mtop.taobao.aplatform.weakGet";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = true;
    public String bizParam = null;

    static {
        kge.a(950738574);
        kge.a(-350052935);
    }
}
