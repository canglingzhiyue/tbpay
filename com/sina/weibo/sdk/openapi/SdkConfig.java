package com.sina.weibo.sdk.openapi;

import tb.kge;

/* loaded from: classes4.dex */
public class SdkConfig {
    private boolean userAgree;
    private boolean userAgreeWifiInfo;

    static {
        kge.a(-1017057271);
    }

    public boolean isUserAgree() {
        return this.userAgree;
    }

    public boolean isUserAgreeWifiInfo() {
        return this.userAgreeWifiInfo;
    }

    public void setUserAgree(boolean z) {
        this.userAgree = z;
    }

    public void setUserAgreeWifiInfo(boolean z) {
        this.userAgreeWifiInfo = z;
    }
}
