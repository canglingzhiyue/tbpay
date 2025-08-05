package com.alipay.mobile.framework.service.common;

import com.alipay.mobile.common.rpc.RpcHeaderListener;
import com.alipay.mobile.common.rpc.RpcInterceptor;
import com.alipay.mobile.common.rpc.RpcInvokeContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.util.concurrent.FutureTask;

/* loaded from: classes3.dex */
public abstract class MpaasRpcService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract void addProtocolArgs(String str, String str2);

    public void addRpcHeaderListener(RpcHeaderListener rpcHeaderListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4fcded", new Object[]{this, rpcHeaderListener});
        }
    }

    public abstract void addRpcInterceptor(RpcInterceptor rpcInterceptor);

    public abstract void addRpcInterceptor(Class<? extends Annotation> cls, RpcInterceptor rpcInterceptor);

    public abstract void batchBegin();

    public abstract FutureTask<?> batchCommit();

    public abstract void cancelAllRpc();

    public abstract <T> T getBgRpcProxy(Class<T> cls);

    public abstract <T> T getPBRpcProxy(Class<T> cls);

    public RpcInvokeContext getRpcInvokeContext(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcInvokeContext) ipChange.ipc$dispatch("a105b232", new Object[]{this, obj});
        }
        return null;
    }

    public abstract <T> T getRpcProxy(Class<T> cls);

    public abstract String getScene();

    public abstract void prepareResetCookie(Object obj);

    public abstract void setScene(long j, String str);
}
