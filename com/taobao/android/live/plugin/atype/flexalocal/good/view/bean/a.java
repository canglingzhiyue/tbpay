package com.taobao.android.live.plugin.atype.flexalocal.good.view.bean;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.ButtonStateHelper;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.v;
import tb.hin;
import tb.hir;
import tb.his;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Boolean A;
    private static Boolean B;
    private static Boolean C;
    private static Boolean D;
    private static Boolean E;
    private static Boolean F;
    private static Boolean G;
    private static Boolean H;
    private static Boolean I;
    private static String d;
    public static Boolean j;
    private static Boolean k;
    public static Integer m;
    private static Boolean n;
    public static Boolean o;
    private static Integer p;
    private static Boolean q;
    private static Boolean r;
    private static Boolean t;
    private static Boolean u;
    public static Boolean w;

    /* renamed from: a  reason: collision with root package name */
    public boolean f13839a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public String h;
    public boolean i;
    public boolean l;
    public int s;
    public int v;
    public boolean x;
    public boolean y;
    public boolean z = true;

    public a(Context context, VideoInfo videoInfo) {
        a(context, videoInfo);
    }

    private void a(Context context, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aa4f26d", new Object[]{this, context, videoInfo});
            return;
        }
        if (j == null) {
            j = Boolean.valueOf((videoInfo.itemConfigInfo != null && com.taobao.taolive.sdk.utils.l.a(videoInfo.itemConfigInfo.getString("matchNewVersion"), 0) > 0) && v.b.a("goodlist", "enableNewGLPage", true));
        }
        this.x = ((videoInfo == null || videoInfo.itemConfigInfo == null) ? false : videoInfo.itemConfigInfo.getBooleanValue("enableNewGLTabUI")) && v.b.a("goodlist", "enableNewGLTabUI2", true);
        this.v = hir.a();
        this.y = videoInfo.shopHasVip && !videoInfo.shopVip;
        this.z = true;
        this.f13839a = hir.z();
        this.e = hir.D();
        this.f = hir.E();
        this.g = hir.F();
        this.h = "{\"showDelay\":\"10\",\"showTime\":\"10\",\"showEnd\":\"30\",\"itemNum\":\"5\"}";
        this.b = videoInfo.hasAddCart && hir.f();
        if (ButtonStateHelper.a(videoInfo.nbItemStatus) && hir.g()) {
            z = true;
        }
        this.c = z;
        this.i = v.b.a("goodlist", "enableTopEntryViewCardAnimation", true);
        this.s = -1;
        this.l = v.b.a("goodlist", "enableOrderTimeout", true);
        his.a("GoodConfigContainer", "loadConfig | config=" + this);
    }

    public int a(DinamicXEngine dinamicXEngine, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21333c42", new Object[]{this, dinamicXEngine, context})).intValue();
        }
        if (this.s < 0) {
            this.s = hin.a(dinamicXEngine, context, 375.0f);
        }
        return this.s;
    }

    static {
        kge.a(583015399);
        n = null;
        p = null;
        q = null;
        t = null;
        u = null;
        d = null;
        C = null;
        D = null;
        k = null;
        m = null;
        r = null;
        o = null;
        j = null;
        w = null;
        A = null;
        E = null;
        B = null;
        F = null;
        G = null;
        H = null;
        I = null;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        if (F == null) {
            F = Boolean.valueOf(v.b.a("goodlist", "glNewPageToViewModel", false));
        }
        if (r == null && context != null) {
            r = Boolean.valueOf(com.taobao.taolive.sdk.utils.b.d(context));
        }
        if (n == null) {
            n = Boolean.valueOf(v.b.a("goodlist", "multiSecKill2", true));
        }
        if (p == null) {
            p = Integer.valueOf(hir.W());
        }
        if (q == null) {
            q = Boolean.valueOf(v.b.a("goodlist", "enableGoodsListRemoveOpt", true));
        }
        if (t == null) {
            t = Boolean.valueOf(v.b.a("goodlist", "enablePadKandianSwitch", true));
        }
        if (u == null) {
            u = Boolean.valueOf(v.b.a("goodlist", "enableRecSort", true));
        }
        if (d == null) {
            d = v.b.a("goodlist", "enableMoreUltron", "pcg,rightsTop,categoryTop,searchBottom,rightsTopV2");
        }
        if (C == null) {
            C = Boolean.valueOf(v.b.a("goodlist", "enableSeckillPreheatAddCart", true));
        }
        if (D == null) {
            D = Boolean.valueOf(v.b.a("goodlist", "fixHeaderShow", true));
        }
        if (k == null) {
            k = Boolean.valueOf(v.b.a("goodlist", "startRefresh", true));
        }
        if (m == null) {
            boolean a2 = v.b.a("goodlist", "enableGLPerformance4", true);
            int a3 = v.a.a("taolive", "glPerformance", "value");
            if (!a2) {
                a3 = 0;
            }
            m = Integer.valueOf(a3);
        }
        if (w == null) {
            w = Boolean.valueOf(v.b.a("goodlist", "showcasePerformance2", false));
        }
        if (o == null) {
            o = Boolean.valueOf(v.b.a("goodlist", "enableNewGLTab2", true));
        }
        if (A == null) {
            A = Boolean.valueOf(v.b.a("goodlist", "enableNewResume", true));
        }
        if (E == null) {
            boolean a4 = v.b.a("goodlist", "enableGLCdnCache", true);
            boolean b = v.a.b("taolive", "enableGLCdnCache", "enable");
            if (a4 && b) {
                z = true;
            }
            E = Boolean.valueOf(z);
        }
        if (B == null) {
            B = Boolean.valueOf(v.b.a("goodlist", "enableAllTabPMDelete", true));
        }
        if (G == null) {
            G = Boolean.valueOf(v.b.a("goodlist", "enableHotItemSubscribe", true));
        }
        if (H == null) {
            H = Boolean.valueOf(v.b.a("goodlist", "enableHotRec", true));
        }
        if (I == null) {
            I = Boolean.valueOf(v.b.a("goodlist", "enableZhuahongbao", true));
        }
        his.a("GoodConfigContainer", "loadConfigActvityCycle | sEnableMultiSecKill=" + n + "   sBuyGiftMultiState=" + p + "   sEnableListAllDelete=" + q);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        Boolean bool = w;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        Boolean bool = n;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[0])).intValue();
        }
        Integer num = p;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue();
        }
        Boolean bool = q;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static Boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("416a306f", new Object[0]);
        }
        Boolean bool = t;
        if (bool != null) {
            return bool;
        }
        return false;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue();
        }
        Boolean bool = u;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
        }
        String str = d;
        return str == null ? "" : str;
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue();
        }
        Boolean bool = C;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue();
        }
        Boolean bool = D;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static Boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("efdd6667", new Object[0]);
        }
        Boolean bool = k;
        if (bool != null) {
            return bool;
        }
        return false;
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue();
        }
        Boolean bool = E;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[0])).intValue();
        }
        Integer num = m;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue();
        }
        Integer num = m;
        if (num == null) {
            return false;
        }
        return num.intValue() == 1 || m.intValue() >= 100;
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue();
        }
        Integer num = m;
        if (num == null) {
            return false;
        }
        return num.intValue() == 2 || m.intValue() >= 100;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        Integer num = m;
        if (num == null) {
            return false;
        }
        return num.intValue() == 3 || m.intValue() >= 100;
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue();
        }
        Integer num = m;
        if (num == null) {
            return false;
        }
        return num.intValue() == 4 || m.intValue() >= 100;
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue();
        }
        Boolean bool = A;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        Boolean bool = r;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue();
        }
        Boolean bool = o;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue();
        }
        Boolean bool = j;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("902c6393", new Object[]{cVar})).booleanValue();
        }
        Boolean bool = F;
        if (bool != null && bool.booleanValue()) {
            return p();
        }
        if (cVar != null && cVar.E() != null) {
            return cVar.E().h;
        }
        return false;
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue();
        }
        Boolean bool = H;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue();
        }
        Boolean bool = B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue();
        }
        Boolean bool = G;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue();
        }
        Boolean bool = I;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[0]);
            return;
        }
        n = null;
        p = null;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "GoodConfigContainer{speakingCardOpt=" + this.f13839a + ", enableFirstDetailStash=" + this.e + ", enablePcgShowCase=" + this.f + ", enablePcgRecCarouselShow=" + this.g + ", pcgShowcaseConfig='" + this.h + '}';
    }
}
