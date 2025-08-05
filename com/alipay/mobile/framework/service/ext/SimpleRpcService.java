package com.alipay.mobile.framework.service.ext;

import com.alipay.mobile.framework.service.annotation.OperationType;
import java.util.Map;

/* loaded from: classes3.dex */
public interface SimpleRpcService {
    public static final String OPERATION_TYPE = "alipay.client.executerpc";
    public static final String OPERATION_TYPE_BYTES = "alipay.client.executerpc.bytes";

    @OperationType("alipay.client.executerpc")
    String executeRPC(String str, String str2);

    @OperationType("alipay.client.executerpc")
    String executeRPC(String str, String str2, Map<String, String> map);

    @OperationType("alipay.client.executerpc.bytes")
    byte[] executeRPC(String str, byte[] bArr, Map<String, String> map);
}
