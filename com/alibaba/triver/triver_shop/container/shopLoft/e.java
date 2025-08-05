package com.alibaba.triver.triver_shop.container.shopLoft;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopContentRecyclerView;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.alibaba.triver.triver_shop.container.shopLoft.f;
import com.alibaba.triver.triver_shop.newShop.ext.l;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ag;
import com.ut.mini.UTAnalytics;
import com.ut.share.business.ShareContent;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.p;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import org.android.agoo.common.AgooConstants;
import tb.ceg;
import tb.kge;
import tb.rvp;
import tb.rvr;
import tb.rvs;

/* loaded from: classes3.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.k<Object>[] f3718a;
    private JSONArray A;
    private JSONObject B;
    private a C;
    private boolean D;
    private ShopLoftComponentView b;
    private Context c;
    private int e;
    private final rvs g;
    private Bundle h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private Uri o;
    private boolean p;
    private boolean q;
    private boolean r;
    private JSONObject s;
    private JSONObject t;
    private boolean u;
    private String v;
    private String w;
    private String x;
    private String y;
    private JSONObject z;
    private final f d = new f();
    private int f = 10;

    /* loaded from: classes3.dex */
    public interface a {
        void a(JSONObject jSONObject);

        void a(ArrayList<JSONObject> arrayList);

        void a(boolean z);
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a();

        void a(String str);

        void b();
    }

    /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.e$e  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0128e extends rvr<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f3721a;
        public final /* synthetic */ e b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0128e(Object obj, Object obj2, e eVar) {
            super(obj2);
            this.f3721a = obj;
            this.b = eVar;
        }

        @Override // tb.rvr
        public void a(kotlin.reflect.k<?> property, Boolean bool, Boolean bool2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4a3a624", new Object[]{this, property, bool, bool2});
                return;
            }
            q.d(property, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            ShopLoftComponentView o = e.o(this.b);
            if (o != null) {
                o.setHasNext(booleanValue);
            } else {
                q.b("componentView");
                throw null;
            }
        }
    }

    public e() {
        rvp rvpVar = rvp.INSTANCE;
        this.g = new C0128e(true, true, this);
        this.r = true;
        this.u = true;
        this.z = new JSONObject();
        this.A = new JSONArray();
    }

    public static final /* synthetic */ void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5588b9c6", new Object[]{eVar});
        } else {
            eVar.p();
        }
    }

    public static final /* synthetic */ void a(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b8ef1fd", new Object[]{eVar, new Integer(i)});
        } else {
            eVar.e = i;
        }
    }

    public static final /* synthetic */ void a(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b93e10", new Object[]{eVar, str});
        } else {
            eVar.v = str;
        }
    }

    public static final /* synthetic */ void a(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b8f31ce", new Object[]{eVar, new Boolean(z)});
        } else {
            eVar.r = z;
        }
    }

    public static final /* synthetic */ JSONArray b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("f6786cb9", new Object[]{eVar}) : eVar.A;
    }

    public static final /* synthetic */ void b(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c44fe8f", new Object[]{eVar, new Boolean(z)});
        } else {
            eVar.b(z);
        }
    }

    public static final /* synthetic */ void c(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfacb50", new Object[]{eVar, new Boolean(z)});
        } else {
            eVar.q = z;
        }
    }

    public static final /* synthetic */ f n(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("ffa0f856", new Object[]{eVar}) : eVar.d;
    }

    public static final /* synthetic */ ShopLoftComponentView o(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopLoftComponentView) ipChange.ipc$dispatch("9394e640", new Object[]{eVar}) : eVar.b;
    }

    static {
        kge.a(956071364);
        f3718a = new kotlin.reflect.k[]{t.a(new MutablePropertyReference1Impl(t.b(e.class), "hasNext", "getHasNext()Z"))};
    }

    private final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.g.a(this, f3718a[0], Boolean.valueOf(z));
        }
    }

    private final boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : ((Boolean) this.g.a(this, f3718a[0])).booleanValue();
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.B;
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.B = jSONObject;
        }
    }

    public final void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15165869", new Object[]{this, aVar});
        } else {
            this.C = aVar;
        }
    }

    public final a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c7a34daa", new Object[]{this}) : this.C;
    }

    public final void a(Context context, Bundle bundle) {
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f53e474", new Object[]{this, context, bundle});
            return;
        }
        q.d(context, "context");
        com.alibaba.triver.triver_shop.newShop.ext.h.a();
        long currentTimeMillis = System.currentTimeMillis();
        this.c = context;
        this.h = bundle;
        c();
        this.b = new ShopLoftComponentView(context);
        ShopLoftComponentView shopLoftComponentView = this.b;
        if (shopLoftComponentView == null) {
            q.b("componentView");
            throw null;
        }
        shopLoftComponentView.setClosePageCallback(new ShopLoftComponent$init$1(this));
        ShopLoftComponentView shopLoftComponentView2 = this.b;
        if (shopLoftComponentView2 == null) {
            q.b("componentView");
            throw null;
        }
        shopLoftComponentView2.setSwipeToBottomCallback(new b(this));
        ShopLoftComponentView shopLoftComponentView3 = this.b;
        if (shopLoftComponentView3 == null) {
            q.b("componentView");
            throw null;
        }
        o.g(shopLoftComponentView3);
        this.s = com.alibaba.triver.triver_shop.newShop.ext.d.a(bundle == null ? null : bundle.getString("loftData"));
        JSONObject a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(bundle == null ? null : bundle.getString(AgooConstants.MESSAGE_EXT));
        if (a2 == null) {
            a2 = new JSONObject();
        }
        this.t = a2;
        Map<String, String> pageAllProperties = UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties((Activity) context);
        this.x = pageAllProperties == null ? null : pageAllProperties.get(ag.KEY_UTPARAM_URL);
        if (bundle != null && (string = bundle.getString("loftUrl")) != null) {
            this.o = Uri.parse(string);
            Uri uri = this.o;
            this.y = uri == null ? null : uri.getQueryParameter("clickid");
            JSONObject jSONObject2 = this.t;
            if (jSONObject2 != null) {
                jSONObject2.put("clickid", (Object) this.y);
            }
        }
        d();
        JSONObject jSONObject3 = this.t;
        if (jSONObject3 != null && (jSONObject = this.s) != null) {
            this.p = true;
            jSONObject.putAll(jSONObject3);
        }
        JSONObject jSONObject4 = this.s;
        if (jSONObject4 != null) {
            jSONObject4.put("source", (Object) this.j);
        }
        this.p = this.s != null;
        JSONObject jSONObject5 = this.s;
        if (jSONObject5 != null) {
            this.d.a(p.d(jSONObject5));
            a aVar = this.C;
            if (aVar != null) {
                JSONObject jSONObject6 = this.s;
                if (jSONObject6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
                aVar.a(jSONObject6);
            }
            JSONObject jSONObject7 = this.s;
            if (ShopLoftViewManager.isMarketType(jSONObject7 == null ? null : jSONObject7.getString("sceneId"))) {
                JSONObject jSONObject8 = this.s;
                if (q.a((Object) AgooConstants.ACK_FLAG_NULL, (Object) (jSONObject8 == null ? null : jSONObject8.getString("contentType")))) {
                    ShopLoftComponentView shopLoftComponentView4 = this.b;
                    if (shopLoftComponentView4 == null) {
                        q.b("componentView");
                        throw null;
                    }
                    shopLoftComponentView4.setLastItemIsLiveCard(true);
                }
            }
        } else {
            this.d.a(new ArrayList());
        }
        this.d.a(bundle);
        ShopLoftComponentView shopLoftComponentView5 = this.b;
        if (shopLoftComponentView5 == null) {
            q.b("componentView");
            throw null;
        }
        shopLoftComponentView5.setAdapter(this.d);
        ShopLoftComponentView shopLoftComponentView6 = this.b;
        if (shopLoftComponentView6 == null) {
            q.b("componentView");
            throw null;
        }
        shopLoftComponentView6.init();
        e();
        a(currentTimeMillis, System.currentTimeMillis());
    }

    private final void a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11cae8", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        this.z.put((JSONObject) "containerStart", (String) Long.valueOf(j));
        this.z.put((JSONObject) "containerEnd", (String) Long.valueOf(j2));
        this.z.put((JSONObject) "cardPerformanceData", (String) this.A);
        this.z.put((JSONObject) "shopId", this.k);
        this.z.put((JSONObject) "sellerId", this.l);
        String str = l.c() ? "high" : "unknown";
        if (l.b()) {
            str = "low";
        }
        if (l.d()) {
            str = "middle";
        }
        this.z.put((JSONObject) "deviceLevel", str);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        b.a j = this.d.j();
        Context context = this.c;
        if (context != null) {
            j.a("shopLoftVideoController", new com.alibaba.triver.triver_shop.container.shopLoft.newStyle.d(context));
            b.a j2 = this.d.j();
            Context context2 = this.c;
            if (context2 != null) {
                j2.a("shopLoftDXEngine", new com.alibaba.triver.triver_shop.container.shopLoft.newStyle.b(new com.alibaba.triver.triver_shop.container.shopLoft.newStyle.a((Activity) context2)));
                this.d.j().a("shopLoftPerformanceMonitorObject", new d());
                return;
            }
            q.b("context");
            throw null;
        }
        q.b("context");
        throw null;
    }

    /* loaded from: classes3.dex */
    public static final class d implements b.InterfaceC0127b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.b.a.InterfaceC0126a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        public d() {
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.b.InterfaceC0127b
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            } else if (jSONObject == null) {
            } else {
                e.b(e.this).add(jSONObject);
            }
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.D = z;
        ShopLoftComponentView shopLoftComponentView = this.b;
        if (shopLoftComponentView == null) {
            return;
        }
        if (shopLoftComponentView != null) {
            shopLoftComponentView.setEnableSwipeUpAutoCloseShopLoft(z);
        } else {
            q.b("componentView");
            throw null;
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        Bundle bundle = this.h;
        String str = null;
        this.i = bundle == null ? null : bundle.getString("title");
        Bundle bundle2 = this.h;
        this.k = bundle2 == null ? null : bundle2.getString("shop_id");
        Bundle bundle3 = this.h;
        this.l = bundle3 == null ? null : bundle3.getString("seller_id");
        Bundle bundle4 = this.h;
        this.j = bundle4 == null ? null : bundle4.getString("source");
        Bundle bundle5 = this.h;
        String string = bundle5 == null ? null : bundle5.getString("first_media_id");
        if (string == null) {
            JSONObject jSONObject = this.s;
            string = jSONObject == null ? null : jSONObject.getString("id");
        }
        this.m = string;
        Bundle bundle6 = this.h;
        String string2 = bundle6 == null ? null : bundle6.getString("first_media_scene");
        if (string2 == null) {
            JSONObject jSONObject2 = this.s;
            string2 = jSONObject2 == null ? null : jSONObject2.getString("sceneId");
        }
        this.n = string2;
        Bundle bundle7 = this.h;
        if (bundle7 != null) {
            str = bundle7.getString("entrySpm");
        }
        this.w = str;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!o()) {
        } else {
            JSONObject a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a("entrysource", this.j), kotlin.j.a("entryspm", this.w));
            Context context = this.c;
            if (context == null) {
                q.b("context");
                throw null;
            }
            com.alibaba.triver.triver_shop.d.INSTANCE.a(context, this.l, this.m, this.n, String.valueOf(this.e), String.valueOf(this.f), this.u, this.v, this.o, a2, new ShopLoftComponent$requestListData$1(this));
        }
    }

    /* loaded from: classes3.dex */
    public final class b implements ShopContentRecyclerView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f3719a;

        static {
            kge.a(-1898734779);
            kge.a(804254167);
        }

        public b(e this$0) {
            q.d(this$0, "this$0");
            this.f3719a = this$0;
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.ShopContentRecyclerView.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            ceg.Companion.b("swipe to bottom");
            this.f3719a.e();
            c d = e.n(this.f3719a).d();
            if (d == null) {
                return;
            }
            d.a();
        }
    }

    public final void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15174127", new Object[]{this, cVar});
        } else {
            this.d.a(cVar);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.d.h();
        com.alibaba.triver.triver_shop.newShop.ext.h.a(this.z);
    }

    public final void g() {
        com.alibaba.triver.triver_shop.container.shopLoft.b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        f.a a3 = this.d.a();
        if (a3 != null && (a2 = a3.a()) != null) {
            a2.onActivityResume();
        }
        f.a a4 = this.d.a();
        if (a4 == null) {
            return;
        }
        a4.k();
    }

    public final void h() {
        com.alibaba.triver.triver_shop.container.shopLoft.b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        f.a a3 = this.d.a();
        if (a3 != null && (a2 = a3.a()) != null) {
            a2.onActivityPause();
        }
        f.a a4 = this.d.a();
        if (a4 != null) {
            a4.l();
        }
        f.a a5 = this.d.a();
        if (a5 == null) {
            return;
        }
        a5.a(true);
    }

    public final void i() {
        com.alibaba.triver.triver_shop.container.shopLoft.b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        f.a a3 = this.d.a();
        if (a3 == null || (a2 = a3.a()) == null) {
            return;
        }
        a2.onActivityStop();
    }

    public final View j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b51e1df3", new Object[]{this});
        }
        ShopLoftComponentView shopLoftComponentView = this.b;
        if (shopLoftComponentView != null) {
            return shopLoftComponentView;
        }
        q.b("componentView");
        throw null;
    }

    public final ShareContent k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShareContent) ipChange.ipc$dispatch("ed7ff05c", new Object[]{this}) : this.d.i();
    }

    public final String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this});
        }
        f.a a2 = this.d.a();
        if (a2 != null) {
            return a2.b();
        }
        return null;
    }

    public final JSONObject m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5c7d6194", new Object[]{this});
        }
        f.a a2 = this.d.a();
        if (a2 != null) {
            return a2.c();
        }
        return null;
    }

    private final void p() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (q.a((Object) "shop", (Object) this.j) || (str = this.k) == null) {
        } else {
            String a2 = q.a("https://shop.m.taobao.com/shop/shop_index.htm?shop_id=", (Object) str);
            Context context = this.c;
            if (context != null) {
                l.a(context, a2);
            } else {
                q.b("context");
                throw null;
            }
        }
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        ShopLoftComponentView shopLoftComponentView = this.b;
        if (shopLoftComponentView == null) {
            q.b("componentView");
            throw null;
        }
        ShopContentRecyclerView recyclerView = shopLoftComponentView.getRecyclerView();
        if (recyclerView != null) {
            return recyclerView.isSlideToTop();
        }
        return false;
    }
}
