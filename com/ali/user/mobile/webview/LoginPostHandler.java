package com.ali.user.mobile.webview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ali.user.mobile.filter.LoginFilterCallback;
import com.ali.user.mobile.ui.WebConstant;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class LoginPostHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static LoginFilterCallback sCallback;

    static {
        kge.a(830701567);
    }

    public static void openPostPage(Context context, String str, boolean z, LoginFilterCallback loginFilterCallback) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5714f0fa", new Object[]{context, str, new Boolean(z), loginFilterCallback});
            return;
        }
        sCallback = loginFilterCallback;
        if (z) {
            intent = new Intent(context, TransparentWebViewActivity.class);
        } else {
            intent = new Intent(context, WebViewActivity.class);
        }
        intent.putExtra(WebConstant.WEBURL, str);
        intent.putExtra(WebConstant.WEB_POST_LOGIN, true);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}
