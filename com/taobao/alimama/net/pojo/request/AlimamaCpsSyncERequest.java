package com.taobao.alimama.net.pojo.request;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

@Deprecated
/* loaded from: classes4.dex */
public class AlimamaCpsSyncERequest implements IMTOPDataObject {
    public String extraParams;
    public String API_NAME = "mtop.alimama.cps.trace.adSession.sync";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;

    static {
        kge.a(-1817814398);
        kge.a(-350052935);
    }
}
