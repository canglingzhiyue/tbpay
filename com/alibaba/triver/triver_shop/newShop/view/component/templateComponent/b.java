package com.alibaba.triver.triver_shop.newShop.view.component.templateComponent;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.k;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import kotlin.Result;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.kge;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class b extends com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final rul<Integer, t> f;
    private final ruk<t> g;
    private final String h;

    static {
        kge.a(563388348);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1862045111) {
            super.b((View) objArr[0]);
            return null;
        } else if (hashCode != -511102794) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((Context) objArr[0], (com.alibaba.triver.triver_shop.newShop.data.d) objArr[1], (com.alibaba.triver.triver_shop.newShop.ext.e) objArr[2], (JSONObject) objArr[3]);
            return null;
        }
    }

    public /* synthetic */ b(rul rulVar, ruk rukVar, int i, o oVar) {
        this(rulVar, (i & 2) != 0 ? null : rukVar);
    }

    public static final /* synthetic */ rul a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("a2ccefff", new Object[]{bVar}) : bVar.f;
    }

    public static final /* synthetic */ void a(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1febc765", new Object[]{bVar, new Integer(i)});
        } else {
            bVar.b(i);
        }
    }

    public static final /* synthetic */ ruk b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("11540121", new Object[]{bVar}) : bVar.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(rul<? super Integer, t> rulVar, ruk<t> rukVar) {
        this.f = rulVar;
        this.g = rukVar;
        this.h = "tb_shop_bottom_bar_2022";
    }

    public final String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this}) : this.h;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a
    public void a(Context context, com.alibaba.triver.triver_shop.newShop.data.d shopData, com.alibaba.triver.triver_shop.newShop.ext.e shopDXEngine, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e18930b6", new Object[]{this, context, shopData, shopDXEngine, jSONObject});
            return;
        }
        q.d(context, "context");
        q.d(shopData, "shopData");
        q.d(shopDXEngine, "shopDXEngine");
        super.a(context, shopData, shopDXEngine, jSONObject);
        JSONObject l = shopData.l(this.h);
        if (l == null) {
            ceg.Companion.b(q.a("can not find shop template : ", (Object) this.h));
            shopDXEngine.d();
            return;
        }
        JSONObject M = shopData.M();
        M.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, (String) 0);
        com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a.a(this, l, M, false, 4, null);
        shopDXEngine.c().a(com.alibaba.triver.triver_shop.newShop.data.h.bottomBarArea, new a(shopData, context));
        k.a(shopData, shopData.p());
    }

    /* loaded from: classes3.dex */
    public static final class a extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d b;
        public final /* synthetic */ Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.alibaba.triver.triver_shop.newShop.data.d dVar, Context context) {
            super(context, b.this);
            this.b = dVar;
            this.c = context;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.data.h.b
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            } else if (obj == null || !(obj instanceof String)) {
            } else {
                int a2 = com.alibaba.triver.triver_shop.newShop.ext.b.a((String) obj);
                rul a3 = b.a(b.this);
                if (a3 != null) {
                    a3.mo2421invoke(Integer.valueOf(a2));
                }
                b.a(b.this, a2);
                com.alibaba.triver.triver_shop.newShop.ext.b.b(new BottomBarComponent$init$1$switchTabTo$1(this.b, a2));
            }
        }

        @Override // com.alibaba.triver.triver_shop.newShop.data.h.b
        public void h(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad80430b", new Object[]{this, obj});
                return;
            }
            ruk b = b.b(b.this);
            if (b == null) {
                return;
            }
            b.mo2427invoke();
        }
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            b(i);
        }
    }

    private final void b(int i) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (q.a((Object) a().L(), (Object) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_DONG_TAI)) {
            jSONObject.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SUBSCRIBE_SUBJECT_TYPE_RED_DOT, (String) false);
            com.alibaba.triver.triver_shop.newShop.ext.b.a("updateZuoPinTabCount", new BottomBarComponent$onBottomTabChangedCheckRedDotStatusAndUpdateIndex$1(this));
        }
        if (q.a((Object) a().L(), (Object) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_ALL_ITEMS)) {
            try {
                Result.a aVar = Result.Companion;
                if (q.a((Object) true, ((DXRootView) e()).getData().get(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SHOW_ALL_ITEM_RED_DOT))) {
                    m();
                }
                m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
            }
            Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
            if (m2374exceptionOrNullimpl != null) {
                ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
            }
            jSONObject.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SHOW_ALL_ITEM_RED_DOT, (String) false);
        }
        jSONObject.put((JSONObject) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, (String) Integer.valueOf(i));
        a(jSONObject);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        q.d(view, "view");
        super.b(view);
        k();
        if (q.a((Object) a().L(), (Object) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_DONG_TAI)) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.h.a(a(), new BottomBarComponent$createViewCallback$1(this));
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            b(com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("transparentBgColor", Boolean.valueOf(z))));
        }
    }

    private final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.h.c(a());
        }
    }
}
