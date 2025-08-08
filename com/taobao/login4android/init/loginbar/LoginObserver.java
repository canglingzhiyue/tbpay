package com.taobao.login4android.init.loginbar;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.jsbridge.PopJSBridge;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes.dex */
public class LoginObserver extends FragmentManager.FragmentLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String TAG = "Login.Observer";

    static {
        kge.a(-524434021);
    }

    public static /* synthetic */ Object ipc$super(LoginObserver loginObserver, String str, Object... objArr) {
        if (str.hashCode() == -1547495758) {
            super.onFragmentResumed((FragmentManager) objArr[0], (Fragment) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c316b2", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentResumed(fragmentManager, fragment);
        try {
            FragmentActivity activity = fragment.getActivity();
            String config = OrangeConfig.getInstance().getConfig("login4android", "remove_login_bar_in_sdk_page", "false");
            if (isLoginPage(activity)) {
                if ("true".equals(config)) {
                    LoginBarController.removeLoginBar(R.id.tbTabFragment, activity, false);
                }
            } else {
                LoginBarController.removeLoginBar(R.id.tbTabFragment, activity, false);
            }
            if (!fragment.toString().contains("HomepageFragment") && !fragment.toString().contains("HomeFragment")) {
                return;
            }
            if (PopJSBridge.homepageFirstResumed == null) {
                PopJSBridge.homepageFirstResumed = true;
            }
            if (Login.checkSessionValid() || !StringUtils.isEmpty(Login.getLoginToken())) {
                return;
            }
            try {
                String config2 = OrangeConfig.getInstance().getConfig("login4android", LoginSwitch.WEAK_REFERENCE_HOME_ACT, "true");
                String str = this.TAG;
                LoginTLogAdapter.e(str, "weak_reference_home_act weakOpen:" + config2);
                if (StringUtils.equals("true", config2) && activity != null) {
                    if (activity.getComponentName() != null) {
                        String str2 = this.TAG;
                        LoginTLogAdapter.e(str2, "weak_reference_home_act:" + activity.getComponentName().getShortClassName());
                    }
                    LoginBarController.sWeakReference = new WeakReference<>(activity);
                }
            } catch (Exception e) {
                LoginTLogAdapter.e(this.TAG, "weak_reference_home_act fail:", e);
            }
            LoginBarController.addLoginBar(R.id.tbTabFragment, activity, fragmentManager);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private boolean isLoginPage(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("781b82ab", new Object[]{this, activity})).booleanValue();
        }
        String currentActivityName = getCurrentActivityName(activity);
        return "com.ali.user.mobile.login.ui.UserLoginActivity".equals(currentActivityName) || "com.taobao.login4android.membercenter.account.LogoutPanelActivity".equals(currentActivityName) || "com.ali.user.mobile.webview.WebViewActivity".equals(currentActivityName);
    }

    public static String getCurrentActivityName(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("727099ea", new Object[]{activity}) : activity.getClass().getName();
    }
}
