package com.alipay.mobile.verifyidentity.rpc;

/* loaded from: classes3.dex */
public interface IRpcService {
    <T> T getRpcProxy(Class<T> cls);

    void setGW(String str);
}
