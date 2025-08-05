package com.alipay.mobile.common.rpc.impl;

import android.text.TextUtils;
import com.alipay.android.msp.framework.dns.DnsValue;
import com.alipay.android.msp.network.DispatchType;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.rpc.RpcInvocationHandler;
import com.alipay.mobile.common.rpc.RpcInvokeContext;
import com.alipay.mobile.common.rpc.transport.InnerRpcInvokeContext;
import com.alipay.mobile.common.rpc.util.RpcInvokerUtil;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transport.zfeatures.ServerTimeManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class NetDefaultInterceptor extends RpcInterceptorAdaptor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f5503a = "NetDefaultInterceptor";
    private static Boolean d;
    private static NetDefaultInterceptor e;
    private static final ThreadLocal<Map<String, Object>> f = new ThreadLocal<Map<String, Object>>() { // from class: com.alipay.mobile.common.rpc.impl.NetDefaultInterceptor.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.ThreadLocal
        public Map<String, Object> initialValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d848a9c9", new Object[]{this}) : new HashMap(2);
        }
    };
    private String b = "https://mobilegw.alipay.com/mgw.htm";
    private String c = "https://mgwapi-tb.alipay.com/mgw.htm";

    public static /* synthetic */ Object ipc$super(NetDefaultInterceptor netDefaultInterceptor, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static NetDefaultInterceptor getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetDefaultInterceptor) ipChange.ipc$dispatch("3dda6239", new Object[0]);
        }
        NetDefaultInterceptor netDefaultInterceptor = e;
        if (netDefaultInterceptor != null) {
            return netDefaultInterceptor;
        }
        synchronized (NetDefaultInterceptor.class) {
            if (e == null) {
                e = new NetDefaultInterceptor();
            }
        }
        return e;
    }

    private NetDefaultInterceptor() {
    }

    @Override // com.alipay.mobile.common.rpc.impl.RpcInterceptorAdaptor, com.alipay.mobile.common.rpc.RpcInterceptor
    public boolean preHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr, Annotation annotation, ThreadLocal<Map<String, Object>> threadLocal2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba037f8b", new Object[]{this, obj, threadLocal, bArr, cls, method, objArr, annotation, threadLocal2})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            LogCatUtil.error(f5503a, "preHandle error", th);
        }
        if (!a()) {
            LogCatUtil.info(f5503a, "it's not in taobao app");
            return true;
        } else if (!TransportStrategy.enableSwitchRpcDomain()) {
            LogCatUtil.info(f5503a, "switch off");
            return true;
        } else {
            RpcInvokeContext rpcInvokeContext = ((RpcInvocationHandler) Proxy.getInvocationHandler(obj)).getRpcInvokeContext();
            String gwUrl = rpcInvokeContext.getGwUrl();
            if (gwUrl != null && !gwUrl.equals(this.b)) {
                String str = f5503a;
                LogCatUtil.info(str, "origin url is not mobilegw, don't need to switch, oldGwUrl:" + gwUrl);
                return true;
            } else if (RpcInvokerUtil.getOperationTypeValue(method, objArr).equals("alipay.client.switches.all.get.outside")) {
                return true;
            } else {
                LogCatUtil.info(f5503a, "switch domain");
                rpcInvokeContext.setGwUrl(this.c);
                return true;
            }
        }
    }

    @Override // com.alipay.mobile.common.rpc.impl.RpcInterceptorAdaptor, com.alipay.mobile.common.rpc.RpcInterceptor
    public boolean exceptionHandle(Object obj, ThreadLocal<Object> threadLocal, byte[] bArr, Class<?> cls, Method method, Object[] objArr, RpcException rpcException, Annotation annotation) {
        String str;
        String operationTypeValue = RpcInvokerUtil.getOperationTypeValue(method, objArr);
        int code = rpcException.getCode();
        String str2 = f5503a;
        LogCatUtil.info(str2, "exceptionHandle. exception.getCode:" + code + ", operationType:" + operationTypeValue);
        if (!a(obj, method, objArr, rpcException)) {
            return true;
        }
        Integer num = (Integer) a("dispatchHandleTimes");
        if (num != null && num.intValue() > 0) {
            LogCatUtil.info(f5503a, "dispatch handle times >= 1, return.");
            a("dispatchHandleTimes", 0);
            return true;
        }
        if (num != null) {
            a("dispatchHandleTimes", Integer.valueOf(num.intValue() + 1));
        } else {
            a("dispatchHandleTimes", 1);
        }
        try {
            RpcInvokeContext rpcInvokeContext = ((RpcInvocationHandler) Proxy.getInvocationHandler(obj)).getRpcInvokeContext();
            if (code == 7003) {
                a(rpcInvokeContext);
            }
            if (TransportStrategy.enableSwitchRpcDomain()) {
                str = this.b;
            } else {
                str = this.c;
            }
            rpcInvokeContext.setGwUrl(str);
            String str3 = f5503a;
            LogCatUtil.info(str3, "exceptionHandle. Start resend rpc, url= " + str);
            threadLocal.set(method.invoke(obj, objArr));
            return false;
        } catch (IllegalAccessException e2) {
            LogCatUtil.error(f5503a, "resend rpc occurs illegal access exception", e2);
            throw new RpcException((Integer) 9, e2 + "");
        } catch (IllegalArgumentException e3) {
            LogCatUtil.error(f5503a, "resend rpc occurs illegal argument exception", e3);
            throw new RpcException((Integer) 9, e3 + "");
        } catch (InvocationTargetException e4) {
            Throwable targetException = e4.getTargetException();
            LogCatUtil.error(f5503a, "resend rpc occurs invocation target exception", targetException);
            if (targetException instanceof RpcException) {
                throw ((RpcException) targetException);
            }
            throw new RpcException((Integer) 9, e4 + "");
        }
    }

    private static boolean a(Object obj, Method method, Object[] objArr, RpcException rpcException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f65f695e", new Object[]{obj, method, objArr, rpcException})).booleanValue();
        }
        try {
            if (rpcException.isServerError() && rpcException.getCode() != 7003) {
                LogCatUtil.info(f5503a, "exceptionHand. shouldDoExceptionHandle, isServerError return false");
                return false;
            }
            String operationTypeValue = RpcInvokerUtil.getOperationTypeValue(method, objArr);
            URL url = new URL(((InnerRpcInvokeContext) ((RpcInvocationHandler) Proxy.getInvocationHandler(obj)).getRpcInvokeContext()).getGwUrl());
            if (TextUtils.equals(url.getHost(), DnsValue.DOMAIN_MOBILE_GW) || TextUtils.equals(url.getHost(), "mgwapi-tb.alipay.com")) {
                return operationTypeValue.contains(DispatchType.PB_V1_CASHIER);
            }
            String str = f5503a;
            LogCatUtil.info(str, "exceptionHandle. operationType= " + operationTypeValue + ",gw= " + url.getHost() + " should not do exceptionHandle");
            return false;
        } catch (Throwable th) {
            String str2 = f5503a;
            LogCatUtil.error(str2, "shouldDoExceptionHandle ex= " + th.toString());
            return false;
        }
    }

    private static final void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{str, obj});
        } else {
            f.get().put(str, obj);
        }
    }

    private static final Object a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("17307540", new Object[]{str}) : f.get().get(str);
    }

    private void a(RpcInvokeContext rpcInvokeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d91e8f", new Object[]{this, rpcInvokeContext});
            return;
        }
        Map<String, String> responseHeaders = rpcInvokeContext.getResponseHeaders();
        if (responseHeaders == null) {
            LogCatUtil.warn(f5503a, "[exceptionHandle] No response header");
            return;
        }
        String str = responseHeaders.get(HeaderConstant.HEADER_KEY_SERVER_TIME);
        if (str == null) {
            LogCatUtil.warn(f5503a, "[exceptionHandle] No server time in response header");
            return;
        }
        try {
            ServerTimeManager.getInstance().setServerTime(Long.parseLong(str));
            String str2 = f5503a;
            LogCatUtil.info(str2, "[exceptionHandle] correctTimestamp, set server time: " + str);
        } catch (NumberFormatException e2) {
            String str3 = f5503a;
            LogCatUtil.warn(str3, "[exceptionHandle] Cannot parse tmpServerTime: " + str + ", NumberFormatException: " + e2.toString());
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        Boolean bool = d;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (TransportEnvUtil.getContext().getPackageName().startsWith("com.taobao.taobao")) {
            Boolean bool2 = true;
            d = bool2;
            return bool2.booleanValue();
        }
        Boolean bool3 = false;
        d = bool3;
        return bool3.booleanValue();
    }
}
