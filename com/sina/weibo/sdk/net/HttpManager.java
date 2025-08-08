package com.sina.weibo.sdk.net;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import tb.kge;

/* loaded from: classes4.dex */
public class HttpManager {
    static {
        kge.a(-474574017);
        System.loadLibrary("weibosdkcore");
    }

    public static String a(Context context, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (!StringUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (!StringUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        if (!StringUtils.isEmpty(str3)) {
            sb.append(str3);
        }
        return calcOauthSignNative(context, sb.toString(), str4);
    }

    private static native String calcOauthSignNative(Context context, String str, String str2);
}
