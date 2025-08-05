package com.taobao.android.sns4android;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.base.helper.LoginDataHelper;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.filter.LoginFilterCallback;
import com.ali.user.mobile.helper.DialogHelper;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.SNSSignInAccount;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.SNSService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.url.service.impl.UrlUtil;
import com.ali.user.mobile.utils.ResourceUtil;
import com.ali.user.open.ucc.util.UccConstants;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.util.b;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.thread.LoginThreadHelper;
import com.taobao.login4android.utils.ReflectionHelper;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.json.JSONObject;
import tb.iyi;
import tb.iyj;
import tb.qqw;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static a f15257a = null;
    private static boolean b = false;

    public static void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aa474a2", new Object[]{dVar});
        } else if (dVar == null) {
        } else {
            if (f15257a == null) {
                f15257a = new a();
            }
            if (a(dVar.f15262a)) {
                iyi a2 = iyi.a(dVar);
                a2.a(f15257a);
                e.a().a(dVar.f15262a, a2);
            } else if (d(dVar.f15262a)) {
                qqw a3 = qqw.a(dVar);
                a3.a(f15257a);
                e.a().a(dVar.f15262a, a3);
            } else {
                a(dVar.f15262a, dVar.b, dVar.c);
            }
        }
    }

    public static void a(SNSPlatform sNSPlatform, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ab8fd9", new Object[]{sNSPlatform, str, str2, str3});
            return;
        }
        if (f15257a == null) {
            f15257a = new a();
        }
        if (!c(sNSPlatform) && !b(sNSPlatform)) {
            return;
        }
        try {
            Class<?> cls = Class.forName("com.taobao.android.sns4android.SNSOverseaAuth");
            ReflectionHelper.invokeMethod(cls, cls.getDeclaredMethod("init", SNSPlatform.class, String.class, String.class, String.class, a.class), sNSPlatform, str, str2, str3, f15257a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(SNSPlatform sNSPlatform, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2521bcf", new Object[]{sNSPlatform, str, str2});
            return;
        }
        LoginTLogAdapter.e(LoginSwitch.TAG, "appid=" + str);
        a(sNSPlatform, str, str2, "");
    }

    public static boolean b(SNSPlatform sNSPlatform) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b73ec240", new Object[]{sNSPlatform})).booleanValue() : TextUtils.equals(sNSPlatform.getPlatform(), SNSPlatform.PLATFORM_FACEBOOK.getPlatform());
    }

    public static boolean c(SNSPlatform sNSPlatform) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b6c85c41", new Object[]{sNSPlatform})).booleanValue() : TextUtils.equals(sNSPlatform.getPlatform(), SNSPlatform.PLATFORM_GOOGLE.getPlatform());
    }

    public static void a(SNSPlatform sNSPlatform, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4a5f14d", new Object[]{sNSPlatform, activity});
        } else {
            a(sNSPlatform, activity, (Map<String, String>) null);
        }
    }

    public static void a(SNSPlatform sNSPlatform, Activity activity, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fcb8698", new Object[]{sNSPlatform, activity, map});
        } else {
            a(sNSPlatform, activity, map, (LoginFilterCallback) null);
        }
    }

    public static void a(SNSPlatform sNSPlatform, Activity activity, Map<String, String> map, LoginFilterCallback loginFilterCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d60a4250", new Object[]{sNSPlatform, activity, map, loginFilterCallback});
        } else if (activity == null) {
        } else {
            b = false;
            LoginStatus.loginEntrance = null;
            if (e.a().a(sNSPlatform) != null) {
                Properties properties = LoginComponent.getProperties();
                if (map != null) {
                    UserTrackAdapter.sendUT(map.get(UTConstant.PageName.UT_KEY_PAGE_NAME), "snsAuthCode_commit", "", b.c(sNSPlatform.getPlatform()), properties);
                } else {
                    UserTrackAdapter.sendExtendUT("snsAuthCode_commit", "", b.c(sNSPlatform.getPlatform()), properties);
                }
                e.a().a(sNSPlatform).a(activity, map);
                return;
            }
            if (activity != null) {
                ((SNSService) ServiceFactory.getService(SNSService.class)).toast(activity, ResourceUtil.getStringById("aliuser_SNS_auth_init_failed"));
            }
            BroadCastHelper.sendLoginFailBroadcast(703, "exception");
        }
    }

    public static void a(SNSPlatform sNSPlatform, Activity activity, g gVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21fa5ada", new Object[]{sNSPlatform, activity, gVar, jSONObject});
        } else if (activity == null) {
        } else {
            b = false;
            if (e.a().a(sNSPlatform) == null) {
                return;
            }
            e.a().a(sNSPlatform).a(activity, gVar, jSONObject);
        }
    }

    public static void a(SNSPlatform sNSPlatform, int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d748cc98", new Object[]{sNSPlatform, new Integer(i), new Integer(i2), intent});
            return;
        }
        try {
            if (e.a().a(sNSPlatform) == null) {
                return;
            }
            e.a().a(sNSPlatform);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* loaded from: classes6.dex */
    public static class a implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ void a(a aVar, Activity activity, SNSSignInAccount sNSSignInAccount, RpcResponse rpcResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e347b487", new Object[]{aVar, activity, sNSSignInAccount, rpcResponse});
            } else {
                aVar.a(activity, sNSSignInAccount, rpcResponse);
            }
        }

        @Override // com.taobao.android.sns4android.g
        public void onSucceed(final Activity activity, final SNSSignInAccount sNSSignInAccount) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8032b9ea", new Object[]{this, activity, sNSSignInAccount});
                return;
            }
            if (activity != null) {
                ((SNSService) ServiceFactory.getService(SNSService.class)).showLoading(activity);
            }
            String str = TextUtils.isEmpty(sNSSignInAccount.utPageName) ? UTConstant.PageName.UT_PAGE_EXTEND : sNSSignInAccount.utPageName;
            if (sNSSignInAccount != null) {
                Properties properties = LoginComponent.getProperties();
                UserTrackAdapter.sendUT(str, "snsAuthCode_success", "", b.a(sNSSignInAccount.snsType), properties);
                UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", b.a(sNSSignInAccount.snsType), properties);
            }
            iyj.a().a(sNSSignInAccount, new RpcRequestCallback() { // from class: com.taobao.android.sns4android.c.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onSuccess(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    } else {
                        a.a(a.this, activity, sNSSignInAccount, rpcResponse);
                    }
                }

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onError(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                    } else {
                        a.a(a.this, activity, sNSSignInAccount, rpcResponse);
                    }
                }
            });
        }

        private void a(final Activity activity, final SNSSignInAccount sNSSignInAccount, final RpcResponse<LoginReturnData> rpcResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a327d585", new Object[]{this, activity, sNSSignInAccount, rpcResponse});
                return;
            }
            if (activity != null) {
                ((SNSService) ServiceFactory.getService(SNSService.class)).dismissLoading(activity);
            }
            try {
                final String str = TextUtils.isEmpty(sNSSignInAccount.utPageName) ? UTConstant.PageName.UT_PAGE_EXTEND : sNSSignInAccount.utPageName;
                b.b(sNSSignInAccount.snsType);
                if (rpcResponse == null) {
                    c.a(rpcResponse, str, "Other");
                    UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, "704", b.a(sNSSignInAccount.snsType), LoginComponent.getProperties());
                    BroadCastHelper.sendLoginFailBroadcast(704, "sns auth code login with empty response");
                    if (activity == null) {
                        return;
                    }
                    ((SNSService) ServiceFactory.getService(SNSService.class)).toast(activity, ResourceUtil.getNetworkError());
                    return;
                }
                String str2 = rpcResponse.actionType;
                String str3 = rpcResponse.message;
                if (TextUtils.isEmpty(str3)) {
                    str3 = ResourceUtil.getNetworkError();
                }
                if ("SUCCESS".equals(str2) && rpcResponse.returnValue != null) {
                    if (activity != null) {
                        ((SNSService) ServiceFactory.getService(SNSService.class)).onLoginSuccess(activity, sNSSignInAccount, rpcResponse);
                    }
                    try {
                        UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "", b.a(sNSSignInAccount.snsType), LoginComponent.getProperties());
                    } catch (Throwable unused) {
                    }
                } else if (ApiConstants.ResultActionType.TOAST.equalsIgnoreCase(str2)) {
                    c.a(rpcResponse, str, "Other");
                    UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, String.valueOf(rpcResponse.code), b.a(sNSSignInAccount.snsType), LoginComponent.getProperties());
                    if (activity != null) {
                        ((SNSService) ServiceFactory.getService(SNSService.class)).toast(activity, str3);
                    }
                    BroadCastHelper.sendLoginFailBroadcast(703, str3);
                } else if ("H5".equals(str2) && rpcResponse.returnValue != null) {
                    c.a(rpcResponse, str, "h5");
                    UrlParam urlParam = new UrlParam();
                    urlParam.loginType = b.a(sNSSignInAccount.snsType);
                    LoginParam loginParam = new LoginParam();
                    loginParam.sdkTraceId = ApiReferer.generateTraceId(b.a(sNSSignInAccount.snsType), UTConstant.PageName.UT_PAGE_EXTEND);
                    loginParam.nativeLoginType = b.a(sNSSignInAccount.snsType);
                    loginParam.utPageName = str;
                    loginParam.loginSourceType = b.a(sNSSignInAccount.snsType);
                    urlParam.loginParam = loginParam;
                    LoginContext.sCurrentLoginParam = loginParam;
                    if (activity == null) {
                        return;
                    }
                    ((SNSService) ServiceFactory.getService(SNSService.class)).onH5(activity, rpcResponse, urlParam);
                } else if (ApiConstants.ResultActionType.ALERT_WITH_H5.equals(str2)) {
                    c.a(rpcResponse, str, "alert_with_h5");
                    final DialogHelper dialogHelper = new DialogHelper(activity);
                    dialogHelper.alert("", rpcResponse.message, activity.getResources().getString(R.string.aliuser_confirm), new DialogInterface.OnClickListener() { // from class: com.taobao.android.sns4android.c.a.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                return;
                            }
                            dialogHelper.dismissAlertDialog();
                            if (activity == null) {
                                return;
                            }
                            UrlParam urlParam2 = new UrlParam();
                            urlParam2.needTitle = false;
                            LoginParam loginParam2 = new LoginParam();
                            loginParam2.sdkTraceId = ApiReferer.generateTraceId(b.a(sNSSignInAccount.snsType), UTConstant.PageName.UT_PAGE_EXTEND);
                            loginParam2.nativeLoginType = b.a(sNSSignInAccount.snsType);
                            loginParam2.utPageName = str;
                            loginParam2.loginSourceType = b.a(sNSSignInAccount.snsType);
                            urlParam2.loginParam = loginParam2;
                            LoginContext.sCurrentLoginParam = loginParam2;
                            ((SNSService) ServiceFactory.getService(SNSService.class)).onH5(activity, rpcResponse, urlParam2);
                        }
                    }, null, null);
                } else if (ApiConstants.ResultActionType.UCC_H5.equals(str2) && rpcResponse.returnValue != null) {
                    c.a(rpcResponse, str, "ucc_h5");
                    String str4 = rpcResponse.returnValue.h5Url;
                    final UrlParam urlParam2 = new UrlParam();
                    urlParam2.loginType = b.a(sNSSignInAccount.snsType);
                    urlParam2.token = rpcResponse.returnValue.token;
                    urlParam2.scene = rpcResponse.returnValue.scene;
                    urlParam2.url = str4;
                    final String str5 = str;
                    UrlUtil.OpenUCC(activity, urlParam2, new CommonDataCallback() { // from class: com.taobao.android.sns4android.c.a.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.callback.CommonDataCallback
                        public void onSuccess(Map<String, String> map) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                            } else if (map != null) {
                                UserTrackAdapter.sendUT(str5, UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "", b.a(sNSSignInAccount.snsType), LoginComponent.getProperties());
                                String str6 = map.get(UccConstants.PARAM_LOGIN_DATA);
                                if (!TextUtils.isEmpty(str6)) {
                                    HashMap hashMap = new HashMap();
                                    LoginTLogAdapter.e(LoginThreadHelper.TAG, "loginType=" + urlParam2.loginType);
                                    if (!TextUtils.isEmpty(urlParam2.loginType)) {
                                        hashMap.put(LoginConstants.LOGIN_TYPE, urlParam2.loginType);
                                    }
                                    LoginDataHelper.processLoginReturnData(true, (LoginReturnData) JSON.parseObject(str6, LoginReturnData.class), hashMap);
                                    return;
                                }
                                BroadCastHelper.sendLoginFailBroadcast(702, "");
                            } else {
                                BroadCastHelper.sendLoginFailBroadcast(702, "");
                            }
                        }

                        @Override // com.ali.user.mobile.callback.CommonDataCallback
                        public void onFail(int i, String str6) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str6});
                                return;
                            }
                            Properties properties = LoginComponent.getProperties();
                            if (i == 10003 || i == 10004 || i == 15 || i == 1403) {
                                UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_CANCEL, "", b.a(sNSSignInAccount.snsType), properties);
                                BroadCastHelper.sendLoginFailBroadcast(701, "user cancel");
                                return;
                            }
                            String str7 = str;
                            UserTrackAdapter.sendUT(str7, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, i + "", b.a(sNSSignInAccount.snsType), properties);
                            BroadCastHelper.sendLoginFailBroadcast(i, str6);
                            if (activity == null) {
                                return;
                            }
                            ((SNSService) ServiceFactory.getService(SNSService.class)).toast(activity, str6);
                        }
                    });
                } else if (ApiConstants.ResultActionType.ALERT.equals(str2)) {
                    c.a(rpcResponse, str, "Alert");
                    UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, String.valueOf(rpcResponse.code), b.a(sNSSignInAccount.snsType), LoginComponent.getProperties());
                    if (activity == null) {
                        return;
                    }
                    final DialogHelper dialogHelper2 = new DialogHelper(activity);
                    String string = activity.getResources().getString(R.string.aliuser_SNS_cancel);
                    String string2 = activity.getResources().getString(R.string.aliuser_confirm);
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.taobao.android.sns4android.c.a.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                return;
                            }
                            BroadCastHelper.sendLoginFailBroadcast(703, rpcResponse.message);
                            dialogHelper2.dismissAlertDialog();
                        }
                    };
                    dialogHelper2.alert("", rpcResponse.message, string2, onClickListener, string, onClickListener);
                } else {
                    c.a(rpcResponse, str, "Other");
                    UserTrackAdapter.sendUT(str, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, String.valueOf(rpcResponse.code), b.a(sNSSignInAccount.snsType), LoginComponent.getProperties());
                    if (activity != null) {
                        ((SNSService) ServiceFactory.getService(SNSService.class)).toast(activity, str3);
                    }
                    BroadCastHelper.sendLoginFailBroadcast(rpcResponse.code, rpcResponse.message);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                if (activity != null) {
                    ((SNSService) ServiceFactory.getService(SNSService.class)).toast(activity, ResourceUtil.getNetworkError());
                }
                BroadCastHelper.sendLoginFailBroadcast(703, "exception");
            }
        }

        @Override // com.taobao.android.sns4android.g
        public void onCancel(Activity activity, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77c620a6", new Object[]{this, activity, str, str2});
                return;
            }
            Properties properties = LoginComponent.getProperties();
            if (TextUtils.isEmpty(str2)) {
                str2 = UTConstant.PageName.UT_PAGE_EXTEND;
            }
            UserTrackAdapter.sendUT(str2, "snsAuthCode_cancel", "", b.a(str), properties);
            BroadCastHelper.sendCancelBroadcast("701", "用户取消");
        }

        @Override // com.taobao.android.sns4android.g
        public void onError(Activity activity, String str, int i, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7321aa0b", new Object[]{this, activity, str, new Integer(i), str2, str3});
                return;
            }
            Properties properties = LoginComponent.getProperties();
            if (TextUtils.isEmpty(str3)) {
                str3 = UTConstant.PageName.UT_PAGE_EXTEND;
            }
            UserTrackAdapter.sendUT(str3, "snsAuthCode_failure", i + "", b.a(str), properties);
            if (activity != null && !activity.isFinishing()) {
                ((SNSService) ServiceFactory.getService(SNSService.class)).toast(activity, str2);
            }
            BroadCastHelper.sendLoginFailBroadcast(i, str2);
        }
    }

    public static void a(RpcResponse<LoginReturnData> rpcResponse, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e75419", new Object[]{rpcResponse, str, str2});
            return;
        }
        Properties properties = new Properties();
        properties.setProperty("result", str2);
        UserTrackAdapter.sendUT(str, "SNS_LoginResult", String.valueOf(rpcResponse != null ? rpcResponse.code : -1), properties);
    }

    private static boolean a(SNSPlatform sNSPlatform) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b7b5283f", new Object[]{sNSPlatform})).booleanValue() : TextUtils.equals(sNSPlatform.getPlatform(), SNSPlatform.PLATFORM_ALIPAY.getPlatform());
    }

    private static boolean d(SNSPlatform sNSPlatform) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b651f642", new Object[]{sNSPlatform})).booleanValue() : TextUtils.equals(sNSPlatform.getPlatform(), SNSPlatform.PLATFORM_ALIPAYHK.getPlatform());
    }
}
