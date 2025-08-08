package com.alibaba.aliweex.bundle;

import android.net.Uri;
import android.taobao.windvane.config.p;
import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.WXLogUtils;
import tb.kge;

/* loaded from: classes2.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_GROUP_URL_CHECK_SWITCH = "url_check_switch";
    public static final String CONFIG_GROUP_WEEX_BLACKURL_GROUP = "weex_config_render_black_urls";
    public static final String CONFIG_GROUP_WEEX_WHITEURL_GROUP = "weex_config_render_white_urls";
    public static final String CONFIG_GROUP_WEEX_WHITE_SCHEME_GROUP = "weex_config_render_white_schema";
    public static final String CONFIG_KEY_IS_CHECK = "is_check";
    public static final String CONFIG_KEY_IS_RENDER = "is_render";
    public static final String CONFIG_KEY_WEEX_BLACKURL = "blackurl";
    public static final String CONFIG_KEY_WEEX_WHITEURL = "whiteurl";
    public static final String CONFIG_KEY_WEEX_WHITE_SCHEME = "white_schema";

    static {
        kge.a(-1786251063);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        if (StringUtils.isEmpty(str2)) {
            WXLogUtils.d("checkUrl expectedUrls is empty true");
            return false;
        }
        WXLogUtils.d("checkUrl hostUrl is " + str + "expectedUrls is " + str2);
        if (str2.startsWith("*")) {
            return str.endsWith(str2.substring(1));
        }
        return str.equals(str2);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            WXLogUtils.e(WXLogUtils.getStackTrace(th));
        }
        if (StringUtils.isEmpty(str)) {
            WXLogUtils.d("urlHost is empty");
            return false;
        }
        com.alibaba.aliweex.e l = com.alibaba.aliweex.d.a().l();
        if (l == null) {
            return false;
        }
        String config = l.getConfig(CONFIG_GROUP_WEEX_BLACKURL_GROUP, CONFIG_KEY_WEEX_BLACKURL, "");
        if (StringUtils.isEmpty(config)) {
            return false;
        }
        String[] split = config.split(",");
        if (split != null && split.length != 0) {
            for (String str2 : split) {
                if (!StringUtils.isEmpty(str2) && a(str, str2)) {
                    return true;
                }
            }
            return false;
        }
        WXLogUtils.d("expectedUrls is empty");
        return false;
    }

    public static boolean b(String str) {
        com.alibaba.aliweex.e l;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            WXLogUtils.e(WXLogUtils.getStackTrace(th));
        }
        if (StringUtils.isEmpty(str) || (l = com.alibaba.aliweex.d.a().l()) == null) {
            return false;
        }
        String config = l.getConfig(CONFIG_GROUP_WEEX_WHITEURL_GROUP, CONFIG_KEY_WEEX_WHITEURL, "*.m.taobao.com,xilivr.ewszjk.m.jaeapp.com,luckygiftphp.ewszjk.m.jaeapp.com,xuan.ews.m.jaeapp.com");
        if (!StringUtils.isEmpty(config) && (split = config.split(",")) != null && split.length != 0) {
            for (String str2 : split) {
                if (!StringUtils.isEmpty(str2) && a(str, str2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean c(String str) {
        com.alibaba.aliweex.e l;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            WXLogUtils.e(WXLogUtils.getStackTrace(th));
        }
        if (StringUtils.isEmpty(str) || (l = com.alibaba.aliweex.d.a().l()) == null) {
            return false;
        }
        String config = l.getConfig(CONFIG_GROUP_WEEX_WHITE_SCHEME_GROUP, CONFIG_KEY_WEEX_WHITE_SCHEME, "");
        if (StringUtils.isEmpty(config) || (split = config.split(",")) == null || split.length == 0) {
            return false;
        }
        String str2 = null;
        try {
            str2 = Uri.parse(str).getScheme();
        } catch (Throwable unused) {
        }
        boolean z = !StringUtils.isEmpty(str2);
        for (String str3 : split) {
            if (!StringUtils.isEmpty(str3)) {
                if (z) {
                    if (StringUtils.equals(str3, str2)) {
                        return true;
                    }
                } else {
                    if (str.startsWith(str3 + HttpConstant.SCHEME_SPLIT)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue();
        }
        if (p.e(str)) {
            return false;
        }
        String str2 = null;
        try {
            str2 = g(str);
        } catch (Throwable th) {
            WXLogUtils.e(WXLogUtils.getStackTrace(th));
        }
        if (a(str2)) {
            return false;
        }
        if (!p.a(str) && !StringUtils.isEmpty(str2) && !b(str2)) {
            return c(str);
        }
        return true;
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{str})).booleanValue();
        }
        com.alibaba.aliweex.e l = com.alibaba.aliweex.d.a().l();
        if (l != null) {
            boolean booleanValue = Boolean.valueOf(l.getConfig(CONFIG_GROUP_URL_CHECK_SWITCH, CONFIG_KEY_IS_CHECK, "")).booleanValue();
            boolean booleanValue2 = Boolean.valueOf(l.getConfig(CONFIG_GROUP_URL_CHECK_SWITCH, CONFIG_KEY_IS_RENDER, "")).booleanValue();
            if (booleanValue) {
                if (p.e(str)) {
                    return false;
                }
                String str2 = null;
                try {
                    str2 = g(str);
                } catch (Throwable th) {
                    WXLogUtils.e(WXLogUtils.getStackTrace(th));
                }
                if (a(str2)) {
                    return false;
                }
                if (p.a(str) || StringUtils.isEmpty(str2) || b(str2) || c(str)) {
                    return true;
                }
                return booleanValue2;
            }
        }
        return true;
    }

    private static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14a6f7e8", new Object[]{str});
        }
        String str2 = null;
        try {
            str2 = Uri.parse(str).getHost();
        } catch (Throwable unused) {
        }
        if (!StringUtils.isEmpty(str2) || StringUtils.isEmpty(str) || !str.startsWith("/")) {
            return str2;
        }
        String substring = str.substring(1);
        while (substring.startsWith("/")) {
            substring = substring.substring(1);
        }
        try {
            return Uri.parse(com.taobao.search.common.util.k.HTTPS_PREFIX + substring).getHost();
        } catch (Throwable unused2) {
            return str2;
        }
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{str})).booleanValue();
        }
        com.alibaba.aliweex.e l = com.alibaba.aliweex.d.a().l();
        if (l != null) {
            boolean booleanValue = Boolean.valueOf(l.getConfig(CONFIG_GROUP_URL_CHECK_SWITCH, CONFIG_KEY_IS_CHECK, "")).booleanValue();
            boolean booleanValue2 = Boolean.valueOf(l.getConfig(CONFIG_GROUP_URL_CHECK_SWITCH, CONFIG_KEY_IS_RENDER, "")).booleanValue();
            if (booleanValue && !p.e(str) && !d(str) && booleanValue2) {
                return true;
            }
        }
        return false;
    }
}
