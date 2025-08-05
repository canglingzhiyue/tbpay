package com.taobao.android.sns4android.alipay2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.utils.ResourceUtil;
import com.alipay.auth.mobile.api.IAlipayAuthEventHandler;
import com.alipay.auth.mobile.exception.AlipayAuthIllegalArgumentException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.ToastUtil;
import java.util.HashMap;
import java.util.Properties;
import tb.qqw;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Activity activity, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd62bd7", new Object[]{activity, loginParam});
            return;
        }
        Intent intent = new Intent();
        intent.setData(Uri.parse(new StringBuilder("alipayhk://platformapi/startapp?appId=2060090000351786").toString()));
        if (activity.getPackageManager().queryIntentActivities(intent, 0).size() <= 0) {
            return;
        }
        intent.setFlags(268468224);
        try {
            activity.startActivity(intent);
            Properties properties = new Properties();
            properties.setProperty("monitor", "T");
            UserTrackAdapter.sendUT(loginParam == null ? UTConstant.PageName.UT_PAGE_EXTEND : loginParam.utPageName, UTConstant.CustomEvent.UT_SSO_AUTHCODE_COMMIT, "", LoginType.LocalLoginType.LOGIN_TYPE_ALIPAY_HK, properties);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15320a6", new Object[]{intent});
        } else if (LoginContext.alipayHkCallback == null) {
        } else {
            if (intent != null || intent.getData() != null) {
                Uri data = intent.getData();
                try {
                    String queryParameter = data.getQueryParameter("resultStatus");
                    new HashMap().put("resultStatus", queryParameter);
                    UserTrackAdapter.sendUT("handleAlipayHKIntent");
                    if ("9000".equals(queryParameter)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("authCode", data.getQueryParameter("authCode"));
                        LoginContext.alipayHkCallback.onSuccess(hashMap);
                    } else if ("4000".equals(queryParameter)) {
                        LoginContext.alipayHkCallback.onFail(qqw.d, "auth canceled");
                    } else {
                        LoginContext.alipayHkCallback.onFail(qqw.c, "auth failed");
                    }
                    return;
                } catch (Throwable unused) {
                    LoginContext.alipayHkCallback.onFail(qqw.b, "alipayHK intent is null or invalid");
                    return;
                }
            }
            LoginContext.alipayHkCallback.onFail(qqw.b, "alipayHK intent is null or invalid");
        }
    }

    public static void a(Activity activity, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bf6be2", new Object[]{activity, str, str2, str3, str4});
            return;
        }
        try {
            DataProviderFactory.getDataProvider().setAlipaySsoDesKey(str);
            a.a().b().openAlipayAuth(activity, str, str2, str3, str4);
            Properties properties = new Properties();
            properties.setProperty("monitor", "T");
            UserTrackAdapter.sendUT(d.f15252a == null ? UTConstant.PageName.UT_PAGE_EXTEND : d.f15252a.utPageName, UTConstant.CustomEvent.UT_SSO_AUTHCODE_COMMIT, "", LoginType.LocalLoginType.ASO_LOGIN, properties);
            LoginContext.sSSOAuthCodeStartTime = System.currentTimeMillis();
        } catch (Throwable th) {
            th.printStackTrace();
            Properties properties2 = new Properties();
            properties2.setProperty("code", th.getMessage() + "");
            UserTrackAdapter.sendUT(UTConstant.CustomEvent.UT_ALIPAY_SSO_EXCEPTION, properties2);
            ToastUtil.showToast(activity, ResourceUtil.getStringById("aliuser_network_error"), 0);
        }
    }

    public static boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{intent})).booleanValue();
        }
        try {
            return a.a().b().isAlipayAuthCallBack(intent);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void a(Intent intent, IAlipayAuthEventHandler iAlipayAuthEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13606e9b", new Object[]{intent, iAlipayAuthEventHandler});
        } else if (!a(intent)) {
        } else {
            try {
                a.a().b().handleIntent(intent, iAlipayAuthEventHandler);
            } catch (AlipayAuthIllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }
}
