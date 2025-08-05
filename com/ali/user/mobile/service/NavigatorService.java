package com.ali.user.mobile.service;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ali.user.mobile.filter.LoginFilterCallback;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.RegistParam;
import com.ali.user.mobile.model.UrlParam;

/* loaded from: classes2.dex */
public interface NavigatorService {
    void fingerIV(Context context, CommonCallback commonCallback);

    void fingerLogin(Context context, CommonCallback commonCallback);

    void fingerSet(Context context, CommonCallback commonCallback);

    void navToAgreement(Context context, LoginFilterCallback loginFilterCallback);

    void navToLoginPostPage(Context context, String str, boolean z, LoginFilterCallback loginFilterCallback);

    void navToLoginUrlPage(Context context, UrlParam urlParam, boolean z, LoginFilterCallback loginFilterCallback);

    void navToWebViewPage(String str, UrlParam urlParam);

    void openLoginPage(Context context, String str, Bundle bundle);

    void openRegisterPage(Context context, RegistParam registParam);

    void openScanActivity(Context context, String str);

    void openWebViewPage(Context context, UrlParam urlParam);

    void startWebViewForResult(Activity activity, UrlParam urlParam);
}
