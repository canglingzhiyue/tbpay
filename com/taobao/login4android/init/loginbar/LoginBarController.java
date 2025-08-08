package com.taobao.login4android.init.loginbar;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.login.model.AppLaunchInfo;
import com.ali.user.mobile.login.model.AppLaunchInfoResponseData;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.oauth.OauthService;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.orange.OrangeConfig;
import com.taobao.phenix.compat.effects.c;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class LoginBarController {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ALIPAY = 6;
    private static final int DEFAULT = 4;
    private static final String HOME_BENEFIT_FROM = "homepage_benefit_bar";
    private static final String HOME_FROM = "homepage_login_bar";
    private static final int LOGIN = 1;
    private static final String ORANGE_KEY = "login_bar_profile";
    private static final int REGISTER = 2;
    private static final int SIM_LOGIN = 3;
    public static final String TAG = "login.LoginBar";
    private static final int UMID_LOGIN = 5;
    public static boolean isGray;
    private static boolean isRegisterLoginResultBroadcast;
    private static WeakReference<View> loginBarCache;
    private static BroadcastReceiver mLoginReceiver;
    private static WeakReference<Activity> mainActivityCache;
    public static WeakReference<Activity> sWeakReference;

    /* renamed from: com.taobao.login4android.init.loginbar.LoginBarController$6  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass6 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17862a = new int[LoginAction.values().length];

        static {
            try {
                f17862a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[0]) : UTConstant.PageName.UT_PAGE_LOGIN_BAR;
    }

    public static /* synthetic */ boolean access$000(AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9c5c1540", new Object[]{appLaunchInfo})).booleanValue() : enableSearchBar(appLaunchInfo);
    }

    public static /* synthetic */ void access$100(Activity activity, int i, int i2, AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938d2e69", new Object[]{activity, new Integer(i), new Integer(i2), appLaunchInfo});
        } else {
            goLogin(activity, i, i2, appLaunchInfo);
        }
    }

    public static /* synthetic */ float access$200(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c85447b", new Object[]{activity})).floatValue() : density(activity);
    }

    public static /* synthetic */ WeakReference access$302(WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("c469f9b0", new Object[]{weakReference});
        }
        loginBarCache = weakReference;
        return weakReference;
    }

    public static /* synthetic */ Map access$400(int i, AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("9c054da0", new Object[]{new Integer(i), appLaunchInfo}) : getArgsByID(i, appLaunchInfo);
    }

    public static /* synthetic */ void access$500(String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53d72ab5", new Object[]{str, str2, map});
        } else {
            userTrace(str, str2, map);
        }
    }

    public static /* synthetic */ void access$600(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557eab5", new Object[]{view});
        } else {
            deleteBar(view);
        }
    }

    static {
        kge.a(965443690);
        isRegisterLoginResultBroadcast = false;
        isGray = false;
    }

    public static void addLoginBar(int i, Activity activity, FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab74714", new Object[]{new Integer(i), activity, fragmentManager});
        } else if (Login.checkSessionValid() || !StringUtils.isEmpty(Login.getLoginToken())) {
        } else {
            try {
                handleLoginBar(i, activity, fragmentManager, getLoginBarProfileStr(activity));
                registerLoginResult(i, activity);
            } catch (Throwable th) {
                th.printStackTrace();
                LoginTLogAdapter.e(TAG, th);
            }
        }
    }

    private static String getLoginBarProfileStr(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6758edf", new Object[]{activity});
        }
        String a2 = b.a(R.string.aliuser_default_bar);
        String language = getLanguage();
        String country = getCountry();
        OrangeConfig orangeConfig = OrangeConfig.getInstance();
        String config = orangeConfig.getConfig("login4android", "login_bar_profile_" + country + "_" + language, "");
        if (!StringUtils.isEmpty(config)) {
            return config;
        }
        OrangeConfig orangeConfig2 = OrangeConfig.getInstance();
        return orangeConfig2.getConfig("login4android", "login_bar_profile_" + language, a2);
    }

    public static void addLoginBar(int i, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24aebb23", new Object[]{new Integer(i), activity});
        } else if (Login.checkSessionValid() || !StringUtils.isEmpty(Login.getLoginToken())) {
        } else {
            try {
                handleLoginBar(i, activity, null, getLoginBarProfileStr(activity));
            } catch (Throwable th) {
                th.printStackTrace();
                LoginTLogAdapter.e(TAG, th);
            }
        }
    }

    private static void handleLoginBar(int i, Activity activity, FragmentManager fragmentManager, String str) {
        LoginBarProfile loginBarProfile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48eab7b7", new Object[]{new Integer(i), activity, fragmentManager, str});
            return;
        }
        getGray();
        LoginBarProfile loginBarProfile2 = new LoginBarProfile();
        try {
            loginBarProfile = (LoginBarProfile) JSON.parseObject(str, LoginBarProfile.class);
        } catch (Throwable th) {
            th.printStackTrace();
            loginBarProfile = loginBarProfile2;
        }
        addLoginBarInMainActivity2(i, activity, fragmentManager, loginBarProfile);
    }

    public static void getGray() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("823e62e0", new Object[0]);
            return;
        }
        int i = LoginSwitch.getSwitch("loginBarGrayStyleStartTime", Integer.MAX_VALUE);
        int i2 = LoginSwitch.getSwitch("loginBarGrayStyleEndTime", -1);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (currentTimeMillis > i && currentTimeMillis < i2) {
            z = true;
        }
        isGray = z;
    }

    private static void addLoginBarInMainActivity2(final int i, final Activity activity, final FragmentManager fragmentManager, final LoginBarProfile loginBarProfile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8106bc99", new Object[]{new Integer(i), activity, fragmentManager, loginBarProfile});
        } else if (LoginSwitch.getSwitch("login_bar_check_server", "true")) {
            CoordinatorWrapper.executeSafely(new AsyncTask<Object, Void, AppLaunchInfoResponseData>() { // from class: com.taobao.login4android.init.loginbar.LoginBarController.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == -1325021319) {
                        super.onPostExecute(objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                /* JADX WARN: Type inference failed for: r4v3, types: [com.ali.user.mobile.login.model.AppLaunchInfoResponseData, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ AppLaunchInfoResponseData doInBackground(Object[] objArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(AppLaunchInfoResponseData appLaunchInfoResponseData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, appLaunchInfoResponseData});
                    } else {
                        a(appLaunchInfoResponseData);
                    }
                }

                public AppLaunchInfoResponseData a(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (AppLaunchInfoResponseData) ipChange2.ipc$dispatch("56334a01", new Object[]{this, objArr}) : UserLoginActivity.getAppLaunchData(activity);
                }

                public void a(AppLaunchInfoResponseData appLaunchInfoResponseData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("db13b020", new Object[]{this, appLaunchInfoResponseData});
                        return;
                    }
                    super.onPostExecute(appLaunchInfoResponseData);
                    AppLaunchInfo appLaunchInfo = null;
                    if (appLaunchInfoResponseData != null && appLaunchInfoResponseData.returnValue != 0) {
                        appLaunchInfo = (AppLaunchInfo) appLaunchInfoResponseData.returnValue;
                    }
                    boolean access$000 = LoginBarController.access$000(appLaunchInfo);
                    LoginTLogAdapter.e(LoginBarController.TAG, "enableSearchBar = " + access$000);
                    if (i == 16908290 && !access$000) {
                        LoginTLogAdapter.e(LoginBarController.TAG, "enalbeSearchBar = flase,return");
                    } else {
                        LoginBarController.addLoginBarInMainActivity(i, activity, fragmentManager, loginBarProfile, appLaunchInfo);
                    }
                }
            }, new Object[0]);
        } else {
            addLoginBarInMainActivity(i, activity, fragmentManager, loginBarProfile, null);
        }
    }

    public static void addLoginBarInMainActivity(int i, Activity activity, FragmentManager fragmentManager, LoginBarProfile loginBarProfile, AppLaunchInfo appLaunchInfo) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a43798", new Object[]{new Integer(i), activity, fragmentManager, loginBarProfile, appLaunchInfo});
        } else if (activity == null || activity.isFinishing()) {
        } else {
            if ((loginBarProfile != null && StringUtils.equals(loginBarProfile.isOpenLoginButton, "false")) || (frameLayout = (FrameLayout) activity.getWindow().getDecorView()) == null) {
                return;
            }
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(16908290);
            if (frameLayout2 != null && frameLayout2.findViewWithTag("login_bar") == null) {
                String maskMobile = getMaskMobile();
                if (appLaunchInfo != null && appLaunchInfo.openFloatingBarPersonalize && appLaunchInfo.bottomFloatingBarInfo != null && isChineseLanguage()) {
                    LoginTLogAdapter.e(TAG, "hit server recommend: serverData= " + JSON.toJSONString(appLaunchInfo));
                    if (appLaunchInfo.bottomFloatingBarInfo.recommendLoginTypes != null && appLaunchInfo.bottomFloatingBarInfo.recommendLoginTypes.size() > 0) {
                        setViewByServer(i, activity, loginBarProfile, appLaunchInfo);
                        return;
                    } else {
                        setView(i, activity, 4, loginBarProfile, appLaunchInfo);
                        return;
                    }
                }
                LoginTLogAdapter.e(TAG, "miss server recommend");
                defaultSetView(i, activity, loginBarProfile, maskMobile);
                return;
            }
            LoginTLogAdapter.e(TAG, "has login_bar,don't need add again");
        }
    }

    private static void defaultSetView(int i, Activity activity, LoginBarProfile loginBarProfile, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a85846", new Object[]{new Integer(i), activity, loginBarProfile, str});
        } else if (!StringUtils.isEmpty(Login.getOldUserId())) {
            setView(i, activity, 1, loginBarProfile);
        } else {
            setView(i, activity, 2, loginBarProfile);
        }
    }

    private static String getMaskMobile() {
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

    private static void doPrefetch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f41b29", new Object[0]);
            return;
        }
        try {
            if (ServiceFactory.getService(NumberAuthService.class) == null) {
                return;
            }
            ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).preFecth("loginBar");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void setViewByServer(int i, Activity activity, LoginBarProfile loginBarProfile, AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f716f2", new Object[]{new Integer(i), activity, loginBarProfile, appLaunchInfo});
            return;
        }
        String maskMobile = getMaskMobile();
        if (appLaunchInfo == null || !appLaunchInfo.openFloatingBarPersonalize || appLaunchInfo.bottomFloatingBarInfo == null) {
            defaultSetView(i, activity, loginBarProfile, maskMobile);
        } else if (openRecommendPage(i, activity, loginBarProfile, appLaunchInfo)) {
        } else {
            setView(i, activity, 4, loginBarProfile, appLaunchInfo);
        }
    }

    public static boolean openRecommendPage(int i, Activity activity, LoginBarProfile loginBarProfile, AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bddf076", new Object[]{new Integer(i), activity, loginBarProfile, appLaunchInfo})).booleanValue();
        }
        for (String str : appLaunchInfo.bottomFloatingBarInfo.recommendLoginTypes) {
            if (goFragmentByType(i, activity, loginBarProfile, str, appLaunchInfo)) {
                LoginTLogAdapter.e(TAG, "openRecommendType : type=" + str);
                return true;
            }
        }
        return false;
    }

    public static boolean goFragmentByType(int i, Activity activity, LoginBarProfile loginBarProfile, String str, AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13cf0a14", new Object[]{new Integer(i), activity, loginBarProfile, str, appLaunchInfo})).booleanValue();
        }
        String maskMobile = getMaskMobile();
        LoginTLogAdapter.e(TAG, "maskMobile in getType = " + maskMobile);
        boolean iSupportAlipay = iSupportAlipay(activity);
        if (!appLaunchInfo.locatedUmidAccount) {
            if ("alipay".equals(str) && iSupportAlipay) {
                setView(i, activity, 6, loginBarProfile, appLaunchInfo);
                return true;
            } else if (!"sim".equals(str) || StringUtils.isEmpty(maskMobile)) {
                return false;
            } else {
                setView(i, activity, 3, loginBarProfile, appLaunchInfo);
                return true;
            }
        } else if ("alipay".equals(str) && iSupportAlipay) {
            setView(i, activity, 6, loginBarProfile, appLaunchInfo);
            return true;
        } else if ("umidIv".equals(str)) {
            setView(i, activity, 5, loginBarProfile, appLaunchInfo);
            return true;
        } else if (!"sim".equals(str) || StringUtils.isEmpty(maskMobile)) {
            return false;
        } else {
            setView(i, activity, 3, loginBarProfile, appLaunchInfo);
            return true;
        }
    }

    private static boolean iSupportAlipay(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("141c5615", new Object[]{context})).booleanValue();
        }
        OauthService oauthService = (OauthService) AliMemberSDK.getService(OauthService.class);
        return oauthService != null && oauthService.isAppAuthSurpport(context, "alipay");
    }

    private static void setView(int i, Activity activity, int i2, LoginBarProfile loginBarProfile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df80f0", new Object[]{new Integer(i), activity, new Integer(i2), loginBarProfile});
        } else {
            setView(i, activity, i2, loginBarProfile, null);
        }
    }

    public static Locale getCurrentLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Locale) ipChange.ipc$dispatch("4578c909", new Object[0]);
        }
        try {
            Language a2 = b.a();
            if (a2 != null) {
                return new Locale(a2.getLanguage(), a2.getCountry());
            }
        } catch (Throwable th) {
            th.printStackTrace();
            LoginTLogAdapter.e(TAG, "getLanguageException");
        }
        return Locale.SIMPLIFIED_CHINESE;
    }

    public static boolean isChineseLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a92e3e6", new Object[0])).booleanValue();
        }
        Locale currentLanguage = getCurrentLanguage();
        if (currentLanguage != null) {
            return "zh".equals(currentLanguage.getLanguage());
        }
        return true;
    }

    public static String getLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c65c8aeb", new Object[0]);
        }
        Locale currentLanguage = getCurrentLanguage();
        return currentLanguage == null ? "zh" : currentLanguage.getLanguage();
    }

    public static String getCountry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73367799", new Object[0]);
        }
        Locale currentLanguage = getCurrentLanguage();
        return currentLanguage == null ? "CN" : currentLanguage.getCountry();
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x048e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void setView(final int r31, final android.app.Activity r32, final int r33, com.taobao.login4android.init.loginbar.LoginBarProfile r34, final com.ali.user.mobile.login.model.AppLaunchInfo r35) {
        /*
            Method dump skipped, instructions count: 1289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.login4android.init.loginbar.LoginBarController.setView(int, android.app.Activity, int, com.taobao.login4android.init.loginbar.LoginBarProfile, com.ali.user.mobile.login.model.AppLaunchInfo):void");
    }

    private static String getDefaultLoginBtnText(AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fd525e1f", new Object[]{appLaunchInfo}) : b.a(R.string.aliuser_bar_btn);
    }

    private static String getServerButtonText(AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e5f6228c", new Object[]{appLaunchInfo}) : (appLaunchInfo == null || appLaunchInfo.bottomFloatingBarInfo == null) ? "" : appLaunchInfo.bottomFloatingBarInfo.buttonText;
    }

    private static int getIconWidth(AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1cbdea8", new Object[]{appLaunchInfo})).intValue() : isThinMode(appLaunchInfo) ? 24 : 31;
    }

    private static void setCircleUrl(TUrlImageView tUrlImageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1348e274", new Object[]{tUrlImageView, str});
        } else if (StringUtils.isEmpty(str)) {
            tUrlImageView.setVisibility(8);
        } else {
            try {
                tUrlImageView.setVisibility(0);
                tUrlImageView.setImageUrl(str, new PhenixOptions().bitmapProcessors(new c()));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static void goLogin(Activity activity, int i, int i2, AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0929bb9", new Object[]{activity, new Integer(i), new Integer(i2), appLaunchInfo});
            return;
        }
        String umidLoginToken = getUmidLoginToken(appLaunchInfo);
        String showLoginId = getShowLoginId(appLaunchInfo);
        Bundle bundle = new Bundle();
        String maskMobile = getMaskMobile();
        if (StringUtils.isEmpty(maskMobile)) {
            doPrefetch();
        }
        String str = null;
        String str2 = "umidIv";
        if (i2 == 2) {
            str2 = "Regist";
        } else if (i2 == 3) {
            buildSimLoginBundle(bundle, umidLoginToken, showLoginId);
            str = "simbar";
            str2 = "sim";
        } else if (i2 == 5) {
            if (!StringUtils.isEmpty(maskMobile) && containsSim(appLaunchInfo)) {
                buildSimLoginBundle(bundle, umidLoginToken, showLoginId);
                str2 = "sim";
            } else if (!StringUtils.isEmpty(umidLoginToken)) {
                bundle.putString("login_type", str2);
                bundle.putString(LoginConstant.UMID_TOKEN, umidLoginToken);
            } else {
                str2 = "";
            }
            str = "umidIvbar";
        } else {
            str2 = i2 == 4 ? "defaultLogin" : TokenType.LOGIN;
        }
        if (!StringUtils.isEmpty(getBenifitText(appLaunchInfo))) {
            LoginContext.mFrom = HOME_BENEFIT_FROM;
        } else {
            LoginContext.mFrom = HOME_FROM;
        }
        bundle.putString("source", "loginBar");
        userTrace(str2, str, getArgsByID(i, appLaunchInfo));
        if ("true".equals(OrangeConfig.getInstance().getConfig("login4android", "reset_before_loginbar", "false"))) {
            LoginStatus.resetLoginFlag();
        }
        boolean iSupportAlipay = iSupportAlipay(activity);
        if (i2 == 6 && iSupportAlipay) {
            Login.alipayAuth("login_bar");
        } else {
            Login.login(true, bundle);
        }
    }

    private static Map<String, String> getArgsByID(int i, AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a433b11", new Object[]{new Integer(i), appLaunchInfo});
        }
        HashMap hashMap = new HashMap();
        if (i == 16908290) {
            hashMap.put("from", "search");
        } else {
            hashMap.put("from", "homepage");
        }
        hashMap.put("thinMode", String.valueOf(isThinMode(appLaunchInfo)));
        return hashMap;
    }

    private static void buildSimLoginBundle(Bundle bundle, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a348a43f", new Object[]{bundle, str, str2});
            return;
        }
        bundle.putString("source", "Page_Login5-simLogin");
        bundle.putString("login_type", "sim");
        if (!StringUtils.isEmpty(str)) {
            bundle.putString(LoginConstant.UMID_TOKEN, str);
        }
        if (StringUtils.isEmpty(str2)) {
            return;
        }
        bundle.putString("showLoginId", str2);
    }

    private static boolean containsSim(AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8116f4f8", new Object[]{appLaunchInfo})).booleanValue() : (appLaunchInfo == null || appLaunchInfo.bottomFloatingBarInfo == null || appLaunchInfo.bottomFloatingBarInfo.recommendLoginTypes == null || !appLaunchInfo.bottomFloatingBarInfo.recommendLoginTypes.contains("sim")) ? false : true;
    }

    private static boolean enableSearchBar(AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c2dae28", new Object[]{appLaunchInfo})).booleanValue();
        }
        if (appLaunchInfo != null && appLaunchInfo.bottomFloatingBarInfo != null) {
            return appLaunchInfo.bottomFloatingBarInfo.enableSearchBottomBar;
        }
        return false;
    }

    private static String getShowLoginId(AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("854c32e5", new Object[]{appLaunchInfo}) : (appLaunchInfo == null || appLaunchInfo.bottomFloatingBarInfo == null) ? "" : appLaunchInfo.bottomFloatingBarInfo.showLoginId;
    }

    private static String getAvatar(AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("37ada8c3", new Object[]{appLaunchInfo}) : (appLaunchInfo == null || appLaunchInfo.bottomFloatingBarInfo == null) ? "" : appLaunchInfo.bottomFloatingBarInfo.userAvatar;
    }

    private static String getBenifitIcon(AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b16a1cea", new Object[]{appLaunchInfo}) : (appLaunchInfo == null || appLaunchInfo.bottomFloatingBarInfo == null) ? "" : appLaunchInfo.bottomFloatingBarInfo.benefitIcon;
    }

    private static String getBenifitText(AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8c40b9e", new Object[]{appLaunchInfo}) : (appLaunchInfo == null || appLaunchInfo.bottomFloatingBarInfo == null) ? "" : appLaunchInfo.bottomFloatingBarInfo.benefitText;
    }

    private static String getBenifitSubText(AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7d24cee4", new Object[]{appLaunchInfo}) : (appLaunchInfo == null || appLaunchInfo.bottomFloatingBarInfo == null) ? "" : appLaunchInfo.bottomFloatingBarInfo.benefitSubTitle;
    }

    private static boolean getLocatedUmidAccount(AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd15a532", new Object[]{appLaunchInfo})).booleanValue();
        }
        if (appLaunchInfo == null) {
            return false;
        }
        return appLaunchInfo.locatedUmidAccount;
    }

    private static boolean getBenifitFirst(AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8142507d", new Object[]{appLaunchInfo})).booleanValue();
        }
        if (appLaunchInfo != null && appLaunchInfo.bottomFloatingBarInfo != null) {
            return appLaunchInfo.bottomFloatingBarInfo.benefitFirst;
        }
        return false;
    }

    private static boolean isThinMode(AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3797f14a", new Object[]{appLaunchInfo})).booleanValue();
        }
        if (!isChineseLanguage()) {
            return true;
        }
        if (appLaunchInfo != null && appLaunchInfo.bottomFloatingBarInfo != null) {
            return appLaunchInfo.bottomFloatingBarInfo.thinMode;
        }
        return false;
    }

    private static String getSubText(AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ef653cb", new Object[]{appLaunchInfo}) : (appLaunchInfo == null || appLaunchInfo.bottomFloatingBarInfo == null) ? "" : appLaunchInfo.bottomFloatingBarInfo.subTitle;
    }

    private static String getOrangeSubText(Activity activity, LoginBarProfile loginBarProfile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef7b440a", new Object[]{activity, loginBarProfile});
        }
        if (loginBarProfile == null || StringUtils.isEmpty(loginBarProfile.loginSubText)) {
            return b.a(R.string.aliuser_bar_more_suprise);
        }
        return loginBarProfile.loginSubText;
    }

    private static String getUmidLoginToken(AppLaunchInfo appLaunchInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a3a54e8d", new Object[]{appLaunchInfo}) : (appLaunchInfo == null || !appLaunchInfo.openFloatingBarPersonalize || appLaunchInfo.bottomFloatingBarInfo == null) ? "" : appLaunchInfo.umidLoginToken;
    }

    private static void setTipText(String str, TextView textView, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1475e2f7", new Object[]{str, textView, str2});
        } else if (textView == null) {
        } else {
            if (!StringUtils.isEmpty(str)) {
                textView.setText(str);
            } else {
                textView.setText(str2);
            }
        }
    }

    private static void setButtonText(LoginBarProfile loginBarProfile, String str, Button button, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0d38f08", new Object[]{loginBarProfile, str, button, str2});
        } else {
            setTipText(str, button, str2);
        }
    }

    private static void userTrace(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920b4a90", new Object[]{str, str2, map});
            return;
        }
        try {
            UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str);
            uTCustomHitBuilder.setEventPage(UTConstant.PageName.UT_PAGE_LOGIN_BAR);
            if (!StringUtils.isEmpty(str2)) {
                uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG2, str2);
            }
            if (map != null) {
                uTCustomHitBuilder.setProperties(map);
            }
            UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void removeLoginBar(int i, Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38afe674", new Object[]{new Integer(i), activity, new Boolean(z)});
            return;
        }
        LoginTLogAdapter.e(TAG, "removeLoginBar,id" + i);
        try {
            LoginTLogAdapter.e(TAG, "reset isRegisterLoginResultBroadcast,id = " + i);
            isRegisterLoginResultBroadcast = false;
            LoginTLogAdapter.e(TAG, "unregisterReceiver,id=" + i);
            if (mLoginReceiver != null) {
                LoginBroadcastHelper.unregisterLoginReceiver(activity.getApplicationContext(), mLoginReceiver);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        doRemove(i, activity, z);
    }

    public static void doRemove(final int i, Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac18f55", new Object[]{new Integer(i), activity, new Boolean(z)});
            return;
        }
        final FrameLayout frameLayout = (FrameLayout) activity.getWindow().getDecorView();
        if (frameLayout == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.taobao.login4android.init.loginbar.LoginBarController.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (frameLayout == null) {
                        return;
                    }
                    FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(i);
                    LoginTLogAdapter.e(LoginBarController.TAG, "removeLoginBar,decorView != null，id=" + i);
                    if (frameLayout2 == null) {
                        LoginTLogAdapter.e(LoginBarController.TAG, "removeLoginBar,contentView is null");
                        return;
                    }
                    LoginTLogAdapter.e(LoginBarController.TAG, "removeLoginBar,contentView != null,id=" + i);
                    View findViewWithTag = frameLayout2.findViewWithTag("login_bar");
                    if (findViewWithTag == null) {
                        LoginTLogAdapter.e(LoginBarController.TAG, "removeLoginBar,loginBar is null");
                        return;
                    }
                    LoginTLogAdapter.e(LoginBarController.TAG, "removeLoginBar,loginBar != null,id=" + i);
                    LoginBarController.access$600(findViewWithTag);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    private static void deleteBar(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5317183", new Object[]{view});
        } else if (view == null) {
        } else {
            try {
                if (view.getParent() == null || view == null) {
                    return;
                }
                ((ViewGroup) view.getParent()).removeView(view);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void registerLoginResult(final int i, final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c0418b", new Object[]{new Integer(i), activity});
            return;
        }
        LoginTLogAdapter.e(TAG, "in registerLoginResult： isRegisterLoginResultBroadcast = " + isRegisterLoginResultBroadcast);
        if (isRegisterLoginResultBroadcast) {
            return;
        }
        LoginTLogAdapter.e(TAG, "registerLoginReceiver");
        mLoginReceiver = new BroadcastReceiver() { // from class: com.taobao.login4android.init.loginbar.LoginBarController.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent == null || activity == null) {
                } else {
                    String action = intent.getAction();
                    LoginTLogAdapter.e(LoginBarController.TAG, "received action=" + action);
                    LoginAction valueOf = LoginAction.valueOf(action);
                    if (valueOf == null || AnonymousClass6.f17862a[valueOf.ordinal()] != 1) {
                        return;
                    }
                    LoginTLogAdapter.e(LoginBarController.TAG, "received NOTIFY_LOGIN_SUCCESS");
                    Activity activity2 = activity;
                    if (activity2 == null || activity2.isFinishing()) {
                        LoginTLogAdapter.e(LoginBarController.TAG, "received NOTIFY_LOGIN_SUCCESS,activity is null or isFinishing");
                    } else {
                        LoginBarController.removeLoginBar(i, activity, true);
                    }
                }
            }
        };
        LoginBroadcastHelper.registerLoginReceiver(activity.getApplicationContext(), mLoginReceiver);
        isRegisterLoginResultBroadcast = true;
    }

    public static void buttonStyle(Activity activity, Button button) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1c5f8c", new Object[]{activity, button});
            return;
        }
        LoginTLogAdapter.e(TAG, "isGray = " + isGray);
        button.setAllCaps(false);
        if (isGray) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius((int) (getRadius() * density(activity)));
            gradientDrawable.setColor(Color.parseColor("#FFFFFF"));
            button.setBackground(gradientDrawable);
            button.setTextColor(Color.parseColor("#111111"));
            return;
        }
        button.setBackgroundDrawable(getGradientDrawable(activity, new int[]{-40448, -40448, -40448}));
        button.setTextColor(-1);
    }

    public static Drawable getGradientDrawable(Activity activity, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("c780af0f", new Object[]{activity, iArr});
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, iArr);
        gradientDrawable.setCornerRadius((int) (getRadius() * density(activity)));
        return gradientDrawable;
    }

    public static int getRadius() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f9581002", new Object[0])).intValue() : isChineseLanguage() ? 6 : 14;
    }

    private static float density(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a3858f71", new Object[]{activity})).floatValue() : activity.getResources().getDisplayMetrics().density;
    }

    public static void hideLoginBar() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6184dd3", new Object[0]);
            return;
        }
        try {
            if (loginBarCache == null || (view = loginBarCache.get()) == null) {
                return;
            }
            view.setVisibility(8);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showLoginBar() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("873f8b0e", new Object[0]);
            return;
        }
        try {
            if (loginBarCache == null || Login.checkSessionValid() || (view = loginBarCache.get()) == null) {
                return;
            }
            view.setVisibility(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void cacheMainActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb038a3", new Object[]{activity});
            return;
        }
        try {
            mainActivityCache = new WeakReference<>(activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Activity getMainActivity() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("51a25fe3", new Object[0]);
        }
        try {
            if (mainActivityCache == null || (activity = mainActivityCache.get()) == null) {
                return null;
            }
            if (activity.isFinishing()) {
                return null;
            }
            return activity;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
