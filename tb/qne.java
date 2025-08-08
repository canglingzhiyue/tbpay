package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.b;
import com.taobao.taolive.sdk.utils.l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes8.dex */
public class qne {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TBLIVE_ORANGE_GROUP = "tblive";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f32952a;
    private static HashMap<String, String> b;
    private static List<String> c;
    private static String d;
    private static String e;
    private static String f;
    private static String g;
    private static String h;
    private static Boolean i;
    private static List<String> j;
    private static Boolean k;
    private static List<String> l;
    private static int m;
    private static int o;
    private static String p;
    private static Boolean s;
    private static List<String> u;
    private static List<String> v;

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        }
    }

    static {
        kge.a(-359333170);
        f32952a = false;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        m = -1;
        o = -1;
    }

    public static HashMap<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[0]);
        }
        if (b == null) {
            b = (HashMap) pqj.a(d(), HashMap.class);
        }
        return b;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (c == null) {
            String e2 = e();
            if (!StringUtils.isEmpty(e2)) {
                c = Arrays.asList(e2.split(";"));
            }
        }
        List<String> list = c;
        return list == null || !list.contains(str);
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue() : l.a(pmd.a().d().a("tblive", "interactiveRightComponentSize2", "3"));
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : pmd.a().d().a("tblive", "interactiveRightComponentMap2", "{\"normal\": \"taolive_normal_countdown_comp\",\"viewpager\": \"taolive_viewpager_horizontal_comp\",\"countdown\": \"taolive_normal_countdown_comp\",\"progress\": \"taolive_progress_comp\"}");
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : pmd.a().d().a("tblive", "interactPanelShowBlack", "");
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : StringUtils.equals(f(), str) || StringUtils.equals(J(), str);
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
        }
        String str = d;
        if (str != null) {
            return str;
        }
        String a2 = pmd.a().d().a("tblive", "intimacyCoinComponentFedName", "@ali/alivemodx-live-intimate-beans");
        d = a2;
        return a2;
    }

    private static String J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99f320ef", new Object[0]);
        }
        String str = e;
        if (str != null) {
            return str;
        }
        String a2 = pmd.a().d().a("tblive", "intimacyCoinComponentName", "alivemodx-live-intimate-beans");
        e = a2;
        return a2;
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[0]);
        }
        String str = f;
        if (str != null) {
            return str;
        }
        String a2 = pmd.a().d().a("tblive", "intimacyCoinComponentClickName", "@ali/alivemodx-live-intimate-beans");
        f = a2;
        return a2;
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]);
        }
        String str = g;
        if (str != null) {
            return str;
        }
        String a2 = pmd.a().d().a("tblive", "rankComponentFedName", "@ali/alivemodx-live-rank");
        g = a2;
        return a2;
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[0]);
        }
        String str = h;
        if (str != null) {
            return str;
        }
        String a2 = pmd.a().d().a("tblive", "sRankComponentClickFedName", "@ali/alivemodx-live-rank");
        h = a2;
        return a2;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableGetTempBitmap", "true"));
    }

    public static int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[0])).intValue() : l.a(pmd.a().d().a("tblive", "H5MaxLoadTime", "10"));
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : StringUtils.isEmpty(str) ? str2 : pmd.a().d().a("tblive", str, str2);
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableRequestTradeTrack", "true"));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue();
        }
        if (k == null) {
            k = Boolean.valueOf(l.d(pmd.a().d().a("tblive", "enableInteractiveShowingComponentList", "true")));
        }
        return k.booleanValue();
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (l == null) {
            String K = K();
            if (!StringUtils.isEmpty(K)) {
                l = Arrays.asList(K.split(";"));
            }
        }
        List<String> list = l;
        return list != null && list.contains(str);
    }

    private static String K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2078db8e", new Object[0]) : pmd.a().d().a("tblive", "interactiveShowingComponentOrange", "@ali/alivemodx-live-packet-rain");
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableGetViewBitmapOnlyActionDown", "true"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableGetAlphaAtXY", "true"));
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "enableALiveJSBridgeTokenCheck", "false"));
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "enableCloseCheckIsNeedShowByMtop", "true"));
    }

    public static String M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2d8450cc", new Object[0]) : pmd.a().d() != null ? pmd.a().d().a("tblive", "checkALiveJSBridgeToken", "alive_token_20231225") : "alive_token_20231225";
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        String str = b.d(context) ? "true" : "false";
        if (m == -1) {
            if (b(context) && pmd.a().t() != null) {
                m = l.d(pmd.a().t().a("taolive", "BlockOpt", "enable", str)) ? 1 : 0;
            } else {
                m = 0;
            }
        }
        return m == 1;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        String str = b.d(context) ? "true" : "false";
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "enableBlockOptABTest", str));
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "notifyMsgEntranceChanged", "true"));
    }

    public static String z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3061ebf", new Object[0]);
        }
        String str = p;
        if (str != null) {
            return str;
        }
        String a2 = pmd.a().d().a("tblive", "ADSComponentName", "@ali/rax-live-ads");
        p = a2;
        return a2;
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "enableRightEntranceAnim", "true"));
    }

    public static float B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3b793b9", new Object[0])).floatValue() : l.c(pmd.a().d().a("tblive", "openWebViewLayerHeight", "0.6666"));
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "openWebViewLayerXY", "true"));
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[0])).booleanValue();
        }
        Boolean bool = s;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(l.d(pmd.a().d().b("tblive", "enableInitUCCoreOrange", "true")));
        s = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean b(String str, String str2) {
        List<String> list;
        List<String> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        if (f32952a) {
            return false;
        }
        if (u == null) {
            String b2 = pmd.a().d().b("tblive", "isNeedShowH5LiveSourceBlackList", "");
            if (!StringUtils.isEmpty(b2)) {
                u = Arrays.asList(b2.split(";"));
            }
        }
        if (!StringUtils.isEmpty(str) && (list2 = u) != null) {
            for (String str3 : list2) {
                if (str.startsWith(str3)) {
                    return false;
                }
            }
        }
        if (v == null) {
            String b3 = pmd.a().d().b("tblive", "isNeedShowH5EntryLiveSourceBlackList", "");
            if (!StringUtils.isEmpty(b3)) {
                v = Arrays.asList(b3.split(";"));
            }
        }
        if (!StringUtils.isEmpty(str2) && (list = v) != null) {
            for (String str4 : list) {
                if (str2.startsWith(str4)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "disableSmallWindowJumpUrl", "false"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue();
        }
        if (i == null) {
            if (pmd.a().d() != null && l.d(pmd.a().d().a("tblive", "enableIntimacyHiddenNew", "true"))) {
                z = true;
            }
            i = Boolean.valueOf(z);
        }
        return i.booleanValue();
    }

    private static String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[0]) : pmd.a().d().a("tblive", "needCheckJsBridgeTokenOrange", "setPenetrateAlpha;startVideo;pauseVideo;resumeVideo;muteVideo;destroyVideo;refreshRoom;enableUpDownSwitch;enableLeftRightSwitch;switchRoom;closeRoom");
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue();
        }
        if (j == null) {
            String k2 = k();
            if (!StringUtils.isEmpty(k2)) {
                j = Arrays.asList(k2.split(";"));
            }
        }
        List<String> list = j;
        return list != null && list.contains(str);
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableOpenMoreWebViewLayer", "true"));
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableTaoLiveContainer", "true"));
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableUpdateShowEntranceSize", "true"));
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableNewGetComponentList", "true"));
    }
}
