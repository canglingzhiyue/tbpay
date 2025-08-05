package com.ali.user.mobile.login;

import java.util.Map;

/* loaded from: classes2.dex */
public interface CommonUICallback {
    public static final int ACTION_HANDLE_SEND_EMAIL_SUCCESS = 5009;
    public static final int ACTION_HANDLE_SEND_SMS_SUCCESS = 5008;
    public static final int ACTION_JUMP_ALIPAY = 5003;
    public static final int ACTION_JUMP_FACE = 5002;
    public static final int ACTION_JUMP_OTHER_LOGIN_METHOD = 5004;
    public static final int ACTION_JUMP_SMS = 5001;
    public static final int ACTION_ONEKEY_HANDLE_TOKEN_ERROR = 5006;
    public static final int ACTION_ONEKEY_SEND_SMS = 5007;
    public static final int ACTION_PWD_ERROR_SHOW_EYE = 5005;
    public static final int ACTION_REG_ONEKEY_FAIL_TO_SMS = 6003;
    public static final int ACTION_REG_SEND_SMS = 6002;
    public static final int ACTION_REG_SEND_SMS_SUCCESS = 6001;

    void onResult(int i, Map<String, Object> map);
}
