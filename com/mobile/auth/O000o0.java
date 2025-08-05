package com.mobile.auth;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.util.LoggingSPCache;

/* loaded from: classes4.dex */
class O000o0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int O000000o(int i) {
        return O0O0o00.O000000o("sso_config_xf", "maxFailedLogTimes", i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String O000000o(String str) {
        String O000000o = O0O0o00.O000000o("sso_config_xf", "config_host", (String) null);
        return TextUtils.isEmpty(O000000o) ? str : O000000o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean O000000o() {
        return System.currentTimeMillis() >= O0O0o00.O000000o("sso_config_xf", "client_valid", 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean O000000o(boolean z) {
        return "1".equals(O0O0o00.O000000o("sso_config_xf", "CLOSE_IPV4_LIST", !z ? "0" : "1"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int O00000Oo(int i) {
        return O0O0o00.O000000o("sso_config_xf", "pauseTime", i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String O00000Oo(String str) {
        String O000000o = O0O0o00.O000000o("sso_config_xf", "https_get_phone_scrip_host", (String) null);
        return TextUtils.isEmpty(O000000o) ? str : O000000o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean O00000Oo(boolean z) {
        return "1".equals(O0O0o00.O000000o("sso_config_xf", "CLOSE_IPV6_LIST", !z ? "0" : "1"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean O00000o(boolean z) {
        return O0O0o00.O000000o("sso_config_xf", "CLOSE_FRIEND_WAPKS", z ? "CU" : "").contains("CU");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String O00000o0(String str) {
        String O000000o = O0O0o00.O000000o("sso_config_xf", LoggingSPCache.STORAGE_LOGHOST, "");
        return TextUtils.isEmpty(O000000o) ? str : O000000o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean O00000o0(boolean z) {
        String str = !z ? "0" : "1";
        return "1".equals(O0O0o00.O000000o("sso_config_xf", "CLOSE_M008_APPID_LIST", str)) || "1".equals(O0O0o00.O000000o("sso_config_xf", "CLOSE_M008_SDKVERSION_LIST", str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean O00000oO(boolean z) {
        return O0O0o00.O000000o("sso_config_xf", "CLOSE_FRIEND_WAPKS", z ? "CT" : "").contains("CT");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean O00000oo(boolean z) {
        return "1".equals(O0O0o00.O000000o("sso_config_xf", "CLOSE_LOGS_VERSION", z ? "1" : "0"));
    }
}
