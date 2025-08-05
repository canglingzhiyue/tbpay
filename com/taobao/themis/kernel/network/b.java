package com.taobao.themis.kernel.network;

/* loaded from: classes9.dex */
public interface b<T, D> {
    void onFailure(String str, String str2, D d);

    void onSuccess(T t);
}
