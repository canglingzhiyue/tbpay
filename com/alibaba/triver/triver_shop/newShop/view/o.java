package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.cannal_engine.event.WidgetRenderContainer;
import com.alibaba.triver.cannal_engine.event.nativeembed.NativeWidgetNestedRenderContainer;
import com.alibaba.triver.triver_shop.newShop.view.h;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.t;
import tb.ceg;
import tb.cek;
import tb.cen;
import tb.kge;
import tb.rul;
import tb.ruw;

/* loaded from: classes3.dex */
public final class o implements TRWidgetInstance.g, h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f4007a;
    private final com.alibaba.triver.triver_shop.newShop.data.d b;
    private boolean c;
    private TRWidgetInstance d;
    private JSONObject e;
    private String f;
    private final FrameLayout g;
    private final View h;
    private boolean i;
    private final boolean j;
    private final boolean k;

    static {
        kge.a(-347505112);
        kge.a(-884443079);
        kge.a(410076142);
    }

    public o(Context context, com.alibaba.triver.triver_shop.newShop.data.d shopData) {
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(shopData, "shopData");
        this.f4007a = context;
        this.b = shopData;
        FrameLayout frameLayout = new FrameLayout(this.f4007a);
        frameLayout.setBackgroundColor(-1);
        t tVar = t.INSTANCE;
        this.g = frameLayout;
        View view = new View(this.f4007a);
        com.alibaba.triver.triver_shop.newShop.ext.o.a(view, cek.Companion.f());
        t tVar2 = t.INSTANCE;
        this.h = view;
        this.j = cen.Companion.E();
        this.k = cen.Companion.F();
        this.e = this.b.aU();
    }

    public static final /* synthetic */ void a(o oVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6c08ffd", new Object[]{oVar, str});
        } else {
            oVar.f = str;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            h.a.a(this, f);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.c;
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.o.d(this.h);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        h.a.a(this);
        TRWidgetInstance tRWidgetInstance = this.d;
        if (tRWidgetInstance == null) {
            return;
        }
        tRWidgetInstance.pause();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        h.a.b(this);
        TRWidgetInstance tRWidgetInstance = this.d;
        if (tRWidgetInstance == null) {
            return;
        }
        tRWidgetInstance.resume();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void d() {
        TRWidgetInstance tRWidgetInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        h.a.d(this);
        TRWidgetInstance tRWidgetInstance2 = this.d;
        if (tRWidgetInstance2 != null) {
            tRWidgetInstance2.pause();
        }
        if (this.k && (tRWidgetInstance = this.d) != null) {
            tRWidgetInstance.onDetach(null);
        }
        String str = "a2141.b61969235." + ((Object) this.f) + ".0";
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this.f4007a, "Page_Shop_brandshop_tab3");
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.f4007a, ai.c(kotlin.j.a("spm-cnt", str), kotlin.j.a("seller_id", this.b.U()), kotlin.j.a("shop_id", this.b.T())));
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(ai.a(kotlin.j.a("spm-url", str)));
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.f4007a);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.g;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void c() {
        TRWidgetInstance tRWidgetInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        h.a.c(this);
        if (this.k && (tRWidgetInstance = this.d) != null) {
            tRWidgetInstance.onAttach(null);
        }
        i();
        if (!this.i) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.f4007a);
        }
        UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this.f4007a);
    }

    private final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.d != null) {
        } else {
            Context context = this.f4007a;
            if (!(context instanceof FragmentActivity)) {
                return;
            }
            TRWidgetInstance tRWidgetInstance = new TRWidgetInstance((FragmentActivity) context);
            tRWidgetInstance.registerWidgetRenderListener(this);
            tRWidgetInstance.setRootContainer(new NativeWidgetNestedRenderContainer(this.f4007a, WidgetRenderContainer.GestureMode.ALL));
            this.d = tRWidgetInstance;
            a(new Tab3ContentRender$doWidgetRender$1(this, tRWidgetInstance), Tab3ContentRender$doWidgetRender$2.INSTANCE);
        }
    }

    private final void a(rul<? super JSONObject, t> rulVar, ruw<? super Integer, ? super String, t> ruwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67d4d40b", new Object[]{this, rulVar, ruwVar});
        } else if (this.e == null) {
        } else {
            Pair[] pairArr = new Pair[7];
            pairArr[0] = kotlin.j.a("shopId", this.b.T());
            pairArr[1] = kotlin.j.a("sellerId", this.b.U());
            JSONObject jSONObject = this.e;
            String str = null;
            pairArr[2] = kotlin.j.a("moduleId", jSONObject == null ? null : jSONObject.getString("moduleId"));
            pairArr[3] = kotlin.j.a("scene", "shop_tab3");
            pairArr[4] = kotlin.j.a("renderType", "livecard");
            Pair[] pairArr2 = new Pair[1];
            JSONObject jSONObject2 = this.e;
            if (jSONObject2 != null) {
                str = jSONObject2.getString("sceneId");
            }
            pairArr2[0] = kotlin.j.a("sceneId", str);
            pairArr[5] = kotlin.j.a("bizParams", com.alibaba.triver.triver_shop.newShop.ext.d.a(pairArr2).toString());
            pairArr[6] = kotlin.j.a("renderOptions", com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a("sdkVersion", "1.1.9")).toString());
            com.alibaba.triver.triver_shop.newShop.ext.a.a(this.f4007a, "mtop.taobao.wireless.module.render.v2", "1.0", ai.c(pairArr), new Tab3ContentRender$requestWidgetRenderInfo$1(rulVar), new Tab3ContentRender$requestWidgetRenderInfo$2(ruwVar), false, false, false, null, false, null, RSoException.ERROR_LOAD_FALLBACK_SYSTEM_LOAD_FAILED, null);
        }
    }

    @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.g
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            ceg.Companion.b("widgetContainer render success");
        }
    }

    @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.g
    public void a(com.alibaba.triver.cannal_engine.common.a aVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af2eb696", new Object[]{this, aVar, map});
            return;
        }
        ceg.a aVar2 = ceg.Companion;
        StringBuilder sb = new StringBuilder();
        sb.append("widgetContainer render Error : ");
        String str = null;
        sb.append((Object) (aVar == null ? null : aVar.f3640a));
        sb.append(' ');
        if (aVar != null) {
            str = aVar.b;
        }
        sb.append((Object) str);
        aVar2.b(sb.toString());
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public void g() {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            TRWidgetInstance tRWidgetInstance = this.d;
            if (tRWidgetInstance != null) {
                tRWidgetInstance.destroy();
            }
            this.d = null;
            this.g.removeAllViews();
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
