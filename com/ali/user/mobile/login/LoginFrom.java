package com.ali.user.mobile.login;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class LoginFrom {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALIPAY = "7";
    public static final String OTHER = "10";
    public static final String PWD = "4";
    public static final String QQ = "3";
    public static final String REGISTER = "9";
    public static final String SMS = "5";
    public static final String TAOBAO = "6";
    public static final String WECHAT = "1";
    public static final String WEIBO = "2";
    private static String sCurrentLoginFrom;

    static {
        kge.a(142295365);
        sCurrentLoginFrom = "";
    }

    public static String getLoginFrom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ac96ef1c", new Object[0]) : sCurrentLoginFrom;
    }

    public static void setCurrentLoginFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21901b4d", new Object[]{str});
        } else {
            sCurrentLoginFrom = str;
        }
    }
}
