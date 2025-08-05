package com.ali.user.mobile.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.kge;

/* loaded from: classes2.dex */
public class LoginNavUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_LARGESCREENSTYLE = "largescreenstyle";
    private static final String ORANGE_LARGESCREENSTYLE_VAL = "login_largescreenstyle";
    public static final String TAG = "login.AddressNavUtils";
    private static final String VAL_FULLSCREEN = "fullscreen";
    private static final String VAL_SPLIT = "split";

    static {
        kge.a(-897721167);
    }

    public static String preHandleUri(Context context, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e709a16", new Object[]{context, str});
        }
        try {
            String str3 = "largescreenstyle=" + OrangeConfig.getInstance().getConfig("login4android", ORANGE_LARGESCREENSTYLE_VAL, "fullscreen");
            if (str.contains("?")) {
                str2 = str + "&" + str3;
            } else {
                str2 = str + "?" + str3;
            }
            str = str2;
            AdapterForTLog.logd(TAG, "preHandleUri " + str);
            return str;
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "preHandleUri error dump", th);
            return str;
        }
    }
}
