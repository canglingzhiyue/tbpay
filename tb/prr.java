package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taolive.sdk.utils.l;

/* loaded from: classes8.dex */
public class prr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f32835a;
    private static float b;
    private static Boolean c;

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[0])).booleanValue();
        }
        return true;
    }

    static {
        kge.a(-1796077955);
        f32835a = -1;
        b = -1.0f;
        c = null;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (f32835a == -1) {
            f32835a = prg.a();
        }
        int i = f32835a;
        if (i >= 8) {
            c = true;
            return true;
        } else if (i >= 4) {
            if (b == -1.0f) {
                for (int i2 = 0; i2 < f32835a; i2++) {
                    float c2 = pro.c(prg.a(i2)) / 1000000.0f;
                    if (c2 > b) {
                        b = c2;
                    }
                }
            }
            if (b >= d()) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            c = valueOf;
            return valueOf.booleanValue();
        } else {
            c = false;
            return false;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableAudioOff1", "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "EnableReleasePlayer", "true"));
    }

    public static float d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[0])).floatValue() : pro.c(OrangeConfig.getInstance().getConfig("tblive", "h265MaxFreq", "1.5"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "EnablePreForCountDown", "true"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "HideShortVideo", "false"));
    }

    public static int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[0])).intValue() : pro.a(OrangeConfig.getInstance().getConfig("tblive", "HighDeviceAutoPlayDelayTime", "0"));
    }

    public static int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[0])).intValue() : pro.a(OrangeConfig.getInstance().getConfig("tblive", "MiddleDeviceAutoPlayDelayTime", "6"));
    }

    public static int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[0])).intValue() : pro.a(OrangeConfig.getInstance().getConfig("tblive", "LowDeviceAutoPlayDelayTime", "20"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "HideBubbleTip", "false"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "EnableBlur", "true"));
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "UseNewFavorLayout", "false"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "TBLIVE_ORANGE_BFRTC_Enable_V1", "false"));
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "TBLIVE_ORANGE_RTCLIVE_Enable_V3", "false"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue();
        }
        if (!pro.d(OrangeConfig.getInstance().getConfig("tblive", "usePlayDuration", "true"))) {
            return false;
        }
        return "2".equals(pra.c());
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue();
        }
        if (!pro.d(OrangeConfig.getInstance().getConfig("tblive", "usePlayDuration", "true"))) {
            return false;
        }
        return "3".equals(pra.c());
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue();
        }
        if (!pro.d(OrangeConfig.getInstance().getConfig("tblive", "startByAudioOff", "true"))) {
            return false;
        }
        return pra.b();
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enablePlayErrorRetry", "true"));
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableGotoLiveCondition", "true"));
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableLiveDataConvertToMediaLiveInfo", "true"));
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableAppSettingProvider", "false"));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue();
        }
        if (!pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableOpenNDWarmUp", "true"))) {
            return false;
        }
        return pra.d();
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableXTabTextShadowLayer", "true"));
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableParseTabImage", "true"));
    }

    public static float E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3e1da3c", new Object[0])).floatValue() : pro.c(a("tabImageWidth", "180"));
    }

    public static float F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3eff1bd", new Object[0])).floatValue() : pro.c(a("tabImageHeight", "60"));
    }

    public static int G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3fe0941", new Object[0])).intValue() : pro.a(a("tabPicBottomMargin", "0"));
    }

    public static int H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("40c20c2", new Object[0])).intValue() : pro.a(a("tabPicBottomMargin", "0"));
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : OrangeConfig.getInstance().getConfig("tblive", str, str2);
    }

    public static int t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aee", new Object[0])).intValue() : Math.min(Math.max(1, l.a(OrangeConfig.getInstance().getConfig("tblive", "maxMediaNumV2", "1"))), 1);
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableEffectVideoTextLayout", "false"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableOpenCardAddMessageViewNew", "true"));
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableOpenCardHiddenView", "true"));
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableTBLImageViewEnableReuse", "true"));
    }
}
