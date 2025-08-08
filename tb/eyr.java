package tb;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.realidentity.m;
import com.android.alibaba.ip.runtime.IpChange;

@Deprecated
/* loaded from: classes2.dex */
public class eyr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1934489852);
    }

    public static boolean a() {
        Class<?> cls;
        try {
            cls = Class.forName("android.os.SystemProperties");
        } catch (Exception unused) {
        }
        return !StringUtils.isEmpty((String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.flyme.version", ""));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : Build.MANUFACTURER.equalsIgnoreCase("HONOR");
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        String str = Build.BRAND;
        if (!str.equalsIgnoreCase("huawei") && !str.equalsIgnoreCase("honor") && !str.equalsIgnoreCase("华为")) {
            String a2 = a(m.v);
            String a3 = a("hw_sc.build.platform.version");
            if (StringUtils.isEmpty(a2) && StringUtils.isEmpty(a3)) {
                return false;
            }
        }
        return true;
    }

    private static String a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }
}
