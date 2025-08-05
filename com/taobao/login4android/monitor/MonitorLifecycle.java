package com.taobao.login4android.monitor;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.compat.ApplicationCompat;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.biz.alipaysso.AlipayConstant;
import tb.kge;

/* loaded from: classes7.dex */
public class MonitorLifecycle {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "Login.MonitorLifecycle";

    static {
        kge.a(1818424547);
    }

    public static /* synthetic */ void access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bc42b8", new Object[0]);
        } else {
            handleAlipayLoginBundle();
        }
    }

    public static void listen(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("719fe3d1", new Object[]{application});
            return;
        }
        try {
            ((PanguApplication) application).registerActivityLifecycleCallbacks(new a());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* loaded from: classes7.dex */
    public static class a extends ApplicationCompat.AbstractActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1880866932);
        }

        private a() {
        }

        @Override // com.taobao.android.compat.ApplicationCompat.AbstractActivityLifecycleCallbacks, com.taobao.android.compat.ApplicationCompat.ActivityLifecycleCallbacksCompat
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else {
                MonitorLifecycle.access$100();
            }
        }
    }

    private static void handleAlipayLoginBundle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b71fb60", new Object[0]);
            return;
        }
        Bundle bundle = Login.launchBundle;
        if (bundle == null) {
            return;
        }
        String string = bundle.getString(AlipayConstant.LOGIN_ALIPAY_CLIENT_VERSION_KEY);
        String string2 = bundle.getString(AlipayConstant.LOGIN_ALIPAY_USER_ID_KEY);
        String string3 = bundle.getString("app_id");
        String string4 = bundle.getString(AlipayConstant.LOGIN_ALIPAY_AUTH_CODE_KEY);
        String string5 = bundle.getString(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY);
        String string6 = bundle.getString("source");
        String string7 = bundle.getString("version");
        if (!Login.checkSessionValid() && !TextUtils.isEmpty(string5) && !TextUtils.isEmpty(string6)) {
            bundle.putString(AlipayConstant.LOGIN_ALIPAY_CLIENT_VERSION_KEY, "");
            bundle.putString(AlipayConstant.LOGIN_ALIPAY_USER_ID_KEY, "");
            bundle.putString("app_id", "");
            bundle.putString(AlipayConstant.LOGIN_ALIPAY_AUTH_CODE_KEY, "");
            bundle.putString(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY, "");
            bundle.putString("source", "");
            bundle.putString("version", "");
            Bundle bundle2 = new Bundle();
            bundle2.putString(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY, string5);
            bundle2.putString("source", string6);
            bundle2.putString(AlipayConstant.LOGIN_ALIPAY_CLIENT_VERSION_KEY, string);
            bundle2.putString(AlipayConstant.LOGIN_ALIPAY_USER_ID_KEY, string2);
            bundle2.putString("app_id", string3);
            bundle2.putString(AlipayConstant.LOGIN_ALIPAY_AUTH_CODE_KEY, string4);
            bundle2.putString("version", string7);
            Login.login(false, bundle2);
        }
        UserTrackAdapter.sendUserTrack(UTConstant.PageName.UT_PAGE_EXTEND, "MonitorLifecycle_used", null);
    }
}
