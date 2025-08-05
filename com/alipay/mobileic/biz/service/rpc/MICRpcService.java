package com.alipay.mobileic.biz.service.rpc;

import com.alipay.mobileic.core.model.rpc.MICInitRequest;
import com.alipay.mobileic.core.model.rpc.MICProdmngRequest;
import com.alipay.mobileic.core.model.rpc.MICProdmngResponse;
import com.alipay.mobileic.core.model.rpc.MICReportRequest;
import com.alipay.mobileic.core.model.rpc.MICReportResponse;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.alipay.vi.mobile.framework.service.annotation.OperationType;

/* loaded from: classes3.dex */
public interface MICRpcService {
    @OperationType("alipay.mobile.ic.dispatch.tb")
    MICRpcResponse dispatch(MICRpcRequest mICRpcRequest);

    @OperationType("alipay.mobile.ic.init.tb")
    MICRpcResponse initVerifyTask(MICInitRequest mICInitRequest);

    @OperationType("alipay.mobile.ic.prodmng.tb")
    MICProdmngResponse prodmng(MICProdmngRequest mICProdmngRequest);

    @OperationType("alipay.mobile.ic.report.pb")
    MICReportResponse report(MICReportRequest mICReportRequest);

    @OperationType("alipay.mobile.ic.trigger.pb.v2")
    MICRpcResponse triggerPBv2(MICRpcRequest mICRpcRequest);
}
