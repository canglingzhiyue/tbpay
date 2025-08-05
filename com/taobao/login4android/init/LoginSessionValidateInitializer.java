package com.taobao.login4android.init;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public class LoginSessionValidateInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "login.LoginInitializer3";

    static {
        kge.a(1882357534);
        kge.a(1028243835);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        String str = "LoginSessionValidateInitializer init() called with: application = [" + application + "], params = [" + hashMap + riy.ARRAY_END_STR;
        if (!TextUtils.isEmpty(Login.getLoginToken()) || !TextUtils.isEmpty(Login.getUserId())) {
            return;
        }
        Login.triggerLoginBundle();
    }
}
