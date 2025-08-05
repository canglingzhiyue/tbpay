package com.taobao.login4android.membercenter.account.adapter;

import android.text.TextUtils;
import com.ali.user.mobile.rpc.login.model.SessionModel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import tb.kge;

/* loaded from: classes7.dex */
public class AccountHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1535092137);
    }

    public static boolean isCurrentLoginUser(SessionModel sessionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5655d0e", new Object[]{sessionModel})).booleanValue();
        }
        if (sessionModel != null) {
            return TextUtils.equals(Login.getUserId(), String.valueOf(sessionModel.userId));
        }
        return false;
    }
}
