package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class afj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, String> f25312a;

    static {
        kge.a(1539570048);
        f25312a = new ConcurrentHashMap<>();
    }

    public static boolean a(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a35a6236", new Object[]{str, new Boolean(z), new Boolean(z2)})).booleanValue() : a("light_buy", str, z, z2);
    }

    public static boolean a(String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69a07900", new Object[]{str, str2, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (z2) {
            String str3 = f25312a.get(str2);
            if (!StringUtils.isEmpty(str3)) {
                return Boolean.parseBoolean(str3);
            }
        }
        String config = OrangeConfig.getInstance().getConfig(str, str2, null);
        if (config == null) {
            f25312a.put(str2, String.valueOf(z));
            return z;
        }
        f25312a.put(str2, config);
        return Boolean.parseBoolean(config);
    }

    public static String a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91186ac8", new Object[]{str, str2, new Boolean(z)}) : a("light_buy", str, str2, z);
    }

    public static String a(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d604f12", new Object[]{str, str2, str3, new Boolean(z)});
        }
        if (z) {
            String str4 = f25312a.get(str2);
            if (!StringUtils.isEmpty(str4)) {
                return str4;
            }
        }
        String config = OrangeConfig.getInstance().getConfig(str, str2, null);
        if (config == null) {
            f25312a.put(str2, str3);
            return str3;
        }
        f25312a.put(str2, config);
        return config;
    }
}
