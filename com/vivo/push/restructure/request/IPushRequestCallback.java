package com.vivo.push.restructure.request;

/* loaded from: classes9.dex */
public interface IPushRequestCallback<T> {
    void onError(int i);

    void onSuccess(T t);
}
