package com.alipay.mobile.verifyidentity.dataprovider;

/* loaded from: classes3.dex */
public interface AppDataProvider {
    String getApdid();

    String getApdidToken();

    @Deprecated
    String getAppKey();

    String getAppName();

    String getAppVersion();

    @Deprecated
    String getTid();

    @Deprecated
    String getUmidToken();
}
