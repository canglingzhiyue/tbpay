package com.ali.user.mobile.app.dataprovider;

import android.content.Context;
import android.text.TextUtils;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.harmony.i.IHarmonyLoginBackup;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.service.StorageService;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import java.util.Locale;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class DataProvider implements IDataProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String TTID;
    public String alipaySsoDesKey;
    public String appKey;
    public String appName;
    public Context context;
    public String deviceId;
    public boolean enableElder;
    public boolean initWithAutologin;
    public boolean isForigenLocation;
    public LoginApprearanceExtensions loginApprearanceExtensions;
    public IHarmonyLoginBackup mIHarmonyLoginBackup;
    public boolean refreshCookieDegrade;
    public RegionInfo regionInfo;
    public String sdkCustomUtdid;
    public String version;
    public boolean isTaobaoApp = false;
    public boolean needAccsLogin = false;
    public int maxHistoryAccount = 3;
    public int maxSessionSize = 20;
    public int envType = 3;
    public int site = 0;
    public boolean isRemoveSessionWhenLogout = true;
    public String regFrom = RVEnvironmentService.PLATFORM_TB;
    public boolean regPwdCheck = false;
    public boolean regEmailCheck = false;
    public boolean isForbidLoginFromBackground = false;
    public boolean enableAlipaySSO = true;
    public Locale language = Locale.SIMPLIFIED_CHINESE;
    public boolean supportFaceLogin = false;
    public boolean supportFingerprintLogin = false;
    public boolean supportMobileLogin = true;
    public boolean supportTwoStepMobileLogin = false;
    public boolean supportPwdLogin = true;
    public boolean supportOneKeyRegister = true;
    public boolean supportOneKeyLogin = true;
    public boolean enableMobilePwdLogin = false;
    public boolean showHeadCountry = true;
    public boolean isAdapterPadAndFold = false;
    public int orientation = 1;
    public boolean enableAuthService = false;
    public boolean enableVoiceMsg = false;
    public int loginStyle = -1;
    public int toolbarBack = -1;
    public boolean checkCookieValid = false;
    public boolean alwaysSMSLoginPriority = false;
    public boolean alwaysPwdLoginPriority = false;

    static {
        kge.a(1997367097);
        kge.a(-391731450);
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public Map<String, String> getAdditionalHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b27792e5", new Object[]{this});
        }
        return null;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public String getAuthSDKInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2b49c12f", new Object[]{this}) : "";
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public String getClientId(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ed1ef3", new Object[]{this, str}) : "";
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public String getDailyDomain() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e3db7a52", new Object[]{this}) : "";
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public Map<String, String> getExternalData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9df12e47", new Object[]{this});
        }
        return null;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public String getOnlineDomain() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7e45ac", new Object[]{this}) : "";
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public String getPreDomain() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("33568508", new Object[]{this}) : "";
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public Map<String, String> getRegisterExternalData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16e578d4", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean historySecurityMobileCanLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f74165a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean isSmsLoginPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8e1c229", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean isSupportFingerprintLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f59035d5", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean supportQrLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2f37f04", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean supportUninstallRelogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("319406ce", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public int getLoginStyle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a7c8a538", new Object[]{this})).intValue() : this.loginStyle;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public int getToolbarBackIcon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c878ca5f", new Object[]{this})).intValue() : this.toolbarBack;
    }

    public boolean enableNumAuthService() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f1da9075", new Object[]{this})).booleanValue() : this.enableAuthService;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean isEnableVoiceMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a742bde7", new Object[]{this})).booleanValue() : this.enableVoiceMsg;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setEnableVoiceMsg(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64668719", new Object[]{this, new Boolean(z)});
        } else {
            this.enableVoiceMsg = z;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean isRemoveSessionWhenLogout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b6ee9e77", new Object[]{this})).booleanValue() : this.isRemoveSessionWhenLogout;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setRemoveSessionWhenLogout(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2150df9", new Object[]{this, new Boolean(z)});
        } else {
            this.isRemoveSessionWhenLogout = z;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setAdapterPadAndFold(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b01d39b", new Object[]{this, new Boolean(z)});
        } else {
            this.isAdapterPadAndFold = z;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean isAdapterPadAndFold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c311a695", new Object[]{this})).booleanValue() : LoginSwitch.getSwitch(LoginSwitch.OPEN_ADAPTER_PAD_AND_FOLD, String.valueOf(this.isAdapterPadAndFold));
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public int getOrientation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad9ae414", new Object[]{this})).intValue() : this.orientation;
    }

    public void setOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bea80e", new Object[]{this, new Integer(i)});
        } else {
            this.orientation = i;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public int getMaxHistoryAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f1531c1", new Object[]{this})).intValue();
        }
        IntOrangeResult maxHistorySize = DataProviderFactory.getOrangeConfig().getMaxHistorySize();
        return maxHistorySize.orangeExist ? maxHistorySize.value : this.maxHistoryAccount;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setMaxHistoryAccount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d51701", new Object[]{this, new Integer(i)});
        } else {
            this.maxHistoryAccount = i;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public int getMaxSessionSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3d4eca3", new Object[]{this})).intValue();
        }
        IntOrangeResult maxSessionSize = DataProviderFactory.getOrangeConfig().getMaxSessionSize();
        return maxSessionSize.orangeExist ? maxSessionSize.value : this.maxSessionSize;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setMaxSessionSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f50ddbc7", new Object[]{this, new Integer(i)});
        } else {
            this.maxSessionSize = i;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public String getAppName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("92150ca3", new Object[]{this}) : this.appName;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setAppName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b790109b", new Object[]{this, str});
        } else {
            this.appName = str;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean isForbidLoginFromBackground() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1d92350e", new Object[]{this})).booleanValue() : this.isForbidLoginFromBackground;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean needAccsLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4109de8c", new Object[]{this})).booleanValue() : this.needAccsLogin;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.context;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.context = context;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public String getAppkey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9396be5", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.appKey)) {
            int envType = getEnvType();
            if (envType == 0 || envType == 1) {
                this.appKey = ((StorageService) ServiceFactory.getService(StorageService.class)).getAppKey(2);
            } else {
                this.appKey = ((StorageService) ServiceFactory.getService(StorageService.class)).getAppKey(0);
            }
        }
        return this.appKey;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setAppkey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd9dfe31", new Object[]{this, str});
        } else {
            this.appKey = str;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this}) : this.deviceId;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setDeviceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462fc2e4", new Object[]{this, str});
        } else {
            this.deviceId = str;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public String getTTID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2e0d7a8", new Object[]{this}) : this.TTID;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setTTID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb95dce", new Object[]{this, str});
        } else {
            this.TTID = str;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public int getEnvType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c2a2dd8b", new Object[]{this})).intValue() : this.envType;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setEnvType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8024377", new Object[]{this, new Integer(i)});
        } else {
            this.envType = i;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setSite(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39224633", new Object[]{this, new Integer(i)});
        } else {
            this.site = i;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public int getSite() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a406a5b7", new Object[]{this})).intValue() : this.site;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setRegFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b03c12d", new Object[]{this, str});
        } else {
            this.regFrom = str;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public String getRegFrom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c0001d1", new Object[]{this}) : this.regFrom;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean enableAlipaySSO() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a64dcad", new Object[]{this})).booleanValue() : this.enableAlipaySSO;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean isRefreshCookiesDegrade() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3d87fa3", new Object[]{this})).booleanValue() : this.refreshCookieDegrade;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public Locale getCurrentLanguage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Locale) ipChange.ipc$dispatch("4578c909", new Object[]{this}) : this.language;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setLanguage(Locale locale) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba10c316", new Object[]{this, locale});
        } else {
            this.language = locale;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public RegionInfo getCurrentRegion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RegionInfo) ipChange.ipc$dispatch("292031f7", new Object[]{this});
        }
        if (this.regionInfo == null) {
            this.regionInfo = new RegionInfo();
            RegionInfo regionInfo = this.regionInfo;
            regionInfo.name = "中国大陆";
            regionInfo.code = "+86";
            regionInfo.domain = "CN";
            regionInfo.checkPattern = "^(86){0,1}1\\d{10}$";
        }
        return this.regionInfo;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setCurrentRegion(RegionInfo regionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46fe2fd1", new Object[]{this, regionInfo});
        } else {
            this.regionInfo = regionInfo;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean supportFaceLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a99dd208", new Object[]{this})).booleanValue() : this.supportFaceLogin;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean isCheckCookieValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c6fb66a5", new Object[]{this})).booleanValue() : this.checkCookieValid;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setCheckCookieValid(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aae4a41b", new Object[]{this, new Boolean(z)});
        } else {
            this.checkCookieValid = z;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean alwaysSMSLoginPriority() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a2f2668e", new Object[]{this})).booleanValue() : this.alwaysSMSLoginPriority;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public String getUtdid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this}) : this.sdkCustomUtdid;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setUtdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ee964f", new Object[]{this, str});
        } else {
            this.sdkCustomUtdid = str;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean supportOneKeyRegister() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cc6a3c96", new Object[]{this})).booleanValue() : this.supportOneKeyRegister;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean supportOneKeyLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46e82d8c", new Object[]{this})).booleanValue() : this.supportOneKeyLogin;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean enableElder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2a0ecf52", new Object[]{this})).booleanValue() : this.enableElder;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setEnableElder(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a0c9c8", new Object[]{this, new Boolean(z)});
        } else {
            this.enableElder = z;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean initWithAutoLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2bdc2f", new Object[]{this})).booleanValue() : this.initWithAutologin;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setInitWithAutoLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72626f0b", new Object[]{this, new Boolean(z)});
        } else {
            this.initWithAutologin = z;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setLoginApprearanceExtensions(LoginApprearanceExtensions loginApprearanceExtensions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6616109", new Object[]{this, loginApprearanceExtensions});
        } else {
            this.loginApprearanceExtensions = loginApprearanceExtensions;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean isForigenLocation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7154ee6", new Object[]{this})).booleanValue() : this.isForigenLocation;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setForigenLocation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425f236a", new Object[]{this, new Boolean(z)});
        } else {
            this.isForigenLocation = z;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public String getAlipaySsoDesKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f3ee5fd", new Object[]{this}) : this.alipaySsoDesKey;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setAlipaySsoDesKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c5ae81", new Object[]{this, str});
        } else {
            this.alipaySsoDesKey = str;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public LoginApprearanceExtensions getLoginExtension() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoginApprearanceExtensions) ipChange.ipc$dispatch("c0e14834", new Object[]{this}) : this.loginApprearanceExtensions;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public IHarmonyLoginBackup getHarmonyLoginBackup() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IHarmonyLoginBackup) ipChange.ipc$dispatch("d8fbe0fc", new Object[]{this}) : this.mIHarmonyLoginBackup;
    }

    @Override // com.ali.user.mobile.app.dataprovider.IDataProvider
    public void setHarmonyLoginBackup(IHarmonyLoginBackup iHarmonyLoginBackup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68ffc", new Object[]{this, iHarmonyLoginBackup});
        } else {
            this.mIHarmonyLoginBackup = iHarmonyLoginBackup;
        }
    }
}
