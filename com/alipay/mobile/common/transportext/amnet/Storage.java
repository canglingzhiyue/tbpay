package com.alipay.mobile.common.transportext.amnet;

/* loaded from: classes3.dex */
public interface Storage {

    /* loaded from: classes3.dex */
    public interface Result {
        void callbackData(String str, byte[] bArr);
    }

    byte[] getBigData(String str, boolean z);

    void getBigDataAsync(String str, boolean z, int i, Result result);

    byte[] getCommon(String str);

    byte[] getSecure(String str);

    void putBigDataAsync(String str, byte[] bArr, boolean z);

    void putCommit();

    void putCommon(String str, byte[] bArr);

    void putCommonAsync(String str, byte[] bArr);

    void putCommonTransmit(String str, byte[] bArr);

    void putSecure(String str, byte[] bArr);

    void putSecureAsync(String str, byte[] bArr);

    void putSecureTransmit(String str, byte[] bArr);

    void removeBigData(String str);

    void removeCommon(String str);
}
