package com.alipay.literpc.android.phone.mrpc.core;

import com.alipay.literpc.android.phone.mrpc.core.gwprotocol.Deserializer;
import com.alipay.literpc.android.phone.mrpc.core.gwprotocol.JsonDeserializer;
import com.alipay.literpc.android.phone.mrpc.core.gwprotocol.JsonSerializer;
import com.alipay.literpc.android.phone.mrpc.core.gwprotocol.Serializer;
import com.alipay.literpc.mobile.framework.service.annotation.OperationType;
import com.alipay.literpc.mobile.framework.service.annotation.ResetCookie;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class RpcInvoker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<Object> f5300a = new ThreadLocal<>();
    private static final ThreadLocal<Map<String, Object>> b = new ThreadLocal<>();
    private byte c = 0;
    private AtomicInteger d = new AtomicInteger();
    private RpcFactory e;

    public RpcInvoker(RpcFactory rpcFactory) {
        this.e = rpcFactory;
    }

    public Object invoke(Object obj, Class<?> cls, Method method, Object[] objArr) throws RpcException {
        RpcException rpcException;
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5719f54b", new Object[]{this, obj, cls, method, objArr});
        }
        if (ThreadUtil.checkMainThread()) {
            throw new IllegalThreadStateException("can't in main thread call rpc .");
        }
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        boolean z = method.getAnnotation(ResetCookie.class) != null;
        Type genericReturnType = method.getGenericReturnType();
        Annotation[] annotations = method.getAnnotations();
        f5300a.set(null);
        b.set(null);
        if (operationType == null) {
            throw new IllegalStateException("OperationType must be set.");
        }
        String value = operationType.value();
        int incrementAndGet = this.d.incrementAndGet();
        try {
            if (this.c == 0) {
                byte[] a2 = a(method, objArr, value, incrementAndGet, z);
                try {
                    Object parser = getDeserializer(genericReturnType, a2).parser();
                    if (genericReturnType != Void.TYPE) {
                        f5300a.set(parser);
                    }
                } catch (RpcException e) {
                    rpcException = e;
                    bArr = a2;
                    rpcException.setOperationType(value);
                    a(obj, bArr, cls, method, objArr, annotations, rpcException);
                    return f5300a.get();
                }
            }
        } catch (RpcException e2) {
            rpcException = e2;
            bArr = null;
        }
        return f5300a.get();
    }

    private void a(Object obj, byte[] bArr, Class<?> cls, Method method, Object[] objArr, Annotation[] annotationArr, RpcException rpcException) throws RpcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc49d946", new Object[]{this, obj, bArr, cls, method, objArr, annotationArr, rpcException});
            return;
        }
        throw rpcException;
    }

    private byte[] a(Method method, Object[] objArr, String str, int i, boolean z) throws RpcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5d573fc1", new Object[]{this, method, objArr, str, new Integer(i), new Boolean(z)});
        }
        Serializer serializer = getSerializer(i, str, objArr);
        if (b.get() != null) {
            serializer.setExtParam(b.get());
        }
        byte[] bArr = (byte[]) getTransport(method, i, str, serializer.packet(), z).call();
        b.set(null);
        return bArr;
    }

    public void batchBegin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc04a96", new Object[]{this});
        } else {
            this.c = (byte) 1;
        }
    }

    public FutureTask<?> batchCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FutureTask) ipChange.ipc$dispatch("a1ad229", new Object[]{this});
        }
        this.c = (byte) 0;
        return null;
    }

    public static void addProtocolArgs(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c8a503", new Object[]{str, obj});
            return;
        }
        if (b.get() == null) {
            b.set(new HashMap());
        }
        b.get().put(str, obj);
    }

    public RpcCaller getTransport(Method method, int i, String str, byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcCaller) ipChange.ipc$dispatch("f951cffc", new Object[]{this, method, new Integer(i), str, bArr, new Boolean(z)}) : new HttpCaller(this.e.getConfig(), method, i, str, bArr, z);
    }

    public Serializer getSerializer(int i, String str, Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Serializer) ipChange.ipc$dispatch("e6b96c62", new Object[]{this, new Integer(i), str, objArr}) : new JsonSerializer(i, str, objArr);
    }

    public Deserializer getDeserializer(Type type, byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Deserializer) ipChange.ipc$dispatch("715bbe2e", new Object[]{this, type, bArr}) : new JsonDeserializer(type, bArr);
    }
}
