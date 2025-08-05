package com.alibaba.android.ultron.vfw.weex2.highPerformance.management;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.p;
import java.util.HashMap;
import java.util.Map;
import tb.abl;
import tb.abm;
import tb.bzu;
import tb.iro;
import tb.jpt;
import tb.jqg;
import tb.kge;

/* loaded from: classes2.dex */
public class a implements k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final a f2771a;
    private final Map<Class<?>, Object> c = new HashMap();
    private abm b = abm.a();
    private abl f = new abl();

    static {
        kge.a(-652655220);
        kge.a(718836347);
        f2771a = new a();
    }

    private a() {
        a((Class<Class>) c.class, (Class) new c(this.b));
        a((Class<Class>) d.class, (Class) new d(this.b));
        a((Class<Class>) g.class, (Class) new g(this.b));
        a((Class<Class>) i.class, (Class) new i(this.b));
        a((Class<Class>) e.class, (Class) new e(this.b));
        a((Class<Class>) j.class, (Class) new j());
        a((Class<Class>) com.alibaba.android.ultron.vfw.weex2.highPerformance.management.custom.a.class, (Class) new com.alibaba.android.ultron.vfw.weex2.highPerformance.management.custom.a());
    }

    private <T> void a(Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9dcc71", new Object[]{this, cls, t});
        } else {
            this.c.put(cls, t);
        }
    }

    private <T> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bd4d3fd", new Object[]{this, cls});
        }
        try {
            Object obj = this.c.get(cls);
            if (obj != null) {
                return cls.cast(obj);
            }
            bzu.a(bzu.a.b("InnerManagerState").a(false).a("service is null").a(1.0f));
            return null;
        } catch (Throwable th) {
            jpt a2 = bzu.a.b("InnerManagerState").a(false);
            bzu.a(a2.a("on error" + th.toString()).a(1.0f));
            return null;
        }
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("10e11a63", new Object[0]) : f2771a;
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.management.k
    public void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
        } else if (!iro.a()) {
            jqg.a("UltronTradeHybridManager", "onStage", "enableTradeHybrid false");
        } else {
            for (Object obj : this.c.values()) {
                if (obj instanceof k) {
                    ((k) obj).a(str, str2, jSONObject);
                }
            }
        }
    }

    public abm b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (abm) ipChange.ipc$dispatch("16b3df91", new Object[]{this}) : this.b;
    }

    public c d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("ba643464", new Object[]{this});
        }
        c cVar = (c) a(c.class);
        return cVar != null ? cVar : new c(this.b);
    }

    public d h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("47130187", new Object[]{this});
        }
        d dVar = (d) a(d.class);
        return dVar != null ? dVar : new d(this.b);
    }

    public i g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("63e74ee1", new Object[]{this});
        }
        i iVar = (i) a(i.class);
        return iVar != null ? iVar : new i(this.b);
    }

    public e c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("d7388161", new Object[]{this});
        }
        e eVar = (e) a(e.class);
        return eVar != null ? eVar : new e(this.b);
    }

    public j f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("80bb9bbf", new Object[]{this});
        }
        j jVar = (j) a(j.class);
        return jVar != null ? jVar : new j();
    }

    public abl e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (abl) ipChange.ipc$dispatch("2dc8cf8f", new Object[]{this}) : this.f;
    }

    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else {
            d().a(context, str);
        }
    }

    public Object a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("17307540", new Object[]{this, str}) : d().a(str);
    }

    public Object b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6e4e661f", new Object[]{this, str}) : d().e(str);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            d().c(str);
        }
    }

    public void a(Object obj, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5963812c", new Object[]{this, obj, jSONObject});
        } else {
            d().a(obj, jSONObject);
        }
    }

    public JSONObject a(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("22418c45", new Object[]{this, pVar}) : d().a(pVar);
    }

    public void b(Object obj, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a99d40b", new Object[]{this, obj, jSONObject});
        } else {
            d().b(obj, jSONObject);
        }
    }

    public JSONObject b(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("3cb28564", new Object[]{this, pVar}) : d().b(pVar);
    }

    @Deprecated
    public Drawable a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("5a02cabe", new Object[]{this, str, str2}) : g().b(str, str2);
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        super.finalize();
        this.f.a();
    }
}
