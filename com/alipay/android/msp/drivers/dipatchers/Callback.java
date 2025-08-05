package com.alipay.android.msp.drivers.dipatchers;

/* loaded from: classes3.dex */
public interface Callback {
    void onFailure(Call call, Exception exc);

    void onResponse(Call call, MspResponse mspResponse) throws Exception;
}
