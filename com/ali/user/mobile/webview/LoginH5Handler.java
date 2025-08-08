package com.ali.user.mobile.webview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.filter.LoginFilterCallback;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.navigation.NavigatorServiceImpl;
import com.ali.user.mobile.ui.WebConstant;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class LoginH5Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static LoginFilterCallback sCallback;

    static {
        kge.a(-672839566);
    }

    public static void openUrl(Context context, UrlParam urlParam, boolean z, LoginFilterCallback loginFilterCallback) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0231a0d", new Object[]{context, urlParam, new Boolean(z), loginFilterCallback});
            return;
        }
        sCallback = loginFilterCallback;
        if (z) {
            intent = new Intent(context, TransparentWebViewActivity.class);
        } else {
            intent = new Intent(context, WebViewActivity.class);
        }
        NavigatorServiceImpl.addData(urlParam, intent);
        if (!StringUtils.isEmpty(urlParam.token)) {
            intent.putExtra("token", urlParam.token);
        }
        if (!StringUtils.isEmpty(urlParam.scene)) {
            intent.putExtra("scene", urlParam.scene);
        }
        intent.putExtra(WebConstant.WEBURL, urlParam.url);
        intent.putExtra(WebConstant.WEB_CALLBACK, true);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}
