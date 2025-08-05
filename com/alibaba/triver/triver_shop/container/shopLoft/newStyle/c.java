package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.collections.g;
import kotlin.collections.p;
import kotlin.i;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.kge;

/* loaded from: classes3.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String actionGoTo = "goTo";
    public static final String actionShopLoftCollection = "shopLoftCollection";
    public static final String actionShopLoftLike = "shopLoftLike";
    public static final String actionShopLoftShare = "shopLoftShare";
    public static final String actionShowWindVanePop = "showWindVanePop";
    public static final String shopLoft2023StyleBottomNavArea = "shopLoft2023StyleBottomNavArea";

    /* renamed from: a  reason: collision with root package name */
    private String f3755a;
    private String b;
    private Object c;
    private String d;
    private JSONObject e;
    private String f;
    private final HashMap<String, ArrayList<b>> g = new HashMap<>();
    private final HashMap<DXRootView, b> h = new HashMap<>();

    /* loaded from: classes3.dex */
    public static abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1406559612);
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

        public JSONObject c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
            }
            return null;
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
    }

    static {
        kge.a(-1551915750);
        Companion = new a(null);
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : q.a((Object) this.b, (Object) actionShopLoftLike);
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : q.a((Object) this.b, (Object) actionShopLoftShare);
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : q.a((Object) this.b, (Object) actionShopLoftCollection);
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : q.a((Object) this.b, (Object) actionShowWindVanePop);
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : q.a((Object) this.b, (Object) "goTo");
    }

    public final void a(String touchArea, b bVar) {
        ArrayList<b> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26915d0c", new Object[]{this, touchArea, bVar});
            return;
        }
        q.d(touchArea, "touchArea");
        if (bVar == null || (arrayList = this.g.get(touchArea)) == null) {
            return;
        }
        arrayList.remove(bVar);
    }

    public final void a(DXRootView dxRootView, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea7f2c3", new Object[]{this, dxRootView, bVar});
            return;
        }
        q.d(dxRootView, "dxRootView");
        if (bVar == null) {
            return;
        }
        this.h.put(dxRootView, bVar);
    }

    public final void a(Object[] objArr, DXRuntimeContext dxRuntimeContext) {
        Object m2371constructorimpl;
        Map<String, String> c;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad925d7a", new Object[]{this, objArr, dxRuntimeContext});
            return;
        }
        q.d(dxRuntimeContext, "dxRuntimeContext");
        f();
        a(objArr);
        b bVar = this.h.get(dxRuntimeContext.s());
        if (bVar == null) {
            return;
        }
        ArrayList d = p.d(bVar);
        if (this.d != null) {
            try {
                Result.a aVar = Result.Companion;
                JSONObject c2 = bVar.c();
                if (c2 != null && (jSONObject = this.e) != null) {
                    jSONObject.putAll(c2);
                }
                String str = this.f;
                String str2 = this.d;
                JSONObject jSONObject2 = this.e;
                Map map = null;
                if (jSONObject2 != null && (c = com.alibaba.triver.triver_shop.newShop.ext.b.c(jSONObject2)) != null) {
                    map = ai.c(c);
                }
                m.a(str, str2, map);
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
        if (a()) {
            Iterator it = d.iterator();
            while (it.hasNext()) {
                ((b) it.next()).b(this.c);
            }
        } else if (b()) {
            Iterator it2 = d.iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).c(this.c);
            }
        } else if (c()) {
            Iterator it3 = d.iterator();
            while (it3.hasNext()) {
                ((b) it3.next()).a(this.c);
            }
        } else if (d()) {
            Iterator it4 = d.iterator();
            while (it4.hasNext()) {
                ((b) it4.next()).d(this.c);
            }
        } else if (!e()) {
        } else {
            Iterator it5 = d.iterator();
            while (it5.hasNext()) {
                ((b) it5.next()).e(this.c);
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
            this.f3755a = (String) obj;
            Object obj2 = objArr[1];
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.b = (String) obj2;
            if (objArr.length >= 3) {
                this.c = objArr[2];
            }
            Object a2 = g.a(objArr, 3);
            this.d = a2 == null ? null : a2.toString();
            Object a3 = g.a(objArr, 4);
            if (a3 != null && (a3 instanceof JSONObject)) {
                this.e = (JSONObject) a3;
            }
            Object a4 = g.a(objArr, 5);
            if (a4 == null || !(a4 instanceof String)) {
                return;
            }
            this.f = (String) a4;
        }
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.b = null;
        this.f3755a = null;
        this.c = null;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-1799391262);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }
    }
}
