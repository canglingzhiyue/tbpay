package com.alibaba.android.ultron.event.base;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bkn;
import tb.kge;

/* loaded from: classes2.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f2585a;
    public String b;
    public String c;
    public IDMComponent d;
    public com.alibaba.android.ultron.vfw.instance.b e;
    public Object f;
    public bkn h;
    public Map<String, Object> g = new HashMap();
    public a i = new a();
    public String j = UUID.randomUUID().toString();

    static {
        kge.a(-810619945);
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.f2585a;
    }

    public e a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("5fb296bb", new Object[]{this, context});
        }
        this.f2585a = context;
        return this;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public e a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("6f6bc48d", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.j;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public IDMComponent d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("1d6dff6f", new Object[]{this}) : this.d;
    }

    public e a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("88131e47", new Object[]{this, iDMComponent});
        }
        this.d = iDMComponent;
        return this;
    }

    public a e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("1d60a0aa", new Object[]{this}) : this.i;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        a.a(this.i).clear();
        a.b(this.i).clear();
        this.i.c().clear();
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134f866", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            a.a(this.i).putAll(a.a(aVar));
            a.b(this.i).putAll(a.b(aVar));
            this.i.c().putAll(aVar.c());
        }
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (TextUtils.isEmpty(str) || jSONObject == null) {
        } else {
            a.a(this.i).put(str, jSONObject);
        }
    }

    public JSONObject c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c68059d4", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return (JSONObject) a.a(this.i).get(str);
        }
        return null;
    }

    public void a(String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1453b77", new Object[]{this, str, mtopResponse});
        } else if (TextUtils.isEmpty(str) || mtopResponse == null) {
        } else {
            a.b(this.i).put(str, mtopResponse);
        }
    }

    public void b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{this, str, jSONObject});
        } else {
            a.c(this.i).put(str, (Object) jSONObject);
        }
    }

    public JSONObject g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[]{this}) : a.c(this.i);
    }

    public com.alibaba.android.ultron.vfw.instance.b h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.instance.b) ipChange.ipc$dispatch("d88c8916", new Object[]{this}) : this.e;
    }

    public e a(com.alibaba.android.ultron.vfw.instance.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("62b47f2a", new Object[]{this, bVar});
        }
        this.e = bVar;
        return this;
    }

    public e a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("a2383fe9", new Object[]{this, str, obj});
        }
        if (str != null) {
            this.g.put(str, obj);
        }
        return this;
    }

    public e a(Map<? extends String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("37260378", new Object[]{this, map});
        }
        if (map != null) {
            this.g.putAll(map);
        }
        return this;
    }

    public Object f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cac6299b", new Object[]{this, str});
        }
        Object obj = this.g.get("bizParams");
        if (!(obj instanceof Map)) {
            return null;
        }
        return ((Map) obj).get(str);
    }

    public <T> T d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("1c8a47dd", new Object[]{this, str});
        }
        if (str != null) {
            return (T) this.g.get(str);
        }
        return null;
    }

    public <T> T i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("f161dcc2", new Object[]{this});
        }
        try {
            return (T) this.f;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public e a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("106f909f", new Object[]{this, obj});
        }
        this.f = obj;
        return this;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.c;
    }

    public e e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("3da9d591", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public e a(bkn bknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("c2f812ce", new Object[]{this, bknVar});
        }
        this.h = bknVar;
        return this;
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Map<String, JSONObject> f2586a = new HashMap();
        private Map<String, MtopResponse> b = new HashMap();
        private JSONObject c = new JSONObject();

        static {
            kge.a(629523268);
        }

        public static /* synthetic */ Map a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a841601b", new Object[]{aVar}) : aVar.f2586a;
        }

        public static /* synthetic */ Map b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3c7fcfba", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ JSONObject c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("76f5744", new Object[]{aVar}) : aVar.c;
        }

        public final Map<String, JSONObject> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.f2586a;
        }

        public final Map<String, MtopResponse> b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.b;
        }

        public JSONObject c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.c;
        }
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
        } else if (eVar == null) {
        } else {
            f();
            a(eVar.e());
            Object i = eVar.i();
            if (i instanceof DMEvent) {
                DMEvent dMEvent = (DMEvent) i;
                try {
                    a(new DMEvent(dMEvent.getType(), JSON.parseObject(dMEvent.getFields().toJSONString()), dMEvent.getComponents(), dMEvent.getOption()));
                } catch (Throwable unused) {
                }
            } else {
                a(eVar.i());
            }
            a(eVar.d()).a(eVar.a()).a(eVar.b()).e(eVar.j()).a(eVar.h()).a(eVar.h).a((Map<? extends String, ? extends Object>) eVar.g).b(eVar.c());
        }
    }
}
