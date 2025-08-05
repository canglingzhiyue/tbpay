package tb;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class pra {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1224595103);
    }

    private static String a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfa4f210", new Object[]{str, str2, str3, str4});
        }
        if (psm.G() && pmd.a().t() != null) {
            return pmd.a().t().a(str, str2, str3, str4);
        }
        try {
            Variation variation = UTABTest.activate(str, str2).getVariation(str3);
            if (variation != null) {
                return variation.getValueAsString(str4);
            }
        } catch (Exception unused) {
        }
        return str4;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "true".equals(a("taolive", "enableAudioOff", "enable", "false"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : "true".equals(a("taolive", "enableNewVideoPlayAudioOff", "enable", "true"));
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : a("taolive", "useNewVideoPlayAndroid", "playType", "3");
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : pro.d(a("taolive", "enableOpenNDWarmUp", "enable", "true"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : pro.d(a("taolive", "NewDetailEffects", "value", "false"));
    }
}
