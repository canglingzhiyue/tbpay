package com.taobao.login4android.session.cookies;

import mtopsdk.common.util.StringUtils;
import android.webkit.CookieManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.search.common.util.k;
import tb.kge;

/* loaded from: classes7.dex */
public class LoginCookieUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final char COMMA = ',';
    private static final String DOMAIN = "domain";
    private static final char EQUAL = '=';
    private static final String EXPIRES = "expires";
    private static final String HTTPS = "https";
    private static final String HTTP_ONLY = "httponly";
    private static final int HTTP_ONLY_LENGTH;
    private static final String MAX_AGE = "max-age";
    private static final int MAX_COOKIE_LENGTH = 4096;
    private static final String PATH = "path";
    private static final char PERIOD = '.';
    private static final char QUOTATION = '\"';
    private static final String SECURE = "secure";
    private static final int SECURE_LENGTH;
    private static final char SEMICOLON = ';';
    private static final String TAG = "login.LoginCookieUtils";
    private static final char WHITE_SPACE = ' ';

    static {
        kge.a(-1532065285);
        SECURE_LENGTH = 6;
        HTTP_ONLY_LENGTH = 8;
    }

    public static LoginCookie parseCookie(String str) {
        int indexOf;
        String str2;
        int indexOf2;
        int indexOf3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginCookie) ipChange.ipc$dispatch("48958327", new Object[]{str});
        }
        int length = str.length();
        int i = 0;
        while (true) {
            if (i < 0 || i >= length) {
                break;
            }
            char c = ' ';
            if (str.charAt(i) != ' ') {
                int indexOf4 = str.indexOf(59, i);
                char c2 = EQUAL;
                int indexOf5 = str.indexOf(61, i);
                LoginCookie loginCookie = new LoginCookie();
                if ((indexOf4 != -1 && indexOf4 < indexOf5) || indexOf5 == -1) {
                    if (indexOf4 == -1) {
                        indexOf4 = length;
                    }
                    loginCookie.name = str.substring(i, indexOf4);
                    loginCookie.value = null;
                    indexOf = indexOf4;
                } else {
                    loginCookie.name = str.substring(i, indexOf5);
                    if (indexOf5 >= length - 1 || str.charAt(indexOf5 + 1) != '\"' || (i = str.indexOf(34, indexOf5 + 2)) != -1) {
                        indexOf = str.indexOf(59, i);
                        if (indexOf == -1) {
                            indexOf = length;
                        }
                        if (indexOf - indexOf5 > 4096) {
                            int i2 = indexOf5 + 1;
                            loginCookie.value = str.substring(i2, i2 + 4096);
                        } else {
                            int i3 = indexOf5 + 1;
                            if (i3 == indexOf || indexOf < indexOf5) {
                                loginCookie.value = "";
                            } else {
                                loginCookie.value = str.substring(i3, indexOf);
                            }
                        }
                    }
                }
                while (indexOf >= 0 && indexOf < length) {
                    if (str.charAt(indexOf) != c && str.charAt(indexOf) != ';') {
                        if (str.charAt(indexOf) != ',') {
                            int i4 = length - indexOf;
                            int i5 = SECURE_LENGTH;
                            if (i4 >= i5 && str.substring(indexOf, i5 + indexOf).equalsIgnoreCase(SECURE)) {
                                indexOf += SECURE_LENGTH;
                                loginCookie.secure = true;
                                if (indexOf == length) {
                                    break;
                                } else if (str.charAt(indexOf) == c2) {
                                    indexOf++;
                                }
                            } else {
                                int i6 = HTTP_ONLY_LENGTH;
                                if (i4 >= i6 && str.substring(indexOf, i6 + indexOf).equalsIgnoreCase(HTTP_ONLY)) {
                                    indexOf += HTTP_ONLY_LENGTH;
                                    loginCookie.httpOnly = true;
                                    if (indexOf == length) {
                                        break;
                                    } else if (str.charAt(indexOf) == c2) {
                                        indexOf++;
                                    }
                                } else {
                                    int indexOf6 = str.indexOf(c2, indexOf);
                                    if (indexOf6 > 0) {
                                        String lowerCase = str.substring(indexOf, indexOf6).toLowerCase();
                                        if (lowerCase.equals("expires") && (indexOf3 = str.indexOf(44, indexOf6)) != -1 && indexOf3 - indexOf6 <= 10) {
                                            indexOf = indexOf3 + 1;
                                        }
                                        int indexOf7 = str.indexOf(59, indexOf);
                                        int indexOf8 = str.indexOf(44, indexOf);
                                        if (indexOf7 == -1 && indexOf8 == -1) {
                                            indexOf7 = length;
                                        } else {
                                            if (indexOf7 != -1) {
                                                if (indexOf8 != -1) {
                                                    indexOf8 = Math.min(indexOf7, indexOf8);
                                                }
                                            }
                                            indexOf7 = indexOf8;
                                        }
                                        try {
                                            String substring = str.substring(indexOf6 + 1, indexOf7);
                                            if (substring.length() > 2 && substring.charAt(0) == '\"' && (indexOf2 = substring.indexOf(34, 1)) > 0) {
                                                substring = substring.substring(1, indexOf2);
                                            }
                                            str2 = substring;
                                        } catch (Throwable th) {
                                            th.printStackTrace();
                                        }
                                        if (lowerCase.equals("expires")) {
                                            try {
                                                loginCookie.expires = HttpDateTime.parse(str2);
                                            } catch (IllegalArgumentException e) {
                                                LoginTLogAdapter.e(TAG, "illegal format for expires: " + str2, e);
                                            }
                                            indexOf = indexOf7;
                                        } else if (lowerCase.equals(MAX_AGE)) {
                                            try {
                                                long currentTimeMillis = System.currentTimeMillis();
                                                long parseLong = Long.parseLong(str2);
                                                Long.signum(parseLong);
                                                loginCookie.expires = currentTimeMillis + (parseLong * 1000);
                                            } catch (NumberFormatException e2) {
                                                LoginTLogAdapter.e(TAG, "illegal format for max-age: " + str2, e2);
                                            }
                                            indexOf = indexOf7;
                                        } else {
                                            if (lowerCase.equals("path")) {
                                                if (str2.length() > 0) {
                                                    loginCookie.path = str2;
                                                }
                                            } else if (lowerCase.equals("domain")) {
                                                int lastIndexOf = str2.lastIndexOf(46);
                                                if (lastIndexOf == 0) {
                                                    loginCookie.domain = null;
                                                } else {
                                                    try {
                                                        Integer.parseInt(str2.substring(lastIndexOf + 1));
                                                    } catch (NumberFormatException unused) {
                                                        String lowerCase2 = str2.toLowerCase();
                                                        if (lowerCase2.charAt(0) != '.') {
                                                            lowerCase2 = '.' + lowerCase2;
                                                        }
                                                        loginCookie.domain = lowerCase2;
                                                    }
                                                }
                                            }
                                            indexOf = indexOf7;
                                        }
                                        th.printStackTrace();
                                        indexOf = indexOf7;
                                    } else {
                                        indexOf = length;
                                    }
                                }
                            }
                        } else {
                            break;
                        }
                    } else {
                        indexOf++;
                    }
                    c = ' ';
                    c2 = EQUAL;
                }
                return loginCookie;
            }
            i++;
        }
        return null;
    }

    public static void expiresCookies(LoginCookie loginCookie) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb4dc99b", new Object[]{loginCookie});
            return;
        }
        Long l = 1000L;
        loginCookie.expires = l.longValue();
    }

    public static String getHttpDomin(LoginCookie loginCookie) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2dc590d7", new Object[]{loginCookie}) : getHttpDomin(loginCookie, false);
    }

    public static String getHttpDomin(LoginCookie loginCookie, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e2aaef5", new Object[]{loginCookie, new Boolean(z)});
        }
        String str = loginCookie.domain;
        if (!StringUtils.isEmpty(str) && str.startsWith(".")) {
            str = str.substring(1);
        }
        return k.HTTPS_PREFIX + str;
    }

    public static String getValue(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4afea14", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            String cookie = cookieManager.getCookie("https://.taobao.com");
            if (!StringUtils.isEmpty(cookie)) {
                for (String str2 : cookie.split(";")) {
                    String[] split2 = str2.split("=");
                    if (split2.length >= 2 && str.equals(split2[0].trim())) {
                        int indexOf = str2.indexOf("=");
                        if (split2.length == 2) {
                            return split2[1].trim();
                        }
                        return str2.substring(indexOf + 1);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
