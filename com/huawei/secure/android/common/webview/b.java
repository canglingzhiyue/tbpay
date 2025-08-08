package com.huawei.secure.android.common.webview;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.huawei.secure.android.common.util.LogsUtil;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes4.dex */
public class b {
    public static String a(String str) {
        if (StringUtils.isEmpty(str)) {
            LogsUtil.a("UriUtil", "url is null");
            return str;
        }
        try {
            if (URLUtil.isNetworkUrl(str)) {
                return new URL(str.replaceAll("[\\\\#]", "/")).getHost();
            }
            LogsUtil.b("UriUtil", "url don't starts with http or https");
            return "";
        } catch (MalformedURLException e) {
            LogsUtil.b("UriUtil", "getHostByURI error  MalformedURLException : " + e.getMessage());
            return "";
        }
    }

    public static boolean a(String str, String str2) {
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            Log.e("UriUtil", "isUrlHostSameWhitelist: url or host is null");
            return false;
        }
        return StringUtils.equals(a(str), b(str2));
    }

    public static boolean a(String str, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            LogsUtil.b("UriUtil", "whitelist is null");
            return false;
        }
        for (String str2 : strArr) {
            if (b(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static String b(String str) {
        if (!StringUtils.isEmpty(str)) {
            return !URLUtil.isNetworkUrl(str) ? str : a(str);
        }
        LogsUtil.a("UriUtil", "whiteListUrl is null");
        return null;
    }

    public static boolean b(String str, String str2) {
        String a2 = a(str);
        if (StringUtils.isEmpty(a2) || StringUtils.isEmpty(str2)) {
            LogsUtil.b("UriUtil", "url or whitelist is null");
            return false;
        }
        String b = b(str2);
        if (StringUtils.isEmpty(b)) {
            Log.e("UriUtil", "whitelist host is null");
            return false;
        } else if (b.equals(a2)) {
            return true;
        } else {
            if (a2.endsWith(b)) {
                try {
                    String substring = a2.substring(0, a2.length() - b.length());
                    if (substring.endsWith(".")) {
                        return substring.matches("^[A-Za-z0-9.-]+$");
                    }
                    return false;
                } catch (IndexOutOfBoundsException e) {
                    LogsUtil.b("UriUtil", "IndexOutOfBoundsException" + e.getMessage());
                } catch (Exception e2) {
                    LogsUtil.b("UriUtil", "Exception : " + e2.getMessage());
                    return false;
                }
            }
            return false;
        }
    }

    public static boolean b(String str, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            LogsUtil.b("UriUtil", "whitelist is null");
            return false;
        }
        for (String str2 : strArr) {
            if (a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            if (!str.contains("..") && !str.contains("@")) {
                if (!str2.equals(str)) {
                    if (!str.startsWith(str2 + "?")) {
                        if (!str.startsWith(str2 + "#")) {
                            if (!str2.endsWith("/")) {
                                return false;
                            }
                            if (Uri.parse(str).getPathSegments().size() - Uri.parse(str2).getPathSegments().size() == 1) {
                                return str.startsWith(str2);
                            }
                            return false;
                        }
                    }
                }
                return true;
            }
            Log.e("UriUtil", "url contains unsafe char");
        }
        return false;
    }

    public static boolean c(String str, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            LogsUtil.b("UriUtil", "whitelist is null");
            return false;
        }
        for (String str2 : strArr) {
            if (c(str, str2)) {
                return true;
            }
        }
        return false;
    }
}
