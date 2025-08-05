package com.ali.user.mobile.app.dataprovider;

import android.content.Context;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.harmony.i.IHarmonyLoginBackup;
import com.ali.user.mobile.model.RegionInfo;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public interface IDataProvider {
    boolean alwaysSMSLoginPriority();

    boolean enableAlipaySSO();

    boolean enableElder();

    Map<String, String> getAdditionalHeaders();

    String getAlipaySsoDesKey();

    String getAppName();

    String getAppkey();

    String getAuthSDKInfo();

    String getClientId(String str);

    Context getContext();

    Locale getCurrentLanguage();

    RegionInfo getCurrentRegion();

    String getDailyDomain();

    String getDeviceId();

    int getEnvType();

    Map<String, String> getExternalData();

    IHarmonyLoginBackup getHarmonyLoginBackup();

    LoginApprearanceExtensions getLoginExtension();

    int getLoginStyle();

    int getMaxHistoryAccount();

    int getMaxSessionSize();

    String getOnlineDomain();

    int getOrientation();

    String getPreDomain();

    String getRegFrom();

    Map<String, String> getRegisterExternalData(String str);

    int getSite();

    String getTTID();

    int getToolbarBackIcon();

    String getUtdid();

    boolean historySecurityMobileCanLogin();

    boolean initWithAutoLogin();

    boolean isAdapterPadAndFold();

    boolean isCheckCookieValid();

    boolean isEnableVoiceMsg();

    boolean isForbidLoginFromBackground();

    boolean isForigenLocation();

    boolean isRefreshCookiesDegrade();

    boolean isRemoveSessionWhenLogout();

    boolean isSmsLoginPriority();

    boolean isSupportFingerprintLogin();

    boolean needAccsLogin();

    void setAdapterPadAndFold(boolean z);

    void setAlipaySsoDesKey(String str);

    void setAppName(String str);

    void setAppkey(String str);

    void setCheckCookieValid(boolean z);

    void setContext(Context context);

    void setCurrentRegion(RegionInfo regionInfo);

    void setDeviceId(String str);

    void setEnableElder(boolean z);

    void setEnableVoiceMsg(boolean z);

    void setEnvType(int i);

    void setForigenLocation(boolean z);

    void setHarmonyLoginBackup(IHarmonyLoginBackup iHarmonyLoginBackup);

    void setInitWithAutoLogin(boolean z);

    void setLanguage(Locale locale);

    void setLoginApprearanceExtensions(LoginApprearanceExtensions loginApprearanceExtensions);

    void setMaxHistoryAccount(int i);

    void setMaxSessionSize(int i);

    void setRegFrom(String str);

    void setRemoveSessionWhenLogout(boolean z);

    void setSite(int i);

    void setTTID(String str);

    void setUtdid(String str);

    boolean supportFaceLogin();

    boolean supportOneKeyLogin();

    boolean supportOneKeyRegister();

    boolean supportQrLogin();

    boolean supportUninstallRelogin();
}
