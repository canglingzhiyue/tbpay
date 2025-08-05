package com.taobao.login4android.biz.autologin;

import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.login.LoginDataRepository;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.DefaultLoginResponseData;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.rpc.login.model.WSecurityData;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.login.InternalTokenCallback;
import com.taobao.login4android.session.SessionManager;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class AutoLoginBusiness {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "loginsdk.AutoLoginBusiness";

    static {
        kge.a(-1345847605);
    }

    public static /* synthetic */ void access$000(InternalTokenCallback internalTokenCallback, RpcResponse rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15d1fd24", new Object[]{internalTokenCallback, rpcResponse});
        } else {
            failCallback(internalTokenCallback, rpcResponse);
        }
    }

    public RpcResponse<LoginReturnData> autoLogin(String str, String str2, int i, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcResponse) ipChange.ipc$dispatch("cb3b002d", new Object[]{this, str, str2, new Integer(i), new Boolean(z), str3}) : autoLogin(str, str2, i, str3);
    }

    public RpcResponse<LoginReturnData> autoLogin(String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcResponse) ipChange.ipc$dispatch("337742b5", new Object[]{this, str, str2, new Integer(i), str3});
        }
        AutoLoginParam autoLoginParam = new AutoLoginParam();
        autoLoginParam.token = str;
        autoLoginParam.userId = str2;
        autoLoginParam.site = i;
        autoLoginParam.apiRefer = str3;
        return autoLogin(autoLoginParam);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.ali.user.mobile.rpc.RpcResponse<com.ali.user.mobile.rpc.login.model.LoginReturnData> autoLogin(com.taobao.login4android.biz.autologin.AutoLoginParam r21) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.login4android.biz.autologin.AutoLoginBusiness.autoLogin(com.taobao.login4android.biz.autologin.AutoLoginParam):com.ali.user.mobile.rpc.RpcResponse");
    }

    public static void appendRefer(RpcResponse<LoginReturnData> rpcResponse, SessionManager sessionManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb301713", new Object[]{rpcResponse, sessionManager});
            return;
        }
        ApiReferer.Refer refer = new ApiReferer.Refer();
        refer.eventName = "autologinFailed";
        if (rpcResponse != null) {
            refer.errorCode = String.valueOf(rpcResponse.code);
        }
        sessionManager.appendEventTrace(JSON.toJSONString(refer));
    }

    public RpcResponse<LoginReturnData> oldLogin(String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcResponse) ipChange.ipc$dispatch("d86e772d", new Object[]{this, str, str2, new Integer(i), str3});
        }
        AutoLoginParam autoLoginParam = new AutoLoginParam();
        autoLoginParam.token = str;
        autoLoginParam.userId = "";
        autoLoginParam.site = i;
        autoLoginParam.apiRefer = str3;
        autoLoginParam.isOldLogin = true;
        autoLoginParam.tokenType = str2;
        return autoLogin(autoLoginParam);
    }

    public static void genUninstallToken(String str, final InternalTokenCallback internalTokenCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a728b82a", new Object[]{str, internalTokenCallback});
            return;
        }
        final LoginBaseParam loginBaseParam = new LoginBaseParam();
        loginBaseParam.maskMobile = str;
        SecurityGuardManagerWraper.getWSecurityData(new DataCallback<WSecurityData>() { // from class: com.taobao.login4android.biz.autologin.AutoLoginBusiness.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.DataCallback
            public /* synthetic */ void result(WSecurityData wSecurityData) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91402500", new Object[]{this, wSecurityData});
                } else {
                    a(wSecurityData);
                }
            }

            public void a(WSecurityData wSecurityData) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5b7e16", new Object[]{this, wSecurityData});
                    return;
                }
                LoginBaseParam loginBaseParam2 = LoginBaseParam.this;
                if (loginBaseParam2 != null) {
                    loginBaseParam2.wua = wSecurityData;
                }
                LoginDataRepository.getInstance().uninstallGenToken(LoginBaseParam.this, new RpcRequestCallback() { // from class: com.taobao.login4android.biz.autologin.AutoLoginBusiness.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.callback.RpcRequestCallback
                    public void onSuccess(RpcResponse rpcResponse) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                        } else if (rpcResponse instanceof DefaultLoginResponseData) {
                            internalTokenCallback.onSucess(((LoginReturnData) ((DefaultLoginResponseData) rpcResponse).returnValue).token);
                        } else {
                            AutoLoginBusiness.access$000(internalTokenCallback, rpcResponse);
                        }
                    }

                    @Override // com.ali.user.mobile.callback.RpcRequestCallback
                    public void onError(RpcResponse rpcResponse) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                        } else {
                            AutoLoginBusiness.access$000(internalTokenCallback, rpcResponse);
                        }
                    }
                });
            }
        });
    }

    private static void failCallback(InternalTokenCallback internalTokenCallback, RpcResponse rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751ea031", new Object[]{internalTokenCallback, rpcResponse});
        } else {
            internalTokenCallback.onFail(String.valueOf(rpcResponse.code), rpcResponse.message);
        }
    }

    public static void uninstallRelogin(String str, String str2, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c1fcc1", new Object[]{str, str2, rpcRequestCallback});
            return;
        }
        LoginBaseParam loginBaseParam = new LoginBaseParam();
        HashMap hashMap = new HashMap();
        hashMap.put("token", str);
        loginBaseParam.ext = hashMap;
        loginBaseParam.token = str2;
        loginBaseParam.site = DataProviderFactory.getDataProvider().getSite();
        LoginDataRepository.getInstance().uninstallRelogin(loginBaseParam, rpcRequestCallback);
    }

    public static void umidLogin(LoginBaseParam loginBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b745ae5", new Object[]{loginBaseParam, rpcRequestCallback});
        } else {
            LoginDataRepository.getInstance().umidLogin(loginBaseParam, rpcRequestCallback);
        }
    }
}
