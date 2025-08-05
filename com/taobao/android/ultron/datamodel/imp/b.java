package com.taobao.android.ultron.datamodel.imp;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.jny;
import tb.joe;
import tb.jok;
import tb.kge;

/* loaded from: classes6.dex */
public class b implements jny {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_TAG = "ultron-sdk";
    public static final int MERGE_MODE = 0;
    public static final int REPLACE_MODE = 1;
    private String A;
    private String B;
    private int C;
    private boolean D;
    private Map<String, DMComponent> E;
    private Map<String, String> F;
    private Set<String> G;

    /* renamed from: a  reason: collision with root package name */
    public List<IDMComponent> f15773a;
    public List<com.taobao.android.ultron.common.model.a> b;
    public Map<String, DMComponent> c;
    public Map<String, DMComponent> d;
    public List<jok> e;
    public boolean f;
    private c g;
    private JSONObject h;
    private JSONObject i;
    private JSONObject j;
    private JSONObject k;
    private JSONObject l;
    private JSONObject m;
    private JSONObject n;
    private JSONObject o;
    private JSONObject p;
    private JSONObject q;
    private String r;
    private Map<String, ExtendBlock> s;
    private ConcurrentHashMap<String, JSONObject> t;
    private m u;
    private boolean v;
    private String w;
    private String x;
    private Context y;
    private Context z;

    static {
        kge.a(1896200331);
        kge.a(-353003115);
    }

    public b(boolean z) {
        this(z, null);
    }

    public b(boolean z, Context context) {
        this.r = "";
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.s = new HashMap();
        this.t = new ConcurrentHashMap<>();
        this.e = new ArrayList();
        this.v = false;
        this.C = 0;
        this.D = false;
        this.G = new HashSet();
        this.g = new c(z);
        this.f = z;
        a(context);
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f = z;
        this.g.f15774a = z;
    }

    public ConcurrentHashMap<String, JSONObject> j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("d1c992d5", new Object[]{this}) : this.t;
    }

    public void a(Map<String, JSONObject> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            this.t.clear();
            this.t.putAll(map);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i == 1) {
            this.C = 1;
        } else {
            this.C = 0;
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            this.D = true;
        }
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.D;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.h = jSONObject;
        }
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.h;
    }

    @Override // tb.jny
    public List<IDMComponent> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.f15773a;
    }

    public List<IDMComponent> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3e0c1553", new Object[]{this});
        }
        Map<String, DMComponent> map = this.c;
        if (map != null && map.values() != null) {
            return new ArrayList(this.c.values());
        }
        return null;
    }

    @Override // tb.jny
    public void a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.f15773a = list;
        }
    }

    @Override // tb.jny
    public IDMComponent b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("e5087df7", new Object[]{this, str}) : this.c.get(str);
    }

    @Override // tb.jny
    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.n;
    }

    @Override // tb.jny
    public List<IDMComponent> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str}) : this.g.a(this, str);
    }

    @Override // tb.jny
    public List<com.taobao.android.ultron.common.model.a> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this}) : this.b;
    }

    @Override // tb.jny
    public IDMComponent f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("68961171", new Object[]{this}) : this.g.a();
    }

    public JSONObject n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("70253515", new Object[]{this}) : this.j;
    }

    public JSONObject o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("83cd0896", new Object[]{this}) : this.l;
    }

    public JSONObject p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("9774dc17", new Object[]{this}) : this.o;
    }

    public JSONObject q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab1caf98", new Object[]{this}) : this.q;
    }

    public JSONArray r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9451df25", new Object[]{this});
        }
        JSONObject jSONObject = this.o;
        if (jSONObject != null) {
            return jSONObject.getJSONArray("request");
        }
        return null;
    }

    public JSONArray s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("8911784", new Object[]{this});
        }
        JSONObject jSONObject = this.o;
        if (jSONObject != null) {
            return jSONObject.getJSONArray("input");
        }
        return null;
    }

    public void b(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else {
            this.f15773a = list;
        }
    }

    public void c(List<com.taobao.android.ultron.common.model.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        } else {
            this.b = list;
        }
    }

    public c t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("d75329e4", new Object[]{this}) : this.g;
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a1511", new Object[]{this, cVar});
        } else {
            this.g = cVar;
        }
    }

    public Map<String, DMComponent> u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b1644bb1", new Object[]{this}) : this.c;
    }

    public Map<String, DMComponent> v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7f0ead72", new Object[]{this}) : this.d;
    }

    public JSONObject w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("210ba49e", new Object[]{this}) : this.k;
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else {
            this.j = jSONObject;
        }
    }

    public JSONObject c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45647e6", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return this.j;
        }
        JSONObject jSONObject2 = this.j;
        if (jSONObject2 == null) {
            this.j = jSONObject;
        } else {
            jSONObject2.putAll(jSONObject);
        }
        return this.j;
    }

    public JSONObject d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ed36a885", new Object[]{this, jSONObject});
        }
        if (this.C == 1) {
            return g(jSONObject);
        }
        Set<String> keySet = this.s.keySet();
        if (keySet == null || keySet.isEmpty()) {
            this.k = jSONObject;
            return this.k;
        }
        for (String str : keySet) {
            JSONObject jSONObject3 = this.l.getJSONObject(str);
            if (jSONObject3 != null && jSONObject3.getBooleanValue("extendBlock") && DMComponent.RESET.equals(jSONObject3.getString(DMComponent.EXTEND_TYPE))) {
                ArrayList<String> arrayList = new ArrayList();
                a(this.k, str, arrayList);
                for (String str2 : arrayList) {
                    this.k.remove(str2);
                }
                if (jSONObject.get(str) == null) {
                    Object obj = this.k.get(str);
                    if (obj instanceof JSONArray) {
                        ((JSONArray) obj).clear();
                    }
                }
            }
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (entry != null) {
                String key = entry.getKey();
                if (keySet.contains(key)) {
                    Object value = entry.getValue();
                    Object obj2 = this.k.get(key);
                    if (obj2 == null) {
                        this.k.put(key, value);
                    }
                    JSONObject jSONObject4 = this.l;
                    String string = (jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject(key)) == null || !jSONObject2.containsKey(DMComponent.EXTEND_TYPE)) ? "append" : jSONObject2.getString(DMComponent.EXTEND_TYPE);
                    if (DMComponent.PREPEND.equals(string)) {
                        this.k.put(key, a(obj2, value));
                    } else if (DMComponent.RESET.equals(string)) {
                        this.k.put(key, value);
                    } else {
                        a(value, obj2);
                    }
                } else {
                    this.k.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return this.k;
    }

    private void a(JSONObject jSONObject, String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee58fc43", new Object[]{this, jSONObject, str, list});
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        Object obj = jSONObject.get(str);
        if (!(obj instanceof JSONArray)) {
            return;
        }
        JSONArray jSONArray = (JSONArray) obj;
        for (int i = 0; i < jSONArray.size(); i++) {
            list.add(jSONArray.getString(i));
            a(jSONObject, jSONArray.getString(i), list);
        }
    }

    public JSONObject e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("26170924", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return this.k;
        }
        JSONObject jSONObject2 = this.k;
        if (jSONObject2 == null) {
            this.k = jSONObject;
        } else {
            jSONObject2.putAll(jSONObject);
        }
        return this.k;
    }

    public JSONObject f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5ef769c3", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return this.n;
        }
        JSONObject jSONObject2 = this.n;
        if (jSONObject2 == null) {
            this.n = jSONObject;
        } else {
            jSONObject2.putAll(jSONObject);
        }
        s(this.n);
        return this.n;
    }

    public JSONObject g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97d7ca62", new Object[]{this, jSONObject});
        }
        Set<String> keySet = this.s.keySet();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            if (entry != null && !TextUtils.isEmpty(key)) {
                if (keySet.contains(key)) {
                    keySet.remove(key);
                }
                this.k.put(entry.getKey(), entry.getValue());
            }
        }
        return this.k;
    }

    private Object a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("218a0212", new Object[]{this, obj, obj2});
        }
        if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
            while (true) {
                JSONArray jSONArray = (JSONArray) obj;
                if (i >= jSONArray.size()) {
                    break;
                }
                Object obj3 = jSONArray.get(i);
                JSONArray jSONArray2 = (JSONArray) obj2;
                if (!jSONArray2.contains(obj3)) {
                    jSONArray2.add(obj3);
                }
                i++;
            }
        }
        return obj2;
    }

    public void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba943e1", new Object[]{this, jSONObject});
        } else {
            this.k = jSONObject;
        }
    }

    public void i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbe080", new Object[]{this, jSONObject});
        } else {
            this.l = jSONObject;
        }
    }

    public void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4e7d1f", new Object[]{this, jSONObject});
        } else {
            this.m = jSONObject;
        }
    }

    public JSONObject x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("34b3781f", new Object[]{this}) : this.m;
    }

    public JSONObject k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b594cde", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return this.l;
        }
        JSONObject jSONObject2 = this.l;
        if (jSONObject2 == null) {
            this.l = jSONObject;
        } else {
            jSONObject2.putAll(jSONObject);
        }
        return this.l;
    }

    public void l(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30f3b65d", new Object[]{this, jSONObject});
        } else {
            this.q = jSONObject;
        }
    }

    public void m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("924652fc", new Object[]{this, jSONObject});
        } else {
            this.o = jSONObject;
        }
    }

    public JSONObject n(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("25fa6ebb", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return this.o;
        }
        JSONObject jSONObject2 = this.o;
        if (jSONObject2 == null) {
            this.o = jSONObject;
        } else {
            jSONObject2.putAll(jSONObject);
        }
        return this.o;
    }

    public void o(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54eb8c3a", new Object[]{this, jSONObject});
            return;
        }
        this.n = jSONObject;
        s(this.n);
    }

    private void s(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da35feb6", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = this.i;
        if (jSONObject2 == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject2.remove("global");
        } else {
            jSONObject2.put("global", (Object) jSONObject);
        }
    }

    public String y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4c806420", new Object[]{this}) : this.r;
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.r = str;
        }
    }

    @Override // tb.jny
    public void a(joe joeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc1bb18", new Object[]{this, joeVar});
        } else {
            this.g.a(joeVar);
        }
    }

    public void p(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63e28d9", new Object[]{this, jSONObject});
        } else {
            this.p = jSONObject;
        }
    }

    public JSONObject q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d09b9098", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return this.p;
        }
        JSONObject jSONObject2 = this.p;
        if (jSONObject2 == null) {
            this.p = jSONObject;
        } else {
            jSONObject2.putAll(jSONObject);
        }
        return this.p;
    }

    public JSONObject z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("5c031f21", new Object[]{this}) : this.p;
    }

    public Map<String, ExtendBlock> A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("eac8707d", new Object[]{this}) : this.s;
    }

    @Override // tb.jny
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.v;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    @Override // tb.jny
    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.w;
    }

    @Override // tb.jny
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.w = str;
        }
    }

    @Override // tb.jny
    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.x;
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue();
        }
        List<IDMComponent> b = b();
        if (b == null) {
            return false;
        }
        for (IDMComponent iDMComponent : b) {
            iDMComponent.clearOnceExtMap();
        }
        return true;
    }

    @Override // tb.jny
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.x = str;
        }
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        this.p = null;
        this.j = null;
        this.k = null;
        this.n = null;
        this.o = null;
        this.q = null;
        this.i = null;
        this.r = null;
        this.f15773a = null;
        this.b = null;
        this.l = null;
        this.m = null;
        if (!f("data")) {
            this.c.clear();
        }
        this.t.clear();
        this.d.clear();
        this.s.clear();
        Map<String, String> map = this.F;
        if (map == null) {
            return;
        }
        map.clear();
    }

    public boolean f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{this, str})).booleanValue() : this.G.contains(str);
    }

    public void a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
        } else if (strArr != null) {
            this.G.addAll(Arrays.asList(strArr));
        } else {
            this.G.clear();
        }
    }

    public Context D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c78730c3", new Object[]{this}) : this.z;
    }

    public Context E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f0d71544", new Object[]{this}) : this.y;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (context == null) {
        } else {
            this.z = context;
            this.y = context.getApplicationContext();
        }
    }

    public String F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7fdc3673", new Object[]{this}) : this.A;
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            this.A = str;
        }
    }

    public String G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("661f112", new Object[]{this}) : this.B;
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else {
            this.B = str;
        }
    }

    public List<jok> H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c3a81998", new Object[]{this}) : this.e;
    }

    public boolean a(String str, String str2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (jSONObject = this.k) == null || !jSONObject.containsKey(str2)) {
            return false;
        }
        JSONArray jSONArray = this.k.getJSONArray(str2);
        if (jSONArray == null) {
            this.k.remove(str);
            return false;
        }
        jSONArray.remove(str);
        return true;
    }

    public void b(String str, String str2) {
        Map<String, ExtendBlock> map;
        ExtendBlock extendBlock;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (map = this.s) == null) {
        } else {
            map.remove(str);
            if (!this.s.containsKey(str2) || (extendBlock = this.s.get(str2)) == null) {
                return;
            }
            extendBlock.removeBlockComponentList(str);
            extendBlock.removeBlockHierarchy(str);
        }
    }

    public boolean c(String str, String str2) {
        ExtendBlock extendBlock;
        JSONObject jSONObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{this, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        JSONObject jSONObject2 = this.l;
        if (jSONObject2 != null && jSONObject2.containsKey(str)) {
            this.l.remove(str);
        }
        if (!TextUtils.isEmpty(str2) && (jSONObject = this.k) != null && jSONObject.containsKey(str2) && (jSONArray = this.k.getJSONArray(str2)) != null) {
            jSONArray.remove(str);
        }
        Map<String, ExtendBlock> map = this.s;
        if (map != null) {
            if (map.containsKey(str)) {
                this.s.remove(str);
            }
            if (this.s.containsKey(str2) && (extendBlock = this.s.get(str2)) != null) {
                extendBlock.removeBlockComponentList(str);
                extendBlock.removeBlockHierarchy(str);
            }
        }
        return true;
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue() : y() != null && y().compareTo("4.0") >= 0;
    }

    public void a(String str, DMComponent dMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24773cd6", new Object[]{this, str, dMComponent});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (this.E == null) {
                this.E = new HashMap();
            }
            this.E.put(str, dMComponent);
        }
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[]{this})).booleanValue();
        }
        if (z() != null) {
            return z().getBooleanValue("degrade");
        }
        return false;
    }

    public void a(String str, String str2, String str3) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (str != null && str2 != null && (jSONObject = this.j.getJSONObject("structure")) != null && (jSONArray = jSONObject.getJSONArray(str2)) != null && !jSONArray.contains(str)) {
            if (TextUtils.isEmpty(str3)) {
                jSONArray.add(0, str);
                return;
            }
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                Object obj = jSONArray.get(i);
                if ((obj instanceof String) && obj.equals(str3)) {
                    jSONArray.add(i + 1, str);
                    return;
                }
            }
            jSONArray.add(0, str);
        }
    }

    public JSONObject M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e782f174", new Object[]{this}) : this.i;
    }

    public void r(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78e36217", new Object[]{this, jSONObject});
        } else {
            this.i = jSONObject;
        }
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
            return;
        }
        if (this.F == null) {
            this.F = new HashMap();
        }
        if (str2 == null) {
            this.F.remove(str);
        } else {
            this.F.put(str, str2);
        }
    }

    public String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2e2d9a6", new Object[]{this, str});
        }
        Map<String, String> map = this.F;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("460add9", new Object[]{this})).booleanValue();
        }
        Map<String, String> map = this.F;
        return map != null && !map.isEmpty();
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[]{this});
            return;
        }
        Map<String, String> map = this.F;
        if (map == null) {
            return;
        }
        map.clear();
    }

    public m g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("e01f39cd", new Object[]{this});
        }
        if (this.u == null) {
            this.u = new m();
        }
        return this.u;
    }
}
