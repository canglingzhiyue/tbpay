package com.alipay.android.app.smartpays.api.callback;

import com.alipay.android.app.smartpays.api.model.FingerprintResult;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public interface IFingerprintCallback {
    void onCallBack(FingerprintResult fingerprintResult);

    void onProgressChanged(boolean z, FingerprintResult fingerprintResult);
}
