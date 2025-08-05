package com.alipay.literpc.android.phone.mrpc.core;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DefaultRpcClient extends RpcClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f5286a;

    public static /* synthetic */ Object ipc$super(DefaultRpcClient defaultRpcClient, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Context a(DefaultRpcClient defaultRpcClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("28bf20d9", new Object[]{defaultRpcClient}) : defaultRpcClient.f5286a;
    }

    public DefaultRpcClient(Context context) {
        this.f5286a = context;
    }

    @Override // com.alipay.literpc.android.phone.mrpc.core.RpcClient
    public <T> T getRpcProxy(Class<T> cls, RpcParams rpcParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("7b1b088e", new Object[]{this, cls, rpcParams}) : (T) new RpcFactory(a(rpcParams)).getRpcProxy(cls);
    }

    private Config a(final RpcParams rpcParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Config) ipChange.ipc$dispatch("e8fca0fb", new Object[]{this, rpcParams}) : new Config() { // from class: com.alipay.literpc.android.phone.mrpc.core.DefaultRpcClient.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.literpc.android.phone.mrpc.core.Config
            public String getUrl() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("de8f0660", new Object[]{this}) : rpcParams.getGwUrl();
            }

            @Override // com.alipay.literpc.android.phone.mrpc.core.Config
            public Transport getTransport() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Transport) ipChange2.ipc$dispatch("dbd7bbab", new Object[]{this}) : HttpManager.getInstance(getApplicationContext());
            }

            @Override // com.alipay.literpc.android.phone.mrpc.core.Config
            public RpcParams getRpcParams() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (RpcParams) ipChange2.ipc$dispatch("1ecca0e7", new Object[]{this}) : rpcParams;
            }

            @Override // com.alipay.literpc.android.phone.mrpc.core.Config
            public Context getApplicationContext() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Context) ipChange2.ipc$dispatch("c5c75d34", new Object[]{this}) : DefaultRpcClient.a(DefaultRpcClient.this).getApplicationContext();
            }

            @Override // com.alipay.literpc.android.phone.mrpc.core.Config
            public boolean isGzip() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("8b75982f", new Object[]{this})).booleanValue() : rpcParams.isGzip();
            }
        };
    }
}
