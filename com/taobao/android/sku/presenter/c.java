package com.taobao.android.sku.presenter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.bizevent.g;
import com.taobao.android.sku.presenter.f;
import com.taobao.android.sku.utils.o;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.Map;
import tb.fgl;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f15199a;
    private com.taobao.android.sku.c b;
    private long c;
    private boolean d;
    private String e;
    private f f;
    private a g;

    /* loaded from: classes6.dex */
    public interface a {
        boolean a();
    }

    static {
        kge.a(1164254131);
    }

    public static /* synthetic */ boolean a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("de47eea4", new Object[]{cVar})).booleanValue() : cVar.d;
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eab69838", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.d = z;
        return z;
    }

    public static /* synthetic */ com.taobao.android.sku.c b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.sku.c) ipChange.ipc$dispatch("1cb8f946", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ void c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f78844a2", new Object[]{cVar});
        } else {
            cVar.j();
        }
    }

    public static /* synthetic */ void d(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84286fa3", new Object[]{cVar});
        } else {
            cVar.k();
        }
    }

    public static /* synthetic */ void e(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c89aa4", new Object[]{cVar});
        } else {
            cVar.l();
        }
    }

    public c(Context context, com.taobao.android.sku.c cVar) {
        this.b = cVar;
        a(context);
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.f = new f(context);
        i();
        com.taobao.android.sku.presenter.a a2 = this.f.a();
        a(a2);
        a((d) a2);
    }

    private void a(com.taobao.android.sku.presenter.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de4705e2", new Object[]{this, aVar});
        } else {
            aVar.l().addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.sku.presenter.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == 806944192) {
                        super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                    if (i2 == 0 || c.a(c.this)) {
                        return;
                    }
                    o.a(c.b(c.this).g().b(), c.b(c.this).g().c(), c.b(c.this).s(), c.b(c.this).t());
                    c.a(c.this, true);
                }
            });
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            this.f.a(new f.a() { // from class: com.taobao.android.sku.presenter.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.sku.presenter.f.a
                public void a(com.taobao.android.sku.presenter.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("de4705e2", new Object[]{this, aVar});
                        return;
                    }
                    c.c(c.this);
                    c.a(c.this, false);
                    c.d(c.this);
                    c.e(c.this);
                    c.b(c.this).B();
                }
            });
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        long j = -1;
        if (this.c > 0) {
            j = System.currentTimeMillis() - this.c;
        }
        o.a(this.b.g().b(), this.b.g().c(), j, this.b.s(), this.b.t());
        try {
            com.taobao.android.behavir.a a2 = com.taobao.android.behavir.b.a();
            String b = this.b.g().b();
            Context o = this.b.o();
            a2.commitLeave(o.PAGE_NAME, b, o, "itemId=" + this.b.g().b(), "sellerId=" + this.b.g().c());
        } catch (Throwable unused) {
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        String str = this.e;
        this.e = this.b.c();
        if (!m() || str == null || str.equals(this.e)) {
            return;
        }
        com.alibaba.android.ultron.event.base.e a2 = this.b.k().d().a();
        a2.a(g.EVENT_TYPE);
        a2.a(new DMEvent(g.EVENT_TYPE, new JSONObject() { // from class: com.taobao.android.sku.presenter.AliXSkuPresenterEngine$3
            {
                put(fgl.ORIGINALITEMID, (Object) c.b(c.this).n());
                put(fgl.TARGETITEMID, (Object) c.b(c.this).n());
                put("params", (Object) new JSONObject() { // from class: com.taobao.android.sku.presenter.AliXSkuPresenterEngine$3.1
                    {
                        c cVar = c.this;
                        put("skuId", (Object) c.$ipChange);
                    }
                });
                put("sku_token", (Object) c.b(c.this).p());
            }
        }, null));
        this.b.k().d().a(a2);
    }

    private void l() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.taobao.sku.intent.action.syncData");
        JSONObject jSONObject2 = this.b.g().n().getJSONObject("id_biz_head");
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("selectedTextMap")) != null && !jSONObject.isEmpty()) {
            intent.putExtra("selectedTextMap", jSONObject.toJSONString());
        }
        intent.putExtra("uniqueId", this.b.p());
        intent.putExtra("onDismiss", "true");
        intent.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(this.b.o()).sendBroadcast(intent);
    }

    private boolean m() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        JSONObject m = this.b.m();
        if (m != null && (jSONObject = m.getJSONObject("feature")) != null) {
            return jSONObject.getBooleanValue("updateSkuOnCloseSkuBoard");
        }
        return false;
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de4862ff", new Object[]{this, dVar});
            return;
        }
        d dVar2 = this.f15199a;
        if (dVar2 != null && dVar2 != dVar && (dVar2 instanceof b) && (dVar instanceof b)) {
            ((b) dVar).a((b) dVar2);
        }
        this.f15199a = dVar;
    }

    public d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("72a74c85", new Object[]{this}) : this.f15199a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.e = this.b.c();
        d dVar = this.f15199a;
        if (dVar != null) {
            dVar.m();
        }
        this.c = System.currentTimeMillis();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        d dVar = this.f15199a;
        if (dVar == null) {
            return;
        }
        dVar.n();
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        d dVar = this.f15199a;
        if (!(dVar instanceof com.taobao.android.sku.presenter.a)) {
            return;
        }
        ((com.taobao.android.sku.presenter.a) dVar).a(map);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        d dVar = this.f15199a;
        if (!(dVar instanceof com.taobao.android.sku.presenter.a)) {
            return;
        }
        ((com.taobao.android.sku.presenter.a) dVar).a();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        d dVar = this.f15199a;
        if (!(dVar instanceof com.taobao.android.sku.presenter.a)) {
            return;
        }
        ((com.taobao.android.sku.presenter.a) dVar).b();
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        d dVar = this.f15199a;
        if (!(dVar instanceof com.taobao.android.sku.presenter.a)) {
            return false;
        }
        return ((com.taobao.android.sku.presenter.a) dVar).c();
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de48d75e", new Object[]{this, eVar});
            return;
        }
        d dVar = this.f15199a;
        if (!(dVar instanceof com.taobao.android.sku.presenter.a)) {
            return;
        }
        ((com.taobao.android.sku.presenter.a) dVar).a(eVar);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6adbbec3", new Object[]{this, aVar});
            return;
        }
        this.g = aVar;
        d dVar = this.f15199a;
        if (!(dVar instanceof b)) {
            return;
        }
        ((b) dVar).a(this.g);
    }

    public a h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("99c9f462", new Object[]{this}) : this.g;
    }
}
