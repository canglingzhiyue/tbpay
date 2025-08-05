package com.ali.user.number.auth;

import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.NumAuthCallback;
import com.ali.user.mobile.model.NumAuthTokenCallback;
import com.ali.user.mobile.service.NumberAuthService;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.OnLoginPhoneListener;
import com.mobile.auth.gatewayauth.PhoneNumberAuthHelper;
import com.mobile.auth.gatewayauth.PnsLoggerHandler;
import com.mobile.auth.gatewayauth.TokenResultListener;
import com.mobile.auth.gatewayauth.model.LoginPhoneInfo;
import com.mobile.auth.gatewayauth.model.TokenRet;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.session.SessionManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes2.dex */
public class NumAuthComponent implements NumberAuthService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String LOGIN_TOKEN_TIMEOUT = "loginTokenTimout";
    public static String PREFETCH_TIMEOUT = "preFetchTimout";
    private PhoneNumberAuthHelper mAuthHelper;
    private boolean isInited = false;
    private boolean support4G = false;
    public boolean hasPreFecthMaskPhone = false;
    private final Map<String, String> authInfoMap = new HashMap();
    private final List<NumberAuthService.PrefetchResultObserver> observers = Collections.synchronizedList(new ArrayList());

    public static /* synthetic */ void access$000(NumAuthComponent numAuthComponent, NumAuthTokenCallback numAuthTokenCallback, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70d70d27", new Object[]{numAuthComponent, numAuthTokenCallback, new Integer(i), str});
        } else {
            numAuthComponent.onFail(numAuthTokenCallback, i, str);
        }
    }

    public static /* synthetic */ Map access$100(NumAuthComponent numAuthComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("9fde66a9", new Object[]{numAuthComponent}) : numAuthComponent.authInfoMap;
    }

    public static /* synthetic */ void access$200(NumAuthComponent numAuthComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29d81593", new Object[]{numAuthComponent});
        } else {
            numAuthComponent.notifyObservers();
        }
    }

    public static /* synthetic */ boolean access$302(NumAuthComponent numAuthComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53c9a168", new Object[]{numAuthComponent, new Boolean(z)})).booleanValue();
        }
        numAuthComponent.isInited = z;
        return z;
    }

    public static /* synthetic */ boolean access$400(NumAuthComponent numAuthComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2b61d5", new Object[]{numAuthComponent})).booleanValue() : numAuthComponent.support4G;
    }

    public static /* synthetic */ boolean access$402(NumAuthComponent numAuthComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9754bf29", new Object[]{numAuthComponent, new Boolean(z)})).booleanValue();
        }
        numAuthComponent.support4G = z;
        return z;
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public Map<String, String> getAuthInfoMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b8ea004c", new Object[]{this}) : this.authInfoMap;
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public boolean hasPreFecthMaskPhone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c9fa4de", new Object[]{this})).booleanValue() : this.hasPreFecthMaskPhone;
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public void getToken(final NumAuthTokenCallback numAuthTokenCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("230d0b1b", new Object[]{this, numAuthTokenCallback});
            return;
        }
        initCheck(null);
        if (this.mAuthHelper != null) {
            this.mAuthHelper.getVerifyToken(LoginSwitch.getSwitch(LOGIN_TOKEN_TIMEOUT, 5000), new TokenResultListener() { // from class: com.ali.user.number.auth.NumAuthComponent.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.mobile.auth.gatewayauth.TokenResultListener
                public void onTokenSuccess(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8a6edd1a", new Object[]{this, str});
                    } else if (!TextUtils.isEmpty(str)) {
                        try {
                            TokenRet tokenRet = (TokenRet) JSON.parseObject(str, TokenRet.class);
                            if (tokenRet == null || numAuthTokenCallback == null) {
                                return;
                            }
                            numAuthTokenCallback.onGetAuthTokenSuccess(tokenRet.getToken());
                        } catch (Throwable unused) {
                            NumAuthComponent.access$000(NumAuthComponent.this, numAuthTokenCallback, -104, str);
                        }
                    } else {
                        NumAuthComponent.access$000(NumAuthComponent.this, numAuthTokenCallback, -101, NumAuthCallback.RPC_PARSE_ERROR_MSG);
                    }
                }

                @Override // com.mobile.auth.gatewayauth.TokenResultListener
                public void onTokenFailed(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b51cb88", new Object[]{this, str});
                        return;
                    }
                    try {
                        TokenRet tokenRet = (TokenRet) JSON.parseObject(str, TokenRet.class);
                        NumAuthComponent.access$000(NumAuthComponent.this, numAuthTokenCallback, Integer.parseInt(tokenRet.getCode()), tokenRet.getMsg());
                    } catch (Throwable unused) {
                        NumAuthComponent.access$000(NumAuthComponent.this, numAuthTokenCallback, -104, str);
                    }
                }
            });
        } else {
            onFail(numAuthTokenCallback, -103, NumAuthCallback.INIT_ERROR_MSG);
        }
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public void preFecth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0c61c", new Object[]{this});
        } else {
            preFecth("init");
        }
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public void preFecth(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e320e6", new Object[]{this, str});
            return;
        }
        try {
            initCheck(null);
            if (this.mAuthHelper != null && this.mAuthHelper.getReporter() != null) {
                this.mAuthHelper.getReporter().setLogExtension(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            final Properties properties = new Properties();
            properties.setProperty("monitor", "T");
            if (this.mAuthHelper != null) {
                UserTrackAdapter.sendExtendUT("get_onekey_login_number_commit", "", str, properties);
                this.mAuthHelper.getLoginMaskPhone(LoginSwitch.getSwitch(PREFETCH_TIMEOUT, 5000), new OnLoginPhoneListener() { // from class: com.ali.user.number.auth.NumAuthComponent.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.mobile.auth.gatewayauth.OnLoginPhoneListener
                    public void onGetLoginPhone(LoginPhoneInfo loginPhoneInfo) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ddf4988e", new Object[]{this, loginPhoneInfo});
                            return;
                        }
                        NumAuthComponent.access$100(NumAuthComponent.this).put("number", loginPhoneInfo.getPhoneNumber());
                        NumAuthComponent.access$100(NumAuthComponent.this).put("protocolName", loginPhoneInfo.getProtocolName());
                        NumAuthComponent.access$100(NumAuthComponent.this).put("protocolURL", loginPhoneInfo.getProtocolUrl());
                        if (!TextUtils.isEmpty(str)) {
                            NumAuthComponent.access$100(NumAuthComponent.this).put("scene", str);
                        }
                        NumAuthComponent.this.hasPreFecthMaskPhone = true;
                        Properties properties2 = new Properties();
                        properties2.setProperty("scene", str + "");
                        try {
                            properties2.setProperty("newUser", TextUtils.isEmpty(SessionManager.getInstance(DataProviderFactory.getApplicationContext()).getOldUserId()) ? "true" : "false");
                        } catch (Throwable unused) {
                        }
                        properties2.setProperty("monitor", "NONE");
                        UserTrackAdapter.sendUT("get_login_number_success", properties2);
                        UserTrackAdapter.sendExtendUT("get_onekey_login_number_success", "", str, properties);
                        NumAuthComponent.access$200(NumAuthComponent.this);
                    }

                    @Override // com.mobile.auth.gatewayauth.OnLoginPhoneListener
                    public void onGetFailed(String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("346427a5", new Object[]{this, str2});
                            return;
                        }
                        TokenRet tokenRet = null;
                        try {
                            tokenRet = (TokenRet) JSON.parseObject(str2, TokenRet.class);
                        } catch (Throwable unused) {
                        }
                        Properties properties2 = new Properties();
                        if (tokenRet != null) {
                            properties2.setProperty("code", tokenRet.getCode() + "");
                            properties2.setProperty("cause", tokenRet.getMsg() + "");
                        } else {
                            properties2.setProperty("code", "-104");
                            properties2.setProperty("cause", str2 + "");
                        }
                        properties2.setProperty("scene", str + "");
                        try {
                            properties2.setProperty("newUser", TextUtils.isEmpty(SessionManager.getInstance(DataProviderFactory.getApplicationContext()).getOldUserId()) ? "true" : "false");
                        } catch (Throwable unused2) {
                        }
                        UserTrackAdapter.sendUT("get_login_number_fail", properties2);
                        UserTrackAdapter.sendExtendUT("get_onekey_login_number_failure", tokenRet == null ? "-100" : tokenRet.getCode(), str, properties);
                    }
                });
                return;
            }
            Properties properties2 = new Properties();
            properties2.setProperty("code", "-103");
            properties2.setProperty("cause", NumAuthCallback.INIT_ERROR_MSG);
            properties2.setProperty("scene", str + "");
            try {
                properties2.setProperty("newUser", TextUtils.isEmpty(SessionManager.getInstance(DataProviderFactory.getApplicationContext()).getOldUserId()) ? "true" : "false");
            } catch (Throwable unused) {
            }
            UserTrackAdapter.sendUT("get_login_number_fail", properties2);
            UserTrackAdapter.sendExtendUT("get_onekey_login_number_failure", "-103", str, properties);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private void notifyObservers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bb68d9b", new Object[]{this});
            return;
        }
        for (NumberAuthService.PrefetchResultObserver prefetchResultObserver : this.observers) {
            prefetchResultObserver.onResult(this.authInfoMap);
        }
    }

    private void onFail(NumAuthTokenCallback numAuthTokenCallback, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("736e3878", new Object[]{this, numAuthTokenCallback, new Integer(i), str});
        } else if (numAuthTokenCallback == null) {
        } else {
            numAuthTokenCallback.onGetAuthTokenFail(i, str);
        }
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public void getLoginMaskPhone(int i, CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f78348f8", new Object[]{this, new Integer(i), commonDataCallback});
        } else {
            getLoginMaskPhone(i, "openLoginView", commonDataCallback);
        }
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public void getLoginMaskPhone(final int i, final String str, final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9205ae", new Object[]{this, new Integer(i), str, commonDataCallback});
            return;
        }
        try {
            initCheck(null);
            if (this.mAuthHelper != null && this.mAuthHelper.getReporter() != null) {
                this.mAuthHelper.getReporter().setLogExtension(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.mAuthHelper != null) {
            final Properties properties = new Properties();
            properties.setProperty("monitor", "T");
            UserTrackAdapter.sendExtendUT("get_onekey_login_number_commit", String.valueOf(i), str, properties);
            this.mAuthHelper.getLoginMaskPhone(i, new OnLoginPhoneListener() { // from class: com.ali.user.number.auth.NumAuthComponent.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.mobile.auth.gatewayauth.OnLoginPhoneListener
                public void onGetLoginPhone(LoginPhoneInfo loginPhoneInfo) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ddf4988e", new Object[]{this, loginPhoneInfo});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("number", loginPhoneInfo.getPhoneNumber());
                    hashMap.put("protocolName", loginPhoneInfo.getProtocolName());
                    hashMap.put("protocolURL", loginPhoneInfo.getProtocolUrl());
                    hashMap.put("scene", str);
                    NumAuthComponent.access$100(NumAuthComponent.this).putAll(hashMap);
                    CommonDataCallback commonDataCallback2 = commonDataCallback;
                    if (commonDataCallback2 != null) {
                        commonDataCallback2.onSuccess(hashMap);
                    }
                    Properties properties2 = new Properties();
                    properties2.setProperty("scene", str);
                    properties2.setProperty("wait_time", String.valueOf(i));
                    try {
                        properties2.setProperty("newUser", TextUtils.isEmpty(SessionManager.getInstance(DataProviderFactory.getApplicationContext()).getOldUserId()) ? "true" : "false");
                    } catch (Throwable unused) {
                    }
                    UserTrackAdapter.sendUT("get_login_number_success", properties2);
                    UserTrackAdapter.sendExtendUT("get_onekey_login_number_success", String.valueOf(i), str, properties);
                }

                @Override // com.mobile.auth.gatewayauth.OnLoginPhoneListener
                public void onGetFailed(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("346427a5", new Object[]{this, str2});
                    } else if (commonDataCallback == null) {
                    } else {
                        TokenRet tokenRet = null;
                        Properties properties2 = new Properties();
                        properties2.setProperty("wait_time", String.valueOf(i));
                        try {
                            tokenRet = (TokenRet) JSON.parseObject(str2, TokenRet.class);
                        } catch (Throwable unused) {
                        }
                        String str3 = "-104";
                        if (tokenRet != null) {
                            commonDataCallback.onFail(Integer.parseInt(tokenRet.getCode()), tokenRet.getMsg());
                            str3 = tokenRet.getCode();
                            properties2.setProperty("code", tokenRet.getCode() + "");
                            properties2.setProperty("cause", tokenRet.getMsg() + "");
                        } else {
                            commonDataCallback.onFail(-104, str2);
                            properties2.setProperty("code", str3);
                            properties2.setProperty("cause", str2);
                        }
                        properties2.setProperty("scene", str);
                        try {
                            properties2.setProperty("newUser", TextUtils.isEmpty(SessionManager.getInstance(DataProviderFactory.getApplicationContext()).getOldUserId()) ? "true" : "false");
                        } catch (Throwable unused2) {
                        }
                        UserTrackAdapter.sendUT("get_login_number_fail", properties2);
                        UserTrackAdapter.sendExtendUT("get_onekey_login_number_failure", str3 + "", str, properties);
                    }
                }
            });
            return;
        }
        commonDataCallback.onFail(-103, NumAuthCallback.INIT_ERROR_MSG);
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public void getLoginToken(String str, final NumAuthTokenCallback numAuthTokenCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe3efe8", new Object[]{this, str, numAuthTokenCallback});
            return;
        }
        initCheck(null);
        try {
            if (this.mAuthHelper != null && this.mAuthHelper.getReporter() != null) {
                this.mAuthHelper.getReporter().setLogExtension(str);
            }
        } catch (Throwable unused) {
        }
        if (this.mAuthHelper != null) {
            this.mAuthHelper.getLoginToken(LoginSwitch.getSwitch(LOGIN_TOKEN_TIMEOUT, 5000), new TokenResultListener() { // from class: com.ali.user.number.auth.NumAuthComponent.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.mobile.auth.gatewayauth.TokenResultListener
                public void onTokenSuccess(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8a6edd1a", new Object[]{this, str2});
                    } else if (!TextUtils.isEmpty(str2)) {
                        try {
                            TokenRet tokenRet = (TokenRet) JSON.parseObject(str2, TokenRet.class);
                            if (tokenRet != null && numAuthTokenCallback != null) {
                                numAuthTokenCallback.onGetAuthTokenSuccess(tokenRet.getToken());
                            } else {
                                NumAuthComponent.access$000(NumAuthComponent.this, numAuthTokenCallback, -101, NumAuthCallback.RPC_PARSE_ERROR_MSG);
                            }
                        } catch (Throwable unused2) {
                            NumAuthComponent.access$000(NumAuthComponent.this, numAuthTokenCallback, -101, NumAuthCallback.RPC_PARSE_ERROR_MSG);
                        }
                    } else {
                        NumAuthComponent.access$000(NumAuthComponent.this, numAuthTokenCallback, -101, NumAuthCallback.RPC_PARSE_ERROR_MSG);
                    }
                }

                @Override // com.mobile.auth.gatewayauth.TokenResultListener
                public void onTokenFailed(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b51cb88", new Object[]{this, str2});
                        return;
                    }
                    try {
                        TokenRet tokenRet = (TokenRet) JSON.parseObject(str2, TokenRet.class);
                        NumAuthComponent.access$000(NumAuthComponent.this, numAuthTokenCallback, Integer.parseInt(tokenRet.getCode()), tokenRet.getMsg());
                    } catch (Throwable unused2) {
                        NumAuthComponent.access$000(NumAuthComponent.this, numAuthTokenCallback, -104, str2);
                    }
                }
            });
        } else {
            onFail(numAuthTokenCallback, -103, NumAuthCallback.INIT_ERROR_MSG);
        }
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public boolean needPrefetch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("746edeb8", new Object[]{this})).booleanValue();
        }
        if (this.authInfoMap.size() == 0) {
            return true;
        }
        PhoneNumberAuthHelper phoneNumberAuthHelper = this.mAuthHelper;
        if (phoneNumberAuthHelper == null) {
            return false;
        }
        return phoneNumberAuthHelper.isNeedUpdateMaskPhone();
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public boolean isSupport4G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f7a8923", new Object[]{this})).booleanValue() : this.support4G;
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public void addPrefetchResultObserver(NumberAuthService.PrefetchResultObserver prefetchResultObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95efd635", new Object[]{this, prefetchResultObserver});
        } else {
            this.observers.add(prefetchResultObserver);
        }
    }

    @Override // com.ali.user.mobile.service.NumberAuthService
    public void removePrefetchResultObserver(NumberAuthService.PrefetchResultObserver prefetchResultObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64787218", new Object[]{this, prefetchResultObserver});
        } else {
            this.observers.remove(prefetchResultObserver);
        }
    }

    private void initCheck(final NumAuthCallback numAuthCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9454191d", new Object[]{this, numAuthCallback});
            return;
        }
        Properties properties = new Properties();
        if (this.mAuthHelper == null) {
            this.mAuthHelper = PhoneNumberAuthHelper.getInstance(DataProviderFactory.getApplicationContext());
            if (this.mAuthHelper != null) {
                UserTrackAdapter.sendUT("sim_sdk_init", "1");
                this.mAuthHelper.setAuthSDKInfo(DataProviderFactory.getDataProvider().getAuthSDKInfo());
                this.mAuthHelper.checkEnvAvailable(2, new TokenResultListener() { // from class: com.ali.user.number.auth.NumAuthComponent.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.mobile.auth.gatewayauth.TokenResultListener
                    public void onTokenSuccess(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8a6edd1a", new Object[]{this, str});
                            return;
                        }
                        NumAuthComponent.access$302(NumAuthComponent.this, true);
                        NumAuthComponent.access$402(NumAuthComponent.this, true);
                        NumAuthCallback numAuthCallback2 = numAuthCallback;
                        if (numAuthCallback2 == null) {
                            return;
                        }
                        numAuthCallback2.onInit(NumAuthComponent.access$400(NumAuthComponent.this));
                    }

                    @Override // com.mobile.auth.gatewayauth.TokenResultListener
                    public void onTokenFailed(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4b51cb88", new Object[]{this, str});
                            return;
                        }
                        NumAuthComponent.access$402(NumAuthComponent.this, false);
                        NumAuthCallback numAuthCallback2 = numAuthCallback;
                        if (numAuthCallback2 == null) {
                            return;
                        }
                        numAuthCallback2.onInit(NumAuthComponent.access$400(NumAuthComponent.this));
                    }
                });
                try {
                    if (this.mAuthHelper.getReporter() == null) {
                        return;
                    }
                    this.mAuthHelper.getReporter().setLoggerEnable(SessionManager.isDebug());
                    this.mAuthHelper.getReporter().setLoggerHandler(new PnsLoggerHandler() { // from class: com.ali.user.number.auth.NumAuthComponent.6
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.mobile.auth.gatewayauth.PnsLoggerHandler
                        public void error(String str) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("72e35699", new Object[]{this, str});
                            }
                        }

                        @Override // com.mobile.auth.gatewayauth.PnsLoggerHandler
                        public void monitor(String str) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7020186b", new Object[]{this, str});
                                return;
                            }
                            try {
                                Properties properties2 = new Properties();
                                if (!TextUtils.isEmpty(str)) {
                                    properties2.put("auth", str);
                                }
                                UserTrackAdapter.sendUT("AuthSDK", properties2);
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }

                        @Override // com.mobile.auth.gatewayauth.PnsLoggerHandler
                        public void verbose(String str) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("eaa7c693", new Object[]{this, str});
                            } else {
                                error(str);
                            }
                        }

                        @Override // com.mobile.auth.gatewayauth.PnsLoggerHandler
                        public void info(String str) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f9dfc8bf", new Object[]{this, str});
                            } else {
                                error(str);
                            }
                        }

                        @Override // com.mobile.auth.gatewayauth.PnsLoggerHandler
                        public void debug(String str) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("966c00a4", new Object[]{this, str});
                            } else {
                                error(str);
                            }
                        }

                        @Override // com.mobile.auth.gatewayauth.PnsLoggerHandler
                        public void warning(String str) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f61d0d2d", new Object[]{this, str});
                            } else {
                                error(str);
                            }
                        }
                    });
                    return;
                } catch (Throwable th) {
                    th.printStackTrace();
                    if (numAuthCallback == null) {
                        return;
                    }
                    numAuthCallback.onInit(false);
                    return;
                }
            }
            UserTrackAdapter.sendUT("sim_sdk_init", "0");
            if (numAuthCallback == null) {
                return;
            }
            numAuthCallback.onInit(false);
            return;
        }
        try {
            UserTrackAdapter.sendUT("sim_check_gateway", properties);
            this.mAuthHelper.checkEnvAvailable(2, new TokenResultListener() { // from class: com.ali.user.number.auth.NumAuthComponent.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.mobile.auth.gatewayauth.TokenResultListener
                public void onTokenSuccess(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8a6edd1a", new Object[]{this, str});
                        return;
                    }
                    NumAuthComponent.access$302(NumAuthComponent.this, true);
                    NumAuthComponent.access$402(NumAuthComponent.this, true);
                    NumAuthCallback numAuthCallback2 = numAuthCallback;
                    if (numAuthCallback2 == null) {
                        return;
                    }
                    numAuthCallback2.onInit(NumAuthComponent.access$400(NumAuthComponent.this));
                }

                @Override // com.mobile.auth.gatewayauth.TokenResultListener
                public void onTokenFailed(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b51cb88", new Object[]{this, str});
                        return;
                    }
                    NumAuthComponent.access$402(NumAuthComponent.this, false);
                    NumAuthCallback numAuthCallback2 = numAuthCallback;
                    if (numAuthCallback2 == null) {
                        return;
                    }
                    numAuthCallback2.onInit(NumAuthComponent.access$400(NumAuthComponent.this));
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            if (numAuthCallback == null) {
                return;
            }
            numAuthCallback.onInit(false);
        }
    }
}
