package com.alipay.mobile.framework.service.common.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.alipay.mobile.common.rpc.RpcFactory;
import com.alipay.mobile.common.rpc.RpcHeaderListener;
import com.alipay.mobile.common.rpc.RpcInterceptor;
import com.alipay.mobile.common.rpc.RpcInvokeContext;
import com.alipay.mobile.common.rpc.impl.NetDefaultInterceptor;
import com.alipay.mobile.common.transport.http.inner.CoreHttpManager;
import com.alipay.mobile.framework.service.common.MpaasRpcService;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.util.concurrent.FutureTask;

/* loaded from: classes3.dex */
public class MpaasRpcServiceImpl extends MpaasRpcService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Handler f5712a;
    public RpcFactory mRpcFactory;

    public MpaasRpcServiceImpl(Context context) {
        this.f5712a = new Handler(Looper.getMainLooper());
        this.mRpcFactory = new RpcFactory(new MpaasDefaultConfig(context));
        this.mRpcFactory.setContext(context);
        this.mRpcFactory.addRpcInterceptor(NetDefaultInterceptor.getInstance());
        CoreHttpManager.getInstance(context);
    }

    public MpaasRpcServiceImpl(MpaasDefaultConfig mpaasDefaultConfig, Context context) {
        this.f5712a = new Handler(Looper.getMainLooper());
        this.mRpcFactory = new RpcFactory(mpaasDefaultConfig);
        this.mRpcFactory.setContext(context);
        this.mRpcFactory.addRpcInterceptor(NetDefaultInterceptor.getInstance());
        CoreHttpManager.getInstance(context);
    }

    public MpaasRpcServiceImpl(RpcFactory rpcFactory, Context context) {
        this(rpcFactory, context, true);
    }

    public MpaasRpcServiceImpl(RpcFactory rpcFactory, Context context, boolean z) {
        this.f5712a = new Handler(Looper.getMainLooper());
        this.mRpcFactory = rpcFactory;
        this.mRpcFactory.setContext(context);
        this.mRpcFactory.addRpcInterceptor(NetDefaultInterceptor.getInstance());
        if (z) {
            CoreHttpManager.getInstance(context);
        }
    }

    @Override // com.alipay.mobile.framework.service.common.MpaasRpcService
    public <T> T getRpcProxy(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("eba1321b", new Object[]{this, cls}) : (T) this.mRpcFactory.getRpcProxy(cls);
    }

    @Override // com.alipay.mobile.framework.service.common.MpaasRpcService
    public <T> T getBgRpcProxy(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("8c9d7440", new Object[]{this, cls}) : (T) this.mRpcFactory.getBgRpcProxy(cls);
    }

    @Override // com.alipay.mobile.framework.service.common.MpaasRpcService
    public <T> T getPBRpcProxy(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("bb0ac70d", new Object[]{this, cls}) : (T) this.mRpcFactory.getPBRpcProxy(cls);
    }

    @Override // com.alipay.mobile.framework.service.common.MpaasRpcService
    public void batchBegin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc04a96", new Object[]{this});
        } else {
            this.mRpcFactory.batchBegin();
        }
    }

    @Override // com.alipay.mobile.framework.service.common.MpaasRpcService
    public FutureTask<?> batchCommit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FutureTask) ipChange.ipc$dispatch("a1ad229", new Object[]{this}) : this.mRpcFactory.batchCommit();
    }

    @Override // com.alipay.mobile.framework.service.common.MpaasRpcService
    public void addProtocolArgs(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7049def1", new Object[]{this, str, str2});
        } else {
            this.mRpcFactory.addProtocolArgs(str, str2);
        }
    }

    @Override // com.alipay.mobile.framework.service.common.MpaasRpcService
    public void setScene(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4413531d", new Object[]{this, new Long(j), str});
            return;
        }
        this.mRpcFactory.setScene(str);
        this.f5712a.postDelayed(new Runnable() { // from class: com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    MpaasRpcServiceImpl.this.mRpcFactory.setScene(null);
                }
            }
        }, j);
    }

    @Override // com.alipay.mobile.framework.service.common.MpaasRpcService
    public void cancelAllRpc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ffb525", new Object[]{this});
        } else {
            this.mRpcFactory.cancelAllRpc();
        }
    }

    @Override // com.alipay.mobile.framework.service.common.MpaasRpcService
    public String getScene() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6a7731e3", new Object[]{this}) : this.mRpcFactory.getScene();
    }

    @Override // com.alipay.mobile.framework.service.common.MpaasRpcService
    public void prepareResetCookie(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("196c0caf", new Object[]{this, obj});
        } else {
            this.mRpcFactory.prepareResetCookie(obj);
        }
    }

    @Override // com.alipay.mobile.framework.service.common.MpaasRpcService
    public void addRpcInterceptor(Class<? extends Annotation> cls, RpcInterceptor rpcInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896e0294", new Object[]{this, cls, rpcInterceptor});
        } else {
            this.mRpcFactory.addRpcInterceptor(cls, rpcInterceptor);
        }
    }

    @Override // com.alipay.mobile.framework.service.common.MpaasRpcService
    public void addRpcInterceptor(RpcInterceptor rpcInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f5d9a1", new Object[]{this, rpcInterceptor});
        } else {
            this.mRpcFactory.addRpcInterceptor(rpcInterceptor);
        }
    }

    @Override // com.alipay.mobile.framework.service.common.MpaasRpcService
    public RpcInvokeContext getRpcInvokeContext(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcInvokeContext) ipChange.ipc$dispatch("a105b232", new Object[]{this, obj}) : this.mRpcFactory.getRpcInvokeContext(obj);
    }

    @Override // com.alipay.mobile.framework.service.common.MpaasRpcService
    public void addRpcHeaderListener(RpcHeaderListener rpcHeaderListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4fcded", new Object[]{this, rpcHeaderListener});
        } else {
            this.mRpcFactory.addRpcHeaderListener(rpcHeaderListener);
        }
    }

    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.mRpcFactory.setContext(context);
        }
    }
}
