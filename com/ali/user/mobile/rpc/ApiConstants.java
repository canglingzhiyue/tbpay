package com.ali.user.mobile.rpc;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class ApiConstants {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public static class ApiField {
        public static final String ACTION_TYPE = "actionType";
        public static final String APDID = "apdId";
        public static final String API_REFERER = "apiReferer";
        public static final String API_VERSION = "apiVersion";
        public static final String APPKEY = "appKey";
        public static final String APP_VERSION = "appVersion";
        public static final String DEVICE_NAME = "deviceName";
        public static final String DEVICE_TOKEN_KEY = "deviceTokenKey";
        public static final String EXT = "ext";
        public static final String EXTRA = "extra";
        public static final String FROM_REGISTER_PAGE = "fromRegisterPage";
        public static final String FROM_SITE = "fromSite";
        public static final String H5_QUERY_STRING = "aliusersdk_h5querystring";
        public static final String HAVANAID = "havanaId";
        public static final String HID = "hid";
        public static final String INFO = "info";
        public static final String IV_TOKEN = "ivToken";
        public static final String LOCALE = "locale";
        public static final String LOGIN_INFO = "loginInfo";
        public static final String LOGIN_SIGN = "loginSign";
        public static final String MEMBER_ID = "memberId";
        public static final String MIID = "miid";
        public static final String MOBILE_CHECK_SIMILARITY = "mobileCheckSimilarity";
        public static final String RDS_INFO = "rdsInfo";
        public static final String REQUEST = "request";
        public static final String RISK_CONTROL_INFO = "riskControlInfo";
        public static final String RISK_INFO = "riskInfo";
        public static final String SCENE = "scene";
        public static final String SDK_TRACE_ID = "sdkTraceId";
        public static final String SDK_VERSION = "sdkVersion";
        public static final String SMS_LOGIN_REMIND_TIPS = "smsLoginRemindTips";
        public static final String SNS_LOGIN_INFO = "snsLoginInfo";
        public static final String SNS_TRUST_LOGIN_TOKEN = "snsTrustLoginToken";
        public static final String SSO_TOKEN_APPLY_REQUEST = "ssoTokenApplyRequest";
        public static final String TIMESTAMP = "timestamp";
        public static final String TOKEN_INFO = "tokenInfo";
        public static final String TRUST_LOGIN = "trustLogin";
        public static final String UMID_TOKEN = "umidToken";
        public static final String USER_ID = "userId";
        public static final String USER_INPUT_NAME = "userInputName";
        public static final String VERSION = "version";
        public static final String VERSION_1_0 = "1.0";
        public static final String VERSION_1_1 = "1.1";
        public static final String VERSION_2_0 = "2.0";
        public static final String WIRELESS_ENVM = "wirelessEnvm";

        static {
            kge.a(-148568675);
        }
    }

    /* loaded from: classes2.dex */
    public static class ApiName {
        public static final String ALIPAY_SSO_LOGIN = "mtop.taobao.havana.mlogin.alipayaso";
        public static final String API_CALLED_BEFORE_LOGIN_PAGE = "mtop.com.taobao.mloginService.prelogininfo";
        public static final String API_DYNAMIC_CODE_VERIFY = "mtop.taobao.mloginService.dynamicCodePopup";
        public static final String API_EMAIL_LOGNI = "mtop.taobao.mloginService.emailLogin";
        public static final String API_LOGIN_COUNTRY = "mtop.taobao.countryservice.country.get";
        public static final String API_LOGIN_SEND_SMS = "mtop.taobao.mloginService.smsSend";
        public static final String API_LOGIN_SEND_SMS_NICK = "mtop.taobao.mloginService.smsSend.nick";
        public static final String API_OVERSEA_GETSIMVERIFYURL = "mtop.taobao.mloginService.oversea.getSimVerifyUrl";
        public static final String API_OVERSEA_SIM_LOGIN = "mtop.taobao.mloginService.oversea.simLogin";
        public static final String API_SEND_EMAIL_CODE = "mtop.taobao.mloginService.emailSend";
        public static final String API_SIM_LOGIN = "mtop.taobao.mloginService.simLogin";
        public static final String API_SIM_MOBILE_LOGIN = "mtop.taobao.mloginService.simLogin.userinput";
        public static final String API_SMS_LOGIN = "mtop.taobao.mloginService.smsLogin";
        public static final String API_SMS_LOGIN_NICK = "mtop.taobao.mloginService.smsLogin.nick";
        public static final String APPLY_SSO_LOGIN = "com.taobao.mtop.mLoginTokenService.applySsoToken";
        public static final String APPLY_SSO_TOKEN_V2 = "com.taobao.mtop.mLoginTokenService.applySsoTokenV2";
        public static final String AUTO_LOGIN = "com.taobao.mtop.mLoginUnitService.autoLogin";
        public static final String BIOMETRIC_LOGIN = "mtop.taobao.mloginService.biometricLogin";
        public static final String CAN_CHANGE_NICK = "mtop.taobao.tbmpc.canChangeNick";
        public static final String COMMON_CANCEL_QRCODE = "mtop.taobao.commonuse.mloginService.canceledQrCode";
        public static final String COMMON_CONFIRM_QRCODE = "mtop.taobao.commonuse.mloginService.confirmedQrCode";
        public static final String COMMON_SCAN_QRCODE = "mtop.taobao.commonuse.mloginService.scanedQrCode";
        public static final String FETCH_LOING_SCAN_TOKEN = "mtop.taobao.mloginService.preScanFaceLogin";
        public static final String FINGER_CLOSE = "mtop.account.biometric.close";
        public static final String FINGER_OPEN = "mtop.account.biometric.open";
        public static final String GENERATE_URL = "mtop.taobao.sdk.genurl";
        public static final String GET_ALIPAY_COOKIES = "com.taobao.mtop.login.getAlipayCookies";
        public static final String GET_HAVANA_ACCOUNT_URL = "mtop.taobao.tbmpc.getSdkAccountCenterUrl";
        public static final String GET_LOGIN_FLOW = "mtop.taobao.mloginService.getLoginFlow";
        public static final String GET_URL_WITH_SESSION = "mtop.taobao.tbmpc.getSdkAccountCenterUrlWithSession";
        public static final String GET_WAP_LOGIN_COOKIES = "com.taobao.mtop.login.getWapLoginCookies";
        public static final String HAVANA_GEN_QR_CODE = "mtop.taobao.commonuse.mloginService.genQrCode";
        public static final String HAVANA_LOGIN_BY_QR_CODE = "mtop.taobao.commonuse.mloginService.qrcodelogin";
        public static final String IV_NONLOGIN_VERFIY = "mtop.alibaba.havanaappiv.nonloginverify.url";
        public static final String IV_VERFIY_URL = "mtop.alibaba.havanaappiv.verify.url";
        public static final String IV_VERIFY_ENV = "mtop.alibaba.havanaappiv.nonloginverify.url.withenv";
        public static final String LOGOUT = "mtop.taobao.havana.mlogin.logout";
        public static final String PW_LOGIN = "com.taobao.mtop.mloginService.login";
        public static final String REGISTER_INIT = "mtop.havana.register.sdk.country.get";
        public static final String SNS_LOGIN = "mtop.taobao.mloginService.snsLogin";
        public static final String TOKEN_LOGIN = "com.taobao.mtop.mloginService.mloginTokenLogin";
        public static final String UMID_TOKEN_LOGIN = "mtop.taobao.mloginService.uninstall.umidIvLogin";
        public static final String UNIFY_SSO_LOGIN = "mtop.com.taobao.mloginservice.unifyssotokenlogin";
        public static final String UNINSTALL_GEN_TOKEN = "mtop.taobao.mloginService.uninstall.gentoken";
        public static final String UNINSTALL_LOGIN = "mtop.taobao.mloginService.uninstall.tokenlogin";

        static {
            kge.a(133985672);
        }
    }

    /* loaded from: classes2.dex */
    public static class CodeGroup {
        public static final String PWD_CAN_ALIPAY = "pwdCanAlipay";
        public static final String PWD_CAN_FACE_ERROR = "pwdCanFace";
        public static final String PWD_CAN_SMS_ERROR = "pwdCanSms";
        public static final String PWD_ERROR = "pwdError";

        static {
            kge.a(-659469931);
        }
    }

    /* loaded from: classes2.dex */
    public static class ResultActionType {
        public static final String ALERT = "ALERT";
        public static final String ALERT_WITH_H5 = "ALERT_WITH_H5";
        public static final String FORCE_TOAST = "FORCE_TOAST";
        public static final String H5 = "H5";
        public static final String NOTIFY = "NOTIFY";
        public static final String SUCCESS = "SUCCESS";
        public static final String TOAST = "TOAST";
        public static final String TOKENLOGIN = "TOKENLOGIN";
        public static final String UCC_H5 = "UCC_H5";

        static {
            kge.a(-1120273366);
        }
    }

    /* loaded from: classes2.dex */
    public static class ResultCode {
        public static final int SESSION_EXPIRET = 14034;
        public static final int SUCCESS = 3000;

        static {
            kge.a(1725558535);
        }
    }

    static {
        kge.a(268712327);
    }

    public static boolean isAlertType(RpcResponse rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6598d9e", new Object[]{rpcResponse})).booleanValue();
        }
        if (rpcResponse == null) {
            return false;
        }
        return ResultActionType.ALERT.equals(rpcResponse.actionType) || ResultActionType.TOAST.equals(rpcResponse.actionType);
    }
}
