package com.alibaba.security.client.smart.core.core.remote;

/* loaded from: classes3.dex */
public interface ITaobaoRemoteSoService {
    boolean isRemoteSoLoaded(String str);

    void loadRemoteSo(String str, OnRemoteSoLoadListener onRemoteSoLoadListener);
}
