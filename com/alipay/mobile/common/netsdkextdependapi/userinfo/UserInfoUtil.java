package com.alipay.mobile.common.netsdkextdependapi.userinfo;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class UserInfoUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final String getLastUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bfdd2dc7", new Object[0]) : UserInfoManagerFactory.getInstance().getDefaultBean().getLastUserId();
    }

    public static boolean login() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("99739774", new Object[0])).booleanValue() : UserInfoManagerFactory.getInstance().getDefaultBean().login();
    }
}
