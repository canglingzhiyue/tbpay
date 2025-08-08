package com.taobao.android.tbtheme.kit;

import android.app.Application;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.downgrade.Downgrade;
import com.taobao.downgrade.DowngradeStrategy;
import com.taobao.tao.Globals;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.akt;
import tb.kge;
import tb.sct;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DARK_MODE_ADAPTER_DEVICES = "darkModeAdapterDevices";
    public static final String IS_DARK_MODE_ADAPTER_OPEN = "isDarkModeAdapterOpen";
    public static final String MODULE_NAME = "TaobaoThemeKit";
    public static final String NEW_2021_UI_KEY = "new2021UIEnable";
    public static final String ORANGE_KEY_RESIZE_IMAGE_VIEW = "resizeImageViewWhenPictureDownloaded";
    public static final String SP_KEY_DEVICE_LEVEL = "deviceLevel";

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f15436a;
    private static boolean c;
    private static boolean d;

    static {
        kge.a(-339447466);
        c = false;
        d = false;
        f15436a = new HashSet<String>() { // from class: com.taobao.android.tbtheme.kit.SwitchUtil$1
            {
                add("globalTheme");
                add("globalThemeLow");
                add("globalThemeMedium");
                add("globalThemeHigh");
                add("globalToggle");
                add(f.IS_DARK_MODE_ADAPTER_OPEN);
                add(f.DARK_MODE_ADAPTER_DEVICES);
                add(f.ORANGE_KEY_RESIZE_IMAGE_VIEW);
                add("whiteBizList");
            }
        };
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (!d) {
            c = TBRevisionSwitchManager.i().a("new2021UIEnable");
            d = true;
        }
        return c;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        if (h()) {
            return null;
        }
        String a2 = sct.a();
        m.a("SwitchUtil", "getDefaultFromOrange", null);
        return StringUtils.isEmpty(a2) ? "{\"skinPicForiPhoneX\":\"https://gw.alicdn.com/imgextra/i4/O1CN01QpdVAb1kZjNyqftN9_!!6000000004698-0-tps-1125-880.jpg\",\"skinPic\":\"https://gw.alicdn.com/imgextra/i4/O1CN01QpdVAb1kZjNyqftN9_!!6000000004698-0-tps-1125-880.jpg\",\"actionbarTextColor\":\"#111111\",\"actionBarBackgroundColor\":\"#FFFFFF\",\"statusBarStyle\":\"0\",\"naviStyle\":\"1\",\"isComplexTexture\":\"false\"}" : a.a(MODULE_NAME, a2, "{\"skinPicForiPhoneX\":\"https://gw.alicdn.com/imgextra/i4/O1CN01QpdVAb1kZjNyqftN9_!!6000000004698-0-tps-1125-880.jpg\",\"skinPic\":\"https://gw.alicdn.com/imgextra/i4/O1CN01QpdVAb1kZjNyqftN9_!!6000000004698-0-tps-1125-880.jpg\",\"actionbarTextColor\":\"#111111\",\"actionBarBackgroundColor\":\"#FFFFFF\",\"statusBarStyle\":\"0\",\"naviStyle\":\"1\",\"isComplexTexture\":\"false\"}");
    }

    private static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : akt.a() == 2;
    }

    public static String g() {
        JSONObject param;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[0]);
        }
        DowngradeStrategy downgradeStrategy = Downgrade.getInstance().getDowngradeStrategy("taobao_theme_kit");
        String str = null;
        if (downgradeStrategy != null && (param = downgradeStrategy.getParam()) != null) {
            str = param.getString("theme");
        }
        m.a("SwitchUtil", "getDowngrade", "themeName:" + str);
        return str;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        String a2 = a("whiteBizList", "");
        if (StringUtils.isEmpty(a2)) {
            return false;
        }
        String[] split = a2.split(",");
        if (split.length == 0) {
            return false;
        }
        for (String str2 : split) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
            return;
        }
        for (String str2 : f15436a) {
            if (map.containsKey(str2)) {
                a.b(str, str2, map.get(str2));
            } else {
                a.b(str, str2, null);
            }
        }
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : a.a(MODULE_NAME, str, str2);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue() : Boolean.parseBoolean(a.a(MODULE_NAME, str, String.valueOf(z)));
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1491598168);
        }

        public static String a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3}) : c(str, str2, str3);
        }

        public static void b(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
            } else {
                d(str, str2, str3);
            }
        }

        private static SharedPreferences a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("551a7086", new Object[]{str});
            }
            Application application = Globals.getApplication();
            if (application == null) {
                return null;
            }
            return application.getSharedPreferences(str, 0);
        }

        private static String c(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c9ab53d8", new Object[]{str, str2, str3});
            }
            SharedPreferences a2 = a(str);
            return a2 != null ? a2.getString(str2, str3) : str3;
        }

        private static void d(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4bc3689", new Object[]{str, str2, str3});
                return;
            }
            SharedPreferences a2 = a(str);
            if (a2 == null) {
                return;
            }
            SharedPreferences.Editor edit = a2.edit();
            edit.putString(str2, str3);
            edit.apply();
        }
    }
}
