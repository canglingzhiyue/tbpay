package com.ali.user.mobile.model;

/* loaded from: classes2.dex */
public interface AutoLoginCallback {
    void onBizFail(int i, String str);

    void onNetworkError();

    void onSuccess();
}
