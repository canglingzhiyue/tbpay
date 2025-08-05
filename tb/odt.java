package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public class odt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f31957a;

    static {
        kge.a(1791591993);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "1".equals(OrangeConfig.getInstance().getConfig("android_commission", "commissionAddTraceDegree", "0"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : "1".equals(OrangeConfig.getInstance().getConfig("android_commission", "closeBusinessJSApi", "0"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : "1".equals(OrangeConfig.getInstance().getConfig("android_commission", "enableAddParams", "1"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : "1".equals(OrangeConfig.getInstance().getConfig("android_commission", "enableAutoAddParams", "1"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : "1".equals(OrangeConfig.getInstance().getConfig("android_commission", "enableAutoAddTrackParams", "1"));
    }

    public static List<String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e89f38ba", new Object[0]);
        }
        if (f31957a == null) {
            f31957a = Arrays.asList(OrangeConfig.getInstance().getConfig("android_commission", "trackParamKeyList", "tcpParam;outerSceneId;outerAdUserParam;tcpOuterParam").split(";"));
        }
        return f31957a;
    }
}
