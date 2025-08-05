package com.taobao.login4android.login;

import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProvider;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.service.StorageService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;

/* loaded from: classes7.dex */
public class DefaultTaobaoAppProvider extends DataProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
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

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this});
        }
        this.deviceId = ((RpcService) ServiceFactory.getService(RpcService.class)).getDeviceId();
        return this.deviceId;
    }

    public boolean isTaobaoApp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fe98e414", new Object[]{this})).booleanValue() : this.isTaobaoApp;
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean isForbidLoginFromBackground() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1d92350e", new Object[]{this})).booleanValue() : LoginSwitch.getSwitch(LoginSwitch.FORBID_LOGIN_FROM_BACKGROUND, "false");
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean needAccsLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4109de8c", new Object[]{this})).booleanValue() : LoginSwitch.getSwitch(LoginSwitch.ACCS_LOGIN_SWITCH, "false");
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean enableAlipaySSO() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a64dcad", new Object[]{this})).booleanValue() : LoginSwitch.getSwitch(LoginSwitch.ALIPAY_SSO_SWITCH, "true") && this.enableAlipaySSO;
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean isRefreshCookiesDegrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3d87fa3", new Object[]{this})).booleanValue();
        }
        if (this.site != 0) {
            return false;
        }
        return LoginSwitch.getSwitch(LoginSwitch.REFRESH_COOKIE_DEGRADE_SWITCH, "false");
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean supportFaceLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a99dd208", new Object[]{this})).booleanValue() : LoginSwitch.getSwitch(LoginSwitch.SUPPORT_FACE_LOGIN, "true") && this.supportFaceLogin;
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean isSupportFingerprintLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f59035d5", new Object[]{this})).booleanValue() : this.supportFingerprintLogin && LoginSwitch.getSwitch(LoginSwitch.SUPPORT_FINGERPRINT_LOGIN, "true");
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider
    public boolean enableNumAuthService() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f1da9075", new Object[]{this})).booleanValue() : this.enableAuthService && LoginSwitch.getSwitch(LoginSwitch.SUPPORT_NUM_AUTH, "true");
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean supportOneKeyLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46e82d8c", new Object[]{this})).booleanValue() : LoginSwitch.isInABTestRegion(LoginSwitch.ONEKEY_LOGIN_PERCENT, 10000);
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean supportOneKeyRegister() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cc6a3c96", new Object[]{this})).booleanValue() : LoginSwitch.isInABTestRegion(LoginSwitch.ONEKEY_REGISTER_PERCENT, 10000);
    }
}
