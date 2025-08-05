package com.ali.user.mobile.app.constant;

import android.text.TextUtils;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TokenType;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class UTConstant {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public static class Args {
        public static final String UT_ADD_MONITOR = "monitor";
        public static final String UT_CONTINUE_LOGIN = "continueLogin";
        public static final String UT_EMAIL_REG = "emailLogin";
        public static final String UT_ERROR_CODE = "code";
        public static final String UT_MOBILE_REG = "mobileRegister";
        public static final String UT_ONEKEY_REG = "oneKeyRegister";
        public static final String UT_PROPERTY_SUCCESS = "is_success";
        public static final String UT_SITE = "site";
        public static final String UT_SMS_TO_LOGIN = "LoginToReg";
        public static final String UT_SOURCE = "source";
        public static final String UT_SUCCESS_F = "F";
        public static final String UT_SUCCESS_NONE = "NONE";
        public static final String UT_SUCCESS_T = "T";
        public static final String UT_TYPE = "type";

        static {
            kge.a(-217026935);
        }
    }

    /* loaded from: classes2.dex */
    public static class CustomEvent {
        public static final String CLOSE_BIO_C = "close_bio_commit";
        public static final String CLOSE_BIO_F = "close_bio_failure";
        public static final String CLOSE_BIO_S = "close_bio_success";
        public static final String FINGER_TOKEN_COMMIT = "bio_verify_commit";
        public static final String FINGER_TOKEN_FAIL = "bio_verify_failure";
        public static final String FINGER_TOKEN_SUCCESS = "bio_verify_success";
        public static final String OPEN_BIO_C = "open_bio_commit";
        public static final String OPEN_BIO_F = "open_bio_failure";
        public static final String OPEN_BIO_S = "open_bio_success";
        public static final String UT_ALIPAY_SSO_APDID_NULL = "alipay_sso_apdid_null";
        public static final String UT_ALIPAY_SSO_EXCEPTION = "alipay_sso_exception";
        public static final String UT_FACE_SDK_COMMIT = "rpsdk_commit";
        public static final String UT_FACE_SDK_FAIL = "rpsdk_failure";
        public static final String UT_FACE_SDK_SUCCESS = "rpsdk_success";
        public static final String UT_GET_FACELOGIN_TOKEN_COMMIT = "get_faceLogin_token_commit";
        public static final String UT_GET_FACELOGIN_TOKEN_FAIL = "get_faceLogin_token_failure";
        public static final String UT_GET_FACELOGIN_TOKEN_SUCCESS = "get_faceLogin_token_success";
        public static final String UT_LOGIN_ACTION = "loginAction";
        public static final String UT_LOGIN_FAIL = "loginRpc_failure";
        public static final String UT_LOGIN_RPC = "loginRpc_commit";
        public static final String UT_LOGIN_SUCCESS = "loginRpc_success";
        public static final String UT_LOGIN_TO_H5_CANCEL = "login_h5_handle_cancel";
        public static final String UT_LOGIN_TO_H5_COMMIT = "login_h5_handle_commit";
        public static final String UT_LOGIN_TO_H5_CONTINUE_LOGIN = "loginH5_action_continuelogin";
        public static final String UT_LOGIN_TO_H5_QUIT = "loginH5_quit";
        public static final String UT_LOGIN_TO_H5_SUCCESS = "login_h5_handle_success";
        public static final String UT_LOGIN_TO_H5_TRUST_LOGIN = "loginH5_action_trustlogin";
        public static final String UT_NETWORK_FAIL = "NetworkFailure";
        public static final String UT_OVERSEA_LOGIN_CLICK = "supportOverseaSimLogin";
        public static final String UT_OVERSEA_LOGIN_REQUESTBY4G_FAIL = "reqSimVerifyUrlFail";
        public static final String UT_OVERSEA_LOGIN_REQUESTBY4G_START = "reqSimVerifyUrl";
        public static final String UT_OVERSEA_LOGIN_REQUESTBY4G_SUCCESS = "reqSimVerifyUrlSuccess";
        public static final String UT_OVERSEA_LOGIN_SHOW = "showOverseaUI";
        public static final String UT_SINGLE_LOGIN_CANCEL = "single_login_cancel";
        public static final String UT_SINGLE_LOGIN_COMMIT = "single_login_commit";
        public static final String UT_SINGLE_LOGIN_FAILURE = "single_login_failure";
        public static final String UT_SINGLE_LOGIN_SUCCESS = "single_login_success";
        public static final String UT_SSO_AUTHCODE_CANCEL = "ssoAuthCode_cancel";
        public static final String UT_SSO_AUTHCODE_COMMIT = "ssoAuthCode_commit";
        public static final String UT_SSO_AUTHCODE_FAILURE = "ssoAuthCode_failure";
        public static final String UT_SSO_AUTHCODE_SUCCESS = "ssoAuthCode_success";
        public static final String UT_TYPE_SMS_LOGIN_TO_REG = "SMSReg";

        static {
            kge.a(-481534339);
        }
    }

    /* loaded from: classes2.dex */
    public static class PageName {
        public static final String UT_KEY_PAGE_NAME = "ut_key_page_name";
        public static final String UT_PAGE_ALIPAY_TRUST_LOGIN = "Page_AlipayTrustLogin";
        public static final String UT_PAGE_EXTEND = "Page_Account_Extend";
        public static final String UT_PAGE_FIRST_LOGIN = "Page_Login1";
        public static final String UT_PAGE_HISTORY_LOGIN = "Page_Login3";
        public static final String UT_PAGE_LOGIN_BAR = "Page_Login5";
        public static final String UT_PAGE_PWD_LOGIN0 = "Page_Login0";
        public static final String UT_PAGE_SMS_LOGIN0 = "Page_SMSLogin0";
        public static final String UT_PAGE_SMS_LOGIN1 = "Page_SMSLogin1";
        public static final String UT_PAGE_SMS_LOGIN2 = "Page_SMSLogin2";
        public static final String UT_PAGE_SMS_LOGIN3 = "Page_SMSLogin3";
        public static final String UT_PAGE_SMS_OVERSEA = "Page_SMSLogin_Oversea";

        static {
            kge.a(-1829021338);
        }
    }

    static {
        kge.a(257467288);
    }

    public static String getLoginTypeByTraceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1875ed3", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith(LoginType.LocalLoginType.SCAN_FACE_LOGIN)) {
                return LoginType.LocalLoginType.SCAN_FACE_LOGIN;
            }
            if (str.startsWith(LoginType.LocalLoginType.SMS_LOGIN)) {
                return LoginType.LocalLoginType.SMS_LOGIN;
            }
            if (str.startsWith(LoginType.LocalLoginType.NICK_SMS_LOGIN)) {
                return LoginType.LocalLoginType.NICK_SMS_LOGIN;
            }
            if (str.startsWith(LoginType.LocalLoginType.PWD_LOGIN)) {
                return LoginType.LocalLoginType.PWD_LOGIN;
            }
            if (str.startsWith("oneKeyLogin")) {
                return LoginType.LocalLoginType.SIM_LOGIN;
            }
            if (str.startsWith(LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN)) {
                return LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN;
            }
            if (str.startsWith(LoginType.LocalLoginType.ASO_LOGIN)) {
                return str.toLowerCase().contains("alipaytrustlogin") ? LoginType.LocalLoginType.ALIPAY_TRUST_LOGIN : LoginType.LocalLoginType.ASO_LOGIN;
            } else if (str.startsWith(LoginType.LocalLoginType.LOGIN2REGISTER_LOGIN)) {
                return LoginType.LocalLoginType.LOGIN2REGISTER_LOGIN;
            } else {
                if (str.startsWith(Args.UT_MOBILE_REG)) {
                    return Args.UT_MOBILE_REG;
                }
                if (str.startsWith("oneKeyRegister")) {
                    return "oneKeyRegister";
                }
                if (str.startsWith(LoginType.LocalLoginType.RETRIVE_PWD_LOGIN)) {
                    return LoginType.LocalLoginType.RETRIVE_PWD_LOGIN;
                }
                try {
                    return str.split("_")[0];
                } catch (Throwable unused) {
                }
            }
        }
        return "";
    }

    public static String getLoginTypeByTokenType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f840ae0", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.equals(str, TokenType.TAOBAO_SSO)) {
                return LoginType.LocalLoginType.SSO_LOGIN;
            }
            if (TextUtils.equals(str, TokenType.ALIPAY_SSO)) {
                return LoginType.LocalLoginType.ASO_LOGIN;
            }
        }
        return "";
    }
}
