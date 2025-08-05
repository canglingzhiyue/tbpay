package com.alibaba.triver.triver_shop.newShop.data;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.collections.p;
import kotlin.i;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.kge;

/* loaded from: classes3.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String actionFollow = "follow";
    public static final String actionGoBack = "goBack";
    public static final String actionGoTo = "goTo";
    public static final String actionJumpToShopNavi = "jumpToShopNavi";
    public static final String actionOpenBrandZone = "openBrandZone";
    public static final String actionOpenTab3 = "openTab3";
    public static final String actionShare = "more";
    public static final String actionSwitchTabTo = "switchTabTo";
    public static final String bottomBarArea = "bottom_bar";
    public static final String fourTabArea = "four_tab";
    public static final String headerBangDan = "header_bangdan";
    public static final String headerGoodsNavArea = "header_goods_nav";
    public static final String headerIndexNavArea = "header_index_nav";
    public static final String headerIndexVideoShop = "header_tab_index";
    public static final String headerInfoArea = "header_info";
    public static final String headerLoftEntrance = "header_loft_entrance";
    public static final String headerSearchGoodsArea = "header_search_goods";
    public static final String videoShopInfoArea = "video_shop_info";

    /* renamed from: a  reason: collision with root package name */
    private String f3834a;
    private String b;
    private Object c;
    private String d;
    private JSONObject e;
    private String f;
    private b i;
    private boolean j;
    private final HashMap<String, ArrayList<b>> g = new HashMap<>();
    private final HashSet<String> h = new HashSet<>();
    private final HashMap<DXRootView, b> k = new HashMap<>();

    /* loaded from: classes3.dex */
    public static abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2087498084);
        }

        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            }
        }

        public void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
            }
        }

        public void c(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a8844c6", new Object[]{this, obj});
            }
        }

        public void d(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84b9de07", new Object[]{this, obj});
            }
        }

        public void e(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ceeb7748", new Object[]{this, obj});
            }
        }

        public void f(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("191d1089", new Object[]{this, obj});
            }
        }

        public void g(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("634ea9ca", new Object[]{this, obj});
            }
        }

        public void h(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad80430b", new Object[]{this, obj});
            }
        }
    }

    static {
        kge.a(-287875693);
        Companion = new a(null);
    }

    public final HashSet<String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashSet) ipChange.ipc$dispatch("be7f2185", new Object[]{this}) : this.h;
    }

    public final void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("232837b7", new Object[]{this, bVar});
        } else {
            this.i = bVar;
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : q.a((Object) "goBack", (Object) this.b);
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : q.a((Object) "goTo", (Object) this.b);
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : q.a((Object) actionSwitchTabTo, (Object) this.b);
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : q.a((Object) "follow", (Object) this.b);
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : q.a((Object) "more", (Object) this.b);
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : q.a((Object) actionOpenBrandZone, (Object) this.b);
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : q.a((Object) actionJumpToShopNavi, (Object) this.b);
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : q.a((Object) actionOpenTab3, (Object) this.b);
    }

    public final void a(String touchArea, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a14d2d", new Object[]{this, touchArea, bVar});
            return;
        }
        q.d(touchArea, "touchArea");
        if (bVar == null) {
            return;
        }
        ArrayList<b> arrayList = this.g.get(touchArea);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(bVar);
        this.g.put(touchArea, arrayList);
    }

    public final void a(DXRootView dxRootView, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88aee056", new Object[]{this, dxRootView, bVar});
            return;
        }
        q.d(dxRootView, "dxRootView");
        if (bVar == null) {
            return;
        }
        this.k.put(dxRootView, bVar);
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        try {
            this.g.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
        k();
    }

    public final void a(d dVar, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DXTemplateItem c;
        b bVar;
        ArrayList<b> d;
        Object m2371constructorimpl;
        Map<String, String> c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61116109", new Object[]{this, dVar, objArr, dXRuntimeContext});
            return;
        }
        k();
        a(objArr);
        Map map = null;
        boolean a2 = p.a(this.h, (dXRuntimeContext == null || (c = dXRuntimeContext.c()) == null) ? null : c.f11925a);
        if (!this.j && !a2) {
            d = this.g.get(this.f3834a);
            if (d == null) {
                d = p.d(this.i);
            }
        } else if (dXRuntimeContext == null || (bVar = this.k.get(dXRuntimeContext.s())) == null) {
            return;
        } else {
            d = p.d(bVar);
        }
        if (d == null) {
            return;
        }
        String str = this.d;
        JSONObject jSONObject = this.e;
        if (str != null && dVar != null) {
            try {
                Result.a aVar = Result.Companion;
                if (jSONObject != null && (c2 = com.alibaba.triver.triver_shop.newShop.ext.b.c(jSONObject)) != null) {
                    map = ai.c(c2);
                }
                m.a(dVar, str, map, this.f);
                m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
            }
            Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
            if (m2374exceptionOrNullimpl != null) {
                ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
            }
        }
        if (!b()) {
            if (!c()) {
                if (!d()) {
                    if (!e()) {
                        if (!f()) {
                            if (!g()) {
                                if (!h()) {
                                    if (!i()) {
                                        return;
                                    }
                                    for (b bVar2 : d) {
                                        if (bVar2 != null) {
                                            bVar2.h(this.c);
                                        }
                                    }
                                    return;
                                }
                                for (b bVar3 : d) {
                                    if (bVar3 != null) {
                                        bVar3.g(this.c);
                                    }
                                }
                                return;
                            }
                            for (b bVar4 : d) {
                                if (bVar4 != null) {
                                    bVar4.f(this.c);
                                }
                            }
                            return;
                        }
                        for (b bVar5 : d) {
                            if (bVar5 != null) {
                                bVar5.e(this.c);
                            }
                        }
                        return;
                    }
                    for (b bVar6 : d) {
                        if (bVar6 != null) {
                            bVar6.d(this.c);
                        }
                    }
                    return;
                }
                for (b bVar7 : d) {
                    if (bVar7 != null) {
                        bVar7.a(this.c);
                    }
                }
                return;
            }
            for (b bVar8 : d) {
                if (bVar8 != null) {
                    bVar8.b(this.c);
                }
            }
            return;
        }
        for (b bVar9 : d) {
            if (bVar9 != null) {
                bVar9.c(this.c);
            }
        }
    }

    private final void a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63135c9", new Object[]{this, objArr});
        } else if (objArr == null || objArr.length < 2) {
        } else {
            Object obj = objArr[0];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.f3834a = (String) obj;
            Object obj2 = objArr[1];
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.b = (String) obj2;
            if (objArr.length >= 3) {
                this.c = objArr[2];
            }
            Object a2 = kotlin.collections.g.a(objArr, 3);
            this.d = a2 == null ? null : a2.toString();
            Object a3 = kotlin.collections.g.a(objArr, 4);
            if (a3 != null && (a3 instanceof JSONObject)) {
                this.e = (JSONObject) a3;
            }
            Object a4 = kotlin.collections.g.a(objArr, 5);
            if (a4 == null || !(a4 instanceof String)) {
                return;
            }
            this.f = (String) a4;
        }
    }

    private final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.b = null;
        this.f3834a = null;
        this.c = null;
        this.f = null;
        this.d = null;
        this.e = null;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-1612075749);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }
    }
}
