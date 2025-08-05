package com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback;

import android.content.Context;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintResult;
import com.alipay.android.msp.utils.EventLogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class FingerprintProxyCallback implements IFingerprintCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context e;
    public IFingerprintCallback f;

    public abstract void a();

    public abstract void b();

    public FingerprintProxyCallback(Context context, IFingerprintCallback iFingerprintCallback) {
        this.e = context.getApplicationContext();
        this.f = iFingerprintCallback;
        a();
        EventLogUtil.logPayEvent("104851", "content_type", "FingerprintProxyCallback");
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.IFingerprintCallback
    public void onProgressChanged(boolean z, FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ba6a57", new Object[]{this, new Boolean(z), fingerprintResult});
            return;
        }
        IFingerprintCallback iFingerprintCallback = this.f;
        if (iFingerprintCallback == null) {
            return;
        }
        iFingerprintCallback.onProgressChanged(z, fingerprintResult);
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.IFingerprintCallback
    public void onCallBack(FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ff7d", new Object[]{this, fingerprintResult});
            return;
        }
        onProgressChanged(true, fingerprintResult);
        IFingerprintCallback iFingerprintCallback = this.f;
        if (iFingerprintCallback != null) {
            iFingerprintCallback.onCallBack(fingerprintResult);
        }
        b();
    }
}
