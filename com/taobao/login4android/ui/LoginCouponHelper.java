package com.taobao.login4android.ui;

import android.view.View;
import android.widget.TextView;
import com.ali.user.mobile.login.model.AppLaunchInfo;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class LoginCouponHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1226518304);
    }

    public static void handleCoupon(View view, UserLoginActivity userLoginActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4f664ac", new Object[]{view, userLoginActivity});
        } else {
            handleCoupon(view, userLoginActivity, true);
        }
    }

    public static void handleCoupon(View view, UserLoginActivity userLoginActivity, boolean z) {
        View findViewById;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9d6e3a8", new Object[]{view, userLoginActivity, new Boolean(z)});
        } else if (view == null || userLoginActivity == null || userLoginActivity.fireAppLaunchRes == null || userLoginActivity.fireAppLaunchRes.returnValue == 0 || ((AppLaunchInfo) userLoginActivity.fireAppLaunchRes.returnValue).loginPageInfo == null || !userLoginActivity.shouldShowLoginBenefit() || (findViewById = view.findViewById(R.id.aliuser_login_coupon_tip)) == null) {
        } else {
            findViewById.setVisibility(0);
            setText((TextView) findViewById.findViewById(R.id.aliuser_login_coupon_amount), ((AppLaunchInfo) userLoginActivity.fireAppLaunchRes.returnValue).loginPageInfo.benefitAmountText);
            setText((TextView) findViewById.findViewById(R.id.aliuser_coupon_subtitle), ((AppLaunchInfo) userLoginActivity.fireAppLaunchRes.returnValue).loginPageInfo.benefitSubTitle);
            setText((TextView) findViewById.findViewById(R.id.aliuser_coupon_title), ((AppLaunchInfo) userLoginActivity.fireAppLaunchRes.returnValue).loginPageInfo.benefitTitle);
            View findViewById2 = findViewById.findViewById(R.id.aliuser_coupon_triangle);
            if (findViewById2 == null) {
                return;
            }
            if (!z) {
                i = 8;
            }
            findViewById2.setVisibility(i);
        }
    }

    private static void setText(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9914798", new Object[]{textView, str});
        } else if (textView == null || str == null) {
        } else {
            textView.setText(str);
        }
    }
}
