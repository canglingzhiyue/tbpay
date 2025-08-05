package com.taobao.login4android.activity.auth;

import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.base.ui.BaseFragment;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.LoginParam;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.alipay2.c;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class AlipayHkAuth {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REPEAT_CLICK_GAP = 3000;
    public static long mLastClickTime;

    static {
        kge.a(1747983450);
    }

    public static void onAlipayLoginClick(BaseFragment baseFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e0e998", new Object[]{baseFragment});
        } else if (baseFragment == null || !baseFragment.isActivityAvaiable() || !baseFragment.isActive()) {
            LoginTLogAdapter.e("AlipayAuth", "return case fragment is not active or is null");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - mLastClickTime < 3000) {
                UserTrackAdapter.sendUT("ClickFastReturn");
                LoginTLogAdapter.e("login.LoginStatus", "click too fast ,return");
                return;
            }
            mLastClickTime = currentTimeMillis;
            new HashMap().put(UTConstant.PageName.UT_KEY_PAGE_NAME, baseFragment.getPageName());
            LoginParam loginParam = new LoginParam();
            loginParam.utPageName = baseFragment.getPageName();
            c.a(baseFragment.getActivity(), loginParam);
        }
    }
}
