package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.ext.event.util.h;
import com.alibaba.android.ultron.vfw.instance.b;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bkz implements blb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b f25957a;
    public final String b = "pageback";
    private final Map<String, blc> c = new HashMap();

    static {
        kge.a(644717382);
        kge.a(-317659353);
        kge.a(2134128932);
    }

    public bkz(b bVar) {
        this.f25957a = bVar;
    }

    public blb a(String str, bla blaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (blb) ipChange.ipc$dispatch("b8ce01e3", new Object[]{this, str, blaVar});
        }
        blc blcVar = new blc(str, blaVar);
        synchronized (this) {
            if (b(str) != null) {
                return this;
            }
            this.c.put(str, blcVar);
            return this;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        synchronized (this) {
            if (b(str) == null) {
                return;
            }
            this.c.remove(str);
        }
    }

    private blc b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (blc) ipChange.ipc$dispatch("7d1a277a", new Object[]{this, str}) : this.c.get(str);
    }

    @Override // tb.blb
    public void a(String str, JSONObject jSONObject) {
        List<com.taobao.android.ultron.common.model.b> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject a3 = a();
        if (jSONObject != null && a3 != null && a3.containsKey(str) && (a2 = a(a3.getJSONArray(str), jSONObject, null)) != null) {
            this.f25957a.d().a(a2);
        }
        a(jSONObject);
    }

    private List<com.taobao.android.ultron.common.model.b> a(JSONArray jSONArray, JSONObject jSONObject, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("747031d6", new Object[]{this, jSONArray, jSONObject, list});
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                h.a(next, jSONObject, "", "triggerData");
                com.taobao.android.ultron.common.model.b a2 = a((JSONObject) next, list);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }

    private JSONObject a() {
        JSONObject c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        jny b = this.f25957a.b();
        if (b != null && (c = b.c()) != null) {
            return c.getJSONObject("pageEvents");
        }
        return null;
    }

    private com.taobao.android.ultron.common.model.b a(JSONObject jSONObject, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.ultron.common.model.b) ipChange.ipc$dispatch("572e4f4c", new Object[]{this, jSONObject, list});
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            return new DMEvent(jSONObject.getString("type"), jSONObject.getJSONObject("fields"), list);
        }
        return null;
    }

    private void a(JSONObject jSONObject) {
        List<IDMComponent> b;
        List<com.taobao.android.ultron.common.model.b> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        b bVar = this.f25957a;
        if (bVar == null || bVar.b() == null || (b = this.f25957a.b().b()) == null) {
            return;
        }
        for (IDMComponent iDMComponent : b) {
            if (iDMComponent != null && iDMComponent.getEventMap() != null && iDMComponent.getEventMap().containsKey("pageback") && (list = iDMComponent.getEventMap().get("pageback")) != null) {
                for (int i = 0; i < list.size(); i++) {
                    com.taobao.android.ultron.common.model.b bVar2 = list.get(i);
                    if (bVar2 != null) {
                        String type = bVar2.getType();
                        if (!TextUtils.isEmpty(type)) {
                            e a2 = this.f25957a.d().a().a(type);
                            a2.a(iDMComponent);
                            a2.e("pageback");
                            a2.a(bVar2);
                            this.f25957a.d().a(a2);
                        }
                    }
                }
            }
        }
    }
}
