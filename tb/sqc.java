package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.c;

/* loaded from: classes5.dex */
public final class sqc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Boolean d;
    private static Boolean e;

    static {
        kge.a(-1179743947);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        Boolean bool = d;
        if (bool != null) {
            return bool.booleanValue();
        }
        String e2 = e();
        if (StringUtils.isEmpty(e2)) {
            d = false;
        } else if (e2.split("\\.").length == 4) {
            d = true;
        } else {
            d = false;
        }
        spz.c("FluidSDKSwitch", "FluidSDK 新架构应用版本号：" + e2 + "，是否为灰度包：" + d);
        return d.booleanValue();
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : (String) c.a("appVersion", "");
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : ((Boolean) c.a("isDebuggable", false)).booleanValue();
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        Boolean bool = e;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (sqb.a(sqb.DEV_TOOLS_CLASS_NAME, false) != null) {
            z = true;
        }
        e = Boolean.valueOf(z);
        spz.c("FluidSDKSwitch", "FluidSDK 新架构是否集成 fluid-devtools: " + e);
        return e.booleanValue();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : oeb.h("enableGGGlobalH5Oldlocal");
    }
}
