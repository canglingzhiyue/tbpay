package com.taobao.android.trade.component.data;

import android.util.SparseArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class Component {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f15606a;
    public JSONObject b;
    public JSONObject c;
    public Component d;
    public String e;
    public String f;
    public Status g = Status.NORMAL;
    public LinkageType h = LinkageType.REFRESH;
    public Object i;
    public SparseArray<Object> j;

    /* loaded from: classes6.dex */
    public enum LinkageType {
        REQUEST,
        REFRESH
    }

    /* loaded from: classes6.dex */
    public enum Status {
        NORMAL,
        DISABLE,
        HIDDEN;

        public static Status getComponentStatusByDesc(String str) {
            return (str == null || str.isEmpty()) ? NORMAL : "disable".equals(str) ? DISABLE : "hidden".equals(str) ? HIDDEN : NORMAL;
        }
    }

    static {
        kge.a(-1167987224);
    }

    public Component() {
    }

    public Component(JSONObject jSONObject, a aVar) {
        this.f15606a = aVar;
        b(jSONObject);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            b(jSONObject);
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            throw new IllegalArgumentException();
        } else {
            this.b = jSONObject;
            JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
            if (jSONObject2 == null) {
                throw new IllegalArgumentException();
            }
            this.c = jSONObject2;
            this.g = Status.getComponentStatusByDesc(this.b.getString("status"));
            this.f = this.b.getString("tag");
            this.e = this.b.getString("type");
            this.i = null;
            this.j = null;
        }
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.b;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.b;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.b;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : this.c;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        JSONObject jSONObject = this.b;
        return jSONObject != null ? jSONObject.getString("tag") : "unknown";
    }

    public Status g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Status) ipChange.ipc$dispatch("aa52cac9", new Object[]{this}) : this.g;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.b.getString("id");
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        String f = f();
        String h = h();
        if (f == null || h == null) {
            return null;
        }
        return f + "_" + h;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.b.getBooleanValue("submit");
    }

    public Component k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Component) ipChange.ipc$dispatch("ff357cbb", new Object[]{this}) : this.d;
    }

    public void a(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e9a7f31", new Object[]{this, component});
        } else {
            this.d = component;
        }
    }

    public void a(LinkageType linkageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebba6f6", new Object[]{this, linkageType});
        } else {
            this.h = linkageType;
        }
    }
}
