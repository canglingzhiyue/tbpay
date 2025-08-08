package tb;

import android.app.Application;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class khp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_ORANGE_MANUFACTURER_REACH = "sp_orange_manufacturer_reach";

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, String> f30079a = new HashMap();

    public static void a(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"manufacturer_reach"}, new d() { // from class: tb.khp.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                        return;
                    }
                    khp.f30079a = OrangeConfig.getInstance().getConfigs(str);
                    khu.a("initOrange === registerListener === nameSpace：" + str + "=== configs: " + khp.f30079a);
                    khw.a(application).a(khp.SP_ORANGE_MANUFACTURER_REACH, khp.f30079a);
                }
            }, false);
        }
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            khu.b("OrangeBaseConfigManager getConfig key: " + str);
            if (f30079a == null || f30079a.isEmpty()) {
                f30079a = khw.a(khm.a().c()).a(SP_ORANGE_MANUFACTURER_REACH);
            }
            if (!StringUtils.isEmpty(f30079a.get(str))) {
                return f30079a.get(str);
            }
        } catch (Exception e) {
            khu.a("OrangeBaseConfigManager getConfig error:" + e.getMessage());
        }
        return str2;
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue() : StringUtils.equals("true", a(str, String.valueOf(z)));
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            String a2 = a("mtop_init_enable", String.valueOf(true));
            khu.a("mtopInitEnable: " + a2);
            return Boolean.parseBoolean(a2);
        } catch (Exception e) {
            khu.a("mtopInitEnable error " + e.getMessage());
            return true;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        try {
            String str = f30079a.get("process_sp_enable");
            khu.a("processSpEnable: " + str);
            if (StringUtils.isEmpty(str)) {
                return true;
            }
            return Boolean.parseBoolean(str);
        } catch (Exception e) {
            khu.a("processSpEnable error " + e.getMessage());
            return true;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        try {
            boolean a2 = a("enable_dynamic_widget", true);
            khu.a("dynamicWidgetEnable: " + a2);
            return a2;
        } catch (Exception e) {
            khu.a("dynamicWidgetEnable error " + e.getMessage());
            return true;
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        String a2 = a("widgetViewAnimEnable", String.valueOf(true));
        khu.b("orange widgetViewAnimEnable: " + a2);
        return Boolean.parseBoolean(a2);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        String a2 = a("widgetViewAnimResetEnable", String.valueOf(false));
        khu.a("widgetViewAnimResetEnable orange: " + a2);
        return Boolean.parseBoolean(a2);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        String a2 = a("widgetFrameAnimEnable", String.valueOf(true));
        khu.a("widgetFrameAnimEnable orange: " + a2);
        return Boolean.parseBoolean(a2);
    }
}
