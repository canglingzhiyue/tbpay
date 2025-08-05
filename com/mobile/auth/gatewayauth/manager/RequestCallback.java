package com.mobile.auth.gatewayauth.manager;

/* loaded from: classes4.dex */
public interface RequestCallback<T, K> {
    void onError(K k);

    void onSuccess(T t);
}
