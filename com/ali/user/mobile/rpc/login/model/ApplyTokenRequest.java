package com.ali.user.mobile.rpc.login.model;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class ApplyTokenRequest implements Serializable {
    public String appName;
    public String appVersion;
    public String deviceTokenKey;
    public String deviceTokenSign;
    public String sdkVersion;
    public String sid;
    public int site;
    public long t;
    public boolean useDeviceToken = true;

    static {
        kge.a(1569387494);
        kge.a(1028243835);
    }
}
