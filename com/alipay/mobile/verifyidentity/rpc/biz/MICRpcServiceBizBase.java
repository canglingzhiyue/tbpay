package com.alipay.mobile.verifyidentity.rpc.biz;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.verifyidentity.log.LoggerFactory;
import com.alipay.mobile.verifyidentity.log.VITraceLogger;
import com.alipay.mobile.verifyidentity.rpc.IRpcService;
import com.alipay.mobile.verifyidentity.rpc.IRpcServiceImpl;
import com.alipay.mobile.verifyidentity.rpc.IRpcServiceInjector;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.utils.BuildConfigUtils;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobileic.biz.service.rpc.MICRpcService;
import com.alipay.mobileic.core.model.rpc.MICInitRequest;
import com.alipay.mobileic.core.model.rpc.MICProdmngRequest;
import com.alipay.mobileic.core.model.rpc.MICProdmngResponse;
import com.alipay.mobileic.core.model.rpc.MICReportRequest;
import com.alipay.mobileic.core.model.rpc.MICReportResponse;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MICRpcServiceBizBase {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INTERNATIONAL_URL = "https://imgs-identity.alipay.com/mgw.htm";
    public static final String MACAO_GW_URL = "https://imgs.alipaymo.com/mgw.htm";

    /* renamed from: a  reason: collision with root package name */
    private static final String f6050a = "MICRpcServiceBizBase";
    private String b;

    public MICRpcResponse dispatchFaceLogin(MICRpcRequest mICRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("ef3d0a89", new Object[]{this, mICRpcRequest});
        }
        return null;
    }

    public void setIsLoginRPC(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4538d25", new Object[]{this, new Boolean(z)});
        }
    }

    public void setResetCookie(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390d02fc", new Object[]{this, new Boolean(z)});
        }
    }

    public MICRpcServiceBizBase(String str) {
        String str2;
        if (CommonConstant.MACAO_GW_URL_DEF_FLAG.equalsIgnoreCase(str)) {
            LoggerFactory.getTraceLogger().info(f6050a, "dispatch_to aomen: https://imgs.alipaymo.com/mgw.htm");
            str2 = MACAO_GW_URL;
        } else if (CommonConstant.NEW_INTERNATIONAL_URL.equalsIgnoreCase(str)) {
            LoggerFactory.getTraceLogger().info(f6050a, "dispatch_to newaomen: INTERNATIONAL_URL");
            str2 = INTERNATIONAL_URL;
        } else {
            str2 = str;
        }
        this.b = str2;
        VITraceLogger traceLogger = LoggerFactory.getTraceLogger();
        String str3 = f6050a;
        traceLogger.info(str3, "gwUrl: " + str);
    }

    public MICRpcResponse dispatch(MICRpcRequest mICRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("b4d8c751", new Object[]{this, mICRpcRequest});
        }
        try {
            IRpcService a2 = a();
            a2.setGW(this.b);
            a(a2, "dispatch");
            return a(((MICRpcService) a2.getRpcProxy(MICRpcService.class)).dispatch(a(mICRpcRequest)));
        } catch (RpcException e) {
            throw e;
        }
    }

    public MICRpcResponse trigger(MICRpcRequest mICRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("f5f528f", new Object[]{this, mICRpcRequest});
        }
        try {
            IRpcService a2 = a();
            a2.setGW(this.b);
            return a(((MICRpcService) a2.getRpcProxy(MICRpcService.class)).triggerPBv2(a(mICRpcRequest)));
        } catch (RpcException e) {
            throw e;
        }
    }

    public MICRpcResponse initVerifyTask(MICInitRequest mICInitRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("999d4abe", new Object[]{this, mICInitRequest});
        }
        try {
            IRpcService a2 = a();
            a2.setGW(this.b);
            a(a2, "initVerifyTask");
            return a(((MICRpcService) a2.getRpcProxy(MICRpcService.class)).initVerifyTask(mICInitRequest));
        } catch (RpcException e) {
            throw e;
        }
    }

    public MICReportResponse report(MICReportRequest mICReportRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICReportResponse) ipChange.ipc$dispatch("3553a29f", new Object[]{this, mICReportRequest});
        }
        try {
            return ((MICRpcService) new IRpcServiceImpl().getRpcProxy(MICRpcService.class)).report(mICReportRequest);
        } catch (RpcException e) {
            throw e;
        }
    }

    public MICProdmngResponse prodmng(MICProdmngRequest mICProdmngRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICProdmngResponse) ipChange.ipc$dispatch("e28817c6", new Object[]{this, mICProdmngRequest});
        }
        try {
            IRpcServiceImpl iRpcServiceImpl = new IRpcServiceImpl();
            iRpcServiceImpl.setGW(this.b);
            return ((MICRpcService) iRpcServiceImpl.getRpcProxy(MICRpcService.class)).prodmng(mICProdmngRequest);
        } catch (RpcException e) {
            throw e;
        }
    }

    private static void a(IRpcService iRpcService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2b36574", new Object[]{iRpcService, str});
        } else if (!(iRpcService instanceof IRpcServiceImpl)) {
        } else {
            ((IRpcServiceImpl) iRpcService).setGwOptionType(str);
        }
    }

    private static IRpcService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRpcService) ipChange.ipc$dispatch("f4435d30", new Object[0]);
        }
        IRpcService rpcService = IRpcServiceInjector.getInstance().getRpcService();
        return rpcService == null ? new IRpcServiceImpl() : rpcService;
    }

    private static MICRpcRequest a(MICRpcRequest mICRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcRequest) ipChange.ipc$dispatch("c0c23fae", new Object[]{mICRpcRequest});
        }
        if (BuildConfigUtils.getString(BuildConfigUtils.K_RPC_TYPE_TB).equalsIgnoreCase(BuildConfigUtils.getString(BuildConfigUtils.K_RPC_TYPE))) {
            mICRpcRequest.pbData = mICRpcRequest.data;
            mICRpcRequest.data = null;
        }
        return mICRpcRequest;
    }

    private static MICRpcResponse a(MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("d8a3b704", new Object[]{mICRpcResponse});
        }
        if (StringUtils.isEmpty(mICRpcResponse.data)) {
            mICRpcResponse.data = mICRpcResponse.pbData;
            mICRpcResponse.pbData = null;
        }
        return mICRpcResponse;
    }
}
