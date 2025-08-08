package com.ali.user.mobile.register.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.app.constant.FragmentConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.base.ui.BaseFragment;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.action.LoginResActions;
import com.ali.user.mobile.login.model.AppLaunchInfoResponseData;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.model.RegistParam;
import com.ali.user.mobile.navigation.NavigatorManager;
import com.ali.user.mobile.register.RegistConstants;
import com.ali.user.mobile.ui.WebConstant;
import com.ali.user.mobile.utils.LanguageUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.ali.user.mobile.webview.WebViewActivity;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.ui.TaobaoOneKeyRegFragment;
import com.taobao.login4android.ui.TaobaoTwoStepMobileRegFragment;
import com.taobao.login4android.ui.oversea.OverseaRegisterFragment;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.util.Properties;
import tb.kge;

/* loaded from: classes2.dex */
public class AliUserRegisterActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Fragment mCurrentFragment;
    public AppLaunchInfoResponseData mFireAppLaunchRes;
    public FragmentManager mFragmentManager;
    private RegistParam mRegistParam;
    private String token = "";

    static {
        kge.a(761822628);
    }

    public static /* synthetic */ Object ipc$super(AliUserRegisterActivity aliUserRegisterActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 42701466:
                return new Integer(super.getLayout());
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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
    public void setDefaultTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c0ad11", new Object[]{this});
        }
    }

    public static Intent getCallingIntent(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("35920e9c", new Object[]{context}) : new Intent(context, AliUserRegisterActivity.class);
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public int getLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28b929a", new Object[]{this})).intValue();
        }
        if (StringUtils.isEmpty(UserLoginActivity.getRegBgImage(this.mFireAppLaunchRes))) {
            return super.getLayout();
        }
        this.needAdjustToolbar = true;
        return R.layout.aliuser_activity_immersive;
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.isLoginObserver = true;
        try {
            initParam(getIntent());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        UserTrackAdapter.skipPage(this);
        super.onCreate(bundle);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        try {
            initParam(intent);
            initViews();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void initParam(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad69721", new Object[]{this, intent});
            return;
        }
        this.mFragmentManager = getSupportFragmentManager();
        if (intent == null) {
            return;
        }
        String dataString = intent.getDataString();
        try {
            if (!StringUtils.isEmpty(dataString)) {
                this.token = Uri.parse(dataString).getQueryParameter(BaseJsExecutor.NAME_VERIFY_TOKEN);
            }
            this.mRegistParam = (RegistParam) intent.getParcelableExtra(RegistConstants.REGISTPARAM);
            if (this.mRegistParam != null) {
                return;
            }
            Serializable serializableExtra = intent.getSerializableExtra(RegistConstants.REGISTPARAM);
            if (serializableExtra != null) {
                this.mRegistParam = (RegistParam) serializableExtra;
            }
            if (this.mRegistParam == null || this.mRegistParam.externParams == null) {
                return;
            }
            String str = this.mRegistParam.externParams.get(LoginConstant.APPLAUNCH_INFO);
            if (StringUtils.isEmpty(str)) {
                return;
            }
            this.mFireAppLaunchRes = (AppLaunchInfoResponseData) JSON.parseObject(str, AppLaunchInfoResponseData.class);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        try {
            super.onPause();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_activity_frame_content;
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        try {
            if (getSupportActionBar() != null && AliUserLogin.getAppreanceExtentions() != null && !AliUserLogin.getAppreanceExtentions().isNeedToolbar()) {
                getSupportActionBar().e();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        changeFragmentByConfig(getIntent());
    }

    public void changeFragmentByConfig(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e55547d", new Object[]{this, intent});
            return;
        }
        try {
            Fragment mobileRegisterFragment = getMobileRegisterFragment(intent, AliUserLogin.getAppreanceExtentions());
            if (intent != null) {
                try {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    if (!StringUtils.isEmpty(this.token)) {
                        extras.putString("token", this.token);
                    }
                    if (this.mRegistParam != null) {
                        extras.putSerializable(RegistConstants.REGISTPARAM, this.mRegistParam);
                    }
                    mobileRegisterFragment.setArguments(extras);
                } catch (Throwable unused) {
                }
            }
            addFragment(mobileRegisterFragment, FragmentConstant.REG_FRAGMENT_TAG);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Fragment getMobileRegisterFragment(Intent intent, LoginApprearanceExtensions loginApprearanceExtensions) throws InstantiationException, IllegalAccessException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("8f81e6e4", new Object[]{this, intent, loginApprearanceExtensions});
        }
        if (intent != null && StringUtils.equals(RegPageType.TWO_STEP_MOBILE_REG, intent.getStringExtra(RegistConstants.REG_PAGE_TYPE))) {
            return getTwoStepRegFragment();
        }
        Properties properties = new Properties();
        RegistParam registParam = this.mRegistParam;
        if (registParam != null && !StringUtils.isEmpty(registParam.source)) {
            properties.put("source", this.mRegistParam.source);
        }
        properties.put("newUser", Boolean.valueOf(StringUtils.isEmpty(SessionManager.getInstance(DataProviderFactory.getApplicationContext()).getOldUserId())));
        UserTrackAdapter.sendUT("toRegisterPage", properties);
        if ((DataProviderFactory.getDataProvider().supportOneKeyRegister() || LoginStatus.enableOnekeyLoginV2) && !UserLoginActivity.displayOversea(this.mFireAppLaunchRes)) {
            String str = "";
            try {
                str = intent.getStringExtra("number");
                String stringExtra = intent.getStringExtra("scene");
                if (!StringUtils.isEmpty(stringExtra)) {
                    properties.setProperty("scene", stringExtra);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (!StringUtils.isEmpty(str)) {
                TaobaoOneKeyRegFragment taobaoOneKeyRegFragment = new TaobaoOneKeyRegFragment();
                UserTrackAdapter.sendUT("toSimRegisterPage", properties);
                return taobaoOneKeyRegFragment;
            }
        }
        Fragment twoStepRegFragment = getTwoStepRegFragment();
        UserTrackAdapter.sendUT("toSmsRegisterPage", properties);
        return twoStepRegFragment;
    }

    public void gotoSmsCodeFragment(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("747e3c37", new Object[]{this, intent});
        } else {
            NavigatorManager.getInstance().navToRegSMSCodePage(getApplicationContext(), intent == null ? new Bundle() : intent.getExtras());
        }
    }

    public void gotoTwoStepMobileRegFragment(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ef306f1", new Object[]{this, intent});
            return;
        }
        try {
            Fragment twoStepRegFragment = getTwoStepRegFragment();
            twoStepRegFragment.setArguments(intent.getExtras());
            addFragment(twoStepRegFragment, FragmentConstant.REG_FRAGMENT_TAG);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Fragment getTwoStepRegFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("75a0d38b", new Object[]{this});
        }
        if (UserLoginActivity.displayOversea(this.mFireAppLaunchRes) || LanguageUtil.isHK()) {
            return new OverseaRegisterFragment();
        }
        return new TaobaoTwoStepMobileRegFragment();
    }

    public void addFragment(Fragment fragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a15148e4", new Object[]{this, fragment, str});
            return;
        }
        hideAllFragment();
        Fragment findFragmentByTag = this.mFragmentManager.findFragmentByTag(str);
        if (findFragmentByTag != null) {
            this.mFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
        this.mCurrentFragment = fragment;
        this.mFragmentManager.beginTransaction().add(R.id.aliuser_content_frame, fragment, str).commitAllowingStateLoss();
        this.mFragmentManager.beginTransaction().show(fragment).commitAllowingStateLoss();
    }

    private void hideAllFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32c9176", new Object[]{this});
            return;
        }
        for (String str : FragmentConstant.getRegFragmentTagList()) {
            Fragment findFragmentByTag = this.mFragmentManager.findFragmentByTag(str);
            if (findFragmentByTag != null) {
                this.mFragmentManager.beginTransaction().hide(findFragmentByTag).commitAllowingStateLoss();
            }
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        this.mCurrentFragment.onActivityResult(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            finishCurrentAndNotify();
        }
    }

    public void finishCurrentAndNotify() {
        Fragment fragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76091cc1", new Object[]{this});
        } else if (getSupportFragmentManager() != null && !getSupportFragmentManager().isDestroyed() && (fragment = this.mCurrentFragment) != null && ((BaseFragment) fragment).onBackPressed()) {
        } else {
            try {
                addControl();
                BroadCastHelper.sendLocalBroadCast(new Intent(LoginResActions.REG_CANCEL));
                finish();
            } catch (Throwable unused) {
            }
        }
    }

    private void addControl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb72403", new Object[]{this});
        } else {
            UserTrackAdapter.sendControlUT(UTConstans.PageName.UT_PAGE_REG, UTConstans.Controls.UT_BTN_BACK);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        try {
            this.mFragmentManager = null;
            super.onDestroy();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void goHelp() {
        String helpUrl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67edd450", new Object[]{this});
            return;
        }
        if (UserLoginActivity.displayOversea(this.mFireAppLaunchRes)) {
            helpUrl = LoginConstant.getHelpUrlOversea();
        } else {
            helpUrl = LoginConstant.getHelpUrl();
        }
        Intent intent = new Intent(this, WebViewActivity.class);
        intent.putExtra(WebConstant.WEBURL, helpUrl);
        startActivity(intent);
    }

    public static void goRegHelp(Activity activity) {
        String helpUrl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd55d646", new Object[]{activity});
            return;
        }
        if (DataProviderFactory.getDataProvider().isForigenLocation()) {
            helpUrl = LoginConstant.getHelpUrlOversea();
        } else {
            helpUrl = LoginConstant.getHelpUrl();
        }
        Intent intent = new Intent(activity, WebViewActivity.class);
        intent.putExtra(WebConstant.WEBURL, helpUrl);
        activity.startActivity(intent);
    }
}
