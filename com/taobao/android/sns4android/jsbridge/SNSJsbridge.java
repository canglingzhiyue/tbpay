package com.taobao.android.sns4android.jsbridge;

import android.app.Activity;
import android.content.Intent;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.SNSSignInAccount;
import com.ali.user.mobile.utils.BundleUtil;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.oauth.OauthService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.android.sns4android.c;
import com.taobao.android.sns4android.g;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.taobao.R;
import java.util.Properties;
import org.json.JSONObject;
import tb.nyk;

/* loaded from: classes6.dex */
public class SNSJsbridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int AUHT_UNINSTALL_CODE = 10011;
    public static final int AUTH_CANCEL_CODE = 1009;
    public static final String AUTH_CANCEL_MESSAGE = "用户取消(E_USER_CANCEL)";
    public static final int AUTH_FAIL_CODE = 10010;
    public static final String AUTH_FAIL_MESSAGE = "用户授权失败(E_USER_AUTH_FAIL)";
    public static final String AUTH_UNINSTALL_MESSAGE = "当前授权应用未安装";
    public static int PARAM_ERROR_CODE = 1003;
    public static String PARAM_ERROR_MESSAGE = "参数错误(E_PARAM_ERROR)";
    public static final int SNS_AUTH_NOT_INITED = 10012;
    public static g mWeixinListener;
    public WVCallBackContext mCallback;

    public static /* synthetic */ Object ipc$super(SNSJsbridge sNSJsbridge, String str, Object... objArr) {
        if (str.hashCode() == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(SNSJsbridge sNSJsbridge, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a9039b8", new Object[]{sNSJsbridge, str});
        } else {
            sNSJsbridge.afterCallback(str);
        }
    }

    public static /* synthetic */ void access$100(SNSJsbridge sNSJsbridge, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e6dd220", new Object[]{sNSJsbridge, new Integer(i), str});
        } else {
            sNSJsbridge.setErrorCallback(i, str);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("auth".equals(str)) {
            auth(str2, wVCallBackContext);
            return true;
        } else if (!"isAppAuthSupport".equals(str)) {
            return false;
        } else {
            isAppAuthSupport(str2, wVCallBackContext);
            return true;
        }
    }

    public synchronized void auth(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e1d6f6", new Object[]{this, str, wVCallBackContext});
            return;
        }
        this.mCallback = wVCallBackContext;
        try {
            JSONObject jSONObject = new JSONObject(str);
            final String string = jSONObject.getString("type");
            SNSPlatform convertSNSPlatform = SNSPlatform.convertSNSPlatform(string);
            if (convertSNSPlatform == null) {
                setErrorCallback(PARAM_ERROR_CODE, PARAM_ERROR_MESSAGE);
                return;
            }
            final Properties properties = new Properties();
            if (!TextUtils.isEmpty(string)) {
                properties.put("type", string);
            }
            Activity activity = (Activity) this.mContext;
            g gVar = new g() { // from class: com.taobao.android.sns4android.jsbridge.SNSJsbridge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.sns4android.g
                public void onSucceed(Activity activity2, SNSSignInAccount sNSSignInAccount) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8032b9ea", new Object[]{this, activity2, sNSSignInAccount});
                        return;
                    }
                    UserTrackAdapter.sendUT("SNSJsbridgeAuthSuccess", properties);
                    SNSJsbridge.mWeixinListener = null;
                    if (SNSJsbridge.this.mCallback != null) {
                        r rVar = new r();
                        rVar.a("authCode", sNSSignInAccount.token);
                        rVar.a("token", sNSSignInAccount.token);
                        rVar.a("userId", sNSSignInAccount.userId);
                        rVar.a("HY_SUCCESS");
                        SNSJsbridge.this.mCallback.success(rVar);
                    }
                    SNSJsbridge.access$000(SNSJsbridge.this, string);
                }

                @Override // com.taobao.android.sns4android.g
                public void onCancel(Activity activity2, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77c620a6", new Object[]{this, activity2, str2, str3});
                        return;
                    }
                    UserTrackAdapter.sendUT("SNSJsbridgeAuthCancel");
                    LoginTLogAdapter.e(ApiReferer.TAG, "auth jsbridge oncancel");
                    SNSJsbridge.mWeixinListener = null;
                    SNSJsbridge.access$100(SNSJsbridge.this, 1009, SNSJsbridge.AUTH_CANCEL_MESSAGE);
                    SNSJsbridge.access$000(SNSJsbridge.this, string);
                }

                @Override // com.taobao.android.sns4android.g
                public void onError(Activity activity2, String str2, int i, String str3, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7321aa0b", new Object[]{this, activity2, str2, new Integer(i), str3, str4});
                        return;
                    }
                    Properties properties2 = properties;
                    if (properties2 != null) {
                        properties2.setProperty("code", String.valueOf(i));
                    }
                    UserTrackAdapter.sendUT("SNSJsbridgeAuthFail", properties);
                    LoginTLogAdapter.e(ApiReferer.TAG, "auth jsbridge onError:" + i + "," + str3);
                    SNSJsbridge.mWeixinListener = null;
                    SNSJsbridge sNSJsbridge = SNSJsbridge.this;
                    if (TextUtils.isEmpty(str3)) {
                        str3 = SNSJsbridge.AUTH_FAIL_MESSAGE;
                    }
                    SNSJsbridge.access$100(sNSJsbridge, i, str3);
                    SNSJsbridge.access$000(SNSJsbridge.this, string);
                }
            };
            if (SNSPlatform.PLATFORM_WEIXIN == convertSNSPlatform) {
                mWeixinListener = gVar;
            }
            UserTrackAdapter.sendUT("SNSJsbridgeAuth");
            c.a(convertSNSPlatform, activity, gVar, jSONObject);
        } catch (Exception unused) {
            setErrorCallback(PARAM_ERROR_CODE, PARAM_ERROR_MESSAGE);
        }
    }

    private void afterCallback(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17c49212", new Object[]{this, str});
        } else if (!SNSPlatform.PLATFORM_ALIPAYHK.getPlatform().equals(str)) {
        } else {
            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_CLOSE_ALIPAY_RESULT);
        }
    }

    public synchronized void isAppAuthSupport(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988e533e", new Object[]{this, str, wVCallBackContext});
            return;
        }
        this.mCallback = wVCallBackContext;
        String string = new JSONObject(str).getString("type");
        if (SNSPlatform.convertSNSPlatform(string) == null) {
            setErrorCallback(PARAM_ERROR_CODE, PARAM_ERROR_MESSAGE);
        } else if (SNSPlatform.PLATFORM_ALIPAYHK.getPlatform().equals(string)) {
            setSuccessCallback(BundleUtil.isAppInstalled(this.mContext, SNSPlatform.PLATFORM_ALIPAYHK.getPackageName()));
        } else {
            Activity activity = (Activity) this.mContext;
            if (AliMemberSDK.getService(OauthService.class) != null) {
                if (nyk.KEY_SHARE_CONFIG_WEIXIN.equals(string)) {
                    string = "wechat";
                }
                setSuccessCallback(((OauthService) AliMemberSDK.getService(OauthService.class)).isAppAuthSurpport(activity, string));
                return;
            }
            setErrorCallback(10012, activity.getString(R.string.aliuser_SNS_platform_auth_not_init_ucc));
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        if (i == 11101) {
            c.a(SNSPlatform.PLATFORM_QQ, i, i2, intent);
        } else {
            c.a(SNSPlatform.PLATFORM_WEIBO, i, i2, intent);
            c.a(SNSPlatform.PLATFORM_WEIXIN, i, i2, intent);
            c.a(SNSPlatform.PLATFORM_ALIPAY, i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    private void setErrorCallback(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51af89b", new Object[]{this, new Integer(i), str});
        } else if (this.mCallback == null) {
        } else {
            r rVar = new r();
            rVar.a("code", Integer.valueOf(i));
            rVar.a("message", str);
            this.mCallback.error(rVar);
        }
    }

    private void setSuccessCallback(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c05c3a47", new Object[]{this, new Boolean(z)});
        } else if (this.mCallback == null) {
        } else {
            r rVar = new r();
            rVar.a("HY_SUCCESS");
            rVar.a("supported", Boolean.valueOf(z));
            this.mCallback.success(rVar);
        }
    }
}
