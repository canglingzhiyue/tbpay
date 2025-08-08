package com.alibaba.android.aura.service.event;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.HashMap;
import java.util.Map;
import tb.arc;
import tb.kge;

/* loaded from: classes2.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXT_KEY_DX_RUNTIME_CONTEXT = "dx_runtime_context";

    /* renamed from: a  reason: collision with root package name */
    private String f2171a;
    private String b;
    private JSONObject c;
    private AURARenderComponent d;
    private Object[] e;
    private DXEvent g;
    private String i;
    @JSONField(serialize = false)
    private Map<String, Object> f = new HashMap();
    private int h = 0;

    static {
        kge.a(1223327532);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f2171a;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f2171a = str;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        String str = this.b;
        return str == null ? "" : str;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.c;
    }

    public d() {
    }

    public d(d dVar) {
        b(dVar.b());
        a(dVar.d());
        a(dVar.c());
        a(dVar.e());
        a(dVar.a());
        d(dVar.i());
        a(dVar.g());
        a(dVar.h());
        a(dVar.f());
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.c = jSONObject;
        }
    }

    public AURARenderComponent d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURARenderComponent) ipChange.ipc$dispatch("4aa17516", new Object[]{this}) : this.d;
    }

    public void a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
        } else {
            this.d = aURARenderComponent;
        }
    }

    public Object[] e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("fd747dcd", new Object[]{this}) : this.e;
    }

    public void a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63135c9", new Object[]{this, objArr});
            return;
        }
        this.e = objArr;
        if (objArr == null) {
            return;
        }
        if (objArr.length <= 0) {
            arc.a().c("UMFEventModel", "setArgs", "eventFlag is empty");
            return;
        }
        Object obj = objArr[0];
        if (obj instanceof String) {
            this.b = (String) obj;
        } else {
            arc.a().c("UMFEventModel", "setArgs", "eventFlag is empty");
        }
    }

    public Object c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c56c56fe", new Object[]{this, str}) : this.f.get(str);
    }

    @JSONField(serialize = false)
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        this.f.clear();
        if (map == null) {
            return;
        }
        this.f.putAll(map);
    }

    @JSONField(serialize = false)
    public Map<String, Object> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this}) : this.f;
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else if (StringUtils.isEmpty(str) || obj == null) {
        } else {
            this.f.put(str, obj);
        }
    }

    public DXEvent g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXEvent) ipChange.ipc$dispatch("9745bb6a", new Object[]{this}) : this.g;
    }

    public void a(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed70072a", new Object[]{this, dXEvent});
        } else {
            this.g = dXEvent;
        }
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.h;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        JSONObject c = c();
        if (c != null && !StringUtils.isEmpty(c.getString("identifier"))) {
            this.i = c.getString("identifier");
        }
        if (StringUtils.isEmpty(this.i) && d() != null) {
            this.i = d().key;
        }
        return this.i;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }
}
