package com.ali.user.mobile.utils;

import android.view.View;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.ui.engine.friend.a;
import java.util.Locale;
import tb.kge;

/* loaded from: classes2.dex */
public class ResourceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-727703274);
    }

    public static String getInvalidParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ec5c0b2d", new Object[0]) : getStringById("aliuser_debug_param_invalid");
    }

    public static String getNetworkError() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("63979e09", new Object[0]) : getStringById("aliuser_network_error");
    }

    public static String getStringById(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5a49096", new Object[]{str});
        }
        try {
            int stringId = getStringId(str);
            return stringId > 0 ? DataProviderFactory.getApplicationContext().getResources().getString(stringId) : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static View findViewById(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dc547407", new Object[]{view, str});
        }
        if (view != null) {
            return view.findViewById(getViewId(str));
        }
        return null;
    }

    public static int getViewId(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aa52979a", new Object[]{str})).intValue() : getIdentifierByName(str, "id");
    }

    public static int getStringId(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2f527386", new Object[]{str})).intValue() : getIdentifierByName(str, "string");
    }

    public static int getDrawableId(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("442f9793", new Object[]{str})).intValue() : getIdentifierByName(str, a.CONTACTS_INFO_NOT_EMPTY_STATUS);
    }

    private static int getIdentifierByName(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de49820f", new Object[]{str, str2})).intValue();
        }
        int identifier = DataProviderFactory.getApplicationContext().getResources().getIdentifier(str, str2, DataProviderFactory.getApplicationContext().getPackageName());
        return identifier != 0 ? identifier : DataProviderFactory.getApplicationContext().getResources().getIdentifier(str, str2, DataProviderFactory.getDataProvider().getAppName());
    }

    public static String getLocaleStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac554ed8", new Object[0]);
        }
        return DataProviderFactory.getDataProvider().getCurrentLanguage() != null ? DataProviderFactory.getDataProvider().getCurrentLanguage().toString() : Locale.SIMPLIFIED_CHINESE.toString();
    }
}
