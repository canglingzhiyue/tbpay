package com.taobao.android.detail.core.aura.wrapper;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.bst;
import tb.egt;
import tb.eir;
import tb.emu;
import tb.emx;
import tb.end;
import tb.eng;
import tb.enh;
import tb.eox;
import tb.epe;
import tb.eqb;
import tb.god;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final DetailCoreActivity f9406a;
    private com.taobao.android.detail.datasdk.model.datamodel.node.b b;

    static {
        kge.a(913361274);
    }

    public a(DetailCoreActivity detailCoreActivity) {
        this.f9406a = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.aura.wrapper.AliDetailAuraDataWrapper");
    }

    public a(DetailCoreActivity detailCoreActivity, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        this.f9406a = detailCoreActivity;
        this.b = bVar;
        emu.a("com.taobao.android.detail.core.aura.wrapper.AliDetailAuraDataWrapper");
    }

    public void a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c456302", new Object[]{this, bVar});
        } else {
            this.b = bVar;
        }
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        JSONObject l = this.b.l();
        if (l != null && !l.isEmpty()) {
            return a(l, "detailInfoAura");
        }
        return null;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        JSONObject l = this.b.l();
        if (l != null && !l.isEmpty()) {
            return a(l, "bottomBar");
        }
        return null;
    }

    public enh c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enh) ipChange.ipc$dispatch("1e6782dd", new Object[]{this});
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = this.b;
        if (bVar != null) {
            return b(bVar);
        }
        return null;
    }

    public enh b(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IDMComponent a2;
        end endVar;
        epe epeVar;
        epe epeVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enh) ipChange.ipc$dispatch("fc9fe0e4", new Object[]{this, bVar});
        }
        eng engVar = new eng(bVar, null, null, null);
        engVar.d = new egt((IDMComponent) null, bVar);
        engVar.b = new com.taobao.android.detail.datasdk.model.datamodel.node.c(bVar);
        eox m = emx.a(this.f9406a).b().m();
        boolean z = god.m && bVar.n();
        JSONObject a3 = a(bVar.a());
        if (z) {
            a2 = c.h(a3);
        } else {
            a2 = c.a(a3);
        }
        epe d = m.d(c.b(a3), bVar);
        epe d2 = m.d(a2, bVar);
        FeatureNode f = eqb.f(bVar);
        if (f != null && f.isDetail3HeaderPic && f.isDetail3) {
            if (eir.b()) {
                epeVar = m.d(c.d(a3), bVar);
                i.d(com.taobao.android.detail.core.performance.i.a("", BTags.TTNavBar), "ttNavBarVM:" + epeVar);
            } else {
                epeVar = null;
            }
            if (!eir.c() || z) {
                epeVar2 = null;
            } else {
                epe d3 = m.d(c.c(a3), bVar);
                i.d(com.taobao.android.detail.core.performance.i.a("", BTags.TTFloat), "ttFloatVM:" + d3);
                epeVar2 = d3;
            }
            endVar = new end(engVar, d, d2, epeVar2, epeVar);
        } else {
            i.d(com.taobao.android.detail.core.performance.i.a("", BTags.TTNavBar), "no detail3 feature, init pre navbar");
            endVar = new end(engVar, d, d2);
        }
        return new enh(engVar, endVar);
    }

    private JSONObject a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a5543672", new Object[]{this, jSONObject, str});
        }
        JSONObject a2 = bst.a(a(jSONObject), str);
        JSONObject jSONObject2 = new JSONObject(a2.getJSONObject("hierarchy"));
        JSONObject jSONObject3 = new JSONObject(a2);
        jSONObject2.put("root", (Object) str);
        jSONObject3.put("hierarchy", (Object) jSONObject2);
        return jSONObject3;
    }

    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONArray("apiStack").getJSONObject(0).getJSONObject("data");
        return jSONObject2 == null ? jSONObject.getJSONArray("apiStack").getJSONObject(0).getJSONObject("value") : jSONObject2;
    }
}
