package com.alipay.mobile.intelligentdecision.rpc.biz;

import com.alipay.mobile.intelligentdecision.rpc.IDConfigRequest;
import com.alipay.mobile.intelligentdecision.rpc.IDConfigResponse;
import com.alipay.mobile.intelligentdecision.rpc.IDRpcRequest;
import com.alipay.mobile.intelligentdecision.rpc.IDRpcResponse;
import com.alipay.mobile.intelligentdecision.rpc.service.IDRpcService;
import com.alipay.mobile.verifyidentity.rpc.IRpcServiceImpl;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class IDRpcServiceBizBase {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f5758a = IDRpcServiceBizBase.class.getSimpleName();
    private String b;

    public IDRpcServiceBizBase(String str) {
        this.b = str;
    }

    public IDRpcResponse report(IDRpcRequest iDRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDRpcResponse) ipChange.ipc$dispatch("15adeccb", new Object[]{this, iDRpcRequest});
        }
        try {
            IRpcServiceImpl iRpcServiceImpl = new IRpcServiceImpl();
            iRpcServiceImpl.setGW(this.b);
            return ((IDRpcService) iRpcServiceImpl.getRpcProxy(IDRpcService.class)).reportClientDecisionData(iDRpcRequest);
        } catch (RpcException e) {
            new StringBuilder("report exception:").append(e.getMsg());
            throw e;
        }
    }

    public IDConfigResponse config(IDConfigRequest iDConfigRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDConfigResponse) ipChange.ipc$dispatch("b2908ba9", new Object[]{this, iDConfigRequest});
        }
        try {
            IRpcServiceImpl iRpcServiceImpl = new IRpcServiceImpl();
            iRpcServiceImpl.setGW(this.b);
            IDConfigResponse clientDecisionConfig = ((IDRpcService) iRpcServiceImpl.getRpcProxy(IDRpcService.class)).getClientDecisionConfig(iDConfigRequest);
            if (clientDecisionConfig != null) {
                new StringBuilder("res is :").append(clientDecisionConfig.config);
            }
            return clientDecisionConfig;
        } catch (RpcException e) {
            new StringBuilder("config exception:").append(e.getMsg());
            throw e;
        }
    }
}
