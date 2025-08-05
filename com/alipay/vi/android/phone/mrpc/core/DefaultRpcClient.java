package com.alipay.vi.android.phone.mrpc.core;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DefaultRpcClient extends RpcClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f6196a;
    private RpcFactory b;

    public static /* synthetic */ Context access$000(DefaultRpcClient defaultRpcClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("79dfbfb0", new Object[]{defaultRpcClient}) : defaultRpcClient.f6196a;
    }

    public DefaultRpcClient(Context context) {
        this.f6196a = context;
    }

    public DefaultRpcClient(Context context, Config config) {
        this.f6196a = context;
        this.b = new RpcFactory(config);
        this.b.setContext(this.f6196a);
    }

    @Override // com.alipay.vi.android.phone.mrpc.core.RpcClient
    public <T> T getRpcProxy(Class<T> cls, final RpcParams rpcParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("f7ae4294", new Object[]{this, cls, rpcParams}) : (T) new RpcFactory(new Config() { // from class: com.alipay.vi.android.phone.mrpc.core.DefaultRpcClient.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public String getAppKey() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("49079005", new Object[]{this}) : "";
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public String sign(Context context, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("2ca88008", new Object[]{this, context, str, str2}) : "";
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public String getUrl() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("de8f0660", new Object[]{this}) : rpcParams.getGwUrl();
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public Transport getTransport() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Transport) ipChange2.ipc$dispatch("36cb0cc1", new Object[]{this}) : HttpManager.getInstance(getApplicationContext());
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public RpcParams getRpcParams() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (RpcParams) ipChange2.ipc$dispatch("cc287401", new Object[]{this}) : rpcParams;
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public Context getApplicationContext() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Context) ipChange2.ipc$dispatch("c5c75d34", new Object[]{this}) : DefaultRpcClient.access$000(DefaultRpcClient.this).getApplicationContext();
            }

            @Override // com.alipay.vi.android.phone.mrpc.core.Config
            public boolean isGzip() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("8b75982f", new Object[]{this})).booleanValue() : rpcParams.isGzip();
            }
        }).getRpcProxy(cls);
    }

    public <T> T getRpcProxy(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("eba1321b", new Object[]{this, cls}) : (T) this.b.getRpcProxy(cls);
    }
}
