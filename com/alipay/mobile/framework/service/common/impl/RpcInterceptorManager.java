package com.alipay.mobile.framework.service.common.impl;

import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.rpc.RpcInterceptor;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes3.dex */
public class RpcInterceptorManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static RpcInterceptorManager c;
    private RpcInterceptor[] b;

    /* renamed from: a  reason: collision with root package name */
    private List<RpcInterceptor> f5714a = new ArrayList();
    private ReentrantReadWriteLock d = new ReentrantReadWriteLock();
    private ReentrantReadWriteLock.WriteLock e = this.d.writeLock();

    public static synchronized RpcInterceptorManager getInstance() {
        synchronized (RpcInterceptorManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RpcInterceptorManager) ipChange.ipc$dispatch("20b679c2", new Object[0]);
            }
            if (c == null) {
                c = new RpcInterceptorManager();
            }
            return c;
        }
    }

    private RpcInterceptorManager() {
    }

    public void addRpcInterceptor(RpcInterceptor rpcInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f5d9a1", new Object[]{this, rpcInterceptor});
        } else if (rpcInterceptor == null || this.f5714a.contains(rpcInterceptor)) {
        } else {
            this.e.lock();
            try {
                this.f5714a.add(rpcInterceptor);
                this.b = (RpcInterceptor[]) this.f5714a.toArray(new RpcInterceptor[this.f5714a.size()]);
                this.e.unlock();
                LogCatUtil.info("RpcInterceptorManager", "addInterceptor finish, interceptor is " + rpcInterceptor.getClass().getName());
            } catch (Throwable th) {
                this.e.unlock();
                throw th;
            }
        }
    }

    public boolean preHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr, ThreadLocal<Map<String, Object>> threadLocal2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("976eef3f", new Object[]{this, obj, threadLocal, bArr, cls, method, objArr, threadLocal2})).booleanValue();
        }
        RpcInterceptor[] rpcInterceptorArr = this.b;
        if (rpcInterceptorArr == null || rpcInterceptorArr.length <= 0) {
            LogCatUtil.warn("RpcInterceptorManager", "preHandle. No exists interceptor");
            return true;
        }
        try {
            Annotation annotation = method.getAnnotation(OperationType.class);
            int length = rpcInterceptorArr.length;
            int i2 = 0;
            while (i2 < length) {
                RpcInterceptor rpcInterceptor = rpcInterceptorArr[i2];
                if (rpcInterceptor != null) {
                    i = i2;
                    if (!rpcInterceptor.preHandle(obj, threadLocal, bArr, cls, method, objArr, annotation, threadLocal2)) {
                        throw new RpcException((Integer) 21, rpcInterceptor + " preHandle stop this call.");
                    }
                } else {
                    i = i2;
                }
                i2 = i + 1;
            }
            return true;
        } catch (RpcException e) {
            throw e;
        } catch (Throwable th) {
            LogCatUtil.error("RpcInterceptorManager", "preHandle error", th);
            return true;
        }
    }

    public boolean postHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("980b4660", new Object[]{this, obj, threadLocal, bArr, cls, method, objArr})).booleanValue();
        }
        RpcInterceptor[] rpcInterceptorArr = this.b;
        if (rpcInterceptorArr == null || rpcInterceptorArr.length <= 0) {
            LogCatUtil.warn("RpcInterceptorManager", "postHandle. No exists interceptor");
            return true;
        }
        try {
            Annotation annotation = method.getAnnotation(OperationType.class);
            for (RpcInterceptor rpcInterceptor : rpcInterceptorArr) {
                if (rpcInterceptor != null && !rpcInterceptor.postHandle(obj, threadLocal, bArr, cls, method, objArr, annotation)) {
                    throw new RpcException((Integer) 9, rpcInterceptor + "postHandle stop this call.");
                }
            }
            return true;
        } catch (RpcException e) {
            throw e;
        } catch (Throwable th) {
            LogCatUtil.error("RpcInterceptorManager", "postHandle error", th);
            return true;
        }
    }

    public boolean exceptionHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr, RpcException rpcException) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b064556", new Object[]{this, obj, threadLocal, bArr, cls, method, objArr, rpcException})).booleanValue();
        }
        RpcInterceptor[] rpcInterceptorArr = this.b;
        if (rpcInterceptorArr == null || rpcInterceptorArr.length <= 0) {
            LogCatUtil.warn("RpcInterceptorManager", "exceptionHandle. No exists interceptor");
            return true;
        }
        try {
            Annotation annotation = method.getAnnotation(OperationType.class);
            int length = rpcInterceptorArr.length;
            int i3 = 0;
            while (i3 < length) {
                RpcInterceptor rpcInterceptor = rpcInterceptorArr[i3];
                if (rpcInterceptor != null) {
                    i = i3;
                    i2 = length;
                    if (!rpcInterceptor.exceptionHandle(obj, threadLocal, bArr, cls, method, objArr, rpcException, annotation)) {
                        LogCatUtil.error("RpcInterceptorManager", rpcException + " not need throw exception");
                        return false;
                    }
                } else {
                    i = i3;
                    i2 = length;
                }
                i3 = i + 1;
                length = i2;
            }
        } catch (RpcException e) {
            throw e;
        } catch (Throwable th) {
            LogCatUtil.error("RpcInterceptorManager", "exceptionHandle error", th);
        }
        return true;
    }
}
