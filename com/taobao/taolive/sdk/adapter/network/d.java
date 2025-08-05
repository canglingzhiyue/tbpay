package com.taobao.taolive.sdk.adapter.network;

/* loaded from: classes8.dex */
public interface d {
    void onError(int i, NetResponse netResponse, Object obj);

    void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj);

    void onSystemError(int i, NetResponse netResponse, Object obj);
}
