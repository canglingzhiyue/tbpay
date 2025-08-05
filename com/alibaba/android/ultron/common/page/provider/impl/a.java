package com.alibaba.android.ultron.common.page.provider.impl;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.alibaba.android.ultron.common.page.e;
import com.alibaba.android.ultron.ext.event.e;
import com.alibaba.android.ultron.ext.event.f;
import com.alibaba.android.ultron.ext.event.g;
import com.alibaba.android.ultron.ext.event.h;
import com.alibaba.android.ultron.ext.event.i;
import com.alibaba.android.ultron.ext.event.k;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import java.util.Map;
import tb.bit;
import tb.biw;
import tb.bkq;
import tb.bkr;
import tb.bks;
import tb.bku;
import tb.bkv;
import tb.bkw;
import tb.bkx;
import tb.bky;
import tb.bkz;
import tb.bla;
import tb.boz;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class a implements com.alibaba.android.ultron.common.page.provider.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.alibaba.android.ultron.vfw.instance.d f2534a;
    public bkz b;
    public String c;
    public com.alibaba.android.ultron.common.page.provider.b d;

    static {
        kge.a(-121731658);
        kge.a(1189376219);
    }

    public abstract boz e();

    @Override // com.alibaba.android.ultron.common.page.provider.a
    public void a(Context context, String str, String str2, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa1409", new Object[]{this, context, str, str2, jSONObject, map});
            return;
        }
        this.c = str2;
        if (TextUtils.isEmpty(str)) {
            str = "ultroncommonpage";
        }
        UltronInstanceConfig c = new UltronInstanceConfig().a(true).a(str).c(false);
        if (bit.a("useMultiJsEngine", true)) {
            c.b(true);
        }
        this.f2534a = com.alibaba.android.ultron.vfw.instance.d.a(c, context);
        this.b = new bkz(this.f2534a);
        f();
    }

    @Override // com.alibaba.android.ultron.common.page.provider.a
    public void a(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8a8385a", new Object[]{this, linearLayout, recyclerView, linearLayout2});
            return;
        }
        this.f2534a.a(e());
        this.f2534a.a(linearLayout, recyclerView, linearLayout2);
        this.f2534a.n();
    }

    @Override // com.alibaba.android.ultron.common.page.provider.a
    public void a(com.alibaba.android.ultron.common.page.provider.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c229185f", new Object[]{this, bVar});
        } else {
            this.d = bVar;
        }
    }

    public com.alibaba.android.ultron.vfw.instance.d i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.instance.d) ipChange.ipc$dispatch("4e06af95", new Object[]{this}) : this.f2534a;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.f2534a.d().a("refreshMtopV3", new bkw());
        this.f2534a.d().a("weexPopV3", new k());
        this.f2534a.d().a("alipayV3", new com.alibaba.android.ultron.ext.event.b());
        this.f2534a.d().a("shareV3", new h());
        this.f2534a.d().a("dispatchV3", new com.alibaba.android.ultron.ext.event.c());
        this.f2534a.d().a("toastV3", new i());
        this.f2534a.d().a("alertV3", new com.alibaba.android.ultron.ext.event.a());
        this.f2534a.d().a("mtopV3", new e());
        this.f2534a.d().a("openUrlV3", new f());
        this.f2534a.d().a("groupSelectV3", new com.alibaba.android.ultron.ext.event.d());
        this.f2534a.d().a("shareWithRefreshV3", new bky());
        this.f2534a.d().a("mtopWithOpenUrlV3", new bkv());
        this.f2534a.d().a("alertWithMtopWithAlipayV3", new bkq());
        this.f2534a.d().a("alertWithOpenUrlV3", new bks());
        this.f2534a.d().a("alertWithMtopWithOpenUrlV3", new bkr());
        this.f2534a.d().a("mtopWithAlipayV3", new bku());
        this.f2534a.d().a("mtopWithRefreshWithOpenUrlV3", new bkx());
        this.f2534a.d().a("refreshPageV3", new g(new g.a() { // from class: com.alibaba.android.ultron.common.page.provider.impl.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.ext.event.g.a
            public void a(com.alibaba.android.ultron.event.base.e eVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93d93503", new Object[]{this, eVar});
                } else if (a.this.d == null) {
                } else {
                    a.this.d.a(eVar);
                }
            }
        }));
        this.f2534a.d().a("loadMore", new com.alibaba.android.ultron.common.page.f());
        this.b.a("loadMore", new bla());
        this.f2534a.d().a("loadData", new com.alibaba.android.ultron.common.page.e(new e.a() { // from class: com.alibaba.android.ultron.common.page.provider.impl.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.common.page.e.a
            public void a(JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                } else if (a.this.d == null) {
                } else {
                    a.this.d.a(jSONObject);
                }
            }
        }));
    }

    @Override // com.alibaba.android.ultron.common.page.provider.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b == null || this.f2534a.b() == null) {
        } else {
            JSONObject c = this.f2534a.b().c();
            JSONObject jSONObject = c != null ? c.getJSONObject("pageControl") : null;
            String string = jSONObject != null ? jSONObject.getString("nextPageIndex") : "0";
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(MtopModule.KEY_PAGE_INDEX, (Object) string);
            this.b.a("loadMore", jSONObject2);
        }
    }

    @Override // com.alibaba.android.ultron.common.page.provider.a
    public void a(JSONArray jSONArray) {
        com.alibaba.android.ultron.vfw.instance.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else if (jSONArray == null || jSONArray.size() <= 0 || (dVar = this.f2534a) == null || dVar.d() == null) {
        } else {
            this.f2534a.d().a(biw.a(jSONArray, null, null));
        }
    }

    @Override // com.alibaba.android.ultron.common.page.provider.a
    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        com.alibaba.android.ultron.vfw.instance.d dVar = this.f2534a;
        if (dVar != null && dVar.b() != null) {
            return this.f2534a.b().c();
        }
        return null;
    }

    @Override // com.alibaba.android.ultron.common.page.provider.a
    public boolean c() {
        List<IDMComponent> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        com.alibaba.android.ultron.vfw.instance.d dVar = this.f2534a;
        return (dVar == null || dVar.k() == null || (c = this.f2534a.k().c()) == null || c.size() <= 0) ? false : true;
    }

    @Override // com.alibaba.android.ultron.common.page.provider.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.d dVar = this.f2534a;
        if (dVar == null) {
            return;
        }
        dVar.m();
    }
}
