package com.alipay.android.msp.plugin;

import android.app.Activity;
import com.alipay.android.msp.core.callback.FingerprintPayCallback;
import com.alipay.android.msp.plugin.model.FingerprintPayRequest;
import com.alipay.android.msp.plugin.model.FingerprintPayResult;

/* loaded from: classes3.dex */
public interface IFingerprintPlugin {
    void cancel();

    void cancelVerify();

    FingerprintPayResult checkUpdate();

    int checkUserStatus(String str) throws Throwable;

    int getRegisteredNumber() throws Throwable;

    FingerprintPayResult initHardwarePay(String str) throws Throwable;

    FingerprintPayResult openFingerprintManager();

    void register(FingerprintPayRequest fingerprintPayRequest, FingerprintPayCallback fingerprintPayCallback);

    void registerWithDialog(Activity activity, FingerprintPayRequest fingerprintPayRequest, FingerprintPayCallback fingerprintPayCallback);

    void unregister(FingerprintPayRequest fingerprintPayRequest);

    void verify(FingerprintPayRequest fingerprintPayRequest, FingerprintPayCallback fingerprintPayCallback);

    void verifyWithDialog(Activity activity, FingerprintPayRequest fingerprintPayRequest, FingerprintPayCallback fingerprintPayCallback);
}
