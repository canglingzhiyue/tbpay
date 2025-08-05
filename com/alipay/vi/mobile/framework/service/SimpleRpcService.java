package com.alipay.vi.mobile.framework.service;

import com.alipay.mobile.common.logging.util.perf.Constants;
import com.alipay.vi.mobile.framework.service.annotation.OperationType;
import com.alipay.vi.mobile.framework.service.annotation.SignCheck;
import java.util.Map;

/* loaded from: classes3.dex */
public interface SimpleRpcService {
    public static final String OPERATION_TYPE = "alipay.client.executerpc";
    public static final String OPERATION_TYPE_BYTES = "alipay.client.executerpc.bytes";

    @OperationType("alipay.client.executerpc")
    @SignCheck(Constants.VAL_YES)
    String executeRPC(String str, String str2, Map<String, String> map);

    @OperationType("alipay.client.executerpc.bytes")
    byte[] executeRPC(String str, byte[] bArr, Map<String, String> map);
}
