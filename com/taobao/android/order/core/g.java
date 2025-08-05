package com.taobao.android.order.core;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.dln;
import tb.fuf;
import tb.hzc;
import tb.hzd;
import tb.hzv;
import tb.jpo;
import tb.kge;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public hzc f14630a;
    public OrderConfigs b;

    static {
        kge.a(-2119966893);
    }

    private g(OrderConfigs orderConfigs) {
        boolean z;
        this.b = orderConfigs;
        this.f14630a = orderConfigs.t();
        if (this.f14630a == null) {
            this.f14630a = hzd.a(orderConfigs);
            z = false;
        } else {
            z = true;
        }
        if (orderConfigs.u() != null) {
            jpo.b(orderConfigs.u()).a("d5", "isAsyncCreateUltronProxy", String.valueOf(z));
        }
    }

    public static g a(OrderConfigs orderConfigs) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("553fa97e", new Object[]{orderConfigs}) : new g(orderConfigs);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        hzc hzcVar = this.f14630a;
        if (hzcVar == null) {
            return;
        }
        hzcVar.a(this.b.d);
        this.f14630a.a(this.b.b);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        hzc hzcVar = this.f14630a;
        if (hzcVar == null) {
            return;
        }
        hzcVar.a();
    }

    public hzv c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hzv) ipChange.ipc$dispatch("1e690eb8", new Object[]{this});
        }
        OrderConfigs orderConfigs = this.b;
        if (orderConfigs != null) {
            return orderConfigs.c;
        }
        return null;
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b320d2", new Object[]{this, cVar});
            return;
        }
        OrderConfigs orderConfigs = this.b;
        if (orderConfigs == null) {
            return;
        }
        a(orderConfigs.f14610a, cVar);
    }

    public void a(JSONObject jSONObject, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("627ef5b2", new Object[]{this, jSONObject, cVar});
            return;
        }
        hzc hzcVar = this.f14630a;
        if (hzcVar == null) {
            return;
        }
        hzcVar.a(jSONObject, cVar);
    }

    public void a(h hVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad81432d", new Object[]{this, hVar, cVar});
            return;
        }
        hzc hzcVar = this.f14630a;
        if (hzcVar == null) {
            return;
        }
        hzcVar.a(hVar, cVar);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        hzc hzcVar = this.f14630a;
        if (hzcVar == null) {
            return;
        }
        hzcVar.b();
    }

    public void a(Long l, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("554e6d68", new Object[]{this, l, dXWidgetNode});
            return;
        }
        hzc hzcVar = this.f14630a;
        if (hzcVar == null) {
            return;
        }
        hzcVar.a(l, dXWidgetNode);
    }

    public void a(Long l, fuf fufVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("829d1340", new Object[]{this, l, fufVar});
            return;
        }
        hzc hzcVar = this.f14630a;
        if (hzcVar == null) {
            return;
        }
        hzcVar.a(l, fufVar);
    }

    public void a(String str, com.alibaba.android.ultron.vfw.viewholder.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8561f26", new Object[]{this, str, eVar});
            return;
        }
        hzc hzcVar = this.f14630a;
        if (hzcVar == null) {
            return;
        }
        hzcVar.a(str, eVar);
    }

    public void a(String str, com.alibaba.android.ultron.event.base.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e1ac1a", new Object[]{this, str, dVar});
            return;
        }
        hzc hzcVar = this.f14630a;
        if (hzcVar == null) {
            return;
        }
        hzcVar.a(str, dVar);
    }

    public void a(String str, dln dlnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2548edfc", new Object[]{this, str, dlnVar});
            return;
        }
        hzc hzcVar = this.f14630a;
        if (hzcVar == null) {
            return;
        }
        hzcVar.a(str, dlnVar);
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        hzc hzcVar = this.f14630a;
        if (hzcVar == null) {
            return;
        }
        hzcVar.a(str, jSONObject);
    }

    public void a(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeb8c227", new Object[]{this, dXRootView, jSONObject});
            return;
        }
        hzc hzcVar = this.f14630a;
        if (hzcVar == null) {
            return;
        }
        hzcVar.a(dXRootView, jSONObject);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        hzc hzcVar = this.f14630a;
        if (hzcVar == null) {
            return;
        }
        hzcVar.a(str);
    }

    public hzc e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hzc) ipChange.ipc$dispatch("2dcc5729", new Object[]{this}) : this.f14630a;
    }
}
