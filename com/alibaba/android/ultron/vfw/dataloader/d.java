package com.alibaba.android.ultron.vfw.dataloader;

import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OP_TYPE_ADJUST = "adjust";
    public static final String OP_TYPE_INIT = "initial";

    /* renamed from: a  reason: collision with root package name */
    public String f2692a;
    public a b;
    public Map<String, Object> c = new HashMap();
    public String d;
    public d.c e;

    static {
        kge.a(-2121692606);
    }

    public static d a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("c6eec87b", new Object[]{str, aVar});
        }
        d dVar = new d();
        dVar.f2692a = str;
        dVar.b = aVar;
        return dVar;
    }

    public static d a(String str, a aVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("eff5494c", new Object[]{str, aVar, dVar});
        }
        d dVar2 = new d();
        dVar2.f2692a = str;
        dVar2.b = aVar;
        if (dVar != null) {
            dVar2.d = dVar.d;
            dVar2.e = dVar.e;
        }
        return dVar2;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f2692a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.d;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public d.c c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d.c) ipChange.ipc$dispatch("e9df3830", new Object[]{this}) : this.e;
    }

    public void a(d.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b860822e", new Object[]{this, cVar});
        } else {
            this.e = cVar;
        }
    }

    public Object b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6e4e661f", new Object[]{this, str}) : this.c.get(str);
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            this.c.put(str, obj);
        }
    }

    public a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6007138b", new Object[]{this}) : this.b;
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f2693a;
        public JSONObject b;
        public JSONObject c;
        public JSONObject d;

        static {
            kge.a(-73907988);
        }

        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1562d908", new Object[]{this, aVar});
            } else if (aVar == null) {
            } else {
                this.c = aVar.c;
                JSONObject jSONObject = this.c;
                if (jSONObject == null) {
                    return;
                }
                jSONObject.remove("initialState");
                this.c.remove("extInput");
            }
        }
    }
}
