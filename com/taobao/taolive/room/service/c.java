package com.taobao.taolive.room.service;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.FandomPreLiveInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.u;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.pmd;
import tb.pqq;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String A;
    public static String B;
    public static String C;
    public static String D;
    public static long E;
    public static int F;
    public static String G;
    public static String H;
    public static String I;
    public static String J;
    public static String K;
    public static String L;
    public static String M;
    public static String N;
    public static String O;
    public static String P;
    public static String Q;
    public static String R;
    public static String S;
    public static String T;
    public static String U;
    public static boolean V;
    public static boolean W;
    public static boolean X;
    public static boolean Y;
    public static boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public static String f21681a;
    public static String aA;
    public static String aB;
    public static boolean aC;
    public static boolean aD;
    public static a aE;
    private static final String aF;
    private static String aG;
    private static String aH;
    private static String aI;
    private static String aJ;
    private static String aK;
    private static String aL;
    private static boolean aM;
    private static int aN;
    private static String aO;
    private static String aP;
    private static VideoStatus aQ;
    private static boolean aR;
    private static String aS;
    private static LiveDetailMessinfoResponseData.AlimamaInfo aT;
    private static LiveDetailMessinfoResponseData.AlimamaInfo2 aU;
    private static String aV;
    private static String aW;
    private static boolean aX;
    private static boolean aY;
    private static Map<String, String> aZ;
    public static boolean aa;
    public static boolean ab;
    public static boolean ac;
    public static boolean ad;
    public static boolean ae;
    public static boolean af;
    public static boolean ag;
    public static long ah;
    public static String ai;
    public static boolean aj;
    public static boolean ak;
    public static boolean al;
    public static boolean am;
    public static boolean an;
    public static JSONArray ao;
    public static boolean ap;
    public static boolean aq;
    public static boolean ar;
    public static String as;
    public static boolean at;
    public static String au;
    public static String av;
    public static String aw;
    public static String ax;
    public static boolean ay;
    public static String az;
    public static String b;
    private static String ba;
    private static String bb;
    private static String bc;
    private static String bd;
    private static String be;
    private static String bf;
    private static FandomPreLiveInfo bg;
    private static Set<String> bh;
    private static Boolean bi;
    private static Boolean bj;
    public static long bk;
    public static String c;
    public static boolean d;
    public static boolean e;
    public static String f;
    public static Map<String, String> g;
    public static String h;
    public static boolean i;
    public static int j;
    public static int k;
    public static int l;
    public static String m;
    public static boolean n;
    public static boolean o;
    public static String p;
    public static String q;
    public static String r;
    public static String s;
    public static String t;
    public static String u;
    public static String v;
    public static String w;
    public static String x;
    public static String y;
    public static String z;

    static {
        kge.a(-790565924);
        aF = c.class.getSimpleName();
        aM = false;
        d = false;
        aN = 0;
        aQ = VideoStatus.VIDEO_NORMAL_STATUS;
        i = false;
        j = 0;
        k = 0;
        l = 0;
        n = false;
        V = false;
        aX = false;
        aY = false;
        W = false;
        X = true;
        Y = false;
        Z = false;
        aa = false;
        ab = false;
        ac = false;
        ad = true;
        ae = true;
        af = true;
        ag = true;
        ah = 0L;
        aj = false;
        ak = false;
        al = false;
        am = false;
        an = false;
        ap = false;
        aq = false;
        ar = false;
        as = "";
        at = false;
        au = "";
        av = null;
        ay = false;
        aC = false;
        aD = false;
        bi = null;
        bj = null;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : aP;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            aP = str;
        }
    }

    public static VideoStatus b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoStatus) ipChange.ipc$dispatch("200bf3d6", new Object[0]) : aQ;
    }

    public static void a(VideoStatus videoStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ce9271", new Object[]{videoStatus});
        } else {
            aQ = videoStatus;
        }
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : aO;
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            aO = str;
        }
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : h;
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            h = str;
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else {
            aV = str;
        }
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : aV;
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        } else {
            aW = str;
        }
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        if ("shop2F".equals(v)) {
            return true;
        }
        return u.l() && V;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        String str = v;
        return str != null && str.equals(u.R());
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : X;
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{str});
        } else {
            be = str;
        }
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{str});
        } else {
            ax = str;
        }
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[0]) : ax;
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{str});
        } else {
            bf = str;
        }
    }

    public static String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[0]) : bf;
    }

    public static void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{str});
        } else {
            bc = str;
        }
    }

    public static String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[0]) : bc;
    }

    public static void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{str});
        } else {
            bd = str;
        }
    }

    public static String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[0]) : bd;
    }

    public static void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{str});
        } else {
            ba = str;
        }
    }

    public static String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[0]) : ba;
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else {
            aZ = map;
        }
    }

    public static String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[0]) : bb;
    }

    public static void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c7e1fd", new Object[]{str});
        } else {
            bb = str;
        }
    }

    public static Map<String, String> o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("df66012b", new Object[0]) : aZ;
    }

    public static void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i2)});
        } else {
            aN = i2;
        }
    }

    public static int p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fccea", new Object[0])).intValue() : aN;
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue() : aM;
    }

    public static void a(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z2)});
        } else {
            aM = z2;
        }
    }

    public static String r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ed849c7", new Object[0]) : aL;
    }

    public static void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df97b3e", new Object[]{str});
        } else {
            aL = str;
        }
    }

    public static VideoInfo s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("97bb6577", new Object[0]);
        }
        if (pmd.a().F() != null && (pmd.a().F().a() instanceof VideoInfo)) {
            return (VideoInfo) pmd.a().F().a();
        }
        return null;
    }

    public static String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abe3bf05", new Object[0]);
        }
        TBLiveDataModel tBLiveDataModel = (pmd.a().F() == null || !(pmd.a().F().c() instanceof TBLiveDataModel)) ? null : (TBLiveDataModel) pmd.a().F().c();
        if (tBLiveDataModel == null) {
            return null;
        }
        return tBLiveDataModel.mRawData;
    }

    public static FandomInfo u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FandomInfo) ipChange.ipc$dispatch("68ff8ab7", new Object[0]);
        }
        if (pmd.a().F() != null && (pmd.a().F().b() instanceof FandomInfo)) {
            return (FandomInfo) pmd.a().F().b();
        }
        return null;
    }

    public static FandomInfo b(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FandomInfo) ipChange.ipc$dispatch("e9c39d1", new Object[]{tBLiveDataModel});
        }
        if (tBLiveDataModel == null && pmd.a().F() != null && (pmd.a().F().c() instanceof TBLiveDataModel)) {
            tBLiveDataModel = (TBLiveDataModel) pmd.a().F().c();
        }
        if (tBLiveDataModel == null) {
            return null;
        }
        return tBLiveDataModel.mFandomInfo;
    }

    public static FandomPreLiveInfo v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FandomPreLiveInfo) ipChange.ipc$dispatch("beee075", new Object[0]) : bg;
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue() : u() != null;
    }

    public static boolean c(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("44adb867", new Object[]{tBLiveDataModel})).booleanValue() : b(tBLiveDataModel) != null;
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue() : af;
    }

    public static void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82b147f", new Object[]{str});
        } else {
            aH = str;
        }
    }

    public static String y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4c806420", new Object[0]) : aH;
    }

    public static void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25cadc0", new Object[]{str});
        } else {
            aJ = str;
        }
    }

    public static String z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d3061ebf", new Object[0]) : aJ;
    }

    public static void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c8e4701", new Object[]{str});
        } else {
            aK = str;
        }
    }

    public static String A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("df3f9158", new Object[0]) : aK;
    }

    public static void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bfe042", new Object[]{str});
        } else {
            aI = str;
        }
    }

    public static String B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65c54bf7", new Object[0]) : aI;
    }

    public static void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f17983", new Object[]{str});
        } else {
            aG = str;
        }
    }

    public static int s(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2b2312b7", new Object[]{str})).intValue() : "shop".equals(str) ? 1 : 2;
    }

    @Deprecated
    public static boolean C() {
        VideoInfo s2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[0])).booleanValue() : !u.O() && (s2 = s()) != null && s2.roomType == 13;
    }

    public static boolean a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ead9f969", new Object[]{videoInfo})).booleanValue();
        }
        if (videoInfo == null) {
            videoInfo = s();
        }
        return videoInfo != null && (videoInfo.newRoomType & 256) == 256;
    }

    public static void a(LiveDetailMessinfoResponseData.AlimamaInfo alimamaInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f071591", new Object[]{alimamaInfo});
        } else {
            aT = alimamaInfo;
        }
    }

    public static LiveDetailMessinfoResponseData.AlimamaInfo E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveDetailMessinfoResponseData.AlimamaInfo) ipChange.ipc$dispatch("133318f3", new Object[0]) : aT;
    }

    public static LiveDetailMessinfoResponseData.AlimamaInfo2 F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveDetailMessinfoResponseData.AlimamaInfo2) ipChange.ipc$dispatch("c1b715d2", new Object[0]) : aU;
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[0])).booleanValue() : (aT == null && aU == null && av == null && !H().contains(bc)) ? false : true;
    }

    public static Set<String> H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("8a73e67e", new Object[0]);
        }
        if (bh == null) {
            bh = new HashSet();
            for (String str : pmd.a().d().a("tblive", "adLivesourceList", "ad_hudong11;ad_brandzone;ad_tanx;ad_tblive_task;ad_timemove;livesource=p4p-kgb").split(";")) {
                bh.add(str);
            }
        }
        return bh;
    }

    public static void a(LiveDetailMessinfoResponseData.AlimamaInfo2 alimamaInfo2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61d7c3ad", new Object[]{alimamaInfo2});
        } else {
            aU = alimamaInfo2;
        }
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[0])).booleanValue();
        }
        VideoInfo s2 = s();
        return (s2 != null && ("1".equals(s2.roomStatus) || "2".equals(s2.roomStatus))) && u.W();
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[0])).booleanValue() : ad && u.X();
    }

    public static ViewGroup a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("d01cc9b5", new Object[]{context});
        }
        a aVar = aE;
        if (aVar != null) {
            return aVar.a(context);
        }
        return null;
    }

    public static void b(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z2)});
        } else {
            aR = z2;
        }
    }

    public static int M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4529647", new Object[0])).intValue();
        }
        a aVar = aE;
        if (aVar != null) {
            return aVar.a();
        }
        return -1;
    }

    public static String N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b40a0b6b", new Object[0]) : R;
    }

    public static void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7554ac05", new Object[]{str});
        } else {
            R = str;
        }
    }

    public static void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf864546", new Object[]{str});
        } else {
            aS = str;
        }
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[0])).booleanValue() : aX;
    }

    public static void c(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{new Boolean(z2)});
        } else {
            aX = z2;
        }
    }

    public static void d(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{new Boolean(z2)});
        } else {
            aY = z2;
        }
    }

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[0])).booleanValue() : aY;
    }

    public static Map<String, String> R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9318ee4e", new Object[0]);
        }
        if (g == null) {
            g = new HashMap();
        }
        g.put("accountId", S);
        g.put("contentId", R);
        g.put("spmUrl", aH);
        g.put("clickId", av);
        g.put(pqq.KEY_LIVE_SOURCE, bc);
        g.put("ad", G() ? "1" : "");
        g.put("entryLiveSource", v);
        g.put("entrySpm", z);
        g.put("kandianId", aO);
        g.put("watchId", aV);
        g.put("pvId", f21681a);
        g.put("originPage", "Livewatch");
        g.put("spmCnt", b);
        g.put("appKey", "21646297");
        g.put("feedtype", c);
        g.putAll(S());
        return g;
    }

    private static Map<String, String> S() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("60c3500f", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        try {
        } catch (Exception e2) {
            q.b(aF, "getOtherInteractiveParams catch exception:" + e2.getMessage());
        }
        if (TextUtils.isEmpty(m)) {
            return hashMap;
        }
        Uri parse = Uri.parse(m);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (queryParameterNames.contains("boostType")) {
            hashMap.put("boostType", parse.getQueryParameter("boostType"));
        }
        if (queryParameterNames.contains("isBoost")) {
            hashMap.put("isBoost", parse.getQueryParameter("isBoost"));
        }
        for (String str : u.aV().split(",")) {
            if (queryParameterNames.contains(str)) {
                hashMap.put(str, parse.getQueryParameter(str));
            }
        }
        return hashMap;
    }
}
