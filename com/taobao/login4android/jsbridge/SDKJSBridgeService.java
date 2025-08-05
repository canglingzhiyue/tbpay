package com.taobao.login4android.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.helper.LoginDataHelper;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.login.service.impl.UserLoginServiceImpl;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.DefaultLoginResponseData;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.service.UIService;
import com.ali.user.mobile.ui.WebConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.d;
import com.taobao.login4android.log.LoginTLogAdapter;
import org.json.JSONException;
import org.json.JSONObject;
import tb.riy;

/* loaded from: classes7.dex */
public class SDKJSBridgeService extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG = "Login.SDKJSBridge";

    public static /* synthetic */ Object ipc$super(SDKJSBridgeService sDKJSBridgeService, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(SDKJSBridgeService sDKJSBridgeService, WVCallBackContext wVCallBackContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32f8ccf", new Object[]{sDKJSBridgeService, wVCallBackContext, str, str2});
        } else {
            sDKJSBridgeService.failCallback(wVCallBackContext, str, str2);
        }
    }

    public static void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        try {
            q.a("SDKJSBridgeService", (Class<? extends e>) SDKJSBridgeService.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        String str3 = "execute() called with: action = [" + str + "], params = [" + str2 + "], callback = [" + wVCallBackContext + riy.ARRAY_END_STR;
        if ("help".equals(str)) {
            setHelp(wVCallBackContext, str2);
        } else if (WebConstant.SHOW_SKIP_MENU.equals(str)) {
            showSkipMenu(wVCallBackContext, str2);
        } else if (!"testAccountSsoLogin".equals(str)) {
            return false;
        } else {
            testSsoLogin(wVCallBackContext, str2);
        }
        return true;
    }

    private void paramErrorCallback(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7beb5924", new Object[]{this, wVCallBackContext});
        } else if (wVCallBackContext == null) {
        } else {
            paramError(wVCallBackContext);
        }
    }

    public synchronized void testSsoLogin(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792415a", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String str2 = (String) jSONObject.get("action");
                String str3 = (String) jSONObject.get("token");
                if (!TextUtils.isEmpty(str3) && "testAccountSso".equals(str2)) {
                    LoginParam loginParam = new LoginParam();
                    loginParam.token = str3;
                    loginParam.site = DataProviderFactory.getDataProvider().getSite();
                    try {
                        UserLoginServiceImpl.getInstance().unifySsoTokenLogin(loginParam, new RpcRequestCallback() { // from class: com.taobao.login4android.jsbridge.SDKJSBridgeService.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.ali.user.mobile.callback.RpcRequestCallback
                            public void onSuccess(RpcResponse rpcResponse) {
                                String str4;
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                                } else if (rpcResponse != null && rpcResponse.returnValue != 0 && rpcResponse.code == 3000) {
                                    LoginDataHelper.processLoginReturnData(true, (LoginReturnData) ((DefaultLoginResponseData) rpcResponse).returnValue);
                                    r rVar = new r();
                                    rVar.a("HY_SUCCESS");
                                    WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                                    if (wVCallBackContext2 == null) {
                                        return;
                                    }
                                    wVCallBackContext2.success(rVar);
                                } else {
                                    int i = -1;
                                    if (rpcResponse != null) {
                                        i = rpcResponse.code;
                                        str4 = rpcResponse.message;
                                    } else {
                                        str4 = "Error";
                                    }
                                    WVCallBackContext wVCallBackContext3 = wVCallBackContext;
                                    if (wVCallBackContext3 == null) {
                                        return;
                                    }
                                    SDKJSBridgeService.access$000(SDKJSBridgeService.this, wVCallBackContext3, str4, String.valueOf(i));
                                }
                            }

                            @Override // com.ali.user.mobile.callback.RpcRequestCallback
                            public void onError(RpcResponse rpcResponse) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                                } else {
                                    onSuccess(rpcResponse);
                                }
                            }
                        });
                    } catch (Exception unused) {
                        paramErrorCallback(wVCallBackContext);
                    }
                }
                return;
            } catch (JSONException unused2) {
                paramErrorCallback(wVCallBackContext);
                return;
            }
        }
        paramErrorCallback(wVCallBackContext);
    }

    private void paramError(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d93f2bf", new Object[]{this, wVCallBackContext});
            return;
        }
        r rVar = new r();
        rVar.a("HY_PARAM_ERR");
        wVCallBackContext.error(rVar);
    }

    private void failCallback(WVCallBackContext wVCallBackContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34fa1c5b", new Object[]{this, wVCallBackContext, str, str2});
            return;
        }
        r rVar = new r();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", str);
            jSONObject.put("code", str2);
        } catch (Exception unused) {
        }
        rVar.a(jSONObject);
        rVar.a("HY_FAILED");
        wVCallBackContext.error(rVar);
    }

    public synchronized void setHelp(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a903611", new Object[]{this, wVCallBackContext, str});
        } else {
            requestHelp(wVCallBackContext, str);
        }
    }

    public void requestHelp(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb06b17e", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (wVCallBackContext == null) {
            LoginTLogAdapter.e("Login.SDKJSBridge", "Callback is null");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ((UIService) ServiceFactory.getService(UIService.class)).switchWebViewTitleBarRightButton(this.mContext, true, (String) new JSONObject(str).get("key1"));
            r rVar = new r();
            rVar.a("success");
            wVCallBackContext.success(rVar);
        } catch (JSONException unused) {
            paramError(wVCallBackContext);
        }
    }

    public void showSkipMenu(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eada52e9", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (wVCallBackContext == null) {
            LoginTLogAdapter.e("Login.SDKJSBridge", "Callback is null");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            new JSONObject(str);
            ((UIService) ServiceFactory.getService(UIService.class)).switchWebViewTitleBarRightButton(this.mContext, true, d.CLOSE_TYPE_SKIP);
            r rVar = new r();
            rVar.a("success");
            wVCallBackContext.success(rVar);
        } catch (JSONException unused) {
            paramError(wVCallBackContext);
        }
    }
}
