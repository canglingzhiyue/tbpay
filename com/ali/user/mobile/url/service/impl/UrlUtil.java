package com.ali.user.mobile.url.service.impl;

import android.content.Context;
import android.text.TextUtils;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.helper.IUccInterface;
import com.ali.user.mobile.model.UrlParam;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import tb.kge;

/* loaded from: classes2.dex */
public class UrlUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.urlUtil";

    static {
        kge.a(1240717284);
    }

    public static void OpenUCC(Context context, UrlParam urlParam, CommonDataCallback commonDataCallback) {
        if (urlParam == null || TextUtils.isEmpty(urlParam.url)) {
            return;
        }
        if (AliUserLogin.mAppreanceExtentions != null && AliUserLogin.mAppreanceExtentions.getUccHelper() != null) {
            try {
                ((IUccInterface) AliUserLogin.mAppreanceExtentions.getUccHelper().newInstance()).openUrl(context, urlParam, commonDataCallback);
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        LoginTLogAdapter.e(TAG, "no ucc helper ");
    }
}
