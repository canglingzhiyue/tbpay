package com.ali.user.mobile.utils;

import tb.kge;

/* loaded from: classes2.dex */
public class Constants {
    public static final String AUTH_TYPE = "authType";
    public static final String FROM_REGIST_KEY = "from_register";
    public static final String RESET_LOGIN_STATUS = "NOTIFY_LOGIN_STATUS_RESET";

    /* loaded from: classes2.dex */
    public enum AuthType {
        BIND_AUTH("bindAuth");
        
        private String authType;

        AuthType(String str) {
            this.authType = str;
        }

        public String getAuthType() {
            return this.authType;
        }
    }

    static {
        kge.a(-999400663);
    }
}
