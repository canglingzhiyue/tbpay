package com.ali.user.mobile.register.model;

import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class BaseRegistRequest implements Serializable {
    public String countryCode;
    public Map<String, String> ext;
    public String mobileNo;
    public String regFrom;
    public int registSite;
    public String sessionId;

    static {
        kge.a(-1101399266);
        kge.a(1028243835);
    }
}
