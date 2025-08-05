package com.uc.webview.base;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes9.dex */
public class SdkGlobalSettings {
    public static String CORE_DEX_PATH = "";

    /* loaded from: classes9.dex */
    public interface Interface {
        String get(int i);

        Map<Integer, String> getModified();

        boolean isAccessible(int i, String str);

        boolean set(int i, String str);
    }

    public static String[] getSdkSettingKeys() {
        return f.f23779a;
    }

    public static String getUniqueId() {
        return "12085d403764f3a90cc710b82d5e6799c48c800b";
    }

    public static boolean isAccessible(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return isAccessibleExactMatch(str, str2);
    }

    private static boolean isAccessibleExactMatch(String str, String str2) {
        for (String str3 : str2.split("\\^\\^")) {
            if (str.equals(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    public static Interface switchToCore(Interface r0) {
        return d.switchToCore(r0);
    }
}
