package com.ali.user.mobile.webview;

import android.content.Context;
import com.ali.user.mobile.filter.LoginFilterCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.membercenter.account.AccountListComponent;
import tb.kge;

/* loaded from: classes2.dex */
public class LoginAgreementHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static LoginFilterCallback sCallback;

    static {
        kge.a(-1376880307);
    }

    public static void openAgreement(Context context, LoginFilterCallback loginFilterCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d9deff9", new Object[]{context, loginFilterCallback});
            return;
        }
        sCallback = loginFilterCallback;
        AccountListComponent.showAgreement(context);
    }
}
