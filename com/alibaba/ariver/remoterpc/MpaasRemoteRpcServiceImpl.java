package com.alibaba.ariver.remoterpc;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.alipay.mobile.common.rpc.RpcHeaderListener;
import com.alipay.mobile.common.rpc.RpcInterceptor;
import com.alipay.mobile.common.rpc.RpcInvokeContext;
import com.alipay.mobile.common.transport.http.inner.CoreHttpManager;
import com.alipay.mobile.framework.service.common.impl.MpaasDefaultConfig;
import com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.util.concurrent.FutureTask;
import tb.kge;

/* loaded from: classes2.dex */
public class MpaasRemoteRpcServiceImpl extends MpaasRpcServiceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Handler f2916a;
    public RemoteRpcFactory mRpcFactory;

    static {
        kge.a(-1729447693);
    }

    public MpaasRemoteRpcServiceImpl(Context context) {
        this(new MpaasDefaultConfig(context), context);
    }

    public MpaasRemoteRpcServiceImpl(MpaasDefaultConfig mpaasDefaultConfig, Context context) {
        super(mpaasDefaultConfig, context);
        this.f2916a = new Handler(Looper.getMainLooper());
        this.mRpcFactory = new RemoteRpcFactory(mpaasDefaultConfig);
        this.mRpcFactory.setContext(context);
        CoreHttpManager.getInstance(context);
    }

    @Override // com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl, com.alipay.mobile.framework.service.common.MpaasRpcService
    public <T> T getRpcProxy(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("eba1321b", new Object[]{this, cls}) : (T) this.mRpcFactory.getRpcProxy(cls);
    }

    @Override // com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl, com.alipay.mobile.framework.service.common.MpaasRpcService
    public <T> T getBgRpcProxy(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("8c9d7440", new Object[]{this, cls}) : (T) this.mRpcFactory.getBgRpcProxy(cls);
    }

    @Override // com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl, com.alipay.mobile.framework.service.common.MpaasRpcService
    public <T> T getPBRpcProxy(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("bb0ac70d", new Object[]{this, cls}) : (T) this.mRpcFactory.getPBRpcProxy(cls);
    }

    @Override // com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl, com.alipay.mobile.framework.service.common.MpaasRpcService
    public void batchBegin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc04a96", new Object[]{this});
        } else {
            this.mRpcFactory.batchBegin();
        }
    }

    @Override // com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl, com.alipay.mobile.framework.service.common.MpaasRpcService
    public FutureTask<?> batchCommit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FutureTask) ipChange.ipc$dispatch("a1ad229", new Object[]{this}) : this.mRpcFactory.batchCommit();
    }

    @Override // com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl, com.alipay.mobile.framework.service.common.MpaasRpcService
    public void addProtocolArgs(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7049def1", new Object[]{this, str, str2});
        } else {
            this.mRpcFactory.addProtocolArgs(str, str2);
        }
    }

    @Override // com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl, com.alipay.mobile.framework.service.common.MpaasRpcService
    public void setScene(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4413531d", new Object[]{this, new Long(j), str});
            return;
        }
        this.mRpcFactory.setScene(str);
        this.f2916a.postDelayed(new Runnable() { // from class: com.alibaba.ariver.remoterpc.MpaasRemoteRpcServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    MpaasRemoteRpcServiceImpl.this.mRpcFactory.setScene(null);
                }
            }
        }, j);
    }

    @Override // com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl, com.alipay.mobile.framework.service.common.MpaasRpcService
    public String getScene() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6a7731e3", new Object[]{this}) : this.mRpcFactory.getScene();
    }

    @Override // com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl, com.alipay.mobile.framework.service.common.MpaasRpcService
    public void prepareResetCookie(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("196c0caf", new Object[]{this, obj});
        } else {
            this.mRpcFactory.prepareResetCookie(obj);
        }
    }

    @Override // com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl, com.alipay.mobile.framework.service.common.MpaasRpcService
    public void addRpcInterceptor(Class<? extends Annotation> cls, RpcInterceptor rpcInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896e0294", new Object[]{this, cls, rpcInterceptor});
        } else {
            this.mRpcFactory.addRpcInterceptor(cls, rpcInterceptor);
        }
    }

    @Override // com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl, com.alipay.mobile.framework.service.common.MpaasRpcService
    public RpcInvokeContext getRpcInvokeContext(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcInvokeContext) ipChange.ipc$dispatch("a105b232", new Object[]{this, obj}) : this.mRpcFactory.getRpcInvokeContext(obj);
    }

    @Override // com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl, com.alipay.mobile.framework.service.common.MpaasRpcService
    public void addRpcHeaderListener(RpcHeaderListener rpcHeaderListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4fcded", new Object[]{this, rpcHeaderListener});
        } else {
            this.mRpcFactory.addRpcHeaderListener(rpcHeaderListener);
        }
    }

    @Override // com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl
    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.mRpcFactory.setContext(context);
        }
    }
}
