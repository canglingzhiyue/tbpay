package com.alipay.android.app.smartpays.fingerprint.callback;

import android.content.Context;
import com.alipay.android.app.smartpays.api.callback.IFingerprintCallback;
import com.alipay.android.app.smartpays.api.model.FingerprintResult;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public abstract class FingerprintProxyCallback implements IFingerprintCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context f;
    public IFingerprintCallback g;

    public abstract void a();

    public abstract void b();

    public FingerprintProxyCallback(Context context, IFingerprintCallback iFingerprintCallback) {
        this.f = context.getApplicationContext();
        this.g = iFingerprintCallback;
        a();
    }

    @Override // com.alipay.android.app.smartpays.api.callback.IFingerprintCallback
    public void onProgressChanged(boolean z, FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b636ace", new Object[]{this, new Boolean(z), fingerprintResult});
            return;
        }
        IFingerprintCallback iFingerprintCallback = this.g;
        if (iFingerprintCallback == null) {
            return;
        }
        iFingerprintCallback.onProgressChanged(z, fingerprintResult);
    }

    @Override // com.alipay.android.app.smartpays.api.callback.IFingerprintCallback
    public void onCallBack(FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646591f4", new Object[]{this, fingerprintResult});
            return;
        }
        onProgressChanged(true, fingerprintResult);
        IFingerprintCallback iFingerprintCallback = this.g;
        if (iFingerprintCallback != null) {
            iFingerprintCallback.onCallBack(fingerprintResult);
        }
        b();
    }
}
