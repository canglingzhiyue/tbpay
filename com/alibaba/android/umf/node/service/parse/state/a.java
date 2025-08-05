package com.alibaba.android.umf.node.service.parse.state;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f2854a;
    private UltronProtocol b;
    private final JSONObject c;
    private final MultiTreeNode d;
    private final MultiTreeNode e;
    private Map<String, RenderComponent> f;
    private Map<String, RenderComponent> g;
    private final List<Map<String, String>> h;
    private Map<String, AURARenderComponent> i;

    static {
        kge.a(1420916690);
    }

    public a(String str, JSONObject jSONObject, UltronProtocol ultronProtocol, MultiTreeNode multiTreeNode, MultiTreeNode multiTreeNode2, Map<String, RenderComponent> map, Map<String, RenderComponent> map2, List<Map<String, String>> list) throws IllegalArgumentException {
        this.f = new HashMap();
        this.g = new HashMap();
        this.f2854a = str;
        this.c = jSONObject;
        this.b = ultronProtocol;
        this.d = multiTreeNode;
        this.e = multiTreeNode2;
        this.h = list;
        if (map != null) {
            this.f = map;
        }
        if (map2 != null) {
            this.g = map2;
        }
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3a41e49b", new Object[0]) : new a(null, null, null, null, null, null, null, null);
    }

    public static a a(String str, JSONObject jSONObject, UltronProtocol ultronProtocol, MultiTreeNode multiTreeNode, MultiTreeNode multiTreeNode2, Map<String, RenderComponent> map, Map<String, RenderComponent> map2, List<Map<String, String>> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2c55fe87", new Object[]{str, jSONObject, ultronProtocol, multiTreeNode, multiTreeNode2, map, map2, list}) : new a(str, jSONObject, ultronProtocol, multiTreeNode, multiTreeNode2, map, map2, list);
    }

    public static a a(a aVar, JSONObject jSONObject, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("133a86db", new Object[]{aVar, jSONObject, ultronProtocol}) : new a(aVar.f2854a, jSONObject, ultronProtocol, aVar.d, aVar.e, aVar.f(), aVar.g(), aVar.h);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (Map.Entry<String, RenderComponent> entry : this.g.entrySet()) {
            RenderComponent renderComponent = this.f.get(entry.getKey());
            if (renderComponent == null) {
                return;
            }
            RenderComponent value = entry.getValue();
            renderComponent.component.fields = value.component.getFields();
            renderComponent.component.events = value.component.getEvents();
        }
        this.g.clear();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Map<String, RenderComponent> map = this.g;
        if (map == null) {
            return;
        }
        map.clear();
    }

    public void a(boolean z, String str) throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
        } else if (z) {
            this.g.remove(str);
        } else {
            RenderComponent renderComponent = this.f.get(str);
            if (renderComponent == null) {
                return;
            }
            this.g.put(str, renderComponent.m153clone());
        }
    }

    public MultiTreeNode d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MultiTreeNode) ipChange.ipc$dispatch("d942d975", new Object[]{this}) : this.e;
    }

    public MultiTreeNode e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MultiTreeNode) ipChange.ipc$dispatch("a04ec076", new Object[]{this}) : this.d;
    }

    public Map<String, RenderComponent> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this}) : this.f;
    }

    public Map<String, RenderComponent> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this}) : this.g;
    }

    @Deprecated
    public List<Map<String, String>> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this}) : this.h;
    }

    public UltronProtocol i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronProtocol) ipChange.ipc$dispatch("47421a13", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new UltronProtocol();
        }
        return this.b;
    }

    public JSONObject j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("2185e711", new Object[]{this}) : this.c;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.f2854a;
    }

    public Map<String, AURARenderComponent> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7666dbe8", new Object[]{this});
        }
        if (this.i == null) {
            this.i = new HashMap();
        }
        return this.i;
    }

    public void a(Map<String, AURARenderComponent> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.i = map;
        }
    }
}
