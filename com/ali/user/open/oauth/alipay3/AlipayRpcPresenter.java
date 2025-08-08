package com.ali.user.open.oauth.alipay3;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.Site;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.device.DeviceInfo;
import com.ali.user.open.core.model.RpcRequest;
import com.ali.user.open.core.model.RpcRequestCallbackWithCode;
import com.ali.user.open.core.model.RpcResponse;
import com.ali.user.open.core.model.UccBaseRequest;
import com.ali.user.open.core.service.MemberExecutorService;
import com.ali.user.open.core.service.RpcService;
import com.ali.user.open.core.service.StorageService;
import com.ali.user.open.core.util.CommonUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AlipayRpcPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void getAlipaySign(final GetSignCallback getSignCallback, SignRequest signRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b584fc4a", new Object[]{getSignCallback, signRequest});
        } else {
            getAlipaySign(signRequest, new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.oauth.alipay3.AlipayRpcPresenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSuccess(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                    } else if (rpcResponse != null && rpcResponse.returnValue != 0) {
                        final String str = ((SignResult) rpcResponse.returnValue).queryUrlArgs;
                        if (GetSignCallback.this == null) {
                            return;
                        }
                        ((MemberExecutorService) AliMemberSDK.getService(MemberExecutorService.class)).postUITask(new Runnable() { // from class: com.ali.user.open.oauth.alipay3.AlipayRpcPresenter.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    GetSignCallback.this.onGetSignSuccessed(str);
                                }
                            }
                        });
                    } else {
                        CommonUtils.onFailure(GetSignCallback.this, 203, "");
                    }
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSystemError(String str, RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str, rpcResponse});
                    } else {
                        CommonUtils.onFailure(GetSignCallback.this, rpcResponse.code, rpcResponse.message);
                    }
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onError(String str, RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3aace899", new Object[]{this, str, rpcResponse});
                    } else {
                        CommonUtils.onFailure(GetSignCallback.this, rpcResponse.code, rpcResponse.message);
                    }
                }
            });
        }
    }

    public static void buildBaseUccRequest(UccBaseRequest uccBaseRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e60c42", new Object[]{uccBaseRequest});
            return;
        }
        uccBaseRequest.appName = ((StorageService) AliMemberSDK.getService(StorageService.class)).getAppKey();
        uccBaseRequest.appVersion = CommonUtils.getAndroidAppVersion();
        uccBaseRequest.deviceName = Build.MODEL;
        uccBaseRequest.sdkVersion = KernelContext.getSdkVersion();
        uccBaseRequest.utdid = DeviceInfo.deviceId;
        uccBaseRequest.locale = DeviceInfo.getLocale(KernelContext.applicationContext);
    }

    public static void getAlipaySign(SignRequest signRequest, RpcRequestCallbackWithCode rpcRequestCallbackWithCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc589be0", new Object[]{signRequest, rpcRequestCallbackWithCode});
            return;
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.target = "mtop.taobao.login.signForAlipaySNSLogin";
        rpcRequest.version = "1.0";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appName", ((StorageService) AliMemberSDK.getService(StorageService.class)).getAppKey());
            jSONObject.put("appVersion", CommonUtils.getAndroidAppVersion());
            jSONObject.put("ttid", "android_1.0.2");
            jSONObject.put("utdid", DeviceInfo.deviceId);
            jSONObject.put("sdkVersion", KernelContext.getSdkVersion());
            jSONObject.put("deviceId", DeviceInfo.deviceId);
            jSONObject.put("site", Site.getHavanaSite(AliMemberSDK.getMasterSite()));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("target_id", signRequest.target_id);
            jSONObject2.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, signRequest.pid);
            jSONObject2.put("app_id", signRequest.app_id);
            jSONObject2.put("sign_type", signRequest.sign_type);
            jSONObject2.put(Constants.Name.SCOPE, StringUtils.isEmpty(signRequest.scope) ? "auth_user" : signRequest.scope);
            jSONObject2.put("apiVersion", "2.0");
            try {
                jSONObject2.put("deviceName", Build.MODEL);
                jSONObject2.put("snsType", signRequest.sign_type);
            } catch (Exception e) {
                e.printStackTrace();
            }
            jSONObject.put("ext", jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        rpcRequest.addParam(ApiConstants.ApiField.LOGIN_INFO, jSONObject.toString());
        ((RpcService) AliMemberSDK.getService(RpcService.class)).remoteBusiness(rpcRequest, SignResult.class, rpcRequestCallbackWithCode);
    }
}
