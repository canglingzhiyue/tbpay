package com.ali.user.mobile.login.ui;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.FragmentConstant;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.base.helper.StrategyHelper;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.base.ui.BaseFragment;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.action.LoginResActions;
import com.ali.user.mobile.login.model.AppLaunchInfo;
import com.ali.user.mobile.login.model.AppLaunchInfoResponseData;
import com.ali.user.mobile.login.model.AppLaunchList;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.RecommendLoginPresenter;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.navigation.NavigatorManager;
import com.ali.user.mobile.register.ui.AliUserRegisterActivity;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.LoginHistory;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.FaceService;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.Constants;
import com.ali.user.mobile.utils.CountryUtil;
import com.ali.user.mobile.utils.ImageUtil;
import com.ali.user.mobile.utils.LanguageUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.oauth.OauthService;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import com.taobao.login4android.activity.auth.AlipayAuth;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.login.LoginController;
import com.taobao.login4android.ui.TaobaoMobileHistoryFragment;
import com.taobao.login4android.ui.TaobaoOneKeyLoginFragment;
import com.taobao.login4android.ui.TaobaoOneKeyLoginHistoryFragment;
import com.taobao.login4android.ui.TaobaoQrLoginFragment;
import com.taobao.login4android.ui.TaobaoRecommendLoginFragment;
import com.taobao.login4android.ui.TaobaoUserLoginFragment;
import com.taobao.login4android.ui.oversea.OverseaLoginFragment;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import tb.akt;
import tb.kge;

/* loaded from: classes2.dex */
public class UserLoginActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NUMBER = "number";
    public static final String NUM_PROTOCOL_NAME = "protocolName";
    public static final String NUM_PROTOCOL_URL = "protocolURL";
    private static final String TAG = "login.UserLoginActivity";
    public AppLaunchInfoResponseData fireAppLaunchRes;
    public boolean isPad;
    public View mBackBtn;
    public String mBiometricToken;
    public FragmentManager mFragmentManager;
    public View mHelpTV;
    public HistoryAccount mHistoryAccount;
    public LoginHistory mLoginHistory;
    public View mMainLL;
    public boolean mOpenGuide;
    public String mSource;
    public View mTopRectangle;
    public String otherLoginType;
    public long startOpenTime;
    public long startTime;
    public String mCurrentFragmentTag = FragmentConstant.PWD_LOGIN_FRAGMENT_TAG;
    public boolean hadReadHistory = false;
    public boolean mUserOpenFaceLogin = false;
    public boolean mAlipayInstall = false;
    public boolean mShowRegTV = true;
    public boolean isFaceLoginEnvEnable = false;
    public boolean isFaceLoginActivate = false;
    public boolean isMobileAvailable = true;
    public boolean isFromAddAccount = false;
    private boolean isOpenMobileLoginPage = false;
    private boolean isOpenUserLoginPage = false;
    public boolean needSMSCheck = true;

    static {
        kge.a(-1042816320);
    }

    public static /* synthetic */ Object ipc$super(UserLoginActivity userLoginActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -3136315:
                super.initViews();
                return null;
            case 42701466:
                return new Integer(super.getLayout());
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
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

    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : "login";
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public boolean isShowNavIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69ad8500", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e50f98c0", new Object[]{this, bundle});
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public void setDefaultTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c0ad11", new Object[]{this});
        }
    }

    public static /* synthetic */ LoginHistory access$000(UserLoginActivity userLoginActivity, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoginHistory) ipChange.ipc$dispatch("aab58045", new Object[]{userLoginActivity, intent}) : userLoginActivity.getLoginHistory(intent);
    }

    public static /* synthetic */ void access$100(UserLoginActivity userLoginActivity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988db764", new Object[]{userLoginActivity, intent});
        } else {
            userLoginActivity.openFragmentByIntent(intent);
        }
    }

    public void setNeedSMSCheck(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4af9826", new Object[]{this, new Boolean(z)});
        } else {
            this.needSMSCheck = z;
        }
    }

    public boolean isNeedSMSCheck() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c29e93a", new Object[]{this})).booleanValue() : this.needSMSCheck && LoginSwitch.getSwitch(LoginSwitch.SMS_CHECK, "true");
    }

    public static Intent getCallingIntent(Context context, String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("e96d5312", new Object[]{context, str, new Boolean(z), new Boolean(z2)});
        }
        Intent intent = new Intent(context, UserLoginActivity.class);
        intent.putExtra(LoginConstant.LAUNCH_PASS_GUIDE_FRAGMENT, z);
        intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, str);
        return intent;
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        if (AliUserLogin.getAppreanceExtentions() != null && AliUserLogin.getAppreanceExtentions().getActivityEnterAnimation() > 0) {
            overridePendingTransition(AliUserLogin.getAppreanceExtentions().getActivityEnterAnimation(), 0);
        }
        initParam(getIntent());
        UserTrackAdapter.sendUT("openLogin", getProperty(getIntent()));
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
        initParam(intent);
        openFragmentByConfig(intent);
    }

    public void initParam(Intent intent) {
        LoginParam loginParam;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad69721", new Object[]{this, intent});
            return;
        }
        this.isLoginObserver = true;
        UserTrackAdapter.skipPage(this);
        this.startTime = System.currentTimeMillis();
        if (intent != null) {
            try {
                this.isOpenMobileLoginPage = StringUtils.equals(intent.getStringExtra(UIBaseConstants.LoginPage.PAGE_LOGIN_TYPE), UIBaseConstants.LoginPage.PAGE_SMS_LOGIN);
                this.isOpenUserLoginPage = StringUtils.equals(intent.getStringExtra(UIBaseConstants.LoginPage.PAGE_LOGIN_TYPE), UIBaseConstants.LoginPage.PAGE_PWD_LOGIN);
                this.isFromAddAccount = intent.getBooleanExtra(LoginConstant.FORM_ADD_ACCOUNT, false);
                String stringExtra = intent.getStringExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM);
                if (!StringUtils.isEmpty(stringExtra) && (loginParam = (LoginParam) JSON.parseObject(stringExtra, LoginParam.class)) != null) {
                    this.mSource = loginParam.source;
                }
                String stringExtra2 = intent.getStringExtra(LoginConstant.APPLAUNCH_INFO);
                if (!StringUtils.isEmpty(stringExtra2)) {
                    this.fireAppLaunchRes = (AppLaunchInfoResponseData) JSON.parseObject(stringExtra2, AppLaunchInfoResponseData.class);
                }
            } catch (Throwable unused) {
                UserTrackAdapter.sendUT("Page_Login", "login_params_error");
            }
        }
        this.mFragmentManager = getSupportFragmentManager();
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
        super.initViews();
        this.mMainLL = findViewById(R.id.aliuser_main_content);
        try {
            if (getSupportActionBar() != null) {
                if (AliUserLogin.getAppreanceExtentions() != null && !AliUserLogin.getAppreanceExtentions().isNeedToolbar()) {
                    getSupportActionBar().e();
                }
                getSupportActionBar().a("");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        openFragmentByConfig(getIntent());
    }

    public void openFragmentByConfig(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a946817", new Object[]{this, intent});
            return;
        }
        if (LoginSwitch.getSwitch(LoginSwitch.OPEN_LOGIN_PAGE_WHEN_IS_LOGIN, "true")) {
            BroadCastHelper.sendLocalBroadCast(new Intent(LoginResActions.LOGIN_OPEN_ACTION));
        }
        CoordinatorWrapper.executeSafely(new NewLoginPreCheckTask(this, intent), new Object[0]);
    }

    private LoginHistory getLoginHistory(Intent intent) {
        String stringExtra;
        LoginParam loginParam;
        LoginHistory loginHistory;
        HistoryAccount historyAccount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginHistory) ipChange.ipc$dispatch("af07eb83", new Object[]{this, intent});
        }
        if (this.isFromAddAccount) {
            return null;
        }
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (!StringUtils.isEmpty(stringExtra)) {
                loginParam = (LoginParam) JSON.parseObject(stringExtra, LoginParam.class);
                loginHistory = SecurityGuardManagerWraper.getLoginHistory();
                this.hadReadHistory = true;
                if (loginHistory == null && loginHistory.accountHistory != null && loginHistory.accountHistory.size() > 0) {
                    if (loginParam != null && loginParam.hid > 0) {
                        this.mHistoryAccount = SecurityGuardManagerWraper.findHistoryAccount(loginParam.hid);
                    } else {
                        int i = loginHistory.index;
                        if (i < 0 || i >= loginHistory.accountHistory.size()) {
                            i = loginHistory.accountHistory.size() - 1;
                        }
                        this.mHistoryAccount = loginHistory.accountHistory.get(i);
                    }
                } else {
                    this.mHistoryAccount = null;
                }
                historyAccount = this.mHistoryAccount;
                if (historyAccount != null && !StringUtils.isEmpty(historyAccount.biometricId)) {
                    this.mBiometricToken = SecurityGuardManagerWraper.getFingerValue(this.mHistoryAccount.biometricId);
                }
                return loginHistory;
            }
        }
        loginParam = null;
        loginHistory = SecurityGuardManagerWraper.getLoginHistory();
        this.hadReadHistory = true;
        if (loginHistory == null) {
        }
        this.mHistoryAccount = null;
        historyAccount = this.mHistoryAccount;
        if (historyAccount != null) {
            this.mBiometricToken = SecurityGuardManagerWraper.getFingerValue(this.mHistoryAccount.biometricId);
        }
        return loginHistory;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[Catch: Throwable -> 0x0167, TryCatch #6 {Throwable -> 0x0167, blocks: (B:19:0x003b, B:21:0x0047, B:26:0x0053, B:28:0x0057, B:30:0x005d, B:32:0x0061, B:35:0x0073, B:63:0x00d9, B:65:0x00fc, B:67:0x0106, B:73:0x0112, B:75:0x0118, B:76:0x011e, B:79:0x0128, B:81:0x012c, B:83:0x0132, B:84:0x0136, B:90:0x0145, B:92:0x014b, B:95:0x0151, B:97:0x0155, B:99:0x0159, B:101:0x015f, B:103:0x0163, B:18:0x0038, B:86:0x013a, B:39:0x007b, B:41:0x0081, B:43:0x0089, B:45:0x0097, B:47:0x009b, B:49:0x00a5, B:51:0x00b0, B:53:0x00b8, B:55:0x00be), top: B:114:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d A[Catch: Throwable -> 0x0167, TryCatch #6 {Throwable -> 0x0167, blocks: (B:19:0x003b, B:21:0x0047, B:26:0x0053, B:28:0x0057, B:30:0x005d, B:32:0x0061, B:35:0x0073, B:63:0x00d9, B:65:0x00fc, B:67:0x0106, B:73:0x0112, B:75:0x0118, B:76:0x011e, B:79:0x0128, B:81:0x012c, B:83:0x0132, B:84:0x0136, B:90:0x0145, B:92:0x014b, B:95:0x0151, B:97:0x0155, B:99:0x0159, B:101:0x015f, B:103:0x0163, B:18:0x0038, B:86:0x013a, B:39:0x007b, B:41:0x0081, B:43:0x0089, B:45:0x0097, B:47:0x009b, B:49:0x00a5, B:51:0x00b0, B:53:0x00b8, B:55:0x00be), top: B:114:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061 A[Catch: Throwable -> 0x0167, TryCatch #6 {Throwable -> 0x0167, blocks: (B:19:0x003b, B:21:0x0047, B:26:0x0053, B:28:0x0057, B:30:0x005d, B:32:0x0061, B:35:0x0073, B:63:0x00d9, B:65:0x00fc, B:67:0x0106, B:73:0x0112, B:75:0x0118, B:76:0x011e, B:79:0x0128, B:81:0x012c, B:83:0x0132, B:84:0x0136, B:90:0x0145, B:92:0x014b, B:95:0x0151, B:97:0x0155, B:99:0x0159, B:101:0x015f, B:103:0x0163, B:18:0x0038, B:86:0x013a, B:39:0x007b, B:41:0x0081, B:43:0x0089, B:45:0x0097, B:47:0x009b, B:49:0x00a5, B:51:0x00b0, B:53:0x00b8, B:55:0x00be), top: B:114:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void openFragmentByIntent(android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.login.ui.UserLoginActivity.openFragmentByIntent(android.content.Intent):void");
    }

    public boolean supportMultiLogoutList(LoginHistory loginHistory) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("25390a8f", new Object[]{this, loginHistory})).booleanValue() : loginHistory != null && loginHistory.accountHistory != null && loginHistory.accountHistory.size() >= 2 && LoginSwitch.isInABTestRegion("supportMultiLogoutList", 10000);
    }

    public Class<?> getFaceLoginFragment(LoginApprearanceExtensions loginApprearanceExtensions) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("bb73f3b1", new Object[]{this, loginApprearanceExtensions}) : loginApprearanceExtensions.getFullyCustomizedFaceLoginFragment();
    }

    public void goPwdOrSMSFragment(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db21c175", new Object[]{this, intent});
            return;
        }
        HistoryAccount historyAccount = this.mHistoryAccount;
        if (historyAccount != null) {
            if (this.isOpenMobileLoginPage) {
                if (StringUtils.isEmpty(historyAccount.loginPhone)) {
                    intent.putExtra(LoginConstant.FORCE_NORMAL_MODE, true);
                }
                gotoHistorySmsLoginPage(intent);
                return;
            } else if (this.isOpenUserLoginPage) {
                if (historyAccount.hasPwd != 1) {
                    intent.putExtra(LoginConstant.FORCE_NORMAL_MODE, true);
                }
                gotoPwdLoginFragment(intent);
                return;
            } else if (DataProviderFactory.getDataProvider().alwaysSMSLoginPriority()) {
                gotoMobileLoginFragment(intent);
                return;
            } else if (StringUtils.equals(this.mHistoryAccount.loginType, LoginType.ServerLoginType.SMSLogin.getType())) {
                gotoHistorySmsLoginPage(intent);
                return;
            } else if (StringUtils.equals(this.mHistoryAccount.loginType, LoginType.ServerLoginType.PasswordLogin.getType())) {
                if (this.mHistoryAccount.hasPwd != 1) {
                    intent.putExtra(LoginConstant.FORCE_NORMAL_MODE, true);
                }
                gotoPwdLoginFragment(intent);
                return;
            } else if (DataProviderFactory.getDataProvider().isSmsLoginPriority() && !StringUtils.isEmpty(this.mHistoryAccount.loginPhone)) {
                gotoHistorySmsLoginPage(intent);
                return;
            } else if (this.mHistoryAccount.hasPwd == 0) {
                gotoMobileLoginFragment(intent);
                return;
            } else {
                if (this.mHistoryAccount.hasPwd != 1) {
                    intent.putExtra(LoginConstant.FORCE_NORMAL_MODE, true);
                }
                gotoPwdLoginFragment(intent);
                return;
            }
        }
        switchToRecommendLogin(intent);
    }

    public void gotoHistorySmsLoginPage(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c07f7d4", new Object[]{this, intent});
            return;
        }
        try {
            if (LoginSwitch.isInABTestRegion(LoginSwitch.ONEKEY_LOGIN_HISTORY_PERCENT, 10000) && ServiceFactory.getService(NumberAuthService.class) != null) {
                String mobileFromHistory = getMobileFromHistory();
                if (!StringUtils.isEmpty(mobileFromHistory)) {
                    String maskMobile = getMaskMobile();
                    if (!StringUtils.isEmpty(maskMobile) && maskMobile.length() > 7 && isCompareSuccess(mobileFromHistory, maskMobile)) {
                        gotoOneKeyHistoryLoginFragment(intent);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        gotoMobileLoginFragment(intent);
    }

    public void gotoOneKeyHistoryLoginFragment(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2d9cfe5", new Object[]{this, intent});
            return;
        }
        TaobaoOneKeyLoginHistoryFragment taobaoOneKeyLoginHistoryFragment = new TaobaoOneKeyLoginHistoryFragment();
        taobaoOneKeyLoginHistoryFragment.setArguments(intent.getExtras());
        UserTrackAdapter.sendUT("history_sim", getProperty(intent));
        addFragment(intent, taobaoOneKeyLoginHistoryFragment, FragmentConstant.ONE_KEY_LOGIN_HISTORY_FRAGMENT_TAG);
    }

    public boolean historyMatchMask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("caa63a28", new Object[]{this})).booleanValue();
        }
        if (this.mHistoryAccount != null) {
            return isCompareSuccess(getMobileFromHistory(), getMaskMobile());
        }
        return false;
    }

    public static boolean isCompareSuccess(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6fec147", new Object[]{str, str2})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2) && str2.length() > 7) {
            return str.endsWith(str2.substring(str2.lastIndexOf("*") + 1));
        }
        return false;
    }

    public static String getMaskMobile() {
        Map<String, String> authInfoMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce2da2d5", new Object[0]);
        }
        if (ServiceFactory.getService(NumberAuthService.class) != null && (authInfoMap = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap()) != null && authInfoMap.containsKey("number")) {
            return authInfoMap.get("number");
        }
        return null;
    }

    private String getMobileFromHistory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f37b6f67", new Object[]{this}) : getMobileFromHistory(this.mHistoryAccount);
    }

    public static String getMobileFromHistory(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5dbc08c3", new Object[]{historyAccount});
        }
        return DataProviderFactory.getDataProvider().historySecurityMobileCanLogin() ? historyAccount.mobile : historyAccount.loginPhone;
    }

    public void gotoOneKeyLoginFragment(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6139bea1", new Object[]{this, intent});
            return;
        }
        try {
            TaobaoOneKeyLoginFragment taobaoOneKeyLoginFragment = new TaobaoOneKeyLoginFragment();
            taobaoOneKeyLoginFragment.setArguments(intent.getExtras());
            UserTrackAdapter.sendUT("sim", getProperty(intent));
            addFragment(intent, taobaoOneKeyLoginFragment, FragmentConstant.ONE_KEY_LOGIN_FRAGMENT_TAG);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void gotoGuideFragment(Intent intent, LoginApprearanceExtensions loginApprearanceExtensions) {
        try {
            addFragment(intent, (Fragment) loginApprearanceExtensions.getFullyCustomizeGuideFragment().newInstance(), FragmentConstant.GUIDE_FRAGMENT_TAG);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void goFaceFragment(Intent intent) {
        try {
            Fragment fragment = (Fragment) getFaceLoginFragment(AliUserLogin.getAppreanceExtentions()).newInstance();
            if (intent != null) {
                fragment.setArguments(intent.getExtras());
            }
            addFragment(intent, fragment, FragmentConstant.FACE_LOGIN_FRAGMENT_TAG);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0053 A[Catch: Exception -> 0x0046, TryCatch #4 {Exception -> 0x0046, blocks: (B:28:0x0053, B:31:0x0058, B:33:0x005c, B:35:0x0066, B:43:0x007f, B:45:0x0083, B:47:0x00a2, B:48:0x00b0, B:38:0x0071, B:50:0x00c5, B:26:0x004e), top: B:62:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f A[Catch: Exception -> 0x0046, TryCatch #4 {Exception -> 0x0046, blocks: (B:28:0x0053, B:31:0x0058, B:33:0x005c, B:35:0x0066, B:43:0x007f, B:45:0x0083, B:47:0x00a2, B:48:0x00b0, B:38:0x0071, B:50:0x00c5, B:26:0x004e), top: B:62:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083 A[Catch: Exception -> 0x0046, TryCatch #4 {Exception -> 0x0046, blocks: (B:28:0x0053, B:31:0x0058, B:33:0x005c, B:35:0x0066, B:43:0x007f, B:45:0x0083, B:47:0x00a2, B:48:0x00b0, B:38:0x0071, B:50:0x00c5, B:26:0x004e), top: B:62:0x004e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void gotoMobileLoginFragment(android.content.Intent r15) {
        /*
            r14 = this;
            java.lang.String r0 = "check"
            java.lang.String r1 = "autoSendSms"
            java.lang.String r2 = "ut_from_register"
            java.lang.String r3 = "PARAM_LOGIN_PARAM"
            java.lang.String r4 = "account"
            java.lang.String r5 = "forceNormalMode"
            java.lang.String r6 = ""
            com.android.alibaba.ip.runtime.IpChange r7 = com.ali.user.mobile.login.ui.UserLoginActivity.$ipChange
            boolean r8 = r7 instanceof com.android.alibaba.ip.runtime.IpChange
            r9 = 1
            r10 = 0
            if (r8 == 0) goto L24
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r10] = r14
            r0[r9] = r15
            java.lang.String r15 = "e870f238"
            r7.ipc$dispatch(r15, r0)
            return
        L24:
            boolean r7 = r15.getBooleanExtra(r5, r10)     // Catch: java.lang.Throwable -> L49
            java.lang.String r8 = r15.getStringExtra(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r6 = r15.getStringExtra(r3)     // Catch: java.lang.Throwable -> L41
            boolean r11 = r15.getBooleanExtra(r2, r10)     // Catch: java.lang.Throwable -> L41
            boolean r12 = r15.getBooleanExtra(r1, r10)     // Catch: java.lang.Throwable -> L3f
            boolean r10 = r15.getBooleanExtra(r0, r10)     // Catch: java.lang.Throwable -> L3d
            goto L51
        L3d:
            r13 = move-exception
            goto L4e
        L3f:
            r13 = move-exception
            goto L4d
        L41:
            r13 = move-exception
            goto L4c
        L43:
            r13 = move-exception
            r8 = r6
            goto L4c
        L46:
            r15 = move-exception
            goto Lc9
        L49:
            r13 = move-exception
            r8 = r6
            r7 = 0
        L4c:
            r11 = 0
        L4d:
            r12 = 0
        L4e:
            r13.printStackTrace()     // Catch: java.lang.Exception -> L46
        L51:
            if (r7 != 0) goto Lc5
            com.ali.user.mobile.rpc.HistoryAccount r13 = r14.mHistoryAccount     // Catch: java.lang.Exception -> L46
            if (r13 != 0) goto L58
            goto Lc5
        L58:
            com.ali.user.mobile.rpc.HistoryAccount r13 = r14.mHistoryAccount     // Catch: java.lang.Exception -> L46
            if (r13 == 0) goto L7c
            com.ali.user.mobile.app.dataprovider.IDataProvider r13 = com.ali.user.mobile.app.dataprovider.DataProviderFactory.getDataProvider()     // Catch: java.lang.Exception -> L46
            boolean r13 = r13.historySecurityMobileCanLogin()     // Catch: java.lang.Exception -> L46
            if (r13 != 0) goto L71
            com.ali.user.mobile.rpc.HistoryAccount r13 = r14.mHistoryAccount     // Catch: java.lang.Exception -> L46
            java.lang.String r13 = r13.loginPhone     // Catch: java.lang.Exception -> L46
            boolean r13 = android.text.StringUtils.isEmpty(r13)     // Catch: java.lang.Exception -> L46
            if (r13 == 0) goto L71
            goto L7d
        L71:
            com.ali.user.mobile.rpc.HistoryAccount r13 = r14.mHistoryAccount     // Catch: java.lang.Exception -> L46
            java.lang.String r13 = r13.mobile     // Catch: java.lang.Exception -> L46
            boolean r13 = android.text.StringUtils.isEmpty(r13)     // Catch: java.lang.Exception -> L46
            if (r13 == 0) goto L7c
            goto L7d
        L7c:
            r9 = r7
        L7d:
            if (r9 == 0) goto L83
            r14.switchToRecommendLogin(r15)     // Catch: java.lang.Exception -> L46
            return
        L83:
            com.ali.user.mobile.common.api.LoginApprearanceExtensions r7 = com.ali.user.mobile.common.api.AliUserLogin.getAppreanceExtentions()     // Catch: java.lang.Exception -> L46
            android.support.v4.app.Fragment r7 = r14.getMobileFragment(r7)     // Catch: java.lang.Exception -> L46
            android.os.Bundle r13 = new android.os.Bundle     // Catch: java.lang.Exception -> L46
            r13.<init>()     // Catch: java.lang.Exception -> L46
            r13.putBoolean(r0, r10)     // Catch: java.lang.Exception -> L46
            r13.putBoolean(r5, r9)     // Catch: java.lang.Exception -> L46
            r13.putString(r4, r8)     // Catch: java.lang.Exception -> L46
            r13.putBoolean(r1, r12)     // Catch: java.lang.Exception -> L46
            boolean r0 = android.text.StringUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L46
            if (r0 != 0) goto Lb0
            r13.putBoolean(r2, r11)     // Catch: java.lang.Exception -> L46
            java.lang.String r0 = "startTime"
            long r1 = r14.startTime     // Catch: java.lang.Exception -> L46
            r13.putLong(r0, r1)     // Catch: java.lang.Exception -> L46
            r13.putString(r3, r6)     // Catch: java.lang.Exception -> L46
        Lb0:
            java.lang.String r0 = "supportOverseaSimLogin"
            com.ali.user.mobile.login.model.AppLaunchInfoResponseData r1 = r14.fireAppLaunchRes     // Catch: java.lang.Exception -> L46
            boolean r1 = com.ali.user.mobile.utils.CountryUtil.supportOverseaSimLogin(r1)     // Catch: java.lang.Exception -> L46
            r13.putBoolean(r0, r1)     // Catch: java.lang.Exception -> L46
            r7.setArguments(r13)     // Catch: java.lang.Exception -> L46
            java.lang.String r0 = "aliuser_mobile_login"
            r14.addFragment(r15, r7, r0)     // Catch: java.lang.Exception -> L46
            return
        Lc5:
            r14.switchToRecommendLogin(r15)     // Catch: java.lang.Exception -> L46
            return
        Lc9:
            r15.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.login.ui.UserLoginActivity.gotoMobileLoginFragment(android.content.Intent):void");
    }

    public Fragment getMobileFragment(LoginApprearanceExtensions loginApprearanceExtensions) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("9dbd06e4", new Object[]{this, loginApprearanceExtensions}) : new TaobaoMobileHistoryFragment();
    }

    public Fragment getUserLoginFragment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("98165001", new Object[]{this}) : new TaobaoUserLoginFragment();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056 A[Catch: Exception -> 0x004a, TryCatch #1 {Exception -> 0x004a, blocks: (B:28:0x0056, B:31:0x005b, B:33:0x006a, B:38:0x0076, B:40:0x007a, B:42:0x008c, B:43:0x009a, B:45:0x00af, B:26:0x0051), top: B:51:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[Catch: Exception -> 0x004a, TryCatch #1 {Exception -> 0x004a, blocks: (B:28:0x0056, B:31:0x005b, B:33:0x006a, B:38:0x0076, B:40:0x007a, B:42:0x008c, B:43:0x009a, B:45:0x00af, B:26:0x0051), top: B:51:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a A[Catch: Exception -> 0x004a, TryCatch #1 {Exception -> 0x004a, blocks: (B:28:0x0056, B:31:0x005b, B:33:0x006a, B:38:0x0076, B:40:0x007a, B:42:0x008c, B:43:0x009a, B:45:0x00af, B:26:0x0051), top: B:51:0x0051 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void gotoPwdLoginFragment(android.content.Intent r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            java.lang.String r3 = "check"
            java.lang.String r4 = "defaultTab"
            java.lang.String r5 = "ut_from_register"
            java.lang.String r6 = "PARAM_LOGIN_PARAM"
            java.lang.String r7 = "account"
            java.lang.String r8 = "forceNormalMode"
            java.lang.String r9 = ""
            com.android.alibaba.ip.runtime.IpChange r0 = com.ali.user.mobile.login.ui.UserLoginActivity.$ipChange
            boolean r10 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r11 = 1
            r12 = 0
            if (r10 == 0) goto L28
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r12] = r1
            r3[r11] = r2
            java.lang.String r2 = "374716e3"
            r0.ipc$dispatch(r2, r3)
            return
        L28:
            boolean r10 = r2.getBooleanExtra(r8, r12)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r13 = r2.getStringExtra(r7)     // Catch: java.lang.Throwable -> L47
            java.lang.String r9 = r2.getStringExtra(r6)     // Catch: java.lang.Throwable -> L45
            boolean r14 = r2.getBooleanExtra(r5, r12)     // Catch: java.lang.Throwable -> L45
            int r15 = r2.getIntExtra(r4, r12)     // Catch: java.lang.Throwable -> L43
            boolean r12 = r2.getBooleanExtra(r3, r12)     // Catch: java.lang.Throwable -> L41
            goto L54
        L41:
            r0 = move-exception
            goto L51
        L43:
            r0 = move-exception
            goto L50
        L45:
            r0 = move-exception
            goto L4f
        L47:
            r0 = move-exception
            r13 = r9
            goto L4f
        L4a:
            r0 = move-exception
            goto Lb3
        L4c:
            r0 = move-exception
            r13 = r9
            r10 = 0
        L4f:
            r14 = 0
        L50:
            r15 = 0
        L51:
            r0.printStackTrace()     // Catch: java.lang.Exception -> L4a
        L54:
            if (r10 != 0) goto Laf
            com.ali.user.mobile.rpc.HistoryAccount r0 = r1.mHistoryAccount     // Catch: java.lang.Exception -> L4a
            if (r0 != 0) goto L5b
            goto Laf
        L5b:
            android.support.v4.app.Fragment r0 = r17.getUserLoginFragment()     // Catch: java.lang.Exception -> L4a
            android.os.Bundle r11 = new android.os.Bundle     // Catch: java.lang.Exception -> L4a
            r11.<init>()     // Catch: java.lang.Exception -> L4a
            r16 = r10
            com.ali.user.mobile.rpc.HistoryAccount r10 = r1.mHistoryAccount     // Catch: java.lang.Exception -> L4a
            if (r10 == 0) goto L72
            com.ali.user.mobile.rpc.HistoryAccount r10 = r1.mHistoryAccount     // Catch: java.lang.Exception -> L4a
            int r10 = r10.hasPwd     // Catch: java.lang.Exception -> L4a
            if (r10 != 0) goto L72
            r10 = 1
            goto L74
        L72:
            r10 = r16
        L74:
            if (r10 == 0) goto L7a
            r17.switchToRecommendLogin(r18)     // Catch: java.lang.Exception -> L4a
            return
        L7a:
            r11.putBoolean(r3, r12)     // Catch: java.lang.Exception -> L4a
            r11.putBoolean(r8, r10)     // Catch: java.lang.Exception -> L4a
            r11.putInt(r4, r15)     // Catch: java.lang.Exception -> L4a
            r11.putString(r7, r13)     // Catch: java.lang.Exception -> L4a
            boolean r3 = android.text.StringUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L4a
            if (r3 != 0) goto L9a
            r11.putBoolean(r5, r14)     // Catch: java.lang.Exception -> L4a
            java.lang.String r3 = "startTime"
            long r4 = r1.startTime     // Catch: java.lang.Exception -> L4a
            r11.putLong(r3, r4)     // Catch: java.lang.Exception -> L4a
            r11.putString(r6, r9)     // Catch: java.lang.Exception -> L4a
        L9a:
            java.lang.String r3 = "supportOverseaSimLogin"
            com.ali.user.mobile.login.model.AppLaunchInfoResponseData r4 = r1.fireAppLaunchRes     // Catch: java.lang.Exception -> L4a
            boolean r4 = com.ali.user.mobile.utils.CountryUtil.supportOverseaSimLogin(r4)     // Catch: java.lang.Exception -> L4a
            r11.putBoolean(r3, r4)     // Catch: java.lang.Exception -> L4a
            r0.setArguments(r11)     // Catch: java.lang.Exception -> L4a
            java.lang.String r3 = "aliuser_pwd_login"
            r1.addFragment(r2, r0, r3)     // Catch: java.lang.Exception -> L4a
            return
        Laf:
            r17.switchToRecommendLogin(r18)     // Catch: java.lang.Exception -> L4a
            return
        Lb3:
            r0.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.login.ui.UserLoginActivity.gotoPwdLoginFragment(android.content.Intent):void");
    }

    public void switchToTargetAccountLogin(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265a2de0", new Object[]{this, intent});
        } else {
            CoordinatorWrapper.executeSafely(new NewLoginPreCheckTask(this, intent), new Object[0]);
        }
    }

    public boolean switchToRecommendLogin(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a85bf404", new Object[]{this, intent})).booleanValue();
        }
        try {
            Fragment taobaoRecommendLoginFragment = new TaobaoRecommendLoginFragment();
            String stringExtra = intent.getStringExtra(LoginConstant.CURRENT_LOGIN_MODE_STATE);
            if (CountryUtil.supportOverseaSimLogin(this.fireAppLaunchRes)) {
                LoginTLogAdapter.e(TAG, "fromOversea priority pwd");
                intent.putExtra("supportOverseaSimLogin", true);
                if (StringUtils.isEmpty(stringExtra)) {
                    intent.putExtra(LoginConstant.CURRENT_LOGIN_MODE_STATE, LoginModeState.SMS_LOGIN.name());
                }
            }
            if (DataProviderFactory.getDataProvider().isForigenLocation() && displayOversea()) {
                intent.putExtra(LoginConstant.CURRENT_LOGIN_MODE_STATE, LoginModeState.SMS_LOGIN.name());
                taobaoRecommendLoginFragment = new OverseaLoginFragment();
            }
            taobaoRecommendLoginFragment.setArguments(intent.getExtras());
            addFragment(intent, taobaoRecommendLoginFragment, FragmentConstant.RECOMMEND_LOGIN_FRAGMENT_TAG);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void setBackground(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a7e1fd", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mTopRectangle = findViewById(R.id.aliuser_top_rectangle);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.setStatusBarColor(0);
        }
        if (z) {
            View view = this.mTopRectangle;
            if (view != null) {
                view.setVisibility(0);
            }
            setTranslucentStatus();
            if (getSupportActionBar() != null) {
                getSupportActionBar().e();
            }
            this.mBackBtn = findViewById(R.id.aliuser_custom_back);
            View view2 = this.mBackBtn;
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.UserLoginActivity.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                        } else {
                            UserLoginActivity.this.onBackPressed();
                        }
                    }
                });
            }
            this.mHelpTV = findViewById(R.id.aliuser_custom_help);
            View view3 = this.mHelpTV;
            if (view3 != null) {
                view3.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.UserLoginActivity.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view4});
                        } else {
                            AliUserRegisterActivity.goRegHelp(UserLoginActivity.this);
                        }
                    }
                });
            }
            this.mTopRectangle.setBackgroundColor(getResources().getColor(R.color.aliuser_oversea_color));
            String country = LanguageUtil.getCountry();
            String regBgImage = getRegBgImage(this.fireAppLaunchRes);
            if (!StringUtils.isEmpty(regBgImage) && LoginSwitch.getSwitch("use_server_image", "true")) {
                ImageUtil.updateBackground(this.mTopRectangle, regBgImage);
                return;
            }
            ImageUtil.updateBackground(this.mTopRectangle, LoginSwitch.getConfig("oversea_bg_" + country, "https://gw.alicdn.com/imgextra/i2/O1CN01jBQTog1Ip1fGwZ5eY_!!6000000000941-2-tps-1125-668.png"));
            return;
        }
        View view4 = this.mTopRectangle;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        if (getSupportActionBar() == null) {
            return;
        }
        getSupportActionBar().d();
    }

    public boolean gotoQrcodeFragment(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c94aec09", new Object[]{this, intent})).booleanValue();
        }
        try {
            TaobaoQrLoginFragment taobaoQrLoginFragment = new TaobaoQrLoginFragment();
            taobaoQrLoginFragment.setArguments(intent.getExtras());
            addFragment(intent, taobaoQrLoginFragment, FragmentConstant.QRCODE_LOGIN_FRAGMENT_TAG);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public void goToSMSVerificationPage(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01ef784", new Object[]{this, intent});
        } else {
            NavigatorManager.getInstance().navToSMSCodePage(getApplicationContext(), intent == null ? new Bundle() : intent.getExtras());
        }
    }

    public void addFragment(Intent intent, Fragment fragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("962c2207", new Object[]{this, intent, fragment, str});
            return;
        }
        hideAllFragment();
        Fragment findFragmentByTag = this.mFragmentManager.findFragmentByTag(str);
        if (findFragmentByTag != null) {
            this.mFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
        this.mFragmentManager.beginTransaction().add(R.id.aliuser_content_frame, fragment, str).commitAllowingStateLoss();
        this.mFragmentManager.beginTransaction().show(fragment).commitAllowingStateLoss();
        this.mCurrentFragmentTag = str;
    }

    public void hideAllFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32c9176", new Object[]{this});
            return;
        }
        for (String str : FragmentConstant.getFragmentTagList()) {
            Fragment findFragmentByTag = this.mFragmentManager.findFragmentByTag(str);
            if (findFragmentByTag != null) {
                this.mFragmentManager.beginTransaction().hide(findFragmentByTag).commitAllowingStateLoss();
            }
        }
    }

    private void sendCancelBroadcast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("330477c6", new Object[]{this});
        } else {
            BroadCastHelper.sendLocalBroadCast(new Intent(Constants.RESET_LOGIN_STATUS));
        }
    }

    public void finishCurrentAndNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76091cc1", new Object[]{this});
            return;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null && !fragmentManager.isDestroyed()) {
            LoginApprearanceExtensions appreanceExtentions = AliUserLogin.getAppreanceExtentions();
            if (appreanceExtentions != null && appreanceExtentions.getFullyCustomizeGuideFragment() != null && this.supportTaobaoOrAlipay && !StringUtils.equals(this.mCurrentFragmentTag, FragmentConstant.GUIDE_FRAGMENT_TAG) && this.mOpenGuide) {
                gotoGuideFragment(null, AliUserLogin.getAppreanceExtentions());
                return;
            }
            Fragment findFragmentByTag = this.mFragmentManager.findFragmentByTag(this.mCurrentFragmentTag);
            if ((findFragmentByTag instanceof BaseFragment) && ((BaseFragment) findFragmentByTag).onBackPressed()) {
                return;
            }
        }
        doFinishThing();
    }

    public void doFinishThing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("991f8f17", new Object[]{this});
            return;
        }
        if (LoginContext.uninstallResponse != null) {
            int strategy = StrategyHelper.getStrategy("reinstall_login");
            boolean z = LoginContext.uninstallType == 2;
            UserTrackAdapter.sendExtendUT(StrategyHelper.getUtArg1(strategy, "reinstall_login_"), z ? "sim" : "oppo");
            if (strategy == 2) {
                boolean processAutoLoginResponse = LoginController.getInstance().processAutoLoginResponse(LoginContext.uninstallResponse, false, true, null);
                LoginContext.uninstallResponse = null;
                LoginContext.uninstallType = 0;
                if (processAutoLoginResponse) {
                    if (z) {
                        Properties properties = new Properties();
                        properties.put("sFrom", "fromUserLoginActivity");
                        UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "fromUserLoginActivity", LoginType.LocalLoginType.LOGIN_TYPE_UMID, properties);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("sFrom", "fromUserLoginActivity");
                    UserTrackAdapter.sendUserTrack("page_login_restore_session", "restore_session_success", hashMap);
                    return;
                }
            } else {
                LoginContext.uninstallResponse = null;
                LoginContext.uninstallType = 0;
            }
        }
        BroadCastHelper.sendLocalBroadCast(new Intent(LoginResActions.LOGIN_CANCEL_ACTION));
        try {
            if (isFinishing()) {
                return;
            }
            UserTrackAdapter.sendUT(getPageName(), "handle_login_close_page");
            finish();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        fragmentOnActivityResult(i, i2, intent);
    }

    public void fragmentOnActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba18d6df", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        Fragment findFragmentByTag = this.mFragmentManager.findFragmentByTag(this.mCurrentFragmentTag);
        if (findFragmentByTag == null || !findFragmentByTag.isVisible()) {
            return;
        }
        findFragmentByTag.onActivityResult(i, i2, intent);
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public void finishWhenLoginSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae22c6e", new Object[]{this});
        } else {
            finish();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        TBS.Page.buttonClicked("Button_back");
        finishCurrentAndNotify();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        try {
            super.onStart();
        } catch (Throwable th) {
            th.printStackTrace();
            finish();
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        Login.isLoginActResume = true;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        try {
            callPageDisAppear();
            super.onPause();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void callPageDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d40c1bd", new Object[]{this});
        } else {
            UserTrackAdapter.pageDisAppear(this);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        try {
            super.onStop();
            Login.isLoginActResume = false;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        if (AliUserLogin.getAppreanceExtentions() == null || AliUserLogin.getAppreanceExtentions().getActivityExitAnimation() <= 0) {
            return;
        }
        overridePendingTransition(0, AliUserLogin.getAppreanceExtentions().getActivityExitAnimation());
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        try {
            Login.isLoginActResume = false;
            sendCancelBroadcast();
            this.mFragmentManager = null;
            this.hadReadHistory = false;
            this.mHistoryAccount = null;
            super.onDestroy();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* loaded from: classes2.dex */
    public static class NewLoginPreCheckTask extends AsyncTask<Object, Void, LoginHistory> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<UserLoginActivity> activityReference;
        private Intent mIntent;

        static {
            kge.a(405931799);
        }

        public static /* synthetic */ Object ipc$super(NewLoginPreCheckTask newLoginPreCheckTask, String str, Object... objArr) {
            if (str.hashCode() == -2026216808) {
                super.onPreExecute();
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public NewLoginPreCheckTask(UserLoginActivity userLoginActivity, Intent intent) {
            this.activityReference = new WeakReference<>(userLoginActivity);
            this.mIntent = intent;
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("873a6298", new Object[]{this});
                return;
            }
            super.onPreExecute();
            UserLoginActivity userLoginActivity = this.activityReference.get();
            if (userLoginActivity == null || userLoginActivity.isFinishing()) {
                return;
            }
            userLoginActivity.showProgress("");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.AsyncTask
        /* renamed from: doInBackground */
        public LoginHistory mo101doInBackground(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoginHistory) ipChange.ipc$dispatch("1b7d89dc", new Object[]{this, objArr});
            }
            UserLoginActivity userLoginActivity = this.activityReference.get();
            if (userLoginActivity == null || userLoginActivity.isFinishing()) {
                return null;
            }
            LoginHistory access$000 = UserLoginActivity.access$000(userLoginActivity, this.mIntent);
            userLoginActivity.mLoginHistory = access$000;
            userLoginActivity.startOpenTime = System.currentTimeMillis();
            try {
                userLoginActivity.mAlipayInstall = AlipayAuth.isSupportAlipay(userLoginActivity);
                userLoginActivity.getOpenPageStrategy(this.mIntent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return access$000;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(LoginHistory loginHistory) {
            boolean z;
            boolean z2;
            IpChange ipChange = $ipChange;
            boolean z3 = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5e83d4f", new Object[]{this, loginHistory});
                return;
            }
            UserLoginActivity userLoginActivity = this.activityReference.get();
            if (userLoginActivity == null || userLoginActivity.isFinishing()) {
                return;
            }
            userLoginActivity.dismissProgressDialog();
            try {
                z = this.mIntent.getBooleanExtra(LoginConstant.FORCE_NORMAL_MODE, false);
            } catch (Throwable th) {
                th = th;
                z = false;
            }
            try {
                z2 = this.mIntent.getBooleanExtra(LoginConstant.LAUNCH_PASS_GUIDE_FRAGMENT, false);
            } catch (Throwable th2) {
                th = th2;
                th.printStackTrace();
                z2 = false;
                if (userLoginActivity.supportMultiLogoutList(loginHistory)) {
                }
                z3 = false;
                if (z3) {
                }
                UserLoginActivity.access$100(userLoginActivity, this.mIntent);
            }
            if (userLoginActivity.supportMultiLogoutList(loginHistory) || z2) {
                z3 = false;
            }
            if (z3 && !z && userLoginActivity.openFragmentByAppLaunch(this.mIntent)) {
                LoginTLogAdapter.e(UserLoginActivity.TAG, "openFragmentByAppLaunch");
            } else {
                UserLoginActivity.access$100(userLoginActivity, this.mIntent);
            }
        }
    }

    public boolean openFragmentByAppLaunch(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c75cd44b", new Object[]{this, intent})).booleanValue();
        }
        AppLaunchInfoResponseData appLaunchInfoResponseData = this.fireAppLaunchRes;
        if (appLaunchInfoResponseData != null && appLaunchInfoResponseData.returnValue != 0 && ((AppLaunchInfo) this.fireAppLaunchRes.returnValue).sortedRecommendLoginTypes != null) {
            List<String> list = ((AppLaunchInfo) this.fireAppLaunchRes.returnValue).sortedRecommendLoginTypes;
            this.otherLoginType = ((AppLaunchInfo) this.fireAppLaunchRes.returnValue).otherLoginType;
            if (((AppLaunchInfo) this.fireAppLaunchRes.returnValue).loginValidators != null) {
                this.isFaceLoginActivate = ((AppLaunchInfo) this.fireAppLaunchRes.returnValue).loginValidators.verify;
                this.isFaceLoginEnvEnable = ((AppLaunchInfo) this.fireAppLaunchRes.returnValue).loginValidators.preCheckVerify;
            }
            this.isMobileAvailable = ((AppLaunchInfo) this.fireAppLaunchRes.returnValue).mobileAvailable;
            if (((AppLaunchInfo) this.fireAppLaunchRes.returnValue).testValue != null) {
                this.mShowRegTV = ((AppLaunchInfo) this.fireAppLaunchRes.returnValue).testValue.isRegOpen;
            }
            if (((AppLaunchInfo) this.fireAppLaunchRes.returnValue).userNotFound && this.mHistoryAccount != null) {
                UserTrackAdapter.sendUT("userNotFound");
                SecurityGuardManagerWraper.removeSessionModelFromFile(String.valueOf(this.mHistoryAccount.userId));
                SecurityGuardManagerWraper.removeHistoryAccount(SecurityGuardManagerWraper.findHistoryAccount(this.mHistoryAccount.userId));
                this.mHistoryAccount = null;
            }
            this.isPad = ((AppLaunchInfo) this.fireAppLaunchRes.returnValue).pad;
            UserTrackAdapter.sendExtendUT("server_pad", String.valueOf(this.isPad));
            if (!((AppLaunchInfo) this.fireAppLaunchRes.returnValue).biometricOpen) {
                UserTrackAdapter.sendUT("biometricOpenFalse");
                this.mBiometricToken = "";
            }
            this.mUserOpenFaceLogin = this.isFaceLoginActivate && ServiceFactory.getService(FaceService.class) != null;
            if (displayOversea()) {
                switchToRecommendLogin(intent);
                return true;
            } else if (list.size() > 0) {
                LoginTLogAdapter.e(TAG, "recommend: " + JSON.toJSONString(list));
                try {
                    UserTrackAdapter.sendUT(getPageName(), ag.CLICK_SHOWRECOMMEND, JSON.toJSONString(list), null);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (openRecommendPage(intent, list)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean openRecommendPage(Intent intent, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("992449fa", new Object[]{this, intent, list})).booleanValue();
        }
        for (String str : list) {
            if (goFragmentByType(str, intent, (AppLaunchInfo) this.fireAppLaunchRes.returnValue)) {
                Log.e(TAG, "openRecommendPage: type=" + str);
                return true;
            }
        }
        return false;
    }

    public void openLoginPageFromQrLogin(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ccab4", new Object[]{this, intent});
            return;
        }
        AppLaunchInfoResponseData appLaunchInfoResponseData = this.fireAppLaunchRes;
        if (appLaunchInfoResponseData != null && appLaunchInfoResponseData.returnValue != 0 && ((AppLaunchInfo) this.fireAppLaunchRes.returnValue).sortedRecommendLoginTypes != null && ((AppLaunchInfo) this.fireAppLaunchRes.returnValue).sortedRecommendLoginTypes.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 1; i < ((AppLaunchInfo) this.fireAppLaunchRes.returnValue).sortedRecommendLoginTypes.size(); i++) {
                arrayList.add(((AppLaunchInfo) this.fireAppLaunchRes.returnValue).sortedRecommendLoginTypes.get(i));
            }
            if (arrayList.size() > 0 && openRecommendPage(intent, arrayList)) {
                LoginTLogAdapter.e(TAG, "QrLoginOpenOther by server recommendList");
                return;
            }
        }
        openFragmentByIntent(intent);
    }

    public void getOpenPageStrategy(Intent intent) {
        LoginHistory loginHistory;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcf19e46", new Object[]{this, intent});
            return;
        }
        String stringExtra = intent.getStringExtra(LoginConstant.TARGET_HID);
        HistoryAccount historyAccount = this.mHistoryAccount;
        if (!StringUtils.isEmpty(stringExtra) && (loginHistory = this.mLoginHistory) != null) {
            historyAccount = SecurityGuardManagerWraper.getTargetAccount(loginHistory, stringExtra);
            this.mHistoryAccount = historyAccount;
        }
        getRecommendByID(historyAccount);
    }

    private void getRecommendByID(HistoryAccount historyAccount) {
        AppLaunchInfo appLaunchInfo;
        AppLaunchInfo appLaunchInfo2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fca4cc83", new Object[]{this, historyAccount});
            return;
        }
        String valueOf = historyAccount != null ? String.valueOf(historyAccount.userId) : "*";
        this.fireAppLaunchRes = getPreLoginInfo(valueOf);
        if (this.fireAppLaunchRes == null && LoginSwitch.getSwitch(LoginSwitch.FIRE_APP_LAUNCH, "true")) {
            LoginParam loginParam = getLoginParam(this);
            try {
                if (this.isFromAddAccount) {
                    historyAccount = null;
                }
                this.fireAppLaunchRes = RecommendLoginPresenter.fireAppLaunchRequest(loginParam, historyAccount);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            AppLaunchInfoResponseData appLaunchInfoResponseData = this.fireAppLaunchRes;
            if (appLaunchInfoResponseData != null && (appLaunchInfo2 = (AppLaunchInfo) appLaunchInfoResponseData.returnValue) != null) {
                LoginStatus.loginTrackInfo = appLaunchInfo2.loginTrackInfo;
                this.fireAppLaunchRes.calTime = appLaunchInfo2.expireTime + (System.currentTimeMillis() / 1000);
                this.fireAppLaunchRes.appVersion = AppInfo.getInstance().getAppVersion();
                putPreLoginInfo(valueOf, this.fireAppLaunchRes);
            }
        }
        AppLaunchInfoResponseData appLaunchInfoResponseData2 = this.fireAppLaunchRes;
        if (appLaunchInfoResponseData2 == null || (appLaunchInfo = (AppLaunchInfo) appLaunchInfoResponseData2.returnValue) == null) {
            return;
        }
        RegionInfo currentRegion = DataProviderFactory.getDataProvider().getCurrentRegion();
        if (!StringUtils.isEmpty(appLaunchInfo.countryCode)) {
            currentRegion.domain = appLaunchInfo.countryCode;
        }
        if (!StringUtils.isEmpty(appLaunchInfo.phoneCode)) {
            currentRegion.code = appLaunchInfo.phoneCode;
        }
        if (StringUtils.isEmpty(appLaunchInfo.checkPattern)) {
            return;
        }
        currentRegion.checkPattern = appLaunchInfo.checkPattern;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void putPreLoginInfo(java.lang.String r5, com.ali.user.mobile.login.model.AppLaunchInfoResponseData r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.ali.user.mobile.login.ui.UserLoginActivity.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            r5 = 1
            r1[r5] = r6
            java.lang.String r5 = "fe4489b4"
            r0.ipc$dispatch(r5, r1)
            return
        L15:
            if (r5 == 0) goto L8a
            if (r6 != 0) goto L1a
            goto L8a
        L1a:
            android.content.Context r0 = com.ali.user.mobile.app.dataprovider.DataProviderFactory.getApplicationContext()
            java.lang.String r1 = com.ali.user.mobile.login.model.LoginConstant.FILE_NAME
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "preinfo"
            java.lang.String r2 = ""
            java.lang.String r2 = r0.getString(r1, r2)
            r3 = 0
            boolean r4 = android.text.StringUtils.isEmpty(r2)
            if (r4 != 0) goto L40
            java.lang.Class<com.ali.user.mobile.login.model.AppLaunchList> r4 = com.ali.user.mobile.login.model.AppLaunchList.class
            java.lang.Object r2 = com.alibaba.fastjson.JSON.parseObject(r2, r4)     // Catch: java.lang.Throwable -> L3c
            com.ali.user.mobile.login.model.AppLaunchList r2 = (com.ali.user.mobile.login.model.AppLaunchList) r2     // Catch: java.lang.Throwable -> L3c
            goto L41
        L3c:
            r2 = move-exception
            r2.printStackTrace()
        L40:
            r2 = r3
        L41:
            if (r2 != 0) goto L48
            com.ali.user.mobile.login.model.AppLaunchList r2 = new com.ali.user.mobile.login.model.AppLaunchList
            r2.<init>()
        L48:
            java.util.HashMap<java.lang.String, com.ali.user.mobile.login.model.AppLaunchInfoResponseData> r3 = r2.launchData
            if (r3 != 0) goto L53
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2.launchData = r3
        L53:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "prelogininfo: put key =  "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r4 = ",responseData = "
            r3.append(r4)
            java.lang.String r4 = com.alibaba.fastjson.JSON.toJSONString(r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "login.UserLoginActivity"
            com.taobao.login4android.log.LoginTLogAdapter.e(r4, r3)
            java.util.HashMap<java.lang.String, com.ali.user.mobile.login.model.AppLaunchInfoResponseData> r3 = r2.launchData
            r3.put(r5, r6)
            if (r0 == 0) goto L8a
            android.content.SharedPreferences$Editor r5 = r0.edit()
            java.lang.String r6 = com.alibaba.fastjson.JSON.toJSONString(r2)
            r5.putString(r1, r6)
            r5.apply()
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.login.ui.UserLoginActivity.putPreLoginInfo(java.lang.String, com.ali.user.mobile.login.model.AppLaunchInfoResponseData):void");
    }

    public static AppLaunchInfoResponseData getPreLoginInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppLaunchInfoResponseData) ipChange.ipc$dispatch("ee915393", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        String string = DataProviderFactory.getApplicationContext().getSharedPreferences(LoginConstant.FILE_NAME, 0).getString("preinfo", "");
        if (!StringUtils.isEmpty(string)) {
            LoginTLogAdapter.e(TAG, "prelogininfo: key=" + str + ",list = " + string);
            try {
                AppLaunchList appLaunchList = (AppLaunchList) JSON.parseObject(string, AppLaunchList.class);
                if (appLaunchList != null && appLaunchList.launchData != null && appLaunchList.launchData.size() > 0) {
                    for (String str2 : appLaunchList.launchData.keySet()) {
                        if (StringUtils.equals(str2, str)) {
                            LoginTLogAdapter.e(TAG, "prelogininfo: hit key " + str);
                            AppLaunchInfoResponseData appLaunchInfoResponseData = appLaunchList.launchData.get(str);
                            if (appLaunchInfoResponseData.returnValue == 0) {
                                return null;
                            }
                            String appVersion = AppInfo.getInstance().getAppVersion();
                            if (!StringUtils.equals(appVersion, appLaunchInfoResponseData.appVersion)) {
                                LoginTLogAdapter.e(TAG, "prelogininfo:  expired!" + str + ",old appVersion= " + appLaunchInfoResponseData.appVersion + ", new AppVersion =" + appVersion);
                                return null;
                            } else if (System.currentTimeMillis() / 1000 < appLaunchInfoResponseData.calTime) {
                                LoginTLogAdapter.e(TAG, "prelogininfo: not expired!" + str + ",expiredTime= " + ((AppLaunchInfo) appLaunchInfoResponseData.returnValue).expireTime + ", calTime=" + appLaunchInfoResponseData.calTime);
                                return appLaunchInfoResponseData;
                            } else {
                                LoginTLogAdapter.e(TAG, "prelogininfo: expired! key= " + str + ",expiredTime = " + ((AppLaunchInfo) appLaunchInfoResponseData.returnValue).expireTime + ", calTime=" + appLaunchInfoResponseData.calTime);
                            }
                        } else {
                            LoginTLogAdapter.e(TAG, "prelogininfo: missed key " + str);
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            LoginTLogAdapter.e(TAG, "prelogininfo: list is empty");
        }
        return null;
    }

    public boolean supportPad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("31b334cf", new Object[]{this})).booleanValue() : this.isPad && DataProviderFactory.getDataProvider().supportQrLogin() && AliUserLogin.getAppreanceExtentions() != null && AliUserLogin.getAppreanceExtentions().getFullyCustomizedQrcodeFragment() != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean goFragmentByType(java.lang.String r12, android.content.Intent r13, com.ali.user.mobile.login.model.AppLaunchInfo r14) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.login.ui.UserLoginActivity.goFragmentByType(java.lang.String, android.content.Intent, com.ali.user.mobile.login.model.AppLaunchInfo):boolean");
    }

    public Properties getProperty(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Properties) ipChange.ipc$dispatch("6e56c23", new Object[]{this, intent});
        }
        Properties properties = new Properties();
        if (intent != null && !StringUtils.isEmpty(intent.getStringExtra("scene"))) {
            properties.put("pn_scene", intent.getStringExtra("scene"));
        }
        return properties;
    }

    public void gotoFingerPage(Intent intent) {
        try {
            Fragment fragment = (Fragment) getFingerFragment().newInstance();
            if (intent != null) {
                fragment.setArguments(intent.getExtras());
            }
            addFragment(intent, fragment, FragmentConstant.FINGER_FRAGMENT);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void goAlipayHistory(Intent intent) {
        try {
            Fragment fragment = (Fragment) getAlipayHistoryFragment().newInstance();
            if (intent != null) {
                fragment.setArguments(intent.getExtras());
            }
            addFragment(intent, fragment, FragmentConstant.ALIPAY_HISTORY_FRAGMENT_TAG);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void goAlipayFragment(Intent intent) {
        try {
            Fragment fragment = (Fragment) getAlipayFragment().newInstance();
            if (intent != null) {
                fragment.setArguments(intent.getExtras());
            }
            addFragment(intent, fragment, FragmentConstant.ALIPAY_FRAGMENT_TAG);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public Class<?> getAlipayHistoryFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("290d46d8", new Object[]{this});
        }
        if (AliUserLogin.getAppreanceExtentions() != null) {
            return AliUserLogin.getAppreanceExtentions().getFullyCustomizedAlipayHistoryFragment();
        }
        return null;
    }

    public Class<?> getFingerFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3a8a4783", new Object[]{this});
        }
        if (AliUserLogin.getAppreanceExtentions() != null) {
            return AliUserLogin.getAppreanceExtentions().getFingerFragment();
        }
        return null;
    }

    public Class<?> getAlipayFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("b42d02e4", new Object[]{this});
        }
        if (AliUserLogin.getAppreanceExtentions() != null) {
            return AliUserLogin.getAppreanceExtentions().getFullyCustomizedAlipayLoginFragment();
        }
        return null;
    }

    public boolean compareSuccess(Intent intent, AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58b73fb5", new Object[]{this, intent, appLaunchInfo})).booleanValue();
        }
        String str = "";
        if (intent != null) {
            try {
                str = intent.getStringExtra("number");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (StringUtils.isEmpty(str)) {
            UserTrackAdapter.sendUT(UTConstans.CustomEvent.UT_SIM_NOT_INTENT_EMPTY);
            return false;
        } else if (ServiceFactory.getService(NumberAuthService.class) != null) {
            Map<String, String> authInfoMap = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap();
            if (authInfoMap != null && authInfoMap.containsKey("number")) {
                String str2 = authInfoMap.get("number");
                if (appLaunchInfo == null || appLaunchInfo.deviceMaskMobiles == null || appLaunchInfo.deviceMaskMobiles.size() == 0 || appLaunchInfo.deviceMaskMobiles.contains(str2)) {
                    return true;
                }
                UserTrackAdapter.sendUT(UTConstans.CustomEvent.UT_SIM_NOT_IN_COMPARE_LIST);
                return false;
            }
            UserTrackAdapter.sendUT(UTConstans.CustomEvent.UT_SIM_NO_CACHE);
            return false;
        } else {
            UserTrackAdapter.sendUT(UTConstans.CustomEvent.SERVICE_EMPTY);
            return false;
        }
    }

    public boolean cacheOneKeyAndCompareSuccess(Intent intent) {
        Map<String, String> authInfoMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c09b262", new Object[]{this, intent})).booleanValue();
        }
        String str = "";
        if (intent != null) {
            try {
                str = intent.getStringExtra("number");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            authInfoMap = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if (authInfoMap.size() == 0) {
            return false;
        }
        String str2 = authInfoMap.get("number");
        if (!StringUtils.isEmpty(str2) && str2.length() > 7) {
            String substring = str2.substring(str2.lastIndexOf("*") + 1);
            if (!StringUtils.isEmpty(this.mHistoryAccount.loginPhone) && this.mHistoryAccount.loginPhone.endsWith(substring)) {
                return true;
            }
            if (!StringUtils.isEmpty(this.mHistoryAccount.mobile)) {
                if (this.mHistoryAccount.mobile.endsWith(substring)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean displayOversea() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9240cfe4", new Object[]{this})).booleanValue() : displayOversea(this.fireAppLaunchRes);
    }

    public static boolean displayOversea(AppLaunchInfoResponseData appLaunchInfoResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("832cc1ac", new Object[]{appLaunchInfoResponseData})).booleanValue();
        }
        if (LoginStatus.forceOversea || LoginSwitch.getSwitch("forceOversea", "false")) {
            return true;
        }
        boolean isForigenLocation = DataProviderFactory.getDataProvider().isForigenLocation();
        if (!LanguageUtil.isChineseLanguage()) {
            return true;
        }
        return isForigenLocation && appLaunchInfoResponseData != null && appLaunchInfoResponseData.returnValue != 0 && ((AppLaunchInfo) appLaunchInfoResponseData.returnValue).displayOverseaEntrance;
    }

    public static String getRegBgImage(AppLaunchInfoResponseData appLaunchInfoResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d939af7", new Object[]{appLaunchInfoResponseData});
        }
        if (appLaunchInfoResponseData != null && appLaunchInfoResponseData.returnValue != 0 && ((AppLaunchInfo) appLaunchInfoResponseData.returnValue).loginPageInfo != null) {
            return ((AppLaunchInfo) appLaunchInfoResponseData.returnValue).loginPageInfo.benefitImage;
        }
        return null;
    }

    public static boolean supportGoogleFB() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("446c742f", new Object[0])).booleanValue();
        }
        try {
            Class.forName("com.taobao.android.sns4android.SNSOverseaAuth");
            Class.forName("com.google.android.gms.auth.api.Auth");
            Class.forName("com.facebook.FacebookSdk");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void setTranslucentStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5071d070", new Object[]{this});
        } else {
            getWindow().getDecorView().setSystemUiVisibility(1280);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public int getLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28b929a", new Object[]{this})).intValue();
        }
        if (LanguageUtil.isChineseLanguage()) {
            return super.getLayout();
        }
        this.needAdjustToolbar = true;
        return R.layout.aliuser_activity_email;
    }

    public static AppLaunchInfoResponseData getAppLaunchData(Context context) {
        HistoryAccount historyAccount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppLaunchInfoResponseData) ipChange.ipc$dispatch("89cb0f11", new Object[]{context});
        }
        LoginParam loginParam = getLoginParam(context);
        LoginHistory loginHistory = SecurityGuardManagerWraper.getLoginHistory();
        AppLaunchInfoResponseData appLaunchInfoResponseData = null;
        if (loginHistory == null || loginHistory.accountHistory == null || loginHistory.accountHistory.size() <= 0) {
            historyAccount = null;
        } else {
            int i = loginHistory.index;
            if (i < 0 || i >= loginHistory.accountHistory.size()) {
                i = loginHistory.accountHistory.size() - 1;
            }
            historyAccount = loginHistory.accountHistory.get(i);
        }
        String valueOf = historyAccount != null ? String.valueOf(historyAccount.userId) : "*";
        AppLaunchInfoResponseData preLoginInfo = getPreLoginInfo(valueOf);
        if (preLoginInfo != null) {
            return preLoginInfo;
        }
        try {
            appLaunchInfoResponseData = RecommendLoginPresenter.fireAppLaunchRequest(loginParam, historyAccount);
            if (appLaunchInfoResponseData.returnValue != 0) {
                LoginStatus.loginTrackInfo = ((AppLaunchInfo) appLaunchInfoResponseData.returnValue).loginTrackInfo;
                appLaunchInfoResponseData.calTime = ((AppLaunchInfo) appLaunchInfoResponseData.returnValue).expireTime + (System.currentTimeMillis() / 1000);
                appLaunchInfoResponseData.appVersion = AppInfo.getInstance().getAppVersion();
                putPreLoginInfo(valueOf, appLaunchInfoResponseData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return appLaunchInfoResponseData;
    }

    private static LoginParam getLoginParam(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginParam) ipChange.ipc$dispatch("977a854c", new Object[]{context});
        }
        LoginParam loginParam = new LoginParam();
        loginParam.deviceLevel = getDeviceLevel();
        loginParam.alipayInstalled = iSupportAlipay(context);
        return loginParam;
    }

    public static boolean iSupportAlipay(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("141c5615", new Object[]{context})).booleanValue();
        }
        OauthService oauthService = (OauthService) AliMemberSDK.getService(OauthService.class);
        return oauthService != null && oauthService.isAppAuthSurpport(context, "alipay");
    }

    public static String getDeviceLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89e64461", new Object[0]);
        }
        try {
            int a2 = akt.a();
            LoginTLogAdapter.e(TAG, "deviceLevel = " + a2);
            return a2 == 0 ? "high" : a2 == 1 ? "medium" : "low";
        } catch (Exception e) {
            e.printStackTrace();
            return "unknow";
        }
    }

    public boolean shouldShowLoginBenefit() {
        AppLaunchInfoResponseData appLaunchInfoResponseData;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f4f839e9", new Object[]{this})).booleanValue() : (DataProviderFactory.getDataProvider().isForigenLocation() || (appLaunchInfoResponseData = this.fireAppLaunchRes) == null || appLaunchInfoResponseData.returnValue == 0 || ((AppLaunchInfo) this.fireAppLaunchRes.returnValue).loginPageInfo == null || StringUtils.isEmpty(((AppLaunchInfo) this.fireAppLaunchRes.returnValue).loginPageInfo.benefitTitle)) ? false : true;
    }
}
