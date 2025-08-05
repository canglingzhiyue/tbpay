package com.taobao.desktop.widget.manager;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.widgetvivo.server.WidgetVivoService;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.khp;
import tb.khw;
import tb.kib;
import tb.kif;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f16980a;

    static {
        kge.a(-1600287498);
        f16980a = new HashMap();
    }

    public static String a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, str, str2});
        }
        try {
            if (f16980a == null || f16980a.isEmpty()) {
                f16980a = khw.a(context).a(khp.SP_ORANGE_MANUFACTURER_REACH);
            }
            if (!TextUtils.isEmpty(f16980a.get(str))) {
                return f16980a.get(str);
            }
        } catch (Throwable th) {
            kif.a("OrangeConfigManager getConfig error:" + th.getMessage());
        }
        return str2;
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        try {
            String a2 = a(context, "widget_req_interval", String.valueOf(0));
            kif.b("getWidgetReqInterval" + a2);
            return Integer.parseInt(a2);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static long w(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("acf423fe", new Object[]{context})).longValue();
        }
        try {
            String a2 = a(context, "widget_system_req_interval", String.valueOf(60000L));
            kif.b("getSystemReqInterval: " + a2);
            return Long.parseLong(a2);
        } catch (Exception e) {
            kif.a("getSystemReqInterval" + e);
            return 60000L;
        }
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        try {
            String a2 = a(context, "widget_req_max", String.valueOf(0));
            kif.b("getWidgetReqMaxTimes" + a2);
            return Integer.parseInt(a2);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue();
        }
        try {
            String a2 = a(context, WidgetVivoService.WIDGET_ORDER_MAX_REQUEST_TIMES, String.valueOf(0));
            kif.a.a("WIDGET_ORDER_MAX_REQUEST_TIMES0");
            return Integer.parseInt(a2);
        } catch (Exception e) {
            kif.a.a(e.getMessage());
            return 0;
        }
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue();
        }
        try {
            return Boolean.parseBoolean(a(context, "widget_add_inside", String.valueOf(true)));
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue();
        }
        try {
            String a2 = a(context, "widget_process_switch_enable", String.valueOf(true));
            kif.a("widgetProcessSwitch: " + a2);
            return Boolean.parseBoolean(a2);
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a17cbe7f", new Object[]{context})).booleanValue();
        }
        try {
            String a2 = a(context, "widget_vivo_order_update_bg", String.valueOf(true));
            kif.a("vivoOrderUpdateBackGround: " + a2);
            return Boolean.parseBoolean(a2);
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2296a1e", new Object[]{context})).booleanValue();
        }
        try {
            String a2 = a(context, "widget_vivo_brand_filter", String.valueOf(true));
            kif.a("vivoBrandFilter: " + a2);
            return Boolean.parseBoolean(a2);
        } catch (Exception e) {
            kif.a("vivoBrandFilter: " + e.getMessage());
            return true;
        }
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2d615bd", new Object[]{context})).booleanValue();
        }
        try {
            String a2 = a(context, "widget_mtop_unsign_enable", String.valueOf(false));
            kif.a("widgetMTopUnSignEnable: " + a2);
            return Boolean.parseBoolean(a2);
        } catch (Exception e) {
            kif.a("widgetMTopUnSign: " + e.getMessage());
            return false;
        }
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a382c15c", new Object[]{context})).booleanValue();
        }
        try {
            String a2 = a(context, "widget_process_sync", String.valueOf(true));
            kif.a("widgetProcessSync: " + a2);
            return Boolean.parseBoolean(a2);
        } catch (Exception e) {
            kif.a("widgetProcessSync: " + e.getMessage());
            return true;
        }
    }

    public static boolean j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a42f6cfb", new Object[]{context})).booleanValue();
        }
        try {
            String a2 = a(context, "dynamic_enable_new_corner_radius", String.valueOf(true));
            kif.a("widgetEnableNewCornerRadius: " + a2);
            return Boolean.parseBoolean(a2);
        } catch (Exception e) {
            kif.a("widgetEnableNewCornerRadius: " + e.getMessage());
            return true;
        }
    }

    public static boolean k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4dc189a", new Object[]{context})).booleanValue();
        }
        try {
            String a2 = a(context, "dynamic_enable_corner_radius", String.valueOf(true));
            kif.a("widgetEnableCornerRadius: " + a2);
            return Boolean.parseBoolean(a2);
        } catch (Exception e) {
            kif.a("widgetEnableCornerRadius: " + e.getMessage());
            return true;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            String a2 = a(kib.a().b(), "globalNavAddDesktop", String.valueOf(true));
            kif.a("globalNavAddDesktop: " + a2);
            return Boolean.parseBoolean(a2);
        } catch (Exception e) {
            kif.a("globalNavAddDesktop: " + e.getMessage());
            return true;
        }
    }

    public static boolean m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6356fd8", new Object[]{context})).booleanValue();
        }
        try {
            String a2 = a(context, "huawei_search_enable", String.valueOf(false));
            kif.a("huaweiSearchEnable: " + a2);
            return Boolean.parseBoolean(a2);
        } catch (Exception e) {
            kif.a("huaweiSearchEnable: " + e.getMessage());
            return true;
        }
    }

    public static boolean n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6e21b77", new Object[]{context})).booleanValue();
        }
        try {
            String a2 = a(context, "oppo_link_restore_enable", String.valueOf(true));
            kif.a("oppoLinkRestoreEnable: " + a2);
            return Boolean.parseBoolean(a2);
        } catch (Exception e) {
            kif.a("oppoLinkRestoreEnable: " + e.getMessage());
            return true;
        }
    }

    public static boolean o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a78ec716", new Object[]{context})).booleanValue();
        }
        String a2 = a(context, "widgetReceiverInstallEnable", String.valueOf(true));
        kif.a("widgetReceiverInstallEnable: " + a2);
        return Boolean.parseBoolean(a2);
    }

    public static boolean p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a83b72b5", new Object[]{context})).booleanValue();
        }
        String a2 = a(context, "widgetDelLimitEnable", String.valueOf(true));
        kif.a("widgetDelLimitEnable: " + a2);
        return Boolean.parseBoolean(a2);
    }

    public static boolean q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8e81e54", new Object[]{context})).booleanValue();
        }
        String a2 = a(context, "widgetAddDispatchNewEnable", String.valueOf(true));
        kif.a("widgetAddDispatchEnable: " + a2);
        return Boolean.parseBoolean(a2);
    }

    public static boolean r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a994c9f3", new Object[]{context})).booleanValue();
        }
        String a2 = a(context, "widgetSwitchEnable", String.valueOf(false));
        kif.a("orange widgetSwitchEnable: " + a2);
        return Boolean.parseBoolean(a2);
    }

    public static boolean s(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa417592", new Object[]{context})).booleanValue();
        }
        String a2 = a(context, "widgetTargetSdk", String.valueOf(true));
        kif.a("orange widgetTargetSdkEnable: " + a2);
        return Boolean.parseBoolean(a2);
    }

    public static boolean t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aaee2131", new Object[]{context})).booleanValue();
        }
        String a2 = a(context, "widgetInstallSystem", String.valueOf(true));
        kif.a("orange widgetInstallSystemEnable: " + a2);
        return Boolean.parseBoolean(a2);
    }

    public static String u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e950d954", new Object[]{context});
        }
        String a2 = a(context, "widgetDeviceConfig", "{\"huawei\":{\"os_version\":\"8\",\"os_support\":true},\"honor\":{\"os_version\":\"8\",\"os_support\":true},\"oppo\":{\"os_version\":\"11\",\"os_support\":true},\"vivo\":{\"os_version\":\"8\",\"os_support\":true},\"xiaomi\":{\"os_version\":\"8\",\"os_support\":true},\"redmi\":{\"os_version\":\"8\",\"os_support\":true}}");
        kif.a("orange widgetDeviceConfig: " + a2);
        return a2;
    }

    public static String v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ecaff95", new Object[]{context});
        }
        String a2 = a(context, "widgetTypeConfig", "");
        kif.a("orange widgetTypeConfig: " + a2);
        return a2;
    }

    public static Boolean l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("453f1272", new Object[]{context});
        }
        String a2 = a(context, "widgetDefaultEditEnable", String.valueOf(true));
        kif.a("widgetDefaultEditEnable: " + a2);
        return Boolean.valueOf(Boolean.parseBoolean(a2));
    }

    public static Boolean A(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("9035e1fd", new Object[]{context});
        }
        String a2 = a(context, "widgetVivoFilter", String.valueOf(true));
        kif.a("widgetVivoFilter: " + a2);
        return Boolean.valueOf(Boolean.parseBoolean(a2));
    }
}
