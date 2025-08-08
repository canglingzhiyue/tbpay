package com.taobao.alimama.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.login.LoginManager;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.utils.ILoginInfoGetter;
import com.taobao.utils.LoginInfo;
import tb.dhe;
import tb.kge;

/* loaded from: classes.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1123600930);
    }

    public static void a(String str, String... strArr) {
        String str2;
        LoginInfo lastLoginUserInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{str, strArr});
            return;
        }
        ILoginInfoGetter a2 = LoginManager.a();
        String str3 = "";
        if (a2 == null || (lastLoginUserInfo = a2.getLastLoginUserInfo()) == null || !lastLoginUserInfo.isValid()) {
            str2 = str3;
        } else {
            str3 = lastLoginUserInfo.nickname;
            str2 = lastLoginUserInfo.userId;
        }
        TaoLog.Logi("AlimamaSdk", String.format("[step=%s,th=%s,ver=%s,user=%s,uid=%s,bkt=%s] args: %s", str, Thread.currentThread().getName(), "5.15.6", str3, str2, StringUtils.join(";", c.l()), StringUtils.join(",", strArr)));
        dhe.b().a(str, strArr);
        UserTrackLogs.trackDebugLog(str, strArr);
    }
}
