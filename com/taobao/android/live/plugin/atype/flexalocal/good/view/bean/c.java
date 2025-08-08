package com.taobao.android.live.plugin.atype.flexalocal.good.view.bean;

import android.arch.lifecycle.ViewModelStoreOwner;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemCategoriesResponseData;
import com.taobao.live.liveroom.good.model.GoodLiveInfo;
import com.taobao.taolive.sdk.goodlist.r;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.afs;
import tb.hiq;
import tb.hir;
import tb.his;
import tb.kas;
import tb.kge;
import tb.pmd;
import tb.pqj;
import tb.tpt;
import tb.tpu;

/* loaded from: classes6.dex */
public class c implements r {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean S;
    private String A;
    private String B;
    private com.taobao.android.live.plugin.atype.flexalocal.good.showcase.e C;
    private boolean D;
    private boolean E;
    private String F;
    public List<ItemIdentifier> G;
    private com.alibaba.android.ultron.vfw.instance.d H;
    @Deprecated
    public String I;
    public HashMap<String, HashMap<String, com.taobao.taolive.sdk.goodlist.a>> J;
    private String K;
    public final j L;
    private WeakReference<com.taobao.alilive.aliliveframework.frame.a> M;
    private com.taobao.taolive.sdk.core.g N;
    public ItemCategory O;
    public String P;
    public String Q;
    public LiveItemCategoriesResponseData R;
    private UltronInstanceViewModel T;
    public Handler U;
    private String V;
    private String W;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, com.taobao.taolive.sdk.goodlist.a> f13841a;
    public HashMap<String, com.taobao.taolive.sdk.goodlist.a> b;
    public final com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a c;
    @Deprecated
    public String d;
    public String e;
    public String f;
    private final Context g;
    @Deprecated
    private final String h;
    @Deprecated
    private final String i;
    private final String j;
    private boolean k;
    public final i l;
    private GoodsTopBannerBean m;
    private com.taobao.live.liveroom.good.model.f n;
    private boolean o;
    private boolean p;
    private boolean q;
    private TBLiveDataModel r;
    private boolean s;
    private boolean t;
    private VideoInfo u;
    private boolean v;
    private boolean w;
    private boolean x;
    private String y;
    private String z;

    static {
        kge.a(205498283);
        kge.a(-1635700568);
        S = false;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.E;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.E = z;
        }
    }

    public void a(ItemCategory itemCategory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c595d8d", new Object[]{this, itemCategory});
        } else if (itemCategory == null) {
        } else {
            this.O = itemCategory;
            this.d = itemCategory.categoryId;
            this.I = itemCategory.name;
        }
    }

    public com.taobao.taolive.sdk.goodlist.a a(ItemCategory itemCategory, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.sdk.goodlist.a) ipChange.ipc$dispatch("2a7fb6d", new Object[]{this, itemCategory, eVar});
        }
        if (eVar != null) {
            return a(itemCategory, eVar.f13845a, eVar.b, eVar.f);
        }
        return null;
    }

    public Handler K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("7f49234", new Object[]{this}) : this.U;
    }

    public com.taobao.taolive.sdk.goodlist.a a(ItemCategory itemCategory, int i, int i2, String str) {
        HashMap<String, com.taobao.taolive.sdk.goodlist.a> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.sdk.goodlist.a) ipChange.ipc$dispatch("86e16132", new Object[]{this, itemCategory, new Integer(i), new Integer(i2), str});
        }
        if (itemCategory == null || !itemCategory.isIndependentTab()) {
            if (i == 5 && (hashMap = this.b) != null && !hashMap.isEmpty()) {
                return this.b.get(str);
            }
            HashMap<String, com.taobao.taolive.sdk.goodlist.a> hashMap2 = this.f13841a;
            if (hashMap2 != null && hashMap2.containsKey(str)) {
                return this.f13841a.get(str);
            }
            return null;
        }
        HashMap<String, com.taobao.taolive.sdk.goodlist.a> hashMap3 = this.J.get(itemCategory.categoryId);
        if (hashMap3 != null) {
            return hashMap3.get(str);
        }
        his.b("GoodLiveContext", "getDxData | goodsIndex=" + i2 + "  itemId=" + str);
        return null;
    }

    public com.taobao.taolive.sdk.goodlist.a a(String str) {
        HashMap<String, com.taobao.taolive.sdk.goodlist.a> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.sdk.goodlist.a) ipChange.ipc$dispatch("fd62676d", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str) || (hashMap = this.f13841a) == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f13841a.get(str);
    }

    public void a(com.taobao.taolive.sdk.goodlist.a aVar, ItemCategory itemCategory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb67732", new Object[]{this, aVar, itemCategory});
        } else if (aVar == null) {
        } else {
            if (itemCategory.isIndependentTab()) {
                HashMap<String, com.taobao.taolive.sdk.goodlist.a> hashMap = this.J.get(itemCategory.categoryId);
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                    this.J.put(itemCategory.categoryId, hashMap);
                }
                hashMap.put(aVar.e, aVar);
            } else if (aVar.f21830a == 5) {
                this.b.put(aVar.e, aVar);
            } else {
                HashMap<String, com.taobao.taolive.sdk.goodlist.a> hashMap2 = this.f13841a;
                if (hashMap2 == null) {
                    return;
                }
                hashMap2.put(aVar.e, aVar);
            }
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.F = str;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.F;
    }

    public List<com.taobao.taolive.sdk.goodlist.a> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : new ArrayList(this.f13841a.values());
    }

    public List<com.taobao.taolive.sdk.goodlist.a> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList(this.f13841a.values());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.taobao.taolive.sdk.goodlist.a aVar = (com.taobao.taolive.sdk.goodlist.a) it.next();
            if (aVar == null || aVar.f21830a == 8 || aVar.f21830a == 1 || aVar.f21830a == 2 || hiq.a(aVar)) {
                it.remove();
            }
        }
        return arrayList;
    }

    public GoodsTopBannerBean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GoodsTopBannerBean) ipChange.ipc$dispatch("b6a7dc07", new Object[]{this}) : this.m;
    }

    public Context f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("442389e5", new Object[]{this}) : this.g;
    }

    public com.alibaba.android.ultron.vfw.instance.d B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.instance.d) ipChange.ipc$dispatch("686adbae", new Object[]{this}) : this.H;
    }

    public UltronInstanceViewModel E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UltronInstanceViewModel) ipChange.ipc$dispatch("63a68659", new Object[]{this}) : this.T;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.h;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.j;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.s;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.t;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.w;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.x;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this}) : this.i;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.k;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.o;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : this.q;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : this.v;
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : this.v && !y.a(this.g);
    }

    public TBLiveDataModel s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveDataModel) ipChange.ipc$dispatch("3bfe9955", new Object[]{this}) : this.r;
    }

    public VideoInfo t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoInfo) ipChange.ipc$dispatch("db468338", new Object[]{this}) : this.u;
    }

    public String u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("326979a4", new Object[]{this}) : this.A;
    }

    public String v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8ef3443", new Object[]{this}) : this.z;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this}) : this.K;
    }

    public String L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a6fe962d", new Object[]{this}) : this.V;
    }

    public String M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2d8450cc", new Object[]{this}) : this.W;
    }

    public String w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f74eee2", new Object[]{this}) : this.B;
    }

    public com.taobao.android.live.plugin.atype.flexalocal.good.showcase.e x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.atype.flexalocal.good.showcase.e) ipChange.ipc$dispatch("74815d67", new Object[]{this}) : this.C;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.D = z;
        }
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue() : this.D;
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue() : this.L.e;
    }

    public com.taobao.live.liveroom.good.model.f H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.live.liveroom.good.model.f) ipChange.ipc$dispatch("e74b157a", new Object[]{this}) : this.n;
    }

    private c(a aVar) {
        Boolean bool;
        this.f13841a = new HashMap<>();
        this.b = new HashMap<>();
        this.J = new HashMap<>();
        this.G = new ArrayList();
        boolean z = false;
        this.o = false;
        this.p = true;
        this.q = true;
        this.w = false;
        this.x = false;
        this.d = "";
        this.I = "全部";
        this.U = new Handler(Looper.getMainLooper());
        this.g = a.a(aVar);
        this.c = new com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a(a.a(aVar), a.b(aVar));
        this.L = new j();
        this.l = new i(a.b(aVar));
        this.h = a.c(aVar);
        this.i = a.d(aVar);
        this.j = pmd.a().q().a();
        this.k = a.e(aVar);
        this.u = a.b(aVar);
        this.r = a.f(aVar);
        this.v = a.g(aVar);
        this.y = a.h(aVar);
        this.C = a.i(aVar);
        this.z = a.j(aVar);
        this.A = a.k(aVar);
        this.B = a.l(aVar);
        Context context = this.g;
        if (context instanceof FragmentActivity) {
            UltronInstanceViewModel a2 = hiq.a((ViewModelStoreOwner) context);
            his.b("VMUltronInstance", "Ultron ViewModel: " + a2.hashCode());
            this.H = a2.a(this);
            this.T = a2;
            this.T.l = com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(this);
        }
        this.N = a.m(aVar);
        com.taobao.taolive.sdk.core.g gVar = this.N;
        if (gVar != null && gVar.aJ_() != null) {
            this.K = this.N.aJ_().e();
            this.V = this.N.aJ_().ay();
            this.W = this.N.aJ_().r();
        }
        if (hir.l() && com.taobao.taolive.sdk.utils.l.d(this.u.hasItemSearchEntrance) && !this.v) {
            z = true;
        }
        this.p = z;
        this.q = hir.m();
        this.s = com.taobao.taolive.sdk.goodlist.d.a(this.u.itemTransferInfo);
        his.a(RPCDataItems.SWITCH_TAG_LOG, "GoodLiveContext | mEnablePcg=" + this.s);
        this.t = hir.A();
        if (pmd.a().c() != null && pmd.a().c().a() != null && (bool = pmd.a().c().a().get("isTBLiveAPP")) != null) {
            this.o = bool.booleanValue();
        }
        this.w = a.n(aVar);
        this.x = a.o(aVar);
        I();
    }

    private void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
        } else if (!hir.X() || this.u == null) {
        } else {
            GoodLiveInfo goodLiveInfo = new GoodLiveInfo();
            goodLiveInfo.setLiveId(this.u.liveId);
            goodLiveInfo.setItemHoldType(this.u.itemHoldType);
            goodLiveInfo.setItemConfigInfo(new KMPJsonObject(this.u.itemConfigInfo));
            goodLiveInfo.setItemTransferInfo(new KMPJsonObject(this.u.itemTransferInfo));
            goodLiveInfo.setAdmireInfo(new KMPJsonObject(pqj.b(JSON.toJSONString(this.u.admireInfo))));
            goodLiveInfo.setShopHasVip(Boolean.valueOf(this.u.shopHasVip));
            goodLiveInfo.setShopVip(Boolean.valueOf(this.u.shopVip));
            goodLiveInfo.setHasAddCart(Boolean.valueOf(this.u.hasAddCart));
            goodLiveInfo.setNbItemStatus(this.u.nbItemStatus);
            goodLiveInfo.setBroadCaster(new KMPJsonObject(pqj.b(JSON.toJSONString(this.u.broadCaster))));
            this.n = new com.taobao.live.liveroom.good.model.f(goodLiveInfo);
            this.n.b(i());
            this.n.a(k());
            this.n.d(F());
            this.n.c(r());
            this.n.a(new tpu(new tpt() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c.1
            }));
        }
    }

    public static a a(Context context, TBLiveDataModel tBLiveDataModel, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f5508aa5", new Object[]{context, tBLiveDataModel, new Boolean(z)}) : new a(context, tBLiveDataModel, z);
    }

    public String y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4c806420", new Object[]{this}) : this.y;
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        this.f13841a.clear();
        this.b.clear();
        com.taobao.android.live.plugin.atype.flexalocal.good.showcase.e eVar = this.C;
        if (eVar != null) {
            eVar.d();
        }
        this.N = null;
        this.l.e();
        UltronInstanceViewModel ultronInstanceViewModel = this.T;
        if (ultronInstanceViewModel != null) {
            ultronInstanceViewModel.d().a((kas) null);
            this.T.d().a((afs) null);
        }
        this.U.removeCallbacksAndMessages(null);
    }

    public b c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3a7734ea", new Object[]{this, str});
        }
        com.taobao.taolive.sdk.core.g gVar = this.N;
        if (gVar == null) {
            his.b("GoodLiveContext", "getCacheData | liveId=" + str + ", mGlobalContext is null.");
            return null;
        }
        b bVar = (b) gVar.a("gl_global_cache", (Class<Object>) b.class);
        if (bVar == null || !StringUtils.equals(bVar.a(), str)) {
            return null;
        }
        return bVar;
    }

    public void a(b bVar) {
        com.taobao.android.live.plugin.atype.flexalocal.good.showcase.e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902bef30", new Object[]{this, bVar});
            return;
        }
        if (bVar != null && (eVar = this.C) != null) {
            bVar.a(eVar.a());
            bVar.a(this.C.e());
        }
        com.taobao.taolive.sdk.core.g gVar = this.N;
        if (gVar == null) {
            return;
        }
        gVar.a("gl_global_cache", bVar);
    }

    public List<VideoInfo.ExtraGoodsTabItem> G() {
        LiveItemCategoriesResponseData liveItemCategoriesResponseData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dc064339", new Object[]{this});
        }
        if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.s() && (liveItemCategoriesResponseData = this.R) != null && liveItemCategoriesResponseData.extraGoodsTabList != null && this.R.extraGoodsTabList.size() > 0) {
            return this.R.extraGoodsTabList;
        }
        return this.l.a();
    }

    /* loaded from: classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f13843a;
        private String b;
        private String c;
        private boolean d;
        private VideoInfo f;
        private boolean g;
        private boolean h;
        private boolean i;
        private String j;
        private TBLiveDataModel k;
        private com.taobao.android.live.plugin.atype.flexalocal.good.showcase.e l;
        private String m;
        private String n;
        private String o;
        private com.taobao.taolive.sdk.core.g p;

        static {
            kge.a(403022722);
        }

        public static /* synthetic */ Context a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("4f02dcea", new Object[]{aVar}) : aVar.f13843a;
        }

        public static /* synthetic */ VideoInfo b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (VideoInfo) ipChange.ipc$dispatch("94bbc130", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3169192c", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6959f44b", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ boolean e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("51a64ffa", new Object[]{aVar})).booleanValue() : aVar.d;
        }

        public static /* synthetic */ TBLiveDataModel f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TBLiveDataModel) ipChange.ipc$dispatch("26737cf8", new Object[]{aVar}) : aVar.k;
        }

        public static /* synthetic */ boolean g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dfbe1dfc", new Object[]{aVar})).booleanValue() : aVar.g;
        }

        public static /* synthetic */ String h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("491d60c7", new Object[]{aVar}) : aVar.j;
        }

        public static /* synthetic */ com.taobao.android.live.plugin.atype.flexalocal.good.showcase.e i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.atype.flexalocal.good.showcase.e) ipChange.ipc$dispatch("ba516862", new Object[]{aVar}) : aVar.l;
        }

        public static /* synthetic */ String j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8ff1705", new Object[]{aVar}) : aVar.m;
        }

        public static /* synthetic */ String k(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f0eff224", new Object[]{aVar}) : aVar.n;
        }

        public static /* synthetic */ String l(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("28e0cd43", new Object[]{aVar}) : aVar.o;
        }

        public static /* synthetic */ com.taobao.taolive.sdk.core.g m(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.core.g) ipChange.ipc$dispatch("49aa232f", new Object[]{aVar}) : aVar.p;
        }

        public static /* synthetic */ boolean n(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("51116f03", new Object[]{aVar})).booleanValue() : aVar.h;
        }

        public static /* synthetic */ boolean o(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("181d5604", new Object[]{aVar})).booleanValue() : aVar.i;
        }

        private a(Context context, TBLiveDataModel tBLiveDataModel, boolean z) {
            this.f13843a = context;
            this.k = tBLiveDataModel;
            this.f = tBLiveDataModel.mVideoInfo;
            this.g = z;
            this.b = this.f.liveId;
            if (this.f.broadCaster != null) {
                this.c = this.f.broadCaster.accountId;
            }
            com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(context);
        }

        public c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("23c59dd5", new Object[]{this}) : new c(this);
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("88425cb4", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4f4e43b5", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("165a2ab6", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("99c162e", new Object[]{this, str});
            }
            this.j = str;
            return this;
        }

        public a a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("24e0c99a", new Object[]{this, str, str2, str3});
            }
            this.m = str;
            this.n = str2;
            this.o = str3;
            return this;
        }

        public a a(com.taobao.android.live.plugin.atype.flexalocal.good.showcase.e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3884a6d0", new Object[]{this, eVar});
            }
            this.l = eVar;
            return this;
        }

        public a a(com.taobao.taolive.sdk.core.g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fb6e0667", new Object[]{this, gVar});
            }
            this.p = gVar;
            return this;
        }
    }

    public com.taobao.alilive.aliliveframework.frame.a C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("4b15eaff", new Object[]{this});
        }
        WeakReference<com.taobao.alilive.aliliveframework.frame.a> weakReference = this.M;
        if (weakReference != null && weakReference.get() != null) {
            return this.M.get();
        }
        return null;
    }

    public void a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1819755d", new Object[]{this, aVar});
            return;
        }
        this.M = new WeakReference<>(aVar);
        if (aVar == null) {
            return;
        }
        this.l.a(a(this));
    }

    public String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72d0c135", new Object[]{this});
        }
        if (C() == null) {
            return null;
        }
        return C().G();
    }

    public static String a(c cVar) {
        WeakReference<com.taobao.alilive.aliliveframework.frame.a> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce7d40f1", new Object[]{cVar});
        }
        if (cVar != null && (weakReference = cVar.M) != null && weakReference.get() != null) {
            return cVar.M.get().G();
        }
        return null;
    }
}
