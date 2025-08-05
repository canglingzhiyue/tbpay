package com.alipay.security.mobile.cache;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AuthenticatorModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FILE_NAME = "iotauth.biometric.authticator.model";
    private static final String KEY_ALIPAY_UID = "alipay_user_id";
    private static final String KEY_FP_CLIENT_STATUS = "ifaa_client_status_";

    public static void saveClientStatus(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dacbaf3b", new Object[]{context, str, str2});
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            saveUserIdTemp(context, str2);
            CacheUtils cacheUtils = CacheUtils.getInstance(context, FILE_NAME);
            cacheUtils.addToLocalData(KEY_FP_CLIENT_STATUS + str2, str);
            CacheUtils cacheUtils2 = CacheUtils.getInstance(context, FILE_NAME);
            cacheUtils2.pushToPref(KEY_FP_CLIENT_STATUS + str2, str);
        }
    }

    public static String getClientStatus(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f388b272", new Object[]{context});
        }
        String tempUserId = getTempUserId(context);
        if (TextUtils.isEmpty(tempUserId)) {
            return "2";
        }
        CacheUtils cacheUtils = CacheUtils.getInstance(context, FILE_NAME);
        String localData = cacheUtils.getLocalData(KEY_FP_CLIENT_STATUS + tempUserId);
        return TextUtils.isEmpty(localData) ? "2" : localData;
    }

    public static void saveUserIdTemp(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc96334", new Object[]{context, str});
            return;
        }
        CacheUtils.getInstance(context, FILE_NAME).addToLocalData("alipay_user_id", str);
        CacheUtils.getInstance(context, FILE_NAME).pushToPref("alipay_user_id", str);
    }

    public static String getTempUserId(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3fda30cf", new Object[]{context}) : CacheUtils.getInstance(context, FILE_NAME).getLocalData("alipay_user_id");
    }
}
