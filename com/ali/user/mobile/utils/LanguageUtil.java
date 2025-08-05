package com.ali.user.mobile.utils;

import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.editionswitcher.b;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.util.Locale;
import tb.kge;

/* loaded from: classes2.dex */
public class LanguageUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1859795808);
    }

    public static boolean isChineseLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a92e3e6", new Object[0])).booleanValue();
        }
        Locale currentLanguage = DataProviderFactory.getDataProvider().getCurrentLanguage();
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
        Locale currentLanguage = DataProviderFactory.getDataProvider().getCurrentLanguage();
        return currentLanguage == null ? "zh" : currentLanguage.getLanguage();
    }

    public static boolean isHK() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dddb59b8", new Object[0])).booleanValue();
        }
        try {
            PositionInfo b = b.b(DataProviderFactory.getApplicationContext());
            if (b != null) {
                return "HK".equals(b.countryCode);
            }
            return false;
        } catch (Throwable th) {
            LoginTLogAdapter.e("login.LoginStatus", "isHKFailed," + th.getMessage());
            return false;
        }
    }

    public static String getCountry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73367799", new Object[0]);
        }
        Locale currentLanguage = DataProviderFactory.getDataProvider().getCurrentLanguage();
        return currentLanguage == null ? "CN" : currentLanguage.getCountry();
    }
}
