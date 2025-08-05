package com.taobao.android.buy.extension.ability.validate;

import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.aln;
import tb.arc;
import tb.bau;
import tb.dtj;
import tb.dtk;
import tb.kge;

/* loaded from: classes4.dex */
public final class c extends dtj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f9226a;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public dtk f9227a = null;
        public AURARenderComponent b = null;

        static {
            kge.a(-866078293);
        }
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(615432498);
        f9226a = !c.class.desiredAssertionStatus();
    }

    @Override // tb.dtj
    public ExecuteResult a(JSONObject jSONObject, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("bb9ccd2a", new Object[]{this, jSONObject, alnVar});
        }
        JSONObject e = e();
        if (e == null) {
            arc.a().a("fields is null");
            return null;
        }
        a a2 = a(f(), e.getJSONArray("componentKeys"));
        if (a2.f9227a != null && !a2.f9227a.b()) {
            HashMap hashMap = new HashMap(jSONObject);
            if (!f9226a && a2.b.key == null) {
                throw new AssertionError();
            }
            hashMap.put("result", a2.b.key);
            alnVar.a(new FinishResult(hashMap, "success"));
        } else {
            alnVar.a(new FinishResult(null, "failure"));
        }
        return new FinishResult();
    }

    private JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this});
        }
        Object[] a2 = a();
        if (a2 == null) {
            return null;
        }
        Object obj = a2[1];
        if (!(obj instanceof JSONObject)) {
            arc.a().a("fields is null");
            return null;
        }
        return (JSONObject) obj;
    }

    private List<AURARenderComponent> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this});
        }
        if (d() == null) {
            return null;
        }
        return (List) d().get("render_view_item_models", List.class);
    }

    private a a(List<AURARenderComponent> list, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f811d73a", new Object[]{this, list, jSONArray});
        }
        a aVar = new a();
        if (list != null && !bau.a(jSONArray)) {
            Iterator<AURARenderComponent> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AURARenderComponent next = it.next();
                dtk a2 = a(next, jSONArray);
                if (!a2.b()) {
                    aVar.f9227a = a2;
                    aVar.b = next;
                    break;
                }
            }
        }
        return aVar;
    }

    private dtk a(AURARenderComponent aURARenderComponent, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dtk) ipChange.ipc$dispatch("e41f9ab0", new Object[]{this, aURARenderComponent, jSONArray});
        }
        if (!jSONArray.contains(aURARenderComponent.key)) {
            return dtk.a();
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null) {
            return dtk.a();
        }
        return b.a(aURARenderComponentData.fields, b.a(aURARenderComponentData.features));
    }
}
