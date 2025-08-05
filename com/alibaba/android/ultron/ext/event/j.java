package com.alibaba.android.ultron.ext.event;

import com.alibaba.android.ultron.event.q;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class j extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(120283590);
    }

    public abstract void a_(com.alibaba.android.ultron.event.base.e eVar);

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public JSONObject d(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("568f0900", new Object[]{this, eVar});
        }
        Object i = eVar.i();
        if (!(i instanceof DMEvent)) {
            return null;
        }
        return ((DMEvent) i).getFields();
    }

    @Override // com.alibaba.android.ultron.event.q
    public final void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        com.alibaba.android.ultron.ext.event.util.c.a(getClass().getSimpleName(), "commonEventStart", "事件开始");
        JSONObject c = eVar.c("key$event_data");
        if (c != null && d(eVar) != null) {
            com.alibaba.android.ultron.ext.event.util.h.a(d(eVar), c, "native$next");
        }
        a_(eVar);
        if (e()) {
            return;
        }
        com.alibaba.android.ultron.ext.event.util.c.a(getClass().getSimpleName(), "commonEventEnd", "事件结束");
    }

    public void a(com.alibaba.android.ultron.event.base.e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e19a440d", new Object[]{this, eVar, str});
        } else {
            a(eVar, str, (JSONObject) null);
        }
    }

    public void a(com.alibaba.android.ultron.event.base.e eVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33096c83", new Object[]{this, eVar, str, jSONObject});
            return;
        }
        if (e()) {
            com.alibaba.android.ultron.ext.event.util.c.a(getClass().getSimpleName(), "commonEventEnd", "事件结束");
        }
        com.alibaba.android.ultron.ext.event.util.c.a(getClass().getSimpleName(), "eventChainNext", "准备执行下一个事件");
        JSONObject d = d(eVar);
        if (d == null || !(d.get("native$next") instanceof JSONObject) || !(d.getJSONObject("native$next").get(str) instanceof JSONArray)) {
            com.alibaba.android.ultron.ext.event.util.c.a(getClass().getSimpleName(), "eventChainOver", "事件链结束");
        } else {
            a(eVar, d.getJSONObject("native$next").getJSONArray(str), jSONObject);
        }
    }

    public void a(com.alibaba.android.ultron.event.base.e eVar, JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("544a2a25", new Object[]{this, eVar, jSONArray, jSONObject});
        } else if (jSONArray == null) {
        } else {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) next;
                    a(eVar, jSONObject2.getString("type"), jSONObject2.getJSONObject("fields"), jSONObject);
                }
            }
        }
    }

    public void b(com.alibaba.android.ultron.event.base.e eVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc17d48e", new Object[]{this, eVar, jSONObject});
        } else if (jSONObject == null) {
        } else {
            a(eVar, jSONObject.getString("type"), jSONObject.getJSONObject("fields"), (JSONObject) null);
        }
    }

    public void b(com.alibaba.android.ultron.event.base.e eVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c0a084", new Object[]{this, eVar, str, jSONObject});
        } else {
            a(eVar, str, jSONObject, (JSONObject) null);
        }
    }

    public void a(com.alibaba.android.ultron.event.base.e eVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        com.alibaba.android.ultron.event.base.f d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec3aacd", new Object[]{this, eVar, str, jSONObject, jSONObject2});
        } else if (eVar.h() == null || (d = eVar.h().d()) == null) {
        } else {
            com.alibaba.android.ultron.event.base.e a2 = d.a();
            a2.a(eVar.d());
            if (this.c != null) {
                a2.a(this.c.e());
            }
            a2.a("key$event_data", jSONObject2);
            com.taobao.android.ultron.common.model.b a3 = com.alibaba.android.ultron.ext.event.util.i.a(new DMEvent(str, jSONObject, null), eVar.h());
            a2.a(a3);
            a2.a(a3.getType());
            d.a(a2);
        }
    }
}
