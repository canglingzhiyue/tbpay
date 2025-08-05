package com.vivo.push.listener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public interface IPushRequestListener<T, V> {
    void onFail(V v);

    void onSuccess(T t);
}
