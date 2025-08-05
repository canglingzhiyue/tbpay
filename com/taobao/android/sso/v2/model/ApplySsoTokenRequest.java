package com.taobao.android.sso.v2.model;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class ApplySsoTokenRequest implements Serializable {
    public String appVersion;
    public String deviceTokenKey;
    public String deviceTokenSign;
    public String hid;
    public String masterAppKey;
    public long masterT;
    public String sdkVersion;
    public String sid;
    public String sign;
    public String slaveAppKey;
    public String slaveBundleId;
    public long slaveT;
    public String ssoVersion;
    public String targetUrl;
    public String uuidKey;

    static {
        kge.a(-1199687939);
        kge.a(1028243835);
    }
}
