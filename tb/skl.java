package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.g;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.c;
import com.tmall.android.dai.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class skl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_KEY_SLIDEDOWNGUIDE = "slideDownGuideConfig";
    public int A;
    public String B;
    public boolean C;
    public int D;
    public int E;
    public String F;
    public String G;
    public String H;
    public String I;
    public Map<String, Object> J;
    public boolean K;
    public boolean L;
    public boolean M;
    public String N;
    public String O;
    public String P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X = 1;
    public boolean Y;
    public boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public int f33657a;
    public boolean aa;
    public String ab;
    public String ac;
    public int ad;
    public boolean ae;
    public int af;
    public boolean ag;
    public int ah;
    public int ai;
    public boolean aj;
    public String ak;
    public boolean al;
    public Map<String, Map<String, Object>> am;
    public boolean an;
    public Map<String, Map<String, Object>> ao;
    public Map<String, Object> ap;
    private Map<String, Object> aq;
    private final sko ar;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public boolean o;
    public boolean p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        kge.a(520104310);
    }

    public skl(sko skoVar) {
        this.ar = skoVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        Map<String, Object> map = this.J;
        if (map != null) {
            Object obj = map.get("dynamicRecommend");
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get("config");
                if (!(obj2 instanceof Map)) {
                    try {
                        obj2 = JSON.parseObject(obj2.toString());
                    } catch (Exception unused) {
                    }
                }
                if (obj2 instanceof Map) {
                    Map map2 = (Map) obj2;
                    if (map2.containsKey("isOpen")) {
                        return oec.a(map2.get("isOpen"), false) & this.C;
                    }
                }
            }
        }
        return this.C;
    }

    public Map<String, Object> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        Map<String, Map<String, Object>> map = this.am;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.aq;
    }

    public Map c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.H)) {
            try {
                hashMap.put(this.H, f.a(this.H, "version"));
            } catch (Throwable unused) {
            }
        }
        if (!TextUtils.isEmpty(this.I)) {
            try {
                hashMap.put(this.I, f.a(this.I, "version"));
            } catch (Throwable unused2) {
            }
        }
        return hashMap;
    }

    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Map<String, Object> map = null;
        Map<String, Map<String, Object>> map2 = this.am;
        if (map2 != null) {
            map = map2.get(str);
        }
        return oec.a(map, z);
    }

    public Map<String, Object> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this});
        }
        if (this.ap != null) {
            spz.c("PickPreloadControllerNew", "下滑 新协议。");
            return (Map) this.ap.get("halfScreenConfig");
        }
        return a("halfScreenConfig_android");
    }

    public int a(Map<String, Object> map, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ec6792f", new Object[]{this, map, str, new Integer(i)})).intValue();
        }
        if (!map.containsKey("android-" + str)) {
            return map.containsKey(str) ? oec.a(map.get(str), i) : i;
        }
        return oec.a(map.get("android-" + str), i);
    }

    public Map<String, Object> a(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("85c7b09c", new Object[]{this, map, str});
        }
        Object obj = map.get(str);
        if (!(obj instanceof Map)) {
            return null;
        }
        return (Map) obj;
    }

    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            c.a(a(map, "bitrateOptiConfig", (String) null));
        }
    }

    public void b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (map == null) {
        } else {
            ogh.a("updateConfig");
            this.aq = map;
            this.o = a(map, "disableRecommend", false);
            this.x = a(map, "disableInTimeRecommend", false);
            this.y = a(map, "recommendlistDisableInTimeRecommend", false);
            this.z = a(map, "followlistDisableInTimeRecommend", false);
            this.p = a(map, "disableSlide", false);
            this.ap = a(map, CONFIG_KEY_SLIDEDOWNGUIDE);
            Map<String, Object> map2 = this.ap;
            if (map2 != null) {
                this.q = a(map2, "carousel", (String) null);
                spz.c("PickPreloadControllerNew", "下滑 新协议。carousel=" + this.q);
            } else {
                this.q = a(map, "carousel", (String) null);
            }
            this.c = a(map, "interactTNodeDSLv2", (String) null);
            if (oeb.bb()) {
                this.d = g.b(null, "page_fullpage", false).d;
            } else {
                this.d = a(map, "interactTNodeDSLv3", (String) null);
            }
            this.e = a(map, "interactBgTNodeDSL", (String) null);
            this.f = a(map, "openWeexInteractURL", (String) null);
            this.g = a(map, "openWeexDSLV2", (String) null);
            this.h = a(map, "openWeexGlobalDSLV2", (String) null);
            this.i = a(map, "openWeexBridgeTNodeDSL", (String) null);
            this.j = a(map, "goodsListUrl", (String) null);
            this.k = a(map, "openH5DSL", "");
            this.l = a(map, "openH5DSLV2", "");
            this.m = a(map, "openGlobalH5DSL", (String) null);
            this.n = a(map, "albumDetailTNodeDSL", (String) null);
            this.r = a(map, "likedUrl", (String) null);
            this.s = a(map, "notifyUrl", (String) null);
            this.t = a(map, "searchUrl", (String) null);
            this.u = a(map, "personalHomePageUrl", (String) null);
            this.v = a(map, "collectionCarouselInterval", "3");
            this.w = a(map, "businessSceneId", (String) null);
            this.A = a(map, "inTimeRecThreshold", 10);
            this.B = a(map, "doubleClickLikeImageUrl", (String) null);
            this.C = a(map, "enableEdgeCompute", false);
            this.D = a(map, "moduleExecInterval", 1000);
            this.E = a(map, "hiddenBufferSize", 10);
            this.F = a(map, "dynamicRecommendSolution", (String) null);
            this.H = a(map, "dynamicRecommendModelName", (String) null);
            this.G = a(map, "reRankSolution", (String) null);
            this.I = a(map, "reRankModelName", (String) null);
            this.K = a(map, "showFollowing", false);
            this.L = a(map, "showFollowingRedDot", false);
            this.M = a(map, "inactiveUser", false);
            this.N = a(map, "slideDownGuide", (String) null);
            this.O = a(map, "subType", (String) null);
            this.P = a(map, "cdnType", (String) null);
            this.Q = a(map, "disableSendComment", false);
            this.R = a(map, "enableUpAction", false);
            this.S = a(map, "hiddenMoreIcon", false);
            this.T = a(map, "preloadPlayTime", 5);
            this.U = a(map, "preloadCacheCount", 0);
            this.V = a(map, "preloadCacheSize", 1);
            this.W = a(map, "recFeedbackCount", 0);
            this.X = a(map, "slideDownGuideCount", 1);
            this.Y = a(map, "showEdgeLogInfo", false);
            this.Z = a(map, "enableRecRecall", false);
            this.aa = a(map, "enableSendAddList", false);
            this.ab = a(map, "commonMuteCountdown", (String) null);
            this.ac = a(map, "commonShowMuteTips", (String) null);
            this.ad = a(map, "commonMuteFatigue", -1);
            this.ae = a(map, "enablePlayRate", false);
            this.af = a(map, "playRateGuideTimeout", 0);
            this.ag = a(map, "enablePlayFeedback", false);
            this.ah = a(map, "playBufferedTimeout", 500);
            this.ai = a(map, "playStartSlowTimeout", 5000);
            this.aj = a(map, "graymaskSwitch", false);
            a(map);
            this.ak = a(map, "topRightIcon", (String) null);
            this.al = a(map, "tab2FrameworkRefactor", false);
            this.am = d(map);
            this.an = a(map, "collectionPage", true);
            this.ao = e(map);
            this.ar.onServerConfigChanged(this);
            ogh.b();
        }
    }

    public void c(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            this.J = map;
            this.ar.onServerConfigChanged(this);
        }
    }

    private Map<String, Map<String, Object>> d(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("726f9ef", new Object[]{this, map});
        }
        Object obj = map.get("abConfig");
        if (!(obj instanceof Map)) {
            return null;
        }
        return (Map) obj;
    }

    private boolean a(Map<String, Object> map, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ec6b911", new Object[]{this, map, str, new Boolean(z)})).booleanValue();
        }
        if (!map.containsKey("android-" + str)) {
            return map.containsKey(str) ? slm.a(map, str, z) : z;
        }
        return slm.a(map, "android-" + str, z);
    }

    private Map<String, Map<String, Object>> e(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4446be0e", new Object[]{this, map});
        }
        Object obj = map.get("collectionPopupPanel");
        if (!(obj instanceof Map)) {
            return null;
        }
        return (Map) obj;
    }

    private String a(Map<String, Object> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("696f900f", new Object[]{this, map, str, str2});
        }
        if (!map.containsKey("android-" + str)) {
            return map.containsKey(str) ? oec.a(map.get(str), str2) : str2;
        }
        return oec.a(map.get("android-" + str), str2);
    }
}
