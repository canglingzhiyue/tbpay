package com.alipay.vi.android.phone.mrpc.core;

import com.alipay.vi.android.phone.mrpc.core.gwprotocol.Deserializer;
import com.alipay.vi.android.phone.mrpc.core.gwprotocol.JsonDeserializer;
import com.alipay.vi.android.phone.mrpc.core.gwprotocol.JsonSerializer;
import com.alipay.vi.android.phone.mrpc.core.gwprotocol.Serializer;
import com.alipay.vi.android.phone.mrpc.core.gwprotocol.SignJsonSerializer;
import com.alipay.vi.android.phone.mrpc.core.util.RpcInvokerUtil;
import com.alipay.vi.mobile.common.rpc.RpcException;
import com.alipay.vi.mobile.framework.service.annotation.OperationType;
import com.alipay.vi.mobile.framework.service.annotation.ResetCookie;
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
    private static final ThreadLocal<Object> f6208a = new ThreadLocal<>();
    private static final ThreadLocal<Map<String, Object>> b = new ThreadLocal<>();
    private byte c = 0;
    private AtomicInteger d = new AtomicInteger();
    private RpcFactory e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public interface Handle {
        boolean handle(RpcInterceptor rpcInterceptor, Annotation annotation);
    }

    public static /* synthetic */ ThreadLocal access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadLocal) ipChange.ipc$dispatch("ac8d907b", new Object[0]) : f6208a;
    }

    public static /* synthetic */ ThreadLocal access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadLocal) ipChange.ipc$dispatch("d5dd74fc", new Object[0]) : b;
    }

    public RpcInvoker(RpcFactory rpcFactory) {
        this.e = rpcFactory;
    }

    public Object invoke(final Object obj, final Class<?> cls, final Method method, final Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5719f54b", new Object[]{this, obj, cls, method, objArr});
        }
        RpcThreadParamsHelper.clearThreadLocalValues();
        if (ThreadUtil.checkMainThread()) {
            throw new IllegalThreadStateException("can't in main thread call rpc .");
        }
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        boolean z = method.getAnnotation(ResetCookie.class) != null;
        Type genericReturnType = method.getGenericReturnType();
        Annotation[] annotations = method.getAnnotations();
        byte[] bArr = null;
        f6208a.set(null);
        b.set(null);
        if (operationType == null) {
            throw new IllegalStateException("OperationType must be set.");
        }
        String value = operationType.value();
        int incrementAndGet = this.d.incrementAndGet();
        a(annotations, new Handle() { // from class: com.alipay.vi.android.phone.mrpc.core.RpcInvoker.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.vi.android.phone.mrpc.core.RpcInvoker.Handle
            public boolean handle(RpcInterceptor rpcInterceptor, Annotation annotation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("3e2bf0b", new Object[]{this, rpcInterceptor, annotation})).booleanValue();
                }
                if (rpcInterceptor.preHandle(obj, RpcInvoker.access$000(), new byte[0], cls, method, objArr, annotation, RpcInvoker.access$100())) {
                    return true;
                }
                throw new RpcException((Integer) 9, rpcInterceptor + "preHandle stop this call.");
            }
        });
        try {
            if (this.c == 0) {
                String operationTypeValue = RpcInvokerUtil.getOperationTypeValue(method, objArr);
                Map<String, String> headersValue = RpcInvokerUtil.getHeadersValue(method, objArr);
                Serializer serializer = getSerializer(incrementAndGet, operationTypeValue, method, objArr);
                if (b.get() != null) {
                    serializer.setExtParam(b.get());
                }
                byte[] bArr2 = (byte[]) getTransport(method, incrementAndGet, operationTypeValue, serializer.packet(), z, headersValue).call();
                b.set(null);
                try {
                    Object parser = getDeserializer(genericReturnType, bArr2).parser();
                    if (genericReturnType != Void.TYPE) {
                        f6208a.set(parser);
                    }
                    bArr = bArr2;
                } catch (RpcException e) {
                    e = e;
                    bArr = bArr2;
                    e.setOperationType(value);
                    final byte[] bArr3 = bArr;
                    final RpcException rpcException = e;
                    if (a(annotations, new Handle() { // from class: com.alipay.vi.android.phone.mrpc.core.RpcInvoker.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.vi.android.phone.mrpc.core.RpcInvoker.Handle
                        public boolean handle(RpcInterceptor rpcInterceptor, Annotation annotation) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("3e2bf0b", new Object[]{this, rpcInterceptor, annotation})).booleanValue() : rpcInterceptor.exceptionHandle(obj, RpcInvoker.access$000(), bArr3, cls, method, objArr, rpcException, annotation);
                        }
                    })) {
                        throw e;
                    }
                    final byte[] bArr4 = bArr;
                    a(annotations, new Handle() { // from class: com.alipay.vi.android.phone.mrpc.core.RpcInvoker.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.vi.android.phone.mrpc.core.RpcInvoker.Handle
                        public boolean handle(RpcInterceptor rpcInterceptor, Annotation annotation) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("3e2bf0b", new Object[]{this, rpcInterceptor, annotation})).booleanValue();
                            }
                            if (rpcInterceptor.postHandle(obj, RpcInvoker.access$000(), bArr4, cls, method, objArr, annotation)) {
                                return true;
                            }
                            throw new RpcException((Integer) 9, rpcInterceptor + "postHandle stop this call.");
                        }
                    });
                    return f6208a.get();
                }
            }
        } catch (RpcException e2) {
            e = e2;
        }
        final byte[] bArr42 = bArr;
        a(annotations, new Handle() { // from class: com.alipay.vi.android.phone.mrpc.core.RpcInvoker.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.vi.android.phone.mrpc.core.RpcInvoker.Handle
            public boolean handle(RpcInterceptor rpcInterceptor, Annotation annotation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("3e2bf0b", new Object[]{this, rpcInterceptor, annotation})).booleanValue();
                }
                if (rpcInterceptor.postHandle(obj, RpcInvoker.access$000(), bArr42, cls, method, objArr, annotation)) {
                    return true;
                }
                throw new RpcException((Integer) 9, rpcInterceptor + "postHandle stop this call.");
            }
        });
        return f6208a.get();
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

    public RpcCaller getTransport(Method method, int i, String str, byte[] bArr, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcCaller) ipChange.ipc$dispatch("7795e63", new Object[]{this, method, new Integer(i), str, bArr, new Boolean(z), map}) : new HttpCaller(this.e.getConfig(), method, i, str, bArr, z, map);
    }

    public Serializer getSerializer(int i, String str, Method method, Object[] objArr) {
        JsonSerializer jsonSerializer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Serializer) ipChange.ipc$dispatch("d469e9e2", new Object[]{this, new Integer(i), str, method, objArr});
        }
        if (RpcInvokerUtil.isSimpleRpcAnnotation(((OperationType) method.getAnnotation(OperationType.class)).value())) {
            jsonSerializer = new SimpleRpcJsonSerializer(i, str, objArr);
        } else if (RpcInvokerUtil.isSimpleRpcBytesAnnotation(((OperationType) method.getAnnotation(OperationType.class)).value())) {
            throw new IllegalArgumentException("alipay.client.executerpc.bytes can't use in RpcV1");
        } else {
            jsonSerializer = new JsonSerializer(i, str, objArr);
        }
        return new SignJsonSerializer(jsonSerializer, this.e.getContext(), this.e.getConfig());
    }

    public Deserializer getDeserializer(Type type, byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Deserializer) ipChange.ipc$dispatch("8765f5dc", new Object[]{this, type, bArr}) : new JsonDeserializer(type, bArr);
    }

    private boolean a(Annotation[] annotationArr, Handle handle) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f321f7f4", new Object[]{this, annotationArr, handle})).booleanValue();
        }
        for (Annotation annotation : annotationArr) {
            RpcInterceptor findRpcInterceptor = this.e.findRpcInterceptor(annotation.annotationType());
            if (findRpcInterceptor == null || !(z = handle.handle(findRpcInterceptor, annotation))) {
                break;
            }
        }
        return z;
    }
}
