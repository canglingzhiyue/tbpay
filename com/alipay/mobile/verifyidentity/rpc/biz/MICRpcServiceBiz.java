package com.alipay.mobile.verifyidentity.rpc.biz;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.common.VerifyType;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.engine.TaskManager;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.DebugViewer;
import com.alipay.mobile.verifyidentity.log.TimeCostLog;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.proxy.rpc.VIMessageChannel;
import com.alipay.mobile.verifyidentity.proxy.rpc.VIMessageChannelCallback;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.alipay.mobileic.core.model.rpc.MICInitRequest;
import com.alipay.mobileic.core.model.rpc.MICProdmngRequest;
import com.alipay.mobileic.core.model.rpc.MICProdmngResponse;
import com.alipay.mobileic.core.model.rpc.MICReportRequest;
import com.alipay.mobileic.core.model.rpc.MICReportResponse;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class MICRpcServiceBiz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL_ERROR_FORCE_TO_SUCCESS = "-1002";
    public static final String CHANNEL_ERROR_NET_ERROR = "-1001";

    /* renamed from: a  reason: collision with root package name */
    private static final String f6049a = "MICRpcServiceBiz";
    private static AtomicBoolean b = new AtomicBoolean(false);
    private VerifyIdentityTask e;
    public final String macao_url = CommonConstant.MACAO_GW_URL_DEF_FLAG;
    public final String NEW_INTERNATIONAL_URL = CommonConstant.NEW_INTERNATIONAL_URL;
    private Object c = new Object();
    private MICRpcResponse d = null;

    public static /* synthetic */ Object access$000(MICRpcServiceBiz mICRpcServiceBiz) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("cd6562ec", new Object[]{mICRpcServiceBiz}) : mICRpcServiceBiz.c;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]) : f6049a;
    }

    public static /* synthetic */ MICRpcResponse access$202(MICRpcServiceBiz mICRpcServiceBiz, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("901d72aa", new Object[]{mICRpcServiceBiz, mICRpcResponse});
        }
        mICRpcServiceBiz.d = mICRpcResponse;
        return mICRpcResponse;
    }

    public MICRpcResponse dispatch(MICRpcRequest mICRpcRequest) {
        boolean z;
        boolean z2;
        MICRpcResponse dispatch;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("b4d8c751", new Object[]{this, mICRpcRequest});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        hashMap.put("module", mICRpcRequest.module);
        hashMap.put("operationType", "alipay.mobile.ic.dispatch");
        hashMap.put("action", mICRpcRequest.action);
        if (mICRpcRequest.data != null) {
            hashMap.put("data-length", String.valueOf(mICRpcRequest.data.length()));
        }
        String str = mICRpcRequest.token;
        String str2 = mICRpcRequest.verifyId;
        try {
            b.set(true);
            VerifyIdentityTask a2 = a();
            String str3 = null;
            if (a2 != null) {
                mICRpcRequest.bizRequestData = a2.bizRequestData;
                if (VerifyType.FAST_DIRECT.equals(a2.getVerifyType()) && a2.needReportEnvInfo) {
                    mICRpcRequest.envData = EnvInfoUtil.getEnvInfo();
                    a2.needReportEnvInfo = false;
                } else {
                    VerifyLogCat.i(f6049a, "no need to report envinfo again");
                }
                if (a2.isIPay) {
                    str3 = CommonConstant.MACAO_GW_URL_DEF_FLAG;
                    if (VIUtils.isInExport() && str2 != null && str2.endsWith("_sg_site")) {
                        str3 = CommonConstant.NEW_INTERNATIONAL_URL;
                    }
                } else {
                    str3 = a2.gwUrl;
                }
                z = a2.resetCookie;
                z2 = a2.isLoginRPC;
            } else {
                z = false;
                z2 = false;
            }
            writeRpcSendLog(mICRpcRequest.token, mICRpcRequest.verifyId, hashMap);
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
            DebugViewer.getInstance().sendRpc(valueOf, mICRpcRequest);
            if (a2 != null && a2.getVIMessageChannel() != null && !a2.canNotUseRpcChannel && !mICRpcRequest.canNotUseRpcChannel) {
                dispatch = a(a2.getVIMessageChannel(), mICRpcRequest);
                if (dispatch != null && !TextUtils.isEmpty(dispatch.channelError)) {
                    hashMap.put("channelError", dispatch.channelError);
                }
            } else {
                MICRpcServiceBizBase mICRpcServiceBizBase = new MICRpcServiceBizBase(str3);
                mICRpcServiceBizBase.setResetCookie(z);
                mICRpcServiceBizBase.setIsLoginRPC(z2);
                dispatch = (str2 == null || !str2.endsWith("_mobileicfacelog_site")) ? mICRpcServiceBizBase.dispatch(mICRpcRequest) : mICRpcServiceBizBase.dispatchFaceLogin(mICRpcRequest);
            }
            DebugViewer.getInstance().gotRpcResult(valueOf, dispatch);
            writeRpcBackLog(dispatch, str, str2, elapsedRealtime, hashMap);
            b.set(false);
            return dispatch;
        } catch (Exception e) {
            a(e, str, str2, elapsedRealtime, hashMap);
            throw e;
        }
    }

    public MICRpcResponse trigger(MICRpcRequest mICRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("f5f528f", new Object[]{this, mICRpcRequest});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        hashMap.put("module", mICRpcRequest.module);
        hashMap.put("operationType", "alipay.mobile.ic.trigger.pb.v2");
        hashMap.put("action", mICRpcRequest.action);
        if (mICRpcRequest.data != null) {
            hashMap.put("data-length", String.valueOf(mICRpcRequest.data.length()));
        }
        String str = mICRpcRequest.token;
        String str2 = mICRpcRequest.verifyId;
        try {
            b.set(true);
            mICRpcRequest.envData = EnvInfoUtil.getEnvData(null);
            writeRpcSendLog(mICRpcRequest.token, mICRpcRequest.verifyId, hashMap);
            MICRpcResponse trigger = new MICRpcServiceBizBase(null).trigger(mICRpcRequest);
            writeRpcBackLog(trigger, str, str2, elapsedRealtime, hashMap);
            b.set(false);
            return trigger;
        } catch (Exception e) {
            a(e, str, str2, elapsedRealtime, hashMap);
            throw e;
        }
    }

    public MICRpcResponse initVerifyTask(MICInitRequest mICInitRequest) {
        String str;
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("999d4abe", new Object[]{this, mICInitRequest});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        hashMap.put("sceneId", mICInitRequest.sceneId);
        hashMap.put("bizId", mICInitRequest.bizId);
        hashMap.put("operationType", "alipay.mobile.ic.init.outer");
        try {
            b.set(true);
            String str5 = null;
            writeRpcSendLog(null, null, hashMap);
            VerifyIdentityTask a2 = a();
            if (a2 != null) {
                str5 = a2.gwUrl;
            }
            if (a2 != null) {
                String verifyId = a2.getVerifyId();
                if (a2.isIPay) {
                    str5 = CommonConstant.MACAO_GW_URL_DEF_FLAG;
                    if (VIUtils.isInExport() && verifyId != null && verifyId.endsWith("_sg_site")) {
                        str5 = CommonConstant.NEW_INTERNATIONAL_URL;
                    }
                }
            }
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
            DebugViewer.getInstance().sendRpc(valueOf, mICInitRequest);
            MICRpcResponse initVerifyTask = new MICRpcServiceBizBase(str5).initVerifyTask(mICInitRequest);
            DebugViewer.getInstance().gotRpcResult(valueOf, initVerifyTask);
            if (initVerifyTask != null) {
                String str6 = initVerifyTask.token;
                try {
                    str4 = initVerifyTask.verifyId;
                    str3 = str6;
                } catch (Exception e) {
                    e = e;
                    str2 = "";
                    str = str6;
                    a(e, str, str2, elapsedRealtime, hashMap);
                    throw e;
                }
            } else {
                str3 = "";
                str4 = str3;
            }
            try {
                writeRpcBackLog(initVerifyTask, str3, str4, elapsedRealtime, hashMap);
                b.set(false);
                return initVerifyTask;
            } catch (Exception e2) {
                e = e2;
                str = str3;
                str2 = str4;
                a(e, str, str2, elapsedRealtime, hashMap);
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            str = "";
            str2 = str;
        }
    }

    public MICReportResponse report(MICReportRequest mICReportRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICReportResponse) ipChange.ipc$dispatch("3553a29f", new Object[]{this, mICReportRequest});
        }
        try {
            return new MICRpcServiceBizBase(null).report(mICReportRequest);
        } catch (Exception e) {
            viRpcExceptionAdapter(e);
            throw e;
        }
    }

    public MICProdmngResponse prodmng(MICProdmngRequest mICProdmngRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICProdmngResponse) ipChange.ipc$dispatch("e28817c6", new Object[]{this, mICProdmngRequest});
        }
        try {
            return new MICRpcServiceBizBase(null).prodmng(mICProdmngRequest);
        } catch (Exception e) {
            viRpcExceptionAdapter(e);
            throw e;
        }
    }

    private MICRpcResponse a(VIMessageChannel vIMessageChannel, MICRpcRequest mICRpcRequest) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("3334cded", new Object[]{this, vIMessageChannel, mICRpcRequest});
        }
        Bundle bundle = new Bundle();
        bundle.putString("action", "viRpcRequest");
        bundle.putString("data", JSON.toJSONString(mICRpcRequest));
        vIMessageChannel.onAction(bundle, new VIMessageChannelCallback() { // from class: com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.proxy.rpc.VIMessageChannelCallback
            public void onResult(Bundle bundle2) {
                Object access$000;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4d1d691", new Object[]{this, bundle2});
                    return;
                }
                synchronized (MICRpcServiceBiz.access$000(MICRpcServiceBiz.this)) {
                    try {
                        String access$100 = MICRpcServiceBiz.access$100();
                        VerifyLogCat.i(access$100, "RpcProxy return the Result: " + bundle2);
                        String string = bundle2.getString("data");
                        String access$1002 = MICRpcServiceBiz.access$100();
                        VerifyLogCat.i(access$1002, "RpcProxy rpcResponse: " + string);
                        MICRpcServiceBiz.access$202(MICRpcServiceBiz.this, (MICRpcResponse) JSON.parseObject(string, MICRpcResponse.class));
                        access$000 = MICRpcServiceBiz.access$000(MICRpcServiceBiz.this);
                    } catch (Exception e) {
                        VerifyLogCat.w(MICRpcServiceBiz.access$100(), "Failed to parse the RpcProxy Result!", e);
                        access$000 = MICRpcServiceBiz.access$000(MICRpcServiceBiz.this);
                    }
                    access$000.notifyAll();
                }
            }
        });
        synchronized (this.c) {
            try {
                VerifyLogCat.i(f6049a, "Start to wait for the result from RpcProxy.");
                this.c.wait();
            } catch (InterruptedException e) {
                String str = f6049a;
                VerifyLogCat.w(str, "waiting is interrupted: " + e);
            }
        }
        VerifyLogCat.i(f6049a, "RpcProxy Result is here.");
        MICRpcResponse mICRpcResponse = this.d;
        if (mICRpcResponse != null) {
            String str2 = mICRpcResponse.channelError;
            if (!TextUtils.isEmpty(str2)) {
                this.d = null;
                String str3 = f6049a;
                VerifyLogCat.i(str3, "rpc代理模式出现 channelError: " + str2);
                if ("-1002".equalsIgnoreCase(str2)) {
                    VerifyLogCat.i(f6049a, "通道返回要求立即按成功处理（如收银台sync结果先到）");
                    MICRpcResponse defSucMICRpcResponse = VIUtils.getDefSucMICRpcResponse(mICRpcRequest.verifyId, mICRpcRequest.token);
                    defSucMICRpcResponse.channelError = str2;
                    return defSucMICRpcResponse;
                }
                try {
                    i = Integer.valueOf(str2).intValue();
                } catch (Exception unused) {
                }
                throw new RpcException(Integer.valueOf(i), str2);
            }
        }
        MICRpcResponse mICRpcResponse2 = this.d;
        this.d = null;
        return mICRpcResponse2;
    }

    public static boolean getIsSendRpc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("accddc08", new Object[0])).booleanValue() : b.get();
    }

    private void a(Exception exc, String str, String str2, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f223173", new Object[]{this, exc, str, str2, new Long(j), map});
            return;
        }
        try {
            viRpcExceptionAdapter(exc);
        } catch (RpcException e) {
            writeRpcBackLog(null, str, str2, j, map);
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(CommonConstant.EXCEPTION_TYPE, "vi_rpc_error");
                hashMap.put(CommonConstant.EXCEPTION_INFO, String.valueOf(e.getCode()));
                VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, CommonConstant.EXCEPTION_CASE_ID, Constants.VI_ENGINE_APPID, CommonConstant.EXCEPTION_BIZ, null, null, null, hashMap);
            } catch (Throwable th) {
                VerifyLogCat.w(f6049a, "logBehavior Exception", th);
            }
            b.set(false);
            throw e;
        }
    }

    public void viRpcExceptionAdapter(Exception exc) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3468fe4d", new Object[]{this, exc});
            return;
        }
        String name = exc.getClass().getName();
        if (TextUtils.isEmpty(name) || !name.contains("RpcException")) {
            return;
        }
        VerifyLogCat.i(f6049a, "出现RPC异常");
        try {
            i = Integer.valueOf(String.valueOf(ReflectUtils.invokeMethod(exc, "getCode", null, null))).intValue();
        } catch (Throwable unused) {
        }
        Object invokeMethod = ReflectUtils.invokeMethod(exc, "getOperationType", null, null);
        RpcException rpcException = new RpcException(Integer.valueOf(i), exc.getCause());
        rpcException.setOperationType(String.valueOf(invokeMethod));
        a("getAlert", "setAlert", exc, rpcException);
        a("getErrorSource", "setErrorSource", exc, rpcException);
        b("getMsg", "setMsg", exc, rpcException);
        b("getControl", "setControl", exc, rpcException);
        c("isControlOwn", "setControlOwn", exc, rpcException);
        c(HeaderConstant.HEADER_KEY_ISBGRPC, "setBgRpc", exc, rpcException);
        throw rpcException;
    }

    public Object invokeSuperMethod(Object obj, String str, Class[] clsArr, Object[] objArr) {
        try {
            Method declaredMethod = obj.getClass().getSuperclass().getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(obj, objArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    private void a(String str, String str2, Exception exc, RpcException rpcException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("114a3c41", new Object[]{this, str, str2, exc, rpcException});
            return;
        }
        try {
            invokeSuperMethod(rpcException, str2, new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(Integer.valueOf(String.valueOf(ReflectUtils.invokeMethod(exc, str, null, null))).intValue())});
        } catch (Throwable unused) {
        }
    }

    private void b(String str, String str2, Exception exc, RpcException rpcException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4c34e42", new Object[]{this, str, str2, exc, rpcException});
            return;
        }
        try {
            Object invokeMethod = ReflectUtils.invokeMethod(exc, str, null, null);
            if (invokeMethod == null) {
                return;
            }
            invokeSuperMethod(rpcException, str2, new Class[]{String.class}, new Object[]{String.valueOf(invokeMethod)});
        } catch (Throwable unused) {
        }
    }

    private void c(String str, String str2, Exception exc, RpcException rpcException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("783c6043", new Object[]{this, str, str2, exc, rpcException});
            return;
        }
        try {
            invokeSuperMethod(rpcException, str2, new Class[]{Boolean.TYPE}, new Object[]{Boolean.valueOf(Boolean.valueOf(String.valueOf(ReflectUtils.invokeMethod(exc, str, null, null))).booleanValue())});
        } catch (Throwable unused) {
        }
    }

    public void setTask(VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60bf55fe", new Object[]{this, verifyIdentityTask});
        } else {
            this.e = verifyIdentityTask;
        }
    }

    private VerifyIdentityTask a() {
        VerifyIdentityTask verifyIdentityTask;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VerifyIdentityTask) ipChange.ipc$dispatch("e69dab5e", new Object[]{this}) : (!VIUtils.isMultiTaskModeEnabled() || (verifyIdentityTask = this.e) == null) ? TaskManager.getInstance().getCurrentTask() : verifyIdentityTask;
    }

    public void writeRpcSendLog(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54a92114", new Object[]{this, str, str2, map});
        } else {
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-160323-1", Constants.VI_ENGINE_APPID, "hsrpcqd", str, str2, null, map, 1);
        }
    }

    public void writeRpcBackLog(MICRpcResponse mICRpcResponse, String str, String str2, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8402d5", new Object[]{this, mICRpcResponse, str, str2, new Long(j), map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> map2 = map;
        if (mICRpcResponse != null) {
            map2.put("rpcSuccess", String.valueOf(mICRpcResponse.success));
            map2.put("rpcCode", mICRpcResponse.sysErrCode);
            map2.put(Constants.VI_ENGINE_FAST_MODULENAME, mICRpcResponse.nextStep);
            map2.put(ModuleConstants.VI_TASK_VERIFYCODE, mICRpcResponse.verifyCode);
            map2.put("verifySuccess", String.valueOf(mICRpcResponse.verifySuccess));
            map2.put("useBird", mICRpcResponse.useBird);
            if (!TextUtils.isEmpty(mICRpcResponse.channelError)) {
                map2.put("channelError", mICRpcResponse.channelError);
            }
        } else {
            map2.put("rpcSuccess", "false");
        }
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-160323-2", Constants.VI_ENGINE_APPID, "hsrpcfh", str, str2, String.valueOf(SystemClock.elapsedRealtime() - j), map2, 1);
        String str3 = f6049a;
        StringBuilder sb = new StringBuilder("本次RPC耗时[");
        sb.append(mICRpcResponse != null ? mICRpcResponse.nextStep : "");
        sb.append("]：");
        TimeCostLog.log(str3, sb.toString(), j);
    }
}
