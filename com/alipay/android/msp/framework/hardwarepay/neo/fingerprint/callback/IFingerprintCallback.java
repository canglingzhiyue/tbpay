package com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback;

import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintResult;

/* loaded from: classes3.dex */
public interface IFingerprintCallback {
    void onCallBack(FingerprintResult fingerprintResult);

    void onProgressChanged(boolean z, FingerprintResult fingerprintResult);
}
