package com.taobao.login4android;

import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.app.init.Debuggable;
import com.ali.user.mobile.model.RegionInfo;
import com.alibaba.ability.localization.constants.Language;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbelder.b;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.login.DefaultTaobaoAppProvider;
import com.taobao.login4android.membercenter.account.AccountListComponent;
import java.util.Locale;
import tb.kge;

/* loaded from: classes7.dex */
public class TaobaoAppProvider extends DefaultTaobaoAppProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Login.AppProvider";

    static {
        kge.a(-216832698);
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public String getClientId(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ed1ef3", new Object[]{this, str}) : "234612022780-rpsju7nmr23f4pi02lntnjdsjvhedeuf.apps.googleusercontent.com";
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean isSmsLoginPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8e1c229", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean supportUninstallRelogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("319406ce", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public TaobaoAppProvider() {
        this.isTaobaoApp = true;
        this.supportFaceLogin = true;
        this.enableAuthService = true;
        setRemoveSessionWhenLogout(false);
        this.enableElder = b.c();
        setCheckCookieValid(true);
        this.isAdapterPadAndFold = true;
        this.alipaySsoDesKey = "authlogin_taobao_android_aes128";
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public RegionInfo getCurrentRegion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RegionInfo) ipChange.ipc$dispatch("292031f7", new Object[]{this});
        }
        if (this.regionInfo == null) {
            this.regionInfo = new RegionInfo();
            this.regionInfo.domain = "CN";
        }
        return this.regionInfo;
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public int getMaxHistoryAccount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f1531c1", new Object[]{this})).intValue() : AccountListComponent.isMultiAccountPageEnable() ? 5 : 1;
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public int getMaxSessionSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d3d4eca3", new Object[]{this})).intValue() : AccountListComponent.isMultiAccountPageEnable() ? 5 : 1;
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public String getAuthSDKInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2b49c12f", new Object[]{this}) : Debuggable.isDebug() ? "LFdzP9B3UuDx9dYE5QdwOg/tVVMunq4MUcHYXZNN5lYCACSfTDzOKM8VvlRUOY3dquPQqjL9BXOaAQM+u2m7MTdO9m6cS0eSnfoHla0d9M3WtenaJ9CLe8h+H7qD7+bDsyxdX4SDStE//Obw5CkdPJuhL0GRA4DakGuwf8xhPWAHXDs2bijQ1nRyFYvibOE2SJ/9vVkmrg23NMjOcty0n6YIalx41hd5uCytO5ZZzwlZOia8WTrYYhnHRpS5alfYO+HYEuBe1+wOw4IAmMmEpEwDlUvC8o00349FW1WYxQxuISMuRFgWEg==" : "tKIZUvjHoahfUbu4IOGAetFU6BOOfwawcYTGWoTs2cXc+u4WVUlbbgkbJcOHY0EMFnc5JmBzLa9hH2/eOOAUEd6eHe5uz2wyBGmAjjKgJjncFn6C/ZHn/Q9lDzttM3jDWk/UH5Eyzc2ALexLvRxiqlwRh1YVyiV+lRSTxw0kDWQfakExNszNqU/ZTcbjrgVqgAoUKG2f1HsF5G1IJJzP6KNJCsiogzWpnfI+5rFpp+1/wYd5hc1spwVCzXhQGq5U7pFubV+Orq2Fj6+jvm8B3mCMFP+deOaJZWDXjCwVub3P0R8SQnC/2g==";
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean isForigenLocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7154ee6", new Object[]{this})).booleanValue();
        }
        try {
            return com.taobao.android.editionswitcher.b.d(DataProviderFactory.getApplicationContext());
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public Locale getCurrentLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Locale) ipChange.ipc$dispatch("4578c909", new Object[]{this});
        }
        try {
            Language a2 = com.alibaba.ability.localization.b.a();
            if (a2 != null) {
                return new Locale(a2.getLanguage(), a2.getCountry());
            }
        } catch (Throwable th) {
            th.printStackTrace();
            LoginTLogAdapter.e(TAG, "getLanguageException");
        }
        return Locale.SIMPLIFIED_CHINESE;
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean historySecurityMobileCanLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f74165a", new Object[]{this})).booleanValue() : LoginSwitch.isInABTestRegion("securityMobile", 10000);
    }

    @Override // com.ali.user.mobile.app.dataprovider.DataProvider, com.ali.user.mobile.app.dataprovider.IDataProvider
    public boolean supportQrLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c2f37f04", new Object[]{this})).booleanValue() : LoginSwitch.isInABTestRegion("qrcodeLogin", 10000);
    }
}
