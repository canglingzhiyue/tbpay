package com.taobao.login4android.constants;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class LoginUrlConstants {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ALIBABA_SCAN_PREFIX = "m.alibaba.com/qr?";
    private static final String BASE_URL = "//login.m.taobao.com";
    private static final String COMMON_SCAN_URL = "login.m.taobao.com/qrcodeCheck.htm?";
    private static final String COMMON_SCAN_URL_PRE = "login.wapa.taobao.com/qrcodeCheck.htm?";
    private static final String LOGIN_URLS = "((https|http)://)login.(m|wapa|waptest).(taobao|tmall).com/(login/){0,1}login.htm(.*);((https|http)://)login.tmall.com(.*);((https|http)://)login.taobao.com/member/login.jhtml(.*);(http|https)://login.(taobao|tmall).com/login/(.*);http://login.m.taobao.com/minisdk/login.htm;https://oauth.m.taobao.com/authorize";
    private static final String LOGOUT_URLS = "((https|http)://)login.(m|wapa|waptest).(taobao|tmall).com/(login/){0,1}logout.htm(.*)";
    private static final String SCAN_LOGIN = "/qrcodeLogin.htm?shortURL=";

    static {
        kge.a(706514827);
    }

    public static String getLoginUrls() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b3f90622", new Object[0]) : LOGIN_URLS;
    }

    public static String getLogoutUrls() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("150f33f5", new Object[0]) : LOGOUT_URLS;
    }

    public static String getScanLoginUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34850740", new Object[0]) : "//login.m.taobao.com/qrcodeLogin.htm?shortURL=";
    }

    public static boolean isAlibabaScanUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8cd515", new Object[]{str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return str.contains(ALIBABA_SCAN_PREFIX);
        }
        return false;
    }

    public static boolean isCommonScanUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e99c2f12", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        return str.contains(COMMON_SCAN_URL) || str.contains(COMMON_SCAN_URL_PRE);
    }
}
