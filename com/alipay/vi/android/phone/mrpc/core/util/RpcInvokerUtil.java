package com.alipay.vi.android.phone.mrpc.core.util;

import mtopsdk.common.util.StringUtils;
import com.alipay.vi.mobile.framework.service.annotation.OperationType;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes3.dex */
public class RpcInvokerUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SIMPLE_RPC_OPERATION_TYPE = "alipay.client.executerpc";
    public static final String SIMPLE_RPC_OPERATION_TYPE_BYTES = "alipay.client.executerpc.bytes";

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

    public static Map<String, String> getHeadersValue(Method method, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("af019876", new Object[]{method, objArr});
        }
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        if (operationType == null) {
            throw new IllegalStateException("OperationType must be set.");
        }
        String value = operationType.value();
        if (!isSimpleRpcAnnotation(value) && !isSimpleRpcBytesAnnotation(value)) {
            return null;
        }
        return (Map) objArr[2];
    }
}
