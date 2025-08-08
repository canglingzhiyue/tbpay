package com.taobao.android.sns4android.util;

import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.login.LoginFrom;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TokenType;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.nyk;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-149468160);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        return StringUtils.equals(nyk.KEY_SHARE_CONFIG_WEIXIN, str) ? LoginType.LocalLoginType.LOGIN_TYPE_WEIXIN : StringUtils.equals("qq", str) ? LoginType.LocalLoginType.LOGIN_TYPE_QQ : StringUtils.equals("wangyi_mail", str) ? LoginType.LocalLoginType.LOGIN_TYPE_NETEASE : str.toLowerCase() + TokenType.LOGIN;
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (LoginType.ServerLoginType.LoginTypeQQ.getType().equals(str)) {
            LoginFrom.setCurrentLoginFrom("3");
        } else if (LoginType.ServerLoginType.LoginTypeWeibo.getType().equals(str)) {
            LoginFrom.setCurrentLoginFrom("2");
        } else if (LoginType.ServerLoginType.LoginTypeWeixin.getType().equals(str)) {
            LoginFrom.setCurrentLoginFrom("1");
        } else if ("alipay".equals(str)) {
            LoginFrom.setCurrentLoginFrom("7");
        } else if (!LoginType.ServerLoginType.TaobaoSSOLogin.getType().equals(str)) {
        } else {
            LoginFrom.setCurrentLoginFrom("6");
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        return StringUtils.equals(nyk.KEY_SHARE_CONFIG_WEIXIN, str) ? LoginType.LocalLoginType.LOGIN_TYPE_WEIXIN : StringUtils.equals("qq", str) ? LoginType.LocalLoginType.LOGIN_TYPE_QQ : StringUtils.equals("alipay3", str) ? LoginType.LocalLoginType.LOGIN_TYPE_ALIPAY : str.toLowerCase() + TokenType.LOGIN;
    }
}
