package com.alipay.mobile.intelligentdecision.rpc;

import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.alipay.mobile.intelligentdecision.rpc.biz.IDRpcServiceBizBase;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class IDRpcServiceBiz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AtomicBoolean f5757a = new AtomicBoolean(false);
    private final String b = IDRpcServiceBiz.class.getSimpleName();

    public IDRpcResponse report(IDRpcRequest iDRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDRpcResponse) ipChange.ipc$dispatch("15adeccb", new Object[]{this, iDRpcRequest});
        }
        f5757a.set(true);
        IDRpcResponse iDRpcResponse = null;
        try {
            try {
                iDRpcResponse = new IDRpcServiceBizBase("").report(iDRpcRequest);
            } catch (RpcException e) {
                throw e;
            } catch (Exception e2) {
                String str = this.b;
                DecisionLogcat.a(str, "report error:" + e2.getMessage());
            }
            return iDRpcResponse;
        } finally {
            f5757a.set(false);
        }
    }

    public IDConfigResponse config(IDConfigRequest iDConfigRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDConfigResponse) ipChange.ipc$dispatch("b2908ba9", new Object[]{this, iDConfigRequest});
        }
        f5757a.set(true);
        IDConfigResponse iDConfigResponse = null;
        try {
            try {
                iDConfigResponse = new IDRpcServiceBizBase("").config(iDConfigRequest);
            } catch (RpcException e) {
                throw e;
            } catch (Exception e2) {
                String str = this.b;
                DecisionLogcat.a(str, "report error:" + e2.getMessage());
            }
            return iDConfigResponse;
        } finally {
            f5757a.set(false);
        }
    }
}
