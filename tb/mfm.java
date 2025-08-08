package tb;

import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import anet.channel.util.StringUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.tao.Globals;
import java.util.Map;

/* loaded from: classes7.dex */
public class mfm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31059a = false;
    private static final String b = "mfm";

    public static /* synthetic */ String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cef1bce2", new Object[]{str, str2}) : d(str, str2);
    }

    public static /* synthetic */ String t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("abe3bf05", new Object[0]) : b;
    }

    /* loaded from: classes7.dex */
    public static class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f31061a;

        private a() {
            this.f31061a = "";
        }

        @Override // com.taobao.orange.d
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (!"tblive".equals(str)) {
            } else {
                mfj.b(mfm.t(), "onConfigUpdate.");
                String str2 = map.get("configVersion");
                if (StringUtils.isStringEqual(str2, this.f31061a)) {
                    return;
                }
                this.f31061a = str2;
                mfg.a().b("com.taobao.live.home.orange_update");
            }
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"tblive"}, new a(), false);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            OrangeConfig.getInstance().unregisterListener(new String[]{"tblive"});
        }
    }

    private static String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5bded401", new Object[]{str, str2}) : OrangeConfig.getInstance().getConfig("tblive", str, str2);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        String a2 = a(str);
        return StringUtils.isEmpty(a2) ? d(str, str2) : a2;
    }

    public static void a(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"tblive"}, new d() { // from class: tb.mfm.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map2});
                        return;
                    }
                    OrangeConfig.getInstance().unregisterListener(new String[]{"tblive"}, this);
                    Map map3 = map;
                    if (map3 == null) {
                        return;
                    }
                    for (String str2 : map3.keySet()) {
                        mfm.b(str2, mfm.c(str2, (String) map.get(str2)));
                    }
                }
            }, true);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        SharedPreferences.Editor edit = Globals.getApplication().getSharedPreferences("taolive", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : Globals.getApplication().getSharedPreferences("taolive", 0).getString(str, "");
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue() : pro.a(d("videoListMaxSize", "1000"));
    }

    public static float e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[0])).floatValue() : pro.c(d("HomePageAlimamaAdArea", "0.5"));
    }

    private static String a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfa4f210", new Object[]{str, str2, str3, str4});
        }
        try {
            if (x()) {
                String a2 = a(str, str2, str3);
                if (!StringUtils.isEmpty(a2)) {
                    String str5 = b;
                    Log.e(str5, "ab使用测试工具持久化值 " + str + "_" + str2 + "_" + str3 + " value " + a2);
                    return a2;
                }
            }
            Variation variation = UTABTest.activate(str, str2).getVariation(str3);
            if (variation != null) {
                return variation.getValueAsString(str4);
            }
        } catch (Exception e) {
            mfj.a(b, "UTABTest exp. ", e);
        }
        return str4;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableDxPrefetch", "true"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableNewShowMaidian", "true"));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableLpm", "true"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableLongTextViewMaequee", "true"));
    }

    public static long m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158668", new Object[0])).longValue() : pro.b(OrangeConfig.getInstance().getConfig("tblive", "enableBackRefreshTimeInterval", "10"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : "true".equals(a("taolive", "enableCardonScrollStateChangedResume", "enable", "false"));
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableMtopUseCache", "false"));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableWebViewGestureLogic", "true"));
    }

    public static String u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("326979a4", new Object[0]) : OrangeConfig.getInstance().getConfig("displaycutoutsupport", "cutoutphonelist", "");
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : pro.d(a("taolive", "channelNewAutoPlayAllNetwork", "value", "true"));
    }

    public static int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[0])).intValue() : pro.a(d("channelHomeImgAnimateTime", "100"));
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue() : pro.d(d("enableLifecycleTrack", "true"));
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue() : pro.d(d("enableChannelCPUAdeMonBootsCpu", "true"));
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue() : pro.d(OrangeConfig.getInstance().getConfig("tblive", "enableABTestWhiteList", "false")) || sdt.d();
    }

    private static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        try {
            SharedPreferences sharedPreferences = Globals.getApplication().getSharedPreferences("ab_mock_value", 0);
            return sharedPreferences.getString(str + "_" + str2 + "_" + str3, "");
        } catch (Throwable unused) {
            return null;
        }
    }
}
