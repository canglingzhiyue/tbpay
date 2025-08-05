package com.alipay.share.sdk.openapi;

import android.content.Intent;

/* loaded from: classes3.dex */
public interface IAPApi {
    int getZFBVersionCode();

    boolean handleIntent(Intent intent, IAPAPIEventHandler iAPAPIEventHandler);

    boolean isZFBAppInstalled();

    boolean isZFBSupportAPI();

    boolean openZFBApp();

    boolean sendReq(BaseReq baseReq);
}
