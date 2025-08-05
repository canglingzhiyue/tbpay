package com.taobao.alimama.net.pojo.request;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class AlimamaZzAdGetRequest implements IMTOPDataObject {
    public String X_Client_Scheme;
    public String retry;
    public String scene;
    public String API_NAME = "mtop.alimama.zz.ad.get";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = false;
    public String st = null;
    public String app_version = null;
    public String pvid = null;
    public String utdid = null;
    public String ip = null;
    public String pvoff = null;
    public String pid = "";
    public String userid = null;

    static {
        kge.a(-1128013883);
        kge.a(-350052935);
    }
}
