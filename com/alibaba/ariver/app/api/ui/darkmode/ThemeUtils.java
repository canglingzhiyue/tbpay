package com.alibaba.ariver.app.api.ui.darkmode;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.model.AppConfigModel;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes2.dex */
public class ThemeUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLOR_SCHEME_DARK = "dark";
    public static final String COLOR_SCHEME_LIGHT = "light";
    public static final String KEY_COLOR_SCHEME = "colorSchemes";

    /* renamed from: a  reason: collision with root package name */
    private static String f2894a;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ColorScheme {
    }

    static {
        kge.a(1063097929);
        f2894a = "";
    }

    public static boolean isSupportDarkTheme(App app) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22a080cd", new Object[]{app})).booleanValue();
        }
        AppConfigModel appConfigModel = (AppConfigModel) app.getData(AppConfigModel.class);
        if (appConfigModel != null && (jSONArray = JSONUtils.getJSONArray(appConfigModel.getAppLaunchParams(), RVStartParams.KEY_SUPPORT_COLOR_SCHEME, null)) != null) {
            return jSONArray.contains("dark");
        }
        return false;
    }

    public static String getColorScheme(Configuration configuration) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f759db69", new Object[]{configuration}) : isDarkMode(configuration) ? "dark" : "light";
    }

    public static void setAppConfigColorScheme(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a66cf8", new Object[]{str});
        } else {
            f2894a = str;
        }
    }

    public static boolean isDarkMode(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79643682", new Object[]{context})).booleanValue();
        }
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return (uiModeManager != null ? uiModeManager.getNightMode() : 1) == 2 || isDarkMode(context.getResources().getConfiguration()) || a();
    }

    public static boolean isDarkMode(Configuration configuration) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a45192a", new Object[]{configuration})).booleanValue() : (configuration.uiMode & 48) == 32;
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : TextUtils.equals(f2894a, "dark");
    }
}
