package com.alipay.android.msp.api;

/* loaded from: classes3.dex */
public interface MspEnvProvider {
    String getLocale();

    boolean isLandMode();

    void printLog(int i, String str, String str2);
}
