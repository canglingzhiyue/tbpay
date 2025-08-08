package com.ali.user.open.mtop.rpc;

import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.exception.RpcException;
import com.ali.user.open.core.model.RpcRequest;
import com.ali.user.open.core.model.RpcRequestCallbackWithCode;
import com.ali.user.open.core.model.RpcResponse;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.core.util.JSONUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopUnitStrategy;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MTOPWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static MTOPWrapper INSTANCE = null;
    private static final String TAG = "login.MTOPWrapperImpl";

    public static /* synthetic */ RpcResponse access$000(MTOPWrapper mTOPWrapper, MtopResponse mtopResponse, Class cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcResponse) ipChange.ipc$dispatch("c8a52a49", new Object[]{mTOPWrapper, mtopResponse, cls}) : mTOPWrapper.processMtopResponse(mtopResponse, cls);
    }

    public static synchronized MTOPWrapper getInstance() {
        synchronized (MTOPWrapper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MTOPWrapper) ipChange.ipc$dispatch("e9c52ff9", new Object[0]);
            }
            if (INSTANCE == null) {
                INSTANCE = new MTOPWrapper();
            }
            return INSTANCE;
        }
    }

    private MtopRequest buildMtopRequest(RpcRequest rpcRequest) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("bc7d99ac", new Object[]{this, rpcRequest});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(rpcRequest.target);
        mtopRequest.setVersion(rpcRequest.version);
        mtopRequest.setNeedEcode(rpcRequest.NEED_ECODE);
        mtopRequest.setNeedSession(rpcRequest.NEED_SESSION);
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < rpcRequest.paramNames.size(); i++) {
            if (rpcRequest.paramNames.get(i) != null) {
                jSONObject.put(rpcRequest.paramNames.get(i), rpcRequest.paramValues.get(i).toString());
            }
        }
        mtopRequest.setData(jSONObject.toString());
        return mtopRequest;
    }

    private <V> RpcResponse<V> processMtopResponse(MtopResponse mtopResponse, Class<V> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcResponse) ipChange.ipc$dispatch("7b46121c", new Object[]{this, mtopResponse, cls});
        }
        if (mtopResponse != null && mtopResponse.isApiSuccess()) {
            return getBizRpcResponse(mtopResponse, cls);
        }
        if (mtopResponse == null) {
            return null;
        }
        if (mtopResponse.isNetworkError()) {
            throw new RpcException((Integer) 7, mtopResponse.getRetMsg());
        }
        if (mtopResponse.isApiLockedResult()) {
            throw new RpcException((Integer) 400, mtopResponse.getRetMsg());
        }
        if (mtopResponse.is41XResult()) {
            throw new RpcException((Integer) 401, mtopResponse.getRetMsg());
        }
        if (mtopResponse.isExpiredRequest()) {
            throw new RpcException((Integer) 402, mtopResponse.getRetMsg());
        }
        if (mtopResponse.isIllegelSign()) {
            throw new RpcException((Integer) 403, mtopResponse.getRetMsg());
        }
        if (mtopResponse.isSystemError()) {
            throw new RpcException((Integer) 406, mtopResponse.getRetMsg());
        }
        if (mtopResponse.isSessionInvalid()) {
            throw new RpcException((Integer) 407, mtopResponse.getRetMsg());
        }
        if (mtopResponse.isMtopServerError()) {
            throw new RpcException((Integer) 406, mtopResponse.getRetMsg());
        }
        if (mtopResponse.isMtopSdkError()) {
            throw new RpcException((Integer) 406, mtopResponse.getRetMsg());
        }
        return getBizRpcResponse(mtopResponse, cls);
    }

    private <V> RpcResponse<V> getBizRpcResponse(MtopResponse mtopResponse, Class<V> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcResponse) ipChange.ipc$dispatch("a4e4df0d", new Object[]{this, mtopResponse, cls});
        }
        try {
            return getRpcResponse(mtopResponse, cls);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [T, java.lang.Object] */
    private <V> RpcResponse<V> getRpcResponse(MtopResponse mtopResponse, Class<V> cls) throws JSONException {
        JSONObject optJSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcResponse) ipChange.ipc$dispatch("51dbf3f4", new Object[]{this, mtopResponse, cls});
        }
        RpcResponse<V> rpcResponse = new RpcResponse<>();
        byte[] bytedata = mtopResponse.getBytedata();
        if (bytedata != null && (optJSONObject = new JSONObject(new String(bytedata)).optJSONObject("data")) != null) {
            rpcResponse.code = optJSONObject.optInt("code");
            rpcResponse.codeGroup = optJSONObject.optString("codeGroup");
            rpcResponse.message = optJSONObject.optString("message");
            rpcResponse.actionType = optJSONObject.optString("actionType");
            rpcResponse.success = optJSONObject.optBoolean("success");
            if (!StringUtils.isEmpty(optJSONObject.optString("returnValue"))) {
                rpcResponse.returnValue = JSONUtils.parseStringValue(optJSONObject.optString("returnValue"), cls);
            }
        }
        return rpcResponse;
    }

    public <T> void remoteBusiness(RpcRequest rpcRequest, final Class<T> cls, final RpcRequestCallbackWithCode rpcRequestCallbackWithCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a3d0c0", new Object[]{this, rpcRequest, cls, rpcRequestCallbackWithCode});
        } else if (rpcRequest == null || rpcRequestCallbackWithCode == null) {
        } else {
            try {
                SDKLogger.e(TAG, "start request=" + rpcRequest.target);
                MtopBusiness build = MtopBusiness.build(Mtop.instance(StringUtils.isEmpty(rpcRequest.mtopInstanceName) ? Mtop.Id.INNER : rpcRequest.mtopInstanceName, KernelContext.applicationContext, ""), buildMtopRequest(rpcRequest), AliMemberSDK.ttid);
                boolean z = rpcRequest.NEED_ECODE;
                String str = MtopUnitStrategy.CENTER_DAILY_DOMAIN;
                String str2 = MtopUnitStrategy.CENTER_PRE_DOMAIN;
                String str3 = MtopUnitStrategy.CENTER_ONLINE_DOMAIN;
                if (z) {
                    if (!StringUtils.isEmpty(ConfigManager.getInstance().sessionOnlineDomain)) {
                        str3 = ConfigManager.getInstance().sessionOnlineDomain;
                    }
                    if (!StringUtils.isEmpty(ConfigManager.getInstance().sessionPreDomain)) {
                        str2 = ConfigManager.getInstance().sessionPreDomain;
                    }
                    if (!StringUtils.isEmpty(ConfigManager.getInstance().sessionDailyDomain)) {
                        str = ConfigManager.getInstance().sessionPreDomain;
                    }
                    build.mo1314setCustomDomain(str3, str2, str);
                } else {
                    if (!StringUtils.isEmpty(ConfigManager.getInstance().onlineDomain)) {
                        str3 = ConfigManager.getInstance().onlineDomain;
                    }
                    if (!StringUtils.isEmpty(ConfigManager.getInstance().preDomain)) {
                        str2 = ConfigManager.getInstance().preDomain;
                    }
                    if (!StringUtils.isEmpty(ConfigManager.getInstance().dailyDomain)) {
                        str = ConfigManager.getInstance().dailyDomain;
                    }
                    build.mo1314setCustomDomain(str3, str2, str);
                }
                build.mo1305reqMethod(MethodEnum.POST);
                build.mo1342showLoginUI(rpcRequest.SHOW_LOGIN_UI);
                build.mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.ali.user.open.mtop.rpc.MTOPWrapper.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        SDKLogger.e(MTOPWrapper.TAG, "response=" + mtopResponse.getDataJsonObject().toString());
                        try {
                            SDKLogger.e(MTOPWrapper.TAG, "traceid=" + mtopResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2).get(0));
                        } catch (Throwable unused) {
                        }
                        rpcRequestCallbackWithCode.onSuccess(MTOPWrapper.access$000(MTOPWrapper.this, mtopResponse, cls));
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        try {
                            SDKLogger.e(MTOPWrapper.TAG, "retCode=" + mtopResponse.getRetCode() + ":retMsg=" + mtopResponse.getRetMsg());
                            StringBuilder sb = new StringBuilder();
                            sb.append("traceid=");
                            sb.append(mtopResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2).get(0));
                            SDKLogger.e(MTOPWrapper.TAG, sb.toString());
                        } catch (Throwable unused) {
                        }
                        String retCode = mtopResponse != null ? mtopResponse.getRetCode() : "-1";
                        try {
                            rpcRequestCallbackWithCode.onError(retCode, MTOPWrapper.access$000(MTOPWrapper.this, mtopResponse, cls));
                        } catch (RpcException e) {
                            RpcResponse rpcResponse = new RpcResponse();
                            rpcResponse.code = e.getCode();
                            rpcResponse.message = "亲，您的手机网络不太顺畅哦~";
                            rpcRequestCallbackWithCode.onError(retCode, rpcResponse);
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        try {
                            SDKLogger.e(MTOPWrapper.TAG, "retCode=" + mtopResponse.getRetCode() + ":retMsg=" + mtopResponse.getRetMsg());
                            StringBuilder sb = new StringBuilder();
                            sb.append("traceid=");
                            sb.append(mtopResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2).get(0));
                            SDKLogger.e(MTOPWrapper.TAG, sb.toString());
                        } catch (Throwable unused) {
                        }
                        String retCode = mtopResponse != null ? mtopResponse.getRetCode() : "-1";
                        try {
                            rpcRequestCallbackWithCode.onSystemError(retCode, MTOPWrapper.access$000(MTOPWrapper.this, mtopResponse, cls));
                        } catch (RpcException e) {
                            RpcResponse rpcResponse = new RpcResponse();
                            rpcResponse.code = e.getCode();
                            rpcResponse.message = "亲，您的手机网络不太顺畅哦~";
                            rpcRequestCallbackWithCode.onSystemError(retCode, rpcResponse);
                        }
                    }
                });
                build.startRequest();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
