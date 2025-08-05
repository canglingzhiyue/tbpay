package com.taobao.android.editionswitcher;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.kge;

/* loaded from: classes5.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_FILE_HOME_DX_DATA = "home_dx_data";

    static {
        kge.a(-1580478287);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : a("homepage_biz_switch", str, str2);
    }

    public static String a(String str, String str2, String str3) {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str2) || (application = Globals.getApplication()) == null) {
            return null;
        }
        return application.getSharedPreferences(str, 0).getString(str2, str3);
    }
}
