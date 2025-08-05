package com.taobao.login4android.membercenter.security;

import android.content.Context;
import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.helper.INavHelper;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.ServiceFactory;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class NavUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1844091976);
    }

    public static void navTo(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.contains("?")) {
            str2 = str + "&";
        } else {
            str2 = str + "?";
        }
        String str3 = (str2 + "appcode=") + DataProviderFactory.getDataProvider().getAppkey();
        if (AliUserLogin.mAppreanceExtentions != null && AliUserLogin.mAppreanceExtentions.getNavHelper() != null) {
            try {
                ((INavHelper) AliUserLogin.mAppreanceExtentions.getNavHelper().newInstance()).navTo(context, str3);
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                startUrl(context, str3);
                return;
            }
        }
        startUrl(context, str3);
    }

    public static void startUrl(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4190f5e", new Object[]{context, str});
            return;
        }
        try {
            if (ServiceFactory.getService(NavigatorService.class) == null) {
                return;
            }
            UrlParam urlParam = new UrlParam();
            urlParam.url = str;
            ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openWebViewPage(context, urlParam);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
