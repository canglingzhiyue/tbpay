package com.taobao.android.detail.ttdetail.skeleton.recommend;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.ComponentViewMeta;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.utils.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.eyx;
import tb.eyy;
import tb.kge;
import tb.lfc;
import tb.lfm;

/* loaded from: classes5.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f10949a;
    private eyx b;
    private List<com.taobao.android.detail.ttdetail.component.module.e> c = new ArrayList();
    private boolean d;
    private JSONObject e;

    static {
        kge.a(223254730);
    }

    public f(Context context, eyx eyxVar, JSONObject jSONObject) {
        this.f10949a = context;
        this.b = eyxVar;
        a(jSONObject);
    }

    private void a(JSONObject jSONObject) {
        JSONArray jSONArray;
        Map<String, ComponentViewMeta> a2;
        com.taobao.android.detail.ttdetail.component.module.e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        c cVar = new c(this.f10949a, this.b);
        lfc lfcVar = (lfc) cVar.a(lfm.PARSER_ID, jSONObject);
        if (lfcVar == null || (jSONArray = jSONObject.getJSONArray("container")) == null || jSONArray.isEmpty() || (a2 = cVar.a(cVar.a(jSONArray))) == null || a2.isEmpty()) {
            return;
        }
        this.b.d().a(a2);
        for (eyy eyyVar : lfcVar.h()) {
            if (eyyVar != null && (eVar = (com.taobao.android.detail.ttdetail.component.module.e) this.b.d().a(eyyVar, new DataEntry[0])) != null) {
                this.c.add(eVar);
            }
        }
        i.a("RecommendViewModel", "recommendComponents.size= " + this.c.size());
        JSONObject jSONObject2 = jSONObject.getJSONObject("global");
        if (jSONObject2 == null) {
            return;
        }
        this.d = jSONObject2.getBooleanValue("hasNextPage");
        this.e = jSONObject2.getJSONObject("contextMap");
    }

    public List<com.taobao.android.detail.ttdetail.component.module.e> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.c;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.d;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.e;
    }
}
