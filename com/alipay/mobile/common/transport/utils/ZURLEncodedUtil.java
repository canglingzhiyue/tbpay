package com.alipay.mobile.common.transport.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;

/* loaded from: classes3.dex */
public class ZURLEncodedUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ZURLEncodedUtil";

    public static String urlEncode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9986362a", new Object[]{str});
        }
        try {
            URL a2 = a(str);
            try {
                return UrlFixer.fixUrl(a2.toString());
            } catch (Throwable th) {
                if (a2 != null) {
                    str = a2.toString();
                }
                LogCatUtil.info(TAG, "New URI(" + str + ") exception " + th.toString());
                return a2.toString();
            }
        } catch (MalformedURLException e) {
            LogCatUtil.warn(TAG, "checkURL exception " + e.toString());
            return str;
        }
    }

    private static URL a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("2d42b423", new Object[]{str});
        }
        try {
            return new URL(str);
        } catch (Exception e) {
            LogCatUtil.warn(TAG, "new URL(" + str + ")  exception " + e.toString());
            try {
                str = URLDecoder.decode(str);
            } catch (Throwable th) {
                LogCatUtil.warn(TAG, "decode uri=" + str + ", exception " + th.toString());
            }
            return new URL(str);
        }
    }
}
