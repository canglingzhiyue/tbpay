package com.alibaba.triver.triver_shop.newShop.view.component.templateComponent;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.c;
import com.alibaba.triver.triver_shop.newShop.ext.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.cen;
import tb.kge;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class f extends com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final rul<f, t> f;
    private final ruk<Boolean> g;
    private final String h;
    private boolean i;
    private final b j;

    /* loaded from: classes3.dex */
    public static final class a extends c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.alibaba.triver.triver_shop.c.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            f.a(f.this, z);
            f.this.a("followStatus", Boolean.valueOf(z));
            if (!z) {
                com.alibaba.triver.triver_shop.newShop.ext.h.a(f.this.a(), false, (rul<? super Map<String, String>, t>) new ShopHeaderComponent$createViewCallback$followCallback$1$followResult$1(f.this));
            }
            ceg.Companion.b(q.a("first follow status : ", (Object) Boolean.valueOf(z)));
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.alibaba.triver.triver_shop.c.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            f.a(f.this, z);
            f.this.a("followStatus", Boolean.valueOf(z));
            com.alibaba.triver.triver_shop.newShop.ext.h.a(f.this.a(), z);
            com.alibaba.triver.triver_shop.newShop.event.broadcast.a z2 = f.this.a().z();
            if (z2 == null) {
                return;
            }
            z2.a(z);
        }
    }

    static {
        kge.a(2051227699);
    }

    public f() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
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

    public /* synthetic */ f(rul rulVar, ruk rukVar, int i, o oVar) {
        this((i & 1) != 0 ? null : rulVar, (i & 2) != 0 ? null : rukVar);
    }

    public static final /* synthetic */ void a(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2024653a", new Object[]{fVar, new Boolean(z)});
        } else {
            fVar.i = z;
        }
    }

    public static final /* synthetic */ boolean a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("10968de", new Object[]{fVar})).booleanValue() : fVar.i;
    }

    public static final /* synthetic */ b b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("94e4d12d", new Object[]{fVar}) : fVar.j;
    }

    public static final /* synthetic */ ruk c(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("d36ddd66", new Object[]{fVar}) : fVar.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(rul<? super f, t> rulVar, ruk<Boolean> rukVar) {
        this.f = rulVar;
        this.g = rukVar;
        this.h = "tb_shop_flagship_header_info_2022";
        this.j = new b();
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
        com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a.a(this, l, shopData.N(), false, 4, null);
        shopDXEngine.c().a(com.alibaba.triver.triver_shop.newShop.data.h.headerInfoArea, new c(context, shopData));
    }

    /* loaded from: classes3.dex */
    public static final class c extends com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;
        public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d c;

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == 982009030) {
                super.c(objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, com.alibaba.triver.triver_shop.newShop.data.d dVar) {
            super(context, f.this);
            this.b = context;
            this.c = dVar;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.data.h.b
        public void d(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84b9de07", new Object[]{this, obj});
            } else if (f.a(f.this)) {
                com.alibaba.triver.triver_shop.c.b((Activity) this.b, this.c.U(), f.b(f.this));
                j.e(this.c);
            } else {
                com.alibaba.triver.triver_shop.c.a((Activity) this.b, this.c.U(), f.b(f.this));
                j.d(this.c);
            }
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.c, com.alibaba.triver.triver_shop.newShop.data.h.b
        public void c(Object obj) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a8844c6", new Object[]{this, obj});
                return;
            }
            ruk c = f.c(f.this);
            if (c != null && !((Boolean) c.mo2427invoke()).booleanValue()) {
                z = true;
            }
            if (z) {
                return;
            }
            super.c(obj);
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            b(com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a("isLivePage", Boolean.valueOf(z))));
        }
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (!z) {
        } else {
            a("styleStatus", "live");
        }
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            a("styleStatus", z ? "default" : "folded");
        }
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            a("hasNavView", Boolean.valueOf(z));
        }
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            b(com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a("clearScreenStatus", Boolean.valueOf(z))));
        }
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
        rul<f, t> rulVar = this.f;
        if (rulVar != null) {
            rulVar.mo2421invoke(this);
        }
        a aVar = new a();
        if (cen.Companion.m()) {
            aVar.a(a().ak());
        } else {
            com.alibaba.triver.triver_shop.c.c((Activity) b(), a().U(), aVar);
        }
    }

    public final void a(boolean z, JSONObject jSONObject) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        a("followStatus", Boolean.valueOf(z));
        try {
            Result.a aVar = Result.Companion;
            View e = e();
            com.alibaba.triver.triver_shop.newShop.ext.h.a(e instanceof DXRootView ? (DXRootView) e : null, jSONObject);
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
    }
}
