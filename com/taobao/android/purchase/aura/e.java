package com.taobao.android.purchase.aura;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.lightbuy.prefetch.LightBuyWeexPrefetch;
import com.taobao.android.purchase.aura.annotation.TBBuyPageMode;
import com.taobao.android.purchase.aura.plugin.TBBuyCommonWeexModule;
import com.taobao.android.purchase.preload.TBBuyPreloadFactory;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.taobao.R;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.afi;
import tb.akt;
import tb.arc;
import tb.ard;
import tb.baw;
import tb.dst;
import tb.dui;
import tb.dux;
import tb.fke;
import tb.ifz;
import tb.kge;
import tb.nhk;
import tb.nhl;
import tb.rib;
import tb.sqz;
import tb.tdh;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final FragmentActivity f14732a;
    private final c b;
    private final boolean c;
    private final ViewGroup d;
    private final d e;
    private dst f;
    private final AtomicBoolean g = new AtomicBoolean(false);
    private JSONObject h;
    private final HashMap<String, Object> i;
    private final com.taobao.android.lightbuy.a j;
    private String k;

    static {
        kge.a(-1398611805);
    }

    public static /* synthetic */ JSONObject a(e eVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9e1e7ad", new Object[]{eVar, jSONObject});
        }
        eVar.h = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ void a(e eVar, AURAParseIO aURAParseIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1bf39f3", new Object[]{eVar, aURAParseIO});
        } else {
            eVar.a(aURAParseIO);
        }
    }

    public static /* synthetic */ boolean a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a03daec7", new Object[]{eVar})).booleanValue() : eVar.i();
    }

    public static /* synthetic */ ViewGroup b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("d04483d1", new Object[]{eVar}) : eVar.d;
    }

    public static /* synthetic */ AtomicBoolean c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("7b4ab3c5", new Object[]{eVar}) : eVar.g;
    }

    public static /* synthetic */ void d(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461e2fc6", new Object[]{eVar});
        } else {
            eVar.j();
        }
    }

    public e(FragmentActivity fragmentActivity, c cVar, a aVar, ViewGroup viewGroup) {
        this.f14732a = fragmentActivity;
        this.b = cVar;
        this.d = viewGroup;
        this.j = new com.taobao.android.lightbuy.a(fragmentActivity);
        this.j.a();
        this.i = g();
        this.e = new d(this.f14732a, this.i, this.b, aVar);
        this.f = new com.taobao.android.buy.internal.a();
        this.f.a(this.e);
        this.k = dui.c(fke.b(this.f14732a));
        if (baw.a() && "未知源".equals(this.k)) {
            rib.a(this.f14732a, "请在下单链接增加openFrom=xxx参数，方便业务统计，详情联系@云铂");
        }
        TBBuyCommonWeexModule.registerModule();
        this.c = sqz.b();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (AliBuyPerfSwitcher.enablePreRender()) {
        } else {
            try {
                h();
            } catch (Throwable th) {
                ifz.a("preloadPurchaseView", "设备等级:" + akt.a() + "|" + th.getMessage());
            }
        }
    }

    private HashMap<String, Object> g() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("7ba5ef51", new Object[]{this});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(com.taobao.android.lightbuy.a.KEY_LIGHT_BUY, this.j);
        boolean enableStreamResponse = AliBuyPerfSwitcher.enableStreamResponse();
        boolean enablePopupWindowStreamResponse = AliBuyPerfSwitcher.enablePopupWindowStreamResponse();
        hashMap.put("enableStreamResponse", Boolean.valueOf(TBBuyPageMode.fullPageMode.equals(this.b.bc_()) && (enableStreamResponse || enablePopupWindowStreamResponse)));
        hashMap.put("enablePopupWindowStreamResponse", Boolean.valueOf(enablePopupWindowStreamResponse));
        if (enablePopupWindowStreamResponse || AliBuyPerfSwitcher.enableForceMainThreadPerf()) {
            z = true;
        }
        hashMap.put("enableForceMainThread", Boolean.valueOf(z));
        hashMap.put("pageType", this.b.bc_());
        hashMap.put("DXEngineRouter", TBBuyPreloadFactory.f14761a);
        return hashMap;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        sqz.c();
        if (i()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (2 == akt.a()) {
            z = true;
        }
        boolean enableInteractionPerf = AliBuyPerfSwitcher.enableInteractionPerf();
        if (z) {
            b(enableInteractionPerf);
        } else {
            a(enableInteractionPerf);
        }
        ard a2 = arc.a();
        a2.a("预渲染完成，耗时 = " + (System.currentTimeMillis() - currentTimeMillis), arc.a.a().a("AURA/performance").b());
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        ifz.a(ifz.a.b("noNeedPreloadPurchaseView").c(this.c ? "无需预渲染" : "预渲染").c("c1", 2 == akt.a() ? "低端机" : "中高端机").a(this.c).a(0.001f));
        return this.c;
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (!z || TBBuyPageMode.halfPageMode.equals(this.b.bc_()) || com.taobao.android.tbelder.b.c() || com.alibaba.ability.localization.b.c()) {
            arc.a().a("enableInteractionPerf disable");
        } else {
            Intent b = fke.b(this.f14732a);
            if (b == null) {
                tdh.b("EMPTY_INTENT_FORM_(preloadMainPageV2)", "intent is empty");
                return;
            }
            String stringExtra = b.getStringExtra("PRELOAD");
            if (StringUtils.isEmpty(stringExtra)) {
                arc.a().a("identifier is empty");
                return;
            }
            JSONObject b2 = nhk.b(stringExtra);
            if (b2 == null) {
                arc.a().a("protocol is empty");
            } else {
                nhl.a(b2, this.f14732a);
            }
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!z || TBBuyPageMode.halfPageMode.equals(this.b.bc_()) || com.taobao.android.tbelder.b.c() || com.alibaba.ability.localization.b.c()) {
            arc.a().a("enableInteractionPerf disable");
        } else {
            Intent b = fke.b(this.f14732a);
            if (b == null) {
                tdh.b("EMPTY_INTENT_FORM_(preloadMainPage)", "intent is empty");
                return;
            }
            String stringExtra = b.getStringExtra("PRELOAD");
            if (StringUtils.isEmpty(stringExtra)) {
                arc.a().a("identifier is empty");
                return;
            }
            JSONObject a2 = nhk.a(this.f14732a, stringExtra);
            if (a2 == null) {
                arc.a().a("protocol is empty");
            } else {
                this.f.a(a2, new dst.a<Void, View>() { // from class: com.taobao.android.purchase.aura.e.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        e.this = this;
                    }

                    @Override // tb.dst.a
                    public Void a(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Void) ipChange2.ipc$dispatch("f546c53", new Object[]{this, view});
                        }
                        if (view == null) {
                            UnifyLog.d("TBBuyController", "add failed, view is null");
                            return null;
                        } else if (e.a(e.this) || e.b(e.this).indexOfChild(view) >= 0 || e.c(e.this).get()) {
                            return null;
                        } else {
                            e.d(e.this);
                            e.b(e.this).removeAllViews();
                            e.b(e.this).addView(view);
                            UnifyLog.b("TBBuyController", "add success");
                            return null;
                        }
                    }
                });
            }
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f14732a.findViewById(R.id.purchase_title);
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(0);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        dst dstVar = this.f;
        if (dstVar != null) {
            dstVar.b();
        }
        this.f = new com.taobao.android.buy.internal.a();
        this.f.a(this.e);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        dst dstVar = this.f;
        if (dstVar == null) {
            return;
        }
        dstVar.a(jSONObject);
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        dst dstVar = this.f;
        if (dstVar == null) {
            return;
        }
        dstVar.a(str, jSONObject);
    }

    public String f() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        if (baw.a() && new File("/data/local/tmp/.forceNativeRender").exists()) {
            return null;
        }
        if (baw.a() && new File("/data/local/tmp/.forceWeexRender").exists()) {
            return afi.a();
        }
        JSONObject jSONObject2 = this.h;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("global")) == null) {
            return null;
        }
        String string = jSONObject.getString("renderContainer");
        String string2 = jSONObject.getString("lightBuyUrl");
        if (!"weex".equals(string)) {
            return null;
        }
        return StringUtils.isEmpty(string2) ? LightBuyWeexPrefetch.a() : string2;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        dst dstVar = this.f;
        if (dstVar == null) {
            return;
        }
        dstVar.a();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        e();
        c();
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        arc.a().b("buildPurchasePage");
        tdh.a("FullScreen-Native", this.k);
        this.f.a(new dst.a<Void, View>() { // from class: com.taobao.android.purchase.aura.TBBuyController$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dst.a
            public Void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("f546c53", new Object[]{this, view});
                }
                if (view == null) {
                    UnifyLog.d("TBBuyController", "add failed, view is null");
                    return null;
                } else if (e.b(e.this).indexOfChild(view) >= 0) {
                    return null;
                } else {
                    e.c(e.this).set(true);
                    e.d(e.this);
                    e.b(e.this).removeAllViews();
                    e.b(e.this).addView(view);
                    UnifyLog.b("TBBuyController", "add success");
                    return null;
                }
            }
        });
    }

    public final void a(final g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a03e9781", new Object[]{this, gVar});
        } else if (gVar == null) {
        } else {
            this.f.b(new dst.a<Void, AURAParseIO>() { // from class: com.taobao.android.purchase.aura.e.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    e.this = this;
                }

                @Override // tb.dst.a
                public Void a(AURAParseIO aURAParseIO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("6015bc25", new Object[]{this, aURAParseIO});
                    }
                    List<com.alibaba.android.aura.datamodel.parse.a> data = aURAParseIO.getData();
                    e.a(e.this, data.get(0).a());
                    String f = e.this.f();
                    if (!StringUtils.isEmpty(f)) {
                        gVar.a(f, data, null);
                    } else {
                        arc.a().b("lightBuyUrl is null");
                        e.a(e.this, aURAParseIO);
                    }
                    return null;
                }
            });
        }
    }

    private final void a(AURAParseIO aURAParseIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb929d8", new Object[]{this, aURAParseIO});
        } else if (this.f == null) {
        } else {
            tdh.a("Float-Native", this.k);
            this.f.a(aURAParseIO, new dst.a<Void, View>() { // from class: com.taobao.android.purchase.aura.e.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    e.this = this;
                }

                @Override // tb.dst.a
                public Void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("f546c53", new Object[]{this, view});
                    }
                    if (view == null) {
                        UnifyLog.d("TBBuyController", "add failed, view is null");
                        return null;
                    } else if (e.b(e.this).indexOfChild(view) >= 0) {
                        return null;
                    } else {
                        e.d(e.this);
                        e.b(e.this).removeAllViews();
                        e.b(e.this).addView(view);
                        e.c(e.this).set(true);
                        UnifyLog.b("TBBuyController", "add success");
                        return null;
                    }
                }
            });
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.j.c();
        dst dstVar = this.f;
        if (dstVar == null) {
            return;
        }
        dstVar.b();
        TBBuyPreloadFactory.a();
    }

    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i == 69) {
            if (i2 == 0) {
                fke.a(this.f14732a);
            } else {
                c();
            }
        } else if (i == 4321) {
            if (i2 != -1) {
                return;
            }
            fke.a(this.f14732a);
        } else if (i == 4322) {
            dux.c(this.f14732a);
            fke.a(this.f14732a);
        } else {
            dst dstVar = this.f;
            if (dstVar == null) {
                return;
            }
            dstVar.a(i, i2, intent);
        }
    }
}
