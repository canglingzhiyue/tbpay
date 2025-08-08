package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downgrade.Downgrade;
import com.taobao.taolive.sdk.utils.l;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes6.dex */
public class hud {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TBLiveService";

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f28788a;
    private static List<String> b;
    private static HashSet<String> c;
    private static int d;
    private static int e;
    private static int f;

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : pmd.a().d() != null ? pmd.a().d().a("tblive", "miniLiveFavor", "https://gw.alicdn.com/tfs/TB1ace.u1bviK0jSZFNXXaApXXa-164-380.png") : "https://gw.alicdn.com/tfs/TB1ace.u1bviK0jSZFNXXaApXXa-164-380.png";
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : pmd.a().d() != null ? pmd.a().d().a("tblive", "miniLivingIcon", "https://gw.alicdn.com/tfs/TB1A4mayFY7gK0jSZKzXXaikpXa-228-72.png") : "https://gw.alicdn.com/tfs/TB1A4mayFY7gK0jSZKzXXaikpXa-228-72.png";
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "useNewMiniLive", "true"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "usePlayViewToken", "true"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "useMiniLiveBfrtc", "true"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "globalMiniLiveNotificationEnables", "true"));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : pmd.a().d() != null && l.d(pmd.a().d().a("tblive", "globalMiniLiveEnabledInDetail", "true")) && !q() && o();
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "globalMiniLiveEnabledInShopReceiver", "true"));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "globalMiniLiveEnabledInShopBugFix", "true"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : pmd.a().d() != null && l.d(pmd.a().d().a("tblive", "globalMiniLiveEnabledInShop", "true")) && !q() && o();
    }

    public static int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[0])).intValue();
        }
        if (pmd.a().d() == null) {
            return 2;
        }
        return l.a(pmd.a().d().a("tblive", "globalMiniLiveCloseTimes", "2"));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[Catch: Exception -> 0x0082, TryCatch #0 {Exception -> 0x0082, blocks: (B:6:0x0015, B:8:0x001f, B:11:0x0039, B:13:0x003d, B:15:0x004b, B:18:0x0053, B:20:0x0061, B:26:0x0076, B:25:0x006f), top: B:31:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r13) {
        /*
            java.lang.String r0 = "showMiniLive"
            com.android.alibaba.ip.runtime.IpChange r1 = tb.hud.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 1
            if (r2 == 0) goto L15
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r2 = 0
            r0[r2] = r13
            java.lang.String r13 = "9e1d6460"
            r1.ipc$dispatch(r13, r0)
            return
        L15:
            tb.pmd r1 = tb.pmd.a()     // Catch: java.lang.Exception -> L82
            tb.pmh r1 = r1.k()     // Catch: java.lang.Exception -> L82
            if (r1 == 0) goto L81
            tb.pmd r1 = tb.pmd.a()     // Catch: java.lang.Exception -> L82
            tb.pmh r1 = r1.k()     // Catch: java.lang.Exception -> L82
            java.lang.Object r1 = r1.a(r13, r0)     // Catch: java.lang.Exception -> L82
            long r4 = com.taobao.taobaocompat.lifecycle.TimestampSynchronizer.getServerTime()     // Catch: java.lang.Exception -> L82
            boolean r2 = r1 instanceof com.alibaba.fastjson.JSONObject     // Catch: java.lang.Exception -> L82
            java.lang.String r6 = "count"
            r7 = 0
            java.lang.String r9 = "optTime"
            if (r2 == 0) goto L51
            com.alibaba.fastjson.JSONObject r1 = (com.alibaba.fastjson.JSONObject) r1     // Catch: java.lang.Exception -> L82
            if (r1 == 0) goto L51
            long r10 = r1.getLongValue(r9)     // Catch: java.lang.Exception -> L82
            int r2 = u()     // Catch: java.lang.Exception -> L82
            boolean r2 = tb.hub.a(r2, r10)     // Catch: java.lang.Exception -> L82
            if (r2 != 0) goto L52
            int r1 = r1.getIntValue(r6)     // Catch: java.lang.Exception -> L82
            int r1 = r1 + r3
            goto L53
        L51:
            r10 = r7
        L52:
            r1 = 1
        L53:
            com.alibaba.fastjson.JSONObject r2 = new com.alibaba.fastjson.JSONObject     // Catch: java.lang.Exception -> L82
            r2.<init>()     // Catch: java.lang.Exception -> L82
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L82
            r2.put(r6, r12)     // Catch: java.lang.Exception -> L82
            if (r1 != r3) goto L69
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L82
            r2.put(r9, r1)     // Catch: java.lang.Exception -> L82
            goto L76
        L69:
            int r1 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r1 != 0) goto L6e
            goto L6f
        L6e:
            r4 = r10
        L6f:
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L82
            r2.put(r9, r1)     // Catch: java.lang.Exception -> L82
        L76:
            tb.pmd r1 = tb.pmd.a()     // Catch: java.lang.Exception -> L82
            tb.pmh r1 = r1.k()     // Catch: java.lang.Exception -> L82
            r1.a(r13, r0, r2)     // Catch: java.lang.Exception -> L82
        L81:
            return
        L82:
            r13 = move-exception
            r13.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hud.a(android.content.Context):void");
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (pmd.a().k() != null) {
            Object a2 = pmd.a().k().a(context, "showMiniLive");
            int k = k();
            hue.a("TBLiveService", "canShowMiniLive displayCount = " + k);
            if (a2 instanceof JSONObject) {
                try {
                    JSONObject jSONObject = (JSONObject) a2;
                    if (jSONObject != null && jSONObject.getIntValue("count") >= k) {
                        boolean a3 = hub.a(u(), jSONObject.getLongValue("optTime"));
                        hue.a("TBLiveService", "canShowMiniLive is more than interval = " + a3);
                        return a3;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    hue.a("TBLiveService", "canShowMiniLive Exception  e= " + e2.getMessage());
                }
            }
        }
        return true;
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        int a2 = new ksx(context).a(1);
        if (a2 == 2) {
            return false;
        }
        if (a2 != 0) {
            return true;
        }
        return hub.a(context);
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "liveRoomSmallWindowShowLikeAtmosphere", "false"));
    }

    public static boolean a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (pmd.a().d() != null) {
            String a2 = pmd.a().d().a("tblive", "needShowWindowBiz", "search;huichang;juhuasuan");
            if (!StringUtils.isEmpty(a2) && !StringUtils.isEmpty(str) && (split = a2.split(";")) != null && split.length > 0 && !StringUtils.isEmpty(str)) {
                for (String str2 : split) {
                    if (!StringUtils.isEmpty(str2) && str.equalsIgnoreCase(str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[0]) : pmd.a().d() != null ? pmd.a().d().a("tblive", "liveDetailCDNUrl", "https://alive-interact.alicdn.com/livedetail/common/") : "";
    }

    public static String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[0]) : pmd.a().d() != null ? pmd.a().d().a("tblive", "miniLiveUrl", "http://h5.m.taobao.com/taolive/video.html?livesource=miniLive&spm=a2141.7631565.a2191d.15026470") : "http://h5.m.taobao.com/taolive/video.html?livesource=miniLive&spm=a2141.7631565.a2191d.15026470";
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue();
        }
        Variation variation = UTABTest.activate("TBMiniLive", "miniLive").getVariation("openMiniLive");
        if (variation == null) {
            return true;
        }
        String valueAsString = variation.getValueAsString("true");
        if (StringUtils.isEmpty(valueAsString)) {
            return true;
        }
        return Boolean.valueOf(valueAsString).booleanValue();
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue();
        }
        Variation variation = UTABTest.activate("TBMiniLive", "showBenefits").getVariation("showBenefits");
        if (variation == null) {
            return true;
        }
        String valueAsString = variation.getValueAsString("true");
        if (StringUtils.isEmpty(valueAsString)) {
            return true;
        }
        return Boolean.valueOf(valueAsString).booleanValue();
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue();
        }
        String tacticsPerformance = Downgrade.getInstance().getDowngradeStrategy("taolive").getTacticsPerformance();
        hue.a("TLiveConfig", "downgradeConfig " + tacticsPerformance);
        return StringUtils.equals(tacticsPerformance, "degrade");
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "enablePreCheckPermission", "false"));
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return true;
        }
        return l.d(pmd.a().d().a("tblive", "enablePermissionFloatWindow", "false"));
    }

    public static int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6782aee", new Object[0])).intValue();
        }
        if (pmd.a().d() == null) {
            return 4320;
        }
        return l.a(pmd.a().d().a("tblive", "checkMiniLivePermissionInterval", "4320"));
    }

    public static int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("686426f", new Object[0])).intValue();
        }
        if (pmd.a().d() == null) {
            return 4320;
        }
        return l.a(pmd.a().d().a("tblive", "checkMiniLiveShowInterval", "4320"));
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (pmd.a().d() != null) {
            String a2 = pmd.a().d().a("tblive", "blockMiniLivePageList", "");
            if (!StringUtils.isEmpty(a2)) {
                return a2.contains(str);
            }
        }
        return false;
    }

    public static int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69459f0", new Object[0])).intValue();
        }
        if (pmd.a().d() == null) {
            return 0;
        }
        return l.a(pmd.a().d().a("tblive", "aliMiniLivePaddingX", "0"));
    }

    public static int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a27171", new Object[0])).intValue();
        }
        if (pmd.a().d() == null) {
            return 0;
        }
        return l.a(pmd.a().d().a("tblive", "aliMiniLivePaddingY", "0"));
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue();
        }
        boolean d2 = pmd.a().d() != null ? l.d(pmd.a().d().a("tblive", "quickStartLive", "true")) : true;
        Variation variation = UTABTest.activate("TBMiniLive", "quickStartLive").getVariation("quickStartLive");
        return d2 && (variation != null ? l.d(variation.getValueAsString("true")) : true);
    }

    public static boolean c(String str) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if ((f28788a == null || b == null) && pmd.a().d() != null) {
            f28788a = Boolean.valueOf(l.d(pmd.a().d().a("tblive", "isNewTaoliveMiniLiveUI", "true")));
            b = Arrays.asList(pmd.a().d().a("tblive", "isNewTaoliveMiniLiveWhites", "shop").split(";"));
        }
        Boolean bool = f28788a;
        return bool != null && bool.booleanValue() && (list = b) != null && list.contains(str);
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "isNeedShowMiniLiveByLiveRoom", "true"));
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue() : l.d(pmd.a().d().a("tblive", "shopPlayerStateChange", "true"));
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue();
        }
        if (c == null) {
            c = new HashSet<>();
            if (pmd.a().d() != null) {
                String a2 = pmd.a().d().a("tblive", "getTopActivityBlacks", "com.taobao.message.ui.biz.redpackage.activity.WeexAlphaBgActivity");
                if (!StringUtils.isEmpty(a2)) {
                    c.addAll(Arrays.asList(a2.split(";")));
                }
            }
        }
        return !c.contains(str);
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "closeMiniLiveWhenWeexVideoStart", "true"));
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "enablePausePlayerWhenCloseWindow", "false"));
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "enableDestroyPlayerWhenShopClose", "true"));
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[0])).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "enableResetWindowClickListener", "true"));
    }

    static {
        kge.a(-1802396378);
        e = -1;
        d = -1;
        f = -1;
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[0])).booleanValue();
        }
        if (e == -1 && pmd.a().d() != null) {
            e = l.d(pmd.a().d().a("tblive", "enableSmallWindowRevertAddMini", "false")) ? 1 : 0;
        }
        return e == 1;
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[0])).booleanValue();
        }
        if (f == -1 && pmd.a().d() != null) {
            f = l.d(pmd.a().d().a("tblive", "enableKeepSmallWindowOn", "true")) ? 1 : 0;
        }
        return f == 1;
    }
}
