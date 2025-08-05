package com.alibaba.triver.triver_shop.newShop.ext;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.extension.dianmicX.a;
import com.alibaba.triver.triver_shop.extension.dianmicX.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bv;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.HashMap;
import kotlin.Result;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.fvb;
import tb.fve;
import tb.kge;
import tb.ruk;
import tb.rul;
import tb.ruw;

/* loaded from: classes3.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Activity f3850a;
    private com.alibaba.triver.triver_shop.newShop.data.d b;
    private final DinamicXEngine c;
    private final com.alibaba.triver.triver_shop.newShop.data.h d;
    private final HashMap<Integer, ruw<DXTemplateItem, Boolean, t>> e;
    private boolean f;

    static {
        kge.a(759461211);
    }

    public e(Activity context) {
        q.d(context, "context");
        this.f3850a = context;
        this.d = new com.alibaba.triver.triver_shop.newShop.data.h();
        this.e = new HashMap<>();
        DXEngineConfig.a aVar = new DXEngineConfig.a("shop");
        aVar.b(2);
        aVar.a(DXEngineConfig.ImageQuality.q90);
        aVar.c(true);
        if (!com.alibaba.triver.triver_shop.newShop.ext.b.f(this.f3850a)) {
            aVar.a(true, true);
            aVar.a(new b());
        }
        this.c = new DinamicXEngine(aVar.a());
        this.c.a(com.alibaba.triver.triver_shop.extension.dianmicX.a.DXSHOPAUTOSCROLLTEXTVIEW_SHOPAUTOSCROLLTEXTVIEW, new a.C0132a());
        this.c.a(com.alibaba.triver.triver_shop.extension.dianmicX.b.DXSHOPBOTTOMBARDYNAMICICON_SHOPBOTTOMBARDYNAMICICON, new b.a());
        this.c.a(new fve() { // from class: com.alibaba.triver.triver_shop.newShop.ext.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fve
            public final void onNotificationListener(fvb fvbVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
                    return;
                }
                for (DXTemplateItem dXTemplateItem : fvbVar.f28139a) {
                    if (dXTemplateItem instanceof com.alibaba.triver.triver_shop.newShop.data.b) {
                        com.alibaba.triver.triver_shop.newShop.ext.b.b(new ShopDXEngine$1$1(e.this, dXTemplateItem));
                    }
                }
                for (DXTemplateItem dXTemplateItem2 : fvbVar.b) {
                    if (dXTemplateItem2 instanceof com.alibaba.triver.triver_shop.newShop.data.b) {
                        com.alibaba.triver.triver_shop.newShop.ext.b.b(new ShopDXEngine$1$2(e.this, dXTemplateItem2));
                    }
                }
            }
        });
        this.c.a(g.TB_SHOP_TAP_EVENT_CODE, new a(this));
    }

    public static final /* synthetic */ void a(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4983153", new Object[]{eVar, new Boolean(z)});
        } else {
            eVar.f = z;
        }
    }

    public final com.alibaba.triver.triver_shop.newShop.data.d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.data.d) ipChange.ipc$dispatch("820aec79", new Object[]{this}) : this.b;
    }

    public final void a(com.alibaba.triver.triver_shop.newShop.data.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d8442f9", new Object[]{this, dVar});
        } else {
            this.b = dVar;
        }
    }

    public final DinamicXEngine b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("870a047e", new Object[]{this}) : this.c;
    }

    public final com.alibaba.triver.triver_shop.newShop.data.h c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.data.h) ipChange.ipc$dispatch("9212877", new Object[]{this}) : this.d;
    }

    /* loaded from: classes3.dex */
    public static final class b extends bv {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.dinamicx.bv
        public int ap2Px(DinamicXEngine dinamicXEngine, Context context, float f) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("207edfae", new Object[]{this, dinamicXEngine, context, new Float(f)})).intValue() : o.g(Float.valueOf(f));
        }

        @Override // com.taobao.android.dinamicx.bv
        public int px2Ap(DinamicXEngine dinamicXEngine, Context context, float f) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d721afdc", new Object[]{this, dinamicXEngine, context, new Float(f)})).intValue() : o.h(Float.valueOf(f));
        }
    }

    private final void a(JSONObject jSONObject, int i, ruw<? super DXTemplateItem, ? super Boolean, t> ruwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da9f4d7", new Object[]{this, jSONObject, new Integer(i), ruwVar});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.b bVar = (com.alibaba.triver.triver_shop.newShop.data.b) f.a(jSONObject);
        bVar.a(i);
        this.e.put(Integer.valueOf(i), ruwVar);
        this.c.a(kotlin.collections.p.a(bVar));
    }

    public final void a(JSONObject dxJsonConfig, JSONObject data, int i, boolean z, rul<? super View, t> createViewCallback, ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce6167c8", new Object[]{this, dxJsonConfig, data, new Integer(i), new Boolean(z), createViewCallback, rukVar});
            return;
        }
        q.d(dxJsonConfig, "dxJsonConfig");
        q.d(data, "data");
        q.d(createViewCallback, "createViewCallback");
        DXTemplateItem a2 = this.c.a(f.a(dxJsonConfig));
        if (a2 != null && TextUtils.equals(dxJsonConfig.getString("version"), String.valueOf(a2.b))) {
            createViewCallback.mo2421invoke(a(a2, data, z));
            ceg.Companion.b(q.a("dx template fetch success : ", (Object) a2.toString()));
            return;
        }
        a(dxJsonConfig, i, new ShopDXEngine$fetchAndDownloadDxTemplate$1(createViewCallback, this, data, z, dxJsonConfig, rukVar));
    }

    private final View a(DXTemplateItem dXTemplateItem, JSONObject jSONObject, boolean z) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e1af2cb7", new Object[]{this, dXTemplateItem, jSONObject, new Boolean(z)});
        }
        DXTemplateItem a2 = this.c.a(dXTemplateItem);
        DXResult<DXRootView> b2 = this.c.b(this.f3850a, a2);
        if (z) {
            this.c.a(this.f3850a, b2.f11780a, a2, jSONObject, -1, new DXRenderOptions.a().a(-2).a());
        } else {
            this.c.a(b2.f11780a, jSONObject);
        }
        DXRootView dXRootView = b2.f11780a;
        q.b(dXRootView, "viewResult.result");
        o.g(dXRootView);
        try {
            Result.a aVar = Result.Companion;
            if (b2.b()) {
                ceg.Companion.b(q.a("template render Error : ", (Object) dXTemplateItem));
                for (s.a aVar2 : b2.a().c) {
                    ceg.Companion.b(aVar2.toString());
                }
            }
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar3 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl != null) {
            ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
        }
        DXRootView dXRootView2 = b2.f11780a;
        q.b(dXRootView2, "viewResult.result");
        return dXRootView2;
    }

    public final void d() {
        t tVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            com.alibaba.triver.triver_shop.newShop.data.d a2 = a();
            if (a2 == null) {
                tVar = null;
            } else {
                a2.c("downgradeToMiniAppShop", (Object) 1);
                tVar = t.INSTANCE;
            }
            Result.m2371constructorimpl(tVar);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
        ShopDXEngine$downgradeToMiniAppShop$block$1 shopDXEngine$downgradeToMiniAppShop$block$1 = new ShopDXEngine$downgradeToMiniAppShop$block$1(this);
        if (com.alibaba.triver.triver_shop.newShop.ext.b.a()) {
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new ShopDXEngine$downgradeToMiniAppShop$2(shopDXEngine$downgradeToMiniAppShop$block$1));
        } else {
            shopDXEngine$downgradeToMiniAppShop$block$1.mo2427invoke();
        }
    }

    /* loaded from: classes3.dex */
    public final class a extends com.taobao.android.dinamicx.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f3852a;

        static {
            kge.a(-551031852);
        }

        public a(e this$0) {
            q.d(this$0, "this$0");
            this.f3852a = this$0;
        }

        @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
        public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            } else {
                this.f3852a.c().a(this.f3852a.a(), objArr, dXRuntimeContext);
            }
        }
    }
}
