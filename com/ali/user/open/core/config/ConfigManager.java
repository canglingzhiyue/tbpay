package com.ali.user.open.core.config;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ali.user.open.core.WebViewProxy;
import com.ali.user.open.core.callback.DataProvider;
import com.ali.user.open.core.callback.ThemeProvider;
import com.ali.user.open.core.context.KernelContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class ConfigManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int APP_KEY_INDEX;
    public static int DAILY_APP_KEY_INDEX;
    public static String DAMAI_LOGIN_URLS;
    public static boolean DEBUG;
    public static String ICBU_LOGIN_HOST;
    public static String ICBU_LOGIN_HOST_DAILY;
    public static String LOGIN_HOST;
    public static String LOGIN_URLS;
    public static String LOGOUT_URLS;
    public static String POSTFIX_OF_SECURITY_JPG;
    public static String POSTFIX_OF_SECURITY_JPG_USER_SET;
    private static final ConfigManager SINGLETON_INSTANCE;
    public static String bindTitle;
    public static String forceAppkey;
    public static String qrCodeLoginUrl;
    public String dailyDomain;
    private Environment env;
    public boolean handleWebviewDir;
    public Class mNavHelper;
    private String mUccDataProviderClass;
    public Class mUccHelper;
    public String onlineDomain;
    public String preDomain;
    public Map<String, Object> scanParams;
    public String sessionDailyDomain;
    public String sessionOnlineDomain;
    public String sessionPreDomain;
    private int maxHistoryAccount = 1;
    private boolean saveHistoryWithSalt = true;
    private DataProvider mLoginEntrenceCallback = null;
    public boolean isMultiProcessEnable = false;
    public boolean useNewMtopInstanceId = true;
    private ThemeProvider mThemeDataProvider = null;
    private List<String> mH5OnlyBindSites = new ArrayList();
    private Locale language = Locale.SIMPLIFIED_CHINESE;
    private boolean registerSidToMtopDefault = false;
    private WebViewOption mWebViewOption = WebViewOption.UC;
    private boolean isMiniProgram = false;

    static {
        kge.a(-575602930);
        DEBUG = false;
        SINGLETON_INSTANCE = new ConfigManager();
        ICBU_LOGIN_HOST_DAILY = "https://passport.daily.alibaba.com/oauth.htm?appName=icbu-oauth&appEntrance=";
        ICBU_LOGIN_HOST = "https://passport.alibaba.com/oauth.htm?appName=icbu-oauth&appEntrance=";
        LOGIN_HOST = "https://havanalogin.taobao.com/taobao_oauth_common.htm?appName=taobao-oauth-common&appEntrance=sdk-common&needTopToken=true&topTokenAppName=";
        LOGIN_URLS = "((https|http)://)login.(m|wapa|waptest).(taobao|tmall).com/(login/){0,1}login.htm(.*);((https|http)://)login.tmall.com(.*);((https|http)://)login.taobao.com/member/login.jhtml(.*);(http|https)://login.(taobao|tmall).com/login/(.*);http://login.m.taobao.com/minisdk/login.htm;https://oauth.m.taobao.com/authorize;((https|http)://)login.m.taobao.com/msg_login.htm(.*)";
        DAMAI_LOGIN_URLS = "((https|http)://)(m|market.wapa|market.waptest).(?:taobao.com|damai.cn)/(damai|app/damai/damai-msite)/minilogin/index.html(.*)";
        bindTitle = "";
        APP_KEY_INDEX = 0;
        DAILY_APP_KEY_INDEX = 0;
        POSTFIX_OF_SECURITY_JPG = "";
        qrCodeLoginUrl = "http://login.m.taobao.com/qrcodeShow.htm?appKey=%s&from=bcqrlogin";
    }

    public int getMaxHistoryAccount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f1531c1", new Object[]{this})).intValue() : this.maxHistoryAccount;
    }

    public void setMaxHistoryAccount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d51701", new Object[]{this, new Integer(i)});
        } else {
            this.maxHistoryAccount = i;
        }
    }

    public void setNavHelper(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccaf4c87", new Object[]{this, cls});
        } else {
            this.mNavHelper = cls;
        }
    }

    public Class getNavHelper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("535fcbaf", new Object[]{this}) : this.mNavHelper;
    }

    public void setSessionDailyDomain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7308e59a", new Object[]{this, str});
        } else {
            this.sessionDailyDomain = str;
        }
    }

    public void setSessionOnlineDomain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e7d73c", new Object[]{this, str});
        } else {
            this.sessionOnlineDomain = str;
        }
    }

    public void setSessionPreDomain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69bd1a24", new Object[]{this, str});
        } else {
            this.sessionPreDomain = str;
        }
    }

    public void setDailyDomain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af4afecc", new Object[]{this, str});
        } else {
            this.dailyDomain = str;
        }
    }

    public void setOnlineDomain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fe8e44a", new Object[]{this, str});
        } else {
            this.onlineDomain = str;
        }
    }

    public void setPreDomain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9b7d7d6", new Object[]{this, str});
        } else {
            this.preDomain = str;
        }
    }

    public boolean isRegisterSidToMtopDefault() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2980dc8", new Object[]{this})).booleanValue() : this.registerSidToMtopDefault;
    }

    public void setRegisterSidToMtopDefault(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b209958", new Object[]{this, new Boolean(z)});
        } else {
            this.registerSidToMtopDefault = z;
        }
    }

    public void addH5OnlyBindSites(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb8313a6", new Object[]{this, str});
        } else {
            this.mH5OnlyBindSites.add(str);
        }
    }

    public boolean isH5OnlyBindSites(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a06d0c1", new Object[]{this, str})).booleanValue() : this.mH5OnlyBindSites.contains(str);
    }

    public boolean isMiniProgram() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("58e669ae", new Object[]{this})).booleanValue() : this.isMiniProgram;
    }

    public void setMiniProgram(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d3bda2", new Object[]{this, new Boolean(z)});
        } else {
            this.isMiniProgram = z;
        }
    }

    public Locale getCurrentLanguage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Locale) ipChange.ipc$dispatch("4578c909", new Object[]{this}) : this.language;
    }

    public void setLanguage(Locale locale) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba10c316", new Object[]{this, locale});
        } else {
            this.language = locale;
        }
    }

    private ConfigManager() {
    }

    public void setEnvironment(Environment environment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e31593", new Object[]{this, environment});
            return;
        }
        this.env = environment;
        init();
    }

    public Environment getEnvironment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Environment) ipChange.ipc$dispatch("48bd17f", new Object[]{this}) : this.env;
    }

    public static ConfigManager getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConfigManager) ipChange.ipc$dispatch("9fbcff5", new Object[0]) : SINGLETON_INSTANCE;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        if (this.env == null) {
            this.env = Environment.ONLINE;
        }
        int ordinal = this.env.ordinal();
        LOGIN_HOST = new String[]{"https://havanalogin.taobao.com/taobao_oauth_common.htm?appName=taobao-oauth-common&appEntrance=sdk-common&needTopToken=true&topTokenAppName=", "https://havanalogin.taobao.com/taobao_oauth_common.htm?appName=taobao-oauth-common&appEntrance=sdk-common&needTopToken=true&topTokenAppName=", "http://passport.daily.alibaba.com/taobao_oauth_common.htm?appName=taobao-oauth-common&appEntrance=sdk-common&needTopToken=true&topTokenAppName=", "http://passport.daily.alibaba.com/taobao_oauth_common.htm?appName=taobao-oauth-common&appEntrance=sdk-common&needTopToken=true&topTokenAppName="}[ordinal];
        LOGOUT_URLS = new String[]{"((https|http)://)login.m.taobao.com/logout.htm(.*)", "((https|http)://)login.wapa.taobao.com/logout.htm(.*)", "((https|http)://)login.waptest.taobao.com/logout.htm(.*)", "((https|http)://)login.waptest.tbsandbox.com/logout.htm(.*)"}[ordinal];
        qrCodeLoginUrl = new String[]{"http://login.m.taobao.com/qrcodeShow.htm?appKey=%s&from=bcqrlogin", "http://login.wapa.taobao.com/qrcodeShow.htm?appKey=%s&from=bcqrlogin", "http://login.waptest.taobao.com/qrcodeShow.htm?appKey=%s&from=bcqrlogin", "http://login.waptest.taobao.com/qrcodeShow.htm?appKey=%s&from=bcqrlogin"}[ordinal];
        String str = POSTFIX_OF_SECURITY_JPG_USER_SET;
        if (str == null) {
            POSTFIX_OF_SECURITY_JPG = new String[]{"", "", "", ""}[ordinal];
        } else {
            POSTFIX_OF_SECURITY_JPG = str;
        }
    }

    public String getBindTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ece352b4", new Object[]{this}) : bindTitle;
    }

    public void setBindTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31c4bfaa", new Object[]{this, str});
        } else {
            bindTitle = str;
        }
    }

    public static int getAppKeyIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d81aa738", new Object[0])).intValue();
        }
        if (getInstance().getEnvironment() != null && getInstance().getEnvironment().equals(Environment.TEST)) {
            return DAILY_APP_KEY_INDEX;
        }
        return APP_KEY_INDEX;
    }

    public static void setAppKeyIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf37496a", new Object[]{new Integer(i)});
        } else {
            APP_KEY_INDEX = i;
        }
    }

    public static void setAppKeyIndex(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17b256d9", new Object[]{new Integer(i), new Integer(i2)});
            return;
        }
        APP_KEY_INDEX = i;
        DAILY_APP_KEY_INDEX = i2;
    }

    public boolean isSaveHistoryWithSalt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e9ddc234", new Object[]{this})).booleanValue() : this.saveHistoryWithSalt;
    }

    public void setSaveHistoryWithSalt(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e10bddc", new Object[]{this, new Boolean(z)});
        } else {
            this.saveHistoryWithSalt = z;
        }
    }

    public WebViewOption getWebViewOption() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebViewOption) ipChange.ipc$dispatch("a4241e9f", new Object[]{this}) : this.mWebViewOption;
    }

    public void setWebViewOption(WebViewOption webViewOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7479f95d", new Object[]{this, webViewOption});
        } else {
            this.mWebViewOption = webViewOption;
        }
    }

    public void setWebViewProxy(WebViewProxy webViewProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4484045e", new Object[]{this, webViewProxy});
        } else {
            KernelContext.mWebViewProxy = webViewProxy;
        }
    }

    public void setLoginEntrenceCallback(DataProvider dataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac66adbf", new Object[]{this, dataProvider});
        } else {
            this.mLoginEntrenceCallback = dataProvider;
        }
    }

    public DataProvider getLoginEntrenceCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataProvider) ipChange.ipc$dispatch("a74daa1f", new Object[]{this}) : this.mLoginEntrenceCallback;
    }

    public ThemeProvider getThemeDataProvider() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThemeProvider) ipChange.ipc$dispatch("194cea46", new Object[]{this}) : this.mThemeDataProvider;
    }

    public void setThemeDataProvider(ThemeProvider themeProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eae5d8", new Object[]{this, themeProvider});
        } else {
            this.mThemeDataProvider = themeProvider;
        }
    }

    public String getUccDataProviderClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("458a69db", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.mUccDataProviderClass)) {
            return this.mUccDataProviderClass;
        }
        try {
            return KernelContext.getApplicationContext().getSharedPreferences("ucc_sdk", 0).getString("ucc_dataprovider", "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public void setUccDataProviderClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("500c79fb", new Object[]{this, str});
            return;
        }
        this.mUccDataProviderClass = str;
        try {
            SharedPreferences.Editor edit = KernelContext.getApplicationContext().getSharedPreferences("ucc_sdk", 0).edit();
            edit.putString("ucc_dataprovider", this.mUccDataProviderClass);
            edit.apply();
        } catch (Throwable unused) {
        }
    }
}
