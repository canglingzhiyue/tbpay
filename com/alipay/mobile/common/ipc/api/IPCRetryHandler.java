package com.alipay.mobile.common.ipc.api;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public interface IPCRetryHandler {
    boolean retryIPCCall(Method method, Object[] objArr, IPCException iPCException, int i);
}
