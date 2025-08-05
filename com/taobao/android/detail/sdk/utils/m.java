package com.taobao.android.detail.sdk.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLEncoder;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-159888960);
        tpc.a("com.taobao.android.detail.sdk.utils.UrlUtils");
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            return null;
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return trim;
        }
        String trim2 = str2.trim();
        String trim3 = str3.trim();
        if (TextUtils.isEmpty(trim2) || TextUtils.isEmpty(trim3)) {
            return trim;
        }
        StringBuilder sb = new StringBuilder(trim);
        try {
            sb.append(a(trim));
            sb.append(URLEncoder.encode(trim2, "UTF-8"));
            sb.append("=");
            sb.append(URLEncoder.encode(trim3, "UTF-8"));
            return sb.toString();
        } catch (Exception unused) {
            return trim;
        }
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        char charAt = str.charAt(str.length() - 1);
        return ('?' == charAt || '&' == charAt) ? "" : str.indexOf("?") >= 0 ? "&" : "?";
    }
}
