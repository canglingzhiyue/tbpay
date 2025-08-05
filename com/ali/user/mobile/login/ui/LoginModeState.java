package com.ali.user.mobile.login.ui;

import com.ali.user.mobile.model.LoginType;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
public enum LoginModeState {
    LOCATION(8, 0, 8, 8, R.string.aliuser_common_ok, 8, "", "chooseother_location"),
    SMS_LOGIN(0, R.string.aliuser_login_sms_login, 8, 8, R.string.aliuser_signup_verification_getCode, 8, LoginType.LocalLoginType.SMS_LOGIN, "chooseother_sms"),
    PASSWORD(8, R.string.aliuser_login_pwd_login, 0, 0, R.string.aliuser_sign_in_title, 8, LoginType.LocalLoginType.PWD_LOGIN, "chooseother_pwd"),
    SCAN_FACE(8, R.string.aliuser_scan_login_text, 8, 8, R.string.aliuser_scan_login_text, 8, LoginType.LocalLoginType.SCAN_FACE_LOGIN, "chooseother_face"),
    SIM_LOGIN(0, R.string.aliuser_onekey_history_button_text, 8, 8, R.string.aliuser_onekey_history_button_text, 0, LoginType.LocalLoginType.SIM_LOGIN, "chooseother_onekey"),
    BIOMETRIC(8, R.string.aliuser_finger_button_text, 8, 8, R.string.aliuser_finger_button_text, 8, LoginType.LocalLoginType.BIO_LOGIN, "chooseother_bio"),
    EMAIL_PASSWORD(8, R.string.aliuser_oversea_email_pwd_login, 0, 0, R.string.aliuser_sign_in_title, 8, LoginType.LocalLoginType.PWD_LOGIN, "chooseother_pwd"),
    EMAIL_REG_LOGIN(8, R.string.aliuser_oversea_email_reg, 8, 0, R.string.aliuser_reg_instant, 8, "emailLogin", "chooseother_email_reg"),
    EMAIL_CODE_LOGIN(8, R.string.aliuser_email_button_text, 8, 0, R.string.aliuser_email_button_text, 8, "emailLogin", "chooseother_email");
    
    public final String controllName;
    public final String localLoginType;
    public final int loginBtnText;
    public final int loginModeName;
    public final int passwordVisibility;
    public final int protocolVisibility;
    public final int regionTVVisibility;
    public final int rightFuncTVVisibility;

    LoginModeState(int i, int i2, int i3, int i4, int i5, int i6, String str, String str2) {
        this.regionTVVisibility = i;
        this.loginModeName = i2;
        this.rightFuncTVVisibility = i3;
        this.passwordVisibility = i4;
        this.loginBtnText = i5;
        this.protocolVisibility = i6;
        this.localLoginType = str;
        this.controllName = str2;
    }

    public static LoginModeState parse(String str) {
        LoginModeState loginModeState = LOCATION;
        try {
            return valueOf(str);
        } catch (Exception e) {
            e.printStackTrace();
            return loginModeState;
        }
    }
}
