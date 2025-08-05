package com.taobao.alimama.net.pojo.request;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class AlimamaTkQueryChanneleRequest implements IMTOPDataObject {
    public String API_NAME = "mtop.taobao.union.qogir.querychannele";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;
    public String dynamicChannelId = null;
    public String extraInfo = null;

    static {
        kge.a(-386360283);
        kge.a(-350052935);
    }
}
