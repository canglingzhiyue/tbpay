package com.alibaba.triver.triver_shop.newShop.data;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.x0;
import com.alibaba.triver.triver_shop.container.ShopLoftActivity;
import com.alibaba.triver.triver_shop.extension.accs.a;
import com.alibaba.triver.triver_shop.newShop.ext.l;
import com.alibaba.triver.triver_shop.newShop.view.ShopView;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.alibaba.triver.triver_shop.web.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.downgrade.AliHADowngradeSDKExtension;
import com.taobao.monitor.procedure.s;
import com.taobao.search.sf.InshopResultActivity;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.p;
import kotlin.j;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import org.android.agoo.common.AgooConstants;
import tb.ceg;
import tb.cen;
import tb.kge;
import tb.ruk;
import tb.rul;
import tb.rva;

/* loaded from: classes3.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final h aq;
    @Deprecated
    private static boolean ar;
    private final ConcurrentHashMap<String, b> A;
    private final ConcurrentHashMap<String, Object> B;
    private String C;
    private ShopView.c D;
    private ruk<Integer> E;
    private String F;
    private String G;
    private JSONObject H;
    private Bundle I;
    private final JSONArray J;
    private final JSONObject K;
    private final JSONObject L;
    private final String M;
    private final String N;
    private final String O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private JSONArray T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int X;
    private int Y;
    private int Z;

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f3821a;
    private int aa;
    private com.alibaba.triver.triver_shop.newShop.event.broadcast.a ab;
    private com.alibaba.triver.triver_shop.newShop.event.ucp.a ac;
    private final boolean ad;
    private a.InterfaceC0131a ae;
    private boolean af;
    private final boolean ag;
    private boolean ah;
    private final C0135d ai;
    private final a aj;
    private final c ak;
    private boolean al;
    private final f am;
    private final boolean an;
    private final g ao;
    private long ap;
    private boolean as;
    private final i at;
    private final Uri b;
    private Context c;
    private HashSet<ComponentCallbacks2> d;
    private final boolean e;
    private final boolean f;
    private ruk<String> g;
    private boolean h;
    private ShopWrapWebView i;
    private boolean j;
    private String k;
    private JSONObject l;
    private JSONObject m;
    private JSONObject n;
    private JSONObject o;
    private JSONObject p;
    private JSONArray q;
    private JSONObject r;
    private JSONObject s;
    private JSONObject t;
    private JSONObject u;
    private JSONArray v;
    private String w;
    private String x;
    private JSONObject y;
    private HashMap<String, String> z;

    public final boolean aY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa81c4a3", new Object[]{this})).booleanValue();
        }
        return true;
    }

    /* loaded from: classes3.dex */
    public static final class h {
        static {
            kge.a(163096043);
        }

        public /* synthetic */ h(o oVar) {
            this();
        }

        private h() {
        }
    }

    public d(JSONObject shopFetchData, Uri uri) {
        JSONObject jSONObject;
        q.d(shopFetchData, "shopFetchData");
        this.f3821a = shopFetchData;
        this.b = uri;
        this.d = new HashSet<>();
        this.e = cen.Companion.C();
        this.f = cen.Companion.D();
        boolean z = true;
        this.j = true;
        this.A = new ConcurrentHashMap<>();
        this.B = new ConcurrentHashMap<>();
        this.J = new JSONArray();
        this.K = new JSONObject();
        this.L = new JSONObject();
        Uri uri2 = this.b;
        String str = null;
        this.M = uri2 == null ? null : uri2.getQueryParameter(ShopRenderActivity.SHOP_NAVI);
        Uri uri3 = this.b;
        this.N = uri3 == null ? null : uri3.getQueryParameter("weexShopTab");
        Uri uri4 = this.b;
        this.O = uri4 == null ? null : uri4.getQueryParameter("weexShopSubTab");
        this.ac = new com.alibaba.triver.triver_shop.newShop.event.ucp.a(this);
        this.ad = cen.Companion.j();
        this.af = cen.Companion.v();
        this.ag = cen.Companion.c();
        this.al = true;
        this.an = cen.Companion.am();
        this.ai = new C0135d(this);
        this.am = new f(this);
        this.at = new i(this);
        JSONObject jSONObject2 = this.f3821a.getJSONObject("hierarchy");
        this.k = jSONObject2 == null ? null : jSONObject2.getString("root");
        JSONObject jSONObject3 = this.f3821a.getJSONObject("hierarchy");
        this.l = jSONObject3 == null ? null : jSONObject3.getJSONObject("structure");
        this.m = this.f3821a.getJSONObject("components");
        JSONObject jSONObject4 = this.m;
        this.n = (jSONObject4 == null || (jSONObject = jSONObject4.getJSONObject(this.k)) == null) ? null : jSONObject.getJSONObject("payload");
        String str2 = this.k;
        if (str2 != null) {
            o(str2);
        }
        Uri uri5 = this.b;
        if (uri5 != null) {
            this.x = uri5.getQueryParameter("shopId");
            this.w = uri5.getQueryParameter("sellerId");
            a(uri5.getQueryParameter("subscribe_bizdata"));
        }
        JSONObject jSONObject5 = this.o;
        if (jSONObject5 != null) {
            this.t = jSONObject5.getJSONObject("liveInfo2");
        }
        this.C = bf();
        Pair<Integer, Integer> aF = aF();
        this.R = aF.getFirst().intValue();
        this.S = aF.getSecond().intValue();
        if (com.alibaba.triver.triver_shop.newShop.ext.i.b(d(this.R, this.S))) {
            this.as = true;
        }
        this.L.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SHOP_FETCH, this.f3821a.toJSONString());
        this.L.put((JSONObject) "fetchDowngradeConfig", String.valueOf(cen.Companion.ad()));
        JSONObject jSONObject6 = this.n;
        boolean a2 = q.a((Object) (jSONObject6 != null ? jSONObject6.getString("enableShopAsyncBridge") : str), (Object) "true");
        boolean ah = cen.Companion.ah();
        this.al = (!a2 || !ah) ? false : z;
        ceg.a aVar = ceg.Companion;
        aVar.b("shop async api init status : routeConfig : " + a2 + " , orangeConfig : " + ah + ", final status : " + this.al);
        b("enableAsyncApi", Boolean.valueOf(this.al));
        this.am.c();
        this.ao = new g(this);
        bs();
        this.aj = new a(this);
        this.ak = new c(this);
    }

    public static final /* synthetic */ JSONObject b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("a3102878", new Object[]{dVar}) : dVar.n;
    }

    public static final /* synthetic */ JSONArray c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("f8d86ba7", new Object[]{dVar}) : dVar.v;
    }

    static {
        kge.a(1905269347);
        aq = new h(null);
        ar = true;
    }

    public final void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.ap = j;
        }
    }

    public final long br() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad96e8cb", new Object[]{this})).longValue() : this.ap;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.e;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f;
    }

    public final void a(ShopWrapWebView shopWrapWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c2f90a", new Object[]{this, shopWrapWebView});
        } else {
            this.i = shopWrapWebView;
        }
    }

    public final ShopWrapWebView e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopWrapWebView) ipChange.ipc$dispatch("6d4ab0cc", new Object[]{this}) : this.i;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.j;
    }

    public final boolean bv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("adcf46df", new Object[]{this})).booleanValue() : this.h;
    }

    public final void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public final void a(ShopView.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a61f3f4", new Object[]{this, cVar});
        } else {
            this.D = cVar;
        }
    }

    public final void a(ruk<Integer> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbfc750", new Object[]{this, rukVar});
        } else {
            this.E = rukVar;
        }
    }

    public final ruk<Integer> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("3d341bd0", new Object[]{this}) : this.E;
    }

    public final void b(ruk<String> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec42cdd1", new Object[]{this, rukVar});
        } else {
            this.g = rukVar;
        }
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.F = str;
        }
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.F;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.G = str;
        }
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.H = jSONObject;
        }
    }

    public final JSONObject i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("dde1390", new Object[]{this}) : this.H;
    }

    public final void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
        } else {
            this.I = bundle;
        }
    }

    public final Bundle j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("6d61e275", new Object[]{this}) : this.I;
    }

    public final JSONArray k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("6697548c", new Object[]{this}) : this.J;
    }

    public final JSONObject l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("48d58e13", new Object[]{this}) : this.K;
    }

    public final JSONObject m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("5c7d6194", new Object[]{this}) : this.L;
    }

    public final int n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue() : this.P;
    }

    public final int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue() : this.Q;
    }

    public final int p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue() : this.R;
    }

    public final int q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de46b", new Object[]{this})).intValue() : this.S;
    }

    public final void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else {
            this.T = jSONArray;
        }
    }

    public final JSONArray r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("9451df25", new Object[]{this}) : this.T;
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.U = z;
        }
    }

    public final boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : this.U;
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.V = z;
        }
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : this.V;
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.W = z;
        }
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : this.W;
    }

    public final void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
        } else {
            this.X = i2;
        }
    }

    public final int v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("69459f0", new Object[]{this})).intValue() : this.X;
    }

    public final void b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i2)});
        } else {
            this.Y = i2;
        }
    }

    public final int w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a27171", new Object[]{this})).intValue() : this.Y;
    }

    public final void c(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i2)});
        } else {
            this.Z = i2;
        }
    }

    public final int x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6b088f2", new Object[]{this})).intValue() : this.Z;
    }

    public final void d(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i2)});
        } else {
            this.aa = i2;
        }
    }

    public final int y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6bea073", new Object[]{this})).intValue() : this.aa;
    }

    public final void a(com.alibaba.triver.triver_shop.newShop.event.broadcast.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbea99a", new Object[]{this, aVar});
        } else {
            this.ab = aVar;
        }
    }

    public final com.alibaba.triver.triver_shop.newShop.event.broadcast.a z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.event.broadcast.a) ipChange.ipc$dispatch("18b69427", new Object[]{this}) : this.ab;
    }

    public final com.alibaba.triver.triver_shop.newShop.event.ucp.a A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.event.ucp.a) ipChange.ipc$dispatch("7ddf913f", new Object[]{this}) : this.ac;
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue() : this.ad;
    }

    public final a.InterfaceC0131a C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.InterfaceC0131a) ipChange.ipc$dispatch("aa2b7c82", new Object[]{this}) : this.ae;
    }

    public final void a(a.InterfaceC0131a interfaceC0131a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13311160", new Object[]{this, interfaceC0131a});
        } else {
            this.ae = interfaceC0131a;
        }
    }

    public final boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue() : this.af;
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.af = z;
        }
    }

    public final boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue() : this.ag;
    }

    public final boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue() : this.ah;
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            this.ah = z;
        }
    }

    public final boolean bk() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad344454", new Object[]{this})).booleanValue() : this.al;
    }

    public final C0135d G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C0135d) ipChange.ipc$dispatch("d30b611f", new Object[]{this}) : this.ai;
    }

    public final f bm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("c8483361", new Object[]{this}) : this.am;
    }

    public final g bi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("935d6d7c", new Object[]{this}) : this.ao;
    }

    public final i bt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("a4e30e45", new Object[]{this}) : this.at;
    }

    /* loaded from: classes3.dex */
    public final class g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f3828a;
        private final boolean b;
        private boolean c;
        private boolean d;

        static {
            kge.a(-1958303359);
        }

        public g(d this$0) {
            q.d(this$0, "this$0");
            this.f3828a = this$0;
            this.b = this.f3828a.bj();
            boolean z = true;
            this.c = this.b ? com.alibaba.triver.triver_shop.newShop.ext.h.b() : true;
            this.d = this.b ? com.alibaba.triver.triver_shop.newShop.ext.h.c() : z;
        }

        public final void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.c = z;
            }
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c;
        }

        public final void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            } else {
                this.d = z;
            }
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.d;
        }
    }

    /* loaded from: classes3.dex */
    public final class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f3827a;
        private boolean b;
        private boolean c;
        private boolean d;

        static {
            kge.a(1133640826);
        }

        public f(d this$0) {
            q.d(this$0, "this$0");
            this.f3827a = this$0;
            this.b = true;
            this.c = true;
            this.d = true;
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c;
        }

        public final boolean d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.d;
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            this.d = q.a((Object) this.f3827a.p("isHitTBMuteSetting"), (Object) "true");
            this.b = q.a((Object) this.f3827a.p("vibrateWhenSwitchTab"), (Object) "true");
            this.c = q.a((Object) this.f3827a.p("hideBottomBarWhenSlide"), (Object) "true");
        }
    }

    /* renamed from: com.alibaba.triver.triver_shop.newShop.data.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class C0135d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f3825a;
        private final boolean b;
        private final boolean c;
        private ViewGroup d;
        private View.OnClickListener e;
        private final HashSet<rul<Configuration, t>> f;
        private ruk<t> g;
        private ruk<t> h;
        private rul<? super Boolean, t> i;
        private rul<? super Boolean, Boolean> j;
        private rul<? super Boolean, t> k;
        private rul<? super String, t> l;
        private rva<? super Boolean, ? super Integer, ? super Integer, t> m;
        private final kotlin.d n;
        private rul<? super Boolean, Boolean> o;
        private rul<? super String, t> p;
        private ruk<Boolean> q;

        static {
            kge.a(-995846637);
        }

        public C0135d(d this$0) {
            q.d(this$0, "this$0");
            this.f3825a = this$0;
            this.b = cen.Companion.b();
            this.c = cen.Companion.a();
            this.n = kotlin.e.a(new ShopDataParser$ShopViewContext$allItemCountIconContainer$2(this.f3825a));
            this.f = new HashSet<>();
        }

        public final void c(rul<? super Boolean, t> rulVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dac648b1", new Object[]{this, rulVar});
            } else {
                this.k = rulVar;
            }
        }

        public final rul<Boolean, t> i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("4c9766ad", new Object[]{this}) : this.k;
        }

        public final void d(rul<? super String, t> rulVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9494f32", new Object[]{this, rulVar});
            } else {
                this.l = rulVar;
            }
        }

        public final rul<String, t> j() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("54490c0c", new Object[]{this}) : this.l;
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c;
        }

        public final void a(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            } else {
                this.d = viewGroup;
            }
        }

        public final ViewGroup c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("6e13476b", new Object[]{this}) : this.d;
        }

        public final void a(View.OnClickListener onClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
            } else {
                this.e = onClickListener;
            }
        }

        public final View.OnClickListener d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("8da4eb94", new Object[]{this}) : this.e;
        }

        public final void a(ruk<t> rukVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fdbfc750", new Object[]{this, rukVar});
            } else {
                this.g = rukVar;
            }
        }

        public final ruk<t> e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("2dd0d112", new Object[]{this}) : this.g;
        }

        public final void b(ruk<t> rukVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec42cdd1", new Object[]{this, rukVar});
            } else {
                this.h = rukVar;
            }
        }

        public final ruk<t> f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("35827671", new Object[]{this}) : this.h;
        }

        public final void a(rul<? super Boolean, t> rulVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fdc03baf", new Object[]{this, rulVar});
            } else {
                this.i = rulVar;
            }
        }

        public final rul<Boolean, t> g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("3d341bef", new Object[]{this}) : this.i;
        }

        public final void b(rul<? super Boolean, Boolean> rulVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec434230", new Object[]{this, rulVar});
            } else {
                this.j = rulVar;
            }
        }

        public final rul<Boolean, Boolean> h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("44e5c14e", new Object[]{this}) : this.j;
        }

        public final void a(rva<? super Boolean, ? super Integer, ? super Integer, t> rvaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fdc9531b", new Object[]{this, rvaVar});
            } else {
                this.m = rvaVar;
            }
        }

        public final rva<Boolean, Integer, Integer, t> k() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rva) ipChange.ipc$dispatch("5bfab3d7", new Object[]{this}) : this.m;
        }

        public final FrameLayout l() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("20a5da06", new Object[]{this}) : (FrameLayout) this.n.getValue();
        }

        public final void e(rul<? super Boolean, Boolean> rulVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7cc55b3", new Object[]{this, rulVar});
            } else {
                this.o = rulVar;
            }
        }

        public final rul<Boolean, Boolean> m() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("6b5dfc29", new Object[]{this}) : this.o;
        }

        public final void f(rul<? super String, t> rulVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a64f5c34", new Object[]{this, rulVar});
            } else {
                this.p = rulVar;
            }
        }

        public final rul<String, t> n() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("730fa188", new Object[]{this}) : this.p;
        }

        public final void c(ruk<Boolean> rukVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dac5d452", new Object[]{this, rukVar});
            } else {
                this.q = rukVar;
            }
        }

        public final ruk<Boolean> o() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("7ac146c8", new Object[]{this}) : this.q;
        }
    }

    /* loaded from: classes3.dex */
    public final class i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f3829a;
        private com.alibaba.triver.triver_shop.newShop.view.a b;

        static {
            kge.a(1156515751);
        }

        public i(d this$0) {
            q.d(this$0, "this$0");
            this.f3829a = this$0;
        }

        public final com.alibaba.triver.triver_shop.newShop.view.a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.view.a) ipChange.ipc$dispatch("47187b41", new Object[]{this}) : this.b;
        }

        public final void a(com.alibaba.triver.triver_shop.newShop.view.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25693fc1", new Object[]{this, aVar});
            } else {
                this.b = aVar;
            }
        }
    }

    public final void a(ComponentCallbacks2 componentCallbacks2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d04c4e", new Object[]{this, componentCallbacks2});
            return;
        }
        q.d(componentCallbacks2, "componentCallbacks2");
        this.d.add(componentCallbacks2);
    }

    public final void b(ComponentCallbacks2 componentCallbacks2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac35816d", new Object[]{this, componentCallbacks2});
            return;
        }
        q.d(componentCallbacks2, "componentCallbacks2");
        this.d.remove(componentCallbacks2);
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new ShopDataParser$dispatchOnLowMem$1(this));
        }
    }

    public final void e(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i2)});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new ShopDataParser$dispatchOnTrimMem$1(this, i2));
        }
    }

    private final void bs() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ada50058", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.K;
        if (ar) {
            ar = false;
        } else {
            z = false;
        }
        jSONObject.put((JSONObject) "firstLaunchShop", (String) Boolean.valueOf(z));
        this.K.put((JSONObject) "tmsLaunchTask", com.taobao.themis.kernel.utils.t.c(Globals.getApplication()));
    }

    private final JSONArray bd() {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("bf1bc155", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = this.q;
        if (jSONArray3 != null) {
            for (Object obj : jSONArray3) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    p.b();
                }
                if (obj instanceof JSONObject) {
                    JSONArray jSONArray4 = new JSONArray();
                    JSONObject jSONObject = (JSONObject) obj;
                    JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
                    if (jSONObject2 != null) {
                        jSONArray.add(jSONObject2);
                        JSONArray jSONArray5 = jSONObject.getJSONArray("childrens");
                        q.b(jSONArray5, "any.getJSONArray(\"childrens\")");
                        Iterator<Object> it = jSONArray5.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (next != null) {
                                JSONArray jSONArray6 = ((JSONObject) next).getJSONArray("childrens");
                                q.b(jSONArray6, "childrens_1_obj as JSONObject).getJSONArray(\"childrens\")");
                                if (q.a((Object) jSONObject2.getString("name"), (Object) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SHOP_INDEX_BAR)) {
                                    if (!jSONArray6.isEmpty()) {
                                        jSONArray4.add(p.h((List<? extends Object>) jSONArray6));
                                    }
                                } else {
                                    jSONArray4.addAll(jSONArray6);
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                            }
                        }
                    }
                    jSONArray2.add(jSONArray4);
                }
                i2 = i3;
            }
        }
        this.v = jSONArray2;
        return jSONArray;
    }

    public final JSONArray I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("f631d7ee", new Object[]{this});
        }
        bd();
        JSONArray jSONArray = this.v;
        if (jSONArray == null) {
            return new JSONArray();
        }
        q.a(jSONArray);
        return jSONArray;
    }

    public final HashMap<String, String> J() {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("140792f4", new Object[]{this});
        }
        if (this.z == null) {
            Uri uri = this.b;
            HashMap<String, String> hashMap = null;
            if (uri != null && (a2 = com.alibaba.triver.triver_shop.newShop.ext.b.a(uri)) != null) {
                hashMap = com.alibaba.triver.triver_shop.newShop.ext.b.f(a2);
            }
            this.z = hashMap;
        }
        HashMap<String, String> hashMap2 = this.z;
        return hashMap2 == null ? new HashMap<>() : hashMap2;
    }

    public final void a(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        this.P = i2;
        this.Q = i3;
    }

    public final String K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2078db8e", new Object[]{this});
        }
        ruk<String> rukVar = this.g;
        if (rukVar != null) {
            return rukVar.mo2427invoke();
        }
        return d();
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : d(this.Q, this.P);
    }

    public final String L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a6fe962d", new Object[]{this}) : f(this.Q);
    }

    public final String f(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35ca8aa", new Object[]{this, new Integer(i2)});
        }
        JSONObject M = M();
        JSONArray jSONArray = new JSONArray();
        Object obj = M.get("tabData");
        if (!(obj instanceof JSONArray)) {
            obj = jSONArray;
        }
        JSONObject b2 = com.alibaba.triver.triver_shop.newShop.ext.d.b((JSONArray) obj, i2);
        if (b2 == null) {
            return "";
        }
        Object obj2 = b2.get("name");
        if (!(obj2 instanceof String)) {
            obj2 = "";
        }
        return (String) obj2;
    }

    private final String a(int i2, int i3, String str) {
        JSONArray c2;
        JSONObject b2;
        String string;
        String str2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7529d04e", new Object[]{this, new Integer(i2), new Integer(i3), str}) : (str == null || (c2 = com.alibaba.triver.triver_shop.newShop.ext.d.c(I(), i2)) == null || (b2 = com.alibaba.triver.triver_shop.newShop.ext.d.b(c2, i3)) == null || (string = b2.getString(str)) == null || (str2 = string.toString()) == null) ? "" : str2;
    }

    public final Pair<Integer, Integer> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("5260319d", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        Iterator<Object> it = I().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONArray) {
                Iterator<Object> it2 = ((JSONArray) next).iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if ((next2 instanceof JSONObject) && q.a((Object) ((JSONObject) next2).getString("name"), (Object) str)) {
                        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i3));
                    }
                    i3++;
                }
                continue;
            }
            i2++;
        }
        return null;
    }

    public final boolean b(int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("90f78e0d", new Object[]{this, new Integer(i2), new Integer(i3)})).booleanValue() : q.a((Object) "true", (Object) a(i2, i3, "fullScreen"));
    }

    public final String c(int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5b2a896", new Object[]{this, new Integer(i2), new Integer(i3)}) : a(i2, i3, "utArg1");
    }

    public final String d(int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b1b43775", new Object[]{this, new Integer(i2), new Integer(i3)}) : a(i2, i3, "name");
    }

    public final com.alibaba.triver.triver_shop.newShop.data.g e(int i2, int i3) {
        com.alibaba.triver.triver_shop.newShop.data.g a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.triver.triver_shop.newShop.data.g) ipChange.ipc$dispatch("dac6713a", new Object[]{this, new Integer(i2), new Integer(i3)});
        }
        JSONArray I = I();
        try {
            Result.a aVar = Result.Companion;
            a2 = new com.alibaba.triver.triver_shop.newShop.data.f(I.getJSONArray(i2), this, i2).a(i3);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
        if (a2 != null) {
            return a2;
        }
        Result.m2371constructorimpl(null);
        return null;
    }

    public final String g(int i2) {
        JSONObject b2;
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d8e41eb", new Object[]{this, new Integer(i2)});
        }
        JSONArray jSONArray = this.q;
        return (jSONArray == null || (b2 = com.alibaba.triver.triver_shop.newShop.ext.d.b(jSONArray, i2)) == null || (jSONObject = b2.getJSONObject("payload")) == null || (string = jSONObject.getString("utArg1")) == null) ? "" : string;
    }

    public final JSONObject M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e782f174", new Object[]{this});
        }
        if (this.y == null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "shopInfo", (String) this.n);
            jSONObject2.put((JSONObject) "tabData", (String) bl());
            jSONObject2.put((JSONObject) "isPromotionStyle", (String) Boolean.valueOf(aD()));
            jSONObject2.put((JSONObject) "offService", (String) ay());
            jSONObject2.put((JSONObject) "headerData", (String) V());
            jSONObject2.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_IS_SHOW_LIVE_ICON, (String) Boolean.valueOf(ae()));
            jSONObject2.put((JSONObject) "nativeData", (String) com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("isLivingStatus", Boolean.valueOf(bq()))));
            this.y = jSONObject;
        }
        JSONObject jSONObject3 = this.y;
        q.a(jSONObject3);
        return jSONObject3;
    }

    public final JSONArray bl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("6115844d", new Object[]{this}) : bd();
    }

    public final JSONObject N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fb2ac4f5", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "shopInfo", (String) this.n);
        jSONObject2.put((JSONObject) "headerData", (String) this.o);
        jSONObject2.put((JSONObject) "navigatorData", (String) this.p);
        jSONObject2.put((JSONObject) "nativeConfig", (String) com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("autoScrollText", Boolean.valueOf(cen.Companion.s()))));
        jSONObject2.put((JSONObject) "nativeData", (String) com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("isLivingStatus", Boolean.valueOf(bq()))));
        return jSONObject;
    }

    public final JSONObject O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ed29876", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "shopInfo", (String) this.n);
        jSONObject2.put((JSONObject) "navigatorData", (String) this.p);
        return jSONObject;
    }

    public final JSONObject P() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("227a6bf7", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        JSONArray jSONArray = this.q;
        if (jSONArray == null) {
            obj = null;
        } else {
            q.a(jSONArray);
            obj = jSONArray.get(0);
        }
        jSONObject2.put((JSONObject) "indexData", (String) obj);
        jSONObject2.put((JSONObject) "navigatorData", (String) this.p);
        jSONObject2.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, (String) 0);
        jSONObject2.put((JSONObject) "headerData", (String) this.o);
        if (an()) {
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = jSONObject3;
            jSONObject4.put((JSONObject) "isDarkBg", (String) false);
            jSONObject4.put((JSONObject) "followStatus", (String) false);
            jSONObject2.put((JSONObject) "carData", (String) jSONObject3);
        }
        if (ao()) {
            jSONObject2.put((JSONObject) "isShopNameNavi", (String) true);
            jSONObject2.put((JSONObject) "showShopName", (String) false);
        }
        jSONObject2.put((JSONObject) "shopInfo", (String) this.n);
        return jSONObject;
    }

    public final JSONObject h(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("98355b14", new Object[]{this, new Integer(i2)});
        }
        JSONObject P = P();
        JSONObject jSONObject = P;
        JSONArray jSONArray = this.v;
        jSONObject.put((JSONObject) "tabData", (String) (jSONArray == null ? null : com.alibaba.triver.triver_shop.newShop.ext.d.a(jSONArray, i2)));
        jSONObject.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_HEADER_EXPANDED, (String) true);
        jSONObject.put((JSONObject) "bottomIndex", (String) Integer.valueOf(i2));
        jSONObject.put((JSONObject) "isPromotionStyle", (String) Boolean.valueOf(aD()));
        return P;
    }

    public final JSONObject Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("36223f78", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "navigatorData", (String) this.p);
        jSONObject2.put((JSONObject) "allItemData", (String) be());
        jSONObject2.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, (String) 0);
        return jSONObject;
    }

    private final JSONArray be() {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("335af9b4", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = this.q;
        if (jSONArray2 != null && (size = jSONArray2.size()) > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                Object obj = jSONArray2.get(i2);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (TextUtils.equals(c(jSONObject).getString("name"), com.alibaba.triver.triver_shop.newShop.ext.g.KEY_ALL_ITEMS)) {
                        JSONArray d = d(jSONObject);
                        d.size();
                        return d(d.getJSONObject(0));
                    }
                }
                if (i3 >= size) {
                    break;
                }
                i2 = i3;
            }
        }
        return jSONArray;
    }

    private final JSONObject c(JSONObject jSONObject) {
        JSONObject payload;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45647e6", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null || (payload = jSONObject.getJSONObject("payload")) == null) {
            return jSONObject2;
        }
        q.b(payload, "payload");
        return payload;
    }

    private final JSONArray d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("8d8f5c39", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return new JSONArray();
        }
        JSONArray childrens = jSONObject.getJSONArray("childrens");
        if (childrens == null) {
            return new JSONArray();
        }
        q.b(childrens, "childrens");
        return childrens;
    }

    private final JSONObject o(String str) {
        int size;
        int size2;
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b67458e0", new Object[]{this, str});
        }
        List b2 = n.b((CharSequence) str, new String[]{"_"}, false, 0, 6, (Object) null);
        String str2 = b2.isEmpty() ^ true ? (String) p.h((List<? extends Object>) b2) : "";
        JSONObject jSONObject4 = null;
        JSONObject jSONObject5 = null;
        Object obj = null;
        JSONObject jSONObject6 = null;
        JSONArray jSONArray2 = null;
        JSONArray jSONArray3 = null;
        if (q.a((Object) str2, (Object) "header")) {
            JSONObject jSONObject7 = this.m;
            this.o = jSONObject7 == null ? null : jSONObject7.getJSONObject(str);
            JSONObject jSONObject8 = this.o;
            this.r = (jSONObject8 == null || (jSONObject = jSONObject8.getJSONObject("payload")) == null) ? null : jSONObject.getJSONObject("loftInfo");
            JSONObject jSONObject9 = this.o;
            this.u = (jSONObject9 == null || (jSONObject2 = jSONObject9.getJSONObject("payload")) == null) ? null : jSONObject2.getJSONObject("loftInfo2");
            JSONObject jSONObject10 = this.o;
            this.s = (jSONObject10 == null || (jSONObject3 = jSONObject10.getJSONObject("payload")) == null) ? null : jSONObject3.getJSONObject("liveInfo");
            JSONObject jSONObject11 = new JSONObject();
            JSONObject jSONObject12 = this.o;
            if (jSONObject12 == null) {
                jSONObject12 = new JSONObject();
            }
            jSONObject11.putAll(jSONObject12);
            JSONObject jSONObject13 = this.o;
            JSONObject jSONObject14 = jSONObject13 == null ? null : jSONObject13.getJSONObject("payload");
            if (jSONObject14 == null) {
                jSONObject14 = new JSONObject();
            }
            jSONObject11.putAll(jSONObject14);
            this.o = jSONObject11;
            JSONObject jSONObject15 = this.m;
            if (jSONObject15 != null) {
                return jSONObject15.getJSONObject(str);
            }
            return null;
        } else if (q.a((Object) str2, (Object) "navigator")) {
            JSONObject jSONObject16 = new JSONObject();
            JSONObject jSONObject17 = this.m;
            JSONObject jSONObject18 = jSONObject17 == null ? null : jSONObject17.getJSONObject(str);
            jSONObject16.putAll(jSONObject18 == null ? new JSONObject() : jSONObject18);
            if (jSONObject18 != null) {
                jSONObject5 = jSONObject18.getJSONObject("payload");
            }
            if (jSONObject5 == null) {
                jSONObject5 = new JSONObject();
            }
            jSONObject16.putAll(jSONObject5);
            this.p = jSONObject16;
            return jSONObject16;
        } else {
            q.a((Object) str2, (Object) "customIndex");
            if (q.a((Object) str2, (Object) "tab")) {
                JSONObject jSONObject19 = new JSONObject();
                JSONObject jSONObject20 = this.m;
                JSONObject jSONObject21 = jSONObject20 == null ? null : jSONObject20.getJSONObject(str);
                jSONObject19.putAll(jSONObject21 == null ? new JSONObject() : jSONObject21);
                JSONObject jSONObject22 = jSONObject21 == null ? null : jSONObject21.getJSONObject("payload");
                if (jSONObject22 == null) {
                    jSONObject22 = new JSONObject();
                }
                jSONObject19.putAll(jSONObject22);
                JSONObject jSONObject23 = this.l;
                List g2 = (jSONObject23 == null || (jSONArray = jSONObject23.getJSONArray(str)) == null) ? null : p.g((Iterable) jSONArray);
                if (!(g2 instanceof List)) {
                    g2 = null;
                }
                JSONObject jSONObject24 = this.m;
                if (jSONObject24 != null) {
                    if (g2 != null) {
                        obj = g2.get(0);
                    }
                    jSONObject6 = jSONObject24.getJSONObject(String.valueOf(obj));
                }
                if (jSONObject6 != null) {
                    jSONObject19.putAll(jSONObject6);
                }
                return jSONObject19;
            } else if (q.a((Object) str2, (Object) "tabContainer")) {
                JSONArray jSONArray4 = new JSONArray();
                JSONObject jSONObject25 = this.m;
                JSONObject jSONObject26 = jSONObject25 == null ? null : jSONObject25.getJSONObject(str);
                JSONObject jSONObject27 = this.l;
                if (jSONObject27 != null) {
                    jSONArray2 = jSONObject27.getJSONArray(str);
                }
                if (jSONArray2 != null && (size2 = jSONArray2.size()) > 0) {
                    while (true) {
                        int i3 = i2 + 1;
                        jSONArray4.add(o(jSONArray2.get(i2).toString()));
                        if (i3 >= size2) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                this.q = jSONArray4;
                JSONObject jSONObject28 = new JSONObject();
                jSONObject28.put((JSONObject) "childrens", (String) jSONArray4);
                JSONObject jSONObject29 = new JSONObject();
                if (jSONObject26 == null) {
                    jSONObject26 = new JSONObject();
                }
                jSONObject29.putAll(jSONObject26);
                jSONObject29.putAll(jSONObject28);
                return jSONObject29;
            } else {
                JSONObject jSONObject30 = this.l;
                if ((jSONObject30 == null ? null : jSONObject30.getJSONArray(str)) != null) {
                    JSONObject jSONObject31 = this.m;
                    JSONObject jSONObject32 = jSONObject31 == null ? null : jSONObject31.getJSONObject(str);
                    JSONObject jSONObject33 = this.l;
                    if (jSONObject33 != null) {
                        jSONArray3 = jSONObject33.getJSONArray(str);
                    }
                    JSONArray jSONArray5 = new JSONArray();
                    if (jSONArray3 != null && (size = jSONArray3.size()) > 0) {
                        while (true) {
                            int i4 = i2 + 1;
                            jSONArray5.add(o(jSONArray3.get(i2).toString()));
                            if (i4 >= size) {
                                break;
                            }
                            i2 = i4;
                        }
                    }
                    JSONObject jSONObject34 = new JSONObject();
                    jSONObject34.put((JSONObject) "childrens", (String) jSONArray5);
                    JSONObject jSONObject35 = new JSONObject();
                    if (jSONObject32 == null) {
                        jSONObject32 = new JSONObject();
                    }
                    jSONObject35.putAll(jSONObject32);
                    jSONObject35.putAll(jSONObject34);
                    return jSONObject35;
                }
                JSONObject jSONObject36 = this.m;
                if (jSONObject36 != null) {
                    jSONObject4 = jSONObject36.getJSONObject(str);
                }
                JSONObject jSONObject37 = new JSONObject();
                jSONObject37.put((JSONObject) "childrens", (String) new JSONArray());
                JSONObject jSONObject38 = new JSONObject();
                if (jSONObject4 == null) {
                    jSONObject4 = new JSONObject();
                }
                jSONObject38.putAll(jSONObject4);
                jSONObject38.putAll(jSONObject37);
                return jSONObject38;
            }
        }
    }

    public final String R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce20f5e7", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        if (jSONObject != null) {
            return jSONObject.getString("atmosphereTabBgPic");
        }
        return null;
    }

    public final String S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a6b086", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        if (jSONObject != null) {
            return jSONObject.getString("loftActivityAtmospherePicUrl");
        }
        return null;
    }

    public final String d(String str) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
        }
        if (str != null && (uri = this.b) != null) {
            return uri.getQueryParameter(str);
        }
        return null;
    }

    public final String T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("db2c6b25", new Object[]{this}) : this.x;
    }

    public final String U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("61b225c4", new Object[]{this}) : this.w;
    }

    public final JSONObject V() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("986960fd", new Object[]{this}) : this.o;
    }

    public final JSONObject W() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ac11347e", new Object[]{this}) : this.n;
    }

    public final String p(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24b46fbf", new Object[]{this, str});
        }
        JSONObject jSONObject2 = this.n;
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("abJO")) != null) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public final JSONObject X() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("bfb907ff", new Object[]{this}) : this.f3821a;
    }

    public final Uri Y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("6d90b997", new Object[]{this}) : this.b;
    }

    public final boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("509c7e5", new Object[]{this})).booleanValue();
        }
        if (q.a((Object) as(), (Object) com.alibaba.triver.triver_shop.newShop.manager.e.XSD_SHOP)) {
            return true;
        }
        JSONObject jSONObject = this.n;
        if (jSONObject == null || this.q == null) {
            return false;
        }
        Boolean bool = null;
        Boolean valueOf = jSONObject == null ? null : Boolean.valueOf(jSONObject.isEmpty());
        if (valueOf == null) {
            return false;
        }
        valueOf.booleanValue();
        JSONArray jSONArray = this.q;
        if (jSONArray != null) {
            bool = Boolean.valueOf(jSONArray.isEmpty());
        }
        if (bool == null) {
            return false;
        }
        bool.booleanValue();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02b5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.fastjson.JSONArray e(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.data.d.e(java.lang.String):com.alibaba.fastjson.JSONArray");
    }

    public final JSONObject aa() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("50eccfc7", new Object[]{this}) : this.f3821a;
    }

    public final JSONObject ab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("6494a348", new Object[]{this}) : this.r;
    }

    /* loaded from: classes3.dex */
    public static final class e implements BridgeCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<String> f3826a;

        @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback
        public void sendBridgeResponse(BridgeResponse bridgeResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa9dfe87", new Object[]{this, bridgeResponse});
            }
        }

        @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback
        public void sendJSONResponse(JSONObject jSONObject, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56830cbc", new Object[]{this, jSONObject, new Boolean(z)});
            }
        }

        public e(Ref.ObjectRef<String> objectRef) {
            this.f3826a = objectRef;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
        @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback
        public void sendJSONResponse(JSONObject jSONObject) {
            JSONObject jSONObject2;
            ?? string;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3456c918", new Object[]{this, jSONObject});
            } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("param")) == null || (string = jSONObject2.getString("downgradeLevel")) == 0) {
            } else {
                this.f3826a.element = string;
            }
        }
    }

    private final String bf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7903535", new Object[]{this});
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "0";
        new AliHADowngradeSDKExtension().getDowngradeInfo("tblivecard", false, new e(objectRef));
        return (String) objectRef.element;
    }

    public final boolean ac() {
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[]{this})).booleanValue();
        }
        if (l.b()) {
            ceg.Companion.b("low devices , disable big card");
            return false;
        }
        Uri uri = this.b;
        if ((uri == null || (queryParameterNames = uri.getQueryParameterNames()) == null || !queryParameterNames.contains("shopLoftVideoId")) ? false : true) {
            return true;
        }
        if (!bg()) {
            return false;
        }
        return ad();
    }

    public final boolean ad() {
        JSONObject b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab1cc72e", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.u;
        if (jSONObject == null || !bg()) {
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        Object obj = jSONObject.get("lofts");
        if (!(obj instanceof JSONArray)) {
            obj = jSONArray;
        }
        JSONArray jSONArray2 = (JSONArray) obj;
        return (jSONArray2.size() == 0 || (b2 = com.alibaba.triver.triver_shop.newShop.ext.d.b(jSONArray2, 0)) == null || !q.a((Object) b2.getString("loftSize"), (Object) "open")) ? false : true;
    }

    public final boolean ae() {
        JSONObject b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab2adeaf", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.u;
        if (jSONObject == null || !bg()) {
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        Object obj = jSONObject.get("lofts");
        if (!(obj instanceof JSONArray)) {
            obj = jSONArray;
        }
        JSONArray jSONArray2 = (JSONArray) obj;
        return (jSONArray2.size() == 0 || (b2 = com.alibaba.triver.triver_shop.newShop.ext.d.b(jSONArray2, 0)) == null || !q.a((Object) b2.getString("loftType"), (Object) "live")) ? false : true;
    }

    public final boolean bw() {
        JSONObject b2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("addd5e60", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject2 = this.u;
        if (jSONObject2 == null) {
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        Object obj = jSONObject2.get("lofts");
        if (!(obj instanceof JSONArray)) {
            obj = jSONArray;
        }
        JSONArray jSONArray2 = (JSONArray) obj;
        return (jSONArray2.size() == 0 || (b2 = com.alibaba.triver.triver_shop.newShop.ext.d.b(jSONArray2, 0)) == null || (jSONObject = b2.getJSONObject("extraInfo")) == null || !q.a((Object) jSONObject.getString("useNewLiveData"), (Object) "true")) ? false : true;
    }

    public final boolean bq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad88d15a", new Object[]{this})).booleanValue();
        }
        if (!this.an) {
            return this.ak.b();
        }
        JSONObject jSONObject = this.n;
        String string = jSONObject == null ? null : jSONObject.getString("isLivingStatus");
        if (string != null) {
            return q.a((Object) string, (Object) "true");
        }
        return this.ak.b();
    }

    public final boolean bj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad262cd3", new Object[]{this})).booleanValue();
        }
        Uri uri = this.b;
        return q.a((Object) (uri == null ? null : uri.getQueryParameter("source")), (Object) "taolive");
    }

    public final JSONObject af() {
        JSONObject b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b333f14c", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject ab = ab();
        if (ab == null) {
            ab = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "loftInfo", (String) ab);
        if (bg()) {
            jSONObject2.put((JSONObject) "loftInfo", (String) this.u);
            JSONObject jSONObject3 = this.u;
            q.a(jSONObject3);
            JSONObject jSONObject4 = jSONObject3;
            JSONObject jSONObject5 = this.u;
            if (jSONObject5 == null) {
                b2 = null;
            } else {
                JSONArray jSONArray = new JSONArray();
                Object obj = jSONObject5.get("lofts");
                if (!(obj instanceof JSONArray)) {
                    obj = jSONArray;
                }
                b2 = com.alibaba.triver.triver_shop.newShop.ext.d.b((JSONArray) obj, 0);
            }
            jSONObject4.put((JSONObject) "firstLoft", (String) b2);
        }
        return jSONObject;
    }

    public final boolean ag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab470db1", new Object[]{this})).booleanValue() : bg();
    }

    private final boolean bg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acfbe650", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.u;
        if (jSONObject == null) {
            return false;
        }
        return q.a((Object) "true", (Object) jSONObject.getString("new"));
    }

    public final String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = this.u;
        String str = null;
        if (jSONObject2 == null) {
            return null;
        }
        JSONObject jSONObject3 = this.n;
        String string = jSONObject3 == null ? null : jSONObject3.getString("shopName");
        JSONArray jSONArray = new JSONArray();
        Object obj = jSONObject2.get("lofts");
        if (!(obj instanceof JSONArray)) {
            obj = jSONArray;
        }
        JSONObject b2 = com.alibaba.triver.triver_shop.newShop.ext.d.b((JSONArray) obj, 0);
        JSONObject jSONObject4 = b2 == null ? null : b2.getJSONObject("loftData");
        String string2 = jSONObject4 == null ? null : jSONObject4.getString("id");
        if (jSONObject4 != null) {
            str = jSONObject4.getString("sceneId");
        }
        Uri.Builder buildUpon = Uri.parse(ShopLoftActivity.KEY_SHARE_URL_BASE).buildUpon();
        buildUpon.appendQueryParameter("seller_id", this.w);
        buildUpon.appendQueryParameter("shop_id", this.x);
        buildUpon.appendQueryParameter("first_media_scene", str);
        buildUpon.appendQueryParameter("first_media_id", string2);
        buildUpon.appendQueryParameter("title", string);
        buildUpon.appendQueryParameter("source", "shop");
        buildUpon.appendQueryParameter("spm", InshopResultActivity.ALL_ITEM_SPM);
        if (jSONObject != null) {
            buildUpon.appendQueryParameter(AgooConstants.MESSAGE_EXT, jSONObject.toJSONString());
        }
        if (jSONObject4 != null) {
            buildUpon.appendQueryParameter("loftData", jSONObject4.toJSONString());
        }
        return buildUpon.build().toString();
    }

    public final boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof String)) {
            return false;
        }
        return n.b((String) obj, ShopLoftActivity.KEY_SHARE_URL_BASE, false, 2, (Object) null);
    }

    private final JSONObject bh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3bd634ed", new Object[]{this});
        }
        JSONObject V = V();
        if (V != null) {
            return V.getJSONObject("endorseModuleVO");
        }
        return null;
    }

    public final boolean f(String str) {
        JSONObject bh;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{this, str})).booleanValue();
        }
        if (str == null || (bh = bh()) == null) {
            return false;
        }
        for (Map.Entry<String, Object> entry : bh.entrySet()) {
            Object value = entry.getValue();
            if ((value instanceof JSONObject) && q.a((Object) str, (Object) ((JSONObject) value).getString("jumpUrl"))) {
                return true;
            }
        }
        return false;
    }

    public final boolean ah() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab552532", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject2 = this.o;
        String str = null;
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("relation")) != null) {
            str = jSONObject.getString("newRelationStyle");
        }
        return q.a((Object) "true", (Object) str);
    }

    public final boolean ai() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject2 = this.o;
        String str = null;
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("relation")) != null) {
            str = jSONObject.getString("showSubscriptionPopup");
        }
        return q.a((Object) "true", (Object) str);
    }

    public final String aj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87758670", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        if (jSONObject != null) {
            return jSONObject.getString("shopName");
        }
        return null;
    }

    public final boolean ak() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab7f6bb5", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.o;
        String str = null;
        JSONObject jSONObject2 = jSONObject == null ? null : jSONObject.getJSONObject("relation");
        if (jSONObject2 == null) {
            JSONObject jSONObject3 = this.n;
            jSONObject2 = jSONObject3 == null ? null : jSONObject3.getJSONObject("relation");
        }
        if (jSONObject2 != null) {
            str = jSONObject2.getString("follow");
        }
        return q.a((Object) str, (Object) "true");
    }

    public final String al() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9480fbae", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        if (jSONObject != null) {
            return jSONObject.getString("shopLogo");
        }
        return null;
    }

    public final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        q.d(context, "context");
        this.c = context;
    }

    public final Context am() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("a6bfd0ab", new Object[]{this}) : this.c;
    }

    public final boolean an() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aba9b238", new Object[]{this})).booleanValue() : q.a((Object) "tmallCar", (Object) as());
    }

    public final boolean ao() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abb7c9b9", new Object[]{this})).booleanValue() : q.a((Object) com.alibaba.triver.triver_shop.newShop.manager.e.VIDEO_SHOP, (Object) as());
    }

    public final boolean ap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abc5e13a", new Object[]{this})).booleanValue() : q.a((Object) com.alibaba.triver.triver_shop.newShop.manager.e.VIDEO_SHOP_2, (Object) as());
    }

    public final boolean aq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abd3f8bb", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.o;
        return q.a((Object) "false", (Object) (jSONObject == null ? null : jSONObject.getString("shopSignFoldable")));
    }

    public final String ar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bba35b68", new Object[]{this});
        }
        JSONObject jSONObject = this.o;
        if (jSONObject != null) {
            return jSONObject.getString("videoShopBackgroundPicUrl");
        }
        return null;
    }

    public final String as() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42291607", new Object[]{this});
        }
        JSONObject jSONObject = this.o;
        String string = jSONObject == null ? null : jSONObject.getString("industryShop");
        if (string != null) {
            return string;
        }
        JSONObject jSONObject2 = this.n;
        String string2 = jSONObject2 == null ? null : jSONObject2.getString("industryShop");
        if (string2 != null) {
            return string2;
        }
        Uri uri = this.b;
        if (uri != null) {
            return uri.getQueryParameter("industryShop");
        }
        return null;
    }

    public final boolean bu() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adc12f5e", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.n;
        if (jSONObject != null && (bool = jSONObject.getBoolean("isNewFarmer")) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean bx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adeb75e1", new Object[]{this})).booleanValue();
        }
        String as = as();
        if (as != null) {
            return as.equals("farmshop_z");
        }
        return false;
    }

    public final int at() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abfe3f2d", new Object[]{this})).intValue();
        }
        ShopView.c cVar = this.D;
        if (cVar != null) {
            return cVar.a();
        }
        return 0;
    }

    public final int au() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac0c56ae", new Object[]{this})).intValue();
        }
        ShopView.c cVar = this.D;
        if (cVar != null) {
            return cVar.b();
        }
        return 0;
    }

    public final boolean av() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac1a6e40", new Object[]{this})).booleanValue();
        }
        Uri uri = this.b;
        return q.a((Object) (uri == null ? null : uri.getQueryParameter("shopHeaderNeedScrollMask")), (Object) "true");
    }

    public final String aw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c400083", new Object[]{this});
        }
        JSONObject jSONObject = this.p;
        if (jSONObject != null) {
            return jSONObject.getString("searchUrl");
        }
        return null;
    }

    public final JSONObject ax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1500d05e", new Object[]{this});
        }
        JSONObject jSONObject = this.u;
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Object obj = jSONObject.get("lofts");
        if (!(obj instanceof JSONArray)) {
            obj = jSONArray;
        }
        JSONObject b2 = com.alibaba.triver.triver_shop.newShop.ext.d.b((JSONArray) obj, 0);
        if (b2 != null) {
            return b2.getJSONObject("loftData");
        }
        return null;
    }

    public final JSONObject ay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("28a8a3df", new Object[]{this});
        }
        JSONObject jSONObject = this.o;
        if (jSONObject != null) {
            return jSONObject.getJSONObject("offService");
        }
        return null;
    }

    public final JSONObject bn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b1c529f3", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        if (jSONObject != null) {
            return jSONObject.getJSONObject("offService");
        }
        return null;
    }

    public final boolean bo() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad6ca258", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.n;
        if (jSONObject != null && (bool = jSONObject.getBoolean("appleCustomOffService")) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean bp() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad7ab9d9", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.o;
        if (jSONObject != null && (bool = jSONObject.getBoolean("appleShopSignCustomStyle")) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean az() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac52cc44", new Object[]{this})).booleanValue() : q.a((Object) "redDot", (Object) this.G);
    }

    public final boolean aA() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a92f908b", new Object[]{this})).booleanValue() : q.a((Object) "floatBar", (Object) this.G);
    }

    public final boolean aB() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a93da80c", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.o;
        return q.a((Object) "true", (Object) (jSONObject == null ? null : jSONObject.getString("changeSubscribe2Follow")));
    }

    public final boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{this, str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        JSONObject jSONObject = this.n;
        return q.a((Object) (jSONObject == null ? null : jSONObject.getString("wangWangLink")), (Object) str);
    }

    public final String c() {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        return (jSONObject == null || (string = jSONObject.getString("wangWangLink")) == null) ? "" : string;
    }

    public final String aC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9161837", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        if (jSONObject != null) {
            return jSONObject.getString("frameActivityAtmospherePicUrl");
        }
        return null;
    }

    public final boolean aD() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a959d70e", new Object[]{this})).booleanValue();
        }
        String aC = aC();
        if (aC == null) {
            return false;
        }
        return aC.length() > 0;
    }

    public final void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else if (str == null || obj == null) {
        } else {
            this.B.put(str, obj);
        }
    }

    public final Object h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("79020b59", new Object[]{this, str});
        }
        if (str != null) {
            return this.B.get(str);
        }
        return null;
    }

    public final JSONObject i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("be7a595a", new Object[]{this, str});
        }
        Object h2 = h(str);
        if (h2 == null) {
            return null;
        }
        if (h2 instanceof JSONObject) {
            return (JSONObject) h2;
        }
        if (h2 instanceof String) {
            return com.alibaba.triver.triver_shop.newShop.ext.d.a((String) h2);
        }
        return null;
    }

    public final Object j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("273ded17", new Object[]{this, str});
        }
        if (str != null) {
            return this.B.remove(str);
        }
        return null;
    }

    public final void b(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1467911", new Object[]{this, jSONArray});
        } else if (jSONArray != null) {
            for (Object obj : jSONArray) {
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    String name = jSONObject.getString("name");
                    Object obj2 = jSONObject.get("time");
                    q.b(name, "name");
                    b(name, obj2);
                }
            }
        }
    }

    public final void k(String stage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{this, stage});
            return;
        }
        q.d(stage, "stage");
        try {
            Result.a aVar = Result.Companion;
            long currentTimeMillis = System.currentTimeMillis();
            l().put((JSONObject) stage, (String) Long.valueOf(currentTimeMillis));
            a(this, stage, Long.valueOf(currentTimeMillis), false, 4, null);
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
    }

    public final void b(String stage, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18567e8f", new Object[]{this, stage, obj});
            return;
        }
        q.d(stage, "stage");
        try {
            Result.a aVar = Result.Companion;
            l().put((JSONObject) stage, (String) obj);
            a(this, stage, obj, false, 4, null);
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
    }

    public final void c(String stage, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f6a990", new Object[]{this, stage, obj});
            return;
        }
        q.d(stage, "stage");
        try {
            Result.a aVar = Result.Companion;
            if (!l().containsKey(stage)) {
                l().put((JSONObject) stage, (String) obj);
            }
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
    }

    public static /* synthetic */ void a(d dVar, String str, Object obj, boolean z, int i2, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9de4cea", new Object[]{dVar, str, obj, new Boolean(z), new Integer(i2), obj2});
            return;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        dVar.a(str, obj, z);
    }

    public final void a(String stage, Object obj, boolean z) {
        String obj2;
        Intent intent;
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb14d106", new Object[]{this, stage, obj, new Boolean(z)});
            return;
        }
        q.d(stage, "stage");
        String str = null;
        if ((!n.c(stage, com.alibaba.triver.triver_shop.newShop.ext.g.KEY_APP_END, false, 2, (Object) null) || this.K.containsKey(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SHOP_NAVI_END)) && !z) {
            return;
        }
        this.K.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SHOP_NAVI_END, (String) obj);
        Long valueOf = obj instanceof Long ? Long.valueOf(((Long) obj).longValue()) : (obj == null || (obj2 = obj.toString()) == null) ? null : n.e(obj2);
        if (valueOf != null) {
            try {
                Result.a aVar = Result.Companion;
                com.alibaba.triver.triver_shop.newShop.ext.h.d(this);
                s sVar = s.f18233a;
                Context context = this.c;
                if (context != null) {
                    sVar.b((Activity) context).a(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_RENDER_FINISH_TIME, com.alibaba.triver.triver_shop.newShop.ext.b.a(valueOf.longValue()));
                    Result.m2371constructorimpl(s.f18233a.d().a(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_RENDER_FINISH_TIME, com.alibaba.triver.triver_shop.newShop.ext.b.a(valueOf.longValue())));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                }
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                Result.m2371constructorimpl(kotlin.i.a(th));
            }
        }
        Context context2 = this.c;
        if (context2 == null) {
            return;
        }
        if ((context2 instanceof Activity) && (intent = ((Activity) context2).getIntent()) != null && (data = intent.getData()) != null) {
            str = data.toString();
        }
        com.alibaba.triver.triver_shop.newShop.ext.h.a(context2, str, this);
    }

    public final int i(int i2) {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5c85886", new Object[]{this, new Integer(i2)})).intValue();
        }
        JSONArray jSONArray = this.v;
        if (jSONArray != null && (size = jSONArray.size()) > 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = i3 + 1;
                Object obj = jSONArray.get(i3);
                if (obj instanceof JSONArray) {
                    i4 += ((JSONArray) obj).size();
                    if (i4 - 1 >= i2) {
                        return i3;
                    }
                }
                if (i5 >= size) {
                    break;
                }
                i3 = i5;
            }
        }
        return 0;
    }

    public final int f(int i2, int i3) {
        int i4;
        IpChange ipChange = $ipChange;
        int i5 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64907b00", new Object[]{this, new Integer(i2), new Integer(i3)})).intValue();
        }
        JSONArray jSONArray = this.v;
        if (jSONArray == null) {
            return 0;
        }
        int size = jSONArray.size();
        if (size > 0) {
            i4 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (i5 == i2) {
                    break;
                }
                Object obj = jSONArray.get(i5);
                if (obj instanceof JSONArray) {
                    i4 += ((JSONArray) obj).size();
                }
                if (i6 >= size) {
                    break;
                }
                i5 = i6;
            }
        } else {
            i4 = 0;
        }
        return i4 + i3;
    }

    public final int j(int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        int i4 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b77d3125", new Object[]{this, new Integer(i2)})).intValue();
        }
        JSONArray jSONArray = this.v;
        if (jSONArray == null) {
            return 0;
        }
        int size = jSONArray.size();
        if (size > 0) {
            i3 = 0;
            while (true) {
                int i5 = i4 + 1;
                Object obj = jSONArray.get(i4);
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if ((jSONArray2.size() + i3) - 1 >= i2) {
                        break;
                    }
                    i3 += jSONArray2.size();
                }
                if (i5 >= size) {
                    break;
                }
                i4 = i5;
            }
        } else {
            i3 = 0;
        }
        return i2 - i3;
    }

    public final JSONArray k(int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("62b0164d", new Object[]{this, new Integer(i2)}) : com.alibaba.triver.triver_shop.newShop.ext.d.c(I(), i2);
    }

    public final JSONArray aE() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("97cc1a53", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<Object> it = I().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONArray) {
                jSONArray.addAll((Collection) next);
            }
        }
        return jSONArray;
    }

    public final JSONObject l(String str) {
        JSONArray jSONArray;
        int size;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3a77591d", new Object[]{this, str});
        }
        if (str != null && (jSONArray = this.T) != null && (size = jSONArray.size()) > 0) {
            while (true) {
                int i3 = i2 + 1;
                Object obj = jSONArray.get(i2);
                if ((obj instanceof HashMap) && q.a((Object) str, ((Map) obj).get("templateName"))) {
                    return com.alibaba.triver.triver_shop.newShop.ext.h.b(new JSONObject((HashMap) obj));
                }
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (q.a((Object) str, jSONObject.get("templateName"))) {
                        return com.alibaba.triver.triver_shop.newShop.ext.h.b(jSONObject);
                    }
                }
                if (i3 >= size) {
                    break;
                }
                i2 = i3;
            }
        }
        return null;
    }

    public final Pair<Integer, Integer> aF() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c74474f5", new Object[]{this});
        }
        Pair<Integer, Integer> pair = new Pair<>(0, 0);
        if (aG()) {
            ceg.Companion.b("directly jump to tab3");
            return pair;
        }
        String str = this.M;
        String str2 = this.N;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        String str4 = this.O;
        if (str4 != null) {
            str3 = str4;
        }
        if (bd() == null) {
            return pair;
        }
        if (str != null) {
            if (str.length() == 0) {
                z = true;
            }
        }
        if (z) {
            str = this.O;
        }
        if (!TextUtils.isEmpty(str)) {
            q.a((Object) str);
            return com.alibaba.triver.triver_shop.newShop.ext.h.a(str, I());
        }
        return com.alibaba.triver.triver_shop.newShop.ext.h.a(str2, str3, this);
    }

    public final boolean aG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9841d91", new Object[]{this})).booleanValue();
        }
        if (aU() == null) {
            return false;
        }
        return q.a((Object) "industrybar3bar", (Object) this.N) || q.a((Object) "industrybar3", (Object) this.M) || q.a((Object) "industrybar3", (Object) this.O);
    }

    public final boolean aH() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9923512", new Object[]{this})).booleanValue() : q.a((Object) as(), (Object) com.alibaba.triver.triver_shop.newShop.manager.e.FLAG_SHIP_SHOP);
    }

    public final boolean aI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9a04c93", new Object[]{this})).booleanValue() : q.a((Object) as(), (Object) com.alibaba.triver.triver_shop.newShop.manager.e.FLAG_SHIP_SHOP_V2);
    }

    public final boolean aJ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9ae6414", new Object[]{this})).booleanValue() : q.a((Object) as(), (Object) com.alibaba.triver.triver_shop.newShop.manager.e.VIDEO_SHOP_2);
    }

    public final String aK() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d43ed2f", new Object[]{this});
        }
        JSONObject jSONObject = this.o;
        if (jSONObject != null) {
            return jSONObject.getString("brandFlagshipShopBackgroundPicUrl");
        }
        return null;
    }

    public final String aL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3c9a7ce", new Object[]{this});
        }
        JSONObject jSONObject = this.o;
        if (jSONObject != null) {
            return jSONObject.getString("brandFlagshipShopBackgroundPicJumpUrl");
        }
        return null;
    }

    public final String aM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a4f626d", new Object[]{this});
        }
        JSONObject jSONObject = this.o;
        String string = jSONObject == null ? null : jSONObject.getString("headerCardBackgroundVideoUrl");
        if (string != null) {
            return string;
        }
        JSONObject jSONObject2 = this.o;
        if (jSONObject2 != null) {
            return jSONObject2.getString("brandFlagshipShopBackgroundVideoUrl");
        }
        return null;
    }

    public final String aN() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0d51d0c", new Object[]{this});
        }
        JSONObject jSONObject = this.o;
        String string = jSONObject == null ? null : jSONObject.getString("headerCardBackgroundVideoJumpUrl");
        if (string != null) {
            return string;
        }
        JSONObject jSONObject2 = this.o;
        if (jSONObject2 != null) {
            return jSONObject2.getString("brandFlagshipShopBackgroundVideoJumpUrl");
        }
        return null;
    }

    public final String aO() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("575ad7ab", new Object[]{this});
        }
        JSONObject jSONObject = this.o;
        if (jSONObject != null) {
            return jSONObject.getString("singleModuleRenderUrl");
        }
        return null;
    }

    public final String aP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dde0924a", new Object[]{this});
        }
        JSONObject jSONObject = this.o;
        if (jSONObject != null) {
            return jSONObject.getString("videoShopBackgroundPicJumpUrl");
        }
        return null;
    }

    public final String aQ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("64664ce9", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        if (jSONObject != null) {
            return jSONObject.getString("introUrl");
        }
        return null;
    }

    public final String aR() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eaec0788", new Object[]{this});
        }
        JSONObject jSONObject = this.o;
        if (jSONObject != null) {
            return jSONObject.getString("shopSignType");
        }
        return null;
    }

    public final JSONObject aS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3dbf3eb9", new Object[]{this});
        }
        JSONObject jSONObject = this.o;
        if (jSONObject != null) {
            return jSONObject.getJSONObject("shopCarouselCardVO");
        }
        return null;
    }

    public final JSONArray aT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("678067e4", new Object[]{this});
        }
        JSONObject aS = aS();
        if (aS != null) {
            return aS.getJSONArray("carouselFrameList");
        }
        return null;
    }

    public final JSONObject aU() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("650ee5bb", new Object[]{this});
        }
        JSONObject jSONObject2 = this.o;
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("nativeModuleRenderInfo")) != null) {
            return jSONObject.getJSONObject("industryBar3");
        }
        return null;
    }

    public final boolean aV() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa577e20", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.o;
        return q.a((Object) "true", (Object) (jSONObject == null ? null : jSONObject.getString("onlyOneLevelBar")));
    }

    public final boolean aW() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa6595a1", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.o;
        Object obj = jSONObject == null ? null : jSONObject.get("shopSignContentList");
        return (obj instanceof JSONArray) && ((JSONArray) obj).size() != 0;
    }

    public final int aX() {
        JSONArray c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa73ad11", new Object[]{this})).intValue();
        }
        JSONArray jSONArray = this.v;
        if (jSONArray != null && (c2 = com.alibaba.triver.triver_shop.newShop.ext.d.c(jSONArray, 0)) != null) {
            return c2.size();
        }
        return 0;
    }

    public final boolean aZ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa8fdc24", new Object[]{this})).booleanValue();
        }
        JSONObject W = W();
        return !q.a((Object) (W == null ? null : W.getString("closeClientAccsReport")), (Object) "true");
    }

    public final boolean m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6df97b42", new Object[]{this, str})).booleanValue();
        }
        if (str == null || !this.A.containsKey(str)) {
            return true;
        }
        b bVar = this.A.get(str);
        q.a(bVar);
        a.InterfaceC0159a a2 = bVar.a();
        if (a2 != null) {
            return a2.a();
        }
        return true;
    }

    public final com.alibaba.triver.triver_shop.web.a n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.triver.triver_shop.web.a) ipChange.ipc$dispatch("5749d628", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        b bVar = new b(this);
        bVar.a(str);
        this.A.put(str, bVar);
        return this.A.get(str);
    }

    /* loaded from: classes3.dex */
    public final class b implements com.alibaba.triver.triver_shop.web.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f3823a;
        private a.InterfaceC0159a b;
        private boolean c;
        private String d;

        static {
            kge.a(588482857);
            kge.a(2101725738);
        }

        public b(d this$0) {
            q.d(this$0, "this$0");
            this.f3823a = this$0;
            this.d = "";
        }

        public final a.InterfaceC0159a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a.InterfaceC0159a) ipChange.ipc$dispatch("5ee7a5c2", new Object[]{this}) : this.b;
        }

        public final void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            q.d(str, "<set-?>");
            this.d = str;
        }

        @Override // com.alibaba.triver.triver_shop.web.a
        public void a(a.InterfaceC0159a interfaceC0159a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7798627c", new Object[]{this, interfaceC0159a});
            } else {
                this.b = interfaceC0159a;
            }
        }

        @Override // com.alibaba.triver.triver_shop.web.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            rul<String, t> j = this.f3823a.G().j();
            if (j == null) {
                return;
            }
            j.mo2421invoke(this.d);
        }

        @Override // com.alibaba.triver.triver_shop.web.a
        public boolean c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
        }

        @Override // com.alibaba.triver.triver_shop.web.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.c = z;
            }
        }
    }

    public final String ba() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16f3901a", new Object[]{this});
        }
        JSONObject jSONObject = this.n;
        if (jSONObject != null) {
            return jSONObject.getString("identityCode");
        }
        return null;
    }

    public final a bb() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b6c2923b", new Object[]{this}) : this.aj;
    }

    /* loaded from: classes3.dex */
    public final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f3822a;
        private rul<? super Boolean, t> b;
        private rul<? super Boolean, t> c;
        private rul<? super Boolean, t> d;
        private rul<? super Boolean, t> e;
        private rul<? super Boolean, t> f;
        private ruk<t> g;

        static {
            kge.a(227131173);
        }

        public a(d this$0) {
            q.d(this$0, "this$0");
            this.f3822a = this$0;
        }

        public final rul<Boolean, t> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("f0a3bb5", new Object[]{this}) : this.b;
        }

        public final void a(rul<? super Boolean, t> rulVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fdc03baf", new Object[]{this, rulVar});
            } else {
                this.b = rulVar;
            }
        }

        public final rul<Boolean, t> b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("16bbe114", new Object[]{this}) : this.c;
        }

        public final void b(rul<? super Boolean, t> rulVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec434230", new Object[]{this, rulVar});
            } else {
                this.c = rulVar;
            }
        }

        public final rul<Boolean, t> c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("1e6d8673", new Object[]{this}) : this.d;
        }

        public final void c(rul<? super Boolean, t> rulVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dac648b1", new Object[]{this, rulVar});
            } else {
                this.d = rulVar;
            }
        }

        public final rul<Boolean, t> d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("261f2bd2", new Object[]{this}) : this.e;
        }

        public final void d(rul<? super Boolean, t> rulVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9494f32", new Object[]{this, rulVar});
            } else {
                this.e = rulVar;
            }
        }

        public final rul<Boolean, t> e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("2dd0d131", new Object[]{this}) : this.f;
        }

        public final void e(rul<? super Boolean, t> rulVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7cc55b3", new Object[]{this, rulVar});
            } else {
                this.f = rulVar;
            }
        }

        public final void a(ruk<t> rukVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fdbfc750", new Object[]{this, rukVar});
            } else {
                this.g = rukVar;
            }
        }

        public final ruk<t> f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("35827671", new Object[]{this}) : this.g;
        }
    }

    public final c bc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("43fd43fa", new Object[]{this}) : this.ak;
    }

    /* loaded from: classes3.dex */
    public final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f3824a;
        private int b;
        private int c;

        static {
            kge.a(1422729984);
        }

        public c(d this$0) {
            q.d(this$0, "this$0");
            this.f3824a = this$0;
            this.b = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 96);
        }

        public final void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        public final int l() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : this.c;
        }

        public final int i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.b;
        }

        public final com.alibaba.triver.triver_shop.shop2023.data.c a() {
            String string;
            Integer d;
            String string2;
            Integer d2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.alibaba.triver.triver_shop.shop2023.data.c) ipChange.ipc$dispatch("bf9286d", new Object[]{this});
            }
            JSONObject e = e();
            Integer num = null;
            Integer valueOf = (e == null || (string = e.getString("blockHeight")) == null || (d = n.d(string)) == null) ? null : Integer.valueOf(com.alibaba.triver.triver_shop.newShop.ext.o.c(d));
            int b = valueOf == null ? this.f3824a.bw() ? (int) (com.alibaba.triver.triver_shop.newShop.ext.o.b() * 0.75d) : com.alibaba.triver.triver_shop.newShop.ext.o.c(Integer.valueOf((int) x0.k)) : valueOf.intValue();
            JSONObject e2 = e();
            if (e2 != null && (string2 = e2.getString("coveredHeight")) != null && (d2 = n.d(string2)) != null) {
                num = Integer.valueOf(com.alibaba.triver.triver_shop.newShop.ext.o.c(d2));
            }
            return new com.alibaba.triver.triver_shop.shop2023.data.c(b, num == null ? com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 262) : num.intValue());
        }

        public final float p() {
            String string;
            Float b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("63fcce7", new Object[]{this})).floatValue();
            }
            JSONObject e = e();
            if (e != null && (string = e.getString("blockHeightPercent")) != null && (b = n.b(string)) != null) {
                return b.floatValue();
            }
            return 0.8f;
        }

        public final boolean k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
            }
            JSONObject b = d.b(this.f3824a);
            return q.a((Object) (b == null ? null : b.getString("showMiniLiveWindow")), (Object) "true");
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            JSONObject e = e();
            if (e != null && q.a((Object) e.getString("blockType"), (Object) "live") && e.getJSONObject("data") != null) {
                return true;
            }
            return this.f3824a.bw() && this.f3824a.ae();
        }

        public final boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
            }
            JSONObject e = e();
            return (e == null || e.getString("blockType") == null || e.getJSONObject("data") == null) ? false : true;
        }

        public final boolean m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
            }
            JSONObject e = e();
            if (e != null) {
                String string = e.getString("blockType");
                if (q.a((Object) string, (Object) "live") || q.a((Object) string, (Object) "video")) {
                    return true;
                }
            }
            return false;
        }

        public final String c() {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
            }
            JSONObject e = e();
            if (e != null && (jSONObject = e.getJSONObject("data")) != null && (jSONObject2 = jSONObject.getJSONObject("queryParam")) != null) {
                return jSONObject2.getString("feedId");
            }
            return null;
        }

        public final JSONObject n() {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("70253515", new Object[]{this});
            }
            JSONObject V = this.f3824a.V();
            if (V != null && (jSONObject = V.getJSONObject("shopDynamicBlockData")) != null) {
                return jSONObject.getJSONObject("data");
            }
            return null;
        }

        public final JSONObject e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this});
            }
            JSONObject V = this.f3824a.V();
            if (V != null) {
                return V.getJSONObject("shopDynamicBlockData");
            }
            return null;
        }

        public final ShopComponentModel f() {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShopComponentModel) ipChange.ipc$dispatch("5f3d9d89", new Object[]{this});
            }
            JSONObject jSONObject2 = null;
            if (this.f3824a.bw() && this.f3824a.ae()) {
                JSONObject ax = this.f3824a.ax();
                if (ax != null) {
                    jSONObject2 = ax.getJSONObject("liveWidgetVO");
                }
                return b(jSONObject2);
            }
            JSONObject V = this.f3824a.V();
            if (V != null && (jSONObject = V.getJSONObject("shopDynamicBlockData")) != null) {
                jSONObject2 = jSONObject.getJSONObject("liveWidgetVO");
            }
            return b(jSONObject2);
        }

        public final ShopComponentModel o() {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShopComponentModel) ipChange.ipc$dispatch("db1ba912", new Object[]{this});
            }
            JSONObject V = this.f3824a.V();
            JSONObject jSONObject2 = null;
            if (V != null && (jSONObject = V.getJSONObject("shopDynamicBlockData")) != null) {
                jSONObject2 = jSONObject.getJSONObject("videoWidgetVO");
            }
            return b(jSONObject2);
        }

        public final Map<String, ShopComponentModel> g() {
            JSONObject jSONObject;
            ShopComponentModel b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this});
            }
            JSONObject V = this.f3824a.V();
            JSONArray jSONArray = V == null ? null : V.getJSONArray("headerWidgetList");
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(jSONArray);
            JSONArray r = this.f3824a.r();
            if (r != null) {
                arrayList.addAll(r);
            }
            HashMap hashMap = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    jSONObject = (JSONObject) next;
                } else if (next instanceof HashMap) {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry entry : ((Map) next).entrySet()) {
                        if (entry.getKey() instanceof String) {
                            JSONObject jSONObject3 = jSONObject2;
                            Object key = entry.getKey();
                            if (key == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            jSONObject3.put((JSONObject) ((String) key), (String) entry.getValue());
                        }
                    }
                    jSONObject = jSONObject2;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null && (b = b(jSONObject)) != null) {
                    String name = b.getName();
                    q.a((Object) name);
                    hashMap.put(name, b);
                }
            }
            if (!hashMap.isEmpty()) {
                return hashMap;
            }
            return null;
        }

        private final ShopComponentModel b(JSONObject jSONObject) {
            String string;
            Integer d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShopComponentModel) ipChange.ipc$dispatch("49f583c3", new Object[]{this, jSONObject});
            }
            if (jSONObject == null || (string = jSONObject.getString("name")) == null) {
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("userTrackInfo");
            JSONObject jSONObject3 = jSONObject.getJSONObject("data");
            boolean a2 = q.a((Object) jSONObject.getString("sendMtop"), (Object) "true");
            JSONObject jSONObject4 = jSONObject.getJSONObject("mtopInfo");
            String string2 = jSONObject.getString("type");
            String string3 = jSONObject.getString("version");
            String string4 = jSONObject.getString("targetUrl");
            String string5 = jSONObject.getString("renderHeight");
            return new ShopComponentModel(jSONObject2, a2, jSONObject4, jSONObject3, string2, string, string4, string3, (string5 == null || (d = n.d(string5)) == null) ? 0 : d.intValue(), jSONObject.getString("renderTargetTab"), jSONObject.getJSONObject(AgooConstants.MESSAGE_EXT));
        }

        public final com.alibaba.triver.triver_shop.shop2023.data.b h() {
            String string;
            Integer d;
            String string2;
            Float b;
            String string3;
            Float b2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.alibaba.triver.triver_shop.shop2023.data.b) ipChange.ipc$dispatch("4ce560e7", new Object[]{this});
            }
            JSONObject V = this.f3824a.V();
            String str = null;
            String string4 = V == null ? null : V.getString("backgroundMainColor");
            JSONObject V2 = this.f3824a.V();
            if (V2 != null) {
                str = V2.getString(RVStartParams.KEY_BACKGROUND_IMAGE_URL);
            }
            String str2 = str;
            JSONObject V3 = this.f3824a.V();
            int intValue = (V3 == null || (string = V3.getString("backgroundImageHeight")) == null || (d = n.d(string)) == null) ? 0 : d.intValue();
            JSONObject V4 = this.f3824a.V();
            float floatValue = (V4 == null || (string2 = V4.getString("backgroundMaskTransparency")) == null || (b = n.b(string2)) == null) ? 0.5f : b.floatValue();
            JSONObject V5 = this.f3824a.V();
            return new com.alibaba.triver.triver_shop.shop2023.data.b(intValue, str2, string4, floatValue, (V5 == null || (string3 = V5.getString("backgroundMaskProportion")) == null || (b2 = n.b(string3)) == null) ? 0.66f : b2.floatValue());
        }

        public final JSONArray j() {
            JSONArray c;
            JSONArray c2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("f2581c2d", new Object[]{this});
            }
            JSONArray jSONArray = new JSONArray();
            d dVar = this.f3824a;
            JSONArray c3 = d.c(dVar);
            if (c3 != null && (c2 = com.alibaba.triver.triver_shop.newShop.ext.d.c(c3, 0)) != null) {
                jSONArray.addAll(c2);
            }
            JSONArray c4 = d.c(dVar);
            if (c4 != null && (c = com.alibaba.triver.triver_shop.newShop.ext.d.c(c4, 1)) != null) {
                jSONArray.addAll(c);
            }
            return jSONArray;
        }

        public final JSONArray q() {
            JSONArray c;
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("2012a6c6", new Object[]{this});
            }
            JSONArray jSONArray = new JSONArray();
            d dVar = this.f3824a;
            JSONArray c2 = d.c(dVar);
            int size = c2 == null ? 0 : c2.size();
            if (size > 0) {
                while (true) {
                    int i2 = i + 1;
                    JSONArray c3 = d.c(dVar);
                    if (c3 != null && (c = com.alibaba.triver.triver_shop.newShop.ext.d.c(c3, i)) != null) {
                        jSONArray.addAll(c);
                    }
                    if (i2 >= size) {
                        break;
                    }
                    i = i2;
                }
            }
            return jSONArray;
        }

        public final JSONObject a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
            }
            Pair[] pairArr = new Pair[3];
            pairArr[0] = j.a(com.taobao.android.detail.industry.scene.trwidget.b.DATA_FIELD_KEY, jSONObject);
            String str = null;
            pairArr[1] = j.a("asyncData", null);
            Pair[] pairArr2 = new Pair[3];
            pairArr2[0] = j.a("headerData", this.f3824a.V());
            pairArr2[1] = j.a("shopInfo", d.b(this.f3824a));
            JSONObject V = this.f3824a.V();
            if (V != null) {
                str = V.getString("renderStyle");
            }
            pairArr2[2] = j.a("renderStyle", str);
            pairArr[2] = j.a("nativeData", com.alibaba.triver.triver_shop.newShop.ext.d.a(pairArr2));
            return com.alibaba.triver.triver_shop.newShop.ext.d.a(pairArr);
        }
    }
}
