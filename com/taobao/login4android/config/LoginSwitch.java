package com.taobao.login4android.config;

import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.info.AppInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.orange.OrangeConfig;
import tb.kge;

/* loaded from: classes.dex */
public class LoginSwitch {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACCS_LOGIN_SWITCH = "accs_login_switch";
    public static final String ADD_MULTI_TAG = "add_multi";
    public static int ADD_MULTI_TAG_DEFAULT = 0;
    public static final String ALIPAY_SSO_SWITCH = "alipay_sso_switch";
    public static final String BIND_ALIPAY_SWITCH = "bind_alipay_switch";
    public static final String CLEAR_COOKIE_WHEN_AUTOLOGIN = "clear_cookie_when_autologin";
    public static final String CONFIG_GROUP_LOGIN = "login4android";
    public static final String ENABLE_FIND_PASSWORD = "enable_find_password";
    public static final String ENABLE_HELP = "enable_help";
    public static final String ENABLE_REGISTER = "enable_register";
    public static final String ENABLE_UPDATE_UT = "enable_update_ut_account";
    public static final String EXTRA_PREFECT = "extra_prefetch";
    public static final String FINGER_ORANGE = "finger_percent";
    public static final int FINGER_PERCENT = 10000;
    public static final String FIRE_APP_LAUNCH = "fire_app_launch";
    public static final String FORBID_LOGIN_FROM_BACKGROUND = "forbid_login_from_background_new";
    public static final String FORCE_SID_CHECK = "force_sid_check";
    public static final String HELP_LINK = "help_link";
    public static final String MAX_HISTORY_NUM = "max_history_account_num";
    public static final String MAX_SESSION_NUM = "multi_account_num";
    public static final String MEMBER_AUTH_URL = "memberAuthUrl";
    public static final String MEMBER_AUTH_USE_H5_PERCENT = "isMemberAuthUseH5";
    public static final int MULTI_DEFAULT = 10000;
    public static final String NEED_KEEP_SGCOOKIE_IN_CHANGE_ACCOUNT = "need_keep_sgcookie_in_change_account";
    public static final String NEW_LOGOUT_BROADCAST_SWITCH = "new_logout_broadcast_switch";
    public static final String ONEKEY_LOGIN_HISTORY_PERCENT = "recommend_login_hiatory_percent";
    public static final String ONEKEY_LOGIN_PERCENT = "onekey_login_percent_v2";
    public static final String ONEKEY_REGISTER_PERCENT = "onekey_register_percent";
    public static final String OPEN_ADAPTER_PAD_AND_FOLD = "open_adapter_pad_and_fold";
    public static final String OPEN_LOGIN_PAGE_WHEN_IS_LOGIN = "openLoginPageWhenIsLogin";
    public static final String OPEN_LOGIN_PAGE_WHEN_IS_LOGIN_Default = "true";
    public static final String PROTOCOL = "custom_protocol";
    public static final String PWD_ERROR_TO_ALIPAY = "pwd2alipay";
    public static final int PWD_ERROR_TO_ALIPAY_PERCENT = 10000;
    public static final String REFRESH_COOKIE_DEGRADE_SWITCH = "refresh_cookie_degrade";
    public static final String REGISTER_ONEKEY_WAIT = "register_onekey_wait";
    public static final String REGISTER_TV = "register_tv";
    public static final int REGITER_ONEKEY_WAIT_DEFAULT = 3000;
    public static final String REG_TO_LOGIN_SENDSMS = "reg_to_login_sendsms";
    public static final String RMD_TO_ONEKEY = "recommend_to_onekey";
    public static final String RPC_TIMEOUT_MS = "rpc_request_timeout_ms";
    public static final String SECURITY_SETTING_URL = "securitySettingUrl";
    public static final String SECURITY_SETTING_USE_H5_PERCENT = "isSecuritySettingUseH5";
    public static final String SIM_LOGIN_AUTO = "auto_sim";
    public static final String SMS_CHECK = "sms_check";
    public static final String SUPPORT_FACE_LOGIN = "support_face_login";
    public static final String SUPPORT_FINGERPRINT_LOGIN = "support_fingerprint_login";
    public static final String SUPPORT_MINI_PROGRAME = "support_mini_program";
    public static final String SUPPORT_NUM_AUTH = "enableNumAuthService";
    public static final String SUPPORT_OVERSEA_SIMLOGIN = "support_oversea_simlogin";
    public static final String SWITCH_VALUE_FALSE = "false";
    public static final String SWITCH_VALUE_TRUE = "true";
    public static final String TAG = "login.LoginSwitch";
    public static final String WEAK_REFERENCE_HOME_ACT = "weak_reference_home_act";
    public static final String clearAutoLoginWhenClearSession = "clearAutologinWhenClearSession";

    static {
        kge.a(1247062158);
        ADD_MULTI_TAG_DEFAULT = 10000;
    }

    public static boolean getSwitch(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d7f2a49", new Object[]{str, str2})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("login4android", str, str2);
            LoginTLogAdapter.e(TAG, "LoginSwitch:getSwitch, switchName=" + str + ", value=" + config);
            return Boolean.parseBoolean(config);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static int getSwitch(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c25e11b", new Object[]{str, new Integer(i)})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return i;
        }
        try {
            OrangeConfig orangeConfig = OrangeConfig.getInstance();
            String config = orangeConfig.getConfig("login4android", str, i + "");
            LoginTLogAdapter.e(TAG, "LoginSwitch:getSwitch, switchName=" + str + ", value=" + config);
            return Integer.parseInt(config);
        } catch (Throwable th) {
            th.printStackTrace();
            return i;
        }
    }

    public static boolean isInABTestRegion(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fd5c6b40", new Object[]{str, new Integer(i)})).booleanValue() : Math.abs(AppInfo.getInstance().getUtdid().hashCode()) % 10000 < getSwitch(str, i);
    }

    public static String getConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{str, str2});
        }
        if (StringUtils.isEmpty(str)) {
            return str2;
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("login4android", str, str2);
            LoginTLogAdapter.e(TAG, "LoginSwitch:getConfig, confighName=" + str + ", value=" + config);
            return config;
        } catch (Throwable th) {
            th.printStackTrace();
            return str2;
        }
    }
}
