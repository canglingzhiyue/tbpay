package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class fgr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Boolean> f27932a;

    static {
        kge.a(-747910387);
        f27932a = new HashMap();
        emu.a("com.taobao.android.detail.wrapper.utils.DetailWrapperOrangeUtil");
    }

    public static boolean a(String str, boolean z, boolean z2) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a35a6236", new Object[]{str, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (z2 && (bool = f27932a.get(str)) != null) {
            return bool.booleanValue();
        }
        boolean parseBoolean = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("android_detail", str, String.valueOf(z)));
        if (z2) {
            f27932a.put(str, Boolean.valueOf(parseBoolean));
        }
        return parseBoolean;
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("android_detail2", str, String.valueOf(z)));
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : OrangeConfig.getInstance().getConfig("android_detail2", str, str2);
    }
}
