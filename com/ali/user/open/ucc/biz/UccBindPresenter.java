package com.ali.user.open.ucc.biz;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.callback.CallbackManager;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.model.RpcRequestCallbackWithCode;
import com.ali.user.open.core.model.RpcResponse;
import com.ali.user.open.core.service.MemberExecutorService;
import com.ali.user.open.core.util.DialogHelper;
import com.ali.user.open.core.util.ParamsConstants;
import com.ali.user.open.core.util.ToastUtil;
import com.ali.user.open.ucc.UccCallback;
import com.ali.user.open.ucc.UccResultCode;
import com.ali.user.open.ucc.UccServiceProvider;
import com.ali.user.open.ucc.UccServiceProviderFactory;
import com.ali.user.open.ucc.data.DataRepository;
import com.ali.user.open.ucc.model.BindResult;
import com.ali.user.open.ucc.model.MLoginTokenReturnValue;
import com.ali.user.open.ucc.model.UccParams;
import com.ali.user.open.ucc.remote.broadcast.UccBroadcastHelper;
import com.ali.user.open.ucc.remote.broadcast.UccResultAction;
import com.ali.user.open.ucc.ui.UccActivity;
import com.ali.user.open.ucc.util.UTHitConstants;
import com.ali.user.open.ucc.util.UTHitUtils;
import com.ali.user.open.ucc.util.UccConstants;
import com.ali.user.open.ucc.util.Utils;
import com.ali.user.open.ucc.webview.UccWebViewActivity;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class UccBindPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TaobaoUccServiceProviderImpl";
    private static volatile UccBindPresenter instance;

    static {
        kge.a(635428972);
    }

    public static /* synthetic */ void access$000(UccBindPresenter uccBindPresenter, Context context, UccParams uccParams, int i, String str, String str2, String str3, Map map, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b25ddc5", new Object[]{uccBindPresenter, context, uccParams, new Integer(i), str, str2, str3, map, uccCallback});
        } else {
            uccBindPresenter.conflictupgrade(context, uccParams, i, str, str2, str3, map, uccCallback);
        }
    }

    public static /* synthetic */ void access$100(UccBindPresenter uccBindPresenter, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28689d2d", new Object[]{uccBindPresenter, context});
        } else {
            uccBindPresenter.finishActivity(context);
        }
    }

    public static /* synthetic */ void access$200(UccBindPresenter uccBindPresenter, UccParams uccParams, Map map, String str, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e74e69c", new Object[]{uccBindPresenter, uccParams, map, str, uccCallback});
        } else {
            uccBindPresenter.onBindSuccess(uccParams, map, str, uccCallback);
        }
    }

    public static UccBindPresenter getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UccBindPresenter) ipChange.ipc$dispatch("a8397f47", new Object[0]);
        }
        if (instance == null) {
            synchronized (UccBindPresenter.class) {
                if (instance == null) {
                    instance = new UccBindPresenter();
                }
            }
        }
        return instance;
    }

    public void bindByNativeAuth(final Activity activity, UccParams uccParams, String str, String str2, final Map<String, String> map, final UccCallback uccCallback) {
        UccParams uccParams2 = uccParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456bafea", new Object[]{this, activity, uccParams2, str, str2, map, uccCallback});
            return;
        }
        HashMap hashMap = new HashMap();
        final String str3 = (activity == null || !(activity instanceof UccWebViewActivity)) ? "native" : "H5";
        hashMap.put("type", str3);
        UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_NativeAuthBind", uccParams, hashMap);
        if (uccParams2 == null) {
            uccParams2 = new UccParams();
        }
        final UccParams uccParams3 = uccParams2;
        if (map != null && !StringUtils.isEmpty(map.get("site"))) {
            uccParams3.site = map.get("site");
        } else {
            uccParams3.site = AliMemberSDK.getMasterSite();
        }
        uccParams3.bindSite = uccParams3.bindSite;
        uccParams3.userToken = uccParams3.userToken;
        uccParams3.bindUserToken = str;
        uccParams3.bindUserTokenType = str2;
        uccParams3.requestToken = map.get("requestToken");
        uccParams3.scene = map.get("scene");
        if (map != null && StringUtils.equals("1", map.get("needSession"))) {
            uccParams3.createBindSiteSession = true;
        } else {
            uccParams3.createBindSiteSession = false;
        }
        RpcRequestCallbackWithCode rpcRequestCallbackWithCode = new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                    return;
                }
                UccBindPresenter.dismissProgress(activity);
                rpcResultlHit(rpcResponse.code + "", rpcResponse.actionType);
                String str4 = (String) rpcResponse.returnValue;
                if (StringUtils.equals("CHANGEBIND", rpcResponse.actionType)) {
                    UccBindPresenter.this.changeBind(activity, uccParams3, 0, rpcResponse.message, ((BindResult) JSON.parseObject(str4, BindResult.class)).changeBindToken, "0", map, uccCallback);
                } else if (StringUtils.equals("CONFLICTUPGRADE", rpcResponse.actionType)) {
                    UccBindPresenter.access$000(UccBindPresenter.this, activity, uccParams3, 0, rpcResponse.message, ((BindResult) JSON.parseObject(str4, BindResult.class)).requestToken, "0", map, uccCallback);
                } else {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("needLogin", uccParams3.createBindSiteSession ? "T" : UTConstant.Args.UT_SUCCESS_F);
                    UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_Success", uccParams3, hashMap2);
                    UccBindPresenter.access$100(UccBindPresenter.this, activity);
                    UccBindPresenter.access$200(UccBindPresenter.this, uccParams3, map, str4, uccCallback);
                }
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSystemError(String str4, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str4, rpcResponse});
                    return;
                }
                UccBindPresenter.dismissProgress(activity);
                int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1007);
                rpcResultlHit(buidErrorCode + "", "");
                UccBindPresenter.access$100(UccBindPresenter.this, activity);
                UccCallback uccCallback2 = uccCallback;
                if (uccCallback2 == null) {
                    return;
                }
                uccCallback2.onFail(uccParams3.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "bindByNativeAuth接口报错"));
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onError(String str4, final RpcResponse rpcResponse) {
                UccCallback uccCallback2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3aace899", new Object[]{this, str4, rpcResponse});
                    return;
                }
                UccBindPresenter.dismissProgress(activity);
                final int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1007);
                rpcResultlHit(buidErrorCode + "", "");
                if (StringUtils.equals("H5", rpcResponse.actionType) && rpcResponse.returnValue != 0) {
                    JSONObject parseObject = JSON.parseObject((String) rpcResponse.returnValue);
                    if (parseObject != null) {
                        String string = parseObject.getString("returnUrl");
                        Bundle bundle = new Bundle();
                        bundle.putString("url", string);
                        bundle.putString(UccConstants.PARAM_UCC_PARAMS, JSON.toJSONString(uccParams3));
                        bundle.putString("needSession", "1");
                        bundle.putString("params", Utils.convertMapToJsonStr(map));
                        UccH5Presenter.openUrl(activity, bundle, uccCallback);
                        return;
                    }
                    UccBindPresenter.access$100(UccBindPresenter.this, activity);
                    UccCallback uccCallback3 = uccCallback;
                    if (uccCallback3 == null) {
                        return;
                    }
                    uccCallback3.onFail(uccParams3.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "bindByNativeAuth接口报错"));
                } else if (StringUtils.equals(ApiConstants.ResultActionType.TOAST, rpcResponse.actionType) && !StringUtils.isEmpty(rpcResponse.message)) {
                    ((MemberExecutorService) AliMemberSDK.getService(MemberExecutorService.class)).postUITask(new Runnable() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                ToastUtil.showToast(activity.getApplicationContext(), rpcResponse.message, 0);
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                    });
                    if ((activity instanceof UccWebViewActivity) || (uccCallback2 = uccCallback) == null) {
                        return;
                    }
                    uccCallback2.onFail(uccParams3.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "bindByNativeAuth接口报错"));
                } else if (StringUtils.equals(ApiConstants.ResultActionType.ALERT, rpcResponse.actionType) && !StringUtils.isEmpty(rpcResponse.message)) {
                    DialogHelper.getInstance().alert(activity, "", rpcResponse.message, activity.getString(R.string.member_sdk_iknow), new DialogInterface.OnClickListener() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            } else if (activity == null || (activity instanceof UccWebViewActivity) || uccCallback == null) {
                            } else {
                                uccCallback.onFail(uccParams3.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "bindByNativeAuth接口报错"));
                            }
                        }
                    }, "", null);
                } else {
                    UccBindPresenter.access$100(UccBindPresenter.this, activity);
                    UccCallback uccCallback4 = uccCallback;
                    if (uccCallback4 == null) {
                        return;
                    }
                    uccCallback4.onFail(uccParams3.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "bindByNativeAuth接口报错"));
                }
            }

            private void rpcResultlHit(String str4, String str5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("49374604", new Object[]{this, str4, str5});
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("code", str4);
                hashMap2.put("type", str3);
                hashMap2.put("actionType", str5);
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_NativeAuthBindResult", uccParams3, hashMap2);
            }
        };
        if (map != null && !StringUtils.isEmpty(uccParams3.requestToken)) {
            showProgress(activity);
            DataRepository.bindByRequestToken(uccParams3, rpcRequestCallbackWithCode);
            return;
        }
        showProgress(activity);
        DataRepository.bindByNativeAuth(uccParams3, rpcRequestCallbackWithCode);
    }

    public void bindByRequestToken(final Activity activity, UccParams uccParams, String str, String str2, String str3, final Map<String, String> map, final UccCallback uccCallback) {
        UccParams uccParams2 = uccParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dffec9", new Object[]{this, activity, uccParams2, str, str2, str3, map, uccCallback});
            return;
        }
        final String str4 = (activity == null || !(activity instanceof UccWebViewActivity)) ? "native" : "H5";
        HashMap hashMap = new HashMap();
        hashMap.put("type", str4);
        UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_BindByRequestToken", uccParams, hashMap);
        if (uccParams2 == null) {
            uccParams2 = new UccParams();
        }
        final UccParams uccParams3 = uccParams2;
        if (map != null && !StringUtils.isEmpty(map.get("site"))) {
            uccParams3.site = map.get("site");
        } else {
            uccParams3.site = AliMemberSDK.getMasterSite();
        }
        uccParams3.bindSite = uccParams3.bindSite;
        uccParams3.userToken = uccParams3.userToken;
        String str5 = "";
        uccParams3.bindUserToken = StringUtils.isEmpty(str2) ? str5 : str2;
        uccParams3.bindUserTokenType = StringUtils.isEmpty(str3) ? str5 : str3;
        if (!StringUtils.isEmpty(str)) {
            str5 = str;
        }
        uccParams3.requestToken = str5;
        uccParams3.scene = map.get("scene");
        if (map != null && StringUtils.equals("1", map.get("needSession"))) {
            uccParams3.createBindSiteSession = true;
        } else {
            uccParams3.createBindSiteSession = false;
        }
        RpcRequestCallbackWithCode rpcRequestCallbackWithCode = new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                    return;
                }
                rpcResultlHit(rpcResponse.code + "", rpcResponse.actionType);
                String str6 = (String) rpcResponse.returnValue;
                if (StringUtils.equals("CHANGEBIND", rpcResponse.actionType)) {
                    UccBindPresenter.this.changeBind(activity, uccParams3, 0, rpcResponse.message, ((BindResult) JSON.parseObject(str6, BindResult.class)).changeBindToken, "0", map, uccCallback);
                } else if (StringUtils.equals("CONFLICTUPGRADE", rpcResponse.actionType)) {
                    UccBindPresenter.access$000(UccBindPresenter.this, activity, uccParams3, 0, rpcResponse.message, ((BindResult) JSON.parseObject(str6, BindResult.class)).requestToken, "0", map, uccCallback);
                } else {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("needLogin", uccParams3.createBindSiteSession ? "T" : UTConstant.Args.UT_SUCCESS_F);
                    UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_Success", uccParams3, hashMap2);
                    UccBindPresenter.access$100(UccBindPresenter.this, activity);
                    UccBindPresenter.access$200(UccBindPresenter.this, uccParams3, map, str6, uccCallback);
                }
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSystemError(String str6, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str6, rpcResponse});
                    return;
                }
                int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1007);
                rpcResultlHit(buidErrorCode + "", "");
                UccBindPresenter.access$100(UccBindPresenter.this, activity);
                UccCallback uccCallback2 = uccCallback;
                if (uccCallback2 == null) {
                    return;
                }
                uccCallback2.onFail(uccParams3.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "bindByNativeAuth接口报错"));
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onError(String str6, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3aace899", new Object[]{this, str6, rpcResponse});
                    return;
                }
                int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1007);
                rpcResultlHit(buidErrorCode + "", "");
                if (StringUtils.equals("H5", rpcResponse.actionType) && rpcResponse.returnValue != 0) {
                    JSONObject parseObject = JSON.parseObject((String) rpcResponse.returnValue);
                    if (parseObject != null) {
                        String string = parseObject.getString("returnUrl");
                        Bundle bundle = new Bundle();
                        bundle.putString("url", string);
                        bundle.putString(UccConstants.PARAM_UCC_PARAMS, JSON.toJSONString(uccParams3));
                        bundle.putString("needSession", "1");
                        bundle.putString("params", Utils.convertMapToJsonStr(map));
                        UccH5Presenter.openUrl(activity, bundle, uccCallback);
                        Activity activity2 = activity;
                        if (activity2 == null || (activity2 instanceof UccWebViewActivity)) {
                            return;
                        }
                        activity2.finish();
                        return;
                    }
                    UccBindPresenter.access$100(UccBindPresenter.this, activity);
                    UccCallback uccCallback2 = uccCallback;
                    if (uccCallback2 == null) {
                        return;
                    }
                    uccCallback2.onFail(uccParams3.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "bindByNativeAuth接口报错"));
                    return;
                }
                UccBindPresenter.access$100(UccBindPresenter.this, activity);
                UccCallback uccCallback3 = uccCallback;
                if (uccCallback3 == null) {
                    return;
                }
                uccCallback3.onFail(uccParams3.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "bindByNativeAuth接口报错"));
            }

            private void rpcResultlHit(String str6, String str7) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("49374604", new Object[]{this, str6, str7});
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("code", str6);
                hashMap2.put("type", str4);
                hashMap2.put("actionType", str7);
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_BindByRequestTokenResult", uccParams3, hashMap2);
            }
        };
        if (uccParams3 != null && !StringUtils.isEmpty(uccParams3.requestToken)) {
            DataRepository.bindByRequestToken(uccParams3, rpcRequestCallbackWithCode);
        } else {
            uccCallback.onFail(uccParams3.bindSite, -1, "token.authcode入参报错");
        }
    }

    public void changeBind(final Activity activity, final UccParams uccParams, final int i, String str, final String str2, final String str3, final Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd2fb85d", new Object[]{this, activity, uccParams, new Integer(i), str, str2, str3, map, uccCallback});
        } else if (activity == null || !(activity instanceof Activity)) {
            finishActivity(activity);
            if (uccCallback == null) {
                return;
            }
            uccCallback.onFail(uccParams.bindSite, 1008, "换绑失败");
        } else {
            final HashMap hashMap = new HashMap();
            hashMap.put("changeBindToken", str2);
            if (activity != null && (activity instanceof UccWebViewActivity)) {
                hashMap.put("type", "H5");
            } else {
                hashMap.put("type", "native");
            }
            DialogHelper.getInstance().alert(activity, "", str, activity.getString(R.string.member_sdk_continue_bind), new DialogInterface.OnClickListener() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                        return;
                    }
                    UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_ChangeBind", uccParams, hashMap);
                    UccBindPresenter.this.doChangeBind(activity, uccParams, i, str2, str3, map, uccCallback);
                }
            }, activity.getString(R.string.member_sdk_cancel), new DialogInterface.OnClickListener() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    UccCallback uccCallback2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                        return;
                    }
                    UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_ChangeBindCancel", uccParams, hashMap);
                    if (i == 1) {
                        Activity activity2 = activity;
                        if (activity2 instanceof UccWebViewActivity) {
                            ((UccWebViewActivity) activity2).finish();
                            UccCallback uccCallback3 = uccCallback;
                            if (uccCallback3 == null) {
                                return;
                            }
                            uccCallback3.onFail(uccParams.bindSite, 1006, "用户取消换绑");
                            return;
                        }
                    }
                    if ((activity instanceof UccWebViewActivity) || (uccCallback2 = uccCallback) == null) {
                        return;
                    }
                    uccCallback2.onFail(uccParams.bindSite, 1006, "用户取消换绑");
                }
            });
        }
    }

    private void conflictupgrade(final Context context, final UccParams uccParams, int i, String str, final String str2, String str3, final Map<String, String> map, final UccCallback uccCallback) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e2c9f4e", new Object[]{this, context, uccParams, new Integer(i), str, str2, str3, map, uccCallback});
        } else if (context == null || !(context instanceof Activity)) {
            finishActivity(context);
            if (uccCallback == null) {
                return;
            }
            uccCallback.onFail(uccParams.bindSite, 1008, "换绑失败");
        } else {
            final HashMap hashMap = new HashMap();
            hashMap.put("requestToken", str2);
            if (context != null && (context instanceof UccWebViewActivity)) {
                hashMap.put("type", "H5");
                str4 = "H5";
            } else {
                hashMap.put("type", "native");
                str4 = "native";
            }
            final String str5 = str4;
            final String str6 = str4;
            DialogHelper.getInstance().alert((Activity) context, "", str, context.getString(R.string.member_sdk_continue_upgrade), new DialogInterface.OnClickListener() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                        return;
                    }
                    UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_ConflictUpgradePositive", uccParams, hashMap);
                    UccParams uccParams2 = uccParams;
                    UccTrustLoginPresenter.getInstance().upgradeLogin((Activity) context, uccParams2, uccParams2.bindSite, uccParams.scene, str2, str5, map, uccCallback);
                }
            }, context.getString(R.string.member_sdk_cancel), new DialogInterface.OnClickListener() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                        return;
                    }
                    UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_ConflictUpgradeNagetive", uccParams, hashMap);
                    UccBindPresenter.this.skipUpgrade(context, uccParams, str6, map, uccCallback);
                }
            });
        }
    }

    public void doChangeBind(final Activity activity, final UccParams uccParams, final int i, String str, final String str2, final Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e01c2be", new Object[]{this, activity, uccParams, new Integer(i), str, str2, map, uccCallback});
        } else {
            DataRepository.changeBind(uccParams, str, new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSuccess(final RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                        return;
                    }
                    rpcResultlHit(rpcResponse.code + "");
                    String str3 = (String) rpcResponse.returnValue;
                    if (StringUtils.equals("CONFLICTUPGRADE", rpcResponse.actionType)) {
                        UccBindPresenter.access$000(UccBindPresenter.this, activity, uccParams, 0, rpcResponse.message, ((BindResult) JSON.parseObject(str3, BindResult.class)).requestToken, "0", map, uccCallback);
                    } else if (StringUtils.equals("H5", rpcResponse.actionType) && rpcResponse.returnValue != 0) {
                        JSONObject parseObject = JSON.parseObject(str3);
                        if (parseObject != null) {
                            String string = parseObject.getString("returnUrl");
                            Bundle bundle = new Bundle();
                            bundle.putString("url", string);
                            bundle.putString("token", parseObject.getString("trustLoginToken"));
                            bundle.putString("scene", parseObject.getString("scene"));
                            bundle.putString(UccConstants.PARAM_UCC_PARAMS, JSON.toJSONString(uccParams));
                            bundle.putString("needSession", "1");
                            bundle.putString("params", Utils.convertMapToJsonStr(map));
                            UccH5Presenter.openUrl(activity, bundle, uccCallback);
                            Activity activity2 = activity;
                            if (activity2 == null || (activity2 instanceof UccWebViewActivity)) {
                                return;
                            }
                            activity2.finish();
                            return;
                        }
                        UccBindPresenter.access$100(UccBindPresenter.this, activity);
                        UccCallback uccCallback2 = uccCallback;
                        if (uccCallback2 == null) {
                            return;
                        }
                        uccCallback2.onFail(uccParams.bindSite, 1008, Utils.buidErrorMessage(rpcResponse, "换绑失败"));
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("needLogin", (StringUtils.isEmpty(str3) || str3.length() < 10) ? UTConstant.Args.UT_SUCCESS_F : "T");
                        UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_Success", uccParams, hashMap);
                        if (activity != null && !StringUtils.isEmpty(rpcResponse.message) && StringUtils.equals(str2, "1")) {
                            ((MemberExecutorService) AliMemberSDK.getService(MemberExecutorService.class)).postUITask(new Runnable() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.7.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    try {
                                        ToastUtil.showToast(activity.getApplicationContext(), rpcResponse.message, 0);
                                    } catch (Throwable th) {
                                        th.printStackTrace();
                                    }
                                }
                            });
                        }
                        UccBindPresenter.access$100(UccBindPresenter.this, activity);
                        UccBindPresenter.access$200(UccBindPresenter.this, uccParams, map, str3, uccCallback);
                    }
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSystemError(String str3, final RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str3, rpcResponse});
                        return;
                    }
                    final int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1008);
                    StringBuilder sb = new StringBuilder();
                    sb.append(buidErrorCode);
                    String str4 = "";
                    sb.append(str4);
                    rpcResultlHit(sb.toString());
                    if (rpcResponse != null) {
                        str4 = rpcResponse.message;
                    }
                    final String str5 = str4;
                    if (i == 1) {
                        DialogHelper dialogHelper = DialogHelper.getInstance();
                        Activity activity2 = activity;
                        dialogHelper.alert(activity2, "", str5, activity2.getString(R.string.member_sdk_iknow), new DialogInterface.OnClickListener() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.7.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                                    return;
                                }
                                UccBindPresenter.access$100(UccBindPresenter.this, activity);
                                if (uccCallback == null) {
                                    return;
                                }
                                uccCallback.onFail(uccParams.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "换绑失败"));
                            }
                        }, "", null);
                        return;
                    }
                    ((MemberExecutorService) AliMemberSDK.getService(MemberExecutorService.class)).postUITask(new Runnable() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.7.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                ToastUtil.showToast(activity.getApplicationContext(), str5, 0);
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                            UccBindPresenter.access$100(UccBindPresenter.this, activity);
                        }
                    });
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onError(String str3, final RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3aace899", new Object[]{this, str3, rpcResponse});
                        return;
                    }
                    final int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1008);
                    StringBuilder sb = new StringBuilder();
                    sb.append(buidErrorCode);
                    String str4 = "";
                    sb.append(str4);
                    rpcResultlHit(sb.toString());
                    if (rpcResponse != null) {
                        str4 = rpcResponse.message;
                    }
                    final String str5 = str4;
                    if (i == 1) {
                        DialogHelper dialogHelper = DialogHelper.getInstance();
                        Activity activity2 = activity;
                        dialogHelper.alert(activity2, "", str5, activity2.getString(R.string.member_sdk_iknow), new DialogInterface.OnClickListener() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.7.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                                    return;
                                }
                                UccBindPresenter.access$100(UccBindPresenter.this, activity);
                                if (uccCallback == null) {
                                    return;
                                }
                                uccCallback.onFail(uccParams.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "换绑失败"));
                            }
                        }, "", null);
                        return;
                    }
                    ((MemberExecutorService) AliMemberSDK.getService(MemberExecutorService.class)).postUITask(new Runnable() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.7.5
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                ToastUtil.showToast(activity.getApplicationContext(), str5, 0);
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                            UccBindPresenter.access$100(UccBindPresenter.this, activity);
                        }
                    });
                }

                private void rpcResultlHit(String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b6096ba", new Object[]{this, str3});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("code", str3);
                    Activity activity2 = activity;
                    if (activity2 != null && (activity2 instanceof UccWebViewActivity)) {
                        hashMap.put("type", "H5");
                    } else {
                        hashMap.put("type", "native");
                    }
                    UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_ChangeBindResult", uccParams, hashMap);
                }
            });
        }
    }

    public void bindAfterRecommend(Activity activity, String str, UccParams uccParams, String str2, String str3, Map<String, String> map, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609b5bb6", new Object[]{this, activity, str, uccParams, str2, str3, map, uccCallback});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("requestToken", str);
        hashMap.put("bindUserToken", str2);
        UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_RecommendBind", uccParams, hashMap);
        uccParams.requestToken = str;
        uccParams.bindUserToken = str2;
        showProgress(activity);
        DataRepository.bindAfterRecommend(uccParams, new BindRpcRequestCallback(activity, 1, 0, uccParams, str3, map, uccCallback));
    }

    public void bindIdentify(Activity activity, String str, UccParams uccParams, String str2, String str3, String str4, Map<String, String> map, UccCallback uccCallback) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8b88674", new Object[]{this, activity, str, uccParams, str2, str3, str4, map, uccCallback});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bindUserToken", str3);
        if (!StringUtils.isEmpty(str2)) {
            hashMap.put("bizToken", str2);
            UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_BindIdentify_IV", uccParams, hashMap);
            i = 1;
        } else if (!StringUtils.isEmpty(str)) {
            hashMap.put("bizToken", str);
            UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_BindIdentify_oauthLogin", uccParams, hashMap);
            i = 2;
        } else {
            i = 0;
        }
        uccParams.requestToken = str;
        uccParams.bindUserToken = str3;
        uccParams.ivToken = str2;
        showProgress(activity);
        DataRepository.bindIdentify(uccParams, new BindRpcRequestCallback(activity, 2, i, uccParams, str4, map, uccCallback));
    }

    public static void showProgress(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a955863", new Object[]{activity});
        } else if (!"true".equals(getProgressOrange())) {
        } else {
            DialogHelper.getInstance().showProgressDialog(activity, "", true, null);
        }
    }

    public static void dismissProgress(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512f0cb0", new Object[]{activity});
        } else if (!"true".equals(getProgressOrange())) {
        } else {
            DialogHelper.getInstance().dismissProgressDialog(activity);
        }
    }

    public static String getProgressOrange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24478be8", new Object[0]);
        }
        try {
            return OrangeConfig.getInstance().getConfig("login4android", "progress", "false");
        } catch (Throwable unused) {
            return "false";
        }
    }

    /* loaded from: classes2.dex */
    public class BindRpcRequestCallback implements RpcRequestCallbackWithCode {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Map<String, String> bizParams;
        private int bizType;
        private Activity context;
        private String needToast;
        private int type;
        private UccCallback uccCallback;
        private UccParams uccParams;

        static {
            kge.a(1414109636);
            kge.a(-1961690056);
        }

        public static /* synthetic */ Activity access$300(BindRpcRequestCallback bindRpcRequestCallback) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("87bdb4c5", new Object[]{bindRpcRequestCallback}) : bindRpcRequestCallback.context;
        }

        public static /* synthetic */ int access$400(BindRpcRequestCallback bindRpcRequestCallback) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f06666d5", new Object[]{bindRpcRequestCallback})).intValue() : bindRpcRequestCallback.bizType;
        }

        public static /* synthetic */ UccCallback access$500(BindRpcRequestCallback bindRpcRequestCallback) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UccCallback) ipChange.ipc$dispatch("aa1f2252", new Object[]{bindRpcRequestCallback}) : bindRpcRequestCallback.uccCallback;
        }

        public static /* synthetic */ UccParams access$600(BindRpcRequestCallback bindRpcRequestCallback) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UccParams) ipChange.ipc$dispatch("b02753f6", new Object[]{bindRpcRequestCallback}) : bindRpcRequestCallback.uccParams;
        }

        public BindRpcRequestCallback(Activity activity, int i, int i2, UccParams uccParams, String str, Map<String, String> map, UccCallback uccCallback) {
            this.context = activity;
            this.uccParams = uccParams;
            this.uccCallback = uccCallback;
            this.needToast = str;
            this.type = i;
            this.bizType = i2;
            this.bizParams = map;
        }

        @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
        public void onSuccess(final RpcResponse rpcResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                return;
            }
            UccBindPresenter.dismissProgress(this.context);
            rpcResultlHit(rpcResponse.code + "", rpcResponse.actionType);
            String str = (String) rpcResponse.returnValue;
            if (StringUtils.equals("CHANGEBIND", rpcResponse.actionType)) {
                UccBindPresenter.this.changeBind(this.context, this.uccParams, this.bizType, rpcResponse.message, ((BindResult) JSON.parseObject(str, BindResult.class)).changeBindToken, this.needToast, this.bizParams, this.uccCallback);
            } else if (StringUtils.equals("CONFLICTUPGRADE", rpcResponse.actionType)) {
                UccBindPresenter.access$000(UccBindPresenter.this, this.context, this.uccParams, 0, rpcResponse.message, ((BindResult) JSON.parseObject(str, BindResult.class)).requestToken, "0", this.bizParams, this.uccCallback);
            } else if (StringUtils.equals("H5", rpcResponse.actionType) && rpcResponse.returnValue != 0) {
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject != null) {
                    String string = parseObject.getString("returnUrl");
                    Bundle bundle = new Bundle();
                    bundle.putString("url", string);
                    bundle.putString("token", parseObject.getString("trustLoginToken"));
                    bundle.putString("scene", parseObject.getString("scene"));
                    bundle.putString(UccConstants.PARAM_UCC_PARAMS, JSON.toJSONString(this.uccParams));
                    bundle.putString("needSession", "1");
                    bundle.putString("params", Utils.convertMapToJsonStr(this.bizParams));
                    UccH5Presenter.openUrl(this.context, bundle, this.uccCallback);
                    Activity activity = this.context;
                    if (activity == null || (activity instanceof UccWebViewActivity)) {
                        return;
                    }
                    activity.finish();
                    return;
                }
                UccBindPresenter.access$100(UccBindPresenter.this, this.context);
                UccCallback uccCallback = this.uccCallback;
                if (uccCallback == null) {
                    return;
                }
                uccCallback.onFail(this.uccParams.bindSite, 1005, Utils.buidErrorMessage(rpcResponse, "免登失败"));
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("needLogin", (StringUtils.isEmpty(str) || str.length() < 10) ? UTConstant.Args.UT_SUCCESS_F : "T");
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_Success", this.uccParams, hashMap);
                if (this.context != null && !StringUtils.isEmpty(rpcResponse.message) && StringUtils.equals(this.needToast, "1")) {
                    ((MemberExecutorService) AliMemberSDK.getService(MemberExecutorService.class)).postUITask(new Runnable() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.BindRpcRequestCallback.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                Toast.makeText(BindRpcRequestCallback.access$300(BindRpcRequestCallback.this).getApplicationContext(), rpcResponse.message, 0).show();
                            }
                        }
                    });
                }
                UccBindPresenter.access$100(UccBindPresenter.this, this.context);
                UccBindPresenter.access$200(UccBindPresenter.this, this.uccParams, this.bizParams, str, this.uccCallback);
            }
        }

        @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
        public void onSystemError(String str, RpcResponse rpcResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96a636ea", new Object[]{this, str, rpcResponse});
            } else {
                onError(str, rpcResponse);
            }
        }

        @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
        public void onError(String str, final RpcResponse rpcResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3aace899", new Object[]{this, str, rpcResponse});
                return;
            }
            UccBindPresenter.dismissProgress(this.context);
            final int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1007);
            rpcResultlHit(buidErrorCode + "", "");
            if (StringUtils.equals(this.needToast, "1")) {
                DialogHelper.getInstance().alert(this.context, "", Utils.buidErrorMessage(rpcResponse, "绑定失败"), this.context.getString(R.string.member_sdk_iknow), new DialogInterface.OnClickListener() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.BindRpcRequestCallback.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        } else if (BindRpcRequestCallback.access$400(BindRpcRequestCallback.this) != 1) {
                        } else {
                            UccBindPresenter.access$100(UccBindPresenter.this, BindRpcRequestCallback.access$300(BindRpcRequestCallback.this));
                            if (BindRpcRequestCallback.access$500(BindRpcRequestCallback.this) == null) {
                                return;
                            }
                            BindRpcRequestCallback.access$500(BindRpcRequestCallback.this).onFail(BindRpcRequestCallback.access$600(BindRpcRequestCallback.this).bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "绑定失败"));
                        }
                    }
                }, "", null);
            } else if (this.bizType == 1) {
                UccBindPresenter.access$100(UccBindPresenter.this, this.context);
                UccCallback uccCallback = this.uccCallback;
                if (uccCallback == null) {
                    return;
                }
                uccCallback.onFail(this.uccParams.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "绑定失败"));
            } else {
                ((MemberExecutorService) AliMemberSDK.getService(MemberExecutorService.class)).postUITask(new Runnable() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.BindRpcRequestCallback.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            ToastUtil.showToast(BindRpcRequestCallback.access$300(BindRpcRequestCallback.this).getApplicationContext(), Utils.buidErrorMessage(rpcResponse, "绑定失败"), 0);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            }
        }

        private void rpcResultlHit(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49374604", new Object[]{this, str, str2});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("code", str);
            hashMap.put("bindUserToken", this.uccParams.bindUserToken);
            hashMap.put("actionType", str2);
            if (this.type == 1) {
                hashMap.put("bizToken", this.uccParams.requestToken);
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_RecommendBindResult", this.uccParams, hashMap);
            } else if (!StringUtils.isEmpty(this.uccParams.ivToken)) {
                hashMap.put("bizToken", this.uccParams.ivToken);
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_BindIdentifyResult_IV", this.uccParams, hashMap);
            } else if (StringUtils.isEmpty(this.uccParams.requestToken)) {
            } else {
                hashMap.put("bizToken", this.uccParams.requestToken);
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_BindIdentifyResult_oauthLogin", this.uccParams, hashMap);
            }
        }
    }

    public void tokenLoginAfterBind(final Context context, final UccParams uccParams, final String str, final String str2, final String str3, final String str4, final Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9df54bb2", new Object[]{this, context, uccParams, str, str2, str3, str4, map, uccCallback});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("trustToken", str);
        hashMap.put("action", str2);
        UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_OauthLogin", uccParams, hashMap);
        DataRepository.tokenLoginAfterBind(str, new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                    return;
                }
                rpcResultlHit(rpcResponse.code + "");
                String str5 = (String) rpcResponse.returnValue;
                if (context != null && !StringUtils.isEmpty(str4) && StringUtils.equals(str3, "1")) {
                    ((MemberExecutorService) AliMemberSDK.getService(MemberExecutorService.class)).postUITask(new Runnable() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.8.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                Toast.makeText(context.getApplicationContext(), str4, 0).show();
                            }
                        }
                    });
                }
                UccBindPresenter.access$100(UccBindPresenter.this, context);
                UccBindPresenter.access$200(UccBindPresenter.this, uccParams, map, str5, uccCallback);
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSystemError(String str5, final RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str5, rpcResponse});
                    return;
                }
                final int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1007);
                StringBuilder sb = new StringBuilder();
                sb.append(buidErrorCode);
                String str6 = "";
                sb.append(str6);
                rpcResultlHit(sb.toString());
                if (rpcResponse != null) {
                    str6 = rpcResponse.message;
                }
                DialogHelper dialogHelper = DialogHelper.getInstance();
                Context context2 = context;
                dialogHelper.alert((Activity) context2, "", str6, context2.getString(R.string.member_sdk_iknow), new DialogInterface.OnClickListener() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.8.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        UccBindPresenter.access$100(UccBindPresenter.this, context);
                        if (uccCallback == null) {
                            return;
                        }
                        uccCallback.onFail(uccParams.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "OauthLogin接口错误"));
                    }
                }, "", null);
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onError(String str5, final RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3aace899", new Object[]{this, str5, rpcResponse});
                    return;
                }
                final int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1007);
                StringBuilder sb = new StringBuilder();
                sb.append(buidErrorCode);
                String str6 = "";
                sb.append(str6);
                rpcResultlHit(sb.toString());
                if (rpcResponse != null) {
                    str6 = rpcResponse.message;
                }
                DialogHelper dialogHelper = DialogHelper.getInstance();
                Context context2 = context;
                dialogHelper.alert((Activity) context2, "", str6, context2.getString(R.string.member_sdk_iknow), new DialogInterface.OnClickListener() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.8.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        UccBindPresenter.access$100(UccBindPresenter.this, context);
                        if (uccCallback == null) {
                            return;
                        }
                        uccCallback.onFail(uccParams.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "OauthLogin接口错误"));
                    }
                }, "", null);
            }

            private void rpcResultlHit(String str5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b6096ba", new Object[]{this, str5});
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("code", str5);
                hashMap2.put("action", str2);
                hashMap2.put("trustToken", str);
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_OauthLoginResult", uccParams, hashMap2);
            }
        });
    }

    public void getUserInfo(final Context context, final UccParams uccParams, String str, String str2, final String str3, final Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa01d9ce", new Object[]{this, context, uccParams, str, str2, str3, map, uccCallback});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", str3);
        UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_GetAuthInfo", uccParams, hashMap);
        final UccParams uccParams2 = new UccParams();
        if (map != null && !StringUtils.isEmpty(map.get("site"))) {
            uccParams2.site = map.get("site");
        } else {
            uccParams2.site = AliMemberSDK.getMasterSite();
        }
        if (map != null && !StringUtils.isEmpty(map.get("bindSite"))) {
            uccParams2.bindSite = map.get("bindSite");
        } else {
            uccParams2.bindSite = uccParams.bindSite;
        }
        uccParams2.userToken = uccParams.userToken;
        uccParams2.bindUserToken = str;
        uccParams2.bindUserTokenType = str2;
        uccParams2.createBindSiteSession = true;
        if (map != null && !StringUtils.isEmpty(map.get("scene"))) {
            uccParams2.scene = map.get("scene");
        }
        DataRepository.getUserInfo(uccParams2, str3, new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                    return;
                }
                rpcResultlHit(rpcResponse.code + "", rpcResponse.actionType);
                if (rpcResponse.returnValue == 0) {
                    UccCallback uccCallback2 = uccCallback;
                    if (uccCallback2 == null) {
                        return;
                    }
                    uccCallback2.onFail(uccParams.bindSite, 1013, Utils.buidErrorMessage(rpcResponse, "GetUserInfo接口错误"));
                    return;
                }
                String str4 = (String) rpcResponse.returnValue;
                if (StringUtils.equals("H5", rpcResponse.actionType) && rpcResponse.returnValue != 0) {
                    JSONObject parseObject = JSON.parseObject(str4);
                    if (parseObject != null) {
                        String string = parseObject.getString("h5Url");
                        Bundle bundle = new Bundle();
                        bundle.putString("url", string);
                        bundle.putString("token", parseObject.getString("token"));
                        bundle.putString("scene", parseObject.getString("scene"));
                        bundle.putString(UccConstants.PARAM_UCC_PARAMS, JSON.toJSONString(uccParams));
                        bundle.putString("needSession", "1");
                        bundle.putString("params", Utils.convertMapToJsonStr(map));
                        UccH5Presenter.openUrl(context, bundle, uccCallback);
                        Context context2 = context;
                        if (context2 == null || (context2 instanceof UccWebViewActivity)) {
                            return;
                        }
                        ((Activity) context2).finish();
                        return;
                    }
                    UccBindPresenter.access$100(UccBindPresenter.this, context);
                    UccCallback uccCallback3 = uccCallback;
                    if (uccCallback3 == null) {
                        return;
                    }
                    uccCallback3.onFail(uccParams.bindSite, 1005, Utils.buidErrorMessage(rpcResponse, "免登失败"));
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("needLogin", uccParams2.createBindSiteSession ? "T" : UTConstant.Args.UT_SUCCESS_F);
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_Success", uccParams, hashMap2);
                UccBindPresenter.access$100(UccBindPresenter.this, context);
                UccBindPresenter.access$200(UccBindPresenter.this, uccParams, map, str4, uccCallback);
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSystemError(String str4, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str4, rpcResponse});
                    return;
                }
                int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1007);
                StringBuilder sb = new StringBuilder();
                sb.append(buidErrorCode);
                String str5 = "";
                sb.append(str5);
                rpcResultlHit(sb.toString(), str5);
                if (StringUtils.equals(str3, "h5")) {
                    if (rpcResponse != null) {
                        str5 = rpcResponse.message;
                    }
                    DialogHelper dialogHelper = DialogHelper.getInstance();
                    Context context2 = context;
                    dialogHelper.alert((Activity) context2, "", str5, context2.getString(R.string.member_sdk_iknow), new DialogInterface.OnClickListener() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.9.1
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
                UccBindPresenter.access$100(UccBindPresenter.this, context);
                UccCallback uccCallback2 = uccCallback;
                if (uccCallback2 == null) {
                    return;
                }
                uccCallback2.onFail(uccParams.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "OauthLogin接口错误"));
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onError(String str4, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3aace899", new Object[]{this, str4, rpcResponse});
                    return;
                }
                int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1007);
                StringBuilder sb = new StringBuilder();
                sb.append(buidErrorCode);
                String str5 = "";
                sb.append(str5);
                rpcResultlHit(sb.toString(), str5);
                if (StringUtils.equals(str3, "h5")) {
                    if (rpcResponse != null) {
                        str5 = rpcResponse.message;
                    }
                    DialogHelper dialogHelper = DialogHelper.getInstance();
                    Context context2 = context;
                    dialogHelper.alert((Activity) context2, "", str5, context2.getString(R.string.member_sdk_iknow), new DialogInterface.OnClickListener() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.9.2
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
                UccBindPresenter.access$100(UccBindPresenter.this, context);
                UccCallback uccCallback2 = uccCallback;
                if (uccCallback2 == null) {
                    return;
                }
                uccCallback2.onFail(uccParams.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "OauthLogin接口错误"));
            }

            private void rpcResultlHit(String str4, String str5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("49374604", new Object[]{this, str4, str5});
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("code", str4);
                hashMap2.put("type", StringUtils.isEmpty(str3) ? "" : str3);
                hashMap2.put("actionType", str5);
                if (!StringUtils.isEmpty(uccParams2.bindUserToken)) {
                    hashMap2.put("bindUserToken", uccParams2.bindUserToken);
                }
                if (!StringUtils.isEmpty(uccParams2.scene)) {
                    hashMap2.put("scene", uccParams2.scene);
                }
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_GetAuthInfoResult", uccParams, hashMap2);
            }
        });
    }

    private void sendLoginSuccessBroadcast(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ec5955", new Object[]{this, str, map});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(UccResultAction.NOTIFY_UCC_LOGIN_SUCCESS.name());
        intent.setPackage(KernelContext.getApplicationContext().getPackageName());
        intent.putExtra("process", map == null ? "" : map.get("process"));
        intent.putExtra("site", str);
        UccBroadcastHelper.sendBroadcast(intent);
    }

    public void skipUpgrade(final Context context, final UccParams uccParams, final String str, final Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60bb5c8", new Object[]{this, context, uccParams, str, map, uccCallback});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_LoginContinue", uccParams, hashMap);
        final UccParams uccParams2 = new UccParams();
        if (map != null && !StringUtils.isEmpty(map.get("site"))) {
            uccParams2.site = map.get("site");
        } else {
            uccParams2.site = AliMemberSDK.getMasterSite();
        }
        if (map != null && !StringUtils.isEmpty(map.get("bindSite"))) {
            uccParams2.bindSite = map.get("bindSite");
        } else {
            uccParams2.bindSite = uccParams.bindSite;
        }
        uccParams2.userToken = uccParams.userToken;
        uccParams2.requestToken = uccParams.requestToken;
        uccParams2.createBindSiteSession = true;
        if (map != null && !StringUtils.isEmpty(map.get("scene"))) {
            uccParams2.scene = map.get("scene");
        }
        DataRepository.skipUpgrade(uccParams, str, new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                    return;
                }
                rpcResultlHit(rpcResponse.code + "", rpcResponse.actionType);
                if (rpcResponse.returnValue == 0) {
                    UccCallback uccCallback2 = uccCallback;
                    if (uccCallback2 == null) {
                        return;
                    }
                    uccCallback2.onFail(uccParams.bindSite, 1012, Utils.buidErrorMessage(rpcResponse, "skipUpgrade接口错误"));
                    return;
                }
                UccBindPresenter.access$100(UccBindPresenter.this, context);
                UccBindPresenter.access$200(UccBindPresenter.this, uccParams, map, (String) rpcResponse.returnValue, uccCallback);
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onSystemError(String str2, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str2, rpcResponse});
                } else {
                    onFail(str2, rpcResponse);
                }
            }

            @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
            public void onError(String str2, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3aace899", new Object[]{this, str2, rpcResponse});
                } else {
                    onFail(str2, rpcResponse);
                }
            }

            public void onFail(String str2, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cf4ff2cd", new Object[]{this, str2, rpcResponse});
                    return;
                }
                int buidErrorCode = Utils.buidErrorCode(rpcResponse, 1012);
                StringBuilder sb = new StringBuilder();
                sb.append(buidErrorCode);
                String str3 = "";
                sb.append(str3);
                rpcResultlHit(sb.toString(), str3);
                if (StringUtils.equals(str, "h5")) {
                    if (rpcResponse != null) {
                        str3 = rpcResponse.message;
                    }
                    DialogHelper dialogHelper = DialogHelper.getInstance();
                    Context context2 = context;
                    dialogHelper.alert((Activity) context2, "", str3, context2.getString(R.string.member_sdk_iknow), new DialogInterface.OnClickListener() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.10.1
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
                UccBindPresenter.access$100(UccBindPresenter.this, context);
                UccCallback uccCallback2 = uccCallback;
                if (uccCallback2 == null) {
                    return;
                }
                uccCallback2.onFail(uccParams.bindSite, buidErrorCode, Utils.buidErrorMessage(rpcResponse, "skipUpgrade接口错误"));
            }

            private void rpcResultlHit(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("49374604", new Object[]{this, str2, str3});
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("code", str2);
                hashMap2.put("type", StringUtils.isEmpty(str) ? "" : str);
                hashMap2.put("actionType", str3);
                hashMap2.put("requestToken", uccParams.requestToken);
                if (!StringUtils.isEmpty(uccParams2.scene)) {
                    hashMap2.put("scene", uccParams2.scene);
                }
                UTHitUtils.send(UTHitConstants.PageUccBind, "UccBind_LoginContinueResult", uccParams, hashMap2);
            }
        });
    }

    public void applyToken(final UccParams uccParams, String str, Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8245957a", new Object[]{this, uccParams, str, map, uccCallback});
        } else {
            DataRepository.applyToken(uccParams.bindSite, map, new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSuccess(RpcResponse rpcResponse) {
                    MLoginTokenReturnValue mLoginTokenReturnValue;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                    } else if (rpcResponse != null && rpcResponse.returnValue != 0 && (mLoginTokenReturnValue = (MLoginTokenReturnValue) rpcResponse.returnValue) != null && !StringUtils.isEmpty(mLoginTokenReturnValue.token)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("token", mLoginTokenReturnValue.token);
                        uccCallback.onSuccess(uccParams.bindSite, hashMap);
                    } else {
                        uccCallback.onFail(uccParams.bindSite, 1602, "parse data error");
                    }
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSystemError(String str2, RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str2, rpcResponse});
                    } else {
                        onError(str2, rpcResponse);
                    }
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onError(String str2, RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3aace899", new Object[]{this, str2, rpcResponse});
                        return;
                    }
                    UccCallback uccCallback2 = uccCallback;
                    String str3 = uccParams.bindSite;
                    if (StringUtils.isEmpty(str2)) {
                        str2 = "rpc error";
                    }
                    uccCallback2.onFail(str3, 1602, str2);
                }
            });
        }
    }

    public void queryBind(final UccParams uccParams, Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b33df76", new Object[]{this, uccParams, map, uccCallback});
        } else {
            DataRepository.queryBind(uccParams, new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSuccess(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("data", (String) rpcResponse.returnValue);
                    uccCallback.onSuccess(uccParams.bindSite, hashMap);
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSystemError(String str, RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str, rpcResponse});
                    } else {
                        onError(str, rpcResponse);
                    }
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onError(String str, RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3aace899", new Object[]{this, str, rpcResponse});
                    } else if (uccCallback == null) {
                    } else {
                        uccCallback.onFail(uccParams.bindSite, Utils.buidErrorCode(rpcResponse, 1600), Utils.buidErrorMessage(rpcResponse, "queryBind接口失败"));
                    }
                }
            });
        }
    }

    public void updateGrantAuthorization(final UccParams uccParams, Map<String, String> map, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cdfd6d5", new Object[]{this, uccParams, map, uccCallback});
        } else {
            DataRepository.updateGrantAuthorization(uccParams, new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSuccess(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("data", (String) rpcResponse.returnValue);
                    uccCallback.onSuccess(uccParams.bindSite, hashMap);
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSystemError(String str, RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str, rpcResponse});
                    } else {
                        onError(str, rpcResponse);
                    }
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onError(String str, RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3aace899", new Object[]{this, str, rpcResponse});
                    } else if (uccCallback == null) {
                    } else {
                        uccCallback.onFail(uccParams.bindSite, Utils.buidErrorCode(rpcResponse, 1700), Utils.buidErrorMessage(rpcResponse, "updateGrantAuthorization接口失败"));
                    }
                }
            });
        }
    }

    public void noActionBindWithChangeBind(Activity activity, UccParams uccParams, Map<String, String> map, UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba26f482", new Object[]{this, activity, uccParams, map, uccCallback});
            return;
        }
        String str = "0";
        if (map != null && !StringUtils.isEmpty(map.get("needToast"))) {
            str = map.get("needToast");
        }
        DataRepository.noActionBind(uccParams, new BindRpcRequestCallback(activity, 3, 0, uccParams, str, new HashMap(), uccCallback));
    }

    public void noActionBind(final UccParams uccParams, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("458029b6", new Object[]{this, uccParams, uccCallback});
        } else {
            DataRepository.noActionBind(uccParams, new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSuccess(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("data", (String) rpcResponse.returnValue);
                    uccCallback.onSuccess(uccParams.bindSite, hashMap);
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSystemError(String str, RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str, rpcResponse});
                    } else {
                        onError(str, rpcResponse);
                    }
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onError(String str, RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3aace899", new Object[]{this, str, rpcResponse});
                    } else if (uccCallback == null) {
                    } else {
                        int buidErrorCode = Utils.buidErrorCode(rpcResponse, UccResultCode.NO_ACTION_BIND_FAILED);
                        String buidErrorMessage = Utils.buidErrorMessage(rpcResponse, "noActionBind接口失败");
                        if (rpcResponse != null && "CHANGEBIND".equals(rpcResponse.actionType) && rpcResponse.returnValue != 0) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("data", (String) rpcResponse.returnValue);
                            uccCallback.onSuccess(uccParams.bindSite, hashMap);
                            return;
                        }
                        uccCallback.onFail(uccParams.bindSite, buidErrorCode, buidErrorMessage);
                    }
                }
            });
        }
    }

    public void noActionUnbind(final UccParams uccParams, final UccCallback uccCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d4ca4f", new Object[]{this, uccParams, uccCallback});
        } else {
            DataRepository.noActionUnbind(uccParams, new RpcRequestCallbackWithCode() { // from class: com.ali.user.open.ucc.biz.UccBindPresenter.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSuccess(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("88061ca", new Object[]{this, rpcResponse});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("data", (String) rpcResponse.returnValue);
                    uccCallback.onSuccess(uccParams.bindSite, hashMap);
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onSystemError(String str, RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("96a636ea", new Object[]{this, str, rpcResponse});
                    } else {
                        onError(str, rpcResponse);
                    }
                }

                @Override // com.ali.user.open.core.model.RpcRequestCallbackWithCode
                public void onError(String str, RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3aace899", new Object[]{this, str, rpcResponse});
                    } else {
                        uccCallback.onFail(uccParams.bindSite, Utils.buidErrorCode(rpcResponse, UccResultCode.NO_ACTION_BIND_FAILED), Utils.buidErrorMessage(rpcResponse, "noActionBind接口失败"));
                    }
                }
            });
        }
    }

    private void refreshWhenLogin(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("852e92e5", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        String string = JSON.parseObject(str2).getString("authorizationResponse");
        UccServiceProvider uccServiceProvider = UccServiceProviderFactory.getInstance().getUccServiceProvider(str);
        if (!StringUtils.isEmpty(string)) {
            uccServiceProvider.refreshWhenLogin(str, string, z);
        } else {
            uccServiceProvider.refreshWhenLogin(str, str2, z);
        }
    }

    private void onBindSuccess(UccParams uccParams, Map<String, String> map, String str, UccCallback uccCallback) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef88f96a", new Object[]{this, uccParams, map, str, uccCallback});
            return;
        }
        if (map == null || !StringUtils.equals(map.get(ParamsConstants.Key.PARAM_NEED_LOCAL_SESSION), "0")) {
            z = true;
        }
        boolean isCookieOnly = UccOauthLoginPresenter.isCookieOnly(map);
        if (!StringUtils.isEmpty(str) && z) {
            refreshWhenLogin(uccParams.bindSite, str, isCookieOnly);
        }
        if (uccCallback == null) {
            return;
        }
        Map<String, String> buildSessionInfo = buildSessionInfo(uccParams.bindSite, str);
        if (!StringUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null) {
            String string = parseObject.getString("authorizationResponse");
            if (StringUtils.isEmpty(string)) {
                buildSessionInfo.put(UccConstants.PARAM_LOGIN_DATA, str);
            } else {
                buildSessionInfo.put(UccConstants.PARAM_LOGIN_DATA, string);
            }
        }
        sendLoginSuccessBroadcast(uccParams.bindSite, map);
        uccCallback.onSuccess(uccParams.bindSite, buildSessionInfo);
    }

    public static Map<String, String> buildSessionInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9649eda6", new Object[]{str, str2});
        }
        if (StringUtils.isEmpty(str2)) {
            return new HashMap();
        }
        String string = JSON.parseObject(str2).getString("authorizationResponse");
        UccServiceProvider uccServiceProvider = UccServiceProviderFactory.getInstance().getUccServiceProvider(str);
        if (!StringUtils.isEmpty(string)) {
            return uccServiceProvider.buildSessionInfo(str, string);
        }
        return uccServiceProvider.buildSessionInfo(str, str2);
    }

    private void finishActivity(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fecb9f", new Object[]{this, context});
        } else if (context == null) {
        } else {
            if (!(context instanceof UccWebViewActivity) && !(context instanceof UccActivity)) {
                return;
            }
            ((Activity) context).finish();
            CallbackManager.unregisterCallback(UccConstants.UCC_H5_CALLBACK_TYPE);
        }
    }
}
