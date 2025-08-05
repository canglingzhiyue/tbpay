package com.taobao.mtop.api;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class Request implements Serializable {
    public String API_NAME;
    public String VERSION;
    public String exParams;
    public String itemNumId;
    public boolean needEcode;
    public boolean needLogin;
    public boolean wua;

    static {
        kge.a(2083901926);
        kge.a(1028243835);
    }
}
