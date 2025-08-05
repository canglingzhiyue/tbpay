package com.uc.webview.export.extension;

import com.uc.webview.base.Log;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class WpkUtils {
    private static final String TAG = "WpkUtils";

    public static void commitWpkFile(String str, Map<String, String> map, String str2, String str3, String str4, String str5) {
        try {
            Sdk2CoreHost.impl().commitWpkFile(str, map, str2, str3, str4, str5);
        } catch (Throwable th) {
            Log.w(TAG, "commitWpkFile failed", th);
        }
    }

    public static void commitWpkRecord(String str, Map<String, String> map, String str2, String str3) {
        try {
            Sdk2CoreHost.impl().commitWpkRecord(str, map, str2, str3);
        } catch (Throwable th) {
            Log.w(TAG, "commitWpkRecord failed", th);
        }
    }

    public static JSONObject getWpkConfigs() {
        try {
            return Sdk2CoreHost.impl().getWpkConfigs();
        } catch (Throwable th) {
            Log.w(TAG, "getWpkConfigs failed", th);
            return null;
        }
    }

    public static void initWpk(Map<String, Object> map) {
        try {
            Sdk2CoreHost.impl().initWpk(map);
        } catch (Throwable th) {
            Log.w(TAG, "initWpk falied", th);
        }
    }

    public static void setWpkCallback(Map<String, Object> map) {
        try {
            Sdk2CoreHost.impl().setWpkCallback(map);
        } catch (Throwable th) {
            Log.w(TAG, "setWpkCallback falied", th);
        }
    }

    public static void setWpkCommonCustomFields(Map<String, String> map) {
        try {
            Sdk2CoreHost.impl().setWpkCommonCustomFields(map);
        } catch (Throwable th) {
            Log.w(TAG, "setWpkCommonCustomFields falied", th);
        }
    }

    public static void setWpkConfigs(JSONObject jSONObject) {
        try {
            Sdk2CoreHost.impl().setWpkConfigs(jSONObject);
        } catch (Throwable th) {
            Log.w(TAG, "setWpkConfigs failed", th);
        }
    }

    public static void setWpkCustomData(String str, String str2, Map<String, String> map) {
        try {
            Sdk2CoreHost.impl().setWpkCustomData(str, str2, map);
        } catch (Throwable th) {
            Log.w(TAG, "setWpkCustomData failed", th);
        }
    }

    public static boolean wpkShouldSample(String str, String str2, double d) {
        try {
            return Sdk2CoreHost.impl().wpkShouldSample(str, str2, d);
        } catch (Throwable th) {
            Log.w(TAG, "wpkShouldSample failed", th);
            return false;
        }
    }
}
