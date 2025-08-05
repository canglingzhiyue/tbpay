package com.ali.user.mobile.common.api;

import android.content.SharedPreferences;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class AliUserLogin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile AliUserLogin aliUserLogin;
    public static LoginApprearanceExtensions mAppreanceExtentions;

    static {
        kge.a(960252369);
    }

    public static LoginApprearanceExtensions getAppreanceExtentions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginApprearanceExtensions) ipChange.ipc$dispatch("2cc30e0a", new Object[0]);
        }
        if (mAppreanceExtentions == null && DataProviderFactory.getDataProvider().getLoginExtension() != null) {
            mAppreanceExtentions = DataProviderFactory.getDataProvider().getLoginExtension();
        }
        return mAppreanceExtentions;
    }

    private AliUserLogin() {
    }

    public static AliUserLogin getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliUserLogin) ipChange.ipc$dispatch("1fd9dd92", new Object[0]);
        }
        if (aliUserLogin == null) {
            synchronized (AliUserLogin.class) {
                if (aliUserLogin == null) {
                    aliUserLogin = new AliUserLogin();
                }
            }
        }
        return aliUserLogin;
    }

    public static void setLoginAppreanceExtions(LoginApprearanceExtensions loginApprearanceExtensions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f4821a", new Object[]{loginApprearanceExtensions});
        } else {
            mAppreanceExtentions = loginApprearanceExtensions;
        }
    }

    public static void clearCacheData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82e73d0", new Object[]{str});
            return;
        }
        try {
            SharedPreferences sharedPreferences = DataProviderFactory.getApplicationContext().getSharedPreferences(str, 0);
            if (sharedPreferences == null) {
                return;
            }
            sharedPreferences.edit().clear().apply();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
