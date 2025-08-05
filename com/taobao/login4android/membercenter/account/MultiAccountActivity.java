package com.taobao.login4android.membercenter.account;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import com.ali.user.mobile.base.BaseLogonFragment;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class MultiAccountActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TYPE = "actionType";
    public static final String TAG = "login.multiaccount";
    public FragmentManager mFragmentManager;

    static {
        kge.a(-57235065);
    }

    public static /* synthetic */ Object ipc$super(MultiAccountActivity multiAccountActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public boolean needToolbar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a370e010", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.mFragmentManager = getSupportFragmentManager();
        super.onCreate(bundle);
        UserTrackAdapter.skipPage(this);
        if (LoginSwitch.getSwitch(LoginSwitch.EXTRA_PREFECT, "false") && ServiceFactory.getService(NumberAuthService.class) != null && ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).needPrefetch() && TextUtils.isEmpty(Login.getLoginToken())) {
            ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).preFecth(LoginConstants.LOGIN_FROM_MULTI_ACCOUNT);
        }
        if (this.mToolbar != null) {
            this.mToolbar.setBackgroundColor(getResources().getColor(R.color.aliuser_gray_bg));
        }
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        getWindow().setStatusBarColor(getResources().getColor(R.color.aliuser_gray_bg));
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.ali_user_multi_login_fragment;
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
        } else {
            openFragmentByConfig(getIntent());
        }
    }

    private void openFragmentByConfig(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a946817", new Object[]{this, intent});
        } else {
            gotoMutliAccountFragment(intent);
        }
    }

    private void gotoMutliAccountFragment(Intent intent) {
        Fragment findFragmentByTag = this.mFragmentManager.findFragmentByTag("multi_account");
        if (findFragmentByTag != null) {
            this.mFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
            this.mFragmentManager.executePendingTransactions();
        }
        LoginApprearanceExtensions loginApprearanceExtensions = AliUserLogin.mAppreanceExtentions;
        if (loginApprearanceExtensions != null && loginApprearanceExtensions.getFullyCustomizedMultiAccountFragment() != null) {
            try {
                findFragmentByTag = (BaseLogonFragment) loginApprearanceExtensions.getFullyCustomizedMultiAccountFragment().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (findFragmentByTag == null) {
            findFragmentByTag = new NewMultiAccountFragment();
        }
        if (intent != null) {
            findFragmentByTag.setArguments(intent.getExtras());
        }
        this.mFragmentManager.beginTransaction().add(R.id.loginContainer, findFragmentByTag, "multi_account").commitAllowingStateLoss();
        this.mFragmentManager.beginTransaction().show(findFragmentByTag).commit();
    }
}
