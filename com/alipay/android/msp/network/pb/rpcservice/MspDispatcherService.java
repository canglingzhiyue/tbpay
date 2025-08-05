package com.alipay.android.msp.network.pb.rpcservice;

import com.alipay.android.msp.network.DispatchType;
import com.alipay.android.msp.network.pb.rpcv3.MspReqExV3;
import com.alipay.android.msp.network.pb.rpcv3.MspResExV3;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.framework.service.annotation.OperationType;

/* loaded from: classes3.dex */
public interface MspDispatcherService {
    @OperationType(DispatchType.PB_V3_SDK)
    MspResExV3 dispatchTbV3(MspReqExV3 mspReqExV3) throws RpcException;
}
