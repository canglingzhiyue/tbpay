package com.ali.user.mobile.rpc.login.model;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class WUAData implements Serializable {
    public String appKey;
    public String t;
    public String wua;

    static {
        kge.a(-4077297);
        kge.a(1028243835);
    }

    public WUAData(String str, String str2, String str3) {
        this.appKey = str;
        this.t = str2;
        this.wua = str3;
    }

    public WUAData() {
    }
}
