package com.alipay.mobile.common.rpc.impl;

import com.alipay.mobile.common.rpc.RpcLifeManager;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public class RpcLifeManagerImpl implements RpcLifeManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List<Future<Response>> f5504a = new ArrayList(4);
    private static RpcLifeManagerImpl b;

    public static final RpcLifeManagerImpl getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcLifeManagerImpl) ipChange.ipc$dispatch("7db29070", new Object[0]);
        }
        RpcLifeManagerImpl rpcLifeManagerImpl = b;
        if (rpcLifeManagerImpl != null) {
            return rpcLifeManagerImpl;
        }
        synchronized (RpcLifeManagerImpl.class) {
            if (b != null) {
                return b;
            }
            b = new RpcLifeManagerImpl();
            return b;
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcLifeManager
    public synchronized void cancelAllRpc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ffb525", new Object[]{this});
        } else if (!f5504a.isEmpty()) {
            for (Future<Response> future : f5504a) {
                if (future != null && !future.isDone()) {
                    future.cancel(true);
                }
            }
            LogCatUtil.warn("RpcLifeManager", "Cancel all rpc finish, rpc count: " + f5504a.size());
            f5504a.clear();
        }
    }

    public synchronized void addFuture(Future<Response> future) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f59032fb", new Object[]{this, future});
        } else if (future == null) {
        } else {
            try {
                f5504a.add(future);
            } catch (Throwable unused) {
            }
        }
    }

    public synchronized void removeFuture(Future<Response> future) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f73269b8", new Object[]{this, future});
        } else if (future == null) {
        } else {
            if (f5504a.isEmpty()) {
                return;
            }
            try {
                f5504a.remove(future);
            } catch (Throwable unused) {
            }
        }
    }
}
