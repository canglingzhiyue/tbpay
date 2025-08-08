package com.alipay.mobile.common.rpc.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.rpc.RpcInterceptor;
import com.alipay.mobile.common.rpc.transport.InnerRpcInvokeContext;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.http.HttpUrlHeader;
import com.alipay.mobile.common.transport.http.HttpUrlResponse;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.ext.annotation.Retryable;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.riy;

/* loaded from: classes3.dex */
public final class RpcInvokerUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RPC_V1 = "V1";
    public static final String RPC_V2 = "V2";
    public static final String SIMPLE_RPC_OPERATION_TYPE = "alipay.client.executerpc";
    public static final String SIMPLE_RPC_OPERATION_TYPE_BYTES = "alipay.client.executerpc.bytes";

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f5513a = new ArrayList();

    public static final boolean isSimpleRpcAnnotation(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fe3c456d", new Object[]{str})).booleanValue() : StringUtils.equals(str, "alipay.client.executerpc");
    }

    public static final boolean isSimpleRpcBytesAnnotation(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("504bcdc6", new Object[]{str})).booleanValue() : StringUtils.equals(str, "alipay.client.executerpc.bytes");
    }

    public static final String getOperationTypeValue(Method method, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba3d4c24", new Object[]{method, objArr});
        }
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        if (operationType == null) {
            throw new IllegalStateException("OperationType must be set.");
        }
        String value = operationType.value();
        return (isSimpleRpcAnnotation(value) || isSimpleRpcBytesAnnotation(value)) ? String.valueOf(objArr[0]) : value;
    }

    public static boolean isRetryable(Method method) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("363d4eb", new Object[]{method})).booleanValue() : ((Retryable) method.getAnnotation(Retryable.class)) != null;
    }

    public static void preProcessResponse(Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6dc0158", new Object[]{response});
            return;
        }
        HttpUrlResponse httpUrlResponse = (HttpUrlResponse) response;
        HttpUrlHeader header = httpUrlResponse.getHeader();
        int intValue = Integer.valueOf(header.getHead(HeaderConstant.HEADER_KEY_RESULT_STATUS)).intValue();
        String head = header.getHead(HeaderConstant.HEADER_KEY_TIPS);
        if (intValue == 1000 || intValue == 8001) {
            return;
        }
        RpcException rpcException = new RpcException(Integer.valueOf(intValue), a(intValue, head));
        String head2 = httpUrlResponse.getHeader().getHead("alert");
        if (!StringUtils.isEmpty(head2)) {
            if (StringUtils.equals(head2, String.valueOf(0))) {
                LogCatUtil.debug("RpcInvokerUtil", "set alertValue NO_ALERT");
                rpcException.setAlert(0);
            } else if (StringUtils.equals(head2, String.valueOf(1))) {
                LogCatUtil.debug("RpcInvokerUtil", "set alertValue TOAST_ALERT");
                rpcException.setAlert(1);
            }
        }
        if (intValue == 1002) {
            String head3 = header.getHead(HeaderConstant.HEADER_KEY_CONTROL);
            if (!StringUtils.isEmpty(head3)) {
                rpcException.setControl(a(head3));
            }
        }
        LogCatUtil.debug("HttpCaller", "preProcessResponse, alertValue:" + head2 + ", rpcException hashcode: " + rpcException.hashCode() + ", errcode: " + rpcException.getCode() + ", errmsg: " + rpcException.getMsg() + ", alert: " + rpcException.getAlert() + ", control: " + rpcException.getControl());
        throw rpcException;
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (Exception e) {
            LogCatUtil.error("RpcInvokerUtil", "control=[" + str + riy.ARRAY_END_STR, e);
            return str;
        }
    }

    private static String a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd4d069b", new Object[]{new Integer(i), str});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (Exception e) {
            LogCatUtil.error("RpcInvokerUtil", "memo=[" + str + riy.ARRAY_END_STR, e);
            return "很抱歉，系统错误 [" + i + "]。";
        }
    }

    public static String getRpcVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b056bb70", new Object[0]);
        }
        try {
            Context context = TransportEnvUtil.getContext();
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                return null;
            }
            String string = applicationInfo.metaData.getString("mobilegw.rpcVersion");
            return !StringUtils.isEmpty(string) ? string : RPC_V2;
        } catch (Exception e) {
            LogCatUtil.warn("RpcInvokerUtil", e);
            return null;
        }
    }

    public static final void preHandleForBizInterceptor(Object obj, Class<?> cls, Method method, Object[] objArr, InnerRpcInvokeContext innerRpcInvokeContext, ThreadLocal<Map<String, Object>> threadLocal, ThreadLocal<Object> threadLocal2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e08a5e4", new Object[]{obj, cls, method, objArr, innerRpcInvokeContext, threadLocal, threadLocal2});
            return;
        }
        try {
            for (RpcInterceptor rpcInterceptor : innerRpcInvokeContext.getRpcInterceptorList()) {
                if (!rpcInterceptor.preHandle(obj, threadLocal2, new byte[0], cls, method, objArr, null, threadLocal)) {
                    throw new RpcException((Integer) 21, rpcInterceptor + " preHandle stop this call.");
                }
            }
        } catch (RpcException e) {
            throw e;
        } catch (Throwable th) {
            RpcException rpcException = new RpcException((Integer) 21, th.toString());
            rpcException.initCause(th);
            throw rpcException;
        }
    }

    public static final void postHandleForBizInterceptor(Object obj, byte[] bArr, Class<?> cls, Method method, Object[] objArr, Annotation[] annotationArr, InnerRpcInvokeContext innerRpcInvokeContext, ThreadLocal<Object> threadLocal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be3a8015", new Object[]{obj, bArr, cls, method, objArr, annotationArr, innerRpcInvokeContext, threadLocal});
            return;
        }
        try {
            for (RpcInterceptor rpcInterceptor : innerRpcInvokeContext.getRpcInterceptorList()) {
                if (!rpcInterceptor.postHandle(obj, threadLocal, bArr, cls, method, objArr, null)) {
                    throw new RpcException((Integer) 21, rpcInterceptor + "postHandle stop this call.");
                }
            }
        } catch (RpcException e) {
            throw e;
        } catch (Throwable th) {
            RpcException rpcException = new RpcException((Integer) 21, th.toString());
            rpcException.initCause(th);
            throw rpcException;
        }
    }

    public static void postHandleForPacketSize(Method method, Object[] objArr, InnerRpcInvokeContext innerRpcInvokeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43df035d", new Object[]{method, objArr, innerRpcInvokeContext});
            return;
        }
        try {
            if (!MiscUtils.isDebugger(TransportEnvUtil.getContext()) || !MiscUtils.isInAlipayClient(TransportEnvUtil.getContext()) || !StringUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.RPC_PACKAGE_SIZE_INTERCEPT), "T")) {
                return;
            }
            Map<String, String> map = innerRpcInvokeContext.responseHeader;
            if (map.isEmpty()) {
                return;
            }
            String str = map.get(HeaderConstant.HEADER_KEY_PARAM_REQ_SIZE);
            String str2 = map.get(HeaderConstant.HEADER_KEY_PARAM_RES_SIZE);
            TransportConfigureManager transportConfigureManager = TransportConfigureManager.getInstance();
            long longValue = transportConfigureManager.getLongValue(TransportConfigureItem.RPC_REQSIZE_LIMIT);
            long longValue2 = transportConfigureManager.getLongValue(TransportConfigureItem.RPC_RESSIZE_LIMIT);
            String operationTypeValue = getOperationTypeValue(method, objArr);
            if (f5513a.contains(operationTypeValue)) {
                LogCatUtil.debug("RpcInvokerUtil", "opeType:" + operationTypeValue + " ,not first time,ignore");
            } else if (Long.parseLong(str) > longValue) {
                String str3 = "operationType:" + operationTypeValue + ",RPC Request size: " + str + " more than " + longValue + " byte,please optimize";
                LogCatUtil.debug("RpcInvokerUtil", str3);
                f5513a.add(operationTypeValue);
                throw new RpcException((Integer) 22, str3);
            } else if (Long.parseLong(str2) <= longValue2) {
            } else {
                String str4 = "operationType:" + operationTypeValue + ",RPC Response size: " + str2 + " more than " + longValue2 + " byte,please optimize";
                LogCatUtil.debug("RpcInvokerUtil", str4);
                f5513a.add(operationTypeValue);
                throw new RpcException((Integer) 23, str4);
            }
        } catch (RpcException e) {
            throw e;
        } catch (Throwable th) {
            LogCatUtil.error("RpcInvokerUtil", "postHandleForPacketSize ex:" + th.toString(), th);
        }
    }
}
