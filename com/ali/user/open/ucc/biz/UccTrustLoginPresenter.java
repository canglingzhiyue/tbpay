package com.ali.user.open.ucc.biz;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.Site;
import com.ali.user.open.core.callback.CallbackManager;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.model.LoginReturnData;
import com.ali.user.open.core.model.ResultCode;
import com.ali.user.open.core.model.RpcRequestCallbackWithCode;
import com.ali.user.open.core.model.RpcResponse;
import com.ali.user.open.core.util.DialogHelper;
import com.ali.user.open.core.util.ParamsConstants;
import com.ali.user.open.ucc.UccCallback;
import com.ali.user.open.ucc.UccServiceImpl;
import com.ali.user.open.ucc.UccServiceProviderFactory;
import com.ali.user.open.ucc.context.UccContext;
import com.ali.user.open.ucc.data.DataRepository;
import com.ali.user.open.ucc.model.UccParams;
import com.ali.user.open.ucc.remote.broadcast.UccBroadcastHelper;
import com.ali.user.open.ucc.remote.broadcast.UccResultAction;
import com.ali.user.open.ucc.util.UTHitConstants;
import com.ali.user.open.ucc.util.UTHitUtils;
import com.ali.user.open.ucc.util.UccConstants;
import com.ali.user.open.ucc.util.Utils;
import com.ali.user.open.ucc.webview.UccWebViewActivity;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class UccTrustLoginPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile UccTrustLoginPresenter instance;

    static {
        kge.a(2119242360);
    }

    public static /* synthetic */ void access$000(UccTrustLoginPresenter uccTrustLoginPresenter, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b0dc65a", new Object[]{uccTrustLoginPresenter, context});
        } else {
            uccTrustLoginPresenter.finishActivity(context);
        }
    }

    public static UccTrustLoginPresenter getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UccTrustLoginPresenter) ipChange.ipc$dispatch("abf734bb", new Object[0]);
        }
        if (instance == null) {
            synchronized (UccTrustLoginPresenter.class) {
                if (instance == null) {
                    instance = new UccTrustLoginPresenter();
                }
            }
        }
        return instance;
    }

    public void doTrustLogin(final Activity activity, final UccParams uccParams, final String str, final Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92489357", new Object[]{this, activity, uccParams, str, map, uccCallback});
            return;
        }
        UccContext.startTrustLoginTime = System.currentTimeMillis();
        DataRepository.trustLogin(uccParams, map, new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.biz.UccTrustLoginPresenter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                } else if (rpcResponse == null) {
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(rpcResponse.code);
                    String str2 = "";
                    sb.append(str2);
                    rpcResultHit(sb.toString(), rpcResponse.actionType, str2);
                    if (rpcResponse.code == 3000 || TextUtils.equals("SUCCESS", rpcResponse.actionType)) {
                        UccBizContants.mBusyControlMap.put(str, Long.valueOf(System.currentTimeMillis()));
                        boolean isCookieOnly = UccOauthLoginPresenter.isCookieOnly(map);
                        String str3 = (String) rpcResponse.returnValue;
                        String string = JSON.parseObject(str3).getString("authorizationResponse");
                        if (!TextUtils.isEmpty(string)) {
                            UccServiceProviderFactory.getInstance().getUccServiceProvider(str).refreshWhenLogin(str, string, isCookieOnly);
                        } else {
                            UccServiceProviderFactory.getInstance().getUccServiceProvider(str).refreshWhenLogin(str, str3, isCookieOnly);
                        }
                        Intent intent = new Intent();
                        intent.setAction(UccResultAction.NOTIFY_UCC_LOGIN_SUCCESS.name());
                        intent.setPackage(KernelContext.getApplicationContext().getPackageName());
                        Map map2 = map;
                        if (map2 != null) {
                            str2 = (String) map2.get("process");
                        }
                        intent.putExtra("process", str2);
                        intent.putExtra("site", str);
                        UccBroadcastHelper.sendBroadcast(intent);
                        if (uccCallback == null) {
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(UccConstants.PARAM_LOGIN_DATA, string);
                        } else {
                            hashMap.put(UccConstants.PARAM_LOGIN_DATA, str3);
                        }
                        uccCallback.onSuccess(str, hashMap);
                        return;
                    }
                    rpcResultHit(rpcResponse.code + str2, str2, str2);
                    UccCallback uccCallback2 = uccCallback;
                    if (uccCallback2 == null) {
                        return;
                    }
                    uccCallback2.onFail(str, rpcResponse.code, Utils.buidErrorMessage(rpcResponse, "免登response为空"));
                }
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSystemError(String str2, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str2, rpcResponse});
                    return;
                }
                int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1005);
                rpcResultHit(buidErrorCode + "", rpcResponse == null ? "" : rpcResponse.actionType, "");
                Integer num = UccBizContants.mTrustLoginErrorTime.get(str);
                if (num == null) {
                    num = 0;
                }
                UccBizContants.mTrustLoginErrorTime.put(str, Integer.valueOf(num.intValue() + 1));
                UccCallback uccCallback2 = uccCallback;
                if (uccCallback2 == null) {
                    return;
                }
                uccCallback2.onFail(str, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "免登失败"));
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onError(String str2, RpcResponse rpcResponse) {
                String str3;
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3aace899", new Object[]{this, str2, rpcResponse});
                    return;
                }
                Map map2 = map;
                boolean z2 = map2 == null || !TextUtils.equals((CharSequence) map2.get(ParamsConstants.Key.PARAM_NEED_UI), "0");
                int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1005);
                String str4 = "1";
                String str5 = "";
                if (z2 && TextUtils.equals("NEED_BIND", rpcResponse.actionType)) {
                    rpcResultHit(buidErrorCode + str5, rpcResponse.actionType, str5);
                    String str6 = (String) rpcResponse.returnValue;
                    Map map3 = map;
                    if (map3 != null && "0".equals(map3.get(ParamsConstants.Key.PARAM_NEED_BIND))) {
                        z = true;
                    }
                    if ((Site.ICBU.equals(str) && Site.DING.equals(AliMemberSDK.getMasterSite())) || z) {
                        UccCallback uccCallback2 = uccCallback;
                        if (uccCallback2 == null) {
                            return;
                        }
                        uccCallback2.onFail(str, rpcResponse.code, rpcResponse.message);
                        return;
                    }
                    JSONObject parseObject = JSON.parseObject(str6);
                    if (parseObject != null) {
                        str5 = parseObject.getString("h5Url");
                        str3 = parseObject.getString(ParamsConstants.Key.PARAM_H5_TYPE);
                    } else {
                        str3 = str5;
                    }
                    Map<String, String> map4 = map;
                    if (map4 == null) {
                        map4 = new HashMap<>();
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        map4.put(UccConstants.PARAM_BIND_URL, str5);
                    }
                    map4.put("needSession", str4);
                    if (!UccOauthLoginPresenter.isCookieOnly(map)) {
                        str4 = "0";
                    }
                    map4.put(ParamsConstants.Key.PARAM_NEED_LOCAL_COOKIE_ONLY, str4);
                    map4.put("needToast", "0");
                    map4.put(ParamsConstants.Key.PARAM_H5_TYPE, str3);
                    UccServiceImpl.getInstance().bind(activity, uccParams.userToken, str, map4, uccCallback);
                } else if (z2 && TextUtils.equals("H5", rpcResponse.actionType) && rpcResponse.returnValue != 0) {
                    JSONObject parseObject2 = JSON.parseObject((String) rpcResponse.returnValue);
                    if (parseObject2 != null) {
                        String string = parseObject2.getString("h5Url");
                        String string2 = parseObject2.getString("token");
                        String string3 = parseObject2.getString("scene");
                        String string4 = parseObject2.getString(ParamsConstants.Key.PARAM_H5_TYPE);
                        Bundle bundle = new Bundle();
                        bundle.putString("url", string);
                        bundle.putString(UccConstants.PARAM_UCC_PARAMS, JSON.toJSONString(uccParams));
                        bundle.putString("needSession", str4);
                        bundle.putString("token", string2);
                        bundle.putString("scene", string3);
                        bundle.putString(ParamsConstants.Key.PARAM_H5_TYPE, string4);
                        bundle.putString("params", Utils.convertMapToJsonStr(map));
                        UccH5Presenter.openUrl(activity, bundle, uccCallback);
                        rpcResultHit(buidErrorCode + str5, rpcResponse.actionType, string4);
                        return;
                    }
                    rpcResultHit(buidErrorCode + str5, rpcResponse.actionType, str5);
                    UccCallback uccCallback3 = uccCallback;
                    if (uccCallback3 == null) {
                        return;
                    }
                    uccCallback3.onFail(str, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "免登失败"));
                } else {
                    rpcResultHit(buidErrorCode + str5, rpcResponse == null ? str5 : rpcResponse.actionType, str5);
                    UccCallback uccCallback4 = uccCallback;
                    if (uccCallback4 == null) {
                        return;
                    }
                    uccCallback4.onFail(str, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "免登失败"));
                }
            }

            private void rpcResultHit(String str2, String str3, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c95db6", new Object[]{this, str2, str3, str4});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("code", str2);
                hashMap.put("actionType", str3);
                hashMap.put(ParamsConstants.Key.PARAM_H5_TYPE, str4);
                UTHitUtils.send(UTHitConstants.PageUccLogin, "UccLogin_Result", uccParams, hashMap);
            }
        });
    }

    public void tokenLogin(Activity activity, UccParams uccParams, String str, String str2, String str3, Map<String, String> map, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f366657", new Object[]{this, activity, uccParams, str, str2, str3, map, uccCallback});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("token", str2);
        UTHitUtils.send(UTHitConstants.PageUccLogin, "UccLogin_TokenLogin", uccParams, hashMap);
        loginByIVToken(activity, uccParams, map, str2, str, str3, uccCallback);
    }

    public void upgradeLogin(final Activity activity, UccParams uccParams, final String str, String str2, String str3, final String str4, final Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ff9104", new Object[]{this, activity, uccParams, str, str2, str3, str4, map, uccCallback});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", str4);
        hashMap.put("scene", str2);
        hashMap.put("requestToken", str3);
        UTHitUtils.send(UTHitConstants.PageUccBind, "UccLogin_UpgradeAccount", uccParams, hashMap);
        DataRepository.upgrade(uccParams, str2, str3, new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.biz.UccTrustLoginPresenter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                } else if (rpcResponse == null) {
                } else {
                    rpcResultHit(rpcResponse.code + "", rpcResponse.actionType, "");
                    if (rpcResponse.code == 3000 || TextUtils.equals("SUCCESS", rpcResponse.actionType)) {
                        UccBizContants.mBusyControlMap.put(str, Long.valueOf(System.currentTimeMillis()));
                        String str5 = (String) rpcResponse.returnValue;
                        Map map2 = map;
                        if (map2 != null && TextUtils.equals((CharSequence) map2.get(ParamsConstants.Key.PARAM_NEED_LOCAL_SESSION), "0")) {
                            z = false;
                        }
                        if (!TextUtils.isEmpty(str5) && z) {
                            UccServiceProviderFactory.getInstance().getUccServiceProvider(str).refreshWhenLogin(str, str5, UccOauthLoginPresenter.isCookieOnly(map));
                        }
                        UccTrustLoginPresenter.access$000(UccTrustLoginPresenter.this, activity);
                        if (uccCallback == null) {
                            return;
                        }
                        Map<String, String> buildSessionInfo = UccBindPresenter.buildSessionInfo(str, str5);
                        String string = JSON.parseObject(str5).getString("authorizationResponse");
                        if (TextUtils.isEmpty(string)) {
                            buildSessionInfo.put(UccConstants.PARAM_LOGIN_DATA, str5);
                        } else {
                            buildSessionInfo.put(UccConstants.PARAM_LOGIN_DATA, string);
                        }
                        uccCallback.onSuccess(str, buildSessionInfo);
                    } else if (TextUtils.equals("H5", rpcResponse.actionType) && rpcResponse.returnValue != 0) {
                        JSONObject parseObject = JSON.parseObject((String) rpcResponse.returnValue);
                        if (parseObject != null) {
                            String string2 = parseObject.getString("h5Url");
                            Bundle bundle = new Bundle();
                            bundle.putString("url", string2);
                            bundle.putString("token", parseObject.getString("token"));
                            bundle.putString("scene", parseObject.getString("scene"));
                            bundle.putString(UccConstants.PARAM_UCC_PARAMS, JSON.toJSONString(new UccParams()));
                            bundle.putString("needSession", "1");
                            UccH5Presenter.openUrl(activity, bundle, uccCallback);
                            Activity activity2 = activity;
                            if (activity2 == null || (activity2 instanceof UccWebViewActivity)) {
                                return;
                            }
                            activity2.finish();
                            return;
                        }
                        UccTrustLoginPresenter.access$000(UccTrustLoginPresenter.this, activity);
                        UccCallback uccCallback2 = uccCallback;
                        if (uccCallback2 == null) {
                            return;
                        }
                        uccCallback2.onFail(str, 1500, Utils.buidErrorMessage(rpcResponse, "免登失败"));
                    } else {
                        rpcResultHit(rpcResponse.code + "", "", "");
                        UccCallback uccCallback3 = uccCallback;
                        if (uccCallback3 == null) {
                            return;
                        }
                        uccCallback3.onFail(str, rpcResponse.code, Utils.buidErrorMessage(rpcResponse, "免登response为空"));
                    }
                }
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSystemError(String str5, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str5, rpcResponse});
                    return;
                }
                int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1500);
                rpcResultHit(buidErrorCode + "", "", "");
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onError(String str5, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3aace899", new Object[]{this, str5, rpcResponse});
                    return;
                }
                int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1500);
                StringBuilder sb = new StringBuilder();
                sb.append(buidErrorCode);
                String str6 = "";
                sb.append(str6);
                rpcResultHit(sb.toString(), str6, str6);
                if (TextUtils.equals(str4, "h5")) {
                    if (rpcResponse != null) {
                        str6 = rpcResponse.message;
                    }
                    DialogHelper dialogHelper = DialogHelper.getInstance();
                    Activity activity2 = activity;
                    dialogHelper.alert(activity2, "", str6, activity2.getString(R.string.member_sdk_iknow), new DialogInterface.OnClickListener() { // from class: com.ali.user.open.ucc.biz.UccTrustLoginPresenter.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            }
                        }
                    }, "", null);
                    return;
                }
                UccTrustLoginPresenter.access$000(UccTrustLoginPresenter.this, activity);
                UccCallback uccCallback2 = uccCallback;
                if (uccCallback2 == null) {
                    return;
                }
                uccCallback2.onFail(str, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "OauthLogin接口错误"));
            }

            private void rpcResultHit(String str5, String str6, String str7) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c95db6", new Object[]{this, str5, str6, str7});
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("code", str5);
                hashMap2.put("actionType", str6);
                hashMap2.put(ParamsConstants.Key.PARAM_H5_TYPE, str7);
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccLogin_UpgradeAccountResult", null, hashMap2);
            }
        });
    }

    private void finishActivity(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fecb9f", new Object[]{this, context});
        } else if (context == null || !(context instanceof UccWebViewActivity)) {
        } else {
            ((Activity) context).finish();
            CallbackManager.unregisterCallback(UccConstants.UCC_H5_CALLBACK_TYPE);
        }
    }

    public static void loginByIVToken(final Activity activity, final UccParams uccParams, Map<String, String> map, final String str, String str2, String str3, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b6b545f", new Object[]{activity, uccParams, map, str, str2, str3, uccCallback});
            return;
        }
        int havanaSite = Site.getHavanaSite(uccParams.bindSite);
        final boolean isCookieOnly = UccOauthLoginPresenter.isCookieOnly(map);
        DataRepository.loginByIVToken(havanaSite, str, str2, str3, new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.biz.UccTrustLoginPresenter.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                    return;
                }
                if (rpcResponse == null || rpcResponse.returnValue == 0) {
                    UccCallback.this.onFail(uccParams.bindSite, ResultCode.SYSTEM_EXCEPTION.code, ResultCode.SYSTEM_EXCEPTION.message);
                }
                if (rpcResponse.code == 3000) {
                    rpcResultHit("3000");
                    Activity activity2 = activity;
                    if (activity2 != null && (activity2 instanceof UccWebViewActivity)) {
                        activity2.finish();
                    }
                    String str4 = (String) rpcResponse.returnValue;
                    UccServiceProviderFactory.getInstance().getUccServiceProvider(uccParams.bindSite).refreshWhenLogin(uccParams.bindSite, str4, isCookieOnly);
                    HashMap hashMap = new HashMap();
                    hashMap.put(UccConstants.PARAM_LOGIN_DATA, str4);
                    UccCallback.this.onSuccess(uccParams.bindSite, hashMap);
                    return;
                }
                UccCallback.this.onFail(uccParams.bindSite, rpcResponse.code, rpcResponse.message);
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSystemError(String str4, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str4, rpcResponse});
                    return;
                }
                rpcResultHit(str4 + "");
                UccCallback.this.onFail(uccParams.bindSite, rpcResponse.code, rpcResponse.message);
                Activity activity2 = activity;
                if (activity2 == null || !(activity2 instanceof UccWebViewActivity)) {
                    return;
                }
                activity2.finish();
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onError(String str4, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3aace899", new Object[]{this, str4, rpcResponse});
                    return;
                }
                rpcResultHit(str4 + "");
                if (TextUtils.equals("H5", rpcResponse.actionType) && rpcResponse.returnValue != 0) {
                    LoginReturnData loginReturnData = (LoginReturnData) rpcResponse.returnValue;
                    String str5 = loginReturnData.h5Url;
                    if (!TextUtils.isEmpty(str5) && activity != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("url", str5);
                        bundle.putString(UccConstants.PARAM_UCC_PARAMS, JSON.toJSONString(uccParams));
                        bundle.putString("needSession", "1");
                        bundle.putString("token", loginReturnData.token);
                        bundle.putString("scene", loginReturnData.scene);
                        UccH5Presenter.openUrl(activity, bundle, UccCallback.this);
                        return;
                    }
                    Activity activity2 = activity;
                    if (activity2 != null && (activity2 instanceof UccWebViewActivity)) {
                        activity2.finish();
                    }
                    UccCallback.this.onFail(uccParams.bindSite, rpcResponse.code, rpcResponse.message);
                    return;
                }
                Activity activity3 = activity;
                if (activity3 != null && (activity3 instanceof UccWebViewActivity)) {
                    activity3.finish();
                }
                UccCallback.this.onFail(uccParams.bindSite, rpcResponse.code, rpcResponse.message);
            }

            private void rpcResultHit(String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8a86d1a2", new Object[]{this, str4});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("code", "" + str4);
                hashMap.put("token", str);
                UTHitUtils.send(UTHitConstants.PageUccLogin, "UccLogin_TokenLoginResult", uccParams, hashMap);
            }
        });
    }

    public void userGrowLogin(final Activity activity, final UccParams uccParams, final String str, final Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ce3808", new Object[]{this, activity, uccParams, str, map, uccCallback});
        } else {
            DataRepository.userGrowLogin(uccParams.requestToken, new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.biz.UccTrustLoginPresenter.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSuccess(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                    } else if (rpcResponse == null) {
                    } else {
                        rpcResultHit(rpcResponse.code + "", rpcResponse.actionType, "");
                        if (rpcResponse.code == 3000 || TextUtils.equals("SUCCESS", rpcResponse.actionType)) {
                            UccBizContants.mBusyControlMap.put(str, Long.valueOf(System.currentTimeMillis()));
                            boolean isCookieOnly = UccOauthLoginPresenter.isCookieOnly(map);
                            String str2 = (String) rpcResponse.returnValue;
                            JSONObject parseObject = JSON.parseObject(str2);
                            String string = parseObject.getString("authorizationResponse");
                            if (!TextUtils.isEmpty(string)) {
                                UccServiceProviderFactory.getInstance().getUccServiceProvider(str).refreshWhenLogin(str, string, isCookieOnly);
                            } else {
                                UccServiceProviderFactory.getInstance().getUccServiceProvider(str).refreshWhenLogin(str, str2, isCookieOnly);
                            }
                            if (uccCallback == null) {
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            if (!TextUtils.isEmpty(string)) {
                                hashMap.put(UccConstants.PARAM_LOGIN_DATA, string);
                            } else {
                                hashMap.put(UccConstants.PARAM_LOGIN_DATA, str2);
                            }
                            hashMap.put(Constants.VI_ENGINE_CALLBACKURL, parseObject.getString(Constants.VI_ENGINE_CALLBACKURL));
                            uccCallback.onSuccess(str, hashMap);
                            return;
                        }
                        rpcResultHit(rpcResponse.code + "", "", "");
                        UccCallback uccCallback2 = uccCallback;
                        if (uccCallback2 == null) {
                            return;
                        }
                        uccCallback2.onFail(str, rpcResponse.code, Utils.buidErrorMessage(rpcResponse, "免登response为空"));
                    }
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSystemError(String str2, RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str2, rpcResponse});
                        return;
                    }
                    int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1005);
                    rpcResultHit(buidErrorCode + "", rpcResponse == null ? "" : rpcResponse.actionType, "");
                    Integer num = UccBizContants.mTrustLoginErrorTime.get(str);
                    if (num == null) {
                        num = 0;
                    }
                    UccBizContants.mTrustLoginErrorTime.put(str, Integer.valueOf(num.intValue() + 1));
                    UccCallback uccCallback2 = uccCallback;
                    if (uccCallback2 == null) {
                        return;
                    }
                    uccCallback2.onFail(str, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "免登失败"));
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onError(String str2, RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3aace899", new Object[]{this, str2, rpcResponse});
                        return;
                    }
                    int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1005);
                    if (TextUtils.equals("H5", rpcResponse.actionType) && rpcResponse.returnValue != 0) {
                        String str3 = (String) rpcResponse.returnValue;
                        JSONObject parseObject = JSON.parseObject(str3);
                        if (parseObject != null) {
                            String string = parseObject.getString("h5Url");
                            if (!TextUtils.isEmpty(string)) {
                                String string2 = parseObject.getString("token");
                                String string3 = parseObject.getString("scene");
                                String string4 = parseObject.getString(ParamsConstants.Key.PARAM_H5_TYPE);
                                Bundle bundle = new Bundle();
                                bundle.putString("url", string);
                                bundle.putString(UccConstants.PARAM_UCC_PARAMS, JSON.toJSONString(uccParams));
                                bundle.putString("needSession", "1");
                                bundle.putString("token", string2);
                                bundle.putString("scene", string3);
                                bundle.putString(ParamsConstants.Key.PARAM_H5_TYPE, string4);
                                bundle.putString("params", Utils.convertMapToJsonStr(map));
                                UccH5Presenter.openUrl(activity, bundle, uccCallback);
                                rpcResultHit(buidErrorCode + "", rpcResponse.actionType, string4);
                                return;
                            } else if (!TextUtils.isEmpty(parseObject.getString("returnUrl"))) {
                                UccCallback uccCallback2 = uccCallback;
                                if (uccCallback2 == null) {
                                    return;
                                }
                                uccCallback2.onFail(str, 3000, str3);
                                return;
                            } else {
                                UccCallback uccCallback3 = uccCallback;
                                if (uccCallback3 == null) {
                                    return;
                                }
                                uccCallback3.onFail(str, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "免登失败"));
                                return;
                            }
                        }
                        rpcResultHit(buidErrorCode + "", rpcResponse.actionType, "");
                        UccCallback uccCallback4 = uccCallback;
                        if (uccCallback4 == null) {
                            return;
                        }
                        uccCallback4.onFail(str, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "免登失败"));
                        return;
                    }
                    rpcResultHit(buidErrorCode + "", rpcResponse == null ? "" : rpcResponse.actionType, "");
                    UccCallback uccCallback5 = uccCallback;
                    if (uccCallback5 == null) {
                        return;
                    }
                    uccCallback5.onFail(str, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "免登失败"));
                }

                private void rpcResultHit(String str2, String str3, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c95db6", new Object[]{this, str2, str3, str4});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("code", str2);
                    hashMap.put("actionType", str3);
                    hashMap.put(ParamsConstants.Key.PARAM_H5_TYPE, str4);
                    UTHitUtils.send(UTHitConstants.PageUccLogin, "UccLogin_Result", uccParams, hashMap);
                }
            });
        }
    }
}
