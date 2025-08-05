package com.alibaba.triver.triver_shop.newShop.view.component.templateComponent;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionSizeFrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import kotlin.Result;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.kge;
import tb.ruw;

/* loaded from: classes3.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.alibaba.triver.triver_shop.newShop.data.d f3952a;
    public Context b;
    public com.alibaba.triver.triver_shop.newShop.ext.e c;
    public PerceptionSizeFrameLayout d;
    public View e;
    private JSONObject f;
    private boolean g;
    private ruw<? super a, ? super ViewGroup.LayoutParams, t> h;

    static {
        kge.a(-89648725);
    }

    public final com.alibaba.triver.triver_shop.newShop.data.d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.triver.triver_shop.newShop.data.d) ipChange.ipc$dispatch("820aec79", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.f3952a;
        if (dVar != null) {
            return dVar;
        }
        q.b("shopData");
        throw null;
    }

    public final void a(com.alibaba.triver.triver_shop.newShop.data.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d8442f9", new Object[]{this, dVar});
            return;
        }
        q.d(dVar, "<set-?>");
        this.f3952a = dVar;
    }

    public final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        q.d(context, "<set-?>");
        this.b = context;
    }

    public final Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[]{this});
        }
        Context context = this.b;
        if (context != null) {
            return context;
        }
        q.b("context");
        throw null;
    }

    public final void a(com.alibaba.triver.triver_shop.newShop.ext.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a54f35a1", new Object[]{this, eVar});
            return;
        }
        q.d(eVar, "<set-?>");
        this.c = eVar;
    }

    public final com.alibaba.triver.triver_shop.newShop.ext.e c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.triver.triver_shop.newShop.ext.e) ipChange.ipc$dispatch("c1332025", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.ext.e eVar = this.c;
        if (eVar != null) {
            return eVar;
        }
        q.b("shopDXEngine");
        throw null;
    }

    public final void a(PerceptionSizeFrameLayout perceptionSizeFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fdf7f71", new Object[]{this, perceptionSizeFrameLayout});
            return;
        }
        q.d(perceptionSizeFrameLayout, "<set-?>");
        this.d = perceptionSizeFrameLayout;
    }

    public final PerceptionSizeFrameLayout d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PerceptionSizeFrameLayout) ipChange.ipc$dispatch("548a1034", new Object[]{this});
        }
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.d;
        if (perceptionSizeFrameLayout != null) {
            return perceptionSizeFrameLayout;
        }
        q.b("rootLayout");
        throw null;
    }

    public final void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        q.d(view, "<set-?>");
        this.e = view;
    }

    public final View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("42261fae", new Object[]{this});
        }
        View view = this.e;
        if (view != null) {
            return view;
        }
        q.b("dxRootView");
        throw null;
    }

    public final void a(ruw<? super a, ? super ViewGroup.LayoutParams, t> ruwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc53bc4", new Object[]{this, ruwVar});
        } else {
            this.h = ruwVar;
        }
    }

    public void a(Context context, com.alibaba.triver.triver_shop.newShop.data.d shopData, com.alibaba.triver.triver_shop.newShop.ext.e shopDXEngine, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e18930b6", new Object[]{this, context, shopData, shopDXEngine, jSONObject});
            return;
        }
        q.d(context, "context");
        q.d(shopData, "shopData");
        q.d(shopDXEngine, "shopDXEngine");
        a(shopData);
        a(shopDXEngine);
        a(context);
        this.f = jSONObject;
        a(new PerceptionSizeFrameLayout(context));
        this.g = true;
    }

    public View f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8c57b8ef", new Object[]{this}) : d();
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.g;
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else if (this.e == null) {
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.f.a(c(), e(), str, obj);
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (this.e == null) {
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.f.a(c(), e(), jSONObject);
        }
    }

    public final void q() {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (this.e == null) {
        } else {
            try {
                Result.a aVar = Result.Companion;
                c().b().a((DXRootView) e(), (JSONObject) ((DXRootView) e()).getData().clone());
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

    public static /* synthetic */ void a(a aVar, JSONObject jSONObject, JSONObject jSONObject2, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d184c8a", new Object[]{aVar, jSONObject, jSONObject2, new Boolean(z), new Integer(i), obj});
        } else if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderTemplate");
        } else {
            if ((i & 4) != 0) {
                z = false;
            }
            aVar.a(jSONObject, jSONObject2, z);
        }
    }

    public void a(JSONObject templateJSON, JSONObject templateData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7727ef6c", new Object[]{this, templateJSON, templateData, new Boolean(z)});
            return;
        }
        q.d(templateJSON, "templateJSON");
        q.d(templateData, "templateData");
        c().a(templateJSON, templateData, hashCode(), z, new BaseTemplateComponent$renderTemplate$1(this), new BaseTemplateComponent$renderTemplate$2(this));
    }

    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        q.d(view, "view");
        a(view);
        d().addView(e());
        ruw<? super a, ? super ViewGroup.LayoutParams, t> ruwVar = this.h;
        if (ruwVar == null) {
            return;
        }
        ruwVar.mo2423invoke(this, j());
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        if (this.e != null) {
            return o.f(d());
        }
        return false;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.e != null;
    }

    public final ViewGroup.LayoutParams j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("cf416efe", new Object[]{this});
        }
        ViewGroup.LayoutParams layoutParams = e().getLayoutParams();
        q.b(layoutParams, "dxRootView.layoutParams");
        return layoutParams;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            c().b().b((DXRootView) e());
        }
    }

    public final void b(JSONObject newNativeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, newNativeData});
            return;
        }
        q.d(newNativeData, "newNativeData");
        if (!h()) {
            return;
        }
        JSONObject jSONObject = com.alibaba.triver.triver_shop.newShop.ext.h.a(e()).getJSONObject("nativeData");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = (JSONObject) jSONObject.clone();
        jSONObject2.putAll(newNativeData);
        ceg.Companion.a(q.a("updateNativeData : ", (Object) newNativeData.toJSONString()));
        a("nativeData", jSONObject2);
    }
}
