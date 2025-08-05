package com.alipay.mobile.intelligentdecision.rpc.service;

import com.alipay.mobile.intelligentdecision.rpc.IDConfigRequest;
import com.alipay.mobile.intelligentdecision.rpc.IDConfigResponse;
import com.alipay.mobile.intelligentdecision.rpc.IDRpcRequest;
import com.alipay.mobile.intelligentdecision.rpc.IDRpcResponse;
import com.alipay.vi.mobile.framework.service.annotation.OperationType;

/* loaded from: classes3.dex */
public interface IDRpcService {
    @OperationType("alipay.mobile.intelligent.decision.config")
    IDConfigResponse getClientDecisionConfig(IDConfigRequest iDConfigRequest);

    @OperationType("alipay.mobile.intelligent.decision.report")
    IDRpcResponse reportClientDecisionData(IDRpcRequest iDRpcRequest);
}
