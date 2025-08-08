package com.ali.user.mobile.base.helper;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.ServiceFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class LoginResultHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "Login.LoginResultHelper";

    static {
        kge.a(-1869133495);
    }

    public static void gotoH5PlaceHolder(Context context, LoginReturnData loginReturnData, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ad761b", new Object[]{context, loginReturnData, loginParam});
        } else if (context != null && !StringUtils.isEmpty(loginReturnData.h5Url)) {
            if (loginParam == null) {
                loginParam = new LoginParam();
            }
            loginParam.scene = loginReturnData.scene;
            loginParam.token = loginReturnData.token;
            loginParam.site = loginReturnData.site;
            loginParam.isFromRegister = false;
            loginParam.isFoundPassword = false;
            loginParam.h5QueryString = null;
            if (loginReturnData.extMap != null) {
                if (loginParam.ext == null) {
                    loginParam.ext = loginReturnData.extMap;
                } else {
                    loginParam.ext = new HashMap();
                    for (Map.Entry<String, String> entry : loginReturnData.extMap.entrySet()) {
                        loginParam.ext.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            UrlParam urlParam = new UrlParam();
            urlParam.url = loginReturnData.h5Url;
            urlParam.token = loginReturnData.token;
            urlParam.scene = loginReturnData.scene;
            urlParam.requestCode = 257;
            urlParam.loginParam = loginParam;
            if (ServiceFactory.getService(NavigatorService.class) != null) {
                if (context instanceof Activity) {
                    ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).startWebViewForResult((Activity) context, urlParam);
                    return;
                } else {
                    ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openWebViewPage(context, urlParam);
                    return;
                }
            }
            LoginTLogAdapter.e(TAG, "NavigationService is null!");
        }
    }
}
