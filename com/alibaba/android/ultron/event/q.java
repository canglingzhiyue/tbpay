package com.alibaba.android.ultron.event;

import android.content.Context;
import com.alibaba.android.ultron.vfw.dataloader.d;
import com.alibaba.android.ultron.vfw.option.a;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.jny;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class q implements com.alibaba.android.ultron.event.base.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_LAST_EVENT_DATA = "extraData";
    public com.alibaba.android.ultron.event.base.e c;
    public Context d;
    public com.alibaba.android.ultron.vfw.instance.b e;
    public jny f;
    public IDMComponent g;
    public boolean h = false;
    public int i = 200;
    public long j = 0;
    public String k = "";

    static {
        kge.a(-1856771332);
        kge.a(-750523774);
    }

    public abstract void a(com.alibaba.android.ultron.event.base.e eVar);

    public void a(List<IDMComponent> list, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeecd4f5", new Object[]{this, list, obj});
        }
    }

    @Override // com.alibaba.android.ultron.event.base.d
    public final void b(com.alibaba.android.ultron.event.base.e eVar) {
        com.alibaba.android.ultron.vfw.instance.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d50c2a2", new Object[]{this, eVar});
        } else if (eVar == null) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.j < this.i && this.h && this.k.equals(eVar.b())) {
                return;
            }
            this.j = currentTimeMillis;
            this.k = eVar.b();
            this.c = eVar;
            this.d = eVar.a();
            this.e = eVar.h();
            if (this.d == null || (bVar = this.e) == null) {
                return;
            }
            this.f = bVar.b();
            this.g = eVar.d();
            IDMComponent iDMComponent = this.g;
            if (iDMComponent != null) {
                iDMComponent.updateModifiedCount();
            }
            a(eVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.h = true;
        }
    }

    public <T> T a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("9da1ccf7", new Object[]{this, new Integer(i)}) : (T) a("extraParams", i);
    }

    public <T> T b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6e4e661f", new Object[]{this, str});
        }
        com.alibaba.android.ultron.event.base.e eVar = this.c;
        if (eVar != null) {
            return (T) eVar.d(str);
        }
        return null;
    }

    private <T> T a(String str, int i) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("83330e41", new Object[]{this, str, new Integer(i)});
        }
        com.alibaba.android.ultron.event.base.e eVar = this.c;
        if (eVar == null) {
            return null;
        }
        Object d = eVar.d(str);
        if (d instanceof Object[]) {
            list = Arrays.asList((Object[]) d);
        } else {
            list = d instanceof List ? (List) d : null;
        }
        if (list != null && i < list.size()) {
            return (T) list.get(i);
        }
        return null;
    }

    public com.taobao.android.ultron.common.model.b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.ultron.common.model.b) ipChange.ipc$dispatch("b820e1dc", new Object[]{this});
        }
        com.alibaba.android.ultron.event.base.e eVar = this.c;
        if (eVar == null) {
            return null;
        }
        Object i = eVar.i();
        if (!(i instanceof com.taobao.android.ultron.common.model.b)) {
            return null;
        }
        return (com.taobao.android.ultron.common.model.b) i;
    }

    public JSONObject c() {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        com.taobao.android.ultron.common.model.b b = b();
        if (b != null && (fields = b.getFields()) != null) {
            return fields;
        }
        return null;
    }

    public boolean a(IDMComponent iDMComponent, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be0a1e1d", new Object[]{this, iDMComponent, map})).booleanValue();
        }
        if (map != null && !map.isEmpty() && iDMComponent != null) {
            try {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    iDMComponent.getFields().put(entry.getKey(), entry.getValue());
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public boolean a(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue() : a(this.g, map);
    }

    public boolean a(com.taobao.android.ultron.common.model.b bVar, Map<String, ? extends Object> map) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fc017b2", new Object[]{this, bVar, map})).booleanValue();
        }
        if (map == null || map.isEmpty() || bVar == null || (fields = bVar.getFields()) == null) {
            return false;
        }
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            fields.put(entry.getKey(), entry.getValue());
        }
        return true;
    }

    public void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else {
            a(jSONArray, (Object) null);
        }
    }

    public void a(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48168760", new Object[]{this, jSONArray, jSONObject});
        } else {
            a(jSONArray, (Object) null, (String) null, (JSONObject) null, (MtopResponse) null, jSONObject);
        }
    }

    public void a(JSONArray jSONArray, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("783a516c", new Object[]{this, jSONArray, obj});
        } else {
            a(jSONArray, obj, null, null);
        }
    }

    public void a(JSONArray jSONArray, Object obj, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbc2217a", new Object[]{this, jSONArray, obj, str, jSONObject});
        } else {
            a(jSONArray, obj, str, jSONObject, (MtopResponse) null);
        }
    }

    public void a(JSONArray jSONArray, Object obj, String str, JSONObject jSONObject, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1721bebf", new Object[]{this, jSONArray, obj, str, jSONObject, mtopResponse});
        } else {
            a(jSONArray, obj, str, jSONObject, mtopResponse, (JSONObject) null);
        }
    }

    public void a(JSONArray jSONArray, Object obj, String str, JSONObject jSONObject, MtopResponse mtopResponse, JSONObject jSONObject2) {
        com.alibaba.android.ultron.event.base.e a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adef9011", new Object[]{this, jSONArray, obj, str, jSONObject, mtopResponse, jSONObject2});
        } else if (jSONArray == null || jSONArray.isEmpty()) {
        } else {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    if (com.alibaba.android.ultron.vfw.option.a.a(this.e.g(), a.C0101a.MODULE_KEY_EVENT_ASYNC_SOURCE)) {
                        a2 = a((JSONObject) next, obj, str, jSONObject, mtopResponse, jSONObject2);
                    } else {
                        a2 = a((JSONObject) next, obj, str, jSONObject, mtopResponse);
                    }
                    c(a2);
                }
            }
        }
    }

    public com.alibaba.android.ultron.event.base.e a(JSONObject jSONObject, Object obj, String str, JSONObject jSONObject2, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.event.base.e) ipChange.ipc$dispatch("bcbe6122", new Object[]{this, jSONObject, obj, str, jSONObject2, mtopResponse}) : a(jSONObject, obj, str, jSONObject2, mtopResponse, (JSONObject) null);
    }

    public com.alibaba.android.ultron.event.base.e a(JSONObject jSONObject, Object obj, String str, JSONObject jSONObject2, MtopResponse mtopResponse, JSONObject jSONObject3) {
        com.alibaba.android.ultron.event.base.f d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.event.base.e) ipChange.ipc$dispatch("1d5b8364", new Object[]{this, jSONObject, obj, str, jSONObject2, mtopResponse, jSONObject3});
        }
        com.alibaba.android.ultron.vfw.instance.b bVar = this.e;
        if (bVar == null || (d = bVar.d()) == null) {
            return null;
        }
        com.alibaba.android.ultron.event.base.e a2 = d.a();
        a2.a(this.g);
        String string = jSONObject.getString("type");
        a2.a(string);
        if (obj != null) {
            a2.a("extraData", obj);
        }
        com.alibaba.android.ultron.event.base.e eVar = this.c;
        if (eVar != null) {
            a2.a(eVar.e());
        }
        a2.a(str, jSONObject2);
        a2.b(this.c.b(), jSONObject3);
        a2.a(str, mtopResponse);
        a2.a(new DMEvent(string, jSONObject.getJSONObject("fields"), null, jSONObject.getIntValue("option")));
        return a2;
    }

    public void c(com.alibaba.android.ultron.event.base.e eVar) {
        com.alibaba.android.ultron.vfw.instance.b bVar;
        com.alibaba.android.ultron.event.base.f d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c85041", new Object[]{this, eVar});
        } else if (eVar == null || (bVar = this.e) == null || (d = bVar.d()) == null) {
        } else {
            d.a(eVar);
        }
    }

    public Object d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("50c537a7", new Object[]{this});
        }
        com.alibaba.android.ultron.event.base.e eVar = this.c;
        if (eVar != null) {
            return eVar.d("extraData");
        }
        return null;
    }

    public final void a(com.alibaba.android.ultron.event.base.e eVar, JSONObject jSONObject) {
        com.alibaba.android.ultron.vfw.dataloader.d s;
        d.a d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4eef24d", new Object[]{this, eVar, jSONObject});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.b h = eVar.h();
        if (!(h instanceof com.alibaba.android.ultron.vfw.instance.d) || (s = ((com.alibaba.android.ultron.vfw.instance.d) h).s()) == null || (d = s.d()) == null) {
            return;
        }
        JSONObject jSONObject2 = d.c;
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        jSONObject2.put(eVar.b(), (Object) jSONObject);
    }
}
