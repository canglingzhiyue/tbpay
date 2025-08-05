package com.ali.user.mobile.impl;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.app.dataprovider.IntOrangeResult;
import com.ali.user.mobile.app.init.Debuggable;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.callback.RpcRequestCallbackWithCode;
import com.ali.user.mobile.exception.RpcException;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.rpc.RpcRequest;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.filter.FilterManager;
import com.ali.user.mobile.utils.ResourceUtil;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import org.json.JSONObject;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class MTOPWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static MTOPWrapper INSTANCE = null;
    private static final int MTOP_BIZ_CODE = 94;
    private static final String TAG = "login.MTOPWrapperImpl";

    static {
        kge.a(227299684);
    }

    public static /* synthetic */ void access$000(MTOPWrapper mTOPWrapper, RpcRequest rpcRequest, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed67345a", new Object[]{mTOPWrapper, rpcRequest, mtopResponse});
        } else {
            mTOPWrapper.mtopRequestSuccessTrack(rpcRequest, mtopResponse);
        }
    }

    public static /* synthetic */ void access$100(MTOPWrapper mTOPWrapper, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d38ce948", new Object[]{mTOPWrapper, mtopResponse});
        } else {
            mTOPWrapper.rpcFailRecord(mtopResponse);
        }
    }

    public static /* synthetic */ void access$200(MTOPWrapper mTOPWrapper, RpcRequest rpcRequest, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60605fdc", new Object[]{mTOPWrapper, rpcRequest, mtopResponse});
        } else {
            mTOPWrapper.mtopRequestFailTrack(rpcRequest, mtopResponse);
        }
    }

    public static synchronized MTOPWrapper getInstance() {
        synchronized (MTOPWrapper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MTOPWrapper) ipChange.ipc$dispatch("a31e074f", new Object[0]);
            }
            if (INSTANCE == null) {
                synchronized (MTOPWrapper.class) {
                    if (INSTANCE == null) {
                        INSTANCE = new MTOPWrapper();
                    }
                }
            }
            return INSTANCE;
        }
    }

    private MTOPWrapper() {
    }

    public <T extends RpcResponse<?>> T post(RpcRequest rpcRequest, Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("1cfb3a20", new Object[]{this, rpcRequest, cls}) : (T) post(rpcRequest, cls, null);
    }

    public <T extends RpcResponse<?>> T post(RpcRequest rpcRequest, Class<T> cls, String str) {
        MtopResponse mtopResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("e3f95c2a", new Object[]{this, rpcRequest, cls, str});
        }
        try {
            mtopRequestCommitTrack(rpcRequest);
            MtopBuilder mo1339retryTime = Mtop.instance(DataProviderFactory.getApplicationContext()).build(buildMtopRequest(rpcRequest), DataProviderFactory.getDataProvider().getTTID()).mo1305reqMethod(MethodEnum.POST).mo1340setBizId(94).mo1312setConnectionTimeoutMilliSecond(7000).mo1326setSocketTimeoutMilliSecond(7000).mo1339retryTime(1);
            if (!TextUtils.isEmpty(str)) {
                mo1339retryTime.mo1325setReqUserId(str);
            }
            IntOrangeResult mtopTimeOutMilliSecond = DataProviderFactory.getOrangeConfig().getMtopTimeOutMilliSecond();
            if (mtopTimeOutMilliSecond.orangeExist) {
                mo1339retryTime.mo1312setConnectionTimeoutMilliSecond(mtopTimeOutMilliSecond.value).mo1326setSocketTimeoutMilliSecond(mtopTimeOutMilliSecond.value);
            }
            Map<String, String> additionalHeaders = DataProviderFactory.getDataProvider().getAdditionalHeaders();
            if (additionalHeaders == null) {
                additionalHeaders = new HashMap<>();
            }
            if (LoginSwitch.getSwitch("baxia_switch", "true")) {
                additionalHeaders.put("login_sdk_version", AppInfo.getInstance().getSdkVersion().replace("android_", ""));
            }
            mo1339retryTime.mo1297headers(additionalHeaders);
            mo1339retryTime.mo1314setCustomDomain(rpcRequest.onlineDomain != null ? rpcRequest.onlineDomain : DataProviderFactory.getDataProvider().getOnlineDomain(), rpcRequest.preDomain != null ? rpcRequest.preDomain : DataProviderFactory.getDataProvider().getPreDomain(), rpcRequest.dailyDomain != null ? rpcRequest.dailyDomain : DataProviderFactory.getDataProvider().getDailyDomain());
            long currentTimeMillis = System.currentTimeMillis();
            mtopResponse = mo1339retryTime.syncRequest();
            try {
                long currentTimeMillis2 = System.currentTimeMillis();
                LoginTLogAdapter.e(TAG, "receive MtopResponse" + mtopResponse + ",time=" + (currentTimeMillis2 - currentTimeMillis));
                if (mtopResponse != null && mtopResponse.isApiSuccess()) {
                    mtopRequestSuccessTrack(rpcRequest, mtopResponse);
                } else {
                    mtopRequestFailTrack(rpcRequest, mtopResponse);
                }
            } catch (Exception e) {
                e = e;
                LoginTLogAdapter.e(TAG, "MtopResponse error", e);
                e.printStackTrace();
                if (mtopResponse == null) {
                }
                LoginTLogAdapter.e(TAG, "MtopResponse response=null");
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            mtopResponse = null;
        }
        if (mtopResponse == null && cls != null) {
            if (!mtopResponse.isApiSuccess()) {
                rpcFailRecord(mtopResponse);
            }
            return (T) processMtopResponse(mtopResponse, cls);
        }
        LoginTLogAdapter.e(TAG, "MtopResponse response=null");
        return null;
    }

    public <T extends RpcResponse<?>> T processMtopResponse(MtopResponse mtopResponse, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("27a9a656", new Object[]{this, mtopResponse, cls});
        }
        if (mtopResponse != null && mtopResponse.isApiSuccess()) {
            return (T) getBizData(mtopResponse, cls);
        }
        if (mtopResponse == null) {
            return null;
        }
        if (mtopResponse.isNetworkError()) {
            throw new RpcException(3004, ResourceUtil.getNetworkError(), mtopResponse.getRetCode());
        }
        if (mtopResponse.isApiLockedResult()) {
            throw new RpcException(400, ResourceUtil.getNetworkError(), mtopResponse.getRetCode());
        }
        if (mtopResponse.is41XResult()) {
            throw new RpcException(401, ResourceUtil.getNetworkError(), mtopResponse.getRetCode());
        }
        if (mtopResponse.isExpiredRequest()) {
            throw new RpcException(402, ResourceUtil.getNetworkError(), mtopResponse.getRetCode());
        }
        if (mtopResponse.isIllegelSign()) {
            throw new RpcException(403, ResourceUtil.getNetworkError(), mtopResponse.getRetCode());
        }
        if (mtopResponse.isSystemError()) {
            if (TextUtils.equals(mtopResponse.getRetMsg(), ResourceUtil.getStringById("aliuser_server_error_msg"))) {
                throw new RpcException(406, mtopResponse.getRetMsg(), mtopResponse.getRetCode());
            }
            throw new RpcException(406, ResourceUtil.getNetworkError(), mtopResponse.getRetCode());
        } else if (mtopResponse.isMtopSdkError()) {
            throw new RpcException(406, ResourceUtil.getNetworkError(), mtopResponse.getRetCode());
        } else {
            if (mtopResponse.isSessionInvalid()) {
                throw new RpcException(407, ResourceUtil.getNetworkError(), mtopResponse.getRetCode());
            }
            return (T) getBizData(mtopResponse, cls);
        }
    }

    private <T extends RpcResponse<?>> T getBizData(MtopResponse mtopResponse, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("a09fe807", new Object[]{this, mtopResponse, cls});
        }
        try {
            JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
            if (dataJsonObject == null) {
                return null;
            }
            return (T) JSON.parseObject(dataJsonObject.toString(), cls);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public <T extends RpcResponse<?>> void remoteBusiness(RpcRequest rpcRequest, Class<T> cls, String str, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3022a029", new Object[]{this, rpcRequest, cls, str, rpcRequestCallback});
        } else if (rpcRequest == null || rpcRequestCallback == null) {
        } else {
            remoteBusiness(rpcRequest, cls, str, rpcRequestCallback, null);
        }
    }

    public <T extends RpcResponse<?>> void remoteBusiness(RpcRequest rpcRequest, Class<T> cls, RpcRequestCallbackWithCode rpcRequestCallbackWithCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5302fa0", new Object[]{this, rpcRequest, cls, rpcRequestCallbackWithCode});
        } else if (rpcRequest == null || rpcRequestCallbackWithCode == null) {
        } else {
            remoteBusiness(rpcRequest, cls, null, null, rpcRequestCallbackWithCode);
        }
    }

    private <T extends RpcResponse<?>> void remoteBusiness(final RpcRequest rpcRequest, final Class<T> cls, String str, final RpcRequestCallback rpcRequestCallback, final RpcRequestCallbackWithCode rpcRequestCallbackWithCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da4f7f4", new Object[]{this, rpcRequest, cls, str, rpcRequestCallback, rpcRequestCallbackWithCode});
            return;
        }
        try {
            mtopRequestCommitTrack(rpcRequest);
            MtopBusiness build = MtopBusiness.build(buildMtopRequest(rpcRequest), DataProviderFactory.getDataProvider().getTTID());
            Map<String, String> additionalHeaders = DataProviderFactory.getDataProvider().getAdditionalHeaders();
            if (additionalHeaders == null) {
                additionalHeaders = new HashMap<>();
            }
            if (LoginSwitch.getSwitch("baxia_switch", "true")) {
                additionalHeaders.put("login_sdk_version", AppInfo.getInstance().getSdkVersion().replace("android_", ""));
            }
            build.mo1297headers(additionalHeaders);
            if (!TextUtils.isEmpty(str)) {
                build.mo1325setReqUserId(str);
            }
            build.mo1305reqMethod(MethodEnum.POST);
            build.mo1314setCustomDomain(rpcRequest.onlineDomain != null ? rpcRequest.onlineDomain : DataProviderFactory.getDataProvider().getOnlineDomain(), rpcRequest.preDomain != null ? rpcRequest.preDomain : DataProviderFactory.getDataProvider().getPreDomain(), rpcRequest.dailyDomain != null ? rpcRequest.dailyDomain : DataProviderFactory.getDataProvider().getDailyDomain());
            IntOrangeResult mtopTimeOutMilliSecond = DataProviderFactory.getOrangeConfig().getMtopTimeOutMilliSecond();
            if (mtopTimeOutMilliSecond.orangeExist) {
                build.mo1312setConnectionTimeoutMilliSecond(mtopTimeOutMilliSecond.value);
                build.mo1326setSocketTimeoutMilliSecond(mtopTimeOutMilliSecond.value);
            } else {
                build.mo1312setConnectionTimeoutMilliSecond(rpcRequest.connectionTimeoutMilliSecond);
                build.mo1326setSocketTimeoutMilliSecond(rpcRequest.socketTimeoutMilliSecond);
            }
            build.mo1342showLoginUI(rpcRequest.SHOW_LOGIN_UI);
            build.mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.ali.user.mobile.impl.MTOPWrapper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    RpcResponse processMtopResponse = MTOPWrapper.this.processMtopResponse(mtopResponse, cls);
                    FilterManager.getInstance().afterRpc(rpcRequest.getAfterFilters(), processMtopResponse);
                    RpcRequestCallback rpcRequestCallback2 = rpcRequestCallback;
                    if (rpcRequestCallback2 != null) {
                        rpcRequestCallback2.onSuccess(processMtopResponse);
                    } else {
                        RpcRequestCallbackWithCode rpcRequestCallbackWithCode2 = rpcRequestCallbackWithCode;
                        if (rpcRequestCallbackWithCode2 != null) {
                            rpcRequestCallbackWithCode2.onSuccess(processMtopResponse);
                        }
                    }
                    MTOPWrapper.access$000(MTOPWrapper.this, rpcRequest, mtopResponse);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    LoginTLogAdapter.e(MTOPWrapper.TAG, "onError() called with: requestType = [" + i + "], response = [" + mtopResponse + "], requestContext = [" + obj + riy.ARRAY_END_STR);
                    String retCode = mtopResponse != null ? mtopResponse.getRetCode() : "-1";
                    try {
                        RpcResponse processMtopResponse = MTOPWrapper.this.processMtopResponse(mtopResponse, cls);
                        FilterManager.getInstance().afterRpc(rpcRequest.getAfterFilters(), processMtopResponse);
                        if (rpcRequestCallback != null) {
                            rpcRequestCallback.onError(processMtopResponse);
                        } else if (rpcRequestCallbackWithCode != null) {
                            rpcRequestCallbackWithCode.onError(retCode, processMtopResponse);
                        }
                        MTOPWrapper.access$100(MTOPWrapper.this, mtopResponse);
                        MTOPWrapper.access$200(MTOPWrapper.this, rpcRequest, mtopResponse);
                    } catch (RpcException e) {
                        RpcResponse rpcResponse = new RpcResponse();
                        rpcResponse.code = e.getCode();
                        if (TextUtils.equals(e.getMsg(), ResourceUtil.getStringById("aliuser_server_error_msg"))) {
                            rpcResponse.message = e.getMsg();
                        } else {
                            rpcResponse.message = ResourceUtil.getNetworkError();
                        }
                        FilterManager.getInstance().afterRpc(rpcRequest.getAfterFilters(), rpcResponse);
                        RpcRequestCallback rpcRequestCallback2 = rpcRequestCallback;
                        if (rpcRequestCallback2 != null) {
                            rpcRequestCallback2.onError(null);
                        } else {
                            RpcRequestCallbackWithCode rpcRequestCallbackWithCode2 = rpcRequestCallbackWithCode;
                            if (rpcRequestCallbackWithCode2 != null) {
                                rpcRequestCallbackWithCode2.onSystemError(retCode, null);
                            }
                        }
                        MTOPWrapper.access$200(MTOPWrapper.this, rpcRequest, mtopResponse);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    LoginTLogAdapter.e(MTOPWrapper.TAG, "onSystemError() called with: requestType = [" + i + "], response = [" + mtopResponse + "], requestContext = [" + obj + riy.ARRAY_END_STR);
                    String retCode = mtopResponse != null ? mtopResponse.getRetCode() : "-1";
                    try {
                        RpcResponse processMtopResponse = MTOPWrapper.this.processMtopResponse(mtopResponse, cls);
                        FilterManager.getInstance().afterRpc(rpcRequest.getAfterFilters(), processMtopResponse);
                        if (rpcRequestCallback != null) {
                            rpcRequestCallback.onError(processMtopResponse);
                        } else if (rpcRequestCallbackWithCode != null) {
                            rpcRequestCallbackWithCode.onSystemError(retCode, processMtopResponse);
                        }
                        MTOPWrapper.access$100(MTOPWrapper.this, mtopResponse);
                        MTOPWrapper.access$200(MTOPWrapper.this, rpcRequest, mtopResponse);
                    } catch (RpcException e) {
                        RpcResponse rpcResponse = new RpcResponse();
                        rpcResponse.code = e.getCode();
                        if (TextUtils.equals(e.getMsg(), ResourceUtil.getStringById("aliuser_server_error_msg"))) {
                            rpcResponse.message = e.getMsg();
                        } else {
                            rpcResponse.message = ResourceUtil.getNetworkError();
                        }
                        FilterManager.getInstance().afterRpc(rpcRequest.getAfterFilters(), rpcResponse);
                        RpcRequestCallback rpcRequestCallback2 = rpcRequestCallback;
                        if (rpcRequestCallback2 != null) {
                            rpcRequestCallback2.onError(rpcResponse);
                        } else {
                            RpcRequestCallbackWithCode rpcRequestCallbackWithCode2 = rpcRequestCallbackWithCode;
                            if (rpcRequestCallbackWithCode2 != null) {
                                rpcRequestCallbackWithCode2.onSystemError(retCode, rpcResponse);
                            }
                        }
                        MTOPWrapper.access$200(MTOPWrapper.this, rpcRequest, mtopResponse);
                    }
                }
            });
            build.startRequest();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private MtopRequest buildMtopRequest(RpcRequest rpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("9c0eff9e", new Object[]{this, rpcRequest});
        }
        if (rpcRequest == null) {
            return null;
        }
        try {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(rpcRequest.API_NAME);
            mtopRequest.setVersion(rpcRequest.VERSION);
            mtopRequest.setNeedEcode(rpcRequest.NEED_ECODE);
            mtopRequest.setNeedSession(rpcRequest.NEED_SESSION);
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < rpcRequest.paramNames.size(); i++) {
                if (rpcRequest.paramNames.get(i) != null && rpcRequest.paramValues.get(i) != null) {
                    jSONObject.put(rpcRequest.paramNames.get(i), rpcRequest.paramValues.get(i).toString());
                }
            }
            if (Debuggable.isDebug()) {
                String str = "buildMtopRequest: api=" + rpcRequest.API_NAME + ",data=" + jSONObject.toString();
            }
            mtopRequest.setData(jSONObject.toString());
            return mtopRequest;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private void rpcFailRecord(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8a2fc60", new Object[]{this, mtopResponse});
            return;
        }
        try {
            Properties properties = new Properties();
            properties.setProperty("api", mtopResponse.getApi() + "");
            properties.setProperty("errorCode", mtopResponse.getRetCode() + "");
            properties.setProperty("errorMsg", mtopResponse.getRetMsg() + "");
            try {
                properties.setProperty("traceid", mtopResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2).get(0) + "");
            } catch (Exception unused) {
            }
            UserTrackAdapter.sendUT("rpcResult", properties);
        } catch (Throwable unused2) {
        }
    }

    private void mtopRequestCommitTrack(RpcRequest rpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deaf4747", new Object[]{this, rpcRequest});
            return;
        }
        Properties properties = new Properties();
        properties.setProperty("monitor", "T");
        UserTrackAdapter.sendExtendUT("mtopRpc_commit", "", rpcRequest.API_NAME, properties);
    }

    private void mtopRequestSuccessTrack(RpcRequest rpcRequest, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4068e6ee", new Object[]{this, rpcRequest, mtopResponse});
            return;
        }
        Properties properties = new Properties();
        properties.setProperty("monitor", "T");
        UserTrackAdapter.sendExtendUT("mtopRpc_success", mtopResponse == null ? "-100" : mtopResponse.getRetCode(), rpcRequest.API_NAME, properties);
    }

    private void mtopRequestFailTrack(RpcRequest rpcRequest, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b81fa2c5", new Object[]{this, rpcRequest, mtopResponse});
            return;
        }
        Properties properties = new Properties();
        properties.setProperty("monitor", "T");
        String str = "-100";
        if (mtopResponse == null || TextUtils.isEmpty(mtopResponse.getRetCode()) || mtopResponse.getRetCode().startsWith("FAIL_SYS") || mtopResponse.getRetCode().startsWith("ANDROID_SYS")) {
            if (mtopResponse != null) {
                str = mtopResponse.getRetCode();
            }
            UserTrackAdapter.sendExtendUT("mtopRpc_failure", str, rpcRequest.API_NAME, properties);
            return;
        }
        if (mtopResponse != null) {
            str = mtopResponse.getRetCode();
        }
        UserTrackAdapter.sendExtendUT("mtopRpc_success", str, rpcRequest.API_NAME, properties);
    }
}
