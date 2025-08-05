package com.ali.user.mobile.login.model;

import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.app.dataprovider.StringOrangeResult;
import com.ali.user.mobile.utils.LanguageUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import tb.kge;

/* loaded from: classes2.dex */
public class LoginConstant {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACCOUNT = "account";
    public static final String ACTION_CONTINUELOGIN = "continueLogin";
    public static final String ALIUSER_LOGIN_SITE = "AliUser_loginSite";
    public static final String APPLAUNCH_INFO = "applaunch_info";
    public static final String CHANGE_ACCOUNT_AUTOLOGIN_TOKEN = "AliuserChangeAccount_autologin_token";
    public static final String CHANGE_ACCOUNT_FLAG = "AliuserChangeAccount";
    public static final String CHANGE_ACCOUNT_USER_ID = "AliuserChangeAccount_UserId";
    public static final String CURRENT_LOGIN_MODE_STATE = "current_login_mode_state";
    public static final String EXT_ACTION = "_ap_action";
    public static final String FETCH_IV_FAIL_CANCEL = "USER_CANCEL";
    public static final int FETCH_IV_FAIL_CANCEL_CODE = -5;
    public static final String FETCH_IV_FAIL_INVALID_RETURNVALUE = "INVALID_RETURNVALUE";
    public static final int FETCH_IV_FAIL_INVALID_RETURNVALUE_CODE = -4;
    public static final String FETCH_IV_FAIL_INVALID_SCENE = "INVALID_SCENE";
    public static final int FETCH_IV_FAIL_INVALID_SCENE_CODE = -3;
    public static final String FETCH_IV_FAIL_INVALID_USERID = "INVALID_USERID";
    public static final int FETCH_IV_FAIL_INVALID_USERID_CODE = -2;
    public static final String FETCH_IV_FAIL_NULL_RESPONSE = "RET_NULL";
    public static final int FETCH_IV_FAIL_NULL_RESPONSE_CODE = -1;
    public static final String FETCH_TOKEN_FAIL_AUTO_LOGIN_FAIL = "AUTO_LOGIN_FAIL";
    public static final String FETCH_TOKEN_FAIL_EXCEPTION = "CAUSE_EXCEPTION";
    public static final String FETCH_TOKEN_FAIL_NOT_SESSION_INVALID = "NET_FETCH_TOKEN_FAIL_NOT_SESSION_INVALID";
    public static final String FETCH_TOKEN_FAIL_NULL_RESPONSE = "RET_NULL";
    public static final String FETCH_TOKEN_FAIL_SESSION_INVALID = "SessionInValid";
    public static String FILE_NAME = null;
    public static final String FIND_ACCOUNT_URL = "https://passport.taobao.com/ac/h5/nick_find.htm?from_site=0&lang=zh_CN&app_name=tb";
    public static final String FORCE_HIDE_ALL = "force_hide_all_fragment";
    public static final String FORCE_NORMAL_MODE = "forceNormalMode";
    public static final String FORCE_NOT_FACE = "forNotFaceMode";
    public static final String FORCE_OPEN_LOGIN = "forceOpenLoginView";
    public static final String FORM_ADD_ACCOUNT = "fromAddAccount";
    public static final String HELP_URL_OVERSEA = "https://ai.alimebot.taobao.com/intl/index.htm?from=ObiAjGcaIU";
    public static final String HELP_URL_OVERSEA_EN = "https://ai.alimebot.taobao.com/intl/index.htm?from=PymP9x3Mxm";
    public static final String ICBU_IV_SKIP = "showSkipButton";
    public static final String LAUCNH_MOBILE_LOGIN_FRAGMENT_LABEL = "launchMobileLoginFragment";
    public static final String LAUCNH_USER_LOGIN_FRAGMENT_LABEL = "launchLoginFragment";
    public static final String LAUNCH_PASS_GUIDE_FRAGMENT = "launchPassGuideFragment";
    public static final String LAUNCH_PASS_QR_FRAGMENT = "launchPassQrFragment";
    public static final String LAUNCH_PASS_SIM = "launchPassSimFragment";
    public static final String LAUNCH_SNS_TO_SMS_FRAGMENT = "launchSnsToSmsFragment";
    public static final String LOGINPARAM = "key_loginParam";
    public static final String LOGIN_BUNDLE_UNIFY_SSO_TOKEN = "unifySsoToken";
    public static final String LOGIN_ENTRANCE = "login_entrance";
    public static final String LOGIN_TYPE = "login_type";
    public static final String LOGIN_TYPE_FINGERPRINT = "fingerprintLogin";
    public static final String LOGIN_TYPE_KEY = "login_type";
    public static final String OUTTER_LOGIN_TOKEN = "outter_login_token";
    public static final String OUTTER_LOGIN_TOKEN_TYPE = "outter_login_token_type";
    public static final int RESULT_WINDVANE_CLOSEALL = 721;
    public static final int RESULT_WINDWANE_CLOSEW = 720;
    public static final String SCAN_KEY = "key_scanParam";
    public static final String SCAN_SCENE = "key_scanScene";
    public static final String START_TIME = "startTime";
    public static final String SUPPORT_OVERSEA_SIMLOGIN = "supportOverseaSimLogin";
    public static final String TAOBAO_HELP_URL = "https://passport.taobao.com/ac/h5/ihelp_center.htm?fromSite=0";
    public static final String TAOBAO_HELP_URLpre = "https://passportpre.taobao.com/ac/h5/ihelp_center.htm?fromSite=0";
    public static final String TARGET_HID = "targetHid";
    public static final String UMID_TOKEN = "umidLoginToken";
    public static final String WINDVANE = "windvane";

    static {
        kge.a(243924441);
        FILE_NAME = "getAppLaunch_first";
    }

    public static String getHelpUrlOversea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76f48136", new Object[0]);
        }
        String language = LanguageUtil.getLanguage();
        boolean isChineseLanguage = LanguageUtil.isChineseLanguage();
        return LoginSwitch.getConfig("oversea_help_" + language, isChineseLanguage ? HELP_URL_OVERSEA : HELP_URL_OVERSEA_EN);
    }

    public static String getHelpUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88e2dbc1", new Object[0]);
        }
        StringOrangeResult helpLink = DataProviderFactory.getOrangeConfig().helpLink();
        if (helpLink.orangeExist) {
            return helpLink.value;
        }
        return DataProviderFactory.getDataProvider().getEnvType() == 2 ? TAOBAO_HELP_URLpre : TAOBAO_HELP_URL;
    }
}
