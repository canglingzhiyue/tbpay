package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.af;
import com.taobao.tao.flexbox.layoutmanager.core.l;
import com.taobao.tao.flexbox.layoutmanager.core.y;
import com.taobao.tao.flexbox.layoutmanager.filter.a;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class ogi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Object f32031a;
    public String b;
    public aa c;
    public aa d;
    public JSONObject e;
    public JSONObject f;
    public JSONObject g;
    public aa.d h;
    public g.c i;
    public boolean j;
    public boolean k;

    static {
        kge.a(671296053);
    }

    public ogi(aa aaVar, String str, aa aaVar2, g.c cVar) {
        this.j = false;
        this.k = oeb.cs();
        this.b = str;
        this.c = aaVar;
        this.d = aaVar2;
        this.i = cVar;
        this.j = true;
    }

    public ogi(g.c cVar, aa aaVar, JSONObject jSONObject, aa aaVar2, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        this.j = false;
        this.k = oeb.cs();
        this.i = cVar;
        this.b = jSONObject.getString("name");
        this.f32031a = jSONObject.get("if");
        this.c = aaVar;
        this.d = aaVar2;
        this.e = jSONObject2;
        this.f = jSONObject3;
        this.g = jSONObject4;
        if (jSONObject5 != null) {
            this.h = new aa.d(null, jSONObject5);
        }
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.g;
        if (jSONObject == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            this.d.a(entry.getKey(), entry.getValue());
        }
        aa L = this.d.L();
        L.l();
        L.a(this.d.N(), this.h);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public aa.d c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa.d) ipChange.ipc$dispatch("4b95b94", new Object[]{this}) : this.h;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ogi)) {
            return false;
        }
        ogi ogiVar = (ogi) obj;
        return this.d == ogiVar.d && this.b.equals(ogiVar.b) && this.j == ogiVar.j;
    }

    public aa a(final aa aaVar, final Map map) {
        Object e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("fda002a9", new Object[]{this, aaVar, map});
        }
        if (this.j) {
            g.c cVar = this.i;
            if (cVar != null) {
                cVar.c.a(this.i, map);
            }
            return null;
        }
        y yVar = new y() { // from class: tb.ogi.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.y
            public Object a(String str, String str2, List list) {
                Class c;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("7e58fc65", new Object[]{this, str, str2, list});
                }
                List<String> b = oec.b(str2.substring(2), '.');
                if (b != null && b.size() == 2 && (c = ogi.this.d.k().c(b.get(0))) != null) {
                    return a.a(this, str, ogi.this.d.k(), b.get(0), c, b.get(1), list);
                }
                return null;
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.y
            public Object a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("17307540", new Object[]{this, str});
                }
                if (str.equals(".")) {
                    return map;
                }
                if (str.startsWith("$")) {
                    if (str.charAt(1) != '.') {
                        return null;
                    }
                    String substring = str.substring(2);
                    if (substring.startsWith("vm.")) {
                        return af.a((af) null, ogi.this.d.M().C(), substring.substring(3));
                    }
                    if (substring.equals("props")) {
                        return aaVar.A();
                    }
                    if (substring.startsWith("props.")) {
                        return af.a((af) null, aaVar.A(), substring.substring(6));
                    }
                    if (substring.startsWith("attrs.")) {
                        return aaVar.e(substring.substring(6));
                    }
                    if (substring.equals(Constants.Weex.INSTANCEID)) {
                        return Integer.valueOf(aaVar.M().E());
                    }
                    return af.a((af) null, ogi.this.d.k().m(), substring);
                }
                return af.a((af) null, map, str);
            }
        };
        Object obj = this.f32031a;
        if (obj != null && !oec.a(l.a("if", obj, yVar), false)) {
            return null;
        }
        JSONObject jSONObject = this.e;
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                this.d.a(entry.getKey(), entry.getValue());
            }
        }
        HashMap hashMap = new HashMap();
        JSONObject jSONObject2 = this.f;
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry2 : jSONObject2.entrySet()) {
                String key = entry2.getKey();
                Object a2 = l.a(key, entry2.getValue(), yVar);
                if (this.k) {
                    e = this.d.c(key, a2);
                } else {
                    e = this.d.e(key);
                    this.d.a(key, a2);
                }
                if (!oec.a(e, a2)) {
                    hashMap.put(key, a2);
                }
            }
        }
        g.c cVar2 = this.i;
        if (cVar2 != null && cVar2.c != null && !hashMap.isEmpty()) {
            this.i.c.a(this.i, hashMap);
        }
        if (this.k) {
            return this.d.a((Map<String, Object>) hashMap, (aa.d) null, false);
        }
        if (this.d.s() && !this.d.n()) {
            this.d.I().parseViewParams(this.d.y());
        }
        return this.d.L();
    }
}
