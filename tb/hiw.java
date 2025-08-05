package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.l;

/* loaded from: classes6.dex */
public class hiw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAOBAO_LIVE_AB_GROUP = "taobaolive";
    public static final String TBLIVE_AB_GROUP = "taolive";
    public static final String TBLIVE_ORANGE_GROUP = "tblive";

    /* renamed from: a  reason: collision with root package name */
    public static String f28697a;

    static {
        kge.a(-69109408);
        f28697a = "";
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : pmd.a().d() != null ? pmd.a().d().a("tblive", str, str2) : str2;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : l.d(a("tbliveGoodListFrameTracerSwitch", "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : l.d(a("itemCategoryEnable", "true"));
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : a("searchGoodsHint", "搜索商品/序号");
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : l.d(a("isSpeakingToTimeMove", "false"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "showTabTop", "true"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableTabTopPop", "true"));
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[0])).intValue() : l.a(pmd.a().d().a("tblive", "backTopInterval", "12"));
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableLiveShopSku", "true"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "goodsEnableTopBanner", "true"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "enableGoodsIntimacyCoin", "true"));
    }

    public static String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[0]) : pmd.a().d().a("tblive", "importantTemplates", "taolive_important_event_red_pocket,taolive_important_event_seckill,taolive_important_event_public_benefit,taolive_important_event_full_link,taolive_important_event_hongbao");
    }
}
