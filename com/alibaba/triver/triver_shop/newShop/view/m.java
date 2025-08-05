package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.cannal_engine.event.WidgetRenderContainer;
import com.alibaba.triver.cannal_engine.event.nativeembed.NativeWidgetNestedRenderContainer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.t;
import tb.ceg;
import tb.cen;
import tb.kge;
import tb.rul;
import tb.ruw;

/* loaded from: classes3.dex */
public final class m extends b implements TRWidgetInstance.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f4002a;
    private final com.alibaba.triver.triver_shop.newShop.data.g b;
    private TRWidgetInstance c;
    private JSONObject d;
    private String e;
    private final kotlin.d f;
    private final boolean g;
    private final boolean h;

    static {
        kge.a(-386039604);
        kge.a(410076142);
    }

    public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
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

    public static final /* synthetic */ void a(m mVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b51abf", new Object[]{mVar, str});
        } else {
            mVar.e = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, com.alibaba.triver.triver_shop.newShop.data.g tabBarItemDataModel) {
        super(context, tabBarItemDataModel);
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(tabBarItemDataModel, "tabBarItemDataModel");
        this.f4002a = context;
        this.b = tabBarItemDataModel;
        this.f = kotlin.e.a(new ShopWidgetContentRender$rootView$2(this));
        this.g = cen.Companion.E();
        this.h = cen.Companion.F();
        this.d = this.b.i();
    }

    private final FrameLayout a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("46931b71", new Object[]{this}) : (FrameLayout) this.f.getValue();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        TRWidgetInstance tRWidgetInstance = this.c;
        if (tRWidgetInstance == null) {
            return;
        }
        tRWidgetInstance.pause();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        TRWidgetInstance tRWidgetInstance = this.c;
        if (tRWidgetInstance == null) {
            return;
        }
        tRWidgetInstance.resume();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void d() {
        TRWidgetInstance tRWidgetInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        TRWidgetInstance tRWidgetInstance2 = this.c;
        if (tRWidgetInstance2 != null) {
            tRWidgetInstance2.pause();
        }
        if (this.h && (tRWidgetInstance = this.c) != null) {
            tRWidgetInstance.onDetach(null);
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.f4002a);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : a();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void g() {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        super.g();
        try {
            Result.a aVar = Result.Companion;
            TRWidgetInstance tRWidgetInstance = this.c;
            if (tRWidgetInstance != null) {
                tRWidgetInstance.destroy();
            }
            this.c = null;
            a().removeAllViews();
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

    @Override // com.alibaba.triver.triver_shop.newShop.view.b
    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.c != null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void c() {
        TRWidgetInstance tRWidgetInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        if (this.h && (tRWidgetInstance = this.c) != null) {
            tRWidgetInstance.onAttach(null);
        }
        n();
        com.alibaba.triver.triver_shop.newShop.ext.b.a(new ShopWidgetContentRender$onViewSelectedByViewPager$1(this), 200L);
    }

    private final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (this.c != null || !(this.f4002a instanceof FragmentActivity)) {
        } else {
            i();
            TRWidgetInstance tRWidgetInstance = new TRWidgetInstance((FragmentActivity) this.f4002a);
            tRWidgetInstance.registerWidgetRenderListener(this);
            tRWidgetInstance.setRootContainer(new NativeWidgetNestedRenderContainer(this.f4002a, WidgetRenderContainer.GestureMode.ALL));
            this.c = tRWidgetInstance;
            a(new ShopWidgetContentRender$doWidgetRender$1(this, tRWidgetInstance), ShopWidgetContentRender$doWidgetRender$2.INSTANCE);
        }
    }

    private final void a(rul<? super JSONObject, t> rulVar, ruw<? super Integer, ? super String, t> ruwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67d4d40b", new Object[]{this, rulVar, ruwVar});
        } else if (this.d == null) {
        } else {
            Pair[] pairArr = new Pair[7];
            com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
            String str = null;
            pairArr[0] = kotlin.j.a("shopId", g == null ? null : g.T());
            com.alibaba.triver.triver_shop.newShop.data.d g2 = this.b.g();
            pairArr[1] = kotlin.j.a("sellerId", g2 == null ? null : g2.U());
            JSONObject jSONObject = this.d;
            pairArr[2] = kotlin.j.a("moduleId", jSONObject == null ? null : jSONObject.getString("moduleId"));
            pairArr[3] = kotlin.j.a("scene", "shop_tab3");
            pairArr[4] = kotlin.j.a("renderType", "livecard");
            Pair[] pairArr2 = new Pair[1];
            JSONObject jSONObject2 = this.d;
            if (jSONObject2 != null) {
                str = jSONObject2.getString("sceneId");
            }
            pairArr2[0] = kotlin.j.a("sceneId", str);
            pairArr[5] = kotlin.j.a("bizParams", com.alibaba.triver.triver_shop.newShop.ext.d.a(pairArr2).toString());
            pairArr[6] = kotlin.j.a("renderOptions", com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a("sdkVersion", "1.1.9")).toString());
            com.alibaba.triver.triver_shop.newShop.ext.a.a(this.f4002a, "mtop.taobao.wireless.module.render.v2", "1.0", ai.c(pairArr), new ShopWidgetContentRender$requestWidgetRenderInfo$1(rulVar), new ShopWidgetContentRender$requestWidgetRenderInfo$2(ruwVar), false, false, false, null, false, null, RSoException.ERROR_LOAD_FALLBACK_SYSTEM_LOAD_FAILED, null);
        }
    }

    @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.g
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        ceg.Companion.b("widgetContainer render success");
        j();
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
}
