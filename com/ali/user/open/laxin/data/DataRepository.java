package com.ali.user.open.laxin.data;

import mtopsdk.common.util.StringUtils;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.callback.MemberCallback;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.device.DeviceInfo;
import com.ali.user.open.core.model.RpcRequest;
import com.ali.user.open.core.model.RpcRequestCallbackWithCode;
import com.ali.user.open.core.service.RpcService;
import com.ali.user.open.core.service.StorageService;
import com.ali.user.open.core.util.CommonUtils;
import com.ali.user.open.core.util.RiskControlInfoContext;
import com.ali.user.open.laxin.util.SecurityUtil;
import com.ali.user.open.ucc.data.ApiConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.session.constants.SessionConstants;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class DataRepository {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-119182862);
    }

    public static void fetchLaxinPref(final RpcRequestCallbackWithCode rpcRequestCallbackWithCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a66d81d1", new Object[]{rpcRequestCallbackWithCode});
            return;
        }
        final RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.target = "mtop.taobao.crossLoginService.app.get";
        rpcRequest.version = "1.0";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SessionConstants.LOGIN_SITE, AliMemberSDK.getMasterSite());
            jSONObject.put("loginSiteAppKey", ((StorageService) AliMemberSDK.getService(StorageService.class)).getAppKey());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        rpcRequest.addParam("request", jSONObject.toString());
        StorageService storageService = (StorageService) AliMemberSDK.getService(StorageService.class);
        String umid = storageService == null ? "" : storageService.getUmid();
        if (StringUtils.isEmpty(umid) || umid.length() == 24) {
            storageService.getUmid(new MemberCallback<String>() { // from class: com.ali.user.open.laxin.data.DataRepository.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.core.callback.FailureCallback
                public void onFailure(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9a2a071b", new Object[]{this, new Integer(i), str});
                    }
                }

                @Override // com.ali.user.open.core.callback.MemberCallback
                public void onSuccess(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("37d948b5", new Object[]{this, str});
                        return;
                    }
                    RpcRequest.this.addParam("riskControlInfo", RiskControlInfoContext.buildRiskControlInfo());
                    ((RpcService) AliMemberSDK.getService(RpcService.class)).remoteBusiness(RpcRequest.this, FetchAppInfo.class, rpcRequestCallbackWithCode);
                }
            });
            return;
        }
        rpcRequest.addParam("riskControlInfo", RiskControlInfoContext.buildRiskControlInfo());
        ((RpcService) AliMemberSDK.getService(RpcService.class)).remoteBusiness(rpcRequest, FetchAppInfo.class, rpcRequestCallbackWithCode);
    }

    public static void applyLaxinToken(String str, String str2, String str3, RpcRequestCallbackWithCode rpcRequestCallbackWithCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4026d8c5", new Object[]{str, str2, str3, rpcRequestCallbackWithCode});
            return;
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.target = "mtop.taobao.crossloginservice.token.get";
        rpcRequest.version = "1.0";
        rpcRequest.NEED_ECODE = true;
        rpcRequest.NEED_SESSION = true;
        rpcRequest.SHOW_LOGIN_UI = false;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ApiConstants.ApiField.LOCAL_SITE, AliMemberSDK.getMasterSite());
            jSONObject.put(SessionConstants.LOGIN_SITE, str);
            jSONObject.put("siteAppKey", ((StorageService) AliMemberSDK.getService(StorageService.class)).getAppKey());
            jSONObject.put("loginSiteAppKey", str2);
            jSONObject.put("sign", SecurityUtil.getFingerprint(KernelContext.getApplicationContext(), str3));
            jSONObject.put("appName", ((StorageService) AliMemberSDK.getService(StorageService.class)).getAppKey());
            jSONObject.put("appVersion", CommonUtils.getAndroidAppVersion());
            jSONObject.put("ttid", "android_1.0.2");
            jSONObject.put("utdid", DeviceInfo.deviceId);
            jSONObject.put("sdkVersion", KernelContext.getSdkVersion());
            jSONObject.put("deviceId", DeviceInfo.deviceId);
            rpcRequest.addParam("request", jSONObject.toString());
            rpcRequest.addParam("riskControlInfo", RiskControlInfoContext.buildRiskControlInfo());
            ((RpcService) AliMemberSDK.getService(RpcService.class)).remoteBusiness(rpcRequest, CrossAppLoginResponse.class, rpcRequestCallbackWithCode);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
