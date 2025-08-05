package com.alipay.android.msp.core.callback;

import com.alipay.android.msp.plugin.model.FingerprintPayResult;

/* loaded from: classes3.dex */
public interface FingerprintPayCallback {
    void onCallback(FingerprintPayResult fingerprintPayResult);

    void onProgressChanged(boolean z, FingerprintPayResult fingerprintPayResult);
}
