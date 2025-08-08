package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.web.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ai;
import tb.kge;
import tb.rir;
import tb.ris;

/* loaded from: classes3.dex */
public final class n extends com.alibaba.triver.triver_shop.newShop.view.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.alibaba.triver.triver_shop.newShop.data.g f4003a;
    private final Context b;
    private final kotlin.d c;
    private View d;
    private Map<String, String> e;
    private String f;
    private String g;
    private Map<String, String> h;
    private String i;
    private String j;
    private final com.taobao.android.dinamicx.subscribe.protocol.shop.a k;
    private final ris l;

    /* loaded from: classes3.dex */
    public static final class b implements rir {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.rir
        public final void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
                return;
            }
            com.alibaba.triver.triver_shop.newShop.event.broadcast.c cVar = new com.alibaba.triver.triver_shop.newShop.event.broadcast.c(obj);
            if (!kotlin.jvm.internal.q.a((Object) "2.0.0", (Object) cVar.k())) {
                return;
            }
            if (cVar.b()) {
                UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(n.b(n.this), n.f(n.this));
            } else if (cVar.c()) {
                UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(n.b(n.this));
            } else if (!(obj instanceof String)) {
            } else {
                JSONObject parseObject = JSON.parseObject((String) obj);
                if (!StringUtils.equals(com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SHOP_FOLLOW_SETSTATUS, parseObject.getString("_msg_name"))) {
                    return;
                }
                String string = parseObject.getString("status");
                if (StringUtils.equals("followed", string)) {
                    n.a(n.this).a((Object) null);
                } else if (!StringUtils.equals(com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_UNFOLLOWED, string)) {
                } else {
                    n.a(n.this).a((Object) null);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements a.InterfaceC0159a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.alibaba.triver.triver_shop.web.a.InterfaceC0159a
        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : n.a(n.this).d();
        }
    }

    static {
        kge.a(1096815913);
    }

    public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 92838762:
                super.c();
                return null;
            case 93762283:
                super.d();
                return null;
            case 94685804:
                super.e();
                return null;
            case 95609325:
                super.f();
                return null;
            case 96532846:
                super.g();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static final /* synthetic */ com.taobao.android.dinamicx.subscribe.protocol.shop.a a(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.subscribe.protocol.shop.a) ipChange.ipc$dispatch("4e6a3a7e", new Object[]{nVar}) : nVar.k;
    }

    public static final /* synthetic */ void a(n nVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("503ad55e", new Object[]{nVar, str});
        } else {
            nVar.f = str;
        }
    }

    public static final /* synthetic */ void a(n nVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da01f871", new Object[]{nVar, map});
        } else {
            nVar.e = map;
        }
    }

    public static final /* synthetic */ Context b(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("a28738eb", new Object[]{nVar}) : nVar.b;
    }

    public static final /* synthetic */ void b(n nVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891b35fd", new Object[]{nVar, str});
        } else {
            nVar.g = str;
        }
    }

    public static final /* synthetic */ void c(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81205d52", new Object[]{nVar});
        } else {
            nVar.o();
        }
    }

    public static final /* synthetic */ void d(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef8f7b1", new Object[]{nVar});
        } else {
            nVar.n();
        }
    }

    public static final /* synthetic */ void e(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd19210", new Object[]{nVar});
        } else {
            nVar.p();
        }
    }

    public static final /* synthetic */ String f(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f5ee5411", new Object[]{nVar}) : nVar.q();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.alibaba.triver.triver_shop.newShop.data.g tabBarItemDataModel, Context context) {
        super(context, tabBarItemDataModel);
        kotlin.jvm.internal.q.d(tabBarItemDataModel, "tabBarItemDataModel");
        kotlin.jvm.internal.q.d(context, "context");
        this.f4003a = tabBarItemDataModel;
        this.b = context;
        this.c = kotlin.e.a(new SubscribeViewContentRender$rootContainer$2(this));
        this.h = a(this.b);
        this.k = new com.taobao.android.dinamicx.subscribe.protocol.shop.a(this.b, new a());
        this.l = new ris(this.b, "mashop_broadcast", new b());
    }

    private final FrameLayout a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("46931b71", new Object[]{this}) : (FrameLayout) this.c.getValue();
    }

    /* loaded from: classes3.dex */
    public static final class a implements com.taobao.android.dinamicx.subscribe.protocol.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.dinamicx.subscribe.protocol.b
        public void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                return;
            }
            n.a(n.this, map);
            n.c(n.this);
        }

        @Override // com.taobao.android.dinamicx.subscribe.protocol.b
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            n.a(n.this, str);
            n.d(n.this);
        }

        @Override // com.taobao.android.dinamicx.subscribe.protocol.b
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
                return;
            }
            n.b(n.this, str);
            n.e(n.this);
        }
    }

    private final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "_msg_type", "aplus.enter");
        jSONObject2.put((JSONObject) "_msg_token", this.i);
        jSONObject2.put((JSONObject) "_msg_source", this.j);
        jSONObject2.put((JSONObject) "_msg_target", com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT);
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) "isonepage", (String) true);
        jSONObject4.put((JSONObject) "pageName", q());
        jSONObject2.put((JSONObject) "pageConfig", (String) jSONObject3);
        jSONObject2.put((JSONObject) "params", (String) this.e);
        this.l.a(jSONObject);
    }

    private final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "_msg_type", "aplus.updatePageProperties");
        jSONObject2.put((JSONObject) "_msg_token", this.i);
        jSONObject2.put((JSONObject) "_msg_source", this.j);
        jSONObject2.put((JSONObject) "_msg_target", com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT);
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) "pageName", q());
        jSONObject4.put((JSONObject) "isonepage", (String) true);
        jSONObject2.put((JSONObject) "pageConfig", (String) jSONObject3);
        jSONObject2.put((JSONObject) "params", (String) this.e);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.b, this.e);
        this.l.a(jSONObject);
    }

    private final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "_msg_type", "aplus.updateNextPageProperties");
        jSONObject2.put((JSONObject) "_msg_token", this.i);
        jSONObject2.put((JSONObject) "_msg_source", this.j);
        jSONObject2.put((JSONObject) "_msg_target", com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT);
        jSONObject2.put((JSONObject) "pageConfig", (String) null);
        jSONObject2.put((JSONObject) "params", (String) null);
        this.l.a(jSONObject);
    }

    private final String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : StringUtils.isEmpty(this.f) ? "Page_DingYueShopIndexAll" : this.f;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.j(a());
        com.alibaba.triver.triver_shop.newShop.ext.o.k(a());
        return a();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        super.g();
        a().removeAllViews();
        this.k.c();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        this.k.a();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        this.k.b();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void c() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        if (this.d == null) {
            i();
            this.d = this.k.a(this.h);
            com.alibaba.triver.triver_shop.newShop.data.d g = this.f4003a.g();
            if (g != null) {
                i = g.au();
            }
            if (i == 0) {
                i = -1;
            }
            FrameLayout a2 = a();
            View view = this.d;
            kotlin.jvm.internal.q.a(view);
            a2.addView(view, -1, i);
            com.alibaba.triver.triver_shop.web.a a3 = com.alibaba.triver.triver_shop.newShop.ext.h.a(this.b, this.f4003a.f());
            if (a3 != null) {
                a3.a(new c());
            }
            j();
        }
        this.k.a();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        this.k.b();
    }

    private final Map<String, String> a(Context context) {
        String h;
        JSONObject a2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4d84e95", new Object[]{this, context});
        }
        JSONObject jSONObject = new JSONObject();
        com.alibaba.triver.triver_shop.newShop.data.d g = this.f4003a.g();
        Boolean bool = null;
        String T = g == null ? null : g.T();
        Pair[] pairArr = new Pair[4];
        com.alibaba.triver.triver_shop.newShop.data.d g2 = this.f4003a.g();
        pairArr[0] = kotlin.j.a("sellerId", g2 == null ? null : g2.U());
        pairArr[1] = kotlin.j.a("shopId", T);
        pairArr[2] = kotlin.j.a("isNewStyle", true);
        com.alibaba.triver.triver_shop.newShop.data.d g3 = this.f4003a.g();
        if (g3 != null) {
            bool = Boolean.valueOf(g3.s());
        }
        pairArr[3] = kotlin.j.a("is2022Style", bool);
        HashMap c2 = ai.c(pairArr);
        com.alibaba.triver.triver_shop.newShop.data.d g4 = this.f4003a.g();
        if (g4 != null && (h = g4.h()) != null && (a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(h)) != null) {
            c2.putAll(a2);
        }
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "query", new JSONObject(c2).toJSONString());
        jSONObject2.put((JSONObject) "weexShopTabId", "2.0.0");
        jSONObject2.put((JSONObject) "weexShopToken", T);
        this.j = "2.0.0";
        this.i = T;
        Pair[] pairArr2 = new Pair[3];
        pairArr2[0] = kotlin.j.a("visible", "true");
        pairArr2[1] = kotlin.j.a("subscribeData", jSONObject.toJSONString());
        com.alibaba.triver.triver_shop.newShop.data.d g5 = this.f4003a.g();
        if (g5 != null && g5.an()) {
            z = true;
        }
        pairArr2[2] = kotlin.j.a("carShop", String.valueOf(z));
        return ai.c(pairArr2);
    }
}
